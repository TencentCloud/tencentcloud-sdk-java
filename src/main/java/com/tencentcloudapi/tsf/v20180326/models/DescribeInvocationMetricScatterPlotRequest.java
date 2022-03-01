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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInvocationMetricScatterPlotRequest extends AbstractModel{

    /**
    * 查询开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 查询时间粒度，单位秒。可选值：60、3600、86400。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 查询指标维度
    */
    @SerializedName("MetricDimensions")
    @Expose
    private MetricDimension [] MetricDimensions;

    /**
    * 查询指标名
    */
    @SerializedName("Metrics")
    @Expose
    private Metric [] Metrics;

    /**
    * 视图视角。可选值：SERVER, CLIENT。默认为SERVER
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
     * Get 查询开始时间 
     * @return StartTime 查询开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询开始时间
     * @param StartTime 查询开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 查询结束时间 
     * @return EndTime 查询结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询结束时间
     * @param EndTime 查询结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 查询时间粒度，单位秒。可选值：60、3600、86400。 
     * @return Period 查询时间粒度，单位秒。可选值：60、3600、86400。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 查询时间粒度，单位秒。可选值：60、3600、86400。
     * @param Period 查询时间粒度，单位秒。可选值：60、3600、86400。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 查询指标维度 
     * @return MetricDimensions 查询指标维度
     */
    public MetricDimension [] getMetricDimensions() {
        return this.MetricDimensions;
    }

    /**
     * Set 查询指标维度
     * @param MetricDimensions 查询指标维度
     */
    public void setMetricDimensions(MetricDimension [] MetricDimensions) {
        this.MetricDimensions = MetricDimensions;
    }

    /**
     * Get 查询指标名 
     * @return Metrics 查询指标名
     */
    public Metric [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set 查询指标名
     * @param Metrics 查询指标名
     */
    public void setMetrics(Metric [] Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get 视图视角。可选值：SERVER, CLIENT。默认为SERVER 
     * @return Kind 视图视角。可选值：SERVER, CLIENT。默认为SERVER
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set 视图视角。可选值：SERVER, CLIENT。默认为SERVER
     * @param Kind 视图视角。可选值：SERVER, CLIENT。默认为SERVER
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    public DescribeInvocationMetricScatterPlotRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInvocationMetricScatterPlotRequest(DescribeInvocationMetricScatterPlotRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.MetricDimensions != null) {
            this.MetricDimensions = new MetricDimension[source.MetricDimensions.length];
            for (int i = 0; i < source.MetricDimensions.length; i++) {
                this.MetricDimensions[i] = new MetricDimension(source.MetricDimensions[i]);
            }
        }
        if (source.Metrics != null) {
            this.Metrics = new Metric[source.Metrics.length];
            for (int i = 0; i < source.Metrics.length; i++) {
                this.Metrics[i] = new Metric(source.Metrics[i]);
            }
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamArrayObj(map, prefix + "MetricDimensions.", this.MetricDimensions);
        this.setParamArrayObj(map, prefix + "Metrics.", this.Metrics);
        this.setParamSimple(map, prefix + "Kind", this.Kind);

    }
}

