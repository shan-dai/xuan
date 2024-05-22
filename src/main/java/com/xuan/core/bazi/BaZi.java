package com.xuan.core.bazi;

import com.nlf.calendar.EightChar;
import com.nlf.calendar.Lunar;
import com.nlf.calendar.Solar;
import com.nlf.calendar.eightchar.*;
import com.xuan.utils.CommonUtil;
import lombok.Getter;

import java.util.*;

/**
 * 八字
 *
 * @author 善待
 */
@Getter
public class BaZi {

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
     * 年干五行
     */
    private String yearGanWuXing;
    /**
     * 月干五行
     */
    private String monthGanWuXing;
    /**
     * 日干五行
     */
    private String dayGanWuXing;
    /**
     * 时干五行
     */
    private String hourGanWuXing;

    /**
     * 年支五行
     */
    private String yearZhiWuXing;
    /**
     * 月支五行
     */
    private String monthZhiWuXing;
    /**
     * 日支五行
     */
    private String dayZhiWuXing;
    /**
     * 时支五行
     */
    private String hourZhiWuXing;

    /**
     * 年干支五行
     */
    private String yearGanZhiWuXing;
    /**
     * 月干支五行
     */
    private String monthGanZhiWuXing;
    /**
     * 日干支五行
     */
    private String dayGanZhiWuXing;
    /**
     * 时干支五行
     */
    private String hourGanZhiWuXing;

    /**
     * 年干支纳音
     */
    private String yearGanZhiNaYin;
    /**
     * 月干支纳音
     */
    private String monthGanZhiNaYin;
    /**
     * 日干支纳音
     */
    private String dayGanZhiNaYin;
    /**
     * 时干支纳音
     */
    private String hourGanZhiNaYin;

    /**
     * 年干支旬空
     */
    private String yearGanZhiXunKong;
    /**
     * 月干支旬空
     */
    private String monthGanZhiXunKong;
    /**
     * 日干支旬空
     */
    private String dayGanZhiXunKong;
    /**
     * 时干支旬空
     */
    private String hourGanZhiXunKong;

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
     * 年干支主星（如：正财）
     */
    private String yearGanZhiZhuXing;
    /**
     * 月干支主星（如：正财）
     */
    private String monthGanZhiZhuXing;
    /**
     * 日干支主星（如：元男）
     */
    private String dayGanZhiZhuXing;
    /**
     * 时干支主星（如：正财）
     */
    private String hourGanZhiZhuXing;

    /**
     * 年支藏干（如：子）
     */
    private List<String> yearZhiCangGan;
    /**
     * 月支藏干（如：子）
     */
    private List<String> monthZhiCangGan;
    /**
     * 日支藏干（如：子）
     */
    private List<String> dayZhiCangGan;
    /**
     * 时支藏干（如：子）
     */
    private List<String> hourZhiCangGan;

    /**
     * 年干支副星（如：正财）
     */
    private List<String> yearGanZhiFuXing;
    /**
     * 月干支副星（如：正财）
     */
    private List<String> monthGanZhiFuXing;
    /**
     * 日干支副星（如：正财）
     */
    private List<String> dayGanZhiFuXing;
    /**
     * 时干支副星（如：正财）
     */
    private List<String> hourGanZhiFuXing;

    /**
     * 年干支地势
     */
    private String yearGanZhiDiShi;
    /**
     * 月干支地势
     */
    private String monthGanZhiDiShi;
    /**
     * 日干支地势
     */
    private String dayGanZhiDiShi;
    /**
     * 时干支地势
     */
    private String hourGanZhiDiShi;

    /**
     * 年干支神煞
     */
    private List<String> yearGanZhiShenSha;
    /**
     * 月干支神煞
     */
    private List<String> monthGanZhiShenSha;
    /**
     * 日干支神煞
     */
    private List<String> dayGanZhiShenSha;
    /**
     * 时干支神煞
     */
    private List<String> hourGanZhiShenSha;

    /**
     * 八字五行缺失（如：五行齐全）
     */
    private List<String> baZiWuXingQueShi;
    /**
     * 八字五行格局（如：2木 1火 2土 2金 1水）
     */
    private List<String> baZiWuXingGeJu;
    /**
     * 身体强弱（如：强）
     */
    private String bodyIntensity;
    /**
     * 喜用神（如：木）
     */
    private List<String> xiYongShen;
    /**
     * 喜用神方位（如：北）
     */
    private List<String> xiYongShenFangWei;

    /**
     * 五行旺衰
     */
    private List<String> wuXingWangShuai;
    /**
     * 天干留意
     */
    private List<String> tianGanLiuYi;
    /**
     * 地支留意
     */
    private List<String> diZhiLiuYi;
    /**
     * 胎元
     */
    private String taiYuan;
    /**
     * 胎息
     */
    private String taiXi;
    /**
     * 命宫
     */
    private String mingGong;
    /**
     * 身宫
     */
    private String shenGong;
    /**
     * 胎元纳音
     */
    private String taiYuanNaYin;
    /**
     * 胎息纳音
     */
    private String taiXiNaYin;
    /**
     * 命宫纳音
     */
    private String mingGongNaYin;
    /**
     * 身宫纳音
     */
    private String shenGongNaYin;
    /**
     * 起运
     */
    private String qiYun;
    /**
     * 起运日期
     */
    private String qiYunDate;
    /**
     * 生肖
     */
    private String shengXiao;
    /**
     * 星座
     */
    private String xingZuo;
    /**
     * 宿
     */
    private String xiu;
    /**
     * 宿吉凶
     */
    private String xiuJiXiong;
    /**
     * 宿吉凶歌诀
     */
    private String xiuJiXiongGeJue;
    /**
     * 星宿
     */
    private String xingXiu;
    /**
     * 命
     */
    private String ming;
    /**
     * 命卦
     */
    private List<String> mingGua;
    /**
     * 日柱论命
     */
    private String dayZhuLunMing;
    /**
     * 姻缘
     */
    private String yinYuan;
    /**
     * 骨重
     */
    private String guZhong;
    /**
     * 骨重信息
     */
    private String guZhongInfo;
    /**
     * 五行分析
     */
    private String wuXingFenXi;

    /**
     * 大运
     */
    private List<List<String>> daYun;
    /**
     * 小运
     */
    private List<List<String>> xiaoYun;
    /**
     * 流年
     */
    private List<List<String>> liuNian;
    /**
     * 流月
     */
    private List<List<String>> liuYue;

    /**
     * 大运十神
     */
    private List<List<String>> daYunShiShen;
    /**
     * 小运十神
     */
    private List<List<String>> xiaoYunShiShen;
    /**
     * 流年十神
     */
    private List<List<String>> liuNianShiShen;
    /**
     * 流月十神
     */
    private List<List<String>> liuYueShiShen;

    /**
     * 正财运年份、年龄、干支
     */
    private List<List<String>> zhengCaiYun;
    /**
     * 偏财运年份、年龄、干支
     */
    private List<List<String>> pianCaiYun;
    /**
     * 正桃花年份、年龄、干支
     */
    private List<List<String>> zhengTaoHua;
    /**
     * 偏桃花年份、年龄、干支
     */
    private List<List<String>> pianTaoHua;

    /**
     * 大运运势
     */
    private List<List<String>> daYunYunShi;
    /**
     * 流年运势
     */
    private List<List<String>> liuNianYunShi;

//****************************************************************************************************************************************************

    /**
     * 使用默认设置计算（默认使用当前公历日期）
     */
    public BaZi() {
        core(new BaZiSetting());
    }

    /**
     * 使用公历日期初始化
     *
     * @param date 公历日期
     */
    public BaZi(Date date) {
        core(new BaZiSetting(date));
    }

    /**
     * 使用日期、日期类型初始化
     *
     * @param date     日期
     * @param dateType 日期类型（0:公历。1:农历）
     */
    public BaZi(Date date, int dateType) {
        core(new BaZiSetting(date, dateType));
    }

    /**
     * 使用公历年月日时分秒初始化
     *
     * @param year   年（1~9999）
     * @param month  月（1~12）
     * @param day    日
     * @param hour   时（0~24）
     * @param minute 分（0~60）
     * @param second 秒（0~60）
     */
    public BaZi(int year, int month, int day, int hour, int minute, int second) {
        core(new BaZiSetting(year, month, day, hour, minute, second));
    }

    /**
     * 使用自定义设置初始化
     *
     * @param setting 八字-设置
     */
    public BaZi(BaZiSetting setting) {
        core(setting);
    }

//====================================================================================================================================================

    /**
     * 获取并设置数据（★核心）
     *
     * @param setting 八字-设置
     */
    private void core(BaZiSetting setting) {

        // 初始化自定义数据
        initialize(setting);

        // 计算数据
        baZi(); // 计算八字
        baZiWuXing(); // 计算八字五行
        baZiNaYin(); // 计算八字纳音
        baZiXunKong(); // 计算八字旬空
        zhuXing(setting); // 计算主星
        diZhiCangGan(); // 计算地支藏干
        fuXing(); // 计算副星
        diShi(); // 计算地势
        shenSha(setting); // 计算并封装四柱神煞
        baZiWuXingQueShi(); // 计算八字五行缺失
        baZiWuXingGeJu(); // 计算八字五行格局
        bodyIntensity(); // 计算身体强弱
        xiYongShen(); // 计算喜用神
        xiYongShenFangWei(); // 计算喜用神方位
        wuXingWangShuai(); // 计算五行旺衰
        tianGanLiuYi(); // 计算天干留意
        diZhiLiuYi(); // 计算地支留意
        taiGong(); // 计算胎元、胎息、命宫、身宫
        qiYun(setting); // 计算起运
        shengXiaoXingZuo(setting); // 计算生肖、星座
        xiu(); // 计算宿、宿吉凶、宿吉凶歌诀、星宿
        ming(setting); // 计算命、命卦
        dayZhuLunMing(); // 日柱论命
        yinYuan(); // 姻缘
        guZhong(setting); // 运程
        wuXingFenXi(); // 五行分析
        DaYun[] daYun = daYun(setting);// 计算大运及大运十神
        xiaoYun(daYun); // 计算小运及小运十神
        LiuNian[] liuNian = liuNian(daYun);// 计算流年及流年十神
        liuYue(liuNian); // 计算流月及流月十神
        caiYun(); // 计算财运年份、年龄、干支
        taoHua(setting); // 计算桃花年份、年龄、干支
        daYunYunShi(); // 大运运势
        liuNianYunShi(); // 流年运势

    }

    /**
     * 初始化自定义数据
     *
     * @param setting 八字-设置
     */
    private void initialize(BaZiSetting setting) {

        // 1.1、判断日期类型并返回公历日期、农历日期
        Map<String, Object> dateMap = BaZiUtil.isDateType(setting);
        // 1.2、设置日期数据
        this.solar = (Solar) dateMap.get("solar"); // 设置公历日期
        this.lunar = (Lunar) dateMap.get("lunar"); // 设置农历日期

        // 2、设置星期
        this.week = "周" + getLunar().getWeekInChinese();

        // 3.1、判断干支设置并返回干支
        Map<String, List<String>> ganZhiMap = BaZiUtil.isGanZhi(setting, getSolar().getLunar());
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

        this.yearGanZhiWuXing = ec.getYearWuXing();   // 年干支五行
        this.monthGanZhiWuXing = ec.getMonthWuXing(); // 月干支五行
        this.dayGanZhiWuXing = ec.getDayWuXing();     // 日干支五行
        this.hourGanZhiWuXing = ec.getTimeWuXing();   // 时干支五行

        this.yearGanWuXing = getYearGanZhiWuXing().substring(0, 1);   // 年干五行
        this.monthGanWuXing = getMonthGanZhiWuXing().substring(0, 1); // 月干五行
        this.dayGanWuXing = getDayGanZhiWuXing().substring(0, 1);     // 日干五行
        this.hourGanWuXing = getHourGanZhiWuXing().substring(0, 1);   // 时干五行

        this.yearZhiWuXing = getYearGanZhiWuXing().substring(1, 2);   // 年支五行
        this.monthZhiWuXing = getMonthGanZhiWuXing().substring(1, 2); // 月支五行
        this.dayZhiWuXing = getDayGanZhiWuXing().substring(1, 2);     // 日支五行
        this.hourZhiWuXing = getHourGanZhiWuXing().substring(1, 2);   // 时支五行

        this.baZiWuXing = Arrays.asList(ec.getYearWuXing(), ec.getMonthWuXing(), ec.getDayWuXing(), ec.getTimeWuXing());

    }

