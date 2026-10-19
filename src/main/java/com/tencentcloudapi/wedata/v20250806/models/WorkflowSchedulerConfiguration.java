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
    * <p>时区</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
    * <p>周期类型：支持的类型为<br>ONEOFF_CYCLE: 一次性<br>YEAR_CYCLE: 年<br>MONTH_CYCLE: 月<br>WEEK_CYCLE: 周<br>DAY_CYCLE: 天<br>HOUR_CYCLE: 小时<br>MINUTE_CYCLE: 分钟<br>CRONTAB_CYCLE: crontab表达式类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * <p>自依赖, 默认值 serial, 取值为：parallel(并行), serial(串行), orderly(有序)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SelfDepend")
    @Expose
    private String SelfDepend;

    /**
    * <p>生效开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>生效结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>工作流依赖，yes or no</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependencyWorkflow")
    @Expose
    private String DependencyWorkflow;

    /**
    * <p>执行时间左闭区间，示例：00:00</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionStartTime")
    @Expose
    private String ExecutionStartTime;

    /**
    * <p>执行时间右闭区间，示例：23:59</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecutionEndTime")
    @Expose
    private String ExecutionEndTime;

    /**
    * <p>cron表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * <p>是否开启日历调度 1 开启 0关闭</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalendarOpen")
    @Expose
    private String CalendarOpen;

    /**
    * <p>日历名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalendarName")
    @Expose
    private String CalendarName;

    /**
    * <p>日历id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalendarId")
    @Expose
    private String CalendarId;

    /**
    * <p>分钟任务相位偏移</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinuteOffset")
    @Expose
    private Long MinuteOffset;

    /**
     * Get <p>时区</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleTimeZone <p>时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set <p>时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleTimeZone <p>时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
    }

    /**
     * Get <p>周期类型：支持的类型为<br>ONEOFF_CYCLE: 一次性<br>YEAR_CYCLE: 年<br>MONTH_CYCLE: 月<br>WEEK_CYCLE: 周<br>DAY_CYCLE: 天<br>HOUR_CYCLE: 小时<br>MINUTE_CYCLE: 分钟<br>CRONTAB_CYCLE: crontab表达式类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleType <p>周期类型：支持的类型为<br>ONEOFF_CYCLE: 一次性<br>YEAR_CYCLE: 年<br>MONTH_CYCLE: 月<br>WEEK_CYCLE: 周<br>DAY_CYCLE: 天<br>HOUR_CYCLE: 小时<br>MINUTE_CYCLE: 分钟<br>CRONTAB_CYCLE: crontab表达式类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set <p>周期类型：支持的类型为<br>ONEOFF_CYCLE: 一次性<br>YEAR_CYCLE: 年<br>MONTH_CYCLE: 月<br>WEEK_CYCLE: 周<br>DAY_CYCLE: 天<br>HOUR_CYCLE: 小时<br>MINUTE_CYCLE: 分钟<br>CRONTAB_CYCLE: crontab表达式类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleType <p>周期类型：支持的类型为<br>ONEOFF_CYCLE: 一次性<br>YEAR_CYCLE: 年<br>MONTH_CYCLE: 月<br>WEEK_CYCLE: 周<br>DAY_CYCLE: 天<br>HOUR_CYCLE: 小时<br>MINUTE_CYCLE: 分钟<br>CRONTAB_CYCLE: crontab表达式类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get <p>自依赖, 默认值 serial, 取值为：parallel(并行), serial(串行), orderly(有序)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SelfDepend <p>自依赖, 默认值 serial, 取值为：parallel(并行), serial(串行), orderly(有序)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSelfDepend() {
        return this.SelfDepend;
    }

    /**
     * Set <p>自依赖, 默认值 serial, 取值为：parallel(并行), serial(串行), orderly(有序)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SelfDepend <p>自依赖, 默认值 serial, 取值为：parallel(并行), serial(串行), orderly(有序)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSelfDepend(String SelfDepend) {
        this.SelfDepend = SelfDepend;
    }

    /**
     * Get <p>生效开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime <p>生效开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>生效开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime <p>生效开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>生效结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime <p>生效结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>生效结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime <p>生效结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>工作流依赖，yes or no</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependencyWorkflow <p>工作流依赖，yes or no</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependencyWorkflow() {
        return this.DependencyWorkflow;
    }

    /**
     * Set <p>工作流依赖，yes or no</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependencyWorkflow <p>工作流依赖，yes or no</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependencyWorkflow(String DependencyWorkflow) {
        this.DependencyWorkflow = DependencyWorkflow;
    }

    /**
     * Get <p>执行时间左闭区间，示例：00:00</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionStartTime <p>执行时间左闭区间，示例：00:00</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionStartTime() {
        return this.ExecutionStartTime;
    }

    /**
     * Set <p>执行时间左闭区间，示例：00:00</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionStartTime <p>执行时间左闭区间，示例：00:00</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionStartTime(String ExecutionStartTime) {
        this.ExecutionStartTime = ExecutionStartTime;
    }

    /**
     * Get <p>执行时间右闭区间，示例：23:59</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecutionEndTime <p>执行时间右闭区间，示例：23:59</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecutionEndTime() {
        return this.ExecutionEndTime;
    }

    /**
     * Set <p>执行时间右闭区间，示例：23:59</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecutionEndTime <p>执行时间右闭区间，示例：23:59</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecutionEndTime(String ExecutionEndTime) {
        this.ExecutionEndTime = ExecutionEndTime;
    }

    /**
     * Get <p>cron表达式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CrontabExpression <p>cron表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCrontabExpression() {
        return this.CrontabExpression;
    }

    /**
     * Set <p>cron表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CrontabExpression <p>cron表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCrontabExpression(String CrontabExpression) {
        this.CrontabExpression = CrontabExpression;
    }

    /**
     * Get <p>是否开启日历调度 1 开启 0关闭</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalendarOpen <p>是否开启日历调度 1 开启 0关闭</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCalendarOpen() {
        return this.CalendarOpen;
    }

    /**
     * Set <p>是否开启日历调度 1 开启 0关闭</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalendarOpen <p>是否开启日历调度 1 开启 0关闭</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalendarOpen(String CalendarOpen) {
        this.CalendarOpen = CalendarOpen;
    }

    /**
     * Get <p>日历名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalendarName <p>日历名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCalendarName() {
        return this.CalendarName;
    }

    /**
     * Set <p>日历名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalendarName <p>日历名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalendarName(String CalendarName) {
        this.CalendarName = CalendarName;
    }

    /**
     * Get <p>日历id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalendarId <p>日历id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCalendarId() {
        return this.CalendarId;
    }

    /**
     * Set <p>日历id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalendarId <p>日历id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalendarId(String CalendarId) {
        this.CalendarId = CalendarId;
    }

    /**
     * Get <p>分钟任务相位偏移</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinuteOffset <p>分钟任务相位偏移</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinuteOffset() {
        return this.MinuteOffset;
    }

    /**
     * Set <p>分钟任务相位偏移</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinuteOffset <p>分钟任务相位偏移</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinuteOffset(Long MinuteOffset) {
        this.MinuteOffset = MinuteOffset;
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
        this.setParamSimple(map, prefix + "DependencyWorkflow", this.DependencyWorkflow);
        this.setParamSimple(map, prefix + "ExecutionStartTime", this.ExecutionStartTime);
        this.setParamSimple(map, prefix + "ExecutionEndTime", this.ExecutionEndTime);
        this.setParamSimple(map, prefix + "CrontabExpression", this.CrontabExpression);
        this.setParamSimple(map, prefix + "CalendarOpen", this.CalendarOpen);
        this.setParamSimple(map, prefix + "CalendarName", this.CalendarName);
        this.setParamSimple(map, prefix + "CalendarId", this.CalendarId);
        this.setParamSimple(map, prefix + "MinuteOffset", this.MinuteOffset);

    }
}

