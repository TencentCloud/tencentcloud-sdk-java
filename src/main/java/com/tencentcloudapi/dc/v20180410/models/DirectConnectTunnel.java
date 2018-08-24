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

public class DirectConnectTunnel  extends AbstractModel{

    /**
    * 专线通道ID
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
    * 专线通道状态
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
    * 专线通道的拥有者，开发商账号 ID
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
    * VPC地域
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
    * 专线通道的Vlan
    */
    @SerializedName("Vlan")
    @Expose
    private Integer Vlan;

    /**
    * TencentAddress，腾讯侧互联 IP
    */
    @SerializedName("TencentAddress")
    @Expose
    private String TencentAddress;

    /**
    * CustomerAddress，用户侧互联 IP
    */
    @SerializedName("CustomerAddress")
    @Expose
    private String CustomerAddress;

    /**
    * 专线通道名称
    */
    @SerializedName("DirectConnectTunnelName")
    @Expose
    private String DirectConnectTunnelName;

    /**
    * 专线通道创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 专线通道带宽值
    */
    @SerializedName("Bandwidth")
    @Expose
    private Integer Bandwidth;

    /**
     * 获取专线通道ID
     * @return DirectConnectTunnelId 专线通道ID
     */
    public String getDirectConnectTunnelId() {
        return this.DirectConnectTunnelId;
    }

    /**
     * 设置专线通道ID
     * @param DirectConnectTunnelId 专线通道ID
     */
    public void setDirectConnectTunnelId(String DirectConnectTunnelId) {
        this.DirectConnectTunnelId = DirectConnectTunnelId;
    }

    /**
     * 获取物理专线ID
     * @return DirectConnectId 物理专线ID
     */
    public String getDirectConnectId() {
        return this.DirectConnectId;
    }

    /**
     * 设置物理专线ID
     * @param DirectConnectId 物理专线ID
     */
    public void setDirectConnectId(String DirectConnectId) {
        this.DirectConnectId = DirectConnectId;
    }

    /**
     * 获取专线通道状态
AVAILABLE:就绪或者已连接
PENDING:申请中
ALLOCATING:配置中
ALLOCATED:配置完成
ALTERING:修改中
DELETING:删除中
DELETED:删除完成
COMFIRMING:待接受
REJECTED:拒绝
     * @return State 专线通道状态
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
     * 设置专线通道状态
AVAILABLE:就绪或者已连接
PENDING:申请中
ALLOCATING:配置中
ALLOCATED:配置完成
ALTERING:修改中
DELETING:删除中
DELETED:删除完成
COMFIRMING:待接受
REJECTED:拒绝
     * @param State 专线通道状态
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
     * 获取物理专线的拥有者，开发商账号 ID
     * @return DirectConnectOwnerAccount 物理专线的拥有者，开发商账号 ID
     */
    public String getDirectConnectOwnerAccount() {
        return this.DirectConnectOwnerAccount;
    }

    /**
     * 设置物理专线的拥有者，开发商账号 ID
     * @param DirectConnectOwnerAccount 物理专线的拥有者，开发商账号 ID
     */
    public void setDirectConnectOwnerAccount(String DirectConnectOwnerAccount) {
        this.DirectConnectOwnerAccount = DirectConnectOwnerAccount;
    }

    /**
     * 获取专线通道的拥有者，开发商账号 ID
     * @return OwnerAccount 专线通道的拥有者，开发商账号 ID
     */
    public String getOwnerAccount() {
        return this.OwnerAccount;
    }

    /**
     * 设置专线通道的拥有者，开发商账号 ID
     * @param OwnerAccount 专线通道的拥有者，开发商账号 ID
     */
    public void setOwnerAccount(String OwnerAccount) {
        this.OwnerAccount = OwnerAccount;
    }

    /**
     * 获取网络类型，分别为VPC、BMVPC、CCN
 VPC：私有网络 ，BMVPC：黑石网络，CCN：云联网
     * @return NetworkType 网络类型，分别为VPC、BMVPC、CCN
 VPC：私有网络 ，BMVPC：黑石网络，CCN：云联网
     */
    public String getNetworkType() {
        return this.NetworkType;
    }

    /**
     * 设置网络类型，分别为VPC、BMVPC、CCN
 VPC：私有网络 ，BMVPC：黑石网络，CCN：云联网
     * @param NetworkType 网络类型，分别为VPC、BMVPC、CCN
 VPC：私有网络 ，BMVPC：黑石网络，CCN：云联网
     */
    public void setNetworkType(String NetworkType) {
        this.NetworkType = NetworkType;
    }

    /**
     * 获取VPC地域
     * @return NetworkRegion VPC地域
     */
    public String getNetworkRegion() {
        return this.NetworkRegion;
    }

    /**
     * 设置VPC地域
     * @param NetworkRegion VPC地域
     */
    public void setNetworkRegion(String NetworkRegion) {
        this.NetworkRegion = NetworkRegion;
    }

