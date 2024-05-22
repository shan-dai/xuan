package com.xuan.core.qimen.zhuan;

import com.nlf.calendar.EightChar;
import com.nlf.calendar.Lunar;
import com.nlf.calendar.Solar;
import com.xuan.utils.CommonUtil;
import lombok.Getter;

import java.util.*;

/**
 * 转盘奇门
 *
 * @author 善待
 */
@Getter
public class ZhuanQiMen {

    /* 使用后天八卦及宫位 */

    /**
     * 公历日期
     */
    private Solar solar;
    /**
     * 农历日期
     */
    private Lunar lunar;
    /**
     * 星期
     */
    private String week;

    /**
     * 年干
     */
    private String yearGan;
    /**
     * 月干
     */
    private String monthGan;
    /**
     * 日干
     */
    private String dayGan;
    /**
     * 时干
     */
    private String hourGan;

    /**
     * 年支
     */
    private String yearZhi;
    /**
     * 月支
     */
    private String monthZhi;
    /**
     * 日支
     */
    private String dayZhi;
    /**
     * 时支
     */
    private String hourZhi;

    /**
     * 年干支
     */
    private String yearGanZhi;
    /**
     * 月干支
     */
    private String monthGanZhi;
    /**
     * 日干支
     */
    private String dayGanZhi;
    /**
     * 时干支
     */
    private String hourGanZhi;

    /**
     * 八字
     */
    private List<String> baZi;
    /**
     * 八字五行
     */
    private List<String> baZiWuXing;
    /**
     * 八字旬空
     */
    private List<String> baZiXunKong;
    /**
     * 八字纳音
     */
    private List<String> baZiNaYin;

    /**
     * 季节
     */
    private String jiJie;
    /**
     * 符头
     */
    private String fuTou;
    /**
     * 节气
     */
    private String jieQi;
    /**
     * 三元
     */
    private String sanYuan;
    /**
     * 阴阳遁
     */
    private String yinYangDun;
    /**
     * 局数
     */
    private int juShu;
    /**
     * 旬首
     */
    private String xunShou;
    /**
     * 旬首仪仗
     */
    private String xunShouYiZhang;
    /**
     * 旬首落宫
     */
    private int xunShouGong;
    /**
     * 地盘中的奇仪（1~9宫）
     */
    private List<String> diQiYi;
    /**
     * 地盘中的六甲（1~9宫）
     */
    private List<String> diLiuJia;
    /**
     * 值符
     */
    private String zhiFu;
    /**
     * 值使
     */
    private String zhiShi;

    /**
     * 六甲旬空
     */
    private List<String> liuJiaXunKong;
    /**
     * 六甲旬空落宫
     */
    private List<Integer> liuJiaXunKongGong;
    /**
     * 六甲旬空落宫标识（1~9宫）
     */
    private List<String> liuJiaXunKongGongMark;

    /**
     * 驿马
     */
    private String yiMa;
    /**
     * 驿马落宫
     */
    private int yiMaGong;
    /**
     * 驿马落宫标识（1~9宫）
     */
    private List<String> yiMaGongMark;

    /**
     * 天乙
     */
    private String tianYi;
    /**
     * 地乙
     */
    private String diYi;
    /**
     * 太乙
     */
    private String taiYi;
    /**
     * 伏吟
     */
    private List<String> fuYin;
    /**
     * 反吟
     */
    private List<String> fanYin;
    /**
     * 六仪击刑
     */
    private List<String> liuYiJiXing;
    /**
     * 奇仪入墓
     */
    private List<String> qiYiRuMu;
    /**
     * 九遁（1~9宫）
     */
    private Map<Integer, List<String>> jiuDun;
    /**
     * 月将
     */
    private String yueJiang;
    /**
     * 月将神
     */
    private String yueJiangShen;

    /**
     * 值符旋转前宫位
     */
    private int oldZhiFuGong;
    /**
     * 值符旋转后宫位
     */
    private int newZhiFuGong;
    /**
     * 值使旋转前宫位
     */
    private int oldZhiShiGong;
    /**
     * 值使旋转后宫位
     */
    private int newZhiShiGong;

    /**
     * 地盘（1~9宫）
     */
    private List<String> diPan;
    /**
     * 地盘，附带六甲（1~9宫）
     */
    private List<String> diPanPron;
    /**
     * 天盘（1~9宫）
     */
    private List<String> tianPan;
    /**
     * 天盘旋转后九星所携带的奇仪，只包含[天禽星]携带的奇仪（1~9宫）
     */
    private List<String> tianPanQiYiToTq;
    /**
     * 天盘旋转后九星所携带的奇仪，不包含[天禽星]携带的奇仪（1~9宫）
     */
    private List<String> tianPanQiYiExTq;
    /**
     * 人盘（1~9宫）
     */
    private List<String> renPan;
    /**
     * 神盘（1~9宫）
     */
    private List<String> shenPan;

    /**
     * 十干克应（1~9宫）
     */
    private Map<Integer, List<String>> shiGanKeYing;
    /**
     * 八门克应（1~9宫）
     */
    private Map<Integer, List<String>> baMenKeYing;
    /**
     * 八门静应（1~9宫）
     */
    private Map<Integer, List<String>> baMenJingYing;
    /**
     * 八门动应（1~9宫）
     */
    private Map<Integer, List<String>> baMenDongYing;
    /**
     * 星门克应（1~9宫）
     */
    private Map<Integer, List<String>> xingMenKeYing;
    /**
     * 九星时应（1~9宫）
     */
    private Map<Integer, List<String>> jiuXingShiYing;

    /**
     * 八卦旺衰（1~9宫）
     */
    private List<List<String>> baGuaWangShuai;
    /**
     * 八门旺衰（1~9宫）
     */
    private List<List<String>> baMenWangShuai;
    /**
     * 九星旺衰（1~9宫）
     */
    private List<List<String>> jiuXingWangShuai;

    /**
     * 八神落宫状态（1~9宫）
     */
    private List<List<String>> baShenLuoGongStatus;
    /**
     * 八门落宫状态（1~9宫）
     */
    private List<List<String>> baMenLuoGongStatus;
    /**
     * 九星落宫状态（1~9宫）
     */
    private List<List<String>> jiuXingLuoGongStatus;

    /**
     * 地盘奇仪与落宫地支的关系（1~9宫）
     */
    private Map<Integer, List<List<String>>> diPanQiYiLuoGongLink;
    /**
     * 天盘奇仪与落宫地支的关系，只包含[天禽星]携带的奇仪1~9宫）
     */
    private Map<Integer, List<List<String>>> tianPanQiYiLuoGongToTqLink;
    /**
     * 天盘奇仪与落宫地支的关系，不包含[天禽星]携带的奇仪（1~9宫）
     */
    private Map<Integer, List<List<String>>> tianPanQiYiLuoGongExTqLink;

//************************************************************************************************************************************

    /**
     * 使用默认设置初始化（默认使用当前公历日期）
     */
    public ZhuanQiMen() {
        core(new ZhuanQiMenSetting());
    }

    /**
     * 使用公历日期初始化
     *
     * @param date 公历日期
     */
    public ZhuanQiMen(Date date) {
        core(new ZhuanQiMenSetting(date));
    }

    /**
     * 使用日期初始化
     *
     * @param date     公历日期
     * @param dateType 日期类型（0:公历。1:农历）
     */
    public ZhuanQiMen(Date date, int dateType) {
        core(new ZhuanQiMenSetting(date, dateType));
    }

    /**
     * 使用公历年月日时初始化
     *
     * @param year  公历年（0~9999）
     * @param month 公历月（1~12）
     * @param day   公历日
     * @param hour  公历时（0~24）
     */
    public ZhuanQiMen(int year, int month, int day, int hour) {
        core(new ZhuanQiMenSetting(year, month, day, hour));
    }

    /**
     * 使用年月日时初始化
     *
     * @param year     年（0~9999）
     * @param month    月（1~12）
     * @param day      日
     * @param hour     时（0~24）
     * @param dateType 日期类型（0:公历。1:农历）
     */
    public ZhuanQiMen(int year, int month, int day, int hour, int dateType) {
        core(new ZhuanQiMenSetting(year, month, day, hour, dateType));
    }

    /**
     * 使用自定义设置初始化
     *
     * @param setting 转盘奇门-设置
     */
    public ZhuanQiMen(ZhuanQiMenSetting setting) {
        core(setting);
    }

//====================================================================================================================================

