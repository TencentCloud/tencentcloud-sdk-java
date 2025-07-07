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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AllocateIpv6AddressesBandwidthRequest extends AbstractModel {

    /**
    * ECM 地域。
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
    * 需要开通公网访问能力的IPV6地址。
    */
    @SerializedName("Ipv6Addresses")
    @Expose
    private String [] Ipv6Addresses;

    /**
    * 带宽，单位Mbps，默认是1Mbps。
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * 网络计费模式，当前支持 BANDWIDTH_PACKAGE。
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
     * Get ECM 地域。 
     * @return EcmRegion ECM 地域。
     */
    public String getEcmRegion() {
        return this.EcmRegion;
    }

    /**
     * Set ECM 地域。
     * @param EcmRegion ECM 地域。
     */
    public void setEcmRegion(String EcmRegion) {
        this.EcmRegion = EcmRegion;
    }

    /**
     * Get 需要开通公网访问能力的IPV6地址。 
     * @return Ipv6Addresses 需要开通公网访问能力的IPV6地址。
     */
    public String [] getIpv6Addresses() {
        return this.Ipv6Addresses;
    }

    /**
     * Set 需要开通公网访问能力的IPV6地址。
     * @param Ipv6Addresses 需要开通公网访问能力的IPV6地址。
     */
    public void setIpv6Addresses(String [] Ipv6Addresses) {
        this.Ipv6Addresses = Ipv6Addresses;
    }

    /**
     * Get 带宽，单位Mbps，默认是1Mbps。 
     * @return InternetMaxBandwidthOut 带宽，单位Mbps，默认是1Mbps。
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set 带宽，单位Mbps，默认是1Mbps。
     * @param InternetMaxBandwidthOut 带宽，单位Mbps，默认是1Mbps。
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get 网络计费模式，当前支持 BANDWIDTH_PACKAGE。 
     * @return InternetChargeType 网络计费模式，当前支持 BANDWIDTH_PACKAGE。
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * Set 网络计费模式，当前支持 BANDWIDTH_PACKAGE。
     * @param InternetChargeType 网络计费模式，当前支持 BANDWIDTH_PACKAGE。
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    public AllocateIpv6AddressesBandwidthRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocateIpv6AddressesBandwidthRequest(AllocateIpv6AddressesBandwidthRequest source) {
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
        }
        if (source.Ipv6Addresses != null) {
            this.Ipv6Addresses = new String[source.Ipv6Addresses.length];
            for (int i = 0; i < source.Ipv6Addresses.length; i++) {
                this.Ipv6Addresses[i] = new String(source.Ipv6Addresses[i]);
            }
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.InternetChargeType != null) {
            this.InternetChargeType = new String(source.InternetChargeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);
        this.setParamArraySimple(map, prefix + "Ipv6Addresses.", this.Ipv6Addresses);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);

    }
}

