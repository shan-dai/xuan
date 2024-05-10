package com.xuan.core.liuyao;

import lombok.Data;

import java.util.Calendar;
import java.util.Date;

/**
 * 六爻-设置
 *
 * @author 善待
 */
@Data
public class LiuYaoSetting {

    /**
     * 性别（0:女，1:男）
     */
    private int sex;

    /**
     * 姓名
     */
    private String name;

    /**
     * 占事
     */
    private String occupy;

    /**
     * 日期
     */
    private Date date;

    /**
     * 日期类型（0:公历，1:农历）
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
     * 起卦模式（0:日期。1:自动。2:手动）
     */
    private int qiGuaMode;

    /**
     * 上爻（0:—（2正1背）。1:- -（1正2背）。2:— ○（0正3背）。3:- - ×（3正0背））
     */
    private int liuYao;

    /**
     * 五爻（0:—（2正1背）。1:- -（1正2背）。2:— ○（0正3背）。3:- - ×（3正0背））
     */
    private int wuYao;

    /**
     * 四爻（0:—（2正1背）。1:- -（1正2背）。2:— ○（0正3背）。3:- - ×（3正0背））
     */
    private int siYao;

    /**
     * 三爻（0:—（2正1背）。1:- -（1正2背）。2:— ○（0正3背）。3:- - ×（3正0背））
     */
    private int sanYao;

    /**
     * 二爻（0:—（2正1背）。1:- -（1正2背）。2:— ○（0正3背）。3:- - ×（3正0背））
     */
    private int erYao;

    /**
     * 初爻（0:—（2正1背）。1:- -（1正2背）。2:— ○（0正3背）。3:- - ×（3正0背））
     */
    private int yiYao;

    /**
     * 年干支设置（0:以正月初一作为新年的开始。1:以立春当天作为新年的开始。2:以立春交接的时刻作为新年的开始）
     */
    private int yearGanZhiSet;

    /**
     * 月干支设置（0:以节交接当天起算。1:以节交接时刻起算）
     */
    private int monthGanZhiSet;

    /**
     * 日干支设置（0:晚子时日干支算当天。1:晚子时日干支算明天）
     */
    private int dayGanZhiSet;

    /**
     * 时干支设置（0:支持早子时和晚子时）
     */
    private int hourGanZhiSet;

//------------------------------------------------------------------------------------------------------------------------------------

    /**
     * 初始化设置
     */
    public LiuYaoSetting() {

        initialize(); // 设置默认初始化数据

    }

    /**
     * 使用公历日期初始化
     *
     * @param date 公历日期
     */
    public LiuYaoSetting(Date date) {

        initialize(); // 设置默认初始化数据

        this.date = date; // 日期

    }

    /**
     * 使用日期初始化
     *
     * @param date     公历日期
     * @param dateType 日期类型（0:公历。1:农历）
     */
    public LiuYaoSetting(Date date, int dateType) {

        initialize(); // 设置默认初始化数据

        this.date = date; // 日期
        this.dateType = dateType; // 日期类型（0:公历。1:农历）

    }

    /**
     * 使用公历年月日时分秒初始化
     *
     * @param year   公历年（0~9999）
     * @param month  公历月（1~12）
     * @param day    公历日
     * @param hour   公历时（0~24）
     * @param minute 公历分（0~24）
     * @param second 公历秒（0~24）
     */
    public LiuYaoSetting(int year, int month, int day, int hour, int minute, int second) {

        initialize(); // 设置默认初始化数据

        month -= 1;
        Calendar c = Calendar.getInstance();
        c.set(year, month, day, hour, minute, second);
        this.date = c.getTime(); // 日期

    }

    /**
     * 使用年月日时分秒、日期类型初始化
     *
     * @param year     年
     * @param month    月
     * @param day      日
     * @param hour     时
     * @param minute   分
     * @param second   秒
     * @param dateType 日期类型（0:公历。1:农历）
     */
    public LiuYaoSetting(int year, int month, int day, int hour, int minute, int second, int dateType) {

        initialize(); // 设置默认初始化数据

        month -= 1;
        Calendar c = Calendar.getInstance();
        c.set(year, month, day, hour, minute, second);
        this.date = c.getTime(); // 日期
        this.dateType = dateType; // 日期类型（0:公历。1:农历）

    }

