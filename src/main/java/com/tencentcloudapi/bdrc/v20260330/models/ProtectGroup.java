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

public class ProtectGroup extends AbstractModel {

    /**
    * 用户AppId
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 保护组ID
    */
    @SerializedName("ProtectGroupId")
    @Expose
    private String ProtectGroupId;

    /**
    * 保护组名称
    */
    @SerializedName("ProtectGroupName")
    @Expose
    private String ProtectGroupName;

    /**
    * 保护组类型（产品类型，如 DISK/CFS/INSTANCE）
    */
    @SerializedName("ProtectGroupType")
    @Expose
    private String ProtectGroupType;

    /**
    * 所属容灾策略ID
    */
    @SerializedName("SitePairId")
    @Expose
    private String SitePairId;

    /**
    * 所属容灾策略名称
    */
    @SerializedName("SitePairName")
    @Expose
    private String SitePairName;

    /**
    * RPO时间（单位秒）
    */
    @SerializedName("RecoveryPointObjective")
    @Expose
    private Long RecoveryPointObjective;

    /**
    * 生产地域（当 DataDirection=REVERSE 时会与 TargetRegion 自动轮转，保持用户视角一致）
    */
    @SerializedName("SourceRegion")
    @Expose
    private String SourceRegion;

    /**
    * 生产可用区（REVERSE 时与 TargetZone 自动轮转）
    */
    @SerializedName("SourceZone")
    @Expose
    private String SourceZone;

    /**
    * 生产端VPC（REVERSE 时与 TargetVpc 自动轮转）
    */
    @SerializedName("SourceVpc")
    @Expose
    private String SourceVpc;

    /**
    * 容灾地域（REVERSE 时与 SourceRegion 自动轮转）
    */
    @SerializedName("TargetRegion")
    @Expose
    private String TargetRegion;

    /**
    * 容灾可用区
    */
    @SerializedName("TargetZone")
    @Expose
    private String TargetZone;

    /**
    * 容灾端VPC
    */
    @SerializedName("TargetVpc")
    @Expose
    private String TargetVpc;

    /**
    * 复制技术（SYN 同步 / ASY 异步）
    */
    @SerializedName("CopyType")
    @Expose
    private String CopyType;

    /**
    * 容灾类型（CROSS_ZONE 跨可用区 / CROSS_REGION 跨地域 / CROSS_CLOUD 跨云）
    */
    @SerializedName("DisasterRecoveryType")
    @Expose
    private String DisasterRecoveryType;

    /**
    * 数据复制方向（POSITIVE 正向 / REVERSE 反向）
    */
    @SerializedName("DataDirection")
    @Expose
    private String DataDirection;

    /**
    * 跨云场景对端云名称（仅 DisasterRecoveryType=CROSS_CLOUD 时返回）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeerCloudName")
    @Expose
    private String PeerCloudName;

    /**
    * 创建来源（LOCAL 本端创建 / PEER 对端创建）
    */
    @SerializedName("CreateFrom")
    @Expose
    private String CreateFrom;

    /**
    * 生命周期状态
    */
    @SerializedName("LifeState")
    @Expose
    private String LifeState;

    /**
    * 创建保护组的账户主账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountUin")
    @Expose
    private String AccountUin;

    /**
    * 创建保护组的子账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

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
    * 绑定的已保护资源数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BindProtectedResourceCount")
    @Expose
    private Long BindProtectedResourceCount;

    /**
    * RPO 异常（超过 15 分钟未同步）的复制对数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorRecoveryPointObjectiveCount")
    @Expose
    private Long ErrorRecoveryPointObjectiveCount;

    /**
    * 已保护资源状态统计，key 为复制对状态，value 为该状态下的资源数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProtectedResourceStatusSet")
    @Expose
    private ProtectedResourceStatus [] ProtectedResourceStatusSet;

    /**
     * Get 用户AppId 
     * @return AppId 用户AppId
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户AppId
     * @param AppId 用户AppId
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
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
     * Get 保护组名称 
     * @return ProtectGroupName 保护组名称
     */
    public String getProtectGroupName() {
        return this.ProtectGroupName;
    }

