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

public class CcnBandwidthInfo extends AbstractModel{

    /**
    * 带宽所属的云联网ID。
注意：此字段可能返回 null，表示取不到有效值。
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
    private CcnRegionBandwidthLimit CcnRegionBandwidthLimit;

    /**
     * Get 带宽所属的云联网ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CcnId 带宽所属的云联网ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set 带宽所属的云联网ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CcnId 带宽所属的云联网ID。
注意：此字段可能返回 null，表示取不到有效值。
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
    public CcnRegionBandwidthLimit getCcnRegionBandwidthLimit() {
        return this.CcnRegionBandwidthLimit;
    }

    /**
     * Set 描述带宽的地域和限速上限信息。在地域间限速的情况下才会返回参数，出口限速模式不返回。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CcnRegionBandwidthLimit 描述带宽的地域和限速上限信息。在地域间限速的情况下才会返回参数，出口限速模式不返回。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCcnRegionBandwidthLimit(CcnRegionBandwidthLimit CcnRegionBandwidthLimit) {
        this.CcnRegionBandwidthLimit = CcnRegionBandwidthLimit;
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

    }
}

