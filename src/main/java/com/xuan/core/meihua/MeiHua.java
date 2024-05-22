package com.xuan.core.meihua;

import com.nlf.calendar.EightChar;
import com.nlf.calendar.Lunar;
import com.nlf.calendar.Solar;
import com.xuan.utils.CommonUtil;
import lombok.Getter;

import java.util.*;

/**
 * 梅花易数
 *
 * @author 善待
 */
@Getter
public class MeiHua {

    /**
     * 农历日期
     */
    private Lunar lunar;
    /**
     * 公历日期
     */
    private Solar solar;
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
     * 上卦数
     */
    private int shangGuaNumber;
    /**
     * 下卦数
     */
    private int xiaGuaNumber;
    /**
     * 动爻数
     */
    private int dongYaoNumber;

    /**
     * 上卦
     */
    private String shangGua;
    /**
     * 上卦卦象
     */
    private String shangGuaAs;

    /**
     * 下卦
     */
    private String xiaGua;
    /**
     * 下卦卦象
     */
    private String xiaGuaAs;

    /**
     * 动爻
     */
    private String dongYao;

    /**
     * 本卦
     */
    private String benGua;
    /**
     * 本卦卦象
     */
    private String benGuaAs;
    /**
     * 本卦的上卦
     */
    private String benGuaShangGua;
    /**
     * 本卦的上卦卦象
     */
    private String benGuaShangGuaAs;
    /**
     * 本卦的下卦
     */
    private String benGuaXiaGua;
    /**
     * 本卦的下卦卦象
     */
    private String benGuaXiaGuaAs;

    /**
     * 变卦
     */
    private String bianGua;
    /**
     * 变卦卦象
     */
    private String bianGuaAs;
    /**
     * 变卦的上卦
     */
    private String bianGuaShangGua;
    /**
     * 变卦的上卦卦象
     */
    private String bianGuaShangGuaAs;
    /**
     * 变卦的下卦
     */
    private String bianGuaXiaGua;
    /**
     * 变卦的下卦卦象
     */
    private String bianGuaXiaGuaAs;

    /**
     * 互卦
     */
    private String huGua;
    /**
     * 互卦卦象
     */
    private String huGuaAs;
    /**
     * 互卦的上卦
     */
    private String huGuaShangGua;
    /**
     * 互卦的上卦卦象
     */
    private String huGuaShangGuaAs;
    /**
     * 互卦的下卦
     */
    private String huGuaXiaGua;
    /**
     * 互卦的下卦卦象
     */
    private String huGuaXiaGuaAs;

    /**
     * 错卦
     */
    private String cuoGua;
    /**
     * 错卦卦象
     */
    private String cuoGuaAs;
    /**
     * 错卦的上卦
     */
    private String cuoGuaShangGua;
    /**
     * 错卦的上卦卦象
     */
    private String cuoGuaShangGuaAs;
    /**
     * 错卦的下卦
     */
    private String cuoGuaXiaGua;
    /**
     * 错卦的下卦卦象
     */
    private String cuoGuaXiaGuaAs;

    /**
     * 综卦
     */
    private String zongGua;
    /**
     * 综卦卦象
     */
    private String zongGuaAs;
    /**
     * 综卦的上卦
     */
    private String zongGuaShangGua;
    /**
     * 综卦的上卦卦象
     */
    private String zongGuaShangGuaAs;
    /**
     * 综卦的下卦
     */
    private String zongGuaXiaGua;
    /**
     * 综卦的下卦卦象
     */
    private String zongGuaXiaGuaAs;

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
     * 本卦爻象（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：—, —, —, —, —, —）
     */
    private List<String> benGuaLiuYaoAs;
    /**
     * 变卦爻象（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：—, —, —, —, —, —）
     */
    private List<String> bianGuaLiuYaoAs;
    /**
     * 互卦爻象（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：—, —, —, —, —, —）
     */
    private List<String> huGuaLiuYaoAs;
    /**
     * 错卦爻象（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：—, —, —, —, —, —）
     */
    private List<String> cuoGuaLiuYaoAs;
    /**
     * 综卦爻象（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：—, —, —, —, —, —）
     */
    private List<String> zongGuaLiuYaoAs;

