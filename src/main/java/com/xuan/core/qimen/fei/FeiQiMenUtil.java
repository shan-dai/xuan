package com.xuan.core.qimen.fei;

import com.nlf.calendar.Lunar;
import com.nlf.calendar.Solar;

import java.util.*;

/**
 * 飞盘奇门-工具
 *
 * @author 善待
 */
public class FeiQiMenUtil {

    /**
     * 判断日期类型设置，返回公历日期、农历日期
     *
     * @param setting 飞盘奇门-设置
     * @return 公历日期、农历日期
     */
    public static Map<String, Object> isDateType(FeiQiMenSetting setting) {

        // 1、初始化日期
        Solar solar = new Solar(); // 初始化公历日期
        Lunar lunar = new Lunar(); // 初始化农历日期

        // 2、获取设置数据
        Date date = setting.getDate(); // 日期
        int dateType = setting.getDateType(); // 日期类型

        // 3、按公历日期计算
        if (dateType == 0) {
            // 3.1、通过日期初始化
            solar = new Solar(date); // 公历日期
            lunar = solar.getLunar(); // 农历日期
        }

        // 4、按农历日期计算
        if (dateType == 1) {
            // 4.1、通过日期获取年月日时分秒
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            int year = c.get(Calendar.YEAR); // 年
            // 4.2、判断是否按闰月计算
            int month = (setting.getLeapMonth() == 1 ? -(c.get(Calendar.MONTH) + 1) : c.get(Calendar.MONTH) + 1); // 月
            int day = c.get(Calendar.DATE); // 日
            int hour = c.get(Calendar.HOUR_OF_DAY); // 时
            int minute = c.get(Calendar.MINUTE); // 分
            int second = c.get(Calendar.SECOND); // 秒
            // 4.3、通过农历年月日时初始化
            try {
                lunar = new Lunar(year, month, day, hour, minute, second); // 农历日期
                solar = lunar.getSolar(); // 公历日期
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        }

        // 5、添加公历日期、农历日期并返回
        Map<String, Object> map = new HashMap<>();
        map.put("solar", solar); // 公历日期
        map.put("lunar", lunar); // 农历日期
        return map;

    }

    /**
     * 判断干支设置，返回干支
     *
     * @param setting 飞盘奇门-设置
     * @param lunar   农历日期
     * @return 干支
     */
    public static Map<String, List<String>> isGanZhi(FeiQiMenSetting setting, Lunar lunar) {

        List<String> list;
        Map<String, List<String>> map = new HashMap<>();

        // 年干支设置（0:以正月初一作为新年的开始。1:以立春当天作为新年的开始。2:以立春交接的时刻作为新年的开始）
        int yearGanZhiSet = setting.getYearGanZhiSet();
        // 月干支设置（0:以节交接当天起算。1:以节交接时刻起算）
        int monthGanZhiSet = setting.getMonthGanZhiSet();
        // 日干支设置（0:晚子时日干支算当天。1:晚子时日干支算明天）
        int dayGanZhiSet = setting.getDayGanZhiSet();
        // 时干支设置（0:支持早子时和晚子时）
        int hourGanZhiSet = setting.getHourGanZhiSet();

        // 1、判断年干支设置
        if (yearGanZhiSet == 0) {
            // 1.1、以正月初一作为新年的开始
            list = Arrays.asList(lunar.getYearGan(), lunar.getYearZhi(), lunar.getYearInGanZhi());
        } else if (yearGanZhiSet == 1) {
            // 1.2、以立春当天作为新年的开始
            list = Arrays.asList(lunar.getYearGanByLiChun(), lunar.getYearZhiByLiChun(), lunar.getYearInGanZhiByLiChun());
        } else if (yearGanZhiSet == 2) {
            // 1.3、以立春交接的时刻作为新年的开始
            list = Arrays.asList(lunar.getYearGanExact(), lunar.getYearZhiExact(), lunar.getYearInGanZhiExact());
        } else {
            // 1.4、默认→ 以正月初一作为新年的开始
            list = Arrays.asList(lunar.getYearGan(), lunar.getYearZhi(), lunar.getYearInGanZhi());
        }
        map.put("yearGanZhi", list);

        // 2、判断月干支设置
        if (monthGanZhiSet == 0) {
            // 2.1、以节交接当天起算
            list = Arrays.asList(lunar.getMonthGan(), lunar.getMonthZhi(), lunar.getMonthInGanZhi());
        } else if (monthGanZhiSet == 1) {
            // 2.2、以节交接时刻起算
            list = Arrays.asList(lunar.getMonthGanExact(), lunar.getMonthZhiExact(), lunar.getMonthInGanZhiExact());
        } else {
            // 2.3、默认→ 以节交接当天起算
            list = Arrays.asList(lunar.getMonthGan(), lunar.getMonthZhi(), lunar.getMonthInGanZhi());
        }
        map.put("monthGanZhi", list);

        // 3、判断日干支设置
        if (dayGanZhiSet == 0) {
            // 3.1、晚子时日干支算明天
            list = Arrays.asList(lunar.getDayGanExact(), lunar.getDayZhiExact(), lunar.getDayInGanZhiExact());
        } else if (dayGanZhiSet == 1) {
            // 3.2、晚子时日干支算当天
            list = Arrays.asList(lunar.getDayGanExact2(), lunar.getDayZhiExact2(), lunar.getDayInGanZhiExact2());
        } else {
            // 3.3、默认→ 晚子时日干支算明天
            list = Arrays.asList(lunar.getDayGanExact(), lunar.getDayZhiExact(), lunar.getDayInGanZhiExact());
        }
        map.put("dayGanZhi", list);

        // 4、判断日干支设置
        if (hourGanZhiSet == 0) {
            // 4.1、支持早子时和晚子时
            list = Arrays.asList(lunar.getTimeGan(), lunar.getTimeZhi(), lunar.getTimeInGanZhi());
        } else {
            // 4.2、默认→ 支持早子时和晚子时
            list = Arrays.asList(lunar.getTimeGan(), lunar.getTimeZhi(), lunar.getTimeInGanZhi());
        }
        map.put("hourGanZhi", list);

        // 5、返回干支
        return map;

    }

    /**
     * 计算十干克应
     *
     * @param diPan       地盘
     * @param tianPanQiYi 天盘飞盘后九星所携带的奇仪
     * @return 十干克应
     */
    public static Map<Integer, List<String>> shiGanKeYing(List<String> diPan, List<String> tianPanQiYi) {

        Map<List<String>, List<String>> shiGanKeYing = FeiQiMenMap.SHI_GAN_KE_YING; // 十干克应

        Map<Integer, List<String>> map = new HashMap<>(); // 保存十干克应关系
        for (int i = 0; i < 9; i++) {
            List<String> keYing = Arrays.asList(tianPanQiYi.get(i), diPan.get(i)); // 天盘天干+地盘天干
            List<String> keYingData = shiGanKeYing.get(keYing); // 天盘天干+地盘天干的十干克应关系
            String data = keYing.get(0) + "+" + keYing.get(1) + "(" + keYingData.get(0) + ")：" + keYingData.get(1);
            map.put(i, Collections.singletonList(data));
        }

        return map;

    }

    /**
     * 计算八门克应
     *
     * @param renPan      人盘
     * @param diPan       地盘
     * @param tianPanQiYi 天盘飞盘后九星所携带的奇仪
     * @return 八门克应
     */
    public static Map<Integer, List<String>> baMenKeYing(List<String> renPan, List<String> diPan, List<String> tianPanQiYi) {

        String[] baMenInitial = FeiQiMenMap.BA_MEN_INITIAL; // 八门原始宫位（1~9宫）
        Map<List<String>, String> baMenKeYing = FeiQiMenMap.BA_MEN_KE_YING; // 八门克应

        List<String> menMen = new ArrayList<>(); // 保存[人盘八门+地盘八门]的生克制化关系
        List<String> menDiGan = new ArrayList<>(); // 保存[人盘八门+地盘天干]的生克制化关系
        List<String> menTianGan = new ArrayList<>(); // 保存[人盘八门+天盘天干]的生克制化关系
        for (int i = 0; i < 9; i++) {
            String newMen = renPan.get(i); // 人盘八门
            // 1、计算[人盘八门+地盘八门]的生克制化关系
            String oldMen = baMenInitial[i]; // 宫位中的原始八门
            List<String> menAndMen = Arrays.asList(newMen, oldMen); // 例如：开+休
            if (null != baMenKeYing.get(menAndMen)) {
                menMen.add(newMen + "+" + oldMen + "：" + baMenKeYing.get(menAndMen)); // 例如→ 开门+休门：主见贵人财喜及开张铺店，贸易大吉。
            } else {
                menMen.add(null);
            }
            // 2、计算[人盘八门+地盘天干]的生克制化关系
            String diGan = diPan.get(i); // 地盘天干
            List<String> menAndDiGan = Arrays.asList(newMen, diGan); // 例如：开门+乙
            if (null != baMenKeYing.get(menAndDiGan)) {
                menDiGan.add(newMen + "+" + diGan + "：" + baMenKeYing.get(menAndDiGan)); // 例如→ 开门+乙:小财可求。
            } else {
                menDiGan.add(null);
            }
            // 3、计算[人盘八门+天盘天干]的生克制化关系
            String tianGan = tianPanQiYi.get(i); // 天盘天干
            List<String> menAndTianGan = Arrays.asList(newMen, tianGan); // 例如：开门+乙
            if (null != baMenKeYing.get(menAndTianGan)) {
                menTianGan.add(newMen + "+" + tianGan + "：" + baMenKeYing.get(menAndTianGan)); // 例如→ 开门+乙:小财可求。
            } else {
                menTianGan.add(null);
            }
        }

        // 4、整合[人盘八门+地盘八门]、[人盘八门+地盘天干]、[人盘八门+天盘天干]的生克制化关系
        Map<Integer, List<String>> map = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            map.put(i, Arrays.asList(menMen.get(i), menDiGan.get(i), menTianGan.get(i)));
        }

        // 5、返回数据
        return map;

    }

