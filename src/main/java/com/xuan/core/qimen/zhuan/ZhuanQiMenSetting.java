package com.xuan.core.qimen.zhuan;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.util.Calendar;
import java.util.Date;

/**
 * 转盘奇门-设置
 *
 * @author 善待
 */
@Data
public class ZhuanQiMenSetting {

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
     * 奇门类型（0:年家奇门。1:月家奇门。2:日家奇门。3:时家奇门）
     */
    private int qiMenType;

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

    /**
     * 节气算法（0:按天计算。1:不按天计算）
     */
    private int jieQi;

    /**
     * 值使排法（0:天禽星为值符时，一律用[死门]为值使。1:天禽星为值符时，根据阴阳遁判断。2:天禽星为值符时，根据节气判断）
     */
    private int zhiShi;

    /**
     * $ 排盘标识
     */
    @Setter(AccessLevel.PRIVATE) // 禁止设置
    private String paiPanMark;

    /**
     * 起局方式，月家奇门（0:使用年支起局。1:使用年干支的符头地支起局）
     */
    private int qiJuMode;

//************************************************************************************************************************************

    /**
     * 初始化设置
     */
    public ZhuanQiMenSetting() {

        initialize(); // 设置默认初始化数据

    }

    /**
     * 使用公历日期初始化
     *
     * @param date 公历日期
     */
    public ZhuanQiMenSetting(Date date) {

        initialize(); // 设置默认初始化数据

        this.date = date; // 日期

    }

    /**
     * 使用日期初始化
     *
     * @param date     公历日期
     * @param dateType 日期类型（0:公历。1:农历）
     */
    public ZhuanQiMenSetting(Date date, int dateType) {

        initialize(); // 设置默认初始化数据

        this.date = date; // 日期
        this.dateType = dateType; // 日期类型（0:公历。1:农历）

    }

    /**
     * 使用年月日时初始化
     *
     * @param year  年
     * @param month 月
     * @param day   日
     * @param hour  时
     */
    public ZhuanQiMenSetting(int year, int month, int day, int hour) {

        initialize(); // 设置默认初始化数据

        month -= 1;
        Calendar c = Calendar.getInstance();
        c.set(year, month, day, hour, 0);
        this.date = c.getTime(); // // 日期

    }

    /**
     * 使用年月日时、日期类型初始化
     *
     * @param year     年
     * @param month    月
     * @param day      日
     * @param hour     时
     * @param dateType 日期类型（0:公历。1:农历）
     */
    public ZhuanQiMenSetting(int year, int month, int day, int hour, int dateType) {

        initialize(); // 设置默认初始化数据

        month -= 1;
        Calendar c = Calendar.getInstance();
        c.set(year, month, day, hour, 0);
        this.date = c.getTime(); // // 日期
        this.dateType = dateType; // 日期类型（0:公历。1:农历）

    }

    /**
     * 设置默认初始化数据
     */
    private void initialize() {

        this.name = null; // 姓名（默认→ 空）
        this.occupy = null; // 占事（默认→ 空）
        this.sex = 1; // 性别（默认→ 男）
        this.date = new Date(); // 日期（默认→ 当前日期）
        this.dateType = 0; // 日期类型（默认→ 公历）
        this.address = null; // 地区（默认→ 空）
        this.leapMonth = 0; // 闰月（默认→ 不使用闰月）
        this.qiMenType = 3; // 奇门类型（默认→ 时家奇门）
        this.yearGanZhiSet = 1; // 年干支设置（默认→ 以立春当天作为新年的开始）
        this.monthGanZhiSet = 1; // 月干支设置（默认→ 以节交接时刻起算）
        this.dayGanZhiSet = 0; // 日干支设置（默认→ 晚子时日柱按当天）
        this.hourGanZhiSet = 0; // 时干支设置（默认→ 支持早子时和晚子时）
        this.jieQi = 0; // 节气算法（默认→ 按天计算）
        this.zhiShi = 0; // 值使排法（默认→ 天禽星为值符时，一律用[死门]为值使)
        this.qiJuMode = 1; // 起局方式，月家奇门（默认→ 使用年干支的符头地支起局）
        this.paiPanMark = "时家奇门（转盘拆补法）"; // $ 排盘标识

    }

//------------------------------------------------------------------------------------------------------------------------------------

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
     * 奇门类型设置
     *
     * @param qiMenType 奇门类型（0:年家奇门。1:月家奇门。2:日家奇门。3:时家奇门）
     */
    public void setQiMenType(int qiMenType) {
        if (qiMenType != 0 && qiMenType != 1 && qiMenType != 2 && qiMenType != 3) {
            this.qiMenType = 3;
        } else {
            if (qiMenType == 0) this.paiPanMark = "年家奇门（转盘拆补法）";
            if (qiMenType == 1) this.paiPanMark = "月家奇门（转盘拆补法）";
            if (qiMenType == 2) this.paiPanMark = "日家奇门（转盘拆补法）";
            if (qiMenType == 3) this.paiPanMark = "时家奇门（转盘拆补法）";
            this.qiMenType = qiMenType;
        }
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
     * 节气算法设置
     *
     * @param jieQi 节气算法（0:按天计算。1:不按天计算）
     */
    public void setJieQi(int jieQi) {
        boolean boo = (jieQi == 0 || jieQi == 1);
        this.jieQi = boo ? jieQi : 0;
    }

    /**
     * 值使排法设置
     *
     * @param zhiShi 值使排法（0:天禽星为值符时，一律用[死门]为值使。1:天禽星为值符时，根据阴阳遁判断。2:天禽星为值符时，根据节气判断）
     */
    public void setZhiShi(int zhiShi) {
        boolean boo = (zhiShi == 0 || zhiShi == 1);
        this.zhiShi = boo ? zhiShi : 0;
    }

    /**
     * 起局方式，月家奇门设置
     *
     * @param qiJuMode 起局方式（0:使用年支起局。1:使用年干支的符头地支起局）
     */
    public void setQiJuMode(int qiJuMode) {
        boolean boo = (qiJuMode == 0 || qiJuMode == 1);
        this.qiJuMode = boo ? qiJuMode : 1;
    }


}
