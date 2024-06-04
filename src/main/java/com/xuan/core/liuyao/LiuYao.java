package com.xuan.core.liuyao;

import com.nlf.calendar.EightChar;
import com.nlf.calendar.Lunar;
import com.nlf.calendar.Solar;
import com.xuan.utils.CommonUtil;
import lombok.Getter;

import java.util.*;

/**
 * 六爻
 *
 * @author 善待
 */
@Getter
public class LiuYao {

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
     * 六爻爻象（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：[—, --, --, --, --, —]）
     */
    private List<String> liuYaoAs;
    /**
     * 六爻爻象标识（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：[老阳, 老阴, 少阴, 老阴, 少阴, 少阳]）
     */
    private List<String> liuYaoYaoXiangMark;
    /**
     * 六爻爻象标识名称（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：[○, ×, , ×, , ]）
     */
    private List<String> liuYaoYaoXiangMarkName;

    /**
     * 上卦（如：乾）
     */
    private String shangGua;
    /**
     * 下卦（如：乾）
     */
    private String xiaGua;

    /**
     * 本卦（如：乾为天）
     */
    private String benGua;
    /**
     * 变卦（如：乾为天）
     */
    private String bianGua;
    /**
     * 互卦（如：乾为天）
     */
    private String huGua;
    /**
     * 错卦（如：乾为天）
     */
    private String cuoGua;
    /**
     * 综卦（如：乾为天）
     */
    private String zongGua;

    /**
     * 上卦卦象（如：☰）
     */
    private String shangGuaAs;
    /**
     * 下卦卦象（如：☰）
     */
    private String xiaGuaAs;
    /**
     * 本卦卦象（如：䷀）
     */
    private String benGuaAs;
    /**
     * 变卦卦象（如：䷀）
     */
    private String bianGuaAs;
    /**
     * 互卦卦象（如：䷀）
     */
    private String huGuaAs;
    /**
     * 错卦卦象（如：䷀）
     */
    private String cuoGuaAs;
    /**
     * 综卦卦象（如：䷀）
     */
    private String zongGuaAs;

    /**
     * 本卦的六爻爻象（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：—, —, —, —, —, —）
     */
    private List<String> benGuaLiuYaoAs;
    /**
     * 变卦的六爻爻象（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：—, —, —, —, —, —）
     */
    private List<String> bianGuaLiuYaoAs;
    /**
     * 互卦的六爻爻象（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：—, —, —, —, —, —）
     */
    private List<String> huGuaLiuYaoAs;
    /**
     * 错卦的六爻爻象（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：—, —, —, —, —, —）
     */
    private List<String> cuoGuaLiuYaoAs;
    /**
     * 综卦的六爻爻象（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：—, —, —, —, —, —）
     */
    private List<String> zongGuaLiuYaoAs;

    /**
     * 本卦的六爻名称（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：初九, 九二, 九三, 九四, 九五, 上九）
     */
    private List<String> benGuaLiuYaoName;
    /**
     * 变卦的六爻名称（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：初九, 九二, 九三, 九四, 九五, 上九）
     */
    private List<String> bianGuaLiuYaoName;
    /**
     * 互卦的六爻名称（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：初九, 九二, 九三, 九四, 九五, 上九）
     */
    private List<String> huGuaLiuYaoName;
    /**
     * 错卦的六爻名称（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：初九, 九二, 九三, 九四, 九五, 上九）
     */
    private List<String> cuoGuaLiuYaoName;
    /**
     * 综卦的六爻名称（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：初九, 九二, 九三, 九四, 九五, 上九）
     */
    private List<String> zongGuaLiuYaoName;

    /**
     * 本卦的六爻世应（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：, , 应, , , 世）
     */
    private List<String> benGuaLiuYaoShiYing;
    /**
     * 变卦的六爻世应（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：, , 应, , , 世）
     */
    private List<String> bianGuaLiuYaoShiYing;
    /**
     * 互卦的六爻世应（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：, , 应, , , 世）
     */
    private List<String> huGuaLiuYaoShiYing;
    /**
     * 错卦的六爻世应（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：, , 应, , , 世）
     */
    private List<String> cuoGuaLiuYaoShiYing;
    /**
     * 综卦的六爻世应（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：, , 应, , , 世）
     */
    private List<String> zongGuaLiuYaoShiYing;

    /**
     * 本卦的六爻六亲（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：子孙, 妻财, 父母, 宫鬼, 兄弟, 父母）
     */
    private List<String> benGuaLiuYaoLiuQin;
    /**
     * 变卦的六爻六亲（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：子孙, 妻财, 父母, 宫鬼, 兄弟, 父母）
     */
    private List<String> bianGuaLiuYaoLiuQin;
    /**
     * 互卦的六爻六亲（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：子孙, 妻财, 父母, 宫鬼, 兄弟, 父母）
     */
    private List<String> huGuaLiuYaoLiuQin;
    /**
     * 错卦的六爻六亲（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：子孙, 妻财, 父母, 宫鬼, 兄弟, 父母）
     */
    private List<String> cuoGuaLiuYaoLiuQin;
    /**
     * 综卦的六爻六亲（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：子孙, 妻财, 父母, 宫鬼, 兄弟, 父母）
     */
    private List<String> zongGuaLiuYaoLiuQin;