    /**
     * 计算八字纳音
     */
    private void baZiNaYin() {

        EightChar ec = getLunar().getEightChar();

        this.yearGanZhiNaYin = ec.getYearNaYin();   // 年干支纳音
        this.monthGanZhiNaYin = ec.getMonthNaYin(); // 月干支纳音
        this.dayGanZhiNaYin = ec.getDayNaYin();     // 日干支纳音
        this.hourGanZhiNaYin = ec.getTimeNaYin();   // 时干支纳音

        this.baZiNaYin = Arrays.asList(ec.getYearNaYin(), ec.getMonthNaYin(), ec.getDayNaYin(), ec.getTimeNaYin());

    }

    /**
     * 计算八字旬空
     */
    private void baZiXunKong() {

        EightChar ec = getLunar().getEightChar();

        this.yearGanZhiXunKong = ec.getYearXunKong();   // 年干支旬空
        this.monthGanZhiXunKong = ec.getMonthXunKong(); // 月干支旬空
        this.dayGanZhiXunKong = ec.getDayXunKong();     // 日干支旬空
        this.hourGanZhiXunKong = ec.getTimeXunKong();   // 时干支旬空

        this.baZiXunKong = Arrays.asList(ec.getYearXunKong(), ec.getMonthXunKong(), ec.getDayXunKong(), ec.getTimeXunKong());

    }

    /**
     * 计算主星
     *
     * @param setting 八字-设置
     */
    private void zhuXing(BaZiSetting setting) {

        /*
            ★计算方法：根据日干与年干、月干、时干的生克关系得出

            ========================================================================================

                                               十神生克关系

                1、生我者为印缓（五行阴阳属性相同则为：偏印，五行阴阳属性不同则为：正印）
                2、我生者为子孙（五行阴阳属性相同则为：食神，五行阴阳属性不同则为：伤官）
                3、克我者为官鬼（五行阴阳属性相同则为：七杀，五行阴阳属性不同则为：正官）
                4、我克者为妻财（五行阴阳属性相同则为：偏财，五行阴阳属性不同则为：正财）
                5、同我者为兄弟（五行阴阳属性相同则为：比肩，五行阴阳属性不同则为：劫财）
         */

        EightChar ec = getLunar().getEightChar();

        this.yearGanZhiZhuXing = ec.getYearShiShenGan(); // 年干支主星
        this.monthGanZhiZhuXing = ec.getMonthShiShenGan(); // 月干支主星
        if (setting.getSex() == 1) this.dayGanZhiZhuXing = "元男"; // 日干支主星：元男
        if (setting.getSex() == 0) this.dayGanZhiZhuXing = "元女"; // 日干支主星：元女
        this.hourGanZhiZhuXing = ec.getTimeShiShenGan(); // 时干支主星

    }

    /**
     * 计算地支藏干
     */
    private void diZhiCangGan() {

        /*
                 《十二地支藏干口诀》

            子宫壬癸在其中，丑癸辛金己土同；
            寅宫甲木兼丙戊，卯宫甲乙木相逢，
            辰藏乙戊三分癸，已中庚金丙戊丛；
            午宫丙丁火己土，未宫乙己丁共宗；
            申位庚金壬水戊，酉宫庚辛金丰隆；
            戌宫辛金及丁戊，亥藏壬甲戊真踪。

            =========================================================================

            ★解释：
                1、 子：藏干为癸水。
                2、 丑：藏干为已土、癸水、辛金。（已土为本气，癸水为中气，辛金为余气）
                3、 寅：藏干为甲木、丙火、戊土。（甲木为本气，丙火为中气，戊土为余气）
                4、 卯：藏干为乙木。
                5、 辰：藏干为戊土、乙木、癸水。（戊土为本气，乙木为中气，癸水为余气）
                6、 已：藏干为丙火、庚金、戊土。（丙火为本气，庚金为中气，戊土为余气）
                7、 午：藏干为丁火、已土。（丁火为本气，已土为中气）
                8、 未：藏干为已土、丁火、乙木。（已土为本气，丁火为中气，乙木为余气）
                9、 申：藏干为庚金、壬水、戊土。（庚金为本气，壬水为中气，戊土为余气）
                10、酉：藏干为辛金。
                11、戌：藏干为戊土、辛金、丁火。（戊土为本气，辛金为中气，丁火为余气）
                12、亥：藏干为壬水、甲木。（壬水为本气，甲木为中气）
        */

        EightChar ec = getLunar().getEightChar();
        this.yearZhiCangGan = ec.getYearHideGan(); // 年支藏干
        this.monthZhiCangGan = ec.getMonthHideGan(); // 月支藏干
        this.dayZhiCangGan = ec.getDayHideGan(); // 日支藏干
        this.hourZhiCangGan = ec.getTimeHideGan(); // 时支藏干

    }

    /**
     * 计算副星
     */
    private void fuXing() {

        /*
            ★根据日干与年支藏干、月支藏干、日支藏干、时支藏干得出

            ===========================================================================

            十神的生克关系：
                1、生我者为印缓（五行阴阳属性相同则为：偏印，五行阴阳属性不同则为：正印）
                2、我生者为子孙（五行阴阳属性相同则为：食神，五行阴阳属性不同则为：伤官）
                3、克我者为官鬼（五行阴阳属性相同则为：七杀，五行阴阳属性不同则为：正官）
                4、我克者为妻财（五行阴阳属性相同则为：偏财，五行阴阳属性不同则为：正财）
                5、同我者为兄弟（五行阴阳属性相同则为：比肩，五行阴阳属性不同则为：劫财）
         */

        EightChar ec = getLunar().getEightChar();
        this.yearGanZhiFuXing = ec.getYearShiShenZhi(); // 年干支副星
        this.monthGanZhiFuXing = ec.getMonthShiShenZhi(); // 月干支副星
        this.dayGanZhiFuXing = ec.getDayShiShenZhi(); // 日干支副星
        this.hourGanZhiFuXing = ec.getTimeShiShenZhi(); // 时干支副星

    }

    /**
     * 计算地势
     */
    private void diShi() {

        EightChar ec = getLunar().getEightChar();

        this.yearGanZhiDiShi = ec.getYearDiShi(); // 年干支地势
        this.monthGanZhiDiShi = ec.getMonthDiShi(); // 月干支地势
        this.dayGanZhiDiShi = ec.getDayDiShi(); // 日干支地势
        this.hourGanZhiDiShi = ec.getTimeDiShi(); // 时干支地势

    }

    /**
     * 计算八字五行缺失
     */
    private void baZiWuXingQueShi() {

        Map<String, String> ganW = BaZiMaps.GAN_WU_XING; // 天干五行
        Map<String, String> zhiW = BaZiMaps.ZHI_WU_XING; // 地支五行

        // 1、添加八字五行数据
        Set<String> set = new HashSet<>(Arrays.asList(
                ganW.get(getYearGan()), ganW.get(getMonthGan()), ganW.get(getDayGan()), ganW.get(getHourGan()),
                zhiW.get(getYearZhi()), zhiW.get(getMonthZhi()), zhiW.get(getDayZhi()), zhiW.get(getHourZhi())
        ));
        List<String> list = new ArrayList<>(set); // set转list

        // 2、判断五行是否无缺失
        List<String> baZiWuXingQueShi = new ArrayList<>();
        if (list.size() == 5) {
            baZiWuXingQueShi.add("五行齐全");
            this.baZiWuXingQueShi = baZiWuXingQueShi;
            return;
        }

        // 3.1、初始化五行
        List<String> wuXingList = Arrays.asList("木", "火", "土", "金", "水");
        // 3.2、获取并设置缺失的五行
        baZiWuXingQueShi = CommonUtil.getListUnlike(list, wuXingList);
        this.baZiWuXingQueShi = baZiWuXingQueShi;

    }

    /**
     * 计算八字五行格局
     */
    private void baZiWuXingGeJu() {

        // 1.1、添加干支五行
        List<String> ganZHiWuXingList = Arrays.asList(
                getYearGanWuXing(), getMonthGanWuXing(), getDayGanWuXing(), getHourGanWuXing(),
                getYearZhiWuXing(), getMonthZhiWuXing(), getDayZhiWuXing(), getHourZhiWuXing()
        );
        // 1.2、获取八字五行中出现的重复元素及出现次数
        Map<String, Integer> map = CommonUtil.getListIdentical(ganZHiWuXingList);

        // 2、保存五行格局数据
        List<String> baZiWuXingGeJu = new ArrayList<>();
        for (String key : map.keySet()) {
            baZiWuXingGeJu.add(map.get(key) + key);
        }

        this.baZiWuXingGeJu = baZiWuXingGeJu;

    }

    /**
     * 计算身体强弱（如：身强）
     */
    private void bodyIntensity() {

        /*
            根据[日元]和[月令]之间的五行生克关系计算（日元：日干。月令：月支）

              1、解释：日元代表自己，月令代表父母或兄弟。
              2、口诀：同我、生我为强；克我、我生、我克为弱。

            TODO：此处只采用[日元]和[月令]之间的五行生克关系、[日元]和[其他干支]之间的算分进行计算，暂不考虑其他因素。
         */

        Map<String, String> shengKe = BaZiMaps.GAN_ZHI_WU_XING_SHENG_KE; // 天干和干支的五行生克关系

        // 1、判断身体强弱（根据[日元]和[月令]之间的五行生克关系计算）
//        String bodyIntensity = shengKe.get(getDayGan() + getMonthZhi());
//        System.out.println("身体强弱：" + bodyIntensity);

        // 2、判断身体强弱（根据算分计算）
        int jiaFen = 0; // 加分
        // 2.1、通过日元（日干）与年干的五行生克关系算出加分
        jiaFen += jiaFen(shengKe, getDayGan(), getYearGan(), 8); // 年干统一为8分
        // 2.2、通过日元（日干）与年支的五行生克关系算出加分
        jiaFen += jiaFen(shengKe, getDayGan(), getYearZhi(), 4); // 年支统一为4分
        // 2.3、通过日元（日干）与月干的五行生克关系算出加分
        jiaFen += jiaFen(shengKe, getDayGan(), getMonthGan(), 12); // 月干统一为12分
        // 2.4、通过日元（日干）与月支的五行生克关系算出加分
        jiaFen += jiaFen(shengKe, getDayGan(), getMonthZhi(), 40); // 月支统一为40分
        // 2.5、通过日元（日干）与日支的五行生克关系算出加分
        jiaFen += jiaFen(shengKe, getDayGan(), getDayZhi(), 12); // 日支统一为12分
        // 2.6、通过日元（日干）与时干的五行生克关系算出加分
        jiaFen += jiaFen(shengKe, getDayGan(), getHourGan(), 12); // 时干统一为12分
        // 2.7、通过日元（日干）与时支的五行生克关系算出加分
        jiaFen += jiaFen(shengKe, getDayGan(), getHourZhi(), 12); // 时支统一为12分

        // 3.1、若加分等于50，身体强弱为：平衡（中庸之道）
        if (jiaFen == 50) {
            this.bodyIntensity = "平衡"; // 平衡（中庸之道）
        }
        // 3.2、若加分>=40且<=60，身体强弱为：接近平衡（中庸之道）
        if (jiaFen >= 40 && jiaFen <= 60) {
            this.bodyIntensity = "接近平衡"; // 接近平衡（中庸之道）
        }
        // 3.3、若加分小于40，身体强弱为：身弱
        if (jiaFen < 40) {
            this.bodyIntensity = "身弱"; // 身弱
            return;
        }
        // 3.4、若加分大于60，身体强弱为：身强
        if (jiaFen > 60) {
            this.bodyIntensity = "身强"; // 身强
        }

    }

