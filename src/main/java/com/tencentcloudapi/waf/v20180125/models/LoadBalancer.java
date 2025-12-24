/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadBalancer extends AbstractModel {

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
    * 负载均衡实例的IP。域名化CLB VIP可填空。
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 负载均衡的VPCID，公网为-1，内网按实际填写
    */
    @SerializedName("NumericalVpcId")
    @Expose
    private Long NumericalVpcId;

    /**
    * 负载均衡的网络类型。OPEN： 公网 INTERNAL ：内网
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * 负载均衡的域名
    */
    @SerializedName("LoadBalancerDomain")
    @Expose
    private String LoadBalancerDomain;

    /**
    * 监听器所属成员id
    */
    @SerializedName("MemberAppId")
    @Expose
    private Long MemberAppId;

    /**
    * 监听器所属成员的uin
    */
    @SerializedName("MemberUin")
    @Expose
    private String MemberUin;

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
     * Get 负载均衡实例的IP。域名化CLB VIP可填空。 
     * @return Vip 负载均衡实例的IP。域名化CLB VIP可填空。
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 负载均衡实例的IP。域名化CLB VIP可填空。
     * @param Vip 负载均衡实例的IP。域名化CLB VIP可填空。
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 负载均衡的VPCID，公网为-1，内网按实际填写 
     * @return NumericalVpcId 负载均衡的VPCID，公网为-1，内网按实际填写
     */
    public Long getNumericalVpcId() {
        return this.NumericalVpcId;
    }

    /**
     * Set 负载均衡的VPCID，公网为-1，内网按实际填写
     * @param NumericalVpcId 负载均衡的VPCID，公网为-1，内网按实际填写
     */
    public void setNumericalVpcId(Long NumericalVpcId) {
        this.NumericalVpcId = NumericalVpcId;
    }

    /**
     * Get 负载均衡的网络类型。OPEN： 公网 INTERNAL ：内网 
     * @return LoadBalancerType 负载均衡的网络类型。OPEN： 公网 INTERNAL ：内网
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set 负载均衡的网络类型。OPEN： 公网 INTERNAL ：内网
     * @param LoadBalancerType 负载均衡的网络类型。OPEN： 公网 INTERNAL ：内网
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get 负载均衡的域名 
     * @return LoadBalancerDomain 负载均衡的域名
     */
    public String getLoadBalancerDomain() {
        return this.LoadBalancerDomain;
    }

    /**
     * Set 负载均衡的域名
     * @param LoadBalancerDomain 负载均衡的域名
     */
    public void setLoadBalancerDomain(String LoadBalancerDomain) {
        this.LoadBalancerDomain = LoadBalancerDomain;
    }

    /**
     * Get 监听器所属成员id 
     * @return MemberAppId 监听器所属成员id
     */
    public Long getMemberAppId() {
        return this.MemberAppId;
    }

    /**
     * Set 监听器所属成员id
     * @param MemberAppId 监听器所属成员id
     */
    public void setMemberAppId(Long MemberAppId) {
        this.MemberAppId = MemberAppId;
    }

    /**
     * Get 监听器所属成员的uin 
     * @return MemberUin 监听器所属成员的uin
     */
    public String getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set 监听器所属成员的uin
     * @param MemberUin 监听器所属成员的uin
     */
    public void setMemberUin(String MemberUin) {
        this.MemberUin = MemberUin;
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
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.NumericalVpcId != null) {
            this.NumericalVpcId = new Long(source.NumericalVpcId);
        }
        if (source.LoadBalancerType != null) {
            this.LoadBalancerType = new String(source.LoadBalancerType);
        }
        if (source.LoadBalancerDomain != null) {
            this.LoadBalancerDomain = new String(source.LoadBalancerDomain);
        }
        if (source.MemberAppId != null) {
            this.MemberAppId = new Long(source.MemberAppId);
        }
        if (source.MemberUin != null) {
            this.MemberUin = new String(source.MemberUin);
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
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "NumericalVpcId", this.NumericalVpcId);
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamSimple(map, prefix + "LoadBalancerDomain", this.LoadBalancerDomain);
        this.setParamSimple(map, prefix + "MemberAppId", this.MemberAppId);
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);

    }
}

