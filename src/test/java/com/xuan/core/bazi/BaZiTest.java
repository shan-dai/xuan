package com.xuan.core.bazi;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * 八字测试
 */
public class BaZiTest {

    @Test
    public void baZiTest() {

        // 1、日期
        Date date;
        Calendar c = Calendar.getInstance();
        c.set(2024, 1 - 1, 1, 0, 0, 0);
        date = c.getTime();
        // 1.1、真太阳时
//        date = TrueSolarDateUtil.getTrueSolarDate(date, "某某地区"); // 获取真太阳时（TODO：请填写真实地区）


        // 2、设置
        BaZiSetting setting = new BaZiSetting();
        setting.setSex(1); // 性别（0:女。1:男）
        setting.setName("某某人"); // 姓名
        setting.setOccupy("某某事"); // 测事
        setting.setAddress("某某地区"); // 地区
        setting.setDate(date); // 日期
        setting.setDateType(0); // 日期类型（0:公历。1:农历）
        setting.setLeapMonth(0); // 闰月（0:不使用闰月。1:使用闰月）
        setting.setQiYunLiuPai(0); // 起运流派（0:按天数和时辰数计算：3天1年、1天4个月、1时辰10天。1:按分钟数计算：4320分=1年、360分=1月、12分=1天、1分=2小时）
        setting.setYearGanZhiSet(1); // 年干支设置（0:以正月初一作为新年的开始。1:以立春当天作为新年的开始。2:以立春交接的时刻作为新年的开始）
        setting.setMonthGanZhiSet(1); // 月干支设置（0:以节交接当天起算。1:以节交接时刻起算）
        setting.setDayGanZhiSet(1); // 日干支设置（0:晚子时日干支算当天。1:晚子时日干支算明天）
        setting.setHourGanZhiSet(0); // 时干支设置（0:支持早子时和晚子时）
        setting.setCiGuan(0); // 词馆设置（0:禄命法。1:子平法）
        setting.setXueTang(0); // 学堂设置（0:禄命法。1:子平法）


        // 3、初始化
//        BaZi baZi = new BaZi(); // 使用默认设置初始化（默认使用当前公历日期）
//        BaZi baZi = new BaZi(date); // 使用公历日期初始化
//        BaZi baZi = new BaZi(date, 1); // 使用日期初始化
//        BaZi baZi = new BaZi(2024, 1, 1, 0, 0, 0); // 使用公历年月日时分秒初始化
//        BaZi baZi = new BaZi(2024, 1, 1, 0, 0, 0, 1); // 使用年月日时分秒、日期类型初始化
        BaZi baZi = new BaZi(setting); // 使用自定义设置初始化


        // 4、数据
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐ ☯ 八字 ☯ ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐\n");

        System.out.println("姓名：" + setting.getName());
        System.out.println("性别：" + (setting.getSex() == 0 ? "女♀" : "男♂"));
        System.out.println("测事：" + setting.getOccupy());
        System.out.println("地区：" + setting.getAddress());

        System.out.println("\n==============================================================================================================\n");

        System.out.println("公历：" + baZi.getSolarStr());
        System.out.println("农历：" + baZi.getLunarStr());
        System.out.println("星期：" + baZi.getWeek());
        System.out.println("八字：" + baZi.getBaZi());
        System.out.println("八字五行：" + baZi.getBaZiWuXing());
        System.out.println("八字纳音：" + baZi.getBaZiNaYin());
        System.out.println("八字旬空：" + baZi.getBaZiXunKong());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("年柱主星：" + baZi.getYearGanZhiZhuXing());
        System.out.println("月柱主星：" + baZi.getMonthGanZhiZhuXing());
        System.out.println("日柱主星：" + baZi.getDayGanZhiZhuXing());
        System.out.println("时柱主星：" + baZi.getHourGanZhiZhuXing());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("年支藏干：" + baZi.getYearZhiCangGan());
        System.out.println("月支藏干：" + baZi.getMonthZhiCangGan());
        System.out.println("日支藏干：" + baZi.getDayZhiCangGan());
        System.out.println("时支藏干：" + baZi.getHourZhiCangGan());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("年柱副星：" + baZi.getYearGanZhiFuXing());
        System.out.println("月柱副星：" + baZi.getMonthGanZhiFuXing());
        System.out.println("日柱副星：" + baZi.getDayGanZhiFuXing());
        System.out.println("时柱副星：" + baZi.getHourGanZhiFuXing());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("年支地势：" + baZi.getYearGanZhiDiShi());
        System.out.println("月支地势：" + baZi.getMonthGanZhiDiShi());
        System.out.println("日支地势：" + baZi.getDayGanZhiDiShi());
        System.out.println("时支地势：" + baZi.getHourGanZhiDiShi());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("年柱旬空：" + baZi.getYearGanZhiXunKong());
        System.out.println("月柱旬空：" + baZi.getMonthGanZhiXunKong());
        System.out.println("日柱旬空：" + baZi.getDayGanZhiXunKong());
        System.out.println("时柱旬空：" + baZi.getHourGanZhiXunKong());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("年柱纳音：" + baZi.getYearGanZhiNaYin());
        System.out.println("月柱纳音：" + baZi.getMonthGanZhiNaYin());
        System.out.println("日柱纳音：" + baZi.getDayGanZhiNaYin());
        System.out.println("时柱纳音：" + baZi.getHourGanZhiNaYin());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("年柱神煞：" + baZi.getYearGanZhiShenSha());
        System.out.println("月柱神煞：" + baZi.getMonthGanZhiShenSha());
        System.out.println("日柱神煞：" + baZi.getDayGanZhiShenSha());
        System.out.println("时柱神煞：" + baZi.getHourGanZhiShenSha());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("八字五行缺失：" + baZi.getBaZiWuXingQueShi());
        System.out.println("八字五行格局：" + baZi.getBaZiWuXingGeJu());
        System.out.println("身体强弱：" + baZi.getBodyIntensity());
        System.out.println("喜用神：" + baZi.getXiYongShen());
        System.out.println("喜用神方位：" + baZi.getXiYongShenFangWei());
        System.out.println("五行旺衰：" + baZi.getWuXingWangShuai());
        System.out.println("天干留意：" + baZi.getTianGanLiuYi());
        System.out.println("地支留意：" + baZi.getDiZhiLiuYi());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("胎元：" + baZi.getTaiYuan());
        System.out.println("胎息：" + baZi.getTaiXi());
        System.out.println("命宫：" + baZi.getMingGong());
        System.out.println("身宫：" + baZi.getShenGong());
        System.out.println("起运：" + baZi.getQiYun());
        System.out.println("起运日期：" + baZi.getQiYunDate());
        System.out.println("生肖：" + baZi.getShengXiao());
        System.out.println("星座：" + baZi.getXingZuo());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("宿：" + baZi.getXiu());
        System.out.println("宿吉凶：" + baZi.getXiuJiXiong());
        System.out.println("宿吉凶歌诀：" + baZi.getXiuJiXiongGeJue());
        System.out.println("星宿：" + baZi.getXingXiu());
        System.out.println("命：" + baZi.getMing());
        System.out.println("命卦：" + baZi.getMingGua());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("日柱论命：" + baZi.getDayZhuLunMing());
        System.out.println("姻缘：" + baZi.getYinYuan());
        System.out.println("骨重：" + baZi.getGuZhong() + "。" + baZi.getGuZhongInfo());
        System.out.println("五行分析：" + baZi.getWuXingFenXi());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("大运(年份、年龄、干支)：" + baZi.getDaYun());
        System.out.println();
        System.out.println("大运十神(天干、地支)：" + baZi.getDaYunShiShen());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("小运(年份、年龄、干支)：" + baZi.getXiaoYun());
        System.out.println();
        System.out.println("小运十神(天干、地支)：" + baZi.getXiaoYunShiShen());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("流年(年份、年龄、干支)：" + baZi.getLiuNian());
        System.out.println();
        System.out.println("流年十神(天干、地支)：" + baZi.getLiuNianShiShen());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("流月(农历月、干支)：" + baZi.getLiuYue());
        System.out.println();
        System.out.println("流月十神(天干、地支)：" + baZi.getLiuYueShiShen());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("正财(年份、年龄、干支)：" + baZi.getZhengCaiYun());
        System.out.println();
        System.out.println("偏财(年份、年龄、干支)：" + baZi.getPianCaiYun());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("正桃花(年份、年龄、干支)：" + baZi.getZhengTaoHua());
        System.out.println();
        System.out.println("偏桃花(年份、年龄、干支)：" + baZi.getPianTaoHua());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("大运运势：" + baZi.getDaYunYunShi());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("流年运势：" + baZi.getLiuNianYunShi());

    }


}