    /**
     * 计算喜用神
     */
    private void xiYongShen() {

        /*
            身强的喜用神：克我、我生、我克的干支。
            身弱的喜用神：同我、生我的干支。
        */

        Set<String> set = new HashSet<>();
        Map<String, String> ganWuXing = BaZiMaps.GAN_WU_XING; // 天干五行
        Map<String, String> zhiWuXing = BaZiMaps.ZHI_WU_XING; // 地支五行
        Map<String, String> shengKe = BaZiMaps.GAN_ZHI_WU_XING_SHENG_KE;// 天干和干支的五行生克关系

        // 1、若身强，则寻找：克我、我生、我克的干支
        if ("身强".equals(getBodyIntensity())) {
            // 1.1、判断日元（日干）与年干的五行生克关系
            if ("身弱".equals(shengKe.get(getDayGan() + getYearGan()))) set.add(ganWuXing.get(getYearGan())); // 添加年干五行
            // 1.2、判断日元（日干）与年支的五行生克关系
            if ("身弱".equals(shengKe.get(getDayGan() + getYearZhi()))) set.add(zhiWuXing.get(getYearZhi())); // 添加年支五行
            // 1.3、判断日元（日干）与月干的五行生克关系
            if ("身弱".equals(shengKe.get(getDayGan() + getMonthGan()))) set.add(ganWuXing.get(getMonthGan())); // 添加月干五行
            // 1.4、判断日元（日干）与月支的五行生克关系
            if ("身弱".equals(shengKe.get(getDayGan() + getMonthZhi()))) set.add(zhiWuXing.get(getMonthZhi())); // 添加月支五行
            // 1.5、判断日元（日干）与日干的五行生克关系
            if ("身弱".equals(shengKe.get(getDayGan() + getDayGan()))) set.add(ganWuXing.get(getDayGan())); // 添加日干五行
            // 1.6、判断日元（日干）与日支的五行生克关系
            if ("身弱".equals(shengKe.get(getDayGan() + getDayZhi()))) set.add(zhiWuXing.get(getDayZhi())); // 添加日支五行
            // 1.7、判断日元（日干）与时干的五行生克关系
            if ("身弱".equals(shengKe.get(getDayGan() + getHourGan()))) set.add(ganWuXing.get(getHourGan())); // 添加时干五行
            // 1.8、判断日元（日干）与时支的五行生克关系
            if ("身弱".equals(shengKe.get(getDayGan() + getHourZhi()))) set.add(zhiWuXing.get(getHourZhi())); // 添加时支五行
            this.xiYongShen = new ArrayList<>(set);
            return;
        }

        // 2、若身弱，则寻找：同我、生我的干支
        if ("身弱".equals(getBodyIntensity())) {
            // 2.1、判断日元（日干）与年干的五行生克关系
            if ("身强".equals(shengKe.get(getDayGan() + getYearGan()))) set.add(ganWuXing.get(getYearGan())); // 添加年干的五行
            // 2.2、判断日元（日干）与年支的五行生克关系
            if ("身强".equals(shengKe.get(getDayGan() + getYearZhi()))) set.add(zhiWuXing.get(getYearZhi())); // 添加年支的五行
            // 2.3、判断日元（日干）与月干的五行生克关系
            if ("身强".equals(shengKe.get(getDayGan() + getMonthGan()))) set.add(ganWuXing.get(getMonthGan())); // 添加月干的五行
            // 2.4、判断日元（日干）与月支的五行生克关系
            if ("身强".equals(shengKe.get(getDayGan() + getMonthZhi()))) set.add(zhiWuXing.get(getMonthZhi())); // 添加月支的五行
            // 2.5、判断日元（日干）与日干的五行生克关系
            if ("身强".equals(shengKe.get(getDayGan() + getDayGan()))) set.add(ganWuXing.get(getDayGan())); // 添加日干五行
            // 2.6、判断日元（日干）与日支的五行生克关系
            if ("身强".equals(shengKe.get(getDayGan() + getDayZhi()))) set.add(zhiWuXing.get(getDayZhi())); // 添加日支的五行
            // 2.7、判断日元（日干）与时干的五行生克关系
            if ("身强".equals(shengKe.get(getDayGan() + getHourGan()))) set.add(ganWuXing.get(getHourGan())); // 添加时干的五行
            // 2.8、判断日元（日干）与时支的五行生克关系
            if ("身强".equals(shengKe.get(getDayGan() + getHourZhi()))) set.add(zhiWuXing.get(getHourZhi())); // 添加时支的五行
            this.xiYongShen = new ArrayList<>(set);
            return;
        }

        // 3、若身体为平衡或接近平衡，则使用具体法获取喜用神
        String season = getLunar().getSeason().substring(1, 2); // 获取季节简称（如：春）
        int lunarMonth = getLunar().getMonth(); // 农历月
        if (lunarMonth == 3 || lunarMonth == 6 || lunarMonth == 9 || lunarMonth == 12) season = "四季末";
        Map<String, List<String>> map = BaZiMaps.XI_YONG_SHEN; // 具体法获取喜用神（天干+季节为键）
        this.xiYongShen = map.get(getDayGan() + season);

    }

    /**
     * 计算喜用神方位
     */
    private void xiYongShenFangWei() {

        List<String> list = new ArrayList<>();
        Map<String, List<String>> wuXingFangWei = BaZiMaps.WU_XING_FANG_WEI; // 五行对应方位
        for (int i = 0; i < getXiYongShen().size(); i++) {
            String xiYongShen = getXiYongShen().get(i); // 每一个喜用神的方位
            List<String> xiYongFangWei = wuXingFangWei.get(xiYongShen);
            list.addAll(xiYongFangWei); // 保存所有喜用神的方位
        }
        this.xiYongShenFangWei = list;

    }

    /**
     * 计算五行旺衰
     */
    private void wuXingWangShuai() {

        Map<String, List<String>> wangShuai = BaZiMaps.WU_XING_WANG_SHUAI; // 五行旺衰（按月支判断）
        this.wuXingWangShuai = wangShuai.get(getMonthZhi());

    }

    /**
     * 计算天干留意
     */
    private void tianGanLiuYi() {

        Set<String> set = new HashSet<>();

        // 1、判断天干相生
        Map<String, String> xiangSheng = BaZiMaps.TIAN_GAN_XIANG_SHENG; // 天干相生（天干+天干为键）
        saveTianGanLiuYi(set, xiangSheng);

        // 2、判断天干相合
        Map<String, String> xiangHe = BaZiMaps.TIAN_GAN_XIANG_HE; // 天干相合（天干+天干为键）
        saveTianGanLiuYi(set, xiangHe);

        // 3、判断天干相冲
        Map<String, String> xiangChong = BaZiMaps.TIAN_GAN_XIANG_CHONG; // 天干相冲（天干+天干为键）
        saveTianGanLiuYi(set, xiangChong);

        // 4、判断天干相克
        Map<String, String> xiangKe = BaZiMaps.TIAN_GAN_XIANG_KE; // 天干相克（天干+天干为键）
        saveTianGanLiuYi(set, xiangKe);

        set.removeIf(Objects::isNull); // 删除所有null
        this.tianGanLiuYi = new ArrayList<>(set);

    }

    /**
     * 地支留意
     */
    private void diZhiLiuYi() {

        Set<String> set = new HashSet<>();

        // 1、判断地支三合
        Map<String, String> sanHe = BaZiMaps.DI_ZHI_SAN_HE; // 地支三合（地支+地支为键）
        saveDiZhiLiuYi(set, sanHe);

        // 2、判断地支六合
        Map<String, String> liuHe = BaZiMaps.DI_ZHI_LIU_HE; // 地支六合（地支+地支为键）
        saveDiZhiLiuYi(set, liuHe);

        // 3、判断地支相冲
        Map<String, String> xiangChong = BaZiMaps.DI_ZHI_XIANG_CHONG; // 地支相冲（地支+地支为键）
        saveDiZhiLiuYi(set, xiangChong);

        // 4、判断地支相破
        Map<String, String> xiangPo = BaZiMaps.DI_ZHI_XIANG_PO; // 地支相破（地支+地支为键）
        saveDiZhiLiuYi(set, xiangPo);

        // 5、判断地支相害
        Map<String, String> xiangHai = BaZiMaps.DI_ZHI_XIANG_HAI; // 地支相害（地支+地支为键）
        saveDiZhiLiuYi(set, xiangHai);

        set.removeIf(Objects::isNull); // 删除所有null
        this.diZhiLiuYi = new ArrayList<>(set);

    }

    /**
     * 计算胎元、胎息、命宫、身宫
     */
    private void taiGong() {

        EightChar eightChar = getLunar().getEightChar();

        this.taiYuan = eightChar.getTaiYuan(); // 胎元
        this.taiXi = eightChar.getTaiXi(); // 胎息
        this.mingGong = eightChar.getMingGong(); // 命宫
        this.shenGong = eightChar.getShenGong(); // 身宫
        this.taiYuanNaYin = eightChar.getTaiYuanNaYin(); // 胎元纳音
        this.taiXiNaYin = eightChar.getTaiXiNaYin(); // 胎息纳音
        this.mingGongNaYin = eightChar.getMingGongNaYin(); // 命宫纳音
        this.shenGongNaYin = eightChar.getShenGongNaYin(); // 身宫纳音

    }

    /**
     * 计算起运
     *
     * @param setting 八字-设置
     */
    private void qiYun(BaZiSetting setting) {

        EightChar ec = getLunar().getEightChar();
        ec.setSect(setting.getDayGanZhiSet()); // 日干支设置，同子时流派（0:晚子时日柱按明天。1:晚子时日柱按当天）

        // 初始化运（设置性别、起运流派）
        Yun yun = ec.getYun(setting.getSex(), setting.getQiYunLiuPai() + 1);

        String qiYun = "出生";
        if (yun.getStartYear() != 0) qiYun += yun.getStartYear() + "年";
        if (yun.getStartMonth() != 0) qiYun += yun.getStartMonth() + "个月";
        if (yun.getStartDay() != 0) qiYun += yun.getStartDay() + "天";
        if (yun.getStartHour() != 0) qiYun += yun.getStartHour() + "分钟";
        qiYun += "后开始起运";

        this.qiYun = qiYun;
        this.qiYunDate = yun.getStartSolar().toYmdHms();

    }

    /**
     * 计算生肖、星座
     *
     * @param setting 八字-设置
     */
    private void shengXiaoXingZuo(BaZiSetting setting) {

        // 1、设置生肖
        if (setting.getYearGanZhiSet() == 0) {
            this.shengXiao = getLunar().getYearShengXiao(); // 以正月初一起算
        } else if (setting.getYearGanZhiSet() == 1) {
            this.shengXiao = getLunar().getYearShengXiaoByLiChun(); // 以立春当天起算
        } else if (setting.getYearGanZhiSet() == 2) {
            this.shengXiao = getLunar().getYearShengXiaoExact(); // 以立春交接时刻起算
        }

        // 2、设置星座
        this.xingZuo = getSolar().getXingZuo() + "座";

    }

    /**
     * 计算宿、宿吉凶、宿吉凶歌诀、星宿
     */
    private void xiu() {

        Lunar lunar = getLunar();

        this.xiu = lunar.getXiu(); // 宿
        this.xiuJiXiong = lunar.getXiuLuck(); // 宿吉凶
        this.xiuJiXiongGeJue = lunar.getXiuSong(); // 宿歌诀
        this.xingXiu = lunar.getXiu() + "宿" + lunar.getGong() + "方" + lunar.getShou(); // 星宿

    }