    /**
     * 获取私有网络统一 ID 或者黑石网络统一 ID
     * @return VpcId 私有网络统一 ID 或者黑石网络统一 ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网络统一 ID 或者黑石网络统一 ID
     * @param VpcId 私有网络统一 ID 或者黑石网络统一 ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取专线网关 ID
     * @return DirectConnectGatewayId 专线网关 ID
     */
    public String getDirectConnectGatewayId() {
        return this.DirectConnectGatewayId;
    }

    /**
     * 设置专线网关 ID
     * @param DirectConnectGatewayId 专线网关 ID
     */
    public void setDirectConnectGatewayId(String DirectConnectGatewayId) {
        this.DirectConnectGatewayId = DirectConnectGatewayId;
    }

    /**
     * 获取BGP ：BGP路由 STATIC：静态 默认为 BGP 路由
     * @return RouteType BGP ：BGP路由 STATIC：静态 默认为 BGP 路由
     */
    public String getRouteType() {
        return this.RouteType;
    }

    /**
     * 设置BGP ：BGP路由 STATIC：静态 默认为 BGP 路由
     * @param RouteType BGP ：BGP路由 STATIC：静态 默认为 BGP 路由
     */
    public void setRouteType(String RouteType) {
        this.RouteType = RouteType;
    }

    /**
     * 获取用户侧BGP，Asn，AuthKey
     * @return BgpPeer 用户侧BGP，Asn，AuthKey
     */
    public BgpPeer getBgpPeer() {
        return this.BgpPeer;
    }

    /**
     * 设置用户侧BGP，Asn，AuthKey
     * @param BgpPeer 用户侧BGP，Asn，AuthKey
     */
    public void setBgpPeer(BgpPeer BgpPeer) {
        this.BgpPeer = BgpPeer;
    }

    /**
     * 获取用户侧网段地址
     * @return RouteFilterPrefixes 用户侧网段地址
     */
    public RouteFilterPrefix [] getRouteFilterPrefixes() {
        return this.RouteFilterPrefixes;
    }

    /**
     * 设置用户侧网段地址
     * @param RouteFilterPrefixes 用户侧网段地址
     */
    public void setRouteFilterPrefixes(RouteFilterPrefix [] RouteFilterPrefixes) {
        this.RouteFilterPrefixes = RouteFilterPrefixes;
    }

    /**
     * 获取专线通道的Vlan
     * @return Vlan 专线通道的Vlan
     */
    public Integer getVlan() {
        return this.Vlan;
    }

    /**
     * 设置专线通道的Vlan
     * @param Vlan 专线通道的Vlan
     */
    public void setVlan(Integer Vlan) {
        this.Vlan = Vlan;
    }

    /**
     * 获取TencentAddress，腾讯侧互联 IP
     * @return TencentAddress TencentAddress，腾讯侧互联 IP
     */
    public String getTencentAddress() {
        return this.TencentAddress;
    }

    /**
     * 设置TencentAddress，腾讯侧互联 IP
     * @param TencentAddress TencentAddress，腾讯侧互联 IP
     */
    public void setTencentAddress(String TencentAddress) {
        this.TencentAddress = TencentAddress;
    }

    /**
     * 获取CustomerAddress，用户侧互联 IP
     * @return CustomerAddress CustomerAddress，用户侧互联 IP
     */
    public String getCustomerAddress() {
        return this.CustomerAddress;
    }

    /**
     * 设置CustomerAddress，用户侧互联 IP
     * @param CustomerAddress CustomerAddress，用户侧互联 IP
     */
    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
    }

    /**
     * 获取专线通道名称
     * @return DirectConnectTunnelName 专线通道名称
     */
    public String getDirectConnectTunnelName() {
        return this.DirectConnectTunnelName;
    }

    /**
     * 设置专线通道名称
     * @param DirectConnectTunnelName 专线通道名称
     */
    public void setDirectConnectTunnelName(String DirectConnectTunnelName) {
        this.DirectConnectTunnelName = DirectConnectTunnelName;
    }

    /**
     * 获取专线通道创建时间
     * @return CreatedTime 专线通道创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * 设置专线通道创建时间
     * @param CreatedTime 专线通道创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * 获取专线通道带宽值
     * @return Bandwidth 专线通道带宽值
     */
    public Integer getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * 设置专线通道带宽值
     * @param Bandwidth 专线通道带宽值
     */
    public void setBandwidth(Integer Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * 内部实现，用户禁止调用
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
        this.setParamSimple(map, prefix + "Vlan", this.Vlan);
        this.setParamSimple(map, prefix + "TencentAddress", this.TencentAddress);
        this.setParamSimple(map, prefix + "CustomerAddress", this.CustomerAddress);
        this.setParamSimple(map, prefix + "DirectConnectTunnelName", this.DirectConnectTunnelName);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);

    }
}

