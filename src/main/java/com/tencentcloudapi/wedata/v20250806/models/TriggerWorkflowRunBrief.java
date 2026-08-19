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

public class TriggerWorkflowRunBrief extends AbstractModel {

    /**
    * <p>用户AppId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

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
    @SerializedName("ExecutionId")
    @Expose
    private String ExecutionId;

    /**
    * <p>触发器ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerId")
    @Expose
    private String TriggerId;

    /**
    * <p>触发方式:调度触发Scheduler、手动触发ManualTrigger、事件触发Event</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * <p>工作流触发时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>计划调度时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleTime")
    @Expose
    private String ScheduleTime;

    /**
    * <p>执行开始时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * <p>执行结束时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * <p>运行时长，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionCostTime")
    @Expose
    private String ExecutionCostTime;

    /**
    * <p>并发排队花费时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueueCostTime")
    @Expose
    private String QueueCostTime;

    /**
    * <p>等待资源花费时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PendingCostTime")
    @Expose
    private String PendingCostTime;

    /**
    * <p>执行状态，运行失败:FAILED、运行成功:SUCCESS、等待中:PENDING、跳过运行:SKIPED、运行中:RUNNING</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionState")
    @Expose
    private String ExecutionState;

    /**
    * <p>运行用户UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecuteUserUin")
    @Expose
    private String ExecuteUserUin;

    /**
    * <p>运行用户名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecuteUserName")
    @Expose
    private String ExecuteUserName;

    /**
    * <p>错误码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorCodeStr")
    @Expose
    private String ErrorCodeStr;

    /**
    * <p>运行参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowParams")
    @Expose
    private String WorkflowParams;

    /**
    * <p>工作流版本信息ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowVersionId")
    @Expose
    private String WorkflowVersionId;

    /**
    * <p>是否支持重跑</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportRerun")
    @Expose
    private Boolean SupportRerun;

    /**
    * <p>重跑次数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RerunTimes")
    @Expose
    private Long RerunTimes;

    /**
    * <p>运行的任务范围,逗号分隔的任务ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelectedTaskIds")
    @Expose
    private String [] SelectedTaskIds;

    /**
    * <p>等待并发开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PendingStartTime")
    @Expose
    private String PendingStartTime;

    /**
    * <p>排队等待开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueueStartTime")
    @Expose
    private String QueueStartTime;

    /**
    * <p>运行结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * <p>文件夹名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * <p>计划调度时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlannedSchedulingTime")
    @Expose
    private String PlannedSchedulingTime;

    /**
    * <p>周期类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * <p>责任人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserNameInCharge")
    @Expose
    private String UserNameInCharge;

    /**
    * <p>责任人ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserUinInCharge")
    @Expose
    private String UserUinInCharge;

    /**
    * <p>关联实体是否存在</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssociatedEntityExist")
    @Expose
    private Boolean AssociatedEntityExist;

    /**
    * <p>父工作流运行ID 【由嵌套工作流触发独有】</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentWorkflowExecutionId")
    @Expose
    private String ParentWorkflowExecutionId;

    /**
    * <p>父任务运行ID 【由嵌套工作流触发独有】</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentTaskExecutionId")
    @Expose
    private String ParentTaskExecutionId;

    /**
    * <p>父任务运行名称 【由嵌套工作流触发独有】</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentTaskExecutionName")
    @Expose
    private String ParentTaskExecutionName;

    /**
     * Get <p>用户AppId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId <p>用户AppId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>用户AppId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId <p>用户AppId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
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
     * @return ExecutionId <p>工作流运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionId() {
        return this.ExecutionId;
    }

    /**
     * Set <p>工作流运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionId <p>工作流运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionId(String ExecutionId) {
        this.ExecutionId = ExecutionId;
    }

    /**
     * Get <p>触发器ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerId <p>触发器ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerId() {
        return this.TriggerId;
    }

    /**
     * Set <p>触发器ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerId <p>触发器ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerId(String TriggerId) {
        this.TriggerId = TriggerId;
    }

    /**
     * Get <p>触发方式:调度触发Scheduler、手动触发ManualTrigger、事件触发Event</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerType <p>触发方式:调度触发Scheduler、手动触发ManualTrigger、事件触发Event</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>触发方式:调度触发Scheduler、手动触发ManualTrigger、事件触发Event</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerType <p>触发方式:调度触发Scheduler、手动触发ManualTrigger、事件触发Event</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>工作流触发时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>工作流触发时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>工作流触发时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>工作流触发时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>计划调度时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleTime <p>计划调度时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleTime() {
        return this.ScheduleTime;
    }

    /**
     * Set <p>计划调度时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleTime <p>计划调度时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleTime(String ScheduleTime) {
        this.ScheduleTime = ScheduleTime;
    }

    /**
     * Get <p>执行开始时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionStartTime <p>执行开始时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set <p>执行开始时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionStartTime <p>执行开始时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get <p>执行结束时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionEndTime <p>执行结束时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set <p>执行结束时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionEndTime <p>执行结束时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    /**
     * Get <p>运行时长，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionCostTime <p>运行时长，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionCostTime() {
        return this.ExecutionCostTime;
    }

    /**
     * Set <p>运行时长，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionCostTime <p>运行时长，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionCostTime(String ExecutionCostTime) {
        this.ExecutionCostTime = ExecutionCostTime;
    }

    /**
     * Get <p>并发排队花费时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueueCostTime <p>并发排队花费时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueueCostTime() {
        return this.QueueCostTime;
    }

    /**
     * Set <p>并发排队花费时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueueCostTime <p>并发排队花费时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueueCostTime(String QueueCostTime) {
        this.QueueCostTime = QueueCostTime;
    }

    /**
     * Get <p>等待资源花费时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PendingCostTime <p>等待资源花费时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPendingCostTime() {
        return this.PendingCostTime;
    }

    /**
     * Set <p>等待资源花费时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PendingCostTime <p>等待资源花费时间，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPendingCostTime(String PendingCostTime) {
        this.PendingCostTime = PendingCostTime;
    }

    /**
     * Get <p>执行状态，运行失败:FAILED、运行成功:SUCCESS、等待中:PENDING、跳过运行:SKIPED、运行中:RUNNING</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionState <p>执行状态，运行失败:FAILED、运行成功:SUCCESS、等待中:PENDING、跳过运行:SKIPED、运行中:RUNNING</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionState() {
        return this.ExecutionState;
    }

    /**
     * Set <p>执行状态，运行失败:FAILED、运行成功:SUCCESS、等待中:PENDING、跳过运行:SKIPED、运行中:RUNNING</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionState <p>执行状态，运行失败:FAILED、运行成功:SUCCESS、等待中:PENDING、跳过运行:SKIPED、运行中:RUNNING</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionState(String ExecutionState) {
        this.ExecutionState = ExecutionState;
    }

    /**
     * Get <p>运行用户UIN</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecuteUserUin <p>运行用户UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecuteUserUin() {
        return this.ExecuteUserUin;
    }

    /**
     * Set <p>运行用户UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecuteUserUin <p>运行用户UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecuteUserUin(String ExecuteUserUin) {
        this.ExecuteUserUin = ExecuteUserUin;
    }

    /**
     * Get <p>运行用户名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecuteUserName <p>运行用户名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecuteUserName() {
        return this.ExecuteUserName;
    }

    /**
     * Set <p>运行用户名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecuteUserName <p>运行用户名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecuteUserName(String ExecuteUserName) {
        this.ExecuteUserName = ExecuteUserName;
    }

    /**
     * Get <p>错误码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorCodeStr <p>错误码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorCodeStr() {
        return this.ErrorCodeStr;
    }

    /**
     * Set <p>错误码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorCodeStr <p>错误码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorCodeStr(String ErrorCodeStr) {
        this.ErrorCodeStr = ErrorCodeStr;
    }

    /**
     * Get <p>运行参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowParams <p>运行参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowParams() {
        return this.WorkflowParams;
    }

    /**
     * Set <p>运行参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowParams <p>运行参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowParams(String WorkflowParams) {
        this.WorkflowParams = WorkflowParams;
    }

    /**
     * Get <p>工作流版本信息ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowVersionId <p>工作流版本信息ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowVersionId() {
        return this.WorkflowVersionId;
    }

    /**
     * Set <p>工作流版本信息ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowVersionId <p>工作流版本信息ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowVersionId(String WorkflowVersionId) {
        this.WorkflowVersionId = WorkflowVersionId;
    }

    /**
     * Get <p>是否支持重跑</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportRerun <p>是否支持重跑</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSupportRerun() {
        return this.SupportRerun;
    }

    /**
     * Set <p>是否支持重跑</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportRerun <p>是否支持重跑</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportRerun(Boolean SupportRerun) {
        this.SupportRerun = SupportRerun;
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
     * Get <p>运行的任务范围,逗号分隔的任务ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelectedTaskIds <p>运行的任务范围,逗号分隔的任务ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSelectedTaskIds() {
        return this.SelectedTaskIds;
    }

    /**
     * Set <p>运行的任务范围,逗号分隔的任务ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelectedTaskIds <p>运行的任务范围,逗号分隔的任务ID列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelectedTaskIds(String [] SelectedTaskIds) {
        this.SelectedTaskIds = SelectedTaskIds;
    }

    /**
     * Get <p>等待并发开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PendingStartTime <p>等待并发开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPendingStartTime() {
        return this.PendingStartTime;
    }

    /**
     * Set <p>等待并发开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PendingStartTime <p>等待并发开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPendingStartTime(String PendingStartTime) {
        this.PendingStartTime = PendingStartTime;
    }

    /**
     * Get <p>排队等待开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueueStartTime <p>排队等待开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueueStartTime() {
        return this.QueueStartTime;
    }

    /**
     * Set <p>排队等待开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueueStartTime <p>排队等待开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueueStartTime(String QueueStartTime) {
        this.QueueStartTime = QueueStartTime;
    }

    /**
     * Get <p>运行结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime <p>运行结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>运行结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime <p>运行结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderId <p>文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set <p>文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderId <p>文件夹ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get <p>文件夹名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderName <p>文件夹名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set <p>文件夹名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderName <p>文件夹名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    /**
     * Get <p>计划调度时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlannedSchedulingTime <p>计划调度时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPlannedSchedulingTime() {
        return this.PlannedSchedulingTime;
    }

    /**
     * Set <p>计划调度时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlannedSchedulingTime <p>计划调度时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlannedSchedulingTime(String PlannedSchedulingTime) {
        this.PlannedSchedulingTime = PlannedSchedulingTime;
    }

    /**
     * Get <p>周期类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleType <p>周期类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set <p>周期类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleType <p>周期类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get <p>责任人名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserNameInCharge <p>责任人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserNameInCharge() {
        return this.UserNameInCharge;
    }

    /**
     * Set <p>责任人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserNameInCharge <p>责任人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserNameInCharge(String UserNameInCharge) {
        this.UserNameInCharge = UserNameInCharge;
    }

    /**
     * Get <p>责任人ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserUinInCharge <p>责任人ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserUinInCharge() {
        return this.UserUinInCharge;
    }

    /**
     * Set <p>责任人ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserUinInCharge <p>责任人ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserUinInCharge(String UserUinInCharge) {
        this.UserUinInCharge = UserUinInCharge;
    }

    /**
     * Get <p>关联实体是否存在</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssociatedEntityExist <p>关联实体是否存在</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAssociatedEntityExist() {
        return this.AssociatedEntityExist;
    }

    /**
     * Set <p>关联实体是否存在</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssociatedEntityExist <p>关联实体是否存在</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssociatedEntityExist(Boolean AssociatedEntityExist) {
        this.AssociatedEntityExist = AssociatedEntityExist;
    }

    /**
     * Get <p>父工作流运行ID 【由嵌套工作流触发独有】</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentWorkflowExecutionId <p>父工作流运行ID 【由嵌套工作流触发独有】</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentWorkflowExecutionId() {
        return this.ParentWorkflowExecutionId;
    }

    /**
     * Set <p>父工作流运行ID 【由嵌套工作流触发独有】</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentWorkflowExecutionId <p>父工作流运行ID 【由嵌套工作流触发独有】</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentWorkflowExecutionId(String ParentWorkflowExecutionId) {
        this.ParentWorkflowExecutionId = ParentWorkflowExecutionId;
    }

    /**
     * Get <p>父任务运行ID 【由嵌套工作流触发独有】</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentTaskExecutionId <p>父任务运行ID 【由嵌套工作流触发独有】</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentTaskExecutionId() {
        return this.ParentTaskExecutionId;
    }

    /**
     * Set <p>父任务运行ID 【由嵌套工作流触发独有】</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentTaskExecutionId <p>父任务运行ID 【由嵌套工作流触发独有】</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentTaskExecutionId(String ParentTaskExecutionId) {
        this.ParentTaskExecutionId = ParentTaskExecutionId;
    }

    /**
     * Get <p>父任务运行名称 【由嵌套工作流触发独有】</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentTaskExecutionName <p>父任务运行名称 【由嵌套工作流触发独有】</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentTaskExecutionName() {
        return this.ParentTaskExecutionName;
    }

    /**
     * Set <p>父任务运行名称 【由嵌套工作流触发独有】</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentTaskExecutionName <p>父任务运行名称 【由嵌套工作流触发独有】</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentTaskExecutionName(String ParentTaskExecutionName) {
        this.ParentTaskExecutionName = ParentTaskExecutionName;
    }

    public TriggerWorkflowRunBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerWorkflowRunBrief(TriggerWorkflowRunBrief source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.ExecutionId != null) {
            this.ExecutionId = new String(source.ExecutionId);
        }
        if (source.TriggerId != null) {
            this.TriggerId = new String(source.TriggerId);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
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
        if (source.ExecutionCostTime != null) {
            this.ExecutionCostTime = new String(source.ExecutionCostTime);
        }
        if (source.QueueCostTime != null) {
            this.QueueCostTime = new String(source.QueueCostTime);
        }
        if (source.PendingCostTime != null) {
            this.PendingCostTime = new String(source.PendingCostTime);
        }
        if (source.ExecutionState != null) {
            this.ExecutionState = new String(source.ExecutionState);
        }
        if (source.ExecuteUserUin != null) {
            this.ExecuteUserUin = new String(source.ExecuteUserUin);
        }
        if (source.ExecuteUserName != null) {
            this.ExecuteUserName = new String(source.ExecuteUserName);
        }
        if (source.ErrorCodeStr != null) {
            this.ErrorCodeStr = new String(source.ErrorCodeStr);
        }
        if (source.WorkflowParams != null) {
            this.WorkflowParams = new String(source.WorkflowParams);
        }
        if (source.WorkflowVersionId != null) {
            this.WorkflowVersionId = new String(source.WorkflowVersionId);
        }
        if (source.SupportRerun != null) {
            this.SupportRerun = new Boolean(source.SupportRerun);
        }
        if (source.RerunTimes != null) {
            this.RerunTimes = new Long(source.RerunTimes);
        }
        if (source.SelectedTaskIds != null) {
            this.SelectedTaskIds = new String[source.SelectedTaskIds.length];
            for (int i = 0; i < source.SelectedTaskIds.length; i++) {
                this.SelectedTaskIds[i] = new String(source.SelectedTaskIds[i]);
            }
        }
        if (source.PendingStartTime != null) {
            this.PendingStartTime = new String(source.PendingStartTime);
        }
        if (source.QueueStartTime != null) {
            this.QueueStartTime = new String(source.QueueStartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.PlannedSchedulingTime != null) {
            this.PlannedSchedulingTime = new String(source.PlannedSchedulingTime);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.UserNameInCharge != null) {
            this.UserNameInCharge = new String(source.UserNameInCharge);
        }
        if (source.UserUinInCharge != null) {
            this.UserUinInCharge = new String(source.UserUinInCharge);
        }
        if (source.AssociatedEntityExist != null) {
            this.AssociatedEntityExist = new Boolean(source.AssociatedEntityExist);
        }
        if (source.ParentWorkflowExecutionId != null) {
            this.ParentWorkflowExecutionId = new String(source.ParentWorkflowExecutionId);
        }
        if (source.ParentTaskExecutionId != null) {
            this.ParentTaskExecutionId = new String(source.ParentTaskExecutionId);
        }
        if (source.ParentTaskExecutionName != null) {
            this.ParentTaskExecutionName = new String(source.ParentTaskExecutionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "ExecutionId", this.ExecutionId);
        this.setParamSimple(map, prefix + "TriggerId", this.TriggerId);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ScheduleTime", this.ScheduleTime);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);
        this.setParamSimple(map, prefix + "ExecutionCostTime", this.ExecutionCostTime);
        this.setParamSimple(map, prefix + "QueueCostTime", this.QueueCostTime);
        this.setParamSimple(map, prefix + "PendingCostTime", this.PendingCostTime);
        this.setParamSimple(map, prefix + "ExecutionState", this.ExecutionState);
        this.setParamSimple(map, prefix + "ExecuteUserUin", this.ExecuteUserUin);
        this.setParamSimple(map, prefix + "ExecuteUserName", this.ExecuteUserName);
        this.setParamSimple(map, prefix + "ErrorCodeStr", this.ErrorCodeStr);
        this.setParamSimple(map, prefix + "WorkflowParams", this.WorkflowParams);
        this.setParamSimple(map, prefix + "WorkflowVersionId", this.WorkflowVersionId);
        this.setParamSimple(map, prefix + "SupportRerun", this.SupportRerun);
        this.setParamSimple(map, prefix + "RerunTimes", this.RerunTimes);
        this.setParamArraySimple(map, prefix + "SelectedTaskIds.", this.SelectedTaskIds);
        this.setParamSimple(map, prefix + "PendingStartTime", this.PendingStartTime);
        this.setParamSimple(map, prefix + "QueueStartTime", this.QueueStartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "PlannedSchedulingTime", this.PlannedSchedulingTime);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "UserNameInCharge", this.UserNameInCharge);
        this.setParamSimple(map, prefix + "UserUinInCharge", this.UserUinInCharge);
        this.setParamSimple(map, prefix + "AssociatedEntityExist", this.AssociatedEntityExist);
        this.setParamSimple(map, prefix + "ParentWorkflowExecutionId", this.ParentWorkflowExecutionId);
        this.setParamSimple(map, prefix + "ParentTaskExecutionId", this.ParentTaskExecutionId);
        this.setParamSimple(map, prefix + "ParentTaskExecutionName", this.ParentTaskExecutionName);

    }
}

