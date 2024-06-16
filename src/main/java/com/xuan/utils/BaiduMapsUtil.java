package com.xuan.utils;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * 百度地图定位工具
 *
 * <p> API地址：https://lbsyun.baidu.com/faq/api?title=webapi </p>
 */
public class BaiduMapsUtil {

    /**
     * 开发者密钥
     */
    private static final String ak = ""; // 密钥申请地址：https://lbsyun.baidu.com/apiconsole/key#/home

//****************************************************************************************************************************************************

    /**
     * 通过地区获取经纬度
     *
     * @param address 地区
     * @return 经纬度
     */
    public static Map<String, Double> getLngAndLat(String address) {

        /* 接口文档地址：https://lbsyun.baidu.com/faq/api?title=webapi/guide/webservice-geocoding-base */

        // 1、参数校验
        if (StringUtils.isBlank(ak)) throw new NullPointerException("⚠ 请填写开发者密钥");
        if (StringUtils.isBlank(address)) throw new NullPointerException("⚠ 请填写地区");

        // 2、发送URL请求
        String url = "https://api.map.baidu.com/geocoding/v3/?address=" + address + "&output=json&ak=" + ak;
        JSONObject data = sendUrl(url);

        // 3、获取数据
        Map<String, Double> map = new HashMap<>();
        if (data.get("status").toString().equals("0")) {
            map.put("lng", data.getJSONObject("result").getJSONObject("location").getDouble("lng")); // 经度
            map.put("lat", data.getJSONObject("result").getJSONObject("location").getDouble("lat")); // 纬度
        } else {
            throw new NullPointerException("⚠ 定位异常");
        }

        return map;

    }

    /**
     * 通过经纬度获取地区
     *
     * @param lng 经度
     * @param lat 纬度
     * @return 地区
     */
    public static String getAddress(String lng, String lat) {

        /* 接口文档地址：https://lbsyun.baidu.com/faq/api?title=webapi/guide/webservice-geocoding-abroad-base */

        // 1、参数校验
        if (StringUtils.isBlank(ak)) throw new NullPointerException("⚠ 请填写开发者密钥");
        if (StringUtils.isBlank(lng) || StringUtils.isBlank(lat)) throw new NullPointerException("⚠ 请填完善经纬度");

        // 2、发送URL请求
        String url = "https://api.map.baidu.com/reverse_geocoding/v3/?location=" + lat + "," + lng + "&output=json&coordtype=wgs84ll&extensions_poi=1&extensions_town=true&ak=" + ak;
        JSONObject data = sendUrl(url);

        // 3、获取数据
        String address;
        if (data.get("status").toString().equals("0")) {
            address = data.getJSONObject("result").getString("formatted_address"); // 标准的结构化地址
        } else {
            throw new NullPointerException("⚠ 定位异常");
        }

        return address;

    }

    /**
     * 通过机器ip定位获取地区（若机器ip为空，则根据发送请求的机器ip定位）
     *
     * @param ip 机器ip（如：127.0.0.1）
     * @return 地区
     */
    public static String getIpToAddress(String ip) {

        /* 接口文档地址：https://lbsyun.baidu.com/faq/api?title=webapi/ip-api-base */

        // 1、参数校验
        if (StringUtils.isBlank(ak)) throw new NullPointerException("⚠ 请填写开发者密钥");
        if (StringUtils.isNotBlank(ip) && CommonUtil.checkIp(ip)) {
            if ("localhost".equals(ip) || "127.0.0.1".equals(ip) || "::1".equals(ip)) {
                ip = "";
            }
        } else {
            ip = "";
        }

        // 2、发送URL请求
        String url = "https://api.map.baidu.com/location/ip?ip=" + ip + "&coor=bd09ll&&ak=" + ak;
        JSONObject data = sendUrl(url);

        // 3、获取数据
        String address;
        if (data.get("status").toString().equals("0")) {
            address = data.getJSONObject("content").getString("address"); // 简要地址信息
        } else {
            throw new NullPointerException("⚠ 定位异常");
        }

        return address;

    }

//----------------------------------------------------------------------------------------------------------------------------------------------------

    /**
     * 发送URL请求
     *
     * @param url URL路径
     * @return 数据
     */
    private static JSONObject sendUrl(String url) {

        StringBuilder json = new StringBuilder();

        try {
            URL oracle = new URL(url);
            URLConnection uc = oracle.openConnection();
            InputStreamReader isr = new InputStreamReader(uc.getInputStream(), StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);
            String inputLine;
            while (null != (inputLine = br.readLine())) {
                json.append(inputLine);
            }
            br.close();
        } catch (Exception e) {
            throw new NullPointerException("⚠ 系统异常");
        }

        return JSONObject.parseObject(json.toString());

    }


}
