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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeServiceOverviewRequest extends AbstractModel{

    /**
    * 过滤条件
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 指标列表
    */
    @SerializedName("Metrics")
    @Expose
    private QueryMetricItem [] Metrics;

    /**
    * 聚合维度
    */
    @SerializedName("GroupBy")
    @Expose
    private String [] GroupBy;

    /**
    * 排序
    */
    @SerializedName("OrderBy")
    @Expose
    private OrderBy OrderBy;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 每页大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 分页起始点
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get 过滤条件 
     * @return Filters 过滤条件
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件
     * @param Filters 过滤条件
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 指标列表 
     * @return Metrics 指标列表
     */
    public QueryMetricItem [] getMetrics() {
        return this.Metrics;
    }

    /**
     * Set 指标列表
     * @param Metrics 指标列表
     */
    public void setMetrics(QueryMetricItem [] Metrics) {
        this.Metrics = Metrics;
    }

    /**
     * Get 聚合维度 
     * @return GroupBy 聚合维度
     */
    public String [] getGroupBy() {
        return this.GroupBy;
    }

    /**
     * Set 聚合维度
     * @param GroupBy 聚合维度
     */
    public void setGroupBy(String [] GroupBy) {
        this.GroupBy = GroupBy;
    }

    /**
     * Get 排序 
     * @return OrderBy 排序
     */
    public OrderBy getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序
     * @param OrderBy 排序
     */
    public void setOrderBy(OrderBy OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 每页大小 
     * @return Limit 每页大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页大小
     * @param Limit 每页大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 分页起始点 
     * @return Offset 分页起始点
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页起始点
     * @param Offset 分页起始点
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeServiceOverviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeServiceOverviewRequest(DescribeServiceOverviewRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Metrics != null) {
            this.Metrics = new QueryMetricItem[source.Metrics.length];
            for (int i = 0; i < source.Metrics.length; i++) {
                this.Metrics[i] = new QueryMetricItem(source.Metrics[i]);
            }
        }
        if (source.GroupBy != null) {
            this.GroupBy = new String[source.GroupBy.length];
            for (int i = 0; i < source.GroupBy.length; i++) {
                this.GroupBy[i] = new String(source.GroupBy[i]);
            }
        }
        if (source.OrderBy != null) {
            this.OrderBy = new OrderBy(source.OrderBy);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "Metrics.", this.Metrics);
        this.setParamArraySimple(map, prefix + "GroupBy.", this.GroupBy);
        this.setParamObj(map, prefix + "OrderBy.", this.OrderBy);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

