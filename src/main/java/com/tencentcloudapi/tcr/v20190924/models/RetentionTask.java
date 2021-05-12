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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RetentionTask extends AbstractModel{

    /**
    * 任务Id
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 所属的规则执行Id
    */
    @SerializedName("ExecutionId")
    @Expose
    private Long ExecutionId;

    /**
    * 任务开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 任务的执行状态，Failed, Succeed, Stopped, InProgress
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 总tag数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 保留tag数
    */
    @SerializedName("Retained")
    @Expose
    private Long Retained;

    /**
    * 应用的仓库
    */
    @SerializedName("Repository")
    @Expose
    private String Repository;

    /**
     * Get 任务Id 
     * @return TaskId 任务Id
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务Id
     * @param TaskId 任务Id
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 所属的规则执行Id 
     * @return ExecutionId 所属的规则执行Id
     */
    public Long getExecutionId() {
        return this.ExecutionId;
    }

    /**
     * Set 所属的规则执行Id
     * @param ExecutionId 所属的规则执行Id
     */
    public void setExecutionId(Long ExecutionId) {
        this.ExecutionId = ExecutionId;
    }

    /**
     * Get 任务开始时间 
     * @return StartTime 任务开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务开始时间
     * @param StartTime 任务开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务结束时间 
     * @return EndTime 任务结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务结束时间
     * @param EndTime 任务结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 任务的执行状态，Failed, Succeed, Stopped, InProgress 
     * @return Status 任务的执行状态，Failed, Succeed, Stopped, InProgress
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务的执行状态，Failed, Succeed, Stopped, InProgress
     * @param Status 任务的执行状态，Failed, Succeed, Stopped, InProgress
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 总tag数 
     * @return Total 总tag数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总tag数
     * @param Total 总tag数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 保留tag数 
     * @return Retained 保留tag数
     */
    public Long getRetained() {
        return this.Retained;
    }

    /**
     * Set 保留tag数
     * @param Retained 保留tag数
     */
    public void setRetained(Long Retained) {
        this.Retained = Retained;
    }

    /**
     * Get 应用的仓库 
     * @return Repository 应用的仓库
     */
    public String getRepository() {
        return this.Repository;
    }

    /**
     * Set 应用的仓库
     * @param Repository 应用的仓库
     */
    public void setRepository(String Repository) {
        this.Repository = Repository;
    }

    public RetentionTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RetentionTask(RetentionTask source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.ExecutionId != null) {
            this.ExecutionId = new Long(source.ExecutionId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Retained != null) {
            this.Retained = new Long(source.Retained);
        }
        if (source.Repository != null) {
            this.Repository = new String(source.Repository);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "ExecutionId", this.ExecutionId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Retained", this.Retained);
        this.setParamSimple(map, prefix + "Repository", this.Repository);

    }
}

