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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Endpoint extends AbstractModel {

    /**
    * 接入点类型，枚举值如下
VPC: VPC;
PUBLIC: 公网;
INTERNAL: 支撑网;
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 状态，
OPEN 开启，
CLOSE 关闭，
PROCESSING 操作中，
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 付费类型，仅公网
PREPAID 包年包月
POSTPAID 按量付费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 接入点地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndpointUrl")
    @Expose
    private String EndpointUrl;

    /**
    * VPC ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 公网带宽，Mbps为单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 公网放通规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpRules")
    @Expose
    private IpRule [] IpRules;

    /**
    * 公网是否按流量计费
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillingFlow")
    @Expose
    private Boolean BillingFlow;

    /**
     * Get 接入点类型，枚举值如下
VPC: VPC;
PUBLIC: 公网;
INTERNAL: 支撑网; 
     * @return Type 接入点类型，枚举值如下
VPC: VPC;
PUBLIC: 公网;
INTERNAL: 支撑网;
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 接入点类型，枚举值如下
VPC: VPC;
PUBLIC: 公网;
INTERNAL: 支撑网;
     * @param Type 接入点类型，枚举值如下
VPC: VPC;
PUBLIC: 公网;
INTERNAL: 支撑网;
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 状态，
OPEN 开启，
CLOSE 关闭，
PROCESSING 操作中， 
     * @return Status 状态，
OPEN 开启，
CLOSE 关闭，
PROCESSING 操作中，
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态，
OPEN 开启，
CLOSE 关闭，
PROCESSING 操作中，
     * @param Status 状态，
OPEN 开启，
CLOSE 关闭，
PROCESSING 操作中，
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 付费类型，仅公网
PREPAID 包年包月
POSTPAID 按量付费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayMode 付费类型，仅公网
PREPAID 包年包月
POSTPAID 按量付费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费类型，仅公网
PREPAID 包年包月
POSTPAID 按量付费
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayMode 付费类型，仅公网
PREPAID 包年包月
POSTPAID 按量付费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 接入点地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndpointUrl 接入点地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndpointUrl() {
        return this.EndpointUrl;
    }

    /**
     * Set 接入点地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndpointUrl 接入点地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndpointUrl(String EndpointUrl) {
        this.EndpointUrl = EndpointUrl;
    }

    /**
     * Get VPC ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId VPC ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId VPC ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 公网带宽，Mbps为单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bandwidth 公网带宽，Mbps为单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 公网带宽，Mbps为单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bandwidth 公网带宽，Mbps为单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 公网放通规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpRules 公网放通规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IpRule [] getIpRules() {
        return this.IpRules;
    }

    /**
     * Set 公网放通规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpRules 公网放通规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpRules(IpRule [] IpRules) {
        this.IpRules = IpRules;
    }

    /**
     * Get 公网是否按流量计费
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillingFlow 公网是否按流量计费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getBillingFlow() {
        return this.BillingFlow;
    }

    /**
     * Set 公网是否按流量计费
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillingFlow 公网是否按流量计费
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillingFlow(Boolean BillingFlow) {
        this.BillingFlow = BillingFlow;
    }

    public Endpoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Endpoint(Endpoint source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.EndpointUrl != null) {
            this.EndpointUrl = new String(source.EndpointUrl);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.IpRules != null) {
            this.IpRules = new IpRule[source.IpRules.length];
            for (int i = 0; i < source.IpRules.length; i++) {
                this.IpRules[i] = new IpRule(source.IpRules[i]);
            }
        }
        if (source.BillingFlow != null) {
            this.BillingFlow = new Boolean(source.BillingFlow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "EndpointUrl", this.EndpointUrl);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamArrayObj(map, prefix + "IpRules.", this.IpRules);
        this.setParamSimple(map, prefix + "BillingFlow", this.BillingFlow);

    }
}

