package com.xuan.core.qimen;

import com.xuan.core.qimen.fei.FeiQiMen;
import com.xuan.core.qimen.fei.FeiQiMenSetting;
import com.xuan.core.qimen.zhuan.ZhuanQiMen;
import com.xuan.core.qimen.zhuan.ZhuanQiMenSetting;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * 奇门遁甲测试
 */
public class QiMenTest {

    /**
     * 转盘奇门
     */
    @Test
    public void zhuanQiMenTest() {

        // 1、日期
        Date date;
        Calendar c = Calendar.getInstance();
        c.set(2024, 1 - 1, 1, 0, 0, 0);
        date = c.getTime();
        // 1.1、真太阳时
//        date = TrueSolarDateUtil.getTrueSolarDate(date, "某某地区"); // 获取真太阳时（TODO：请填写真实地区）


        // 2、设置
        ZhuanQiMenSetting setting = new ZhuanQiMenSetting();
        setting.setSex(1); // 性别（0:女。1:男）
        setting.setName("某某人"); // 姓名
        setting.setOccupy("某某事"); // 测事
        setting.setAddress("某某地区"); // 地区
        setting.setDate(date); // 日期
        setting.setDateType(0); // 日期类型（0:公历。1:农历）
        setting.setLeapMonth(0); // 闰月（0:不使用闰月。1:使用闰月）
        setting.setQiMenType(3); // 奇门类型（0:年家奇门。1:月家奇门。2:日家奇门。3:时家奇门）
        setting.setYearGanZhiSet(1); // 年干支设置（0:以正月初一作为新年的开始。1:以立春当天作为新年的开始。2:以立春交接的时刻作为新年的开始）
        setting.setMonthGanZhiSet(1); // 月干支设置（0:以节交接当天起算。1:以节交接时刻起算）
        setting.setDayGanZhiSet(1); // 日干支设置（0:晚子时日干支算当天。1:晚子时日干支算明天）
        setting.setHourGanZhiSet(0); // 时干支设置（0:支持早子时和晚子时）
        setting.setJieQi(0); // 节气算法（0:按天计算。1:不按天计算）
        setting.setZhiShi(0); // 值使排法（0:天禽星为值符时，一律用[死门]为值使。1:天禽星为值符时，根据阴阳遁判断。2:天禽星为值符时，根据节气判断）
        setting.setQiJuMode(1); // 起局方式，月家奇门（0:使用年支起局。1:使用年干支的符头地支起局）


        // 3、初始化
//        ZhuanQiMen qiMen = new ZhuanQiMen(); // 使用默认设置初始化（默认使用当前公历日期）
//        ZhuanQiMen qiMen = new ZhuanQiMen(date); // 使用公历日期初始化
//        ZhuanQiMen qiMen = new ZhuanQiMen(date, 1); // 使用日期初始化
//        ZhuanQiMen qiMen = new ZhuanQiMen(2024, 1, 1, 0, 0, 0); // 使用公历年月日时分秒初始化
//        ZhuanQiMen qiMen = new ZhuanQiMen(2024, 1, 1, 0, 0, 0, 1); // 使用年月日时分秒、日期类型初始化
        ZhuanQiMen qiMen = new ZhuanQiMen(setting); // 使用自定义设置初始化


        // 4、数据
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐ ☯ 转盘奇门 ☯ ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐\n");

        System.out.println("姓名：" + setting.getName());
        System.out.println("性别：" + (setting.getSex() == 0 ? "女♀" : "男♂"));
        System.out.println("测事：" + setting.getOccupy());
        System.out.println("地区：" + setting.getAddress());
        System.out.println("$ 排盘标识：" + setting.getPaiPanMark());

        System.out.println("\n==============================================================================================================\n");

        System.out.println("公历：" + qiMen.getSolarStr());
        System.out.println("农历：" + qiMen.getLunarStr());
        System.out.println("星期：" + qiMen.getWeek());
        System.out.println("八字：" + qiMen.getBaZi());
        System.out.println("八字五行：" + qiMen.getBaZiWuXing());
        System.out.println("八字纳音：" + qiMen.getBaZiNaYin());
        System.out.println("八字旬空：" + qiMen.getBaZiXunKong());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("节气：" + qiMen.getJieQi() + qiMen.getSanYuan());
        System.out.println("局数：" + qiMen.getYinYangDun() + qiMen.getJuShu() + "局");
        System.out.println("旬首：" + qiMen.getXunShou());
        System.out.println("旬首仪仗：" + qiMen.getXunShouYiZhang());
        System.out.println("旬首落宫：" + qiMen.getXunShouGong());
        System.out.println("值符：" + qiMen.getZhiFu());
        System.out.println("值使：" + qiMen.getZhiShi());
        System.out.println("六甲旬空：" + qiMen.getLiuJiaXunKong());
        System.out.println("六甲旬空落宫：" + qiMen.getLiuJiaXunKongGong());
        System.out.println("六甲旬空落宫标识：" + qiMen.getLiuJiaXunKongGongMark());
        System.out.println("驿马：" + qiMen.getYiMa());
        System.out.println("驿马落宫：" + qiMen.getYiMaGong());
        System.out.println("驿马落宫标识：" + qiMen.getYiMaGongMark());
        System.out.println("九遁：" + qiMen.getJiuDun());
        System.out.println("天乙：" + qiMen.getTianYi());
        System.out.println("地乙：" + qiMen.getDiYi());
        System.out.println("太乙：" + qiMen.getTaiYi());
        System.out.println("伏吟：" + qiMen.getFuYin());
        System.out.println("反吟：" + qiMen.getFanYin());
        System.out.println("六仪击刑：" + qiMen.getLiuYiJiXing());
        System.out.println("奇仪入墓：" + qiMen.getQiYiRuMu());
        System.out.println("月将：" + qiMen.getYueJiang());
        System.out.println("月将神：" + qiMen.getYueJiangShen());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("★地盘：" + qiMen.getDiPan());
        System.out.println("★天盘：" + qiMen.getTianPan());
        System.out.println("★人盘：" + qiMen.getRenPan());
        System.out.println("★神盘：" + qiMen.getShenPan());
        System.out.println();
        System.out.println("地盘奇仪：" + qiMen.getDiQiYi());
        System.out.println("地盘六甲：" + qiMen.getDiLiuJia());
        System.out.println("地盘(奇仪+六甲)：" + qiMen.getDiPanPron());
        System.out.println("天盘奇仪(只包含天禽星携带的奇仪)：" + qiMen.getTianPanQiYiToTq());
        System.out.println("天盘奇仪(不包含天禽星携带的奇仪)：" + qiMen.getTianPanQiYiExTq());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("十干克应：" + qiMen.getShiGanKeYing());

        System.out.println("\n----------------------------------------------------------------------------------------------------------------\n");

        System.out.println("八门克应：" + qiMen.getBaMenKeYing());

        System.out.println("\n----------------------------------------------------------------------------------------------------------------\n");

        System.out.println("八门静应：" + qiMen.getBaMenJingYing());

        System.out.println("\n----------------------------------------------------------------------------------------------------------------\n");

        System.out.println("八门动应：" + qiMen.getBaMenDongYing());

        System.out.println("\n----------------------------------------------------------------------------------------------------------------\n");

        System.out.println("星门克应：" + qiMen.getXingMenKeYing());

        System.out.println("\n----------------------------------------------------------------------------------------------------------------\n");

        System.out.println("九星时应：" + qiMen.getJiuXingShiYing());

        System.out.println("\n----------------------------------------------------------------------------------------------------------------\n");

        System.out.println("八卦旺衰(月令)：" + qiMen.getBaGuaWangShuai());
        System.out.println("八门旺衰(月令)：" + qiMen.getBaMenWangShuai());
        System.out.println("九星旺衰(月令)：" + qiMen.getJiuXingWangShuai());

        System.out.println("\n----------------------------------------------------------------------------------------------------------------\n");

        System.out.println("八神落宫状态：" + qiMen.getBaShenLuoGongStatus());
        System.out.println("八门落宫状态：" + qiMen.getBaMenLuoGongStatus());
        System.out.println("九星落宫状态：" + qiMen.getJiuXingLuoGongStatus());

        System.out.println("\n----------------------------------------------------------------------------------------------------------------\n");

        System.out.println("地盘奇仪与落宫地支的关系：" + qiMen.getDiPanQiYiLuoGongLink());
        System.out.println();
        System.out.println("天盘奇仪与落宫地支的关系(只包含天禽星)：" + qiMen.getTianPanQiYiLuoGongToTqLink());
        System.out.println();
        System.out.println("天盘奇仪与落宫地支的关系(不包含天禽星)：" + qiMen.getTianPanQiYiLuoGongExTqLink());

    }