    /**
     * 计算命、命卦
     *
     * @param setting 八字-设置
     */
    private void ming(BaZiSetting setting) {

        /*
            一、男命：
                1、年份中的每一个数字（例如：2000年→ 2+0+0+0=2）。
                2、相加得到数字A（例如：2）。
                3、用得到数字A的每一个数字相加再得到数字B（例如：2）。
                4、若数字B小于10，则使用(11-数字B);若数字B大于10，则使用(数字B-11)。

            二、女命：
                1、年份中的每一个数字（例如：2000年→ 2+0+0+0=2）。
                2、相加得到一个数字A（例如：2）。
                3、用数字A+4得到数字B（例如：2+4=6）。
                4、若数字B大于9，再用数字B-9；如没有余数或除尽则视为9。
         */

        // 1、计算命
        this.ming = getYearGanZhiNaYin() + "命";

        Map<Integer, List<String>> mingGua = BaZiMaps.MING_GUA; // 命卦

        // 2、计算年份合数
        int yearCount = 0; // 年份合数
        String yearStr = String.valueOf(getSolar().getYear());
        for (int i = 0; i < yearStr.length(); i++) {
            yearCount += Integer.parseInt(yearStr.split("")[i]);
        }

        // 3、男命
        if (setting.getSex() == 1) {
            // 3.1、若年份合数大于10，则继续使用年份合数相加，直至小于10为止
            while (true) {
                if (yearCount > 10) {
                    String yearCountStr = String.valueOf(yearCount);
                    yearCount = 0;
                    for (int i = 0; i < yearCountStr.length(); i++) {
                        yearCount += Integer.parseInt(yearCountStr.split("")[i]);
                    }
                } else break;
            }
            // 3.2、使用（11-数字之和）得出男命命卦宫位
            this.mingGua = mingGua.get(11 - yearCount);
        } else {
            // 4、女命
            int womManMingGuaGong = yearCount + 4; // 数字B
            // 4.1、若数字B大于9，再用数字B-9；如没有余数或除尽则视为9
            while (true) {
                if (womManMingGuaGong > 9) {
                    womManMingGuaGong -= 9;
                } else break;
            }
            // 4.2、得出女命命卦宫位
            this.mingGua = mingGua.get(womManMingGuaGong);
        }

    }

    /**
     * 日柱论命
     */
    private void dayZhuLunMing() {

        Map<String, String> lunMing = BaZiMaps.DAY_ZHU_LUN_MING; // 日柱论命（日柱为键）
        this.dayZhuLunMing = lunMing.get(getDayGanZhi());

    }

    /**
     * 姻缘
     */
    private void yinYuan() {

        Map<String, String> map = BaZiMaps.YIN_YUAN; // 姻缘（日干支纳音+农历月份为键）

        String dayGanZhiNaYin = getDayGanZhiNaYin().substring(2, 3); // 日干支纳音（如：木）
        int lunarMonth = getLunar().getMonth(); // 农历月份
        if (lunarMonth < 0) lunarMonth = -lunarMonth; // 月份若为负数则转为正数

        this.yinYuan = map.get(dayGanZhiNaYin + lunarMonth);

    }

    /**
     * 骨重
     *
     * @param setting 八字-设置
     */
    private void guZhong(BaZiSetting setting) {

        Map<String, Double> yearMap = BaZiMaps.YEAR_GU_ZHONG; // 出生年骨重
        Map<String, Double> monthMap = BaZiMaps.MONTH_GU_ZHONG; // 出生月骨重
        Map<String, Double> dayMap = BaZiMaps.DAY_GU_ZHONG; // 出生日骨重
        Map<String, Double> hourMap = BaZiMaps.HOUR_GU_ZHONG; // 出生时辰骨重

        Double yearGuZhong = yearMap.get(getYearGanZhi()); // 出生年骨重
        Double monthGuZhong = monthMap.get(String.valueOf(getLunar().getMonth() < 0 ? -getLunar().getMonth() : getLunar().getMonth())); // 出生月骨重
        Double dayGuZhong = dayMap.get(String.valueOf(getLunar().getDay())); // 出生日骨重
        Double hourGuZhong = hourMap.get(getHourZhi()); // 出生时辰骨重

        double guZhong = yearGuZhong + monthGuZhong + dayGuZhong + hourGuZhong; // 命主骨重
        guZhong = CommonUtil.getDouble(guZhong, 1); // 保留一位小数
        if (guZhong < 2.1) guZhong = 2.1; // 男命和女命的最轻命

        // 1、男命
        if (setting.getSex() == 1) {
            if (guZhong > 7.2) guZhong = 7.2; // 男命的最重命
            Map<Double, String> yunChengWan = BaZiMaps.YUN_CHENG_WAN; // 骨重批注（男命运程）
            this.guZhong = guZhongCharacters(guZhong); // 骨重转为文字
            this.guZhongInfo = yunChengWan.get(guZhong);
        } else {
            // 2、女命
            if (guZhong > 7.1) guZhong = 7.1; // 女命的最重命
            Map<Double, String> yunChengWan = BaZiMaps.YUN_CHENG_WOMAN; // 骨重批注（女命运程）
            this.guZhong = guZhongCharacters(guZhong); // 骨重转为文字
            this.guZhongInfo = yunChengWan.get(guZhong);
        }

    }

    /**
     * 五行分析
     */
    private void wuXingFenXi() {

        String yearGanZhiNaYin = getYearGanZhiNaYin().substring(2, 3); // 年干支纳音（如：木）
        Map<String, String> wuXingFenXi = BaZiMaps.WU_XING_FEN_XI; // 五行分析（根据年柱纳音五行计算）
        this.wuXingFenXi = "命主生于" + getYearGanZhi() + "年为" + getYearGanZhiNaYin() + "命，" + wuXingFenXi.get(yearGanZhiNaYin);

    }

    /**
     * 计算大运及大运十神
     *
     * @param setting 八字-设置
     */
    private DaYun[] daYun(BaZiSetting setting) {

        EightChar eightChar = getLunar().getEightChar();

        // 初始化运
        Yun yun = eightChar.getYun(setting.getSex(), setting.getQiYunLiuPai());

        List<List<String>> daYunList = new ArrayList<>(); // 大运
        List<List<String>> daYunShiShenList = new ArrayList<>(); // 大运十神

        // 获取指定轮数的大运
        DaYun[] daYun = yun.getDaYun(10);
        for (DaYun key : daYun) {
            // 添加大运
            daYunList.add(new ArrayList<>(Arrays.asList(String.valueOf(key.getStartYear()), String.valueOf(key.getStartAge()), key.getGanZhi())));
            // 添加大运十神
            if (!"".equals(key.getGanZhi())) {
                List<String> shiShen = getShiShen(key.getGanZhi());
                daYunShiShenList.add(shiShen);
            } else {
                daYunShiShenList.add(Arrays.asList("", ""));
            }
        }

        this.daYun = daYunList; // 大运
        this.daYunShiShen = daYunShiShenList; // 大运十神

        return daYun;

    }

    /**
     * 计算小运及小运十神
     *
     * @param daYun 大运
     */
    private void xiaoYun(DaYun[] daYun) {

        List<List<String>> xiaoYunList = new ArrayList<>(); // 小运
        List<List<String>> xiaoYunShiShenList = new ArrayList<>(); // 小运十神

        // 遍历大运
        for (DaYun key : daYun) {
            // 获取10轮小运
            XiaoYun[] xiaoYun = key.getXiaoYun(10);
            for (XiaoYun xy : xiaoYun) {
                // 添加小运
                xiaoYunList.add(new ArrayList<>(Arrays.asList(String.valueOf(xy.getYear()), String.valueOf(xy.getAge()), xy.getGanZhi())));
                // 添加小运十神
                List<String> shiShen = getShiShen(xy.getGanZhi());
                xiaoYunShiShenList.add(shiShen);
            }
        }

        this.xiaoYun = xiaoYunList; // 小运
        this.xiaoYunShiShen = xiaoYunShiShenList; // 小运十神

    }

    /**
     * 计算流年及流年十神
     *
     * @param daYun 大运
     */
    private LiuNian[] liuNian(DaYun[] daYun) {

        List<List<String>> liuNianList = new ArrayList<>(); // 流年
        List<List<String>> liuNianShiShenList = new ArrayList<>(); // 流年十神

        LiuNian[] liuNian = new LiuNian[]{};

        // 遍历大运
        for (DaYun key : daYun) {
            // 获取10轮流年
            liuNian = key.getLiuNian(10);
            for (LiuNian ln : liuNian) {
                // 添加流年
                liuNianList.add(new ArrayList<>(Arrays.asList(String.valueOf(ln.getYear()), String.valueOf(ln.getAge()), ln.getGanZhi())));
                // 添加流年十神
                List<String> shiShen = getShiShen(ln.getGanZhi());
                liuNianShiShenList.add(shiShen);
            }
        }

        this.liuNian = liuNianList; // 流年
        this.liuNianShiShen = liuNianShiShenList; // 流年十神

        return liuNian;

    }

    /**
     * 计算流月及流月十神
     *
     * @param liuNian 流年
     */
    private void liuYue(LiuNian[] liuNian) {

        List<List<String>> liuYueList = new ArrayList<>(); // 流月
        List<List<String>> liuYueShiShenList = new ArrayList<>(); // 流月十神

        // 遍历流年
        for (LiuNian ln : liuNian) {
            // 获取流月
            LiuYue[] liuYue = ln.getLiuYue();
            for (LiuYue key : liuYue) {
                // 添加流月
                liuYueList.add(new ArrayList<>(Arrays.asList(key.getMonthInChinese() + "月", key.getGanZhi())));
                // 添加流月十神
                List<String> shiShen = getShiShen(key.getGanZhi());
                liuYueShiShenList.add(shiShen);
            }
        }

        this.liuYue = liuYueList; // 流月
        this.liuYueShiShen = liuYueShiShenList; // 流月十神

    }

    /**
     * 计算财运年份、年龄、干支
     */
    private void caiYun() {

        String dayGan = getDayGan(); // 日干（日主）
        List<List<String>> liuNian = getLiuNian(); // 流年

        // 1、计算正财
        List<List<String>> zhengCaiList = new ArrayList<>(); // 保存正财信息
        List<List<String>> pianCaiList = new ArrayList<>(); // 保存偏财信息
        Map<String, List<String>> riZhuZhengCai = BaZiMaps.RI_ZHU_ZHENG_CAI; // 男女日主正财
        Map<String, List<String>> riZhuPianCai = BaZiMaps.RI_ZHU_PIAN_CAI; // 男女日主偏财

        // 2、遍历流年
        for (List<String> key : liuNian) {
            String gan = key.get(2).substring(0, 1); // 流年天干
            String zhi = key.get(2).substring(1, 2); // 流年地支
            List<String> zhengCaiGanZhi = riZhuZhengCai.get(dayGan); // 男女日主正财干支
            List<String> pianCaiGanZhi = riZhuPianCai.get(dayGan); // 男女日主偏财干支
            // 遍历日干正财干支（偏财数量与正财相同）
            for (int j = 0; j < zhengCaiGanZhi.size(); j++) {
                // 判断流年天干地支是否为正财
                if (gan.equals(zhengCaiGanZhi.get(j)) || zhi.equals(zhengCaiGanZhi.get(j))) {
                    zhengCaiList.add(key);
                    break;
                }
                // 判断流年天干地支是否为偏财
                if (gan.equals(pianCaiGanZhi.get(j)) || zhi.equals(pianCaiGanZhi.get(j))) {
                    pianCaiList.add(key);
                    break;
                }
            }
        }
        this.zhengCaiYun = zhengCaiList; // 正财运年份、年龄、干支
        this.pianCaiYun = pianCaiList; // 偏财运年份、年龄、干支

    }

