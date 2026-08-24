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

public class DrillPair extends AbstractModel {

    /**
    * 用户ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 演练对ID
    */
    @SerializedName("DrillPairId")
    @Expose
    private String DrillPairId;

    /**
    * 演练对名称
    */
    @SerializedName("DrillPairName")
    @Expose
    private String DrillPairName;

    /**
    * 演练对状态。枚举值：RUNNING / SUCCESS / FAILED 等。
    */
    @SerializedName("DrillPairState")
    @Expose
    private String DrillPairState;

    /**
    * 容灾站点对ID
    */
    @SerializedName("SitePairId")
    @Expose
    private String SitePairId;

    /**
    * 云硬盘复制对ID
    */
    @SerializedName("CopyPairId")
    @Expose
    private String CopyPairId;

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
    * 生产站点盘ID
    */
    @SerializedName("SourceResourceId")
    @Expose
    private String SourceResourceId;

    /**
    * 演练资源ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetResourceId")
    @Expose
    private String TargetResourceId;

    /**
    * 演练对的类型。枚举值：DISK / INSTANCE / CFS。
    */
    @SerializedName("DrillPairType")
    @Expose
    private String DrillPairType;

    /**
    * 演练资源容量（GB）。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 演练的容灾点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecoveryTime")
    @Expose
    private String RecoveryTime;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 演练结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 是否正在回滚。0 - 未回滚，1 - 回滚中。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rollbacking")
    @Expose
    private Long Rollbacking;

    /**
    * 回滚进度百分比（0-100）。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RollbackPercent")
    @Expose
    private Long RollbackPercent;

    /**
    * 创建定期备份策略的账户uin ID信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccountUin")
    @Expose
    private String AccountUin;

    /**
    * 创建定期备份策略的子账户uin ID信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

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
    * 复制对名称。
    */
    @SerializedName("CopyPairName")
    @Expose
    private String CopyPairName;

    /**
    * 演练组名称。
    */
    @SerializedName("DrillGroupName")
    @Expose
    private String DrillGroupName;

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
     * Get 演练对ID 
     * @return DrillPairId 演练对ID
     */
    public String getDrillPairId() {
        return this.DrillPairId;
    }

    /**
     * Set 演练对ID
     * @param DrillPairId 演练对ID
     */
    public void setDrillPairId(String DrillPairId) {
        this.DrillPairId = DrillPairId;
    }

    /**
     * Get 演练对名称 
     * @return DrillPairName 演练对名称
     */
    public String getDrillPairName() {
        return this.DrillPairName;
    }

    /**
     * Set 演练对名称
     * @param DrillPairName 演练对名称
     */
    public void setDrillPairName(String DrillPairName) {
        this.DrillPairName = DrillPairName;
    }

    /**
     * Get 演练对状态。枚举值：RUNNING / SUCCESS / FAILED 等。 
     * @return DrillPairState 演练对状态。枚举值：RUNNING / SUCCESS / FAILED 等。
     */
    public String getDrillPairState() {
        return this.DrillPairState;
    }