    /**
     * 本卦爻名（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：初九, 九二, 九三, 九四, 九五, 上九）
     */
    private List<String> benGuaLiuYaoName;
    /**
     * 变卦爻名（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：初九, 九二, 九三, 九四, 九五, 上九）
     */
    private List<String> bianGuaLiuYaoName;
    /**
     * 互卦爻名（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：初九, 九二, 九三, 九四, 九五, 上九）
     */
    private List<String> huGuaLiuYaoName;
    /**
     * 错卦爻名（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：初九, 九二, 九三, 九四, 九五, 上九）
     */
    private List<String> cuoGuaLiuYaoName;
    /**
     * 综卦爻名（顺序：初爻、二爻、三爻、四爻、五爻、上爻。如：初九, 九二, 九三, 九四, 九五, 上九）
     */
    private List<String> zongGuaLiuYaoName;

    /**
     * 本卦爻辞（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> benGuaLiuYaoYaoCi;
    /**
     * 变卦爻辞（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> bianGuaLiuYaoYaoCi;
    /**
     * 互卦爻辞（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> huGuaLiuYaoYaoCi;
    /**
     * 错卦爻辞（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> cuoGuaLiuYaoYaoCi;
    /**
     * 综卦爻辞（顺序：初爻、二爻、三爻、四爻、五爻、上爻）
     */
    private List<String> zongGuaLiuYaoYaoCi;

    /**
     * 本卦的用卦与体卦关系
     */
    private String benYongTiLink;
    /**
     * 变卦的用卦与体卦关系
     */
    private String bianYongTiLink;
    /**
     * 互卦的用卦与体卦关系
     */
    private String huYongTiLink;
    /**
     * 错卦的用卦与体卦关系
     */
    private String cuoYongTiLink;
    /**
     * 综卦的用卦与体卦关系
     */
    private String zongYongTiLink;

    /**
     * 卦码
     */
    private String guaMa;

    /**
     * 上卦是否为用卦（true:用卦。false:体卦）
     */
    private Boolean shangGuaYong;
    /**
     * 下卦是否为用卦（true:用卦。false:体卦）
     */
    private Boolean xiaGuaYong;

//************************************************************************************************************************************

    /**
     * 使用默认设置初始化（默认使用当前公历日期）
     */
    public MeiHua() {
        core(new MeiHuaSetting());
    }

    /**
     * 使用公历日期初始化
     *
     * @param date 公历日期
     */
    public MeiHua(Date date) {
        core(new MeiHuaSetting(date));
    }

