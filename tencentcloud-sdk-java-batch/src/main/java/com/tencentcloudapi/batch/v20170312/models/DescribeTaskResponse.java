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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskResponse extends AbstractModel{

    /**
    * 作业ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务状态
    */
    @SerializedName("TaskState")
    @Expose
    private String TaskState;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 任务实例总数
    */
    @SerializedName("TaskInstanceTotalCount")
    @Expose
    private Long TaskInstanceTotalCount;

    /**
    * 任务实例信息
    */
    @SerializedName("TaskInstanceSet")
    @Expose
    private TaskInstanceView [] TaskInstanceSet;

    /**
    * 任务实例统计指标
    */
    @SerializedName("TaskInstanceMetrics")
    @Expose
    private TaskInstanceMetrics TaskInstanceMetrics;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 作业ID 
     * @return JobId 作业ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 作业ID
     * @param JobId 作业ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 任务状态 
     * @return TaskState 任务状态
     */
    public String getTaskState() {
        return this.TaskState;
    }

    /**
     * Set 任务状态
     * @param TaskState 任务状态
     */
    public void setTaskState(String TaskState) {
        this.TaskState = TaskState;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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
     * Get 任务实例总数 
     * @return TaskInstanceTotalCount 任务实例总数
     */
    public Long getTaskInstanceTotalCount() {
        return this.TaskInstanceTotalCount;
    }

    /**
     * Set 任务实例总数
     * @param TaskInstanceTotalCount 任务实例总数
     */
    public void setTaskInstanceTotalCount(Long TaskInstanceTotalCount) {
        this.TaskInstanceTotalCount = TaskInstanceTotalCount;
    }

    /**
     * Get 任务实例信息 
     * @return TaskInstanceSet 任务实例信息
     */
    public TaskInstanceView [] getTaskInstanceSet() {
        return this.TaskInstanceSet;
    }

    /**
     * Set 任务实例信息
     * @param TaskInstanceSet 任务实例信息
     */
    public void setTaskInstanceSet(TaskInstanceView [] TaskInstanceSet) {
        this.TaskInstanceSet = TaskInstanceSet;
    }

    /**
     * Get 任务实例统计指标 
     * @return TaskInstanceMetrics 任务实例统计指标
     */
    public TaskInstanceMetrics getTaskInstanceMetrics() {
        return this.TaskInstanceMetrics;
    }

    /**
     * Set 任务实例统计指标
     * @param TaskInstanceMetrics 任务实例统计指标
     */
    public void setTaskInstanceMetrics(TaskInstanceMetrics TaskInstanceMetrics) {
        this.TaskInstanceMetrics = TaskInstanceMetrics;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskState", this.TaskState);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskInstanceTotalCount", this.TaskInstanceTotalCount);
        this.setParamArrayObj(map, prefix + "TaskInstanceSet.", this.TaskInstanceSet);
        this.setParamObj(map, prefix + "TaskInstanceMetrics.", this.TaskInstanceMetrics);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

