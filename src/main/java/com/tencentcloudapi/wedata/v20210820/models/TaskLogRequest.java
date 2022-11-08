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

public class TaskLogRequest extends AbstractModel{

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 起始时间戳，单位毫秒
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间戳，单位毫秒
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 拉取日志数量，默认100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 日志排序 desc 倒序 asc 顺序
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
    * 实时任务 201   离线任务 202  默认实时任务
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
     * Get 任务id 
     * @return TaskId 任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 起始时间戳，单位毫秒 
     * @return StartTime 起始时间戳，单位毫秒
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间戳，单位毫秒
     * @param StartTime 起始时间戳，单位毫秒
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间戳，单位毫秒 
     * @return EndTime 结束时间戳，单位毫秒
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间戳，单位毫秒
     * @param EndTime 结束时间戳，单位毫秒
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 拉取日志数量，默认100 
     * @return Limit 拉取日志数量，默认100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 拉取日志数量，默认100
     * @param Limit 拉取日志数量，默认100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 日志排序 desc 倒序 asc 顺序 
     * @return OrderType 日志排序 desc 倒序 asc 顺序
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 日志排序 desc 倒序 asc 顺序
     * @param OrderType 日志排序 desc 倒序 asc 顺序
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * Get 实时任务 201   离线任务 202  默认实时任务 
     * @return TaskType 实时任务 201   离线任务 202  默认实时任务
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 实时任务 201   离线任务 202  默认实时任务
     * @param TaskType 实时任务 201   离线任务 202  默认实时任务
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    public TaskLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskLogRequest(TaskLogRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);

    }
}

