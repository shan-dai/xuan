package com.xuan.utils;

import org.junit.Test;

import java.util.Date;

/**
 * 真太阳时工具测试
 */
public class TrueSolarDateUtilTest {

    /**
     * 获取真太阳时
     */
    @Test
    public void getTrueSolarDate() {

        // 初始化日期
        Date date = new Date();

        // 获取真太阳时
        String address = "上海市";
        Date trueSolarTime = TrueSolarDateUtil.getTrueSolarDate(date, address);

        // 格式化日期
        String dateStr = DateUtil.getDateStr(date, "yyyy-MM-dd HH:mm:ss"); // 标准时刻
        String trueSolarTimeStr = DateUtil.getDateStr(trueSolarTime, "yyyy-MM-dd HH:mm:ss"); // 真太阳时

        System.out.println(address + "，标准时刻→ " + dateStr);
        System.out.println(address + "，真太阳时→ " + trueSolarTimeStr);

    }


}
