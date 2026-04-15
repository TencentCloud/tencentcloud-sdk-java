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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBSArchiveLogsRequest extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>日志记录ID</p>
    */
    @SerializedName("ArchiveLogId")
    @Expose
    private Long ArchiveLogId;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>备份状态：pending,running,success,failed</p>
    */
    @SerializedName("FilterStatus")
    @Expose
    private String FilterStatus;

    /**
    * <p>条数限制</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>排序字段，枚举：StartTime,EndTime,ExpiredTime,FileSize,BackupDuration</p>
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * <p>排序方式：ASC：顺序, DESC：倒序</p>
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>日志记录ID</p> 
     * @return ArchiveLogId <p>日志记录ID</p>
     */
    public Long getArchiveLogId() {
        return this.ArchiveLogId;
    }

    /**
     * Set <p>日志记录ID</p>
     * @param ArchiveLogId <p>日志记录ID</p>
     */
    public void setArchiveLogId(Long ArchiveLogId) {
        this.ArchiveLogId = ArchiveLogId;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>备份状态：pending,running,success,failed</p> 
     * @return FilterStatus <p>备份状态：pending,running,success,failed</p>
     */
    public String getFilterStatus() {
        return this.FilterStatus;
    }

    /**
     * Set <p>备份状态：pending,running,success,failed</p>
     * @param FilterStatus <p>备份状态：pending,running,success,failed</p>
     */
    public void setFilterStatus(String FilterStatus) {
        this.FilterStatus = FilterStatus;
    }

    /**
     * Get <p>条数限制</p> 
     * @return Limit <p>条数限制</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>条数限制</p>
     * @param Limit <p>条数限制</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量</p> 
     * @return Offset <p>偏移量</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量</p>
     * @param Offset <p>偏移量</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>排序字段，枚举：StartTime,EndTime,ExpiredTime,FileSize,BackupDuration</p> 
     * @return OrderBy <p>排序字段，枚举：StartTime,EndTime,ExpiredTime,FileSize,BackupDuration</p>
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set <p>排序字段，枚举：StartTime,EndTime,ExpiredTime,FileSize,BackupDuration</p>
     * @param OrderBy <p>排序字段，枚举：StartTime,EndTime,ExpiredTime,FileSize,BackupDuration</p>
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get <p>排序方式：ASC：顺序, DESC：倒序</p> 
     * @return OrderType <p>排序方式：ASC：顺序, DESC：倒序</p>
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>排序方式：ASC：顺序, DESC：倒序</p>
     * @param OrderType <p>排序方式：ASC：顺序, DESC：倒序</p>
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get <p>开始时间</p> 
     * @return StartTime <p>开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param StartTime <p>开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public DescribeDBSArchiveLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBSArchiveLogsRequest(DescribeDBSArchiveLogsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ArchiveLogId != null) {
            this.ArchiveLogId = new Long(source.ArchiveLogId);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.FilterStatus != null) {
            this.FilterStatus = new String(source.FilterStatus);
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
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ArchiveLogId", this.ArchiveLogId);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "FilterStatus", this.FilterStatus);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);

    }
}

