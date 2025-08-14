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

public class DescribeInvocationMetricDataPointRequest extends AbstractModel {

    /**
    * 开始时间，格式yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，格式yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 查询指标维度, 不能为空
    */
    @SerializedName("MetricDimensionValues")
    @Expose
    private MetricDimensionValue [] MetricDimensionValues;

    /**
    * 指标，不能为空
    */
    @SerializedName("Metrics")
    @Expose
    private Metric [] Metrics;

    /**
    * 视图视角。可选值：SERVER：服务端, CLIENT：客户端。默认为SERVER
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
     * Get 开始时间，格式yyyy-MM-dd HH:mm:ss 
     * @return StartTime 开始时间，格式yyyy-MM-dd HH:mm:ss
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，格式yyyy-MM-dd HH:mm:ss
     * @param StartTime 开始时间，格式yyyy-MM-dd HH:mm:ss
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，格式yyyy-MM-dd HH:mm:ss 
     * @return EndTime 结束时间，格式yyyy-MM-dd HH:mm:ss
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，格式yyyy-MM-dd HH:mm:ss
     * @param EndTime 结束时间，格式yyyy-MM-dd HH:mm:ss
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 查询指标维度, 不能为空 
     * @return MetricDimensionValues 查询指标维度, 不能为空
     */
    public MetricDimensionValue [] getMetricDimensionValues() {
        return this.MetricDimensionValues;
    }

    /**
     * Set 查询指标维度, 不能为空
     * @param MetricDimensionValues 查询指标维度, 不能为空
     */
    public void setMetricDimensionValues(MetricDimensionValue [] MetricDimensionValues) {
        this.MetricDimensionValues = MetricDimensionValues;
    }

    /**
     * Get 指标，不能为空 
     * @return Metrics 指标，不能为空
     */
    public Metric [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set 指标，不能为空
     * @param Metrics 指标，不能为空
     */
    public void setMetrics(Metric [] Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get 视图视角。可选值：SERVER：服务端, CLIENT：客户端。默认为SERVER 
     * @return Kind 视图视角。可选值：SERVER：服务端, CLIENT：客户端。默认为SERVER
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set 视图视角。可选值：SERVER：服务端, CLIENT：客户端。默认为SERVER
     * @param Kind 视图视角。可选值：SERVER：服务端, CLIENT：客户端。默认为SERVER
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    public DescribeInvocationMetricDataPointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInvocationMetricDataPointRequest(DescribeInvocationMetricDataPointRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MetricDimensionValues != null) {
            this.MetricDimensionValues = new MetricDimensionValue[source.MetricDimensionValues.length];
            for (int i = 0; i < source.MetricDimensionValues.length; i++) {
                this.MetricDimensionValues[i] = new MetricDimensionValue(source.MetricDimensionValues[i]);
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
        this.setParamArrayObj(map, prefix + "MetricDimensionValues.", this.MetricDimensionValues);
        this.setParamArrayObj(map, prefix + "Metrics.", this.Metrics);
        this.setParamSimple(map, prefix + "Kind", this.Kind);

    }
}

