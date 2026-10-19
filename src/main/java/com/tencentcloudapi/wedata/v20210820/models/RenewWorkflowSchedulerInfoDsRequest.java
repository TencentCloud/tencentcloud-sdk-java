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

public class RenewWorkflowSchedulerInfoDsRequest extends AbstractModel {

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>工作流ID</p>
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>延迟时间</p>
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * <p>启动时间</p>
    */
    @SerializedName("StartupTime")
    @Expose
    private Long StartupTime;

    /**
    * <p>任务依赖</p>
    */
    @SerializedName("SelfDepend")
    @Expose
    private String SelfDepend;

    /**
    * <p>开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>指定运行时间</p>
    */
    @SerializedName("TaskAction")
    @Expose
    private String TaskAction;

    /**
    * <p>调度周期时间单位</p>
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * <p>调度周期</p>
    */
    @SerializedName("CycleStep")
    @Expose
    private Long CycleStep;

    /**
    * <p>执行时间左闭区间</p>
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * <p>执行时间右闭区间</p>
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * <p>任务初始化策略，T_PLUS_1、T_PLUS_0、T_MINUS_1</p>
    */
    @SerializedName("InstanceInitStrategy")
    @Expose
    private String InstanceInitStrategy;

    /**
    * <p>工作流依赖，yes or no</p>
    */
    @SerializedName("DependencyWorkflow")
    @Expose
    private String DependencyWorkflow;

    /**
    * <p>CrontabExpression</p>
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * <p>0：不修改<br>1：将任务的上游依赖配置改为默认值</p>
    */
    @SerializedName("ModifyCycleValue")
    @Expose
    private String ModifyCycleValue;

    /**
    * <p>是否开启日历调度 1 开启 0关闭</p>
    */
    @SerializedName("CalendarOpen")
    @Expose
    private String CalendarOpen;

    /**
    * <p>日历名称</p>
    */
    @SerializedName("CalendarName")
    @Expose
    private String CalendarName;

    /**
    * <p>日历id</p>
    */
    @SerializedName("CalendarId")
    @Expose
    private String CalendarId;

    /**
    * <p>时区</p>
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
    * <p>是否自动清理不支持的任务链接</p>
    */
    @SerializedName("ClearLink")
    @Expose
    private Boolean ClearLink;

    /**
    * <p>ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-时间维度</p>
    */
    @SerializedName("MainCyclicConfig")
    @Expose
    private String MainCyclicConfig;

    /**
    * <p>ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-实例范围</p>
    */
    @SerializedName("SubordinateCyclicConfig")
    @Expose
    private String SubordinateCyclicConfig;

    /**
    * <p>分钟任务相位偏移</p>
    */
    @SerializedName("MinuteOffset")
    @Expose
    private Long MinuteOffset;

    /**
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>工作流ID</p> 
     * @return WorkflowId <p>工作流ID</p>
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>工作流ID</p>
     * @param WorkflowId <p>工作流ID</p>
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get <p>延迟时间</p> 
     * @return DelayTime <p>延迟时间</p>
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set <p>延迟时间</p>
     * @param DelayTime <p>延迟时间</p>
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get <p>启动时间</p> 
     * @return StartupTime <p>启动时间</p>
     */
    public Long getStartupTime() {
        return this.StartupTime;
    }

    /**
     * Set <p>启动时间</p>
     * @param StartupTime <p>启动时间</p>
     */
    public void setStartupTime(Long StartupTime) {
        this.StartupTime = StartupTime;
    }

    /**
     * Get <p>任务依赖</p> 
     * @return SelfDepend <p>任务依赖</p>
     */
    public String getSelfDepend() {
        return this.SelfDepend;
    }

    /**
     * Set <p>任务依赖</p>
     * @param SelfDepend <p>任务依赖</p>
     */
    public void setSelfDepend(String SelfDepend) {
        this.SelfDepend = SelfDepend;
    }

