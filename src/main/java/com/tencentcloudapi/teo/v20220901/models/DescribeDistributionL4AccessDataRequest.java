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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDistributionL4AccessDataRequest extends AbstractModel{

    /**
    * 开始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 查询指标, 取值有：
<li>l4Flow_connection_distribution：连接时长分布情况。</li>
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * 站点ID集合，不填默认选择全部站点。
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * 查询时间粒度，取值有：
<li>min：1分钟；</li>
<li>5min：5分钟；</li>
<li>hour：1小时；</li>
<li>day：1天;。</li>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：一小时范围内以min粒度查询，两天范围内以5min粒度查询，七天范围内以hour粒度查询，超过七天以day粒度查询。
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * 过滤条件，详细的过滤条件如下：
<li>ruleId<br>   按照【<strong>转发规则ID</strong>】进行过滤。<br>   类型：String<br>   必选：否</li>
<li>proxyId<br>   按照【<strong>四层代理实例ID</strong>】进行过滤。<br>   类型：String<br>   必选：否</li>
    */
    @SerializedName("QueryConditions")
    @Expose
    private QueryCondition [] QueryConditions;

    /**
    * 数据归属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据；</li>
<li>global：全球数据。</li>不填默认取值为global。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get 开始时间。 
     * @return StartTime 开始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间。
     * @param StartTime 开始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间。 
     * @return EndTime 结束时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间。
     * @param EndTime 结束时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 查询指标, 取值有：
<li>l4Flow_connection_distribution：连接时长分布情况。</li> 
     * @return MetricNames 查询指标, 取值有：
<li>l4Flow_connection_distribution：连接时长分布情况。</li>
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set 查询指标, 取值有：
<li>l4Flow_connection_distribution：连接时长分布情况。</li>
     * @param MetricNames 查询指标, 取值有：
<li>l4Flow_connection_distribution：连接时长分布情况。</li>
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get 站点ID集合，不填默认选择全部站点。 
     * @return ZoneIds 站点ID集合，不填默认选择全部站点。
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 站点ID集合，不填默认选择全部站点。
     * @param ZoneIds 站点ID集合，不填默认选择全部站点。
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get 查询时间粒度，取值有：
<li>min：1分钟；</li>
<li>5min：5分钟；</li>
<li>hour：1小时；</li>
<li>day：1天;。</li>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：一小时范围内以min粒度查询，两天范围内以5min粒度查询，七天范围内以hour粒度查询，超过七天以day粒度查询。 
     * @return Interval 查询时间粒度，取值有：
<li>min：1分钟；</li>
<li>5min：5分钟；</li>
<li>hour：1小时；</li>
<li>day：1天;。</li>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：一小时范围内以min粒度查询，两天范围内以5min粒度查询，七天范围内以hour粒度查询，超过七天以day粒度查询。
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set 查询时间粒度，取值有：
<li>min：1分钟；</li>
<li>5min：5分钟；</li>
<li>hour：1小时；</li>
<li>day：1天;。</li>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：一小时范围内以min粒度查询，两天范围内以5min粒度查询，七天范围内以hour粒度查询，超过七天以day粒度查询。
     * @param Interval 查询时间粒度，取值有：
<li>min：1分钟；</li>
<li>5min：5分钟；</li>
<li>hour：1小时；</li>
<li>day：1天;。</li>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：一小时范围内以min粒度查询，两天范围内以5min粒度查询，七天范围内以hour粒度查询，超过七天以day粒度查询。
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 过滤条件，详细的过滤条件如下：
<li>ruleId<br>   按照【<strong>转发规则ID</strong>】进行过滤。<br>   类型：String<br>   必选：否</li>
<li>proxyId<br>   按照【<strong>四层代理实例ID</strong>】进行过滤。<br>   类型：String<br>   必选：否</li> 
     * @return QueryConditions 过滤条件，详细的过滤条件如下：
<li>ruleId<br>   按照【<strong>转发规则ID</strong>】进行过滤。<br>   类型：String<br>   必选：否</li>
<li>proxyId<br>   按照【<strong>四层代理实例ID</strong>】进行过滤。<br>   类型：String<br>   必选：否</li>
     */
    public QueryCondition [] getQueryConditions() {
        return this.QueryConditions;
    }

    /**
     * Set 过滤条件，详细的过滤条件如下：
<li>ruleId<br>   按照【<strong>转发规则ID</strong>】进行过滤。<br>   类型：String<br>   必选：否</li>
<li>proxyId<br>   按照【<strong>四层代理实例ID</strong>】进行过滤。<br>   类型：String<br>   必选：否</li>
     * @param QueryConditions 过滤条件，详细的过滤条件如下：
<li>ruleId<br>   按照【<strong>转发规则ID</strong>】进行过滤。<br>   类型：String<br>   必选：否</li>
<li>proxyId<br>   按照【<strong>四层代理实例ID</strong>】进行过滤。<br>   类型：String<br>   必选：否</li>
     */
    public void setQueryConditions(QueryCondition [] QueryConditions) {
        this.QueryConditions = QueryConditions;
    }

    /**
     * Get 数据归属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据；</li>
<li>global：全球数据。</li>不填默认取值为global。 
     * @return Area 数据归属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据；</li>
<li>global：全球数据。</li>不填默认取值为global。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 数据归属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据；</li>
<li>global：全球数据。</li>不填默认取值为global。
     * @param Area 数据归属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据；</li>
<li>global：全球数据。</li>不填默认取值为global。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DescribeDistributionL4AccessDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDistributionL4AccessDataRequest(DescribeDistributionL4AccessDataRequest source) {
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
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.QueryConditions != null) {
            this.QueryConditions = new QueryCondition[source.QueryConditions.length];
            for (int i = 0; i < source.QueryConditions.length; i++) {
                this.QueryConditions[i] = new QueryCondition(source.QueryConditions[i]);
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
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArrayObj(map, prefix + "QueryConditions.", this.QueryConditions);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

