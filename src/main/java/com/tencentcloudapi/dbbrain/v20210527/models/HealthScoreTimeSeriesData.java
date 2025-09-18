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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthScoreTimeSeriesData extends AbstractModel {

    /**
    * 平均得分
    */
    @SerializedName("Avg")
    @Expose
    private Float Avg;

    /**
    * 健康状态
1-health
2-warning
3-critical
    */
    @SerializedName("HealthStatus")
    @Expose
    private Long HealthStatus;

    /**
    * 指标名称
    */
    @SerializedName("Metric")
    @Expose
    private String Metric;

    /**
    * 得分序列
    */
    @SerializedName("Series")
    @Expose
    private Long [] Series;

    /**
    * 时间序列，单位：毫秒数
    */
    @SerializedName("Timestamp")
    @Expose
    private Long [] Timestamp;

    /**
    * 单位
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
     * Get 平均得分 
     * @return Avg 平均得分
     */
    public Float getAvg() {
        return this.Avg;
    }

    /**
     * Set 平均得分
     * @param Avg 平均得分
     */
    public void setAvg(Float Avg) {
        this.Avg = Avg;
    }

    /**
     * Get 健康状态
1-health
2-warning
3-critical 
     * @return HealthStatus 健康状态
1-health
2-warning
3-critical
     */
    public Long getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set 健康状态
1-health
2-warning
3-critical
     * @param HealthStatus 健康状态
1-health
2-warning
3-critical
     */
    public void setHealthStatus(Long HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * Get 指标名称 
     * @return Metric 指标名称
     */
    public String getMetric() {
        return this.Metric;
    }

    /**
     * Set 指标名称
     * @param Metric 指标名称
     */
    public void setMetric(String Metric) {
        this.Metric = Metric;
    }

    /**
     * Get 得分序列 
     * @return Series 得分序列
     */
    public Long [] getSeries() {
        return this.Series;
    }

    /**
     * Set 得分序列
     * @param Series 得分序列
     */
    public void setSeries(Long [] Series) {
        this.Series = Series;
    }

    /**
     * Get 时间序列，单位：毫秒数 
     * @return Timestamp 时间序列，单位：毫秒数
     */
    public Long [] getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 时间序列，单位：毫秒数
     * @param Timestamp 时间序列，单位：毫秒数
     */
    public void setTimestamp(Long [] Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 单位 
     * @return Unit 单位
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * Set 单位
     * @param Unit 单位
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public HealthScoreTimeSeriesData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthScoreTimeSeriesData(HealthScoreTimeSeriesData source) {
        if (source.Avg != null) {
            this.Avg = new Float(source.Avg);
        }
        if (source.HealthStatus != null) {
            this.HealthStatus = new Long(source.HealthStatus);
        }
        if (source.Metric != null) {
            this.Metric = new String(source.Metric);
        }
        if (source.Series != null) {
            this.Series = new Long[source.Series.length];
            for (int i = 0; i < source.Series.length; i++) {
                this.Series[i] = new Long(source.Series[i]);
            }
        }
        if (source.Timestamp != null) {
            this.Timestamp = new Long[source.Timestamp.length];
            for (int i = 0; i < source.Timestamp.length; i++) {
                this.Timestamp[i] = new Long(source.Timestamp[i]);
            }
        }
        if (source.Unit != null) {
            this.Unit = new String(source.Unit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Avg", this.Avg);
        this.setParamSimple(map, prefix + "HealthStatus", this.HealthStatus);
        this.setParamSimple(map, prefix + "Metric", this.Metric);
        this.setParamArraySimple(map, prefix + "Series.", this.Series);
        this.setParamArraySimple(map, prefix + "Timestamp.", this.Timestamp);
        this.setParamSimple(map, prefix + "Unit", this.Unit);

    }
}

