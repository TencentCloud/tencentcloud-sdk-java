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

public class AssociationItem extends AbstractModel{

    /**
    * 关联到的负载均衡ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 关联到的监听器ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 关联到的转发规则ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * 关联到的监听器协议类型，如HTTP,TCP,
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 关联到的监听器端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 关联到的转发规则域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 关联到的转发规则URL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 负载均衡名称
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * 监听器名称
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
     * Get 关联到的负载均衡ID 
     * @return LoadBalancerId 关联到的负载均衡ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 关联到的负载均衡ID
     * @param LoadBalancerId 关联到的负载均衡ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 关联到的监听器ID 
     * @return ListenerId 关联到的监听器ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 关联到的监听器ID
     * @param ListenerId 关联到的监听器ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 关联到的转发规则ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocationId 关联到的转发规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set 关联到的转发规则ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocationId 关联到的转发规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get 关联到的监听器协议类型，如HTTP,TCP, 
     * @return Protocol 关联到的监听器协议类型，如HTTP,TCP,
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 关联到的监听器协议类型，如HTTP,TCP,
     * @param Protocol 关联到的监听器协议类型，如HTTP,TCP,
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 关联到的监听器端口 
     * @return Port 关联到的监听器端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 关联到的监听器端口
     * @param Port 关联到的监听器端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 关联到的转发规则域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 关联到的转发规则域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 关联到的转发规则域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 关联到的转发规则域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 关联到的转发规则URL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url 关联到的转发规则URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 关联到的转发规则URL
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 关联到的转发规则URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 负载均衡名称 
     * @return LoadBalancerName 负载均衡名称
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set 负载均衡名称
     * @param LoadBalancerName 负载均衡名称
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get 监听器名称 
     * @return ListenerName 监听器名称
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set 监听器名称
     * @param ListenerName 监听器名称
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);

    }
}

