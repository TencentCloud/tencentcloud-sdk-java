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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShieldMetric extends AbstractModel {

    /**
    * 屏蔽指标
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 屏蔽指标展示名称
    */
    @SerializedName("MetricShowName")
    @Expose
    private String MetricShowName;

    /**
     * Get 屏蔽指标 
     * @return Metric 屏蔽指标
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 屏蔽指标
     * @param Metric 屏蔽指标
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 屏蔽指标展示名称 
     * @return MetricShowName 屏蔽指标展示名称
     */
    public String getMetricShowName() {
        return this.MetricShowName;
    }

    /**
     * Set 屏蔽指标展示名称
     * @param MetricShowName 屏蔽指标展示名称
     */
    public void setMetricShowName(String MetricShowName) {
        this.MetricShowName = MetricShowName;
    }

    public ShieldMetric() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShieldMetric(ShieldMetric source) {
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.MetricShowName != null) {
            this.MetricShowName = new String(source.MetricShowName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamSimple(map, prefix + "MetricShowName", this.MetricShowName);

    }
}