    /**
     * Get <p>开始时间</p> 
     * @return StartTime <p>开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p>
     * @param StartTime <p>开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p> 
     * @return EndTime <p>结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p>
     * @param EndTime <p>结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>指定运行时间</p> 
     * @return TaskAction <p>指定运行时间</p>
     */
    public String getTaskAction() {
        return this.TaskAction;
    }

    /**
     * Set <p>指定运行时间</p>
     * @param TaskAction <p>指定运行时间</p>
     */
    public void setTaskAction(String TaskAction) {
        this.TaskAction = TaskAction;
    }

    /**
     * Get <p>调度周期时间单位</p> 
     * @return CycleType <p>调度周期时间单位</p>
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set <p>调度周期时间单位</p>
     * @param CycleType <p>调度周期时间单位</p>
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get <p>调度周期</p> 
     * @return CycleStep <p>调度周期</p>
     */
    public Long getCycleStep() {
        return this.CycleStep;
    }

    /**
     * Set <p>调度周期</p>
     * @param CycleStep <p>调度周期</p>
     */
    public void setCycleStep(Long CycleStep) {
        this.CycleStep = CycleStep;
    }

    /**
     * Get <p>执行时间左闭区间</p> 
     * @return ExecutionStartTime <p>执行时间左闭区间</p>
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set <p>执行时间左闭区间</p>
     * @param ExecutionStartTime <p>执行时间左闭区间</p>
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get <p>执行时间右闭区间</p> 
     * @return ExecutionEndTime <p>执行时间右闭区间</p>
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set <p>执行时间右闭区间</p>
     * @param ExecutionEndTime <p>执行时间右闭区间</p>
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    /**
     * Get <p>任务初始化策略，T_PLUS_1、T_PLUS_0、T_MINUS_1</p> 
     * @return InstanceInitStrategy <p>任务初始化策略，T_PLUS_1、T_PLUS_0、T_MINUS_1</p>
     */
    public String getInstanceInitStrategy() {
        return this.InstanceInitStrategy;
    }

    /**
     * Set <p>任务初始化策略，T_PLUS_1、T_PLUS_0、T_MINUS_1</p>
     * @param InstanceInitStrategy <p>任务初始化策略，T_PLUS_1、T_PLUS_0、T_MINUS_1</p>
     */
    public void setInstanceInitStrategy(String InstanceInitStrategy) {
        this.InstanceInitStrategy = InstanceInitStrategy;
    }

    /**
     * Get <p>工作流依赖，yes or no</p> 
     * @return DependencyWorkflow <p>工作流依赖，yes or no</p>
     */
    public String getDependencyWorkflow() {
        return this.DependencyWorkflow;
    }

    /**
     * Set <p>工作流依赖，yes or no</p>
     * @param DependencyWorkflow <p>工作流依赖，yes or no</p>
     */
    public void setDependencyWorkflow(String DependencyWorkflow) {
        this.DependencyWorkflow = DependencyWorkflow;
    }

    /**
     * Get <p>CrontabExpression</p> 
     * @return CrontabExpression <p>CrontabExpression</p>
     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set <p>CrontabExpression</p>
     * @param CrontabExpression <p>CrontabExpression</p>
     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
    }

    /**
     * Get <p>0：不修改<br>1：将任务的上游依赖配置改为默认值</p> 
     * @return ModifyCycleValue <p>0：不修改<br>1：将任务的上游依赖配置改为默认值</p>
     */
    public String getModifyCycleValue() {
        return this.ModifyCycleValue;
    }

    /**
     * Set <p>0：不修改<br>1：将任务的上游依赖配置改为默认值</p>
     * @param ModifyCycleValue <p>0：不修改<br>1：将任务的上游依赖配置改为默认值</p>
     */
    public void setModifyCycleValue(String ModifyCycleValue) {
        this.ModifyCycleValue = ModifyCycleValue;
    }

    /**
     * Get <p>是否开启日历调度 1 开启 0关闭</p> 
     * @return CalendarOpen <p>是否开启日历调度 1 开启 0关闭</p>
     */
    public String getCalendarOpen() {
        return this.CalendarOpen;
    }

