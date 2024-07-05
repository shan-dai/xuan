package com.xuan.core.bazi.shensha;

import com.xuan.core.bazi.BaZiMap;
import com.xuan.utils.CommonUtil;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 八字-神煞工具
 *
 * @author 善待
 */
@Data
public class BaZiShenShaUtil {

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
     * 年干支纳音五行
     */
    private String yearGanZhiNaYinWuXing;
    /**
     * 季节
     */
    private String season;
    /**
     * 性别
     */
    private String sex;

    /**
     * 年干支神煞
     */
    private List<String> yearGanZhiShenSha = new ArrayList<>();
    /**
     * 月干支神煞
     */
    private List<String> monthGanZhiShenSha = new ArrayList<>();
    /**
     * 日干支神煞
     */
    private List<String> dayGanZhiShenSha = new ArrayList<>();
    /**
     * 时干支神煞
     */
    private List<String> hourGanZhiShenSha = new ArrayList<>();

    /**
     * 四柱神煞
     */
    Map<String, List<String>> siZhuShenSha;

//****************************************************************************************************************************************************

    /**
     * 初始化常用神煞
     *
     * @param baZi                  八字
     * @param yearGanZhiNaYinWuXing 年干支纳音五行
     * @param season                季节
     * @param sex                   性别（男。女）
     */
    public BaZiShenShaUtil(List<String> baZi, String yearGanZhiNaYinWuXing, String season, String sex) {

        if (baZi.size() == 4) {
            this.yearGanZhi = baZi.get(0); // 年干支
            this.yearGan = baZi.get(0).substring(0, 1); // 年干
            this.yearZhi = baZi.get(0).substring(1, 2); // 年支
            this.monthGanZhi = baZi.get(1); // 月干支
            this.monthGan = baZi.get(1).substring(0, 1); // 月干
            this.monthZhi = baZi.get(1).substring(1, 2); // 月支
            this.dayGanZhi = baZi.get(2); // 日干支
            this.dayGan = baZi.get(2).substring(0, 1); // 日干
            this.dayZhi = baZi.get(2).substring(1, 2); // 日支
            this.hourGanZhi = baZi.get(3); // 时干支
            this.hourGan = baZi.get(3).substring(0, 1); // 时干
            this.hourZhi = baZi.get(3).substring(1, 2); // 时支
        }

        this.yearGanZhiNaYinWuXing = yearGanZhiNaYinWuXing; // 年干支纳音五行
        this.season = season; // 季节
        this.sex = sex; // 性别

        changYongShenSha(); // ★ 计算常用神煞

    }

//====================================================================================================================================================

