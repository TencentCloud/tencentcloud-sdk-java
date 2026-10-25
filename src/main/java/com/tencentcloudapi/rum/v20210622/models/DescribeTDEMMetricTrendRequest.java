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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTDEMMetricTrendRequest extends AbstractModel {

    /**
    * <p>应用 ID（必填）</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>开始时间 Unix 毫秒（必填）</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束时间 Unix 毫秒（必填）</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>粒度：5m（默认）/ 1h / 1d；跨度大时服务端可加粗</p>
    */
    @SerializedName("Granularity")
    @Expose
    private String Granularity;

    /**
    * <p>顶层事件类型；单查必填，批量用 Queries 时可不填</p>
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * <p>子类型；未知返回 0</p>
    */
    @SerializedName("SubType")
    @Expose
    private String SubType;

    /**
    * <p>筛选条件 JSON 字符串：[{Key,Op,Values}]，走分析立方白名单</p>
    */
    @SerializedName("Filters")
    @Expose
    private String Filters;

    /**
    * <p>指标名列表，如 count / rate；单查必填</p>
    */
    @SerializedName("Metrics")
    @Expose
    private String [] Metrics;

    /**
    * <p>分位/均值必填，如 lcp / duration</p>
    */
    @SerializedName("MeasurementKey")
    @Expose
    private String MeasurementKey;

    /**
    * <p>批量查询，上限 32</p>
    */
    @SerializedName("Queries")
    @Expose
    private MetricQueryItem [] Queries;

    /**
    * <p>对比窗开始 Unix 毫秒（仅 Trend 批量，须与 CompareEndTime 成对）</p>
    */
    @SerializedName("CompareStartTime")
    @Expose
    private Long CompareStartTime;

    /**
    * <p>对比窗结束 Unix 毫秒（仅 Trend 批量）</p>
    */
    @SerializedName("CompareEndTime")
    @Expose
    private Long CompareEndTime;

    /**
     * Get <p>应用 ID（必填）</p> 
     * @return AppId <p>应用 ID（必填）</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用 ID（必填）</p>
     * @param AppId <p>应用 ID（必填）</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>开始时间 Unix 毫秒（必填）</p> 
     * @return StartTime <p>开始时间 Unix 毫秒（必填）</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间 Unix 毫秒（必填）</p>
     * @param StartTime <p>开始时间 Unix 毫秒（必填）</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间 Unix 毫秒（必填）</p> 
     * @return EndTime <p>结束时间 Unix 毫秒（必填）</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间 Unix 毫秒（必填）</p>
     * @param EndTime <p>结束时间 Unix 毫秒（必填）</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>粒度：5m（默认）/ 1h / 1d；跨度大时服务端可加粗</p> 
     * @return Granularity <p>粒度：5m（默认）/ 1h / 1d；跨度大时服务端可加粗</p>
     */
    public String getGranularity() {
        return this.Granularity;
    }

    /**
     * Set <p>粒度：5m（默认）/ 1h / 1d；跨度大时服务端可加粗</p>
     * @param Granularity <p>粒度：5m（默认）/ 1h / 1d；跨度大时服务端可加粗</p>
     */
    public void setGranularity(String Granularity) {
        this.Granularity = Granularity;
    }

    /**
     * Get <p>顶层事件类型；单查必填，批量用 Queries 时可不填</p> 
     * @return EventType <p>顶层事件类型；单查必填，批量用 Queries 时可不填</p>
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set <p>顶层事件类型；单查必填，批量用 Queries 时可不填</p>
     * @param EventType <p>顶层事件类型；单查必填，批量用 Queries 时可不填</p>
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get <p>子类型；未知返回 0</p> 
     * @return SubType <p>子类型；未知返回 0</p>
     */
    public String getSubType() {
        return this.SubType;
    }

    /**
     * Set <p>子类型；未知返回 0</p>
     * @param SubType <p>子类型；未知返回 0</p>
     */
    public void setSubType(String SubType) {
        this.SubType = SubType;
    }

    /**
     * Get <p>筛选条件 JSON 字符串：[{Key,Op,Values}]，走分析立方白名单</p> 
     * @return Filters <p>筛选条件 JSON 字符串：[{Key,Op,Values}]，走分析立方白名单</p>
     */
    public String getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>筛选条件 JSON 字符串：[{Key,Op,Values}]，走分析立方白名单</p>
     * @param Filters <p>筛选条件 JSON 字符串：[{Key,Op,Values}]，走分析立方白名单</p>
     */
    public void setFilters(String Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>指标名列表，如 count / rate；单查必填</p> 
     * @return Metrics <p>指标名列表，如 count / rate；单查必填</p>
     */
    public String [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set <p>指标名列表，如 count / rate；单查必填</p>
     * @param Metrics <p>指标名列表，如 count / rate；单查必填</p>
     */
    public void setMetrics(String [] Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get <p>分位/均值必填，如 lcp / duration</p> 
     * @return MeasurementKey <p>分位/均值必填，如 lcp / duration</p>
     */
    public String getMeasurementKey() {
        return this.MeasurementKey;
    }

    /**
     * Set <p>分位/均值必填，如 lcp / duration</p>
     * @param MeasurementKey <p>分位/均值必填，如 lcp / duration</p>
     */
    public void setMeasurementKey(String MeasurementKey) {
        this.MeasurementKey = MeasurementKey;
    }

    /**
     * Get <p>批量查询，上限 32</p> 
     * @return Queries <p>批量查询，上限 32</p>
     */
    public MetricQueryItem [] getQueries() {
        return this.Queries;
    }

    /**
     * Set <p>批量查询，上限 32</p>
     * @param Queries <p>批量查询，上限 32</p>
     */
    public void setQueries(MetricQueryItem [] Queries) {
        this.Queries = Queries;
    }

    /**
     * Get <p>对比窗开始 Unix 毫秒（仅 Trend 批量，须与 CompareEndTime 成对）</p> 
     * @return CompareStartTime <p>对比窗开始 Unix 毫秒（仅 Trend 批量，须与 CompareEndTime 成对）</p>
     */
    public Long getCompareStartTime() {
        return this.CompareStartTime;
    }

    /**
     * Set <p>对比窗开始 Unix 毫秒（仅 Trend 批量，须与 CompareEndTime 成对）</p>
     * @param CompareStartTime <p>对比窗开始 Unix 毫秒（仅 Trend 批量，须与 CompareEndTime 成对）</p>
     */
    public void setCompareStartTime(Long CompareStartTime) {
        this.CompareStartTime = CompareStartTime;
    }

    /**
     * Get <p>对比窗结束 Unix 毫秒（仅 Trend 批量）</p> 
     * @return CompareEndTime <p>对比窗结束 Unix 毫秒（仅 Trend 批量）</p>
     */
    public Long getCompareEndTime() {
        return this.CompareEndTime;
    }

    /**
     * Set <p>对比窗结束 Unix 毫秒（仅 Trend 批量）</p>
     * @param CompareEndTime <p>对比窗结束 Unix 毫秒（仅 Trend 批量）</p>
     */
    public void setCompareEndTime(Long CompareEndTime) {
        this.CompareEndTime = CompareEndTime;
    }

    public DescribeTDEMMetricTrendRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTDEMMetricTrendRequest(DescribeTDEMMetricTrendRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Granularity != null) {
            this.Granularity = new String(source.Granularity);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.SubType != null) {
            this.SubType = new String(source.SubType);
        }
        if (source.Filters != null) {
            this.Filters = new String(source.Filters);
        }
        if (source.Metrics != null) {
            this.Metrics = new String[source.Metrics.length];
            for (int i = 0; i < source.Metrics.length; i++) {
                this.Metrics[i] = new String(source.Metrics[i]);
            }
        }
        if (source.MeasurementKey != null) {
            this.MeasurementKey = new String(source.MeasurementKey);
        }
        if (source.Queries != null) {
            this.Queries = new MetricQueryItem[source.Queries.length];
            for (int i = 0; i < source.Queries.length; i++) {
                this.Queries[i] = new MetricQueryItem(source.Queries[i]);
            }
        }
        if (source.CompareStartTime != null) {
            this.CompareStartTime = new Long(source.CompareStartTime);
        }
        if (source.CompareEndTime != null) {
            this.CompareEndTime = new Long(source.CompareEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "SubType", this.SubType);
        this.setParamSimple(map, prefix + "Filters", this.Filters);
        this.setParamArraySimple(map, prefix + "Metrics.", this.Metrics);
        this.setParamSimple(map, prefix + "MeasurementKey", this.MeasurementKey);
        this.setParamArrayObj(map, prefix + "Queries.", this.Queries);
        this.setParamSimple(map, prefix + "CompareStartTime", this.CompareStartTime);
        this.setParamSimple(map, prefix + "CompareEndTime", this.CompareEndTime);

    }
}