    /**
     * 计算桃花年份、年龄、干支
     *
     * @param setting 八字-设置
     */
    private void taoHua(BaZiSetting setting) {

        String dayGan = getDayGan(); // 日干（日主）
        List<List<String>> liuNian = getLiuNian(); // 流年

        // 1、计算桃花
        List<List<String>> zhengTaoHuaList = new ArrayList<>(); // 保存正桃花信息
        List<List<String>> pianTaoHuaList = new ArrayList<>(); // 保存偏桃花信息
        Map<String, List<String>> riZhuZhengTaoHua = BaZiMaps.NV_RI_ZHU_ZHENG_TAO_HUA; // 女日主正桃花
        Map<String, List<String>> riZhuPianTaoHua = BaZiMaps.NV_RI_ZHU_PIAN_TAO_HUA; // 女日主偏桃花

        if (setting.getSex() == 1) {
            // 2、男命桃花年即财运年
            this.zhengTaoHua = getZhengCaiYun();
            this.pianTaoHua = getPianCaiYun();
        } else {
            // 3、计算女命桃花年
            for (List<String> key : liuNian) {
                String gan = key.get(2).substring(0, 1); // 流年天干
                String zhi = key.get(2).substring(1, 2); // 流年地支
                List<String> zhengCaiGanZhi = riZhuZhengTaoHua.get(dayGan); // 女日主正桃花干支
                List<String> pianCaiGanZhi = riZhuPianTaoHua.get(dayGan); // 女日主偏桃花干支
                // 遍历日干正桃花干支（偏桃花数量与正桃花相同）
                for (int j = 0; j < zhengCaiGanZhi.size(); j++) {
                    // 判断流年天干地支是否为正桃花
                    if (gan.equals(zhengCaiGanZhi.get(j)) || zhi.equals(zhengCaiGanZhi.get(j))) {
                        zhengTaoHuaList.add(key);
                        break;
                    }
                    // 判断流年天干地支是否为偏桃花
                    if (gan.equals(pianCaiGanZhi.get(j)) || zhi.equals(pianCaiGanZhi.get(j))) {
                        pianTaoHuaList.add(key);
                        break;
                    }
                }
            }
            this.zhengTaoHua = zhengTaoHuaList; // 正桃花年份、年龄、干支
            this.pianTaoHua = pianTaoHuaList; // 偏桃花年份、年龄、干支
        }

    }

    /**
     * 大运运势
     * <p>
     * TODO：测试中，仅供参考，不可对号入座
     */
    private void daYunYunShi() {

        List<List<String>> list = new ArrayList<>();

        Map<String, String> shenRuoYunCheng = BaZiMaps.SHEN_RUO_YUN_CHENG; // 身弱运程
        Map<String, String> shenQiangYunCheng = BaZiMaps.SHEN_QIANG_YUN_CHENG; // 身强运程

        List<List<String>> daYun = getDaYun(); // 大运

        // 1、身弱运程
        if ("身弱".equals(getBodyIntensity())) {
            for (int i = 1; i < daYun.size(); i++) {
                String front = "前5年", after = "后5年";
                // 1.1、每一个大运（10年）的前五年运程
                String gan = daYun.get(i).get(2).substring(0, 1); // 大运天干
                front += shenRuoYunCheng.get(getDayGan() + gan);
                // 1.2、每一个大运（10年）后前五年运程
                String zhi = daYun.get(i).get(2).substring(1, 2); // 大运地支
                after += shenRuoYunCheng.get(getDayGan() + zhi);
                // 1.3、添加大运运程
                int beginYear = Integer.parseInt(daYun.get(i).get(0)); // 每一轮大运开始的年份
                int endYear = beginYear + 9; // 每一轮大运结束的年份
                list.add(Arrays.asList(beginYear + "年~" + endYear + "年", front + "、" + after));
            }
            this.daYunYunShi = list;
            return;
        }

        // 2、身强运程
        if ("身强".equals(getBodyIntensity())) {
            for (int i = 1; i < daYun.size(); i++) {
                String front = "前5年", after = "后5年";
                // 1.1、每一个大运（10年）的前5年运程
                String gan = daYun.get(i).get(2).substring(0, 1); // 大运天干
                front += shenQiangYunCheng.get(getDayGan() + gan);
                // 1.2、每一个大运（10年）后前5年运程
                String zhi = daYun.get(i).get(2).substring(1, 2); // 大运地支
                after += shenQiangYunCheng.get(getDayGan() + zhi);
                // 1.3、添加大运运程
                int beginYear = Integer.parseInt(daYun.get(i).get(0)); // 每一轮大运开始的年份
                int endYear = beginYear + 9; // 每一轮大运结束的年份
                list.add(Arrays.asList(beginYear + "年~" + endYear + "年", front + "、" + after));
            }
            this.daYunYunShi = list;
        }

    }

    /**
     * 流年运势
     * <p>
     * TODO：测试中，仅供参考，不可对号入座
     */
    private void liuNianYunShi() {

        List<List<String>> list = new ArrayList<>();

        Map<String, String> shenRuoYunCheng = BaZiMaps.SHEN_RUO_YUN_CHENG; // 身弱运程
        Map<String, String> shenQiangYunCheng = BaZiMaps.SHEN_QIANG_YUN_CHENG; // 身强运程

        List<List<String>> liuNian = getLiuNian(); // 流年

        // 1、身弱运程
        if ("身弱".equals(getBodyIntensity())) {
            for (int i = 1; i < liuNian.size(); i++) {
                String front = "上半年", after = "下半年";
                // 1.1、每一个流年（1年）的前6个月运程
                String gan = liuNian.get(i).get(2).substring(0, 1); // 流年天干
                front += shenRuoYunCheng.get(getDayGan() + gan);
                // 1.2、每一个流年（1年）后前6个月运程
                String zhi = liuNian.get(i).get(2).substring(1, 2); // 流年地支
                after += shenRuoYunCheng.get(getDayGan() + zhi);
                // 1.3、添加流年运程
                list.add(Arrays.asList(liuNian.get(i).get(0) + "年", front + "、" + after));
            }
            this.liuNianYunShi = list;
            return;
        }

        // 2、身强运程
        if ("身强".equals(getBodyIntensity())) {
            for (int i = 1; i < liuNian.size(); i++) {
                String front = "上半年", after = "下半年";
                // 1.1、每一个流年（1年）的前6个月运程
                String gan = liuNian.get(i).get(2).substring(0, 1); // 流年天干
                front += shenQiangYunCheng.get(getDayGan() + gan);
                // 1.2、每一个流年（1年）后前6个月运程
                String zhi = liuNian.get(i).get(2).substring(1, 2); // 流年地支
                after += shenQiangYunCheng.get(getDayGan() + zhi);
                // 1.3、添加流年运程
                list.add(Arrays.asList(liuNian.get(i).get(0) + "年", front + "、" + after));
            }
            this.liuNianYunShi = list;
        }

    }

    /**
     * 计算并返回太极贵人【1】
     *
     * @return 太极贵人
     */
    private List<String> taiJiGuiRen() {

        List<String> yearZhi = BaZiMaps.TAI_JI_GUI_REN.get(getYearGan()); // 根据年干获取太极贵人所要落入的地支
        List<String> dayZhi = BaZiMaps.TAI_JI_GUI_REN.get(getDayGan()); // 根据日干获取太极贵人所要落入的地支
        return insertShenSha(yearZhi, dayZhi, "太极贵人");

    }

    /**
     * 计算并返回天乙贵人【1】
     *
     * @return 天乙贵人
     */
    private List<String> tianYiGuiRen() {

        List<String> yearZhi = BaZiMaps.TIAN_YI_GUI_REN.get(getYearGan()); // 根据年干获取天乙贵人所要落入的地支
        List<String> dayZhi = BaZiMaps.TIAN_YI_GUI_REN.get(getDayGan()); // 根据日干获取天乙贵人所要落入的地支
        return insertShenSha(yearZhi, dayZhi, "天乙贵人");

    }

    /**
     * 计算并返回福星贵人【1】
     *
     * @return 福星贵人
     */
    private List<String> fuXingGuiRen() {

        List<String> yearZhi = BaZiMaps.FU_XING_GUI_REN.get(getYearGan()); // 根据年干获取福星贵人所要落入的地支
        List<String> dayZhi = BaZiMaps.FU_XING_GUI_REN.get(getDayGan()); // 根据日干获取福星贵人所要落入的地支
        return insertShenSha(yearZhi, dayZhi, "福星贵人");

    }

    /**
     * 计算并返回文昌贵人【1】
     *
     * @return 文昌贵人
     */
    private List<String> wenChangGuiRen() {

        List<String> yearZhi = BaZiMaps.WEN_CHANG_GUI_REN.get(getYearGan()); // 根据年干获取文昌贵人所要落入的地支
        List<String> dayZhi = BaZiMaps.WEN_CHANG_GUI_REN.get(getDayGan()); // 根据日干获取文昌贵人所要落入的地支
        return insertShenSha(yearZhi, dayZhi, "文昌贵人");

    }

    /**
     * 计算并返回天厨贵人【1】
     *
     * @return 天厨贵人
     */
    private List<String> tianChuGuiRen() {

        List<String> yearZhi = BaZiMaps.TIAN_CHU_GUI_REN.get(getYearGan()); // 根据年干获取天厨贵人所要落入的地支
        List<String> dayZhi = BaZiMaps.TIAN_CHU_GUI_REN.get(getDayGan()); // 根据日干获取天厨贵人所要落入的地支
        return insertShenSha(yearZhi, dayZhi, "天厨贵人");

    }

    /**
     * 计算并返回国印【1】
     *
     * @return 国印
     */
    private List<String> guoYin() {

        List<String> yearZhi = BaZiMaps.GUO_YIN.get(getYearGan()); // 根据年干获取国印所要落入的地支
        List<String> dayZhi = BaZiMaps.GUO_YIN.get(getDayGan()); // 根据日干获取国印所要落入的地支
        return insertShenSha(yearZhi, dayZhi, "国印");

    }

    /**
     * 计算并返回金舆【1】
     *
     * @return 金舆
     */
    private List<String> jinYu() {

        List<String> yearZhi = BaZiMaps.JIN_YU.get(getYearGan()); // 根据年干获取金舆所要落入的地支
        List<String> dayZhi = BaZiMaps.JIN_YU.get(getDayGan()); // 根据日干获取金舆所要落入的地支
        return insertShenSha(yearZhi, dayZhi, "金舆");

    }

    /**
     * 计算并返回驿马【1】
     *
     * @return 驿马
     */
    private List<String> yiMa() {

        List<String> yearZhi = BaZiMaps.YI_MA.get(getYearZhi()); // 根据年支获取驿马所要落入的地支
        List<String> dayZhi = BaZiMaps.YI_MA.get(getDayZhi()); // 根据日支获取驿马所要落入的地支
        return insertShenSha(yearZhi, dayZhi, "驿马");

    }

    /**
     * 计算并返回华盖【1】
     *
     * @return 华盖
     */
    private List<String> huaGai() {

        List<String> yearZhi = BaZiMaps.HUA_GAI.get(getYearZhi()); // 根据年支获取华盖所要落入的地支
        List<String> dayZhi = BaZiMaps.HUA_GAI.get(getDayZhi()); // 根据日支获取华盖所要落入的地支
        return insertShenSha(yearZhi, dayZhi, "华盖");

    }

    /**
     * 计算并返回劫煞【1】
     *
     * @return 劫煞
     */
    private List<String> jieSha() {

        List<String> yearZhi = BaZiMaps.JIE_SHA.get(getYearZhi()); // 根据年支获取劫煞所要落入的地支
        List<String> dayZhi = BaZiMaps.JIE_SHA.get(getDayZhi()); // 根据日支获取劫煞所要落入的地支
        return insertShenSha(yearZhi, dayZhi, "劫煞");

    }

    /**
     * 计算并返回将星【1】
     *
     * @return 将星
     */
    private List<String> jiangXing() {

        List<String> yearZhi = BaZiMaps.JIANG_XING.get(getYearZhi()); // 根据年支获取将星所要落入的地支
        List<String> dayZhi = BaZiMaps.JIANG_XING.get(getDayZhi()); // 根据日支获取将星所要落入的地支
        return insertShenSha(yearZhi, dayZhi, "将星");

    }

