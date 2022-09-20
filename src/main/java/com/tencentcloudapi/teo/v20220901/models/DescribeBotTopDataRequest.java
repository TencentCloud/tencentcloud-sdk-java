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

public class DescribeBotTopDataRequest extends AbstractModel{

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
    * 统计指标列表，取值有：
<li>bot_requestNum_labelType：请求次数标签类型分布排行；</li>
<li>bot_requestNum_url：请求次数url分布排行；</li>
<li>bot_cipRequestNum_region：请求次数区域客户端ip分布排行。</li>
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 站点集合，不填默认选择全部站点。
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * 域名集合，不填默认选择全部子域名。
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 查询前多少个数据，最多值为1000，不填默认默认为：10， 表示查询前top 10的数据。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询时间粒度，取值有：
<li>min：1分钟；</li>
<li>5min：5分钟；</li>
<li>hour：1小时；</li>
<li>day：1天。</li>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：一小时范围内以min粒度查询，两天范围内以5min粒度查询，七天范围内以hour粒度查询，超过七天以day粒度查询。
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * 筛选条件，key可选的值有：
<li>action：执行动作 。</li>
    */
    @SerializedName("QueryCondition")
    @Expose
    private QueryCondition [] QueryCondition;

    /**
    * 数据归属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据。</li>不填将根据用户所在地智能选择地区。
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
     * Get 统计指标列表，取值有：
<li>bot_requestNum_labelType：请求次数标签类型分布排行；</li>
<li>bot_requestNum_url：请求次数url分布排行；</li>
<li>bot_cipRequestNum_region：请求次数区域客户端ip分布排行。</li> 
     * @return MetricName 统计指标列表，取值有：
<li>bot_requestNum_labelType：请求次数标签类型分布排行；</li>
<li>bot_requestNum_url：请求次数url分布排行；</li>
<li>bot_cipRequestNum_region：请求次数区域客户端ip分布排行。</li>
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 统计指标列表，取值有：
<li>bot_requestNum_labelType：请求次数标签类型分布排行；</li>
<li>bot_requestNum_url：请求次数url分布排行；</li>
<li>bot_cipRequestNum_region：请求次数区域客户端ip分布排行。</li>
     * @param MetricName 统计指标列表，取值有：
<li>bot_requestNum_labelType：请求次数标签类型分布排行；</li>
<li>bot_requestNum_url：请求次数url分布排行；</li>
<li>bot_cipRequestNum_region：请求次数区域客户端ip分布排行。</li>
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 站点集合，不填默认选择全部站点。 
     * @return ZoneIds 站点集合，不填默认选择全部站点。
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 站点集合，不填默认选择全部站点。
     * @param ZoneIds 站点集合，不填默认选择全部站点。
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get 域名集合，不填默认选择全部子域名。 
     * @return Domains 域名集合，不填默认选择全部子域名。
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 域名集合，不填默认选择全部子域名。
     * @param Domains 域名集合，不填默认选择全部子域名。
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 查询前多少个数据，最多值为1000，不填默认默认为：10， 表示查询前top 10的数据。 
     * @return Limit 查询前多少个数据，最多值为1000，不填默认默认为：10， 表示查询前top 10的数据。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询前多少个数据，最多值为1000，不填默认默认为：10， 表示查询前top 10的数据。
     * @param Limit 查询前多少个数据，最多值为1000，不填默认默认为：10， 表示查询前top 10的数据。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询时间粒度，取值有：
<li>min：1分钟；</li>
<li>5min：5分钟；</li>
<li>hour：1小时；</li>
<li>day：1天。</li>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：一小时范围内以min粒度查询，两天范围内以5min粒度查询，七天范围内以hour粒度查询，超过七天以day粒度查询。 
     * @return Interval 查询时间粒度，取值有：
<li>min：1分钟；</li>
<li>5min：5分钟；</li>
<li>hour：1小时；</li>
<li>day：1天。</li>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：一小时范围内以min粒度查询，两天范围内以5min粒度查询，七天范围内以hour粒度查询，超过七天以day粒度查询。
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set 查询时间粒度，取值有：
<li>min：1分钟；</li>
<li>5min：5分钟；</li>
<li>hour：1小时；</li>
<li>day：1天。</li>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：一小时范围内以min粒度查询，两天范围内以5min粒度查询，七天范围内以hour粒度查询，超过七天以day粒度查询。
     * @param Interval 查询时间粒度，取值有：
<li>min：1分钟；</li>
<li>5min：5分钟；</li>
<li>hour：1小时；</li>
<li>day：1天。</li>不填将根据开始时间跟结束时间的间距自动推算粒度，具体为：一小时范围内以min粒度查询，两天范围内以5min粒度查询，七天范围内以hour粒度查询，超过七天以day粒度查询。
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 筛选条件，key可选的值有：
<li>action：执行动作 。</li> 
     * @return QueryCondition 筛选条件，key可选的值有：
<li>action：执行动作 。</li>
     */
    public QueryCondition [] getQueryCondition() {
        return this.QueryCondition;
    }

    /**
     * Set 筛选条件，key可选的值有：
<li>action：执行动作 。</li>
     * @param QueryCondition 筛选条件，key可选的值有：
<li>action：执行动作 。</li>
     */
    public void setQueryCondition(QueryCondition [] QueryCondition) {
        this.QueryCondition = QueryCondition;
    }

    /**
     * Get 数据归属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据。</li>不填将根据用户所在地智能选择地区。 
     * @return Area 数据归属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据。</li>不填将根据用户所在地智能选择地区。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 数据归属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据。</li>不填将根据用户所在地智能选择地区。
     * @param Area 数据归属地区，取值有：
<li>overseas：全球（除中国大陆地区）数据；</li>
<li>mainland：中国大陆地区数据。</li>不填将根据用户所在地智能选择地区。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DescribeBotTopDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBotTopDataRequest(DescribeBotTopDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.MetricName != null) {
            this.MetricName = new String(source.MetricName);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Interval != null) {
            this.Interval = new String(source.Interval);
        }
        if (source.QueryCondition != null) {
            this.QueryCondition = new QueryCondition[source.QueryCondition.length];
            for (int i = 0; i < source.QueryCondition.length; i++) {
                this.QueryCondition[i] = new QueryCondition(source.QueryCondition[i]);
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
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArrayObj(map, prefix + "QueryCondition.", this.QueryCondition);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

