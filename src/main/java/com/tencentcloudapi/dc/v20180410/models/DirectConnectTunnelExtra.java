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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DirectConnectTunnelExtra extends AbstractModel{

    /**
    * 专用通道ID
    */
    @SerializedName("DirectConnectTunnelId")
    @Expose
    private String DirectConnectTunnelId;

    /**
    * 物理专线ID
    */
    @SerializedName("DirectConnectId")
    @Expose
    private String DirectConnectId;

    /**
    * 专用通道状态
AVAILABLE:就绪或者已连接
PENDING:申请中
ALLOCATING:配置中
ALLOCATED:配置完成
ALTERING:修改中
DELETING:删除中
DELETED:删除完成
COMFIRMING:待接受
REJECTED:拒绝
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 物理专线的拥有者，开发商账号 ID
    */
    @SerializedName("DirectConnectOwnerAccount")
    @Expose
    private String DirectConnectOwnerAccount;

    /**
    * 专用通道的拥有者，开发商账号 ID
    */
    @SerializedName("OwnerAccount")
    @Expose
    private String OwnerAccount;

    /**
    * 网络类型，分别为VPC、BMVPC、CCN
 VPC：私有网络 ，BMVPC：黑石网络，CCN：云联网
    */
    @SerializedName("NetworkType")
    @Expose
    private String NetworkType;

    /**
    * VPC地域对应的网络名，如ap-guangzhou
    */
    @SerializedName("NetworkRegion")
    @Expose
    private String NetworkRegion;

    /**
    * 私有网络统一 ID 或者黑石网络统一 ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 专线网关 ID
    */
    @SerializedName("DirectConnectGatewayId")
    @Expose
    private String DirectConnectGatewayId;

    /**
    * BGP ：BGP路由 STATIC：静态 默认为 BGP 路由
    */
    @SerializedName("RouteType")
    @Expose
    private String RouteType;

    /**
    * 用户侧BGP，Asn，AuthKey
    */
    @SerializedName("BgpPeer")
    @Expose
    private BgpPeer BgpPeer;

    /**
    * 用户侧网段地址
    */
    @SerializedName("RouteFilterPrefixes")
    @Expose
    private RouteFilterPrefix [] RouteFilterPrefixes;

    /**
    * 互联网通道公网网段地址
    */
    @SerializedName("PublicAddresses")
    @Expose
    private RouteFilterPrefix [] PublicAddresses;

    /**
    * 专用通道的Vlan
    */
    @SerializedName("Vlan")
    @Expose
    private Long Vlan;

    /**
    * 腾讯侧互联 IP
    */
    @SerializedName("TencentAddress")
    @Expose
    private String TencentAddress;

    /**
    * 腾讯侧备用互联IP
    */
    @SerializedName("TencentBackupAddress")
    @Expose
    private String TencentBackupAddress;

    /**
    * 用户侧互联 IP
    */
    @SerializedName("CustomerAddress")
    @Expose
    private String CustomerAddress;

    /**
    * 专用通道名称
    */
    @SerializedName("DirectConnectTunnelName")
    @Expose
    private String DirectConnectTunnelName;

    /**
    * 专用通道创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 专用通道带宽值
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 关联的网络自定义探测ID
    */
    @SerializedName("NetDetectId")
    @Expose
    private String NetDetectId;

    /**
    * BGP community开关
    */
    @SerializedName("EnableBGPCommunity")
    @Expose
    private Boolean EnableBGPCommunity;

    /**
    * 是否为Nat通道
    */
    @SerializedName("NatType")
    @Expose
    private Long NatType;

    /**
    * VPC地域简码，如gz、cd
    */
    @SerializedName("VpcRegion")
    @Expose
    private String VpcRegion;

    /**
    * 是否开启BFD
    */
    @SerializedName("BfdEnable")
    @Expose
    private Long BfdEnable;

    /**
    * 是否开启NQA
    */
    @SerializedName("NqaEnable")
    @Expose
    private Long NqaEnable;

    /**
    * 专用通道接入点类型
    */
    @SerializedName("AccessPointType")
    @Expose
    private String AccessPointType;

    /**
    * 专线网关名称
    */
    @SerializedName("DirectConnectGatewayName")
    @Expose
    private String DirectConnectGatewayName;

    /**
    * VPC名称
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 专用通道关联的物理专线是否签署了用户协议
    */
    @SerializedName("SignLaw")
    @Expose
    private Boolean SignLaw;

    /**
    * BFD配置信息
    */
    @SerializedName("BfdInfo")
    @Expose
    private BFDInfo BfdInfo;

    /**
    * NQA配置信息
    */
    @SerializedName("NqaInfo")
    @Expose
    private NQAInfo NqaInfo;

    /**
    * BGP状态
    */
    @SerializedName("BgpStatus")
    @Expose
    private BGPStatus BgpStatus;

    /**
    * 是否开启IPv6
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IPv6Enable")
    @Expose
    private Long IPv6Enable;

    /**
    * 腾讯侧互联IPv6地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TencentIPv6Address")
    @Expose
    private String TencentIPv6Address;

    /**
    * 腾讯侧备用互联IPv6地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TencentBackupIPv6Address")
    @Expose
    private String TencentBackupIPv6Address;

    /**
    * BGPv6状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BgpIPv6Status")
    @Expose
    private BGPStatus BgpIPv6Status;

    /**
    * 用户侧互联IPv6地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomerIPv6Address")
    @Expose
    private String CustomerIPv6Address;

    /**
    * 专用通道是否支持巨帧。1 支持，0 不支持
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JumboEnable")
    @Expose
    private Long JumboEnable;

    /**
     * Get 专用通道ID 
     * @return DirectConnectTunnelId 专用通道ID
     */
    public String getDirectConnectTunnelId() {
        return this.DirectConnectTunnelId;
    }

    /**
     * Set 专用通道ID
     * @param DirectConnectTunnelId 专用通道ID
     */
    public void setDirectConnectTunnelId(String DirectConnectTunnelId) {
        this.DirectConnectTunnelId = DirectConnectTunnelId;
    }

    /**
     * Get 物理专线ID 
     * @return DirectConnectId 物理专线ID
     */
    public String getDirectConnectId() {
        return this.DirectConnectId;
    }

    /**
     * Set 物理专线ID
     * @param DirectConnectId 物理专线ID
     */
    public void setDirectConnectId(String DirectConnectId) {
        this.DirectConnectId = DirectConnectId;
    }

    /**
     * Get 专用通道状态
AVAILABLE:就绪或者已连接
PENDING:申请中
ALLOCATING:配置中
ALLOCATED:配置完成
ALTERING:修改中
DELETING:删除中
DELETED:删除完成
COMFIRMING:待接受
REJECTED:拒绝 
     * @return State 专用通道状态
AVAILABLE:就绪或者已连接
PENDING:申请中
ALLOCATING:配置中
ALLOCATED:配置完成
ALTERING:修改中
DELETING:删除中
DELETED:删除完成
COMFIRMING:待接受
REJECTED:拒绝
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 专用通道状态
AVAILABLE:就绪或者已连接
PENDING:申请中
ALLOCATING:配置中
ALLOCATED:配置完成
ALTERING:修改中
DELETING:删除中
DELETED:删除完成
COMFIRMING:待接受
REJECTED:拒绝
     * @param State 专用通道状态
AVAILABLE:就绪或者已连接
PENDING:申请中
ALLOCATING:配置中
ALLOCATED:配置完成
ALTERING:修改中
DELETING:删除中
DELETED:删除完成
COMFIRMING:待接受
REJECTED:拒绝
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 物理专线的拥有者，开发商账号 ID 
     * @return DirectConnectOwnerAccount 物理专线的拥有者，开发商账号 ID
     */
    public String getDirectConnectOwnerAccount() {
        return this.DirectConnectOwnerAccount;
    }

    /**
     * Set 物理专线的拥有者，开发商账号 ID
     * @param DirectConnectOwnerAccount 物理专线的拥有者，开发商账号 ID
     */
    public void setDirectConnectOwnerAccount(String DirectConnectOwnerAccount) {
        this.DirectConnectOwnerAccount = DirectConnectOwnerAccount;
    }

    /**
     * Get 专用通道的拥有者，开发商账号 ID 
     * @return OwnerAccount 专用通道的拥有者，开发商账号 ID
     */
    public String getOwnerAccount() {
        return this.OwnerAccount;
    }

    /**
     * Set 专用通道的拥有者，开发商账号 ID
     * @param OwnerAccount 专用通道的拥有者，开发商账号 ID
     */
    public void setOwnerAccount(String OwnerAccount) {
        this.OwnerAccount = OwnerAccount;
    }

    /**
     * Get 网络类型，分别为VPC、BMVPC、CCN
 VPC：私有网络 ，BMVPC：黑石网络，CCN：云联网 
     * @return NetworkType 网络类型，分别为VPC、BMVPC、CCN
 VPC：私有网络 ，BMVPC：黑石网络，CCN：云联网
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * Set 网络类型，分别为VPC、BMVPC、CCN
 VPC：私有网络 ，BMVPC：黑石网络，CCN：云联网
     * @param NetworkType 网络类型，分别为VPC、BMVPC、CCN
 VPC：私有网络 ，BMVPC：黑石网络，CCN：云联网
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * Get VPC地域对应的网络名，如ap-guangzhou 
     * @return NetworkRegion VPC地域对应的网络名，如ap-guangzhou
     */
    public String getNetworkRegion() {
        return this.NetworkRegion;
    }

    /**
     * Set VPC地域对应的网络名，如ap-guangzhou
     * @param NetworkRegion VPC地域对应的网络名，如ap-guangzhou
     */
    public void setNetworkRegion(String NetworkRegion) {
        this.NetworkRegion = NetworkRegion;
    }

    /**
     * Get 私有网络统一 ID 或者黑石网络统一 ID 
     * @return VpcId 私有网络统一 ID 或者黑石网络统一 ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络统一 ID 或者黑石网络统一 ID
     * @param VpcId 私有网络统一 ID 或者黑石网络统一 ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 专线网关 ID 
     * @return DirectConnectGatewayId 专线网关 ID
     */
    public String getDirectConnectGatewayId() {
        return this.DirectConnectGatewayId;
    }

    /**
     * Set 专线网关 ID
     * @param DirectConnectGatewayId 专线网关 ID
     */
    public void setDirectConnectGatewayId(String DirectConnectGatewayId) {
        this.DirectConnectGatewayId = DirectConnectGatewayId;
    }

    /**
     * Get BGP ：BGP路由 STATIC：静态 默认为 BGP 路由 
     * @return RouteType BGP ：BGP路由 STATIC：静态 默认为 BGP 路由
     */
    public String getRouteType() {
        return this.RouteType;
    }

    /**
     * Set BGP ：BGP路由 STATIC：静态 默认为 BGP 路由
     * @param RouteType BGP ：BGP路由 STATIC：静态 默认为 BGP 路由
     */
    public void setRouteType(String RouteType) {
        this.RouteType = RouteType;
    }

    /**
     * Get 用户侧BGP，Asn，AuthKey 
     * @return BgpPeer 用户侧BGP，Asn，AuthKey
     */
    public BgpPeer getBgpPeer() {
        return this.BgpPeer;
    }

    /**
     * Set 用户侧BGP，Asn，AuthKey
     * @param BgpPeer 用户侧BGP，Asn，AuthKey
     */
    public void setBgpPeer(BgpPeer BgpPeer) {
        this.BgpPeer = BgpPeer;
    }

    /**
     * Get 用户侧网段地址 
     * @return RouteFilterPrefixes 用户侧网段地址
     */
    public RouteFilterPrefix [] getRouteFilterPrefixes() {
        return this.RouteFilterPrefixes;
    }

    /**
     * Set 用户侧网段地址
     * @param RouteFilterPrefixes 用户侧网段地址
     */
    public void setRouteFilterPrefixes(RouteFilterPrefix [] RouteFilterPrefixes) {
        this.RouteFilterPrefixes = RouteFilterPrefixes;
    }

    /**
     * Get 互联网通道公网网段地址 
     * @return PublicAddresses 互联网通道公网网段地址
     */
    public RouteFilterPrefix [] getPublicAddresses() {
        return this.PublicAddresses;
    }

    /**
     * Set 互联网通道公网网段地址
     * @param PublicAddresses 互联网通道公网网段地址
     */
    public void setPublicAddresses(RouteFilterPrefix [] PublicAddresses) {
        this.PublicAddresses = PublicAddresses;
    }

    /**
     * Get 专用通道的Vlan 
     * @return Vlan 专用通道的Vlan
     */
    public Long getVlan() {
        return this.Vlan;
    }

    /**
     * Set 专用通道的Vlan
     * @param Vlan 专用通道的Vlan
     */
    public void setVlan(Long Vlan) {
        this.Vlan = Vlan;
    }

    /**
     * Get 腾讯侧互联 IP 
     * @return TencentAddress 腾讯侧互联 IP
     */
    public String getTencentAddress() {
        return this.TencentAddress;
    }

    /**
     * Set 腾讯侧互联 IP
     * @param TencentAddress 腾讯侧互联 IP
     */
    public void setTencentAddress(String TencentAddress) {
        this.TencentAddress = TencentAddress;
    }

    /**
     * Get 腾讯侧备用互联IP 
     * @return TencentBackupAddress 腾讯侧备用互联IP
     */
    public String getTencentBackupAddress() {
        return this.TencentBackupAddress;
    }

    /**
     * Set 腾讯侧备用互联IP
     * @param TencentBackupAddress 腾讯侧备用互联IP
     */
    public void setTencentBackupAddress(String TencentBackupAddress) {
        this.TencentBackupAddress = TencentBackupAddress;
    }

    /**
     * Get 用户侧互联 IP 
     * @return CustomerAddress 用户侧互联 IP
     */
    public String getCustomerAddress() {
        return this.CustomerAddress;
    }

    /**
     * Set 用户侧互联 IP
     * @param CustomerAddress 用户侧互联 IP
     */
    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
    }

    /**
     * Get 专用通道名称 
     * @return DirectConnectTunnelName 专用通道名称
     */
    public String getDirectConnectTunnelName() {
        return this.DirectConnectTunnelName;
    }

    /**
     * Set 专用通道名称
     * @param DirectConnectTunnelName 专用通道名称
     */
    public void setDirectConnectTunnelName(String DirectConnectTunnelName) {
        this.DirectConnectTunnelName = DirectConnectTunnelName;
    }

    /**
     * Get 专用通道创建时间 
     * @return CreatedTime 专用通道创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 专用通道创建时间
     * @param CreatedTime 专用通道创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 专用通道带宽值 
     * @return Bandwidth 专用通道带宽值
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 专用通道带宽值
     * @param Bandwidth 专用通道带宽值
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 关联的网络自定义探测ID 
     * @return NetDetectId 关联的网络自定义探测ID
     */
    public String getNetDetectId() {
        return this.NetDetectId;
    }

    /**
     * Set 关联的网络自定义探测ID
     * @param NetDetectId 关联的网络自定义探测ID
     */
    public void setNetDetectId(String NetDetectId) {
        this.NetDetectId = NetDetectId;
    }

    /**
     * Get BGP community开关 
     * @return EnableBGPCommunity BGP community开关
     */
    public Boolean getEnableBGPCommunity() {
        return this.EnableBGPCommunity;
    }

    /**
     * Set BGP community开关
     * @param EnableBGPCommunity BGP community开关
     */
    public void setEnableBGPCommunity(Boolean EnableBGPCommunity) {
        this.EnableBGPCommunity = EnableBGPCommunity;
    }

    /**
     * Get 是否为Nat通道 
     * @return NatType 是否为Nat通道
     */
    public Long getNatType() {
        return this.NatType;
    }

    /**
     * Set 是否为Nat通道
     * @param NatType 是否为Nat通道
     */
    public void setNatType(Long NatType) {
        this.NatType = NatType;
    }

    /**
     * Get VPC地域简码，如gz、cd 
     * @return VpcRegion VPC地域简码，如gz、cd
     */
    public String getVpcRegion() {
        return this.VpcRegion;
    }

    /**
     * Set VPC地域简码，如gz、cd
     * @param VpcRegion VPC地域简码，如gz、cd
     */
    public void setVpcRegion(String VpcRegion) {
        this.VpcRegion = VpcRegion;
    }

    /**
     * Get 是否开启BFD 
     * @return BfdEnable 是否开启BFD
     */
    public Long getBfdEnable() {
        return this.BfdEnable;
    }

    /**
     * Set 是否开启BFD
     * @param BfdEnable 是否开启BFD
     */
    public void setBfdEnable(Long BfdEnable) {
        this.BfdEnable = BfdEnable;
    }

    /**
     * Get 是否开启NQA 
     * @return NqaEnable 是否开启NQA
     */
    public Long getNqaEnable() {
        return this.NqaEnable;
    }

    /**
     * Set 是否开启NQA
     * @param NqaEnable 是否开启NQA
     */
    public void setNqaEnable(Long NqaEnable) {
        this.NqaEnable = NqaEnable;
    }

    /**
     * Get 专用通道接入点类型 
     * @return AccessPointType 专用通道接入点类型
     */
    public String getAccessPointType() {
        return this.AccessPointType;
    }

    /**
     * Set 专用通道接入点类型
     * @param AccessPointType 专用通道接入点类型
     */
    public void setAccessPointType(String AccessPointType) {
        this.AccessPointType = AccessPointType;
    }

    /**
     * Get 专线网关名称 
     * @return DirectConnectGatewayName 专线网关名称
     */
    public String getDirectConnectGatewayName() {
        return this.DirectConnectGatewayName;
    }

    /**
     * Set 专线网关名称
     * @param DirectConnectGatewayName 专线网关名称
     */
    public void setDirectConnectGatewayName(String DirectConnectGatewayName) {
        this.DirectConnectGatewayName = DirectConnectGatewayName;
    }

    /**
     * Get VPC名称 
     * @return VpcName VPC名称
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC名称
     * @param VpcName VPC名称
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 专用通道关联的物理专线是否签署了用户协议 
     * @return SignLaw 专用通道关联的物理专线是否签署了用户协议
     */
    public Boolean getSignLaw() {
        return this.SignLaw;
    }

    /**
     * Set 专用通道关联的物理专线是否签署了用户协议
     * @param SignLaw 专用通道关联的物理专线是否签署了用户协议
     */
    public void setSignLaw(Boolean SignLaw) {
        this.SignLaw = SignLaw;
    }

    /**
     * Get BFD配置信息 
     * @return BfdInfo BFD配置信息
     */
    public BFDInfo getBfdInfo() {
        return this.BfdInfo;
    }

    /**
     * Set BFD配置信息
     * @param BfdInfo BFD配置信息
     */
    public void setBfdInfo(BFDInfo BfdInfo) {
        this.BfdInfo = BfdInfo;
    }

    /**
     * Get NQA配置信息 
     * @return NqaInfo NQA配置信息
     */
    public NQAInfo getNqaInfo() {
        return this.NqaInfo;
    }

    /**
     * Set NQA配置信息
     * @param NqaInfo NQA配置信息
     */
    public void setNqaInfo(NQAInfo NqaInfo) {
        this.NqaInfo = NqaInfo;
    }

    /**
     * Get BGP状态 
     * @return BgpStatus BGP状态
     */
    public BGPStatus getBgpStatus() {
        return this.BgpStatus;
    }

    /**
     * Set BGP状态
     * @param BgpStatus BGP状态
     */
    public void setBgpStatus(BGPStatus BgpStatus) {
        this.BgpStatus = BgpStatus;
    }

    /**
     * Get 是否开启IPv6
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IPv6Enable 是否开启IPv6
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIPv6Enable() {
        return this.IPv6Enable;
    }

    /**
     * Set 是否开启IPv6
注意：此字段可能返回 null，表示取不到有效值。
     * @param IPv6Enable 是否开启IPv6
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIPv6Enable(Long IPv6Enable) {
        this.IPv6Enable = IPv6Enable;
    }

    /**
     * Get 腾讯侧互联IPv6地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TencentIPv6Address 腾讯侧互联IPv6地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTencentIPv6Address() {
        return this.TencentIPv6Address;
    }

    /**
     * Set 腾讯侧互联IPv6地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param TencentIPv6Address 腾讯侧互联IPv6地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTencentIPv6Address(String TencentIPv6Address) {
        this.TencentIPv6Address = TencentIPv6Address;
    }

    /**
     * Get 腾讯侧备用互联IPv6地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TencentBackupIPv6Address 腾讯侧备用互联IPv6地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTencentBackupIPv6Address() {
        return this.TencentBackupIPv6Address;
    }

    /**
     * Set 腾讯侧备用互联IPv6地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param TencentBackupIPv6Address 腾讯侧备用互联IPv6地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTencentBackupIPv6Address(String TencentBackupIPv6Address) {
        this.TencentBackupIPv6Address = TencentBackupIPv6Address;
    }

    /**
     * Get BGPv6状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BgpIPv6Status BGPv6状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BGPStatus getBgpIPv6Status() {
        return this.BgpIPv6Status;
    }

    /**
     * Set BGPv6状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param BgpIPv6Status BGPv6状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBgpIPv6Status(BGPStatus BgpIPv6Status) {
        this.BgpIPv6Status = BgpIPv6Status;
    }

    /**
     * Get 用户侧互联IPv6地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomerIPv6Address 用户侧互联IPv6地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomerIPv6Address() {
        return this.CustomerIPv6Address;
    }

    /**
     * Set 用户侧互联IPv6地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomerIPv6Address 用户侧互联IPv6地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomerIPv6Address(String CustomerIPv6Address) {
        this.CustomerIPv6Address = CustomerIPv6Address;
    }

    /**
     * Get 专用通道是否支持巨帧。1 支持，0 不支持
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JumboEnable 专用通道是否支持巨帧。1 支持，0 不支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getJumboEnable() {
        return this.JumboEnable;
    }

    /**
     * Set 专用通道是否支持巨帧。1 支持，0 不支持
注意：此字段可能返回 null，表示取不到有效值。
     * @param JumboEnable 专用通道是否支持巨帧。1 支持，0 不支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJumboEnable(Long JumboEnable) {
        this.JumboEnable = JumboEnable;
    }

    public DirectConnectTunnelExtra() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DirectConnectTunnelExtra(DirectConnectTunnelExtra source) {
        if (source.DirectConnectTunnelId != null) {
            this.DirectConnectTunnelId = new String(source.DirectConnectTunnelId);
        }
        if (source.DirectConnectId != null) {
            this.DirectConnectId = new String(source.DirectConnectId);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.DirectConnectOwnerAccount != null) {
            this.DirectConnectOwnerAccount = new String(source.DirectConnectOwnerAccount);
        }
        if (source.OwnerAccount != null) {
            this.OwnerAccount = new String(source.OwnerAccount);
        }
        if (source.NetworkType != null) {
            this.NetworkType = new String(source.NetworkType);
        }
        if (source.NetworkRegion != null) {
            this.NetworkRegion = new String(source.NetworkRegion);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.DirectConnectGatewayId != null) {
            this.DirectConnectGatewayId = new String(source.DirectConnectGatewayId);
        }
        if (source.RouteType != null) {
            this.RouteType = new String(source.RouteType);
        }
        if (source.BgpPeer != null) {
            this.BgpPeer = new BgpPeer(source.BgpPeer);
        }
        if (source.RouteFilterPrefixes != null) {
            this.RouteFilterPrefixes = new RouteFilterPrefix[source.RouteFilterPrefixes.length];
            for (int i = 0; i < source.RouteFilterPrefixes.length; i++) {
                this.RouteFilterPrefixes[i] = new RouteFilterPrefix(source.RouteFilterPrefixes[i]);
            }
        }
        if (source.PublicAddresses != null) {
            this.PublicAddresses = new RouteFilterPrefix[source.PublicAddresses.length];
            for (int i = 0; i < source.PublicAddresses.length; i++) {
                this.PublicAddresses[i] = new RouteFilterPrefix(source.PublicAddresses[i]);
            }
        }
        if (source.Vlan != null) {
            this.Vlan = new Long(source.Vlan);
        }
        if (source.TencentAddress != null) {
            this.TencentAddress = new String(source.TencentAddress);
        }
        if (source.TencentBackupAddress != null) {
            this.TencentBackupAddress = new String(source.TencentBackupAddress);
        }
        if (source.CustomerAddress != null) {
            this.CustomerAddress = new String(source.CustomerAddress);
        }
        if (source.DirectConnectTunnelName != null) {
            this.DirectConnectTunnelName = new String(source.DirectConnectTunnelName);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.NetDetectId != null) {
            this.NetDetectId = new String(source.NetDetectId);
        }
        if (source.EnableBGPCommunity != null) {
            this.EnableBGPCommunity = new Boolean(source.EnableBGPCommunity);
        }
        if (source.NatType != null) {
            this.NatType = new Long(source.NatType);
        }
        if (source.VpcRegion != null) {
            this.VpcRegion = new String(source.VpcRegion);
        }
        if (source.BfdEnable != null) {
            this.BfdEnable = new Long(source.BfdEnable);
        }
        if (source.NqaEnable != null) {
            this.NqaEnable = new Long(source.NqaEnable);
        }
        if (source.AccessPointType != null) {
            this.AccessPointType = new String(source.AccessPointType);
        }
        if (source.DirectConnectGatewayName != null) {
            this.DirectConnectGatewayName = new String(source.DirectConnectGatewayName);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.SignLaw != null) {
            this.SignLaw = new Boolean(source.SignLaw);
        }
        if (source.BfdInfo != null) {
            this.BfdInfo = new BFDInfo(source.BfdInfo);
        }
        if (source.NqaInfo != null) {
            this.NqaInfo = new NQAInfo(source.NqaInfo);
        }
        if (source.BgpStatus != null) {
            this.BgpStatus = new BGPStatus(source.BgpStatus);
        }
        if (source.IPv6Enable != null) {
            this.IPv6Enable = new Long(source.IPv6Enable);
        }
        if (source.TencentIPv6Address != null) {
            this.TencentIPv6Address = new String(source.TencentIPv6Address);
        }
        if (source.TencentBackupIPv6Address != null) {
            this.TencentBackupIPv6Address = new String(source.TencentBackupIPv6Address);
        }
        if (source.BgpIPv6Status != null) {
            this.BgpIPv6Status = new BGPStatus(source.BgpIPv6Status);
        }
        if (source.CustomerIPv6Address != null) {
            this.CustomerIPv6Address = new String(source.CustomerIPv6Address);
        }
        if (source.JumboEnable != null) {
            this.JumboEnable = new Long(source.JumboEnable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirectConnectTunnelId", this.DirectConnectTunnelId);
        this.setParamSimple(map, prefix + "DirectConnectId", this.DirectConnectId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "DirectConnectOwnerAccount", this.DirectConnectOwnerAccount);
        this.setParamSimple(map, prefix + "OwnerAccount", this.OwnerAccount);
        this.setParamSimple(map, prefix + "NetworkType", this.NetworkType);
        this.setParamSimple(map, prefix + "NetworkRegion", this.NetworkRegion);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "DirectConnectGatewayId", this.DirectConnectGatewayId);
        this.setParamSimple(map, prefix + "RouteType", this.RouteType);
        this.setParamObj(map, prefix + "BgpPeer.", this.BgpPeer);
        this.setParamArrayObj(map, prefix + "RouteFilterPrefixes.", this.RouteFilterPrefixes);
        this.setParamArrayObj(map, prefix + "PublicAddresses.", this.PublicAddresses);
        this.setParamSimple(map, prefix + "Vlan", this.Vlan);
        this.setParamSimple(map, prefix + "TencentAddress", this.TencentAddress);
        this.setParamSimple(map, prefix + "TencentBackupAddress", this.TencentBackupAddress);
        this.setParamSimple(map, prefix + "CustomerAddress", this.CustomerAddress);
        this.setParamSimple(map, prefix + "DirectConnectTunnelName", this.DirectConnectTunnelName);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "NetDetectId", this.NetDetectId);
        this.setParamSimple(map, prefix + "EnableBGPCommunity", this.EnableBGPCommunity);
        this.setParamSimple(map, prefix + "NatType", this.NatType);
        this.setParamSimple(map, prefix + "VpcRegion", this.VpcRegion);
        this.setParamSimple(map, prefix + "BfdEnable", this.BfdEnable);
        this.setParamSimple(map, prefix + "NqaEnable", this.NqaEnable);
        this.setParamSimple(map, prefix + "AccessPointType", this.AccessPointType);
        this.setParamSimple(map, prefix + "DirectConnectGatewayName", this.DirectConnectGatewayName);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "SignLaw", this.SignLaw);
        this.setParamObj(map, prefix + "BfdInfo.", this.BfdInfo);
        this.setParamObj(map, prefix + "NqaInfo.", this.NqaInfo);
        this.setParamObj(map, prefix + "BgpStatus.", this.BgpStatus);
        this.setParamSimple(map, prefix + "IPv6Enable", this.IPv6Enable);
        this.setParamSimple(map, prefix + "TencentIPv6Address", this.TencentIPv6Address);
        this.setParamSimple(map, prefix + "TencentBackupIPv6Address", this.TencentBackupIPv6Address);
        this.setParamObj(map, prefix + "BgpIPv6Status.", this.BgpIPv6Status);
        this.setParamSimple(map, prefix + "CustomerIPv6Address", this.CustomerIPv6Address);
        this.setParamSimple(map, prefix + "JumboEnable", this.JumboEnable);

    }
}

