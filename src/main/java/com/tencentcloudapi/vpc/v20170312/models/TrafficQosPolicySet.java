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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficQosPolicySet extends AbstractModel {

    /**
    * CCN实例ID。形如：ccn-f49l6u0z。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CcnId")
    @Expose
    private String CcnId;

    /**
    * qos id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QosId")
    @Expose
    private Long QosId;

    /**
    * 描述。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QosPolicyDescription")
    @Expose
    private String QosPolicyDescription;

    /**
    * 名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QosPolicyName")
    @Expose
    private String QosPolicyName;

    /**
    * 带宽。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 流量调度策略ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QosPolicyId")
    @Expose
    private String QosPolicyId;

    /**
     * Get CCN实例ID。形如：ccn-f49l6u0z。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CcnId CCN实例ID。形如：ccn-f49l6u0z。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCcnId() {
        return this.CcnId;
    }

    /**
     * Set CCN实例ID。形如：ccn-f49l6u0z。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CcnId CCN实例ID。形如：ccn-f49l6u0z。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCcnId(String CcnId) {
        this.CcnId = CcnId;
    }

    /**
     * Get qos id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QosId qos id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQosId() {
        return this.QosId;
    }

    /**
     * Set qos id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param QosId qos id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQosId(Long QosId) {
        this.QosId = QosId;
    }

    /**
     * Get 描述。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QosPolicyDescription 描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQosPolicyDescription() {
        return this.QosPolicyDescription;
    }

    /**
     * Set 描述。
注意：此字段可能返回 null，表示取不到有效值。
     * @param QosPolicyDescription 描述。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQosPolicyDescription(String QosPolicyDescription) {
        this.QosPolicyDescription = QosPolicyDescription;
    }

    /**
     * Get 名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QosPolicyName 名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQosPolicyName() {
        return this.QosPolicyName;
    }

    /**
     * Set 名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param QosPolicyName 名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQosPolicyName(String QosPolicyName) {
        this.QosPolicyName = QosPolicyName;
    }

    /**
     * Get 带宽。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bandwidth 带宽。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 带宽。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bandwidth 带宽。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 流量调度策略ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QosPolicyId 流量调度策略ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQosPolicyId() {
        return this.QosPolicyId;
    }

    /**
     * Set 流量调度策略ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param QosPolicyId 流量调度策略ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQosPolicyId(String QosPolicyId) {
        this.QosPolicyId = QosPolicyId;
    }

    public TrafficQosPolicySet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficQosPolicySet(TrafficQosPolicySet source) {
        if (source.CcnId != null) {
            this.CcnId = new String(source.CcnId);
        }
        if (source.QosId != null) {
            this.QosId = new Long(source.QosId);
        }
        if (source.QosPolicyDescription != null) {
            this.QosPolicyDescription = new String(source.QosPolicyDescription);
        }
        if (source.QosPolicyName != null) {
            this.QosPolicyName = new String(source.QosPolicyName);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.QosPolicyId != null) {
            this.QosPolicyId = new String(source.QosPolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnId", this.CcnId);
        this.setParamSimple(map, prefix + "QosId", this.QosId);
        this.setParamSimple(map, prefix + "QosPolicyDescription", this.QosPolicyDescription);
        this.setParamSimple(map, prefix + "QosPolicyName", this.QosPolicyName);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "QosPolicyId", this.QosPolicyId);

    }
}

