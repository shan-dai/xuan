package com.xuan.core;

import com.xuan.core.meihua.MeiHua;
import com.xuan.core.meihua.MeiHuaSetting;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * 梅花易数测试
 */
public class MeiHuaTest {

    @Test
    public void meiHuaTest() {

        // 1、日期
        Date date;
        Calendar c = Calendar.getInstance();
        c.set(2024, 1 - 1, 1, 0, 0, 0);
        date = c.getTime();
        // 1.1、真太阳时
//        date = TrueSolarDateUtil.getTrueSolarDate(date, "某某地区"); // 获取真太阳时（TODO：请填写真实地区）


        // 2、设置
        MeiHuaSetting setting = new MeiHuaSetting();
        setting.setSex(1); // 性别（0:女。1:男）
        setting.setName("某某人"); // 姓名
        setting.setOccupy("某某事"); // 占事
        setting.setAddress("某某地区"); // 地区
        setting.setDate(date); // 日期
        setting.setDateType(0); // 日期类型（0:公历。1:农历）
        setting.setLeapMonth(0); // 闰月（0:不使用闰月。1:使用闰月）
        setting.setQiGuaMode(0); // 起卦模式（0:日期。1:数字。2:单数。3:双数）
        setting.setQiGuaNumber(123); // 起卦数（起卦模式为[数字]时生效，三位数）
        setting.setQiGuaDanNumber(123); // 起卦数（起卦模式为[单数]时生效）
        setting.setQiGuaShuangNumber1(123); // 起卦数（起卦模式为[双数]时生效）
        setting.setQiGuaShuangNumber2(123); // 起卦数（起卦模式为[双数]时生效）
        setting.setQiGuaShuangNumberInSx(1); // 双数计算上下卦（0:双数求和计算上下卦。1:双数不求和计算上下卦）
        setting.setQiGuaShuangNumberInDong(0); // 双数计算动爻（0:双数求和计算动爻。1:双数求和加时数计算动爻）
        setting.setYearGanZhiSet(1); // 年干支设置（0:以正月初一作为新年的开始。1：以立春当天作为新年的开始。2：以立春交接的时刻作为新年的开始）
        setting.setMonthGanZhiSet(1); // 月干支设置（0:以节交接当天起算。1：以节交接时刻起算）
        setting.setDayGanZhiSet(1); // 日干支设置（0:晚子时日干支算当天。1：晚子时日干支算明天）
        setting.setHourGanZhiSet(0); // 时干支设置（0:支持早子时和晚子时）


        // 3、初始化
//        MeiHua meiHua = new MeiHua(); // 使用默认设置初始化（默认使用当前公历日期）
//        MeiHua meiHua = new MeiHua(date); // 使用公历日期初始化
//        MeiHua meiHua = new MeiHua(date, 1); // 使用日期初始化
//        MeiHua meiHua = new MeiHua(2024, 1, 1, 0, 0, 0); // 使用公历年月日时分秒初始化
//        MeiHua meiHua = new MeiHua(2024, 1, 1, 0, 0, 0, 1); // 使用年月日时分秒、日期类型初始化
        MeiHua meiHua = new MeiHua(setting); // 使用自定义设置初始化


        // 4、数据
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐ ☯ 梅花易数 ☯ ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐");
        System.out.println("⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐\n");

        System.out.println("姓名：" + setting.getName());
        System.out.println("性别：" + (setting.getSex() == 0 ? "女" : "男"));
        System.out.println("测事：" + setting.getOccupy());
        System.out.println("地区：" + setting.getAddress());

        System.out.println("\n==============================================================================================================\n");

        System.out.println("公历：" + meiHua.getSolarStr());
        System.out.println("农历：" + meiHua.getLunarStr());
        System.out.println("星期：" + meiHua.getWeek());
        System.out.println("八字：" + meiHua.getBaZi());
        System.out.println("八字五行：" + meiHua.getBaZiWuXing());
        System.out.println("八字纳音：" + meiHua.getBaZiNaYin());
        System.out.println("八字旬空：" + meiHua.getBaZiXunKong());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("上卦：" + meiHua.getShangGua());
        System.out.println("上卦卦象：" + meiHua.getShangGuaAs());
        System.out.println("下卦：" + meiHua.getXiaGua());
        System.out.println("下卦卦象：" + meiHua.getXiaGuaAs());
        System.out.println("动爻：" + meiHua.getDongYao());
        System.out.println("卦码：" + meiHua.getGuaMa());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("本卦：" + meiHua.getBenGua());
        System.out.println("本卦卦象：" + meiHua.getBenGuaAs());
        System.out.println("本卦的上卦：" + meiHua.getBenGuaShangGua());
        System.out.println("本卦的上卦卦象：" + meiHua.getBenGuaShangGuaAs());
        System.out.println("本卦的下卦：" + meiHua.getBenGuaXiaGua());
        System.out.println("本卦的下卦卦象：" + meiHua.getBenGuaXiaGuaAs());
        System.out.println("本卦卦辞：" + meiHua.getBenGuaGuaCi());
        System.out.println("本卦爻名：" + meiHua.getBenGuaLiuYaoName());
        System.out.println("本卦爻象：" + meiHua.getBenGuaLiuYaoAs());
        System.out.println("本卦爻辞：" + meiHua.getBenGuaLiuYaoYaoCi());
        System.out.println();
        System.out.println("本卦的用卦与体卦关系：" + meiHua.getBenYongTiLink());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("变卦：" + meiHua.getBianGua());
        System.out.println("变卦卦象：" + meiHua.getBianGuaAs());
        System.out.println("变卦的上卦：" + meiHua.getBianGuaShangGua());
        System.out.println("变卦的上卦卦象：" + meiHua.getBianGuaShangGuaAs());
        System.out.println("变卦的下卦：" + meiHua.getBianGuaXiaGua());
        System.out.println("变卦的下卦卦象：" + meiHua.getBianGuaXiaGuaAs());
        System.out.println("变卦卦辞：" + meiHua.getBianGuaGuaCi());
        System.out.println("变卦爻名：" + meiHua.getBianGuaLiuYaoName());
        System.out.println("变卦爻象：" + meiHua.getBianGuaLiuYaoAs());
        System.out.println("变卦爻辞：" + meiHua.getBianGuaLiuYaoYaoCi());
        System.out.println();
        System.out.println("变卦的用卦与体卦关系：" + meiHua.getBianYongTiLink());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("互卦：" + meiHua.getHuGua());
        System.out.println("互卦卦象：" + meiHua.getHuGuaAs());
        System.out.println("互卦的上卦：" + meiHua.getHuGuaShangGua());
        System.out.println("互卦的上卦卦象：" + meiHua.getHuGuaShangGuaAs());
        System.out.println("互卦的下卦：" + meiHua.getHuGuaXiaGua());
        System.out.println("互卦的下卦卦象：" + meiHua.getHuGuaXiaGuaAs());
        System.out.println("互卦卦辞：" + meiHua.getHuGuaGuaCi());
        System.out.println("互卦爻名：" + meiHua.getHuGuaLiuYaoName());
        System.out.println("互卦爻象：" + meiHua.getHuGuaLiuYaoAs());
        System.out.println("互卦爻辞：" + meiHua.getHuGuaLiuYaoYaoCi());
        System.out.println();
        System.out.println("互卦的用卦与体卦关系：" + meiHua.getHuYongTiLink());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("错卦：" + meiHua.getCuoGua());
        System.out.println("错卦卦象：" + meiHua.getCuoGuaAs());
        System.out.println("错卦的上卦：" + meiHua.getCuoGuaShangGua());
        System.out.println("错卦的上卦卦象：" + meiHua.getCuoGuaShangGuaAs());
        System.out.println("错卦的下卦：" + meiHua.getCuoGuaXiaGua());
        System.out.println("错卦的下卦卦象：" + meiHua.getCuoGuaXiaGuaAs());
        System.out.println("错卦卦辞：" + meiHua.getCuoGuaGuaCi());
        System.out.println("错卦爻名：" + meiHua.getCuoGuaLiuYaoName());
        System.out.println("错卦爻象：" + meiHua.getCuoGuaLiuYaoAs());
        System.out.println("错卦爻辞：" + meiHua.getCuoGuaLiuYaoYaoCi());
        System.out.println();
        System.out.println("错卦的用卦与体卦关系：" + meiHua.getCuoYongTiLink());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------\n");

        System.out.println("综卦：" + meiHua.getZongGua());
        System.out.println("综卦卦象：" + meiHua.getZongGuaAs());
        System.out.println("综卦的上卦：" + meiHua.getZongGuaShangGua());
        System.out.println("综卦的上卦卦象：" + meiHua.getZongGuaShangGuaAs());
        System.out.println("综卦的下卦：" + meiHua.getZongGuaXiaGua());
        System.out.println("综卦的下卦卦象：" + meiHua.getZongGuaXiaGuaAs());
        System.out.println("综卦卦辞：" + meiHua.getZongGuaGuaCi());
        System.out.println("综卦爻名：" + meiHua.getZongGuaLiuYaoName());
        System.out.println("综卦爻象：" + meiHua.getZongGuaLiuYaoAs());
        System.out.println("综卦爻辞：" + meiHua.getZongGuaLiuYaoYaoCi());
        System.out.println();
        System.out.println("综卦的用卦与体卦关系：" + meiHua.getZongYongTiLink());

    }


}