    /**
     * Set <p>是否开启日历调度 1 开启 0关闭</p>
     * @param CalendarOpen <p>是否开启日历调度 1 开启 0关闭</p>
     */
    public void setCalendarOpen(String CalendarOpen) {
        this.CalendarOpen = CalendarOpen;
    }

    /**
     * Get <p>日历名称</p> 
     * @return CalendarName <p>日历名称</p>
     */
    public String getCalendarName() {
        return this.CalendarName;
    }

    /**
     * Set <p>日历名称</p>
     * @param CalendarName <p>日历名称</p>
     */
    public void setCalendarName(String CalendarName) {
        this.CalendarName = CalendarName;
    }

    /**
     * Get <p>日历id</p> 
     * @return CalendarId <p>日历id</p>
     */
    public String getCalendarId() {
        return this.CalendarId;
    }

    /**
     * Set <p>日历id</p>
     * @param CalendarId <p>日历id</p>
     */
    public void setCalendarId(String CalendarId) {
        this.CalendarId = CalendarId;
    }

    /**
     * Get <p>时区</p> 
     * @return ScheduleTimeZone <p>时区</p>
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set <p>时区</p>
     * @param ScheduleTimeZone <p>时区</p>
     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
    }

    /**
     * Get <p>是否自动清理不支持的任务链接</p> 
     * @return ClearLink <p>是否自动清理不支持的任务链接</p>
     */
    public Boolean getClearLink() {
        return this.ClearLink;
    }

    /**
     * Set <p>是否自动清理不支持的任务链接</p>
     * @param ClearLink <p>是否自动清理不支持的任务链接</p>
     */
    public void setClearLink(Boolean ClearLink) {
        this.ClearLink = ClearLink;
    }

    /**
     * Get <p>ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-时间维度</p> 
     * @return MainCyclicConfig <p>ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-时间维度</p>
     */
    public String getMainCyclicConfig() {
        return this.MainCyclicConfig;
    }

    /**
     * Set <p>ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-时间维度</p>
     * @param MainCyclicConfig <p>ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-时间维度</p>
     */
    public void setMainCyclicConfig(String MainCyclicConfig) {
        this.MainCyclicConfig = MainCyclicConfig;
    }

    /**
     * Get <p>ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-实例范围</p> 
     * @return SubordinateCyclicConfig <p>ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-实例范围</p>
     */
    public String getSubordinateCyclicConfig() {
        return this.SubordinateCyclicConfig;
    }

    /**
     * Set <p>ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-实例范围</p>
     * @param SubordinateCyclicConfig <p>ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-实例范围</p>
     */
    public void setSubordinateCyclicConfig(String SubordinateCyclicConfig) {
        this.SubordinateCyclicConfig = SubordinateCyclicConfig;
    }

    /**
     * Get <p>分钟任务相位偏移</p> 
     * @return MinuteOffset <p>分钟任务相位偏移</p>
     */
    public Long getMinuteOffset() {
        return this.MinuteOffset;
    }

    /**
     * Set <p>分钟任务相位偏移</p>
     * @param MinuteOffset <p>分钟任务相位偏移</p>
     */
    public void setMinuteOffset(Long MinuteOffset) {
        this.MinuteOffset = MinuteOffset;
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
        if (source.MainCyclicConfig != null) {
            this.MainCyclicConfig = new String(source.MainCyclicConfig);
        }
        if (source.SubordinateCyclicConfig != null) {
            this.SubordinateCyclicConfig = new String(source.SubordinateCyclicConfig);
        }
        if (source.MinuteOffset != null) {
            this.MinuteOffset = new Long(source.MinuteOffset);
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
        this.setParamSimple(map, prefix + "MainCyclicConfig", this.MainCyclicConfig);
        this.setParamSimple(map, prefix + "SubordinateCyclicConfig", this.SubordinateCyclicConfig);
        this.setParamSimple(map, prefix + "MinuteOffset", this.MinuteOffset);

    }
}

