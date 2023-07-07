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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssignIpv6AddressesRequest extends AbstractModel{

    /**
    * ECM 地域
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
    * 弹性网卡实例ID，形如：eni-1snva0vd。目前只支持主网卡上分配。
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * 指定的IPv6地址列表，单次最多指定10个。与入参Ipv6AddressCount合并计算配额。与Ipv6AddressCount必填一个。
    */
    @SerializedName("Ipv6Addresses")
    @Expose
    private Ipv6Address [] Ipv6Addresses;

    /**
    * 自动分配IPv6地址个数，内网IP地址个数总和不能超过配数。与入参Ipv6Addresses合并计算配额。与Ipv6Addresses必填一个。
    */
    @SerializedName("Ipv6AddressCount")
    @Expose
    private Long Ipv6AddressCount;

    /**
    * ipv6运营商如下：
CTCC：中国电信
CUCC：中国联通
CMCC：中国移动
    */
    @SerializedName("ISPType")
    @Expose
    private String ISPType;

    /**
    * 是否跳过校验一个网卡只能分配一个IPv6 CIDR。该字段通常为true（用于兼容存量子机只有一个地址的情形）。
    */
    @SerializedName("SkipCheckIPv6Address")
    @Expose
    private Boolean SkipCheckIPv6Address;

    /**
    * 是否跳过自动开通公网带宽。通常为true(根据运营系统的用户配置来决定是否自动开通，以支持当前子机购买时的行为）。
    */
    @SerializedName("SkipAllocateBandwidth")
    @Expose
    private Boolean SkipAllocateBandwidth;

    /**
    * 该字段没有使用（已过期）。
    */
    @SerializedName("Ipv6ISP")
    @Expose
    private String Ipv6ISP;

    /**
     * Get ECM 地域 
     * @return EcmRegion ECM 地域
     */
    public String getEcmRegion() {
        return this.EcmRegion;
    }

    /**
     * Set ECM 地域
     * @param EcmRegion ECM 地域
     */
    public void setEcmRegion(String EcmRegion) {
        this.EcmRegion = EcmRegion;
    }

    /**
     * Get 弹性网卡实例ID，形如：eni-1snva0vd。目前只支持主网卡上分配。 
     * @return NetworkInterfaceId 弹性网卡实例ID，形如：eni-1snva0vd。目前只支持主网卡上分配。
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set 弹性网卡实例ID，形如：eni-1snva0vd。目前只支持主网卡上分配。
     * @param NetworkInterfaceId 弹性网卡实例ID，形如：eni-1snva0vd。目前只支持主网卡上分配。
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get 指定的IPv6地址列表，单次最多指定10个。与入参Ipv6AddressCount合并计算配额。与Ipv6AddressCount必填一个。 
     * @return Ipv6Addresses 指定的IPv6地址列表，单次最多指定10个。与入参Ipv6AddressCount合并计算配额。与Ipv6AddressCount必填一个。
     */
    public Ipv6Address [] getIpv6Addresses() {
        return this.Ipv6Addresses;
    }

    /**
     * Set 指定的IPv6地址列表，单次最多指定10个。与入参Ipv6AddressCount合并计算配额。与Ipv6AddressCount必填一个。
     * @param Ipv6Addresses 指定的IPv6地址列表，单次最多指定10个。与入参Ipv6AddressCount合并计算配额。与Ipv6AddressCount必填一个。
     */
    public void setIpv6Addresses(Ipv6Address [] Ipv6Addresses) {
        this.Ipv6Addresses = Ipv6Addresses;
    }

    /**
     * Get 自动分配IPv6地址个数，内网IP地址个数总和不能超过配数。与入参Ipv6Addresses合并计算配额。与Ipv6Addresses必填一个。 
     * @return Ipv6AddressCount 自动分配IPv6地址个数，内网IP地址个数总和不能超过配数。与入参Ipv6Addresses合并计算配额。与Ipv6Addresses必填一个。
     */
    public Long getIpv6AddressCount() {
        return this.Ipv6AddressCount;
    }

    /**
     * Set 自动分配IPv6地址个数，内网IP地址个数总和不能超过配数。与入参Ipv6Addresses合并计算配额。与Ipv6Addresses必填一个。
     * @param Ipv6AddressCount 自动分配IPv6地址个数，内网IP地址个数总和不能超过配数。与入参Ipv6Addresses合并计算配额。与Ipv6Addresses必填一个。
     */
    public void setIpv6AddressCount(Long Ipv6AddressCount) {
        this.Ipv6AddressCount = Ipv6AddressCount;
    }

    /**
     * Get ipv6运营商如下：
CTCC：中国电信
CUCC：中国联通
CMCC：中国移动 
     * @return ISPType ipv6运营商如下：
CTCC：中国电信
CUCC：中国联通
CMCC：中国移动
     */
    public String getISPType() {
        return this.ISPType;
    }

    /**
     * Set ipv6运营商如下：
CTCC：中国电信
CUCC：中国联通
CMCC：中国移动
     * @param ISPType ipv6运营商如下：
CTCC：中国电信
CUCC：中国联通
CMCC：中国移动
     */
    public void setISPType(String ISPType) {
        this.ISPType = ISPType;
    }

    /**
     * Get 是否跳过校验一个网卡只能分配一个IPv6 CIDR。该字段通常为true（用于兼容存量子机只有一个地址的情形）。 
     * @return SkipCheckIPv6Address 是否跳过校验一个网卡只能分配一个IPv6 CIDR。该字段通常为true（用于兼容存量子机只有一个地址的情形）。
     */
    public Boolean getSkipCheckIPv6Address() {
        return this.SkipCheckIPv6Address;
    }

    /**
     * Set 是否跳过校验一个网卡只能分配一个IPv6 CIDR。该字段通常为true（用于兼容存量子机只有一个地址的情形）。
     * @param SkipCheckIPv6Address 是否跳过校验一个网卡只能分配一个IPv6 CIDR。该字段通常为true（用于兼容存量子机只有一个地址的情形）。
     */
    public void setSkipCheckIPv6Address(Boolean SkipCheckIPv6Address) {
        this.SkipCheckIPv6Address = SkipCheckIPv6Address;
    }

    /**
     * Get 是否跳过自动开通公网带宽。通常为true(根据运营系统的用户配置来决定是否自动开通，以支持当前子机购买时的行为）。 
     * @return SkipAllocateBandwidth 是否跳过自动开通公网带宽。通常为true(根据运营系统的用户配置来决定是否自动开通，以支持当前子机购买时的行为）。
     */
    public Boolean getSkipAllocateBandwidth() {
        return this.SkipAllocateBandwidth;
    }

    /**
     * Set 是否跳过自动开通公网带宽。通常为true(根据运营系统的用户配置来决定是否自动开通，以支持当前子机购买时的行为）。
     * @param SkipAllocateBandwidth 是否跳过自动开通公网带宽。通常为true(根据运营系统的用户配置来决定是否自动开通，以支持当前子机购买时的行为）。
     */
    public void setSkipAllocateBandwidth(Boolean SkipAllocateBandwidth) {
        this.SkipAllocateBandwidth = SkipAllocateBandwidth;
    }

    /**
     * Get 该字段没有使用（已过期）。 
     * @return Ipv6ISP 该字段没有使用（已过期）。
     */
    public String getIpv6ISP() {
        return this.Ipv6ISP;
    }

    /**
     * Set 该字段没有使用（已过期）。
     * @param Ipv6ISP 该字段没有使用（已过期）。
     */
    public void setIpv6ISP(String Ipv6ISP) {
        this.Ipv6ISP = Ipv6ISP;
    }

    public AssignIpv6AddressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssignIpv6AddressesRequest(AssignIpv6AddressesRequest source) {
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
        }
        if (source.NetworkInterfaceId != null) {
            this.NetworkInterfaceId = new String(source.NetworkInterfaceId);
        }
        if (source.Ipv6Addresses != null) {
            this.Ipv6Addresses = new Ipv6Address[source.Ipv6Addresses.length];
            for (int i = 0; i < source.Ipv6Addresses.length; i++) {
                this.Ipv6Addresses[i] = new Ipv6Address(source.Ipv6Addresses[i]);
            }
        }
        if (source.Ipv6AddressCount != null) {
            this.Ipv6AddressCount = new Long(source.Ipv6AddressCount);
        }
        if (source.ISPType != null) {
            this.ISPType = new String(source.ISPType);
        }
        if (source.SkipCheckIPv6Address != null) {
            this.SkipCheckIPv6Address = new Boolean(source.SkipCheckIPv6Address);
        }
        if (source.SkipAllocateBandwidth != null) {
            this.SkipAllocateBandwidth = new Boolean(source.SkipAllocateBandwidth);
        }
        if (source.Ipv6ISP != null) {
            this.Ipv6ISP = new String(source.Ipv6ISP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamArrayObj(map, prefix + "Ipv6Addresses.", this.Ipv6Addresses);
        this.setParamSimple(map, prefix + "Ipv6AddressCount", this.Ipv6AddressCount);
        this.setParamSimple(map, prefix + "ISPType", this.ISPType);
        this.setParamSimple(map, prefix + "SkipCheckIPv6Address", this.SkipCheckIPv6Address);
        this.setParamSimple(map, prefix + "SkipAllocateBandwidth", this.SkipAllocateBandwidth);
        this.setParamSimple(map, prefix + "Ipv6ISP", this.Ipv6ISP);

    }
}

