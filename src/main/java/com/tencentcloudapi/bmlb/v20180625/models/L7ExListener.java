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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class L7ExListener extends AbstractModel{

    /**
    * 绑定的监听器唯一ID。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 监听器名称。
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 七层监听器协议类型，可选值：http,https。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 监听器的监听端口。
    */
    @SerializedName("LoadBalancerPort")
    @Expose
    private Long LoadBalancerPort;

    /**
    * 当前带宽。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 带宽上限。
    */
    @SerializedName("MaxBandwidth")
    @Expose
    private Long MaxBandwidth;

    /**
    * 监听器类型。
    */
    @SerializedName("ListenerType")
    @Expose
    private String ListenerType;

    /**
    * 认证方式：0（不认证，用于http），1（单向认证，用于https），2（双向认证，用于https）。
    */
    @SerializedName("SslMode")
    @Expose
    private Long SslMode;

    /**
    * 服务端证书ID。
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 客户端证书ID。
    */
    @SerializedName("CertCaId")
    @Expose
    private String CertCaId;

    /**
    * 添加时间。
    */
    @SerializedName("AddTimestamp")
    @Expose
    private String AddTimestamp;

    /**
    * 负载均衡名ID。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 私有网络名称。
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 私有网络Cidr。
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private String VpcCidrBlock;

    /**
    * 负载均衡的VIP。
    */
    @SerializedName("LoadBalancerVips")
    @Expose
    private String [] LoadBalancerVips;

    /**
    * 负载均衡名称。
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * 负载均衡IPV6的VIP。
    */
    @SerializedName("LoadBalancerVipv6s")
    @Expose
    private String [] LoadBalancerVipv6s;

    /**
    * 支持的IP协议类型。ipv4或者是ipv6。
    */
    @SerializedName("IpProtocolType")
    @Expose
    private String IpProtocolType;

    /**
    * 是否绑定在入参指定的流量镜像中。
    */
    @SerializedName("BindTrafficMirror")
    @Expose
    private Boolean BindTrafficMirror;

    /**
     * Get 绑定的监听器唯一ID。 
     * @return ListenerId 绑定的监听器唯一ID。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 绑定的监听器唯一ID。
     * @param ListenerId 绑定的监听器唯一ID。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 监听器名称。 
     * @return ListenerName 监听器名称。
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set 监听器名称。
     * @param ListenerName 监听器名称。
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get 七层监听器协议类型，可选值：http,https。 
     * @return Protocol 七层监听器协议类型，可选值：http,https。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 七层监听器协议类型，可选值：http,https。
     * @param Protocol 七层监听器协议类型，可选值：http,https。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 监听器的监听端口。 
     * @return LoadBalancerPort 监听器的监听端口。
     */
    public Long getLoadBalancerPort() {
        return this.LoadBalancerPort;
    }

    /**
     * Set 监听器的监听端口。
     * @param LoadBalancerPort 监听器的监听端口。
     */
    public void setLoadBalancerPort(Long LoadBalancerPort) {
        this.LoadBalancerPort = LoadBalancerPort;
    }

    /**
     * Get 当前带宽。 
     * @return Bandwidth 当前带宽。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 当前带宽。
     * @param Bandwidth 当前带宽。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 带宽上限。 
     * @return MaxBandwidth 带宽上限。
     */
    public Long getMaxBandwidth() {
        return this.MaxBandwidth;
    }

    /**
     * Set 带宽上限。
     * @param MaxBandwidth 带宽上限。
     */
    public void setMaxBandwidth(Long MaxBandwidth) {
        this.MaxBandwidth = MaxBandwidth;
    }

    /**
     * Get 监听器类型。 
     * @return ListenerType 监听器类型。
     */
    public String getListenerType() {
        return this.ListenerType;
    }

    /**
     * Set 监听器类型。
     * @param ListenerType 监听器类型。
     */
    public void setListenerType(String ListenerType) {
        this.ListenerType = ListenerType;
    }

    /**
     * Get 认证方式：0（不认证，用于http），1（单向认证，用于https），2（双向认证，用于https）。 
     * @return SslMode 认证方式：0（不认证，用于http），1（单向认证，用于https），2（双向认证，用于https）。
     */
    public Long getSslMode() {
        return this.SslMode;
    }

    /**
     * Set 认证方式：0（不认证，用于http），1（单向认证，用于https），2（双向认证，用于https）。
     * @param SslMode 认证方式：0（不认证，用于http），1（单向认证，用于https），2（双向认证，用于https）。
     */
    public void setSslMode(Long SslMode) {
        this.SslMode = SslMode;
    }

    /**
     * Get 服务端证书ID。 
     * @return CertId 服务端证书ID。
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 服务端证书ID。
     * @param CertId 服务端证书ID。
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 客户端证书ID。 
     * @return CertCaId 客户端证书ID。
     */
    public String getCertCaId() {
        return this.CertCaId;
    }

    /**
     * Set 客户端证书ID。
     * @param CertCaId 客户端证书ID。
     */
    public void setCertCaId(String CertCaId) {
        this.CertCaId = CertCaId;
    }

    /**
     * Get 添加时间。 
     * @return AddTimestamp 添加时间。
     */
    public String getAddTimestamp() {
        return this.AddTimestamp;
    }

    /**
     * Set 添加时间。
     * @param AddTimestamp 添加时间。
     */
    public void setAddTimestamp(String AddTimestamp) {
        this.AddTimestamp = AddTimestamp;
    }

    /**
     * Get 负载均衡名ID。 
     * @return LoadBalancerId 负载均衡名ID。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡名ID。
     * @param LoadBalancerId 负载均衡名ID。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 私有网络名称。 
     * @return VpcName 私有网络名称。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set 私有网络名称。
     * @param VpcName 私有网络名称。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 私有网络Cidr。 
     * @return VpcCidrBlock 私有网络Cidr。
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * Set 私有网络Cidr。
     * @param VpcCidrBlock 私有网络Cidr。
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * Get 负载均衡的VIP。 
     * @return LoadBalancerVips 负载均衡的VIP。
     */
    public String [] getLoadBalancerVips() {
        return this.LoadBalancerVips;
    }

    /**
     * Set 负载均衡的VIP。
     * @param LoadBalancerVips 负载均衡的VIP。
     */
    public void setLoadBalancerVips(String [] LoadBalancerVips) {
        this.LoadBalancerVips = LoadBalancerVips;
    }

    /**
     * Get 负载均衡名称。 
     * @return LoadBalancerName 负载均衡名称。
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set 负载均衡名称。
     * @param LoadBalancerName 负载均衡名称。
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get 负载均衡IPV6的VIP。 
     * @return LoadBalancerVipv6s 负载均衡IPV6的VIP。
     */
    public String [] getLoadBalancerVipv6s() {
        return this.LoadBalancerVipv6s;
    }

    /**
     * Set 负载均衡IPV6的VIP。
     * @param LoadBalancerVipv6s 负载均衡IPV6的VIP。
     */
    public void setLoadBalancerVipv6s(String [] LoadBalancerVipv6s) {
        this.LoadBalancerVipv6s = LoadBalancerVipv6s;
    }

    /**
     * Get 支持的IP协议类型。ipv4或者是ipv6。 
     * @return IpProtocolType 支持的IP协议类型。ipv4或者是ipv6。
     */
    public String getIpProtocolType() {
        return this.IpProtocolType;
    }

    /**
     * Set 支持的IP协议类型。ipv4或者是ipv6。
     * @param IpProtocolType 支持的IP协议类型。ipv4或者是ipv6。
     */
    public void setIpProtocolType(String IpProtocolType) {
        this.IpProtocolType = IpProtocolType;
    }

    /**
     * Get 是否绑定在入参指定的流量镜像中。 
     * @return BindTrafficMirror 是否绑定在入参指定的流量镜像中。
     */
    public Boolean getBindTrafficMirror() {
        return this.BindTrafficMirror;
    }

    /**
     * Set 是否绑定在入参指定的流量镜像中。
     * @param BindTrafficMirror 是否绑定在入参指定的流量镜像中。
     */
    public void setBindTrafficMirror(Boolean BindTrafficMirror) {
        this.BindTrafficMirror = BindTrafficMirror;
    }

    public L7ExListener() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L7ExListener(L7ExListener source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.LoadBalancerPort != null) {
            this.LoadBalancerPort = new Long(source.LoadBalancerPort);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.MaxBandwidth != null) {
            this.MaxBandwidth = new Long(source.MaxBandwidth);
        }
        if (source.ListenerType != null) {
            this.ListenerType = new String(source.ListenerType);
        }
        if (source.SslMode != null) {
            this.SslMode = new Long(source.SslMode);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.CertCaId != null) {
            this.CertCaId = new String(source.CertCaId);
        }
        if (source.AddTimestamp != null) {
            this.AddTimestamp = new String(source.AddTimestamp);
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.VpcCidrBlock != null) {
            this.VpcCidrBlock = new String(source.VpcCidrBlock);
        }
        if (source.LoadBalancerVips != null) {
            this.LoadBalancerVips = new String[source.LoadBalancerVips.length];
            for (int i = 0; i < source.LoadBalancerVips.length; i++) {
                this.LoadBalancerVips[i] = new String(source.LoadBalancerVips[i]);
            }
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.LoadBalancerVipv6s != null) {
            this.LoadBalancerVipv6s = new String[source.LoadBalancerVipv6s.length];
            for (int i = 0; i < source.LoadBalancerVipv6s.length; i++) {
                this.LoadBalancerVipv6s[i] = new String(source.LoadBalancerVipv6s[i]);
            }
        }
        if (source.IpProtocolType != null) {
            this.IpProtocolType = new String(source.IpProtocolType);
        }
        if (source.BindTrafficMirror != null) {
            this.BindTrafficMirror = new Boolean(source.BindTrafficMirror);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "LoadBalancerPort", this.LoadBalancerPort);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "MaxBandwidth", this.MaxBandwidth);
        this.setParamSimple(map, prefix + "ListenerType", this.ListenerType);
        this.setParamSimple(map, prefix + "SslMode", this.SslMode);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "CertCaId", this.CertCaId);
        this.setParamSimple(map, prefix + "AddTimestamp", this.AddTimestamp);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "VpcCidrBlock", this.VpcCidrBlock);
        this.setParamArraySimple(map, prefix + "LoadBalancerVips.", this.LoadBalancerVips);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamArraySimple(map, prefix + "LoadBalancerVipv6s.", this.LoadBalancerVipv6s);
        this.setParamSimple(map, prefix + "IpProtocolType", this.IpProtocolType);
        this.setParamSimple(map, prefix + "BindTrafficMirror", this.BindTrafficMirror);

    }
}

