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

public class WorkflowRun extends AbstractModel {

    /**
    * 主账号ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

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
    @SerializedName("WorkflowRunId")
    @Expose
    private String WorkflowRunId;

    /**
    * 工作空间ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkspaceId")
    @Expose
    private String WorkspaceId;

    /**
    * 触发方式，Scheduler、ManualTrigger、Event (参考SchedulerTriggerType)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerType")
    @Expose
    private String TriggerType;

    /**
    * 运行开始时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunStartTime")
    @Expose
    private String RunStartTime;

    /**
    * pending 状态开始时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PendingStartTime")
    @Expose
    private String PendingStartTime;

    /**
    * queue 状态开始时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueueStartTime")
    @Expose
    private String QueueStartTime;

    /**
    * 运行结束时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunEndTime")
    @Expose
    private String RunEndTime;

    /**
    * 终态时间，运行进入终态时都有值，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 运行时长，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunCostTime")
    @Expose
    private String RunCostTime;

    /**
    * 并发排队花费时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueueCostTime")
    @Expose
    private String QueueCostTime;

    /**
    * 等待资源花费时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PendingCostTime")
    @Expose
    private String PendingCostTime;

    /**
    * 运行状态。取值参考工作流运行状态枚举，如 Pending / Running / Succeeded / Failed / Killed
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunState")
    @Expose
    private String RunState;

    /**
    * 计算资源（任务的资源组ID集合）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupIds")
    @Expose
    private String [] ResourceGroupIds;

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
    * 错误码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorCodeString")
    @Expose
    private String ErrorCodeString;

    /**
    * 运行参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowParams")
    @Expose
    private String WorkflowParams;

    /**
    * 工作流版本ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowVersionId")
    @Expose
    private String WorkflowVersionId;

    /**
    * 当前工作流是否支持重跑
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportRerun")
    @Expose
    private Boolean SupportRerun;

    /**
    * 工作流运行创建时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 重跑次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RerunTimes")
    @Expose
    private Long RerunTimes;

    /**
    * 运行的任务范围，任务ID列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelectedTaskIds")
    @Expose
    private String [] SelectedTaskIds;

    /**
    * 资源组信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupInfoList")
    @Expose
    private ResourceGroupInfo [] ResourceGroupInfoList;

    /**
    * 标签列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelList")
    @Expose
    private LabelBrief [] LabelList;

    /**
    * 父工作流运行ID 【由嵌套工作流触发独有】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentWorkflowRunId")
    @Expose
    private String ParentWorkflowRunId;

    /**
    * 父工作流任务运行ID 【由嵌套工作流触发独有】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentWorkflowTaskRunId")
    @Expose
    private String ParentWorkflowTaskRunId;

    /**
    * 父工作流任务运行名称 【由嵌套工作流触发独有】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParentWorkflowTaskRunName")
    @Expose
    private String ParentWorkflowTaskRunName;

    /**
    * 权限信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Permission")
    @Expose
    private String Permission;

    /**
    * 工作流高级运行时用户填入的参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvancedParameters")
    @Expose
    private AdvancedParameter [] AdvancedParameters;

    /**
     * Get 主账号ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 主账号ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 主账号ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 主账号ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
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
     * Get 触发方式，Scheduler、ManualTrigger、Event (参考SchedulerTriggerType)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerType 触发方式，Scheduler、ManualTrigger、Event (参考SchedulerTriggerType)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set 触发方式，Scheduler、ManualTrigger、Event (参考SchedulerTriggerType)
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerType 触发方式，Scheduler、ManualTrigger、Event (参考SchedulerTriggerType)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerType(String TriggerType) {
        this.TriggerType = TriggerType;
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
     * Get pending 状态开始时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PendingStartTime pending 状态开始时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPendingStartTime() {
        return this.PendingStartTime;
    }

    /**
     * Set pending 状态开始时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param PendingStartTime pending 状态开始时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPendingStartTime(String PendingStartTime) {
        this.PendingStartTime = PendingStartTime;
    }

    /**
     * Get queue 状态开始时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueueStartTime queue 状态开始时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueueStartTime() {
        return this.QueueStartTime;
    }

    /**
     * Set queue 状态开始时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueueStartTime queue 状态开始时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueueStartTime(String QueueStartTime) {
        this.QueueStartTime = QueueStartTime;
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
     * Get 终态时间，运行进入终态时都有值，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 终态时间，运行进入终态时都有值，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 终态时间，运行进入终态时都有值，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 终态时间，运行进入终态时都有值，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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
     * Get 并发排队花费时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueueCostTime 并发排队花费时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueueCostTime() {
        return this.QueueCostTime;
    }

    /**
     * Set 并发排队花费时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueueCostTime 并发排队花费时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueueCostTime(String QueueCostTime) {
        this.QueueCostTime = QueueCostTime;
    }

    /**
     * Get 等待资源花费时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PendingCostTime 等待资源花费时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPendingCostTime() {
        return this.PendingCostTime;
    }

    /**
     * Set 等待资源花费时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param PendingCostTime 等待资源花费时间，单位：秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPendingCostTime(String PendingCostTime) {
        this.PendingCostTime = PendingCostTime;
    }

    /**
     * Get 运行状态。取值参考工作流运行状态枚举，如 Pending / Running / Succeeded / Failed / Killed
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunState 运行状态。取值参考工作流运行状态枚举，如 Pending / Running / Succeeded / Failed / Killed
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunState() {
        return this.RunState;
    }

    /**
     * Set 运行状态。取值参考工作流运行状态枚举，如 Pending / Running / Succeeded / Failed / Killed
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunState 运行状态。取值参考工作流运行状态枚举，如 Pending / Running / Succeeded / Failed / Killed
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunState(String RunState) {
        this.RunState = RunState;
    }

    /**
     * Get 计算资源（任务的资源组ID集合）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupIds 计算资源（任务的资源组ID集合）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getResourceGroupIds() {
        return this.ResourceGroupIds;
    }

    /**
     * Set 计算资源（任务的资源组ID集合）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupIds 计算资源（任务的资源组ID集合）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupIds(String [] ResourceGroupIds) {
        this.ResourceGroupIds = ResourceGroupIds;
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
     * Get 工作流版本ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowVersionId 工作流版本ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowVersionId() {
        return this.WorkflowVersionId;
    }

    /**
     * Set 工作流版本ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowVersionId 工作流版本ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowVersionId(String WorkflowVersionId) {
        this.WorkflowVersionId = WorkflowVersionId;
    }

    /**
     * Get 当前工作流是否支持重跑
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportRerun 当前工作流是否支持重跑
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSupportRerun() {
        return this.SupportRerun;
    }

    /**
     * Set 当前工作流是否支持重跑
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportRerun 当前工作流是否支持重跑
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportRerun(Boolean SupportRerun) {
        this.SupportRerun = SupportRerun;
    }

    /**
     * Get 工作流运行创建时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 工作流运行创建时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 工作流运行创建时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 工作流运行创建时间，单位：毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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
     * Get 运行的任务范围，任务ID列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelectedTaskIds 运行的任务范围，任务ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSelectedTaskIds() {
        return this.SelectedTaskIds;
    }

    /**
     * Set 运行的任务范围，任务ID列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelectedTaskIds 运行的任务范围，任务ID列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelectedTaskIds(String [] SelectedTaskIds) {
        this.SelectedTaskIds = SelectedTaskIds;
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
     * Get 标签列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelList 标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LabelBrief [] getLabelList() {
        return this.LabelList;
    }

    /**
     * Set 标签列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelList 标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelList(LabelBrief [] LabelList) {
        this.LabelList = LabelList;
    }

    /**
     * Get 父工作流运行ID 【由嵌套工作流触发独有】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentWorkflowRunId 父工作流运行ID 【由嵌套工作流触发独有】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentWorkflowRunId() {
        return this.ParentWorkflowRunId;
    }

    /**
     * Set 父工作流运行ID 【由嵌套工作流触发独有】
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentWorkflowRunId 父工作流运行ID 【由嵌套工作流触发独有】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentWorkflowRunId(String ParentWorkflowRunId) {
        this.ParentWorkflowRunId = ParentWorkflowRunId;
    }

    /**
     * Get 父工作流任务运行ID 【由嵌套工作流触发独有】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentWorkflowTaskRunId 父工作流任务运行ID 【由嵌套工作流触发独有】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentWorkflowTaskRunId() {
        return this.ParentWorkflowTaskRunId;
    }

    /**
     * Set 父工作流任务运行ID 【由嵌套工作流触发独有】
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentWorkflowTaskRunId 父工作流任务运行ID 【由嵌套工作流触发独有】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentWorkflowTaskRunId(String ParentWorkflowTaskRunId) {
        this.ParentWorkflowTaskRunId = ParentWorkflowTaskRunId;
    }

    /**
     * Get 父工作流任务运行名称 【由嵌套工作流触发独有】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParentWorkflowTaskRunName 父工作流任务运行名称 【由嵌套工作流触发独有】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParentWorkflowTaskRunName() {
        return this.ParentWorkflowTaskRunName;
    }

    /**
     * Set 父工作流任务运行名称 【由嵌套工作流触发独有】
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParentWorkflowTaskRunName 父工作流任务运行名称 【由嵌套工作流触发独有】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParentWorkflowTaskRunName(String ParentWorkflowTaskRunName) {
        this.ParentWorkflowTaskRunName = ParentWorkflowTaskRunName;
    }

    /**
     * Get 权限信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Permission 权限信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPermission() {
        return this.Permission;
    }

    /**
     * Set 权限信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Permission 权限信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPermission(String Permission) {
        this.Permission = Permission;
    }

    /**
     * Get 工作流高级运行时用户填入的参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvancedParameters 工作流高级运行时用户填入的参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdvancedParameter [] getAdvancedParameters() {
        return this.AdvancedParameters;
    }

    /**
     * Set 工作流高级运行时用户填入的参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvancedParameters 工作流高级运行时用户填入的参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvancedParameters(AdvancedParameter [] AdvancedParameters) {
        this.AdvancedParameters = AdvancedParameters;
    }

    public WorkflowRun() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowRun(WorkflowRun source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowRunId != null) {
            this.WorkflowRunId = new String(source.WorkflowRunId);
        }
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new String(source.WorkspaceId);
        }
        if (source.TriggerType != null) {
            this.TriggerType = new String(source.TriggerType);
        }
        if (source.RunStartTime != null) {
            this.RunStartTime = new String(source.RunStartTime);
        }
        if (source.PendingStartTime != null) {
            this.PendingStartTime = new String(source.PendingStartTime);
        }
        if (source.QueueStartTime != null) {
            this.QueueStartTime = new String(source.QueueStartTime);
        }
        if (source.RunEndTime != null) {
            this.RunEndTime = new String(source.RunEndTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.RunCostTime != null) {
            this.RunCostTime = new String(source.RunCostTime);
        }
        if (source.QueueCostTime != null) {
            this.QueueCostTime = new String(source.QueueCostTime);
        }
        if (source.PendingCostTime != null) {
            this.PendingCostTime = new String(source.PendingCostTime);
        }
        if (source.RunState != null) {
            this.RunState = new String(source.RunState);
        }
        if (source.ResourceGroupIds != null) {
            this.ResourceGroupIds = new String[source.ResourceGroupIds.length];
            for (int i = 0; i < source.ResourceGroupIds.length; i++) {
                this.ResourceGroupIds[i] = new String(source.ResourceGroupIds[i]);
            }
        }
        if (source.RunUserUin != null) {
            this.RunUserUin = new String(source.RunUserUin);
        }
        if (source.RunUserName != null) {
            this.RunUserName = new String(source.RunUserName);
        }
        if (source.ErrorCodeString != null) {
            this.ErrorCodeString = new String(source.ErrorCodeString);
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
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
        if (source.ResourceGroupInfoList != null) {
            this.ResourceGroupInfoList = new ResourceGroupInfo[source.ResourceGroupInfoList.length];
            for (int i = 0; i < source.ResourceGroupInfoList.length; i++) {
                this.ResourceGroupInfoList[i] = new ResourceGroupInfo(source.ResourceGroupInfoList[i]);
            }
        }
        if (source.LabelList != null) {
            this.LabelList = new LabelBrief[source.LabelList.length];
            for (int i = 0; i < source.LabelList.length; i++) {
                this.LabelList[i] = new LabelBrief(source.LabelList[i]);
            }
        }
        if (source.ParentWorkflowRunId != null) {
            this.ParentWorkflowRunId = new String(source.ParentWorkflowRunId);
        }
        if (source.ParentWorkflowTaskRunId != null) {
            this.ParentWorkflowTaskRunId = new String(source.ParentWorkflowTaskRunId);
        }
        if (source.ParentWorkflowTaskRunName != null) {
            this.ParentWorkflowTaskRunName = new String(source.ParentWorkflowTaskRunName);
        }
        if (source.Permission != null) {
            this.Permission = new String(source.Permission);
        }
        if (source.AdvancedParameters != null) {
            this.AdvancedParameters = new AdvancedParameter[source.AdvancedParameters.length];
            for (int i = 0; i < source.AdvancedParameters.length; i++) {
                this.AdvancedParameters[i] = new AdvancedParameter(source.AdvancedParameters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowRunId", this.WorkflowRunId);
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "TriggerType", this.TriggerType);
        this.setParamSimple(map, prefix + "RunStartTime", this.RunStartTime);
        this.setParamSimple(map, prefix + "PendingStartTime", this.PendingStartTime);
        this.setParamSimple(map, prefix + "QueueStartTime", this.QueueStartTime);
        this.setParamSimple(map, prefix + "RunEndTime", this.RunEndTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RunCostTime", this.RunCostTime);
        this.setParamSimple(map, prefix + "QueueCostTime", this.QueueCostTime);
        this.setParamSimple(map, prefix + "PendingCostTime", this.PendingCostTime);
        this.setParamSimple(map, prefix + "RunState", this.RunState);
        this.setParamArraySimple(map, prefix + "ResourceGroupIds.", this.ResourceGroupIds);
        this.setParamSimple(map, prefix + "RunUserUin", this.RunUserUin);
        this.setParamSimple(map, prefix + "RunUserName", this.RunUserName);
        this.setParamSimple(map, prefix + "ErrorCodeString", this.ErrorCodeString);
        this.setParamSimple(map, prefix + "WorkflowParams", this.WorkflowParams);
        this.setParamSimple(map, prefix + "WorkflowVersionId", this.WorkflowVersionId);
        this.setParamSimple(map, prefix + "SupportRerun", this.SupportRerun);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RerunTimes", this.RerunTimes);
        this.setParamArraySimple(map, prefix + "SelectedTaskIds.", this.SelectedTaskIds);
        this.setParamArrayObj(map, prefix + "ResourceGroupInfoList.", this.ResourceGroupInfoList);
        this.setParamArrayObj(map, prefix + "LabelList.", this.LabelList);
        this.setParamSimple(map, prefix + "ParentWorkflowRunId", this.ParentWorkflowRunId);
        this.setParamSimple(map, prefix + "ParentWorkflowTaskRunId", this.ParentWorkflowTaskRunId);
        this.setParamSimple(map, prefix + "ParentWorkflowTaskRunName", this.ParentWorkflowTaskRunName);
        this.setParamSimple(map, prefix + "Permission", this.Permission);
        this.setParamArrayObj(map, prefix + "AdvancedParameters.", this.AdvancedParameters);

    }
}