    /**
     * 计算并返回八门静应、动应
     *
     * @param menDongOrJing 八门静应\八门动应
     * @param renPan        人盘
     * @return [八门静应\八门动应]信息
     */
    public static Map<Integer, List<String>> menDongJingYing(Map<List<String>, String> menDongOrJing, List<String> renPan) {

        String[] baMenInitial = FeiQiMenMap.BA_MEN_INITIAL;// 八门初始位置

        Map<Integer, List<String>> map = new HashMap<>(); // 存放[门+门]信息
        for (int i = 0; i < renPan.size(); i++) {
            if (i != 4) {
                String oldMen = renPan.get(i); // 人盘八门
                String newMen = baMenInitial[i]; // 原宫八门
                List<String> men = Arrays.asList(oldMen, newMen);
                if (null != menDongOrJing.get(men)) {
                    map.put(i, Collections.singletonList(oldMen + "+" + newMen + "：" + menDongOrJing.get(men)));
                } else {
                    map.put(i, null);
                }
            } else {
                map.put(i, null); // 置空中五宫
            }
        }

        return map;

    }

    /**
     * 计算星门克应
     *
     * @param tianPan 天盘
     * @param renPan  人盘
     * @return 星门克应
     */
    public static Map<Integer, List<String>> xingMenKeYing(List<String> tianPan, List<String> renPan) {

        Map<List<String>, String> xingMenKeYing = FeiQiMenMap.XING_MEN_KE_YING; // 星门克应

        Map<Integer, List<String>> map = new HashMap<>(); // 存放九宫的[九星+八门]对应信息
        for (int i = 0; i < 9; i++) {
            List<String> xingMen = Arrays.asList(tianPan.get(i), renPan.get(i));
            if (null != xingMenKeYing.get(xingMen)) {
                map.put(i, Collections.singletonList(tianPan.get(i) + "星+" + renPan.get(i) + "：" + xingMenKeYing.get(xingMen)));
            } else {
                map.put(i, null);
            }
        }

        return map;

    }

