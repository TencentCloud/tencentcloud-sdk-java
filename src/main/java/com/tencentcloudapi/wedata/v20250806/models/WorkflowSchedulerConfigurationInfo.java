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
    * 时区
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
    * 周期类型：支持的类型为
ONEOFF_CYCLE: 一次性
YEAR_CYCLE: 年
MONTH_CYCLE: 月
WEEK_CYCLE: 周
DAY_CYCLE: 天
HOUR_CYCLE: 小时
MINUTE_CYCLE: 分钟
CRONTAB_CYCLE: crontab表达式类型
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * 自依赖, 默认值 serial, 取值为：parallel(并行), serial(串行), orderly(有序)
    */
    @SerializedName("SelfDepend")
    @Expose
    private String SelfDepend;

    /**
    * 生效开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 生效结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * cron表达式
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * 工作流依赖，yes or no
    */
    @SerializedName("DependencyWorkflow")
    @Expose
    private String DependencyWorkflow;

    /**
    * 0：不修改 1：将任务的上游依赖配置改为默认值
    */
    @SerializedName("ModifyCycleValue")
    @Expose
    private String ModifyCycleValue;

    /**
    * 工作流存在跨工作流依赖且使用cron表达式调度。如果保存统一调度，会断开不支持的依赖关系
    */
    @SerializedName("ClearLink")
    @Expose
    private Boolean ClearLink;

    /**
    * ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-时间维度，取值为：
* CRONTAB
* DAY
* HOUR
* LIST_DAY
* LIST_HOUR
* LIST_MINUTE
* MINUTE
* MONTH
* RANGE_DAY
* RANGE_HOUR
* RANGE_MINUTE
* WEEK
* YEAR

https://capi.woa.com/object/detail?product=wedata&env=api_dev&version=2025-08-06&name=WorkflowSchedulerConfigurationInfo
    */
    @SerializedName("MainCyclicConfig")
    @Expose
    private String MainCyclicConfig;

    /**
    * ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-实例范围
取值为：
* ALL_DAY_OF_YEAR
* ALL_MONTH_OF_YEAR
* CURRENT
* CURRENT_DAY
* CURRENT_HOUR
* CURRENT_MINUTE
* CURRENT_MONTH
* CURRENT_WEEK
* CURRENT_YEAR
* PREVIOUS_BEGIN_OF_MONTH
* PREVIOUS_DAY
* PREVIOUS_DAY_LATER_OFFSET_HOUR
* PREVIOUS_DAY_LATER_OFFSET_MINUTE
* PREVIOUS_END_OF_MONTH
* PREVIOUS_FRIDAY
* PREVIOUS_HOUR
* PREVIOUS_HOUR_CYCLE
* PREVIOUS_HOUR_LATER_OFFSET_MINUTE
* PREVIOUS_MINUTE_CYCLE
* PREVIOUS_MONTH
* PREVIOUS_WEEK
* PREVIOUS_WEEKEND
* RECENT_DATE

https://capi.woa.com/object/detail?product=wedata&env=api_dev&version=2025-08-06&name=WorkflowSchedulerConfigurationInfo
    */
    @SerializedName("SubordinateCyclicConfig")
    @Expose
    private String SubordinateCyclicConfig;

    /**
    * 执行时间左闭区间，示例：00:00，只有周期类型为MINUTE_CYCLE才需要填入
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * 执行时间右闭区间，示例：23:59，只有周期类型为MINUTE_CYCLE才需要填入
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * 是否开启日历调度 1 开启 0关闭
    */
    @SerializedName("CalendarOpen")
    @Expose
    private String CalendarOpen;

    /**
    * 日历id
    */
    @SerializedName("CalendarId")
    @Expose
    private String CalendarId;

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
     * Get 周期类型：支持的类型为
