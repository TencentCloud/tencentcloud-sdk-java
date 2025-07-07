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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDirectConnectTunnelExtraRequest extends AbstractModel {

    /**
    * 专用通道ID。
    */
    @SerializedName("DirectConnectTunnelId")
    @Expose
    private String DirectConnectTunnelId;

    /**
    * 专用通道的Vlan。
    */
    @SerializedName("Vlan")
    @Expose
    private Long Vlan;

    /**
    * Bgp参数，包括Asn，AuthKey
    */
    @SerializedName("BgpPeer")
    @Expose
    private BgpPeer BgpPeer;

    /**
    * 用户侧过滤网段地址。
    */
    @SerializedName("RouteFilterPrefixes")
    @Expose
    private RouteFilterPrefix RouteFilterPrefixes;

    /**
    * 腾讯侧互联IP。
    */
    @SerializedName("TencentAddress")
    @Expose
    private String TencentAddress;

    /**
    * 腾讯侧备用互联IP。
    */
    @SerializedName("TencentBackupAddress")
    @Expose
    private String TencentBackupAddress;

    /**
    * 用户侧互联IP。
    */
    @SerializedName("CustomerAddress")
    @Expose
    private String CustomerAddress;

    /**
    * 专用通道带宽值。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * BGP community开关。
    */
    @SerializedName("EnableBGPCommunity")
    @Expose
    private Boolean EnableBGPCommunity;

    /**
    * 是否开启BFD。
    */
    @SerializedName("BfdEnable")
    @Expose
    private Long BfdEnable;

    /**
    * 是否开启NQA。
    */
    @SerializedName("NqaEnable")
    @Expose
    private Long NqaEnable;

    /**
    * BFD配置信息。
    */
    @SerializedName("BfdInfo")
    @Expose
    private BFDInfo BfdInfo;

    /**
    * NQA配置信息。
    */
    @SerializedName("NqaInfo")
    @Expose
    private NQAInfo NqaInfo;

    /**
    * IPV6使能。0：停用IPv6；1: 启用IPv6。
    */
    @SerializedName("IPv6Enable")
    @Expose
    private Long IPv6Enable;

    /**
    * 去往用户侧的路由信息。
    */
    @SerializedName("CustomerIDCRoutes")
    @Expose
    private RouteFilterPrefix [] CustomerIDCRoutes;

    /**
    * 是否开启巨帧。1：开启；0：不开启。
    */
    @SerializedName("JumboEnable")
    @Expose
    private Long JumboEnable;

    /**
    * 腾讯侧互联IPv6。
    */
    @SerializedName("TencentIPv6Address")
    @Expose
    private String TencentIPv6Address;

    /**
    * 腾讯侧备用互联IPv6。
    */
    @SerializedName("TencentBackupIPv6Address")
    @Expose
    private String TencentBackupIPv6Address;

    /**
    * 用户侧互联IPv6。
    */
    @SerializedName("CustomerIPv6Address")
    @Expose
    private String CustomerIPv6Address;

    /**
     * Get 专用通道ID。 
     * @return DirectConnectTunnelId 专用通道ID。
     */
    public String getDirectConnectTunnelId() {
        return this.DirectConnectTunnelId;
    }

    /**
     * Set 专用通道ID。
     * @param DirectConnectTunnelId 专用通道ID。
     */
    public void setDirectConnectTunnelId(String DirectConnectTunnelId) {
        this.DirectConnectTunnelId = DirectConnectTunnelId;
    }

    /**
     * Get 专用通道的Vlan。 
     * @return Vlan 专用通道的Vlan。
     */
    public Long getVlan() {
        return this.Vlan;
    }

    /**
     * Set 专用通道的Vlan。
     * @param Vlan 专用通道的Vlan。
     */
    public void setVlan(Long Vlan) {
        this.Vlan = Vlan;
    }

    /**
     * Get Bgp参数，包括Asn，AuthKey 
     * @return BgpPeer Bgp参数，包括Asn，AuthKey
     */
    public BgpPeer getBgpPeer() {
        return this.BgpPeer;
    }

    /**
     * Set Bgp参数，包括Asn，AuthKey
     * @param BgpPeer Bgp参数，包括Asn，AuthKey
     */
    public void setBgpPeer(BgpPeer BgpPeer) {
        this.BgpPeer = BgpPeer;
    }

    /**
     * Get 用户侧过滤网段地址。 
     * @return RouteFilterPrefixes 用户侧过滤网段地址。
     */
    public RouteFilterPrefix getRouteFilterPrefixes() {
        return this.RouteFilterPrefixes;
    }

    /**
     * Set 用户侧过滤网段地址。
     * @param RouteFilterPrefixes 用户侧过滤网段地址。
     */
    public void setRouteFilterPrefixes(RouteFilterPrefix RouteFilterPrefixes) {
        this.RouteFilterPrefixes = RouteFilterPrefixes;
    }

    /**
     * Get 腾讯侧互联IP。 
     * @return TencentAddress 腾讯侧互联IP。
     */
    public String getTencentAddress() {
        return this.TencentAddress;
    }

    /**
     * Set 腾讯侧互联IP。
     * @param TencentAddress 腾讯侧互联IP。
     */
    public void setTencentAddress(String TencentAddress) {
        this.TencentAddress = TencentAddress;
    }

    /**
     * Get 腾讯侧备用互联IP。 
     * @return TencentBackupAddress 腾讯侧备用互联IP。
     */
    public String getTencentBackupAddress() {
        return this.TencentBackupAddress;
    }

    /**
     * Set 腾讯侧备用互联IP。
     * @param TencentBackupAddress 腾讯侧备用互联IP。
     */
    public void setTencentBackupAddress(String TencentBackupAddress) {
        this.TencentBackupAddress = TencentBackupAddress;
    }

    /**
     * Get 用户侧互联IP。 
     * @return CustomerAddress 用户侧互联IP。
     */
    public String getCustomerAddress() {
        return this.CustomerAddress;
    }

    /**
     * Set 用户侧互联IP。
     * @param CustomerAddress 用户侧互联IP。
     */
    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
    }

    /**
     * Get 专用通道带宽值。 
     * @return Bandwidth 专用通道带宽值。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 专用通道带宽值。
     * @param Bandwidth 专用通道带宽值。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get BGP community开关。 
     * @return EnableBGPCommunity BGP community开关。
     */
    public Boolean getEnableBGPCommunity() {
        return this.EnableBGPCommunity;
    }

    /**
     * Set BGP community开关。
     * @param EnableBGPCommunity BGP community开关。
     */
    public void setEnableBGPCommunity(Boolean EnableBGPCommunity) {
        this.EnableBGPCommunity = EnableBGPCommunity;
    }

    /**
     * Get 是否开启BFD。 
     * @return BfdEnable 是否开启BFD。
     */
    public Long getBfdEnable() {
        return this.BfdEnable;
    }

    /**
     * Set 是否开启BFD。
     * @param BfdEnable 是否开启BFD。
     */
    public void setBfdEnable(Long BfdEnable) {
        this.BfdEnable = BfdEnable;
    }

    /**
     * Get 是否开启NQA。 
     * @return NqaEnable 是否开启NQA。
     */
    public Long getNqaEnable() {
        return this.NqaEnable;
    }

    /**
     * Set 是否开启NQA。
     * @param NqaEnable 是否开启NQA。
     */
    public void setNqaEnable(Long NqaEnable) {
        this.NqaEnable = NqaEnable;
    }

    /**
     * Get BFD配置信息。 
     * @return BfdInfo BFD配置信息。
     */
    public BFDInfo getBfdInfo() {
        return this.BfdInfo;
    }

    /**
     * Set BFD配置信息。
     * @param BfdInfo BFD配置信息。
     */
    public void setBfdInfo(BFDInfo BfdInfo) {
        this.BfdInfo = BfdInfo;
    }

    /**
     * Get NQA配置信息。 
     * @return NqaInfo NQA配置信息。
     */
    public NQAInfo getNqaInfo() {
        return this.NqaInfo;
    }

    /**
     * Set NQA配置信息。
     * @param NqaInfo NQA配置信息。
     */
    public void setNqaInfo(NQAInfo NqaInfo) {
        this.NqaInfo = NqaInfo;
    }

    /**
     * Get IPV6使能。0：停用IPv6；1: 启用IPv6。 
     * @return IPv6Enable IPV6使能。0：停用IPv6；1: 启用IPv6。
     */
    public Long getIPv6Enable() {
        return this.IPv6Enable;
    }

    /**
     * Set IPV6使能。0：停用IPv6；1: 启用IPv6。
     * @param IPv6Enable IPV6使能。0：停用IPv6；1: 启用IPv6。
     */
    public void setIPv6Enable(Long IPv6Enable) {
        this.IPv6Enable = IPv6Enable;
    }

    /**
     * Get 去往用户侧的路由信息。 
     * @return CustomerIDCRoutes 去往用户侧的路由信息。
     */
    public RouteFilterPrefix [] getCustomerIDCRoutes() {
        return this.CustomerIDCRoutes;
    }

    /**
     * Set 去往用户侧的路由信息。
     * @param CustomerIDCRoutes 去往用户侧的路由信息。
     */
    public void setCustomerIDCRoutes(RouteFilterPrefix [] CustomerIDCRoutes) {
        this.CustomerIDCRoutes = CustomerIDCRoutes;
    }

    /**
     * Get 是否开启巨帧。1：开启；0：不开启。 
     * @return JumboEnable 是否开启巨帧。1：开启；0：不开启。
     */
    public Long getJumboEnable() {
        return this.JumboEnable;
    }

    /**
     * Set 是否开启巨帧。1：开启；0：不开启。
     * @param JumboEnable 是否开启巨帧。1：开启；0：不开启。
     */
    public void setJumboEnable(Long JumboEnable) {
        this.JumboEnable = JumboEnable;
    }

    /**
     * Get 腾讯侧互联IPv6。 
     * @return TencentIPv6Address 腾讯侧互联IPv6。
     */
    public String getTencentIPv6Address() {
        return this.TencentIPv6Address;
    }

    /**
     * Set 腾讯侧互联IPv6。
     * @param TencentIPv6Address 腾讯侧互联IPv6。
     */
    public void setTencentIPv6Address(String TencentIPv6Address) {
        this.TencentIPv6Address = TencentIPv6Address;
    }

    /**
     * Get 腾讯侧备用互联IPv6。 
     * @return TencentBackupIPv6Address 腾讯侧备用互联IPv6。
     */
    public String getTencentBackupIPv6Address() {
        return this.TencentBackupIPv6Address;
    }

    /**
     * Set 腾讯侧备用互联IPv6。
     * @param TencentBackupIPv6Address 腾讯侧备用互联IPv6。
     */
    public void setTencentBackupIPv6Address(String TencentBackupIPv6Address) {
        this.TencentBackupIPv6Address = TencentBackupIPv6Address;
    }

    /**
     * Get 用户侧互联IPv6。 
     * @return CustomerIPv6Address 用户侧互联IPv6。
     */
    public String getCustomerIPv6Address() {
        return this.CustomerIPv6Address;
    }

    /**
     * Set 用户侧互联IPv6。
     * @param CustomerIPv6Address 用户侧互联IPv6。
     */
    public void setCustomerIPv6Address(String CustomerIPv6Address) {
        this.CustomerIPv6Address = CustomerIPv6Address;
    }

    public ModifyDirectConnectTunnelExtraRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDirectConnectTunnelExtraRequest(ModifyDirectConnectTunnelExtraRequest source) {
        if (source.DirectConnectTunnelId != null) {
            this.DirectConnectTunnelId = new String(source.DirectConnectTunnelId);
        }
        if (source.Vlan != null) {
            this.Vlan = new Long(source.Vlan);
        }
        if (source.BgpPeer != null) {
            this.BgpPeer = new BgpPeer(source.BgpPeer);
        }
        if (source.RouteFilterPrefixes != null) {
            this.RouteFilterPrefixes = new RouteFilterPrefix(source.RouteFilterPrefixes);
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
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.EnableBGPCommunity != null) {
            this.EnableBGPCommunity = new Boolean(source.EnableBGPCommunity);
        }
        if (source.BfdEnable != null) {
            this.BfdEnable = new Long(source.BfdEnable);
        }
        if (source.NqaEnable != null) {
            this.NqaEnable = new Long(source.NqaEnable);
        }
        if (source.BfdInfo != null) {
            this.BfdInfo = new BFDInfo(source.BfdInfo);
        }
        if (source.NqaInfo != null) {
            this.NqaInfo = new NQAInfo(source.NqaInfo);
        }
        if (source.IPv6Enable != null) {
            this.IPv6Enable = new Long(source.IPv6Enable);
        }
        if (source.CustomerIDCRoutes != null) {
            this.CustomerIDCRoutes = new RouteFilterPrefix[source.CustomerIDCRoutes.length];
            for (int i = 0; i < source.CustomerIDCRoutes.length; i++) {
                this.CustomerIDCRoutes[i] = new RouteFilterPrefix(source.CustomerIDCRoutes[i]);
            }
        }
        if (source.JumboEnable != null) {
            this.JumboEnable = new Long(source.JumboEnable);
        }
        if (source.TencentIPv6Address != null) {
            this.TencentIPv6Address = new String(source.TencentIPv6Address);
        }
        if (source.TencentBackupIPv6Address != null) {
            this.TencentBackupIPv6Address = new String(source.TencentBackupIPv6Address);
        }
        if (source.CustomerIPv6Address != null) {
            this.CustomerIPv6Address = new String(source.CustomerIPv6Address);
        }
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
        this.setParamArrayObj(map, prefix + "CustomerIDCRoutes.", this.CustomerIDCRoutes);
        this.setParamSimple(map, prefix + "JumboEnable", this.JumboEnable);
        this.setParamSimple(map, prefix + "TencentIPv6Address", this.TencentIPv6Address);
        this.setParamSimple(map, prefix + "TencentBackupIPv6Address", this.TencentBackupIPv6Address);
        this.setParamSimple(map, prefix + "CustomerIPv6Address", this.CustomerIPv6Address);

    }
}

