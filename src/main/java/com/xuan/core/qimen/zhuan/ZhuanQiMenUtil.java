package com.xuan.core.qimen.zhuan;

import com.nlf.calendar.Lunar;
import com.nlf.calendar.Solar;

import java.util.*;

/**
 * 转盘奇门-工具
 *
 * @author 善待
 */
public class ZhuanQiMenUtil {

    /**
     * 判断日期类型设置，返回公历日期、农历日期
     *
     * @param setting 转盘奇门-设置
     * @return 公历日期、农历日期
     */
    public static Map<String, Object> isDateType(ZhuanQiMenSetting setting) {

        // 1、初始化日期
        Solar solar = new Solar(); // 初始化公历日期
        Lunar lunar = new Lunar(); // 初始化农历日期

        // 2、获取设置数据
        Date date = setting.getDate(); // 日期
        int dateType = setting.getDateType(); // 日期类型

        // 3、按公历日期计算
        if (dateType == 0) {
            // 2.1、通过日期初始化
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
     * @param setting 转盘奇门-设置
     * @param lunar   农历日期
     * @return 干支
     */
    public static Map<String, List<String>> isGanZhi(ZhuanQiMenSetting setting, Lunar lunar) {

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
     * @param diPan 地盘
     * @param toTq  地盘天干+只包含'天禽星'携带的天干
     * @param exTq  地盘天干+不包含'天禽星'携带的天干
     * @return 十干克应
     */
    public static Map<Integer, List<String>> shiGanKeYing(List<String> diPan, List<String> toTq, List<String> exTq) {

        Map<List<String>, List<String>> shiGanKeYing = ZhuanQiMenMaps.SHI_GAN_KE_YING; // 十干克应

        // 计算九宫中的[天盘天干+地盘天干]对应的十干克应关系
        Map<Integer, List<String>> map = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            List<String> to = Arrays.asList(toTq.get(i), diPan.get(i)); // 地盘天干+只包含'天禽星'携带的天干
            List<String> ex = Arrays.asList(exTq.get(i), diPan.get(i)); // 地盘天干+不包含'天禽星'携带的天干
            if (i != 4) {
                List<String> keYingListEx = shiGanKeYing.get(ex); // 地盘天干+不包含'天禽星'携带的天干的十干克应关系
                String keYingEx = ex.get(0) + "+" + ex.get(1) + "(" + keYingListEx.get(0) + ")：" + keYingListEx.get(1);
                List<String> keYingListTo = shiGanKeYing.get(to); // 地盘天干+只包含'天禽星'携带的天干的十干克应关系
                if (null != keYingListTo) {
                    // 该宫位中存在两个天盘天干，追加十干克应数据
                    String keYingTo = to.get(0) + "+" + to.get(1) + "(" + keYingListTo.get(0) + ")：" + keYingListTo.get(1);
                    map.put(i, Arrays.asList(keYingTo, keYingEx));
                } else {
                    map.put(i, Collections.singletonList(keYingEx));
                }
            } else {
                map.put(i, null); // 置空中五宫
            }
        }

        return map;

    }

    /**
     * 计算八门克应
     *
     * @param renPan 人盘
     * @param diPan  地盘
     * @param toTq   地盘天干+只包含'天禽星'携带的天干
     * @param exTq   地盘天干+不包含'天禽星'携带的天干
     * @return 八门克应
     */
    public static Map<Integer, List<String>> baMenKeYing(List<String> renPan, List<String> diPan, List<String> toTq, List<String> exTq) {

        String[] baMenInitial = ZhuanQiMenMaps.BA_MEN_INITIAL;// 八门原始宫位（1~9宫）
        Map<List<String>, String> baMenKeYing = ZhuanQiMenMaps.BA_MEN_KE_YING; // 八门克应

        List<String> menMen = new ArrayList<>(); // 保存[人盘八门+地盘八门]的生克制化关系
        List<String> menDiGan = new ArrayList<>(); // 保存[人盘八门+地盘天干]的生克制化关系
        List<String> menTianGanToTq = new ArrayList<>(); // 保存[人盘八门+天盘天干]的生克制化关系（天禽星携带的天干）
        List<String> menTianGanExTq = new ArrayList<>(); // 保存[人盘八门+天盘天干]的生克制化关系（非天禽星携带的天干）
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
            String diPanGan = diPan.get(i); // 地盘天干
            List<String> menAndDiGan = Arrays.asList(newMen, diPanGan); // 例如：开门+乙
            if (null != baMenKeYing.get(menAndDiGan)) {
                menDiGan.add(newMen + "+" + diPanGan + "：" + baMenKeYing.get(menAndDiGan)); // 例如→ 开门+乙:小财可求。
            } else {
                menDiGan.add(null);
            }
            // 3、计算[人盘八门+天盘天干]的生克制化关系
            String tianGanToTq = toTq.get(i); // '天禽星'携带的天干
            String tianGanExTq = exTq.get(i); // 非'天禽星'携带的天干
            List<String> menAndTianGanToTq = Arrays.asList(newMen, tianGanToTq); // 例如：开门+乙
            List<String> menAndTianGanExTTq = Arrays.asList(newMen, tianGanExTq); // 例如：开门+乙
            if (null != baMenKeYing.get(menAndTianGanToTq)) {
                menTianGanToTq.add(newMen + "+" + tianGanToTq + "：" + baMenKeYing.get(menAndTianGanToTq)); // 例如→ 开门+乙:小财可求。
            } else {
                menTianGanToTq.add(null);
            }
            if (null != baMenKeYing.get(menAndTianGanExTTq)) {
                menTianGanExTq.add(newMen + "+" + tianGanExTq + "：" + baMenKeYing.get(menAndTianGanExTTq)); // 例如→ 开门+乙:小财可求。
            } else {
                menTianGanExTq.add(null);
            }
        }

        // 4、整合[人盘八门+地盘八门]、[人盘八门+地盘天干]、[人盘八门+天盘天干]的生克制化关系
        Map<Integer, List<String>> map = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            if (i != 4) {
                if (null != menTianGanToTq.get(i)) {
                    map.put(i, Arrays.asList(menMen.get(i), menDiGan.get(i), menTianGanToTq.get(i), menTianGanExTq.get(i)));
                } else {
                    map.put(i, Arrays.asList(menMen.get(i), menDiGan.get(i), menTianGanExTq.get(i)));
                }
            } else {
                map.put(i, null); // 置空中五宫
            }
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

        String[] baMenInitial = ZhuanQiMenMaps.BA_MEN_INITIAL;// 八门初始位置

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

        Map<List<String>, String> xingMenKeYing = ZhuanQiMenMaps.XING_MEN_KE_YING; // 星门克应

        List<String> list = new ArrayList<>(); // 存放单宫的[九星+八门]对应信息
        Map<Integer, List<String>> map = new HashMap<>(); // 存放九宫的[九星+八门]对应信息
        for (int i = 0; i < 9; i++) {
            if (i != 4) {
                String xing = tianPan.get(i).substring(0, 1); // 天 或 芮
                if ("天".equals(xing)) {
                    // 1.1、宫位中不包含'天禽星'
                    List<String> xingMen = Arrays.asList(tianPan.get(i), renPan.get(i));
                    map.put(i, Collections.singletonList(tianPan.get(i) + "星+" + renPan.get(i) + "：" + xingMenKeYing.get(xingMen)));
                } else {
                    // 1.2、宫位中包含'天芮星'和'天禽星'
                    List<String> xingMen = Arrays.asList("天芮", renPan.get(i));
                    list.add("天芮星+" + renPan.get(i) + "：" + xingMenKeYing.get(xingMen));
                    list.add("天禽星+" + renPan.get(i) + "：" + xingMenKeYing.get(xingMen));
                    map.put(i, list);
                }
            } else {
                map.put(i, null); // 置空中五宫
            }
        }

        // 2、返回数据
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

        Map<List<String>, String> jiuXingShiYing = ZhuanQiMenMaps.JIU_XING_SHI_YING; // 九星时应

        List<String> list = new ArrayList<>(); // 存放单宫的[九星+时辰]对应信息
        Map<Integer, List<String>> map = new HashMap<>(); // 存放九宫的[九星+时辰]对应信息
        for (int i = 0; i < 9; i++) {
            if (i != 4) {
                String xing = tianPan.get(i).substring(0, 1); // 天 或 芮
                if ("天".equals(xing)) {
                    // 1.1、宫位中不包含'天禽星'
                    List<String> xingMen = Arrays.asList(tianPan.get(i), hourZhi);
                    map.put(i, Collections.singletonList(tianPan.get(i) + "星值" + hourZhi + "时：" + jiuXingShiYing.get(xingMen)));
                } else {
                    // 1.2、宫位中包含'天芮星'和'天禽星'
                    List<String> tianRui = Arrays.asList("天芮", hourZhi);
                    List<String> tianQin = Arrays.asList("天禽", hourZhi);
                    list.add("天芮星值" + hourZhi + "时：" + jiuXingShiYing.get(tianRui));
                    list.add("天禽星值" + hourZhi + "时：" + jiuXingShiYing.get(tianQin));
                    map.put(i, list);
                }
            } else {
                map.put(i, null); // 置空中五宫
            }
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

        String[] houTianBaGua = ZhuanQiMenMaps.HOU_TIAN_BA_GUA; // 八卦（后天八卦1~9宫）
        Map<String, Integer> siJiIndex = ZhuanQiMenMaps.SI_JI_INDEX; // 四季索引
        Map<String, List<String>> baGuaWangShuai = ZhuanQiMenMaps.BA_GUA_WANG_SHUAI_JI_JIE; // 八卦旺衰（根据季节计算）

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

        Map<String, Integer> siJiIndex = ZhuanQiMenMaps.SI_JI_INDEX; // 四季索引
        Map<String, List<String>> baMenWangShuai = ZhuanQiMenMaps.BA_MEN_WANG_SHUAI_JI_JIE; // 八门旺衰（根据季节计算）

        List<List<String>> list = new ArrayList<>(); // 保存八门旺衰
        for (int i = 0; i < 9; i++) {
            if (i != 4) {
                String men = renPan.get(i); // 每一宫位中的门
                List<String> gongWeiList = baMenWangShuai.get(men); // 每一宫位
                list.add(Arrays.asList(men, gongWeiList.get(siJiIndex.get(jiJie))));
            } else {
                list.add(null); // 置空中五宫
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

        Map<String, Integer> diZhiIndex = ZhuanQiMenMaps.DI_ZHI_INDEX; // 十二地支索引
        Map<String, List<String>> jiuXingWangShuai = ZhuanQiMenMaps.JIU_XING_WANG_SHUAI_MONTH_ZHI; // 九星旺衰（根据月支计算）

        List<List<String>> list = new ArrayList<>(); // 保存九星旺衰
        for (int i = 0; i < 9; i++) {
            if (i != 4) {
                String xing = tianPan.get(i); // 每一宫位中的星
                if (xing.equals("芮禽")) {
                    List<String> gongWeiList = jiuXingWangShuai.get("天芮"); // 每一宫位
                    String wangShuai = gongWeiList.get(diZhiIndex.get(monthZhi)); // 每一宫位的九星旺衰
                    list.add(Arrays.asList("芮禽", wangShuai + wangShuai));
                } else {
                    List<String> gongWeiList = jiuXingWangShuai.get(xing); // 每一宫位
                    String wangShuai = gongWeiList.get(diZhiIndex.get(monthZhi)); // 每一宫位的九星旺衰
                    list.add(Arrays.asList(xing, wangShuai));
                }
            } else {
                list.add(null); // 置空中五宫
            }
        }

        return list;

    }

    /**
     * 计算八神落宫状态
     *
     * @param shenPan 神盘
     * @return 八神落宫状态
     */
    public static List<List<String>> baShenLuoGongStatus(List<String> shenPan) {

        Map<String, String> baShenJiXiong = ZhuanQiMenMaps.BA_SHEN_JI_XIONG; // 八神吉凶

        List<List<String>> list = new ArrayList<>(); // 保存八神落宫状态
        for (int i = 0; i < 9; i++) {
            if (i != 4) {
                String shen = shenPan.get(i); // 每一宫位中的神
                String gongWeiList = baShenJiXiong.get(shen); // 每一宫位的八神落宫状态
                list.add(Arrays.asList(shen, gongWeiList));
            } else {
                list.add(null); // 置空中五宫
            }
        }

        // 2、返回数据
        return list;

    }

    /**
     * 计算八门落宫状态
     *
     * @param renPan 人盘
     * @return 八门落宫状态
     */
    public static List<List<String>> baMenLuoGongStatus(List<String> renPan) {

        Map<String, List<String>> baMenLuoGongStatus = ZhuanQiMenMaps.BA_MEN_LUO_GONG_STATUS; // 八门落宫状态

        List<List<String>> list = new ArrayList<>(); // 保存八门落宫状态
        for (int i = 0; i < 9; i++) {
            if (i != 4) {
                String men = renPan.get(i); // 每一宫位中的门
                List<String> gongWeiList = baMenLuoGongStatus.get(men); // 每一宫位
                String wangShuai = gongWeiList.get(i); // 每一宫位的八门落宫状态
                list.add(Arrays.asList(men, wangShuai));
            } else {
                list.add(null); // 置空中五宫
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

        Map<String, List<String>> jiuXingLuoGongStatus = ZhuanQiMenMaps.JIU_XING_LUO_GONG_STATUS; // 九星落宫状态

        List<List<String>> list = new ArrayList<>(); // 保存九星落宫状态
        for (int i = 0; i < 9; i++) {
            if (i != 4) {
                String xing = tianPan.get(i); // 每一宫位中的星
                if (xing.equals("芮禽")) {
                    List<String> gongWeiList = jiuXingLuoGongStatus.get("天芮"); // 每一宫位
                    String wangShuai = gongWeiList.get(i); // 每一宫位的九星落宫状态
                    list.add(Arrays.asList("芮禽", wangShuai + wangShuai));
                } else {
                    List<String> gongWeiList = jiuXingLuoGongStatus.get(xing); // 每一宫位
                    String wangShuai = gongWeiList.get(i); // 每一宫位的九星落宫状态
                    list.add(Arrays.asList(xing, wangShuai));
                }
            } else {
                list.add(null); // 置空中五宫
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

        Map<List<String>, String> qiYiLuoGongStatus = ZhuanQiMenMaps.QI_YI_LUO_GONG_STATUS; // 奇仪落宫状态
        Map<Integer, List<String>> jiuGongDiZhi = ZhuanQiMenMaps.JIU_GONG_DI_ZHI; // 九宫中的地支（1~9宫）

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

        return map;

    }

    /**
     * 计算天盘奇仪与落宫地支的关系（1~9宫）
     *
     * @param tianPanQiYiToTq 天盘旋转后九星所携带的奇仪，只包含[天禽星]携带的奇仪（后天八卦1~9宫）
     * @param tianPanQiYiExTq 天盘旋转后九星所携带的奇仪，不包含[天禽星]携带的奇仪（后天八卦1~9宫）
     * @return 天盘奇仪与落宫地支的关系（1~9宫）
     */
    public static Map<String, Map<Integer, List<List<String>>>> tianPanQiYiLuoGongLink(List<String> tianPanQiYiToTq, List<String> tianPanQiYiExTq) {

        // 1、计算天盘奇仪与落宫地支的关系
        Map<Integer, List<List<String>>> mapToTq = new HashMap<>(); // 保存天盘奇仪与落宫地支的关系（天禽星携带的奇仪）
        Map<Integer, List<List<String>>> mapExTq = new HashMap<>(); // 保存天盘奇仪与落宫地支的关系（非天禽星携带的奇仪）
        Map<List<String>, String> qiYiLuoGongStatus = ZhuanQiMenMaps.QI_YI_LUO_GONG_STATUS; // 奇仪落宫状态
        Map<Integer, List<String>> jiuGongDiZhi = ZhuanQiMenMaps.JIU_GONG_DI_ZHI; // 九宫中的地支（后天八卦1~9宫）
        for (int i = 0; i < 9; i++) {
            if (i != 4) {
                List<String> oneListToTq = new ArrayList<>();
                List<String> oneListExTq = new ArrayList<>();
                List<List<String>> oneList2ToTq = new ArrayList<>();
                List<List<String>> oneList2ExTq = new ArrayList<>();
                String TianPanQiYiToTq = tianPanQiYiToTq.get(i); // 每一宫位天盘奇仪（天禽星携带的奇仪）
                String TianPanQiYiExTq = tianPanQiYiExTq.get(i); // 每一宫位天盘奇仪（非天禽星携带的奇仪）
                List<String> diZhiList = jiuGongDiZhi.get(i); // 每一宫位中包含的地支
                String statusToTq = null;
                for (String key : diZhiList) {
                    List<String> qiYiDiZhiToTq = Arrays.asList(TianPanQiYiToTq, key); // 每一宫位中的天盘奇仪+地支（天禽星携带的奇仪）
                    List<String> qiYiDiZhiExTq = Arrays.asList(TianPanQiYiExTq, key); // 每一宫位中的天盘奇仪+地支（非天禽星携带的奇仪）
                    statusToTq = qiYiLuoGongStatus.get(qiYiDiZhiToTq);
                    String statusExTq = qiYiLuoGongStatus.get(qiYiDiZhiExTq);
                    oneListToTq.add(key);
                    oneListToTq.add(statusToTq);
                    oneList2ToTq.add(oneListToTq);
                    oneListExTq.add(key);
                    oneListExTq.add(statusExTq);
                    oneList2ExTq.add(oneListExTq);
                    oneListToTq = new ArrayList<>();
                    oneListExTq = new ArrayList<>();
                }
                if (null == statusToTq) {
                    mapToTq.put(i, null);
                } else {
                    mapToTq.put(i, oneList2ToTq);
                }
                mapExTq.put(i, oneList2ExTq);
            } else {
                mapToTq.put(i, null); // 置空中五宫
                mapExTq.put(i, null); // 置空中五宫
            }
        }

        // 2、设置天盘奇仪与落宫地支的关系
        Map<String, Map<Integer, List<List<String>>>> newMap = new HashMap<>();
        newMap.put("mapToTq", mapToTq); // 天盘奇仪与落宫地支的关系（天禽星携带的奇仪）
        newMap.put("mapExTq", mapExTq); // 天盘奇仪与落宫地支的关系（非天禽星携带的奇仪）

        // 3、返回数据
        return newMap;

    }


}