    /**
     * Set 保护组名称
     * @param ProtectGroupName 保护组名称
     */
    public void setProtectGroupName(String ProtectGroupName) {
        this.ProtectGroupName = ProtectGroupName;
    }

    /**
     * Get 保护组类型（产品类型，如 DISK/CFS/INSTANCE） 
     * @return ProtectGroupType 保护组类型（产品类型，如 DISK/CFS/INSTANCE）
     */
    public String getProtectGroupType() {
        return this.ProtectGroupType;
    }

    /**
     * Set 保护组类型（产品类型，如 DISK/CFS/INSTANCE）
     * @param ProtectGroupType 保护组类型（产品类型，如 DISK/CFS/INSTANCE）
     */
    public void setProtectGroupType(String ProtectGroupType) {
        this.ProtectGroupType = ProtectGroupType;
    }

    /**
     * Get 所属容灾策略ID 
     * @return SitePairId 所属容灾策略ID
     */
    public String getSitePairId() {
        return this.SitePairId;
    }

    /**
     * Set 所属容灾策略ID
     * @param SitePairId 所属容灾策略ID
     */
    public void setSitePairId(String SitePairId) {
        this.SitePairId = SitePairId;
    }

    /**
     * Get 所属容灾策略名称 
     * @return SitePairName 所属容灾策略名称
     */
    public String getSitePairName() {
        return this.SitePairName;
    }

    /**
     * Set 所属容灾策略名称
     * @param SitePairName 所属容灾策略名称
     */
    public void setSitePairName(String SitePairName) {
        this.SitePairName = SitePairName;
    }

    /**
     * Get RPO时间（单位秒） 
     * @return RecoveryPointObjective RPO时间（单位秒）
     */
    public Long getRecoveryPointObjective() {
        return this.RecoveryPointObjective;
    }

    /**
     * Set RPO时间（单位秒）
     * @param RecoveryPointObjective RPO时间（单位秒）
     */
    public void setRecoveryPointObjective(Long RecoveryPointObjective) {
        this.RecoveryPointObjective = RecoveryPointObjective;
    }

    /**
     * Get 生产地域（当 DataDirection=REVERSE 时会与 TargetRegion 自动轮转，保持用户视角一致） 
     * @return SourceRegion 生产地域（当 DataDirection=REVERSE 时会与 TargetRegion 自动轮转，保持用户视角一致）
     */
    public String getSourceRegion() {
        return this.SourceRegion;
    }

    /**
     * Set 生产地域（当 DataDirection=REVERSE 时会与 TargetRegion 自动轮转，保持用户视角一致）
     * @param SourceRegion 生产地域（当 DataDirection=REVERSE 时会与 TargetRegion 自动轮转，保持用户视角一致）
     */
    public void setSourceRegion(String SourceRegion) {
        this.SourceRegion = SourceRegion;
    }

    /**
     * Get 生产可用区（REVERSE 时与 TargetZone 自动轮转） 
     * @return SourceZone 生产可用区（REVERSE 时与 TargetZone 自动轮转）
     */
    public String getSourceZone() {
        return this.SourceZone;
    }

    /**
     * Set 生产可用区（REVERSE 时与 TargetZone 自动轮转）
     * @param SourceZone 生产可用区（REVERSE 时与 TargetZone 自动轮转）
     */
    public void setSourceZone(String SourceZone) {
        this.SourceZone = SourceZone;
    }

    /**
     * Get 生产端VPC（REVERSE 时与 TargetVpc 自动轮转） 
     * @return SourceVpc 生产端VPC（REVERSE 时与 TargetVpc 自动轮转）
     */
    public String getSourceVpc() {
        return this.SourceVpc;
    }

