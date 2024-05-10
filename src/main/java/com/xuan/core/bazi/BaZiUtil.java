package com.xuan.core.bazi;

import com.nlf.calendar.Lunar;
import com.nlf.calendar.Solar;

import java.util.*;

/**
 * 八字-工具
 *
 * @author 善待
 */
public class BaZiUtil {

    /**
     * 判断日期类型设置，返回公历日期、农历日期
     *
     * @param setting 八字-设置
     * @return 公历日期、农历日期
     */
    public static Map<String, Object> isDateType(BaZiSetting setting) {

        // 1、初始化日期
        Solar solar = new Solar(); // 初始化公历日期
        Lunar lunar = new Lunar(); // 初始化农历日期

        // 2、获取设置数据
        Date date = setting.getDate(); // 日期
        int dateType = setting.getDateType(); // 日期类型

        // 3、按公历日期计算
        if (dateType == 0) {
            // 2.1、通过日期初始化
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
     * @param setting 八字-设置
     * @param lunar   农历日期
     * @return 干支
     */
    public static Map<String, List<String>> isGanZhi(BaZiSetting setting, Lunar lunar) {

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


}
