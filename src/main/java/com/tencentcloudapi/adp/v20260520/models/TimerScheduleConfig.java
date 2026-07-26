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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimerScheduleConfig extends AbstractModel {

    /**
    * cron配置
    */
    @SerializedName("Cron")
    @Expose
    private CronSchedule Cron;

    /**
    * 每日触发
    */
    @SerializedName("Daily")
    @Expose
    private DailySchedule Daily;

    /**
    * 固定间隔
    */
    @SerializedName("Interval")
    @Expose
    private IntervalSchedule Interval;

    /**
    * 仅手动
    */
    @SerializedName("ManualOnly")
    @Expose
    private ManualOnlySchedule ManualOnly;

    /**
    * 单次
    */
    @SerializedName("Once")
    @Expose
    private OnceSchedule Once;

    /**
    * 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 |  |
| 1 | 仅手动 |
| 2 | 每天 |
| 3 | 每周 |
| 4 | 按间隔 |
| 5 | 一次性 |
| 6 | Cron |
    */
    @SerializedName("ScheduleType")
    @Expose
    private Long ScheduleType;

    /**
    * 时区
    */
    @SerializedName("Timezone")
    @Expose
    private String Timezone;

    /**
    * 每周固定时间触发
    */
    @SerializedName("Weekly")
    @Expose
    private WeeklySchedule Weekly;

    /**
     * Get cron配置 
     * @return Cron cron配置
     */
    public CronSchedule getCron() {
        return this.Cron;
    }

    /**
     * Set cron配置
     * @param Cron cron配置
     */
    public void setCron(CronSchedule Cron) {
        this.Cron = Cron;
    }

    /**
     * Get 每日触发 
     * @return Daily 每日触发
     */
    public DailySchedule getDaily() {
        return this.Daily;
    }

    /**
     * Set 每日触发
     * @param Daily 每日触发
     */
    public void setDaily(DailySchedule Daily) {
        this.Daily = Daily;
    }

    /**
     * Get 固定间隔 
     * @return Interval 固定间隔
     */
    public IntervalSchedule getInterval() {
        return this.Interval;
    }

    /**
     * Set 固定间隔
     * @param Interval 固定间隔
     */
    public void setInterval(IntervalSchedule Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 仅手动 
     * @return ManualOnly 仅手动
     */
    public ManualOnlySchedule getManualOnly() {
        return this.ManualOnly;
    }

    /**
     * Set 仅手动
     * @param ManualOnly 仅手动
     */
    public void setManualOnly(ManualOnlySchedule ManualOnly) {
        this.ManualOnly = ManualOnly;
    }

    /**
     * Get 单次 
     * @return Once 单次
     */
    public OnceSchedule getOnce() {
        return this.Once;
    }

    /**
     * Set 单次
     * @param Once 单次
     */
    public void setOnce(OnceSchedule Once) {
        this.Once = Once;
    }

    /**
     * Get 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 |  |
| 1 | 仅手动 |
| 2 | 每天 |
| 3 | 每周 |
| 4 | 按间隔 |
| 5 | 一次性 |
| 6 | Cron | 
     * @return ScheduleType 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 |  |
| 1 | 仅手动 |
| 2 | 每天 |
| 3 | 每周 |
| 4 | 按间隔 |
| 5 | 一次性 |
| 6 | Cron |
     */
    public Long getScheduleType() {
        return this.ScheduleType;
    }

    /**
     * Set 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 |  |
| 1 | 仅手动 |
| 2 | 每天 |
| 3 | 每周 |
| 4 | 按间隔 |
| 5 | 一次性 |
| 6 | Cron |
     * @param ScheduleType 
枚举值:
| uint | 描述 |
| --- | --- |
| 0 |  |
| 1 | 仅手动 |
| 2 | 每天 |
| 3 | 每周 |
| 4 | 按间隔 |
| 5 | 一次性 |
| 6 | Cron |
     */
    public void setScheduleType(Long ScheduleType) {
        this.ScheduleType = ScheduleType;
    }

    /**
     * Get 时区 
     * @return Timezone 时区
     */
    public String getTimezone() {
        return this.Timezone;
    }

    /**
     * Set 时区
     * @param Timezone 时区
     */
    public void setTimezone(String Timezone) {
        this.Timezone = Timezone;
    }

    /**
     * Get 每周固定时间触发 
     * @return Weekly 每周固定时间触发
     */
    public WeeklySchedule getWeekly() {
        return this.Weekly;
    }

    /**
     * Set 每周固定时间触发
     * @param Weekly 每周固定时间触发
     */
    public void setWeekly(WeeklySchedule Weekly) {
        this.Weekly = Weekly;
    }

    public TimerScheduleConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimerScheduleConfig(TimerScheduleConfig source) {
        if (source.Cron != null) {
            this.Cron = new CronSchedule(source.Cron);
        }
        if (source.Daily != null) {
            this.Daily = new DailySchedule(source.Daily);
        }
        if (source.Interval != null) {
            this.Interval = new IntervalSchedule(source.Interval);
        }
        if (source.ManualOnly != null) {
            this.ManualOnly = new ManualOnlySchedule(source.ManualOnly);
        }
        if (source.Once != null) {
            this.Once = new OnceSchedule(source.Once);
        }
        if (source.ScheduleType != null) {
            this.ScheduleType = new Long(source.ScheduleType);
        }
        if (source.Timezone != null) {
            this.Timezone = new String(source.Timezone);
        }
        if (source.Weekly != null) {
            this.Weekly = new WeeklySchedule(source.Weekly);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Cron.", this.Cron);
        this.setParamObj(map, prefix + "Daily.", this.Daily);
        this.setParamObj(map, prefix + "Interval.", this.Interval);
        this.setParamObj(map, prefix + "ManualOnly.", this.ManualOnly);
        this.setParamObj(map, prefix + "Once.", this.Once);
        this.setParamSimple(map, prefix + "ScheduleType", this.ScheduleType);
        this.setParamSimple(map, prefix + "Timezone", this.Timezone);
        this.setParamObj(map, prefix + "Weekly.", this.Weekly);

    }
}

