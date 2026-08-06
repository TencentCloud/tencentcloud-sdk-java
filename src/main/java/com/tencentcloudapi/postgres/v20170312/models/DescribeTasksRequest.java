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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTasksRequest extends AbstractModel {

    /**
    * <p>按照任务ID进行查询。其余云API中返回的FlowId和TaskId等价。</p>
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * <p>按照数据库实例ID进行查询。</p>
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * <p>任务的最早开始时间，形如2024-08-23 00:00:00,默认只展示180天内的数据。</p>
    */
    @SerializedName("MinStartTime")
    @Expose
    private String MinStartTime;

    /**
    * <p>任务的最晚开始时间，形如2024-08-23 00:00:00，默认为当前时间。</p>
    */
    @SerializedName("MaxStartTime")
    @Expose
    private String MaxStartTime;

    /**
    * <p>每页显示数量，取值范围为1-100，默认为返回20条。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>数据偏移量，从0开始。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>排序字段，支持StartTime,EndTime，默认为StartTime。</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>排序方式，包括升序：asc，降序：desc，默认为desc。</p>
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * Get <p>按照任务ID进行查询。其余云API中返回的FlowId和TaskId等价。</p> 
     * @return TaskId <p>按照任务ID进行查询。其余云API中返回的FlowId和TaskId等价。</p>
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>按照任务ID进行查询。其余云API中返回的FlowId和TaskId等价。</p>
     * @param TaskId <p>按照任务ID进行查询。其余云API中返回的FlowId和TaskId等价。</p>
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>按照数据库实例ID进行查询。</p> 
     * @return DBInstanceId <p>按照数据库实例ID进行查询。</p>
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set <p>按照数据库实例ID进行查询。</p>
     * @param DBInstanceId <p>按照数据库实例ID进行查询。</p>
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get <p>任务的最早开始时间，形如2024-08-23 00:00:00,默认只展示180天内的数据。</p> 
     * @return MinStartTime <p>任务的最早开始时间，形如2024-08-23 00:00:00,默认只展示180天内的数据。</p>
     */
    public String getMinStartTime() {
        return this.MinStartTime;
    }

    /**
     * Set <p>任务的最早开始时间，形如2024-08-23 00:00:00,默认只展示180天内的数据。</p>
     * @param MinStartTime <p>任务的最早开始时间，形如2024-08-23 00:00:00,默认只展示180天内的数据。</p>
     */
    public void setMinStartTime(String MinStartTime) {
        this.MinStartTime = MinStartTime;
    }

    /**
     * Get <p>任务的最晚开始时间，形如2024-08-23 00:00:00，默认为当前时间。</p> 
     * @return MaxStartTime <p>任务的最晚开始时间，形如2024-08-23 00:00:00，默认为当前时间。</p>
     */
    public String getMaxStartTime() {
        return this.MaxStartTime;
    }

    /**
     * Set <p>任务的最晚开始时间，形如2024-08-23 00:00:00，默认为当前时间。</p>
     * @param MaxStartTime <p>任务的最晚开始时间，形如2024-08-23 00:00:00，默认为当前时间。</p>
     */
    public void setMaxStartTime(String MaxStartTime) {
        this.MaxStartTime = MaxStartTime;
    }

    /**
     * Get <p>每页显示数量，取值范围为1-100，默认为返回20条。</p> 
     * @return Limit <p>每页显示数量，取值范围为1-100，默认为返回20条。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页显示数量，取值范围为1-100，默认为返回20条。</p>
     * @param Limit <p>每页显示数量，取值范围为1-100，默认为返回20条。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>数据偏移量，从0开始。</p> 
     * @return Offset <p>数据偏移量，从0开始。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>数据偏移量，从0开始。</p>
     * @param Offset <p>数据偏移量，从0开始。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>排序字段，支持StartTime,EndTime，默认为StartTime。</p> 
     * @return OrderBy <p>排序字段，支持StartTime,EndTime，默认为StartTime。</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>排序字段，支持StartTime,EndTime，默认为StartTime。</p>
     * @param OrderBy <p>排序字段，支持StartTime,EndTime，默认为StartTime。</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>排序方式，包括升序：asc，降序：desc，默认为desc。</p> 
     * @return OrderByType <p>排序方式，包括升序：asc，降序：desc，默认为desc。</p>
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set <p>排序方式，包括升序：asc，降序：desc，默认为desc。</p>
     * @param OrderByType <p>排序方式，包括升序：asc，降序：desc，默认为desc。</p>
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