    /**
     * ★ 计算常用神煞
     */
    public void changYongShenSha() {

        // 1、计算数据
        taiJiGuiRen(); // 计算太极贵人【1】
        tianYiGuiRen(); // 计算天乙贵人【1】
        fuXingGuiRen(); // 计算福星贵人【1】
        wenChangGuiRen(); // 计算文昌贵人【1】
        tianChuGuiRen(); // 计算天厨贵人【1】
        yueDeGuiRen(); // 计算月德贵人【3】
        deXiuGuiRen(); // 计算德秀贵人【3】
        tianDeGuiRen(); // 计算天德贵人【4】
        shiEDaBai(); // 计算十恶大败【0】
        yinChaYangCuo(); // 计算阴差阳错【0】
        siFeiRi(); // 计算四废日【0】
        liuXiuRi(); // 计算六秀日【0】
        shiLingRi(); // 计算十灵日【0】
        kuiGangRi(); // 计算魁罡日【0】
        baZhuanRi(); // 计算八专日【0】
        jiuChouRi(); // 计算九丑日【0】
        siFeiRi(); // 计算四废日【0】
        guLuanSha(); // 计算孤鸾煞【0】
        hongYanSha(); // 计算红艳煞【1】
        gouJiaoSha(); // 计算勾绞煞【1】
        tongZiSha(); // 计算童子煞【7】
        huaGai(); // 计算华盖【6】
        guoYin(); // 计算国印【1】
        jiYu(); // 计算金舆【1】
        yangRen(); // 计算羊刃【1】
        feiRen(); // 计算飞刃【1】
        liuXia(); // 计算流霞【1】
        luShen(); // 计算禄神【1】
        yiMa(); // 计算驿马【1】
        jieSha(); // 计算劫煞【1】
        jiangXing(); // 计算将星【1】
        taoHua(); // 计算桃花【1】
        wangShen(); // 计算亡神【1】
        diaoKe(); // 计算吊客【1】
        piMa(); // 计算披麻【1】
        tianXi(); // 计算天喜【1】
        hongLuan(); // 计算红鸾【1】
        sangMen(); // 计算丧门【1】
        zaiSha(); // 计算灾煞【1】
        guChen(); // 计算孤辰【1】
        suGua(); // 计算寡宿 【1】
        yuanChen(); // 计算元辰【1】
        xueRen(); // 计算血刃【1】
        tianYi(); // 计算天医【1】
        ciGuan(); // 计算学堂【1】
        xueTang(); // 计算学堂【1】
        tianShe(); // 计算天赦【2】
        tianZhuan(); // 计算天转【2】
        diZhuan(); // 计算地转【2】
        gongLu(); // 计算拱禄【5】

        // 2、删除重复数据
        this.yearGanZhiShenSha = CommonUtil.removeDuplicates(getYearGanZhiShenSha()); // 年干支神煞
        this.monthGanZhiShenSha = CommonUtil.removeDuplicates(getMonthGanZhiShenSha()); // 月干支神煞
        this.dayGanZhiShenSha = CommonUtil.removeDuplicates(getDayGanZhiShenSha()); // 日干支神煞
        this.hourGanZhiShenSha = CommonUtil.removeDuplicates(getHourGanZhiShenSha()); // 时干支神煞

    }

//----------------------------------------------------------------------------------------------------------------------------------------------------

    /**
     * 计算四废日【0】
     */
    private void siFeiRi() {

        Map<String, String> map = BaZiShenShaMap.SI_FEI_RI;
        this.dayGanZhiShenSha.add(map.get(getSeason() + getDayGanZhi()));

    }

    /**
     * 计算十恶大败【0】
     */
    private void shiEDaBai() {

        addShenSha(BaZiShenShaMap.SHI_E_DA_BAI, "十恶大败");

    }

    /**
     * 计算阴差阳错【2】
     */
    private void yinChaYangCuo() {

        addShenSha(BaZiShenShaMap.YIN_CHA_YANG_CUO, "阴差阳错");

    }

    /**
     * 计算六秀日【2】
     */
    private void liuXiuRi() {

        addShenSha(BaZiShenShaMap.LIU_XIU_RI, "六秀日");

    }

    /**
     * 计算十灵日【2】
     */
    private void shiLingRi() {

        addShenSha(BaZiShenShaMap.SHI_LING_RI, "十灵日");

    }

    /**
     * 计算魁罡日【2】
     */
    private void kuiGangRi() {

        addShenSha(BaZiShenShaMap.KUI_GANG_RI, "魁罡日");

    }

    /**
     * 计算八专日【2】
     */
    private void baZhuanRi() {

        addShenSha(BaZiShenShaMap.BA_ZHUAN_RI, "八专日");

    }

    /**
     * 计算九丑日【2】
     */
    private void jiuChouRi() {

        addShenSha(BaZiShenShaMap.JIU_CHOU_RI, "九丑日");

    }

    /**
     * 计算孤鸾煞【2】
     */
    private void guLuanSha() {

        addShenSha(BaZiShenShaMap.GU_LUAN_SHA, "孤鸾煞");

    }

//----------------------------------------------------------------------------------------------------------------------------------------------------

    /**
     * 计算太极贵人【1】
     */
    private void taiJiGuiRen() {

        Map<String, String> map = BaZiShenShaMap.TAI_JI_GUI_REN;
        addSiZhuShenSha1(map, getYearGan(), getDayGan());

    }

    /**
     * 计算天乙贵人【1】
     */
    private void tianYiGuiRen() {

        Map<String, String> map = BaZiShenShaMap.TIAN_YI_GUI_REN;
        addSiZhuShenSha1(map, getYearGan(), getDayGan());

    }

