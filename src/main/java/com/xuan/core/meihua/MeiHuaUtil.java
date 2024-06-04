package com.xuan.core.meihua;

import com.nlf.calendar.Lunar;
import com.nlf.calendar.Solar;

import java.util.*;

/**
 * 梅花易数-工具
 *
 * @author 善待
 */
public class MeiHuaUtil {

    /**
     * 判断日期类型设置，返回公历日期、农历日期
     *
     * @param setting 梅花易数-设置
     * @return 公历日期、农历日期
     */
    public static Map<String, Object> isDateType(MeiHuaSetting setting) {

        // 1、初始化日期
        Solar solar = new Solar(); // 初始化公历日期
        Lunar lunar = new Lunar(); // 初始化农历日期

        // 2、获取设置数据
        Date date = setting.getDate(); // 日期
        int dateType = setting.getDateType(); // 日期类型

        // 3、按公历日期计算
        if (dateType == 0) {
            // 3.1、通过日期初始化
            solar = new Solar(date); // 公历日期
            lunar = solar.getLunar(); // 农历日期
        }

        // 4、按农历日期计算
        if (dateType == 1) {
            // 4.1、通过日期获取年月日时分秒
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            int year = c.get(Calendar.YEAR); // 年
            // 4.2、判断是否按闰月计算
            int month = (setting.getLeapMonth() == 1 ? -(c.get(Calendar.MONTH) + 1) : c.get(Calendar.MONTH) + 1); // 月
            int day = c.get(Calendar.DATE); // 日
            int hour = c.get(Calendar.HOUR_OF_DAY); // 时
            int minute = c.get(Calendar.MINUTE); // 分
            int second = c.get(Calendar.SECOND); // 秒
            // 4.3、通过农历年月日时初始化
            try {
                lunar = new Lunar(year, month, day, hour, minute, second); // 农历日期
                solar = lunar.getSolar(); // 公历日期
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }

        // 5、添加公历日期、农历日期并返回
        Map<String, Object> map = new HashMap<>();
        map.put("solar", solar); // 公历日期
        map.put("lunar", lunar); // 农历日期
        return map;

    }

    /**
     * 判断干支设置，返回干支
     *
     * @param setting 梅花易数-设置
     * @param lunar   农历日期
     * @return 干支
     */
    public static Map<String, List<String>> isGanZhi(MeiHuaSetting setting, Lunar lunar) {

        List<String> list;
        Map<String, List<String>> map = new HashMap<>();

        // 年干支设置（0:以正月初一作为新年的开始。1:以立春当天作为新年的开始。2:以立春交接的时刻作为新年的开始）
        int yearGanZhiSet = setting.getYearGanZhiSet();
        // 月干支设置（0:以节交接当天起算。1:以节交接时刻起算）
        int monthGanZhiSet = setting.getMonthGanZhiSet();
        // 日干支设置（0:晚子时日干支算当天。1:晚子时日干支算明天）
        int dayGanZhiSet = setting.getDayGanZhiSet();
        // 时干支设置（0:支持早子时和晚子时）
        int hourGanZhiSet = setting.getHourGanZhiSet();

        // 1、判断年干支设置
        if (yearGanZhiSet == 0) {
            // 1.1、以正月初一作为新年的开始
            list = Arrays.asList(lunar.getYearGan(), lunar.getYearZhi(), lunar.getYearInGanZhi());
        } else if (yearGanZhiSet == 1) {
            // 1.2、以立春当天作为新年的开始
            list = Arrays.asList(lunar.getYearGanByLiChun(), lunar.getYearZhiByLiChun(), lunar.getYearInGanZhiByLiChun());
        } else if (yearGanZhiSet == 2) {
            // 1.3、以立春交接的时刻作为新年的开始
            list = Arrays.asList(lunar.getYearGanExact(), lunar.getYearZhiExact(), lunar.getYearInGanZhiExact());
        } else {
            // 1.4、默认→ 以正月初一作为新年的开始
            list = Arrays.asList(lunar.getYearGan(), lunar.getYearZhi(), lunar.getYearInGanZhi());
        }
        map.put("yearGanZhi", list);

        // 2、判断月干支设置
        if (monthGanZhiSet == 0) {
            // 2.1、以节交接当天起算
            list = Arrays.asList(lunar.getMonthGan(), lunar.getMonthZhi(), lunar.getMonthInGanZhi());
        } else if (monthGanZhiSet == 1) {
            // 2.2、以节交接时刻起算
            list = Arrays.asList(lunar.getMonthGanExact(), lunar.getMonthZhiExact(), lunar.getMonthInGanZhiExact());
        } else {
            // 2.3、默认→ 以节交接当天起算
            list = Arrays.asList(lunar.getMonthGan(), lunar.getMonthZhi(), lunar.getMonthInGanZhi());
        }
        map.put("monthGanZhi", list);

        // 3、判断日干支设置
        if (dayGanZhiSet == 0) {
            // 3.1、晚子时日干支算明天
            list = Arrays.asList(lunar.getDayGanExact(), lunar.getDayZhiExact(), lunar.getDayInGanZhiExact());
        } else if (dayGanZhiSet == 1) {
            // 3.2、晚子时日干支算当天
            list = Arrays.asList(lunar.getDayGanExact2(), lunar.getDayZhiExact2(), lunar.getDayInGanZhiExact2());
        } else {
            // 3.3、默认→ 晚子时日干支算明天
            list = Arrays.asList(lunar.getDayGanExact(), lunar.getDayZhiExact(), lunar.getDayInGanZhiExact());
        }
        map.put("dayGanZhi", list);

        // 4、判断日干支设置
        if (hourGanZhiSet == 0) {
            // 4.1、支持早子时和晚子时
            list = Arrays.asList(lunar.getTimeGan(), lunar.getTimeZhi(), lunar.getTimeInGanZhi());
        } else {
            // 4.2、默认→ 支持早子时和晚子时
            list = Arrays.asList(lunar.getTimeGan(), lunar.getTimeZhi(), lunar.getTimeInGanZhi());
        }
        map.put("hourGanZhi", list);

        // 5、返回干支
        return map;

    }

    /**
     * 判断起卦模式并返回起卦数
     *
     * @param setting 梅花易数起卦-设置
     */
    public static List<Integer> isQiGuaMode(MeiHuaSetting setting) {

        /*
            一、数字起卦法：取一个三位数，第一位数字作为上卦数，第二位数字作为下卦数，第一位数字作为动爻数。

            二、单数起卦法：取一个数，前半部分的数字之和÷8取余数作为上卦数，后半部分的数字之和÷8取余数作为下卦数，全数之和÷6作为动爻数。

            三、双数起卦法：
                1、取第一个数字(和)÷8取余数作为上卦数；
                2、取第二个数字(和)÷8取余数作为下卦数；
                3、两个数字之和(+时辰数)÷6作为动爻数。
         */

        List<Integer> list = new ArrayList<>();

        // 1、数字起卦模式
        if (setting.getQiGuaMode() == 1) {
            // 1.1、获取起卦数（起卦模式为[数字]时生效，三位数）
            String number = String.valueOf(setting.getQiGuaNumber());
            int shangGuaNumber = Integer.parseInt(String.valueOf(number.charAt(0))); // 上卦数
            int xiaGuaNumber = Integer.parseInt(String.valueOf(number.charAt(1))); // 下卦数
            int dongYaoNumber = Integer.parseInt(String.valueOf(number.charAt(2))); // 动爻数
            list = shangXiaDongNumber(shangGuaNumber, xiaGuaNumber, dongYaoNumber);
        }

        // 2、单数起卦模式
        if (setting.getQiGuaMode() == 2) {
            // 2.1、起卦数（起卦模式为[单数]时生效）
            String number = String.valueOf(setting.getQiGuaDanNumber());
            // 2.2、计算[上卦数、下卦数、动爻数]（单数起卦方式调用）
            list = shangXiaDongNumber(number);
        }

        // 3、双数起卦模式
        if (setting.getQiGuaMode() == 3) {
            // 3.1、获取两个数字（起卦模式为[双数]时生效）
            String number1 = String.valueOf(setting.getQiGuaShuangNumber1());
            String number2 = String.valueOf(setting.getQiGuaShuangNumber2());
            // 3.2、计算[上卦数、下卦数、动爻数]（双数起卦方式调用）
            list = shangXiaDongNumber(number1, number2, setting);
        }

        return list;

    }

//------------------------------------------------------------------------------------------------------------------------------------

    /**
     * 计算[上卦数、下卦数、动爻数]（单数起卦法调用）
     *
     * @param number 数字
     * @return 上卦数、下卦数、动爻数
     */
    private static List<Integer> shangXiaDongNumber(String number) {

        int length = number.length(); // 数字位数

        // 1、计算前半段数字之和、后半段数字之和
        int number1Count = 0; // 前半段数字之和
        int number2Count = 0; // 后半段数字之和
        if (length > 1) {
            // 1.1、前半段数字取0~（总位数÷2）位，后半段数字取（总位数÷2）~最后一位
            String number1 = number.substring(0, length / 2);
            String number2 = number.substring(length / 2, length);
            for (int i = 0; i < number1.length(); i++) {
                number1Count += Integer.parseInt(number1.split("")[i]);
            }
            for (int i = 0; i < number2.length(); i++) {
                number2Count += Integer.parseInt(number2.split("")[i]);
            }
        }

        return shangXiaDongNumber2(number1Count, number2Count, 0);

    }

    /**
     * 计算[上卦数、下卦数、动爻数]（双数起卦法调用）
     *
     * @param number1 数字一
     * @param number2 数字二
     * @param setting 梅花易数起卦-设置
     * @return 上卦数、下卦数、动爻数
     */
    private static List<Integer> shangXiaDongNumber(String number1, String number2, MeiHuaSetting setting) {

        int number1Count = Integer.parseInt(number1); // 数字一
        int number2Count = Integer.parseInt(number2); // 数字二

        // 1、双数求和计算上下卦
        if (setting.getQiGuaShuangNumberInSx() == 0) {
            number1Count = 0;
            number2Count = 0;
            // 1.1、计算第一个数字的数字之和
            for (int i = 0; i < number1.length(); i++) {
                number1Count += Integer.parseInt(number1.split("")[i]);
            }
            // 1.2、计算第二个数字的数字之和
            for (int i = 0; i < number2.length(); i++) {
                number2Count += Integer.parseInt(number2.split("")[i]);
            }
        }

        // 2、双数求和加时辰数计算动爻
        int hourNumber = number1Count + number2Count;
        if (setting.getQiGuaShuangNumberInDong() == 1) {
            // 获取时数
            Lunar lunar = new Lunar(setting.getDate());
            String timeZhi = lunar.getTimeZhi(); // 获取'时地支'
            hourNumber += MeiHuaMap.DI_ZHI_SHU.get(timeZhi); // 获取'时地支'对应的数字并设置【时数】
        }

        return shangXiaDongNumber2(number1Count, number2Count, hourNumber);

    }

    /**
     * 通用方法：计算[上卦数、下卦数、动爻数]
     *
     * @param number1 数字一
     * @param number2 数字二
     * @param number3 数字三
     * @return 上卦数、下卦数、动爻数
     */
    private static List<Integer> shangXiaDongNumber(int number1, int number2, int number3) {

        // 1、计算上卦数
        int shangGuaNumber = (number1 % 8);
        shangGuaNumber = (shangGuaNumber == 0) ? 8 : shangGuaNumber; // 若除尽则统一用8来表示

        // 2、计算下卦数
        int xiaGuaNumber = (number2 % 8);
        xiaGuaNumber = (xiaGuaNumber == 0) ? 8 : xiaGuaNumber; // 若除尽则统一用8来表示

        // 3、计算动爻数
        int dongYaoNumber = (number3 % 6);
        dongYaoNumber = (dongYaoNumber == 0) ? 6 : dongYaoNumber; // 若除尽则统一用6来表示

        return Arrays.asList(shangGuaNumber, xiaGuaNumber, dongYaoNumber);

    }

    /**
     * 通用方法：计算[上卦数、下卦数、动爻数]
     *
     * @param number1    数字一
     * @param number2    数字二
     * @param hourNumber 时辰数
     * @return 上卦数、下卦数、动爻数
     */
    private static List<Integer> shangXiaDongNumber2(int number1, int number2, int hourNumber) {

        // 1、计算上卦数
        int shangGuaNumber = (number1 % 8);
        shangGuaNumber = (shangGuaNumber == 0) ? 8 : shangGuaNumber; // 若除尽则统一用8来表示

        // 2、计算下卦数
        int xiaGuaNumber = (number2 % 8);
        xiaGuaNumber = (xiaGuaNumber == 0) ? 8 : xiaGuaNumber; // 若除尽则统一用8来表示

        // 3、计算动爻数
        int dongYaoNumber = ((number1 + number2 + hourNumber) % 6);
        dongYaoNumber = (dongYaoNumber == 0) ? 6 : dongYaoNumber; // 若除尽则统一用6来表示

        return Arrays.asList(shangGuaNumber, xiaGuaNumber, dongYaoNumber);

    }


}
