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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSSpeedLimit extends AbstractModel{

    /**
    * 源站包量限制，支持单位有pps、Kpps、Mpps、Gpps。支持范围1 pps-10000 Gpps。"0 pps"或其他单位数值为0，即不限包。""为不更新。
    */
    @SerializedName("PackageLimit")
    @Expose
    private String PackageLimit;

    /**
    * 源站流量限制，支持单位有bps、Kbps、Mbps、Gbps，支持范围1 bps-10000 Gbps。"0 bps"或其他单位数值为0，即不限流。""为不更新。
    */
    @SerializedName("FluxLimit")
    @Expose
    private String FluxLimit;

    /**
     * Get 源站包量限制，支持单位有pps、Kpps、Mpps、Gpps。支持范围1 pps-10000 Gpps。"0 pps"或其他单位数值为0，即不限包。""为不更新。 
     * @return PackageLimit 源站包量限制，支持单位有pps、Kpps、Mpps、Gpps。支持范围1 pps-10000 Gpps。"0 pps"或其他单位数值为0，即不限包。""为不更新。
     */
    public String getPackageLimit() {
        return this.PackageLimit;
    }

    /**
     * Set 源站包量限制，支持单位有pps、Kpps、Mpps、Gpps。支持范围1 pps-10000 Gpps。"0 pps"或其他单位数值为0，即不限包。""为不更新。
     * @param PackageLimit 源站包量限制，支持单位有pps、Kpps、Mpps、Gpps。支持范围1 pps-10000 Gpps。"0 pps"或其他单位数值为0，即不限包。""为不更新。
     */
    public void setPackageLimit(String PackageLimit) {
        this.PackageLimit = PackageLimit;
    }

    /**
     * Get 源站流量限制，支持单位有bps、Kbps、Mbps、Gbps，支持范围1 bps-10000 Gbps。"0 bps"或其他单位数值为0，即不限流。""为不更新。 
     * @return FluxLimit 源站流量限制，支持单位有bps、Kbps、Mbps、Gbps，支持范围1 bps-10000 Gbps。"0 bps"或其他单位数值为0，即不限流。""为不更新。
     */
    public String getFluxLimit() {
        return this.FluxLimit;
    }

    /**
     * Set 源站流量限制，支持单位有bps、Kbps、Mbps、Gbps，支持范围1 bps-10000 Gbps。"0 bps"或其他单位数值为0，即不限流。""为不更新。
     * @param FluxLimit 源站流量限制，支持单位有bps、Kbps、Mbps、Gbps，支持范围1 bps-10000 Gbps。"0 bps"或其他单位数值为0，即不限流。""为不更新。
     */
    public void setFluxLimit(String FluxLimit) {
        this.FluxLimit = FluxLimit;
    }

    public DDoSSpeedLimit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSSpeedLimit(DDoSSpeedLimit source) {
        if (source.PackageLimit != null) {
            this.PackageLimit = new String(source.PackageLimit);
        }
        if (source.FluxLimit != null) {
            this.FluxLimit = new String(source.FluxLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageLimit", this.PackageLimit);
        this.setParamSimple(map, prefix + "FluxLimit", this.FluxLimit);

    }
}