    /**
     * 计算福星贵人【1】
     */
    private void fuXingGuiRen() {

        Map<String, String> map = BaZiShenShaMap.FU_XING_GUI_REN;
        addSiZhuShenSha1(map, getYearGan(), getDayGan());

    }

    /**
     * 计算文昌贵人【1】
     */
    private void wenChangGuiRen() {

        Map<String, String> map = BaZiShenShaMap.WEN_CHANG_GUI_REN;
        addSiZhuShenSha1(map, getYearGan(), getDayGan());

    }

    /**
     * 计算天厨贵人【1】
     */
    private void tianChuGuiRen() {

        Map<String, String> map = BaZiShenShaMap.TIAN_CHU_GUI_REN;
        addSiZhuShenSha1(map, getYearGan(), getDayGan());

    }

    /**
     * 计算国印【1】
     */
    private void guoYin() {

        Map<String, String> map = BaZiShenShaMap.GUO_YIN;
        addSiZhuShenSha1(map, getYearGan(), getDayGan());

    }

    /**
     * 计算金舆【1】
     */
    private void jiYu() {

        Map<String, String> map = BaZiShenShaMap.JIN_YU;
        addSiZhuShenSha1(map, getYearGan(), getDayGan());

    }

    /**
     * 计算红艳煞【1】
     */
    private void hongYanSha() {

        Map<String, String> map = BaZiShenShaMap.HONG_YAN_SHA;
        addSiZhuShenSha1(map, "", getDayGan());

    }

    /**
     * 计算羊刃【1】
     */
    private void yangRen() {

        Map<String, String> map = BaZiShenShaMap.YANG_REN;
        addSiZhuShenSha1(map, "", getDayGan());

    }

    /**
     * 计算飞刃【1】
     */
    private void feiRen() {

        Map<String, String> map = BaZiShenShaMap.FEI_REN;
        addSiZhuShenSha1(map, "", getDayGan());

    }

    /**
     * 计算流霞【1】
     */
    private void liuXia() {

        Map<String, String> map = BaZiShenShaMap.LIU_XIA;
        addSiZhuShenSha1(map, "", getDayGan());

    }

    /**
     * 计算禄神【1】
     */
    private void luShen() {

        Map<String, String> map = BaZiShenShaMap.LU_SHEN;
        addSiZhuShenSha1(map, "", getDayGan());

    }

    /**
     * 计算驿马【1】
     */
    private void yiMa() {

        Map<String, String> map = BaZiShenShaMap.YI_MA;
        addSiZhuShenSha1(map, getYearZhi(), getDayZhi());

    }

    /**
     * 计算劫煞【1】
     */
    private void jieSha() {

        Map<String, String> map = BaZiShenShaMap.JIE_SHA;
        addSiZhuShenSha1(map, getYearZhi(), getDayZhi());

    }

    /**
     * 计算将星【1】
     */
    private void jiangXing() {

        Map<String, String> map = BaZiShenShaMap.JIANG_XING;
        addSiZhuShenSha1(map, getYearZhi(), getDayZhi());

    }

    /**
     * 计算桃花【1】
     */
    private void taoHua() {

        Map<String, String> map = BaZiShenShaMap.TAO_HUA;
        addSiZhuShenSha1(map, getYearZhi(), getDayZhi());

    }

    /**
     * 计算亡神【1】
     */
    private void wangShen() {

        Map<String, String> map = BaZiShenShaMap.WANG_SHEN;
        addSiZhuShenSha1(map, getYearZhi(), getDayZhi());

    }

    /**
     * 计算吊客【1】
     */
    private void diaoKe() {

        Map<String, String> map = BaZiShenShaMap.DIAO_KE;
        addSiZhuShenSha1(map, getYearZhi(), getDayZhi());

    }

    /**
     * 计算披麻【1】
     */
    private void piMa() {

        Map<String, String> map = BaZiShenShaMap.PI_MA;
        addSiZhuShenSha1(map, getYearZhi(), getDayZhi());

    }