    /**
     * 本卦的六爻干支（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：甲子, 甲寅, 甲辰, 壬午, 壬申, 壬戌）
     */
    private List<String> benGuaLiuYaoGanZhi;
    /**
     * 变卦的六爻干支（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：甲子, 甲寅, 甲辰, 壬午, 壬申, 壬戌）
     */
    private List<String> bianGuaLiuYaoGanZhi;
    /**
     * 互卦的六爻干支（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：甲子, 甲寅, 甲辰, 壬午, 壬申, 壬戌）
     */
    private List<String> huGuaLiuYaoGanZhi;
    /**
     * 错卦的六爻干支（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：甲子, 甲寅, 甲辰, 壬午, 壬申, 壬戌）
     */
    private List<String> cuoGuaLiuYaoGanZhi;
    /**
     * 综卦的六爻干支（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：甲子, 甲寅, 甲辰, 壬午, 壬申, 壬戌）
     */
    private List<String> zongGuaLiuYaoGanZhi;

    /**
     * 本卦的六爻五行（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：水, 木, 土, 火, 金, 土）
     */
    private List<String> benGuaLiuYaoWuXing;
    /**
     * 变卦的六爻五行（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：水, 木, 土, 火, 金, 土）
     */
    private List<String> bianGuaLiuYaoWuXing;
    /**
     * 互卦的六爻五行（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：水, 木, 土, 火, 金, 土）
     */
    private List<String> huGuaLiuYaoWuXing;
    /**
     * 错卦的六爻五行（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：水, 木, 土, 火, 金, 土）
     */
    private List<String> cuoGuaLiuYaoWuXing;
    /**
     * 综卦的六爻五行（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：水, 木, 土, 火, 金, 土）
     */
    private List<String> zongGuaLiuYaoWuXing;

    /**
     * 本卦的六爻六神（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：青龙, 朱雀, 勾陈, 螣蛇, 白虎, 玄武）
     */
    private List<String> benGuaLiuYaoLiuShen;
    /**
     * 变卦的六爻六神（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：青龙, 朱雀, 勾陈, 螣蛇, 白虎, 玄武）
     */
    private List<String> bianGuaLiuYaoLiuShen;
    /**
     * 互卦的六爻六神（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：青龙, 朱雀, 勾陈, 螣蛇, 白虎, 玄武）
     */
    private List<String> huGuaLiuYaoLiuShen;
    /**
     * 错卦的六爻六神（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：青龙, 朱雀, 勾陈, 螣蛇, 白虎, 玄武）
     */
    private List<String> cuoGuaLiuYaoLiuShen;
    /**
     * 综卦的六爻六神（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：青龙, 朱雀, 勾陈, 螣蛇, 白虎, 玄武）
     */
    private List<String> zongGuaLiuYaoLiuShen;

    /**
     * 本卦的六爻爻辞（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> benGuaLiuYaoYaoCi;
    /**
     * 变卦的六爻爻辞（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> bianGuaLiuYaoYaoCi;
    /**
     * 互卦的六爻爻辞（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> huGuaLiuYaoYaoCi;
    /**
     * 错卦的六爻爻辞（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> cuoGuaLiuYaoYaoCi;
    /**
     * 综卦的六爻爻辞（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> zongGuaLiuYaoYaoCi;

    /**
     * 本卦卦辞
     */
    private String benGuaGuaCi;
    /**
     * 变卦卦辞
     */
    private String bianGuaGuaCi;
    /**
     * 互卦卦辞
     */
    private String huGuaGuaCi;
    /**
     * 错卦卦辞
     */
    private String cuoGuaGuaCi;
    /**
     * 综卦卦辞
     */
    private String zongGuaGuaCi;

    /**
     * 驿马
     */
    private String yiMa;
    /**
     * 天马
     */
    private String tianMa;
    /**
     * 天元禄
     */
    private String tianYuanLu;
    /**
     * 天乙贵人
     */
    private String tianYiGuiRen;
    /**
     * 太极贵人
     */
    private String taiJiGuiRen;
    /**
     * 天德贵人
     */
    private String tianDeGuiRen;
    /**
     * 月德贵人
     */
    private String yueDeGuiRen;
    /**
     * 唐符国印
     */
    private String tangFuGuoYin;
    /**
     * 咸池（桃花）
     */
    private String xianChi;
    /**
     * 天喜
     */
    private String tianXi;
    /**
     * 皇恩
     */
    private String huangEn;
    /**
     * 文昌
     */
    private String wenChang;
    /**
     * 华盖
     */
    private String huaGai;
    /**
     * 将星
     */
    private String jiangXing;
    /**
     * 灾煞
     */
    private String zaiSha;
    /**
     * 劫煞
     */
    private String jieSha;
    /**
     * 谋星
     */
    private String mouXing;
    /**
     * 天医
     */
    private String tianYi;

//************************************************************************************************************************************

