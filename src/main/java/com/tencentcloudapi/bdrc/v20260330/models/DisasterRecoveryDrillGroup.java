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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisasterRecoveryDrillGroup extends AbstractModel {

    /**
    * 资源ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 用户ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 账户uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountUin")
    @Expose
    private String AccountUin;

    /**
    * 子账户uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * 容灾站点对ID
    */
    @SerializedName("SitePairId")
    @Expose
    private String SitePairId;

    /**
    * 保护组ID
    */
    @SerializedName("ProtectGroupId")
    @Expose
    private String ProtectGroupId;

    /**
    * 演练组ID
    */
    @SerializedName("DrillGroupId")
    @Expose
    private String DrillGroupId;

    /**
    * 演练组名称
    */
    @SerializedName("DrillGroupName")
    @Expose
    private String DrillGroupName;

    /**
    * 演练组类型。枚举值：DISK / INSTANCE / CFS。
    */
    @SerializedName("DrillGroupType")
    @Expose
    private String DrillGroupType;

    /**
    * 恢复时间点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecoveryTime")
    @Expose
    private String RecoveryTime;

    /**
    * 演练VPC
    */
    @SerializedName("DrillVpc")
    @Expose
    private String DrillVpc;

    /**
    * 演练安全组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DrillSecurityGroup")
    @Expose
    private String DrillSecurityGroup;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 生命周期状态。枚举值：NORMAL / DELETED。
    */
    @SerializedName("LifeState")
    @Expose
    private String LifeState;

    /**
    * 容灾类型。枚举值：CROSS_ZONE / CROSS_REGION 等。
    */
    @SerializedName("DisasterRecoveryType")
    @Expose
    private String DisasterRecoveryType;

    /**
    * 复制技术。枚举值：SYN（同步）/ ASYN（异步）。
    */
    @SerializedName("CopyType")
    @Expose
    private String CopyType;

    /**
    * 对端云名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeerCloudName")
    @Expose
    private String PeerCloudName;

    /**
    * 本地云名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocalCloudName")
    @Expose
    private String LocalCloudName;

    /**
    * 生产地域
    */
    @SerializedName("SourceRegion")
    @Expose
    private String SourceRegion;

    /**
    * 生产可用区
    */
    @SerializedName("SourceZone")
    @Expose
    private String SourceZone;

    /**
    * 生产端VPC
    */
    @SerializedName("SourceVpc")
    @Expose
    private String SourceVpc;

    /**
    * 演练地域
    */
    @SerializedName("DrillRegion")
    @Expose
    private String DrillRegion;

    /**
    * 演练可用区
    */
    @SerializedName("DrillZone")
    @Expose
    private String DrillZone;

    /**
    * 数据方向。枚举值：POSITIVE（正向）/ REVERSE（反向）。
    */
    @SerializedName("DataDirection")
    @Expose
    private String DataDirection;

    /**
    * 绑定的演练资源数量。
    */
    @SerializedName("BindDrilledResourceCount")
    @Expose
    private Long BindDrilledResourceCount;

    /**
    * 演练资源状态分布（key 为状态名如 FAILED / SUCCESS，value 为该状态数量）。
    */
    @SerializedName("DrilledResourceStatusSet")
    @Expose
    private DrilledResourceStatus [] DrilledResourceStatusSet;

    /**
     * Get 资源ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 资源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 资源ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 资源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 用户ID 
     * @return AppId 用户ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户ID
     * @param AppId 用户ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 账户uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountUin 账户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountUin() {
        return this.AccountUin;
    }

    /**
     * Set 账户uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountUin 账户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountUin(String AccountUin) {
        this.AccountUin = AccountUin;
    }

    /**
     * Get 子账户uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubAccountUin 子账户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set 子账户uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubAccountUin 子账户uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get 容灾站点对ID 
     * @return SitePairId 容灾站点对ID
     */
    public String getSitePairId() {
        return this.SitePairId;
    }

    /**
     * Set 容灾站点对ID
     * @param SitePairId 容灾站点对ID
     */
    public void setSitePairId(String SitePairId) {
        this.SitePairId = SitePairId;
    }

    /**
     * Get 保护组ID 
     * @return ProtectGroupId 保护组ID
     */
    public String getProtectGroupId() {
        return this.ProtectGroupId;
    }

    /**
     * Set 保护组ID
     * @param ProtectGroupId 保护组ID
     */
    public void setProtectGroupId(String ProtectGroupId) {
        this.ProtectGroupId = ProtectGroupId;
    }

    /**
     * Get 演练组ID 
     * @return DrillGroupId 演练组ID
     */
    public String getDrillGroupId() {
        return this.DrillGroupId;
    }

    /**
     * Set 演练组ID
     * @param DrillGroupId 演练组ID
     */
    public void setDrillGroupId(String DrillGroupId) {
        this.DrillGroupId = DrillGroupId;
    }

    /**
     * Get 演练组名称 
     * @return DrillGroupName 演练组名称
     */
    public String getDrillGroupName() {
        return this.DrillGroupName;
    }

    /**
     * Set 演练组名称
     * @param DrillGroupName 演练组名称
     */
    public void setDrillGroupName(String DrillGroupName) {
        this.DrillGroupName = DrillGroupName;
    }

    /**
     * Get 演练组类型。枚举值：DISK / INSTANCE / CFS。 
     * @return DrillGroupType 演练组类型。枚举值：DISK / INSTANCE / CFS。
     */
    public String getDrillGroupType() {
        return this.DrillGroupType;
    }

    /**
     * Set 演练组类型。枚举值：DISK / INSTANCE / CFS。
     * @param DrillGroupType 演练组类型。枚举值：DISK / INSTANCE / CFS。
     */
    public void setDrillGroupType(String DrillGroupType) {
        this.DrillGroupType = DrillGroupType;
    }

    /**
     * Get 恢复时间点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecoveryTime 恢复时间点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecoveryTime() {
        return this.RecoveryTime;
    }

    /**
     * Set 恢复时间点
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecoveryTime 恢复时间点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecoveryTime(String RecoveryTime) {
        this.RecoveryTime = RecoveryTime;
    }

    /**
     * Get 演练VPC 
     * @return DrillVpc 演练VPC
     */
    public String getDrillVpc() {
        return this.DrillVpc;
    }

    /**
     * Set 演练VPC
     * @param DrillVpc 演练VPC
     */
    public void setDrillVpc(String DrillVpc) {
        this.DrillVpc = DrillVpc;
    }

    /**
     * Get 演练安全组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DrillSecurityGroup 演练安全组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDrillSecurityGroup() {
        return this.DrillSecurityGroup;
    }

    /**
     * Set 演练安全组
注意：此字段可能返回 null，表示取不到有效值。
     * @param DrillSecurityGroup 演练安全组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDrillSecurityGroup(String DrillSecurityGroup) {
        this.DrillSecurityGroup = DrillSecurityGroup;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间 
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 生命周期状态。枚举值：NORMAL / DELETED。 
     * @return LifeState 生命周期状态。枚举值：NORMAL / DELETED。
     */
    public String getLifeState() {
        return this.LifeState;
    }

    /**
     * Set 生命周期状态。枚举值：NORMAL / DELETED。
     * @param LifeState 生命周期状态。枚举值：NORMAL / DELETED。
     */
    public void setLifeState(String LifeState) {
        this.LifeState = LifeState;
    }

    /**
     * Get 容灾类型。枚举值：CROSS_ZONE / CROSS_REGION 等。 
     * @return DisasterRecoveryType 容灾类型。枚举值：CROSS_ZONE / CROSS_REGION 等。
     */
    public String getDisasterRecoveryType() {
        return this.DisasterRecoveryType;
    }

    /**
     * Set 容灾类型。枚举值：CROSS_ZONE / CROSS_REGION 等。
     * @param DisasterRecoveryType 容灾类型。枚举值：CROSS_ZONE / CROSS_REGION 等。
     */
    public void setDisasterRecoveryType(String DisasterRecoveryType) {
        this.DisasterRecoveryType = DisasterRecoveryType;
    }

    /**
     * Get 复制技术。枚举值：SYN（同步）/ ASYN（异步）。 
     * @return CopyType 复制技术。枚举值：SYN（同步）/ ASYN（异步）。
     */
    public String getCopyType() {
        return this.CopyType;
    }

    /**
     * Set 复制技术。枚举值：SYN（同步）/ ASYN（异步）。
     * @param CopyType 复制技术。枚举值：SYN（同步）/ ASYN（异步）。
     */
    public void setCopyType(String CopyType) {
        this.CopyType = CopyType;
    }

    /**
     * Get 对端云名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeerCloudName 对端云名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPeerCloudName() {
        return this.PeerCloudName;
    }

    /**
     * Set 对端云名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeerCloudName 对端云名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeerCloudName(String PeerCloudName) {
        this.PeerCloudName = PeerCloudName;
    }

    /**
     * Get 本地云名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocalCloudName 本地云名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocalCloudName() {
        return this.LocalCloudName;
    }

    /**
     * Set 本地云名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocalCloudName 本地云名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocalCloudName(String LocalCloudName) {
        this.LocalCloudName = LocalCloudName;
    }

    /**
     * Get 生产地域 
     * @return SourceRegion 生产地域
     */
    public String getSourceRegion() {
        return this.SourceRegion;
    }

    /**
     * Set 生产地域
     * @param SourceRegion 生产地域
     */
    public void setSourceRegion(String SourceRegion) {
        this.SourceRegion = SourceRegion;
    }

    /**
     * Get 生产可用区 
     * @return SourceZone 生产可用区
     */
    public String getSourceZone() {
        return this.SourceZone;
    }

    /**
     * Set 生产可用区
     * @param SourceZone 生产可用区
     */
    public void setSourceZone(String SourceZone) {
        this.SourceZone = SourceZone;
    }

    /**
     * Get 生产端VPC 
     * @return SourceVpc 生产端VPC
     */
    public String getSourceVpc() {
        return this.SourceVpc;
    }

    /**
     * Set 生产端VPC
     * @param SourceVpc 生产端VPC
     */
    public void setSourceVpc(String SourceVpc) {
        this.SourceVpc = SourceVpc;
    }

    /**
     * Get 演练地域 
     * @return DrillRegion 演练地域
     */
    public String getDrillRegion() {
        return this.DrillRegion;
    }

    /**
     * Set 演练地域
     * @param DrillRegion 演练地域
     */
    public void setDrillRegion(String DrillRegion) {
        this.DrillRegion = DrillRegion;
    }

    /**
     * Get 演练可用区 
     * @return DrillZone 演练可用区
     */
    public String getDrillZone() {
        return this.DrillZone;
    }

    /**
     * Set 演练可用区
     * @param DrillZone 演练可用区
     */
    public void setDrillZone(String DrillZone) {
        this.DrillZone = DrillZone;
    }

    /**
     * Get 数据方向。枚举值：POSITIVE（正向）/ REVERSE（反向）。 
     * @return DataDirection 数据方向。枚举值：POSITIVE（正向）/ REVERSE（反向）。
     */
    public String getDataDirection() {
        return this.DataDirection;
    }

    /**
     * Set 数据方向。枚举值：POSITIVE（正向）/ REVERSE（反向）。
     * @param DataDirection 数据方向。枚举值：POSITIVE（正向）/ REVERSE（反向）。
     */
    public void setDataDirection(String DataDirection) {
        this.DataDirection = DataDirection;
    }

    /**
     * Get 绑定的演练资源数量。 
     * @return BindDrilledResourceCount 绑定的演练资源数量。
     */
    public Long getBindDrilledResourceCount() {
        return this.BindDrilledResourceCount;
    }

    /**
     * Set 绑定的演练资源数量。
     * @param BindDrilledResourceCount 绑定的演练资源数量。
     */
    public void setBindDrilledResourceCount(Long BindDrilledResourceCount) {
        this.BindDrilledResourceCount = BindDrilledResourceCount;
    }

    /**
     * Get 演练资源状态分布（key 为状态名如 FAILED / SUCCESS，value 为该状态数量）。 
     * @return DrilledResourceStatusSet 演练资源状态分布（key 为状态名如 FAILED / SUCCESS，value 为该状态数量）。
     */
    public DrilledResourceStatus [] getDrilledResourceStatusSet() {
        return this.DrilledResourceStatusSet;
    }

    /**
     * Set 演练资源状态分布（key 为状态名如 FAILED / SUCCESS，value 为该状态数量）。
     * @param DrilledResourceStatusSet 演练资源状态分布（key 为状态名如 FAILED / SUCCESS，value 为该状态数量）。
     */
    public void setDrilledResourceStatusSet(DrilledResourceStatus [] DrilledResourceStatusSet) {
        this.DrilledResourceStatusSet = DrilledResourceStatusSet;
    }

    public DisasterRecoveryDrillGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisasterRecoveryDrillGroup(DisasterRecoveryDrillGroup source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AccountUin != null) {
            this.AccountUin = new String(source.AccountUin);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.SitePairId != null) {
            this.SitePairId = new String(source.SitePairId);
        }
        if (source.ProtectGroupId != null) {
            this.ProtectGroupId = new String(source.ProtectGroupId);
        }
        if (source.DrillGroupId != null) {
            this.DrillGroupId = new String(source.DrillGroupId);
        }
        if (source.DrillGroupName != null) {
            this.DrillGroupName = new String(source.DrillGroupName);
        }
        if (source.DrillGroupType != null) {
            this.DrillGroupType = new String(source.DrillGroupType);
        }
        if (source.RecoveryTime != null) {
            this.RecoveryTime = new String(source.RecoveryTime);
        }
        if (source.DrillVpc != null) {
            this.DrillVpc = new String(source.DrillVpc);
        }
        if (source.DrillSecurityGroup != null) {
            this.DrillSecurityGroup = new String(source.DrillSecurityGroup);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.LifeState != null) {
            this.LifeState = new String(source.LifeState);
        }
        if (source.DisasterRecoveryType != null) {
            this.DisasterRecoveryType = new String(source.DisasterRecoveryType);
        }
        if (source.CopyType != null) {
            this.CopyType = new String(source.CopyType);
        }
        if (source.PeerCloudName != null) {
            this.PeerCloudName = new String(source.PeerCloudName);
        }
        if (source.LocalCloudName != null) {
            this.LocalCloudName = new String(source.LocalCloudName);
        }
        if (source.SourceRegion != null) {
            this.SourceRegion = new String(source.SourceRegion);
        }
        if (source.SourceZone != null) {
            this.SourceZone = new String(source.SourceZone);
        }
        if (source.SourceVpc != null) {
            this.SourceVpc = new String(source.SourceVpc);
        }
        if (source.DrillRegion != null) {
            this.DrillRegion = new String(source.DrillRegion);
        }
        if (source.DrillZone != null) {
            this.DrillZone = new String(source.DrillZone);
        }
        if (source.DataDirection != null) {
            this.DataDirection = new String(source.DataDirection);
        }
        if (source.BindDrilledResourceCount != null) {
            this.BindDrilledResourceCount = new Long(source.BindDrilledResourceCount);
        }
        if (source.DrilledResourceStatusSet != null) {
            this.DrilledResourceStatusSet = new DrilledResourceStatus[source.DrilledResourceStatusSet.length];
            for (int i = 0; i < source.DrilledResourceStatusSet.length; i++) {
                this.DrilledResourceStatusSet[i] = new DrilledResourceStatus(source.DrilledResourceStatusSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AccountUin", this.AccountUin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "SitePairId", this.SitePairId);
        this.setParamSimple(map, prefix + "ProtectGroupId", this.ProtectGroupId);
        this.setParamSimple(map, prefix + "DrillGroupId", this.DrillGroupId);
        this.setParamSimple(map, prefix + "DrillGroupName", this.DrillGroupName);
        this.setParamSimple(map, prefix + "DrillGroupType", this.DrillGroupType);
        this.setParamSimple(map, prefix + "RecoveryTime", this.RecoveryTime);
        this.setParamSimple(map, prefix + "DrillVpc", this.DrillVpc);
        this.setParamSimple(map, prefix + "DrillSecurityGroup", this.DrillSecurityGroup);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "LifeState", this.LifeState);
        this.setParamSimple(map, prefix + "DisasterRecoveryType", this.DisasterRecoveryType);
        this.setParamSimple(map, prefix + "CopyType", this.CopyType);
        this.setParamSimple(map, prefix + "PeerCloudName", this.PeerCloudName);
        this.setParamSimple(map, prefix + "LocalCloudName", this.LocalCloudName);
        this.setParamSimple(map, prefix + "SourceRegion", this.SourceRegion);
        this.setParamSimple(map, prefix + "SourceZone", this.SourceZone);
        this.setParamSimple(map, prefix + "SourceVpc", this.SourceVpc);
        this.setParamSimple(map, prefix + "DrillRegion", this.DrillRegion);
        this.setParamSimple(map, prefix + "DrillZone", this.DrillZone);
        this.setParamSimple(map, prefix + "DataDirection", this.DataDirection);
        this.setParamSimple(map, prefix + "BindDrilledResourceCount", this.BindDrilledResourceCount);
        this.setParamArrayObj(map, prefix + "DrilledResourceStatusSet.", this.DrilledResourceStatusSet);

    }
}

