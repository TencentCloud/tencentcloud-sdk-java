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

public class WorkflowSchedulerConfigurationInfo extends AbstractModel {

    /**
    * <p>时区</p>
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
    * <p>周期类型：支持的类型为<br>ONEOFF_CYCLE: 一次性<br>YEAR_CYCLE: 年<br>MONTH_CYCLE: 月<br>WEEK_CYCLE: 周<br>DAY_CYCLE: 天<br>HOUR_CYCLE: 小时<br>MINUTE_CYCLE: 分钟<br>CRONTAB_CYCLE: crontab表达式类型</p>
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * <p>自依赖, 默认值 serial, 取值为：parallel(并行), serial(串行), orderly(有序)</p>
    */
    @SerializedName("SelfDepend")
    @Expose
    private String SelfDepend;

    /**
    * <p>生效开始时间</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>生效结束时间</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>cron表达式</p>
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * <p>工作流依赖，yes or no</p>
    */
    @SerializedName("DependencyWorkflow")
    @Expose
    private String DependencyWorkflow;

    /**
    * <p>0：不修改 1：将任务的上游依赖配置改为默认值</p>
    */
    @SerializedName("ModifyCycleValue")
    @Expose
    private String ModifyCycleValue;

    /**
    * <p>工作流存在跨工作流依赖且使用cron表达式调度。如果保存统一调度，会断开不支持的依赖关系</p>
    */
    @SerializedName("ClearLink")
    @Expose
    private Boolean ClearLink;

    /**
    * <p>ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-时间维度，取值为：</p><ul><li>CRONTAB</li><li>DAY</li><li>HOUR</li><li>LIST_DAY</li><li>LIST_HOUR</li><li>LIST_MINUTE</li><li>MINUTE</li><li>MONTH</li><li>RANGE_DAY</li><li>RANGE_HOUR</li><li>RANGE_MINUTE</li><li>WEEK</li><li>YEAR</li></ul><p>https://capi.woa.com/object/detail?product=wedata&amp;env=api_dev&amp;version=2025-08-06&amp;name=WorkflowSchedulerConfigurationInfo</p>
    */
    @SerializedName("MainCyclicConfig")
    @Expose
    private String MainCyclicConfig;

    /**
    * <p>ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-实例范围<br>取值为：</p><ul><li>ALL_DAY_OF_YEAR</li><li>ALL_MONTH_OF_YEAR</li><li>CURRENT</li><li>CURRENT_DAY</li><li>CURRENT_HOUR</li><li>CURRENT_MINUTE</li><li>CURRENT_MONTH</li><li>CURRENT_WEEK</li><li>CURRENT_YEAR</li><li>PREVIOUS_BEGIN_OF_MONTH</li><li>PREVIOUS_DAY</li><li>PREVIOUS_DAY_LATER_OFFSET_HOUR</li><li>PREVIOUS_DAY_LATER_OFFSET_MINUTE</li><li>PREVIOUS_END_OF_MONTH</li><li>PREVIOUS_FRIDAY</li><li>PREVIOUS_HOUR</li><li>PREVIOUS_HOUR_CYCLE</li><li>PREVIOUS_HOUR_LATER_OFFSET_MINUTE</li><li>PREVIOUS_MINUTE_CYCLE</li><li>PREVIOUS_MONTH</li><li>PREVIOUS_WEEK</li><li>PREVIOUS_WEEKEND</li><li>RECENT_DATE</li></ul><p>https://capi.woa.com/object/detail?product=wedata&amp;env=api_dev&amp;version=2025-08-06&amp;name=WorkflowSchedulerConfigurationInfo</p>
    */
    @SerializedName("SubordinateCyclicConfig")
    @Expose
    private String SubordinateCyclicConfig;

    /**
    * <p>执行时间左闭区间，示例：00:00，只有周期类型为MINUTE_CYCLE才需要填入</p>
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * <p>执行时间右闭区间，示例：23:59，只有周期类型为MINUTE_CYCLE才需要填入</p>
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * <p>是否开启日历调度 1 开启 0关闭</p>
    */
    @SerializedName("CalendarOpen")
    @Expose
    private String CalendarOpen;

