package com.xuan.utils;

import com.nlf.calendar.Lunar;
import com.nlf.calendar.Solar;
import org.apache.commons.validator.routines.InetAddressValidator;

import java.math.BigDecimal;
import java.util.*;

/**
 * 通用工具
 */
public class CommonUtil {

    /**
     * 二十四小时对应十二地支
     */
    public static final String[] HOUR_ZHI = {
            "子", "丑", "丑", "寅", "寅", "卯", "卯", "辰", "辰", "巳", "巳", "午", "午", "未", "未", "申", "申", "酉", "酉", "戌", "戌", "亥", "亥", "子"
    };

//****************************************************************************************************************************************************

    /**
     * 格式化公历日期
     *
     * @param solar 公历日期
     * @return 公历日期
     */
    public static String solarStr(Solar solar) {

        return solar.getYear() + "年" + solar.getMonth() + "月" + solar.getDay() + "日" + solar.getHour() + "时";

    }

    /**
     * 格式化农历日期
     *
     * @param lunar 农历日期
     * @return 农历日期
     */
    public static String lunarStr(Lunar lunar) {

        String lunarStr;

        // 判断时辰
        int hour = lunar.getHour();
        if (hour >= 23 || hour < 1) {
            // 判断早晚子时
            if (hour >= 23) {
                lunarStr = lunar + "(晚)子时";
            } else {
                lunarStr = lunar + "(早)子时";
            }
        } else {
            lunarStr = lunar + HOUR_ZHI[hour] + "时";
        }

        return lunarStr;

    }

    /**
     * 机器ip校验
     *
     * @param ip 机器ip（ipv4或ipv6）
     * @return true:格式正确。false:格式错误
     */
    public static boolean checkIp(String ip) {

        boolean isFlag = true;
        InetAddressValidator validator = InetAddressValidator.getInstance();
        if (!validator.isValidInet4Address(ip) && !validator.isValidInet6Address(ip)) {
            isFlag = false;
        }
        return isFlag;

    }

    /**
     * 保留Double型数据的N位小数
     *
     * @param number double类型数据
     * @param count  保留小数的位数
     * @return double型数据
     */
    public static Double getDouble(double number, int count) {

        BigDecimal bigDec = new BigDecimal(number);
        return bigDec.setScale(count, BigDecimal.ROUND_FLOOR).doubleValue();

    }

    /**
     * 向List集合中添加指定个数的字符串
     *
     * @param count 元素数量
     * @return 空list集合
     */
    public static List<String> addCharToList(int count) {

        List<String> list = new ArrayList<>();
        for (int i = 0; i <= (count - 1); i++) {
            list.add("");
        }
        return list;

    }

    /**
     * 获取两个List数组中的不同元素
     *
     * @param list1 数组1
     * @param list2 数组2
     * @return 不同元素的数组
     */
    public static List<String> getListUnlike(List<String> list1, List<String> list2) {

        List<String> maxList = list1;
        List<String> minList = list2;
        if (list2.size() > list1.size()) {
            maxList = list2;
            minList = list1;
        }

        Map<String, Integer> map = new HashMap<>(list1.size() + list2.size());
        for (String string : maxList) {
            map.put(string, 1);
        }
        for (String string : minList) {
            Integer count = map.get(string);
            if (null != count) {
                map.put(string, ++count);
                continue;
            }
            map.put(string, 1);
        }

        List<String> unlike = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                unlike.add(entry.getKey());
            }
        }

        return unlike;

    }

    /**
     * 获取list集合里出现的重复元素及出现次数
     *
     * @param list List数据
     * @return key:元素   value:元素重复的次数
     */
    public static Map<String, Integer> getListIdentical(List<String> list) {

        Map<String, Integer> map = new HashMap<>();
        for (String item : list) {
            // 记录当前元素出现的次数
            int count = 1;
            // 若当前元素在map容器中已存在，计数器+1
            if (null != map.get(item)) {
                count = map.get(item) + 1;
            }
            // 向map容器里存数据
            map.put(item, count);
        }

        return map;

    }

    /**
     * 删除list集合中的指定的元素
     *
     * @param list    List集合
     * @param element 需要删除的元素
     */
    public static void removeElementList(List<String> list, String element) {

        for (int i = 0; i < list.size(); i++) {
            if (element.equals(list.get(i))) {
                list.remove(i);
                i--;
            }
        }

    }

    /**
     * 获取指定个数的随机数
     *
     * @param count 数量
     * @param range 范围（如→ 0:产生0，1:产生0~1中的随机一位数字，2:产生0~2中的随机一位数字，... ）
     * @return List随机数集合
     */
    public static List<Integer> randomList(long count, int range) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            list.add(new Random().nextInt(range + 1));
        }

        return list;

    }

    /**
     * 将N个数据封装为List集合，若数据<0时默认为0，若数据>3时默认为3
     *
     * @param parameter 数据
     * @return List集合
     */
    public static List<Integer> packageList(int... parameter) {

        List<Integer> list = new ArrayList<>();
        for (int i : parameter) {
            if (i < 0) i = 0;
            if (i > 3) i = 3;
            list.add(i);
        }
        return list;

    }

    /**
     * 数字转换汉字
     *
     * @param number 数字
     * @return 汉字（例如：一）
     */
    public static String shuToHan(long number) {

        final String[] unit = {"", "十", "百", "千", "万", "十", "百", "千", "亿", "十", "百", "千"};
        final String[] lowercaseNumber = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};

        int count = 0;
        StringBuilder sb = new StringBuilder();
        while (number > 0) {
            sb.insert(0, (lowercaseNumber[Math.toIntExact(number % 10)] + unit[count]));
            number = (number / 10);
            count++;
        }

        return sb.toString().replaceAll("零[千百十]", "零").replaceAll("零+万", "万")
                .replaceAll("零+亿", "亿").replaceAll("亿万", "亿零")
                .replaceAll("零+", "零").replaceAll("零$", "");

    }


}
