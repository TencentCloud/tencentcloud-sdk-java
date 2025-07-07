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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAuditLogsRequest extends AbstractModel {

    /**
    * 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 开始时间(建议开始到结束时间区间最大7天)。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间(建议开始到结束时间区间最大7天）。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 分页参数，单次返回的数据条数。默认值为100，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 日志偏移量，最多支持偏移查询65535条日志。可填写范围：0 - 65535。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序方式。支持值包括："ASC" - 升序，"DESC" - 降序，默认降序排序。
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序字段。支持值包括(默认按照时间戳排序)：
"timestamp" - 时间戳；
"affectRows" - 影响行数；
"execTime" - 执行时间。
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 过滤条件。多个值之前是且的关系。
    */
    @SerializedName("LogFilter")
    @Expose
    private InstanceAuditLogFilters [] LogFilter;

    /**
     * Get 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。 
     * @return InstanceId 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     * @param InstanceId 实例 ID。可通过 [DescribeDBInstances](https://cloud.tencent.com/document/product/236/15872) 接口获取。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 开始时间(建议开始到结束时间区间最大7天)。 
     * @return StartTime 开始时间(建议开始到结束时间区间最大7天)。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间(建议开始到结束时间区间最大7天)。
     * @param StartTime 开始时间(建议开始到结束时间区间最大7天)。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间(建议开始到结束时间区间最大7天）。 
     * @return EndTime 结束时间(建议开始到结束时间区间最大7天）。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间(建议开始到结束时间区间最大7天）。
     * @param EndTime 结束时间(建议开始到结束时间区间最大7天）。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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
     * Get 日志偏移量，最多支持偏移查询65535条日志。可填写范围：0 - 65535。 
     * @return Offset 日志偏移量，最多支持偏移查询65535条日志。可填写范围：0 - 65535。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 日志偏移量，最多支持偏移查询65535条日志。可填写范围：0 - 65535。
     * @param Offset 日志偏移量，最多支持偏移查询65535条日志。可填写范围：0 - 65535。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序方式。支持值包括："ASC" - 升序，"DESC" - 降序，默认降序排序。 
     * @return Order 排序方式。支持值包括："ASC" - 升序，"DESC" - 降序，默认降序排序。
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式。支持值包括："ASC" - 升序，"DESC" - 降序，默认降序排序。
     * @param Order 排序方式。支持值包括："ASC" - 升序，"DESC" - 降序，默认降序排序。
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序字段。支持值包括(默认按照时间戳排序)：
"timestamp" - 时间戳；
"affectRows" - 影响行数；
"execTime" - 执行时间。 
     * @return OrderBy 排序字段。支持值包括(默认按照时间戳排序)：
"timestamp" - 时间戳；
"affectRows" - 影响行数；
"execTime" - 执行时间。
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段。支持值包括(默认按照时间戳排序)：
"timestamp" - 时间戳；
"affectRows" - 影响行数；
"execTime" - 执行时间。
     * @param OrderBy 排序字段。支持值包括(默认按照时间戳排序)：
"timestamp" - 时间戳；
"affectRows" - 影响行数；
"execTime" - 执行时间。
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 过滤条件。多个值之前是且的关系。 
     * @return LogFilter 过滤条件。多个值之前是且的关系。
     */
    public InstanceAuditLogFilters [] getLogFilter() {
        return this.LogFilter;
    }

    /**
     * Set 过滤条件。多个值之前是且的关系。
     * @param LogFilter 过滤条件。多个值之前是且的关系。
     */
    public void setLogFilter(InstanceAuditLogFilters [] LogFilter) {
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
        if (source.LogFilter != null) {
            this.LogFilter = new InstanceAuditLogFilters[source.LogFilter.length];
            for (int i = 0; i < source.LogFilter.length; i++) {
                this.LogFilter[i] = new InstanceAuditLogFilters(source.LogFilter[i]);
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
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamArrayObj(map, prefix + "LogFilter.", this.LogFilter);

    }
}