    /**
    * <p>日历id</p>
    */
    @SerializedName("CalendarId")
    @Expose
    private String CalendarId;

    /**
    * <p>分钟任务相位偏移</p>
    */
    @SerializedName("MinuteOffset")
    @Expose
    private Long MinuteOffset;

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
     * Get <p>周期类型：支持的类型为<br>ONEOFF_CYCLE: 一次性<br>YEAR_CYCLE: 年<br>MONTH_CYCLE: 月<br>WEEK_CYCLE: 周<br>DAY_CYCLE: 天<br>HOUR_CYCLE: 小时<br>MINUTE_CYCLE: 分钟<br>CRONTAB_CYCLE: crontab表达式类型</p> 
     * @return CycleType <p>周期类型：支持的类型为<br>ONEOFF_CYCLE: 一次性<br>YEAR_CYCLE: 年<br>MONTH_CYCLE: 月<br>WEEK_CYCLE: 周<br>DAY_CYCLE: 天<br>HOUR_CYCLE: 小时<br>MINUTE_CYCLE: 分钟<br>CRONTAB_CYCLE: crontab表达式类型</p>
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set <p>周期类型：支持的类型为<br>ONEOFF_CYCLE: 一次性<br>YEAR_CYCLE: 年<br>MONTH_CYCLE: 月<br>WEEK_CYCLE: 周<br>DAY_CYCLE: 天<br>HOUR_CYCLE: 小时<br>MINUTE_CYCLE: 分钟<br>CRONTAB_CYCLE: crontab表达式类型</p>
     * @param CycleType <p>周期类型：支持的类型为<br>ONEOFF_CYCLE: 一次性<br>YEAR_CYCLE: 年<br>MONTH_CYCLE: 月<br>WEEK_CYCLE: 周<br>DAY_CYCLE: 天<br>HOUR_CYCLE: 小时<br>MINUTE_CYCLE: 分钟<br>CRONTAB_CYCLE: crontab表达式类型</p>
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get <p>自依赖, 默认值 serial, 取值为：parallel(并行), serial(串行), orderly(有序)</p> 
     * @return SelfDepend <p>自依赖, 默认值 serial, 取值为：parallel(并行), serial(串行), orderly(有序)</p>
     */
    public String getSelfDepend() {
        return this.SelfDepend;
    }

    /**
     * Set <p>自依赖, 默认值 serial, 取值为：parallel(并行), serial(串行), orderly(有序)</p>
     * @param SelfDepend <p>自依赖, 默认值 serial, 取值为：parallel(并行), serial(串行), orderly(有序)</p>
     */
    public void setSelfDepend(String SelfDepend) {
        this.SelfDepend = SelfDepend;
    }

    /**
     * Get <p>生效开始时间</p> 
     * @return StartTime <p>生效开始时间</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>生效开始时间</p>
     * @param StartTime <p>生效开始时间</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>生效结束时间</p> 
     * @return EndTime <p>生效结束时间</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>生效结束时间</p>
     * @param EndTime <p>生效结束时间</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>cron表达式</p> 
     * @return CrontabExpression <p>cron表达式</p>
     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set <p>cron表达式</p>
     * @param CrontabExpression <p>cron表达式</p>
     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
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
     * Get <p>0：不修改 1：将任务的上游依赖配置改为默认值</p> 
     * @return ModifyCycleValue <p>0：不修改 1：将任务的上游依赖配置改为默认值</p>
     */
    public String getModifyCycleValue() {
        return this.ModifyCycleValue;
    }

    /**
     * Set <p>0：不修改 1：将任务的上游依赖配置改为默认值</p>
     * @param ModifyCycleValue <p>0：不修改 1：将任务的上游依赖配置改为默认值</p>
     */
    public void setModifyCycleValue(String ModifyCycleValue) {
        this.ModifyCycleValue = ModifyCycleValue;
    }

    /**
     * Get <p>工作流存在跨工作流依赖且使用cron表达式调度。如果保存统一调度，会断开不支持的依赖关系</p> 
     * @return ClearLink <p>工作流存在跨工作流依赖且使用cron表达式调度。如果保存统一调度，会断开不支持的依赖关系</p>
     */
    public Boolean getClearLink() {
        return this.ClearLink;
    }

