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

public class DescribeWebManagedRulesLogRequest extends AbstractModel{

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
    * 分页查询的限制数目，默认值为20，最大查询条目为1000。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页的偏移量，默认值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 筛选条件，key可选的值有：
<li>attackType：攻击类型；</li>
<li>riskLevel：风险等级；</li>
<li>action：执行动作（处置方式）；</li>
<li>ruleId：规则id；</li>
<li>sipCountryCode：ip所在国家；</li>
<li>attackIp：攻击ip；</li>
<li>oriDomain：被攻击的子域名；</li>
<li>eventId：事件id；</li>
<li>ua：用户代理；</li>
<li>requestMethod：请求方法；</li>
<li>uri：统一资源标识符。</li>
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
     * Get 分页查询的限制数目，默认值为20，最大查询条目为1000。 
     * @return Limit 分页查询的限制数目，默认值为20，最大查询条目为1000。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查询的限制数目，默认值为20，最大查询条目为1000。
     * @param Limit 分页查询的限制数目，默认值为20，最大查询条目为1000。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页的偏移量，默认值为0。 
     * @return Offset 分页的偏移量，默认值为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页的偏移量，默认值为0。
     * @param Offset 分页的偏移量，默认值为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 筛选条件，key可选的值有：
<li>attackType：攻击类型；</li>
<li>riskLevel：风险等级；</li>
<li>action：执行动作（处置方式）；</li>
<li>ruleId：规则id；</li>
<li>sipCountryCode：ip所在国家；</li>
<li>attackIp：攻击ip；</li>
<li>oriDomain：被攻击的子域名；</li>
<li>eventId：事件id；</li>
<li>ua：用户代理；</li>
<li>requestMethod：请求方法；</li>
<li>uri：统一资源标识符。</li> 
     * @return QueryCondition 筛选条件，key可选的值有：
<li>attackType：攻击类型；</li>
<li>riskLevel：风险等级；</li>
<li>action：执行动作（处置方式）；</li>
<li>ruleId：规则id；</li>
<li>sipCountryCode：ip所在国家；</li>
<li>attackIp：攻击ip；</li>
<li>oriDomain：被攻击的子域名；</li>
<li>eventId：事件id；</li>
<li>ua：用户代理；</li>
<li>requestMethod：请求方法；</li>
<li>uri：统一资源标识符。</li>
     */
    public QueryCondition [] getQueryCondition() {
        return this.QueryCondition;
    }

    /**
     * Set 筛选条件，key可选的值有：
<li>attackType：攻击类型；</li>
<li>riskLevel：风险等级；</li>
<li>action：执行动作（处置方式）；</li>
<li>ruleId：规则id；</li>
<li>sipCountryCode：ip所在国家；</li>
<li>attackIp：攻击ip；</li>
<li>oriDomain：被攻击的子域名；</li>
<li>eventId：事件id；</li>
<li>ua：用户代理；</li>
<li>requestMethod：请求方法；</li>
<li>uri：统一资源标识符。</li>
     * @param QueryCondition 筛选条件，key可选的值有：
<li>attackType：攻击类型；</li>
<li>riskLevel：风险等级；</li>
<li>action：执行动作（处置方式）；</li>
<li>ruleId：规则id；</li>
<li>sipCountryCode：ip所在国家；</li>
<li>attackIp：攻击ip；</li>
<li>oriDomain：被攻击的子域名；</li>
<li>eventId：事件id；</li>
<li>ua：用户代理；</li>
<li>requestMethod：请求方法；</li>
<li>uri：统一资源标识符。</li>
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

    public DescribeWebManagedRulesLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWebManagedRulesLogRequest(DescribeWebManagedRulesLogRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
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
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "QueryCondition.", this.QueryCondition);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

