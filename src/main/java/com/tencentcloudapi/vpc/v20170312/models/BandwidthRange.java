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

public class BandwidthRange extends AbstractModel {

    /**
    * 资源ID。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 带宽下限，单位：Mbps。计费类型以及对应的带宽下限：
- TOP5_POSTPAID_BY_MONTH: 默认无下限
- BANDWIDTH_POSTPAID_BY_DAY: 50
- FIXED_PREPAID_BY_MONTH: 100
- ENHANCED95_POSTPAID_BY_MONTH: 300
- PEAK_BANDWIDTH_POSTPAID_BY_DAY: 50
- PRIMARY_TRAFFIC_POSTPAID_BY_HOUR: 50
    */
    @SerializedName("BandwidthLowerLimit")
    @Expose
    private Long BandwidthLowerLimit;

    /**
    * 带宽上限，单位：Mbps。计费类型以及对应的带宽上限：
- TOP5_POSTPAID_BY_MONTH: 默认无上限
- BANDWIDTH_POSTPAID_BY_DAY: 300
- FIXED_PREPAID_BY_MONTH: 5000
- ENHANCED95_POSTPAID_BY_MONTH: 5000
- PEAK_BANDWIDTH_POSTPAID_BY_DAY: 300
- PRIMARY_TRAFFIC_POSTPAID_BY_HOUR: 2000
    */
    @SerializedName("BandwidthUpperLimit")
    @Expose
    private Long BandwidthUpperLimit;

    /**
     * Get 资源ID。 
     * @return ResourceId 资源ID。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID。
     * @param ResourceId 资源ID。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 带宽下限，单位：Mbps。计费类型以及对应的带宽下限：
- TOP5_POSTPAID_BY_MONTH: 默认无下限
- BANDWIDTH_POSTPAID_BY_DAY: 50
- FIXED_PREPAID_BY_MONTH: 100
- ENHANCED95_POSTPAID_BY_MONTH: 300
- PEAK_BANDWIDTH_POSTPAID_BY_DAY: 50
- PRIMARY_TRAFFIC_POSTPAID_BY_HOUR: 50 
     * @return BandwidthLowerLimit 带宽下限，单位：Mbps。计费类型以及对应的带宽下限：
- TOP5_POSTPAID_BY_MONTH: 默认无下限
- BANDWIDTH_POSTPAID_BY_DAY: 50
- FIXED_PREPAID_BY_MONTH: 100
- ENHANCED95_POSTPAID_BY_MONTH: 300
- PEAK_BANDWIDTH_POSTPAID_BY_DAY: 50
- PRIMARY_TRAFFIC_POSTPAID_BY_HOUR: 50
     */
    public Long getBandwidthLowerLimit() {
        return this.BandwidthLowerLimit;
    }

    /**
     * Set 带宽下限，单位：Mbps。计费类型以及对应的带宽下限：
- TOP5_POSTPAID_BY_MONTH: 默认无下限
- BANDWIDTH_POSTPAID_BY_DAY: 50
- FIXED_PREPAID_BY_MONTH: 100
- ENHANCED95_POSTPAID_BY_MONTH: 300
- PEAK_BANDWIDTH_POSTPAID_BY_DAY: 50
- PRIMARY_TRAFFIC_POSTPAID_BY_HOUR: 50
     * @param BandwidthLowerLimit 带宽下限，单位：Mbps。计费类型以及对应的带宽下限：
- TOP5_POSTPAID_BY_MONTH: 默认无下限
- BANDWIDTH_POSTPAID_BY_DAY: 50
- FIXED_PREPAID_BY_MONTH: 100
- ENHANCED95_POSTPAID_BY_MONTH: 300
- PEAK_BANDWIDTH_POSTPAID_BY_DAY: 50
- PRIMARY_TRAFFIC_POSTPAID_BY_HOUR: 50
     */
    public void setBandwidthLowerLimit(Long BandwidthLowerLimit) {
        this.BandwidthLowerLimit = BandwidthLowerLimit;
    }

    /**
     * Get 带宽上限，单位：Mbps。计费类型以及对应的带宽上限：
- TOP5_POSTPAID_BY_MONTH: 默认无上限
- BANDWIDTH_POSTPAID_BY_DAY: 300
- FIXED_PREPAID_BY_MONTH: 5000
- ENHANCED95_POSTPAID_BY_MONTH: 5000
- PEAK_BANDWIDTH_POSTPAID_BY_DAY: 300
- PRIMARY_TRAFFIC_POSTPAID_BY_HOUR: 2000 
     * @return BandwidthUpperLimit 带宽上限，单位：Mbps。计费类型以及对应的带宽上限：
- TOP5_POSTPAID_BY_MONTH: 默认无上限
- BANDWIDTH_POSTPAID_BY_DAY: 300
- FIXED_PREPAID_BY_MONTH: 5000
- ENHANCED95_POSTPAID_BY_MONTH: 5000
- PEAK_BANDWIDTH_POSTPAID_BY_DAY: 300
- PRIMARY_TRAFFIC_POSTPAID_BY_HOUR: 2000
     */
    public Long getBandwidthUpperLimit() {
        return this.BandwidthUpperLimit;
    }

    /**
     * Set 带宽上限，单位：Mbps。计费类型以及对应的带宽上限：
- TOP5_POSTPAID_BY_MONTH: 默认无上限
- BANDWIDTH_POSTPAID_BY_DAY: 300
- FIXED_PREPAID_BY_MONTH: 5000
- ENHANCED95_POSTPAID_BY_MONTH: 5000
- PEAK_BANDWIDTH_POSTPAID_BY_DAY: 300
- PRIMARY_TRAFFIC_POSTPAID_BY_HOUR: 2000
     * @param BandwidthUpperLimit 带宽上限，单位：Mbps。计费类型以及对应的带宽上限：
- TOP5_POSTPAID_BY_MONTH: 默认无上限
- BANDWIDTH_POSTPAID_BY_DAY: 300
- FIXED_PREPAID_BY_MONTH: 5000
- ENHANCED95_POSTPAID_BY_MONTH: 5000
- PEAK_BANDWIDTH_POSTPAID_BY_DAY: 300
- PRIMARY_TRAFFIC_POSTPAID_BY_HOUR: 2000
     */
    public void setBandwidthUpperLimit(Long BandwidthUpperLimit) {
        this.BandwidthUpperLimit = BandwidthUpperLimit;
    }

    public BandwidthRange() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BandwidthRange(BandwidthRange source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.BandwidthLowerLimit != null) {
            this.BandwidthLowerLimit = new Long(source.BandwidthLowerLimit);
        }
        if (source.BandwidthUpperLimit != null) {
            this.BandwidthUpperLimit = new Long(source.BandwidthUpperLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "BandwidthLowerLimit", this.BandwidthLowerLimit);
        this.setParamSimple(map, prefix + "BandwidthUpperLimit", this.BandwidthUpperLimit);

    }
}

