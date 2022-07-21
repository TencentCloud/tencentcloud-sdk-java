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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSparkAppTasksRequest extends AbstractModel{

    /**
    * spark作业Id
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 分页查询偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页查询Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 执行实例id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 更新时间起始点
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 更新时间截止点
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 按照该参数过滤,支持task-state
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get spark作业Id 
     * @return JobId spark作业Id
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set spark作业Id
     * @param JobId spark作业Id
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 分页查询偏移量 
     * @return Offset 分页查询偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页查询偏移量
     * @param Offset 分页查询偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页查询Limit 
     * @return Limit 分页查询Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查询Limit
     * @param Limit 分页查询Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 执行实例id 
     * @return TaskId 执行实例id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 执行实例id
     * @param TaskId 执行实例id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 更新时间起始点 
     * @return StartTime 更新时间起始点
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 更新时间起始点
     * @param StartTime 更新时间起始点
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 更新时间截止点 
     * @return EndTime 更新时间截止点
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 更新时间截止点
     * @param EndTime 更新时间截止点
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 按照该参数过滤,支持task-state 
     * @return Filters 按照该参数过滤,支持task-state
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 按照该参数过滤,支持task-state
     * @param Filters 按照该参数过滤,支持task-state
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeSparkAppTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSparkAppTasksRequest(DescribeSparkAppTasksRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
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
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

