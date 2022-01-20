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

public class LoadBalancerDetail extends AbstractModel{

    /**
    * 负载均衡实例 ID。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 负载均衡实例的名称。
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * 负载均衡实例的网络类型：
Public：公网属性， Private：内网属性。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * 负载均衡实例的状态，包括
0：创建中，1：正常运行。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 负载均衡实例的 VIP 。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 负载均衡实例 VIP 的IPv6地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddressIPv6")
    @Expose
    private String AddressIPv6;

    /**
    * 负载均衡实例IP版本，IPv4 | IPv6。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddressIPVersion")
    @Expose
    private String AddressIPVersion;

    /**
    * 负载均衡实例IPv6地址类型，IPv6Nat64 | IPv6FullChain。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IPv6Mode")
    @Expose
    private String IPv6Mode;

    /**
    * 负载均衡实例所在可用区。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 负载均衡实例IP地址所属的ISP。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddressIsp")
    @Expose
    private String AddressIsp;

    /**
    * 负载均衡实例所属私有网络的 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 负载均衡实例所属的项目 ID， 0 表示默认项目。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 负载均衡实例的创建时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 负载均衡实例的计费类型。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 负载均衡实例的网络属性。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkAttributes")
    @Expose
    private InternetAccessible NetworkAttributes;

    /**
    * 负载均衡实例的预付费相关属性。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrepaidAttributes")
    @Expose
    private LBChargePrepaid PrepaidAttributes;

    /**
    * 暂做保留，一般用户无需关注。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraInfo")
    @Expose
    private ExtraInfo ExtraInfo;

    /**
    * 负载均衡维度的个性化配置ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigId")
    @Expose
    private String ConfigId;

    /**
    * 负载均衡实例的标签信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * 负载均衡监听器 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 监听器协议。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 监听器端口。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 转发规则的 ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * 转发规则的域名。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 转发规则的路径。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 后端目标ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetId")
    @Expose
    private String TargetId;

    /**
    * 后端目标的IP地址。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetAddress")
    @Expose
    private String TargetAddress;

    /**
    * 后端目标监听端口。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetPort")
    @Expose
    private Long TargetPort;

    /**
    * 后端目标转发权重。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetWeight")
    @Expose
    private Long TargetWeight;

    /**
    * 0：表示未被隔离，1：表示被隔离。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Isolation")
    @Expose
    private Long Isolation;

    /**
    * 负载均衡绑定的安全组列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String [] SecurityGroup;

    /**
    * 负载均衡安全组上移特性是否开启标识。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadBalancerPassToTarget")
    @Expose
    private Long LoadBalancerPassToTarget;

    /**
    * 后端目标健康状态。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetHealth")
    @Expose
    private String TargetHealth;

    /**
    * 转发规则的域名列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domains")
    @Expose
    private String Domains;

    /**
     * Get 负载均衡实例 ID。 
     * @return LoadBalancerId 负载均衡实例 ID。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例 ID。
     * @param LoadBalancerId 负载均衡实例 ID。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 负载均衡实例的名称。 
     * @return LoadBalancerName 负载均衡实例的名称。
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set 负载均衡实例的名称。
     * @param LoadBalancerName 负载均衡实例的名称。
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get 负载均衡实例的网络类型：
Public：公网属性， Private：内网属性。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadBalancerType 负载均衡实例的网络类型：
Public：公网属性， Private：内网属性。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * Set 负载均衡实例的网络类型：
Public：公网属性， Private：内网属性。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadBalancerType 负载均衡实例的网络类型：
Public：公网属性， Private：内网属性。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * Get 负载均衡实例的状态，包括
0：创建中，1：正常运行。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 负载均衡实例的状态，包括
0：创建中，1：正常运行。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 负载均衡实例的状态，包括
0：创建中，1：正常运行。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 负载均衡实例的状态，包括
0：创建中，1：正常运行。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 负载均衡实例的 VIP 。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Address 负载均衡实例的 VIP 。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 负载均衡实例的 VIP 。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Address 负载均衡实例的 VIP 。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 负载均衡实例 VIP 的IPv6地址。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddressIPv6 负载均衡实例 VIP 的IPv6地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddressIPv6() {
        return this.AddressIPv6;
    }

    /**
     * Set 负载均衡实例 VIP 的IPv6地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddressIPv6 负载均衡实例 VIP 的IPv6地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddressIPv6(String AddressIPv6) {
        this.AddressIPv6 = AddressIPv6;
    }

    /**
     * Get 负载均衡实例IP版本，IPv4 | IPv6。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddressIPVersion 负载均衡实例IP版本，IPv4 | IPv6。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddressIPVersion() {
        return this.AddressIPVersion;
    }

    /**
     * Set 负载均衡实例IP版本，IPv4 | IPv6。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddressIPVersion 负载均衡实例IP版本，IPv4 | IPv6。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddressIPVersion(String AddressIPVersion) {
        this.AddressIPVersion = AddressIPVersion;
    }

    /**
     * Get 负载均衡实例IPv6地址类型，IPv6Nat64 | IPv6FullChain。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IPv6Mode 负载均衡实例IPv6地址类型，IPv6Nat64 | IPv6FullChain。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIPv6Mode() {
        return this.IPv6Mode;
    }

    /**
     * Set 负载均衡实例IPv6地址类型，IPv6Nat64 | IPv6FullChain。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IPv6Mode 负载均衡实例IPv6地址类型，IPv6Nat64 | IPv6FullChain。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIPv6Mode(String IPv6Mode) {
        this.IPv6Mode = IPv6Mode;
    }

    /**
     * Get 负载均衡实例所在可用区。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone 负载均衡实例所在可用区。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 负载均衡实例所在可用区。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone 负载均衡实例所在可用区。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 负载均衡实例IP地址所属的ISP。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddressIsp 负载均衡实例IP地址所属的ISP。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddressIsp() {
        return this.AddressIsp;
    }

    /**
     * Set 负载均衡实例IP地址所属的ISP。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddressIsp 负载均衡实例IP地址所属的ISP。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddressIsp(String AddressIsp) {
        this.AddressIsp = AddressIsp;
    }

    /**
     * Get 负载均衡实例所属私有网络的 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 负载均衡实例所属私有网络的 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 负载均衡实例所属私有网络的 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 负载均衡实例所属私有网络的 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 负载均衡实例所属的项目 ID， 0 表示默认项目。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 负载均衡实例所属的项目 ID， 0 表示默认项目。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 负载均衡实例所属的项目 ID， 0 表示默认项目。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 负载均衡实例所属的项目 ID， 0 表示默认项目。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 负载均衡实例的创建时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 负载均衡实例的创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 负载均衡实例的创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 负载均衡实例的创建时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 负载均衡实例的计费类型。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChargeType 负载均衡实例的计费类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 负载均衡实例的计费类型。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChargeType 负载均衡实例的计费类型。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 负载均衡实例的网络属性。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkAttributes 负载均衡实例的网络属性。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InternetAccessible getNetworkAttributes() {
        return this.NetworkAttributes;
    }

    /**
     * Set 负载均衡实例的网络属性。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkAttributes 负载均衡实例的网络属性。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkAttributes(InternetAccessible NetworkAttributes) {
        this.NetworkAttributes = NetworkAttributes;
    }

    /**
     * Get 负载均衡实例的预付费相关属性。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrepaidAttributes 负载均衡实例的预付费相关属性。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LBChargePrepaid getPrepaidAttributes() {
        return this.PrepaidAttributes;
    }

    /**
     * Set 负载均衡实例的预付费相关属性。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrepaidAttributes 负载均衡实例的预付费相关属性。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrepaidAttributes(LBChargePrepaid PrepaidAttributes) {
        this.PrepaidAttributes = PrepaidAttributes;
    }

    /**
     * Get 暂做保留，一般用户无需关注。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraInfo 暂做保留，一般用户无需关注。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExtraInfo getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set 暂做保留，一般用户无需关注。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraInfo 暂做保留，一般用户无需关注。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraInfo(ExtraInfo ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get 负载均衡维度的个性化配置ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigId 负载均衡维度的个性化配置ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigId() {
        return this.ConfigId;
    }

    /**
     * Set 负载均衡维度的个性化配置ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigId 负载均衡维度的个性化配置ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigId(String ConfigId) {
        this.ConfigId = ConfigId;
    }

    /**
     * Get 负载均衡实例的标签信息。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 负载均衡实例的标签信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 负载均衡实例的标签信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 负载均衡实例的标签信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 负载均衡监听器 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ListenerId 负载均衡监听器 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 负载均衡监听器 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ListenerId 负载均衡监听器 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 监听器协议。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol 监听器协议。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 监听器协议。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol 监听器协议。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 监听器端口。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 监听器端口。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 监听器端口。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 监听器端口。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 转发规则的 ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LocationId 转发规则的 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * Set 转发规则的 ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LocationId 转发规则的 ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * Get 转发规则的域名。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 转发规则的域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 转发规则的域名。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 转发规则的域名。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 转发规则的路径。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Url 转发规则的路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 转发规则的路径。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Url 转发规则的路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 后端目标ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetId 后端目标ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetId() {
        return this.TargetId;
    }

    /**
     * Set 后端目标ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetId 后端目标ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get 后端目标的IP地址。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetAddress 后端目标的IP地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetAddress() {
        return this.TargetAddress;
    }

    /**
     * Set 后端目标的IP地址。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetAddress 后端目标的IP地址。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetAddress(String TargetAddress) {
        this.TargetAddress = TargetAddress;
    }

    /**
     * Get 后端目标监听端口。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetPort 后端目标监听端口。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTargetPort() {
        return this.TargetPort;
    }

    /**
     * Set 后端目标监听端口。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetPort 后端目标监听端口。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetPort(Long TargetPort) {
        this.TargetPort = TargetPort;
    }

    /**
     * Get 后端目标转发权重。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetWeight 后端目标转发权重。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTargetWeight() {
        return this.TargetWeight;
    }

    /**
     * Set 后端目标转发权重。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetWeight 后端目标转发权重。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetWeight(Long TargetWeight) {
        this.TargetWeight = TargetWeight;
    }

    /**
     * Get 0：表示未被隔离，1：表示被隔离。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Isolation 0：表示未被隔离，1：表示被隔离。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsolation() {
        return this.Isolation;
    }

    /**
     * Set 0：表示未被隔离，1：表示被隔离。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Isolation 0：表示未被隔离，1：表示被隔离。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolation(Long Isolation) {
        this.Isolation = Isolation;
    }

    /**
     * Get 负载均衡绑定的安全组列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityGroup 负载均衡绑定的安全组列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set 负载均衡绑定的安全组列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityGroup 负载均衡绑定的安全组列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityGroup(String [] SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get 负载均衡安全组上移特性是否开启标识。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadBalancerPassToTarget 负载均衡安全组上移特性是否开启标识。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLoadBalancerPassToTarget() {
        return this.LoadBalancerPassToTarget;
    }

    /**
     * Set 负载均衡安全组上移特性是否开启标识。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadBalancerPassToTarget 负载均衡安全组上移特性是否开启标识。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadBalancerPassToTarget(Long LoadBalancerPassToTarget) {
        this.LoadBalancerPassToTarget = LoadBalancerPassToTarget;
    }

    /**
     * Get 后端目标健康状态。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetHealth 后端目标健康状态。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetHealth() {
        return this.TargetHealth;
    }

    /**
     * Set 后端目标健康状态。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetHealth 后端目标健康状态。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetHealth(String TargetHealth) {
        this.TargetHealth = TargetHealth;
    }

    /**
     * Get 转发规则的域名列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domains 转发规则的域名列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomains() {
        return this.Domains;
    }

    /**
     * Set 转发规则的域名列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domains 转发规则的域名列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomains(String Domains) {
        this.Domains = Domains;
    }

    public LoadBalancerDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadBalancerDetail(LoadBalancerDetail source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.LoadBalancerType != null) {
            this.LoadBalancerType = new String(source.LoadBalancerType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.AddressIPv6 != null) {
            this.AddressIPv6 = new String(source.AddressIPv6);
        }
        if (source.AddressIPVersion != null) {
            this.AddressIPVersion = new String(source.AddressIPVersion);
        }
        if (source.IPv6Mode != null) {
            this.IPv6Mode = new String(source.IPv6Mode);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.AddressIsp != null) {
            this.AddressIsp = new String(source.AddressIsp);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.NetworkAttributes != null) {
            this.NetworkAttributes = new InternetAccessible(source.NetworkAttributes);
        }
        if (source.PrepaidAttributes != null) {
            this.PrepaidAttributes = new LBChargePrepaid(source.PrepaidAttributes);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new ExtraInfo(source.ExtraInfo);
        }
        if (source.ConfigId != null) {
            this.ConfigId = new String(source.ConfigId);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.LocationId != null) {
            this.LocationId = new String(source.LocationId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.TargetId != null) {
            this.TargetId = new String(source.TargetId);
        }
        if (source.TargetAddress != null) {
            this.TargetAddress = new String(source.TargetAddress);
        }
        if (source.TargetPort != null) {
            this.TargetPort = new Long(source.TargetPort);
        }
        if (source.TargetWeight != null) {
            this.TargetWeight = new Long(source.TargetWeight);
        }
        if (source.Isolation != null) {
            this.Isolation = new Long(source.Isolation);
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String[source.SecurityGroup.length];
            for (int i = 0; i < source.SecurityGroup.length; i++) {
                this.SecurityGroup[i] = new String(source.SecurityGroup[i]);
            }
        }
        if (source.LoadBalancerPassToTarget != null) {
            this.LoadBalancerPassToTarget = new Long(source.LoadBalancerPassToTarget);
        }
        if (source.TargetHealth != null) {
            this.TargetHealth = new String(source.TargetHealth);
        }
        if (source.Domains != null) {
            this.Domains = new String(source.Domains);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "AddressIPv6", this.AddressIPv6);
        this.setParamSimple(map, prefix + "AddressIPVersion", this.AddressIPVersion);
        this.setParamSimple(map, prefix + "IPv6Mode", this.IPv6Mode);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "AddressIsp", this.AddressIsp);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamObj(map, prefix + "NetworkAttributes.", this.NetworkAttributes);
        this.setParamObj(map, prefix + "PrepaidAttributes.", this.PrepaidAttributes);
        this.setParamObj(map, prefix + "ExtraInfo.", this.ExtraInfo);
        this.setParamSimple(map, prefix + "ConfigId", this.ConfigId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);
        this.setParamSimple(map, prefix + "TargetAddress", this.TargetAddress);
        this.setParamSimple(map, prefix + "TargetPort", this.TargetPort);
        this.setParamSimple(map, prefix + "TargetWeight", this.TargetWeight);
        this.setParamSimple(map, prefix + "Isolation", this.Isolation);
        this.setParamArraySimple(map, prefix + "SecurityGroup.", this.SecurityGroup);
        this.setParamSimple(map, prefix + "LoadBalancerPassToTarget", this.LoadBalancerPassToTarget);
        this.setParamSimple(map, prefix + "TargetHealth", this.TargetHealth);
        this.setParamSimple(map, prefix + "Domains", this.Domains);

    }
}

