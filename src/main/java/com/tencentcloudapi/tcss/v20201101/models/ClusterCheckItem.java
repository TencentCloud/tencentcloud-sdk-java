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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterCheckItem extends AbstractModel{

    /**
    * 唯一的检测项的ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckItemId")
    @Expose
    private Long CheckItemId;

    /**
    * 风险项的名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 检测项详细描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ItemDetail")
    @Expose
    private String ItemDetail;

    /**
    * 威胁等级。严重Serious,高危High,中危Middle,提示Hint
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 检查对象、风险对象.Runc,Kubelet,Containerd,Pods
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskTarget")
    @Expose
    private String RiskTarget;

    /**
    * 风险类别,漏洞风险CVERisk,配置风险ConfigRisk
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * 检测项所属的风险类型,权限提升:PrivilegePromotion,拒绝服务:RefuseService,目录穿越:DirectoryEscape,未授权访问:UnauthorizedAccess,权限许可和访问控制问题:PrivilegeAndAccessControl,敏感信息泄露:SensitiveInfoLeak
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskAttribute")
    @Expose
    private String RiskAttribute;

    /**
    * 风险特征,Tag.存在EXP:ExistEXP,存在POD:ExistPOC,无需重启:NoNeedReboot, 服务重启:ServerRestart,远程信息泄露:RemoteInfoLeak,远程拒绝服务:RemoteRefuseService,远程利用:RemoteExploit,远程执行:RemoteExecute
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskProperty")
    @Expose
    private String RiskProperty;

    /**
    * CVE编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CVENumber")
    @Expose
    private String CVENumber;

    /**
    * 披露时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiscoverTime")
    @Expose
    private String DiscoverTime;

    /**
    * 解决方案
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Solution")
    @Expose
    private String Solution;

    /**
    * CVSS信息,用于画图
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CVSS")
    @Expose
    private String CVSS;

    /**
    * CVSS分数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CVSSScore")
    @Expose
    private String CVSSScore;

    /**
    * 参考连接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelateLink")
    @Expose
    private String RelateLink;

    /**
    * 影响类型，为Node或者Workload
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AffectedType")
    @Expose
    private String AffectedType;

    /**
    * 受影响的版本信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AffectedVersion")
    @Expose
    private String AffectedVersion;

    /**
     * Get 唯一的检测项的ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckItemId 唯一的检测项的ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCheckItemId() {
        return this.CheckItemId;
    }

    /**
     * Set 唯一的检测项的ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckItemId 唯一的检测项的ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckItemId(Long CheckItemId) {
        this.CheckItemId = CheckItemId;
    }

    /**
     * Get 风险项的名称 
     * @return Name 风险项的名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 风险项的名称
     * @param Name 风险项的名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 检测项详细描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ItemDetail 检测项详细描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getItemDetail() {
        return this.ItemDetail;
    }

    /**
     * Set 检测项详细描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ItemDetail 检测项详细描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItemDetail(String ItemDetail) {
        this.ItemDetail = ItemDetail;
    }

    /**
     * Get 威胁等级。严重Serious,高危High,中危Middle,提示Hint
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskLevel 威胁等级。严重Serious,高危High,中危Middle,提示Hint
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 威胁等级。严重Serious,高危High,中危Middle,提示Hint
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskLevel 威胁等级。严重Serious,高危High,中危Middle,提示Hint
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 检查对象、风险对象.Runc,Kubelet,Containerd,Pods
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskTarget 检查对象、风险对象.Runc,Kubelet,Containerd,Pods
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskTarget() {
        return this.RiskTarget;
    }

    /**
     * Set 检查对象、风险对象.Runc,Kubelet,Containerd,Pods
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskTarget 检查对象、风险对象.Runc,Kubelet,Containerd,Pods
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskTarget(String RiskTarget) {
        this.RiskTarget = RiskTarget;
    }

    /**
     * Get 风险类别,漏洞风险CVERisk,配置风险ConfigRisk
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskType 风险类别,漏洞风险CVERisk,配置风险ConfigRisk
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set 风险类别,漏洞风险CVERisk,配置风险ConfigRisk
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskType 风险类别,漏洞风险CVERisk,配置风险ConfigRisk
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskType(String RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get 检测项所属的风险类型,权限提升:PrivilegePromotion,拒绝服务:RefuseService,目录穿越:DirectoryEscape,未授权访问:UnauthorizedAccess,权限许可和访问控制问题:PrivilegeAndAccessControl,敏感信息泄露:SensitiveInfoLeak
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskAttribute 检测项所属的风险类型,权限提升:PrivilegePromotion,拒绝服务:RefuseService,目录穿越:DirectoryEscape,未授权访问:UnauthorizedAccess,权限许可和访问控制问题:PrivilegeAndAccessControl,敏感信息泄露:SensitiveInfoLeak
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskAttribute() {
        return this.RiskAttribute;
    }

    /**
     * Set 检测项所属的风险类型,权限提升:PrivilegePromotion,拒绝服务:RefuseService,目录穿越:DirectoryEscape,未授权访问:UnauthorizedAccess,权限许可和访问控制问题:PrivilegeAndAccessControl,敏感信息泄露:SensitiveInfoLeak
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskAttribute 检测项所属的风险类型,权限提升:PrivilegePromotion,拒绝服务:RefuseService,目录穿越:DirectoryEscape,未授权访问:UnauthorizedAccess,权限许可和访问控制问题:PrivilegeAndAccessControl,敏感信息泄露:SensitiveInfoLeak
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskAttribute(String RiskAttribute) {
        this.RiskAttribute = RiskAttribute;
    }

    /**
     * Get 风险特征,Tag.存在EXP:ExistEXP,存在POD:ExistPOC,无需重启:NoNeedReboot, 服务重启:ServerRestart,远程信息泄露:RemoteInfoLeak,远程拒绝服务:RemoteRefuseService,远程利用:RemoteExploit,远程执行:RemoteExecute
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskProperty 风险特征,Tag.存在EXP:ExistEXP,存在POD:ExistPOC,无需重启:NoNeedReboot, 服务重启:ServerRestart,远程信息泄露:RemoteInfoLeak,远程拒绝服务:RemoteRefuseService,远程利用:RemoteExploit,远程执行:RemoteExecute
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskProperty() {
        return this.RiskProperty;
    }

    /**
     * Set 风险特征,Tag.存在EXP:ExistEXP,存在POD:ExistPOC,无需重启:NoNeedReboot, 服务重启:ServerRestart,远程信息泄露:RemoteInfoLeak,远程拒绝服务:RemoteRefuseService,远程利用:RemoteExploit,远程执行:RemoteExecute
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskProperty 风险特征,Tag.存在EXP:ExistEXP,存在POD:ExistPOC,无需重启:NoNeedReboot, 服务重启:ServerRestart,远程信息泄露:RemoteInfoLeak,远程拒绝服务:RemoteRefuseService,远程利用:RemoteExploit,远程执行:RemoteExecute
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskProperty(String RiskProperty) {
        this.RiskProperty = RiskProperty;
    }

    /**
     * Get CVE编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CVENumber CVE编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCVENumber() {
        return this.CVENumber;
    }

    /**
     * Set CVE编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param CVENumber CVE编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCVENumber(String CVENumber) {
        this.CVENumber = CVENumber;
    }

    /**
     * Get 披露时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiscoverTime 披露时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiscoverTime() {
        return this.DiscoverTime;
    }

    /**
     * Set 披露时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiscoverTime 披露时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscoverTime(String DiscoverTime) {
        this.DiscoverTime = DiscoverTime;
    }

    /**
     * Get 解决方案
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Solution 解决方案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSolution() {
        return this.Solution;
    }

    /**
     * Set 解决方案
注意：此字段可能返回 null，表示取不到有效值。
     * @param Solution 解决方案
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSolution(String Solution) {
        this.Solution = Solution;
    }

    /**
     * Get CVSS信息,用于画图
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CVSS CVSS信息,用于画图
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCVSS() {
        return this.CVSS;
    }

    /**
     * Set CVSS信息,用于画图
注意：此字段可能返回 null，表示取不到有效值。
     * @param CVSS CVSS信息,用于画图
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCVSS(String CVSS) {
        this.CVSS = CVSS;
    }

    /**
     * Get CVSS分数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CVSSScore CVSS分数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCVSSScore() {
        return this.CVSSScore;
    }

    /**
     * Set CVSS分数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CVSSScore CVSS分数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCVSSScore(String CVSSScore) {
        this.CVSSScore = CVSSScore;
    }

    /**
     * Get 参考连接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelateLink 参考连接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRelateLink() {
        return this.RelateLink;
    }

    /**
     * Set 参考连接
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelateLink 参考连接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelateLink(String RelateLink) {
        this.RelateLink = RelateLink;
    }

    /**
     * Get 影响类型，为Node或者Workload
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AffectedType 影响类型，为Node或者Workload
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAffectedType() {
        return this.AffectedType;
    }

    /**
     * Set 影响类型，为Node或者Workload
注意：此字段可能返回 null，表示取不到有效值。
     * @param AffectedType 影响类型，为Node或者Workload
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAffectedType(String AffectedType) {
        this.AffectedType = AffectedType;
    }

    /**
     * Get 受影响的版本信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AffectedVersion 受影响的版本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAffectedVersion() {
        return this.AffectedVersion;
    }

    /**
     * Set 受影响的版本信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AffectedVersion 受影响的版本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAffectedVersion(String AffectedVersion) {
        this.AffectedVersion = AffectedVersion;
    }

    public ClusterCheckItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterCheckItem(ClusterCheckItem source) {
        if (source.CheckItemId != null) {
            this.CheckItemId = new Long(source.CheckItemId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ItemDetail != null) {
            this.ItemDetail = new String(source.ItemDetail);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.RiskTarget != null) {
            this.RiskTarget = new String(source.RiskTarget);
        }
        if (source.RiskType != null) {
            this.RiskType = new String(source.RiskType);
        }
        if (source.RiskAttribute != null) {
            this.RiskAttribute = new String(source.RiskAttribute);
        }
        if (source.RiskProperty != null) {
            this.RiskProperty = new String(source.RiskProperty);
        }
        if (source.CVENumber != null) {
            this.CVENumber = new String(source.CVENumber);
        }
        if (source.DiscoverTime != null) {
            this.DiscoverTime = new String(source.DiscoverTime);
        }
        if (source.Solution != null) {
            this.Solution = new String(source.Solution);
        }
        if (source.CVSS != null) {
            this.CVSS = new String(source.CVSS);
        }
        if (source.CVSSScore != null) {
            this.CVSSScore = new String(source.CVSSScore);
        }
        if (source.RelateLink != null) {
            this.RelateLink = new String(source.RelateLink);
        }
        if (source.AffectedType != null) {
            this.AffectedType = new String(source.AffectedType);
        }
        if (source.AffectedVersion != null) {
            this.AffectedVersion = new String(source.AffectedVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CheckItemId", this.CheckItemId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ItemDetail", this.ItemDetail);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "RiskTarget", this.RiskTarget);
        this.setParamSimple(map, prefix + "RiskType", this.RiskType);
        this.setParamSimple(map, prefix + "RiskAttribute", this.RiskAttribute);
        this.setParamSimple(map, prefix + "RiskProperty", this.RiskProperty);
        this.setParamSimple(map, prefix + "CVENumber", this.CVENumber);
        this.setParamSimple(map, prefix + "DiscoverTime", this.DiscoverTime);
        this.setParamSimple(map, prefix + "Solution", this.Solution);
        this.setParamSimple(map, prefix + "CVSS", this.CVSS);
        this.setParamSimple(map, prefix + "CVSSScore", this.CVSSScore);
        this.setParamSimple(map, prefix + "RelateLink", this.RelateLink);
        this.setParamSimple(map, prefix + "AffectedType", this.AffectedType);
        this.setParamSimple(map, prefix + "AffectedVersion", this.AffectedVersion);

    }
}

