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

public class ModifyDirectConnectTunnelAttributeRequest  extends AbstractModel{

    /**
    * 专用通道ID
    */
    @SerializedName("DirectConnectTunnelId")
    @Expose
    private String DirectConnectTunnelId;

    /**
    * 专用通道名称
    */
    @SerializedName("DirectConnectTunnelName")
    @Expose
    private String DirectConnectTunnelName;

    /**
    * 用户侧BGP，包括Asn，AuthKey
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
    * 腾讯侧互联IP
    */
    @SerializedName("TencentAddress")
    @Expose
    private String TencentAddress;

    /**
    * 用户侧互联IP
    */
    @SerializedName("CustomerAddress")
    @Expose
    private String CustomerAddress;

    /**
    * 专用通道带宽值，单位为M。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Integer Bandwidth;

    /**
     * 获取专用通道ID
     * @return DirectConnectTunnelId 专用通道ID
     */
    public String getDirectConnectTunnelId() {
        return this.DirectConnectTunnelId;
    }

    /**
     * 设置专用通道ID
     * @param DirectConnectTunnelId 专用通道ID
     */
    public void setDirectConnectTunnelId(String DirectConnectTunnelId) {
        this.DirectConnectTunnelId = DirectConnectTunnelId;
    }

    /**
     * 获取专用通道名称
     * @return DirectConnectTunnelName 专用通道名称
     */
    public String getDirectConnectTunnelName() {
        return this.DirectConnectTunnelName;
    }

    /**
     * 设置专用通道名称
     * @param DirectConnectTunnelName 专用通道名称
     */
    public void setDirectConnectTunnelName(String DirectConnectTunnelName) {
        this.DirectConnectTunnelName = DirectConnectTunnelName;
    }

    /**
     * 获取用户侧BGP，包括Asn，AuthKey
     * @return BgpPeer 用户侧BGP，包括Asn，AuthKey
     */
    public BgpPeer getBgpPeer() {
        return this.BgpPeer;
    }

    /**
     * 设置用户侧BGP，包括Asn，AuthKey
     * @param BgpPeer 用户侧BGP，包括Asn，AuthKey
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
     * 获取腾讯侧互联IP
     * @return TencentAddress 腾讯侧互联IP
     */
    public String getTencentAddress() {
        return this.TencentAddress;
    }

    /**
     * 设置腾讯侧互联IP
     * @param TencentAddress 腾讯侧互联IP
     */
    public void setTencentAddress(String TencentAddress) {
        this.TencentAddress = TencentAddress;
    }

    /**
     * 获取用户侧互联IP
     * @return CustomerAddress 用户侧互联IP
     */
    public String getCustomerAddress() {
        return this.CustomerAddress;
    }

    /**
     * 设置用户侧互联IP
     * @param CustomerAddress 用户侧互联IP
     */
    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
    }

    /**
     * 获取专用通道带宽值，单位为M。
     * @return Bandwidth 专用通道带宽值，单位为M。
     */
    public Integer getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * 设置专用通道带宽值，单位为M。
     * @param Bandwidth 专用通道带宽值，单位为M。
     */
    public void setBandwidth(Integer Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirectConnectTunnelId", this.DirectConnectTunnelId);
        this.setParamSimple(map, prefix + "DirectConnectTunnelName", this.DirectConnectTunnelName);
        this.setParamObj(map, prefix + "BgpPeer.", this.BgpPeer);
        this.setParamArrayObj(map, prefix + "RouteFilterPrefixes.", this.RouteFilterPrefixes);
        this.setParamSimple(map, prefix + "TencentAddress", this.TencentAddress);
        this.setParamSimple(map, prefix + "CustomerAddress", this.CustomerAddress);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);

    }
}

