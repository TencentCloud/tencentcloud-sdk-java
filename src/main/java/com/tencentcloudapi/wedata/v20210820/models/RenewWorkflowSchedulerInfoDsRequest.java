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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewWorkflowSchedulerInfoDsRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 工作流ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 延迟时间
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * 启动时间
    */
    @SerializedName("StartupTime")
    @Expose
    private Long StartupTime;

    /**
    * 任务依赖
    */
    @SerializedName("SelfDepend")
    @Expose
    private String SelfDepend;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 指定运行时间
    */
    @SerializedName("TaskAction")
    @Expose
    private String TaskAction;

    /**
    * 调度周期时间单位
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * 调度周期
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * 执行时间左闭区间
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * 执行时间右闭区间
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * 任务初始化策略，T_PLUS_1、T_PLUS_0、T_MINUS_1
    */
    @SerializedName("InstanceInitStrategy")
    @Expose
    private String InstanceInitStrategy;

    /**
    * 工作流依赖，yes or no
    */
    @SerializedName("DependencyWorkflow")
    @Expose
    private String DependencyWorkflow;

    /**
    * CrontabExpression
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * 0：不修改
1：将任务的上游依赖配置改为默认值 
    */
    @SerializedName("ModifyCycleValue")
    @Expose
    private String ModifyCycleValue;

    /**
    * 是否开启日历调度 1 开启 0关闭
    */
    @SerializedName("CalendarOpen")
    @Expose
    private String CalendarOpen;

    /**
    * 日历名称
    */
    @SerializedName("CalendarName")
    @Expose
    private String CalendarName;

    /**
    * 日历id
    */
    @SerializedName("CalendarId")
    @Expose
    private String CalendarId;

    /**
    * 时区
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
    * 是否自动清理不支持的任务链接
    */
    @SerializedName("ClearLink")
    @Expose
    private Boolean ClearLink;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 工作流ID 
     * @return WorkflowId 工作流ID
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流ID
     * @param WorkflowId 工作流ID
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 延迟时间 
     * @return DelayTime 延迟时间
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set 延迟时间
     * @param DelayTime 延迟时间
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get 启动时间 
     * @return StartupTime 启动时间
     */
    public Long getStartupTime() {
        return this.StartupTime;
    }

    /**
     * Set 启动时间
     * @param StartupTime 启动时间
     */
    public void setStartupTime(Long StartupTime) {
        this.StartupTime = StartupTime;
    }

    /**
     * Get 任务依赖 
     * @return SelfDepend 任务依赖
     */
    public String getSelfDepend() {
        return this.SelfDepend;
    }

    /**
     * Set 任务依赖
     * @param SelfDepend 任务依赖
     */
    public void setSelfDepend(String SelfDepend) {
        this.SelfDepend = SelfDepend;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 指定运行时间 
     * @return TaskAction 指定运行时间
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set 指定运行时间
     * @param TaskAction 指定运行时间
     */
    public void setTaskAction(String TaskAction) {
        this.TaskAction = TaskAction;
    }

    /**
     * Get 调度周期时间单位 
     * @return CycleType 调度周期时间单位
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set 调度周期时间单位
     * @param CycleType 调度周期时间单位
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get 调度周期 
     * @return CycleStep 调度周期
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set 调度周期
     * @param CycleStep 调度周期
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
    }

    /**
     * Get 执行时间左闭区间 
     * @return ExecutionStartTime 执行时间左闭区间
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set 执行时间左闭区间
     * @param ExecutionStartTime 执行时间左闭区间
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get 执行时间右闭区间 
     * @return ExecutionEndTime 执行时间右闭区间
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set 执行时间右闭区间
     * @param ExecutionEndTime 执行时间右闭区间
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    /**
     * Get 任务初始化策略，T_PLUS_1、T_PLUS_0、T_MINUS_1 
     * @return InstanceInitStrategy 任务初始化策略，T_PLUS_1、T_PLUS_0、T_MINUS_1
     */
    public String getInstanceInitStrategy() {
        return this.InstanceInitStrategy;
    }

    /**
     * Set 任务初始化策略，T_PLUS_1、T_PLUS_0、T_MINUS_1
     * @param InstanceInitStrategy 任务初始化策略，T_PLUS_1、T_PLUS_0、T_MINUS_1
     */
    public void setInstanceInitStrategy(String InstanceInitStrategy) {
        this.InstanceInitStrategy = InstanceInitStrategy;
    }

    /**
     * Get 工作流依赖，yes or no 
     * @return DependencyWorkflow 工作流依赖，yes or no
     */
    public String getDependencyWorkflow() {
        return this.DependencyWorkflow;
    }

    /**
     * Set 工作流依赖，yes or no
     * @param DependencyWorkflow 工作流依赖，yes or no
     */
    public void setDependencyWorkflow(String DependencyWorkflow) {
        this.DependencyWorkflow = DependencyWorkflow;
    }

    /**
     * Get CrontabExpression 
     * @return CrontabExpression CrontabExpression
     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set CrontabExpression
     * @param CrontabExpression CrontabExpression
     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
    }

    /**
     * Get 0：不修改
1：将任务的上游依赖配置改为默认值  
     * @return ModifyCycleValue 0：不修改
1：将任务的上游依赖配置改为默认值 
     */
    public String getModifyCycleValue() {
        return this.ModifyCycleValue;
    }

    /**
     * Set 0：不修改
1：将任务的上游依赖配置改为默认值 
     * @param ModifyCycleValue 0：不修改
1：将任务的上游依赖配置改为默认值 
     */
    public void setModifyCycleValue(String ModifyCycleValue) {
        this.ModifyCycleValue = ModifyCycleValue;
    }

    /**
     * Get 是否开启日历调度 1 开启 0关闭 
     * @return CalendarOpen 是否开启日历调度 1 开启 0关闭
     */
    public String getCalendarOpen() {
        return this.CalendarOpen;
    }

    /**
     * Set 是否开启日历调度 1 开启 0关闭
     * @param CalendarOpen 是否开启日历调度 1 开启 0关闭
     */
    public void setCalendarOpen(String CalendarOpen) {
        this.CalendarOpen = CalendarOpen;
    }

    /**
     * Get 日历名称 
     * @return CalendarName 日历名称
     */
    public String getCalendarName() {
        return this.CalendarName;
    }

    /**
     * Set 日历名称
     * @param CalendarName 日历名称
     */
    public void setCalendarName(String CalendarName) {
        this.CalendarName = CalendarName;
    }

    /**
     * Get 日历id 
     * @return CalendarId 日历id
     */
    public String getCalendarId() {
        return this.CalendarId;
    }

    /**
     * Set 日历id
     * @param CalendarId 日历id
     */
    public void setCalendarId(String CalendarId) {
        this.CalendarId = CalendarId;
    }

    /**
     * Get 时区 
     * @return ScheduleTimeZone 时区
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set 时区
     * @param ScheduleTimeZone 时区
     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
    }

    /**
     * Get 是否自动清理不支持的任务链接 
     * @return ClearLink 是否自动清理不支持的任务链接
     */
    public Boolean getClearLink() {
        return this.ClearLink;
    }

    /**
     * Set 是否自动清理不支持的任务链接
     * @param ClearLink 是否自动清理不支持的任务链接
     */
    public void setClearLink(Boolean ClearLink) {
        this.ClearLink = ClearLink;
    }

    public RenewWorkflowSchedulerInfoDsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewWorkflowSchedulerInfoDsRequest(RenewWorkflowSchedulerInfoDsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
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
        if (source.CrontabExpression != null) {
            this.CrontabExpression = new String(source.CrontabExpression);
        }
        if (source.ModifyCycleValue != null) {
            this.ModifyCycleValue = new String(source.ModifyCycleValue);
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
        if (source.ClearLink != null) {
            this.ClearLink = new Boolean(source.ClearLink);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "StartupTime", this.StartupTime);
        this.setParamSimple(map, prefix + "SelfDepend", this.SelfDepend);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TaskAction", this.TaskAction);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "CycleStep", this.CycleStep);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);
        this.setParamSimple(map, prefix + "InstanceInitStrategy", this.InstanceInitStrategy);
        this.setParamSimple(map, prefix + "DependencyWorkflow", this.DependencyWorkflow);
        this.setParamSimple(map, prefix + "CrontabExpression", this.CrontabExpression);
        this.setParamSimple(map, prefix + "ModifyCycleValue", this.ModifyCycleValue);
        this.setParamSimple(map, prefix + "CalendarOpen", this.CalendarOpen);
        this.setParamSimple(map, prefix + "CalendarName", this.CalendarName);
        this.setParamSimple(map, prefix + "CalendarId", this.CalendarId);
        this.setParamSimple(map, prefix + "ScheduleTimeZone", this.ScheduleTimeZone);
        this.setParamSimple(map, prefix + "ClearLink", this.ClearLink);

    }
}

