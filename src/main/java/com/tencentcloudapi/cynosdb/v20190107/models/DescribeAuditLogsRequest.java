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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditLogsRequest extends AbstractModel {

    /**
    * 实例 ID。
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
    * 排序方式。支持值包括："ASC" - 升序，"DESC" - 降序。
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序字段。支持值包括：
"timestamp" - 时间戳；
"affectRows" - 影响行数；
"execTime" - 执行时间。
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 已废弃。
    */
    @SerializedName("Filter")
    @Expose
    private AuditLogFilter Filter;

    /**
    * 分页参数，单次返回的数据条数。默认值为100，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量。
说明：Limit 和 Offset 的取值之和需小于等于65536。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤条件。多个值之前是且的关系。
    */
    @SerializedName("LogFilter")
    @Expose
    private InstanceAuditLogFilter [] LogFilter;

    /**
     * Get 实例 ID。 
     * @return InstanceId 实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
     * @param InstanceId 实例 ID。
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
     * Get 排序方式。支持值包括："ASC" - 升序，"DESC" - 降序。 
     * @return Order 排序方式。支持值包括："ASC" - 升序，"DESC" - 降序。
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式。支持值包括："ASC" - 升序，"DESC" - 降序。
     * @param Order 排序方式。支持值包括："ASC" - 升序，"DESC" - 降序。
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序字段。支持值包括：
"timestamp" - 时间戳；
"affectRows" - 影响行数；
"execTime" - 执行时间。 
     * @return OrderBy 排序字段。支持值包括：
"timestamp" - 时间戳；
"affectRows" - 影响行数；
"execTime" - 执行时间。
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段。支持值包括：
"timestamp" - 时间戳；
"affectRows" - 影响行数；
"execTime" - 执行时间。
     * @param OrderBy 排序字段。支持值包括：
"timestamp" - 时间戳；
"affectRows" - 影响行数；
"execTime" - 执行时间。
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 已废弃。 
     * @return Filter 已废弃。
     * @deprecated
     */
    @Deprecated
    public AuditLogFilter getFilter() {
        return this.Filter;
    }

    /**
     * Set 已废弃。
     * @param Filter 已废弃。
     * @deprecated
     */
    @Deprecated
    public void setFilter(AuditLogFilter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 分页参数，单次返回的数据条数。默认值为100，最大值为100。 
     * @return Limit 分页参数，单次返回的数据条数。默认值为100，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数，单次返回的数据条数。默认值为100，最大值为100。
     * @param Limit 分页参数，单次返回的数据条数。默认值为100，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量。
说明：Limit 和 Offset 的取值之和需小于等于65536。 
     * @return Offset 分页偏移量。
说明：Limit 和 Offset 的取值之和需小于等于65536。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量。
说明：Limit 和 Offset 的取值之和需小于等于65536。
     * @param Offset 分页偏移量。
说明：Limit 和 Offset 的取值之和需小于等于65536。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤条件。多个值之前是且的关系。 
     * @return LogFilter 过滤条件。多个值之前是且的关系。
     */
    public InstanceAuditLogFilter [] getLogFilter() {
        return this.LogFilter;
    }

    /**
     * Set 过滤条件。多个值之前是且的关系。
     * @param LogFilter 过滤条件。多个值之前是且的关系。
     */
    public void setLogFilter(InstanceAuditLogFilter [] LogFilter) {
        this.LogFilter = LogFilter;
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
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
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
        if (source.LogFilter != null) {
            this.LogFilter = new InstanceAuditLogFilter[source.LogFilter.length];
            for (int i = 0; i < source.LogFilter.length; i++) {
                this.LogFilter[i] = new InstanceAuditLogFilter(source.LogFilter[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "LogFilter.", this.LogFilter);

    }
}