ONEOFF_CYCLE: 一次性
YEAR_CYCLE: 年
MONTH_CYCLE: 月
WEEK_CYCLE: 周
DAY_CYCLE: 天
HOUR_CYCLE: 小时
MINUTE_CYCLE: 分钟
CRONTAB_CYCLE: crontab表达式类型 
     * @return CycleType 周期类型：支持的类型为
ONEOFF_CYCLE: 一次性
YEAR_CYCLE: 年
MONTH_CYCLE: 月
WEEK_CYCLE: 周
DAY_CYCLE: 天
HOUR_CYCLE: 小时
MINUTE_CYCLE: 分钟
CRONTAB_CYCLE: crontab表达式类型
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set 周期类型：支持的类型为
ONEOFF_CYCLE: 一次性
YEAR_CYCLE: 年
MONTH_CYCLE: 月
WEEK_CYCLE: 周
DAY_CYCLE: 天
HOUR_CYCLE: 小时
MINUTE_CYCLE: 分钟
CRONTAB_CYCLE: crontab表达式类型
     * @param CycleType 周期类型：支持的类型为
ONEOFF_CYCLE: 一次性
YEAR_CYCLE: 年
MONTH_CYCLE: 月
WEEK_CYCLE: 周
DAY_CYCLE: 天
HOUR_CYCLE: 小时
MINUTE_CYCLE: 分钟
CRONTAB_CYCLE: crontab表达式类型
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get 自依赖, 默认值 serial, 取值为：parallel(并行), serial(串行), orderly(有序) 
     * @return SelfDepend 自依赖, 默认值 serial, 取值为：parallel(并行), serial(串行), orderly(有序)
     */
    public String getSelfDepend() {
        return this.SelfDepend;
    }

    /**
     * Set 自依赖, 默认值 serial, 取值为：parallel(并行), serial(串行), orderly(有序)
     * @param SelfDepend 自依赖, 默认值 serial, 取值为：parallel(并行), serial(串行), orderly(有序)
     */
    public void setSelfDepend(String SelfDepend) {
        this.SelfDepend = SelfDepend;
    }

    /**
     * Get 生效开始时间 
     * @return StartTime 生效开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 生效开始时间
     * @param StartTime 生效开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 生效结束时间 
     * @return EndTime 生效结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 生效结束时间
     * @param EndTime 生效结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get cron表达式 
     * @return CrontabExpression cron表达式
     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set cron表达式
     * @param CrontabExpression cron表达式
     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
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
     * Get 0：不修改 1：将任务的上游依赖配置改为默认值 
     * @return ModifyCycleValue 0：不修改 1：将任务的上游依赖配置改为默认值
     */
    public String getModifyCycleValue() {
        return this.ModifyCycleValue;
    }

    /**
     * Set 0：不修改 1：将任务的上游依赖配置改为默认值
     * @param ModifyCycleValue 0：不修改 1：将任务的上游依赖配置改为默认值
     */
    public void setModifyCycleValue(String ModifyCycleValue) {
        this.ModifyCycleValue = ModifyCycleValue;
    }

    /**
     * Get 工作流存在跨工作流依赖且使用cron表达式调度。如果保存统一调度，会断开不支持的依赖关系 
     * @return ClearLink 工作流存在跨工作流依赖且使用cron表达式调度。如果保存统一调度，会断开不支持的依赖关系
     */
    public Boolean getClearLink() {
        return this.ClearLink;
    }

    /**
     * Set 工作流存在跨工作流依赖且使用cron表达式调度。如果保存统一调度，会断开不支持的依赖关系
     * @param ClearLink 工作流存在跨工作流依赖且使用cron表达式调度。如果保存统一调度，会断开不支持的依赖关系
     */
    public void setClearLink(Boolean ClearLink) {
        this.ClearLink = ClearLink;
    }

    /**
     * Get ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-时间维度，取值为：
* CRONTAB
* DAY
* HOUR
* LIST_DAY
* LIST_HOUR
* LIST_MINUTE
* MINUTE
* MONTH
* RANGE_DAY
* RANGE_HOUR
* RANGE_MINUTE
* WEEK
* YEAR

https://capi.woa.com/object/detail?product=wedata&env=api_dev&version=2025-08-06&name=WorkflowSchedulerConfigurationInfo 
     * @return MainCyclicConfig ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-时间维度，取值为：
* CRONTAB
* DAY
* HOUR
* LIST_DAY
* LIST_HOUR
* LIST_MINUTE
* MINUTE
* MONTH
* RANGE_DAY
* RANGE_HOUR
* RANGE_MINUTE
* WEEK
* YEAR

https://capi.woa.com/object/detail?product=wedata&env=api_dev&version=2025-08-06&name=WorkflowSchedulerConfigurationInfo
     */
    public String getMainCyclicConfig() {
        return this.MainCyclicConfig;
    }

    /**
     * Set ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-时间维度，取值为：
* CRONTAB
* DAY
* HOUR
* LIST_DAY
* LIST_HOUR
* LIST_MINUTE
* MINUTE
* MONTH
* RANGE_DAY
* RANGE_HOUR
* RANGE_MINUTE
* WEEK
* YEAR

https://capi.woa.com/object/detail?product=wedata&env=api_dev&version=2025-08-06&name=WorkflowSchedulerConfigurationInfo
     * @param MainCyclicConfig ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-时间维度，取值为：
* CRONTAB
* DAY
* HOUR
* LIST_DAY
* LIST_HOUR
* LIST_MINUTE
* MINUTE
* MONTH
* RANGE_DAY
* RANGE_HOUR
* RANGE_MINUTE
* WEEK
* YEAR

https://capi.woa.com/object/detail?product=wedata&env=api_dev&version=2025-08-06&name=WorkflowSchedulerConfigurationInfo
     */
    public void setMainCyclicConfig(String MainCyclicConfig) {
        this.MainCyclicConfig = MainCyclicConfig;
    }

    /**
     * Get ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-实例范围
取值为：
* ALL_DAY_OF_YEAR
* ALL_MONTH_OF_YEAR
* CURRENT
* CURRENT_DAY
* CURRENT_HOUR
* CURRENT_MINUTE
* CURRENT_MONTH
* CURRENT_WEEK
* CURRENT_YEAR
* PREVIOUS_BEGIN_OF_MONTH
* PREVIOUS_DAY
* PREVIOUS_DAY_LATER_OFFSET_HOUR
* PREVIOUS_DAY_LATER_OFFSET_MINUTE
* PREVIOUS_END_OF_MONTH
* PREVIOUS_FRIDAY
* PREVIOUS_HOUR
* PREVIOUS_HOUR_CYCLE
* PREVIOUS_HOUR_LATER_OFFSET_MINUTE
* PREVIOUS_MINUTE_CYCLE
* PREVIOUS_MONTH
* PREVIOUS_WEEK
* PREVIOUS_WEEKEND
* RECENT_DATE

https://capi.woa.com/object/detail?product=wedata&env=api_dev&version=2025-08-06&name=WorkflowSchedulerConfigurationInfo 
     * @return SubordinateCyclicConfig ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-实例范围
取值为：
* ALL_DAY_OF_YEAR
* ALL_MONTH_OF_YEAR
* CURRENT
* CURRENT_DAY
* CURRENT_HOUR
* CURRENT_MINUTE
* CURRENT_MONTH
* CURRENT_WEEK
* CURRENT_YEAR
* PREVIOUS_BEGIN_OF_MONTH
* PREVIOUS_DAY
* PREVIOUS_DAY_LATER_OFFSET_HOUR
* PREVIOUS_DAY_LATER_OFFSET_MINUTE
* PREVIOUS_END_OF_MONTH
* PREVIOUS_FRIDAY
* PREVIOUS_HOUR
* PREVIOUS_HOUR_CYCLE
* PREVIOUS_HOUR_LATER_OFFSET_MINUTE
* PREVIOUS_MINUTE_CYCLE
* PREVIOUS_MONTH
* PREVIOUS_WEEK
* PREVIOUS_WEEKEND
* RECENT_DATE

https://capi.woa.com/object/detail?product=wedata&env=api_dev&version=2025-08-06&name=WorkflowSchedulerConfigurationInfo
     */
    public String getSubordinateCyclicConfig() {
        return this.SubordinateCyclicConfig;
    }

    /**
     * Set ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-实例范围
取值为：
* ALL_DAY_OF_YEAR
* ALL_MONTH_OF_YEAR
* CURRENT
* CURRENT_DAY
* CURRENT_HOUR
* CURRENT_MINUTE
* CURRENT_MONTH
* CURRENT_WEEK
* CURRENT_YEAR
* PREVIOUS_BEGIN_OF_MONTH
* PREVIOUS_DAY
* PREVIOUS_DAY_LATER_OFFSET_HOUR
* PREVIOUS_DAY_LATER_OFFSET_MINUTE
* PREVIOUS_END_OF_MONTH
* PREVIOUS_FRIDAY
* PREVIOUS_HOUR
* PREVIOUS_HOUR_CYCLE
* PREVIOUS_HOUR_LATER_OFFSET_MINUTE
* PREVIOUS_MINUTE_CYCLE
* PREVIOUS_MONTH
* PREVIOUS_WEEK
* PREVIOUS_WEEKEND
* RECENT_DATE

https://capi.woa.com/object/detail?product=wedata&env=api_dev&version=2025-08-06&name=WorkflowSchedulerConfigurationInfo
     * @param SubordinateCyclicConfig ModifyCycleValue为1的时候生效，表示默认修改的上游依赖-实例范围
取值为：
* ALL_DAY_OF_YEAR
* ALL_MONTH_OF_YEAR
* CURRENT
* CURRENT_DAY
* CURRENT_HOUR
* CURRENT_MINUTE
* CURRENT_MONTH
* CURRENT_WEEK
* CURRENT_YEAR
* PREVIOUS_BEGIN_OF_MONTH
* PREVIOUS_DAY
* PREVIOUS_DAY_LATER_OFFSET_HOUR
* PREVIOUS_DAY_LATER_OFFSET_MINUTE
* PREVIOUS_END_OF_MONTH
* PREVIOUS_FRIDAY
* PREVIOUS_HOUR
* PREVIOUS_HOUR_CYCLE
* PREVIOUS_HOUR_LATER_OFFSET_MINUTE
* PREVIOUS_MINUTE_CYCLE
* PREVIOUS_MONTH
* PREVIOUS_WEEK
* PREVIOUS_WEEKEND
* RECENT_DATE

https://capi.woa.com/object/detail?product=wedata&env=api_dev&version=2025-08-06&name=WorkflowSchedulerConfigurationInfo
     */
    public void setSubordinateCyclicConfig(String SubordinateCyclicConfig) {
        this.SubordinateCyclicConfig = SubordinateCyclicConfig;
    }

    /**
     * Get 执行时间左闭区间，示例：00:00，只有周期类型为MINUTE_CYCLE才需要填入 
     * @return ExecutionStartTime 执行时间左闭区间，示例：00:00，只有周期类型为MINUTE_CYCLE才需要填入
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set 执行时间左闭区间，示例：00:00，只有周期类型为MINUTE_CYCLE才需要填入
     * @param ExecutionStartTime 执行时间左闭区间，示例：00:00，只有周期类型为MINUTE_CYCLE才需要填入
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get 执行时间右闭区间，示例：23:59，只有周期类型为MINUTE_CYCLE才需要填入 
     * @return ExecutionEndTime 执行时间右闭区间，示例：23:59，只有周期类型为MINUTE_CYCLE才需要填入
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set 执行时间右闭区间，示例：23:59，只有周期类型为MINUTE_CYCLE才需要填入
     * @param ExecutionEndTime 执行时间右闭区间，示例：23:59，只有周期类型为MINUTE_CYCLE才需要填入
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
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

    }
}

