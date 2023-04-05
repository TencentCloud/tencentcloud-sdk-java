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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadBalancer extends AbstractModel{

    /**
    * 负载均衡LD的ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 负载均衡LD的名称
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * 负载均衡监听器的ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 负载均衡监听器的名称
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 负载均衡实例的IP
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 负载均衡实例的端口
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 负载均衡LD的地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 监听器协议，http、https
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 负载均衡监听器所在的zone
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 负载均衡的VPCID，公网为-1，内网按实际填写
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NumericalVpcId")
    @Expose
    private Long NumericalVpcId;

    /**
    * 负载均衡的网络类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
     * Get 负载均衡LD的ID 
     * @return LoadBalancerId 负载均衡LD的ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡LD的ID
     * @param LoadBalancerId 负载均衡LD的ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 负载均衡LD的名称 
     * @return LoadBalancerName 负载均衡LD的名称
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set 负载均衡LD的名称
     * @param LoadBalancerName 负载均衡LD的名称
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get 负载均衡监听器的ID 
     * @return ListenerId 负载均衡监听器的ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 负载均衡监听器的ID
     * @param ListenerId 负载均衡监听器的ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 负载均衡监听器的名称 
     * @return ListenerName 负载均衡监听器的名称
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set 负载均衡监听器的名称
     * @param ListenerName 负载均衡监听器的名称
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get 负载均衡实例的IP 
     * @return Vip 负载均衡实例的IP
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 负载均衡实例的IP
     * @param Vip 负载均衡实例的IP
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 负载均衡实例的端口 
     * @return Vport 负载均衡实例的端口
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 负载均衡实例的端口
     * @param Vport 负载均衡实例的端口
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get 负载均衡LD的地域 
     * @return Region 负载均衡LD的地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 负载均衡LD的地域
     * @param Region 负载均衡LD的地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 监听器协议，http、https 
     * @return Protocol 监听器协议，http、https
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 监听器协议，http、https
     * @param Protocol 监听器协议，http、https
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 负载均衡监听器所在的zone 
     * @return Zone 负载均衡监听器所在的zone
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 负载均衡监听器所在的zone
     * @param Zone 负载均衡监听器所在的zone
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 负载均衡的VPCID，公网为-1，内网按实际填写
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NumericalVpcId 负载均衡的VPCID，公网为-1，内网按实际填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNumericalVpcId() {
        return this.NumericalVpcId;
    }

    /**
     * Set 负载均衡的VPCID，公网为-1，内网按实际填写
注意：此字段可能返回 null，表示取不到有效值。
     * @param NumericalVpcId 负载均衡的VPCID，公网为-1，内网按实际填写
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNumericalVpcId(Long NumericalVpcId) {
        this.NumericalVpcId = NumericalVpcId;
    }

    /**
     * Get 负载均衡的网络类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadBalancerType 负载均衡的网络类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set 负载均衡的网络类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadBalancerType 负载均衡的网络类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    public LoadBalancer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadBalancer(LoadBalancer source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.NumericalVpcId != null) {
            this.NumericalVpcId = new Long(source.NumericalVpcId);
        }
        if (source.LoadBalancerType != null) {
            this.LoadBalancerType = new String(source.LoadBalancerType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NumericalVpcId", this.NumericalVpcId);
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);

    }
}

