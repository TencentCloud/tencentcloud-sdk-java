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

public class DescribeLibraDBSlowLogsRequest extends AbstractModel {

    /**
    * 只读分析引擎实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 开始时间,1753171200。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间,1753171200。
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 日志单页条数限制:0-200。
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
    * 日志分页，大于0。
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * 日志排序方式，DESC-降序，ASC-升序。
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 日志排序条件。
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 过滤条件。
    */
    @SerializedName("LogFilter")
    @Expose
    private LogFilter [] LogFilter;

    /**
     * Get 只读分析引擎实例 ID 
     * @return InstanceId 只读分析引擎实例 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 只读分析引擎实例 ID
     * @param InstanceId 只读分析引擎实例 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 开始时间,1753171200。 
     * @return StartTime 开始时间,1753171200。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间,1753171200。
     * @param StartTime 开始时间,1753171200。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间,1753171200。 
     * @return EndTime 结束时间,1753171200。
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间,1753171200。
     * @param EndTime 结束时间,1753171200。
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 日志单页条数限制:0-200。 
     * @return Limit 日志单页条数限制:0-200。
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * Set 日志单页条数限制:0-200。
     * @param Limit 日志单页条数限制:0-200。
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 日志分页，大于0。 
     * @return Offset 日志分页，大于0。
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set 日志分页，大于0。
     * @param Offset 日志分页，大于0。
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 日志排序方式，DESC-降序，ASC-升序。 
     * @return Order 日志排序方式，DESC-降序，ASC-升序。
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 日志排序方式，DESC-降序，ASC-升序。
     * @param Order 日志排序方式，DESC-降序，ASC-升序。
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 日志排序条件。 
     * @return OrderBy 日志排序条件。
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 日志排序条件。
     * @param OrderBy 日志排序条件。
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 过滤条件。 
     * @return LogFilter 过滤条件。
     */
    public LogFilter [] getLogFilter() {
        return this.LogFilter;
    }

    /**
     * Set 过滤条件。
     * @param LogFilter 过滤条件。
     */
    public void setLogFilter(LogFilter [] LogFilter) {
        this.LogFilter = LogFilter;
    }

    public DescribeLibraDBSlowLogsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLibraDBSlowLogsRequest(DescribeLibraDBSlowLogsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Limit != null) {
            this.Limit = new String(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.LogFilter != null) {
            this.LogFilter = new LogFilter[source.LogFilter.length];
            for (int i = 0; i < source.LogFilter.length; i++) {
                this.LogFilter[i] = new LogFilter(source.LogFilter[i]);
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