    /**
     * Set <p>工作流存在跨工作流依赖且使用cron表达式调度。如果保存统一调度，会断开不支持的依赖关系</p>
     * @param ClearLink <p>工作流存在跨工作流依赖且使用cron表达式调度。如果保存统一调度，会断开不支持的依赖关系</p>
     */
    public void setClearLink(Boolean ClearLink) {
        this.ClearLink = ClearLink;
    }

    /**
     * Get <p>ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-时间维度，取值为：</p><ul><li>CRONTAB</li><li>DAY</li><li>HOUR</li><li>LIST_DAY</li><li>LIST_HOUR</li><li>LIST_MINUTE</li><li>MINUTE</li><li>MONTH</li><li>RANGE_DAY</li><li>RANGE_HOUR</li><li>RANGE_MINUTE</li><li>WEEK</li><li>YEAR</li></ul><p>https://capi.woa.com/object/detail?product=wedata&amp;env=api_dev&amp;version=2025-08-06&amp;name=WorkflowSchedulerConfigurationInfo</p> 
     * @return MainCyclicConfig <p>ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-时间维度，取值为：</p><ul><li>CRONTAB</li><li>DAY</li><li>HOUR</li><li>LIST_DAY</li><li>LIST_HOUR</li><li>LIST_MINUTE</li><li>MINUTE</li><li>MONTH</li><li>RANGE_DAY</li><li>RANGE_HOUR</li><li>RANGE_MINUTE</li><li>WEEK</li><li>YEAR</li></ul><p>https://capi.woa.com/object/detail?product=wedata&amp;env=api_dev&amp;version=2025-08-06&amp;name=WorkflowSchedulerConfigurationInfo</p>
     */
    public String getMainCyclicConfig() {
        return this.MainCyclicConfig;
    }

    /**
     * Set <p>ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-时间维度，取值为：</p><ul><li>CRONTAB</li><li>DAY</li><li>HOUR</li><li>LIST_DAY</li><li>LIST_HOUR</li><li>LIST_MINUTE</li><li>MINUTE</li><li>MONTH</li><li>RANGE_DAY</li><li>RANGE_HOUR</li><li>RANGE_MINUTE</li><li>WEEK</li><li>YEAR</li></ul><p>https://capi.woa.com/object/detail?product=wedata&amp;env=api_dev&amp;version=2025-08-06&amp;name=WorkflowSchedulerConfigurationInfo</p>
     * @param MainCyclicConfig <p>ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-时间维度，取值为：</p><ul><li>CRONTAB</li><li>DAY</li><li>HOUR</li><li>LIST_DAY</li><li>LIST_HOUR</li><li>LIST_MINUTE</li><li>MINUTE</li><li>MONTH</li><li>RANGE_DAY</li><li>RANGE_HOUR</li><li>RANGE_MINUTE</li><li>WEEK</li><li>YEAR</li></ul><p>https://capi.woa.com/object/detail?product=wedata&amp;env=api_dev&amp;version=2025-08-06&amp;name=WorkflowSchedulerConfigurationInfo</p>
     */
    public void setMainCyclicConfig(String MainCyclicConfig) {
        this.MainCyclicConfig = MainCyclicConfig;
    }

