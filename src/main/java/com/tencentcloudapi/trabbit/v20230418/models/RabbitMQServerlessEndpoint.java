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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQServerlessEndpoint extends AbstractModel {

    /**
    * vpc id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * subnet id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 接入地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcEndpoint")
    @Expose
    private String VpcEndpoint;

    /**
    * 接入地址状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcDataStreamEndpointStatus")
    @Expose
    private String VpcDataStreamEndpointStatus;

    /**
    * 是否是公网
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicNetwork")
    @Expose
    private Boolean PublicNetwork;

    /**
    * 访问策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessStrategy")
    @Expose
    private String AccessStrategy;

    /**
    * 带宽
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
     * Get vpc id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId vpc id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId vpc id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get subnet id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId subnet id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set subnet id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId subnet id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 接入地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcEndpoint 接入地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcEndpoint() {
        return this.VpcEndpoint;
    }

    /**
     * Set 接入地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcEndpoint 接入地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcEndpoint(String VpcEndpoint) {
        this.VpcEndpoint = VpcEndpoint;
    }

    /**
     * Get 接入地址状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcDataStreamEndpointStatus 接入地址状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcDataStreamEndpointStatus() {
        return this.VpcDataStreamEndpointStatus;
    }

    /**
     * Set 接入地址状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcDataStreamEndpointStatus 接入地址状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcDataStreamEndpointStatus(String VpcDataStreamEndpointStatus) {
        this.VpcDataStreamEndpointStatus = VpcDataStreamEndpointStatus;
    }

    /**
     * Get 是否是公网
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicNetwork 是否是公网
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getPublicNetwork() {
        return this.PublicNetwork;
    }

    /**
     * Set 是否是公网
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicNetwork 是否是公网
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicNetwork(Boolean PublicNetwork) {
        this.PublicNetwork = PublicNetwork;
    }

    /**
     * Get 访问策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessStrategy 访问策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccessStrategy() {
        return this.AccessStrategy;
    }

    /**
     * Set 访问策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessStrategy 访问策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessStrategy(String AccessStrategy) {
        this.AccessStrategy = AccessStrategy;
    }

    /**
     * Get 带宽
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bandwidth 带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 带宽
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bandwidth 带宽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    public RabbitMQServerlessEndpoint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQServerlessEndpoint(RabbitMQServerlessEndpoint source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.VpcEndpoint != null) {
            this.VpcEndpoint = new String(source.VpcEndpoint);
        }
        if (source.VpcDataStreamEndpointStatus != null) {
            this.VpcDataStreamEndpointStatus = new String(source.VpcDataStreamEndpointStatus);
        }
        if (source.PublicNetwork != null) {
            this.PublicNetwork = new Boolean(source.PublicNetwork);
        }
        if (source.AccessStrategy != null) {
            this.AccessStrategy = new String(source.AccessStrategy);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcEndpoint", this.VpcEndpoint);
        this.setParamSimple(map, prefix + "VpcDataStreamEndpointStatus", this.VpcDataStreamEndpointStatus);
        this.setParamSimple(map, prefix + "PublicNetwork", this.PublicNetwork);
        this.setParamSimple(map, prefix + "AccessStrategy", this.AccessStrategy);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);

    }
}

