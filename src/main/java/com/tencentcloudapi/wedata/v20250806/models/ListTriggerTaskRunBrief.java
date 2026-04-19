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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListTriggerTaskRunBrief extends AbstractModel {

    /**
    * 任务运行ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionId")
    @Expose
    private String ExecutionId;

    /**
    * 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 工作流运行ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowExecutionId")
    @Expose
    private String WorkflowExecutionId;

    /**
    * 任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 触发类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * 等待时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WaitTime")
    @Expose
    private String WaitTime;

    /**
    * 运行账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecuteUserUin")
    @Expose
    private String ExecuteUserUin;

    /**
    * 计划调度时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleTime")
    @Expose
    private String ScheduleTime;

    /**
    * 运行开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * 运行结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * 运行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionTime")
    @Expose
    private String ExecutionTime;

    /**
    * 系统自动重试次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetryTimes")
    @Expose
    private Long RetryTimes;

    /**
    * 错误码描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorCodeStr")
    @Expose
    private String ErrorCodeStr;

    /**
    * 任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * 用户手动重跑次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RerunTimes")
    @Expose
    private Long RerunTimes;

    /**
    * 任务运行状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskExecutionState")
    @Expose
    private String TaskExecutionState;

    /**
    * 是否是最新一次运行
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsLatestExecution")
    @Expose
    private Boolean IsLatestExecution;

    /**
     * Get 任务运行ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionId 任务运行ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionId() {
        return this.ExecutionId;
    }

    /**
     * Set 任务运行ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionId 任务运行ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionId(String ExecutionId) {
        this.ExecutionId = ExecutionId;
    }

    /**
     * Get 工作流ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 工作流运行ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowExecutionId 工作流运行ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowExecutionId() {
        return this.WorkflowExecutionId;
    }

    /**
     * Set 工作流运行ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowExecutionId 工作流运行ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowExecutionId(String WorkflowExecutionId) {
        this.WorkflowExecutionId = WorkflowExecutionId;
    }

    /**
     * Get 任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 触发类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerType 触发类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set 触发类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerType 触发类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get 等待时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WaitTime 等待时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWaitTime() {
        return this.WaitTime;
    }

    /**
     * Set 等待时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param WaitTime 等待时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWaitTime(String WaitTime) {
        this.WaitTime = WaitTime;
    }

    /**
     * Get 运行账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecuteUserUin 运行账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecuteUserUin() {
        return this.ExecuteUserUin;
    }

    /**
     * Set 运行账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecuteUserUin 运行账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecuteUserUin(String ExecuteUserUin) {
        this.ExecuteUserUin = ExecuteUserUin;
    }

    /**
     * Get 计划调度时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleTime 计划调度时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleTime() {
        return this.ScheduleTime;
    }

    /**
     * Set 计划调度时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleTime 计划调度时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleTime(String ScheduleTime) {
        this.ScheduleTime = ScheduleTime;
    }

    /**
     * Get 运行开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionStartTime 运行开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set 运行开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionStartTime 运行开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get 运行结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionEndTime 运行结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set 运行结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionEndTime 运行结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    /**
     * Get 运行时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionTime 运行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionTime() {
        return this.ExecutionTime;
    }

    /**
     * Set 运行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionTime 运行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionTime(String ExecutionTime) {
        this.ExecutionTime = ExecutionTime;
    }

    /**
     * Get 系统自动重试次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetryTimes 系统自动重试次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetryTimes() {
        return this.RetryTimes;
    }

    /**
     * Set 系统自动重试次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetryTimes 系统自动重试次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetryTimes(Long RetryTimes) {
        this.RetryTimes = RetryTimes;
    }

    /**
     * Get 错误码描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorCodeStr 错误码描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorCodeStr() {
        return this.ErrorCodeStr;
    }

    /**
     * Set 错误码描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorCodeStr 错误码描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorCodeStr(String ErrorCodeStr) {
        this.ErrorCodeStr = ErrorCodeStr;
    }

    /**
     * Get 任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 工作流名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowName 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowName 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get 用户手动重跑次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RerunTimes 用户手动重跑次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRerunTimes() {
        return this.RerunTimes;
    }

    /**
     * Set 用户手动重跑次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RerunTimes 用户手动重跑次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRerunTimes(Long RerunTimes) {
        this.RerunTimes = RerunTimes;
    }

    /**
     * Get 任务运行状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskExecutionState 任务运行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskExecutionState() {
        return this.TaskExecutionState;
    }

    /**
     * Set 任务运行状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskExecutionState 任务运行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskExecutionState(String TaskExecutionState) {
        this.TaskExecutionState = TaskExecutionState;
    }

    /**
     * Get 是否是最新一次运行
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsLatestExecution 是否是最新一次运行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsLatestExecution() {
        return this.IsLatestExecution;
    }

    /**
     * Set 是否是最新一次运行
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsLatestExecution 是否是最新一次运行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsLatestExecution(Boolean IsLatestExecution) {
        this.IsLatestExecution = IsLatestExecution;
    }

    public ListTriggerTaskRunBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTriggerTaskRunBrief(ListTriggerTaskRunBrief source) {
        if (source.ExecutionId != null) {
            this.ExecutionId = new String(source.ExecutionId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowExecutionId != null) {
            this.WorkflowExecutionId = new String(source.WorkflowExecutionId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.WaitTime != null) {
            this.WaitTime = new String(source.WaitTime);
        }
        if (source.ExecuteUserUin != null) {
            this.ExecuteUserUin = new String(source.ExecuteUserUin);
        }
        if (source.ScheduleTime != null) {
            this.ScheduleTime = new String(source.ScheduleTime);
        }
        if (source.ExecutionStartTime != null) {
            this.ExecutionStartTime = new String(source.ExecutionStartTime);
        }
        if (source.ExecutionEndTime != null) {
            this.ExecutionEndTime = new String(source.ExecutionEndTime);
        }
        if (source.ExecutionTime != null) {
            this.ExecutionTime = new String(source.ExecutionTime);
        }
        if (source.RetryTimes != null) {
            this.RetryTimes = new Long(source.RetryTimes);
        }
        if (source.ErrorCodeStr != null) {
            this.ErrorCodeStr = new String(source.ErrorCodeStr);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.RerunTimes != null) {
            this.RerunTimes = new Long(source.RerunTimes);
        }
        if (source.TaskExecutionState != null) {
            this.TaskExecutionState = new String(source.TaskExecutionState);
        }
        if (source.IsLatestExecution != null) {
            this.IsLatestExecution = new Boolean(source.IsLatestExecution);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecutionId", this.ExecutionId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowExecutionId", this.WorkflowExecutionId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "WaitTime", this.WaitTime);
        this.setParamSimple(map, prefix + "ExecuteUserUin", this.ExecuteUserUin);
        this.setParamSimple(map, prefix + "ScheduleTime", this.ScheduleTime);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);
        this.setParamSimple(map, prefix + "ExecutionTime", this.ExecutionTime);
        this.setParamSimple(map, prefix + "RetryTimes", this.RetryTimes);
        this.setParamSimple(map, prefix + "ErrorCodeStr", this.ErrorCodeStr);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "RerunTimes", this.RerunTimes);
        this.setParamSimple(map, prefix + "TaskExecutionState", this.TaskExecutionState);
        this.setParamSimple(map, prefix + "IsLatestExecution", this.IsLatestExecution);

    }
}

