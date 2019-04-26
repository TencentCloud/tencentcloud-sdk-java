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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssignIpv6AddressesRequest  extends AbstractModel{

    /**
    * 弹性网卡实例`ID`，形如：`eni-m6dyj72l`。
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * 指定的`IPv6`地址列表，单次最多指定10个。与入参`Ipv6AddressCount`合并计算配额。
    */
    @SerializedName("Ipv6Addresses")
    @Expose
    private Ipv6Address [] Ipv6Addresses;

    /**
    * 自动分配`IPv6`地址个数，内网IP地址个数总和不能超过配数。与入参`Ipv6Addresses`合并计算配额。
    */
    @SerializedName("Ipv6AddressCount")
    @Expose
    private Integer Ipv6AddressCount;

    /**
     * 获取弹性网卡实例`ID`，形如：`eni-m6dyj72l`。
     * @return NetworkInterfaceId 弹性网卡实例`ID`，形如：`eni-m6dyj72l`。
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * 设置弹性网卡实例`ID`，形如：`eni-m6dyj72l`。
     * @param NetworkInterfaceId 弹性网卡实例`ID`，形如：`eni-m6dyj72l`。
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * 获取指定的`IPv6`地址列表，单次最多指定10个。与入参`Ipv6AddressCount`合并计算配额。
     * @return Ipv6Addresses 指定的`IPv6`地址列表，单次最多指定10个。与入参`Ipv6AddressCount`合并计算配额。
     */
    public Ipv6Address [] getIpv6Addresses() {
        return this.Ipv6Addresses;
    }

    /**
     * 设置指定的`IPv6`地址列表，单次最多指定10个。与入参`Ipv6AddressCount`合并计算配额。
     * @param Ipv6Addresses 指定的`IPv6`地址列表，单次最多指定10个。与入参`Ipv6AddressCount`合并计算配额。
     */
    public void setIpv6Addresses(Ipv6Address [] Ipv6Addresses) {
        this.Ipv6Addresses = Ipv6Addresses;
    }

    /**
     * 获取自动分配`IPv6`地址个数，内网IP地址个数总和不能超过配数。与入参`Ipv6Addresses`合并计算配额。
     * @return Ipv6AddressCount 自动分配`IPv6`地址个数，内网IP地址个数总和不能超过配数。与入参`Ipv6Addresses`合并计算配额。
     */
    public Integer getIpv6AddressCount() {
        return this.Ipv6AddressCount;
    }

    /**
     * 设置自动分配`IPv6`地址个数，内网IP地址个数总和不能超过配数。与入参`Ipv6Addresses`合并计算配额。
     * @param Ipv6AddressCount 自动分配`IPv6`地址个数，内网IP地址个数总和不能超过配数。与入参`Ipv6Addresses`合并计算配额。
     */
    public void setIpv6AddressCount(Integer Ipv6AddressCount) {
        this.Ipv6AddressCount = Ipv6AddressCount;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamArrayObj(map, prefix + "Ipv6Addresses.", this.Ipv6Addresses);
        this.setParamSimple(map, prefix + "Ipv6AddressCount", this.Ipv6AddressCount);

    }
}

