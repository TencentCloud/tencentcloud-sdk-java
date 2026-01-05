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

public class TriggerTaskRunBrief extends AbstractModel {

    /**
    * 任务运行ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionId")
    @Expose
    private String ExecutionId;

    /**
    * 执行状态，运行失败:FAILED、运行成功:SUCCESS、等待中:PENDING、跳过运行:SKIP、运行中:RUNNING
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionState")
    @Expose
    private String ExecutionState;

    /**
    * 项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

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
    * 任务 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskVersionId")
    @Expose
    private String TaskVersionId;

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
    * 所属资源组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroup")
    @Expose
    private String ResourceGroup;

    /**
    * 错误码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * 运行账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecuteUserUin")
    @Expose
    private String ExecuteUserUin;

    /**
    * 创建人 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreaterUin")
    @Expose
    private String CreaterUin;

    /**
    * 执行平台执行 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 创建时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 依赖任务完成时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependenceFinishedTime")
    @Expose
    private String DependenceFinishedTime;

    /**
    * 任务下发执行平台时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueueStartTime")
    @Expose
    private String QueueStartTime;

    /**
    * 开始等待资源时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PendingStartTime")
    @Expose
    private String PendingStartTime;

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
    * 排队时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueueCostTime")
    @Expose
    private String QueueCostTime;

    /**
    * 运行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionTime")
    @Expose
    private String ExecutionTime;

    /**
    * 总花费时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllCostTime")
    @Expose
    private String AllCostTime;

    /**
    * 时区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * 依赖上游任务 ID 列表
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
    * 重试次数，为 0 则表示首次运行
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetryTimes")
    @Expose
    private Long RetryTimes;

    /**
    * 左侧坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LeftCoordinate")
    @Expose
    private Float LeftCoordinate;

    /**
    * 顶部坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopCoordinate")
    @Expose
    private Float TopCoordinate;

    /**
    * 资源组 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * 错误码描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorCodeStr")
    @Expose
    private String ErrorCodeStr;

    /**
    * 创建人 UIN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUin")
    @Expose
    private String CreateUin;

    /**
    * 下发执行平台时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IssueTime")
    @Expose
    private String IssueTime;

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
    * 运行人名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecuteUserName")
    @Expose
    private String ExecuteUserName;

    /**
    * 重跑次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RerunTimes")
    @Expose
    private Long RerunTimes;

    /**
    * 是否是最新一次运行
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsLatestExecution")
    @Expose
    private Boolean IsLatestExecution;

    /**
    * 任务运行状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskExecutionState")
    @Expose
    private String TaskExecutionState;

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
    * 责任人id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserUinInCharge")
    @Expose
    private String UserUinInCharge;

    /**
    * 资源组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * 时区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timezone")
    @Expose
    private String Timezone;

    /**
    * 文件夹id
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
    * 项目名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 任务类型id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * 工作流运行参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowParams")
    @Expose
    private String WorkflowParams;

    /**
    * 是否支持重跑
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportRerun")
    @Expose
    private Boolean SupportRerun;

    /**
    * 工作流运行状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowExecutionState")
    @Expose
    private String WorkflowExecutionState;

    /**
    * 任务执行结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionResult")
    @Expose
    private String ExecutionResult;

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
     * Get 执行状态，运行失败:FAILED、运行成功:SUCCESS、等待中:PENDING、跳过运行:SKIP、运行中:RUNNING
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionState 执行状态，运行失败:FAILED、运行成功:SUCCESS、等待中:PENDING、跳过运行:SKIP、运行中:RUNNING
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionState() {
        return this.ExecutionState;
    }

    /**
     * Set 执行状态，运行失败:FAILED、运行成功:SUCCESS、等待中:PENDING、跳过运行:SKIP、运行中:RUNNING
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionState 执行状态，运行失败:FAILED、运行成功:SUCCESS、等待中:PENDING、跳过运行:SKIP、运行中:RUNNING
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionState(String ExecutionState) {
        this.ExecutionState = ExecutionState;
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
     * Get 任务 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskVersionId 任务版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskVersionId() {
        return this.TaskVersionId;
    }

    /**
     * Set 任务版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskVersionId 任务版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskVersionId(String TaskVersionId) {
        this.TaskVersionId = TaskVersionId;
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
     * Get 所属资源组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroup 所属资源组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroup() {
        return this.ResourceGroup;
    }

    /**
     * Set 所属资源组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroup 所属资源组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroup(String ResourceGroup) {
        this.ResourceGroup = ResourceGroup;
    }

    /**
     * Get 错误码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorCode 错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set 错误码
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorCode 错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
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
     * Get 创建人 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreaterUin 创建人 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreaterUin() {
        return this.CreaterUin;
    }

    /**
     * Set 创建人 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreaterUin 创建人 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreaterUin(String CreaterUin) {
        this.CreaterUin = CreaterUin;
    }

    /**
     * Get 执行平台执行 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobId 执行平台执行 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 执行平台执行 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId 执行平台执行 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 创建时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 依赖任务完成时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependenceFinishedTime 依赖任务完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependenceFinishedTime() {
        return this.DependenceFinishedTime;
    }

    /**
     * Set 依赖任务完成时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependenceFinishedTime 依赖任务完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependenceFinishedTime(String DependenceFinishedTime) {
        this.DependenceFinishedTime = DependenceFinishedTime;
    }

    /**
     * Get 任务下发执行平台时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueueStartTime 任务下发执行平台时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueueStartTime() {
        return this.QueueStartTime;
    }

    /**
     * Set 任务下发执行平台时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueueStartTime 任务下发执行平台时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueueStartTime(String QueueStartTime) {
        this.QueueStartTime = QueueStartTime;
    }

    /**
     * Get 开始等待资源时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PendingStartTime 开始等待资源时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPendingStartTime() {
        return this.PendingStartTime;
    }

    /**
     * Set 开始等待资源时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param PendingStartTime 开始等待资源时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPendingStartTime(String PendingStartTime) {
        this.PendingStartTime = PendingStartTime;
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
     * Get 排队时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueueCostTime 排队时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueueCostTime() {
        return this.QueueCostTime;
    }

    /**
     * Set 排队时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueueCostTime 排队时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueueCostTime(String QueueCostTime) {
        this.QueueCostTime = QueueCostTime;
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
     * Get 总花费时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllCostTime 总花费时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAllCostTime() {
        return this.AllCostTime;
    }

    /**
     * Set 总花费时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllCostTime 总花费时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllCostTime(String AllCostTime) {
        this.AllCostTime = AllCostTime;
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
     * Get 依赖上游任务 ID 列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependOnList 依赖上游任务 ID 列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDependOnList() {
        return this.DependOnList;
    }

    /**
     * Set 依赖上游任务 ID 列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependOnList 依赖上游任务 ID 列表
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
     * Get 重试次数，为 0 则表示首次运行
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetryTimes 重试次数，为 0 则表示首次运行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetryTimes() {
        return this.RetryTimes;
    }

    /**
     * Set 重试次数，为 0 则表示首次运行
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetryTimes 重试次数，为 0 则表示首次运行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetryTimes(Long RetryTimes) {
        this.RetryTimes = RetryTimes;
    }

    /**
     * Get 左侧坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LeftCoordinate 左侧坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLeftCoordinate() {
        return this.LeftCoordinate;
    }

    /**
     * Set 左侧坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param LeftCoordinate 左侧坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLeftCoordinate(Float LeftCoordinate) {
        this.LeftCoordinate = LeftCoordinate;
    }

    /**
     * Get 顶部坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopCoordinate 顶部坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTopCoordinate() {
        return this.TopCoordinate;
    }

    /**
     * Set 顶部坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopCoordinate 顶部坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopCoordinate(Float TopCoordinate) {
        this.TopCoordinate = TopCoordinate;
    }

    /**
     * Get 资源组 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupId 资源组 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set 资源组 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupId 资源组 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
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
     * Get 创建人 UIN
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUin 创建人 UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set 创建人 UIN
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUin 创建人 UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUin(String CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get 下发执行平台时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IssueTime 下发执行平台时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIssueTime() {
        return this.IssueTime;
    }

    /**
     * Set 下发执行平台时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param IssueTime 下发执行平台时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIssueTime(String IssueTime) {
        this.IssueTime = IssueTime;
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
     * Get 运行人名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecuteUserName 运行人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecuteUserName() {
        return this.ExecuteUserName;
    }

    /**
     * Set 运行人名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecuteUserName 运行人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecuteUserName(String ExecuteUserName) {
        this.ExecuteUserName = ExecuteUserName;
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
     * Get 责任人id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserUinInCharge 责任人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserUinInCharge() {
        return this.UserUinInCharge;
    }

    /**
     * Set 责任人id
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserUinInCharge 责任人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserUinInCharge(String UserUinInCharge) {
        this.UserUinInCharge = UserUinInCharge;
    }

    /**
     * Get 资源组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupName 资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set 资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupName 资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get 时区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timezone 时区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimezone() {
        return this.Timezone;
    }

    /**
     * Set 时区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timezone 时区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimezone(String Timezone) {
        this.Timezone = Timezone;
    }

    /**
     * Get 文件夹id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderId 文件夹id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set 文件夹id
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderId 文件夹id
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
     * Get 项目名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 任务类型id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypeId 任务类型id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set 任务类型id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypeId 任务类型id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get 工作流运行参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowParams 工作流运行参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowParams() {
        return this.WorkflowParams;
    }

    /**
     * Set 工作流运行参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowParams 工作流运行参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowParams(String WorkflowParams) {
        this.WorkflowParams = WorkflowParams;
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
     * Get 工作流运行状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowExecutionState 工作流运行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowExecutionState() {
        return this.WorkflowExecutionState;
    }

    /**
     * Set 工作流运行状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowExecutionState 工作流运行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowExecutionState(String WorkflowExecutionState) {
        this.WorkflowExecutionState = WorkflowExecutionState;
    }

    /**
     * Get 任务执行结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionResult 任务执行结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionResult() {
        return this.ExecutionResult;
    }

    /**
     * Set 任务执行结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionResult 任务执行结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionResult(String ExecutionResult) {
        this.ExecutionResult = ExecutionResult;
    }

    public TriggerTaskRunBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerTaskRunBrief(TriggerTaskRunBrief source) {
        if (source.ExecutionId != null) {
            this.ExecutionId = new String(source.ExecutionId);
        }
        if (source.ExecutionState != null) {
            this.ExecutionState = new String(source.ExecutionState);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
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
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.TaskVersionId != null) {
            this.TaskVersionId = new String(source.TaskVersionId);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.WaitTime != null) {
            this.WaitTime = new String(source.WaitTime);
        }
        if (source.ResourceGroup != null) {
            this.ResourceGroup = new String(source.ResourceGroup);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.ExecuteUserUin != null) {
            this.ExecuteUserUin = new String(source.ExecuteUserUin);
        }
        if (source.CreaterUin != null) {
            this.CreaterUin = new String(source.CreaterUin);
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
        if (source.QueueStartTime != null) {
            this.QueueStartTime = new String(source.QueueStartTime);
        }
        if (source.PendingStartTime != null) {
            this.PendingStartTime = new String(source.PendingStartTime);
        }
        if (source.ExecutionStartTime != null) {
            this.ExecutionStartTime = new String(source.ExecutionStartTime);
        }
        if (source.ExecutionEndTime != null) {
            this.ExecutionEndTime = new String(source.ExecutionEndTime);
        }
        if (source.QueueCostTime != null) {
            this.QueueCostTime = new String(source.QueueCostTime);
        }
        if (source.ExecutionTime != null) {
            this.ExecutionTime = new String(source.ExecutionTime);
        }
        if (source.AllCostTime != null) {
            this.AllCostTime = new String(source.AllCostTime);
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
        if (source.RetryTimes != null) {
            this.RetryTimes = new Long(source.RetryTimes);
        }
        if (source.LeftCoordinate != null) {
            this.LeftCoordinate = new Float(source.LeftCoordinate);
        }
        if (source.TopCoordinate != null) {
            this.TopCoordinate = new Float(source.TopCoordinate);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.ErrorCodeStr != null) {
            this.ErrorCodeStr = new String(source.ErrorCodeStr);
        }
        if (source.CreateUin != null) {
            this.CreateUin = new String(source.CreateUin);
        }
        if (source.IssueTime != null) {
            this.IssueTime = new String(source.IssueTime);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.ExecuteUserName != null) {
            this.ExecuteUserName = new String(source.ExecuteUserName);
        }
        if (source.RerunTimes != null) {
            this.RerunTimes = new Long(source.RerunTimes);
        }
        if (source.IsLatestExecution != null) {
            this.IsLatestExecution = new Boolean(source.IsLatestExecution);
        }
        if (source.TaskExecutionState != null) {
            this.TaskExecutionState = new String(source.TaskExecutionState);
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
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
        if (source.Timezone != null) {
            this.Timezone = new String(source.Timezone);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
        if (source.WorkflowParams != null) {
            this.WorkflowParams = new String(source.WorkflowParams);
        }
        if (source.SupportRerun != null) {
            this.SupportRerun = new Boolean(source.SupportRerun);
        }
        if (source.WorkflowExecutionState != null) {
            this.WorkflowExecutionState = new String(source.WorkflowExecutionState);
        }
        if (source.ExecutionResult != null) {
            this.ExecutionResult = new String(source.ExecutionResult);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecutionId", this.ExecutionId);
        this.setParamSimple(map, prefix + "ExecutionState", this.ExecutionState);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowExecutionId", this.WorkflowExecutionId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TaskVersionId", this.TaskVersionId);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "WaitTime", this.WaitTime);
        this.setParamSimple(map, prefix + "ResourceGroup", this.ResourceGroup);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ExecuteUserUin", this.ExecuteUserUin);
        this.setParamSimple(map, prefix + "CreaterUin", this.CreaterUin);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "DependenceFinishedTime", this.DependenceFinishedTime);
        this.setParamSimple(map, prefix + "QueueStartTime", this.QueueStartTime);
        this.setParamSimple(map, prefix + "PendingStartTime", this.PendingStartTime);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);
        this.setParamSimple(map, prefix + "QueueCostTime", this.QueueCostTime);
        this.setParamSimple(map, prefix + "ExecutionTime", this.ExecutionTime);
        this.setParamSimple(map, prefix + "AllCostTime", this.AllCostTime);
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamArraySimple(map, prefix + "DependOnList.", this.DependOnList);
        this.setParamSimple(map, prefix + "RunParams", this.RunParams);
        this.setParamSimple(map, prefix + "TaskTypeExtensions", this.TaskTypeExtensions);
        this.setParamSimple(map, prefix + "RetryTimes", this.RetryTimes);
        this.setParamSimple(map, prefix + "LeftCoordinate", this.LeftCoordinate);
        this.setParamSimple(map, prefix + "TopCoordinate", this.TopCoordinate);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "ErrorCodeStr", this.ErrorCodeStr);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamSimple(map, prefix + "IssueTime", this.IssueTime);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "ExecuteUserName", this.ExecuteUserName);
        this.setParamSimple(map, prefix + "RerunTimes", this.RerunTimes);
        this.setParamSimple(map, prefix + "IsLatestExecution", this.IsLatestExecution);
        this.setParamSimple(map, prefix + "TaskExecutionState", this.TaskExecutionState);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "UserNameInCharge", this.UserNameInCharge);
        this.setParamSimple(map, prefix + "UserUinInCharge", this.UserUinInCharge);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);
        this.setParamSimple(map, prefix + "Timezone", this.Timezone);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "WorkflowParams", this.WorkflowParams);
        this.setParamSimple(map, prefix + "SupportRerun", this.SupportRerun);
        this.setParamSimple(map, prefix + "WorkflowExecutionState", this.WorkflowExecutionState);
        this.setParamSimple(map, prefix + "ExecutionResult", this.ExecutionResult);

    }
}

