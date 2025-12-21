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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HBaseMetricData extends AbstractModel {

    /**
    * 指标名称，如 read_request_rate
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 指标描述，如 read request rate
    */
    @SerializedName("MetricDesc")
    @Expose
    private String MetricDesc;

    /**
    * 时间戳数组
    */
    @SerializedName("Timestamps")
    @Expose
    private Long [] Timestamps;

    /**
    * 数值数组
    */
    @SerializedName("Values")
    @Expose
    private Float [] Values;

    /**
     * Get 指标名称，如 read_request_rate 
     * @return MetricName 指标名称，如 read_request_rate
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名称，如 read_request_rate
     * @param MetricName 指标名称，如 read_request_rate
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 指标描述，如 read request rate 
     * @return MetricDesc 指标描述，如 read request rate
     */
    public String getMetricDesc() {
        return this.MetricDesc;
    }

    /**
     * Set 指标描述，如 read request rate
     * @param MetricDesc 指标描述，如 read request rate
     */
    public void setMetricDesc(String MetricDesc) {
        this.MetricDesc = MetricDesc;
    }

    /**
     * Get 时间戳数组 
     * @return Timestamps 时间戳数组
     */
    public Long [] getTimestamps() {
        return this.Timestamps;
    }

    /**
     * Set 时间戳数组
     * @param Timestamps 时间戳数组
     */
    public void setTimestamps(Long [] Timestamps) {
        this.Timestamps = Timestamps;
    }

    /**
     * Get 数值数组 
     * @return Values 数值数组
     */
    public Float [] getValues() {
        return this.Values;
    }

    /**
     * Set 数值数组
     * @param Values 数值数组
     */
    public void setValues(Float [] Values) {
        this.Values = Values;
    }

    public HBaseMetricData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HBaseMetricData(HBaseMetricData source) {
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.MetricDesc != null) {
            this.MetricDesc = new String(source.MetricDesc);
        }
        if (source.Timestamps != null) {
            this.Timestamps = new Long[source.Timestamps.length];
            for (int i = 0; i < source.Timestamps.length; i++) {
                this.Timestamps[i] = new Long(source.Timestamps[i]);
            }
        }
        if (source.Values != null) {
            this.Values = new Float[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new Float(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "MetricDesc", this.MetricDesc);
        this.setParamArraySimple(map, prefix + "Timestamps.", this.Timestamps);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

