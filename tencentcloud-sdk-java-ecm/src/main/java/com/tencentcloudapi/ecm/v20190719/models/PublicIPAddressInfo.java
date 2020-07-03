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
    * 实例的最大出带宽上限。
    */
    @SerializedName("MaxBandwidthOut")
    @Expose
    private Long MaxBandwidthOut;

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
     * Get 实例的最大出带宽上限。 
     * @return MaxBandwidthOut 实例的最大出带宽上限。
     */
    public Long getMaxBandwidthOut() {
        return this.MaxBandwidthOut;
    }

    /**
     * Set 实例的最大出带宽上限。
     * @param MaxBandwidthOut 实例的最大出带宽上限。
     */
    public void setMaxBandwidthOut(Long MaxBandwidthOut) {
        this.MaxBandwidthOut = MaxBandwidthOut;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChargeMode", this.ChargeMode);
        this.setParamSimple(map, prefix + "PublicIPAddress", this.PublicIPAddress);
        this.setParamObj(map, prefix + "ISP.", this.ISP);
        this.setParamSimple(map, prefix + "MaxBandwidthOut", this.MaxBandwidthOut);

    }
}

