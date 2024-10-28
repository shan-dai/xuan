package com.xuan.core.bazi;

import com.nlf.calendar.EightChar;
import com.nlf.calendar.JieQi;
import com.nlf.calendar.Lunar;
import com.nlf.calendar.Solar;
import com.nlf.calendar.eightchar.*;
import com.xuan.core.bazi.shensha.BaZiShenShaUtil;
import com.xuan.utils.CommonUtil;
import com.xuan.utils.DateUtil;
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
     * 姓名
     */
    private String name;
    /**
     * 性别（男。女）
     */
    private String sex;
    /**
     * 乾造\坤造
     */
    private String zao;
    /**
     * 占事
     */
    private String occupy;
    /**
     * 地区
     */
    private String address;

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
     * 季节
     */
    private String season;

    /**
     * 生肖
     */
    private String zodiac;
    /**
     * 星座
     */
    private String constellation;

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
     * 年干支主星
     */
    private String yearGanZhiZhuXing;
    /**
     * 月干支主星
     */
    private String monthGanZhiZhuXing;
    /**
     * 日干支主星
     */
    private String dayGanZhiZhuXing;
    /**
     * 时干支主星
     */
    private String hourGanZhiZhuXing;

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
     * 年支藏干
     */
    private List<String> yearZhiCangGan;
    /**
     * 月支藏干
     */
    private List<String> monthZhiCangGan;
    /**
     * 日支藏干
     */
    private List<String> dayZhiCangGan;
    /**
     * 时支藏干
     */
    private List<String> hourZhiCangGan;

    /**
     * 年干支副星
     */
    private List<String> yearGanZhiFuXing;
    /**
     * 月干支副星
     */
    private List<String> monthGanZhiFuXing;
    /**
     * 日干支副星
     */
    private List<String> dayGanZhiFuXing;
    /**
     * 时干支副星
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
     * 天干留意
     */
    private List<String> tianGanLiuYi;
    /**
     * 地支留意
     */
    private List<String> diZhiLiuYi;

    /**
     * 起运
     */
    private String qiYun;
    /**
     * 起运日期
     */
    private String qiYunDate;
    /**
     * 人元司令分野
     */
    private String renYuan;

    /**
     * 出生节气
     */
    private String birthSolarTerms;

    /**
     * 上一节
     */
    private String prevJie;
    /**
     * 上一节日期
     */
    private String prevJieDate;
    /**
     * 距上一节天数
     */
    private int prevJieDayNumber;

    /**
     * 下一节
     */
    private String nextJie;
    /**
     * 下一节日期
     */
    private String nextJieDate;
    /**
     * 距下一节天数
     */
    private int nextJieDayNumber;

    /**
     * 星宿
     */
    private String xingXiu;
    /**
     * 星宿吉凶
     */
    private String xiuJiXiong;
    /**
     * 星宿吉凶歌诀
     */
    private String xiuJiXiongGeJue;

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
     * 命
     */
    private String ming;
    /**
     * 命卦
     */
    private String mingGua;
    /**
     * 命卦信息
     */
    private String mingGuaInfo;

    /**
     * 五行缺失
     */
    private List<String> baZiWuXingQueShi;
    /**
     * 五行数量
     */
    private List<String> baZiWuXingCount;
    /**
     * 五行旺衰
     */
    private List<String> wuXingWangShuai;

    /**
     * 身体强弱
     */
    private String bodyIntensity;
    /**
     * 喜用神
     */
    private List<String> xiYongShen;
    /**
     * 喜用神方位
     */
    private List<String> xiYongShenFangWei;

    /**
     * 骨重
     */
    private String guZhong;
    /**
     * 骨重信息
     */
    private String guZhongPiZhu;


    /**
     * 日柱论命
     */
    private String dayZhuLunMing;

    /**
     * 姻缘
     */
    private String yinYuan;

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
     * 大运流月
     */
    private List<List<String>> daYunLiuYue;
    /**
     * 小运流月
     */
    private List<List<String>> xiaoYunLiuYue;

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
     * 大运流月十神
     */
    private List<List<String>> daYunLiuYueShiShen;
    /**
     * 小运流月十神
     */
    private List<List<String>> xiaoYunLiuYueShiShen;

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
        zodiac(setting); // 计算生肖、星座
        baZi(); // 计算八字
        baZiWuXing(); // 计算八字五行
        baZiNaYin(); // 计算八字纳音
        baZiXunKong(); // 计算八字旬空
        zhuXing(setting); // 计算主星
        diZhiCangGan(); // 计算地支藏干
        fuXing(); // 计算副星
        diShi(); // 计算地势
        shenSha(); // 计算常用神煞
        tianGanLiuYi(); // 计算天干留意
        diZhiLiuYi(); // 计算地支留意
        qiYun(setting); // 计算起运
        jieQi(); // 计算上一节及日期、下一节及日期、出生节气 // TODO：待修复
        renYuan(setting); // 计算人元司令分野
        xingXiu(); // 计算星宿、星宿吉凶、星宿吉凶歌诀
        taiGong(); // 计算胎元、胎息、命宫、身宫
        mingGua(); // 计算命、命卦、命卦信息
        wuXingQueShi(); // 计算五行缺失
        wuXingCount(); // 计算五行数量
        wuXingWangShuai(); // 计算五行旺衰
        bodyIntensity(); // 计算身体强弱
        xiYongShen(); // 计算喜用神
        xiYongShenFangWei(); // 计算喜用神方位
        guZhong(); // 计算骨重
        dayZhuLunMing(); // 计算日柱论命
        yinYuan(); // 计算姻缘
        wuXingFenXi(); // 计算五行分析
        DaYun[] daYun = daYun(setting);// 计算大运及大运十神
        xiaoYun(daYun); // 计算小运及小运十神
        LiuNian[] liuNian = liuNian(daYun);// 计算流年及流年十神
        daYunLiuYue(liuNian); // 计算大运流月及大运流月十神
        xiaoYunLiuYue(); // 计算小运流月及小运流月十神
        caiYun(); // 计算财运年份、年龄、干支
        taoHua(setting); // 计算桃花年份、年龄、干支

    }

    /**
     * 初始化自定义数据
     *
     * @param setting 八字-设置
     */
    private void initialize(BaZiSetting setting) {

        // 1、设置基础信息
        this.name = setting.getName();
        this.sex = setting.getSex() == 0 ? "女" : "男";
        this.zao = "男".equals(getSex()) ? "乾造" : "坤造";
        this.occupy = setting.getOccupy();
        this.address = setting.getAddress();

        // 2.1、判断日期类型并返回公历日期、农历日期
        Map<String, Object> dateMap = BaZiUtil.isDateType(setting);
        // 2.2、设置日期数据
        this.solar = (Solar) dateMap.get("solar"); // 设置公历日期
        this.lunar = (Lunar) dateMap.get("lunar"); // 设置农历日期

        // 3、设置星期
        this.week = "周" + getLunar().getWeekInChinese();

        // 4、设置季节
        this.season = getLunar().getSeason().substring(1, 2); // 季节简称（如：春）

        // 5.1、判断干支设置并返回干支
        Map<String, List<String>> ganZhiMap = BaZiUtil.isGanZhi(setting, getSolar().getLunar());
        // 5.2、设置年干支
        List<String> yearGanZhi = ganZhiMap.get("yearGanZhi");
        this.yearGan = yearGanZhi.get(0); // 年干
        this.yearZhi = yearGanZhi.get(1); // 年支
        this.yearGanZhi = yearGanZhi.get(2); // 年干支
        // 5.3、设置月干支
        List<String> monthGanZhi = ganZhiMap.get("monthGanZhi");
        this.monthGan = monthGanZhi.get(0); // 月干
        this.monthZhi = monthGanZhi.get(1); // 月支
        this.monthGanZhi = monthGanZhi.get(2); // 月干支
        // 5.4、设置日干支
        List<String> dayGanZhi = ganZhiMap.get("dayGanZhi");
        this.dayGan = dayGanZhi.get(0); // 日干
        this.dayZhi = dayGanZhi.get(1); // 日支
        this.dayGanZhi = dayGanZhi.get(2); // 日干支
        // 5.5、设置时干支
        List<String> hourGanZhi = ganZhiMap.get("hourGanZhi");
        this.hourGan = hourGanZhi.get(0); // 时干
        this.hourZhi = hourGanZhi.get(1); // 时支
        this.hourGanZhi = hourGanZhi.get(2); // 时干支

    }

    /**
     * 计算生肖、星座
     *
     * @param setting 八字-设置
     */
    private void zodiac(BaZiSetting setting) {

        // 1、设置生肖
        if (setting.getYearGanZhiSet() == 0) {
            this.zodiac = getLunar().getYearShengXiao(); // 以正月初一起算
        } else if (setting.getYearGanZhiSet() == 1) {
            this.zodiac = getLunar().getYearShengXiaoByLiChun(); // 以立春当天起算
        } else if (setting.getYearGanZhiSet() == 2) {
            this.zodiac = getLunar().getYearShengXiaoExact(); // 以立春交接时刻起算
        }

        // 2、设置星座
        this.constellation = getSolar().getXingZuo() + "座";

    }

    /**
     * 计算八字
     */
    private void baZi() {

        this.baZi = Arrays.asList(getYearGanZhi(), getMonthGanZhi(), getDayGanZhi(), getHourGanZhi()); // 八字

    }

    /**
     * 计算八字五行
     */
    private void baZiWuXing() {

        Map<String, String> ganWuXing = BaZiMap.GAN_WU_XING; // 天干五行（天干为键）
        Map<String, String> zhiWuXing = BaZiMap.ZHI_WU_XING; // 地支五行（地支为键）

        this.yearGanWuXing = ganWuXing.get(getYearGan());   // 年干五行
        this.monthGanWuXing = ganWuXing.get(getMonthGan()); // 月干五行
        this.dayGanWuXing = ganWuXing.get(getDayGan());     // 日干五行
        this.hourGanWuXing = ganWuXing.get(getHourGan());   // 时干五行

        this.yearZhiWuXing = zhiWuXing.get(getYearZhi());   // 年支五行
        this.monthZhiWuXing = zhiWuXing.get(getMonthZhi()); // 月支五行
        this.dayZhiWuXing = zhiWuXing.get(getDayZhi());     // 日支五行
        this.hourZhiWuXing = zhiWuXing.get(getHourZhi());   // 时支五行

        this.yearGanZhiWuXing = getYearGanWuXing() + getYearZhiWuXing();   // 年干支五行
        this.monthGanZhiWuXing = getMonthGanWuXing() + getMonthZhiWuXing(); // 月干支五行
        this.dayGanZhiWuXing = getDayGanWuXing() + getDayZhiWuXing();     // 日干支五行
        this.hourGanZhiWuXing = getHourGanWuXing() + getHourZhiWuXing();   // 时干支五行

        this.baZiWuXing = Arrays.asList(getYearGanZhiWuXing(), getMonthGanZhiWuXing(), getDayGanZhiWuXing(), getHourGanZhiWuXing()); // 八字五行

    }

    /**
     * 计算八字纳音
     */
    private void baZiNaYin() {

        Map<String, String> naYin = BaZiMap.NA_YIN; // 纳音（干支为键）

        this.yearGanZhiNaYin = naYin.get(getYearGanZhi());   // 年干支纳音
        this.monthGanZhiNaYin = naYin.get(getMonthGanZhi()); // 月干支纳音
        this.dayGanZhiNaYin = naYin.get(getDayGanZhi());     // 日干支纳音
        this.hourGanZhiNaYin = naYin.get(getHourGanZhi());   // 时干支纳音

        this.baZiNaYin = Arrays.asList(getYearGanZhiNaYin(), getMonthGanZhiNaYin(), getDayGanZhiNaYin(), getHourGanZhiNaYin()); // 八字纳音

    }

    /**
     * 计算八字旬空
     */
    private void baZiXunKong() {

        Map<String, String> kongWang = BaZiMap.KONG_WANG; // 空亡（干支为键）

        this.yearGanZhiXunKong = kongWang.get(getYearGanZhi()); // 年干支旬空
        this.monthGanZhiXunKong = kongWang.get(getMonthGanZhi()); // 月干支旬空
        this.dayGanZhiXunKong = kongWang.get(getDayGanZhi()); // 日干支旬空
        this.hourGanZhiXunKong = kongWang.get(getHourGanZhi()); // 时干支旬空

        this.baZiXunKong = Arrays.asList(getYearGanZhiXunKong(), getMonthGanZhiXunKong(), getDayGanZhiXunKong(), getHourGanZhiXunKong()); // 八字旬空

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

        Map<String, String> shiShen = BaZiMap.SHI_SHEN_MING_PAN_MAP; // 十神，用于命盘（日干+其他干支为键）

        this.yearGanZhiZhuXing = shiShen.get(getDayGan() + getYearGan()); // 年干支主星
        this.monthGanZhiZhuXing = shiShen.get(getDayGan() + getMonthGan()); // 月干支主星
        this.dayGanZhiZhuXing = "元" + getSex(); // 日干支主星
        this.hourGanZhiZhuXing = shiShen.get(getDayGan() + getHourGan()); // 时干支主星

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

        Map<String, List<String>> diZhiCangGan = BaZiMap.DI_ZHI_CANG_GAN; // 地支藏干（地支为键）

        this.yearZhiCangGan = diZhiCangGan.get(getYearZhi());   // 年支藏干
        this.monthZhiCangGan = diZhiCangGan.get(getMonthZhi()); // 月支藏干
        this.dayZhiCangGan = diZhiCangGan.get(getDayZhi());     // 日支藏干
        this.hourZhiCangGan = diZhiCangGan.get(getHourZhi());   // 时支藏干

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

        Map<String, String> shiShen = BaZiMap.SHI_SHEN_MING_PAN_MAP; // 十神，用于命盘（日干+其他干支为键）

        List<String> yearGanZhiFuXing = new ArrayList<>();
        List<String> monthGanZhiFuXing = new ArrayList<>();
        List<String> dayGanZhiFuXing = new ArrayList<>();
        List<String> hourGanZhiFuXing = new ArrayList<>();
        for (String cangGan : getYearZhiCangGan()) {
            yearGanZhiFuXing.add(shiShen.get(getDayGan() + cangGan)); // 年干支副星
        }
        for (String cangGan : getMonthZhiCangGan()) {
            monthGanZhiFuXing.add(shiShen.get(getDayGan() + cangGan)); // 月干支副星
        }
        for (String cangGan : getDayZhiCangGan()) {
            dayGanZhiFuXing.add(shiShen.get(getDayGan() + cangGan)); // 日干支副星
        }
        for (String cangGan : getHourZhiCangGan()) {
            hourGanZhiFuXing.add(shiShen.get(getDayGan() + cangGan)); // 时干支副星
        }

        this.yearGanZhiFuXing = yearGanZhiFuXing; // 年干支副星
        this.monthGanZhiFuXing = monthGanZhiFuXing; // 月干支副星
        this.dayGanZhiFuXing = dayGanZhiFuXing; // 日干支副星
        this.hourGanZhiFuXing = hourGanZhiFuXing; // 时干支副星

    }

    /**
     * 计算地势
     */
    private void diShi() {

        Map<String, String> shiErZhangSheng = BaZiMap.SHI_ER_ZHANG_SHENG; // 十二长生（日干+地支为键）

        this.yearGanZhiDiShi = shiErZhangSheng.get(getDayGan() + getYearZhi()); // 年干支地势
        this.monthGanZhiDiShi = shiErZhangSheng.get(getDayGan() + getMonthZhi()); // 月干支地势
        this.dayGanZhiDiShi = shiErZhangSheng.get(getDayGan() + getDayZhi()); // 日干支地势
        this.hourGanZhiDiShi = shiErZhangSheng.get(getDayGan() + getHourZhi()); // 时干支地势

    }

    /**
     * 计算常用神煞
     */
    private void shenSha() {

        String yearGanZhiNaYinWuXing = getYearGanZhiNaYin().substring(2, 3); // 年干支纳音五行
        BaZiShenShaUtil baZiShenShaUtil = new BaZiShenShaUtil(getBaZi(), yearGanZhiNaYinWuXing, getSeason(), getSex());
        this.yearGanZhiShenSha = baZiShenShaUtil.getYearGanZhiShenSha();   // 年干支神煞
        this.monthGanZhiShenSha = baZiShenShaUtil.getMonthGanZhiShenSha(); // 月干支神煞
        this.dayGanZhiShenSha = baZiShenShaUtil.getDayGanZhiShenSha();     // 日干支神煞
        this.hourGanZhiShenSha = baZiShenShaUtil.getHourGanZhiShenSha();   // 时干支神煞

    }

    /**
     * 计算天干留意
     */
    private void tianGanLiuYi() {

        Set<String> set = new HashSet<>();

        // 1、判断天干相生
//        Map<String, String> xiangSheng = BaZiMap.TIAN_GAN_XIANG_SHENG; // 天干相生（天干+天干为键）
//        saveTianGanLiuYi(set, xiangSheng);

        // 2、判断天干相合
        Map<String, String> xiangHe = BaZiMap.TIAN_GAN_XIANG_HE; // 天干相合（天干+天干为键）
        saveTianGanLiuYi(set, xiangHe);

        // 3、判断天干相冲
        Map<String, String> xiangChong = BaZiMap.TIAN_GAN_XIANG_CHONG; // 天干相冲（天干+天干为键）
        saveTianGanLiuYi(set, xiangChong);

        // 4、判断天干相克
        Map<String, String> xiangKe = BaZiMap.TIAN_GAN_XIANG_KE; // 天干相克（天干+天干为键）
        saveTianGanLiuYi(set, xiangKe);

        set.removeIf(Objects::isNull); // 删除所有null
        this.tianGanLiuYi = new ArrayList<>(set);

    }

    /**
     * 计算地支留意
     */
    private void diZhiLiuYi() {

        Set<String> set = new HashSet<>();

        // 1、判断地支半合
        Map<String, String> banHe = BaZiMap.DI_ZHI_BAN_HE; // 地支半合（地支+地支为键）
        saveDiZhiLiuYi(set, banHe);

        // 2、判断地支拱合
        Map<String, String> gongHe = BaZiMap.DI_ZHI_GONG_HE; // 地支拱合（地支+地支为键）
        saveDiZhiLiuYi(set, gongHe);

        // 3、判断地支暗合
        Map<String, String> anHe = BaZiMap.DI_ZHI_AN_HE; // 地支暗合（地支+地支为键）
        saveDiZhiLiuYi(set, anHe);

        // 4、判断地支三合
        Map<String, String> sanHe = BaZiMap.DI_ZHI_SAN_HE; // 地支三合（地支+地支为键）
        saveDiZhiLiuYi(set, sanHe);

        // 5、判断地支六合
        Map<String, String> liuHe = BaZiMap.DI_ZHI_LIU_HE; // 地支六合（地支+地支为键）
        saveDiZhiLiuYi(set, liuHe);

        // 6、判断地支相刑
        Map<String, String> xiangXing = BaZiMap.DI_ZHI_XIANG_XING; // 地支相刑（地支+地支为键）
        saveDiZhiLiuYi(set, xiangXing);

        // 7、判断地支三刑
        Map<String, String> sanXing = BaZiMap.DI_ZHI_SAN_XING; // 地支三刑（地支+地支+地支为键）
        saveDiZhiLiuYi2(set, sanXing);

        // 8、判断地支相冲
        Map<String, String> xiangChong = BaZiMap.DI_ZHI_XIANG_CHONG; // 地支相冲（地支+地支为键）
        saveDiZhiLiuYi(set, xiangChong);

        // 9、判断地支相破
        Map<String, String> xiangPo = BaZiMap.DI_ZHI_XIANG_PO; // 地支相破（地支+地支为键）
        saveDiZhiLiuYi(set, xiangPo);

        // 10、判断地支相害
        Map<String, String> xiangHai = BaZiMap.DI_ZHI_XIANG_HAI; // 地支相害（地支+地支为键）
        saveDiZhiLiuYi(set, xiangHai);

        set.removeIf(Objects::isNull); // 删除所有null
        this.diZhiLiuYi = new ArrayList<>(set);

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
     * 计算上一节及日期、下一节及日期、出生节气
     */
    private void jieQi() {

        Solar solar = getSolar(); // 公历日期
        Lunar lunar = getLunar(); // 农历日期

        // 1、计算上一节、上一节日期
        JieQi prevJie = lunar.getPrevJie(true);
        this.prevJie = prevJie.toString(); // 上一节
        String prevSolar = prevJie.getSolar().toYmdHms();
        this.prevJieDate = prevSolar; // 上一节日期

        // 2、计算下一节、下一节日期
        JieQi nextJie = lunar.getNextJie(true);
        this.nextJie = nextJie.toString(); // 下一节
        String nextSolar = nextJie.getSolar().toYmdHms();
        this.nextJieDate = nextSolar; // 下一节日期

        // 3、计算上一节与所选日期的时间间隔
        Map<String, Long> prevMap = DateUtil.dateInterval(prevSolar, solar.toYmdHms());

        // 4、计算所选日期与下一节的时间间隔
        Map<String, Long> nextMap = DateUtil.dateInterval(solar.toYmdHms(), nextSolar);

        // 5、设置数据
        this.prevJieDayNumber = Math.toIntExact(prevMap.get("days")); // 所选日期距上一节天数
        this.nextJieDayNumber = Math.toIntExact(nextMap.get("days")); // 所选日期距下一节天数
        String prevStr = "出生于" + prevJie + "后" + prevMap.get("days") + "天" + prevMap.get("hours") + "小时" + prevMap.get("minutes") + "分" + prevMap.get("seconds") + "秒";
        String nexStr = nextJie + "前" + nextMap.get("days") + "天" + nextMap.get("hours") + "小时" + nextMap.get("minutes") + "分" + nextMap.get("seconds") + "秒";
//        String prevStr = "出生于" + prevJie + "后" + prevMap.get("days") + "天" + prevMap.get("hours") + "小时";
//        String nexStr = nextJie + "前" + nextMap.get("days") + "天" + nextMap.get("hours") + "小时";
        this.birthSolarTerms = prevStr + "，" + nexStr;

    }

    /**
     * 计算人元司令分野
     *
     * @param setting 八字-设置
     */
    private void renYuan(BaZiSetting setting) {

        String renYuan = "";

        int prevJieDayNumber = getPrevJieDayNumber() > 29 ? 1 : getPrevJieDayNumber(); // TODO：待修复

        // 1、判断计算方式
        if (setting.getRenYuan() == 0) {
            // 1.1、子平真诠法决
            Map<String, List<String>> ziRenYuan = BaZiMap.ZI_REN_YUAN;
            renYuan = ziRenYuan.get(getMonthZhi()).get(prevJieDayNumber);
        } else if (setting.getRenYuan() == 1) {
            // 1.2、渊海子平法决
            Map<String, List<String>> yuanRenYuan = BaZiMap.YUAN_REN_YUAN;
            renYuan = yuanRenYuan.get(getMonthZhi()).get(prevJieDayNumber);
        } else if (setting.getRenYuan() == 2) {
            // 1.3、星平会海法决
            Map<String, List<String>> xingRenYuan = BaZiMap.XING_REN_YUAN;
            renYuan = xingRenYuan.get(getMonthZhi()).get(prevJieDayNumber);
        } else if (setting.getRenYuan() == 3) {
            // 1.4、三命通会法决
            Map<String, List<String>> xingRenYuan = BaZiMap.SAN_REN_YUAN;
            renYuan = xingRenYuan.get(getMonthZhi()).get(prevJieDayNumber);
        } else if (setting.getRenYuan() == 4) {
            // 1.5、神峰通考法决
            Map<String, List<String>> xingRenYuan = BaZiMap.SHEN_REN_YUAN;
            renYuan = xingRenYuan.get(getMonthZhi()).get(prevJieDayNumber);
        } else if (setting.getRenYuan() == 5) {
            // 1.6、万育吾之法决
            Map<String, List<String>> xingRenYuan = BaZiMap.WAN_REN_YUAN;
            renYuan = xingRenYuan.get(getMonthZhi()).get(prevJieDayNumber);
        }

        // 2、处理数据
        Map<String, String> ganYinYangWuXing = BaZiMap.GAN_WU_XING; // 天干五行
        if (!"".equals(renYuan)) {
            String wuXing = ganYinYangWuXing.get(renYuan); // 获取人元五行
            this.renYuan = renYuan + wuXing + "值令";
        }

    }

    /**
     * 计算星宿、星宿吉凶、星宿吉凶歌诀
     */
    private void xingXiu() {

        this.xingXiu = getLunar().getXiu() + "宿" + getLunar().getGong() + "方" + getLunar().getShou(); // 星宿
        this.xiuJiXiong = getLunar().getXiuLuck(); // 星宿吉凶
        this.xiuJiXiongGeJue = getLunar().getXiuSong(); // 星宿吉凶歌诀

    }

    /**
     * 计算胎元、胎息、命宫、身宫
     */
    private void taiGong() {

        EightChar ec = getLunar().getEightChar();

        this.taiYuan = ec.getTaiYuan() + "（" + ec.getTaiYuanNaYin() + "）"; // 胎元
        this.taiXi = ec.getTaiXi() + "（" + ec.getTaiXiNaYin() + "）"; // 胎息
        this.mingGong = ec.getMingGong() + "（" + ec.getMingGongNaYin() + "）"; // 命宫
        this.shenGong = ec.getShenGong() + "（" + ec.getShenGongNaYin() + "）"; // 身宫

    }

    /**
     * 计算命、命卦、命卦信息
     */
    private void mingGua() {

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

        Map<Integer, List<String>> map = BaZiMap.MING_GUA; // 命卦

        // 2、计算年份合数
        int yearCount = 0; // 年份合数
        String yearStr = String.valueOf(getSolar().getYear());
        for (int i = 0; i < yearStr.length(); i++) {
            yearCount += Integer.parseInt(yearStr.split("")[i]);
        }

        // 3、男命
        if ("男".equals(getSex())) {
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
            List<String> list = map.get(11 - yearCount);
            this.mingGua = list.get(0); // 获取命卦
            this.mingGuaInfo = list.get(2); // 获取命卦信息
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
            List<String> list = map.get(womManMingGuaGong);
            this.mingGua = list.get(0); // 获取命卦
            this.mingGuaInfo = list.get(2); // 获取命卦信息
        }

    }

    /**
     * 计算五行缺失
     */
    private void wuXingQueShi() {

        Map<String, String> ganW = BaZiMap.GAN_WU_XING; // 天干五行
        Map<String, String> zhiW = BaZiMap.ZHI_WU_XING; // 地支五行

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
     * 计算五行数量
     */
    private void wuXingCount() {

        // 1.1、添加干支五行
        List<String> ganZHiWuXingList = Arrays.asList(
                getYearGanWuXing(), getMonthGanWuXing(), getDayGanWuXing(), getHourGanWuXing(),
                getYearZhiWuXing(), getMonthZhiWuXing(), getDayZhiWuXing(), getHourZhiWuXing()
        );
        // 1.2、获取八字五行中出现的重复元素及出现次数
        Map<String, Integer> map = CommonUtil.getListIdentical(ganZHiWuXingList);

        // 2、保存五行数量
        List<String> baZiWuXingCount = new ArrayList<>();
        for (String key : map.keySet()) {
            baZiWuXingCount.add(map.get(key) + key);
        }

        this.baZiWuXingCount = baZiWuXingCount;

    }

    /**
     * 计算五行旺衰
     */
    private void wuXingWangShuai() {

        Map<String, List<String>> wangShuai = BaZiMap.WU_XING_WANG_SHUAI; // 五行旺衰（按月支判断）
        this.wuXingWangShuai = wangShuai.get(getMonthZhi());


    }

    /**
     * 计算身体强弱
     */
    private void bodyIntensity() {

        /*
            1、根据[日元]和[月令]之间的五行生克关系计算。

                解释：日元代表自己，月令代表父母或兄弟。
                口诀：同我、生我为强；克我、我生、我克为弱。
            ----------------------------------------------------

            2、根据[日元]和[其他干支]之间的算分进行计算。

            ----------------------------------------------------
            TODO：此处采用第2种方法：根据[日元]和[其他干支]之间的算分进行计算，暂不考虑其他各种因素。
         */

        Map<String, String> shengKe = BaZiMap.GAN_ZHI_WU_XING_SHENG_KE; // 天干和干支的五行生克关系

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
        Map<String, String> ganWuXing = BaZiMap.GAN_WU_XING; // 天干五行
        Map<String, String> zhiWuXing = BaZiMap.ZHI_WU_XING; // 地支五行
        Map<String, String> shengKe = BaZiMap.GAN_ZHI_WU_XING_SHENG_KE;// 天干和干支的五行生克关系

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
        Map<String, List<String>> map = BaZiMap.XI_YONG_SHEN; // 具体法获取喜用神（天干+季节为键）
        this.xiYongShen = map.get(getDayGan() + season);

    }

    /**
     * 计算喜用神方位
     */
    private void xiYongShenFangWei() {

        List<String> list = new ArrayList<>();
        Map<String, List<String>> wuXingFangWei = BaZiMap.WU_XING_FANG_WEI; // 五行对应方位
        for (int i = 0; i < getXiYongShen().size(); i++) {
            String xiYongShen = getXiYongShen().get(i); // 每一个喜用神的方位
            List<String> xiYongFangWei = wuXingFangWei.get(xiYongShen);
            list.addAll(xiYongFangWei); // 保存所有喜用神的方位
        }
        this.xiYongShenFangWei = list;

    }

    /**
     * 计算骨重
     */
    private void guZhong() {

        Map<String, Integer> yearMap = BaZiMap.YEAR_GU_ZHONG; // 出生年骨重
        Map<String, Integer> monthMap = BaZiMap.MONTH_GU_ZHONG; // 出生月骨重
        Map<String, Integer> dayMap = BaZiMap.DAY_GU_ZHONG; // 出生日骨重
        Map<String, Integer> hourMap = BaZiMap.HOUR_GU_ZHONG; // 出生时辰骨重

        int yearGuZhong = yearMap.get(getYearGanZhi()); // 出生年骨重
        int monthGuZhong = monthMap.get(getMonthZhi()); // 出生月骨重
        int dayGuZhong = dayMap.get(getLunar().getDayInChinese()); // 出生日骨重
        int hourGuZhong = hourMap.get(getHourZhi()); // 出生时辰骨重

        int guZhong = yearGuZhong + monthGuZhong + dayGuZhong + hourGuZhong; // 命主骨重
        guZhong = Math.max(guZhong, 21); // 最轻骨重

        // 1、男命
        if ("男".equals(getSex())) {
            guZhong = Math.min(guZhong, 72); // 男命的最重骨重
            Map<Integer, String> yunChengWan = BaZiMap.YUN_CHENG_WAN; // 骨重批注（男命）
            this.guZhong = guZhongCharacters(guZhong); // 骨重转为文字
            this.guZhongPiZhu = yunChengWan.get(guZhong);
        } else {
            // 2、女命
            guZhong = Math.min(guZhong, 71); // 女命的最重骨重
            Map<Integer, String> yunChengWan = BaZiMap.YUN_CHENG_WOMAN; // 骨重批注（女命）
            this.guZhong = guZhongCharacters(guZhong); // 骨重转为文字
            this.guZhongPiZhu = yunChengWan.get(guZhong);
        }

    }

    /**
     * 计算日柱论命
     */
    private void dayZhuLunMing() {

        Map<String, String> lunMing = BaZiMap.DAY_ZHU_LUN_MING; // 日柱论命（日柱为键）
        this.dayZhuLunMing = lunMing.get(getDayGanZhi());

    }

    /**
     * 计算姻缘
     */
    private void yinYuan() {

        Map<String, String> map = BaZiMap.YIN_YUAN; // 姻缘（日干支纳音+农历月份为键）

        String dayGanZhiNaYin = getDayGanZhiNaYin().substring(2, 3); // 日干支纳音（如：木）
        int lunarMonth = getLunar().getMonth(); // 农历月份
        if (lunarMonth < 0) lunarMonth = -lunarMonth; // 月份若为负数则转为正数

        this.yinYuan = map.get(dayGanZhiNaYin + lunarMonth);

    }

    /**
     * 计算五行分析
     */
    private void wuXingFenXi() {

        String yearGanZhiNaYin = getYearGanZhiNaYin().substring(2, 3); // 年干支纳音（如：木）
        Map<String, String> wuXingFenXi = BaZiMap.WU_XING_FEN_XI; // 五行分析（根据年柱纳音五行计算）
        this.wuXingFenXi = "命主生于" + getYearGanZhi() + "年为" + getYearGanZhiNaYin() + "命，" + wuXingFenXi.get(yearGanZhiNaYin);

    }

    /**
     * 计算大运及大运十神
     *
     * @param setting 八字-设置
     */
    private DaYun[] daYun(BaZiSetting setting) {

        EightChar ec = getLunar().getEightChar();

        // 初始化运
        Yun yun = ec.getYun(setting.getSex(), setting.getQiYunLiuPai());

        List<List<String>> daYunList = new ArrayList<>(); // 大运
        List<List<String>> daYunShiShenList = new ArrayList<>(); // 大运十神

        // 获取指定轮数的大运
        DaYun[] daYun = yun.getDaYun(12);
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
     * 计算大运流月及大运流月十神
     *
     * @param liuNian 大运流年
     */
    private void daYunLiuYue(LiuNian[] liuNian) {

        String[] shiErJie = BaZiMap.SHI_ER_JIE; // 十二节
        List<List<String>> liuYueList = new ArrayList<>(); // 流月
        List<List<String>> liuYueShiShenList = new ArrayList<>(); // 流月十神

        // 遍历流年
        for (LiuNian ln : liuNian) {
            // 获取流月
            LiuYue[] liuYue = ln.getLiuYue();
            for (int i = 0; i < liuYue.length; i++) {
                // 添加流月
                liuYueList.add(new ArrayList<>(Arrays.asList(shiErJie[i], liuYue[i].getGanZhi())));
                // 添加流月十神
                List<String> shiShen = getShiShen(liuYue[i].getGanZhi());
                liuYueShiShenList.add(shiShen);
            }
        }

        this.daYunLiuYue = liuYueList; // 流月
        this.daYunLiuYueShiShen = liuYueShiShenList; // 流月十神

    }

    /**
     * 计算小运流月及小运流月十神
     */
    private void xiaoYunLiuYue() {

        String[] shiErJie = BaZiMap.SHI_ER_JIE; // 十二节
        List<List<String>> liuYueList = new ArrayList<>(); // 小流月
        List<List<String>> liuYueShiShenList = new ArrayList<>(); // 小流月十神

        // 1、计算小运一共持续几年
        int daYunStart = Integer.parseInt(getDaYun().get(1).get(1)); // 大运开始的年份
        int xiaoYunStart = Integer.parseInt(getDaYun().get(0).get(1)); // 小运开始的年份
        int xiaoYunCount = daYunStart - xiaoYunStart;
        xiaoYunCount = xiaoYunCount == 0 ? 1 : xiaoYunCount;

        // 2、计算传入日期的立春当月的干支
        Lunar lunar = new Lunar(getLunar().getYear(), 1, 15);
        String monthInGanZhi = lunar.getMonthInGanZhiExact();

        // 3、遍历大运流月，查找月干支所处的索引
        int index = 0;
        List<List<String>> daYunLiuYue = getDaYunLiuYue();
        for (int i = 0; i < daYunLiuYue.size(); i++) {
            String ganZhi = daYunLiuYue.get(i).get(1);
            if (ganZhi.equals(monthInGanZhi)) {
                index = i;
                break;
            } else {
                index++;
            }
        }

        // 4、从月干支索引处向后依次添加小运流月
        int shiEr = 0;
        int xiaoYunLiuYueCount = xiaoYunCount * 12;
        for (int i = 0; i < xiaoYunLiuYueCount; i++) {
            // 添加流月
            liuYueList.add(new ArrayList<>(Arrays.asList(shiErJie[shiEr], daYunLiuYue.get(i + index).get(1))));
            // 添加流月十神
            List<String> shiShen = getShiShen(daYunLiuYue.get(i + index).get(1));
            liuYueShiShenList.add(shiShen);
            shiEr++;
            if (shiEr > 11) shiEr = 0;
        }

        this.xiaoYunLiuYue = liuYueList; // 小运流月
        this.xiaoYunLiuYueShiShen = liuYueShiShenList; // 小运流月十神

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
        Map<String, List<String>> riZhuZhengCai = BaZiMap.RI_ZHU_ZHENG_CAI; // 男女日主正财
        Map<String, List<String>> riZhuPianCai = BaZiMap.RI_ZHU_PIAN_CAI; // 男女日主偏财

        // 2、遍历流年
        for (List<String> key : liuNian) {
            String gan = key.get(2).substring(0, 1); // 流年天干
            String zhi = key.get(2).substring(1, 2); // 流年地支
            List<String> zhengCaiGanZhi = riZhuZhengCai.get(dayGan); // 男女日主正财干支
            List<String> pianCaiGanZhi = riZhuPianCai.get(dayGan); // 男女日主偏财干支
            // 遍历日干正财干支（偏财数量与正财相同）
            for (int j = 0; j < zhengCaiGanZhi.size(); j++) {
                // 判断流年干支是否为正财
                if (gan.equals(zhengCaiGanZhi.get(j)) || zhi.equals(zhengCaiGanZhi.get(j))) {
                    zhengCaiList.add(key);
                    break;
                }
                // 判断流年干支是否为偏财
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
        Map<String, List<String>> riZhuZhengTaoHua = BaZiMap.NV_RI_ZHU_ZHENG_TAO_HUA; // 女日主正桃花
        Map<String, List<String>> riZhuPianTaoHua = BaZiMap.NV_RI_ZHU_PIAN_TAO_HUA; // 女日主偏桃花

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
                    // 判断流年干支是否为正桃花
                    if (gan.equals(zhengCaiGanZhi.get(j)) || zhi.equals(zhengCaiGanZhi.get(j))) {
                        zhengTaoHuaList.add(key);
                        break;
                    }
                    // 判断流年干支是否为偏桃花
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

//------------------------------------------------------------------------------------------------------------------------------------

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
     * 添加地支留意
     *
     * @param set 地支组合
     * @param map 地支六合、相冲、相破、相害
     */
    private void saveDiZhiLiuYi2(Set<String> set, Map<String, String> map) {

        set.add(map.get(getYearZhi() + getMonthZhi() + getDayZhi()));  // 年支+月支+日支
        set.add(map.get(getYearZhi() + getMonthZhi() + getHourZhi())); // 年支+月支+时支
        set.add(map.get(getYearZhi() + getDayZhi() + getMonthZhi()));  // 年支+日支+月支
        set.add(map.get(getYearZhi() + getDayZhi() + getHourZhi()));   // 年支+日支+时支
        set.add(map.get(getYearZhi() + getHourZhi() + getMonthZhi())); // 年支+时支+月支
        set.add(map.get(getYearZhi() + getHourZhi() + getDayZhi()));   // 年支+时支+日支

        set.add(map.get(getMonthZhi() + getYearZhi() + getDayZhi()));  // 月支+年支+日支
        set.add(map.get(getMonthZhi() + getYearZhi() + getHourZhi())); // 月支+年支+时支
        set.add(map.get(getMonthZhi() + getDayZhi() + getYearZhi()));  // 月支+日支+年支
        set.add(map.get(getMonthZhi() + getDayZhi() + getHourZhi()));  // 月支+日支+时支
        set.add(map.get(getMonthZhi() + getHourZhi() + getYearZhi())); // 月支+时支+年支
        set.add(map.get(getMonthZhi() + getHourZhi() + getDayZhi()));  // 月支+时支+日支

        set.add(map.get(getDayZhi() + getYearZhi() + getMonthZhi())); // 日支+年支+月支
        set.add(map.get(getDayZhi() + getYearZhi() + getHourZhi()));  // 日支+年支+时支
        set.add(map.get(getDayZhi() + getMonthZhi() + getYearZhi())); // 日支+月支+年支
        set.add(map.get(getDayZhi() + getMonthZhi() + getHourZhi())); // 日支+月支+时支
        set.add(map.get(getDayZhi() + getHourZhi() + getYearZhi()));  // 日支+时支+年支
        set.add(map.get(getDayZhi() + getHourZhi() + getMonthZhi())); // 日支+时支+月支

        set.add(map.get(getHourZhi() + getYearZhi() + getMonthZhi())); // 时支+年支+月支
        set.add(map.get(getHourZhi() + getYearZhi() + getDayZhi()));   // 时支+年支+日支
        set.add(map.get(getHourZhi() + getMonthZhi() + getYearZhi())); // 时支+月支+年支
        set.add(map.get(getHourZhi() + getMonthZhi() + getDayZhi()));  // 时支+月支+日支
        set.add(map.get(getHourZhi() + getDayZhi() + getYearZhi()));   // 时支+日支+年支
        set.add(map.get(getHourZhi() + getDayZhi() + getMonthZhi()));  // 时支+日支+月支

    }

    /**
     * 骨重转为文字
     *
     * @param guZhong 骨重
     * @return 骨重文字
     */
    private String guZhongCharacters(Integer guZhong) {

        long liang = Long.parseLong(guZhong.toString().substring(0, 1)); // 两重
        long qian = Long.parseLong(guZhong.toString().substring(1, 2)); // 钱重

        String newGuZhong = CommonUtil.shuToHan(liang) + "两";
        if (0 != qian) {
            newGuZhong += CommonUtil.shuToHan(qian) + "钱";
        }

        return newGuZhong;

    }

    /**
     * 返回十神
     *
     * @param ganZhi 干支
     * @return 十神
     */
    private List<String> getShiShen(String ganZhi) {

        List<String> shiShen = new ArrayList<>(); // 十神
        Map<String, String> shiShenMap = BaZiMap.SHI_SHEN_YUN_NIAN_MAP; // 十神，用于大运流年（日干+其他干支为键）

        String gan = ganZhi.substring(0, 1); // 天干
        String zhi = ganZhi.substring(1, 2); // 地支
        String ganShiShen = shiShenMap.get(getDayGan() + gan); // 天干十神
        String zhiShiShen = shiShenMap.get(getDayGan() + zhi); // 地支十神
        shiShen.add(ganShiShen);
        shiShen.add(zhiShiShen);

        return shiShen;

    }

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

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("公历:").append(getSolarStr());
        sb.append("   ");
        sb.append("农历:").append(getLunarStr());
        sb.append("   ");
        sb.append("星期:").append(getWeek());
        sb.append("   ");
        sb.append("八字:").append(getBaZi());
        sb.append("   ");
        sb.append("八字五行:").append(getBaZiWuXing());
        sb.append("   ");
        sb.append("八字纳音:").append(getBaZiNaYin());
        sb.append("   ");
        sb.append("八字旬空:").append(getBaZiXunKong());
        sb.append("   ");
        sb.append("年干支主星:").append(getYearGanZhiZhuXing());
        sb.append("   ");
        sb.append("月干支主星:").append(getMonthGanZhiZhuXing());
        sb.append("   ");
        sb.append("日干支主星:").append(getDayGanZhiZhuXing());
        sb.append("   ");
        sb.append("时干支主星:").append(getHourGanZhiZhuXing());
        sb.append("   ");
        sb.append("年支藏干:").append(getYearZhiCangGan());
        sb.append("   ");
        sb.append("月支藏干:").append(getMonthZhiCangGan());
        sb.append("   ");
        sb.append("日支藏干:").append(getDayZhiCangGan());
        sb.append("   ");
        sb.append("时支藏干:").append(getHourZhiCangGan());
        sb.append("   ");
        sb.append("年干支副星:").append(getYearGanZhiFuXing());
        sb.append("   ");
        sb.append("月干支副星:").append(getMonthGanZhiFuXing());
        sb.append("   ");
        sb.append("日干支副星:").append(getDayGanZhiFuXing());
        sb.append("   ");
        sb.append("时干支副星:").append(getHourGanZhiFuXing());
        sb.append("   ");
        sb.append("年支地势:").append(getYearGanZhiDiShi());
        sb.append("   ");
        sb.append("月支地势:").append(getMonthGanZhiDiShi());
        sb.append("   ");
        sb.append("日支地势:").append(getDayGanZhiDiShi());
        sb.append("   ");
        sb.append("时支地势:").append(getHourGanZhiDiShi());
        sb.append("   ");
        sb.append("胎元:").append(getTaiYuan());
        sb.append("   ");
        sb.append("胎息:").append(getTaiXi());
        sb.append("   ");
        sb.append("命宫:").append(getMingGong());
        sb.append("   ");
        sb.append("身宫:").append(getShenGong());

        return sb.toString();

    }


}