    /**
     * 计算并返回桃花【1】
     *
     * @return 桃花
     */
    private List<String> taoHua() {

        List<String> yearZhi = BaZiMaps.TAO_HUA.get(getYearZhi()); // 根据年支获取桃花所要落入的地支
        List<String> dayZhi = BaZiMaps.TAO_HUA.get(getDayZhi()); // 根据日支获取桃花所要落入的地支
        return insertShenSha(yearZhi, dayZhi, "桃花");

    }

    /**
     * 计算并返回亡神【1】
     *
     * @return 亡神
     */
    private List<String> wangShen() {

        List<String> yearZhi = BaZiMaps.WANG_SHEN.get(getYearZhi()); // 根据年支获取亡神所要落入的地支
        List<String> dayZhi = BaZiMaps.WANG_SHEN.get(getDayZhi()); // 根据日支获取亡神所要落入的地支
        return insertShenSha(yearZhi, dayZhi, "亡神");

    }

    /**
     * 计算并返回丧门【1】
     *
     * @return 丧门
     */
    private List<String> sangMen() {

        List<String> yearZhi = BaZiMaps.SANG_MEN.get(getYearZhi()); // 根据年支获取丧门所要落入的地支
        List<String> dayZhi = BaZiMaps.SANG_MEN.get(getDayZhi()); // 根据日支获取丧门所要落入的地支
        return insertShenSha(yearZhi, dayZhi, "丧门");

    }

    /**
     * 计算并返回吊客【1】
     *
     * @return 吊客
     */
    private List<String> diaoKe() {

        List<String> yearZhi = BaZiMaps.DIAO_KE.get(getYearZhi()); // 根据年支获取吊客所要落入的地支
        List<String> dayZhi = BaZiMaps.DIAO_KE.get(getDayZhi()); // 根据日支获取吊客所要落入的地支
        return insertShenSha(yearZhi, dayZhi, "吊客");

    }

    /**
     * 计算并返回披麻【1】
     *
     * @return 披麻
     */
    private List<String> piMa() {

        List<String> yearZhi = BaZiMaps.PI_MA.get(getYearZhi()); // 根据年支获取披麻所要落入的地支
        List<String> dayZhi = BaZiMaps.PI_MA.get(getDayZhi()); // 根据日支获取披麻所要落入的地支
        return insertShenSha(yearZhi, dayZhi, "披麻");

    }

    /**
     * 计算并返回十恶大败【2】
     *
     * @return 十恶大败
     */
    private List<String> shiEDaBai() {

        return insertShenSha(BaZiMaps.SHI_E_DA_BAI, "十恶大败");

    }

    /**
     * 计算并返回阴差阳错【2】
     *
     * @return 阴差阳错
     */
    private List<String> yinChaYangCuo() {

        return insertShenSha(BaZiMaps.YIN_CHA_YANG_CUO, "阴差阳错");

    }

    /**
     * 计算并返回六秀日【2】
     *
     * @return 六秀日
     */
    private List<String> liuXiuRi() {

        return insertShenSha(BaZiMaps.LIU_XIU_RI, "六秀日");

    }

    /**
     * 计算并返回十灵日【2】
     *
     * @return 十灵日
     */
    private List<String> shiLingRi() {

        return insertShenSha(BaZiMaps.SHI_LING_RI, "十灵日");

    }

    /**
     * 计算并返回魁罡日【2】
     *
     * @return 魁罡日
     */
    private List<String> kuiGangRi() {

        return insertShenSha(BaZiMaps.KUI_GANG_RI, "魁罡日");

    }

    /**
     * 计算并返回八专日【2】
     *
     * @return 八专日
     */
    private List<String> baZhuanRi() {

        return insertShenSha(BaZiMaps.BA_ZHUAN_RI, "八专日");

    }

    /**
     * 计算并返回九丑日【2】
     *
     * @return 九丑日
     */
    private List<String> jiuChouRi() {

        return insertShenSha(BaZiMaps.JIU_CHOU_RI, "九丑日");

    }

    /**
     * 计算并返回红艳煞【3】
     *
     * @return 红艳煞
     */
    private List<String> hongYanSha() {

        return insertShenSha(BaZiMaps.HONG_YAN_SHA.get(getDayGan()), "红艳煞");

    }

    /**
     * 计算并返回羊刃【3】
     *
     * @return 羊刃
     */
    private List<String> yangRen() {

        return insertShenSha(BaZiMaps.YANG_REN.get(getDayGan()), "羊刃");

    }

    /**
     * 计算并返回飞刃【3】
     *
     * @return 飞刃
     */
    private List<String> feiRen() {

        return insertShenSha(BaZiMaps.FEI_REN.get(getDayGan()), "飞刃");

    }

    /**
     * 计算并返回血刃【3】
     *
     * @return 血刃
     */
    private List<String> xueRen() {

        return insertShenSha(BaZiMaps.XUE_REN.get(getMonthZhi()), "血刃");

    }

    /**
     * 计算并返回流霞【3】
     *
     * @return 流霞
     */
    private List<String> liuXia() {

        return insertShenSha(BaZiMaps.LIU_XIA.get(getDayGan()), "流霞");

    }

    /**
     * 计算并返回天医【3】
     *
     * @return 天医
     */
    private List<String> tianYi() {

        return insertShenSha(BaZiMaps.TIAN_YI.get(getMonthZhi()), "天医");

    }

    /**
     * 计算并返回天喜【3】
     *
     * @return 天喜
     */
    private List<String> tianXi() {

        return insertShenSha(BaZiMaps.TIAN_XI.get(getYearZhi()), "天喜");

    }

    /**
     * 计算并返回红鸾【3】
     *
     * @return 红鸾
     */
    private List<String> hongLuan() {

        return insertShenSha(BaZiMaps.HONG_LUAN.get(getYearZhi()), "红鸾");

    }

    /**
     * 计算并返回灾煞【3】
     *
     * @return 灾煞
     */
    private List<String> zaiSha() {

        return insertShenSha(BaZiMaps.ZAI_SHA.get(getYearZhi()), "灾煞");

    }

    /**
     * 计算并返回孤辰【3】
     *
     * @return 孤辰
     */
    private List<String> guChen() {

        return insertShenSha(BaZiMaps.GU_CHEN.get(getYearZhi()), "孤辰");

    }

    /**
     * 计算并返回寡宿【3】
     *
     * @return 寡宿
     */
    private List<String> suGua() {

        return insertShenSha(BaZiMaps.SU_GUA.get(getYearZhi()), "寡宿");

    }

    /**
     * 计算并返回禄神【3】
     *
     * @return 禄神
     */
    private List<String> luShen() {

        return insertShenSha(BaZiMaps.LU_SHEN.get(getDayGan()), "禄神");

    }

    /**
     * 计算并返回词馆【4】
     *
     * @param search 1:禄命法。2:子平法（默认查法：禄命法）
     * @return 词馆
     */
    private List<String> ciGuan(int search) {

        // 数据校验
        if (search < 1) search = 1;
        if (search > 1) search = 2;

        List<String> list = CommonUtil.addCharToList(4);

        // 1、禄命法
        if (search == 1) {
            String yearMingWuXing = getYearGanZhiNaYin().substring(2, 3); // 年命五行
            // 1.1、年命属木，月支或日支或时支有'寅'的，则为词馆。（'庚寅'为正词馆）
            insertShenSha(list, yearMingWuXing, "木", "寅", "词馆");
            // 1.2、年命属火，月支或日支或时支有'巳'的，则为词馆。（'乙巳'为正词馆）
            insertShenSha(list, yearMingWuXing, "火", "巳", "词馆");
            // 1.3、年命属土，月支或日支或时支有'亥'的，则为词馆。（'丁亥'为正词馆）
            insertShenSha(list, yearMingWuXing, "土", "亥", "词馆");
            // 1.4、年命属金，月支或日支或时支有'申'的，则为词馆。（'壬申'为正词馆）
            insertShenSha(list, yearMingWuXing, "金", "申", "词馆");
            // 1.5、年命属水，月支或日支或时支有'亥'的，则为词馆。（'癸亥'为正词馆）
            insertShenSha(list, yearMingWuXing, "水", "亥", "词馆");
        }

        // 2、子平法
        if (search == 2) {
            List<String> ganZhi1 = BaZiMaps.XUE_TANG.get(getYearGan()); // 根据年干获取学堂所要落入的天干或地支
            List<String> ganZhi2 = BaZiMaps.XUE_TANG.get(getDayGan()); // 根据日干获取学堂所要落入的天干或地支
            insertShenSha2(list, ganZhi1, "词馆");
            insertShenSha2(list, ganZhi2, "词馆");
        }

        return list;

    }

    /**
     * 计算并返回学堂【4】
     *
     * @param search 1:禄命法。2:子平法（默认查法：禄命法）
     * @return 学堂
     */
    private List<String> xueTang(int search) {

        // 数据校验
        if (search < 1) search = 1;
        if (search > 1) search = 2;

        List<String> list = CommonUtil.addCharToList(4);

        // 1、禄命法
        if (search == 1) {
            String yearMingWuXing = getYearGanZhiNaYin().substring(2, 3); // 年命五行
            // 1.1、年命属木，月支或日支或时支有'亥'的，则为学堂。（'己亥'为正学堂）
            insertShenSha(list, yearMingWuXing, "木", "亥", "学堂");
            // 1.2、年命属火，月支或日支或时支有'寅'的，则为学堂。（'丙寅'为正学堂）
            insertShenSha(list, yearMingWuXing, "火", "寅", "学堂");
            // 1.3、年命属土，月支或日支或时支有'申'的，则为学堂。（'戊申'为正学堂）
            insertShenSha(list, yearMingWuXing, "土", "申", "学堂");
            // 1.4、年命属金，月支或日支或时支有'巳'的，则为学堂。（'辛巳'为正学堂）
            insertShenSha(list, yearMingWuXing, "金", "巳", "学堂");
            // 1.5、年命属水，月支或日支或时支有'申'的，则为学堂。（'甲申'为正学堂）
            insertShenSha(list, yearMingWuXing, "水", "申", "学堂");
        }

        // 2、子平法
        if (search == 2) {
            List<String> ganZhi1 = BaZiMaps.XUE_TANG.get(getYearGan()); // 根据年干获取学堂所要落入的天干或地支
            List<String> ganZhi2 = BaZiMaps.XUE_TANG.get(getDayGan()); // 根据日干获取学堂所要落入的天干或地支
            insertShenSha2(list, ganZhi1, "学堂");
            insertShenSha2(list, ganZhi2, "学堂");
        }

        return list;

    }

    /**
     * 计算并返回天德贵人【∞】
     *
     * @return 天德贵人
     */
    private List<String> tianDeGuiRen() {

        List<String> list = Arrays.asList("", "", "", "");
        String ganZhi = BaZiMaps.TIAN_DE_GUI_REN.get(getMonthZhi()); // 根据月支获取天德贵人所要落入的天干或地支

        // 1、判断年柱，若匹配则插入年柱神煞
        if (getYearGan().equals(ganZhi) || getYearZhi().equals(ganZhi)) {
            list.set(0, "天德贵人");
        }
        // 2、判断月柱，若匹配则插入月柱神煞
        if (getMonthGan().equals(ganZhi) || getMonthZhi().equals(ganZhi)) {
            list.set(1, "天德贵人");
        }
        // 3、判断日柱，若匹配则插入日柱神煞
        if (getDayGan().equals(ganZhi) || getDayZhi().equals(ganZhi)) {
            list.set(2, "天德贵人");
        }
        // 4、判断时柱，若匹配则插入时柱神煞
        if (getHourGan().equals(ganZhi) || getHourZhi().equals(ganZhi)) {
            list.set(3, "天德贵人");
        }

        return list;
    }

