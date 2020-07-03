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

public class RemovePrivateIpAddressesRequest extends AbstractModel{

    /**
    * ECM 地域。
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
    * 弹性网卡实例ID，例如：eni-11112222。
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * 指定的内网IP信息，单次最多指定10个。
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private PrivateIpAddressSpecification [] PrivateIpAddresses;

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
     * Get 弹性网卡实例ID，例如：eni-11112222。 
     * @return NetworkInterfaceId 弹性网卡实例ID，例如：eni-11112222。
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set 弹性网卡实例ID，例如：eni-11112222。
     * @param NetworkInterfaceId 弹性网卡实例ID，例如：eni-11112222。
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get 指定的内网IP信息，单次最多指定10个。 
     * @return PrivateIpAddresses 指定的内网IP信息，单次最多指定10个。
     */
    public PrivateIpAddressSpecification [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set 指定的内网IP信息，单次最多指定10个。
     * @param PrivateIpAddresses 指定的内网IP信息，单次最多指定10个。
     */
    public void setPrivateIpAddresses(PrivateIpAddressSpecification [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamArrayObj(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);

    }
}

