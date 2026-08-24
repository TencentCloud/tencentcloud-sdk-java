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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowControlRule extends AbstractModel {

    /**
    * 流控开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 流控结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 流控规则最大带宽，单位MB/s
    */
    @SerializedName("MaxBandwidthMBps")
    @Expose
    private Long MaxBandwidthMBps;

    /**
     * Get 流控开始时间 
     * @return StartTime 流控开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 流控开始时间
     * @param StartTime 流控开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 流控结束时间 
     * @return EndTime 流控结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 流控结束时间
     * @param EndTime 流控结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 流控规则最大带宽，单位MB/s 
     * @return MaxBandwidthMBps 流控规则最大带宽，单位MB/s
     */
    public Long getMaxBandwidthMBps() {
        return this.MaxBandwidthMBps;
    }

    /**
     * Set 流控规则最大带宽，单位MB/s
     * @param MaxBandwidthMBps 流控规则最大带宽，单位MB/s
     */
    public void setMaxBandwidthMBps(Long MaxBandwidthMBps) {
        this.MaxBandwidthMBps = MaxBandwidthMBps;
    }

    public FlowControlRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowControlRule(FlowControlRule source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MaxBandwidthMBps != null) {
            this.MaxBandwidthMBps = new Long(source.MaxBandwidthMBps);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MaxBandwidthMBps", this.MaxBandwidthMBps);

    }
}

