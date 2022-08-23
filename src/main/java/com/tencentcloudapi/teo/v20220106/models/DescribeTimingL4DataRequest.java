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

public class DescribeTimingL4DataRequest extends AbstractModel{

    /**
    * RFC3339格式，客户端时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * RFC3339格式，客户端时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 支持的指标：
l4Flow_connections: 访问连接数
l4Flow_flux: 访问总流量
l4Flow_inFlux: 访问入流量
l4Flow_outFlux: 访问出流量
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * 站点id列表
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * 该字段已废弃，请使用ProxyIds字段
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 该字段当前无效
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 时间间隔，选填{min, 5min, hour, day}
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * 该字段当前无效，请使用Filter筛选
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 支持的 Filter：proxyd,ruleId
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 四层实例列表
    */
    @SerializedName("ProxyIds")
    @Expose
    private String [] ProxyIds;

    /**
    * 加速区域，取值有：
<li>mainland：中国大陆境内;</li>
<li>overseas：全球（不含中国大陆）。</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get RFC3339格式，客户端时间 
     * @return StartTime RFC3339格式，客户端时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set RFC3339格式，客户端时间
     * @param StartTime RFC3339格式，客户端时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get RFC3339格式，客户端时间 
     * @return EndTime RFC3339格式，客户端时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set RFC3339格式，客户端时间
     * @param EndTime RFC3339格式，客户端时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 支持的指标：
l4Flow_connections: 访问连接数
l4Flow_flux: 访问总流量
l4Flow_inFlux: 访问入流量
l4Flow_outFlux: 访问出流量 
     * @return MetricNames 支持的指标：
l4Flow_connections: 访问连接数
l4Flow_flux: 访问总流量
l4Flow_inFlux: 访问入流量
l4Flow_outFlux: 访问出流量
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set 支持的指标：
l4Flow_connections: 访问连接数
l4Flow_flux: 访问总流量
l4Flow_inFlux: 访问入流量
l4Flow_outFlux: 访问出流量
     * @param MetricNames 支持的指标：
l4Flow_connections: 访问连接数
l4Flow_flux: 访问总流量
l4Flow_inFlux: 访问入流量
l4Flow_outFlux: 访问出流量
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
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
     * Get 该字段已废弃，请使用ProxyIds字段 
     * @return InstanceIds 该字段已废弃，请使用ProxyIds字段
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 该字段已废弃，请使用ProxyIds字段
     * @param InstanceIds 该字段已废弃，请使用ProxyIds字段
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 该字段当前无效 
     * @return Protocol 该字段当前无效
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 该字段当前无效
     * @param Protocol 该字段当前无效
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 时间间隔，选填{min, 5min, hour, day} 
     * @return Interval 时间间隔，选填{min, 5min, hour, day}
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set 时间间隔，选填{min, 5min, hour, day}
     * @param Interval 时间间隔，选填{min, 5min, hour, day}
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 该字段当前无效，请使用Filter筛选 
     * @return RuleId 该字段当前无效，请使用Filter筛选
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 该字段当前无效，请使用Filter筛选
     * @param RuleId 该字段当前无效，请使用Filter筛选
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 支持的 Filter：proxyd,ruleId 
     * @return Filters 支持的 Filter：proxyd,ruleId
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 支持的 Filter：proxyd,ruleId
     * @param Filters 支持的 Filter：proxyd,ruleId
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 四层实例列表 
     * @return ProxyIds 四层实例列表
     */
    public String [] getProxyIds() {
        return this.ProxyIds;
    }

    /**
     * Set 四层实例列表
     * @param ProxyIds 四层实例列表
     */
    public void setProxyIds(String [] ProxyIds) {
        this.ProxyIds = ProxyIds;
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

    public DescribeTimingL4DataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimingL4DataRequest(DescribeTimingL4DataRequest source) {
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
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.ProxyIds != null) {
            this.ProxyIds = new String[source.ProxyIds.length];
            for (int i = 0; i < source.ProxyIds.length; i++) {
                this.ProxyIds[i] = new String(source.ProxyIds[i]);
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
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "ProxyIds.", this.ProxyIds);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