    /**
     * Set 生产端VPC（REVERSE 时与 TargetVpc 自动轮转）
     * @param SourceVpc 生产端VPC（REVERSE 时与 TargetVpc 自动轮转）
     */
    public void setSourceVpc(String SourceVpc) {
        this.SourceVpc = SourceVpc;
    }

    /**
     * Get 容灾地域（REVERSE 时与 SourceRegion 自动轮转） 
     * @return TargetRegion 容灾地域（REVERSE 时与 SourceRegion 自动轮转）
     */
    public String getTargetRegion() {
        return this.TargetRegion;
    }

    /**
     * Set 容灾地域（REVERSE 时与 SourceRegion 自动轮转）
     * @param TargetRegion 容灾地域（REVERSE 时与 SourceRegion 自动轮转）
     */
    public void setTargetRegion(String TargetRegion) {
        this.TargetRegion = TargetRegion;
    }

    /**
     * Get 容灾可用区 
     * @return TargetZone 容灾可用区
     */
    public String getTargetZone() {
        return this.TargetZone;
    }

    /**
     * Set 容灾可用区
     * @param TargetZone 容灾可用区
     */
    public void setTargetZone(String TargetZone) {
        this.TargetZone = TargetZone;
    }

    /**
     * Get 容灾端VPC 
     * @return TargetVpc 容灾端VPC
     */
    public String getTargetVpc() {
        return this.TargetVpc;
    }

    /**
     * Set 容灾端VPC
     * @param TargetVpc 容灾端VPC
     */
    public void setTargetVpc(String TargetVpc) {
        this.TargetVpc = TargetVpc;
    }

    /**
     * Get 复制技术（SYN 同步 / ASY 异步） 
     * @return CopyType 复制技术（SYN 同步 / ASY 异步）
     */
    public String getCopyType() {
        return this.CopyType;
    }

    /**
     * Set 复制技术（SYN 同步 / ASY 异步）
     * @param CopyType 复制技术（SYN 同步 / ASY 异步）
     */
    public void setCopyType(String CopyType) {
        this.CopyType = CopyType;
    }

    /**
     * Get 容灾类型（CROSS_ZONE 跨可用区 / CROSS_REGION 跨地域 / CROSS_CLOUD 跨云） 
     * @return DisasterRecoveryType 容灾类型（CROSS_ZONE 跨可用区 / CROSS_REGION 跨地域 / CROSS_CLOUD 跨云）
     */
    public String getDisasterRecoveryType() {
        return this.DisasterRecoveryType;
    }

    /**
     * Set 容灾类型（CROSS_ZONE 跨可用区 / CROSS_REGION 跨地域 / CROSS_CLOUD 跨云）
     * @param DisasterRecoveryType 容灾类型（CROSS_ZONE 跨可用区 / CROSS_REGION 跨地域 / CROSS_CLOUD 跨云）
     */
    public void setDisasterRecoveryType(String DisasterRecoveryType) {
        this.DisasterRecoveryType = DisasterRecoveryType;
    }

    /**
     * Get 数据复制方向（POSITIVE 正向 / REVERSE 反向） 
     * @return DataDirection 数据复制方向（POSITIVE 正向 / REVERSE 反向）
     */
    public String getDataDirection() {
        return this.DataDirection;
    }

    /**
     * Set 数据复制方向（POSITIVE 正向 / REVERSE 反向）
     * @param DataDirection 数据复制方向（POSITIVE 正向 / REVERSE 反向）
     */
    public void setDataDirection(String DataDirection) {
        this.DataDirection = DataDirection;
    }

    /**
     * Get 跨云场景对端云名称（仅 DisasterRecoveryType=CROSS_CLOUD 时返回）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeerCloudName 跨云场景对端云名称（仅 DisasterRecoveryType=CROSS_CLOUD 时返回）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPeerCloudName() {
        return this.PeerCloudName;
    }

    /**
     * Set 跨云场景对端云名称（仅 DisasterRecoveryType=CROSS_CLOUD 时返回）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeerCloudName 跨云场景对端云名称（仅 DisasterRecoveryType=CROSS_CLOUD 时返回）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeerCloudName(String PeerCloudName) {
        this.PeerCloudName = PeerCloudName;
    }

    /**
     * Get 创建来源（LOCAL 本端创建 / PEER 对端创建） 
     * @return CreateFrom 创建来源（LOCAL 本端创建 / PEER 对端创建）
     */
    public String getCreateFrom() {
        return this.CreateFrom;
    }