    /**
     * 获取并设置数据（★核心）
     *
     * @param setting 转盘奇门-设置
     */
    private void core(ZhuanQiMenSetting setting) {

        // 初始化自定义数据
        initialize(setting);

        // 计算数据
        baZi(); // 计算八字
        baZiWuXing(); // 计算八字五行
        baZiNaYin(); // 计算八字纳音
        baZiXunKong(); // 计算八字旬空
        jiJie(); // 计算季节
        fuTouAndJieQi(setting); // 计算符头、节气
        sanYuanAndJuShu(setting); // 计算三元、局数
        yinYangDun(setting); // 计算阴阳遁
        xunShou(); // 计算旬首
        diQiYiLiuJia(); // 计算地盘奇仪、六甲
        fuShi(setting); // 计算值符、值使
        liuJiaXunKong(); // 计算六甲旬空、落宫、标识
        yiMa(); // 计算驿马、落宫、标识
        diPan(); // 计算地盘
        tianPan(); // 计算天盘
        renPan(); // 计算人盘
        shenPan(); // 计算神盘
        tianDiTai(); // 计算天乙、地乙、太乙
        fuYin(); // 计算伏吟
        fanYin(); // 计算反吟
        liuYiJiXing(); // 计算六仪击刑
        qiYiRuMu(); // 计算奇仪入墓
        jiuDun(); // 计算九遁
        yueJiang(); // 计算月将、月将神
        shiGanKeYing(); // 计算十干克应
        baMenKeYing(); // 计算八门克应
        baMenJingYing(); // 计算八门静应
        baMenDongYing(); // 计算八门动应
        xingMenKeYing(); // 计算星门克应
        jiuXingShiYing(); // 计算九星时应
        baGuaWangShuai(); // 计算八卦旺衰（根据季节计算）
        baMenWangShuai(); // 计算八门旺衰（根据季节计算）
        jiuXingWangShuai(); // 计算九星旺衰（根据月支计算）
        baShenLuoGongStatus(); // 计算八神落宫状态
        baMenLuoGongStatus(); // 计算八门落宫状态
        jiuXingLuoGongStatus(); // 计算九星落宫状态
        diPanQiYiLuoGongLink(); // 计算地盘奇仪与落宫地支的关系
        tianPanQiYiLuoGongLink(); // 计算天盘奇仪与落宫地支的关系

    }

    /**
     * 初始化自定义数据
     *
     * @param setting 转盘奇门-设置
     */
    private void initialize(ZhuanQiMenSetting setting) {

        // 1.1、判断日期类型并返回公历日期、农历日期
        Map<String, Object> dateMap = ZhuanQiMenUtil.isDateType(setting);
        // 1.2、设置日期
        this.solar = (Solar) dateMap.get("solar"); // 设置公历日期
        this.lunar = (Lunar) dateMap.get("lunar"); // 设置农历日期

        // 2、设置星期
        this.week = "周" + getLunar().getWeekInChinese();

        // 3.1、判断干支设置并返回干支
        Map<String, List<String>> ganZhiMap = ZhuanQiMenUtil.isGanZhi(setting, getSolar().getLunar());
        // 3.2、设置年干支
        List<String> yearGanZhi = ganZhiMap.get("yearGanZhi");
        this.yearGan = yearGanZhi.get(0); // 年干
        this.yearZhi = yearGanZhi.get(1); // 年支
        this.yearGanZhi = yearGanZhi.get(2); // 年干支
        // 3.3、设置月干支
        List<String> monthGanZhi = ganZhiMap.get("monthGanZhi");
        this.monthGan = monthGanZhi.get(0); // 月干
        this.monthZhi = monthGanZhi.get(1); // 月支
        this.monthGanZhi = monthGanZhi.get(2); // 月干支
        // 3.4、设置日干支
        List<String> dayGanZhi = ganZhiMap.get("dayGanZhi");
        this.dayGan = dayGanZhi.get(0); // 日干
        this.dayZhi = dayGanZhi.get(1); // 日支
        this.dayGanZhi = dayGanZhi.get(2); // 日干支
        // 3.5、设置时干支
        List<String> hourGanZhi = ganZhiMap.get("hourGanZhi");
        this.hourGan = hourGanZhi.get(0); // 时干
        this.hourZhi = hourGanZhi.get(1); // 时支
        this.hourGanZhi = hourGanZhi.get(2); // 时干支

    }

    /**
     * 计算八字
     */
    private void baZi() {

        this.baZi = Arrays.asList(getYearGanZhi(), getMonthGanZhi(), getDayGanZhi(), getHourGanZhi());

    }

    /**
     * 计算八字五行
     */
    private void baZiWuXing() {

        EightChar ec = getLunar().getEightChar();
        this.baZiWuXing = Arrays.asList(ec.getYearWuXing(), ec.getMonthWuXing(), ec.getDayWuXing(), ec.getTimeWuXing());

    }

    /**
     * 计算八字纳音
     */
    private void baZiNaYin() {

        EightChar ec = getLunar().getEightChar();
        this.baZiNaYin = Arrays.asList(ec.getYearNaYin(), ec.getMonthNaYin(), ec.getDayNaYin(), ec.getTimeNaYin());

    }

    /**
     * 计算八字旬空
     */
    private void baZiXunKong() {

        EightChar ec = getLunar().getEightChar();
        this.baZiXunKong = Arrays.asList(ec.getYearXunKong(), ec.getMonthXunKong(), ec.getDayXunKong(), ec.getTimeXunKong());

    }

    /**
     * 计算季节
     */
    private void jiJie() {

        // 根据月支获取季节
        this.jiJie = ZhuanQiMenMaps.DI_ZHI_JI_JIE.get(getMonthZhi());

    }

