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

public class WorkflowTriggerConfig extends AbstractModel {

    /**
    * 触发方式，
- 定时触发：TIME_TRIGGER
- 持续运行：CONTINUE_RUN
- 文件到达：FILE_ARRIVAL

注意：
- TIME_TRIGGER 和 CONTINUE_RUN 模式下，SchedulerStatus、SchedulerTimeZone、StartTime、EndTime、ConfigMode、CycleType、CrontabExpression 必填；
- FILE_ARRIVAL 模式下，FileArrivalPath、TriggerMinimumIntervalSecond、TriggerWaitTimeSecond 必填；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerMode")
    @Expose
    private String TriggerMode;

    /**
    * WorkflowTriggerConfig转换成Json格式，对账使用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraInfo")
    @Expose
    private String ExtraInfo;

    /**
    * 调度时区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScheduleTimeZone")
    @Expose
    private String ScheduleTimeZone;

    /**
    * 调度生效时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 调度结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 配置方式，常规：COMMON，CRON表达式：CRON_EXPRESSION
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigMode")
    @Expose
    private String ConfigMode;

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
    * cron表达式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * triggerId, uuid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerId")
    @Expose
    private String TriggerId;

    /**
    * 文件到达模式下	存储系统中的监听路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileArrivalPath")
    @Expose
    private String FileArrivalPath;

    /**
    * 文件到达模式下	触发最短间隔时间（单位：秒）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerMinimumIntervalSecond")
    @Expose
    private Long TriggerMinimumIntervalSecond;

    /**
    * 文件到达模式下	触发等待时间（单位：秒）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerWaitTimeSecond")
    @Expose
    private Long TriggerWaitTimeSecond;

    /**
    * Trigger 状态 启动ACTIVE，暂停PAUSED
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulerStatus")
    @Expose
    private String SchedulerStatus;

    /**
     * Get 触发方式，
- 定时触发：TIME_TRIGGER
- 持续运行：CONTINUE_RUN
- 文件到达：FILE_ARRIVAL

注意：
- TIME_TRIGGER 和 CONTINUE_RUN 模式下，SchedulerStatus、SchedulerTimeZone、StartTime、EndTime、ConfigMode、CycleType、CrontabExpression 必填；
- FILE_ARRIVAL 模式下，FileArrivalPath、TriggerMinimumIntervalSecond、TriggerWaitTimeSecond 必填；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerMode 触发方式，
- 定时触发：TIME_TRIGGER
- 持续运行：CONTINUE_RUN
- 文件到达：FILE_ARRIVAL

注意：
- TIME_TRIGGER 和 CONTINUE_RUN 模式下，SchedulerStatus、SchedulerTimeZone、StartTime、EndTime、ConfigMode、CycleType、CrontabExpression 必填；
- FILE_ARRIVAL 模式下，FileArrivalPath、TriggerMinimumIntervalSecond、TriggerWaitTimeSecond 必填；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerMode() {
        return this.TriggerMode;
    }

    /**
     * Set 触发方式，
- 定时触发：TIME_TRIGGER
- 持续运行：CONTINUE_RUN
- 文件到达：FILE_ARRIVAL

注意：
- TIME_TRIGGER 和 CONTINUE_RUN 模式下，SchedulerStatus、SchedulerTimeZone、StartTime、EndTime、ConfigMode、CycleType、CrontabExpression 必填；
- FILE_ARRIVAL 模式下，FileArrivalPath、TriggerMinimumIntervalSecond、TriggerWaitTimeSecond 必填；
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerMode 触发方式，
- 定时触发：TIME_TRIGGER
- 持续运行：CONTINUE_RUN
- 文件到达：FILE_ARRIVAL

注意：
- TIME_TRIGGER 和 CONTINUE_RUN 模式下，SchedulerStatus、SchedulerTimeZone、StartTime、EndTime、ConfigMode、CycleType、CrontabExpression 必填；
- FILE_ARRIVAL 模式下，FileArrivalPath、TriggerMinimumIntervalSecond、TriggerWaitTimeSecond 必填；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerMode(String TriggerMode) {
        this.TriggerMode = TriggerMode;
    }

    /**
     * Get WorkflowTriggerConfig转换成Json格式，对账使用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraInfo WorkflowTriggerConfig转换成Json格式，对账使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set WorkflowTriggerConfig转换成Json格式，对账使用
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraInfo WorkflowTriggerConfig转换成Json格式，对账使用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraInfo(String ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get 调度时区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScheduleTimeZone 调度时区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheduleTimeZone() {
        return this.ScheduleTimeZone;
    }

    /**
     * Set 调度时区
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScheduleTimeZone 调度时区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheduleTimeZone(String ScheduleTimeZone) {
        this.ScheduleTimeZone = ScheduleTimeZone;
    }

    /**
     * Get 调度生效时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 调度生效时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 调度生效时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 调度生效时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 调度结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 调度结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 调度结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 调度结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 配置方式，常规：COMMON，CRON表达式：CRON_EXPRESSION
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigMode 配置方式，常规：COMMON，CRON表达式：CRON_EXPRESSION
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigMode() {
        return this.ConfigMode;
    }

    /**
     * Set 配置方式，常规：COMMON，CRON表达式：CRON_EXPRESSION
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigMode 配置方式，常规：COMMON，CRON表达式：CRON_EXPRESSION
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigMode(String ConfigMode) {
        this.ConfigMode = ConfigMode;
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
     * Get triggerId, uuid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerId triggerId, uuid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerId() {
        return this.TriggerId;
    }

    /**
     * Set triggerId, uuid
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerId triggerId, uuid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerId(String TriggerId) {
        this.TriggerId = TriggerId;
    }

    /**
     * Get 文件到达模式下	存储系统中的监听路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileArrivalPath 文件到达模式下	存储系统中的监听路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileArrivalPath() {
        return this.FileArrivalPath;
    }

    /**
     * Set 文件到达模式下	存储系统中的监听路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileArrivalPath 文件到达模式下	存储系统中的监听路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileArrivalPath(String FileArrivalPath) {
        this.FileArrivalPath = FileArrivalPath;
    }

    /**
     * Get 文件到达模式下	触发最短间隔时间（单位：秒）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerMinimumIntervalSecond 文件到达模式下	触发最短间隔时间（单位：秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTriggerMinimumIntervalSecond() {
        return this.TriggerMinimumIntervalSecond;
    }

    /**
     * Set 文件到达模式下	触发最短间隔时间（单位：秒）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerMinimumIntervalSecond 文件到达模式下	触发最短间隔时间（单位：秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerMinimumIntervalSecond(Long TriggerMinimumIntervalSecond) {
        this.TriggerMinimumIntervalSecond = TriggerMinimumIntervalSecond;
    }

    /**
     * Get 文件到达模式下	触发等待时间（单位：秒）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerWaitTimeSecond 文件到达模式下	触发等待时间（单位：秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTriggerWaitTimeSecond() {
        return this.TriggerWaitTimeSecond;
    }

    /**
     * Set 文件到达模式下	触发等待时间（单位：秒）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerWaitTimeSecond 文件到达模式下	触发等待时间（单位：秒）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerWaitTimeSecond(Long TriggerWaitTimeSecond) {
        this.TriggerWaitTimeSecond = TriggerWaitTimeSecond;
    }

    /**
     * Get Trigger 状态 启动ACTIVE，暂停PAUSED
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchedulerStatus Trigger 状态 启动ACTIVE，暂停PAUSED
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchedulerStatus() {
        return this.SchedulerStatus;
    }

    /**
     * Set Trigger 状态 启动ACTIVE，暂停PAUSED
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchedulerStatus Trigger 状态 启动ACTIVE，暂停PAUSED
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchedulerStatus(String SchedulerStatus) {
        this.SchedulerStatus = SchedulerStatus;
    }

    public WorkflowTriggerConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowTriggerConfig(WorkflowTriggerConfig source) {
        if (source.TriggerMode != null) {
            this.TriggerMode = new String(source.TriggerMode);
        }
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new String(source.ExtraInfo);
        }
        if (source.ScheduleTimeZone != null) {
            this.ScheduleTimeZone = new String(source.ScheduleTimeZone);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ConfigMode != null) {
            this.ConfigMode = new String(source.ConfigMode);
        }
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.CrontabExpression != null) {
            this.CrontabExpression = new String(source.CrontabExpression);
        }
        if (source.TriggerId != null) {
            this.TriggerId = new String(source.TriggerId);
        }
        if (source.FileArrivalPath != null) {
            this.FileArrivalPath = new String(source.FileArrivalPath);
        }
        if (source.TriggerMinimumIntervalSecond != null) {
            this.TriggerMinimumIntervalSecond = new Long(source.TriggerMinimumIntervalSecond);
        }
        if (source.TriggerWaitTimeSecond != null) {
            this.TriggerWaitTimeSecond = new Long(source.TriggerWaitTimeSecond);
        }
        if (source.SchedulerStatus != null) {
            this.SchedulerStatus = new String(source.SchedulerStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TriggerMode", this.TriggerMode);
        this.setParamSimple(map, prefix + "ExtraInfo", this.ExtraInfo);
        this.setParamSimple(map, prefix + "ScheduleTimeZone", this.ScheduleTimeZone);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ConfigMode", this.ConfigMode);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "CrontabExpression", this.CrontabExpression);
        this.setParamSimple(map, prefix + "TriggerId", this.TriggerId);
        this.setParamSimple(map, prefix + "FileArrivalPath", this.FileArrivalPath);
        this.setParamSimple(map, prefix + "TriggerMinimumIntervalSecond", this.TriggerMinimumIntervalSecond);
        this.setParamSimple(map, prefix + "TriggerWaitTimeSecond", this.TriggerWaitTimeSecond);
        this.setParamSimple(map, prefix + "SchedulerStatus", this.SchedulerStatus);

    }
}

