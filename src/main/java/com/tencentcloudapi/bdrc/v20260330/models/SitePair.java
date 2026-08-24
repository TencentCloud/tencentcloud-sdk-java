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

public class SitePair extends AbstractModel {

    /**
    * 用户AppId
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 容灾策略ID
    */
    @SerializedName("SitePairId")
    @Expose
    private String SitePairId;

    /**
    * 容灾策略名称
    */
    @SerializedName("SitePairName")
    @Expose
    private String SitePairName;

    /**
    * 容灾策略类型（产品类型，如 DISK/CFS/INSTANCE 等）
    */
    @SerializedName("SitePairType")
    @Expose
    private String SitePairType;

    /**
    * 容灾策略状态
    */
    @SerializedName("SitePairState")
    @Expose
    private String SitePairState;

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
    * 容灾地域
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
    * 生产端VPC
    */
    @SerializedName("SourceVpc")
    @Expose
    private String SourceVpc;

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
    * 创建来源（LOCAL 本端创建 / PEER 对端创建）
    */
    @SerializedName("CreateFrom")
    @Expose
    private String CreateFrom;

    /**
    * 创建容灾策略的账户主账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountUin")
    @Expose
    private String AccountUin;

    /**
    * 创建容灾策略的子账户 Uin
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
    * 已绑定的保护组数量
    */
    @SerializedName("BindProtectGroupCount")
    @Expose
    private Long BindProtectGroupCount;

    /**
    * RPO 异常的复制对ID列表（最近一次保护点距今超过15分钟的复制对）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorRecoveryPointObjectiveCopyPairSet")
    @Expose
    private String [] ErrorRecoveryPointObjectiveCopyPairSet;

    /**
    * 已保护的资源列表（按资源类型分组）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProtectedResourceSet")
    @Expose
    private ProtectedResource [] ProtectedResourceSet;

    /**
    * 已保护资源的状态统计，key 为复制对状态，value 为该状态下的资源数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProtectedResourceStatusSet")
    @Expose
    private ProtectedResourceStatus [] ProtectedResourceStatusSet;

    /**
    * 跨云场景下的额外信息（仅 IsCrossCloud=true 时返回，非跨云为 null）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CrossCloudDetails")
    @Expose
    private CrossCloudDetails CrossCloudDetails;

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
     * Get 容灾策略ID 
     * @return SitePairId 容灾策略ID
     */
    public String getSitePairId() {
        return this.SitePairId;
    }

    /**
     * Set 容灾策略ID
     * @param SitePairId 容灾策略ID
     */
    public void setSitePairId(String SitePairId) {
        this.SitePairId = SitePairId;
    }

    /**
     * Get 容灾策略名称 
     * @return SitePairName 容灾策略名称
     */
    public String getSitePairName() {
        return this.SitePairName;
    }

    /**
     * Set 容灾策略名称
     * @param SitePairName 容灾策略名称
     */
    public void setSitePairName(String SitePairName) {
        this.SitePairName = SitePairName;
    }

    /**
     * Get 容灾策略类型（产品类型，如 DISK/CFS/INSTANCE 等） 
     * @return SitePairType 容灾策略类型（产品类型，如 DISK/CFS/INSTANCE 等）
     */
    public String getSitePairType() {
        return this.SitePairType;
    }

    /**
     * Set 容灾策略类型（产品类型，如 DISK/CFS/INSTANCE 等）
     * @param SitePairType 容灾策略类型（产品类型，如 DISK/CFS/INSTANCE 等）
     */
    public void setSitePairType(String SitePairType) {
        this.SitePairType = SitePairType;
    }

    /**
     * Get 容灾策略状态 
     * @return SitePairState 容灾策略状态
     */
    public String getSitePairState() {
        return this.SitePairState;
    }

