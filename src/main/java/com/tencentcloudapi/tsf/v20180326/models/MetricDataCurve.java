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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricDataCurve extends AbstractModel {

    /**
    * 指标名称
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 指标计算方式
    */
    @SerializedName("MetricFunction")
    @Expose
    private String MetricFunction;

    /**
    * 指标数据点集合
    */
    @SerializedName("MetricDataPoints")
    @Expose
    private MetricDataPoint [] MetricDataPoints;

    /**
     * Get 指标名称 
     * @return MetricName 指标名称
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 指标名称
     * @param MetricName 指标名称
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 指标计算方式 
     * @return MetricFunction 指标计算方式
     */
    public String getMetricFunction() {
        return this.MetricFunction;
    }

    /**
     * Set 指标计算方式
     * @param MetricFunction 指标计算方式
     */
    public void setMetricFunction(String MetricFunction) {
        this.MetricFunction = MetricFunction;
    }

    /**
     * Get 指标数据点集合 
     * @return MetricDataPoints 指标数据点集合
     */
    public MetricDataPoint [] getMetricDataPoints() {
        return this.MetricDataPoints;
    }

    /**
     * Set 指标数据点集合
     * @param MetricDataPoints 指标数据点集合
     */
    public void setMetricDataPoints(MetricDataPoint [] MetricDataPoints) {
        this.MetricDataPoints = MetricDataPoints;
    }

    public MetricDataCurve() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetricDataCurve(MetricDataCurve source) {
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.MetricFunction != null) {
            this.MetricFunction = new String(source.MetricFunction);
        }
        if (source.MetricDataPoints != null) {
            this.MetricDataPoints = new MetricDataPoint[source.MetricDataPoints.length];
            for (int i = 0; i < source.MetricDataPoints.length; i++) {
                this.MetricDataPoints[i] = new MetricDataPoint(source.MetricDataPoints[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "MetricFunction", this.MetricFunction);
        this.setParamArrayObj(map, prefix + "MetricDataPoints.", this.MetricDataPoints);

    }
}

