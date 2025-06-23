/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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

public class VULBaseInfo extends AbstractModel {

    /**
    * 风险等级
high 高危/ middle 中危 / low 低危 /info 提示
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 组件
    */
    @SerializedName("Component")
    @Expose
    private String Component;

    /**
    * 漏洞发布时间
    */
    @SerializedName("PublishTime")
    @Expose
    private String PublishTime;

    /**
    * 最近扫描时间
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * 影响资产数量
    */
    @SerializedName("AffectAssetCount")
    @Expose
    private Long AffectAssetCount;

    /**
    * 风险ID
    */
    @SerializedName("RiskId")
    @Expose
    private String RiskId;

    /**
    * 漏洞类型
    */
    @SerializedName("VULType")
    @Expose
    private String VULType;

    /**
    * 漏洞名
    */
    @SerializedName("VULName")
    @Expose
    private String VULName;

    /**
    * cve
    */
    @SerializedName("CVE")
    @Expose
    private String CVE;

    /**
    * 描述
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * 漏洞payload
    */
    @SerializedName("Payload")
    @Expose
    private String Payload;

    /**
    * 漏洞影响组件
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 技术参考
    */
    @SerializedName("References")
    @Expose
    private String References;

    /**
    * 漏洞影响版本
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * 风险点
    */
    @SerializedName("VULURL")
    @Expose
    private String VULURL;

    /**
    * 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * 用户appid
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 用户uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 修复建议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Fix")
    @Expose
    private String Fix;

    /**
    * 应急漏洞类型，1-应急漏洞，0-非应急漏洞
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EMGCVulType")
    @Expose
    private Long EMGCVulType;

    /**
    * CVSS评分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CVSS")
    @Expose
    private Float CVSS;

    /**
    * 攻击热度
0/1/2/3 
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AttackHeat")
    @Expose
    private Long AttackHeat;

    /**
    * 检测状态 0 未扫描 1扫描中 2 扫描完成
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanStatus")
    @Expose
    private Long ScanStatus;

    /**
    * 1/0是否必修
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSuggest")
    @Expose
    private Long IsSuggest;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VulTag")
    @Expose
    private String [] VulTag;

    /**
    * 支持产品 逗号分隔  "cfw_waf_virtual", "cwp_detect", "cwp_defense", "cwp_fix"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportProduct")
    @Expose
    private String SupportProduct;

    /**
    * 漏洞检测任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 主键
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
    * 漏洞id 旧版
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PcmgrID")
    @Expose
    private String PcmgrID;

    /**
    * 漏洞id  新版
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TvdID")
    @Expose
    private String TvdID;

    /**
     * Get 风险等级
high 高危/ middle 中危 / low 低危 /info 提示 
     * @return Level 风险等级
high 高危/ middle 中危 / low 低危 /info 提示
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级
high 高危/ middle 中危 / low 低危 /info 提示
     * @param Level 风险等级
high 高危/ middle 中危 / low 低危 /info 提示
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 组件 
     * @return Component 组件
     */
    public String getComponent() {
        return this.Component;
    }

    /**
     * Set 组件
     * @param Component 组件
     */
    public void setComponent(String Component) {
        this.Component = Component;
    }

    /**
     * Get 漏洞发布时间 
     * @return PublishTime 漏洞发布时间
     */
    public String getPublishTime() {
        return this.PublishTime;
    }

    /**
     * Set 漏洞发布时间
     * @param PublishTime 漏洞发布时间
     */
    public void setPublishTime(String PublishTime) {
        this.PublishTime = PublishTime;
    }

    /**
     * Get 最近扫描时间 
     * @return LastScanTime 最近扫描时间
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set 最近扫描时间
     * @param LastScanTime 最近扫描时间
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get 影响资产数量 
     * @return AffectAssetCount 影响资产数量
     */
    public Long getAffectAssetCount() {
        return this.AffectAssetCount;
    }

    /**
     * Set 影响资产数量
     * @param AffectAssetCount 影响资产数量
     */
    public void setAffectAssetCount(Long AffectAssetCount) {
        this.AffectAssetCount = AffectAssetCount;
    }

    /**
     * Get 风险ID 
     * @return RiskId 风险ID
     */
    public String getRiskId() {
        return this.RiskId;
    }

    /**
     * Set 风险ID
     * @param RiskId 风险ID
     */
    public void setRiskId(String RiskId) {
        this.RiskId = RiskId;
    }

    /**
     * Get 漏洞类型 
     * @return VULType 漏洞类型
     */
    public String getVULType() {
        return this.VULType;
    }

    /**
     * Set 漏洞类型
     * @param VULType 漏洞类型
     */
    public void setVULType(String VULType) {
        this.VULType = VULType;
    }

    /**
     * Get 漏洞名 
     * @return VULName 漏洞名
     */
    public String getVULName() {
        return this.VULName;
    }

