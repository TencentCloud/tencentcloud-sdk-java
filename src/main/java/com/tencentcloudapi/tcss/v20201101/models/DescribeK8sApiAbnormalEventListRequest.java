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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeK8sApiAbnormalEventListRequest extends AbstractModel {

    /**
    * <p>过滤条件。</p><li>TimeRange - string -是否必填: 否 - 时间范围筛选 ["2022-03-31 16:55:00", "2022-03-31 17:00:00"]</li><li>MatchRules - string  - 是否必填: 否 -命中规则筛选</li><li>RiskLevel - string  - 是否必填: 否 -威胁等级筛选</li><li>Status - string  - 是否必填: 否 -事件状态筛选</li><li>MatchRuleType - string  - 是否必填: 否 -命中规则类型筛选</li><li>ClusterRunningStatus - string  - 是否必填: 否 -集群运行状态</li><li>ClusterName - string  - 是否必填: 否 -集群名称</li><li>ClusterID - string  - 是否必填: 否 -集群ID</li>
    */
    @SerializedName("Filters")
    @Expose
    private RunTimeFilters [] Filters;

    /**
    * <p>需要返回的数量，默认为10，最大值为100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量，默认为0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>排序方式</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>排序字段<br>LatestFoundTime: 最近生成时间<br>AlarmCount: 告警数量</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <p>过滤条件。</p><li>TimeRange - string -是否必填: 否 - 时间范围筛选 ["2022-03-31 16:55:00", "2022-03-31 17:00:00"]</li><li>MatchRules - string  - 是否必填: 否 -命中规则筛选</li><li>RiskLevel - string  - 是否必填: 否 -威胁等级筛选</li><li>Status - string  - 是否必填: 否 -事件状态筛选</li><li>MatchRuleType - string  - 是否必填: 否 -命中规则类型筛选</li><li>ClusterRunningStatus - string  - 是否必填: 否 -集群运行状态</li><li>ClusterName - string  - 是否必填: 否 -集群名称</li><li>ClusterID - string  - 是否必填: 否 -集群ID</li> 
     * @return Filters <p>过滤条件。</p><li>TimeRange - string -是否必填: 否 - 时间范围筛选 ["2022-03-31 16:55:00", "2022-03-31 17:00:00"]</li><li>MatchRules - string  - 是否必填: 否 -命中规则筛选</li><li>RiskLevel - string  - 是否必填: 否 -威胁等级筛选</li><li>Status - string  - 是否必填: 否 -事件状态筛选</li><li>MatchRuleType - string  - 是否必填: 否 -命中规则类型筛选</li><li>ClusterRunningStatus - string  - 是否必填: 否 -集群运行状态</li><li>ClusterName - string  - 是否必填: 否 -集群名称</li><li>ClusterID - string  - 是否必填: 否 -集群ID</li>
     */
    public RunTimeFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件。</p><li>TimeRange - string -是否必填: 否 - 时间范围筛选 ["2022-03-31 16:55:00", "2022-03-31 17:00:00"]</li><li>MatchRules - string  - 是否必填: 否 -命中规则筛选</li><li>RiskLevel - string  - 是否必填: 否 -威胁等级筛选</li><li>Status - string  - 是否必填: 否 -事件状态筛选</li><li>MatchRuleType - string  - 是否必填: 否 -命中规则类型筛选</li><li>ClusterRunningStatus - string  - 是否必填: 否 -集群运行状态</li><li>ClusterName - string  - 是否必填: 否 -集群名称</li><li>ClusterID - string  - 是否必填: 否 -集群ID</li>
     * @param Filters <p>过滤条件。</p><li>TimeRange - string -是否必填: 否 - 时间范围筛选 ["2022-03-31 16:55:00", "2022-03-31 17:00:00"]</li><li>MatchRules - string  - 是否必填: 否 -命中规则筛选</li><li>RiskLevel - string  - 是否必填: 否 -威胁等级筛选</li><li>Status - string  - 是否必填: 否 -事件状态筛选</li><li>MatchRuleType - string  - 是否必填: 否 -命中规则类型筛选</li><li>ClusterRunningStatus - string  - 是否必填: 否 -集群运行状态</li><li>ClusterName - string  - 是否必填: 否 -集群名称</li><li>ClusterID - string  - 是否必填: 否 -集群ID</li>
     */
    public void setFilters(RunTimeFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>需要返回的数量，默认为10，最大值为100</p> 
     * @return Limit <p>需要返回的数量，默认为10，最大值为100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>需要返回的数量，默认为10，最大值为100</p>
     * @param Limit <p>需要返回的数量，默认为10，最大值为100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量，默认为0。</p> 
     * @return Offset <p>偏移量，默认为0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为0。</p>
     * @param Offset <p>偏移量，默认为0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>排序方式</p> 
     * @return Order <p>排序方式</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序方式</p>
     * @param Order <p>排序方式</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>排序字段<br>LatestFoundTime: 最近生成时间<br>AlarmCount: 告警数量</p> 
     * @return By <p>排序字段<br>LatestFoundTime: 最近生成时间<br>AlarmCount: 告警数量</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>排序字段<br>LatestFoundTime: 最近生成时间<br>AlarmCount: 告警数量</p>
     * @param By <p>排序字段<br>LatestFoundTime: 最近生成时间<br>AlarmCount: 告警数量</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeK8sApiAbnormalEventListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeK8sApiAbnormalEventListRequest(DescribeK8sApiAbnormalEventListRequest source) {
        if (source.Filters != null) {
            this.Filters = new RunTimeFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new RunTimeFilters(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

