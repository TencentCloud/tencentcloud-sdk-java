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

public class WorkflowTaskRun extends AbstractModel {

    /**
    * <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>任务运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowTaskRunId")
    @Expose
    private String WorkflowTaskRunId;

    /**
    * <p>运行状态。取值参考工作流任务运行状态枚举，如 Pending / Running / Succeeded / Failed / Killed</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunState")
    @Expose
    private String RunState;

    /**
    * <p>工作空间ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * <p>工作流ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>工作流运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowRunId")
    @Expose
    private String WorkflowRunId;

    /**
    * <p>任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务类型名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypeName")
    @Expose
    private String TaskTypeName;

    /**
    * <p>任务版本ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskVersionId")
    @Expose
    private String TaskVersionId;

    /**
    * <p>触发类型 (参考SchedulerTriggerType枚举)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * <p>所属资源组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * <p>错误码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorCodeString")
    @Expose
    private String ErrorCodeString;

    /**
    * <p>运行用户UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunUserUin")
    @Expose
    private String RunUserUin;

    /**
    * <p>运行用户名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunUserName")
    @Expose
    private String RunUserName;

    /**
    * <p>创建人UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * <p>执行平台执行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>创建时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>依赖任务完成时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependenceFinishedTime")
    @Expose
    private String DependenceFinishedTime;

    /**
    * <p>运行开始时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunStartTime")
    @Expose
    private String RunStartTime;

    /**
    * <p>运行结束时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunEndTime")
    @Expose
    private String RunEndTime;

    /**
    * <p>运行时长，单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunCostTime")
    @Expose
    private String RunCostTime;

    /**
    * <p>等待时长（依赖就绪到开始运行的等待耗时），单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WaitTime")
    @Expose
    private String WaitTime;

    /**
    * <p>下发执行平台时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IssueTime")
    @Expose
    private String IssueTime;

    /**
    * <p>时区</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * <p>依赖上游任务ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependOnList")
    @Expose
    private String [] DependOnList;

    /**
    * <p>运行参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunParams")
    @Expose
    private String RunParams;

    /**
    * <p>任务扩展信息，包含脚本路径</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypeExtensions")
    @Expose
    private String TaskTypeExtensions;

    /**
    * <p>任务X坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LeftCoordinate")
    @Expose
    private Float LeftCoordinate;

    /**
    * <p>任务Y坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopCoordinate")
    @Expose
    private Float TopCoordinate;

    /**
    * <p>重试次数，为 0 则表示首次运行</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetryTimes")
    @Expose
    private Long RetryTimes;

    /**
    * <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * <p>重跑次数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RerunTimes")
    @Expose
    private Long RerunTimes;

    /**
    * <p>是否最新一次运行</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsLatestRun")
    @Expose
    private Boolean IsLatestRun;

    /**
    * <p>资源组信息列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupInfoList")
    @Expose
    private ResourceGroupInfo [] ResourceGroupInfoList;

    /**
    * <p>运行结果</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunResult")
    @Expose
    private String RunResult;

    /**
    * <p>依赖运行条件</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependOnRunCondition")
    @Expose
    private String DependOnRunCondition;

    /**
    * <p>高级依赖配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvancedDependencyConfig")
    @Expose
    private AdvancedDependencyConfig AdvancedDependencyConfig;

    /**
    * <p>内嵌工作流任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InnerTask")
    @Expose
    private InnerWorkflowTaskBrief InnerTask;

    /**
     * Get <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>任务运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowTaskRunId <p>任务运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowTaskRunId() {
        return this.WorkflowTaskRunId;
    }

    /**
     * Set <p>任务运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowTaskRunId <p>任务运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowTaskRunId(String WorkflowTaskRunId) {
        this.WorkflowTaskRunId = WorkflowTaskRunId;
    }

    /**
     * Get <p>运行状态。取值参考工作流任务运行状态枚举，如 Pending / Running / Succeeded / Failed / Killed</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunState <p>运行状态。取值参考工作流任务运行状态枚举，如 Pending / Running / Succeeded / Failed / Killed</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunState() {
        return this.RunState;
    }

    /**
     * Set <p>运行状态。取值参考工作流任务运行状态枚举，如 Pending / Running / Succeeded / Failed / Killed</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunState <p>运行状态。取值参考工作流任务运行状态枚举，如 Pending / Running / Succeeded / Failed / Killed</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunState(String RunState) {
        this.RunState = RunState;
    }

    /**
     * Get <p>工作空间ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkspaceId <p>工作空间ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set <p>工作空间ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkspaceId <p>工作空间ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkspaceId(String WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get <p>工作流ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId <p>工作流ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>工作流ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId <p>工作流ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get <p>工作流运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowRunId <p>工作流运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowRunId() {
        return this.WorkflowRunId;
    }

    /**
     * Set <p>工作流运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowRunId <p>工作流运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowRunId(String WorkflowRunId) {
        this.WorkflowRunId = WorkflowRunId;
    }

    /**
     * Get <p>任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId <p>任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId <p>任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务类型名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypeName <p>任务类型名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskTypeName() {
        return this.TaskTypeName;
    }

    /**
     * Set <p>任务类型名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypeName <p>任务类型名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypeName(String TaskTypeName) {
        this.TaskTypeName = TaskTypeName;
    }

    /**
     * Get <p>任务版本ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskVersionId <p>任务版本ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskVersionId() {
        return this.TaskVersionId;
    }

    /**
     * Set <p>任务版本ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskVersionId <p>任务版本ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskVersionId(String TaskVersionId) {
        this.TaskVersionId = TaskVersionId;
    }

    /**
     * Get <p>触发类型 (参考SchedulerTriggerType枚举)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerType <p>触发类型 (参考SchedulerTriggerType枚举)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>触发类型 (参考SchedulerTriggerType枚举)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerType <p>触发类型 (参考SchedulerTriggerType枚举)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>所属资源组ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupId <p>所属资源组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set <p>所属资源组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupId <p>所属资源组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get <p>错误码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorCodeString <p>错误码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorCodeString() {
        return this.ErrorCodeString;
    }

    /**
     * Set <p>错误码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorCodeString <p>错误码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorCodeString(String ErrorCodeString) {
        this.ErrorCodeString = ErrorCodeString;
    }

    /**
     * Get <p>运行用户UIN</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunUserUin <p>运行用户UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunUserUin() {
        return this.RunUserUin;
    }

    /**
     * Set <p>运行用户UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunUserUin <p>运行用户UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunUserUin(String RunUserUin) {
        this.RunUserUin = RunUserUin;
    }

    /**
     * Get <p>运行用户名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunUserName <p>运行用户名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunUserName() {
        return this.RunUserName;
    }

    /**
     * Set <p>运行用户名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunUserName <p>运行用户名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunUserName(String RunUserName) {
        this.RunUserName = RunUserName;
    }

    /**
     * Get <p>创建人UIN</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUserUin <p>创建人UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set <p>创建人UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUserUin <p>创建人UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get <p>执行平台执行ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobId <p>执行平台执行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>执行平台执行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId <p>执行平台执行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>创建时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>更新时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>更新时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>依赖任务完成时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependenceFinishedTime <p>依赖任务完成时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependenceFinishedTime() {
        return this.DependenceFinishedTime;
    }

    /**
     * Set <p>依赖任务完成时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependenceFinishedTime <p>依赖任务完成时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependenceFinishedTime(String DependenceFinishedTime) {
        this.DependenceFinishedTime = DependenceFinishedTime;
    }

    /**
     * Get <p>运行开始时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunStartTime <p>运行开始时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunStartTime() {
        return this.RunStartTime;
    }

    /**
     * Set <p>运行开始时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunStartTime <p>运行开始时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunStartTime(String RunStartTime) {
        this.RunStartTime = RunStartTime;
    }

    /**
     * Get <p>运行结束时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunEndTime <p>运行结束时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunEndTime() {
        return this.RunEndTime;
    }

    /**
     * Set <p>运行结束时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunEndTime <p>运行结束时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunEndTime(String RunEndTime) {
        this.RunEndTime = RunEndTime;
    }

    /**
     * Get <p>运行时长，单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunCostTime <p>运行时长，单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunCostTime() {
        return this.RunCostTime;
    }

    /**
     * Set <p>运行时长，单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunCostTime <p>运行时长，单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunCostTime(String RunCostTime) {
        this.RunCostTime = RunCostTime;
    }

    /**
     * Get <p>等待时长（依赖就绪到开始运行的等待耗时），单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WaitTime <p>等待时长（依赖就绪到开始运行的等待耗时），单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWaitTime() {
        return this.WaitTime;
    }

    /**
     * Set <p>等待时长（依赖就绪到开始运行的等待耗时），单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WaitTime <p>等待时长（依赖就绪到开始运行的等待耗时），单位：秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWaitTime(String WaitTime) {
        this.WaitTime = WaitTime;
    }

    /**
     * Get <p>下发执行平台时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IssueTime <p>下发执行平台时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIssueTime() {
        return this.IssueTime;
    }

    /**
     * Set <p>下发执行平台时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IssueTime <p>下发执行平台时间，单位：毫秒时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIssueTime(String IssueTime) {
        this.IssueTime = IssueTime;
    }

    /**
     * Get <p>时区</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeZone <p>时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set <p>时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeZone <p>时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get <p>依赖上游任务ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependOnList <p>依赖上游任务ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDependOnList() {
        return this.DependOnList;
    }

    /**
     * Set <p>依赖上游任务ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependOnList <p>依赖上游任务ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependOnList(String [] DependOnList) {
        this.DependOnList = DependOnList;
    }

    /**
     * Get <p>运行参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunParams <p>运行参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunParams() {
        return this.RunParams;
    }

    /**
     * Set <p>运行参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunParams <p>运行参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunParams(String RunParams) {
        this.RunParams = RunParams;
    }

    /**
     * Get <p>任务扩展信息，包含脚本路径</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypeExtensions <p>任务扩展信息，包含脚本路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskTypeExtensions() {
        return this.TaskTypeExtensions;
    }

    /**
     * Set <p>任务扩展信息，包含脚本路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypeExtensions <p>任务扩展信息，包含脚本路径</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypeExtensions(String TaskTypeExtensions) {
        this.TaskTypeExtensions = TaskTypeExtensions;
    }

    /**
     * Get <p>任务X坐标</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LeftCoordinate <p>任务X坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLeftCoordinate() {
        return this.LeftCoordinate;
    }

    /**
     * Set <p>任务X坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LeftCoordinate <p>任务X坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLeftCoordinate(Float LeftCoordinate) {
        this.LeftCoordinate = LeftCoordinate;
    }

    /**
     * Get <p>任务Y坐标</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopCoordinate <p>任务Y坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTopCoordinate() {
        return this.TopCoordinate;
    }

    /**
     * Set <p>任务Y坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopCoordinate <p>任务Y坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopCoordinate(Float TopCoordinate) {
        this.TopCoordinate = TopCoordinate;
    }

    /**
     * Get <p>重试次数，为 0 则表示首次运行</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetryTimes <p>重试次数，为 0 则表示首次运行</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetryTimes() {
        return this.RetryTimes;
    }

    /**
     * Set <p>重试次数，为 0 则表示首次运行</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetryTimes <p>重试次数，为 0 则表示首次运行</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetryTimes(Long RetryTimes) {
        this.RetryTimes = RetryTimes;
    }

    /**
     * Get <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowName <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowName <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get <p>重跑次数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RerunTimes <p>重跑次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRerunTimes() {
        return this.RerunTimes;
    }

    /**
     * Set <p>重跑次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RerunTimes <p>重跑次数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRerunTimes(Long RerunTimes) {
        this.RerunTimes = RerunTimes;
    }

    /**
     * Get <p>是否最新一次运行</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsLatestRun <p>是否最新一次运行</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsLatestRun() {
        return this.IsLatestRun;
    }

    /**
     * Set <p>是否最新一次运行</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsLatestRun <p>是否最新一次运行</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsLatestRun(Boolean IsLatestRun) {
        this.IsLatestRun = IsLatestRun;
    }

    /**
     * Get <p>资源组信息列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupInfoList <p>资源组信息列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceGroupInfo [] getResourceGroupInfoList() {
        return this.ResourceGroupInfoList;
    }

    /**
     * Set <p>资源组信息列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupInfoList <p>资源组信息列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupInfoList(ResourceGroupInfo [] ResourceGroupInfoList) {
        this.ResourceGroupInfoList = ResourceGroupInfoList;
    }

    /**
     * Get <p>运行结果</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunResult <p>运行结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunResult() {
        return this.RunResult;
    }

    /**
     * Set <p>运行结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunResult <p>运行结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunResult(String RunResult) {
        this.RunResult = RunResult;
    }

    /**
     * Get <p>依赖运行条件</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependOnRunCondition <p>依赖运行条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependOnRunCondition() {
        return this.DependOnRunCondition;
    }

    /**
     * Set <p>依赖运行条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependOnRunCondition <p>依赖运行条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependOnRunCondition(String DependOnRunCondition) {
        this.DependOnRunCondition = DependOnRunCondition;
    }

    /**
     * Get <p>高级依赖配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvancedDependencyConfig <p>高级依赖配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdvancedDependencyConfig getAdvancedDependencyConfig() {
        return this.AdvancedDependencyConfig;
    }

    /**
     * Set <p>高级依赖配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvancedDependencyConfig <p>高级依赖配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvancedDependencyConfig(AdvancedDependencyConfig AdvancedDependencyConfig) {
        this.AdvancedDependencyConfig = AdvancedDependencyConfig;
    }

    /**
     * Get <p>内嵌工作流任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InnerTask <p>内嵌工作流任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InnerWorkflowTaskBrief getInnerTask() {
        return this.InnerTask;
    }

    /**
     * Set <p>内嵌工作流任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InnerTask <p>内嵌工作流任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInnerTask(InnerWorkflowTaskBrief InnerTask) {
        this.InnerTask = InnerTask;
    }

    public WorkflowTaskRun() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowTaskRun(WorkflowTaskRun source) {
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
        if (source.RunResult != null) {
            this.RunResult = new String(source.RunResult);
        }
        if (source.DependOnRunCondition != null) {
            this.DependOnRunCondition = new String(source.DependOnRunCondition);
        }
        if (source.AdvancedDependencyConfig != null) {
            this.AdvancedDependencyConfig = new AdvancedDependencyConfig(source.AdvancedDependencyConfig);
        }
        if (source.InnerTask != null) {
            this.InnerTask = new InnerWorkflowTaskBrief(source.InnerTask);
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
        this.setParamSimple(map, prefix + "RunResult", this.RunResult);
        this.setParamSimple(map, prefix + "DependOnRunCondition", this.DependOnRunCondition);
        this.setParamObj(map, prefix + "AdvancedDependencyConfig.", this.AdvancedDependencyConfig);
        this.setParamObj(map, prefix + "InnerTask.", this.InnerTask);

    }
}