    /**
     * Set 漏洞名
     * @param VULName 漏洞名
     */
    public void setVULName(String VULName) {
        this.VULName = VULName;
    }

    /**
     * Get cve 
     * @return CVE cve
     */
    public String getCVE() {
        return this.CVE;
    }

    /**
     * Set cve
     * @param CVE cve
     */
    public void setCVE(String CVE) {
        this.CVE = CVE;
    }

    /**
     * Get 描述 
     * @return Describe 描述
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set 描述
     * @param Describe 描述
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get 漏洞payload 
     * @return Payload 漏洞payload
     */
    public String getPayload() {
        return this.Payload;
    }

    /**
     * Set 漏洞payload
     * @param Payload 漏洞payload
     */
    public void setPayload(String Payload) {
        this.Payload = Payload;
    }

    /**
     * Get 漏洞影响组件 
     * @return AppName 漏洞影响组件
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 漏洞影响组件
     * @param AppName 漏洞影响组件
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 技术参考 
     * @return References 技术参考
     */
    public String getReferences() {
        return this.References;
    }

    /**
     * Set 技术参考
     * @param References 技术参考
     */
    public void setReferences(String References) {
        this.References = References;
    }

    /**
     * Get 漏洞影响版本 
     * @return AppVersion 漏洞影响版本
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set 漏洞影响版本
     * @param AppVersion 漏洞影响版本
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get 风险点 
     * @return VULURL 风险点
     */
    public String getVULURL() {
        return this.VULURL;
    }

    /**
     * Set 风险点
     * @param VULURL 风险点
     */
    public void setVULURL(String VULURL) {
        this.VULURL = VULURL;
    }