    /**
     * Get <p>ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-实例范围<br>取值为：</p><ul><li>ALL_DAY_OF_YEAR</li><li>ALL_MONTH_OF_YEAR</li><li>CURRENT</li><li>CURRENT_DAY</li><li>CURRENT_HOUR</li><li>CURRENT_MINUTE</li><li>CURRENT_MONTH</li><li>CURRENT_WEEK</li><li>CURRENT_YEAR</li><li>PREVIOUS_BEGIN_OF_MONTH</li><li>PREVIOUS_DAY</li><li>PREVIOUS_DAY_LATER_OFFSET_HOUR</li><li>PREVIOUS_DAY_LATER_OFFSET_MINUTE</li><li>PREVIOUS_END_OF_MONTH</li><li>PREVIOUS_FRIDAY</li><li>PREVIOUS_HOUR</li><li>PREVIOUS_HOUR_CYCLE</li><li>PREVIOUS_HOUR_LATER_OFFSET_MINUTE</li><li>PREVIOUS_MINUTE_CYCLE</li><li>PREVIOUS_MONTH</li><li>PREVIOUS_WEEK</li><li>PREVIOUS_WEEKEND</li><li>RECENT_DATE</li></ul><p>https://capi.woa.com/object/detail?product=wedata&amp;env=api_dev&amp;version=2025-08-06&amp;name=WorkflowSchedulerConfigurationInfo</p> 
     * @return SubordinateCyclicConfig <p>ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-实例范围<br>取值为：</p><ul><li>ALL_DAY_OF_YEAR</li><li>ALL_MONTH_OF_YEAR</li><li>CURRENT</li><li>CURRENT_DAY</li><li>CURRENT_HOUR</li><li>CURRENT_MINUTE</li><li>CURRENT_MONTH</li><li>CURRENT_WEEK</li><li>CURRENT_YEAR</li><li>PREVIOUS_BEGIN_OF_MONTH</li><li>PREVIOUS_DAY</li><li>PREVIOUS_DAY_LATER_OFFSET_HOUR</li><li>PREVIOUS_DAY_LATER_OFFSET_MINUTE</li><li>PREVIOUS_END_OF_MONTH</li><li>PREVIOUS_FRIDAY</li><li>PREVIOUS_HOUR</li><li>PREVIOUS_HOUR_CYCLE</li><li>PREVIOUS_HOUR_LATER_OFFSET_MINUTE</li><li>PREVIOUS_MINUTE_CYCLE</li><li>PREVIOUS_MONTH</li><li>PREVIOUS_WEEK</li><li>PREVIOUS_WEEKEND</li><li>RECENT_DATE</li></ul><p>https://capi.woa.com/object/detail?product=wedata&amp;env=api_dev&amp;version=2025-08-06&amp;name=WorkflowSchedulerConfigurationInfo</p>
     */
    public String getSubordinateCyclicConfig() {
        return this.SubordinateCyclicConfig;
    }

    /**
     * Set <p>ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-实例范围<br>取值为：</p><ul><li>ALL_DAY_OF_YEAR</li><li>ALL_MONTH_OF_YEAR</li><li>CURRENT</li><li>CURRENT_DAY</li><li>CURRENT_HOUR</li><li>CURRENT_MINUTE</li><li>CURRENT_MONTH</li><li>CURRENT_WEEK</li><li>CURRENT_YEAR</li><li>PREVIOUS_BEGIN_OF_MONTH</li><li>PREVIOUS_DAY</li><li>PREVIOUS_DAY_LATER_OFFSET_HOUR</li><li>PREVIOUS_DAY_LATER_OFFSET_MINUTE</li><li>PREVIOUS_END_OF_MONTH</li><li>PREVIOUS_FRIDAY</li><li>PREVIOUS_HOUR</li><li>PREVIOUS_HOUR_CYCLE</li><li>PREVIOUS_HOUR_LATER_OFFSET_MINUTE</li><li>PREVIOUS_MINUTE_CYCLE</li><li>PREVIOUS_MONTH</li><li>PREVIOUS_WEEK</li><li>PREVIOUS_WEEKEND</li><li>RECENT_DATE</li></ul><p>https://capi.woa.com/object/detail?product=wedata&amp;env=api_dev&amp;version=2025-08-06&amp;name=WorkflowSchedulerConfigurationInfo</p>
     * @param SubordinateCyclicConfig <p>ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-实例范围<br>取值为：</p><ul><li>ALL_DAY_OF_YEAR</li><li>ALL_MONTH_OF_YEAR</li><li>CURRENT</li><li>CURRENT_DAY</li><li>CURRENT_HOUR</li><li>CURRENT_MINUTE</li><li>CURRENT_MONTH</li><li>CURRENT_WEEK</li><li>CURRENT_YEAR</li><li>PREVIOUS_BEGIN_OF_MONTH</li><li>PREVIOUS_DAY</li><li>PREVIOUS_DAY_LATER_OFFSET_HOUR</li><li>PREVIOUS_DAY_LATER_OFFSET_MINUTE</li><li>PREVIOUS_END_OF_MONTH</li><li>PREVIOUS_FRIDAY</li><li>PREVIOUS_HOUR</li><li>PREVIOUS_HOUR_CYCLE</li><li>PREVIOUS_HOUR_LATER_OFFSET_MINUTE</li><li>PREVIOUS_MINUTE_CYCLE</li><li>PREVIOUS_MONTH</li><li>PREVIOUS_WEEK</li><li>PREVIOUS_WEEKEND</li><li>RECENT_DATE</li></ul><p>https://capi.woa.com/object/detail?product=wedata&amp;env=api_dev&amp;version=2025-08-06&amp;name=WorkflowSchedulerConfigurationInfo</p>
     */
    public void setSubordinateCyclicConfig(String SubordinateCyclicConfig) {
        this.SubordinateCyclicConfig = SubordinateCyclicConfig;
    }

