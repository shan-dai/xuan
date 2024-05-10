package com.xuan.utils;

import org.junit.Test;

/**
 * ip2region离线IP定位工具测试
 */
public class Ip2regionUtilTest {

    /**
     * 获取机器ip
     */
    @Test
    public void getIpTest() {

        String ip = Ip2regionUtil.getIp();
        System.out.println(ip);

    }

    /**
     * 通过机器ip获取地区（国内显示到城市，国外显示到国家）
     */
    @Test
    public void getAddressByIpTest() {

        String ip = "202.108.22.5";
        String addressByIp = Ip2regionUtil.getAddressByIp(ip);
        System.out.println(addressByIp);

    }


}