    /**
     * Set 创建来源（LOCAL 本端创建 / PEER 对端创建）
     * @param CreateFrom 创建来源（LOCAL 本端创建 / PEER 对端创建）
     */
    public void setCreateFrom(String CreateFrom) {
        this.CreateFrom = CreateFrom;
    }

    /**
     * Get 生命周期状态 
     * @return LifeState 生命周期状态
     */
    public String getLifeState() {
        return this.LifeState;
    }

    /**
     * Set 生命周期状态
     * @param LifeState 生命周期状态
     */
    public void setLifeState(String LifeState) {
        this.LifeState = LifeState;
    }

    /**
     * Get 创建保护组的账户主账号 Uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountUin 创建保护组的账户主账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountUin() {
        return this.AccountUin;
    }

    /**
     * Set 创建保护组的账户主账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountUin 创建保护组的账户主账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountUin(String AccountUin) {
        this.AccountUin = AccountUin;
    }

    /**
     * Get 创建保护组的子账号 Uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubAccountUin 创建保护组的子账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set 创建保护组的子账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubAccountUin 创建保护组的子账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
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
     * Get 绑定的已保护资源数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BindProtectedResourceCount 绑定的已保护资源数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBindProtectedResourceCount() {
        return this.BindProtectedResourceCount;
    }

    /**
     * Set 绑定的已保护资源数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param BindProtectedResourceCount 绑定的已保护资源数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBindProtectedResourceCount(Long BindProtectedResourceCount) {
        this.BindProtectedResourceCount = BindProtectedResourceCount;
    }

    /**
     * Get RPO 异常（超过 15 分钟未同步）的复制对数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorRecoveryPointObjectiveCount RPO 异常（超过 15 分钟未同步）的复制对数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getErrorRecoveryPointObjectiveCount() {
        return this.ErrorRecoveryPointObjectiveCount;
    }

    /**
     * Set RPO 异常（超过 15 分钟未同步）的复制对数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorRecoveryPointObjectiveCount RPO 异常（超过 15 分钟未同步）的复制对数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorRecoveryPointObjectiveCount(Long ErrorRecoveryPointObjectiveCount) {
        this.ErrorRecoveryPointObjectiveCount = ErrorRecoveryPointObjectiveCount;
    }

    /**
     * Get 已保护资源状态统计，key 为复制对状态，value 为该状态下的资源数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProtectedResourceStatusSet 已保护资源状态统计，key 为复制对状态，value 为该状态下的资源数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProtectedResourceStatus [] getProtectedResourceStatusSet() {
        return this.ProtectedResourceStatusSet;
    }

    /**
     * Set 已保护资源状态统计，key 为复制对状态，value 为该状态下的资源数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProtectedResourceStatusSet 已保护资源状态统计，key 为复制对状态，value 为该状态下的资源数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtectedResourceStatusSet(ProtectedResourceStatus [] ProtectedResourceStatusSet) {
        this.ProtectedResourceStatusSet = ProtectedResourceStatusSet;
    }

    public ProtectGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtectGroup(ProtectGroup source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ProtectGroupId != null) {
            this.ProtectGroupId = new String(source.ProtectGroupId);
        }
        if (source.ProtectGroupName != null) {
            this.ProtectGroupName = new String(source.ProtectGroupName);
        }
        if (source.ProtectGroupType != null) {
            this.ProtectGroupType = new String(source.ProtectGroupType);
        }
        if (source.SitePairId != null) {
            this.SitePairId = new String(source.SitePairId);
        }
        if (source.SitePairName != null) {
            this.SitePairName = new String(source.SitePairName);
        }
        if (source.RecoveryPointObjective != null) {
            this.RecoveryPointObjective = new Long(source.RecoveryPointObjective);
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
        if (source.TargetRegion != null) {
            this.TargetRegion = new String(source.TargetRegion);
        }
        if (source.TargetZone != null) {
            this.TargetZone = new String(source.TargetZone);
        }
        if (source.TargetVpc != null) {
            this.TargetVpc = new String(source.TargetVpc);
        }
        if (source.CopyType != null) {
            this.CopyType = new String(source.CopyType);
        }
        if (source.DisasterRecoveryType != null) {
            this.DisasterRecoveryType = new String(source.DisasterRecoveryType);
        }
        if (source.DataDirection != null) {
            this.DataDirection = new String(source.DataDirection);
        }
        if (source.PeerCloudName != null) {
            this.PeerCloudName = new String(source.PeerCloudName);
        }
        if (source.CreateFrom != null) {
            this.CreateFrom = new String(source.CreateFrom);
        }
        if (source.LifeState != null) {
            this.LifeState = new String(source.LifeState);
        }
        if (source.AccountUin != null) {
            this.AccountUin = new String(source.AccountUin);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.BindProtectedResourceCount != null) {
            this.BindProtectedResourceCount = new Long(source.BindProtectedResourceCount);
        }
        if (source.ErrorRecoveryPointObjectiveCount != null) {
            this.ErrorRecoveryPointObjectiveCount = new Long(source.ErrorRecoveryPointObjectiveCount);
        }
        if (source.ProtectedResourceStatusSet != null) {
            this.ProtectedResourceStatusSet = new ProtectedResourceStatus[source.ProtectedResourceStatusSet.length];
            for (int i = 0; i < source.ProtectedResourceStatusSet.length; i++) {
                this.ProtectedResourceStatusSet[i] = new ProtectedResourceStatus(source.ProtectedResourceStatusSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ProtectGroupId", this.ProtectGroupId);
        this.setParamSimple(map, prefix + "ProtectGroupName", this.ProtectGroupName);
        this.setParamSimple(map, prefix + "ProtectGroupType", this.ProtectGroupType);
        this.setParamSimple(map, prefix + "SitePairId", this.SitePairId);
        this.setParamSimple(map, prefix + "SitePairName", this.SitePairName);
        this.setParamSimple(map, prefix + "RecoveryPointObjective", this.RecoveryPointObjective);
        this.setParamSimple(map, prefix + "SourceRegion", this.SourceRegion);
        this.setParamSimple(map, prefix + "SourceZone", this.SourceZone);
        this.setParamSimple(map, prefix + "SourceVpc", this.SourceVpc);
        this.setParamSimple(map, prefix + "TargetRegion", this.TargetRegion);
        this.setParamSimple(map, prefix + "TargetZone", this.TargetZone);
        this.setParamSimple(map, prefix + "TargetVpc", this.TargetVpc);
        this.setParamSimple(map, prefix + "CopyType", this.CopyType);
        this.setParamSimple(map, prefix + "DisasterRecoveryType", this.DisasterRecoveryType);
        this.setParamSimple(map, prefix + "DataDirection", this.DataDirection);
        this.setParamSimple(map, prefix + "PeerCloudName", this.PeerCloudName);
        this.setParamSimple(map, prefix + "CreateFrom", this.CreateFrom);
        this.setParamSimple(map, prefix + "LifeState", this.LifeState);
        this.setParamSimple(map, prefix + "AccountUin", this.AccountUin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "BindProtectedResourceCount", this.BindProtectedResourceCount);
        this.setParamSimple(map, prefix + "ErrorRecoveryPointObjectiveCount", this.ErrorRecoveryPointObjectiveCount);
        this.setParamArrayObj(map, prefix + "ProtectedResourceStatusSet.", this.ProtectedResourceStatusSet);

    }
}

