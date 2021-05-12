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

public class PublicIPAddressInfo extends AbstractModel{

    /**
    * 计费模式。
    */
    @SerializedName("ChargeMode")
    @Expose
    private String ChargeMode;

    /**
    * 实例的公网ip。
    */
    @SerializedName("PublicIPAddress")
    @Expose
    private String PublicIPAddress;

    /**
    * 实例的公网ip所属的运营商。
    */
    @SerializedName("ISP")
    @Expose
    private ISP ISP;

    /**
    * 实例的最大出带宽上限，单位为Mbps。
    */
    @SerializedName("MaxBandwidthOut")
    @Expose
    private Long MaxBandwidthOut;

    /**
    * 实例的最大入带宽上限，单位为Mbps。
    */
    @SerializedName("MaxBandwidthIn")
    @Expose
    private Long MaxBandwidthIn;

    /**
     * Get 计费模式。 
     * @return ChargeMode 计费模式。
     */
    public String getChargeMode() {
        return this.ChargeMode;
    }

    /**
     * Set 计费模式。
     * @param ChargeMode 计费模式。
     */
    public void setChargeMode(String ChargeMode) {
        this.ChargeMode = ChargeMode;
    }

    /**
     * Get 实例的公网ip。 
     * @return PublicIPAddress 实例的公网ip。
     */
    public String getPublicIPAddress() {
        return this.PublicIPAddress;
    }

    /**
     * Set 实例的公网ip。
     * @param PublicIPAddress 实例的公网ip。
     */
    public void setPublicIPAddress(String PublicIPAddress) {
        this.PublicIPAddress = PublicIPAddress;
    }

    /**
     * Get 实例的公网ip所属的运营商。 
     * @return ISP 实例的公网ip所属的运营商。
     */
    public ISP getISP() {
        return this.ISP;
    }

    /**
     * Set 实例的公网ip所属的运营商。
     * @param ISP 实例的公网ip所属的运营商。
     */
    public void setISP(ISP ISP) {
        this.ISP = ISP;
    }

    /**
     * Get 实例的最大出带宽上限，单位为Mbps。 
     * @return MaxBandwidthOut 实例的最大出带宽上限，单位为Mbps。
     */
    public Long getMaxBandwidthOut() {
        return this.MaxBandwidthOut;
    }

    /**
     * Set 实例的最大出带宽上限，单位为Mbps。
     * @param MaxBandwidthOut 实例的最大出带宽上限，单位为Mbps。
     */
    public void setMaxBandwidthOut(Long MaxBandwidthOut) {
        this.MaxBandwidthOut = MaxBandwidthOut;
    }

    /**
     * Get 实例的最大入带宽上限，单位为Mbps。 
     * @return MaxBandwidthIn 实例的最大入带宽上限，单位为Mbps。
     */
    public Long getMaxBandwidthIn() {
        return this.MaxBandwidthIn;
    }

    /**
     * Set 实例的最大入带宽上限，单位为Mbps。
     * @param MaxBandwidthIn 实例的最大入带宽上限，单位为Mbps。
     */
    public void setMaxBandwidthIn(Long MaxBandwidthIn) {
        this.MaxBandwidthIn = MaxBandwidthIn;
    }

    public PublicIPAddressInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublicIPAddressInfo(PublicIPAddressInfo source) {
        if (source.ChargeMode != null) {
            this.ChargeMode = new String(source.ChargeMode);
        }
        if (source.PublicIPAddress != null) {
            this.PublicIPAddress = new String(source.PublicIPAddress);
        }
        if (source.ISP != null) {
            this.ISP = new ISP(source.ISP);
        }
        if (source.MaxBandwidthOut != null) {
            this.MaxBandwidthOut = new Long(source.MaxBandwidthOut);
        }
        if (source.MaxBandwidthIn != null) {
            this.MaxBandwidthIn = new Long(source.MaxBandwidthIn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChargeMode", this.ChargeMode);
        this.setParamSimple(map, prefix + "PublicIPAddress", this.PublicIPAddress);
        this.setParamObj(map, prefix + "ISP.", this.ISP);
        this.setParamSimple(map, prefix + "MaxBandwidthOut", this.MaxBandwidthOut);
        this.setParamSimple(map, prefix + "MaxBandwidthIn", this.MaxBandwidthIn);

    }
}

