package com.xuan.utils;

import org.junit.Test;

import java.util.Map;

/**
 * 百度地图定位工具测试
 */
public class BaiduMapsUtilTest {

    /**
     * 通过地区获取经纬度
     */
    @Test
    public void baiDuMapsTest() {

        String address = "北京市";
        Map<String, Double> lngAndLat = BaiduMapsUtil.getLngAndLat(address);
        System.out.println("经度：" + lngAndLat.get("lng") + "，纬度：" + lngAndLat.get("lat"));

    }

    /**
     * 通过经纬度获取地区
     */
    @Test
    public void getAddressTest() {

        String lng = "120"; // 经度
        String lat = "30"; // 纬度
        String address = BaiduMapsUtil.getAddress(lng, lat);
        System.out.println(address);

    }

    /**
     * 通过机器ip定位获取地区（若机器ip为空，则根据发送请求的机器ip定位）
     */
    @Test
    public void getIpToAddressTest() {

        String ip = "";
        String address = BaiduMapsUtil.getIpToAddress(ip);
        System.out.println(address);

    }


}
