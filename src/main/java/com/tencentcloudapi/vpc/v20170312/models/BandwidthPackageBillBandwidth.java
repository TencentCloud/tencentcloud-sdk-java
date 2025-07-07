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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BandwidthPackageBillBandwidth extends AbstractModel {

    /**
    * 当前计费用量，单位为 Mbps
    */
    @SerializedName("BandwidthUsage")
    @Expose
    private Float BandwidthUsage;

    /**
     * Get 当前计费用量，单位为 Mbps 
     * @return BandwidthUsage 当前计费用量，单位为 Mbps
     */
    public Float getBandwidthUsage() {
        return this.BandwidthUsage;
    }

    /**
     * Set 当前计费用量，单位为 Mbps
     * @param BandwidthUsage 当前计费用量，单位为 Mbps
     */
    public void setBandwidthUsage(Float BandwidthUsage) {
        this.BandwidthUsage = BandwidthUsage;
    }

    public BandwidthPackageBillBandwidth() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BandwidthPackageBillBandwidth(BandwidthPackageBillBandwidth source) {
        if (source.BandwidthUsage != null) {
            this.BandwidthUsage = new Float(source.BandwidthUsage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BandwidthUsage", this.BandwidthUsage);

    }
}

