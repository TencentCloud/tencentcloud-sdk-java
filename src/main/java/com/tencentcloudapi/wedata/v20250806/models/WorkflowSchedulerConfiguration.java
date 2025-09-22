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

public class WorkflowSchedulerConfiguration extends AbstractModel {

    /**
    * 时区
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * 自依赖, 默认值 serial, 取值为：parallel(并行), serial(串行), orderly(有序)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelfDepend")
    @Expose
    private String SelfDepend;

    /**
    * 生效开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 生效结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 工作流依赖，yes or no
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependencyWorkflow")
    @Expose
    private String DependencyWorkflow;

    /**
    * 执行时间左闭区间，示例：00:00
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * 执行时间右闭区间，示例：23:59
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * cron表达式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * 是否开启日历调度 1 开启 0关闭
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalendarOpen")
    @Expose
    private String CalendarOpen;

    /**
    * 日历名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalendarName")
    @Expose
    private String CalendarName;

    /**
    * 日历id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalendarId")
    @Expose
    private String CalendarId;

    /**
     * Get 时区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleTimeZone 时区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set 时区
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleTimeZone 时区
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleType 周期类型：支持的类型为
ONEOFF_CYCLE: 一次性
YEAR_CYCLE: 年
MONTH_CYCLE: 月
WEEK_CYCLE: 周
DAY_CYCLE: 天
HOUR_CYCLE: 小时
MINUTE_CYCLE: 分钟
CRONTAB_CYCLE: crontab表达式类型
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleType 周期类型：支持的类型为
ONEOFF_CYCLE: 一次性
YEAR_CYCLE: 年
MONTH_CYCLE: 月
WEEK_CYCLE: 周
DAY_CYCLE: 天
HOUR_CYCLE: 小时
MINUTE_CYCLE: 分钟
CRONTAB_CYCLE: crontab表达式类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get 自依赖, 默认值 serial, 取值为：parallel(并行), serial(串行), orderly(有序)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelfDepend 自依赖, 默认值 serial, 取值为：parallel(并行), serial(串行), orderly(有序)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSelfDepend() {
        return this.SelfDepend;
    }

    /**
     * Set 自依赖, 默认值 serial, 取值为：parallel(并行), serial(串行), orderly(有序)
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelfDepend 自依赖, 默认值 serial, 取值为：parallel(并行), serial(串行), orderly(有序)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelfDepend(String SelfDepend) {
        this.SelfDepend = SelfDepend;
    }

    /**
     * Get 生效开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 生效开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 生效开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 生效开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 生效结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 生效结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 生效结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 生效结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 工作流依赖，yes or no
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependencyWorkflow 工作流依赖，yes or no
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependencyWorkflow() {
        return this.DependencyWorkflow;
    }

    /**
     * Set 工作流依赖，yes or no
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependencyWorkflow 工作流依赖，yes or no
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependencyWorkflow(String DependencyWorkflow) {
        this.DependencyWorkflow = DependencyWorkflow;
    }

    /**
     * Get 执行时间左闭区间，示例：00:00
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionStartTime 执行时间左闭区间，示例：00:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set 执行时间左闭区间，示例：00:00
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionStartTime 执行时间左闭区间，示例：00:00
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get 执行时间右闭区间，示例：23:59
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionEndTime 执行时间右闭区间，示例：23:59
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set 执行时间右闭区间，示例：23:59
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionEndTime 执行时间右闭区间，示例：23:59
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    /**
     * Get cron表达式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CrontabExpression cron表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set cron表达式
注意：此字段可能返回 null，表示取不到有效值。
     * @param CrontabExpression cron表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
    }

    /**
     * Get 是否开启日历调度 1 开启 0关闭
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalendarOpen 是否开启日历调度 1 开启 0关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCalendarOpen() {
        return this.CalendarOpen;
    }

    /**
     * Set 是否开启日历调度 1 开启 0关闭
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalendarOpen 是否开启日历调度 1 开启 0关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalendarOpen(String CalendarOpen) {
        this.CalendarOpen = CalendarOpen;
    }

    /**
     * Get 日历名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalendarName 日历名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCalendarName() {
        return this.CalendarName;
    }

    /**
     * Set 日历名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalendarName 日历名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalendarName(String CalendarName) {
        this.CalendarName = CalendarName;
    }

    /**
     * Get 日历id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalendarId 日历id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCalendarId() {
        return this.CalendarId;
    }

    /**
     * Set 日历id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalendarId 日历id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalendarId(String CalendarId) {
        this.CalendarId = CalendarId;
    }

    public WorkflowSchedulerConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowSchedulerConfiguration(WorkflowSchedulerConfiguration source) {
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
        if (source.DependencyWorkflow != null) {
            this.DependencyWorkflow = new String(source.DependencyWorkflow);
        }
        if (source.ExecutionStartTime != null) {
            this.ExecutionStartTime = new String(source.ExecutionStartTime);
        }
        if (source.ExecutionEndTime != null) {
            this.ExecutionEndTime = new String(source.ExecutionEndTime);
        }
        if (source.CrontabExpression != null) {
            this.CrontabExpression = new String(source.CrontabExpression);
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
        this.setParamSimple(map, prefix + "DependencyWorkflow", this.DependencyWorkflow);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);
        this.setParamSimple(map, prefix + "CrontabExpression", this.CrontabExpression);
        this.setParamSimple(map, prefix + "CalendarOpen", this.CalendarOpen);
        this.setParamSimple(map, prefix + "CalendarName", this.CalendarName);
        this.setParamSimple(map, prefix + "CalendarId", this.CalendarId);

    }
}

