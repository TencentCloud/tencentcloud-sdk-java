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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricThreshold extends AbstractModel {

    /**
    * 指标。
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 阈值。
    */
    @SerializedName("Threshold")
    @Expose
    private Long Threshold;

    /**
    * 时间间隔。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
     * Get 指标。 
     * @return Metric 指标。
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 指标。
     * @param Metric 指标。
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 阈值。 
     * @return Threshold 阈值。
     */
    public Long getThreshold() {
        return this.Threshold;
    }

    /**
     * Set 阈值。
     * @param Threshold 阈值。
     */
    public void setThreshold(Long Threshold) {
        this.Threshold = Threshold;
    }

    /**
     * Get 时间间隔。 
     * @return Duration 时间间隔。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 时间间隔。
     * @param Duration 时间间隔。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    public MetricThreshold() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricThreshold(MetricThreshold source) {
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Threshold != null) {
            this.Threshold = new Long(source.Threshold);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "Threshold", this.Threshold);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

