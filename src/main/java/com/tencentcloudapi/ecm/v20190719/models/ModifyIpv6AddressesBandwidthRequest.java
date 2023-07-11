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

public class ModifyIpv6AddressesBandwidthRequest extends AbstractModel{

    /**
    * ECM 地域
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
    * 修改的目标带宽，单位Mbps
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * IPV6地址。Ipv6Addresses和Ipv6AddressId必须且只能传一个
    */
    @SerializedName("Ipv6Addresses")
    @Expose
    private Ipv6Address [] Ipv6Addresses;

    /**
    * IPV6地址对应的唯一ID，形如eip-xxxxxxxx。Ipv6Addresses和Ipv6AddressId必须且只能传一个
    */
    @SerializedName("Ipv6AddressIds")
    @Expose
    private String [] Ipv6AddressIds;

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
     * Get 修改的目标带宽，单位Mbps 
     * @return InternetMaxBandwidthOut 修改的目标带宽，单位Mbps
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 修改的目标带宽，单位Mbps
     * @param InternetMaxBandwidthOut 修改的目标带宽，单位Mbps
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get IPV6地址。Ipv6Addresses和Ipv6AddressId必须且只能传一个 
     * @return Ipv6Addresses IPV6地址。Ipv6Addresses和Ipv6AddressId必须且只能传一个
     */
    public Ipv6Address [] getIpv6Addresses() {
        return this.Ipv6Addresses;
    }

    /**
     * Set IPV6地址。Ipv6Addresses和Ipv6AddressId必须且只能传一个
     * @param Ipv6Addresses IPV6地址。Ipv6Addresses和Ipv6AddressId必须且只能传一个
     */
    public void setIpv6Addresses(Ipv6Address [] Ipv6Addresses) {
        this.Ipv6Addresses = Ipv6Addresses;
    }

    /**
     * Get IPV6地址对应的唯一ID，形如eip-xxxxxxxx。Ipv6Addresses和Ipv6AddressId必须且只能传一个 
     * @return Ipv6AddressIds IPV6地址对应的唯一ID，形如eip-xxxxxxxx。Ipv6Addresses和Ipv6AddressId必须且只能传一个
     */
    public String [] getIpv6AddressIds() {
        return this.Ipv6AddressIds;
    }

    /**
     * Set IPV6地址对应的唯一ID，形如eip-xxxxxxxx。Ipv6Addresses和Ipv6AddressId必须且只能传一个
     * @param Ipv6AddressIds IPV6地址对应的唯一ID，形如eip-xxxxxxxx。Ipv6Addresses和Ipv6AddressId必须且只能传一个
     */
    public void setIpv6AddressIds(String [] Ipv6AddressIds) {
        this.Ipv6AddressIds = Ipv6AddressIds;
    }

    public ModifyIpv6AddressesBandwidthRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyIpv6AddressesBandwidthRequest(ModifyIpv6AddressesBandwidthRequest source) {
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.Ipv6Addresses != null) {
            this.Ipv6Addresses = new Ipv6Address[source.Ipv6Addresses.length];
            for (int i = 0; i < source.Ipv6Addresses.length; i++) {
                this.Ipv6Addresses[i] = new Ipv6Address(source.Ipv6Addresses[i]);
            }
        }
        if (source.Ipv6AddressIds != null) {
            this.Ipv6AddressIds = new String[source.Ipv6AddressIds.length];
            for (int i = 0; i < source.Ipv6AddressIds.length; i++) {
                this.Ipv6AddressIds[i] = new String(source.Ipv6AddressIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamArrayObj(map, prefix + "Ipv6Addresses.", this.Ipv6Addresses);
        this.setParamArraySimple(map, prefix + "Ipv6AddressIds.", this.Ipv6AddressIds);

    }
}

