package com.xuan.core;

import com.xuan.core.liuyao.LiuYao;
import com.xuan.core.liuyao.LiuYaoSetting;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * 六爻测试
 */
public class LiuYaoTest {

    /**
     * 六爻
     */
    @Test
    public void liuYaoTest() {

        // 1、日期
        Date date;
        Calendar c = Calendar.getInstance();
        c.set(2024, 1 - 1, 1, 0, 0, 0);
        date = c.getTime();
        // 1.1、真太阳时
//        date = TrueSolarDateUtil.getTrueSolarDate(date, "某某地区"); // 获取真太阳时（TODO：请填写真实地区）


        // 2、设置
        LiuYaoSetting setting = new LiuYaoSetting();
        setting.setSex(1); // 性别（0:女。1:男）
        setting.setName("某某人"); // 姓名
        setting.setOccupy("某某事"); // 占事
        setting.setAddress("某某地区"); // 地区
        setting.setDate(date); // 日期
        setting.setDateType(0); // 日期类型（0:公历。1:农历）
        setting.setLeapMonth(0); // 闰月（0:不使用闰月。1:使用闰月）
        setting.setQiGuaMode(0); // 起卦模式（0:日期。1:自动。2:手动）
        setting.setLiuYao(2); // 上爻(六爻)→ 0:—（2正1背） 1:- -（1正2背） 2:— ○（0正3背） 3:- - ×（3正0背）
        setting.setWuYao(0);  // 五爻→ 0:—（2正1背） 1:- -（1正2背） 2:— ○（0正3背） 3:- - ×（3正0背）
        setting.setSiYao(0);  // 四爻→ 0:—（2正1背） 1:- -（1正2背） 2:— ○（0正3背） 3:- - ×（3正0背）
        setting.setSanYao(0); // 三爻→ 0:—（2正1背） 1:- -（1正2背） 2:— ○（0正3背） 3:- - ×（3正0背）
        setting.setErYao(0);  // 二爻→ 0:—（2正1背） 1:- -（1正2背） 2:— ○（0正3背） 3:- - ×（3正0背）
        setting.setYiYao(0);  // 初爻(一爻)→ 0:—（2正1背） 1:- -（1正2背） 2:— ○（0正3背） 3:- - ×（3正0背）
        setting.setYearGanZhiSet(1); // 年干支设置（0:以正月初一作为新年的开始。1：以立春当天作为新年的开始。2：以立春交接的时刻作为新年的开始）
        setting.setMonthGanZhiSet(1); // 月干支设置（0:以节交接当天起算。1：以节交接时刻起算）
        setting.setDayGanZhiSet(1); // 日干支设置（0:晚子时日干支算当天。1：晚子时日干支算明天）
        setting.setHourGanZhiSet(0); // 时干支设置（0:支持早子时和晚子时）


        // 3、初始化
//        LiuYao liuYao = new LiuYao(); // 使用默认设置初始化（默认使用当前公历日期）
//        LiuYao liuYao = new LiuYao(date); // 使用公历日期初始化
//        LiuYao liuYao = new LiuYao(date, 1); // 使用日期初始化
//        LiuYao liuYao = new LiuYao(2024, 1, 1, 0, 0, 0); // 使用公历年月日时分秒初始化
//        LiuYao liuYao = new LiuYao(2024, 1, 1, 0, 0, 0, 1); // 使用年月日时分秒、日期类型初始化
        LiuYao liuYao = new LiuYao(setting); // 使用自定义设置初始化


        // 4、数据
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐ ☯ 六爻 ☯ ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐\n");

        System.out.println("姓名：" + setting.getName());
        System.out.println("性别：" + (setting.getSex() == 0 ? "女" : "男"));
        System.out.println("测事：" + setting.getOccupy());
        System.out.println("地区：" + setting.getAddress());

        System.out.println("\n==============================================================================================================\n");

        System.out.println("公历：" + liuYao.getSolarStr());
        System.out.println("农历：" + liuYao.getLunarStr());
        System.out.println("星期：" + liuYao.getWeek());
        System.out.println("八字：" + liuYao.getBaZi());
        System.out.println("八字五行：" + liuYao.getBaZiWuXing());
        System.out.println("八字纳音：" + liuYao.getBaZiNaYin());
        System.out.println("八字旬空：" + liuYao.getBaZiXunKong());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("六爻爻象：" + liuYao.getLiuYaoAs());
        System.out.println("六爻爻象标识：" + liuYao.getLiuYaoYaoXiangMark());
        System.out.println("六爻爻象标识名称：" + liuYao.getLiuYaoYaoXiangMarkName());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("上卦：" + liuYao.getShangGua());
        System.out.println("上卦卦象：" + liuYao.getShangGuaAs());
        System.out.println("下卦：" + liuYao.getXiaGua());
        System.out.println("下卦卦象：" + liuYao.getXiaGuaAs());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("本卦：" + liuYao.getBenGua());
        System.out.println("本卦卦象：" + liuYao.getBenGuaAs());
        System.out.println("本卦卦辞：" + liuYao.getBenGuaGuaCi());
        System.out.println("本卦爻名：" + liuYao.getBenGuaLiuYaoName());
        System.out.println("本卦爻象：" + liuYao.getBenGuaLiuYaoAs());
        System.out.println("本卦世应：" + liuYao.getBenGuaLiuYaoShiYing());
        System.out.println("本卦六亲：" + liuYao.getBenGuaLiuYaoLiuQin());
        System.out.println("本卦干支：" + liuYao.getBenGuaLiuYaoGanZhi());
        System.out.println("本卦五行：" + liuYao.getBenGuaLiuYaoWuXing());
        System.out.println("本卦六神：" + liuYao.getBenGuaLiuYaoLiuShen());
        System.out.println("本卦爻辞：" + liuYao.getBenGuaLiuYaoYaoCi());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("变卦：" + liuYao.getBianGua());
        System.out.println("变卦卦象：" + liuYao.getBianGuaAs());
        System.out.println("本卦卦辞：" + liuYao.getBianGuaGuaCi());
        System.out.println("变卦爻名：" + liuYao.getBianGuaLiuYaoName());
        System.out.println("变卦爻象：" + liuYao.getBianGuaLiuYaoAs());
        System.out.println("本卦世应：" + liuYao.getBianGuaLiuYaoShiYing());
        System.out.println("本卦六亲：" + liuYao.getBianGuaLiuYaoLiuQin());
        System.out.println("本卦干支：" + liuYao.getBianGuaLiuYaoGanZhi());
        System.out.println("本卦五行：" + liuYao.getBianGuaLiuYaoWuXing());
        System.out.println("本卦六神：" + liuYao.getBianGuaLiuYaoLiuShen());
        System.out.println("变卦爻辞：" + liuYao.getBianGuaLiuYaoYaoCi());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("互卦：" + liuYao.getHuGua());
        System.out.println("互卦卦象：" + liuYao.getHuGuaAs());
        System.out.println("本卦卦辞：" + liuYao.getHuGuaGuaCi());
        System.out.println("互卦爻名：" + liuYao.getHuGuaLiuYaoName());
        System.out.println("互卦爻象：" + liuYao.getHuGuaLiuYaoAs());
        System.out.println("本卦世应：" + liuYao.getHuGuaLiuYaoShiYing());
        System.out.println("本卦六亲：" + liuYao.getHuGuaLiuYaoLiuQin());
        System.out.println("本卦干支：" + liuYao.getHuGuaLiuYaoGanZhi());
        System.out.println("本卦五行：" + liuYao.getHuGuaLiuYaoWuXing());
        System.out.println("本卦六神：" + liuYao.getHuGuaLiuYaoLiuShen());
        System.out.println("互卦爻辞：" + liuYao.getHuGuaLiuYaoYaoCi());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("错卦：" + liuYao.getCuoGua());
        System.out.println("错卦卦象：" + liuYao.getCuoGuaAs());
        System.out.println("本卦卦辞：" + liuYao.getCuoGuaGuaCi());
        System.out.println("错卦爻名：" + liuYao.getCuoGuaLiuYaoName());
        System.out.println("错卦爻象：" + liuYao.getCuoGuaLiuYaoAs());
        System.out.println("本卦世应：" + liuYao.getCuoGuaLiuYaoShiYing());
        System.out.println("本卦六亲：" + liuYao.getCuoGuaLiuYaoLiuQin());
        System.out.println("本卦干支：" + liuYao.getCuoGuaLiuYaoGanZhi());
        System.out.println("本卦五行：" + liuYao.getCuoGuaLiuYaoWuXing());
        System.out.println("本卦六神：" + liuYao.getCuoGuaLiuYaoLiuShen());
        System.out.println("错卦爻辞：" + liuYao.getCuoGuaLiuYaoYaoCi());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("综卦：" + liuYao.getZongGua());
        System.out.println("综卦卦象：" + liuYao.getZongGuaAs());
        System.out.println("本卦卦辞：" + liuYao.getZongGuaGuaCi());
        System.out.println("综卦爻名：" + liuYao.getZongGuaLiuYaoName());
        System.out.println("综卦爻象：" + liuYao.getZongGuaLiuYaoAs());
        System.out.println("本卦世应：" + liuYao.getZongGuaLiuYaoShiYing());
        System.out.println("本卦六亲：" + liuYao.getZongGuaLiuYaoLiuQin());
        System.out.println("本卦干支：" + liuYao.getZongGuaLiuYaoGanZhi());
        System.out.println("本卦五行：" + liuYao.getZongGuaLiuYaoWuXing());
        System.out.println("本卦六神：" + liuYao.getZongGuaLiuYaoLiuShen());
        System.out.println("综卦爻辞：" + liuYao.getZongGuaLiuYaoYaoCi());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("驿马：" + liuYao.getYiMa());
        System.out.println("天马：" + liuYao.getTianMa());
        System.out.println("天元禄：" + liuYao.getTianYuanLu());
        System.out.println("天乙贵人：" + liuYao.getTianYiGuiRen());
        System.out.println("太极贵人：" + liuYao.getTaiJiGuiRen());
        System.out.println("天德贵人：" + liuYao.getTianDeGuiRen());
        System.out.println("月德贵人：" + liuYao.getYueDeGuiRen());
        System.out.println("唐符国印：" + liuYao.getTangFuGuoYin());
        System.out.println("咸池：" + liuYao.getXianChi());
        System.out.println("天喜：" + liuYao.getTianXi());
        System.out.println("皇恩：" + liuYao.getHuangEn());
        System.out.println("文昌：" + liuYao.getWenChang());
        System.out.println("华盖：" + liuYao.getHuaGai());
        System.out.println("将星：" + liuYao.getJiangXing());
        System.out.println("灾煞：" + liuYao.getZaiSha());
        System.out.println("劫煞：" + liuYao.getJieSha());
        System.out.println("谋星：" + liuYao.getMouXing());
        System.out.println("天医：" + liuYao.getTianYi());

    }


}
