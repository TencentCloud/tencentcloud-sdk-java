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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetWorkflowTaskRunRsp extends AbstractModel {

    /**
    * 任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务运行ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowTaskRunId")
    @Expose
    private String WorkflowTaskRunId;

    /**
    * 运行状态。取值参考工作流任务运行状态枚举，如 Pending / Running / Succeeded / Failed / Killed
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunState")
    @Expose
    private String RunState;

    /**
    * 工作空间ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

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
    @SerializedName("WorkflowRunId")
    @Expose
    private String WorkflowRunId;

    /**
    * 任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务类型名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypeName")
    @Expose
    private String TaskTypeName;

    /**
    * 任务版本ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskVersionId")
    @Expose
    private String TaskVersionId;

    /**
    * 触发类型 (参考SchedulerTriggerType枚举)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * 所属资源组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * 错误码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorCodeString")
    @Expose
    private String ErrorCodeString;

    /**
    * 运行用户UIN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunUserUin")
    @Expose
    private String RunUserUin;

    /**
    * 运行用户名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunUserName")
    @Expose
    private String RunUserName;

    /**
    * 创建人UIN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * 执行平台执行ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 创建时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 依赖任务完成时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependenceFinishedTime")
    @Expose
    private String DependenceFinishedTime;

    /**
    * 运行开始时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunStartTime")
    @Expose
    private String RunStartTime;

    /**
    * 运行结束时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunEndTime")
    @Expose
    private String RunEndTime;

    /**
    * 运行时长，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunCostTime")
    @Expose
    private String RunCostTime;

    /**
    * 等待时长（依赖就绪到开始运行的等待耗时），单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WaitTime")
    @Expose
    private String WaitTime;

    /**
    * 下发执行平台时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IssueTime")
    @Expose
    private String IssueTime;

    /**
    * 时区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * 依赖上游任务ID列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependOnList")
    @Expose
    private String [] DependOnList;

    /**
    * 运行参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunParams")
    @Expose
    private String RunParams;

    /**
    * 任务扩展信息，包含脚本路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypeExtensions")
    @Expose
    private String TaskTypeExtensions;

    /**
    * 任务X坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LeftCoordinate")
    @Expose
    private Float LeftCoordinate;

    /**
    * 任务Y坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopCoordinate")
    @Expose
    private Float TopCoordinate;

    /**
    * 重试次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetryTimes")
    @Expose
    private Long RetryTimes;

    /**
    * 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * 重跑次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RerunTimes")
    @Expose
    private Long RerunTimes;

    /**
    * 是否最新一次运行
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsLatestRun")
    @Expose
    private Boolean IsLatestRun;

    /**
    * 资源组信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupInfoList")
    @Expose
    private ResourceGroupInfo [] ResourceGroupInfoList;

    /**
    * 错误消息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 运行结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunResult")
    @Expose
    private String RunResult;

    /**
    * 内嵌工作流任务运行详情（仅限 FOR_EACH 任务，其他任务类型不返回该字段）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InnerWorkflowTaskRun")
    @Expose
    private InnerWorkflowTaskRun InnerWorkflowTaskRun;

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
     * Get 任务运行ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowTaskRunId 任务运行ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowTaskRunId() {
        return this.WorkflowTaskRunId;
    }

    /**
     * Set 任务运行ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowTaskRunId 任务运行ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowTaskRunId(String WorkflowTaskRunId) {
        this.WorkflowTaskRunId = WorkflowTaskRunId;
    }

    /**
     * Get 运行状态。取值参考工作流任务运行状态枚举，如 Pending / Running / Succeeded / Failed / Killed
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunState 运行状态。取值参考工作流任务运行状态枚举，如 Pending / Running / Succeeded / Failed / Killed
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunState() {
        return this.RunState;
    }

    /**
     * Set 运行状态。取值参考工作流任务运行状态枚举，如 Pending / Running / Succeeded / Failed / Killed
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunState 运行状态。取值参考工作流任务运行状态枚举，如 Pending / Running / Succeeded / Failed / Killed
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunState(String RunState) {
        this.RunState = RunState;
    }

    /**
     * Get 工作空间ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkspaceId 工作空间ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 工作空间ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkspaceId 工作空间ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
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
     * @return WorkflowRunId 工作流运行ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowRunId() {
        return this.WorkflowRunId;
    }

    /**
     * Set 工作流运行ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowRunId 工作流运行ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowRunId(String WorkflowRunId) {
        this.WorkflowRunId = WorkflowRunId;
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
     * Get 任务类型名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypeName 任务类型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskTypeName() {
        return this.TaskTypeName;
    }

    /**
     * Set 任务类型名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypeName 任务类型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypeName(String TaskTypeName) {
        this.TaskTypeName = TaskTypeName;
    }

    /**
     * Get 任务版本ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskVersionId 任务版本ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskVersionId() {
        return this.TaskVersionId;
    }

    /**
     * Set 任务版本ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskVersionId 任务版本ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskVersionId(String TaskVersionId) {
        this.TaskVersionId = TaskVersionId;
    }

    /**
     * Get 触发类型 (参考SchedulerTriggerType枚举)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerType 触发类型 (参考SchedulerTriggerType枚举)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set 触发类型 (参考SchedulerTriggerType枚举)
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerType 触发类型 (参考SchedulerTriggerType枚举)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get 所属资源组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupId 所属资源组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set 所属资源组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupId 所属资源组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get 错误码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorCodeString 错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorCodeString() {
        return this.ErrorCodeString;
    }

    /**
     * Set 错误码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorCodeString 错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorCodeString(String ErrorCodeString) {
        this.ErrorCodeString = ErrorCodeString;
    }

    /**
     * Get 运行用户UIN
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunUserUin 运行用户UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunUserUin() {
        return this.RunUserUin;
    }

    /**
     * Set 运行用户UIN
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunUserUin 运行用户UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunUserUin(String RunUserUin) {
        this.RunUserUin = RunUserUin;
    }

    /**
     * Get 运行用户名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunUserName 运行用户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunUserName() {
        return this.RunUserName;
    }

    /**
     * Set 运行用户名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunUserName 运行用户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunUserName(String RunUserName) {
        this.RunUserName = RunUserName;
    }

    /**
     * Get 创建人UIN
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUserUin 创建人UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set 创建人UIN
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUserUin 创建人UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get 执行平台执行ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobId 执行平台执行ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 执行平台执行ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId 执行平台执行ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 创建时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 依赖任务完成时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependenceFinishedTime 依赖任务完成时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependenceFinishedTime() {
        return this.DependenceFinishedTime;
    }

    /**
     * Set 依赖任务完成时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependenceFinishedTime 依赖任务完成时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependenceFinishedTime(String DependenceFinishedTime) {
        this.DependenceFinishedTime = DependenceFinishedTime;
    }

    /**
     * Get 运行开始时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunStartTime 运行开始时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunStartTime() {
        return this.RunStartTime;
    }

    /**
     * Set 运行开始时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunStartTime 运行开始时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunStartTime(String RunStartTime) {
        this.RunStartTime = RunStartTime;
    }

    /**
     * Get 运行结束时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunEndTime 运行结束时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunEndTime() {
        return this.RunEndTime;
    }

    /**
     * Set 运行结束时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunEndTime 运行结束时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunEndTime(String RunEndTime) {
        this.RunEndTime = RunEndTime;
    }

    /**
     * Get 运行时长，单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunCostTime 运行时长，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunCostTime() {
        return this.RunCostTime;
    }

    /**
     * Set 运行时长，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunCostTime 运行时长，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunCostTime(String RunCostTime) {
        this.RunCostTime = RunCostTime;
    }

    /**
     * Get 等待时长（依赖就绪到开始运行的等待耗时），单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WaitTime 等待时长（依赖就绪到开始运行的等待耗时），单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWaitTime() {
        return this.WaitTime;
    }

    /**
     * Set 等待时长（依赖就绪到开始运行的等待耗时），单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param WaitTime 等待时长（依赖就绪到开始运行的等待耗时），单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWaitTime(String WaitTime) {
        this.WaitTime = WaitTime;
    }

    /**
     * Get 下发执行平台时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IssueTime 下发执行平台时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIssueTime() {
        return this.IssueTime;
    }

    /**
     * Set 下发执行平台时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param IssueTime 下发执行平台时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIssueTime(String IssueTime) {
        this.IssueTime = IssueTime;
    }

    /**
     * Get 时区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeZone 时区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set 时区
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeZone 时区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get 依赖上游任务ID列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependOnList 依赖上游任务ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDependOnList() {
        return this.DependOnList;
    }

    /**
     * Set 依赖上游任务ID列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependOnList 依赖上游任务ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependOnList(String [] DependOnList) {
        this.DependOnList = DependOnList;
    }

    /**
     * Get 运行参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunParams 运行参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunParams() {
        return this.RunParams;
    }

    /**
     * Set 运行参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunParams 运行参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunParams(String RunParams) {
        this.RunParams = RunParams;
    }

    /**
     * Get 任务扩展信息，包含脚本路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypeExtensions 任务扩展信息，包含脚本路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskTypeExtensions() {
        return this.TaskTypeExtensions;
    }

    /**
     * Set 任务扩展信息，包含脚本路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypeExtensions 任务扩展信息，包含脚本路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypeExtensions(String TaskTypeExtensions) {
        this.TaskTypeExtensions = TaskTypeExtensions;
    }

    /**
     * Get 任务X坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LeftCoordinate 任务X坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLeftCoordinate() {
        return this.LeftCoordinate;
    }

    /**
     * Set 任务X坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param LeftCoordinate 任务X坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLeftCoordinate(Float LeftCoordinate) {
        this.LeftCoordinate = LeftCoordinate;
    }

    /**
     * Get 任务Y坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopCoordinate 任务Y坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTopCoordinate() {
        return this.TopCoordinate;
    }

    /**
     * Set 任务Y坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopCoordinate 任务Y坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopCoordinate(Float TopCoordinate) {
        this.TopCoordinate = TopCoordinate;
    }

    /**
     * Get 重试次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetryTimes 重试次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetryTimes() {
        return this.RetryTimes;
    }

    /**
     * Set 重试次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetryTimes 重试次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetryTimes(Long RetryTimes) {
        this.RetryTimes = RetryTimes;
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
     * Get 重跑次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RerunTimes 重跑次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRerunTimes() {
        return this.RerunTimes;
    }

    /**
     * Set 重跑次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RerunTimes 重跑次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRerunTimes(Long RerunTimes) {
        this.RerunTimes = RerunTimes;
    }

    /**
     * Get 是否最新一次运行
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsLatestRun 是否最新一次运行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsLatestRun() {
        return this.IsLatestRun;
    }

    /**
     * Set 是否最新一次运行
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsLatestRun 是否最新一次运行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsLatestRun(Boolean IsLatestRun) {
        this.IsLatestRun = IsLatestRun;
    }

    /**
     * Get 资源组信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupInfoList 资源组信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceGroupInfo [] getResourceGroupInfoList() {
        return this.ResourceGroupInfoList;
    }

    /**
     * Set 资源组信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupInfoList 资源组信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupInfoList(ResourceGroupInfo [] ResourceGroupInfoList) {
        this.ResourceGroupInfoList = ResourceGroupInfoList;
    }

    /**
     * Get 错误消息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMessage 错误消息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set 错误消息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMessage 错误消息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get 运行结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunResult 运行结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunResult() {
        return this.RunResult;
    }

    /**
     * Set 运行结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunResult 运行结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunResult(String RunResult) {
        this.RunResult = RunResult;
    }

    /**
     * Get 内嵌工作流任务运行详情（仅限 FOR_EACH 任务，其他任务类型不返回该字段）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InnerWorkflowTaskRun 内嵌工作流任务运行详情（仅限 FOR_EACH 任务，其他任务类型不返回该字段）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InnerWorkflowTaskRun getInnerWorkflowTaskRun() {
        return this.InnerWorkflowTaskRun;
    }

    /**
     * Set 内嵌工作流任务运行详情（仅限 FOR_EACH 任务，其他任务类型不返回该字段）
注意：此字段可能返回 null，表示取不到有效值。
     * @param InnerWorkflowTaskRun 内嵌工作流任务运行详情（仅限 FOR_EACH 任务，其他任务类型不返回该字段）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInnerWorkflowTaskRun(InnerWorkflowTaskRun InnerWorkflowTaskRun) {
        this.InnerWorkflowTaskRun = InnerWorkflowTaskRun;
    }

    public GetWorkflowTaskRunRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetWorkflowTaskRunRsp(GetWorkflowTaskRunRsp source) {
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.WorkflowTaskRunId != null) {
            this.WorkflowTaskRunId = new String(source.WorkflowTaskRunId);
        }
        if (source.RunState != null) {
            this.RunState = new String(source.RunState);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowRunId != null) {
            this.WorkflowRunId = new String(source.WorkflowRunId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskTypeName != null) {
            this.TaskTypeName = new String(source.TaskTypeName);
        }
        if (source.TaskVersionId != null) {
            this.TaskVersionId = new String(source.TaskVersionId);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.ErrorCodeString != null) {
            this.ErrorCodeString = new String(source.ErrorCodeString);
        }
        if (source.RunUserUin != null) {
            this.RunUserUin = new String(source.RunUserUin);
        }
        if (source.RunUserName != null) {
            this.RunUserName = new String(source.RunUserName);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.DependenceFinishedTime != null) {
            this.DependenceFinishedTime = new String(source.DependenceFinishedTime);
        }
        if (source.RunStartTime != null) {
            this.RunStartTime = new String(source.RunStartTime);
        }
        if (source.RunEndTime != null) {
            this.RunEndTime = new String(source.RunEndTime);
        }
        if (source.RunCostTime != null) {
            this.RunCostTime = new String(source.RunCostTime);
        }
        if (source.WaitTime != null) {
            this.WaitTime = new String(source.WaitTime);
        }
        if (source.IssueTime != null) {
            this.IssueTime = new String(source.IssueTime);
        }
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
        if (source.DependOnList != null) {
            this.DependOnList = new String[source.DependOnList.length];
            for (int i = 0; i < source.DependOnList.length; i++) {
                this.DependOnList[i] = new String(source.DependOnList[i]);
            }
        }
        if (source.RunParams != null) {
            this.RunParams = new String(source.RunParams);
        }
        if (source.TaskTypeExtensions != null) {
            this.TaskTypeExtensions = new String(source.TaskTypeExtensions);
        }
        if (source.LeftCoordinate != null) {
            this.LeftCoordinate = new Float(source.LeftCoordinate);
        }
        if (source.TopCoordinate != null) {
            this.TopCoordinate = new Float(source.TopCoordinate);
        }
        if (source.RetryTimes != null) {
            this.RetryTimes = new Long(source.RetryTimes);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.RerunTimes != null) {
            this.RerunTimes = new Long(source.RerunTimes);
        }
        if (source.IsLatestRun != null) {
            this.IsLatestRun = new Boolean(source.IsLatestRun);
        }
        if (source.ResourceGroupInfoList != null) {
            this.ResourceGroupInfoList = new ResourceGroupInfo[source.ResourceGroupInfoList.length];
            for (int i = 0; i < source.ResourceGroupInfoList.length; i++) {
                this.ResourceGroupInfoList[i] = new ResourceGroupInfo(source.ResourceGroupInfoList[i]);
            }
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.RunResult != null) {
            this.RunResult = new String(source.RunResult);
        }
        if (source.InnerWorkflowTaskRun != null) {
            this.InnerWorkflowTaskRun = new InnerWorkflowTaskRun(source.InnerWorkflowTaskRun);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "WorkflowTaskRunId", this.WorkflowTaskRunId);
        this.setParamSimple(map, prefix + "RunState", this.RunState);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowRunId", this.WorkflowRunId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskTypeName", this.TaskTypeName);
        this.setParamSimple(map, prefix + "TaskVersionId", this.TaskVersionId);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "ErrorCodeString", this.ErrorCodeString);
        this.setParamSimple(map, prefix + "RunUserUin", this.RunUserUin);
        this.setParamSimple(map, prefix + "RunUserName", this.RunUserName);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "DependenceFinishedTime", this.DependenceFinishedTime);
        this.setParamSimple(map, prefix + "RunStartTime", this.RunStartTime);
        this.setParamSimple(map, prefix + "RunEndTime", this.RunEndTime);
        this.setParamSimple(map, prefix + "RunCostTime", this.RunCostTime);
        this.setParamSimple(map, prefix + "WaitTime", this.WaitTime);
        this.setParamSimple(map, prefix + "IssueTime", this.IssueTime);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamArraySimple(map, prefix + "DependOnList.", this.DependOnList);
        this.setParamSimple(map, prefix + "RunParams", this.RunParams);
        this.setParamSimple(map, prefix + "TaskTypeExtensions", this.TaskTypeExtensions);
        this.setParamSimple(map, prefix + "LeftCoordinate", this.LeftCoordinate);
        this.setParamSimple(map, prefix + "TopCoordinate", this.TopCoordinate);
        this.setParamSimple(map, prefix + "RetryTimes", this.RetryTimes);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "RerunTimes", this.RerunTimes);
        this.setParamSimple(map, prefix + "IsLatestRun", this.IsLatestRun);
        this.setParamArrayObj(map, prefix + "ResourceGroupInfoList.", this.ResourceGroupInfoList);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "RunResult", this.RunResult);
        this.setParamObj(map, prefix + "InnerWorkflowTaskRun.", this.InnerWorkflowTaskRun);

    }
}

