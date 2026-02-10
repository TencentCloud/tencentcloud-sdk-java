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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditLogsRequest extends AbstractModel {

    /**
    * 实例ID，格式如：cmgo-xftsghuy，与云数据库控制台页面中显示的实例 ID 相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 开始时间，格式为："2017-07-12 10:29:20"。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，格式为："2017-07-12 10:29:20"。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 过滤条件，可按设置的过滤条件过滤日志。
    */
    @SerializedName("Filter")
    @Expose
    private AuditLogFilter Filter;

    /**
    * 分页参数，指单次返回的数据条数。默认值为100，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 审计日志的排序方式。
<ul><li>ASC：升序。</li><li>DESC：降序。</li></ul>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 审计日志的排序字段，包括：
<ul><li>timestamp：时间戳。</li>
<li>affectRows：影响行数。</li>
<li>execTime：执行时间。</li></ul>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
     * Get 实例ID，格式如：cmgo-xftsghuy，与云数据库控制台页面中显示的实例 ID 相同。 
     * @return InstanceId 实例ID，格式如：cmgo-xftsghuy，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，格式如：cmgo-xftsghuy，与云数据库控制台页面中显示的实例 ID 相同。
     * @param InstanceId 实例ID，格式如：cmgo-xftsghuy，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 开始时间，格式为："2017-07-12 10:29:20"。 
     * @return StartTime 开始时间，格式为："2017-07-12 10:29:20"。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间，格式为："2017-07-12 10:29:20"。
     * @param StartTime 开始时间，格式为："2017-07-12 10:29:20"。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，格式为："2017-07-12 10:29:20"。 
     * @return EndTime 结束时间，格式为："2017-07-12 10:29:20"。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，格式为："2017-07-12 10:29:20"。
     * @param EndTime 结束时间，格式为："2017-07-12 10:29:20"。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 过滤条件，可按设置的过滤条件过滤日志。 
     * @return Filter 过滤条件，可按设置的过滤条件过滤日志。
     */
    public AuditLogFilter getFilter() {
        return this.Filter;
    }

    /**
     * Set 过滤条件，可按设置的过滤条件过滤日志。
     * @param Filter 过滤条件，可按设置的过滤条件过滤日志。
     */
    public void setFilter(AuditLogFilter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 分页参数，指单次返回的数据条数。默认值为100，最大值为100。 
     * @return Limit 分页参数，指单次返回的数据条数。默认值为100，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数，指单次返回的数据条数。默认值为100，最大值为100。
     * @param Limit 分页参数，指单次返回的数据条数。默认值为100，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量。 
     * @return Offset 分页偏移量。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量。
     * @param Offset 分页偏移量。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 审计日志的排序方式。
<ul><li>ASC：升序。</li><li>DESC：降序。</li></ul> 
     * @return Order 审计日志的排序方式。
<ul><li>ASC：升序。</li><li>DESC：降序。</li></ul>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 审计日志的排序方式。
<ul><li>ASC：升序。</li><li>DESC：降序。</li></ul>
     * @param Order 审计日志的排序方式。
<ul><li>ASC：升序。</li><li>DESC：降序。</li></ul>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 审计日志的排序字段，包括：
<ul><li>timestamp：时间戳。</li>
<li>affectRows：影响行数。</li>
<li>execTime：执行时间。</li></ul> 
     * @return OrderBy 审计日志的排序字段，包括：
<ul><li>timestamp：时间戳。</li>
<li>affectRows：影响行数。</li>
<li>execTime：执行时间。</li></ul>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 审计日志的排序字段，包括：
<ul><li>timestamp：时间戳。</li>
<li>affectRows：影响行数。</li>
<li>execTime：执行时间。</li></ul>
     * @param OrderBy 审计日志的排序字段，包括：
<ul><li>timestamp：时间戳。</li>
<li>affectRows：影响行数。</li>
<li>execTime：执行时间。</li></ul>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    public DescribeAuditLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAuditLogsRequest(DescribeAuditLogsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Filter != null) {
            this.Filter = new AuditLogFilter(source.Filter);
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
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);

    }
}

