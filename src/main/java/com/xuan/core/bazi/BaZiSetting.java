package com.xuan.core.bazi;

import lombok.Data;

import java.util.Calendar;
import java.util.Date;

/**
 * 八字-设置
 *
 * @author 善待
 */
@Data
public class BaZiSetting {

    /**
     * 姓名
     */
    private String name;

    /**
     * 占事
     */
    private String occupy;

    /**
     * 性别（0:女。1:男）
     */
    private int sex;

    /**
     * 日期
     */
    private Date date;

    /**
     * 日期类型（0:公历。1:农历）
     */
    private int dateType;

    /**
     * 地区
     */
    private String address;

    /**
     * 闰月（0:不使用闰月。1:使用闰月）
     */
    private int leapMonth;

    /**
     * 起运流派（0:按天数和时辰数计算：3天1年、1天4个月、1时辰10天。1:按分钟数计算：4320分=1年、360分=1月、12分=1天、1分=2小时）
     */
    private int qiYunLiuPai;

    /**
     * 年干支设置（0:以正月初一作为新年的开始。1:以立春当天作为新年的开始。2:以立春交接的时刻作为新年的开始）
     */
    private int yearGanZhiSet;

    /**
     * 月干支设置（0:以节交接当天起算。1:以节交接时刻起算）
     */
    private int monthGanZhiSet;

    /**
     * 日干支设置（0:晚子时日柱按明天。1:晚子时日柱按当天）
     */
    private int dayGanZhiSet;

    /**
     * 时干支设置（0:支持早子时和晚子时）
     */
    private int hourGanZhiSet;

    /**
     * 神煞：词馆（0:禄命法。1:子平法）
     */
    private int ciGuan;

    /**
     * 神煞：学堂（0:禄命法。1:子平法）
     */
    private int xueTang;

//****************************************************************************************************************************************************

    /**
     * 初始化设置
     */
    public BaZiSetting() {

        initialize(); // 设置默认初始化数据

    }

    /**
     * 使用公历日期初始化
     *
     * @param date 公历日期
     */
    public BaZiSetting(Date date) {

        initialize(); // 设置默认初始化数据

        this.date = date; // 日期

    }

    /**
     * 使用日期、日期类型初始化
     *
     * @param date     日期
     * @param dateType 日期类型（0:公历。1:农历）
     */
    public BaZiSetting(Date date, int dateType) {

        initialize(); // 设置默认初始化数据

        this.date = date; // 日期
        this.dateType = dateType; // 日期类型（0:公历。1:农历）

    }

    /**
     * 使用公历年月日时分秒初始化
     *
     * @param year   年（1~9999）
     * @param month  月（1~12）
     * @param day    日
     * @param hour   时（0~24）
     * @param minute 分（0~60）
     * @param second 秒（0~60）
     */
    public BaZiSetting(int year, int month, int day, int hour, int minute, int second) {

        initialize(); // 设置默认初始化数据

        Calendar c = Calendar.getInstance();
        c.set(year, month - 1, day, hour, minute, second);
        this.date = c.getTime();

    }

    /**
     * 设置默认初始化数据
     */
    private void initialize() {

        this.name = null; // 姓名（默认→ 空）
        this.occupy = null; // 占事（默认→ 空）
        this.sex = 1; // 性别（默认→ 男）
        this.date = new Date(); // 日期（默认→ 当前时刻）
        this.dateType = 0; // 日期类型（默认→ 公历）
        this.address = null; // 地区（默认→ 空）
        this.leapMonth = 0; // 闰月（默认→ 不使用闰月）
        this.qiYunLiuPai = 0; // 起运流派（默认→ 按天数和时辰数计算：3天1年、1天4个月、1时辰10天）
        this.yearGanZhiSet = 1; // 年干支设置（默认→ 以立春当天作为新年的开始）
        this.monthGanZhiSet = 1; // 月干支设置（默认→ 以节交接时刻起算）
        this.dayGanZhiSet = 0; // 日干支设置，同子时流派（默认→ 晚子时日柱按当天）
        this.hourGanZhiSet = 0; // 时干支设置（默认→ 支持早子时和晚子时）
        this.ciGuan = 0; // 神煞：词馆（默认→ 禄命法）
        this.xueTang = 0; // 神煞：学堂（默认→ 禄命法）

    }

//----------------------------------------------------------------------------------------------------------------------------------------------------