    /**
     * 计算九星时应
     *
     * @param hourZhi 时支
     * @param tianPan 天盘
     * @return 九星时应
     */
    public static Map<Integer, List<String>> jiuXingShiYing(String hourZhi, List<String> tianPan) {

        Map<List<String>, String> jiuXingShiYing = FeiQiMenMap.JIU_XING_SHI_YING; // 九星时应

        Map<Integer, List<String>> map = new HashMap<>(); // 存放九宫的[九星+时辰]对应信息
        for (int i = 0; i < 9; i++) {
            List<String> xingMen = Arrays.asList(tianPan.get(i), hourZhi);
            map.put(i, Collections.singletonList(tianPan.get(i) + "星值" + hourZhi + "时：" + jiuXingShiYing.get(xingMen)));
        }

        return map;

    }

    /**
     * 计算八卦旺衰（根据季节计算）
     *
     * @param jiJie 季节
     * @return 八卦旺衰
     */
    public static List<List<String>> baGuaWangShuai(String jiJie) {

        String[] houTianBaGua = FeiQiMenMap.HOU_TIAN_BA_GUA; // 八卦（1~9宫）
        Map<String, Integer> siJiIndex = FeiQiMenMap.SI_JI_INDEX; // 四季索引
        Map<String, List<String>> baGuaWangShuai = FeiQiMenMap.BA_GUA_WANG_SHUAI_JI_JIE; // 八卦旺衰（根据季节计算）

        List<List<String>> list = new ArrayList<>(); // 保存八卦旺衰
        for (int i = 0; i < 9; i++) {
            if (i != 4) {
                List<String> gongWeiList = baGuaWangShuai.get(houTianBaGua[i]); // 每一宫位
                String wangShuai = gongWeiList.get(siJiIndex.get(jiJie)); // 每一宫位的八卦旺衰
                list.add(Arrays.asList(houTianBaGua[i] + "宫", wangShuai));
            } else {
                list.add(null); // 置空中五宫
            }
        }

        return list;

    }

