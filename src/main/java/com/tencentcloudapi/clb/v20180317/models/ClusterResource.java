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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterResource extends AbstractModel{

    /**
    * 集群唯一ID，如tgw-12345678。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * ip地址。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 负载均衡唯一ID，如lb-12345678。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 资源是否闲置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Idle")
    @Expose
    private String Idle;

    /**
    * 集群名称。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
     * Get 集群唯一ID，如tgw-12345678。 
     * @return ClusterId 集群唯一ID，如tgw-12345678。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群唯一ID，如tgw-12345678。
     * @param ClusterId 集群唯一ID，如tgw-12345678。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get ip地址。 
     * @return Vip ip地址。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set ip地址。
     * @param Vip ip地址。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 负载均衡唯一ID，如lb-12345678。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadBalancerId 负载均衡唯一ID，如lb-12345678。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡唯一ID，如lb-12345678。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadBalancerId 负载均衡唯一ID，如lb-12345678。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 资源是否闲置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Idle 资源是否闲置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdle() {
        return this.Idle;
    }

    /**
     * Set 资源是否闲置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Idle 资源是否闲置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdle(String Idle) {
        this.Idle = Idle;
    }

    /**
     * Get 集群名称。 
     * @return ClusterName 集群名称。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称。
     * @param ClusterName 集群名称。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "Idle", this.Idle);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);

    }
}

