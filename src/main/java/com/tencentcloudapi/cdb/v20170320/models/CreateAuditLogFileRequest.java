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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAuditLogFileRequest extends AbstractModel{

    /**
    * 实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
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
    * 过滤条件。可按设置的过滤条件过滤日志。
    */
    @SerializedName("Filter")
    @Expose
    private AuditLogFilter Filter;

    /**
     * Get 实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。 
     * @return InstanceId 实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     * @param InstanceId 实例 ID，格式如：cdb-c1nl9rpv 或者 cdbro-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
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
     * Get 过滤条件。可按设置的过滤条件过滤日志。 
     * @return Filter 过滤条件。可按设置的过滤条件过滤日志。
     */
    public AuditLogFilter getFilter() {
        return this.Filter;
    }

    /**
     * Set 过滤条件。可按设置的过滤条件过滤日志。
     * @param Filter 过滤条件。可按设置的过滤条件过滤日志。
     */
    public void setFilter(AuditLogFilter Filter) {
        this.Filter = Filter;
    }

    public CreateAuditLogFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAuditLogFileRequest(CreateAuditLogFileRequest source) {
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

    }
}

