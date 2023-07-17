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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeJobSubmissionLogRequest extends AbstractModel{

    /**
    * 作业ID，例如：cql-6v1jkxrn
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 起始时间，unix时间戳，毫秒级，例如：1611754219108
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间，unix时间戳，毫秒级，例如：1611754219108
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 作业运行的实例ID, 例如：1,2,3。默认为0，表示未选中任何实例，搜索该时间段内最近的一个实例的日志
    */
    @SerializedName("RunningOrderId")
    @Expose
    private Long RunningOrderId;

    /**
    * 日志搜索的关键词，默认为空
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 日志搜索的游标，可透传上次返回的值，默认为空
    */
    @SerializedName("Cursor")
    @Expose
    private String Cursor;

    /**
    * 时间戳排序规则，asc - 升序，desc - 降序。默认为升序
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * 搜索的日志条数上限值，最大为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 作业ID，例如：cql-6v1jkxrn 
     * @return JobId 作业ID，例如：cql-6v1jkxrn
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 作业ID，例如：cql-6v1jkxrn
     * @param JobId 作业ID，例如：cql-6v1jkxrn
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 起始时间，unix时间戳，毫秒级，例如：1611754219108 
     * @return StartTime 起始时间，unix时间戳，毫秒级，例如：1611754219108
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间，unix时间戳，毫秒级，例如：1611754219108
     * @param StartTime 起始时间，unix时间戳，毫秒级，例如：1611754219108
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间，unix时间戳，毫秒级，例如：1611754219108 
     * @return EndTime 结束时间，unix时间戳，毫秒级，例如：1611754219108
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间，unix时间戳，毫秒级，例如：1611754219108
     * @param EndTime 结束时间，unix时间戳，毫秒级，例如：1611754219108
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 作业运行的实例ID, 例如：1,2,3。默认为0，表示未选中任何实例，搜索该时间段内最近的一个实例的日志 
     * @return RunningOrderId 作业运行的实例ID, 例如：1,2,3。默认为0，表示未选中任何实例，搜索该时间段内最近的一个实例的日志
     */
    public Long getRunningOrderId() {
        return this.RunningOrderId;
    }

    /**
     * Set 作业运行的实例ID, 例如：1,2,3。默认为0，表示未选中任何实例，搜索该时间段内最近的一个实例的日志
     * @param RunningOrderId 作业运行的实例ID, 例如：1,2,3。默认为0，表示未选中任何实例，搜索该时间段内最近的一个实例的日志
     */
    public void setRunningOrderId(Long RunningOrderId) {
        this.RunningOrderId = RunningOrderId;
    }

    /**
     * Get 日志搜索的关键词，默认为空 
     * @return Keyword 日志搜索的关键词，默认为空
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 日志搜索的关键词，默认为空
     * @param Keyword 日志搜索的关键词，默认为空
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 日志搜索的游标，可透传上次返回的值，默认为空 
     * @return Cursor 日志搜索的游标，可透传上次返回的值，默认为空
     */
    public String getCursor() {
        return this.Cursor;
    }

    /**
     * Set 日志搜索的游标，可透传上次返回的值，默认为空
     * @param Cursor 日志搜索的游标，可透传上次返回的值，默认为空
     */
    public void setCursor(String Cursor) {
        this.Cursor = Cursor;
    }

    /**
     * Get 时间戳排序规则，asc - 升序，desc - 降序。默认为升序 
     * @return OrderType 时间戳排序规则，asc - 升序，desc - 降序。默认为升序
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 时间戳排序规则，asc - 升序，desc - 降序。默认为升序
     * @param OrderType 时间戳排序规则，asc - 升序，desc - 降序。默认为升序
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 搜索的日志条数上限值，最大为100 
     * @return Limit 搜索的日志条数上限值，最大为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 搜索的日志条数上限值，最大为100
     * @param Limit 搜索的日志条数上限值，最大为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
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

    }
}