    /**
     * Get <p>执行时间左闭区间，示例：00:00，只有周期类型为MINUTE_CYCLE才需要填入</p> 
     * @return ExecutionStartTime <p>执行时间左闭区间，示例：00:00，只有周期类型为MINUTE_CYCLE才需要填入</p>
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set <p>执行时间左闭区间，示例：00:00，只有周期类型为MINUTE_CYCLE才需要填入</p>
     * @param ExecutionStartTime <p>执行时间左闭区间，示例：00:00，只有周期类型为MINUTE_CYCLE才需要填入</p>
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get <p>执行时间右闭区间，示例：23:59，只有周期类型为MINUTE_CYCLE才需要填入</p> 
     * @return ExecutionEndTime <p>执行时间右闭区间，示例：23:59，只有周期类型为MINUTE_CYCLE才需要填入</p>
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set <p>执行时间右闭区间，示例：23:59，只有周期类型为MINUTE_CYCLE才需要填入</p>
     * @param ExecutionEndTime <p>执行时间右闭区间，示例：23:59，只有周期类型为MINUTE_CYCLE才需要填入</p>
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
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

    public WorkflowSchedulerConfigurationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowSchedulerConfigurationInfo(WorkflowSchedulerConfigurationInfo source) {
        if (source.ScheduleTimeZone != null) {
            this.ScheduleTimeZone = new String(source.ScheduleTimeZone);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
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
        if (source.CrontabExpression != null) {
            this.CrontabExpression = new String(source.CrontabExpression);
        }
        if (source.DependencyWorkflow != null) {
            this.DependencyWorkflow = new String(source.DependencyWorkflow);
        }
        if (source.ModifyCycleValue != null) {
            this.ModifyCycleValue = new String(source.ModifyCycleValue);
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
        if (source.ExecutionStartTime != null) {
            this.ExecutionStartTime = new String(source.ExecutionStartTime);
        }
        if (source.ExecutionEndTime != null) {
            this.ExecutionEndTime = new String(source.ExecutionEndTime);
        }
        if (source.CalendarOpen != null) {
            this.CalendarOpen = new String(source.CalendarOpen);
        }
        if (source.CalendarId != null) {
            this.CalendarId = new String(source.CalendarId);
        }
        if (source.MinuteOffset != null) {
            this.MinuteOffset = new Long(source.MinuteOffset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScheduleTimeZone", this.ScheduleTimeZone);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "SelfDepend", this.SelfDepend);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CrontabExpression", this.CrontabExpression);
        this.setParamSimple(map, prefix + "DependencyWorkflow", this.DependencyWorkflow);
        this.setParamSimple(map, prefix + "ModifyCycleValue", this.ModifyCycleValue);
        this.setParamSimple(map, prefix + "ClearLink", this.ClearLink);
        this.setParamSimple(map, prefix + "MainCyclicConfig", this.MainCyclicConfig);
        this.setParamSimple(map, prefix + "SubordinateCyclicConfig", this.SubordinateCyclicConfig);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);
        this.setParamSimple(map, prefix + "CalendarOpen", this.CalendarOpen);
        this.setParamSimple(map, prefix + "CalendarId", this.CalendarId);
        this.setParamSimple(map, prefix + "MinuteOffset", this.MinuteOffset);

    }
}

