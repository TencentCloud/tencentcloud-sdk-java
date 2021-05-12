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

public class ModifyIpv6AddressesAttributeRequest extends AbstractModel{

    /**
    * ECM 地域
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
    * 弹性网卡实例ID，形如：eni-m6dyj72l。
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * 指定的IPv6地址信息。
    */
    @SerializedName("Ipv6Addresses")
    @Expose
    private Ipv6Address [] Ipv6Addresses;

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
     * Get 弹性网卡实例ID，形如：eni-m6dyj72l。 
     * @return NetworkInterfaceId 弹性网卡实例ID，形如：eni-m6dyj72l。
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set 弹性网卡实例ID，形如：eni-m6dyj72l。
     * @param NetworkInterfaceId 弹性网卡实例ID，形如：eni-m6dyj72l。
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get 指定的IPv6地址信息。 
     * @return Ipv6Addresses 指定的IPv6地址信息。
     */
    public Ipv6Address [] getIpv6Addresses() {
        return this.Ipv6Addresses;
    }

    /**
     * Set 指定的IPv6地址信息。
     * @param Ipv6Addresses 指定的IPv6地址信息。
     */
    public void setIpv6Addresses(Ipv6Address [] Ipv6Addresses) {
        this.Ipv6Addresses = Ipv6Addresses;
    }

    public ModifyIpv6AddressesAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyIpv6AddressesAttributeRequest(ModifyIpv6AddressesAttributeRequest source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamArrayObj(map, prefix + "Ipv6Addresses.", this.Ipv6Addresses);

    }
}

