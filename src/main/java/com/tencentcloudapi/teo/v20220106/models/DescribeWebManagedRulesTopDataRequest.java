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

public class DescribeWebManagedRulesTopDataRequest extends AbstractModel{

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
<li>waf_requestNum_url ：url请求数排行 ；</li>
<li>waf_requestNum_cip：客户端ip请求数排行 ；</li>
<li>waf_cipRequestNum_region ：客户端区域请求数排行 。</li>
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 查询前多少个，传值为0返回全量。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 站点id列表，不填默认选择全部站点。
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * 该字段已废弃，请勿传。
    */
    @SerializedName("PolicyIds")
    @Expose
    private Long [] PolicyIds;

    /**
    * 该字段已废弃，请勿传。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 该字段已废弃，请勿传。
    */
    @SerializedName("ProtocolType")
    @Expose
    private String ProtocolType;

    /**
    * 该字段已废弃，请勿传。
    */
    @SerializedName("AttackType")
    @Expose
    private String AttackType;

    /**
    * 域名列表，不填默认选择全部子域名。
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 查询时间粒度，取值有：
<li>min ：1分钟 ；</li>
<li>5min ：5分钟 ；</li>
<li>hour ：1小时 ；</li>
<li>day ：1天 。</li>
    */
    @SerializedName("Interval")
    @Expose
    private String Interval;

    /**
    * 筛选条件，取值有：
<li>action ：执行动作 。</li>
    */
    @SerializedName("QueryCondition")
    @Expose
    private QueryCondition [] QueryCondition;

    /**
    * 数据归属地区，取值有：
<li>overseas ：全球（除中国大陆地区）数据 ；</li>
<li>mainland ：中国大陆地区数据 。</li>不填默认查询overseas。
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
<li>waf_requestNum_url ：url请求数排行 ；</li>
<li>waf_requestNum_cip：客户端ip请求数排行 ；</li>
<li>waf_cipRequestNum_region ：客户端区域请求数排行 。</li> 
     * @return MetricName 统计指标列表，取值有：
<li>waf_requestNum_url ：url请求数排行 ；</li>
<li>waf_requestNum_cip：客户端ip请求数排行 ；</li>
<li>waf_cipRequestNum_region ：客户端区域请求数排行 。</li>
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * Set 统计指标列表，取值有：
<li>waf_requestNum_url ：url请求数排行 ；</li>
<li>waf_requestNum_cip：客户端ip请求数排行 ；</li>
<li>waf_cipRequestNum_region ：客户端区域请求数排行 。</li>
     * @param MetricName 统计指标列表，取值有：
<li>waf_requestNum_url ：url请求数排行 ；</li>
<li>waf_requestNum_cip：客户端ip请求数排行 ；</li>
<li>waf_cipRequestNum_region ：客户端区域请求数排行 。</li>
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * Get 查询前多少个，传值为0返回全量。 
     * @return Limit 查询前多少个，传值为0返回全量。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询前多少个，传值为0返回全量。
     * @param Limit 查询前多少个，传值为0返回全量。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 站点id列表，不填默认选择全部站点。 
     * @return ZoneIds 站点id列表，不填默认选择全部站点。
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 站点id列表，不填默认选择全部站点。
     * @param ZoneIds 站点id列表，不填默认选择全部站点。
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get 该字段已废弃，请勿传。 
     * @return PolicyIds 该字段已废弃，请勿传。
     */
    public Long [] getPolicyIds() {
        return this.PolicyIds;
    }

    /**
     * Set 该字段已废弃，请勿传。
     * @param PolicyIds 该字段已废弃，请勿传。
     */
    public void setPolicyIds(Long [] PolicyIds) {
        this.PolicyIds = PolicyIds;
    }

    /**
     * Get 该字段已废弃，请勿传。 
     * @return Port 该字段已废弃，请勿传。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 该字段已废弃，请勿传。
     * @param Port 该字段已废弃，请勿传。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 该字段已废弃，请勿传。 
     * @return ProtocolType 该字段已废弃，请勿传。
     */
    public String getProtocolType() {
        return this.ProtocolType;
    }