    /**
     * Set 容灾策略状态
     * @param SitePairState 容灾策略状态
     */
    public void setSitePairState(String SitePairState) {
        this.SitePairState = SitePairState;
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
     * Get 容灾地域 
     * @return TargetRegion 容灾地域
     */
    public String getTargetRegion() {
        return this.TargetRegion;
    }

    /**
     * Set 容灾地域
     * @param TargetRegion 容灾地域
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
     * Get 创建容灾策略的账户主账号 Uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountUin 创建容灾策略的账户主账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountUin() {
        return this.AccountUin;
    }

    /**
     * Set 创建容灾策略的账户主账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountUin 创建容灾策略的账户主账号 Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountUin(String AccountUin) {
        this.AccountUin = AccountUin;
    }

    /**
     * Get 创建容灾策略的子账户 Uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubAccountUin 创建容灾策略的子账户 Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set 创建容灾策略的子账户 Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubAccountUin 创建容灾策略的子账户 Uin
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
     * Get 已绑定的保护组数量 
     * @return BindProtectGroupCount 已绑定的保护组数量
     */
    public Long getBindProtectGroupCount() {
        return this.BindProtectGroupCount;
    }

    /**
     * Set 已绑定的保护组数量
     * @param BindProtectGroupCount 已绑定的保护组数量
     */
    public void setBindProtectGroupCount(Long BindProtectGroupCount) {
        this.BindProtectGroupCount = BindProtectGroupCount;
    }

    /**
     * Get RPO 异常的复制对ID列表（最近一次保护点距今超过15分钟的复制对）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorRecoveryPointObjectiveCopyPairSet RPO 异常的复制对ID列表（最近一次保护点距今超过15分钟的复制对）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getErrorRecoveryPointObjectiveCopyPairSet() {
        return this.ErrorRecoveryPointObjectiveCopyPairSet;
    }

    /**
     * Set RPO 异常的复制对ID列表（最近一次保护点距今超过15分钟的复制对）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorRecoveryPointObjectiveCopyPairSet RPO 异常的复制对ID列表（最近一次保护点距今超过15分钟的复制对）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorRecoveryPointObjectiveCopyPairSet(String [] ErrorRecoveryPointObjectiveCopyPairSet) {
        this.ErrorRecoveryPointObjectiveCopyPairSet = ErrorRecoveryPointObjectiveCopyPairSet;
    }

    /**
     * Get 已保护的资源列表（按资源类型分组）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProtectedResourceSet 已保护的资源列表（按资源类型分组）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProtectedResource [] getProtectedResourceSet() {
        return this.ProtectedResourceSet;
    }

    /**
     * Set 已保护的资源列表（按资源类型分组）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProtectedResourceSet 已保护的资源列表（按资源类型分组）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtectedResourceSet(ProtectedResource [] ProtectedResourceSet) {
        this.ProtectedResourceSet = ProtectedResourceSet;
    }

    /**
     * Get 已保护资源的状态统计，key 为复制对状态，value 为该状态下的资源数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProtectedResourceStatusSet 已保护资源的状态统计，key 为复制对状态，value 为该状态下的资源数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProtectedResourceStatus [] getProtectedResourceStatusSet() {
        return this.ProtectedResourceStatusSet;
    }

    /**
     * Set 已保护资源的状态统计，key 为复制对状态，value 为该状态下的资源数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProtectedResourceStatusSet 已保护资源的状态统计，key 为复制对状态，value 为该状态下的资源数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtectedResourceStatusSet(ProtectedResourceStatus [] ProtectedResourceStatusSet) {
        this.ProtectedResourceStatusSet = ProtectedResourceStatusSet;
    }

    /**
     * Get 跨云场景下的额外信息（仅 IsCrossCloud=true 时返回，非跨云为 null）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CrossCloudDetails 跨云场景下的额外信息（仅 IsCrossCloud=true 时返回，非跨云为 null）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CrossCloudDetails getCrossCloudDetails() {
        return this.CrossCloudDetails;
    }

    /**
     * Set 跨云场景下的额外信息（仅 IsCrossCloud=true 时返回，非跨云为 null）
注意：此字段可能返回 null，表示取不到有效值。
     * @param CrossCloudDetails 跨云场景下的额外信息（仅 IsCrossCloud=true 时返回，非跨云为 null）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCrossCloudDetails(CrossCloudDetails CrossCloudDetails) {
        this.CrossCloudDetails = CrossCloudDetails;
    }

    public SitePair() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SitePair(SitePair source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.SitePairId != null) {
            this.SitePairId = new String(source.SitePairId);
        }
        if (source.SitePairName != null) {
            this.SitePairName = new String(source.SitePairName);
        }
        if (source.SitePairType != null) {
            this.SitePairType = new String(source.SitePairType);
        }
        if (source.SitePairState != null) {
            this.SitePairState = new String(source.SitePairState);
        }
        if (source.SourceRegion != null) {
            this.SourceRegion = new String(source.SourceRegion);
        }
        if (source.SourceZone != null) {
            this.SourceZone = new String(source.SourceZone);
        }
        if (source.TargetRegion != null) {
            this.TargetRegion = new String(source.TargetRegion);
        }
        if (source.TargetZone != null) {
            this.TargetZone = new String(source.TargetZone);
        }
        if (source.SourceVpc != null) {
            this.SourceVpc = new String(source.SourceVpc);
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
        if (source.CreateFrom != null) {
            this.CreateFrom = new String(source.CreateFrom);
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
        if (source.BindProtectGroupCount != null) {
            this.BindProtectGroupCount = new Long(source.BindProtectGroupCount);
        }
        if (source.ErrorRecoveryPointObjectiveCopyPairSet != null) {
            this.ErrorRecoveryPointObjectiveCopyPairSet = new String[source.ErrorRecoveryPointObjectiveCopyPairSet.length];
            for (int i = 0; i < source.ErrorRecoveryPointObjectiveCopyPairSet.length; i++) {
                this.ErrorRecoveryPointObjectiveCopyPairSet[i] = new String(source.ErrorRecoveryPointObjectiveCopyPairSet[i]);
            }
        }
        if (source.ProtectedResourceSet != null) {
            this.ProtectedResourceSet = new ProtectedResource[source.ProtectedResourceSet.length];
            for (int i = 0; i < source.ProtectedResourceSet.length; i++) {
                this.ProtectedResourceSet[i] = new ProtectedResource(source.ProtectedResourceSet[i]);
            }
        }
        if (source.ProtectedResourceStatusSet != null) {
            this.ProtectedResourceStatusSet = new ProtectedResourceStatus[source.ProtectedResourceStatusSet.length];
            for (int i = 0; i < source.ProtectedResourceStatusSet.length; i++) {
                this.ProtectedResourceStatusSet[i] = new ProtectedResourceStatus(source.ProtectedResourceStatusSet[i]);
            }
        }
        if (source.CrossCloudDetails != null) {
            this.CrossCloudDetails = new CrossCloudDetails(source.CrossCloudDetails);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "SitePairId", this.SitePairId);
        this.setParamSimple(map, prefix + "SitePairName", this.SitePairName);
        this.setParamSimple(map, prefix + "SitePairType", this.SitePairType);
        this.setParamSimple(map, prefix + "SitePairState", this.SitePairState);
        this.setParamSimple(map, prefix + "SourceRegion", this.SourceRegion);
        this.setParamSimple(map, prefix + "SourceZone", this.SourceZone);
        this.setParamSimple(map, prefix + "TargetRegion", this.TargetRegion);
        this.setParamSimple(map, prefix + "TargetZone", this.TargetZone);
        this.setParamSimple(map, prefix + "SourceVpc", this.SourceVpc);
        this.setParamSimple(map, prefix + "TargetVpc", this.TargetVpc);
        this.setParamSimple(map, prefix + "CopyType", this.CopyType);
        this.setParamSimple(map, prefix + "DisasterRecoveryType", this.DisasterRecoveryType);
        this.setParamSimple(map, prefix + "CreateFrom", this.CreateFrom);
        this.setParamSimple(map, prefix + "AccountUin", this.AccountUin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "BindProtectGroupCount", this.BindProtectGroupCount);
        this.setParamArraySimple(map, prefix + "ErrorRecoveryPointObjectiveCopyPairSet.", this.ErrorRecoveryPointObjectiveCopyPairSet);
        this.setParamArrayObj(map, prefix + "ProtectedResourceSet.", this.ProtectedResourceSet);
        this.setParamArrayObj(map, prefix + "ProtectedResourceStatusSet.", this.ProtectedResourceStatusSet);
        this.setParamObj(map, prefix + "CrossCloudDetails.", this.CrossCloudDetails);

    }
}

