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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStreamTaskLogListRequest extends AbstractModel{

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 作业ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * container名字
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * 条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序类型 desc asc
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * 作业运行的实例ID
    */
    @SerializedName("RunningOrderId")
    @Expose
    private Long RunningOrderId;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

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
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get container名字 
     * @return Container container名字
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set container名字
     * @param Container container名字
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get 条数 
     * @return Limit 条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 条数
     * @param Limit 条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序类型 desc asc 
     * @return OrderType 排序类型 desc asc
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 排序类型 desc asc
     * @param OrderType 排序类型 desc asc
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 作业运行的实例ID 
     * @return RunningOrderId 作业运行的实例ID
     */
    public Long getRunningOrderId() {
        return this.RunningOrderId;
    }

    /**
     * Set 作业运行的实例ID
     * @param RunningOrderId 作业运行的实例ID
     */
    public void setRunningOrderId(Long RunningOrderId) {
        this.RunningOrderId = RunningOrderId;
    }

    public DescribeStreamTaskLogListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamTaskLogListRequest(DescribeStreamTaskLogListRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
        if (source.RunningOrderId != null) {
            this.RunningOrderId = new Long(source.RunningOrderId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "RunningOrderId", this.RunningOrderId);

    }
}

