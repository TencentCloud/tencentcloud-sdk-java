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

public class PulsarNetworkAccessPointInfo extends AbstractModel{

    /**
    * vpc的id，支撑网和公网接入点，该字段为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网id，支撑网和公网接入点，该字段为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 接入地址
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 接入点类型：
0：支撑网接入点 
1：VPC接入点 
2：公网接入点
    */
    @SerializedName("RouteType")
    @Expose
    private Long RouteType;

    /**
     * Get vpc的id，支撑网和公网接入点，该字段为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId vpc的id，支撑网和公网接入点，该字段为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc的id，支撑网和公网接入点，该字段为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId vpc的id，支撑网和公网接入点，该字段为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网id，支撑网和公网接入点，该字段为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网id，支撑网和公网接入点，该字段为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网id，支撑网和公网接入点，该字段为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网id，支撑网和公网接入点，该字段为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 接入地址 
     * @return Endpoint 接入地址
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set 接入地址
     * @param Endpoint 接入地址
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 接入点类型：
0：支撑网接入点 
1：VPC接入点 
2：公网接入点 
     * @return RouteType 接入点类型：
0：支撑网接入点 
1：VPC接入点 
2：公网接入点
     */
    public Long getRouteType() {
        return this.RouteType;
    }

    /**
     * Set 接入点类型：
0：支撑网接入点 
1：VPC接入点 
2：公网接入点
     * @param RouteType 接入点类型：
0：支撑网接入点 
1：VPC接入点 
2：公网接入点
     */
    public void setRouteType(Long RouteType) {
        this.RouteType = RouteType;
    }

    public PulsarNetworkAccessPointInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PulsarNetworkAccessPointInfo(PulsarNetworkAccessPointInfo source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RouteType != null) {
            this.RouteType = new Long(source.RouteType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RouteType", this.RouteType);

    }
}