    /**
     * 计算天喜【1】
     */
    private void tianXi() {

        Map<String, String> map = BaZiShenShaMap.TIAN_XI;
        addSiZhuShenSha1(map, getYearZhi(), "");

    }

    /**
     * 计算勾绞煞【1】
     */
    private void gouJiaoSha() {

        Map<String, String> map = BaZiShenShaMap.GOU_JIAO_SHA;
        addSiZhuShenSha1(map, getYearZhi(), "");

    }

    /**
     * 计算红鸾【1】
     */
    private void hongLuan() {

        Map<String, String> map = BaZiShenShaMap.HONG_LUAN;
        addSiZhuShenSha1(map, getYearZhi(), "");

    }

    /**
     * 计算丧门【1】
     */
    private void sangMen() {

        Map<String, String> map = BaZiShenShaMap.SANG_MEN;
        addSiZhuShenSha1(map, getYearZhi(), "");

    }

    /**
     * 计算灾煞【1】
     */
    private void zaiSha() {

        Map<String, String> map = BaZiShenShaMap.ZAI_SHA;
        addSiZhuShenSha1(map, getYearZhi(), "");

    }

    /**
     * 计算孤辰【1】
     */
    private void guChen() {

        Map<String, String> map = BaZiShenShaMap.GU_CHEN;
        addSiZhuShenSha1(map, getYearZhi(), "");

    }

    /**
     * 计算寡宿【1】
     */
    private void suGua() {

        Map<String, String> map = BaZiShenShaMap.SU_GUA;
        addSiZhuShenSha1(map, getYearZhi(), "");

    }

    /**
     * 计算元辰【1】
     */
    private void yuanChen() {

        Map<String, String> yuanChenYangNan = BaZiShenShaMap.YUAN_CHEN_YANG_NAN; // 元辰（阳男阴女）
        Map<String, String> yuanChenYinNan = BaZiShenShaMap.YUAN_CHEN_YIN_NAN; // 元辰（阴男阳女）
        String yearGanYinYang = BaZiMap.GAN_YIN_YANG.get(getYearGan()); // 年干阴阳

        Map<String, String> map = new HashMap<>();

        if ("阳".equals(yearGanYinYang) && "男".equals(getSex())) {
            map = yuanChenYangNan; // 阳男阴女
        } else if ("阴".equals(yearGanYinYang) && "男".equals(getSex())) {
            map = yuanChenYinNan; // 阴男阳女
        } else if ("阳".equals(yearGanYinYang) && "女".equals(getSex())) {
            map = yuanChenYinNan; // 阴男阳女
        } else if ("阴".equals(yearGanYinYang) && "女".equals(getSex())) {
            map = yuanChenYangNan; // 阳男阴女
        }

        addSiZhuShenSha1(map, getYearZhi(), "");

    }

    /**
     * 计算血刃【1】
     */
    private void xueRen() {

        Map<String, String> map = BaZiShenShaMap.XUE_REN;
        addSiZhuShenSha1(map, getMonthZhi(), "");

    }

    /**
     * 计算天医【1】
     */
    private void tianYi() {

        Map<String, String> map = BaZiShenShaMap.TIAN_YI;
        addSiZhuShenSha1(map, getMonthZhi(), "");

    }

    /**
     * 计算词馆【1】
     */
    private void ciGuan() {

        Map<String, String> map = BaZiShenShaMap.CI_GUAN_LU_MING;
        addSiZhuShenSha1(map, getYearGanZhiNaYinWuXing(), "");

    }

    /**
     * 计算学堂【1】
     */
    private void xueTang() {

        Map<String, String> map = BaZiShenShaMap.XUE_TANG_LU_MING;
        addSiZhuShenSha1(map, getYearGanZhiNaYinWuXing(), "");

    }

    /**
     * 计算天赦【2】
     */
    private void tianShe() {

        Map<String, String> map = BaZiShenShaMap.TIAN_SHE;
        addSiZhuShenSha2(map, getMonthZhi());

    }

    /**
     * 计算天转【2】
     */
    private void tianZhuan() {

        Map<String, String> map = BaZiShenShaMap.TIAN_ZHUAN;
        addSiZhuShenSha2(map, getMonthZhi());

    }

