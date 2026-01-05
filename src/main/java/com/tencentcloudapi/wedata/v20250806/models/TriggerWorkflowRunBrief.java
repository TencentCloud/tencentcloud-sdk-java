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
    * 用户AppId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

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
    @SerializedName("ExecutionId")
    @Expose
    private String ExecutionId;

    /**
    * 触发器ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerId")
    @Expose
    private String TriggerId;

    /**
    * 触发方式:调度触发Scheduler、手动触发ManualTrigger、事件触发Event
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * 工作流触发时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 执行开始时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * 执行结束时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * 运行时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionCostTime")
    @Expose
    private String ExecutionCostTime;

    /**
    * 并发排队花费时间，单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueueCostTime")
    @Expose
    private String QueueCostTime;

    /**
    * 等待资源花费时间，单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PendingCostTime")
    @Expose
    private String PendingCostTime;

    /**
    * 执行状态，运行失败:FAILED、运行成功:SUCCESS、等待中:PENDING、跳过运行:SKIPED、运行中:RUNNING
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionState")
    @Expose
    private String ExecutionState;

    /**
    * 运行用户UIN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecuteUserUin")
    @Expose
    private String ExecuteUserUin;

    /**
    * 运行用户名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecuteUserName")
    @Expose
    private String ExecuteUserName;

    /**
    * 错误码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorCodeStr")
    @Expose
    private String ErrorCodeStr;

    /**
    * 运行参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowParams")
    @Expose
    private String WorkflowParams;

    /**
    * 工作流版本信息ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowVersionId")
    @Expose
    private String WorkflowVersionId;

    /**
    * 是否支持重跑
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportRerun")
    @Expose
    private Boolean SupportRerun;

    /**
    * 重跑次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RerunTimes")
    @Expose
    private Long RerunTimes;

    /**
    * 运行的任务范围,逗号分隔的任务ID列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelectedTaskIds")
    @Expose
    private String [] SelectedTaskIds;

    /**
    * 等待并发开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PendingStartTime")
    @Expose
    private String PendingStartTime;

    /**
    * 排队等待开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueueStartTime")
    @Expose
    private String QueueStartTime;

    /**
    * 运行结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * 文件夹名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * 计划调度时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PlannedSchedulingTime")
    @Expose
    private String PlannedSchedulingTime;

    /**
    * 周期类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * 责任人名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserNameInCharge")
    @Expose
    private String UserNameInCharge;

    /**
    * 责任人ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserUinInCharge")
    @Expose
    private String UserUinInCharge;

    /**
     * Get 用户AppId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 用户AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户AppId
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 用户AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 项目ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
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
     * @return ExecutionId 工作流运行ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionId() {
        return this.ExecutionId;
    }

    /**
     * Set 工作流运行ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionId 工作流运行ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionId(String ExecutionId) {
        this.ExecutionId = ExecutionId;
    }

    /**
     * Get 触发器ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerId 触发器ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerId() {
        return this.TriggerId;
    }

    /**
     * Set 触发器ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerId 触发器ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerId(String TriggerId) {
        this.TriggerId = TriggerId;
    }

    /**
     * Get 触发方式:调度触发Scheduler、手动触发ManualTrigger、事件触发Event
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerType 触发方式:调度触发Scheduler、手动触发ManualTrigger、事件触发Event
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set 触发方式:调度触发Scheduler、手动触发ManualTrigger、事件触发Event
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerType 触发方式:调度触发Scheduler、手动触发ManualTrigger、事件触发Event
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get 工作流触发时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 工作流触发时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 工作流触发时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 工作流触发时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 执行开始时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionStartTime 执行开始时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set 执行开始时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionStartTime 执行开始时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get 执行结束时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionEndTime 执行结束时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set 执行结束时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionEndTime 执行结束时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    /**
     * Get 运行时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionCostTime 运行时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionCostTime() {
        return this.ExecutionCostTime;
    }

    /**
     * Set 运行时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionCostTime 运行时长，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionCostTime(String ExecutionCostTime) {
        this.ExecutionCostTime = ExecutionCostTime;
    }

    /**
     * Get 并发排队花费时间，单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueueCostTime 并发排队花费时间，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueueCostTime() {
        return this.QueueCostTime;
    }

    /**
     * Set 并发排队花费时间，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueueCostTime 并发排队花费时间，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueueCostTime(String QueueCostTime) {
        this.QueueCostTime = QueueCostTime;
    }

    /**
     * Get 等待资源花费时间，单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PendingCostTime 等待资源花费时间，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPendingCostTime() {
        return this.PendingCostTime;
    }

    /**
     * Set 等待资源花费时间，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param PendingCostTime 等待资源花费时间，单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPendingCostTime(String PendingCostTime) {
        this.PendingCostTime = PendingCostTime;
    }

    /**
     * Get 执行状态，运行失败:FAILED、运行成功:SUCCESS、等待中:PENDING、跳过运行:SKIPED、运行中:RUNNING
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionState 执行状态，运行失败:FAILED、运行成功:SUCCESS、等待中:PENDING、跳过运行:SKIPED、运行中:RUNNING
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionState() {
        return this.ExecutionState;
    }

    /**
     * Set 执行状态，运行失败:FAILED、运行成功:SUCCESS、等待中:PENDING、跳过运行:SKIPED、运行中:RUNNING
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionState 执行状态，运行失败:FAILED、运行成功:SUCCESS、等待中:PENDING、跳过运行:SKIPED、运行中:RUNNING
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionState(String ExecutionState) {
        this.ExecutionState = ExecutionState;
    }

    /**
     * Get 运行用户UIN
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecuteUserUin 运行用户UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecuteUserUin() {
        return this.ExecuteUserUin;
    }

    /**
     * Set 运行用户UIN
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecuteUserUin 运行用户UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecuteUserUin(String ExecuteUserUin) {
        this.ExecuteUserUin = ExecuteUserUin;
    }

    /**
     * Get 运行用户名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecuteUserName 运行用户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecuteUserName() {
        return this.ExecuteUserName;
    }

    /**
     * Set 运行用户名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecuteUserName 运行用户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecuteUserName(String ExecuteUserName) {
        this.ExecuteUserName = ExecuteUserName;
    }

    /**
     * Get 错误码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorCodeStr 错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorCodeStr() {
        return this.ErrorCodeStr;
    }

    /**
     * Set 错误码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorCodeStr 错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorCodeStr(String ErrorCodeStr) {
        this.ErrorCodeStr = ErrorCodeStr;
    }

    /**
     * Get 运行参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowParams 运行参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowParams() {
        return this.WorkflowParams;
    }

    /**
     * Set 运行参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowParams 运行参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowParams(String WorkflowParams) {
        this.WorkflowParams = WorkflowParams;
    }

    /**
     * Get 工作流版本信息ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowVersionId 工作流版本信息ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowVersionId() {
        return this.WorkflowVersionId;
    }

    /**
     * Set 工作流版本信息ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowVersionId 工作流版本信息ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowVersionId(String WorkflowVersionId) {
        this.WorkflowVersionId = WorkflowVersionId;
    }

    /**
     * Get 是否支持重跑
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportRerun 是否支持重跑
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSupportRerun() {
        return this.SupportRerun;
    }

    /**
     * Set 是否支持重跑
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportRerun 是否支持重跑
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportRerun(Boolean SupportRerun) {
        this.SupportRerun = SupportRerun;
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
     * Get 运行的任务范围,逗号分隔的任务ID列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelectedTaskIds 运行的任务范围,逗号分隔的任务ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSelectedTaskIds() {
        return this.SelectedTaskIds;
    }

    /**
     * Set 运行的任务范围,逗号分隔的任务ID列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelectedTaskIds 运行的任务范围,逗号分隔的任务ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelectedTaskIds(String [] SelectedTaskIds) {
        this.SelectedTaskIds = SelectedTaskIds;
    }

    /**
     * Get 等待并发开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PendingStartTime 等待并发开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPendingStartTime() {
        return this.PendingStartTime;
    }

    /**
     * Set 等待并发开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param PendingStartTime 等待并发开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPendingStartTime(String PendingStartTime) {
        this.PendingStartTime = PendingStartTime;
    }

    /**
     * Get 排队等待开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueueStartTime 排队等待开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueueStartTime() {
        return this.QueueStartTime;
    }

    /**
     * Set 排队等待开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueueStartTime 排队等待开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueueStartTime(String QueueStartTime) {
        this.QueueStartTime = QueueStartTime;
    }

    /**
     * Get 运行结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 运行结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 运行结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 运行结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderId 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderId 文件夹ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get 文件夹名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderName 文件夹名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set 文件夹名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderName 文件夹名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    /**
     * Get 计划调度时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PlannedSchedulingTime 计划调度时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPlannedSchedulingTime() {
        return this.PlannedSchedulingTime;
    }

    /**
     * Set 计划调度时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param PlannedSchedulingTime 计划调度时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlannedSchedulingTime(String PlannedSchedulingTime) {
        this.PlannedSchedulingTime = PlannedSchedulingTime;
    }

    /**
     * Get 周期类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleType 周期类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set 周期类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleType 周期类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get 责任人名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserNameInCharge 责任人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserNameInCharge() {
        return this.UserNameInCharge;
    }

    /**
     * Set 责任人名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserNameInCharge 责任人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserNameInCharge(String UserNameInCharge) {
        this.UserNameInCharge = UserNameInCharge;
    }

    /**
     * Get 责任人ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserUinInCharge 责任人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserUinInCharge() {
        return this.UserUinInCharge;
    }

    /**
     * Set 责任人ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserUinInCharge 责任人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserUinInCharge(String UserUinInCharge) {
        this.UserUinInCharge = UserUinInCharge;
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

    }
}