    /**
     * 性别设置
     *
     * @param sex 性别（0:女。1:男）
     */
    public void setSex(int sex) {
        boolean boo = (sex == 0 || sex == 1);
        this.sex = boo ? sex : 1;
    }

    /**
     * 日期设置
     *
     * @param date 日期
     */
    public void setDate(Date date) {
        this.date = (null == date ? new Date() : date);
    }

    /**
     * 日期类型设置
     *
     * @param dateType 日期类型（0:公历。1:农历）
     */
    public void setDateType(int dateType) {
        boolean boo = (dateType == 0 || dateType == 1);
        this.dateType = boo ? dateType : 0;
    }

    /**
     * 闰月设置
     *
     * @param leapMonth 闰月（0:不使用闰月。1:使用闰月）
     */
    public void setLeapMonth(int leapMonth) {
        boolean boo = (leapMonth == 0 || leapMonth == 1);
        this.leapMonth = boo ? leapMonth : 0;
    }

    /**
     * 起运流派设置
     *
     * @param qiYunLiuPai 起运流派（0:按天数和时辰数计算：3天1年、1天4个月、1时辰10天。1:按分钟数计算：4320分=1年、360分=1月、12分=1天、1分=2小时）
     */
    public void setQiYunLiuPai(int qiYunLiuPai) {
        boolean boo = (qiYunLiuPai == 0 || qiYunLiuPai == 1);
        this.qiYunLiuPai = boo ? qiYunLiuPai : 0;
    }

    /**
     * 年干支设置
     *
     * @param yearGanZhiSet 年干支设置（0:以正月初一作为新年的开始。1:以立春当天作为新年的开始。2:以立春交接的时刻作为新年的开始）
     */
    public void setYearGanZhiSet(int yearGanZhiSet) {
        boolean boo = (yearGanZhiSet == 0 || yearGanZhiSet == 1 || yearGanZhiSet == 2);
        this.yearGanZhiSet = boo ? yearGanZhiSet : 1;
    }

    /**
     * 月干支设置
     *
     * @param monthGanZhiSet 月干支设置（0:以节交接当天起算。1:以节交接时刻起算）
     */
    public void setMonthGanZhiSet(int monthGanZhiSet) {
        boolean boo = (monthGanZhiSet == 0 || monthGanZhiSet == 1);
        this.monthGanZhiSet = boo ? monthGanZhiSet : 1;
    }

    /**
     * 日干支设置
     *
     * @param dayGanZhiSet 日干支设置（0:晚子时日干支算当天。1:晚子时日干支算明天）
     */
    public void setDayGanZhiSet(int dayGanZhiSet) {
        boolean boo = (dayGanZhiSet == 0 || dayGanZhiSet == 1);
        this.dayGanZhiSet = boo ? dayGanZhiSet : 0;
    }

    /**
     * 神煞：词馆设置
     *
     * @param ciGuan 神煞：词馆设置（0:禄命法。1:子平法）
     */
    public void setCiGuan(int ciGuan) {
        boolean boo = (ciGuan == 0 || ciGuan == 1);
        this.ciGuan = boo ? ciGuan : 0;
    }

    /**
     * 神煞：学堂设置
     *
     * @param xueTang 神煞：学堂设置（0:禄命法。1:子平法）
     */
    public void setXueTang(int xueTang) {
        boolean boo = (xueTang == 0 || xueTang == 1);
        this.xueTang = boo ? xueTang : 0;
    }


}
