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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CcnBandwidth extends AbstractModel{

    /**
    * 带宽所属的云联网ID。
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * 实例的创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 实例的过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * 带宽实例的唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegionFlowControlId")
    @Expose
    private String RegionFlowControlId;

    /**
    * 带宽是否自动续费的标记。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * 描述带宽的地域和限速上限信息。在地域间限速的情况下才会返回参数，出口限速模式不返回。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CcnRegionBandwidthLimit")
    @Expose
    private CcnRegionBandwidthLimitInfo CcnRegionBandwidthLimit;

    /**
    * 云市场实例ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MarketId")
    @Expose
    private String MarketId;

    /**
    * 实例所属用户主账号ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserAccountID")
    @Expose
    private String UserAccountID;

    /**
    * 是否跨境，`true`表示跨境，反之不跨境。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsCrossBorder")
    @Expose
    private Boolean IsCrossBorder;

    /**
    * `true`表示封禁，地域间流量不通，`false`解禁，地域间流量正常
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSecurityLock")
    @Expose
    private Boolean IsSecurityLock;

    /**
    * `POSTPAID`表示后付费，`PREPAID`表示预付费。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 实例更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 带宽所属的云联网ID。 
     * @return CcnId 带宽所属的云联网ID。
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 带宽所属的云联网ID。
     * @param CcnId 带宽所属的云联网ID。
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get 实例的创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedTime 实例的创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 实例的创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedTime 实例的创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 实例的过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpiredTime 实例的过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 实例的过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpiredTime 实例的过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get 带宽实例的唯一ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegionFlowControlId 带宽实例的唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegionFlowControlId() {
        return this.RegionFlowControlId;
    }

    /**
     * Set 带宽实例的唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegionFlowControlId 带宽实例的唯一ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegionFlowControlId(String RegionFlowControlId) {
        this.RegionFlowControlId = RegionFlowControlId;
    }

    /**
     * Get 带宽是否自动续费的标记。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewFlag 带宽是否自动续费的标记。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 带宽是否自动续费的标记。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewFlag 带宽是否自动续费的标记。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 描述带宽的地域和限速上限信息。在地域间限速的情况下才会返回参数，出口限速模式不返回。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CcnRegionBandwidthLimit 描述带宽的地域和限速上限信息。在地域间限速的情况下才会返回参数，出口限速模式不返回。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CcnRegionBandwidthLimitInfo getCcnRegionBandwidthLimit() {
        return this.CcnRegionBandwidthLimit;
    }

    /**
     * Set 描述带宽的地域和限速上限信息。在地域间限速的情况下才会返回参数，出口限速模式不返回。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CcnRegionBandwidthLimit 描述带宽的地域和限速上限信息。在地域间限速的情况下才会返回参数，出口限速模式不返回。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCcnRegionBandwidthLimit(CcnRegionBandwidthLimitInfo CcnRegionBandwidthLimit) {
        this.CcnRegionBandwidthLimit = CcnRegionBandwidthLimit;
    }

    /**
     * Get 云市场实例ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MarketId 云市场实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMarketId() {
        return this.MarketId;
    }

    /**
     * Set 云市场实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MarketId 云市场实例ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMarketId(String MarketId) {
        this.MarketId = MarketId;
    }

    /**
     * Get 实例所属用户主账号ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserAccountID 实例所属用户主账号ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserAccountID() {
        return this.UserAccountID;
    }

    /**
     * Set 实例所属用户主账号ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserAccountID 实例所属用户主账号ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserAccountID(String UserAccountID) {
        this.UserAccountID = UserAccountID;
    }

    /**
     * Get 是否跨境，`true`表示跨境，反之不跨境。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsCrossBorder 是否跨境，`true`表示跨境，反之不跨境。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsCrossBorder() {
        return this.IsCrossBorder;
    }

    /**
     * Set 是否跨境，`true`表示跨境，反之不跨境。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsCrossBorder 是否跨境，`true`表示跨境，反之不跨境。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsCrossBorder(Boolean IsCrossBorder) {
        this.IsCrossBorder = IsCrossBorder;
    }

    /**
     * Get `true`表示封禁，地域间流量不通，`false`解禁，地域间流量正常
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSecurityLock `true`表示封禁，地域间流量不通，`false`解禁，地域间流量正常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsSecurityLock() {
        return this.IsSecurityLock;
    }

    /**
     * Set `true`表示封禁，地域间流量不通，`false`解禁，地域间流量正常
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSecurityLock `true`表示封禁，地域间流量不通，`false`解禁，地域间流量正常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSecurityLock(Boolean IsSecurityLock) {
        this.IsSecurityLock = IsSecurityLock;
    }

    /**
     * Get `POSTPAID`表示后付费，`PREPAID`表示预付费。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceChargeType `POSTPAID`表示后付费，`PREPAID`表示预付费。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set `POSTPAID`表示后付费，`PREPAID`表示预付费。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceChargeType `POSTPAID`表示后付费，`PREPAID`表示预付费。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get 实例更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 实例更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 实例更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 实例更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public CcnBandwidth() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CcnBandwidth(CcnBandwidth source) {
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.RegionFlowControlId != null) {
            this.RegionFlowControlId = new String(source.RegionFlowControlId);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.CcnRegionBandwidthLimit != null) {
            this.CcnRegionBandwidthLimit = new CcnRegionBandwidthLimitInfo(source.CcnRegionBandwidthLimit);
        }
        if (source.MarketId != null) {
            this.MarketId = new String(source.MarketId);
        }
        if (source.UserAccountID != null) {
            this.UserAccountID = new String(source.UserAccountID);
        }
        if (source.IsCrossBorder != null) {
            this.IsCrossBorder = new Boolean(source.IsCrossBorder);
        }
        if (source.IsSecurityLock != null) {
            this.IsSecurityLock = new Boolean(source.IsSecurityLock);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "RegionFlowControlId", this.RegionFlowControlId);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamObj(map, prefix + "CcnRegionBandwidthLimit.", this.CcnRegionBandwidthLimit);
        this.setParamSimple(map, prefix + "MarketId", this.MarketId);
        this.setParamSimple(map, prefix + "UserAccountID", this.UserAccountID);
        this.setParamSimple(map, prefix + "IsCrossBorder", this.IsCrossBorder);
        this.setParamSimple(map, prefix + "IsSecurityLock", this.IsSecurityLock);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