    /**
     * Set 该字段已废弃，请勿传。
     * @param ProtocolType 该字段已废弃，请勿传。
     */
    public void setProtocolType(String ProtocolType) {
        this.ProtocolType = ProtocolType;
    }

    /**
     * Get 该字段已废弃，请勿传。 
     * @return AttackType 该字段已废弃，请勿传。
     */
    public String getAttackType() {
        return this.AttackType;
    }

    /**
     * Set 该字段已废弃，请勿传。
     * @param AttackType 该字段已废弃，请勿传。
     */
    public void setAttackType(String AttackType) {
        this.AttackType = AttackType;
    }

    /**
     * Get 域名列表，不填默认选择全部子域名。 
     * @return Domains 域名列表，不填默认选择全部子域名。
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 域名列表，不填默认选择全部子域名。
     * @param Domains 域名列表，不填默认选择全部子域名。
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 查询时间粒度，取值有：
<li>min ：1分钟 ；</li>
<li>5min ：5分钟 ；</li>
<li>hour ：1小时 ；</li>
<li>day ：1天 。</li> 
     * @return Interval 查询时间粒度，取值有：
<li>min ：1分钟 ；</li>
<li>5min ：5分钟 ；</li>
<li>hour ：1小时 ；</li>
<li>day ：1天 。</li>
     */
    public String getInterval() {
        return this.Interval;
    }

    /**
     * Set 查询时间粒度，取值有：
<li>min ：1分钟 ；</li>
<li>5min ：5分钟 ；</li>
<li>hour ：1小时 ；</li>
<li>day ：1天 。</li>
     * @param Interval 查询时间粒度，取值有：
<li>min ：1分钟 ；</li>
<li>5min ：5分钟 ；</li>
<li>hour ：1小时 ；</li>
<li>day ：1天 。</li>
     */
    public void setInterval(String Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 筛选条件，取值有：
<li>action ：执行动作 。</li> 
     * @return QueryCondition 筛选条件，取值有：
<li>action ：执行动作 。</li>
     */
    public QueryCondition [] getQueryCondition() {
        return this.QueryCondition;
    }

    /**
     * Set 筛选条件，取值有：
<li>action ：执行动作 。</li>
     * @param QueryCondition 筛选条件，取值有：
<li>action ：执行动作 。</li>
     */
    public void setQueryCondition(QueryCondition [] QueryCondition) {
        this.QueryCondition = QueryCondition;
    }

    /**
     * Get 数据归属地区，取值有：
<li>overseas ：全球（除中国大陆地区）数据 ；</li>
<li>mainland ：中国大陆地区数据 。</li>不填默认查询overseas。 
     * @return Area 数据归属地区，取值有：
<li>overseas ：全球（除中国大陆地区）数据 ；</li>
<li>mainland ：中国大陆地区数据 。</li>不填默认查询overseas。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 数据归属地区，取值有：
<li>overseas ：全球（除中国大陆地区）数据 ；</li>
<li>mainland ：中国大陆地区数据 。</li>不填默认查询overseas。
     * @param Area 数据归属地区，取值有：
<li>overseas ：全球（除中国大陆地区）数据 ；</li>
<li>mainland ：中国大陆地区数据 。</li>不填默认查询overseas。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DescribeWebManagedRulesTopDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWebManagedRulesTopDataRequest(DescribeWebManagedRulesTopDataRequest source) {
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
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.PolicyIds != null) {
            this.PolicyIds = new Long[source.PolicyIds.length];
            for (int i = 0; i < source.PolicyIds.length; i++) {
                this.PolicyIds[i] = new Long(source.PolicyIds[i]);
            }
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.ProtocolType != null) {
            this.ProtocolType = new String(source.ProtocolType);
        }
        if (source.AttackType != null) {
            this.AttackType = new String(source.AttackType);
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
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
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArraySimple(map, prefix + "PolicyIds.", this.PolicyIds);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ProtocolType", this.ProtocolType);
        this.setParamSimple(map, prefix + "AttackType", this.AttackType);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamArrayObj(map, prefix + "QueryCondition.", this.QueryCondition);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