    /**
     * 计算符头、节气
     *
     * @param setting 转盘奇门-设置
     */
    private void fuTouAndJieQi(ZhuanQiMenSetting setting) {

        // 1、年家奇门、月家奇门
        if (setting.getQiMenType() == 0 || setting.getQiMenType() == 1) {
            Map<String, String> riZhuFuTou = ZhuanQiMenMaps.RI_ZHU_FU_TOU; // 日柱对应的符头
            this.fuTou = riZhuFuTou.get(getDayGanZhi()); // 符头
            this.jieQi = getLunar().getPrevJieQi(setting.getJieQi() == 0).getName(); // 获取上一个节气
            return;
        }

        // 2、日家奇门、时家奇门
        if (setting.getQiMenType() == 2 || setting.getQiMenType() == 3) {
            /*
                情况一：当天日干支是符头、当天是节气，则保存符头和节气。
                情况二：当天日干支是符头、但当天不是节气，需保存符头并向前查找节气。
                情况三：当天日干支不是符头、当天是节气，需保存节气并向前查找符头。
                情况四：当天日干支不是符头、当天不是节气，需要向前查找符头和节气。
                   1、情况四之一：既碰到符头又碰到节气，则保存符头和节气；
                   2、情况四之二：若先碰到符头但未碰到节气，需保存符头并向前查找节气；
                   3、情况四之三：若先碰到节气但未碰到符头，需保存节气并向前查找符头；
            */
            String dayGanZhi = getDayGanZhi(); // 日干支
            String[] sanYuanFuTou = ZhuanQiMenMaps.SAN_YUAN_FU_TOU; // 三元符头

            for (int i = 0; i < sanYuanFuTou.length; i++) {
                // 情况一：当天日干支是符头、当天是节气，则保存符头和节气（▲例：农历二〇二二年八月廿八）
                if (dayGanZhi.equals(sanYuanFuTou[i]) && !"".equals(getLunar().getJieQi())) {
                    this.fuTou = dayGanZhi; // 符头
                    this.jieQi = getLunar().getJieQi(); // 节气
                    return;
                }
                // 情况二：当天日干支是符头、但当天不是节气，需保存符头并向前查找节气（▲例：农历二〇二二年八月十八）
                if (dayGanZhi.equals(sanYuanFuTou[i]) && "".equals(getLunar().getJieQi())) {
                    this.fuTou = dayGanZhi; // 符头
                    this.jieQi = getLunar().getPrevJieQi(setting.getJieQi() == 0).getName(); // 获取上一个节气
                    return;
                }
                // 情况三：当天日干支不是符头、当天是节气，需保存节气并向前查找符头（▲例：农历二〇二二年八月十二）
                if (!dayGanZhi.equals(sanYuanFuTou[i]) && !"".equals(getLunar().getJieQi())) {
                    String jieQi = getLunar().getJieQi(); // 当天节气
                    // 获取向前第i天的日干支
                    dayGanZhi = (setting.getDayGanZhiSet() == 1) ? getLunar().next(-i).getDayInGanZhiExact() : getLunar().next(-i).getDayInGanZhiExact2();
                    // 若向前第i天的日柱为符头则记录符头
                    for (String key : sanYuanFuTou) {
                        if (dayGanZhi.equals(key)) {
                            this.fuTou = dayGanZhi; // 符头
                            this.jieQi = jieQi; // 节气
                            return;
                        }
                    }
                }
                // 情况四：当天日干支不是符头、当天不是节气，需要按天向前查找符头和节气
                if (!dayGanZhi.equals(sanYuanFuTou[i]) && "".equals(getLunar().getJieQi())) {
                    // 获取向前第i天的日干支
                    dayGanZhi = (setting.getDayGanZhiSet() == 1) ? getLunar().next(-i).getDayInGanZhiExact() : getLunar().next(-i).getDayInGanZhiExact2();
                    String jieQi = getLunar().next(-i).getJieQi(); // 获取向前第i天的节气
                    // 情况四之一：既碰到符头又碰到节气，则保存符头和节气（▲例：农历二〇二二年八月廿九）
                    for (String key : sanYuanFuTou) {
                        if (dayGanZhi.equals(key) && !"".equals(jieQi)) {
                            this.fuTou = dayGanZhi; // 符头
                            this.jieQi = jieQi; // 节气
                            return;
                        }
                    }
                    // 情况四之二：若先碰到符头但未碰到节气，需保存符头并向前查找节气（▲例：农历二〇二二年八月十四）
                    for (String key : sanYuanFuTou) {
                        if (dayGanZhi.equals(key) && "".equals(jieQi)) {
                            this.fuTou = dayGanZhi; // 符头
                            this.jieQi = getLunar().getPrevJieQi(setting.getJieQi() == 0).getName(); // 节气
                            return;
                        }
                    }
                    // 情况四之三：若先碰到节气但未碰到符头，需保存节气并向前查找符头（▲例：农历二〇二〇年八月廿八）
                    for (int j = 0; j < sanYuanFuTou.length; j++) {
                        if (!"".equals(jieQi) && !dayGanZhi.equals(sanYuanFuTou[i])) {
                            // 获取向前第i天的日干支
                            dayGanZhi = (setting.getDayGanZhiSet() == 1) ? getLunar().next(-i).getDayInGanZhiExact() : getLunar().next(-i).getDayInGanZhiExact2();
                            // 若向前第i天的日柱为符头则记录符头
                            for (String key : sanYuanFuTou) {
                                if (dayGanZhi.equals(key)) {
                                    this.fuTou = dayGanZhi; // 符头
                                    this.jieQi = jieQi; // 节气
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    /**
     * 计算三元、局数
     *
     * @param setting 转盘奇门-设置
     */
    private void sanYuanAndJuShu(ZhuanQiMenSetting setting) {

        /*
            一、年家奇门主要用于国运的判断，较为宏观和长久。如国家大事、政治、经济的整体情况，东南西北各方的发展状况及自然灾害等。

            二、年家奇门以60年为一元，分为上元、中元、下元。（注：只使用阴遁）
                1、上元用阴遁一局；
                2、中元用阴遁四局；
                3、下元用阴遁七局；（例如→ 公历1984~2043年，使用下元，即：阴遁七局）
        */

        // 1、年家奇门
        if (setting.getQiMenType() == 0) {
            // 1.1、公历0~9999年两个日期范围内的三元、局数
            Map<Integer, List<Object>> sanYuanDateRange = ZhuanQiMenMaps.SAN_YUAN_DATE_RANGE;
            // 1.2、遍历数据并计算局数（即：[甲子戊]所落入的宫位）
            for (int i = 0; i < sanYuanDateRange.size(); i++) {
                List<Object> list = sanYuanDateRange.get(i);
                int startDate = Integer.parseInt(list.get(0).toString()); // 开始日期
                int endDate = Integer.parseInt(list.get(1).toString()); // 结束日期
                if (getSolar().getYear() >= startDate && getSolar().getYear() <= endDate) {
                    this.sanYuan = list.get(2).toString(); // 三元
                    this.juShu = Integer.parseInt(list.get(3).toString()); // 局数
                    break;
                }
            }
            return;
        }

        /*
            一、月家奇门主要用来预测一个月内所发生的事，如考试、外出做官、经商出行以及玄空风水等方面。

            二、月家奇门以5年为一元，一元又分为上元、中元、下元。（注：只使用阴遁）
                1、年支或年干符头的地支为[寅、申、巳、亥]时，使用上元，即：阴遁一局；
                2、年支或年干符头的地支为[子、午、卯、酉]时，使用中元，即：阴遁七局；
                3、年支或年干符头的地支为[辰、戌、丑、未]时，使用下元，即：阴遁四局；
        */

        // 2、月家奇门
        if (setting.getQiMenType() == 1) {
            Map<String, List<String>> xunShou = ZhuanQiMenMaps.SIX_JIA_ZI_XUN_SHOU; // 六十甲子对应的旬首
            // 2.1、判断起局方式（0:使用年支起局。1:使用年干支的符头地支起局）
            String diZhi; // 地支
            if (setting.getQiJuMode() == 0) {
                // 使用年支起局
                diZhi = getYearZhi(); // 年支
            } else {
                // 使用年干支的符头地支起局
                diZhi = xunShou.get(getYearGanZhi()).get(0).substring(1, 2); // 年干支的符头地支
            }
            // 2.2、年支或年干符头的地支为[寅、申、巳、亥]时，使用上元，即：阴遁一局
            if ("寅".equals(diZhi) || "申".equals(diZhi) || "巳".equals(diZhi) || "亥".equals(diZhi)) {
                this.sanYuan = "上元"; // 三元
                this.juShu = 1; // 局数
            }
            // 2.3、年支或年干符头的地支为[子、午、卯、酉]时，使用中元，即：阴遁七局
            if ("子".equals(diZhi) || "午".equals(diZhi) || "卯".equals(diZhi) || "酉".equals(diZhi)) {
                this.sanYuan = "中元"; // 三元
                this.juShu = 7; // 局数
            }
            // 2.4、年支或年干符头的地支为[辰、戌、丑、未]时，使用下元，即：阴遁四局
            if ("辰".equals(diZhi) || "戌".equals(diZhi) || "丑".equals(diZhi) || "未".equals(diZhi)) {
                this.sanYuan = "下元"; // 三元
                this.juShu = 4; // 局数
            }
            return;
        }

        /*
            一、日家奇门可以预测一天内所发生的事情，如日常生活中的各种事件，从小事到大事等。

            二、[冬至~夏至前]用阳遁：
                    1、前60天用阳遁一局；
                    2、中间60天用阳遁七局；
                    3、后60天用阳遁四局；

            三、[夏至~冬至前]用阴遁：
                    1、前60天用阴遁九局；
                    2、中间60天用阴遁三局；
                    3、后60天用阴遁六局；

            四、日家奇门流派：
                    1、奇门法窍（←采用）
                    2、金函玉镜
         */

        // 3、日家奇门
        if (setting.getQiMenType() == 2) {
            // 3.1、计算三元
            Map<String, String> riZhuFuTouMap = ZhuanQiMenMaps.RI_ZHU_SAN_YUAN; // 日柱对应的三元
            this.sanYuan = riZhuFuTouMap.get(getDayGanZhi()); // 三元
            // 3.2、计算局数，获取日期是当年中的第几天
            Calendar c = Calendar.getInstance();
            c.set(getSolar().getYear(), getSolar().getMonth() - 1, getSolar().getDay());
            int day = c.get(Calendar.DAY_OF_YEAR);
            if (day <= 60) this.juShu = 1; // 1~60天用阳遁一局
            if (day > 60 && day <= 120) this.juShu = 7; // 61~120天用阳遁七局
            if (day > 120 && day <= 180) this.juShu = 4; // 121~180天用阳遁四局
            if (day > 180 && day <= 240) this.juShu = 9; // 181~240天用阴遁九局
            if (day > 240 && day <= 300) this.juShu = 3; // 241~300天用阴遁三局
            if (day > 300) this.juShu = 6; // 大于300天用阴遁六局
            return;
        }

        /*
            一、时家奇门可以预测每个时辰所发生的事，应用最为广泛。如：婚姻、疾病、工作、求学考试、经营求财、官司诉讼等。
        */

        // 4、时家奇门
        if (setting.getQiMenType() == 3) {
            // 4.1、计算三元
            Map<String, String> riZhuFuTouMap = ZhuanQiMenMaps.RI_ZHU_SAN_YUAN; // 日柱对应的三元
            this.sanYuan = riZhuFuTouMap.get(getDayGanZhi());
            // 4.2、计算局数
            Map<String, List<Integer>> juShuMap = ZhuanQiMenMaps.JU_SHU; // 二十四节气对应局数
            List<Integer> juShu = juShuMap.get(getJieQi()); // 根据节气获取[上元、中元、下元]对应的局数
            // 4.3、根据三元判断所用局数
            if ("上元".equals(getSanYuan())) this.juShu = juShu.get(0);
            if ("中元".equals(getSanYuan())) this.juShu = juShu.get(1);
            if ("下元".equals(getSanYuan())) this.juShu = juShu.get(2);
        }

    }

    /**
     * 计算阴阳遁
     *
     * @param setting 转盘奇门-设置
     */
    private void yinYangDun(ZhuanQiMenSetting setting) {

        // 1、年家奇门、月家奇门
        if (setting.getQiMenType() == 0 || setting.getQiMenType() == 1) {
            this.yinYangDun = "阴遁";
            return;
        }

        // 2、日家奇门
        if (setting.getQiMenType() == 2) {
            Map<String, List<String>> map = ZhuanQiMenMaps.YIN_YANG_DUN_JIE_QI; // 阴阳遁对应的二十四节气
            // 若节气在[冬至~夏至前]，则使用阳遁
            List<String> yangJie = map.get("阳遁"); // 阳遁节气
            for (String key : yangJie) {
                if (key.equals(getJieQi())) {
                    this.yinYangDun = "阳遁";
                    break;
                }
            }
            return;
        }

        // 3、时家奇门
        if (setting.getQiMenType() == 3) {
            Map<String, String> map = ZhuanQiMenMaps.JIE_QI_YIN_YANG_DUN; // 二十四节气对应阴阳遁
            this.yinYangDun = map.get(getJieQi());
        }

    }

    /**
     * 计算旬首
     */
    private void xunShou() {

        // 1、六十甲子对应的旬首
        Map<String, List<String>> sixJiaZiXunShou = ZhuanQiMenMaps.SIX_JIA_ZI_XUN_SHOU;

        // 2、根据时干支获取旬首
        String xunShou = sixJiaZiXunShou.get(getHourGanZhi()).get(0); // 旬首（如：甲子）
        String xunShouYiZhang = sixJiaZiXunShou.get(getHourGanZhi()).get(1); // 旬首仪仗（如：戊）

        // 3、设置旬首、旬首仪仗
        this.xunShou = xunShou; // 旬首
        this.xunShouYiZhang = xunShouYiZhang; // 旬首仪仗

    }

    /**
     * 计算地盘奇仪、六甲
     */
    private void diQiYiLiuJia() {

        // 1.1、阳遁
        if ("阳遁".equals(getYinYangDun())) {
            this.diQiYi = ZhuanQiMenMaps.DI_YANG_QI_YI.get(getJuShu()); // 奇仪
            this.diLiuJia = ZhuanQiMenMaps.DI_YANG_LIU_JIA.get(getJuShu()); // 六甲
        } else {
            // 1.2、阴遁
            this.diQiYi = ZhuanQiMenMaps.DI_YIN_QI_YI.get(getJuShu()); // 奇仪
            this.diLiuJia = ZhuanQiMenMaps.DI_YIN_LIU_JIA.get(getJuShu()); // 六甲
        }

    }

    /**
     * 计算值符、值使
     *
     * @param setting 转盘奇门-设置
     */
    private void fuShi(ZhuanQiMenSetting setting) {

        // 1、根据旬首和六甲获取旬首落宫
        for (int i = 0; i < getDiLiuJia().size(); i++) {
            if (getXunShou().equals(getDiLiuJia().get(i))) {
                this.xunShouGong = i + 1; // 旬首落宫（即：值符和值符落宫）
                this.oldZhiFuGong = i + 1; // 值符旋转前落宫
                this.oldZhiShiGong = i + 1; // 值使旋转前落宫
                break;
            }
        }

        // 2、根据旬首落宫获取[值符]和[值使]
        // 2.1、设置值符
        this.zhiFu = ZhuanQiMenMaps.JIU_XING_INITIAL[getXunShouGong() - 1];
        // 2.2、设置值使
        if ("天禽".equals(ZhuanQiMenMaps.JIU_XING_INITIAL[getXunShouGong() - 1]) || getXunShouGong() == 5) {
            String zhiShi;
            if (setting.getZhiShi() == 1) {
                zhiShi = zhiShi2(getYinYangDun()); // 计算并返回值使（天禽星为值符时：根据阴阳遁判断）
            } else if (setting.getZhiShi() == 2) {
                zhiShi = zhiShi3(getJieQi()); // 计算并返回值使（天禽星为值符时：根据节气判断）
            } else {
                zhiShi = zhiShi(); // 计算并返回值使（天禽星为值符时：一律用[死门]为值使）
            }
            this.zhiShi = zhiShi;
        } else {
            this.zhiShi = ZhuanQiMenMaps.BA_MEN_INITIAL[getXunShouGong() - 1];
        }

    }

    /**
     * 计算六甲旬空、落宫、标识
     */
    private void liuJiaXunKong() {

        // 1、设置六甲旬空
        this.liuJiaXunKong = ZhuanQiMenMaps.LIU_JIA_XUN_KONG.get(getXunShou());

        // 2、设置六甲旬空落宫
        this.liuJiaXunKongGong = ZhuanQiMenMaps.LIU_JIA_XUN_KONG_GONG.get(getLiuJiaXunKong());

        // 3、设置六甲旬空落宫标识
        List<String> list = CommonUtil.addCharToList(9);
        for (int i = 0; i < getLiuJiaXunKongGong().size(); i++) {
            list.set(getLiuJiaXunKongGong().get(i) - 1, "○"); // ○
        }
        this.liuJiaXunKongGongMark = list;

    }

    /**
     * 计算驿马、落宫、标识
     */
    private void yiMa() {

        String hourZhi = getHourZhi(); // 时支

        // 1、设置驿马
        this.yiMa = ZhuanQiMenMaps.YI_MA.get(hourZhi);

        // 2、设置驿马落宫
        this.yiMaGong = ZhuanQiMenMaps.YI_MA_GONG.get(getYiMa());

        // 3、设置驿马落宫标识
        List<String> list = CommonUtil.addCharToList(9);
        list.set(getYiMaGong() - 1, "马"); // 马
        this.yiMaGongMark = list;

    }

    /**
     * 计算地盘
     */
    private void diPan() {

        List<String> qiYi = getDiQiYi(); // 奇仪
        List<String> liuJia = getDiLiuJia(); // 六甲

        // 合并（奇仪+六甲）
        List<String> diPanPron = new ArrayList<>();
        for (int i = 0; i < qiYi.size(); i++) {
            for (int j = 0; j < liuJia.size(); j++) {
                if ("".equals(liuJia.get(j))) {
                    diPanPron.add(j, qiYi.get(i));
                } else {
                    diPanPron.add(j, qiYi.get(i) + "(" + liuJia.get(j) + ")");
                }
                i++;
            }
        }

        this.diPan = getDiQiYi(); // 不附带六甲（即：奇仪）
        this.diPanPron = diPanPron; // 附带六甲（即：奇仪+六甲）

    }

    /**
     * 计算天盘
     */
    private void tianPan() {

        // 1、若时干为甲，则使用旬首仪仗进行判断
        String hourGan = "甲".equals(getHourGan()) ? getXunShouYiZhang() : getHourGan();

        // 2、计算时干落宫
        List<String> diSanQiLiuYi = getDiQiYi(); // 地盘中的奇仪（1~9宫）
        for (int i = 0; i < diSanQiLiuYi.size(); i++) {
            if (hourGan.equals(diSanQiLiuYi.get(i))) {
                // 2.1、设置值符旋转后落入的宫位，若落中五宫则寄坤二宫
                this.newZhiFuGong = (i + 1 == 5) ? 2 : i + 1;
                break;
            }
        }

        // 3、将九星依次加入宫位中
        Map<Integer, List<String>> jiuXingShun = ZhuanQiMenMaps.JIU_XING_SHUN; // 九星位置（顺转九宫）
        for (int i = 0; i < jiuXingShun.size(); i++) {
            List<String> jiuXing = jiuXingShun.get(i);
            // 3.1、若值符为'天禽'，则使用'天芮'进行判断
            String zhiFu = getZhiFu();
            if ("天禽".equals(zhiFu)) zhiFu = "天芮";
            // 3.2、将'天芮'更换为：芮禽
            if (zhiFu.equals(jiuXing.get(getNewZhiFuGong() - 1))) {
                List<String> tianPan = new ArrayList<>(jiuXing);
                for (int j = 0; j < jiuXing.size(); j++) {
                    if ("天芮".equals(jiuXing.get(j))) {
                        tianPan.set(j, "芮禽");
                        break;
                    }
                }
                this.tianPan = tianPan;
                break;
            }
        }

        // 4、计算原宫九星所携带的奇仪（只包含'天禽星'所携带的奇仪）
        List<String> tianPanQiYiToTq = CommonUtil.addCharToList(9); // 存放原宫九星所携带的奇仪（只包含'天禽星'所携带的奇仪）
        for (int i = 0; i < getTianPan().size(); i++) {
            if (!"".equals(getTianPan().get(i))) {
                if ("天禽".substring(1, 2).equals(getTianPan().get(i).substring(1, 2))) {
                    tianPanQiYiToTq.set(i, getDiQiYi().get(4));
                }
            }
        }
        this.tianPanQiYiToTq = tianPanQiYiToTq;

        // 5、计算原宫九星所携带的奇仪（不包含'天禽星'所携带的奇仪）
        Map<String, Integer> jiuXingInitial = ZhuanQiMenMaps.JIU_XING_INITIAL2; // 九星原始宫位（1~9宫）
        List<String> tianPanQiYiExTq = new ArrayList<>(); // 存放原宫九星所携带的奇仪（不包含'天禽星'所携带的奇仪）
        int index;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < getDiQiYi().size(); j++) {
                if (i == 4) {
                    tianPanQiYiExTq.add(i, getDiQiYi().get(i)); // 九星原始宫位所携带的奇仪
                } else {
                    if ("芮禽".substring(0, 1).equals(getTianPan().get(i).substring(0, 1))) {
                        index = jiuXingInitial.get("天芮") - 1; // 九星原始宫位
                    } else if ("天禽".substring(1, 2).equals(getTianPan().get(i).substring(1, 2))) {
                        index = jiuXingInitial.get("天禽") - 1; // 九星原始宫位
                    } else {
                        index = jiuXingInitial.get(getTianPan().get(i)) - 1; // 九星原始宫位
                    }
                    tianPanQiYiExTq.add(i, getDiQiYi().get(index)); // 九星原始宫位所携带的奇仪
                }
                i++;
            }
        }
        this.tianPanQiYiExTq = tianPanQiYiExTq;

    }

    /**
     * 计算人盘
     */
    private void renPan() {

        String hourZhi = getHourZhi(); // 时支
        String[] zhi = ZhuanQiMenMaps.DI_ZHI; // 地支
        String xunShouZhi = getXunShou().substring(1, 2); // 旬首的地支

        // 1、获取旬首中的地支在第几号索引
        int xunShouZhiIndex = 0; // 记录旬首中的地支索引
        for (int i = 0; i < zhi.length; i++) {
            if (xunShouZhi.equals(zhi[i])) {
                xunShouZhiIndex = i;
                break;
            }
        }

        // 2、接着旬首中的地支索引值向后查找时支所在位置
        int hourZhiCount = 0; // 记录找到时支时所需要查找的次数
        for (int i = 0; i < zhi.length; i++) {
            if (xunShouZhiIndex == zhi.length) {
                // 2.1、若查找至最后一个元素时仍未找到地支，则重置旬首中的地支索引值
                xunShouZhiIndex = 0;
            } else if (!hourZhi.equals(zhi[xunShouZhiIndex])) {
                // 2.2、未找到元素，继续查找
                hourZhiCount++; // 查找次数+1
                xunShouZhiIndex++; // 旬首中的地支索引+1
            } else {
                // 2.3、已找到元素，停止查找
                break;
            }
        }

        // 3、若[旬首中的地支]和[时支]不相同，说明值使落宫已改变
        int xunShouGong = getXunShouGong(); // 旬首落宫（即：值符和值使的落宫）
        if (!xunShouZhi.equals(hourZhi)) {
            // 3.1、计算值使旋转后的宫位
            if ("阳遁".equals(getYinYangDun())) {
                // 3.2、阳遁用[值使旋转前宫位+一共查找的次数]获取旋转后值使所落宫位，顺排九宫
                for (int i = 0; i < hourZhiCount; i++) {
                    // 3.3、若值使旋转后的宫位大于等于9，则重新从第一宫开始判断
                    if (xunShouGong >= 9) {
                        xunShouGong = 1;
                    } else {
                        xunShouGong++;
                    }
                }
            } else {
                // 3.4、阴遁用[值使旋转前宫位+一共查找的次数]获取旋转后值使所落宫位，逆排九宫
                for (int i = 0; i < hourZhiCount; i++) {
                    // 3.5、若值使旋转后的宫位小于等于0，则重新从第九宫开始判断
                    if (xunShouGong <= 1) {
                        xunShouGong = 9;
                    } else {
                        xunShouGong--;
                    }
                }
            }
        }

        // 4、若值使旋转后落中五宫则寄坤二宫
        this.newZhiShiGong = xunShouGong == 5 ? 2 : xunShouGong;

        // 5、计算人盘
        List<String> list = new ArrayList<>();
        Map<Integer, List<String>> baMenShun = ZhuanQiMenMaps.BA_MEN_SHUN_ZHUAN; // 八门位置（顺转九宫）
        for (int i = 0; i < baMenShun.size(); i++) {
            List<String> baMen = baMenShun.get(i);
            for (int j = 0; j < baMen.size(); j++) {
                if (baMen.get(getNewZhiShiGong() - 1).equals(getZhiShi())) {
                    list = baMen;
                    break;
                }
            }
        }

        // 6、设置人盘
        this.renPan = list;

    }

    /**
     * 计算神盘
     */
    private void shenPan() {

        /*
            根据小值符随大值符的原则，即：将小值符加在天盘大值符宫位上即可。
         */

        // 1、若值符落中五宫则寄二宫
        int newZhiFuGong = getNewZhiFuGong(); // [值符]旋转后宫位
        if (newZhiFuGong == 5) {
            newZhiFuGong = 2;
        }

        // 2、判断阴阳遁
        if ("阳遁".equals(getYinYangDun())) {
            // 2.1、阳遁顺转九宫【此处按小值符追随天盘大值符计算。当然还有另外一种方式：小值符追随地盘值符】
            this.shenPan = ZhuanQiMenMaps.BA_SHEN_SHUN_ZHUAN.get(newZhiFuGong);
        } else {
            // 2.2、阴遁逆转九宫【此处按小值符追随天盘大值符计算。当然还有另外一种方式：小值符追随地盘值符】
            this.shenPan = ZhuanQiMenMaps.BA_SHEN_NI_ZHUAN.get(newZhiFuGong);
        }

    }

    /**
     * 计算天乙、地乙、太乙
     */
    private void tianDiTai() {

        /*
               天乙：值符飞落宫位的原宫星
               地乙：值使飞落宫位的原宫门
               太乙/元一：值使门
         */

        this.tianYi = ZhuanQiMenMaps.JIU_XING_INITIAL[getNewZhiFuGong() - 1]; // 天乙
        this.diYi = ZhuanQiMenMaps.BA_MEN_INITIAL[getNewZhiShiGong() - 1]; // 地乙
        this.taiYi = getZhiShi(); // 太乙

    }

    /**
     * 计算伏吟【TODO：完善中..】
     */
    private void fuYin() {

        List<String> list = new ArrayList<>(); // 保存伏吟数据

        // 1、星伏吟（判断宫位数据是否符合：坎一宫有天蓬星，离九宫有天英星）
        if ("天蓬".equals(getTianPan().get(0)) && "天英星".equals(getTianPan().get(8))) {
            list.add("九星伏吟");
        }

        // 2、门伏吟（判断宫位数据是否符合：坎一宫有休门，离九宫有景门）
        if ("休门".equals(getRenPan().get(0)) && "景门".equals(getRenPan().get(8))) {
            list.add("八门伏吟");
        }

        // 3、神伏吟（判断宫位数据是否符合：坎一宫有值符，离九宫有白虎）
        if ("值符".equals(getShenPan().get(0)) && "白虎".equals(getShenPan().get(8))) {
            list.add("八神伏吟");
        }

        // 4、奇仪伏吟（判断宫位数据是否符合：坎一宫中的地盘奇仪和天盘奇仪是否相同）
        if (getDiQiYi().get(0).equals(getTianPanQiYiExTq().get(0))) {
            list.add("奇仪伏吟");
        }

        this.fuYin = list;

    }

    /**
     * 计算反吟【TODO：完善中..】
     */
    private void fanYin() {

        List<String> list = new ArrayList<>(); // 保存反吟数据

        // 1、六仪反吟
        /*
            天盘甲子戊+地盘甲午辛
            天盘甲戌己+地盘甲辰壬
            天盘甲申庚+地盘甲寅癸
            天盘甲午辛+地盘甲子戊
            天盘甲辰壬+地盘甲戌己
            天盘甲寅癸+地盘甲申庚
         */
        List<String> diSanQiLiuYi = getDiQiYi(); // 地盘中的奇仪（1~9宫）
        List<String> ex = getTianPanQiYiExTq(); // 天盘旋转后九星所携带的奇仪，不包含[天禽星]携带的奇仪（1~9宫）
        List<String> to = getTianPanQiYiToTq(); // 天盘旋转后九星所携带的奇仪，只包含[天禽星]携带的奇仪（1~9宫）
        for (int i = 0; i < 9; i++) {
            // 天盘甲子戊+地盘甲午辛
            if (("戊".equals(ex.get(i)) || "戊".equals(to.get(i))) && "辛".equals(diSanQiLiuYi.get(i))) {
                list.add("六仪反吟");
                break;
            }
            // 天盘甲戌己+地盘甲辰壬
            if (("己".equals(ex.get(i)) || "己".equals(to.get(i))) && "壬".equals(diSanQiLiuYi.get(i))) {
                list.add("六仪反吟");
                break;
            }
            // 天盘甲申庚+地盘甲寅癸
            if (("庚".equals(ex.get(i)) || "庚".equals(to.get(i))) && "癸".equals(diSanQiLiuYi.get(i))) {
                list.add("六仪反吟");
                break;
            }
            // 天盘甲午辛+地盘甲子戊
            if (("辛".equals(ex.get(i)) || "辛".equals(to.get(i))) && "戊".equals(diSanQiLiuYi.get(i))) {
                list.add("六仪反吟");
                break;
            }
            // 天盘甲辰壬+地盘甲戌己
            if (("壬".equals(ex.get(i)) || "壬".equals(to.get(i))) && "己".equals(diSanQiLiuYi.get(i))) {
                list.add("六仪反吟");
                break;
            }
            // 天盘甲寅癸+地盘甲申庚
            if (("癸".equals(ex.get(i)) || "癸".equals(to.get(i))) && "庚".equals(diSanQiLiuYi.get(i))) {
                list.add("六仪反吟");
                break;
            }
        }

        // 2、星伏吟（判断宫位数据是否符合：坎一宫有天英星，离九宫有天蓬星）
        if ("天英".equals(getTianPan().get(0)) && "天蓬".equals(getTianPan().get(8))) {
            list.add("九星伏吟");
        }

        // 3、门伏吟（判断宫位数据是否符合：坎一宫有景门，离九宫有休门）
        if ("景门".equals(getRenPan().get(0)) && "休门".equals(getRenPan().get(8))) {
            list.add("八门伏吟");
        }

        // 4、神伏吟（判断宫位数据是否符合：坎一宫有白虎，离九宫有值符）
        if ("白虎".equals(getShenPan().get(0)) && "值符".equals(getShenPan().get(8))) {
            list.add("八神伏吟");
        }

        this.fanYin = list;

    }

    /**
     * 计算六仪击刑
     */
    private void liuYiJiXing() {

        /*
            1、甲子戊：'戊'落震三宫，子卯相刑。
            2、甲戌己：'己'落坤二宫，戌未相刑。
            3、甲申庚：'庚'落艮八宫，申寅相刑。
            4、甲午辛：'辛'落离九宫，午午自刑。
            5、甲辰壬：'壬'落巽四宫，辰辰自刑。
            6、甲寅癸：'癸'落巽四宫，寅巳相刑。
        */

        List<String> list = new ArrayList<>(); // 保存六仪击刑
        List<String> ex = getTianPanQiYiExTq(); // 天盘旋转后九星所携带的奇仪，不包含[天禽星]携带的奇仪（1~9宫）
        List<String> to = getTianPanQiYiToTq(); // 天盘旋转后九星所携带的奇仪，只包含[天禽星]携带的奇仪（1~9宫）

        // 1.1、判断震三宫的天盘天干是否为'戊'
        if ("戊".equals(to.get(2)) || "戊".equals(ex.get(2))) {
            list.add("子卯相刑(戊落震三宫)");
        }
        // 1.2、判断坤二宫的天盘天干是否为'己'
        if ("己".equals(to.get(1)) || "己".equals(ex.get(1))) {
            list.add("戌未相刑(己落坤二宫)");
        }
        // 1.3、判断艮八宫的天盘天干是否为'庚'
        if ("庚".equals(to.get(7)) || "庚".equals(ex.get(7))) {
            list.add("申寅相刑(庚落艮八宫)");
        }
        // 1.4、判断离九宫的天盘天干是否为'辛'
        if ("辛".equals(to.get(8)) || "辛".equals(ex.get(8))) {
            list.add("午午自刑(辛落离九宫)");
        }
        // 1.5、判断巽四宫的天盘天干是否为'壬'
        if ("壬".equals(to.get(3)) || "壬".equals(ex.get(3))) {
            list.add("辰辰自刑(壬落巽四宫)");
        }
        // 1.6、判断巽四宫的天盘天干是否为'癸'
        if ("癸".equals(to.get(3)) || "癸".equals(ex.get(3))) {
            list.add("寅巳相刑(癸落巽四宫)");
        }

        this.liuYiJiXing = list;

    }

    /**
     * 计算奇仪入墓
     */
    private void qiYiRuMu() {

        /*
            1、'乙'落坤二宫、乾六宫。
            2、'丙'落乾六宫。
            3、'丁'落艮八宫。
            4、'戊'落乾六宫。
            5、'己'落艮八宫。
            6、'庚'落艮八宫。
            7、'辛'落巽四宫。
            8、'壬'落巽四宫。
            9、'癸'落坤二宫。
        */

        List<String> list = new ArrayList<>(); // 保存奇仪入墓
        List<String> ex = getTianPanQiYiExTq(); // 天盘旋转后九星所携带的奇仪，不包含[天禽星]携带的奇仪（1~9宫）
        List<String> to = getTianPanQiYiToTq(); // 天盘旋转后九星所携带的奇仪，只包含[天禽星]携带的奇仪（1~9宫）

        // 2.1、判断坤二宫的天盘天干是否为'乙'
        if ("乙".equals(to.get(1)) || "乙".equals(ex.get(1))) {
            list.add("乙入墓(坤二宫)");
        }
        // 2.2、判断坤二宫的天盘天干是否为'癸'
        if ("癸".equals(to.get(1)) || "癸".equals(ex.get(1))) {
            list.add("癸入墓(坤二宫)");
        }
        // 2.3、判断乾六宫的天盘天干是否为'乙'
        if ("乙".equals(to.get(5)) || "乙".equals(ex.get(5))) {
            list.add("乙入墓(乾六宫)");
        }
        // 2.4、判断乾六宫的天盘天干是否为'丙'
        if ("丙".equals(to.get(5)) || "丙".equals(ex.get(5))) {
            list.add("丙入墓(乾六宫)");
        }
        // 2.5、判断乾六宫的天盘天干是否为'戊'
        if ("戊".equals(to.get(5)) || "戊".equals(ex.get(5))) {
            list.add("戊入墓(乾六宫)");
        }
        // 2.6、判断艮八宫的天盘天干是否为'丁'
        if ("丁".equals(to.get(7)) || "丁".equals(ex.get(7))) {
            list.add("丁入墓(艮八宫)");
        }
        // 2.7、判断艮八宫的天盘天干是否为'庚'
        if ("庚".equals(to.get(7)) || "庚".equals(ex.get(7))) {
            list.add("庚入墓(艮八宫)");
        }
        // 2.8、判断艮八宫的天盘天干是否为'己'
        if ("己".equals(to.get(7)) || "己".equals(ex.get(7))) {
            list.add("己入墓(艮八宫)");
        }
        // 2.9、判断巽四宫的天盘天干是否为'辛'
        if ("辛".equals(to.get(3)) || "辛".equals(ex.get(3))) {
            list.add("辛入墓(巽四宫)");
        }
        // 2.10、判断巽四宫的天盘天干是否为'壬'
        if ("壬".equals(to.get(3)) || "壬".equals(ex.get(3))) {
            list.add("壬入墓(巽四宫)");
        }

        this.qiYiRuMu = list;

    }

    /**
     * 计算九遁
     */
    private void jiuDun() {

        List<String> list = new ArrayList<>(); //  保存单宫九遁
        Map<Integer, List<String>> map = new HashMap<>(); // 保存九宫九遁

        // 1、计算九遁
        List<String> tianDun = tianDun(); // 天遁
        List<String> diDun = diDun(); // 地遁
        List<String> renDun = renDun(); // 人遁
        List<String> shenDun = shenDun(); // 神遁
        List<String> guiDun = guiDun(); // 鬼遁
        List<String> fengDun = fengDun(); // 风遁
        List<String> yunDun = yunDun(); // 云遁
        List<String> longDun = longDun(); // 龙遁
        List<String> huDun = huDun(); // 虎遁

        // 2、整合九遁
        for (int i = 0; i < 9; i++) {
            if (!"".equals(tianDun.get(i))) list.add(tianDun.get(i));
            if (!"".equals(diDun.get(i))) list.add(diDun.get(i));
            if (!"".equals(renDun.get(i))) list.add(renDun.get(i));
            if (!"".equals(shenDun.get(i))) list.add(shenDun.get(i));
            if (!"".equals(guiDun.get(i))) list.add(guiDun.get(i));
            if (!"".equals(fengDun.get(i))) list.add(fengDun.get(i));
            if (!"".equals(yunDun.get(i))) list.add(yunDun.get(i));
            if (!"".equals(longDun.get(i))) list.add(longDun.get(i));
            if (!"".equals(huDun.get(i))) list.add(huDun.get(i));
            map.put(i, list);
            list = new ArrayList<>();
        }

        this.jiuDun = map;

    }

    /**
     * 计算月将、月将神
     */
    private void yueJiang() {

        String monthZhi = getMonthZhi(); // 月支
        this.yueJiang = ZhuanQiMenMaps.YUE_JIANG.get(monthZhi).get(0); // 月将
        this.yueJiangShen = ZhuanQiMenMaps.YUE_JIANG.get(monthZhi).get(1); // 月将神

    }

    /**
     * 计算十干克应
     */
    private void shiGanKeYing() {

        this.shiGanKeYing = ZhuanQiMenUtil.shiGanKeYing(getDiPan(), getTianPanQiYiToTq(), getTianPanQiYiExTq());

    }

    /**
     * 计算八门克应
     */
    private void baMenKeYing() {

        this.baMenKeYing = ZhuanQiMenUtil.baMenKeYing(getRenPan(), getDiPan(), getTianPanQiYiToTq(), getTianPanQiYiExTq());

    }

    /**
     * 计算八门静应
     */
    private void baMenJingYing() {

        this.baMenJingYing = ZhuanQiMenUtil.menDongJingYing(ZhuanQiMenMaps.BA_MEN_KE_YING, getRenPan());

    }

    /**
     * 计算八门动应
     */
    private void baMenDongYing() {

        this.baMenDongYing = ZhuanQiMenUtil.menDongJingYing(ZhuanQiMenMaps.BA_MEN_DONG_YING, getRenPan());

    }

    /**
     * 计算星门克应
     */
    private void xingMenKeYing() {

        this.xingMenKeYing = ZhuanQiMenUtil.xingMenKeYing(getTianPan(), getRenPan());

    }

    /**
     * 计算九星时应
     */
    private void jiuXingShiYing() {

        this.jiuXingShiYing = ZhuanQiMenUtil.jiuXingShiYing(getHourZhi(), getTianPan());

    }

    /**
     * 计算八卦旺衰（根据季节计算）
     */
    private void baGuaWangShuai() {

        // 设置八卦旺衰
        this.baGuaWangShuai = ZhuanQiMenUtil.baGuaWangShuai(getJiJie());

    }

    /**
     * 计算八门旺衰（根据季节计算）
     */
    private void baMenWangShuai() {

        // 设置八门旺衰
        this.baMenWangShuai = ZhuanQiMenUtil.baMenWangShuai(getRenPan(), getJiJie());

    }

    /**
     * 计算九星旺衰（根据月支计算）
     */
    private void jiuXingWangShuai() {

        // 设置九星旺衰
        this.jiuXingWangShuai = ZhuanQiMenUtil.jiuXingWangShuai(getTianPan(), getMonthZhi());

    }

    /**
     * 计算八神落宫状态
     */
    private void baShenLuoGongStatus() {

        // 设置八神落宫状态
        this.baShenLuoGongStatus = ZhuanQiMenUtil.baShenLuoGongStatus(getShenPan());

    }

    /**
     * 计算八门落宫状态
     */
    private void baMenLuoGongStatus() {

        // 设置八门落宫状态
        this.baMenLuoGongStatus = ZhuanQiMenUtil.baMenLuoGongStatus(getRenPan());

    }

    /**
     * 计算九星落宫状态
     */
    private void jiuXingLuoGongStatus() {

        // 设置九星落宫状态
        this.jiuXingLuoGongStatus = ZhuanQiMenUtil.jiuXingLuoGongStatus(getTianPan());

    }

    /**
     * 计算地盘奇仪与落宫地支的关系
     */
    private void diPanQiYiLuoGongLink() {

        // 设置地盘奇仪与落宫地支的关系（1~9宫）
        this.diPanQiYiLuoGongLink = ZhuanQiMenUtil.diPanQiYiLuoGongLink(getDiPan());

    }

    /**
     * 计算天盘奇仪与落宫地支的关系
     */
    private void tianPanQiYiLuoGongLink() {

        // 1、计算天盘奇仪与落宫地支的关系（1~9宫）
        Map<String, Map<Integer, List<List<String>>>> map = ZhuanQiMenUtil.tianPanQiYiLuoGongLink(getTianPanQiYiToTq(), getTianPanQiYiExTq());

        // 2、设置天盘奇仪与落宫地支的关系
        this.tianPanQiYiLuoGongToTqLink = map.get("mapToTq"); // 天盘奇仪与落宫地支的关系，只包含天禽星（1~9宫）
        this.tianPanQiYiLuoGongExTqLink = map.get("mapExTq"); // 天盘奇仪与落宫地支的关系，不包含天禽星（1~9宫）

    }

//------------------------------------------------------------------------------------------------------------------------------------

    /**
     * 获取公历日期
     *
     * @return 公历日期
     */
    public String getSolarStr() {
        return CommonUtil.solarStr(getSolar());
    }

    /**
     * 获取农历日期
     *
     * @return 农历日期
     */
    public String getLunarStr() {
        return CommonUtil.lunarStr(getLunar());
    }

    /**
     * 计算并返回值使
     * <p>
     * <p> 天禽星为值符时：一律用[死门]为值使</p>
     *
     * @return 值使
     */
    private static String zhiShi() {

        return "死门";

    }

    /**
     * 计算并返回值使
     * <hr/>
     * <p> 天禽星为值符时：阳遁用[生门]为值使</p>
     * <p> 天禽星为值符时：阴遁用[死门]为值使</p>
     *
     * @param yinYangDun 阴阳遁
     * @return 值使
     */
    private static String zhiShi2(String yinYangDun) {

        // 阳遁用生门，阴遁用死门
        if ("阳遁".equals(yinYangDun)) {
            return "生门";
        } else {
            return "死门";
        }

    }

    /**
     * 计算并返回值使
     * <hr/>
     * <p>天禽星为值符时：（冬至、小寒、大寒）三个节气，用[休门]为值使</p>
     * <p>天禽星为值符时：（立春，雨水，惊蛰）三个节气，用[生门]为值使</p>
     * <p>天禽星为值符时：（春分、清明、谷雨）三个节气，用[伤门]为值使</p>
     * <p>天禽星为值符时：（立夏、小满、芒种）三个节气，用[杜门]为值使</p>
     * <p>天禽星为值符时：（夏至、小暑、大暑）三个节气，用[景门]为值使</p>
     * <p>天禽星为值符时：（立秋、处暑、白露）三个节气，用[死门]为值使</p>
     * <p>天禽星为值符时：（秋分、寒露、霜降）三个节气，用[惊门]为值使</p>
     * <p>天禽星为值符时：（立冬、小雪、大雪）三个节气，用[开门]为值使</p>
     *
     * @param jieQi 节气
     * @return 值使
     */
    private static String zhiShi3(String jieQi) {

        Map<Integer, List<String>> isBaMen = ZhuanQiMenMaps.IS_BA_MEN; // 根据二十四节气获取八门

        // 根据二十四节气判断八门
        for (int i = 0; i < isBaMen.size(); i++) {
            for (int j = 0; j < isBaMen.get(i).size(); j++) {
                String s = isBaMen.get(i).get(j);
                if (s.equals(jieQi)) {
                    switch (i) {
                        case 0:
                            return "休门";
                        case 1:
                            return "生门";
                        case 2:
                            return "伤门";
                        case 3:
                            return "杜门";
                        case 4:
                            return "景门";
                        case 5:
                            return "死门";
                        case 6:
                            return "惊门";
                        case 7:
                            return "开门";
                    }
                }
            }
        }

        return "";

    }

    /**
     * 计算并返回天遁
     */
    private List<String> tianDun() {

        /*
            天盘[丙奇(月奇)]加地盘[六丁]合人盘[开门、休门、生门]。即【丙+丁+开门、休门、生门】。
         */

        List<String> list = CommonUtil.addCharToList(9);

        for (int i = 0; i < 9; i++) {
            String to = getTianPanQiYiToTq().get(i); // 每一宫位中的天盘旋转后九星所携带的奇仪，只包含[天禽星]携带的奇仪（1~9宫）
            String ex = getTianPanQiYiExTq().get(i); // 每一宫位中的天盘旋转后九星所携带的奇仪，不包含[天禽星]携带的奇仪（1~9宫）
            String diPan = getDiPan().get(i); // 每一宫位中的奇仪
            String renPan = getRenPan().get(i); // 每一宫位中的门
            // 判断宫位信息是否符合→ 天盘[丙奇(月奇)]加地盘[六丁]合人盘[开门、休门、生门]。
            if (("丙".equals(to) || "丙".equals(ex)) && "丁".equals(diPan) && ("开门".equals(renPan) || "休门".equals(renPan) || "生门".equals(renPan))) {
                list.set(i, "天");
            }
        }

        return list;

    }

    /**
     * 计算并返回地遁
     */
    private List<String> diDun() {

        /*
            天盘[乙奇(日奇)]加地盘[六己]合人盘[开门、休门、生门]。即【乙+己+开门、休门、生门】。
         */

        List<String> list = CommonUtil.addCharToList(9);

        for (int i = 0; i < 9; i++) {
            String to = getTianPanQiYiToTq().get(i); // 每一宫位中的天盘旋转后九星所携带的奇仪，只包含[天禽星]携带的奇仪（1~9宫）
            String ex = getTianPanQiYiExTq().get(i); // 每一宫位中的天盘旋转后九星所携带的奇仪，不包含[天禽星]携带的奇仪（1~9宫）
            String diPan = getDiPan().get(i); // 每一宫位中的奇仪
            String renPan = getRenPan().get(i); // 每一宫位中的门
            // 判断宫位信息是否符合→ 天盘[乙奇(日奇)]加地盘[六己]合人盘[开门、休门、生门]。
            if (("乙".equals(to) || "乙".equals(ex)) && "己".equals(diPan) && ("开门".equals(renPan) || "休门".equals(renPan) || "生门".equals(renPan))) {
                list.set(i, "地");
            }
        }

        return list;

    }

    /**
     * 计算并返回人遁
     */
    private List<String> renDun() {

        /*
            天盘[丁奇(星奇)]加神盘[太阴]合人盘[休门]。即【丁+太阴+休门】。
         */

        List<String> list = CommonUtil.addCharToList(9);

        for (int i = 0; i < 9; i++) {
            String to = getTianPanQiYiToTq().get(i); // 每一宫位中的天盘旋转后九星所携带的奇仪，只包含[天禽星]携带的奇仪（1~9宫）
            String ex = getTianPanQiYiExTq().get(i); // 每一宫位中的天盘旋转后九星所携带的奇仪，不包含[天禽星]携带的奇仪（1~9宫）
            String shenPan = getShenPan().get(i); // 每一宫位中的神
            String renPan = getRenPan().get(i); // 每一宫位中的门
            // 判断宫位信息是否符合→ 天盘[丁奇(星奇)]加神盘[太阴]合人盘[休门]。
            if (("丁".equals(to) || "丁".equals(ex)) && "太阴".equals(shenPan) && "休门".equals(renPan)) {
                list.set(i, "人");
            }
        }

        return list;

    }

    /**
     * 计算并返回神遁
     */
    private List<String> shenDun() {

        /*
            天盘[丙奇(月奇)]加神盘[九天]合人盘[生门]。即【丙+九天+生门】。
         */

        List<String> list = CommonUtil.addCharToList(9);

        for (int i = 0; i < 9; i++) {
            String to = getTianPanQiYiToTq().get(i); // 每一宫位中的天盘旋转后九星所携带的奇仪，只包含[天禽星]携带的奇仪（1~9宫）
            String ex = getTianPanQiYiExTq().get(i); // 每一宫位中的天盘旋转后九星所携带的奇仪，不包含[天禽星]携带的奇仪（1~9宫）
            String shenPan = getShenPan().get(i); // 每一宫位中的神
            String renPan = getRenPan().get(i); // 每一宫位中的门
            // 判断宫位信息是否符合→ 天盘[丙奇(月奇)]加神盘[九天]合人盘[生门]。
            if (("丙".equals(to) || "丙".equals(ex)) && "九天".equals(shenPan) && "生门".equals(renPan)) {
                list.set(i, "神");
            }
        }

        return list;

    }

    /**
     * 计算并返回鬼遁
     */
    private List<String> guiDun() {

        /*
            天盘[丁奇(星奇)]加神盘[九地]合人盘[杜门、开门]。即【丙+九天+生门】。
         */

        List<String> list = CommonUtil.addCharToList(9);

        for (int i = 0; i < 9; i++) {
            String to = getTianPanQiYiToTq().get(i); // 每一宫位中的天盘旋转后九星所携带的奇仪，只包含[天禽星]携带的奇仪（1~9宫）
            String ex = getTianPanQiYiExTq().get(i); // 每一宫位中的天盘旋转后九星所携带的奇仪，不包含[天禽星]携带的奇仪（1~9宫）
            String shenPan = getShenPan().get(i); // 每一宫位中的神
            String renPan = getRenPan().get(i); // 每一宫位中的门
            // 判断宫位信息是否符合→ 天盘[丁奇(星奇)]加神盘[九地]合人盘[杜门、开门]。
            if (("丁".equals(to) || "丁".equals(ex)) && "九地".equals(shenPan) && ("杜门".equals(renPan) || "开门".equals(renPan))) {
                list.set(i, "鬼");
            }
        }

        return list;

    }

    /**
     * 计算并返回风遁
     */
    private List<String> fengDun() {

        /*
            天盘[乙奇(日奇)]加人盘[开门、休门、生门]临[巽四宫]。即【乙+巽四宫+开门、休门、生门】。
         */

        List<String> list = CommonUtil.addCharToList(9);

        // 1、获取巽四宫信息
        int gongWei = 3; // 巽四宫对应索引值为3
        String to = getTianPanQiYiToTq().get(gongWei); // 巽四宫天盘旋转后九星所携带的奇仪，只包含[天禽星]携带的奇仪（1~9宫）
        String ex = getTianPanQiYiExTq().get(gongWei); // 巽四宫天盘旋转后九星所携带的奇仪，不包含[天禽星]携带的奇仪（1~9宫）
        String renPan = getRenPan().get(gongWei); // 巽四宫中的门

        // 2、判断巽四宫信息是否符合→ 天盘[乙奇(日奇)]加人盘[开门、休门、生门]临[巽四宫]。
        if (("乙".equals(to) || "乙".equals(ex)) && ("开门".equals(renPan) || "休门".equals(renPan) || "生门".equals(renPan))) {
            list.set(gongWei, "风");
        }

        return list;

    }

    /**
     * 计算并返回云遁
     */
    private List<String> yunDun() {

        /*
            天盘[乙奇(日奇)]加地盘[六辛]合人盘[开门、休门、生门]。即【乙+辛+开门、休门、生门】。
         */

        List<String> list = CommonUtil.addCharToList(9);

        for (int i = 0; i < 9; i++) {
            String to = getTianPanQiYiToTq().get(i); // 每一宫位中的天盘旋转后九星所携带的奇仪，只包含[天禽星]携带的奇仪（1~9宫）
            String ex = getTianPanQiYiExTq().get(i); // 每一宫位中的天盘旋转后九星所携带的奇仪，不包含[天禽星]携带的奇仪（1~9宫）
            String diPan = getDiPan().get(i); // 每一宫位中的奇仪
            String renPan = getRenPan().get(i); // 每一宫位中的门
            // 宫位信息是否符合→ 天盘[乙奇(日奇)]加地盘[六辛]合人盘[开门、休门、生门]。
            if (("乙".equals(to) || "乙".equals(ex)) && "六辛".equals(diPan) && ("开门".equals(renPan) || "休门".equals(renPan) || "生门".equals(renPan))) {
                list.set(i, "云");
            }
        }

        return list;

    }

    /**
     * 计算并返回龙遁
     */
    private List<String> longDun() {

        /*
            1、天盘[乙奇(日奇)]加人盘[开门、休门、生门]临[坎一宫]。即【乙+坎一宫+开门、休门、生门】
            2、天盘[乙奇(日奇)]加地盘[六癸]合人盘[开门、休门、生门]。即【乙+癸+开门、休门、生门】
         */

        List<String> list = CommonUtil.addCharToList(9);

        // 1、获取坎一宫信息
        int gongWei = 0; // 坎一宫对应索引值为0
        String to = getTianPanQiYiToTq().get(gongWei); // 每一宫位中的天盘旋转后九星所携带的奇仪，只包含[天禽星]携带的奇仪（1~9宫）
        String ex = getTianPanQiYiExTq().get(gongWei); // 每一宫位中的天盘旋转后九星所携带的奇仪，不包含[天禽星]携带的奇仪（1~9宫）
        String renPan = getRenPan().get(gongWei); // 坎一宫门

        // 2、判断坎一宫信息是否符合→ 天盘[乙奇(日奇)]加人盘[开门、休门、生门]临[坎一宫]。
        if (("乙".equals(to) || "乙".equals(ex)) && ("开门".equals(renPan) || "休门".equals(renPan) || "生门".equals(renPan))) {
            list.set(gongWei, "龙");
        } else {
            // 2.1、判断1~9宫信息
            for (int i = 0; i < 9; i++) {
                String to2 = getTianPanQiYiToTq().get(i); // 每一宫位中的天盘旋转后九星所携带的奇仪，只包含[天禽星]携带的奇仪（1~9宫）
                String ex2 = getTianPanQiYiExTq().get(i); // 每一宫位中的天盘旋转后九星所携带的奇仪，不包含[天禽星]携带的奇仪（1~9宫）
                String diPan2 = getDiPan().get(i); // 每一宫位中的奇仪
                String renPan2 = getRenPan().get(i); // 每一宫位中的八门
                // 2.2、判断宫位信息是否符合→ 天盘[乙奇(日奇)]加地盘[六癸]合人盘[开门、休门、生门]。
                if (("乙".equals(to2) || "乙".equals(ex2)) && "癸".equals(diPan2) && ("开门".equals(renPan2) || "休门".equals(renPan2) || "生门".equals(renPan2))) {
                    list.set(i, "龙");
                }
            }
        }

        return list;

    }

    /**
     * 计算并返回虎遁
     */
    private List<String> huDun() {

        /*
            1、天盘[六庚]加人盘[开门]临[兑七宫]。即【庚+兑七宫+开门】
            2、天盘[乙奇(日奇)]加地盘[六辛]合人盘[休门、生门]临[艮八宫]。即【乙+辛+艮八宫+休门、生门】
         */

        List<String> list = CommonUtil.addCharToList(9);

        // 1、获取兑七宫信息
        int gongWei = 6; // 兑七宫对应索引值为6
        String to = getTianPanQiYiToTq().get(gongWei); // 每一宫位中的天盘旋转后九星所携带的奇仪，只包含[天禽星]携带的奇仪（1~9宫）
        String ex = getTianPanQiYiExTq().get(gongWei); // 每一宫位中的天盘旋转后九星所携带的奇仪，不包含[天禽星]携带的奇仪（1~9宫）
        String renPan = getRenPan().get(gongWei); // 兑七宫门

        // 2、获取艮八宫信息
        int gongWei2 = 7; // 艮八宫对应索引值为7
        String to2 = getTianPanQiYiToTq().get(gongWei); // 每一宫位中的天盘旋转后九星所携带的奇仪，只包含[天禽星]携带的奇仪（1~9宫）
        String ex2 = getTianPanQiYiExTq().get(gongWei); // 每一宫位中的天盘旋转后九星所携带的奇仪，不包含[天禽星]携带的奇仪（1~9宫）
        String diPan2 = getDiPan().get(gongWei2); // 艮八宫奇仪
        String renPan2 = getRenPan().get(gongWei2); // 艮八宫门

        // 3、判断兑七宫信息是否符合→ 天盘[六庚]加人盘[开门]临[兑七宫]。
        if (("庚".equals(to) || "庚".equals(ex)) && "开门".equals(renPan)) {
            list.set(gongWei, "虎");
        } else {
            // 3.1、判断艮八宫信息是否符合→ 天盘[乙奇(日奇)]加地盘[六辛]合人盘[休门、生门]临[艮八宫]
            if (("乙".equals(to2) || "乙".equals(ex2)) && "辛".equals(diPan2) && ("休门".equals(renPan2) || "生门".equals(renPan2))) {
                list.set(gongWei, "虎");
            }
        }

        return list;

    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();

        s.append("公历:").append(getSolarStr());
        s.append("   ");
        s.append("农历:").append(getLunarStr());
        s.append("   ");
        s.append("星期:").append(getWeek());
        s.append("   ");
        s.append("八字:").append(getBaZi());
        s.append("   ");
        s.append("八字五行:").append(getBaZiWuXing());
        s.append("   ");
        s.append("八字纳音:").append(getBaZiNaYin());
        s.append("   ");
        s.append("八字旬空:").append(getBaZiXunKong());
        s.append("   ");
        s.append("局数:").append(getYinYangDun()).append(getJuShu()).append("局");
        s.append("   ");
        s.append("旬首:").append(getXunShou());
        s.append("   ");
        s.append("值符:").append(getZhiFu());
        s.append("   ");
        s.append("值使:").append(getZhiShi());
        s.append("   ");
        s.append("天乙:").append(getTianYi());
        s.append("   ");
        s.append("地乙:").append(getDiYi());
        s.append("   ");
        s.append("太乙:").append(getZhiShi());
        s.append("   ");
        s.append("地盘:").append(getDiPan());
        s.append("   ");
        s.append("天盘:").append(getTianPan());
        s.append("   ");
        s.append("人盘:").append(getRenPan());
        s.append("   ");
        s.append("神盘:").append(getShenPan());
        s.append("   ");
        s.append("六仪击刑:").append(getLiuYiJiXing());
        s.append("   ");
        s.append("奇仪入墓:").append(getQiYiRuMu());
        s.append("   ");
        s.append("月将:").append(getYueJiang());
        s.append("   ");
        s.append("月将神:").append(getYueJiangShen());

        return s.toString();

    }


}