    /**
     * 使用默认设置初始化（默认使用当前公历日期）
     */
    public LiuYao() {
        LiuYaoSetting setting = new LiuYaoSetting();
        core(setting); // 获取并设置数据
    }

    /**
     * 使用公历日期初始化
     *
     * @param date 公历日期
     */
    public LiuYao(Date date) {
        LiuYaoSetting setting = new LiuYaoSetting(date);
        core(setting); // 获取并设置数据
    }

    /**
     * 使用日期初始化
     *
     * @param date     公历日期
     * @param dateType 日期类型（0:公历。1:农历）
     */
    public LiuYao(Date date, int dateType) {
        LiuYaoSetting setting = new LiuYaoSetting(date, dateType);
        core(setting); // 获取并设置数据
    }

    /**
     * 使用公历年月日时分秒初始化
     *
     * @param year   公历年（0~9999）
     * @param month  公历月（1~12）
     * @param day    公历日
     * @param hour   公历时（0~24）
     * @param minute 公历分（0~24）
     * @param second 公历秒（0~24）
     */
    public LiuYao(int year, int month, int day, int hour, int minute, int second) {
        LiuYaoSetting setting = new LiuYaoSetting(year, month, day, hour, minute, second);
        core(setting); // 获取并设置数据
    }

    /**
     * 使用年月日时分秒、日期类型初始化
     *
     * @param year     年
     * @param month    月
     * @param day      日
     * @param hour     时
     * @param minute   分
     * @param second   秒
     * @param dateType 日期类型（0:公历。1:农历）
     */
    public LiuYao(int year, int month, int day, int hour, int dateType, int minute, int second) {
        LiuYaoSetting setting = new LiuYaoSetting(year, month, day, hour, minute, second, dateType);
        core(setting); // 获取并设置数据
    }

    /**
     * 使用自定义设置初始化
     *
     * @param setting 设置
     */
    public LiuYao(LiuYaoSetting setting) {
        core(setting); // 获取并设置数据
    }

//====================================================================================================================================

    /**
     * 获取并设置数据（★核心）
     *
     * @param setting 六爻-设置
     */
    private void core(LiuYaoSetting setting) {

        // 初始化自定义数据
        initialize(setting);

        // 计算数据
        baZiData(); // 计算八字、八字五行、八字纳音、八字旬空
        shangGua(); // 计算上卦的卦名、卦象
        xiaGua(); // 计算下卦的卦名、卦象
        benGua(); // 计算本卦的卦名、卦象、爻象、六爻名称、六爻世应、六爻六亲、六爻干支、六爻五行、六爻六神、六爻爻辞
        bianGua(); // 计算变卦的卦名、卦象、爻象、六爻名称、六爻世应、六爻六亲、六爻干支、六爻五行、六爻六神、六爻爻辞
        huGua(); // 计算互卦的卦象、卦名、六爻爻象、名称、世应、六亲、干支、五行、六神、爻辞
        cuoGua(); // 计算错卦的卦象、卦名、六爻爻象、名称、世应、六亲、干支、五行、六神、爻辞
        zongGua(); // 计算综卦的卦象、卦名、六爻爻象、名称、世应、六亲、干支、五行、六神、爻辞
        guaCi(); // 计算本卦、变卦、互卦、错卦、综卦的卦辞
        yiMa(); // 计算驿马
        tianMa(); // 计算天马
        tianYuanLu(); // 计算天元禄
        tianYiGuiRen(); // 计算天乙贵人
        taiJiGuiRen(); // 计算太极贵人
        tianDeGuiRen(); // 计算天德贵人
        yueDeGuiRen(); // 计算月德贵人
        tangFuGuoYin(); // 计算唐符国印
        xianChi(); // 计算咸池（桃花）
        tianXi(); // 计算天喜
        huangEn(); // 计算皇恩
        wenChang(); // 计算文昌
        huaGai(); // 计算华盖
        jiangXing(); // 计算将星
        zaiSha(); // 计算灾煞
        jieSha(); // 计算劫煞
        mouXing(); // 计算谋星
        tianYi(); // 计算天医

    }

