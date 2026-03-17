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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageDenyRuleDetailResponse extends AbstractModel {

    /**
    * 规则ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则类型 RULE_RISK：风险， RULE_PRIVILEGE：特权
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 生效的镜像数量
    */
    @SerializedName("EffectImageCount")
    @Expose
    private Long EffectImageCount;

    /**
    * 是否对全部扫描镜像生效。0:全选镜像，1:自选镜像
    */
    @SerializedName("IsEffectAllImage")
    @Expose
    private Long IsEffectAllImage;

    /**
    * 规则开始生效时间
    */
    @SerializedName("EffectTime")
    @Expose
    private String EffectTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 操作用户
    */
    @SerializedName("OperationUin")
    @Expose
    private String OperationUin;

    /**
    * 生效状态 IN_THE_TEST ：观察中，IN_EFFECT：生效中
    */
    @SerializedName("EffectStatus")
    @Expose
    private String EffectStatus;

    /**
    * 规则描述
    */
    @SerializedName("RuleDescription")
    @Expose
    private String RuleDescription;

    /**
    * 启用状态 0:开启，1:关闭
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 漏洞，0:未选中，1:选中
    */
    @SerializedName("Vul")
    @Expose
    private Long Vul;

    /**
    * cve编号
    */
    @SerializedName("CVEIDSet")
    @Expose
    private String [] CVEIDSet;

    /**
    * 组件编号
    */
    @SerializedName("ComponentSet")
    @Expose
    private String [] ComponentSet;

    /**
    * 漏洞分类
    */
    @SerializedName("VulClassSet")
    @Expose
    private String [] VulClassSet;

    /**
    * 漏洞等级
    */
    @SerializedName("VulLevelSet")
    @Expose
    private String [] VulLevelSet;

    /**
    * 漏洞标签
    */
    @SerializedName("VulLabelSet")
    @Expose
    private String [] VulLabelSet;

    /**
    * 木马，0:未选中，1:选中
    */
    @SerializedName("Virus")
    @Expose
    private Long Virus;

    /**
    * 木马md5列表
    */
    @SerializedName("VirusMD5Set")
    @Expose
    private String [] VirusMD5Set;

    /**
    * 木马等级
    */
    @SerializedName("VirusLevelSet")
    @Expose
    private String [] VirusLevelSet;

    /**
    * 病毒名
    */
    @SerializedName("VirusName")
    @Expose
    private String [] VirusName;

    /**
    * 敏感信息，0:未选中，1:选中
    */
    @SerializedName("Risk")
    @Expose
    private Long Risk;

    /**
    * 敏感等级
    */
    @SerializedName("RiskLevelSet")
    @Expose
    private String [] RiskLevelSet;

    /**
    * 敏感信息分类
    */
    @SerializedName("RiskType")
    @Expose
    private String [] RiskType;

    /**
    * 特权启动 0:不允许，1:允许
    */
    @SerializedName("PrivilegeRun")
    @Expose
    private Long PrivilegeRun;

    /**
    * 特权类型,
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivilegeDetail")
    @Expose
    private String [] PrivilegeDetail;

    /**
    * 镜像ID列表
    */
    @SerializedName("EffectImageSet")
    @Expose
    private String [] EffectImageSet;

    /**
    * 多少天后生效
    */
    @SerializedName("EffectDay")
    @Expose
    private Long EffectDay;

    /**
    * 规则RuelD
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 规则ID 
     * @return ID 规则ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 规则ID
     * @param ID 规则ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 规则名称 
     * @return RuleName 规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
     * @param RuleName 规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 规则类型 RULE_RISK：风险， RULE_PRIVILEGE：特权 
     * @return RuleType 规则类型 RULE_RISK：风险， RULE_PRIVILEGE：特权
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型 RULE_RISK：风险， RULE_PRIVILEGE：特权
     * @param RuleType 规则类型 RULE_RISK：风险， RULE_PRIVILEGE：特权
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 生效的镜像数量 
     * @return EffectImageCount 生效的镜像数量
     */
    public Long getEffectImageCount() {
        return this.EffectImageCount;
    }

    /**
     * Set 生效的镜像数量
     * @param EffectImageCount 生效的镜像数量
     */
    public void setEffectImageCount(Long EffectImageCount) {
        this.EffectImageCount = EffectImageCount;
    }

    /**
     * Get 是否对全部扫描镜像生效。0:全选镜像，1:自选镜像 
     * @return IsEffectAllImage 是否对全部扫描镜像生效。0:全选镜像，1:自选镜像
     */
    public Long getIsEffectAllImage() {
        return this.IsEffectAllImage;
    }

    /**
     * Set 是否对全部扫描镜像生效。0:全选镜像，1:自选镜像
     * @param IsEffectAllImage 是否对全部扫描镜像生效。0:全选镜像，1:自选镜像
     */
    public void setIsEffectAllImage(Long IsEffectAllImage) {
        this.IsEffectAllImage = IsEffectAllImage;
    }

    /**
     * Get 规则开始生效时间 
     * @return EffectTime 规则开始生效时间
     */
    public String getEffectTime() {
        return this.EffectTime;
    }

    /**
     * Set 规则开始生效时间
     * @param EffectTime 规则开始生效时间
     */
    public void setEffectTime(String EffectTime) {
        this.EffectTime = EffectTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 操作用户 
     * @return OperationUin 操作用户
     */
    public String getOperationUin() {
        return this.OperationUin;
    }

    /**
     * Set 操作用户
     * @param OperationUin 操作用户
     */
    public void setOperationUin(String OperationUin) {
        this.OperationUin = OperationUin;
    }

    /**
     * Get 生效状态 IN_THE_TEST ：观察中，IN_EFFECT：生效中 
     * @return EffectStatus 生效状态 IN_THE_TEST ：观察中，IN_EFFECT：生效中
     */
    public String getEffectStatus() {
        return this.EffectStatus;
    }

    /**
     * Set 生效状态 IN_THE_TEST ：观察中，IN_EFFECT：生效中
     * @param EffectStatus 生效状态 IN_THE_TEST ：观察中，IN_EFFECT：生效中
     */
    public void setEffectStatus(String EffectStatus) {
        this.EffectStatus = EffectStatus;
    }

    /**
     * Get 规则描述 
     * @return RuleDescription 规则描述
     */
    public String getRuleDescription() {
        return this.RuleDescription;
    }

    /**
     * Set 规则描述
     * @param RuleDescription 规则描述
     */
    public void setRuleDescription(String RuleDescription) {
        this.RuleDescription = RuleDescription;
    }

    /**
     * Get 启用状态 0:开启，1:关闭 
     * @return Status 启用状态 0:开启，1:关闭
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 启用状态 0:开启，1:关闭
     * @param Status 启用状态 0:开启，1:关闭
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 漏洞，0:未选中，1:选中 
     * @return Vul 漏洞，0:未选中，1:选中
     */
    public Long getVul() {
        return this.Vul;
    }

    /**
     * Set 漏洞，0:未选中，1:选中
     * @param Vul 漏洞，0:未选中，1:选中
     */
    public void setVul(Long Vul) {
        this.Vul = Vul;
    }

    /**
     * Get cve编号 
     * @return CVEIDSet cve编号
     */
    public String [] getCVEIDSet() {
        return this.CVEIDSet;
    }

    /**
     * Set cve编号
     * @param CVEIDSet cve编号
     */
    public void setCVEIDSet(String [] CVEIDSet) {
        this.CVEIDSet = CVEIDSet;
    }

    /**
     * Get 组件编号 
     * @return ComponentSet 组件编号
     */
    public String [] getComponentSet() {
        return this.ComponentSet;
    }

    /**
     * Set 组件编号
     * @param ComponentSet 组件编号
     */
    public void setComponentSet(String [] ComponentSet) {
        this.ComponentSet = ComponentSet;
    }

    /**
     * Get 漏洞分类 
     * @return VulClassSet 漏洞分类
     */
    public String [] getVulClassSet() {
        return this.VulClassSet;
    }

    /**
     * Set 漏洞分类
     * @param VulClassSet 漏洞分类
     */
    public void setVulClassSet(String [] VulClassSet) {
        this.VulClassSet = VulClassSet;
    }

    /**
     * Get 漏洞等级 
     * @return VulLevelSet 漏洞等级
     */
    public String [] getVulLevelSet() {
        return this.VulLevelSet;
    }

    /**
     * Set 漏洞等级
     * @param VulLevelSet 漏洞等级
     */
    public void setVulLevelSet(String [] VulLevelSet) {
        this.VulLevelSet = VulLevelSet;
    }

    /**
     * Get 漏洞标签 
     * @return VulLabelSet 漏洞标签
     */
    public String [] getVulLabelSet() {
        return this.VulLabelSet;
    }

    /**
     * Set 漏洞标签
     * @param VulLabelSet 漏洞标签
     */
    public void setVulLabelSet(String [] VulLabelSet) {
        this.VulLabelSet = VulLabelSet;
    }

    /**
     * Get 木马，0:未选中，1:选中 
     * @return Virus 木马，0:未选中，1:选中
     */
    public Long getVirus() {
        return this.Virus;
    }

    /**
     * Set 木马，0:未选中，1:选中
     * @param Virus 木马，0:未选中，1:选中
     */
    public void setVirus(Long Virus) {
        this.Virus = Virus;
    }

    /**
     * Get 木马md5列表 
     * @return VirusMD5Set 木马md5列表
     */
    public String [] getVirusMD5Set() {
        return this.VirusMD5Set;
    }

    /**
     * Set 木马md5列表
     * @param VirusMD5Set 木马md5列表
     */
    public void setVirusMD5Set(String [] VirusMD5Set) {
        this.VirusMD5Set = VirusMD5Set;
    }

    /**
     * Get 木马等级 
     * @return VirusLevelSet 木马等级
     */
    public String [] getVirusLevelSet() {
        return this.VirusLevelSet;
    }

    /**
     * Set 木马等级
     * @param VirusLevelSet 木马等级
     */
    public void setVirusLevelSet(String [] VirusLevelSet) {
        this.VirusLevelSet = VirusLevelSet;
    }

    /**
     * Get 病毒名 
     * @return VirusName 病毒名
     */
    public String [] getVirusName() {
        return this.VirusName;
    }

    /**
     * Set 病毒名
     * @param VirusName 病毒名
     */
    public void setVirusName(String [] VirusName) {
        this.VirusName = VirusName;
    }

    /**
     * Get 敏感信息，0:未选中，1:选中 
     * @return Risk 敏感信息，0:未选中，1:选中
     */
    public Long getRisk() {
        return this.Risk;
    }

    /**
     * Set 敏感信息，0:未选中，1:选中
     * @param Risk 敏感信息，0:未选中，1:选中
     */
    public void setRisk(Long Risk) {
        this.Risk = Risk;
    }

    /**
     * Get 敏感等级 
     * @return RiskLevelSet 敏感等级
     */
    public String [] getRiskLevelSet() {
        return this.RiskLevelSet;
    }

    /**
     * Set 敏感等级
     * @param RiskLevelSet 敏感等级
     */
    public void setRiskLevelSet(String [] RiskLevelSet) {
        this.RiskLevelSet = RiskLevelSet;
    }

    /**
     * Get 敏感信息分类 
     * @return RiskType 敏感信息分类
     */
    public String [] getRiskType() {
        return this.RiskType;
    }

    /**
     * Set 敏感信息分类
     * @param RiskType 敏感信息分类
     */
    public void setRiskType(String [] RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get 特权启动 0:不允许，1:允许 
     * @return PrivilegeRun 特权启动 0:不允许，1:允许
     */
    public Long getPrivilegeRun() {
        return this.PrivilegeRun;
    }

    /**
     * Set 特权启动 0:不允许，1:允许
     * @param PrivilegeRun 特权启动 0:不允许，1:允许
     */
    public void setPrivilegeRun(Long PrivilegeRun) {
        this.PrivilegeRun = PrivilegeRun;
    }

    /**
     * Get 特权类型,
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivilegeDetail 特权类型,
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPrivilegeDetail() {
        return this.PrivilegeDetail;
    }

    /**
     * Set 特权类型,
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivilegeDetail 特权类型,
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivilegeDetail(String [] PrivilegeDetail) {
        this.PrivilegeDetail = PrivilegeDetail;
    }

    /**
     * Get 镜像ID列表 
     * @return EffectImageSet 镜像ID列表
     */
    public String [] getEffectImageSet() {
        return this.EffectImageSet;
    }

    /**
     * Set 镜像ID列表
     * @param EffectImageSet 镜像ID列表
     */
    public void setEffectImageSet(String [] EffectImageSet) {
        this.EffectImageSet = EffectImageSet;
    }

    /**
     * Get 多少天后生效 
     * @return EffectDay 多少天后生效
     */
    public Long getEffectDay() {
        return this.EffectDay;
    }

    /**
     * Set 多少天后生效
     * @param EffectDay 多少天后生效
     */
    public void setEffectDay(Long EffectDay) {
        this.EffectDay = EffectDay;
    }

    /**
     * Get 规则RuelD 
     * @return RuleID 规则RuelD
     */
    public String getRuleID() {
        return this.RuleID;
    }

    /**
     * Set 规则RuelD
     * @param RuleID 规则RuelD
     */
    public void setRuleID(String RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeImageDenyRuleDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageDenyRuleDetailResponse(DescribeImageDenyRuleDetailResponse source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.EffectImageCount != null) {
            this.EffectImageCount = new Long(source.EffectImageCount);
        }
        if (source.IsEffectAllImage != null) {
            this.IsEffectAllImage = new Long(source.IsEffectAllImage);
        }
        if (source.EffectTime != null) {
            this.EffectTime = new String(source.EffectTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.OperationUin != null) {
            this.OperationUin = new String(source.OperationUin);
        }
        if (source.EffectStatus != null) {
            this.EffectStatus = new String(source.EffectStatus);
        }
        if (source.RuleDescription != null) {
            this.RuleDescription = new String(source.RuleDescription);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Vul != null) {
            this.Vul = new Long(source.Vul);
        }
        if (source.CVEIDSet != null) {
            this.CVEIDSet = new String[source.CVEIDSet.length];
            for (int i = 0; i < source.CVEIDSet.length; i++) {
                this.CVEIDSet[i] = new String(source.CVEIDSet[i]);
            }
        }
        if (source.ComponentSet != null) {
            this.ComponentSet = new String[source.ComponentSet.length];
            for (int i = 0; i < source.ComponentSet.length; i++) {
                this.ComponentSet[i] = new String(source.ComponentSet[i]);
            }
        }
        if (source.VulClassSet != null) {
            this.VulClassSet = new String[source.VulClassSet.length];
            for (int i = 0; i < source.VulClassSet.length; i++) {
                this.VulClassSet[i] = new String(source.VulClassSet[i]);
            }
        }
        if (source.VulLevelSet != null) {
            this.VulLevelSet = new String[source.VulLevelSet.length];
            for (int i = 0; i < source.VulLevelSet.length; i++) {
                this.VulLevelSet[i] = new String(source.VulLevelSet[i]);
            }
        }
        if (source.VulLabelSet != null) {
            this.VulLabelSet = new String[source.VulLabelSet.length];
            for (int i = 0; i < source.VulLabelSet.length; i++) {
                this.VulLabelSet[i] = new String(source.VulLabelSet[i]);
            }
        }
        if (source.Virus != null) {
            this.Virus = new Long(source.Virus);
        }
        if (source.VirusMD5Set != null) {
            this.VirusMD5Set = new String[source.VirusMD5Set.length];
            for (int i = 0; i < source.VirusMD5Set.length; i++) {
                this.VirusMD5Set[i] = new String(source.VirusMD5Set[i]);
            }
        }
        if (source.VirusLevelSet != null) {
            this.VirusLevelSet = new String[source.VirusLevelSet.length];
            for (int i = 0; i < source.VirusLevelSet.length; i++) {
                this.VirusLevelSet[i] = new String(source.VirusLevelSet[i]);
            }
        }
        if (source.VirusName != null) {
            this.VirusName = new String[source.VirusName.length];
            for (int i = 0; i < source.VirusName.length; i++) {
                this.VirusName[i] = new String(source.VirusName[i]);
            }
        }
        if (source.Risk != null) {
            this.Risk = new Long(source.Risk);
        }
        if (source.RiskLevelSet != null) {
            this.RiskLevelSet = new String[source.RiskLevelSet.length];
            for (int i = 0; i < source.RiskLevelSet.length; i++) {
                this.RiskLevelSet[i] = new String(source.RiskLevelSet[i]);
            }
        }
        if (source.RiskType != null) {
            this.RiskType = new String[source.RiskType.length];
            for (int i = 0; i < source.RiskType.length; i++) {
                this.RiskType[i] = new String(source.RiskType[i]);
            }
        }
        if (source.PrivilegeRun != null) {
            this.PrivilegeRun = new Long(source.PrivilegeRun);
        }
        if (source.PrivilegeDetail != null) {
            this.PrivilegeDetail = new String[source.PrivilegeDetail.length];
            for (int i = 0; i < source.PrivilegeDetail.length; i++) {
                this.PrivilegeDetail[i] = new String(source.PrivilegeDetail[i]);
            }
        }
        if (source.EffectImageSet != null) {
            this.EffectImageSet = new String[source.EffectImageSet.length];
            for (int i = 0; i < source.EffectImageSet.length; i++) {
                this.EffectImageSet[i] = new String(source.EffectImageSet[i]);
            }
        }
        if (source.EffectDay != null) {
            this.EffectDay = new Long(source.EffectDay);
        }
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "EffectImageCount", this.EffectImageCount);
        this.setParamSimple(map, prefix + "IsEffectAllImage", this.IsEffectAllImage);
        this.setParamSimple(map, prefix + "EffectTime", this.EffectTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "OperationUin", this.OperationUin);
        this.setParamSimple(map, prefix + "EffectStatus", this.EffectStatus);
        this.setParamSimple(map, prefix + "RuleDescription", this.RuleDescription);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Vul", this.Vul);
        this.setParamArraySimple(map, prefix + "CVEIDSet.", this.CVEIDSet);
        this.setParamArraySimple(map, prefix + "ComponentSet.", this.ComponentSet);
        this.setParamArraySimple(map, prefix + "VulClassSet.", this.VulClassSet);
        this.setParamArraySimple(map, prefix + "VulLevelSet.", this.VulLevelSet);
        this.setParamArraySimple(map, prefix + "VulLabelSet.", this.VulLabelSet);
        this.setParamSimple(map, prefix + "Virus", this.Virus);
        this.setParamArraySimple(map, prefix + "VirusMD5Set.", this.VirusMD5Set);
        this.setParamArraySimple(map, prefix + "VirusLevelSet.", this.VirusLevelSet);
        this.setParamArraySimple(map, prefix + "VirusName.", this.VirusName);
        this.setParamSimple(map, prefix + "Risk", this.Risk);
        this.setParamArraySimple(map, prefix + "RiskLevelSet.", this.RiskLevelSet);
        this.setParamArraySimple(map, prefix + "RiskType.", this.RiskType);
        this.setParamSimple(map, prefix + "PrivilegeRun", this.PrivilegeRun);
        this.setParamArraySimple(map, prefix + "PrivilegeDetail.", this.PrivilegeDetail);
        this.setParamArraySimple(map, prefix + "EffectImageSet.", this.EffectImageSet);
        this.setParamSimple(map, prefix + "EffectDay", this.EffectDay);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

