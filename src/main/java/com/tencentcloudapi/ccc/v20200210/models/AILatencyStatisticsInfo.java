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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AILatencyStatisticsInfo extends AbstractModel {

    /**
    * 最小值
    */
    @SerializedName("MinLatency")
    @Expose
    private Long MinLatency;

    /**
    * 中位数
    */
    @SerializedName("MiddleLatency")
    @Expose
    private Long MiddleLatency;

    /**
    * p90
    */
    @SerializedName("P90Latency")
    @Expose
    private Long P90Latency;

    /**
     * Get 最小值 
     * @return MinLatency 最小值
     */
    public Long getMinLatency() {
        return this.MinLatency;
    }

    /**
     * Set 最小值
     * @param MinLatency 最小值
     */
    public void setMinLatency(Long MinLatency) {
        this.MinLatency = MinLatency;
    }

    /**
     * Get 中位数 
     * @return MiddleLatency 中位数
     */
    public Long getMiddleLatency() {
        return this.MiddleLatency;
    }

    /**
     * Set 中位数
     * @param MiddleLatency 中位数
     */
    public void setMiddleLatency(Long MiddleLatency) {
        this.MiddleLatency = MiddleLatency;
    }

    /**
     * Get p90 
     * @return P90Latency p90
     */
    public Long getP90Latency() {
        return this.P90Latency;
    }

    /**
     * Set p90
     * @param P90Latency p90
     */
    public void setP90Latency(Long P90Latency) {
        this.P90Latency = P90Latency;
    }

    public AILatencyStatisticsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AILatencyStatisticsInfo(AILatencyStatisticsInfo source) {
        if (source.MinLatency != null) {
            this.MinLatency = new Long(source.MinLatency);
        }
        if (source.MiddleLatency != null) {
            this.MiddleLatency = new Long(source.MiddleLatency);
        }
        if (source.P90Latency != null) {
            this.P90Latency = new Long(source.P90Latency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinLatency", this.MinLatency);
        this.setParamSimple(map, prefix + "MiddleLatency", this.MiddleLatency);
        this.setParamSimple(map, prefix + "P90Latency", this.P90Latency);

    }
}