    /**
     * 飞盘奇门
     */
    @Test
    public void feiQiMenTest() {

        // 1、日期
        Date date;
        Calendar c = Calendar.getInstance();
        c.set(2024, 1 - 1, 1, 0, 0, 0);
        date = c.getTime();
        // 1.1、真太阳时
//        date = TrueSolarDateUtil.getTrueSolarDate(date, "某某地区"); // 获取真太阳时（TODO：请填写真实地区）


        // 2、设置
        FeiQiMenSetting setting = new FeiQiMenSetting();
        setting.setSex(1); // 性别（0:女。1:男）
        setting.setName("某某人"); // 姓名
        setting.setOccupy("某某事"); // 测事
        setting.setAddress("某某地区"); // 地区
        setting.setDate(date); // 日期
        setting.setDateType(0); // 日期类型（0:公历。1:农历）
        setting.setLeapMonth(0); // 闰月（0:不使用闰月。1:使用闰月）
        setting.setQiMenType(3); // 奇门类型（0:年家奇门。1:月家奇门。2:日家奇门。3:时家奇门）
        setting.setYearGanZhiSet(1); // 年干支设置（0:以正月初一作为新年的开始。1:以立春当天作为新年的开始。2:以立春交接的时刻作为新年的开始）
        setting.setMonthGanZhiSet(1); // 月干支设置（0:以节交接当天起算。1:以节交接时刻起算）
        setting.setDayGanZhiSet(1); // 日干支设置（0:晚子时日干支算当天。1:晚子时日干支算明天）
        setting.setHourGanZhiSet(0); // 时干支设置（0:支持早子时和晚子时）
        setting.setJieQi(0); // 节气算法（0:按天计算。1:不按天计算）
        setting.setZhiShi(0); // 值使排法（0:天禽星为值符时，一律用[死门]为值使。1:天禽星为值符时，根据阴阳遁判断。2:天禽星为值符时，根据节气判断）
        setting.setRenPanFeiZhuan(1); // 人盘排法（0:转宫。1:飞宫）
        setting.setRenPanZhuanGong(0); // 人盘转宫法（0:阴遁和阳遁一律顺转九宫。1:阴遁逆转九宫、阳遁顺转九宫）
        setting.setRenPanFeiGong(0); // 人盘飞宫法（0:阴遁和阳遁一律顺飞九宫。1:阴遁逆飞九宫、阳遁顺飞九宫）
        setting.setTianPanFeiGong(0); // 天盘飞宫法（0:阴遁和阳遁一律顺飞九宫。1:阴遁逆飞九宫、阳遁顺飞九宫）
        setting.setShenPanFeiGong(1); // 神盘飞宫法（0:阴遁和阳遁一律顺飞九宫。1:阴遁逆飞九宫、阳遁顺飞九宫）
        setting.setQiJuMode(1); // 起局方式，月家奇门（0:使用年支起局。1:使用年干支的符头地支起局）


        // 3、初始化
//        FeiQiMen qiMen = new FeiQiMen(); // 使用默认设置初始化（默认使用当前公历日期）
//        FeiQiMen qiMen = new FeiQiMen(date); // 使用公历日期初始化
//        FeiQiMen qiMen = new FeiQiMen(date, 1); // 使用日期初始化
//        FeiQiMen qiMen = new FeiQiMen(2024, 1, 1, 0, 0, 0); // 使用公历年月日时分秒初始化
//        FeiQiMen qiMen = new FeiQiMen(2024, 1, 1, 0, 0, 0, 1); // 使用年月日时分秒、日期类型初始化
        FeiQiMen qiMen = new FeiQiMen(setting); // 使用自定义设置初始化


        // 4、数据
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐ ☯ 飞盘奇门 ☯ ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐\n");

        System.out.println("姓名：" + setting.getName());
        System.out.println("性别：" + (setting.getSex() == 0 ? "女♀" : "男♂"));
        System.out.println("测事：" + setting.getOccupy());
        System.out.println("地区：" + setting.getAddress());
        System.out.println("$ 排盘标识：" + setting.getPaiPanMark());

        System.out.println("\n==============================================================================================================\n");

        System.out.println("公历：" + qiMen.getSolarStr());
        System.out.println("农历：" + qiMen.getLunarStr());
        System.out.println("星期：" + qiMen.getWeek());
        System.out.println("八字：" + qiMen.getBaZi());
        System.out.println("八字五行：" + qiMen.getBaZiWuXing());
        System.out.println("八字纳音：" + qiMen.getBaZiNaYin());
        System.out.println("八字旬空：" + qiMen.getBaZiXunKong());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("符头：" + qiMen.getFuTou());
        System.out.println("节气：" + qiMen.getJieQi() + qiMen.getSanYuan());
        System.out.println("局数：" + qiMen.getYinYangDun() + qiMen.getJuShu() + "局");
        System.out.println("旬首：" + qiMen.getXunShou());
        System.out.println("旬首仪仗：" + qiMen.getXunShouYiZhang());
        System.out.println("旬首落宫：" + qiMen.getXunShouGong());
        System.out.println("值符：" + qiMen.getZhiFu());
        System.out.println("值使：" + qiMen.getZhiShi());
        System.out.println("六甲旬空：" + qiMen.getLiuJiaXunKong());
        System.out.println("六甲旬空落宫：" + qiMen.getLiuJiaXunKongGong());
        System.out.println("六甲旬空落宫标识：" + qiMen.getLiuJiaXunKongGongMark());
        System.out.println("驿马：" + qiMen.getYiMa());
        System.out.println("驿马落宫：" + qiMen.getYiMaGong());
        System.out.println("驿马落宫标识：" + qiMen.getYiMaGongMark());
        System.out.println("九遁：" + qiMen.getJiuDun());
        System.out.println("天乙：" + qiMen.getTianYi());
        System.out.println("地乙：" + qiMen.getDiYi());
        System.out.println("太乙：" + qiMen.getTaiYi());
        System.out.println("伏吟：" + qiMen.getFuYin());
        System.out.println("反吟：" + qiMen.getFanYin());
        System.out.println("六仪击刑：" + qiMen.getLiuYiJiXing());
        System.out.println("奇仪入墓：" + qiMen.getQiYiRuMu());
        System.out.println("月将：" + qiMen.getYueJiang());
        System.out.println("月将神：" + qiMen.getYueJiangShen());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("★地盘：" + qiMen.getDiPan());
        System.out.println("★天盘：" + qiMen.getTianPan());
        System.out.println("★人盘：" + qiMen.getRenPan());
        System.out.println("★神盘：" + qiMen.getShenPan());
        System.out.println();
        System.out.println("地盘奇仪：" + qiMen.getDiQiYi());
        System.out.println("地盘六甲：" + qiMen.getDiLiuJia());
        System.out.println("地盘(奇仪+六甲)：" + qiMen.getDiPanPron());
        System.out.println("天盘奇仪：" + qiMen.getTianPanQiYi());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("十干克应：" + qiMen.getShiGanKeYing());

        System.out.println("\n----------------------------------------------------------------------------------------------------------------\n");

        System.out.println("八门克应：" + qiMen.getBaMenKeYing());

        System.out.println("\n----------------------------------------------------------------------------------------------------------------\n");

        System.out.println("八门静应：" + qiMen.getBaMenJingYing());

        System.out.println("\n----------------------------------------------------------------------------------------------------------------\n");

        System.out.println("八门动应：" + qiMen.getBaMenDongYing());

        System.out.println("\n----------------------------------------------------------------------------------------------------------------\n");

        System.out.println("星门克应：" + qiMen.getXingMenKeYing());

        System.out.println("\n----------------------------------------------------------------------------------------------------------------\n");

        System.out.println("九星时应：" + qiMen.getJiuXingShiYing());

        System.out.println("\n----------------------------------------------------------------------------------------------------------------\n");

        System.out.println("八卦旺衰(月令)：" + qiMen.getBaGuaWangShuai());
        System.out.println("八门旺衰(月令)：" + qiMen.getBaMenWangShuai());
        System.out.println("九星旺衰(月令)：" + qiMen.getJiuXingWangShuai());

        System.out.println("\n----------------------------------------------------------------------------------------------------------------\n");

        System.out.println("九神落宫状态：" + qiMen.getJiuShenLuoGongStatus());
        System.out.println("八门落宫状态：" + qiMen.getBaMenLuoGongStatus());
        System.out.println("九星落宫状态：" + qiMen.getJiuXingLuoGongStatus());

        System.out.println("\n----------------------------------------------------------------------------------------------------------------\n");

        System.out.println("地盘奇仪与落宫地支的关系：" + qiMen.getDiPanQiYiLuoGongLink());
        System.out.println();
        System.out.println("天盘奇仪与落宫地支的关系：" + qiMen.getTianPanQiYiLuoGongLink());

    }


}