    /**
     * 使用日期初始化
     *
     * @param date     公历日期
     * @param dateType 日期类型（0:公历。1:农历）
     */
    public MeiHua(Date date, int dateType) {
        core(new MeiHuaSetting(date, dateType));
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
    public MeiHua(int year, int month, int day, int hour, int minute, int second) {
        core(new MeiHuaSetting(year, month, day, hour, minute, second));
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
    public MeiHua(int year, int month, int day, int hour, int dateType, int minute, int second) {
        core(new MeiHuaSetting(year, month, day, hour, minute, second, dateType));
    }

    /**
     * 使用自定义设置初始化
     *
     * @param setting 梅花易数-设置
     */
    public MeiHua(MeiHuaSetting setting) {
        core(setting);
    }

//====================================================================================================================================

    /**
     * 获取并设置数据（★核心）
     *
     * @param setting 梅花易数-设置
     */
    private void core(MeiHuaSetting setting) {

        // 初始化自定义数据
        initialize(setting);

        // 计算数据
        baZiData(); // 计算八字、八字五行、八字纳音、八字旬
        shangGua(); // 计算上卦及卦象
        xiaGua(); // 计算下卦及卦象
        dongYao(); // 计算动爻
        benGua(); // 计算本卦及卦象、本卦的上卦及上卦卦象、下卦及下卦卦象
        bianGua(); // 计算变卦及卦象、变卦的上卦及上卦卦象、下卦及下卦卦象
        huGua(); // 计算互卦及卦象、互卦的上卦及上卦卦象、下卦及下卦卦象
        cuoGua(); // 计算错卦及卦象、错卦的上卦及上卦卦象、下卦及下卦卦象
        zongGua(); // 计算综卦及卦象、综卦的上卦及上卦卦象、下卦及下卦卦象
        guaCi(); // 计算本卦、变卦、互卦、错卦、综卦的卦辞
        liuYaoYaoMing(); // 计算本卦、变卦、互卦、错卦、综卦的爻名
        liuYaoAs(); // 计算本卦、变卦、互卦、错卦、综卦的爻象
        liuYaoYaoCi(); // 计算本卦、变卦、互卦、错卦、综卦的爻辞
        isYongTi(); // 判断用卦、体卦
        benYongTiLink(); // 计算本卦的用卦与体卦关系
        bianYongTiLink(); // 计算变卦的用卦与体卦关系
        huYongTiLink(); // 计算互卦的用卦与体卦关系
        cuoYongTiLink(); // 计算错卦的用卦与体卦关系
        zongYongTiLink(); // 计算综卦的用卦与体卦关系
        guaMa(); // 计算卦码

    }

    /**
     * 初始化自定义数据
     *
     * @param setting 梅花易数-设置
     */
    private void initialize(MeiHuaSetting setting) {

        // 1.1、☆判断日期类型并返回公历日期、农历日期
        Map<String, Object> dateMap = MeiHuaUtil.isDateType(setting);
        // 1.2、设置日期
        this.solar = (Solar) dateMap.get("solar"); // 设置公历日期
        this.lunar = (Lunar) dateMap.get("lunar"); // 设置农历日期

        // 2、设置星期
        this.week = "周" + getLunar().getWeekInChinese();

        // 3.1、☆判断干支设置并返回干支
        Map<String, List<String>> ganZhiMap = MeiHuaUtil.isGanZhi(setting, getSolar().getLunar());
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

        // 4、☆判断起卦模式
        if (setting.getQiGuaMode() == 0) {
            // 4.1、日期起卦模式
            shangXiaGuaNumber(); // 计算上卦数，下卦数，动爻数
        } else {
            // 4.2、其他起卦模式
            List<Integer> number = MeiHuaUtil.isQiGuaMode(setting);
            this.shangGuaNumber = number.get(0); // 设置上卦数
            this.xiaGuaNumber = number.get(1); // 设置下卦数
            this.dongYaoNumber = number.get(2); // 设置动爻数
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
     * 计算上卦数、下卦数、动爻数
     */
    private void shangXiaGuaNumber() {

        /*
            计算方法（以农历计算）↓

                 上卦数：（年数+月数+日数）÷8得出余数，若为0则统一用8表示
                 下卦数：（年数+月数+日数+时数）÷8得出余数，若为0则统一用8表示
                 动爻数：（年数+月数+日数+时数）÷6得出余数，若为0则统一用6表示
         */

        Map<String, Integer> diZhiShu = MeiHuaMaps.DI_ZHI_SHU; // 地支对应的数字

        int yearNumber = diZhiShu.get(getYearZhi()); // 年数
        int monthNumber = getLunar().getMonth(); // 月数
        int dayNumber = getLunar().getDay(); // 日数
        int hourNumber = diZhiShu.get(getHourZhi()); // 时数

        // 1、计算上卦数：（年数+月数+日数）÷8得出余数，若为0则统一用8表示
        int shangGuaNumber = (yearNumber + monthNumber + dayNumber) % 8;
        this.shangGuaNumber = shangGuaNumber == 0 ? 8 : shangGuaNumber;

        // 2、计算下卦数：（年数+月数+日数+时数）÷8得出余数，若为0则统一用8表示
        int xiaGuaNumber = (yearNumber + monthNumber + dayNumber + hourNumber) % 8;
        this.xiaGuaNumber = xiaGuaNumber == 0 ? 8 : xiaGuaNumber;

        // 3、计算动爻数：（年数+月数+日数+时数）÷6得出余数，若为0则统一用6表示
        int dongYaoNumber = (yearNumber + monthNumber + dayNumber + hourNumber) % 6;
        this.dongYaoNumber = dongYaoNumber == 0 ? 6 : dongYaoNumber;

    }

    /**
     * 计算上卦及卦象
     */
    private void shangGua() {

        this.shangGua = MeiHuaMaps.XIAN_YIAN_BA_GUA.get(getShangGuaNumber()); // 根据上卦数获取上卦
        this.shangGuaAs = MeiHuaMaps.BA_GUA_AS.get(getShangGua()); // 根据上卦获取上卦卦象

    }

    /**
     * 计算下卦及卦象
     */
    private void xiaGua() {

        this.xiaGua = MeiHuaMaps.XIAN_YIAN_BA_GUA.get(getXiaGuaNumber()); // 根据下卦数获取下卦
        this.xiaGuaAs = MeiHuaMaps.BA_GUA_AS.get(getXiaGua()); // 根据下卦获取下卦卦象

    }

    /**
     * 计算动爻
     */
    private void dongYao() {

        this.dongYao = CommonUtil.shuToHan(getDongYaoNumber());

    }

    /**
     * 计算本卦及卦象、本卦的上卦及上卦卦象、下卦及下卦卦象
     */
    private void benGua() {

        /*
            本卦：代表事物初始、开始阶段的信息或目前的情况。

            【根据上卦数和下卦数获取】
        */

        // 1、本卦及卦象
        this.benGua = MeiHuaMaps.LIU_SHI_SI_GUA_NAME.get(Arrays.asList(getShangGuaNumber(), getXiaGuaNumber())); // 根据上卦数和下卦数获取本卦
        this.benGuaAs = MeiHuaMaps.LIU_SHI_SI_GUA_AS.get(getBenGua()); // 根据本卦获取本卦卦象

        // 2、本卦的上卦及下卦
        this.benGuaShangGua = getShangGua(); // 本卦的上卦
        this.benGuaXiaGua = getXiaGua(); // 本卦的下卦

        // 3、本卦的上卦卦象及下卦卦象
        this.benGuaShangGuaAs = getShangGuaAs(); // 本卦的上卦卦象
        this.benGuaXiaGuaAs = getXiaGuaAs(); // 本卦的下卦卦象

    }

    /**
     * 计算变卦及卦象、变卦的上卦及上卦卦象、下卦及下卦卦象
     */
    private void bianGua() {

        /*
            变卦：代表事物发展变化的最终结果。

            【根据动爻数获取】
        */

        // 1、变卦及卦象
        int bianShangGuaNumber; // 变卦的上卦数
        int bianXiaGuaNumber; // 变卦的下卦数
        if (getDongYaoNumber() >= 1 && getDongYaoNumber() <= 3) {
            // 1.1、动爻数为(1\2\3)时：上卦不变、下卦变
            bianXiaGuaNumber = MeiHuaMaps.BIAN_GUA.get(getXiaGuaNumber()).get(getDongYaoNumber() - 1); // 变卦的下卦数
            this.bianGua = MeiHuaMaps.LIU_SHI_SI_GUA_NAME.get(Arrays.asList(getShangGuaNumber(), bianXiaGuaNumber)); // 根据上卦数和下卦数获取变卦
        } else {
            // 1.2、动爻数为(4\5\6)时：上卦变、下卦不变
            bianShangGuaNumber = MeiHuaMaps.BIAN_GUA.get(getShangGuaNumber()).get(getDongYaoNumber() - 4); // 变卦的上卦数
            this.bianGua = MeiHuaMaps.LIU_SHI_SI_GUA_NAME.get(Arrays.asList(bianShangGuaNumber, getXiaGuaNumber())); // 根据上卦数和下卦数获取变卦
        }
        this.bianGuaAs = MeiHuaMaps.LIU_SHI_SI_GUA_AS.get(getBianGua()); // 根据变卦获取变卦卦象

        // 2、变卦的上卦及下卦
        Map<String, List<String>> liuShiSiGuaTwoGuaName = MeiHuaMaps.LIU_SHI_SI_GUA_TWO_GUA_NAME; // 六十四卦包含的两个卦名
        List<String> list = liuShiSiGuaTwoGuaName.get(getBianGua());
        this.bianGuaShangGua = list.get(0); // 变卦的上卦
        this.bianGuaXiaGua = list.get(1); // 变卦的下卦

        // 3、变卦的上卦卦象及下卦卦象
        Map<String, String> baGuaAs = MeiHuaMaps.BA_GUA_AS; // 八卦卦象
        this.bianGuaShangGuaAs = baGuaAs.get(getBianGuaShangGua()); // 变卦的上卦卦象
        this.bianGuaXiaGuaAs = baGuaAs.get(getBianGuaXiaGua()); // 变卦的下卦卦象

    }

    /**
     * 计算互卦及卦象、互卦的上卦及上卦卦象、下卦及下卦卦象
     */
    private void huGua() {

        /*
            互卦：代表事物发展的过程。

            【本卦的二三四爻做互卦的下卦、本卦的三四五卦做互卦的上卦】
        */

        Map<String, String> map = getGua(0);

        this.huGua = map.get("guaName"); // 互卦卦名
        this.huGuaAs = map.get("guaAs"); // 互卦卦象
        this.huGuaShangGua = map.get("shangGua"); // 互卦的上卦
        this.huGuaXiaGua = map.get("xiaGua"); // 互卦的下卦
        this.huGuaShangGuaAs = map.get("shangGuaAs"); // 互卦的上卦卦象
        this.huGuaXiaGuaAs = map.get("xiaGuaAs"); // 互卦的下卦卦象

    }

    /**
     * 计算错卦及卦象、错卦的上卦及上卦卦象、下卦及下卦卦象
     */
    private void cuoGua() {

        /*
            错卦：代表事物的危机或转机。若问题的结果（变卦）为吉，则代表危机；若问题的结果（变卦）为凶，则代表危机的转机。

            【本卦阳爻变阴爻，阴爻变阳爻】
        */

        Map<String, String> map = getGua(1);

        this.cuoGua = map.get("guaName"); // 错卦卦名
        this.cuoGuaAs = map.get("guaAs"); // 错卦卦象
        this.cuoGuaShangGua = map.get("shangGua"); // 错卦的上卦
        this.cuoGuaXiaGua = map.get("xiaGua"); // 错卦的下卦
        this.cuoGuaShangGuaAs = map.get("shangGuaAs"); // 错卦的上卦卦象
        this.cuoGuaXiaGuaAs = map.get("xiaGuaAs"); // 错卦的下卦卦象

    }

    /**
     * 计算综卦及卦象、综卦的上卦及上卦卦象、下卦及下卦卦象
     */
    private void zongGua() {

        /*
            综卦：代表事物的另一个面，以第三者角度综合观察这个事物。

            【将本卦上下180°翻转得出】
        */

        Map<String, String> map = getGua(2);

        this.zongGua = map.get("guaName"); // 综卦卦名
        this.zongGuaAs = map.get("guaAs"); // 综卦卦象
        this.zongGuaShangGua = map.get("shangGua"); // 综卦的上卦
        this.zongGuaXiaGua = map.get("xiaGua"); // 综卦的下卦
        this.zongGuaShangGuaAs = map.get("shangGuaAs"); // 综卦的上卦卦象
        this.zongGuaXiaGuaAs = map.get("xiaGuaAs"); // 综卦的下卦卦象

    }

    /**
     * 计算本卦、变卦、互卦、错卦、综卦的卦辞
     */
    private void guaCi() {

        Map<String, String> liuShiSiGuaGuaCi = MeiHuaMaps.LIU_SHI_SI_GUA_GUA_CI; // 六十四卦卦辞

        this.benGuaGuaCi = liuShiSiGuaGuaCi.get(getBenGua()); // 本卦卦辞
        this.bianGuaGuaCi = liuShiSiGuaGuaCi.get(getBianGua()); // 变卦卦辞
        this.huGuaGuaCi = liuShiSiGuaGuaCi.get(getHuGua()); // 互卦卦辞
        this.cuoGuaGuaCi = liuShiSiGuaGuaCi.get(getCuoGua()); // 错卦卦辞
        this.zongGuaGuaCi = liuShiSiGuaGuaCi.get(getZongGua()); // 综卦卦辞

    }

    /**
     * 计算本卦、变卦、互卦、错卦、综卦的爻名
     */
    private void liuYaoYaoMing() {

        Map<String, List<String>> yaoMing = MeiHuaMaps.LIU_SHI_SI_GUA_LIU_YAO_YAO_MING; // 六十四卦的六爻爻名

        this.benGuaLiuYaoName = yaoMing.get(getBenGuaAs()); // 本卦的六爻爻名
        this.bianGuaLiuYaoName = yaoMing.get(getBianGuaAs()); // 变卦的六爻爻名
        this.huGuaLiuYaoName = yaoMing.get(getHuGuaAs()); // 互卦的六爻爻名
        this.cuoGuaLiuYaoName = yaoMing.get(getCuoGuaAs()); // 错卦的六爻爻名
        this.zongGuaLiuYaoName = yaoMing.get(getZongGuaAs()); // 综卦的六爻爻名

    }

    /**
     * 计算本卦、变卦、互卦、错卦、综卦的爻象
     */
    private void liuYaoAs() {

        Map<String, List<String>> yaoXiang = MeiHuaMaps.LIU_SHI_SI_GUA_LIU_YAO_AS; // 六十四卦的六爻爻象

        this.benGuaLiuYaoAs = yaoXiang.get(getBenGuaAs()); // 本卦的六爻爻象
        this.bianGuaLiuYaoAs = yaoXiang.get(getBianGuaAs()); // 变卦的六爻爻象
        this.huGuaLiuYaoAs = yaoXiang.get(getHuGuaAs()); // 互卦的六爻爻象
        this.cuoGuaLiuYaoAs = yaoXiang.get(getCuoGuaAs()); // 错卦的六爻爻象
        this.zongGuaLiuYaoAs = yaoXiang.get(getZongGuaAs()); // 综卦的六爻爻象

    }

    /**
     * 计算本卦、变卦、互卦、错卦、综卦的爻辞
     */
    private void liuYaoYaoCi() {

        Map<String, List<String>> yaoCi = MeiHuaMaps.LIU_SHI_SI_GUA_LIU_YAO_YAO_CI; // 六十四卦的六爻爻辞

        this.benGuaLiuYaoYaoCi = yaoCi.get(getBenGuaAs()); // 本卦的六爻爻辞
        this.bianGuaLiuYaoYaoCi = yaoCi.get(getBianGuaAs()); // 变卦的六爻爻辞
        this.huGuaLiuYaoYaoCi = yaoCi.get(getHuGuaAs()); // 互卦的六爻爻辞
        this.cuoGuaLiuYaoYaoCi = yaoCi.get(getCuoGuaAs()); // 错卦的六爻爻辞
        this.zongGuaLiuYaoYaoCi = yaoCi.get(getZongGuaAs()); // 综卦的六爻爻辞

    }

    /**
     * 判断用卦、体卦
     */
    private void isYongTi() {

        /*
            用卦：代表事物
            体卦：代表自己
         */

        this.shangGuaYong = getDongYaoNumber() > 3;
        this.xiaGuaYong = !getShangGuaYong();

    }

    /**
     * 计算本卦的用卦与体卦关系
     * <p>
     * TODO：仅供参考，禁止对号入座
     */
    private void benYongTiLink() {

        String mark = getBenGua() + "卦代表事物初始、开始阶段的信息或目前的情况；";
        this.benYongTiLink = getYongTiLink(getBenGuaShangGua(), getBenGuaXiaGua(), mark);

    }

    /**
     * 计算变卦的用卦与体卦关系
     * <p>
     * TODO：仅供参考，禁止对号入座
     */
    private void bianYongTiLink() {

        String mark = getBianGua() + "卦代表事物发展变化的最终结果；";
        this.bianYongTiLink = getYongTiLink(getBianGuaShangGua(), getBianGuaXiaGua(), mark);

    }

    /**
     * 计算互卦的用卦与体卦关系
     * <p>
     * TODO：仅供参考，禁止对号入座
     */
    private void huYongTiLink() {

        String mark = getHuGua() + "卦代表事物发展的过程；";
        this.huYongTiLink = getYongTiLink(getHuGuaShangGua(), getHuGuaXiaGua(), mark);

    }

    /**
     * 计算错卦的用卦与体卦关系
     * <p>
     * TODO：仅供参考，禁止对号入座
     */
    private void cuoYongTiLink() {

        String mark = getCuoGua() + "卦代表事物的危机或转机，若问题的结果（变卦）为吉，则代表危机，若问题的结果（变卦）为凶，则代表危机的转机；";
        this.cuoYongTiLink = getYongTiLink(getCuoGuaShangGua(), getCuoGuaXiaGua(), mark);

    }

    /**
     * 计算综卦的用卦与体卦关系
     * <p>
     * TODO：仅供参考，禁止对号入座
     */
    private void zongYongTiLink() {

        String mark = getZongGua() + "卦代表事物的另一个面，以第三者角度综合观察这个事物；";
        this.zongYongTiLink = getYongTiLink(getZongGuaShangGua(), getZongGuaXiaGua(), mark);

    }

    /**
     * 计算卦码
     */
    private void guaMa() {

        this.guaMa = "" + getShangGuaNumber() + getXiaGuaNumber() + getDongYaoNumber();

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
     * 返回互卦、错卦、综卦信息
     *
     * @param index 0:互卦。1:错卦。2:综卦
     * @return 互卦、错卦、综卦信息
     */
    private Map<String, String> getGua(int index) {

        // 1、获取卦名及卦象
        String guaName = MeiHuaMaps.HU_CUO_ZONG.get(getBenGua()).get(index); // 卦名
        String guaAs = MeiHuaMaps.LIU_SHI_SI_GUA_AS.get(guaName);// 卦象

        // 2、卦的上卦及下卦
        Map<String, List<String>> liuShiSiGuaTwoGuaName = MeiHuaMaps.LIU_SHI_SI_GUA_TWO_GUA_NAME; // 六十四卦包含的两个卦名
        List<String> list = liuShiSiGuaTwoGuaName.get(guaName);
        String shangGua = list.get(0); // 卦的上卦
        String xiaGua = list.get(1); // 卦的下卦

        // 3、卦的上卦卦象及下卦卦象
        Map<String, String> baGuaAs = MeiHuaMaps.BA_GUA_AS; // 八卦卦象
        String shangGuaAs = baGuaAs.get(shangGua); // 卦的上卦卦象
        String xiaGuaAs = baGuaAs.get(xiaGua); // 卦的下卦卦象

        // 4、添加卦信息并返回
        Map<String, String> map = new HashMap<>();
        map.put("guaName", guaName); // 卦名
        map.put("guaAs", guaAs); // 卦名
        map.put("shangGua", shangGua); // 卦的上卦
        map.put("xiaGua", xiaGua); // 卦的下卦
        map.put("shangGuaAs", shangGuaAs); // 卦的上卦卦象
        map.put("xiaGuaAs", xiaGuaAs); // 卦的下卦卦象
        return map;

    }

    /**
     * 返回用卦、体卦信息
     *
     * @param shangGua 上卦
     * @param xiaGua   下卦
     * @param mark     本卦、变卦、互卦、错卦、综卦
     * @return 用卦、体卦信息
     */
    private String getYongTiLink(String shangGua, String xiaGua, String mark) {

        String yongGua; // 用卦
        String tiGua; // 体卦
        String yongGuaMark; // 用卦标识
        String tiGuaMark; // 体卦标识

        // 1、判断上卦，下卦
        if (getShangGuaYong()) {
            yongGua = shangGua; // 用卦为上卦
            yongGuaMark = "上卦";
            tiGua = xiaGua; // 体卦为下卦
            tiGuaMark = "下卦";
        } else {
            tiGua = shangGua; // 体卦为上卦
            tiGuaMark = "上卦";
            yongGua = xiaGua; // 用卦为下卦
            yongGuaMark = "下卦";
        }

        // 2、获取用卦与体卦之间的关系
        Map<String, String> baGuaWuXing = MeiHuaMaps.BA_GUA_WU_XING; // 八卦五行
        String info = mark + yongGuaMark + yongGua + "(" + baGuaWuXing.get(yongGua) + ")为用卦、" + tiGuaMark + tiGua + "(" + baGuaWuXing.get(tiGua) + ")为体卦，";
        Map<String, String> yongTiGuanXi = MeiHuaMaps.YONG_TI_GUAN_XI; // 用卦与体卦的关系（用卦+体卦）

        // 3、返回信息
        return info + yongTiGuanXi.get(yongGua + tiGua);

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
        s.append("卦码:").append(getGuaMa());
        s.append("   ");
        s.append("上卦:").append(getShangGua()).append("(").append(getShangGuaAs()).append(")");
        s.append("   ");
        s.append("下卦:").append(getXiaGua()).append("(").append(getXiaGuaAs()).append(")");
        s.append("   ");
        s.append("动爻:").append(getDongYao());
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

        return s.toString();

    }


}
