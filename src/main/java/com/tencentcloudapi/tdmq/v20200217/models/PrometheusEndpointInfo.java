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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrometheusEndpointInfo extends AbstractModel{

    /**
    * Prometheus开关的状态。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrometheusEndpointStatus")
    @Expose
    private String PrometheusEndpointStatus;

    /**
    * prometheus信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcPrometheusEndpoint")
    @Expose
    private String [] VpcPrometheusEndpoint;

    /**
    * 节点信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodePrometheusAddress")
    @Expose
    private String [] NodePrometheusAddress;

    /**
    * vpc信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcEndpointInfo")
    @Expose
    private VpcEndpointInfo VpcEndpointInfo;

    /**
     * Get Prometheus开关的状态。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrometheusEndpointStatus Prometheus开关的状态。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrometheusEndpointStatus() {
        return this.PrometheusEndpointStatus;
    }

    /**
     * Set Prometheus开关的状态。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrometheusEndpointStatus Prometheus开关的状态。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrometheusEndpointStatus(String PrometheusEndpointStatus) {
        this.PrometheusEndpointStatus = PrometheusEndpointStatus;
    }

    /**
     * Get prometheus信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcPrometheusEndpoint prometheus信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getVpcPrometheusEndpoint() {
        return this.VpcPrometheusEndpoint;
    }

    /**
     * Set prometheus信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcPrometheusEndpoint prometheus信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcPrometheusEndpoint(String [] VpcPrometheusEndpoint) {
        this.VpcPrometheusEndpoint = VpcPrometheusEndpoint;
    }

    /**
     * Get 节点信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodePrometheusAddress 节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNodePrometheusAddress() {
        return this.NodePrometheusAddress;
    }

    /**
     * Set 节点信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodePrometheusAddress 节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodePrometheusAddress(String [] NodePrometheusAddress) {
        this.NodePrometheusAddress = NodePrometheusAddress;
    }

    /**
     * Get vpc信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcEndpointInfo vpc信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VpcEndpointInfo getVpcEndpointInfo() {
        return this.VpcEndpointInfo;
    }

    /**
     * Set vpc信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcEndpointInfo vpc信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcEndpointInfo(VpcEndpointInfo VpcEndpointInfo) {
        this.VpcEndpointInfo = VpcEndpointInfo;
    }

    public PrometheusEndpointInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrometheusEndpointInfo(PrometheusEndpointInfo source) {
        if (source.PrometheusEndpointStatus != null) {
            this.PrometheusEndpointStatus = new String(source.PrometheusEndpointStatus);
        }
        if (source.VpcPrometheusEndpoint != null) {
            this.VpcPrometheusEndpoint = new String[source.VpcPrometheusEndpoint.length];
            for (int i = 0; i < source.VpcPrometheusEndpoint.length; i++) {
                this.VpcPrometheusEndpoint[i] = new String(source.VpcPrometheusEndpoint[i]);
            }
        }
        if (source.NodePrometheusAddress != null) {
            this.NodePrometheusAddress = new String[source.NodePrometheusAddress.length];
            for (int i = 0; i < source.NodePrometheusAddress.length; i++) {
                this.NodePrometheusAddress[i] = new String(source.NodePrometheusAddress[i]);
            }
        }
        if (source.VpcEndpointInfo != null) {
            this.VpcEndpointInfo = new VpcEndpointInfo(source.VpcEndpointInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrometheusEndpointStatus", this.PrometheusEndpointStatus);
        this.setParamArraySimple(map, prefix + "VpcPrometheusEndpoint.", this.VpcPrometheusEndpoint);
        this.setParamArraySimple(map, prefix + "NodePrometheusAddress.", this.NodePrometheusAddress);
        this.setParamObj(map, prefix + "VpcEndpointInfo.", this.VpcEndpointInfo);

    }
}

