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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStreamTaskLogListRequest extends AbstractModel {

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>任务ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>作业ID</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>container名字</p>
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * <p>条数</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>排序类型 desc asc</p>
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * <p>作业运行的实例ID</p>
    */
    @SerializedName("RunningOrderId")
    @Expose
    private Long RunningOrderId;

    /**
    * <p>关键字</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>任务类型，不传时按 <code>INTEGRATION</code> 处理 </p><p>枚举值：</p><ul><li>INTEGRATION： 集成任务</li><li>VALIDATE： 对账任务</li></ul>
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>任务ID</p> 
     * @return TaskId <p>任务ID</p>
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务ID</p>
     * @param TaskId <p>任务ID</p>
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>作业ID</p> 
     * @return JobId <p>作业ID</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>作业ID</p>
     * @param JobId <p>作业ID</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>开始时间</p> 
     * @return StartTime <p>开始时间</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param StartTime <p>开始时间</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>container名字</p> 
     * @return Container <p>container名字</p>
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set <p>container名字</p>
     * @param Container <p>container名字</p>
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get <p>条数</p> 
     * @return Limit <p>条数</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>条数</p>
     * @param Limit <p>条数</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>排序类型 desc asc</p> 
     * @return OrderType <p>排序类型 desc asc</p>
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>排序类型 desc asc</p>
     * @param OrderType <p>排序类型 desc asc</p>
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get <p>作业运行的实例ID</p> 
     * @return RunningOrderId <p>作业运行的实例ID</p>
     */
    public Long getRunningOrderId() {
        return this.RunningOrderId;
    }

    /**
     * Set <p>作业运行的实例ID</p>
     * @param RunningOrderId <p>作业运行的实例ID</p>
     */
    public void setRunningOrderId(Long RunningOrderId) {
        this.RunningOrderId = RunningOrderId;
    }

    /**
     * Get <p>关键字</p> 
     * @return Keyword <p>关键字</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>关键字</p>
     * @param Keyword <p>关键字</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>任务类型，不传时按 <code>INTEGRATION</code> 处理 </p><p>枚举值：</p><ul><li>INTEGRATION： 集成任务</li><li>VALIDATE： 对账任务</li></ul> 
     * @return JobType <p>任务类型，不传时按 <code>INTEGRATION</code> 处理 </p><p>枚举值：</p><ul><li>INTEGRATION： 集成任务</li><li>VALIDATE： 对账任务</li></ul>
     */
    public String getJobType() {
        return this.JobType;
    }

    /**
     * Set <p>任务类型，不传时按 <code>INTEGRATION</code> 处理 </p><p>枚举值：</p><ul><li>INTEGRATION： 集成任务</li><li>VALIDATE： 对账任务</li></ul>
     * @param JobType <p>任务类型，不传时按 <code>INTEGRATION</code> 处理 </p><p>枚举值：</p><ul><li>INTEGRATION： 集成任务</li><li>VALIDATE： 对账任务</li></ul>
     */
    public void setJobType(String JobType) {
        this.JobType = JobType;
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
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
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
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "JobType", this.JobType);

    }
}

