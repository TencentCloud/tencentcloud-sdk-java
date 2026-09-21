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

public class WorkflowTriggerConfiguration extends AbstractModel {

    /**
    * <p>调度配置ID，创建时无需传入，由服务端生成</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerId")
    @Expose
    private String TriggerId;

    /**
    * <p>调度状态 启动：START，暂停：PAUSE</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulerStatus")
    @Expose
    private String SchedulerStatus;

    /**
    * <p>触发方式，</p><ul><li>定时触发：TIME_TRIGGER</li><li>持续运行：CONTINUE_RUN</li></ul><p>注意：</p><ul><li>TIME_TRIGGER 模式下，SchedulerStatus、SchedulerTimeZone、StartTime、EndTime、ConfigMode、CycleType、CrontabExpression 必填；</li><li>CONTINUE_RUN 模式下，AdvancedConfig必填；</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerMode")
    @Expose
    private String TriggerMode;

    /**
    * <p>调度时区</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchedulerTimeZone")
    @Expose
    private String SchedulerTimeZone;

    /**
    * <p>调度生效时间，单位：毫秒时间戳。必须小于 EndTime</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>调度结束时间，单位：毫秒时间戳。必须大于 StartTime</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>配置方式，常规：COMMON，CRON表达式：CRON_EXPRESSION</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigMode")
    @Expose
    private String ConfigMode;

    /**
    * <p>周期类型：支持的类型为 ONEOFF_CYCLE: 一次性 YEAR_CYCLE: 年 MONTH_CYCLE: 月 WEEK_CYCLE: 周 DAY_CYCLE: 天<br>HOUR_CYCLE: 小时 MINUTE_CYCLE: 分钟 CRONTAB_CYCLE: crontab表达式类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * <p>cron表达式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CrontabExpression")
    @Expose
    private String CrontabExpression;

    /**
    * <p>Json格式，对账使用</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraInfo")
    @Expose
    private String ExtraInfo;

    /**
    * <p>高级配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvancedConfig")
    @Expose
    private WorkflowTriggerAdvancedConfiguration AdvancedConfig;

    /**
     * Get <p>调度配置ID，创建时无需传入，由服务端生成</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerId <p>调度配置ID，创建时无需传入，由服务端生成</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerId() {
        return this.TriggerId;
    }

    /**
     * Set <p>调度配置ID，创建时无需传入，由服务端生成</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerId <p>调度配置ID，创建时无需传入，由服务端生成</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerId(String TriggerId) {
        this.TriggerId = TriggerId;
    }

    /**
     * Get <p>调度状态 启动：START，暂停：PAUSE</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchedulerStatus <p>调度状态 启动：START，暂停：PAUSE</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchedulerStatus() {
        return this.SchedulerStatus;
    }

    /**
     * Set <p>调度状态 启动：START，暂停：PAUSE</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchedulerStatus <p>调度状态 启动：START，暂停：PAUSE</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchedulerStatus(String SchedulerStatus) {
        this.SchedulerStatus = SchedulerStatus;
    }

    /**
     * Get <p>触发方式，</p><ul><li>定时触发：TIME_TRIGGER</li><li>持续运行：CONTINUE_RUN</li></ul><p>注意：</p><ul><li>TIME_TRIGGER 模式下，SchedulerStatus、SchedulerTimeZone、StartTime、EndTime、ConfigMode、CycleType、CrontabExpression 必填；</li><li>CONTINUE_RUN 模式下，AdvancedConfig必填；</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerMode <p>触发方式，</p><ul><li>定时触发：TIME_TRIGGER</li><li>持续运行：CONTINUE_RUN</li></ul><p>注意：</p><ul><li>TIME_TRIGGER 模式下，SchedulerStatus、SchedulerTimeZone、StartTime、EndTime、ConfigMode、CycleType、CrontabExpression 必填；</li><li>CONTINUE_RUN 模式下，AdvancedConfig必填；</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTriggerMode() {
        return this.TriggerMode;
    }

    /**
     * Set <p>触发方式，</p><ul><li>定时触发：TIME_TRIGGER</li><li>持续运行：CONTINUE_RUN</li></ul><p>注意：</p><ul><li>TIME_TRIGGER 模式下，SchedulerStatus、SchedulerTimeZone、StartTime、EndTime、ConfigMode、CycleType、CrontabExpression 必填；</li><li>CONTINUE_RUN 模式下，AdvancedConfig必填；</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerMode <p>触发方式，</p><ul><li>定时触发：TIME_TRIGGER</li><li>持续运行：CONTINUE_RUN</li></ul><p>注意：</p><ul><li>TIME_TRIGGER 模式下，SchedulerStatus、SchedulerTimeZone、StartTime、EndTime、ConfigMode、CycleType、CrontabExpression 必填；</li><li>CONTINUE_RUN 模式下，AdvancedConfig必填；</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerMode(String TriggerMode) {
        this.TriggerMode = TriggerMode;
    }

    /**
     * Get <p>调度时区</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchedulerTimeZone <p>调度时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchedulerTimeZone() {
        return this.SchedulerTimeZone;
    }

    /**
     * Set <p>调度时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchedulerTimeZone <p>调度时区</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchedulerTimeZone(String SchedulerTimeZone) {
        this.SchedulerTimeZone = SchedulerTimeZone;
    }

    /**
     * Get <p>调度生效时间，单位：毫秒时间戳。必须小于 EndTime</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime <p>调度生效时间，单位：毫秒时间戳。必须小于 EndTime</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>调度生效时间，单位：毫秒时间戳。必须小于 EndTime</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime <p>调度生效时间，单位：毫秒时间戳。必须小于 EndTime</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>调度结束时间，单位：毫秒时间戳。必须大于 StartTime</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime <p>调度结束时间，单位：毫秒时间戳。必须大于 StartTime</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>调度结束时间，单位：毫秒时间戳。必须大于 StartTime</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime <p>调度结束时间，单位：毫秒时间戳。必须大于 StartTime</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>配置方式，常规：COMMON，CRON表达式：CRON_EXPRESSION</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigMode <p>配置方式，常规：COMMON，CRON表达式：CRON_EXPRESSION</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigMode() {
        return this.ConfigMode;
    }

    /**
     * Set <p>配置方式，常规：COMMON，CRON表达式：CRON_EXPRESSION</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigMode <p>配置方式，常规：COMMON，CRON表达式：CRON_EXPRESSION</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigMode(String ConfigMode) {
        this.ConfigMode = ConfigMode;
    }

    /**
     * Get <p>周期类型：支持的类型为 ONEOFF_CYCLE: 一次性 YEAR_CYCLE: 年 MONTH_CYCLE: 月 WEEK_CYCLE: 周 DAY_CYCLE: 天<br>HOUR_CYCLE: 小时 MINUTE_CYCLE: 分钟 CRONTAB_CYCLE: crontab表达式类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CycleType <p>周期类型：支持的类型为 ONEOFF_CYCLE: 一次性 YEAR_CYCLE: 年 MONTH_CYCLE: 月 WEEK_CYCLE: 周 DAY_CYCLE: 天<br>HOUR_CYCLE: 小时 MINUTE_CYCLE: 分钟 CRONTAB_CYCLE: crontab表达式类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set <p>周期类型：支持的类型为 ONEOFF_CYCLE: 一次性 YEAR_CYCLE: 年 MONTH_CYCLE: 月 WEEK_CYCLE: 周 DAY_CYCLE: 天<br>HOUR_CYCLE: 小时 MINUTE_CYCLE: 分钟 CRONTAB_CYCLE: crontab表达式类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CycleType <p>周期类型：支持的类型为 ONEOFF_CYCLE: 一次性 YEAR_CYCLE: 年 MONTH_CYCLE: 月 WEEK_CYCLE: 周 DAY_CYCLE: 天<br>HOUR_CYCLE: 小时 MINUTE_CYCLE: 分钟 CRONTAB_CYCLE: crontab表达式类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
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
     * Get <p>Json格式，对账使用</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraInfo <p>Json格式，对账使用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtraInfo() {
        return this.ExtraInfo;
    }

    /**
     * Set <p>Json格式，对账使用</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraInfo <p>Json格式，对账使用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraInfo(String ExtraInfo) {
        this.ExtraInfo = ExtraInfo;
    }

    /**
     * Get <p>高级配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvancedConfig <p>高级配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkflowTriggerAdvancedConfiguration getAdvancedConfig() {
        return this.AdvancedConfig;
    }

    /**
     * Set <p>高级配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvancedConfig <p>高级配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvancedConfig(WorkflowTriggerAdvancedConfiguration AdvancedConfig) {
        this.AdvancedConfig = AdvancedConfig;
    }

    public WorkflowTriggerConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowTriggerConfiguration(WorkflowTriggerConfiguration source) {
        if (source.TriggerId != null) {
            this.TriggerId = new String(source.TriggerId);
        }
        if (source.SchedulerStatus != null) {
            this.SchedulerStatus = new String(source.SchedulerStatus);
        }
        if (source.TriggerMode != null) {
            this.TriggerMode = new String(source.TriggerMode);
        }
        if (source.SchedulerTimeZone != null) {
            this.SchedulerTimeZone = new String(source.SchedulerTimeZone);
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
        if (source.ExtraInfo != null) {
            this.ExtraInfo = new String(source.ExtraInfo);
        }
        if (source.AdvancedConfig != null) {
            this.AdvancedConfig = new WorkflowTriggerAdvancedConfiguration(source.AdvancedConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TriggerId", this.TriggerId);
        this.setParamSimple(map, prefix + "SchedulerStatus", this.SchedulerStatus);
        this.setParamSimple(map, prefix + "TriggerMode", this.TriggerMode);
        this.setParamSimple(map, prefix + "SchedulerTimeZone", this.SchedulerTimeZone);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ConfigMode", this.ConfigMode);
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamSimple(map, prefix + "CrontabExpression", this.CrontabExpression);
        this.setParamSimple(map, prefix + "ExtraInfo", this.ExtraInfo);
        this.setParamObj(map, prefix + "AdvancedConfig.", this.AdvancedConfig);

    }
}

