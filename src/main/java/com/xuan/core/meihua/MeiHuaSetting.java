package com.xuan.core.meihua;

import lombok.Data;

import java.util.Calendar;
import java.util.Date;

/**
 * 梅花易数-设置
 *
 * @author 善待
 */
@Data
public class MeiHuaSetting {

    /**
     * 性别（0:女。1:男）
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
     * 起卦模式（0:日期。1:数字。2:单数。3:双数）
     */
    private int qiGuaMode;

    /**
     * 起卦数（起卦模式为[数字]时生效，三位数）
     */
    private int qiGuaNumber;

    /**
     * 起卦数（起卦模式为[单数]时生效）
     */
    private int qiGuaDanNumber;

    /**
     * 起卦双数1（起卦模式为[双数]时生效）
     */
    private int qiGuaShuangNumber1;

    /**
     * 起卦双数2（起卦模式为[双数]时生效）
     */
    private int qiGuaShuangNumber2;

    /**
     * 双数计算上下卦（0:双数求和计算上下卦。1:双数不求和计算上下卦）
     */
    private int qiGuaShuangNumberInSx;

    /**
     * 双数计算动爻（0:双数求和计算动爻。1:双数求和加时辰数计算动爻）
     */
    private int qiGuaShuangNumberInDong;

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

//****************************************************************************************************************************************************

    /**
     * 初始化设置
     */
    public MeiHuaSetting() {

        initialize(); // 设置默认初始化数据

    }

    /**
     * 使用公历日期初始化
     *
     * @param date 公历日期
     */
    public MeiHuaSetting(Date date) {

        initialize(); // 设置默认初始化数据

        this.date = date; // 日期

    }

    /**
     * 使用日期初始化
     *
     * @param date     公历日期
     * @param dateType 日期类型（0:公历。1:农历）
     */
    public MeiHuaSetting(Date date, int dateType) {

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
    public MeiHuaSetting(int year, int month, int day, int hour, int minute, int second) {

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
    public MeiHuaSetting(int year, int month, int day, int hour, int minute, int second, int dateType) {

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
        this.qiGuaNumber = 111; // 起卦数（默认→ 111）
        this.qiGuaDanNumber = 1111; // 起卦数（默认→ 1111）
        this.qiGuaShuangNumber1 = 1234; // 起卦双数1（默认→ 1234）
        this.qiGuaShuangNumber2 = 1234; // 起卦双数2（默认→ 1234）
        this.qiGuaShuangNumberInSx = 1; // 双数计算上下卦（默认→ 双数不求和计算上下卦）
        this.qiGuaShuangNumberInDong = 0; // 双数计算动爻（默认→ 双数求和计算动爻）
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
     * @param qiGuaMode 起卦模式（0:日期。1:数字。2:单数。3:双数）
     */
    public void setQiGuaMode(int qiGuaMode) {
        boolean boo = (qiGuaMode == 0 || qiGuaMode == 1 || qiGuaMode == 2 || qiGuaMode == 3);
        this.qiGuaMode = boo ? qiGuaMode : 0;
    }

    /**
     * 起卦数设置
     *
     * @param qiGuaNumber 起卦数（起卦模式为[数字]时生效，三位数）
     */
    public void setQiGuaNumber(int qiGuaNumber) {
        boolean boo = (qiGuaNumber > 100 && qiGuaNumber < 999);
        this.qiGuaNumber = boo ? qiGuaNumber : 111;
    }

    /**
     * 起卦数设置
     *
     * @param qiGuaDanNumber 起卦数（起卦模式为[单数]时生效）
     */
    public void setQiGuaDanNumber(int qiGuaDanNumber) {
        boolean boo = (qiGuaDanNumber > 0 && qiGuaDanNumber < 2147483647);
        this.qiGuaDanNumber = boo ? qiGuaDanNumber : 1111;
    }

    /**
     * 起卦双数1设置
     *
     * @param qiGuaShuangNumber1 起卦双数1（起卦模式为[双数]时生效）
     */
    public void setQiGuaShuangNumber1(int qiGuaShuangNumber1) {
        boolean boo = (qiGuaShuangNumber1 > 0 && qiGuaShuangNumber1 < 2147483647);
        this.qiGuaShuangNumber1 = boo ? qiGuaShuangNumber1 : 1111;
    }

    /**
     * 起卦双数2设置
     *
     * @param qiGuaShuangNumber2 起卦双数2（起卦模式为[双数]时生效）
     */
    public void setQiGuaShuangNumber2(int qiGuaShuangNumber2) {
        boolean boo = (qiGuaShuangNumber2 > 0 && qiGuaShuangNumber2 < 2147483647);
        this.qiGuaShuangNumber2 = boo ? qiGuaShuangNumber2 : 1111;
    }

    /**
     * 双数计算上下卦设置
     *
     * @param qiGuaShuangNumberInSx 双数计算上下卦（0:双数求和计算上下卦。1:双数不求和计算上下卦）
     */
    public void setQiGuaShuangNumberInSx(int qiGuaShuangNumberInSx) {
        boolean boo = (qiGuaShuangNumberInSx == 0 || qiGuaShuangNumberInSx == 1);
        this.qiGuaShuangNumberInSx = boo ? qiGuaShuangNumberInSx : 1;
        this.qiGuaShuangNumberInSx = qiGuaShuangNumberInSx;
    }

    /**
     * 双数计算动爻设置
     *
     * @param qiGuaShuangNumberInDong 双数计算动爻（0:双数求和计算动爻。1:双数求和加时辰数计算动爻）
     */
    public void setQiGuaShuangNumberInDong(int qiGuaShuangNumberInDong) {
        boolean boo = (qiGuaShuangNumberInDong == 0 || qiGuaShuangNumberInDong == 1);
        this.qiGuaShuangNumberInDong = boo ? qiGuaShuangNumberInDong : 0;
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
