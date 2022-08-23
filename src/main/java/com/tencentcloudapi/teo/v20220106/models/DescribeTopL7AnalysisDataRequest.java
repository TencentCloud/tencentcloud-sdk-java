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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTopL7AnalysisDataRequest extends AbstractModel{

    /**
    * RFC3339标准，客户端时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * RFC3339标准，客户端时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 时序类访问流量指标
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * topN,填0时返回全量数据
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 时间间隔，选填{min, 5min, hour, day, week}
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * ZoneId数组
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * 筛选条件
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 加速区域，取值有：
<li>mainland：中国大陆境内;</li>
<li>overseas：全球（不含中国大陆）。</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get RFC3339标准，客户端时间 
     * @return StartTime RFC3339标准，客户端时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set RFC3339标准，客户端时间
     * @param StartTime RFC3339标准，客户端时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get RFC3339标准，客户端时间 
     * @return EndTime RFC3339标准，客户端时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set RFC3339标准，客户端时间
     * @param EndTime RFC3339标准，客户端时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 时序类访问流量指标 
     * @return MetricName 时序类访问流量指标
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 时序类访问流量指标
     * @param MetricName 时序类访问流量指标
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get topN,填0时返回全量数据 
     * @return Limit topN,填0时返回全量数据
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set topN,填0时返回全量数据
     * @param Limit topN,填0时返回全量数据
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 时间间隔，选填{min, 5min, hour, day, week} 
     * @return Interval 时间间隔，选填{min, 5min, hour, day, week}
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set 时间间隔，选填{min, 5min, hour, day, week}
     * @param Interval 时间间隔，选填{min, 5min, hour, day, week}
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get ZoneId数组 
     * @return ZoneIds ZoneId数组
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set ZoneId数组
     * @param ZoneIds ZoneId数组
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get 筛选条件 
     * @return Filters 筛选条件
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 筛选条件
     * @param Filters 筛选条件
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 加速区域，取值有：
<li>mainland：中国大陆境内;</li>
<li>overseas：全球（不含中国大陆）。</li> 
     * @return Area 加速区域，取值有：
<li>mainland：中国大陆境内;</li>
<li>overseas：全球（不含中国大陆）。</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 加速区域，取值有：
<li>mainland：中国大陆境内;</li>
<li>overseas：全球（不含中国大陆）。</li>
     * @param Area 加速区域，取值有：
<li>mainland：中国大陆境内;</li>
<li>overseas：全球（不含中国大陆）。</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DescribeTopL7AnalysisDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopL7AnalysisDataRequest(DescribeTopL7AnalysisDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