    /**
     * 计算八门旺衰（根据季节计算）
     *
     * @param renPan 人盘
     * @param jiJie  季节
     * @return 八门旺衰
     */
    public static List<List<String>> baMenWangShuai(List<String> renPan, String jiJie) {

        Map<String, Integer> siJiIndex = FeiQiMenMap.SI_JI_INDEX; // 四季索引
        Map<String, List<String>> baMenWangShuai = FeiQiMenMap.BA_MEN_WANG_SHUAI_JI_JIE; // 八门旺衰（根据季节计算）

        List<List<String>> list = new ArrayList<>(); // 保存八门旺衰
        for (int i = 0; i < 9; i++) {
            String men = renPan.get(i); // 每一宫位中的门
            List<String> gongWeiList = baMenWangShuai.get(men); // 每一宫位
            if (null != gongWeiList) {
                list.add(Arrays.asList(men, gongWeiList.get(siJiIndex.get(jiJie))));
            } else {
                list.add(null);
            }
        }

        return list;

    }

    /**
     * 计算九星旺衰（根据月支计算）
     *
     * @param tianPan  天盘
     * @param monthZhi 月支
     * @return 九星旺衰
     */
    public static List<List<String>> jiuXingWangShuai(List<String> tianPan, String monthZhi) {

        Map<String, Integer> diZhiIndex = FeiQiMenMap.DI_ZHI_INDEX; // 十二地支索引
        Map<String, List<String>> jiuXingWangShuai = FeiQiMenMap.JIU_XING_WANG_SHUAI_MONTH_ZHI; // 九星旺衰（根据月支计算）

        List<List<String>> list = new ArrayList<>(); // 保存九星旺衰
        for (int i = 0; i < 9; i++) {
            String xing = tianPan.get(i); // 每一宫位中的星
            List<String> gongWeiList = jiuXingWangShuai.get(xing); // 每一宫位
            String wangShuai = gongWeiList.get(diZhiIndex.get(monthZhi)); // 每一宫位的九星旺衰
            list.add(Arrays.asList(xing, wangShuai));
        }

        return list;

    }

    /**
     * 计算九神落宫状态
     *
     * @param shenPan 神盘
     * @return 九神落宫状态
     */
    public static List<List<String>> jiuShenLuoGongStatus(List<String> shenPan) {

        Map<String, String> jiuShenJiXiong = FeiQiMenMap.JIU_SHEN_JI_XIONG; // 九神吉凶

        List<List<String>> list = new ArrayList<>(); // 保存九神落宫状态
        for (int i = 0; i < 9; i++) {
            String shen = shenPan.get(i); // 每一宫位中的神
            String gongWeiList = jiuShenJiXiong.get(shen); // 每一宫位的九神落宫状态
            list.add(Arrays.asList(shen, gongWeiList));
        }

        return list;

    }

    /**
     * 计算八门落宫状态
     *
     * @param renPan 人盘
     * @return 八门落宫状态
     */
    public static List<List<String>> baMenLuoGongStatus(List<String> renPan) {

        Map<String, List<String>> baMenLuoGongStatus = FeiQiMenMap.BA_MEN_LUO_GONG_STATUS; // 八门落宫状态

        List<List<String>> list = new ArrayList<>(); // 保存八门落宫状态
        for (int i = 0; i < 9; i++) {
            String men = renPan.get(i); // 每一宫位中的门
            List<String> gongWeiList = baMenLuoGongStatus.get(men); // 每一宫位
            if (null != gongWeiList) {
                list.add(Arrays.asList(men, gongWeiList.get(i)));
            } else {
                list.add(null);
            }
        }

        return list;

    }

