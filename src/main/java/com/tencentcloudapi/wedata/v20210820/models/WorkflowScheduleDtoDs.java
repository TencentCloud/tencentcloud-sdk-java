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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowScheduleDtoDs extends AbstractModel {

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
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creater")
    @Expose
    private String Creater;

    /**
    * <p>修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>延迟时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * <p>启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartupTime")
    @Expose
    private Long StartupTime;

    /**
    * <p>任务依赖</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelfDepend")
    @Expose
    private String SelfDepend;

    /**
    * <p>开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>指定运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskAction")
    @Expose
    private String TaskAction;

    /**
    * <p>调度周期时间单位</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * <p>调度周期</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * <p>Cron表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * <p>执行时间左闭区间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * <p>执行时间右闭区间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * <p>实例初始化策略</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceInitStrategy")
    @Expose
    private String InstanceInitStrategy;

    /**
    * <p>工作流依赖</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependencyWorkflow")
    @Expose
    private String DependencyWorkflow;

    /**
    * <p>调度计划</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulerDesc")
    @Expose
    private String SchedulerDesc;

    /**
    * <p>工作流首次提交时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstSubmitTime")
    @Expose
    private String FirstSubmitTime;

    /**
    * <p>工作流最近提交时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestSubmitTime")
    @Expose
    private String LatestSubmitTime;

    /**
    * <p>日历调度是否开启</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalendarOpen")
    @Expose
    private String CalendarOpen;

    /**
    * <p>日历调度名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalendarName")
    @Expose
    private String CalendarName;

    /**
    * <p>日历调度id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalendarId")
    @Expose
    private String CalendarId;

    /**
    * <p>时区配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
    * <p>用户对该资源的最高权限</p><p>枚举值：</p><ul><li>NO_PERMISSIONS： 无权限</li><li>CAN_VIEW： 只读权限</li><li>CAN_MANAGE： 管理权限</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Privilege")
    @Expose
    private String Privilege;

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
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creater <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreater() {
        return this.Creater;
    }

    /**
     * Set <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creater <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreater(String Creater) {
        this.Creater = Creater;
    }

    /**
     * Get <p>修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime <p>修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime <p>修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>延迟时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DelayTime <p>延迟时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set <p>延迟时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DelayTime <p>延迟时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get <p>启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartupTime <p>启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartupTime() {
        return this.StartupTime;
    }

    /**
     * Set <p>启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartupTime <p>启动时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartupTime(Long StartupTime) {
        this.StartupTime = StartupTime;
    }

    /**
     * Get <p>任务依赖</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelfDepend <p>任务依赖</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSelfDepend() {
        return this.SelfDepend;
    }

    /**
     * Set <p>任务依赖</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelfDepend <p>任务依赖</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelfDepend(String SelfDepend) {
        this.SelfDepend = SelfDepend;
    }

    /**
     * Get <p>开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime <p>开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime <p>开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime <p>结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>指定运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskAction <p>指定运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set <p>指定运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskAction <p>指定运行时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskAction(String TaskAction) {
        this.TaskAction = TaskAction;
    }

    /**
     * Get <p>调度周期时间单位</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleType <p>调度周期时间单位</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set <p>调度周期时间单位</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleType <p>调度周期时间单位</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get <p>调度周期</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleStep <p>调度周期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set <p>调度周期</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleStep <p>调度周期</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
    }

    /**
     * Get <p>Cron表达式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CrontabExpression <p>Cron表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set <p>Cron表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CrontabExpression <p>Cron表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
    }

    /**
     * Get <p>执行时间左闭区间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionStartTime <p>执行时间左闭区间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set <p>执行时间左闭区间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionStartTime <p>执行时间左闭区间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get <p>执行时间右闭区间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionEndTime <p>执行时间右闭区间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set <p>执行时间右闭区间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionEndTime <p>执行时间右闭区间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    /**
     * Get <p>实例初始化策略</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceInitStrategy <p>实例初始化策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceInitStrategy() {
        return this.InstanceInitStrategy;
    }

    /**
     * Set <p>实例初始化策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceInitStrategy <p>实例初始化策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceInitStrategy(String InstanceInitStrategy) {
        this.InstanceInitStrategy = InstanceInitStrategy;
    }

    /**
     * Get <p>工作流依赖</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependencyWorkflow <p>工作流依赖</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependencyWorkflow() {
        return this.DependencyWorkflow;
    }

    /**
     * Set <p>工作流依赖</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependencyWorkflow <p>工作流依赖</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependencyWorkflow(String DependencyWorkflow) {
        this.DependencyWorkflow = DependencyWorkflow;
    }

    /**
     * Get <p>调度计划</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchedulerDesc <p>调度计划</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchedulerDesc() {
        return this.SchedulerDesc;
    }

    /**
     * Set <p>调度计划</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchedulerDesc <p>调度计划</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchedulerDesc(String SchedulerDesc) {
        this.SchedulerDesc = SchedulerDesc;
    }

    /**
     * Get <p>工作流首次提交时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstSubmitTime <p>工作流首次提交时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFirstSubmitTime() {
        return this.FirstSubmitTime;
    }

    /**
     * Set <p>工作流首次提交时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstSubmitTime <p>工作流首次提交时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstSubmitTime(String FirstSubmitTime) {
        this.FirstSubmitTime = FirstSubmitTime;
    }

    /**
     * Get <p>工作流最近提交时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestSubmitTime <p>工作流最近提交时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestSubmitTime() {
        return this.LatestSubmitTime;
    }

    /**
     * Set <p>工作流最近提交时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestSubmitTime <p>工作流最近提交时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestSubmitTime(String LatestSubmitTime) {
        this.LatestSubmitTime = LatestSubmitTime;
    }

    /**
     * Get <p>日历调度是否开启</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalendarOpen <p>日历调度是否开启</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCalendarOpen() {
        return this.CalendarOpen;
    }

    /**
     * Set <p>日历调度是否开启</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalendarOpen <p>日历调度是否开启</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalendarOpen(String CalendarOpen) {
        this.CalendarOpen = CalendarOpen;
    }

    /**
     * Get <p>日历调度名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalendarName <p>日历调度名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCalendarName() {
        return this.CalendarName;
    }

    /**
     * Set <p>日历调度名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalendarName <p>日历调度名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalendarName(String CalendarName) {
        this.CalendarName = CalendarName;
    }

    /**
     * Get <p>日历调度id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalendarId <p>日历调度id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCalendarId() {
        return this.CalendarId;
    }

    /**
     * Set <p>日历调度id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalendarId <p>日历调度id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalendarId(String CalendarId) {
        this.CalendarId = CalendarId;
    }

    /**
     * Get <p>时区配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleTimeZone <p>时区配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set <p>时区配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleTimeZone <p>时区配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
    }

    /**
     * Get <p>用户对该资源的最高权限</p><p>枚举值：</p><ul><li>NO_PERMISSIONS： 无权限</li><li>CAN_VIEW： 只读权限</li><li>CAN_MANAGE： 管理权限</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Privilege <p>用户对该资源的最高权限</p><p>枚举值：</p><ul><li>NO_PERMISSIONS： 无权限</li><li>CAN_VIEW： 只读权限</li><li>CAN_MANAGE： 管理权限</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrivilege() {
        return this.Privilege;
    }

    /**
     * Set <p>用户对该资源的最高权限</p><p>枚举值：</p><ul><li>NO_PERMISSIONS： 无权限</li><li>CAN_VIEW： 只读权限</li><li>CAN_MANAGE： 管理权限</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Privilege <p>用户对该资源的最高权限</p><p>枚举值：</p><ul><li>NO_PERMISSIONS： 无权限</li><li>CAN_VIEW： 只读权限</li><li>CAN_MANAGE： 管理权限</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
    }

    public WorkflowScheduleDtoDs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowScheduleDtoDs(WorkflowScheduleDtoDs source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Creater != null) {
            this.Creater = new String(source.Creater);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new Long(source.DelayTime);
        }
        if (source.StartupTime != null) {
            this.StartupTime = new Long(source.StartupTime);
        }
        if (source.SelfDepend != null) {
            this.SelfDepend = new String(source.SelfDepend);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.TaskAction != null) {
            this.TaskAction = new String(source.TaskAction);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.CycleStep != null) {
            this.CycleStep = new Long(source.CycleStep);
        }
        if (source.CrontabExpression != null) {
            this.CrontabExpression = new String(source.CrontabExpression);
        }
        if (source.ExecutionStartTime != null) {
            this.ExecutionStartTime = new String(source.ExecutionStartTime);
        }
        if (source.ExecutionEndTime != null) {
            this.ExecutionEndTime = new String(source.ExecutionEndTime);
        }
        if (source.InstanceInitStrategy != null) {
            this.InstanceInitStrategy = new String(source.InstanceInitStrategy);
        }
        if (source.DependencyWorkflow != null) {
            this.DependencyWorkflow = new String(source.DependencyWorkflow);
        }
        if (source.SchedulerDesc != null) {
            this.SchedulerDesc = new String(source.SchedulerDesc);
        }
        if (source.FirstSubmitTime != null) {
            this.FirstSubmitTime = new String(source.FirstSubmitTime);
        }
        if (source.LatestSubmitTime != null) {
            this.LatestSubmitTime = new String(source.LatestSubmitTime);
        }
        if (source.CalendarOpen != null) {
            this.CalendarOpen = new String(source.CalendarOpen);
        }
        if (source.CalendarName != null) {
            this.CalendarName = new String(source.CalendarName);
        }
        if (source.CalendarId != null) {
            this.CalendarId = new String(source.CalendarId);
        }
        if (source.ScheduleTimeZone != null) {
            this.ScheduleTimeZone = new String(source.ScheduleTimeZone);
        }
        if (source.Privilege != null) {
            this.Privilege = new String(source.Privilege);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Creater", this.Creater);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "StartupTime", this.StartupTime);
        this.setParamSimple(map, prefix + "SelfDepend", this.SelfDepend);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskAction", this.TaskAction);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "CycleStep", this.CycleStep);
        this.setParamSimple(map, prefix + "CrontabExpression", this.CrontabExpression);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);
        this.setParamSimple(map, prefix + "InstanceInitStrategy", this.InstanceInitStrategy);
        this.setParamSimple(map, prefix + "DependencyWorkflow", this.DependencyWorkflow);
        this.setParamSimple(map, prefix + "SchedulerDesc", this.SchedulerDesc);
        this.setParamSimple(map, prefix + "FirstSubmitTime", this.FirstSubmitTime);
        this.setParamSimple(map, prefix + "LatestSubmitTime", this.LatestSubmitTime);
        this.setParamSimple(map, prefix + "CalendarOpen", this.CalendarOpen);
        this.setParamSimple(map, prefix + "CalendarName", this.CalendarName);
        this.setParamSimple(map, prefix + "CalendarId", this.CalendarId);
        this.setParamSimple(map, prefix + "ScheduleTimeZone", this.ScheduleTimeZone);
        this.setParamSimple(map, prefix + "Privilege", this.Privilege);

    }
}

