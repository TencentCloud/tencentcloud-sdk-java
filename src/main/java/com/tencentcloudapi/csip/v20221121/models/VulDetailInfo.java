/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulDetailInfo extends AbstractModel {

    /**
    * <p>漏洞ID</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>漏洞名字</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>CveID</p>
    */
    @SerializedName("CVEID")
    @Expose
    private String CVEID;

    /**
    * 漏洞分类
枚举值：
LINUX：Linux 软件漏洞
WINDOWS：Windows 系统补丁
WEB_CMS：Web-CMS 漏洞
APPLICATION：应用漏洞
EMERGENCY：应急漏洞
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 漏洞披露时间
参数格式：YYYY-MM-DD HH:mm:ss
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
    * <p>检测方式</p><p>枚举值：</p><ul><li>VersionCompare： 版本对比</li><li>POC： POC检测</li></ul>
    */
    @SerializedName("CheckMethod")
    @Expose
    private String CheckMethod;

    /**
    * 漏洞防御状态
枚举值：
ENABLED：已开启
NOT_SUPPORTED：不支持
NOT_ENABLED：未开启
    */
    @SerializedName("DefendStatus")
    @Expose
    private String DefendStatus;

    /**
    * 是否支持一键修复
枚举值：
true：支持
false：不支持
    */
    @SerializedName("SupportFix")
    @Expose
    private Boolean SupportFix;

    /**
    * VPR 评级信息（包含评级结果、说明和分阶段评分）
    */
    @SerializedName("VRPRatingInfo")
    @Expose
    private VPRRatingInfo VRPRatingInfo;

    /**
    * CVSS 评分
取值范围：[0.0, 10.0]
    */
    @SerializedName("CvssScore")
    @Expose
    private Float CvssScore;

    /**
    * VPR 风险标签列表（如在野利用、有 EXP、有 POC、外网暴露、无需重启等）
    */
    @SerializedName("Label")
    @Expose
    private VPRLabel [] Label;

    /**
    * 漏洞备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 漏洞概述说明
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

    /**
    * 已开启漏洞防御的主机数
    */
    @SerializedName("DefendHostCount")
    @Expose
    private Long DefendHostCount;

    /**
    * 未开启漏洞防御的主机数
    */
    @SerializedName("NotDefendHostCount")
    @Expose
    private Long NotDefendHostCount;

    /**
    * 最近扫描时间
参数格式：YYYY-MM-DD HH:mm:ss
    */
    @SerializedName("LatestScanTime")
    @Expose
    private String LatestScanTime;

    /**
    * CVSS 危害等级
枚举值：
INVALID：无效
INFO：提示
LOW：低危
MEDIUM：中危
HIGH：高危
CRITICAL：严重
    */
    @SerializedName("CVSSLevel")
    @Expose
    private String CVSSLevel;

    /**
    * 受影响软件描述列表（每项形如 openssl < 1.1.1k）
    */
    @SerializedName("VulAffect")
    @Expose
    private String [] VulAffect;

    /**
    * 是否被 KVE（已知被利用漏洞）库收录
枚举值：
true：已收录
false：未收录
    */
    @SerializedName("KVERecord")
    @Expose
    private Boolean KVERecord;

    /**
    * KVE 收录时间
参数格式：YYYY-MM-DD HH:mm:ss
    */
    @SerializedName("KVERecordTime")
    @Expose
    private String KVERecordTime;

    /**
    * EPSS 评分（漏洞利用概率预测）
取值范围：[0.0, 1.0]
    */
    @SerializedName("EPSSScore")
    @Expose
    private Float EPSSScore;

    /**
    * 受影响厂商列表
    */
    @SerializedName("AffectVendor")
    @Expose
    private String [] AffectVendor;

    /**
    * 受影响产品列表
    */
    @SerializedName("AffectProduct")
    @Expose
    private String [] AffectProduct;

    /**
    * 漏洞利用机制说明
    */
    @SerializedName("Mechanism")
    @Expose
    private String Mechanism;

    /**
    * 漏洞利用前置条件说明
    */
    @SerializedName("Precondition")
    @Expose
    private String Precondition;

    /**
    * 漏洞最新传播趋势数据列表（按日期）
    */
    @SerializedName("LatestTrend")
    @Expose
    private VulSpreadTrend [] LatestTrend;

    /**
    * <p>修复方案</p>
    */
    @SerializedName("FixSolution")
    @Expose
    private String FixSolution;

    /**
    * <p>参考链接</p>
    */
    @SerializedName("RefLink")
    @Expose
    private String RefLink;

    /**
    * <p>漏洞危害描述</p>
    */
    @SerializedName("HarmDescription")
    @Expose
    private String HarmDescription;

    /**
    * <p>漏洞影响产品</p>
    */
    @SerializedName("AffectVendorProduct")
    @Expose
    private VulVendorProduct [] AffectVendorProduct;

    /**
     * Get <p>漏洞ID</p> 
     * @return ID <p>漏洞ID</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>漏洞ID</p>
     * @param ID <p>漏洞ID</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>漏洞名字</p> 
     * @return Name <p>漏洞名字</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>漏洞名字</p>
     * @param Name <p>漏洞名字</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>CveID</p> 
     * @return CVEID <p>CveID</p>
     */
    public String getCVEID() {
        return this.CVEID;
    }

    /**
     * Set <p>CveID</p>
     * @param CVEID <p>CveID</p>
     */
    public void setCVEID(String CVEID) {
        this.CVEID = CVEID;
    }

    /**
     * Get 漏洞分类
枚举值：
LINUX：Linux 软件漏洞
WINDOWS：Windows 系统补丁
WEB_CMS：Web-CMS 漏洞
APPLICATION：应用漏洞
EMERGENCY：应急漏洞 
     * @return Category 漏洞分类
枚举值：
LINUX：Linux 软件漏洞
WINDOWS：Windows 系统补丁
WEB_CMS：Web-CMS 漏洞
APPLICATION：应用漏洞
EMERGENCY：应急漏洞
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 漏洞分类
枚举值：
LINUX：Linux 软件漏洞
WINDOWS：Windows 系统补丁
WEB_CMS：Web-CMS 漏洞
APPLICATION：应用漏洞
EMERGENCY：应急漏洞
     * @param Category 漏洞分类
枚举值：
LINUX：Linux 软件漏洞
WINDOWS：Windows 系统补丁
WEB_CMS：Web-CMS 漏洞
APPLICATION：应用漏洞
EMERGENCY：应急漏洞
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 漏洞披露时间
参数格式：YYYY-MM-DD HH:mm:ss 
     * @return PublishTime 漏洞披露时间
参数格式：YYYY-MM-DD HH:mm:ss
     */
    public String getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set 漏洞披露时间
参数格式：YYYY-MM-DD HH:mm:ss
     * @param PublishTime 漏洞披露时间
参数格式：YYYY-MM-DD HH:mm:ss
     */
    public void setPublishTime(String PublishTime) {
        this.PublishTime = PublishTime;
    }

    /**
     * Get <p>检测方式</p><p>枚举值：</p><ul><li>VersionCompare： 版本对比</li><li>POC： POC检测</li></ul> 
     * @return CheckMethod <p>检测方式</p><p>枚举值：</p><ul><li>VersionCompare： 版本对比</li><li>POC： POC检测</li></ul>
     */
    public String getCheckMethod() {
        return this.CheckMethod;
    }

    /**
     * Set <p>检测方式</p><p>枚举值：</p><ul><li>VersionCompare： 版本对比</li><li>POC： POC检测</li></ul>
     * @param CheckMethod <p>检测方式</p><p>枚举值：</p><ul><li>VersionCompare： 版本对比</li><li>POC： POC检测</li></ul>
     */
    public void setCheckMethod(String CheckMethod) {
        this.CheckMethod = CheckMethod;
    }

    /**
     * Get 漏洞防御状态
枚举值：
ENABLED：已开启
NOT_SUPPORTED：不支持
NOT_ENABLED：未开启 
     * @return DefendStatus 漏洞防御状态
枚举值：
ENABLED：已开启
NOT_SUPPORTED：不支持
NOT_ENABLED：未开启
     */
    public String getDefendStatus() {
        return this.DefendStatus;
    }

    /**
     * Set 漏洞防御状态
枚举值：
ENABLED：已开启
NOT_SUPPORTED：不支持
NOT_ENABLED：未开启
     * @param DefendStatus 漏洞防御状态
枚举值：
ENABLED：已开启
NOT_SUPPORTED：不支持
NOT_ENABLED：未开启
     */
    public void setDefendStatus(String DefendStatus) {
        this.DefendStatus = DefendStatus;
    }

    /**
     * Get 是否支持一键修复
枚举值：
true：支持
false：不支持 
     * @return SupportFix 是否支持一键修复
枚举值：
true：支持
false：不支持
     */
    public Boolean getSupportFix() {
        return this.SupportFix;
    }

    /**
     * Set 是否支持一键修复
枚举值：
true：支持
false：不支持
     * @param SupportFix 是否支持一键修复
枚举值：
true：支持
false：不支持
     */
    public void setSupportFix(Boolean SupportFix) {
        this.SupportFix = SupportFix;
    }

    /**
     * Get VPR 评级信息（包含评级结果、说明和分阶段评分） 
     * @return VRPRatingInfo VPR 评级信息（包含评级结果、说明和分阶段评分）
     */
    public VPRRatingInfo getVRPRatingInfo() {
        return this.VRPRatingInfo;
    }

    /**
     * Set VPR 评级信息（包含评级结果、说明和分阶段评分）
     * @param VRPRatingInfo VPR 评级信息（包含评级结果、说明和分阶段评分）
     */
    public void setVRPRatingInfo(VPRRatingInfo VRPRatingInfo) {
        this.VRPRatingInfo = VRPRatingInfo;
    }

    /**
     * Get CVSS 评分
取值范围：[0.0, 10.0] 
     * @return CvssScore CVSS 评分
取值范围：[0.0, 10.0]
     */
    public Float getCvssScore() {
        return this.CvssScore;
    }

    /**
     * Set CVSS 评分
取值范围：[0.0, 10.0]
     * @param CvssScore CVSS 评分
取值范围：[0.0, 10.0]
     */
    public void setCvssScore(Float CvssScore) {
        this.CvssScore = CvssScore;
    }

    /**
     * Get VPR 风险标签列表（如在野利用、有 EXP、有 POC、外网暴露、无需重启等） 
     * @return Label VPR 风险标签列表（如在野利用、有 EXP、有 POC、外网暴露、无需重启等）
     */
    public VPRLabel [] getLabel() {
        return this.Label;
    }

    /**
     * Set VPR 风险标签列表（如在野利用、有 EXP、有 POC、外网暴露、无需重启等）
     * @param Label VPR 风险标签列表（如在野利用、有 EXP、有 POC、外网暴露、无需重启等）
     */
    public void setLabel(VPRLabel [] Label) {
        this.Label = Label;
    }

    /**
     * Get 漏洞备注 
     * @return Remark 漏洞备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 漏洞备注
     * @param Remark 漏洞备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 漏洞概述说明 
     * @return Summary 漏洞概述说明
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set 漏洞概述说明
     * @param Summary 漏洞概述说明
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    /**
     * Get 已开启漏洞防御的主机数 
     * @return DefendHostCount 已开启漏洞防御的主机数
     */
    public Long getDefendHostCount() {
        return this.DefendHostCount;
    }

    /**
     * Set 已开启漏洞防御的主机数
     * @param DefendHostCount 已开启漏洞防御的主机数
     */
    public void setDefendHostCount(Long DefendHostCount) {
        this.DefendHostCount = DefendHostCount;
    }

    /**
     * Get 未开启漏洞防御的主机数 
     * @return NotDefendHostCount 未开启漏洞防御的主机数
     */
    public Long getNotDefendHostCount() {
        return this.NotDefendHostCount;
    }

    /**
     * Set 未开启漏洞防御的主机数
     * @param NotDefendHostCount 未开启漏洞防御的主机数
     */
    public void setNotDefendHostCount(Long NotDefendHostCount) {
        this.NotDefendHostCount = NotDefendHostCount;
    }

    /**
     * Get 最近扫描时间
参数格式：YYYY-MM-DD HH:mm:ss 
     * @return LatestScanTime 最近扫描时间
参数格式：YYYY-MM-DD HH:mm:ss
     */
    public String getLatestScanTime() {
        return this.LatestScanTime;
    }

    /**
     * Set 最近扫描时间
参数格式：YYYY-MM-DD HH:mm:ss
     * @param LatestScanTime 最近扫描时间
参数格式：YYYY-MM-DD HH:mm:ss
     */
    public void setLatestScanTime(String LatestScanTime) {
        this.LatestScanTime = LatestScanTime;
    }

    /**
     * Get CVSS 危害等级
枚举值：
INVALID：无效
INFO：提示
LOW：低危
MEDIUM：中危
HIGH：高危
CRITICAL：严重 
     * @return CVSSLevel CVSS 危害等级
枚举值：
INVALID：无效
INFO：提示
LOW：低危
MEDIUM：中危
HIGH：高危
CRITICAL：严重
     */
    public String getCVSSLevel() {
        return this.CVSSLevel;
    }

    /**
     * Set CVSS 危害等级
枚举值：
INVALID：无效
INFO：提示
LOW：低危
MEDIUM：中危
HIGH：高危
CRITICAL：严重
     * @param CVSSLevel CVSS 危害等级
枚举值：
INVALID：无效
INFO：提示
LOW：低危
MEDIUM：中危
HIGH：高危
CRITICAL：严重
     */
    public void setCVSSLevel(String CVSSLevel) {
        this.CVSSLevel = CVSSLevel;
    }

    /**
     * Get 受影响软件描述列表（每项形如 openssl < 1.1.1k） 
     * @return VulAffect 受影响软件描述列表（每项形如 openssl < 1.1.1k）
     */
    public String [] getVulAffect() {
        return this.VulAffect;
    }

    /**
     * Set 受影响软件描述列表（每项形如 openssl < 1.1.1k）
     * @param VulAffect 受影响软件描述列表（每项形如 openssl < 1.1.1k）
     */
    public void setVulAffect(String [] VulAffect) {
        this.VulAffect = VulAffect;
    }

    /**
     * Get 是否被 KVE（已知被利用漏洞）库收录
枚举值：
true：已收录
false：未收录 
     * @return KVERecord 是否被 KVE（已知被利用漏洞）库收录
枚举值：
true：已收录
false：未收录
     */
    public Boolean getKVERecord() {
        return this.KVERecord;
    }

    /**
     * Set 是否被 KVE（已知被利用漏洞）库收录
枚举值：
true：已收录
false：未收录
     * @param KVERecord 是否被 KVE（已知被利用漏洞）库收录
枚举值：
true：已收录
false：未收录
     */
    public void setKVERecord(Boolean KVERecord) {
        this.KVERecord = KVERecord;
    }

    /**
     * Get KVE 收录时间
参数格式：YYYY-MM-DD HH:mm:ss 
     * @return KVERecordTime KVE 收录时间
参数格式：YYYY-MM-DD HH:mm:ss
     */
    public String getKVERecordTime() {
        return this.KVERecordTime;
    }

    /**
     * Set KVE 收录时间
参数格式：YYYY-MM-DD HH:mm:ss
     * @param KVERecordTime KVE 收录时间
参数格式：YYYY-MM-DD HH:mm:ss
     */
    public void setKVERecordTime(String KVERecordTime) {
        this.KVERecordTime = KVERecordTime;
    }

    /**
     * Get EPSS 评分（漏洞利用概率预测）
取值范围：[0.0, 1.0] 
     * @return EPSSScore EPSS 评分（漏洞利用概率预测）
取值范围：[0.0, 1.0]
     */
    public Float getEPSSScore() {
        return this.EPSSScore;
    }

    /**
     * Set EPSS 评分（漏洞利用概率预测）
取值范围：[0.0, 1.0]
     * @param EPSSScore EPSS 评分（漏洞利用概率预测）
取值范围：[0.0, 1.0]
     */
    public void setEPSSScore(Float EPSSScore) {
        this.EPSSScore = EPSSScore;
    }

    /**
     * Get 受影响厂商列表 
     * @return AffectVendor 受影响厂商列表
     */
    public String [] getAffectVendor() {
        return this.AffectVendor;
    }

    /**
     * Set 受影响厂商列表
     * @param AffectVendor 受影响厂商列表
     */
    public void setAffectVendor(String [] AffectVendor) {
        this.AffectVendor = AffectVendor;
    }

    /**
     * Get 受影响产品列表 
     * @return AffectProduct 受影响产品列表
     */
    public String [] getAffectProduct() {
        return this.AffectProduct;
    }

    /**
     * Set 受影响产品列表
     * @param AffectProduct 受影响产品列表
     */
    public void setAffectProduct(String [] AffectProduct) {
        this.AffectProduct = AffectProduct;
    }

    /**
     * Get 漏洞利用机制说明 
     * @return Mechanism 漏洞利用机制说明
     */
    public String getMechanism() {
        return this.Mechanism;
    }

    /**
     * Set 漏洞利用机制说明
     * @param Mechanism 漏洞利用机制说明
     */
    public void setMechanism(String Mechanism) {
        this.Mechanism = Mechanism;
    }

    /**
     * Get 漏洞利用前置条件说明 
     * @return Precondition 漏洞利用前置条件说明
     */
    public String getPrecondition() {
        return this.Precondition;
    }

    /**
     * Set 漏洞利用前置条件说明
     * @param Precondition 漏洞利用前置条件说明
     */
    public void setPrecondition(String Precondition) {
        this.Precondition = Precondition;
    }

    /**
     * Get 漏洞最新传播趋势数据列表（按日期） 
     * @return LatestTrend 漏洞最新传播趋势数据列表（按日期）
     */
    public VulSpreadTrend [] getLatestTrend() {
        return this.LatestTrend;
    }

    /**
     * Set 漏洞最新传播趋势数据列表（按日期）
     * @param LatestTrend 漏洞最新传播趋势数据列表（按日期）
     */
    public void setLatestTrend(VulSpreadTrend [] LatestTrend) {
        this.LatestTrend = LatestTrend;
    }

    /**
     * Get <p>修复方案</p> 
     * @return FixSolution <p>修复方案</p>
     */
    public String getFixSolution() {
        return this.FixSolution;
    }

    /**
     * Set <p>修复方案</p>
     * @param FixSolution <p>修复方案</p>
     */
    public void setFixSolution(String FixSolution) {
        this.FixSolution = FixSolution;
    }

    /**
     * Get <p>参考链接</p> 
     * @return RefLink <p>参考链接</p>
     */
    public String getRefLink() {
        return this.RefLink;
    }

    /**
     * Set <p>参考链接</p>
     * @param RefLink <p>参考链接</p>
     */
    public void setRefLink(String RefLink) {
        this.RefLink = RefLink;
    }

    /**
     * Get <p>漏洞危害描述</p> 
     * @return HarmDescription <p>漏洞危害描述</p>
     */
    public String getHarmDescription() {
        return this.HarmDescription;
    }

    /**
     * Set <p>漏洞危害描述</p>
     * @param HarmDescription <p>漏洞危害描述</p>
     */
    public void setHarmDescription(String HarmDescription) {
        this.HarmDescription = HarmDescription;
    }

    /**
     * Get <p>漏洞影响产品</p> 
     * @return AffectVendorProduct <p>漏洞影响产品</p>
     */
    public VulVendorProduct [] getAffectVendorProduct() {
        return this.AffectVendorProduct;
    }

    /**
     * Set <p>漏洞影响产品</p>
     * @param AffectVendorProduct <p>漏洞影响产品</p>
     */
    public void setAffectVendorProduct(VulVendorProduct [] AffectVendorProduct) {
        this.AffectVendorProduct = AffectVendorProduct;
    }

    public VulDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulDetailInfo(VulDetailInfo source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CVEID != null) {
            this.CVEID = new String(source.CVEID);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.PublishTime != null) {
            this.PublishTime = new String(source.PublishTime);
        }
        if (source.CheckMethod != null) {
            this.CheckMethod = new String(source.CheckMethod);
        }
        if (source.DefendStatus != null) {
            this.DefendStatus = new String(source.DefendStatus);
        }
        if (source.SupportFix != null) {
            this.SupportFix = new Boolean(source.SupportFix);
        }
        if (source.VRPRatingInfo != null) {
            this.VRPRatingInfo = new VPRRatingInfo(source.VRPRatingInfo);
        }
        if (source.CvssScore != null) {
            this.CvssScore = new Float(source.CvssScore);
        }
        if (source.Label != null) {
            this.Label = new VPRLabel[source.Label.length];
            for (int i = 0; i < source.Label.length; i++) {
                this.Label[i] = new VPRLabel(source.Label[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Summary != null) {
            this.Summary = new String(source.Summary);
        }
        if (source.DefendHostCount != null) {
            this.DefendHostCount = new Long(source.DefendHostCount);
        }
        if (source.NotDefendHostCount != null) {
            this.NotDefendHostCount = new Long(source.NotDefendHostCount);
        }
        if (source.LatestScanTime != null) {
            this.LatestScanTime = new String(source.LatestScanTime);
        }
        if (source.CVSSLevel != null) {
            this.CVSSLevel = new String(source.CVSSLevel);
        }
        if (source.VulAffect != null) {
            this.VulAffect = new String[source.VulAffect.length];
            for (int i = 0; i < source.VulAffect.length; i++) {
                this.VulAffect[i] = new String(source.VulAffect[i]);
            }
        }
        if (source.KVERecord != null) {
            this.KVERecord = new Boolean(source.KVERecord);
        }
        if (source.KVERecordTime != null) {
            this.KVERecordTime = new String(source.KVERecordTime);
        }
        if (source.EPSSScore != null) {
            this.EPSSScore = new Float(source.EPSSScore);
        }
        if (source.AffectVendor != null) {
            this.AffectVendor = new String[source.AffectVendor.length];
            for (int i = 0; i < source.AffectVendor.length; i++) {
                this.AffectVendor[i] = new String(source.AffectVendor[i]);
            }
        }
        if (source.AffectProduct != null) {
            this.AffectProduct = new String[source.AffectProduct.length];
            for (int i = 0; i < source.AffectProduct.length; i++) {
                this.AffectProduct[i] = new String(source.AffectProduct[i]);
            }
        }
        if (source.Mechanism != null) {
            this.Mechanism = new String(source.Mechanism);
        }
        if (source.Precondition != null) {
            this.Precondition = new String(source.Precondition);
        }
        if (source.LatestTrend != null) {
            this.LatestTrend = new VulSpreadTrend[source.LatestTrend.length];
            for (int i = 0; i < source.LatestTrend.length; i++) {
                this.LatestTrend[i] = new VulSpreadTrend(source.LatestTrend[i]);
            }
        }
        if (source.FixSolution != null) {
            this.FixSolution = new String(source.FixSolution);
        }
        if (source.RefLink != null) {
            this.RefLink = new String(source.RefLink);
        }
        if (source.HarmDescription != null) {
            this.HarmDescription = new String(source.HarmDescription);
        }
        if (source.AffectVendorProduct != null) {
            this.AffectVendorProduct = new VulVendorProduct[source.AffectVendorProduct.length];
            for (int i = 0; i < source.AffectVendorProduct.length; i++) {
                this.AffectVendorProduct[i] = new VulVendorProduct(source.AffectVendorProduct[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CVEID", this.CVEID);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);
        this.setParamSimple(map, prefix + "CheckMethod", this.CheckMethod);
        this.setParamSimple(map, prefix + "DefendStatus", this.DefendStatus);
        this.setParamSimple(map, prefix + "SupportFix", this.SupportFix);
        this.setParamObj(map, prefix + "VRPRatingInfo.", this.VRPRatingInfo);
        this.setParamSimple(map, prefix + "CvssScore", this.CvssScore);
        this.setParamArrayObj(map, prefix + "Label.", this.Label);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Summary", this.Summary);
        this.setParamSimple(map, prefix + "DefendHostCount", this.DefendHostCount);
        this.setParamSimple(map, prefix + "NotDefendHostCount", this.NotDefendHostCount);
        this.setParamSimple(map, prefix + "LatestScanTime", this.LatestScanTime);
        this.setParamSimple(map, prefix + "CVSSLevel", this.CVSSLevel);
        this.setParamArraySimple(map, prefix + "VulAffect.", this.VulAffect);
        this.setParamSimple(map, prefix + "KVERecord", this.KVERecord);
        this.setParamSimple(map, prefix + "KVERecordTime", this.KVERecordTime);
        this.setParamSimple(map, prefix + "EPSSScore", this.EPSSScore);
        this.setParamArraySimple(map, prefix + "AffectVendor.", this.AffectVendor);
        this.setParamArraySimple(map, prefix + "AffectProduct.", this.AffectProduct);
        this.setParamSimple(map, prefix + "Mechanism", this.Mechanism);
        this.setParamSimple(map, prefix + "Precondition", this.Precondition);
        this.setParamArrayObj(map, prefix + "LatestTrend.", this.LatestTrend);
        this.setParamSimple(map, prefix + "FixSolution", this.FixSolution);
        this.setParamSimple(map, prefix + "RefLink", this.RefLink);
        this.setParamSimple(map, prefix + "HarmDescription", this.HarmDescription);
        this.setParamArrayObj(map, prefix + "AffectVendorProduct.", this.AffectVendorProduct);

    }
}