    /**
     * 计算九星落宫状态
     *
     * @param tianPan 天盘
     * @return 九星落宫状态
     */
    public static List<List<String>> jiuXingLuoGongStatus(List<String> tianPan) {

        Map<String, List<String>> jiuXingLuoGongStatus = FeiQiMenMap.JIU_XING_LUO_GONG_STATUS; // 九星落宫状态

        List<List<String>> list = new ArrayList<>(); // 保存九星落宫状态
        for (int i = 0; i < 9; i++) {
            String xing = tianPan.get(i); // 每一宫位中的星
            List<String> gongWeiList = jiuXingLuoGongStatus.get(xing); // 每一宫位
            if (null != gongWeiList) {
                list.add(Arrays.asList(xing, gongWeiList.get(i)));
            } else {
                list.add(null);
            }
        }

        return list;

    }

    /**
     * 计算地盘奇仪与落宫地支的关系（1~9宫）
     *
     * @param diPan 地盘（1~9宫）
     * @return 地盘奇仪与落宫地支的关系（1~9宫）
     */
    public static Map<Integer, List<List<String>>> diPanQiYiLuoGongLink(List<String> diPan) {

        Map<List<String>, String> qiYiLuoGongStatus = FeiQiMenMap.QI_YI_LUO_GONG_STATUS; // 奇仪落宫状态
        Map<Integer, List<String>> jiuGongDiZhi = FeiQiMenMap.JIU_GONG_DI_ZHI; // 九宫中的地支（1~9宫）

        Map<Integer, List<List<String>>> map = new HashMap<>(); // 保存地盘奇仪与落宫地支的关系
        for (int i = 0; i < 9; i++) {
            if (i != 4) {
                List<String> oneList = new ArrayList<>();
                List<List<String>> oneList2 = new ArrayList<>();
                String diPanQiYi = diPan.get(i); // 每一宫位的地盘奇仪
                List<String> diZhiList = jiuGongDiZhi.get(i); // 每一宫位中包含的地支
                for (String key : diZhiList) {
                    List<String> qiYiDiZhi = Arrays.asList(diPanQiYi, key); // 每一宫位中的地盘奇仪+地支
                    String status = qiYiLuoGongStatus.get(qiYiDiZhi);
                    oneList.add(key);
                    oneList.add(status);
                    oneList2.add(oneList);
                    oneList = new ArrayList<>();
                }
                map.put(i, oneList2);
            } else {
                map.put(i, null); // 置空中五宫
            }
        }

        // 2、返回数据
        return map;

    }

    /**
     * 计算天盘奇仪与落宫地支的关系（1~9宫）
     *
     * @param tianPanQiYi 天盘旋转后九星所携带的奇仪（1~9宫）
     * @return 天盘奇仪与落宫地支的关系（1~9宫）
     */
    public static Map<Integer, List<List<String>>> tianPanQiYiLuoGongLink(List<String> tianPanQiYi) {

        Map<List<String>, String> qiYiLuoGongStatus = FeiQiMenMap.QI_YI_LUO_GONG_STATUS; // 奇仪落宫状态
        Map<Integer, List<String>> jiuGongDiZhi = FeiQiMenMap.JIU_GONG_DI_ZHI; // 九宫中的地支（1~9宫）

        Map<Integer, List<List<String>>> map = new HashMap<>(); // 保存天盘奇仪与落宫地支的关系
        for (int i = 0; i < 9; i++) {
            if (i != 4) {
                List<String> oneList = new ArrayList<>();
                List<List<String>> oneList2 = new ArrayList<>();
                String _tianPanQiYi = tianPanQiYi.get(i); // 每一宫位天盘奇仪
                List<String> diZhiList = jiuGongDiZhi.get(i); // 每一宫位中包含的地支
                String status;
                for (String key : diZhiList) {
                    List<String> qiYiDiZhiToTq = Arrays.asList(_tianPanQiYi, key); // 每一宫位中的地盘奇仪+地支
                    status = qiYiLuoGongStatus.get(qiYiDiZhiToTq);
                    oneList.add(key);
                    oneList.add(status);
                    oneList2.add(oneList);
                    oneList = new ArrayList<>();
                }
                map.put(i, oneList2);
            } else {
                map.put(4, null); // 置空中五宫
            }
        }

        return map;

    }


}