    /**
     * Get 用户昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nick 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nick 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNick(String Nick) {
        this.Nick = Nick;
    }

    /**
     * Get 用户appid 
     * @return AppId 用户appid
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户appid
     * @param AppId 用户appid
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 用户uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 用户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 用户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 修复建议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Fix 修复建议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFix() {
        return this.Fix;
    }

    /**
     * Set 修复建议
注意：此字段可能返回 null，表示取不到有效值。
     * @param Fix 修复建议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFix(String Fix) {
        this.Fix = Fix;
    }

    /**
     * Get 应急漏洞类型，1-应急漏洞，0-非应急漏洞
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EMGCVulType 应急漏洞类型，1-应急漏洞，0-非应急漏洞
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEMGCVulType() {
        return this.EMGCVulType;
    }

    /**
     * Set 应急漏洞类型，1-应急漏洞，0-非应急漏洞
注意：此字段可能返回 null，表示取不到有效值。
     * @param EMGCVulType 应急漏洞类型，1-应急漏洞，0-非应急漏洞
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEMGCVulType(Long EMGCVulType) {
        this.EMGCVulType = EMGCVulType;
    }

    /**
     * Get CVSS评分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CVSS CVSS评分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCVSS() {
        return this.CVSS;
    }

    /**
     * Set CVSS评分
注意：此字段可能返回 null，表示取不到有效值。
     * @param CVSS CVSS评分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCVSS(Float CVSS) {
        this.CVSS = CVSS;
    }

    /**
     * Get 攻击热度
0/1/2/3 
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AttackHeat 攻击热度
0/1/2/3 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAttackHeat() {
        return this.AttackHeat;
    }

    /**
     * Set 攻击热度
0/1/2/3 
注意：此字段可能返回 null，表示取不到有效值。
     * @param AttackHeat 攻击热度
0/1/2/3 
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttackHeat(Long AttackHeat) {
        this.AttackHeat = AttackHeat;
    }

    /**
     * Get 检测状态 0 未扫描 1扫描中 2 扫描完成
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanStatus 检测状态 0 未扫描 1扫描中 2 扫描完成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set 检测状态 0 未扫描 1扫描中 2 扫描完成
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanStatus 检测状态 0 未扫描 1扫描中 2 扫描完成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanStatus(Long ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * Get 1/0是否必修
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSuggest 1/0是否必修
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsSuggest() {
        return this.IsSuggest;
    }

    /**
     * Set 1/0是否必修
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSuggest 1/0是否必修
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSuggest(Long IsSuggest) {
        this.IsSuggest = IsSuggest;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VulTag 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getVulTag() {
        return this.VulTag;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param VulTag 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVulTag(String [] VulTag) {
        this.VulTag = VulTag;
    }

    /**
     * Get 支持产品 逗号分隔  "cfw_waf_virtual", "cwp_detect", "cwp_defense", "cwp_fix"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportProduct 支持产品 逗号分隔  "cfw_waf_virtual", "cwp_detect", "cwp_defense", "cwp_fix"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSupportProduct() {
        return this.SupportProduct;
    }

    /**
     * Set 支持产品 逗号分隔  "cfw_waf_virtual", "cwp_detect", "cwp_defense", "cwp_fix"
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportProduct 支持产品 逗号分隔  "cfw_waf_virtual", "cwp_detect", "cwp_defense", "cwp_fix"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportProduct(String SupportProduct) {
        this.SupportProduct = SupportProduct;
    }

    /**
     * Get 漏洞检测任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 漏洞检测任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 漏洞检测任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 漏洞检测任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 主键
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Index 主键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set 主键
注意：此字段可能返回 null，表示取不到有效值。
     * @param Index 主键
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    /**
     * Get 漏洞id 旧版
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PcmgrID 漏洞id 旧版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPcmgrID() {
        return this.PcmgrID;
    }

    /**
     * Set 漏洞id 旧版
注意：此字段可能返回 null，表示取不到有效值。
     * @param PcmgrID 漏洞id 旧版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPcmgrID(String PcmgrID) {
        this.PcmgrID = PcmgrID;
    }

    /**
     * Get 漏洞id  新版
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TvdID 漏洞id  新版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTvdID() {
        return this.TvdID;
    }

    /**
     * Set 漏洞id  新版
注意：此字段可能返回 null，表示取不到有效值。
     * @param TvdID 漏洞id  新版
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTvdID(String TvdID) {
        this.TvdID = TvdID;
    }

    public VULBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VULBaseInfo(VULBaseInfo source) {
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Component != null) {
            this.Component = new String(source.Component);
        }
        if (source.PublishTime != null) {
            this.PublishTime = new String(source.PublishTime);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
        if (source.AffectAssetCount != null) {
            this.AffectAssetCount = new Long(source.AffectAssetCount);
        }
        if (source.RiskId != null) {
            this.RiskId = new String(source.RiskId);
        }
        if (source.VULType != null) {
            this.VULType = new String(source.VULType);
        }
        if (source.VULName != null) {
            this.VULName = new String(source.VULName);
        }
        if (source.CVE != null) {
            this.CVE = new String(source.CVE);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.Payload != null) {
            this.Payload = new String(source.Payload);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.References != null) {
            this.References = new String(source.References);
        }
        if (source.AppVersion != null) {
            this.AppVersion = new String(source.AppVersion);
        }
        if (source.VULURL != null) {
            this.VULURL = new String(source.VULURL);
        }
        if (source.Nick != null) {
            this.Nick = new String(source.Nick);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Fix != null) {
            this.Fix = new String(source.Fix);
        }
        if (source.EMGCVulType != null) {
            this.EMGCVulType = new Long(source.EMGCVulType);
        }
        if (source.CVSS != null) {
            this.CVSS = new Float(source.CVSS);
        }
        if (source.AttackHeat != null) {
            this.AttackHeat = new Long(source.AttackHeat);
        }
        if (source.ScanStatus != null) {
            this.ScanStatus = new Long(source.ScanStatus);
        }
        if (source.IsSuggest != null) {
            this.IsSuggest = new Long(source.IsSuggest);
        }
        if (source.VulTag != null) {
            this.VulTag = new String[source.VulTag.length];
            for (int i = 0; i < source.VulTag.length; i++) {
                this.VulTag[i] = new String(source.VulTag[i]);
            }
        }
        if (source.SupportProduct != null) {
            this.SupportProduct = new String(source.SupportProduct);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
        if (source.PcmgrID != null) {
            this.PcmgrID = new String(source.PcmgrID);
        }
        if (source.TvdID != null) {
            this.TvdID = new String(source.TvdID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Component", this.Component);
        this.setParamSimple(map, prefix + "PublishTime", this.PublishTime);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "AffectAssetCount", this.AffectAssetCount);
        this.setParamSimple(map, prefix + "RiskId", this.RiskId);
        this.setParamSimple(map, prefix + "VULType", this.VULType);
        this.setParamSimple(map, prefix + "VULName", this.VULName);
        this.setParamSimple(map, prefix + "CVE", this.CVE);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamSimple(map, prefix + "Payload", this.Payload);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "References", this.References);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "VULURL", this.VULURL);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Fix", this.Fix);
        this.setParamSimple(map, prefix + "EMGCVulType", this.EMGCVulType);
        this.setParamSimple(map, prefix + "CVSS", this.CVSS);
        this.setParamSimple(map, prefix + "AttackHeat", this.AttackHeat);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);
        this.setParamSimple(map, prefix + "IsSuggest", this.IsSuggest);
        this.setParamArraySimple(map, prefix + "VulTag.", this.VulTag);
        this.setParamSimple(map, prefix + "SupportProduct", this.SupportProduct);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "PcmgrID", this.PcmgrID);
        this.setParamSimple(map, prefix + "TvdID", this.TvdID);

    }
}

