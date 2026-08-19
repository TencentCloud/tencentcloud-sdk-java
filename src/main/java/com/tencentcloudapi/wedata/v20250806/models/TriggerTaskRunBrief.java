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
    * <p>任务运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionId")
    @Expose
    private String ExecutionId;

    /**
    * <p>执行状态，运行失败:FAILED、运行成功:SUCCESS、等待中:PENDING、跳过运行:SKIP、运行中:RUNNING</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionState")
    @Expose
    private String ExecutionState;

    /**
    * <p>项目ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

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
    @SerializedName("WorkflowExecutionId")
    @Expose
    private String WorkflowExecutionId;

    /**
    * <p>任务 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>任务版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskVersionId")
    @Expose
    private String TaskVersionId;

    /**
    * <p>触发类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * <p>等待时长，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WaitTime")
    @Expose
    private String WaitTime;

    /**
    * <p>所属资源组</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroup")
    @Expose
    private String ResourceGroup;

    /**
    * <p>错误码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * <p>运行账号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecuteUserUin")
    @Expose
    private String ExecuteUserUin;

    /**
    * <p>创建人 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreaterUin")
    @Expose
    private String CreaterUin;

    /**
    * <p>执行平台执行 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>创建时间戳</p>
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
    * <p>更新时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>依赖任务完成时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependenceFinishedTime")
    @Expose
    private String DependenceFinishedTime;

    /**
    * <p>任务下发执行平台时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueueStartTime")
    @Expose
    private String QueueStartTime;

    /**
    * <p>开始等待资源时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PendingStartTime")
    @Expose
    private String PendingStartTime;

    /**
    * <p>运行开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * <p>运行结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * <p>排队时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueueCostTime")
    @Expose
    private String QueueCostTime;

    /**
    * <p>运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionTime")
    @Expose
    private String ExecutionTime;

    /**
    * <p>总花费时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllCostTime")
    @Expose
    private String AllCostTime;

    /**
    * <p>时区</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * <p>依赖上游任务 ID 列表</p>
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
    * <p>重试次数，为 0 则表示首次运行</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetryTimes")
    @Expose
    private Long RetryTimes;

    /**
    * <p>左侧坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LeftCoordinate")
    @Expose
    private Float LeftCoordinate;

    /**
    * <p>顶部坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopCoordinate")
    @Expose
    private Float TopCoordinate;

    /**
    * <p>资源组 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * <p>错误码描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorCodeStr")
    @Expose
    private String ErrorCodeStr;

    /**
    * <p>创建人 UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUin")
    @Expose
    private String CreateUin;

    /**
    * <p>下发执行平台时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IssueTime")
    @Expose
    private String IssueTime;

    /**
    * <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>工作流名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * <p>运行人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecuteUserName")
    @Expose
    private String ExecuteUserName;

    /**
    * <p>重跑次数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RerunTimes")
    @Expose
    private Long RerunTimes;

    /**
    * <p>是否是最新一次运行</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsLatestExecution")
    @Expose
    private Boolean IsLatestExecution;

    /**
    * <p>任务运行状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskExecutionState")
    @Expose
    private String TaskExecutionState;

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
    * <p>责任人id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserUinInCharge")
    @Expose
    private String UserUinInCharge;

    /**
    * <p>资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * <p>时区</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timezone")
    @Expose
    private String Timezone;

    /**
    * <p>文件夹id</p>
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
    * <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * <p>任务类型id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * <p>工作流运行参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowParams")
    @Expose
    private String WorkflowParams;

    /**
    * <p>是否支持重跑</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportRerun")
    @Expose
    private Boolean SupportRerun;

    /**
    * <p>工作流运行状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowExecutionState")
    @Expose
    private String WorkflowExecutionState;

    /**
    * <p>任务执行结果</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionResult")
    @Expose
    private String ExecutionResult;

    /**
    * <p>依赖策略</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependencyTriggerPolicy")
    @Expose
    private String DependencyTriggerPolicy;

    /**
    * <p>关联实体是否存在，true表示任务/工作流等实体存在，false表示实体已被删除</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssociatedEntityExist")
    @Expose
    private Boolean AssociatedEntityExist;

    /**
    * <p>调度执行类型</p><p>枚举值：</p><ul><li>0： 正常调度</li><li>1： 空跑调度</li><li>2： 用户驱动，手动触发</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleRunType")
    @Expose
    private String ScheduleRunType;

    /**
     * Get <p>任务运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionId <p>任务运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionId() {
        return this.ExecutionId;
    }

    /**
     * Set <p>任务运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionId <p>任务运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionId(String ExecutionId) {
        this.ExecutionId = ExecutionId;
    }

    /**
     * Get <p>执行状态，运行失败:FAILED、运行成功:SUCCESS、等待中:PENDING、跳过运行:SKIP、运行中:RUNNING</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionState <p>执行状态，运行失败:FAILED、运行成功:SUCCESS、等待中:PENDING、跳过运行:SKIP、运行中:RUNNING</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionState() {
        return this.ExecutionState;
    }

    /**
     * Set <p>执行状态，运行失败:FAILED、运行成功:SUCCESS、等待中:PENDING、跳过运行:SKIP、运行中:RUNNING</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionState <p>执行状态，运行失败:FAILED、运行成功:SUCCESS、等待中:PENDING、跳过运行:SKIP、运行中:RUNNING</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionState(String ExecutionState) {
        this.ExecutionState = ExecutionState;
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
     * @return WorkflowExecutionId <p>工作流运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowExecutionId() {
        return this.WorkflowExecutionId;
    }

    /**
     * Set <p>工作流运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowExecutionId <p>工作流运行ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowExecutionId(String WorkflowExecutionId) {
        this.WorkflowExecutionId = WorkflowExecutionId;
    }

    /**
     * Get <p>任务 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId <p>任务 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId <p>任务 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskType <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>任务版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskVersionId <p>任务版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskVersionId() {
        return this.TaskVersionId;
    }

    /**
     * Set <p>任务版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskVersionId <p>任务版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskVersionId(String TaskVersionId) {
        this.TaskVersionId = TaskVersionId;
    }

    /**
     * Get <p>触发类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerType <p>触发类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set <p>触发类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerType <p>触发类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get <p>等待时长，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WaitTime <p>等待时长，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWaitTime() {
        return this.WaitTime;
    }

    /**
     * Set <p>等待时长，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WaitTime <p>等待时长，单位秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWaitTime(String WaitTime) {
        this.WaitTime = WaitTime;
    }

    /**
     * Get <p>所属资源组</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroup <p>所属资源组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroup() {
        return this.ResourceGroup;
    }

    /**
     * Set <p>所属资源组</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroup <p>所属资源组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroup(String ResourceGroup) {
        this.ResourceGroup = ResourceGroup;
    }

    /**
     * Get <p>错误码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorCode <p>错误码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set <p>错误码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorCode <p>错误码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get <p>运行账号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecuteUserUin <p>运行账号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecuteUserUin() {
        return this.ExecuteUserUin;
    }

    /**
     * Set <p>运行账号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecuteUserUin <p>运行账号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecuteUserUin(String ExecuteUserUin) {
        this.ExecuteUserUin = ExecuteUserUin;
    }

    /**
     * Get <p>创建人 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreaterUin <p>创建人 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreaterUin() {
        return this.CreaterUin;
    }

    /**
     * Set <p>创建人 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreaterUin <p>创建人 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreaterUin(String CreaterUin) {
        this.CreaterUin = CreaterUin;
    }

    /**
     * Get <p>执行平台执行 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobId <p>执行平台执行 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>执行平台执行 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId <p>执行平台执行 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>创建时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间戳</p>
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
     * Get <p>更新时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>更新时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>更新时间戳</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>依赖任务完成时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependenceFinishedTime <p>依赖任务完成时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependenceFinishedTime() {
        return this.DependenceFinishedTime;
    }

    /**
     * Set <p>依赖任务完成时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependenceFinishedTime <p>依赖任务完成时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependenceFinishedTime(String DependenceFinishedTime) {
        this.DependenceFinishedTime = DependenceFinishedTime;
    }

    /**
     * Get <p>任务下发执行平台时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueueStartTime <p>任务下发执行平台时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueueStartTime() {
        return this.QueueStartTime;
    }

    /**
     * Set <p>任务下发执行平台时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueueStartTime <p>任务下发执行平台时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueueStartTime(String QueueStartTime) {
        this.QueueStartTime = QueueStartTime;
    }

    /**
     * Get <p>开始等待资源时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PendingStartTime <p>开始等待资源时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPendingStartTime() {
        return this.PendingStartTime;
    }

    /**
     * Set <p>开始等待资源时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PendingStartTime <p>开始等待资源时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPendingStartTime(String PendingStartTime) {
        this.PendingStartTime = PendingStartTime;
    }

    /**
     * Get <p>运行开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionStartTime <p>运行开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set <p>运行开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionStartTime <p>运行开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get <p>运行结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionEndTime <p>运行结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set <p>运行结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionEndTime <p>运行结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    /**
     * Get <p>排队时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueueCostTime <p>排队时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueueCostTime() {
        return this.QueueCostTime;
    }

    /**
     * Set <p>排队时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueueCostTime <p>排队时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueueCostTime(String QueueCostTime) {
        this.QueueCostTime = QueueCostTime;
    }

    /**
     * Get <p>运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionTime <p>运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionTime() {
        return this.ExecutionTime;
    }

    /**
     * Set <p>运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionTime <p>运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionTime(String ExecutionTime) {
        this.ExecutionTime = ExecutionTime;
    }

    /**
     * Get <p>总花费时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllCostTime <p>总花费时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAllCostTime() {
        return this.AllCostTime;
    }

    /**
     * Set <p>总花费时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllCostTime <p>总花费时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllCostTime(String AllCostTime) {
        this.AllCostTime = AllCostTime;
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
     * Get <p>依赖上游任务 ID 列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependOnList <p>依赖上游任务 ID 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDependOnList() {
        return this.DependOnList;
    }

    /**
     * Set <p>依赖上游任务 ID 列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependOnList <p>依赖上游任务 ID 列表</p>
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
     * Get <p>左侧坐标</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LeftCoordinate <p>左侧坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLeftCoordinate() {
        return this.LeftCoordinate;
    }

    /**
     * Set <p>左侧坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LeftCoordinate <p>左侧坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLeftCoordinate(Float LeftCoordinate) {
        this.LeftCoordinate = LeftCoordinate;
    }

    /**
     * Get <p>顶部坐标</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopCoordinate <p>顶部坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTopCoordinate() {
        return this.TopCoordinate;
    }

    /**
     * Set <p>顶部坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopCoordinate <p>顶部坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopCoordinate(Float TopCoordinate) {
        this.TopCoordinate = TopCoordinate;
    }

    /**
     * Get <p>资源组 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupId <p>资源组 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set <p>资源组 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupId <p>资源组 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get <p>错误码描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorCodeStr <p>错误码描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorCodeStr() {
        return this.ErrorCodeStr;
    }

    /**
     * Set <p>错误码描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorCodeStr <p>错误码描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorCodeStr(String ErrorCodeStr) {
        this.ErrorCodeStr = ErrorCodeStr;
    }

    /**
     * Get <p>创建人 UIN</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUin <p>创建人 UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateUin() {
        return this.CreateUin;
    }

    /**
     * Set <p>创建人 UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUin <p>创建人 UIN</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUin(String CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * Get <p>下发执行平台时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IssueTime <p>下发执行平台时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIssueTime() {
        return this.IssueTime;
    }

    /**
     * Set <p>下发执行平台时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IssueTime <p>下发执行平台时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIssueTime(String IssueTime) {
        this.IssueTime = IssueTime;
    }

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
     * Get <p>运行人名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecuteUserName <p>运行人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecuteUserName() {
        return this.ExecuteUserName;
    }

    /**
     * Set <p>运行人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecuteUserName <p>运行人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecuteUserName(String ExecuteUserName) {
        this.ExecuteUserName = ExecuteUserName;
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
     * Get <p>是否是最新一次运行</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsLatestExecution <p>是否是最新一次运行</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsLatestExecution() {
        return this.IsLatestExecution;
    }

    /**
     * Set <p>是否是最新一次运行</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsLatestExecution <p>是否是最新一次运行</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsLatestExecution(Boolean IsLatestExecution) {
        this.IsLatestExecution = IsLatestExecution;
    }

    /**
     * Get <p>任务运行状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskExecutionState <p>任务运行状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskExecutionState() {
        return this.TaskExecutionState;
    }

    /**
     * Set <p>任务运行状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskExecutionState <p>任务运行状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskExecutionState(String TaskExecutionState) {
        this.TaskExecutionState = TaskExecutionState;
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
     * Get <p>责任人id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserUinInCharge <p>责任人id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserUinInCharge() {
        return this.UserUinInCharge;
    }

    /**
     * Set <p>责任人id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserUinInCharge <p>责任人id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserUinInCharge(String UserUinInCharge) {
        this.UserUinInCharge = UserUinInCharge;
    }

    /**
     * Get <p>资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupName <p>资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set <p>资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupName <p>资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get <p>时区</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timezone <p>时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimezone() {
        return this.Timezone;
    }

    /**
     * Set <p>时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timezone <p>时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimezone(String Timezone) {
        this.Timezone = Timezone;
    }

    /**
     * Get <p>文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FolderId <p>文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set <p>文件夹id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FolderId <p>文件夹id</p>
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
     * Get <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName <p>项目名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get <p>任务类型id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypeId <p>任务类型id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set <p>任务类型id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypeId <p>任务类型id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get <p>工作流运行参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowParams <p>工作流运行参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowParams() {
        return this.WorkflowParams;
    }

    /**
     * Set <p>工作流运行参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowParams <p>工作流运行参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowParams(String WorkflowParams) {
        this.WorkflowParams = WorkflowParams;
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
     * Get <p>工作流运行状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowExecutionState <p>工作流运行状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowExecutionState() {
        return this.WorkflowExecutionState;
    }

    /**
     * Set <p>工作流运行状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowExecutionState <p>工作流运行状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowExecutionState(String WorkflowExecutionState) {
        this.WorkflowExecutionState = WorkflowExecutionState;
    }

    /**
     * Get <p>任务执行结果</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionResult <p>任务执行结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionResult() {
        return this.ExecutionResult;
    }

    /**
     * Set <p>任务执行结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionResult <p>任务执行结果</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionResult(String ExecutionResult) {
        this.ExecutionResult = ExecutionResult;
    }

    /**
     * Get <p>依赖策略</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependencyTriggerPolicy <p>依赖策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependencyTriggerPolicy() {
        return this.DependencyTriggerPolicy;
    }

    /**
     * Set <p>依赖策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependencyTriggerPolicy <p>依赖策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependencyTriggerPolicy(String DependencyTriggerPolicy) {
        this.DependencyTriggerPolicy = DependencyTriggerPolicy;
    }

    /**
     * Get <p>关联实体是否存在，true表示任务/工作流等实体存在，false表示实体已被删除</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssociatedEntityExist <p>关联实体是否存在，true表示任务/工作流等实体存在，false表示实体已被删除</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAssociatedEntityExist() {
        return this.AssociatedEntityExist;
    }

    /**
     * Set <p>关联实体是否存在，true表示任务/工作流等实体存在，false表示实体已被删除</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssociatedEntityExist <p>关联实体是否存在，true表示任务/工作流等实体存在，false表示实体已被删除</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssociatedEntityExist(Boolean AssociatedEntityExist) {
        this.AssociatedEntityExist = AssociatedEntityExist;
    }

    /**
     * Get <p>调度执行类型</p><p>枚举值：</p><ul><li>0： 正常调度</li><li>1： 空跑调度</li><li>2： 用户驱动，手动触发</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleRunType <p>调度执行类型</p><p>枚举值：</p><ul><li>0： 正常调度</li><li>1： 空跑调度</li><li>2： 用户驱动，手动触发</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleRunType() {
        return this.ScheduleRunType;
    }

    /**
     * Set <p>调度执行类型</p><p>枚举值：</p><ul><li>0： 正常调度</li><li>1： 空跑调度</li><li>2： 用户驱动，手动触发</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleRunType <p>调度执行类型</p><p>枚举值：</p><ul><li>0： 正常调度</li><li>1： 空跑调度</li><li>2： 用户驱动，手动触发</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleRunType(String ScheduleRunType) {
        this.ScheduleRunType = ScheduleRunType;
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
        if (source.ScheduleTime != null) {
            this.ScheduleTime = new String(source.ScheduleTime);
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
        if (source.DependencyTriggerPolicy != null) {
            this.DependencyTriggerPolicy = new String(source.DependencyTriggerPolicy);
        }
        if (source.AssociatedEntityExist != null) {
            this.AssociatedEntityExist = new Boolean(source.AssociatedEntityExist);
        }
        if (source.ScheduleRunType != null) {
            this.ScheduleRunType = new String(source.ScheduleRunType);
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
        this.setParamSimple(map, prefix + "ScheduleTime", this.ScheduleTime);
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
        this.setParamSimple(map, prefix + "DependencyTriggerPolicy", this.DependencyTriggerPolicy);
        this.setParamSimple(map, prefix + "AssociatedEntityExist", this.AssociatedEntityExist);
        this.setParamSimple(map, prefix + "ScheduleRunType", this.ScheduleRunType);

    }
}

