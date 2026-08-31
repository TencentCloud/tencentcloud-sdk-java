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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceNetworkCardBrief extends AbstractModel {

    /**
    * <p>MAC地址</p>
    */
    @SerializedName("MacAddress")
    @Expose
    private String MacAddress;

    /**
    * <p>网卡名称</p>
    */
    @SerializedName("NetworkCardName")
    @Expose
    private String NetworkCardName;

    /**
    * <p>网卡类型</p><p>枚举值：</p><ul><li>1： 物理网卡</li><li>2： 虚拟网卡</li></ul>
    */
    @SerializedName("NetworkCardType")
    @Expose
    private Long NetworkCardType;

    /**
    * <p>网卡状态</p><p>枚举值：</p><ul><li>1： 启用中</li><li>2： 未启用</li></ul>
    */
    @SerializedName("NetworkCardStatus")
    @Expose
    private Long NetworkCardStatus;

    /**
    * <p>IPv4地址</p>
    */
    @SerializedName("Ipv4Address")
    @Expose
    private String Ipv4Address;

    /**
    * <p>IPv6地址</p>
    */
    @SerializedName("Ipv6Address")
    @Expose
    private String Ipv6Address;

    /**
     * Get <p>MAC地址</p> 
     * @return MacAddress <p>MAC地址</p>
     */
    public String getMacAddress() {
        return this.MacAddress;
    }

    /**
     * Set <p>MAC地址</p>
     * @param MacAddress <p>MAC地址</p>
     */
    public void setMacAddress(String MacAddress) {
        this.MacAddress = MacAddress;
    }

    /**
     * Get <p>网卡名称</p> 
     * @return NetworkCardName <p>网卡名称</p>
     */
    public String getNetworkCardName() {
        return this.NetworkCardName;
    }

    /**
     * Set <p>网卡名称</p>
     * @param NetworkCardName <p>网卡名称</p>
     */
    public void setNetworkCardName(String NetworkCardName) {
        this.NetworkCardName = NetworkCardName;
    }

    /**
     * Get <p>网卡类型</p><p>枚举值：</p><ul><li>1： 物理网卡</li><li>2： 虚拟网卡</li></ul> 
     * @return NetworkCardType <p>网卡类型</p><p>枚举值：</p><ul><li>1： 物理网卡</li><li>2： 虚拟网卡</li></ul>
     */
    public Long getNetworkCardType() {
        return this.NetworkCardType;
    }

    /**
     * Set <p>网卡类型</p><p>枚举值：</p><ul><li>1： 物理网卡</li><li>2： 虚拟网卡</li></ul>
     * @param NetworkCardType <p>网卡类型</p><p>枚举值：</p><ul><li>1： 物理网卡</li><li>2： 虚拟网卡</li></ul>
     */
    public void setNetworkCardType(Long NetworkCardType) {
        this.NetworkCardType = NetworkCardType;
    }

    /**
     * Get <p>网卡状态</p><p>枚举值：</p><ul><li>1： 启用中</li><li>2： 未启用</li></ul> 
     * @return NetworkCardStatus <p>网卡状态</p><p>枚举值：</p><ul><li>1： 启用中</li><li>2： 未启用</li></ul>
     */
    public Long getNetworkCardStatus() {
        return this.NetworkCardStatus;
    }

    /**
     * Set <p>网卡状态</p><p>枚举值：</p><ul><li>1： 启用中</li><li>2： 未启用</li></ul>
     * @param NetworkCardStatus <p>网卡状态</p><p>枚举值：</p><ul><li>1： 启用中</li><li>2： 未启用</li></ul>
     */
    public void setNetworkCardStatus(Long NetworkCardStatus) {
        this.NetworkCardStatus = NetworkCardStatus;
    }

    /**
     * Get <p>IPv4地址</p> 
     * @return Ipv4Address <p>IPv4地址</p>
     */
    public String getIpv4Address() {
        return this.Ipv4Address;
    }

    /**
     * Set <p>IPv4地址</p>
     * @param Ipv4Address <p>IPv4地址</p>
     */
    public void setIpv4Address(String Ipv4Address) {
        this.Ipv4Address = Ipv4Address;
    }

    /**
     * Get <p>IPv6地址</p> 
     * @return Ipv6Address <p>IPv6地址</p>
     */
    public String getIpv6Address() {
        return this.Ipv6Address;
    }

    /**
     * Set <p>IPv6地址</p>
     * @param Ipv6Address <p>IPv6地址</p>
     */
    public void setIpv6Address(String Ipv6Address) {
        this.Ipv6Address = Ipv6Address;
    }

    public DeviceNetworkCardBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceNetworkCardBrief(DeviceNetworkCardBrief source) {
        if (source.MacAddress != null) {
            this.MacAddress = new String(source.MacAddress);
        }
        if (source.NetworkCardName != null) {
            this.NetworkCardName = new String(source.NetworkCardName);
        }
        if (source.NetworkCardType != null) {
            this.NetworkCardType = new Long(source.NetworkCardType);
        }
        if (source.NetworkCardStatus != null) {
            this.NetworkCardStatus = new Long(source.NetworkCardStatus);
        }
        if (source.Ipv4Address != null) {
            this.Ipv4Address = new String(source.Ipv4Address);
        }
        if (source.Ipv6Address != null) {
            this.Ipv6Address = new String(source.Ipv6Address);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MacAddress", this.MacAddress);
        this.setParamSimple(map, prefix + "NetworkCardName", this.NetworkCardName);
        this.setParamSimple(map, prefix + "NetworkCardType", this.NetworkCardType);
        this.setParamSimple(map, prefix + "NetworkCardStatus", this.NetworkCardStatus);
        this.setParamSimple(map, prefix + "Ipv4Address", this.Ipv4Address);
        this.setParamSimple(map, prefix + "Ipv6Address", this.Ipv6Address);

    }
}

