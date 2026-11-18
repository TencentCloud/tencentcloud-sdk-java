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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeJobSubmissionLogRequest extends AbstractModel {

    /**
    * <p>作业ID，例如：cql-6v1jkxrn</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>起始时间，unix时间戳，毫秒级，例如：1611754219108</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束时间，unix时间戳，毫秒级，例如：1611754219108</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>作业运行的实例ID, 例如：1,2,3。默认为0，表示未选中任何实例，搜索该时间段内最近的一个实例的日志</p>
    */
    @SerializedName("RunningOrderId")
    @Expose
    private Long RunningOrderId;

    /**
    * <p>日志搜索的关键词，默认为空</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>日志搜索的游标，可透传上次返回的值，默认为空</p>
    */
    @SerializedName("Cursor")
    @Expose
    private String Cursor;

    /**
    * <p>时间戳排序规则，asc - 升序，desc - 降序。默认为升序</p>
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * <p>搜索的日志条数上限值，最大为100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页偏移</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>过滤</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get <p>作业ID，例如：cql-6v1jkxrn</p> 
     * @return JobId <p>作业ID，例如：cql-6v1jkxrn</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>作业ID，例如：cql-6v1jkxrn</p>
     * @param JobId <p>作业ID，例如：cql-6v1jkxrn</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>起始时间，unix时间戳，毫秒级，例如：1611754219108</p> 
     * @return StartTime <p>起始时间，unix时间戳，毫秒级，例如：1611754219108</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>起始时间，unix时间戳，毫秒级，例如：1611754219108</p>
     * @param StartTime <p>起始时间，unix时间戳，毫秒级，例如：1611754219108</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间，unix时间戳，毫秒级，例如：1611754219108</p> 
     * @return EndTime <p>结束时间，unix时间戳，毫秒级，例如：1611754219108</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间，unix时间戳，毫秒级，例如：1611754219108</p>
     * @param EndTime <p>结束时间，unix时间戳，毫秒级，例如：1611754219108</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>作业运行的实例ID, 例如：1,2,3。默认为0，表示未选中任何实例，搜索该时间段内最近的一个实例的日志</p> 
     * @return RunningOrderId <p>作业运行的实例ID, 例如：1,2,3。默认为0，表示未选中任何实例，搜索该时间段内最近的一个实例的日志</p>
     */
    public Long getRunningOrderId() {
        return this.RunningOrderId;
    }

    /**
     * Set <p>作业运行的实例ID, 例如：1,2,3。默认为0，表示未选中任何实例，搜索该时间段内最近的一个实例的日志</p>
     * @param RunningOrderId <p>作业运行的实例ID, 例如：1,2,3。默认为0，表示未选中任何实例，搜索该时间段内最近的一个实例的日志</p>
     */
    public void setRunningOrderId(Long RunningOrderId) {
        this.RunningOrderId = RunningOrderId;
    }

    /**
     * Get <p>日志搜索的关键词，默认为空</p> 
     * @return Keyword <p>日志搜索的关键词，默认为空</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>日志搜索的关键词，默认为空</p>
     * @param Keyword <p>日志搜索的关键词，默认为空</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>日志搜索的游标，可透传上次返回的值，默认为空</p> 
     * @return Cursor <p>日志搜索的游标，可透传上次返回的值，默认为空</p>
     */
    public String getCursor() {
        return this.Cursor;
    }

    /**
     * Set <p>日志搜索的游标，可透传上次返回的值，默认为空</p>
     * @param Cursor <p>日志搜索的游标，可透传上次返回的值，默认为空</p>
     */
    public void setCursor(String Cursor) {
        this.Cursor = Cursor;
    }

    /**
     * Get <p>时间戳排序规则，asc - 升序，desc - 降序。默认为升序</p> 
     * @return OrderType <p>时间戳排序规则，asc - 升序，desc - 降序。默认为升序</p>
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>时间戳排序规则，asc - 升序，desc - 降序。默认为升序</p>
     * @param OrderType <p>时间戳排序规则，asc - 升序，desc - 降序。默认为升序</p>
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get <p>搜索的日志条数上限值，最大为100</p> 
     * @return Limit <p>搜索的日志条数上限值，最大为100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>搜索的日志条数上限值，最大为100</p>
     * @param Limit <p>搜索的日志条数上限值，最大为100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页偏移</p> 
     * @return Offset <p>分页偏移</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移</p>
     * @param Offset <p>分页偏移</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>过滤</p> 
     * @return Filters <p>过滤</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤</p>
     * @param Filters <p>过滤</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeJobSubmissionLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeJobSubmissionLogRequest(DescribeJobSubmissionLogRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.RunningOrderId != null) {
            this.RunningOrderId = new Long(source.RunningOrderId);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Cursor != null) {
            this.Cursor = new String(source.Cursor);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RunningOrderId", this.RunningOrderId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Cursor", this.Cursor);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