    /**
     * Set 演练对状态。枚举值：RUNNING / SUCCESS / FAILED 等。
     * @param DrillPairState 演练对状态。枚举值：RUNNING / SUCCESS / FAILED 等。
     */
    public void setDrillPairState(String DrillPairState) {
        this.DrillPairState = DrillPairState;
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
     * Get 云硬盘复制对ID 
     * @return CopyPairId 云硬盘复制对ID
     */
    public String getCopyPairId() {
        return this.CopyPairId;
    }

    /**
     * Set 云硬盘复制对ID
     * @param CopyPairId 云硬盘复制对ID
     */
    public void setCopyPairId(String CopyPairId) {
        this.CopyPairId = CopyPairId;
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
     * Get 生产站点盘ID 
     * @return SourceResourceId 生产站点盘ID
     */
    public String getSourceResourceId() {
        return this.SourceResourceId;
    }

    /**
     * Set 生产站点盘ID
     * @param SourceResourceId 生产站点盘ID
     */
    public void setSourceResourceId(String SourceResourceId) {
        this.SourceResourceId = SourceResourceId;
    }

    /**
     * Get 演练资源ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetResourceId 演练资源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetResourceId() {
        return this.TargetResourceId;
    }

    /**
     * Set 演练资源ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetResourceId 演练资源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetResourceId(String TargetResourceId) {
        this.TargetResourceId = TargetResourceId;
    }

    /**
     * Get 演练对的类型。枚举值：DISK / INSTANCE / CFS。 
     * @return DrillPairType 演练对的类型。枚举值：DISK / INSTANCE / CFS。
     */
    public String getDrillPairType() {
        return this.DrillPairType;
    }

    /**
     * Set 演练对的类型。枚举值：DISK / INSTANCE / CFS。
     * @param DrillPairType 演练对的类型。枚举值：DISK / INSTANCE / CFS。
     */
    public void setDrillPairType(String DrillPairType) {
        this.DrillPairType = DrillPairType;
    }

    /**
     * Get 演练资源容量（GB）。 
     * @return Size 演练资源容量（GB）。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 演练资源容量（GB）。
     * @param Size 演练资源容量（GB）。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 演练的容灾点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecoveryTime 演练的容灾点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecoveryTime() {
        return this.RecoveryTime;
    }

    /**
     * Set 演练的容灾点
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecoveryTime 演练的容灾点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecoveryTime(String RecoveryTime) {
        this.RecoveryTime = RecoveryTime;
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
     * Get 演练结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 演练结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 演练结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 演练结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 是否正在回滚。0 - 未回滚，1 - 回滚中。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rollbacking 是否正在回滚。0 - 未回滚，1 - 回滚中。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRollbacking() {
        return this.Rollbacking;
    }

    /**
     * Set 是否正在回滚。0 - 未回滚，1 - 回滚中。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rollbacking 是否正在回滚。0 - 未回滚，1 - 回滚中。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRollbacking(Long Rollbacking) {
        this.Rollbacking = Rollbacking;
    }

    /**
     * Get 回滚进度百分比（0-100）。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RollbackPercent 回滚进度百分比（0-100）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRollbackPercent() {
        return this.RollbackPercent;
    }

    /**
     * Set 回滚进度百分比（0-100）。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RollbackPercent 回滚进度百分比（0-100）。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRollbackPercent(Long RollbackPercent) {
        this.RollbackPercent = RollbackPercent;
    }

    /**
     * Get 创建定期备份策略的账户uin ID信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccountUin 创建定期备份策略的账户uin ID信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccountUin() {
        return this.AccountUin;
    }

    /**
     * Set 创建定期备份策略的账户uin ID信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccountUin 创建定期备份策略的账户uin ID信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccountUin(String AccountUin) {
        this.AccountUin = AccountUin;
    }

    /**
     * Get 创建定期备份策略的子账户uin ID信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubAccountUin 创建定期备份策略的子账户uin ID信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set 创建定期备份策略的子账户uin ID信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubAccountUin 创建定期备份策略的子账户uin ID信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
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
     * Get 复制对名称。 
     * @return CopyPairName 复制对名称。
     */
    public String getCopyPairName() {
        return this.CopyPairName;
    }

    /**
     * Set 复制对名称。
     * @param CopyPairName 复制对名称。
     */
    public void setCopyPairName(String CopyPairName) {
        this.CopyPairName = CopyPairName;
    }

    /**
     * Get 演练组名称。 
     * @return DrillGroupName 演练组名称。
     */
    public String getDrillGroupName() {
        return this.DrillGroupName;
    }

    /**
     * Set 演练组名称。
     * @param DrillGroupName 演练组名称。
     */
    public void setDrillGroupName(String DrillGroupName) {
        this.DrillGroupName = DrillGroupName;
    }

    public DrillPair() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DrillPair(DrillPair source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.DrillPairId != null) {
            this.DrillPairId = new String(source.DrillPairId);
        }
        if (source.DrillPairName != null) {
            this.DrillPairName = new String(source.DrillPairName);
        }
        if (source.DrillPairState != null) {
            this.DrillPairState = new String(source.DrillPairState);
        }
        if (source.SitePairId != null) {
            this.SitePairId = new String(source.SitePairId);
        }
        if (source.CopyPairId != null) {
            this.CopyPairId = new String(source.CopyPairId);
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
        if (source.SourceResourceId != null) {
            this.SourceResourceId = new String(source.SourceResourceId);
        }
        if (source.TargetResourceId != null) {
            this.TargetResourceId = new String(source.TargetResourceId);
        }
        if (source.DrillPairType != null) {
            this.DrillPairType = new String(source.DrillPairType);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.RecoveryTime != null) {
            this.RecoveryTime = new String(source.RecoveryTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Rollbacking != null) {
            this.Rollbacking = new Long(source.Rollbacking);
        }
        if (source.RollbackPercent != null) {
            this.RollbackPercent = new Long(source.RollbackPercent);
        }
        if (source.AccountUin != null) {
            this.AccountUin = new String(source.AccountUin);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.ProtectGroupId != null) {
            this.ProtectGroupId = new String(source.ProtectGroupId);
        }
        if (source.DrillGroupId != null) {
            this.DrillGroupId = new String(source.DrillGroupId);
        }
        if (source.CopyPairName != null) {
            this.CopyPairName = new String(source.CopyPairName);
        }
        if (source.DrillGroupName != null) {
            this.DrillGroupName = new String(source.DrillGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "DrillPairId", this.DrillPairId);
        this.setParamSimple(map, prefix + "DrillPairName", this.DrillPairName);
        this.setParamSimple(map, prefix + "DrillPairState", this.DrillPairState);
        this.setParamSimple(map, prefix + "SitePairId", this.SitePairId);
        this.setParamSimple(map, prefix + "CopyPairId", this.CopyPairId);
        this.setParamSimple(map, prefix + "SourceRegion", this.SourceRegion);
        this.setParamSimple(map, prefix + "SourceZone", this.SourceZone);
        this.setParamSimple(map, prefix + "TargetRegion", this.TargetRegion);
        this.setParamSimple(map, prefix + "TargetZone", this.TargetZone);
        this.setParamSimple(map, prefix + "SourceResourceId", this.SourceResourceId);
        this.setParamSimple(map, prefix + "TargetResourceId", this.TargetResourceId);
        this.setParamSimple(map, prefix + "DrillPairType", this.DrillPairType);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "RecoveryTime", this.RecoveryTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Rollbacking", this.Rollbacking);
        this.setParamSimple(map, prefix + "RollbackPercent", this.RollbackPercent);
        this.setParamSimple(map, prefix + "AccountUin", this.AccountUin);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "ProtectGroupId", this.ProtectGroupId);
        this.setParamSimple(map, prefix + "DrillGroupId", this.DrillGroupId);
        this.setParamSimple(map, prefix + "CopyPairName", this.CopyPairName);
        this.setParamSimple(map, prefix + "DrillGroupName", this.DrillGroupName);

    }
}