    /**
     * 计算地转【2】
     */
    private void diZhuan() {

        Map<String, String> map = BaZiShenShaMap.DI_ZHUAN;
        addSiZhuShenSha2(map, getMonthZhi());

    }

    /**
     * 计算月德贵人【3】
     */
    private void yueDeGuiRen() {

        Map<String, String> map = BaZiShenShaMap.YUE_DE_GUI_REN;
        addSiZhuShenSha3(map, getMonthZhi());

    }

    /**
     * 计算德秀贵人【3】
     */
    private void deXiuGuiRen() {

        Map<String, String> map = BaZiShenShaMap.DE_XIU_GUI_REN;
        addSiZhuShenSha3(map, getMonthZhi());

    }

    /**
     * 计算天德贵人【4】
     */
    private void tianDeGuiRen() {

        Map<String, String> map = BaZiShenShaMap.TIAN_DE_GUI_REN;
        addSiZhuShenSha4(map, getMonthZhi());

    }

    /**
     * 计算拱禄【5】
     */
    private void gongLu() {

        Map<String, String> map = BaZiShenShaMap.GONG_LU;
        addSiZhuShenSha5(map, getDayGanZhi(), getHourGanZhi());

    }

    /**
     * 计算华盖【6】
     */
    private void huaGai() {

        Map<String, String> map = BaZiShenShaMap.HUA_GAI;
        addSiZhuShenSha6(map, getYearZhi(), getDayZhi());

    }

    /**
     * 计算童子煞【7】
     */
    private void tongZiSha() {

        Map<String, String> map = BaZiShenShaMap.TONG_ZI_SHA;
        addSiZhuShenSha7(map, getSeason(), getYearGanZhiNaYinWuXing());

    }

//----------------------------------------------------------------------------------------------------------------------------------------------------

    /**
     * 添加神煞【0】
     *
     * @param strs        常用神煞常量
     * @param shenShaName 神煞名称
     */
    private void addShenSha(String[] strs, String shenShaName) {

        // 判断日支，若匹配则添加日柱神煞
        for (String key : strs) {
            if (getDayGanZhi().equals(key)) this.dayGanZhiShenSha.add(shenShaName);
        }

    }

    /**
     * 添加神煞【1】
     *
     * @param map     常用神煞常量
     * @param ganZhi1 天干 或 地支 或 干支 或 年柱纳音五行
     * @param ganZhi2 天干 或 地支 或 干支 或 年柱纳音五行
     */
    private void addSiZhuShenSha1(Map<String, String> map, String ganZhi1, String ganZhi2) {

        this.yearGanZhiShenSha.add(map.get(ganZhi1 + getYearZhi()));
        this.monthGanZhiShenSha.add(map.get(ganZhi1 + getMonthZhi()));
        this.dayGanZhiShenSha.add(map.get(ganZhi1 + getDayZhi()));
        this.hourGanZhiShenSha.add(map.get(ganZhi1 + getHourZhi()));
        this.yearGanZhiShenSha.add(map.get(ganZhi2 + getYearZhi()));
        this.monthGanZhiShenSha.add(map.get(ganZhi2 + getMonthZhi()));
        this.dayGanZhiShenSha.add(map.get(ganZhi2 + getDayZhi()));
        this.hourGanZhiShenSha.add(map.get(ganZhi2 + getHourZhi()));

    }

    /**
     * 添加神煞【2】
     *
     * @param map     常用神煞常量
     * @param ganZhi1 天干 或 地支 或 干支 或 年柱纳音五行
     */
    private void addSiZhuShenSha2(Map<String, String> map, String ganZhi1) {

        this.yearGanZhiShenSha.add(map.get(ganZhi1 + getYearGanZhi()));
        this.monthGanZhiShenSha.add(map.get(ganZhi1 + getMonthGanZhi()));
        this.dayGanZhiShenSha.add(map.get(ganZhi1 + getDayGanZhi()));
        this.hourGanZhiShenSha.add(map.get(ganZhi1 + getHourGanZhi()));

    }

