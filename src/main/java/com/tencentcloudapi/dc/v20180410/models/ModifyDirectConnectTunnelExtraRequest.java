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

public class ModifyDirectConnectTunnelExtraRequest extends AbstractModel{

    /**
    * 专用通道ID
    */
    @SerializedName("DirectConnectTunnelId")
    @Expose
    private String DirectConnectTunnelId;

    /**
    * 专用通道的Vlan
    */
    @SerializedName("Vlan")
    @Expose
    private Long Vlan;

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
    private RouteFilterPrefix RouteFilterPrefixes;

    /**
    * 腾讯侧互联IP
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
    * 用户侧互联IP
    */
    @SerializedName("CustomerAddress")
    @Expose
    private String CustomerAddress;

    /**
    * 专用通道带宽值
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * BGP community开关
    */
    @SerializedName("EnableBGPCommunity")
    @Expose
    private Boolean EnableBGPCommunity;

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
    * 0：停用IPv6
1: 启用IPv6
    */
    @SerializedName("IPv6Enable")
    @Expose
    private Long IPv6Enable;

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
    public RouteFilterPrefix getRouteFilterPrefixes() {
        return this.RouteFilterPrefixes;
    }

    /**
     * Set 用户侧网段地址
     * @param RouteFilterPrefixes 用户侧网段地址
     */
    public void setRouteFilterPrefixes(RouteFilterPrefix RouteFilterPrefixes) {
        this.RouteFilterPrefixes = RouteFilterPrefixes;
    }

    /**
     * Get 腾讯侧互联IP 
     * @return TencentAddress 腾讯侧互联IP
     */
    public String getTencentAddress() {
        return this.TencentAddress;
    }

    /**
     * Set 腾讯侧互联IP
     * @param TencentAddress 腾讯侧互联IP
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
     * Get 用户侧互联IP 
     * @return CustomerAddress 用户侧互联IP
     */
    public String getCustomerAddress() {
        return this.CustomerAddress;
    }

    /**
     * Set 用户侧互联IP
     * @param CustomerAddress 用户侧互联IP
     */
    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
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
     * Get 0：停用IPv6
1: 启用IPv6 
     * @return IPv6Enable 0：停用IPv6
1: 启用IPv6
     */
    public Long getIPv6Enable() {
        return this.IPv6Enable;
    }

    /**
     * Set 0：停用IPv6
1: 启用IPv6
     * @param IPv6Enable 0：停用IPv6
1: 启用IPv6
     */
    public void setIPv6Enable(Long IPv6Enable) {
        this.IPv6Enable = IPv6Enable;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirectConnectTunnelId", this.DirectConnectTunnelId);
        this.setParamSimple(map, prefix + "Vlan", this.Vlan);
        this.setParamObj(map, prefix + "BgpPeer.", this.BgpPeer);
        this.setParamObj(map, prefix + "RouteFilterPrefixes.", this.RouteFilterPrefixes);
        this.setParamSimple(map, prefix + "TencentAddress", this.TencentAddress);
        this.setParamSimple(map, prefix + "TencentBackupAddress", this.TencentBackupAddress);
        this.setParamSimple(map, prefix + "CustomerAddress", this.CustomerAddress);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "EnableBGPCommunity", this.EnableBGPCommunity);
        this.setParamSimple(map, prefix + "BfdEnable", this.BfdEnable);
        this.setParamSimple(map, prefix + "NqaEnable", this.NqaEnable);
        this.setParamObj(map, prefix + "BfdInfo.", this.BfdInfo);
        this.setParamObj(map, prefix + "NqaInfo.", this.NqaInfo);
        this.setParamSimple(map, prefix + "IPv6Enable", this.IPv6Enable);

    }
}