    /**
     * 初始化自定义数据
     *
     * @param setting 六爻设置
     */
    private void initialize(LiuYaoSetting setting) {

        // 1.1、判断日期类型并返回公历日期、农历日期
        Map<String, Object> dateMap = LiuYaoUtil.isDateType(setting);
        // 1.2、设置日期
        this.solar = (Solar) dateMap.get("solar"); // 设置公历日期
        this.lunar = (Lunar) dateMap.get("lunar"); // 设置农历日期

        // 2、设置星期
        this.week = "周" + getLunar().getWeekInChinese();

        // 3.1、判断干支设置并返回干支
        Map<String, List<String>> ganZhiMap = LiuYaoUtil.isGanZhi(setting, getSolar().getLunar());
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

        // 4、判断起卦模式
        if (setting.getQiGuaMode() == 0) {
            // 4.1、日期起卦模式
            dateQiGua(); // 计算六爻爻象、六爻爻象标识、六爻爻象标识名称
        } else {
            // 4.2、其他起卦模式
            List<List<String>> list = LiuYaoUtil.isQiGuaMode(setting);
            if (null != list && list.size() == 3) {
                this.liuYaoAs = list.get(0); // 六爻爻象
                this.liuYaoYaoXiangMark = list.get(1); // 六爻爻象标识
                this.liuYaoYaoXiangMarkName = list.get(2); // 六爻爻象标识名称
            }
        }

    }

    /**
     * 计算八字、八字五行、八字纳音、八字旬空
     */
    private void baZiData() {

        EightChar ec = getLunar().getEightChar();

        this.baZi = Arrays.asList(getYearGanZhi(), getMonthGanZhi(), getDayGanZhi(), getHourGanZhi()); // 八字
        this.baZiWuXing = Arrays.asList(ec.getYearWuXing(), ec.getMonthWuXing(), ec.getDayWuXing(), ec.getTimeWuXing()); // 八字五行
        this.baZiNaYin = Arrays.asList(ec.getYearNaYin(), ec.getMonthNaYin(), ec.getDayNaYin(), ec.getTimeNaYin()); // 八字纳音
        this.baZiXunKong = Arrays.asList(ec.getYearXunKong(), ec.getMonthXunKong(), ec.getDayXunKong(), ec.getTimeXunKong()); // 八字旬空

    }

    /**
     * 计算六爻爻象、六爻爻象标识、六爻爻象标识名称（日期起卦模式）
     */
    private void dateQiGua() {

        /*
            计算方法（以农历计算）↓

                 上卦数：（年数+月数+日数）÷8得出余数，若为0则统一用8表示
                 下卦数：（年数+月数+日数+时数）÷8得出余数，若为0则统一用8表示
                 动爻数：（年数+月数+日数+时数）÷6得出余数，若为0则统一用6表示
         */

        Map<String, Integer> diZhiShu = LiuYaoMap.DI_ZHI_SHU; // 地支对应的数字

        int yearNumber = diZhiShu.get(getYearZhi());  // 年数
        int monthNumber = getLunar().getMonth(); // 月数
        int dayNumber = getLunar().getDay(); // 日数
        int hourNumber = diZhiShu.get(getHourZhi()); // 时数

        // 1、计算上卦数：（年数+月数+日数）÷8得出余数，若除尽则统一用8表示
        int shangGuaNumber = (yearNumber + monthNumber + dayNumber) % 8;
        shangGuaNumber = shangGuaNumber == 0 ? 8 : shangGuaNumber;

        // 2、计算下卦数：（年数+月数+日数+时数）÷8得出余数，若除尽则统一用8表示
        int xiaGuaNumber = (yearNumber + monthNumber + dayNumber + hourNumber) % 8;
        xiaGuaNumber = xiaGuaNumber == 0 ? 8 : xiaGuaNumber;

        // 3、计算动爻数：（年数+月数+日数+时数）÷6得出余数，若除尽则统一用6表示
        int dongYaoNumber = (yearNumber + monthNumber + dayNumber + hourNumber) % 6;
        dongYaoNumber = dongYaoNumber == 0 ? 6 : dongYaoNumber;

        Map<List<Integer>, String> liuShiSiGuaAs = LiuYaoMap.LIU_SHI_SI_GUA_AS; // 六十四卦卦象
        Map<String, List<String>> liuYaoYaoXiang = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_AS; // 六十四卦的六爻爻象
        // 4.1、根据上卦数和下卦数获取本卦卦象
        String benGuaAs = liuShiSiGuaAs.get(Arrays.asList(shangGuaNumber, xiaGuaNumber));
        // 4.2、根据本卦卦象获取六爻爻象
        List<String> liuYaoYaoXiangList = liuYaoYaoXiang.get(benGuaAs);

        // 5、根据动爻数计算六爻标识
        List<String> liuYaoMarkList = CommonUtil.addCharToList(6);
        if ("—".equals(liuYaoYaoXiangList.get(dongYaoNumber - 1))) {
            liuYaoMarkList.set(dongYaoNumber - 1, "○"); // 该爻为阳爻，则在该爻位上添加标识：○
        } else {
            liuYaoMarkList.set(dongYaoNumber - 1, "×"); // 该爻为阴爻，则在该爻位上添加标识：×
        }

        // 6、计算六爻爻象标识名称
        List<String> liuYaoMarkNameList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            if ("—".equals(liuYaoYaoXiangList.get(i)) && "".equals(liuYaoMarkList.get(i))) {
                liuYaoMarkNameList.add("少阳");
            }
            if ("--".equals(liuYaoYaoXiangList.get(i)) && "".equals(liuYaoMarkList.get(i))) {
                liuYaoMarkNameList.add("少阴");
            }
            if ("—".equals(liuYaoYaoXiangList.get(i)) && "○".equals(liuYaoMarkList.get(i))) {
                liuYaoMarkNameList.add("老阳");
            }
            if ("--".equals(liuYaoYaoXiangList.get(i)) && "×".equals(liuYaoMarkList.get(i))) {
                liuYaoMarkNameList.add("老阴");
            }
        }