    /**
     * 添加神煞【3】
     *
     * @param map     常用神煞常量
     * @param ganZhi1 天干 或 地支 或 干支 或 年柱纳音五行
     */
    private void addSiZhuShenSha3(Map<String, String> map, String ganZhi1) {

        this.yearGanZhiShenSha.add(map.get(ganZhi1 + getYearGan()));
        this.monthGanZhiShenSha.add(map.get(ganZhi1 + getMonthGan()));
        this.dayGanZhiShenSha.add(map.get(ganZhi1 + getDayGan()));
        this.hourGanZhiShenSha.add(map.get(ganZhi1 + getHourGan()));

    }

    /**
     * 添加神煞【4】
     *
     * @param map    常用神煞常量
     * @param ganZhi 天干 或 地支 或 干支
     */
    private void addSiZhuShenSha4(Map<String, String> map, String ganZhi) {

        this.yearGanZhiShenSha.add(map.get(ganZhi + getYearGan()));
        this.monthGanZhiShenSha.add(map.get(ganZhi + getMonthGan()));
        this.dayGanZhiShenSha.add(map.get(ganZhi + getDayGan()));
        this.hourGanZhiShenSha.add(map.get(ganZhi + getHourGan()));
        this.yearGanZhiShenSha.add(map.get(ganZhi + getYearZhi()));
        this.monthGanZhiShenSha.add(map.get(ganZhi + getMonthZhi()));
        this.dayGanZhiShenSha.add(map.get(ganZhi + getDayZhi()));
        this.hourGanZhiShenSha.add(map.get(ganZhi + getHourZhi()));

    }

    /**
     * 添加神煞【5】
     *
     * @param map     常用神煞常量
     * @param ganZhi1 天干 或 地支 或 干支
     * @param ganZhi2 天干 或 地支 或 干支
     */
    private void addSiZhuShenSha5(Map<String, String> map, String ganZhi1, String ganZhi2) {

        this.yearGanZhiShenSha.add(map.get(ganZhi1 + ganZhi2 + getYearZhi()));
        this.monthGanZhiShenSha.add(map.get(ganZhi1 + ganZhi2 + getMonthZhi()));
        this.dayGanZhiShenSha.add(map.get(ganZhi1 + ganZhi2 + getDayZhi()));
        this.hourGanZhiShenSha.add(map.get(ganZhi1 + ganZhi2 + getHourZhi()));

    }

    /**
     * 添加神煞【6】
     *
     * @param map     常用神煞常量
     * @param ganZhi1 天干 或 地支 或 干支 或 年柱纳音五行
     * @param ganZhi2 天干 或 地支 或 干支 或 年柱纳音五行
     */
    private void addSiZhuShenSha6(Map<String, String> map, String ganZhi1, String ganZhi2) {

//        this.yearGanZhiShenSha.add(map.get(ganZhi1 + getYearZhi()));
        this.monthGanZhiShenSha.add(map.get(ganZhi1 + getMonthZhi()));
        this.dayGanZhiShenSha.add(map.get(ganZhi1 + getDayZhi()));
        this.hourGanZhiShenSha.add(map.get(ganZhi1 + getHourZhi()));
        this.yearGanZhiShenSha.add(map.get(ganZhi2 + getYearZhi()));
        this.monthGanZhiShenSha.add(map.get(ganZhi2 + getMonthZhi()));
//        this.dayGanZhiShenSha.add(map.get(ganZhi2 + getDayZhi()));
        this.hourGanZhiShenSha.add(map.get(ganZhi2 + getHourZhi()));

    }

    /**
     * 添加神煞【7】
     *
     * @param map                   常用神煞常量
     * @param season                季节
     * @param yearGanZhiNaYinWuXing 年干支纳音五行
     */
    private void addSiZhuShenSha7(Map<String, String> map, String season, String yearGanZhiNaYinWuXing) {

        this.dayGanZhiShenSha.add(map.get(season + getDayZhi()));
        this.hourGanZhiShenSha.add(map.get(season + getHourZhi()));
        this.dayGanZhiShenSha.add(map.get(yearGanZhiNaYinWuXing + getDayZhi()));
        this.hourGanZhiShenSha.add(map.get(yearGanZhiNaYinWuXing + getHourZhi()));

    }


}