    /**
     * 计算并返回月德贵人【∞】
     *
     * @return 月德贵人
     */
    private List<String> yueDeGuiRen() {

        List<String> list = Arrays.asList("", "", "", "");
        String gan = BaZiMaps.YUE_DE_GUI_REN.get(getMonthZhi()); // 根据月支获取月德贵人所要落入的天干

        // 1、判断年干，若匹配则插入年柱神煞
        if (getYearGan().equals(gan)) {
            list.set(0, "月德贵人");
        }
        // 2、判断月干，若匹配则插入月柱神煞
        if (getMonthGan().equals(gan)) {
            list.set(1, "月德贵人");
        }
        // 3、判断日干，若匹配则插入日柱神煞
        if (getDayGan().equals(gan)) {
            list.set(2, "月德贵人");
        }
        // 4、判断时干，若匹配则插入时柱神煞
        if (getHourGan().equals(gan)) {
            list.set(3, "月德贵人");
        }

        return list;
    }

    /**
     * 计算并返回德秀贵人【∞】
     *
     * @return 德秀贵人
     */
    private List<String> deXiuGuiRen() {

        List<String> list = Arrays.asList("", "", "", "");
        List<String> ganList = BaZiMaps.DE_XIU_GUI_REN.get(getMonthZhi());// 根据月支获取德秀贵人所要落入的天干

        for (String key : ganList) {
            // 1、判断年干，若匹配则插入年柱神煞
            if (getYearGan().equals(key)) {
                list.set(0, "德秀贵人");
            }
            // 2、判断月干，若匹配则插入月柱神煞
            if (getMonthGan().equals(key)) {
                list.set(1, "德秀贵人");
            }
            // 3、判断日干，若匹配则插入日柱神煞
            if (getDayGan().equals(key)) {
                list.set(2, "德秀贵人");
            }
            // 4、判断时干，若匹配则插入时柱神煞
            if (getHourGan().equals(key)) {
                list.set(3, "德秀贵人");
            }
        }

        return list;

    }

    /**
     * 计算并返回三奇贵人【∞】
     *
     * @return 三奇贵人
     */
    private List<String> sanQiGuiRen() {

        String ymdS = getYearGan() + getMonthGan() + getDayGan(); // 获取年月日天干组合
        String ymdN = getDayGan() + getMonthGan() + getYearGan(); // 获取日月年天干组合
        String mdhS = getMonthGan() + getDayGan() + getHourGan(); // 获取月日时天干组合
        String mdhN = getHourGan() + getDayGan() + getMonthGan(); // 获取时日月天干组合

        // 1、判断年干、月干、日干、时干是否构成三奇贵人
        List<String> list = Arrays.asList("", "", "", "");
        String[] sanQiGuiRen = BaZiMaps.SAN_QI_GUI_REN; // 三奇贵人
        for (String key : sanQiGuiRen) {
            if (ymdS.equals(key) || ymdN.equals(key)) {
                list.set(0, "三奇贵人"); // 插入年柱神煞
                list.set(1, "三奇贵人"); // 插入月柱神煞
                list.set(2, "三奇贵人"); // 插入日柱神煞
            }
            if (mdhS.equals(key) || mdhN.equals(key)) {
                list.set(1, "三奇贵人"); // 插入月柱神煞
                list.set(2, "三奇贵人"); // 插入日柱神煞
                list.set(3, "三奇贵人"); // 插入时柱神煞
            }
        }

        return list;

    }

    /**
     * 计算并返回童子煞【∞】
     *
     * @return 童子煞
     */
    private List<String> tongZiSha() {

        List<String> list = Arrays.asList("", "", "", "");
        String season = getLunar().getSeason().substring(1, 2); // 获取季节简称（如：春）
        String yearMingWuXing = getYearGanZhiNaYin().substring(2, 3); // 年干支纳音五行

        // 1、春秋寅子贵：春天和秋天出生的，日支或时支有'寅'或者'子'为童子煞
        if ("春".equals(season) || "秋".equals(season)) {
            if ("寅".equals(getDayZhi()) || "子".equals(getDayZhi())) list.set(2, "童子煞");
            if ("寅".equals(getHourZhi()) || "子".equals(getHourZhi())) list.set(3, "童子煞");
        }

        // 2、冬夏卯未辰：夏天和冬天出生的，日支或时支有'卯'或者'未'或者'辰'为童子煞
        if ("夏".equals(season) || "冬".equals(season)) {
            if ("卯".equals(getDayZhi()) || "未".equals(getDayZhi()) || "辰".equals(getDayZhi())) list.set(2, "童子煞");
            if ("卯".equals(getHourZhi()) || "未".equals(getHourZhi()) || "辰".equals(getDayZhi())) list.set(3, "童子煞");
        }

        // 3、金木午卯合：年命属金或木，日支或时支有'午'或者'卯'为童子煞
        if ("金".equals(yearMingWuXing) || "木".equals(yearMingWuXing)) {
            if ("午".equals(getDayZhi()) || "卯".equals(getDayZhi())) list.set(2, "童子煞");
            if ("午".equals(getHourZhi()) || "卯".equals(getHourZhi())) list.set(3, "童子煞");
        }

        // 4、水火酉戍多：年命属水或火，日支或时支有'酉'或者'戍'为童子煞
        if ("水".equals(yearMingWuXing) || "火".equals(yearMingWuXing)) {
            if ("酉".equals(getDayZhi()) || "戍".equals(getDayZhi())) list.set(2, "童子煞");
            if ("酉".equals(getHourZhi()) || "戍".equals(getHourZhi())) list.set(3, "童子煞");
        }

        // 5、土命逢辰巳：年命属土，日支或时支有'辰'或者'巳'为童子煞
        if ("土".equals(yearMingWuXing)) {
            if ("辰".equals(getDayZhi()) || "巳".equals(getDayZhi())) list.set(2, "童子煞");
            if ("辰".equals(getHourZhi()) || "巳".equals(getHourZhi())) list.set(3, "童子煞");
        }

        return list;

    }

    /**
     * 计算并返回四废日【∞】
     *
     * @return 四废日
     */
    private List<String> siFeiRi() {

        List<String> list = Arrays.asList("", "", "", "");
        String season = getLunar().getSeason().substring(1, 2); // 获取季节简称（如：春）
        List<String> dayZhu = BaZiMaps.SI_FEI_RI.get(season);// 根据季节获取德秀贵人所要落入的日柱

        for (String key : dayZhu) {
            if (key.equals(getDayGanZhi())) list.set(2, "四废日"); // 判断日支，若匹配则插入日柱神煞
        }

        return list;

    }

    /**
     * 计算并返回拱禄【∞】
     *
     * @return 拱禄
     */
    private List<String> gongLu() {

        List<String> list = Arrays.asList("", "", "", "");
        String diZhi = BaZiMaps.GONG_LU.get(Arrays.asList(getDayGanZhi(), getHourGanZhi())); // 根据日柱和时柱获取拱禄所要落入的地支
        if (getYearZhi().equals(diZhi)) list.set(0, "拱禄"); // 判断年柱，若匹配则插入年柱神煞
        if (getMonthZhi().equals(diZhi)) list.set(1, "拱禄"); // 判断月柱，若匹配则插入月柱神煞

        return list;

    }

    /**
     * 计算并返回天赦【∞】
     *
     * @return 天赦
     */
    private List<String> tianShe() {

        List<String> list = Arrays.asList("", "", "", "");
        String dayZhu = BaZiMaps.TIAN_SHE.get(getMonthZhi()); // 根据月支获取天赦所要落入的日柱
        if (getDayGanZhi().equals(dayZhu)) list.set(2, "天赦"); // 判断日柱，若匹配则插入日柱神煞

        return list;

    }

    /**
     * 计算并返回天转【∞】
     *
     * @return 天转
     */
    private List<String> tianZhuan() {

        List<String> list = Arrays.asList("", "", "", "");
        String dayZhu = BaZiMaps.TIAN_ZHUAN.get(getMonthZhi()); // 根据月支获取天转所要落入的日柱
        if (getDayGanZhi().equals(dayZhu)) list.set(2, "天转"); // 判断日柱，若匹配则插入日柱神煞

        return list;

    }

    /**
     * 计算并返回地转【∞】
     *
     * @return 地转
     */
    private List<String> diZhuan() {

        List<String> list = Arrays.asList("", "", "", "");
        String dayZhu = BaZiMaps.DI_ZHUAN.get(getMonthZhi()); // 根据月支获取天转所要落入的日柱
        if (getDayGanZhi().equals(dayZhu)) list.set(2, "地转"); // 判断日柱，若匹配则插入日柱神煞

        return list;

    }