        this.liuYaoAs = liuYaoYaoXiangList; // 六爻爻象
        this.liuYaoYaoXiangMark = liuYaoMarkList; // 六爻爻象标识
        this.liuYaoYaoXiangMarkName = liuYaoMarkNameList; // 六爻爻象标识名称

    }

    /**
     * 计算上卦的卦名、卦象
     */
    private void shangGua() {

        // 1、通过[六爻爻象]获取：上卦卦名、上卦卦象
        Map<List<String>, List<String>> map = LiuYaoMap.NAME_AND_AS;

        // 2、设置上卦的卦名、卦象
        this.shangGua = map.get(getLiuYaoAs()).get(0); // 上卦卦名
        this.shangGuaAs = map.get(getLiuYaoAs()).get(1); // 上卦卦象

    }

    /**
     * 计算下卦的卦名、卦象
     */
    private void xiaGua() {

        // 1、通过[六爻爻象]获取：下卦卦名、下卦卦象
        Map<List<String>, List<String>> map = LiuYaoMap.NAME_AND_AS;

        // 2、设置下卦的卦名、卦象
        this.xiaGua = map.get(getLiuYaoAs()).get(2); // 下卦卦名
        this.xiaGuaAs = map.get(getLiuYaoAs()).get(3); // 下卦卦象

    }

    /**
     * 计算本卦的卦名、卦象、六爻爻象、六爻名称、六爻世应、六爻六亲、六爻干支、六爻五行、六爻六神、六爻爻辞
     */
    private void benGua() {

        // 1、六十四卦卦名、六十四卦卦象（六爻爻象为键）
        Map<List<String>, List<String>> sixYaoToSixGuaNameAndAs = LiuYaoMap.NAME_AND_AS;

        // 2、设置本卦的卦名、卦象、爻象
        this.benGua = sixYaoToSixGuaNameAndAs.get(getLiuYaoAs()).get(4); // 本卦卦名
        this.benGuaAs = sixYaoToSixGuaNameAndAs.get(getLiuYaoAs()).get(5); // 本卦卦象
        this.benGuaLiuYaoAs = getLiuYaoAs(); // 本卦爻象（即六爻爻象）

        // 3、设置本卦的六爻名称、世应、六亲、干支、五行、六神、爻辞
        this.benGuaLiuYaoName = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_MING.get(getBenGuaAs()); // 名称
        this.benGuaLiuYaoShiYing = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_SHI_YING.get(getBenGuaAs()); // 世应
        this.benGuaLiuYaoLiuQin = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_LIU_QIN.get(getBenGuaAs()); // 六亲
        this.benGuaLiuYaoGanZhi = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_GAN_ZHI.get(getBenGuaAs()); // 干支
        this.benGuaLiuYaoWuXing = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_WU_XING.get(getBenGuaAs()); // 五行
        this.benGuaLiuYaoLiuShen = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_LIU_SHEN.get(getDayGan()); // 六神
        this.benGuaLiuYaoYaoCi = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_CI.get(getBenGuaAs()); // 爻辞

    }

    /**
     * 计算变卦的卦名、卦象、六爻爻象、六爻名称、六爻世应、六爻六亲、六爻干支、六爻五行、六爻六神、六爻爻辞
     */
    private void bianGua() {

        // 1、六十四卦卦名、六十四卦卦象（六爻爻象为键）
        Map<List<String>, List<String>> sixYaoToSixGuaNameAndAs = LiuYaoMap.NAME_AND_AS;

        // 2、定义数组
        List<String> liuYaoAs = new ArrayList<>(); // 保存六爻爻象（适用于变卦）

        // 3、根据六爻爻象标识判断是否存在变爻，即 × 或 ○
        for (int i = 0; i < getLiuYaoYaoXiangMark().size(); i++) {
            String yaoAs = getLiuYaoAs().get(i); // 六爻爻象
            String yaoMark = getLiuYaoYaoXiangMark().get(i); // 六爻爻象标识
            // 3.1、判断阴阳爻
            if (!"".equals(yaoMark)) {
                if ("—".equals(yaoAs)) {
                    // 3.1.1、阴爻变阳爻
                    liuYaoAs.add(i, "--");
                } else {
                    // 3.1.2、阴爻变阳爻
                    liuYaoAs.add(i, "—");
                }
            } else {
                liuYaoAs.add(i, getLiuYaoAs().get(i));
            }
        }

        // 4、设置变卦的卦名、卦象、爻象
        this.bianGua = sixYaoToSixGuaNameAndAs.get(liuYaoAs).get(4); // 变卦卦名
        this.bianGuaAs = sixYaoToSixGuaNameAndAs.get(liuYaoAs).get(5); // 变卦卦象
        this.bianGuaLiuYaoAs = liuYaoAs; // 变卦爻象

        // 5、设置变卦的六爻名称、世应、六亲、干支、五行、六神、爻辞
        this.bianGuaLiuYaoName = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_MING.get(getBianGuaAs()); // 名称
        this.bianGuaLiuYaoShiYing = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_SHI_YING.get(getBianGuaAs()); // 世应
        this.bianGuaLiuYaoLiuQin = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_LIU_QIN.get(getBianGuaAs()); // 六亲
        this.bianGuaLiuYaoGanZhi = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_GAN_ZHI.get(getBianGuaAs()); // 干支
        this.bianGuaLiuYaoWuXing = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_WU_XING.get(getBianGuaAs()); // 五行
        this.bianGuaLiuYaoLiuShen = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_LIU_SHEN.get(getDayGan()); // 六神
        this.bianGuaLiuYaoYaoCi = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_CI.get(getBianGuaAs()); // 爻辞

    }

    /**
     * 计算互卦的卦象、卦名、六爻爻象、六爻名称、六爻世应、六爻六亲、六爻干支、六爻五行、六爻六神、六爻爻辞
     */
    private void huGua() {

        // 设置互卦的卦象、卦名、六爻爻象、名称、世应、六亲、干支、五行、六神、爻辞
        this.huGuaAs = LiuYaoMap.HU_CUO_ZONG.get(getBenGuaAs()).get(0); // 互卦卦象
        this.huGua = LiuYaoMap.LIU_SHI_SI_GUA.get(getHuGuaAs()); // 互卦卦名
        this.huGuaLiuYaoAs = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_AS.get(getHuGuaAs()); // 爻象
        this.huGuaLiuYaoName = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_MING.get(getHuGuaAs()); // 名称
        this.huGuaLiuYaoShiYing = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_SHI_YING.get(getHuGuaAs()); // 世应
        this.huGuaLiuYaoLiuQin = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_LIU_QIN.get(getHuGuaAs()); // 六亲
        this.huGuaLiuYaoGanZhi = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_GAN_ZHI.get(getHuGuaAs()); // 干支
        this.huGuaLiuYaoWuXing = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_WU_XING.get(getHuGuaAs()); // 五行
        this.huGuaLiuYaoLiuShen = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_LIU_SHEN.get(getDayGan()); // 六神
        this.huGuaLiuYaoYaoCi = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_CI.get(getHuGuaAs()); // 爻辞

    }

    /**
     * 计算错卦的卦象、卦名、六爻爻象、六爻名称、六爻世应、六爻六亲、六爻干支、六爻五行、六爻六神、六爻爻辞
     */
    private void cuoGua() {

        // 设置错卦的卦象、卦名、六爻爻象、名称、世应、六亲、干支、五行、六神、爻辞
        this.cuoGuaAs = LiuYaoMap.HU_CUO_ZONG.get(getBenGuaAs()).get(1); // 错卦卦象
        this.cuoGua = LiuYaoMap.LIU_SHI_SI_GUA.get(getCuoGuaAs()); // 错卦卦名
        this.cuoGuaLiuYaoAs = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_AS.get(getCuoGuaAs()); // 爻象
        this.cuoGuaLiuYaoName = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_MING.get(getCuoGuaAs()); // 名称
        this.cuoGuaLiuYaoShiYing = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_SHI_YING.get(getCuoGuaAs()); // 世应
        this.cuoGuaLiuYaoLiuQin = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_LIU_QIN.get(getCuoGuaAs()); // 六亲
        this.cuoGuaLiuYaoGanZhi = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_GAN_ZHI.get(getCuoGuaAs()); // 干支
        this.cuoGuaLiuYaoWuXing = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_WU_XING.get(getCuoGuaAs()); // 五行
        this.cuoGuaLiuYaoLiuShen = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_LIU_SHEN.get(getDayGan()); // 六神
        this.cuoGuaLiuYaoYaoCi = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_CI.get(getCuoGuaAs()); // 爻辞

    }

    /**
     * 计算综卦的卦象、卦名、六爻爻象、六爻名称、六爻世应、六爻六亲、六爻干支、六爻五行、六爻六神、六爻爻辞
     */
    private void zongGua() {

        // 设置综卦的卦象、卦名、六爻爻象、名称、世应、六亲、干支、五行、六神、爻辞
        this.zongGuaAs = LiuYaoMap.HU_CUO_ZONG.get(getBenGuaAs()).get(2); // 综卦卦象
        this.zongGua = LiuYaoMap.LIU_SHI_SI_GUA.get(getZongGuaAs()); // 综卦卦名
        this.zongGuaLiuYaoAs = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_AS.get(getZongGuaAs()); // 爻象
        this.zongGuaLiuYaoName = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_MING.get(getZongGuaAs()); // 名称
        this.zongGuaLiuYaoShiYing = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_SHI_YING.get(getZongGuaAs()); // 世应
        this.zongGuaLiuYaoLiuQin = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_LIU_QIN.get(getZongGuaAs()); // 六亲
        this.zongGuaLiuYaoGanZhi = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_GAN_ZHI.get(getZongGuaAs()); // 干支
        this.zongGuaLiuYaoWuXing = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_WU_XING.get(getZongGuaAs()); // 五行
        this.zongGuaLiuYaoLiuShen = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_LIU_SHEN.get(getDayGan()); // 六神
        this.zongGuaLiuYaoYaoCi = LiuYaoMap.LIU_SHI_SI_GUA_LIU_YAO_YAO_CI.get(getZongGuaAs()); // 爻辞

    }

    /**
     * 计算本卦、变卦、互卦、错卦、综卦的卦辞
     */
    private void guaCi() {

        Map<String, String> liuShiSiGuaGuaCi = LiuYaoMap.LIU_SHI_SI_GUA_GUA_CI; // 六十四卦卦辞

        this.benGuaGuaCi = liuShiSiGuaGuaCi.get(getBenGua()); // 本卦卦辞
        this.bianGuaGuaCi = liuShiSiGuaGuaCi.get(getBianGua()); // 变卦卦辞
        this.huGuaGuaCi = liuShiSiGuaGuaCi.get(getHuGua()); // 互卦卦辞
        this.cuoGuaGuaCi = liuShiSiGuaGuaCi.get(getCuoGua()); // 错卦卦辞
        this.zongGuaGuaCi = liuShiSiGuaGuaCi.get(getZongGua()); // 综卦卦辞

    }

    /**
     * 计算驿马
     */
    private void yiMa() {

        this.yiMa = LiuYaoMap.YI_MA.get(getHourZhi());

    }

    /**
     * 计算天马
     */
    private void tianMa() {

        this.tianMa = LiuYaoMap.TIAN_MA.get(getMonthZhi());

    }

    /**
     * 计算天元禄
     */
    private void tianYuanLu() {

        this.tianYuanLu = LiuYaoMap.TIAN_YUAN_LU.get(getDayGan());

    }

    /**
     * 计算天乙贵人
     */
    private void tianYiGuiRen() {

        this.tianYiGuiRen = LiuYaoMap.TIAN_YI_GUI_REN.get(getDayGan());

    }

    /**
     * 计算太极贵人
     */
    private void taiJiGuiRen() {

        List<String> yearZhi = LiuYaoMap.TAI_JI_GUI_REN.get(getYearGan()); // 根据年干获取太极贵人所要落入的地支
        List<String> dayZhi = LiuYaoMap.TAI_JI_GUI_REN.get(getDayGan()); // 根据日干获取太极贵人所要落入的地支
        this.taiJiGuiRen = returnShenSha(yearZhi, dayZhi);

    }

    /**
     * 计算天德贵人
     */
    private void tianDeGuiRen() {

        this.tianDeGuiRen = LiuYaoMap.TIAN_DE_GUI_REN.get(getMonthZhi());

    }

    /**
     * 计算月德贵人
     */
    private void yueDeGuiRen() {

        this.yueDeGuiRen = LiuYaoMap.YUE_DE_GUI_REN.get(getMonthZhi());

    }

    /**
     * 计算唐符国印
     */
    private void tangFuGuoYin() {

        this.tangFuGuoYin = LiuYaoMap.TANG_FU_GUO_YIN.get(getYearZhi());

    }

    /**
     * 计算咸池（桃花）
     */
    private void xianChi() {

        this.xianChi = LiuYaoMap.XIAN_CHI.get(getDayZhi());

    }

    /**
     * 计算天喜
     */
    private void tianXi() {

        this.tianXi = LiuYaoMap.TIAN_XI.get(getMonthZhi());

    }

    /**
     * 计算皇恩
     */
    private void huangEn() {

        this.huangEn = LiuYaoMap.HUANG_EN.get(getMonthZhi());

    }

    /**
     * 计算文昌
     */
    private void wenChang() {

        this.wenChang = LiuYaoMap.WEN_CHANG.get(getDayGan());

    }

    /**
     * 计算华盖
     */
    private void huaGai() {

        List<String> yearZhi = LiuYaoMap.HUA_GAI.get(getYearZhi()); // 根据年干获取华盖所要落入的地支
        List<String> dayZhi = LiuYaoMap.HUA_GAI.get(getDayZhi()); // 根据日干获取华盖所要落入的地支
        this.huaGai = returnShenSha(yearZhi, dayZhi);

    }

    /**
     * 计算将星
     */
    private void jiangXing() {

        List<String> yearZhi = LiuYaoMap.JIANG_XING.get(getYearZhi()); // 根据年干获取将星所要落入的地支
        List<String> dayZhi = LiuYaoMap.JIANG_XING.get(getDayZhi()); // 根据日干获取将星所要落入的地支
        this.jiangXing = returnShenSha(yearZhi, dayZhi);

    }

    /**
     * 计算灾煞
     */
    private void zaiSha() {

        this.zaiSha = LiuYaoMap.ZAI_SHA.get(getDayZhi());

    }

    /**
     * 计算劫煞
     */
    private void jieSha() {

        this.jieSha = LiuYaoMap.JIE_SHA.get(getDayZhi());

    }

    /**
     * 计算谋星
     */
    private void mouXing() {

        this.mouXing = LiuYaoMap.MOU_XING.get(getDayZhi());

    }

    /**
     * 计算天医
     */
    private void tianYi() {

        this.tianYi = LiuYaoMap.TIAN_YI.get(getMonthZhi());

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
     * 返回神煞
     *
     * @param yearZhi 年干地支
     * @param dayZhi  日干地支
     */
    private String returnShenSha(List<String> yearZhi, List<String> dayZhi) {

        // 1、判断年支，若匹配则返回神煞
        for (String key : yearZhi) {
            if (getYearZhi().equals(key)) return key;
        }
        for (String key : dayZhi) {
            if (getYearZhi().equals(key)) return key;
        }
        // 2、判断月支，若匹配则返回神煞
        for (String key : yearZhi) {
            if (getMonthZhi().equals(key)) return key;
        }
        for (String key : dayZhi) {
            if (getMonthZhi().equals(key)) return key;
        }
        // 3、判断日支，若匹配返回神煞
        for (String key : yearZhi) {
            if (getDayZhi().equals(key)) return key;
        }
        for (String key : dayZhi) {
            if (getDayZhi().equals(key)) return key;
        }
        // 4、判断时支，若匹配则返回神煞
        for (String key : yearZhi) {
            if (getHourZhi().equals(key)) return key;
        }
        for (String key : dayZhi) {
            if (getHourZhi().equals(key)) return key;
        }

        return null;

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
        s.append("上卦:").append(getShangGua()).append("(").append(getShangGuaAs()).append(")");
        s.append("   ");
        s.append("下卦:").append(getXiaGua()).append("(").append(getXiaGuaAs()).append(")");
        s.append("   ");
        s.append("本卦:").append(getBenGua()).append("(").append(getBenGuaAs()).append(")");
        s.append("   ");
        s.append("变卦:").append(getBianGua()).append("(").append(getBianGuaAs()).append(")");
        s.append("   ");
        s.append("互卦:").append(getHuGua()).append("(").append(getHuGuaAs()).append(")");
        s.append("   ");
        s.append("错卦:").append(getCuoGua()).append("(").append(getCuoGuaAs()).append(")");
        s.append("   ");
        s.append("综卦:").append(getZongGua()).append("(").append(getZongGuaAs()).append(")");
        s.append("   ");
        s.append("驿马:").append(getYiMa());
        s.append("   ");
        s.append("天马:").append(getTianMa());
        s.append("   ");
        s.append("天元禄:").append(getTianYuanLu());
        s.append("   ");
        s.append("天乙贵人:").append(getTianYiGuiRen());
        s.append("   ");
        s.append("太极贵人:").append(getTaiJiGuiRen());
        s.append("   ");
        s.append("天德贵人:").append(getTianDeGuiRen());
        s.append("   ");
        s.append("月德贵人:").append(getYueDeGuiRen());
        s.append("   ");
        s.append("符印:").append(getTangFuGuoYin());
        s.append("   ");
        s.append("咸池:").append(getXianChi());
        s.append("   ");
        s.append("天喜:").append(getTianXi());
        s.append("   ");
        s.append("皇恩:").append(getHuangEn());
        s.append("   ");
        s.append("文昌:").append(getWenChang());
        s.append("   ");
        s.append("华盖:").append(getHuaGai());
        s.append("   ");
        s.append("将星:").append(getJiangXing());
        s.append("   ");
        s.append("灾煞:").append(getZaiSha());
        s.append("   ");
        s.append("劫煞:").append(getJieSha());
        s.append("   ");
        s.append("谋星:").append(getMouXing());
        s.append("   ");
        s.append("天医:").append(getTianYi());

        return s.toString();

    }


}
