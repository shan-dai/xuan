package com.xuan.utils;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.lionsoul.ip2region.DataBlock;
import org.lionsoul.ip2region.DbConfig;
import org.lionsoul.ip2region.DbSearcher;
import org.lionsoul.ip2region.Util;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * ip2region离线IP定位工具
 */
public class Ip2regionUtil {

    /**
     * 获取机器ip
     *
     * @return 机器ip
     */
    public static String getIp() {

        InetAddress localAddress = null;

        try {
            Enumeration<NetworkInterface> allNetworkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (allNetworkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = allNetworkInterfaces.nextElement();
                Enumeration<InetAddress> addresses = networkInterface.getInetAddresses();
                while (addresses.hasMoreElements()) {
                    InetAddress address = addresses.nextElement();
                    if (!address.isLinkLocalAddress() && !address.isLoopbackAddress() && address instanceof Inet4Address) {
                        localAddress = address;
                        break;
                    }
                }
                if (null != localAddress) {
                    break;
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }

        assert localAddress != null;
        return localAddress.getHostAddress();

    }

    /**
     * 通过机器ip获取地区（国内显示到城市，国外显示到国家）
     *
     * @param ip 机器ip
     * @return 地区
     */
    public static String getAddressByIp(String ip) {

        // 机器ip校验
        if (StringUtils.isNotBlank(ip) && CommonUtil.checkIp(ip)) {
            if ("localhost".equals(ip) || "127.0.0.1".equals(ip) || "::1".equals(ip)) {
                return "内网IP";
            }
        } else {
            return null;
        }

        // 通过ip获取国家、地区、网络供应商
        String cityInfo;
        try {
            cityInfo = getCityInfo(ip);
        } catch (Exception e) {
            throw new NullPointerException("⚠ 离线定位失败");
        }

        if (StringUtils.isNotBlank(cityInfo)) {
            cityInfo = cityInfo.replace("|", " ");
            String[] cityList = cityInfo.split(" ");
            if (cityList.length > 0) {
                // 国内显示到城市
                if ("中国".equals(cityList[0])) {
                    if (cityList.length > 2) {
                        return cityList[2];
                    }
                }
                // 国外显示到国家
                return cityList[0];
            }
        }

        return null;

    }

    /**
     * 通过HttpServletRequest获取机器ip
     *
     * @param request 浏览器请求对象
     * @return 机器ip
     */
    public static String getIpByHttpServletRequest(HttpServletRequest request) {

        String ip = request.getHeader("X-Real-IP");
        if (StringUtils.isNotBlank(ip) && !"unknown".equalsIgnoreCase(ip)) {
            return ip;
        }

        ip = request.getHeader("X-Forwarded-For");
        if (StringUtils.isNotBlank(ip) && !"unknown".equalsIgnoreCase(ip)) {
            // 多次反向代理后会有多个ip，第一个为真实ip
            int index = ip.indexOf(',');
            if (index != -1) {
                return ip.substring(0, index);
            } else {
                return ip;
            }
        } else {
            return request.getRemoteAddr();
        }

    }

//----------------------------------------------------------------------------------------------------------------------------------------------------

    /**
     * 通过机器ip获取国家、地区、网络供应商
     *
     * @param ip 机器ip
     * @return 地区
     */
    private static String getCityInfo(String ip) throws Exception {

        // 文件名称
        final String name = "ip2region.db";

        // 从jar包中获取文件流
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = resolver.getResources(name);
        Resource resource = resources[0];
        InputStream is = resource.getInputStream();
        File target = new File(name);
        FileUtils.copyInputStreamToFile(is, target);
        is.close();
        if (StringUtils.isBlank(String.valueOf(target))) {
            throw new NullPointerException("⚠ 【" + name + "】文件无效");
        }

        DbConfig config = new DbConfig();
        DbSearcher searcher = new DbSearcher(config, String.valueOf(target));

        // 查询算法：B-tree, B树搜索（更快）
//        int algorithm = DbSearcher.BTREE_ALGORITHM;
        try {
            Method method;
            method = searcher.getClass().getMethod("btreeSearch", String.class);
            DataBlock dataBlock;
            if (!Util.isIpAddress(ip)) {
                throw new NullPointerException("⚠ ip地址无效");
            }
            dataBlock = (DataBlock) method.invoke(searcher, ip);
            String info = dataBlock.getRegion();
            if (!StringUtils.isBlank(info)) {
                info = info.replace("|0", "");
                info = info.replace("0|", "");
            }
            return info;
        } catch (Exception e) {
            throw new NullPointerException("⚠ 定位异常");
        }

    }


}