    /**
     * 计算常用神煞
     *
     * @param setting 八字-设置
     */
    private void shenSha(BaZiSetting setting) {

        // 1、初始化集合
        List<String> yearShenSha = new ArrayList<>(); // 保存年柱神煞
        List<String> monthShenSha = new ArrayList<>(); // 保存月柱神煞
        List<String> dayShenSha = new ArrayList<>(); // 保存日柱神煞
        List<String> hourShenSha = new ArrayList<>(); // 保存时柱神煞

        // 2、添加四柱神煞
        saveShenSha(taiJiGuiRen(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 太极贵人【1】
        saveShenSha(tianYiGuiRen(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 天乙贵人【1】
        saveShenSha(fuXingGuiRen(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 福星贵人【1】
        saveShenSha(wenChangGuiRen(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 文昌贵人【1】
        saveShenSha(tianChuGuiRen(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 天厨贵人【1】
        saveShenSha(guoYin(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 国印【1】
        saveShenSha(jinYu(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 金舆【1】
        saveShenSha(yiMa(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 驿马【1】
        saveShenSha(huaGai(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 华盖【1】
        saveShenSha(jieSha(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 劫煞【1】
        saveShenSha(jiangXing(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 将星【1】←
        saveShenSha(taoHua(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 桃花【1】
        saveShenSha(wangShen(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 亡神【1】
        saveShenSha(sangMen(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 丧门【1】
        saveShenSha(diaoKe(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 吊客【2】
        saveShenSha(piMa(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 披麻【1】
        saveShenSha(shiEDaBai(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 十恶大败【2】
        saveShenSha(yinChaYangCuo(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 阴差阳错【2】
        saveShenSha(liuXiuRi(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 六秀日【2】
        saveShenSha(shiLingRi(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 十灵日【2】
        saveShenSha(kuiGangRi(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 魁罡日【2】
        saveShenSha(baZhuanRi(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 八专日【2】
        saveShenSha(jiuChouRi(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 九丑日【2】
        saveShenSha(hongYanSha(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 红艳煞【3】
        saveShenSha(yangRen(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 羊刃【3】
        saveShenSha(feiRen(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 飞刃【3】
        saveShenSha(xueRen(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 血刃【3】
        saveShenSha(liuXia(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 流霞【3】
        saveShenSha(tianYi(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 天医【3】
        saveShenSha(tianXi(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 天喜【3】
        saveShenSha(hongLuan(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 红鸾【3】
        saveShenSha(zaiSha(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 灾煞【3】
        saveShenSha(guChen(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 孤辰【3】
        saveShenSha(suGua(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 寡宿【3】
        saveShenSha(luShen(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 禄神【3】
        saveShenSha(xueTang(setting.getXueTang()), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 学堂【4】
        saveShenSha(ciGuan(setting.getCiGuan()), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 词馆【4】
        saveShenSha(tianDeGuiRen(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 天德贵人【∞】
        saveShenSha(yueDeGuiRen(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 月德贵人【∞】
        saveShenSha(deXiuGuiRen(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 德秀贵人【∞】
        saveShenSha(sanQiGuiRen(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 三奇贵人【∞】
        saveShenSha(tongZiSha(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 童子煞【∞】
        saveShenSha(siFeiRi(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 四废日【∞】
        saveShenSha(gongLu(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 拱禄【∞】
        saveShenSha(tianShe(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 天赦【∞】
        saveShenSha(tianZhuan(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 天转【∞】
        saveShenSha(diZhuan(), yearShenSha, monthShenSha, dayShenSha, hourShenSha); // 地转【∞】

        // 3、删除list集合中的空元素
        CommonUtil.removeElementList(yearShenSha, "");
        CommonUtil.removeElementList(monthShenSha, "");
        CommonUtil.removeElementList(dayShenSha, "");
        CommonUtil.removeElementList(hourShenSha, "");

        // 4、设置四柱神煞
        this.yearGanZhiShenSha = yearShenSha;
        this.monthGanZhiShenSha = monthShenSha;
        this.dayGanZhiShenSha = dayShenSha;
        this.hourGanZhiShenSha = hourShenSha;

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
     * 插入并返回神煞【1】
     *
     * @param diZhi1      神煞所要落入的地支1
     * @param diZhi2      神煞所要落入的地支2
     * @param shenShaName 神煞名称
     */
    private List<String> insertShenSha(List<String> diZhi1, List<String> diZhi2, String shenShaName) {

        List<String> list = Arrays.asList("", "", "", "");

        // 1、判断年支，若匹配则插入年柱神煞
        for (String key : diZhi1) {
            if (getYearZhi().equals(key)) list.set(0, shenShaName);
        }
        for (String key : diZhi2) {
            if (getYearZhi().equals(key)) list.set(0, shenShaName);
        }
        // 2、判断月支，若匹配则插入月柱神煞
        for (String key : diZhi1) {
            if (getMonthZhi().equals(key)) list.set(1, shenShaName);
        }
        for (String key : diZhi2) {
            if (getMonthZhi().equals(key)) list.set(1, shenShaName);
        }
        // 3、判断日支，若匹配则插入日柱神煞
        for (String key : diZhi1) {
            if (getDayZhi().equals(key)) list.set(2, shenShaName);
        }
        for (String key : diZhi2) {
            if (getDayZhi().equals(key)) list.set(2, shenShaName);
        }
        // 4、判断时支，若匹配则插入时柱神煞
        for (String key : diZhi1) {
            if (getHourZhi().equals(key)) list.set(3, shenShaName);
        }
        for (String key : diZhi2) {
            if (getHourZhi().equals(key)) list.set(3, shenShaName);
        }

        // 5、返回四柱神煞
        return list;

    }

    /**
     * 插入并返回神煞【2】
     *
     * @param strs        集合
     * @param shenShaName 神煞名称
     */
    private List<String> insertShenSha(String[] strs, String shenShaName) {

        List<String> list = Arrays.asList("", "", "", "");

        for (String key : strs) {
            if (getDayGanZhi().equals(key)) list.set(2, shenShaName);
        }

        return list;

    }

    /**
     * 插入并返回神煞【3】
     *
     * @param diZhi       地支
     * @param shenShaName 神煞名称
     */
    private List<String> insertShenSha(String diZhi, String shenShaName) {

        List<String> list = Arrays.asList("", "", "", "");

        // 1、判断年支，若匹配则插入年柱神煞
        if (getYearZhi().equals(diZhi)) list.set(0, shenShaName);
        // 2、判断月支，若匹配则插入月柱神煞
        if (getMonthZhi().equals(diZhi)) list.set(1, shenShaName);
        // 3、判断日支，若匹配则插入日柱神煞
        if (getDayZhi().equals(diZhi)) list.set(2, shenShaName);
        // 4、判断时支，若匹配则插入时柱神煞
        if (getHourZhi().equals(diZhi)) list.set(3, shenShaName);

        return list;

    }

    /**
     * 插入并返回神煞【4-1：禄命法】
     *
     * @param list           神煞集合
     * @param yearMingWuXing 年命五行
     * @param wuXing         五行
     * @param zhi            月支或日支或时支
     * @param shenShaName    神煞名称
     */
    private void insertShenSha(List<String> list, String yearMingWuXing, String wuXing, String zhi, String shenShaName) {

        if (wuXing.equals(yearMingWuXing)) {
            if (getMonthZhi().equals(zhi)) list.set(1, shenShaName); // 插入月柱神煞
            if (getDayZhi().equals(zhi)) list.set(2, shenShaName); // 插入日柱神煞
            if (getHourZhi().equals(zhi)) list.set(3, shenShaName); // 插入时柱神煞
        }

    }

    /**
     * 插入并返回神煞【4-2：子平法】
     *
     * @param list        神煞集合
     * @param ganOrZhi    天干或地支
     * @param shenShaName 神煞名称
     */
    private void insertShenSha2(List<String> list, List<String> ganOrZhi, String shenShaName) {

        for (String key : ganOrZhi) {
            // 1、判断年柱，若匹配则插入年柱神煞
            if (getYearGan().equals(key) || getYearZhi().equals(key)) {
                list.set(0, shenShaName);
            }
            // 2、判断月柱，若匹配则插入月柱神煞
            if (getMonthGan().equals(key) || getMonthZhi().equals(key)) {
                list.set(1, shenShaName);
            }
            // 3、判断日柱，若匹配则插入日柱神煞
            if (getDayGan().equals(key) || getDayZhi().equals(key)) {
                list.set(2, shenShaName);
            }
            // 4、判断时柱，若匹配则插入时柱神煞
            if (getHourGan().equals(key) || getHourZhi().equals(key)) {
                list.set(3, shenShaName);
            }
        }

    }

    /**
     * 添加四柱神煞
     *
     * @param list   四柱神煞
     * @param yearS  年柱神煞
     * @param monthS 月柱神煞
     * @param dayS   日柱神煞
     * @param hourS  时柱神煞
     */
    private void saveShenSha(List<String> list, List<String> yearS, List<String> monthS, List<String> dayS, List<String> hourS) {

        try {
            yearS.add(list.get(0)); // 年柱神煞
            monthS.add(list.get(1)); // 月柱神煞
            dayS.add(list.get(2)); // 日柱神煞
            hourS.add(list.get(3)); // 时柱神煞
        } catch (Exception e) {
            throw new NullPointerException("神煞添加失败");
        }

    }

    /**
     * 返回加分
     *
     * @param shengKe   天干和干支五行的生克关系
     * @param ganOrZhi1 天干或地支
     * @param ganOrZhi2 天干或地支
     * @param jia       加分
     * @return 加分
     */
    private int jiaFen(Map<String, String> shengKe, String ganOrZhi1, String ganOrZhi2, int jia) {

        int fen = 0;

        String qiangOrRuo = shengKe.get(ganOrZhi1 + ganOrZhi2); // '身强'或'身弱'
        // 若身强则加分
        if ("身强".equals(qiangOrRuo)) {
            fen += jia;
        }

        return fen;

    }

    /**
     * 添加天干留意
     *
     * @param set 天干组合
     * @param map 天干相生、相合、相冲、相克
     */
    private void saveTianGanLiuYi(Set<String> set, Map<String, String> map) {

        set.add(map.get(getYearGan() + getMonthGan())); // 年干+月干
        set.add(map.get(getYearGan() + getDayGan()));   // 年干+日干
        set.add(map.get(getYearGan() + getHourGan()));  // 年干+时干
        set.add(map.get(getMonthGan() + getYearGan())); // 月干+年干
        set.add(map.get(getMonthGan() + getDayGan()));  // 月干+日干
        set.add(map.get(getMonthGan() + getHourGan())); // 月干+时干
        set.add(map.get(getDayGan() + getYearGan()));   // 日干+年干
        set.add(map.get(getDayGan() + getMonthGan()));  // 日干+月干
        set.add(map.get(getDayGan() + getHourGan()));   // 日干+时干
        set.add(map.get(getHourGan() + getYearGan()));  // 时干+年干
        set.add(map.get(getHourGan() + getMonthGan())); // 时干+月干
        set.add(map.get(getHourGan() + getDayGan()));   // 时干+日干

    }

    /**
     * 添加地支留意
     *
     * @param set 地支组合
     * @param map 地支六合、相冲、相破、相害
     */
    private void saveDiZhiLiuYi(Set<String> set, Map<String, String> map) {

        set.add(map.get(getYearZhi() + getMonthZhi())); // 年支+月支
        set.add(map.get(getYearZhi() + getDayZhi()));   // 年支+日支
        set.add(map.get(getYearZhi() + getHourZhi()));  // 年支+时支
        set.add(map.get(getMonthZhi() + getYearZhi())); // 月支+年支
        set.add(map.get(getMonthZhi() + getDayZhi()));  // 月支+日支
        set.add(map.get(getMonthZhi() + getHourZhi())); // 月支+时支
        set.add(map.get(getDayZhi() + getYearZhi()));   // 日支+年支
        set.add(map.get(getDayZhi() + getMonthZhi()));  // 日支+月支
        set.add(map.get(getDayZhi() + getHourZhi()));   // 日支+时支
        set.add(map.get(getHourZhi() + getYearZhi()));  // 时支+年支
        set.add(map.get(getHourZhi() + getMonthZhi())); // 时支+月支
        set.add(map.get(getHourZhi() + getDayZhi()));   // 时支+日支

    }

    /**
     * 骨重转为文字
     *
     * @param guZhong 骨重
     * @return 骨重文字
     */
    private String guZhongCharacters(Double guZhong) {

        String[] split = guZhong.toString().split("\\.");

        String guZhongInfo = split[0] + "两";
        if (!split[1].equals("0")) {
            guZhongInfo += split[1] + "钱";
        }

        return guZhongInfo;

    }

    /**
     * 返回十神
     *
     * @param ganZhi 干支
     * @return 十神
     */
    private List<String> getShiShen(String ganZhi) {

        List<String> shiShen = new ArrayList<>(); // 十神
        Map<String, String> shiShenMap = BaZiMaps.SHI_SHEN_MAP; // 十神

        String gan = ganZhi.substring(0, 1); // 天干
        String zhi = ganZhi.substring(1, 2); // 地支
        String ganShiShen = shiShenMap.get(getDayGan() + gan); // 天干十神
        String zhiShiShen = shiShenMap.get(getDayGan() + zhi); // 地支十神
        shiShen.add(ganShiShen);
        shiShen.add(zhiShiShen);

        return shiShen;

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
        s.append("年干支主星:").append(getYearGanZhiZhuXing());
        s.append("   ");
        s.append("月干支主星:").append(getMonthGanZhiZhuXing());
        s.append("   ");
        s.append("日干支主星:").append(getDayGanZhiZhuXing());
        s.append("   ");
        s.append("时干支主星:").append(getHourGanZhiZhuXing());
        s.append("   ");
        s.append("年支藏干:").append(getYearZhiCangGan());
        s.append("   ");
        s.append("月支藏干:").append(getMonthZhiCangGan());
        s.append("   ");
        s.append("日支藏干:").append(getDayZhiCangGan());
        s.append("   ");
        s.append("时支藏干:").append(getHourZhiCangGan());
        s.append("   ");
        s.append("年干支副星:").append(getYearGanZhiFuXing());
        s.append("   ");
        s.append("月干支副星:").append(getMonthGanZhiFuXing());
        s.append("   ");
        s.append("日干支副星:").append(getDayGanZhiFuXing());
        s.append("   ");
        s.append("时干支副星:").append(getHourGanZhiFuXing());
        s.append("   ");
        s.append("年支地势:").append(getYearGanZhiDiShi());
        s.append("   ");
        s.append("月支地势:").append(getMonthGanZhiDiShi());
        s.append("   ");
        s.append("日支地势:").append(getDayGanZhiDiShi());
        s.append("   ");
        s.append("时支地势:").append(getHourGanZhiDiShi());
        s.append("   ");
        s.append("胎元:").append(getTaiYuan());
        s.append("   ");
        s.append("胎息:").append(getTaiXi());
        s.append("   ");
        s.append("命宫:").append(getMingGong());
        s.append("   ");
        s.append("身宫:").append(getShenGong());

        return s.toString();

    }


}
