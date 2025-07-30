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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLifecycleDataTaskRequest extends AbstractModel {

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 	任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * Offset 分页码	
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Limit 页面大小	
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件，TaskName，FileSystemId，Type
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 	任务ID 
     * @return TaskId 	任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 	任务ID
     * @param TaskId 	任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Offset 分页码	 
     * @return Offset Offset 分页码	
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset 分页码	
     * @param Offset Offset 分页码	
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Limit 页面大小	 
     * @return Limit Limit 页面大小	
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Limit 页面大小	
     * @param Limit Limit 页面大小	
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件，TaskName，FileSystemId，Type 
     * @return Filters 过滤条件，TaskName，FileSystemId，Type
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，TaskName，FileSystemId，Type
     * @param Filters 过滤条件，TaskName，FileSystemId，Type
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeLifecycleDataTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLifecycleDataTaskRequest(DescribeLifecycleDataTaskRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