    /**
     * 设置默认初始化数据
     */
    private void initialize() {

        this.sex = 1; // 性别（默认→ 男）
        this.name = null; // 姓名（默认→ 空）
        this.occupy = null; // 占事（默认→ 空）
        this.date = new Date(); // 日期（默认→ 当前时刻）
        this.dateType = 0; // 日期类型（默认→ 公历）
        this.address = null; // 地区（默认→ 空）
        this.leapMonth = 0; // 闰月（默认→ 不使用闰月）
        this.qiGuaMode = 0; // 起卦模式（默认→ 日期）
        this.liuYao = 0; // 上爻（默认→ 2正1背）
        this.wuYao = 0; // 五爻（默认→ 2正1背）
        this.siYao = 0; // 四爻（默认→ 2正1背）
        this.sanYao = 0; // 三爻（默认→ 2正1背）
        this.erYao = 0; // 二爻（默认→ 2正1背）
        this.yiYao = 0; // 初爻（默认→ 2正1背）
        this.yearGanZhiSet = 1; // 年干支设置（默认→ 以立春当天作为新年的开始）
        this.monthGanZhiSet = 1; // 月干支设置（默认→ 以节交接时刻起算）
        this.dayGanZhiSet = 0; // 日干支设置（默认→ 晚子时日干支算明天）
        this.hourGanZhiSet = 0; // 时干支设置（默认→ 支持早子时和晚子时）

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
     * 起卦模式设置
     *
     * @param qiGuaMode 起卦模式（0:日期。1:自动。2:手动）
     */
    public void setQiGuaMode(int qiGuaMode) {
        boolean boo = (qiGuaMode == 0 || qiGuaMode == 1 || qiGuaMode == 2);
        this.qiGuaMode = boo ? qiGuaMode : 0;
    }

    /**
     * 上爻设置
     *
     * @param liuYao 上爻（0:—（2正1背）。1:- -（1正2背）。2:— ○（0正3背）。3:- - ×（3正0背））
     */
    public void setLiuYao(int liuYao) {
        boolean boo = (liuYao == 0 || liuYao == 1 || liuYao == 2 || liuYao == 3);
        this.liuYao = boo ? liuYao : 0;
    }

    /**
     * 五爻设置
     *
     * @param wuYao 五爻（0:—（2正1背）。1:- -（1正2背）。2:— ○（0正3背）。3:- - ×（3正0背））
     */
    public void setWuYao(int wuYao) {
        boolean boo = (wuYao == 0 || wuYao == 1 || wuYao == 2 || wuYao == 3);
        this.wuYao = boo ? wuYao : 0;
    }

    /**
     * 四爻设置
     *
     * @param siYao 四爻（0:—（2正1背）。1:- -（1正2背）。2:— ○（0正3背）。3:- - ×（3正0背））
     */
    public void setSiYao(int siYao) {
        boolean boo = (siYao == 0 || siYao == 1 || siYao == 2 || siYao == 3);
        this.siYao = boo ? siYao : 0;
    }

    /**
     * 三爻设置
     *
     * @param sanYao 三爻（0:—（2正1背）。1:- -（1正2背）。2:— ○（0正3背）。3:- - ×（3正0背））
     */
    public void setSanYao(int sanYao) {
        boolean boo = (sanYao == 0 || sanYao == 1 || sanYao == 2 || sanYao == 3);
        this.sanYao = boo ? sanYao : 0;
    }

    /**
     * 二爻设置
     *
     * @param erYao 二爻（0:—（2正1背）。1:- -（1正2背）。2:— ○（0正3背）。3:- - ×（3正0背））
     */
    public void setErYao(int erYao) {
        boolean boo = (erYao == 0 || erYao == 1 || erYao == 2 || erYao == 3);
        this.erYao = boo ? erYao : 0;
    }

    /**
     * 初爻设置
     *
     * @param yiYao 初爻（0:—（2正1背）。1:- -（1正2背）。2:— ○（0正3背）。3:- - ×（3正0背））
     */
    public void setYiYao(int yiYao) {
        boolean boo = (yiYao == 0 || yiYao == 1 || yiYao == 2 || yiYao == 3);
        this.yiYao = boo ? yiYao : 0;
    }

    /**
     * 年干支设置
     *
     * @param yearGanZhiSet 年干支设置（0:以正月初一作为新年的开始。1:以立春当天作为新年的开始。2:以立春交接的时刻作为新年的开始）
     */
    public void setYearGanZhiSet(int yearGanZhiSet) {
        boolean boo = (yearGanZhiSet == 0 || yearGanZhiSet == 1);
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


}
