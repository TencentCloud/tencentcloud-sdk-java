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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTasksRequest extends AbstractModel {

    /**
    * 按照任务ID进行查询。其余云API中返回的FlowId和TaskId等价。
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 按照数据库实例ID进行查询。
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 任务的最早开始时间，形如2024-08-23 00:00:00,默认只展示180天内的数据。
    */
    @SerializedName("MinStartTime")
    @Expose
    private String MinStartTime;

    /**
    * 任务的最晚开始时间，形如2024-08-23 00:00:00，默认为当前时间。
    */
    @SerializedName("MaxStartTime")
    @Expose
    private String MaxStartTime;

    /**
    * 每页显示数量，取值范围为1-100，默认为返回20条。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 数据偏移量，从0开始。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序字段，支持StartTime,EndTime，默认为StartTime。
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序方式，包括升序：asc，降序：desc，默认为desc。
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get 按照任务ID进行查询。其余云API中返回的FlowId和TaskId等价。 
     * @return TaskId 按照任务ID进行查询。其余云API中返回的FlowId和TaskId等价。
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 按照任务ID进行查询。其余云API中返回的FlowId和TaskId等价。
     * @param TaskId 按照任务ID进行查询。其余云API中返回的FlowId和TaskId等价。
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 按照数据库实例ID进行查询。 
     * @return DBInstanceId 按照数据库实例ID进行查询。
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 按照数据库实例ID进行查询。
     * @param DBInstanceId 按照数据库实例ID进行查询。
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 任务的最早开始时间，形如2024-08-23 00:00:00,默认只展示180天内的数据。 
     * @return MinStartTime 任务的最早开始时间，形如2024-08-23 00:00:00,默认只展示180天内的数据。
     */
    public String getMinStartTime() {
        return this.MinStartTime;
    }

    /**
     * Set 任务的最早开始时间，形如2024-08-23 00:00:00,默认只展示180天内的数据。
     * @param MinStartTime 任务的最早开始时间，形如2024-08-23 00:00:00,默认只展示180天内的数据。
     */
    public void setMinStartTime(String MinStartTime) {
        this.MinStartTime = MinStartTime;
    }

    /**
     * Get 任务的最晚开始时间，形如2024-08-23 00:00:00，默认为当前时间。 
     * @return MaxStartTime 任务的最晚开始时间，形如2024-08-23 00:00:00，默认为当前时间。
     */
    public String getMaxStartTime() {
        return this.MaxStartTime;
    }

    /**
     * Set 任务的最晚开始时间，形如2024-08-23 00:00:00，默认为当前时间。
     * @param MaxStartTime 任务的最晚开始时间，形如2024-08-23 00:00:00，默认为当前时间。
     */
    public void setMaxStartTime(String MaxStartTime) {
        this.MaxStartTime = MaxStartTime;
    }

    /**
     * Get 每页显示数量，取值范围为1-100，默认为返回20条。 
     * @return Limit 每页显示数量，取值范围为1-100，默认为返回20条。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页显示数量，取值范围为1-100，默认为返回20条。
     * @param Limit 每页显示数量，取值范围为1-100，默认为返回20条。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 数据偏移量，从0开始。 
     * @return Offset 数据偏移量，从0开始。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 数据偏移量，从0开始。
     * @param Offset 数据偏移量，从0开始。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序字段，支持StartTime,EndTime，默认为StartTime。 
     * @return OrderBy 排序字段，支持StartTime,EndTime，默认为StartTime。
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段，支持StartTime,EndTime，默认为StartTime。
     * @param OrderBy 排序字段，支持StartTime,EndTime，默认为StartTime。
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序方式，包括升序：asc，降序：desc，默认为desc。 
     * @return OrderByType 排序方式，包括升序：asc，降序：desc，默认为desc。
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 排序方式，包括升序：asc，降序：desc，默认为desc。
     * @param OrderByType 排序方式，包括升序：asc，降序：desc，默认为desc。
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    public DescribeTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTasksRequest(DescribeTasksRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.MinStartTime != null) {
            this.MinStartTime = new String(source.MinStartTime);
        }
        if (source.MaxStartTime != null) {
            this.MaxStartTime = new String(source.MaxStartTime);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "MinStartTime", this.MinStartTime);
        this.setParamSimple(map, prefix + "MaxStartTime", this.MaxStartTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

