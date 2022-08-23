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

public class DescribeTimingL7CacheDataRequest extends AbstractModel{

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
    * 时序类访问流量指标列表，支持的指标
l7Cache_outFlux: 访问流量
l7Cache_request: 访问请求数
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * 时间间隔，选填{min, 5min, hour, day, week}
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * 站点id列表
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * 筛选条件，筛选EO/源站响应如下：
EO响应：{Key: "cacheType", Value: ["hit"], Operator: "equals"}；
源站响应：{Key: "cacheType", Value: ["miss", "dynamic"], Operator: "equals"}
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
     * Get 时序类访问流量指标列表，支持的指标
l7Cache_outFlux: 访问流量
l7Cache_request: 访问请求数 
     * @return MetricNames 时序类访问流量指标列表，支持的指标
l7Cache_outFlux: 访问流量
l7Cache_request: 访问请求数
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set 时序类访问流量指标列表，支持的指标
l7Cache_outFlux: 访问流量
l7Cache_request: 访问请求数
     * @param MetricNames 时序类访问流量指标列表，支持的指标
l7Cache_outFlux: 访问流量
l7Cache_request: 访问请求数
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
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
     * Get 站点id列表 
     * @return ZoneIds 站点id列表
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 站点id列表
     * @param ZoneIds 站点id列表
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get 筛选条件，筛选EO/源站响应如下：
EO响应：{Key: "cacheType", Value: ["hit"], Operator: "equals"}；
源站响应：{Key: "cacheType", Value: ["miss", "dynamic"], Operator: "equals"} 
     * @return Filters 筛选条件，筛选EO/源站响应如下：
EO响应：{Key: "cacheType", Value: ["hit"], Operator: "equals"}；
源站响应：{Key: "cacheType", Value: ["miss", "dynamic"], Operator: "equals"}
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 筛选条件，筛选EO/源站响应如下：
EO响应：{Key: "cacheType", Value: ["hit"], Operator: "equals"}；
源站响应：{Key: "cacheType", Value: ["miss", "dynamic"], Operator: "equals"}
     * @param Filters 筛选条件，筛选EO/源站响应如下：
EO响应：{Key: "cacheType", Value: ["hit"], Operator: "equals"}；
源站响应：{Key: "cacheType", Value: ["miss", "dynamic"], Operator: "equals"}
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

    public DescribeTimingL7CacheDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimingL7CacheDataRequest(DescribeTimingL7CacheDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MetricNames != null) {
            this.MetricNames = new String[source.MetricNames.length];
            for (int i = 0; i < source.MetricNames.length; i++) {
                this.MetricNames[i] = new String(source.MetricNames[i]);
            }
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
        this.setParamArraySimple(map, prefix + "MetricNames.", this.MetricNames);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

