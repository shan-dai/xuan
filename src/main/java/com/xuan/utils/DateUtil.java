package com.xuan.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

/**
 * 时间工具
 */
public class DateUtil {

    /**
     * 在日期上增加或减少小时数、分钟数、秒数
     *
     * @param date    日期
     * @param iHour   要增加或减少的小时数
     * @param iMinute 要增加或减少的分钟数
     * @param iSecond 要增加或减少的秒数
     */
    public static Date updateDate(Date date, int iHour, int iMinute, int iSecond) {

        Calendar c = Calendar.getInstance();

        c.setTime(date);
        c.add(Calendar.HOUR_OF_DAY, iHour); // 小时
        c.add(Calendar.MINUTE, iMinute); // 分钟
        c.add(Calendar.SECOND, iSecond); // 秒

        return c.getTime();

    }

    /**
     * 获取日期的[年月日时分秒]
     *
     * @param date 日期
     * @return 年月日时分秒
     */
    public static Map<String, Integer> getDateMap(Date date) {

        Calendar c = Calendar.getInstance();
        c.setTime(date);

        Map<String, Integer> map = new HashMap<>();
        map.put("year", c.get(Calendar.YEAR)); // 年
        map.put("month", c.get(Calendar.MONTH) + 1); // 月
        map.put("day", c.get(Calendar.DATE)); // 日
        map.put("hour", c.get(Calendar.HOUR_OF_DAY)); // 时
        map.put("minute", c.get(Calendar.MINUTE)); // 分
        map.put("second", c.get(Calendar.SECOND)); // 秒

        return map;

    }

    /**
     * 获取指定日期字符串
     *
     * @param date       Date型日期
     * @param dateFormat 日期格式
     * @return String型日期
     */
    public static String getDateStr(Date date, String dateFormat) {

        String dateStr;
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        dateStr = sdf.format(date);
        return dateStr;

    }

    /**
     * 计算两个日期的时间间隔
     *
     * @param startDate 开始日期
     * @param endDate   结束日期
     * @return 时间间隔
     */
    public static Map<String, Long> dateInterval(String startDate, String endDate) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime sDate = LocalDateTime.parse(startDate, formatter); // 开始日期
        LocalDateTime eDate = LocalDateTime.parse(endDate, formatter); // 结束日期

        Long days = ChronoUnit.DAYS.between(sDate, eDate);
        Long hours = ChronoUnit.HOURS.between(sDate, eDate) % 24;
        Long minutes = ChronoUnit.MINUTES.between(sDate, eDate) % 60;
        Long seconds = ChronoUnit.SECONDS.between(sDate, eDate) % 60;

        Map<String, Long> map = new HashMap<>();
        map.put("days", days); // 相差天数
        map.put("hours", hours); // 相差小时数
        map.put("minutes", minutes); // 相差分钟数
        map.put("seconds", seconds); // 相差秒数

        return map;

    }


}
