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

public class TrafficMirrorListener  extends AbstractModel{

    /**
    * 监听器ID。
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
    private Integer LoadBalancerPort;

    /**
    * 当前带宽。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Integer Bandwidth;

    /**
    * 带宽上限。
    */
    @SerializedName("MaxBandwidth")
    @Expose
    private Integer MaxBandwidth;

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
    private Integer SslMode;

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
    * 负载均衡ID。
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
    * 负载均衡的IPV6的VIP。
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
     * 获取监听器ID。
     * @return ListenerId 监听器ID。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * 设置监听器ID。
     * @param ListenerId 监听器ID。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * 获取监听器名称。
     * @return ListenerName 监听器名称。
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * 设置监听器名称。
     * @param ListenerName 监听器名称。
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * 获取七层监听器协议类型，可选值：http,https。
     * @return Protocol 七层监听器协议类型，可选值：http,https。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * 设置七层监听器协议类型，可选值：http,https。
     * @param Protocol 七层监听器协议类型，可选值：http,https。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * 获取监听器的监听端口。
     * @return LoadBalancerPort 监听器的监听端口。
     */
    public Integer getLoadBalancerPort() {
        return this.LoadBalancerPort;
    }

    /**
     * 设置监听器的监听端口。
     * @param LoadBalancerPort 监听器的监听端口。
     */
    public void setLoadBalancerPort(Integer LoadBalancerPort) {
        this.LoadBalancerPort = LoadBalancerPort;
    }

    /**
     * 获取当前带宽。
     * @return Bandwidth 当前带宽。
     */
    public Integer getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * 设置当前带宽。
     * @param Bandwidth 当前带宽。
     */
    public void setBandwidth(Integer Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * 获取带宽上限。
     * @return MaxBandwidth 带宽上限。
     */
    public Integer getMaxBandwidth() {
        return this.MaxBandwidth;
    }

    /**
     * 设置带宽上限。
     * @param MaxBandwidth 带宽上限。
     */
    public void setMaxBandwidth(Integer MaxBandwidth) {
        this.MaxBandwidth = MaxBandwidth;
    }

    /**
     * 获取监听器类型。
     * @return ListenerType 监听器类型。
     */
    public String getListenerType() {
        return this.ListenerType;
    }

    /**
     * 设置监听器类型。
     * @param ListenerType 监听器类型。
     */
    public void setListenerType(String ListenerType) {
        this.ListenerType = ListenerType;
    }

    /**
     * 获取认证方式：0（不认证，用于http），1（单向认证，用于https），2（双向认证，用于https）。
     * @return SslMode 认证方式：0（不认证，用于http），1（单向认证，用于https），2（双向认证，用于https）。
     */
    public Integer getSslMode() {
        return this.SslMode;
    }

    /**
     * 设置认证方式：0（不认证，用于http），1（单向认证，用于https），2（双向认证，用于https）。
     * @param SslMode 认证方式：0（不认证，用于http），1（单向认证，用于https），2（双向认证，用于https）。
     */
    public void setSslMode(Integer SslMode) {
        this.SslMode = SslMode;
    }

    /**
     * 获取服务端证书ID。
     * @return CertId 服务端证书ID。
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * 设置服务端证书ID。
     * @param CertId 服务端证书ID。
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * 获取客户端证书ID。
     * @return CertCaId 客户端证书ID。
     */
    public String getCertCaId() {
        return this.CertCaId;
    }

    /**
     * 设置客户端证书ID。
     * @param CertCaId 客户端证书ID。
     */
    public void setCertCaId(String CertCaId) {
        this.CertCaId = CertCaId;
    }

    /**
     * 获取添加时间。
     * @return AddTimestamp 添加时间。
     */
    public String getAddTimestamp() {
        return this.AddTimestamp;
    }

    /**
     * 设置添加时间。
     * @param AddTimestamp 添加时间。
     */
    public void setAddTimestamp(String AddTimestamp) {
        this.AddTimestamp = AddTimestamp;
    }

    /**
     * 获取负载均衡ID。
     * @return LoadBalancerId 负载均衡ID。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * 设置负载均衡ID。
     * @param LoadBalancerId 负载均衡ID。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * 获取私有网络名称。
     * @return VpcName 私有网络名称。
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * 设置私有网络名称。
     * @param VpcName 私有网络名称。
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * 获取私有网络Cidr。
     * @return VpcCidrBlock 私有网络Cidr。
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * 设置私有网络Cidr。
     * @param VpcCidrBlock 私有网络Cidr。
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * 获取负载均衡的VIP。
     * @return LoadBalancerVips 负载均衡的VIP。
     */
    public String [] getLoadBalancerVips() {
        return this.LoadBalancerVips;
    }

    /**
     * 设置负载均衡的VIP。
     * @param LoadBalancerVips 负载均衡的VIP。
     */
    public void setLoadBalancerVips(String [] LoadBalancerVips) {
        this.LoadBalancerVips = LoadBalancerVips;
    }

    /**
     * 获取负载均衡名称。
     * @return LoadBalancerName 负载均衡名称。
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * 设置负载均衡名称。
     * @param LoadBalancerName 负载均衡名称。
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * 获取负载均衡的IPV6的VIP。
     * @return LoadBalancerVipv6s 负载均衡的IPV6的VIP。
     */
    public String [] getLoadBalancerVipv6s() {
        return this.LoadBalancerVipv6s;
    }

    /**
     * 设置负载均衡的IPV6的VIP。
     * @param LoadBalancerVipv6s 负载均衡的IPV6的VIP。
     */
    public void setLoadBalancerVipv6s(String [] LoadBalancerVipv6s) {
        this.LoadBalancerVipv6s = LoadBalancerVipv6s;
    }

    /**
     * 获取支持的IP协议类型。ipv4或者是ipv6。
     * @return IpProtocolType 支持的IP协议类型。ipv4或者是ipv6。
     */
    public String getIpProtocolType() {
        return this.IpProtocolType;
    }

    /**
     * 设置支持的IP协议类型。ipv4或者是ipv6。
     * @param IpProtocolType 支持的IP协议类型。ipv4或者是ipv6。
     */
    public void setIpProtocolType(String IpProtocolType) {
        this.IpProtocolType = IpProtocolType;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

