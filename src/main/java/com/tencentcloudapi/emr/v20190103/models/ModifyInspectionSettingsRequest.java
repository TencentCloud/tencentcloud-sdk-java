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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInspectionSettingsRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 巡检类型，FixedTime/RealTime
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 任务配置
    */
    @SerializedName("Settings")
    @Expose
    private InspectionTaskSettings [] Settings;

    /**
    * 开始时间戳
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间戳
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 巡检周期，eg EveryDay EveryWeek EveryMonth
    */
    @SerializedName("Strategy")
    @Expose
    private String Strategy;

    /**
    * 每天的开始的时间
    */
    @SerializedName("Clock")
    @Expose
    private String Clock;

    /**
    * 每周的周几
    */
    @SerializedName("DayOfWeek")
    @Expose
    private String DayOfWeek;

    /**
    * 每月的第几号
    */
    @SerializedName("DayOfMonth")
    @Expose
    private String DayOfMonth;

    /**
    * 巡检作业Id
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 巡检类型，FixedTime/RealTime 
     * @return Type 巡检类型，FixedTime/RealTime
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 巡检类型，FixedTime/RealTime
     * @param Type 巡检类型，FixedTime/RealTime
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 任务配置 
     * @return Settings 任务配置
     */
    public InspectionTaskSettings [] getSettings() {
        return this.Settings;
    }

    /**
     * Set 任务配置
     * @param Settings 任务配置
     */
    public void setSettings(InspectionTaskSettings [] Settings) {
        this.Settings = Settings;
    }

    /**
     * Get 开始时间戳 
     * @return StartTime 开始时间戳
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间戳
     * @param StartTime 开始时间戳
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间戳 
     * @return EndTime 结束时间戳
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间戳
     * @param EndTime 结束时间戳
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 巡检周期，eg EveryDay EveryWeek EveryMonth 
     * @return Strategy 巡检周期，eg EveryDay EveryWeek EveryMonth
     */
    public String getStrategy() {
        return this.Strategy;
    }

    /**
     * Set 巡检周期，eg EveryDay EveryWeek EveryMonth
     * @param Strategy 巡检周期，eg EveryDay EveryWeek EveryMonth
     */
    public void setStrategy(String Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get 每天的开始的时间 
     * @return Clock 每天的开始的时间
     */
    public String getClock() {
        return this.Clock;
    }

    /**
     * Set 每天的开始的时间
     * @param Clock 每天的开始的时间
     */
    public void setClock(String Clock) {
        this.Clock = Clock;
    }

    /**
     * Get 每周的周几 
     * @return DayOfWeek 每周的周几
     */
    public String getDayOfWeek() {
        return this.DayOfWeek;
    }

    /**
     * Set 每周的周几
     * @param DayOfWeek 每周的周几
     */
    public void setDayOfWeek(String DayOfWeek) {
        this.DayOfWeek = DayOfWeek;
    }

    /**
     * Get 每月的第几号 
     * @return DayOfMonth 每月的第几号
     */
    public String getDayOfMonth() {
        return this.DayOfMonth;
    }

    /**
     * Set 每月的第几号
     * @param DayOfMonth 每月的第几号
     */
    public void setDayOfMonth(String DayOfMonth) {
        this.DayOfMonth = DayOfMonth;
    }

    /**
     * Get 巡检作业Id 
     * @return JobId 巡检作业Id
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 巡检作业Id
     * @param JobId 巡检作业Id
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    public ModifyInspectionSettingsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInspectionSettingsRequest(ModifyInspectionSettingsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Settings != null) {
            this.Settings = new InspectionTaskSettings[source.Settings.length];
            for (int i = 0; i < source.Settings.length; i++) {
                this.Settings[i] = new InspectionTaskSettings(source.Settings[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.Strategy != null) {
            this.Strategy = new String(source.Strategy);
        }
        if (source.Clock != null) {
            this.Clock = new String(source.Clock);
        }
        if (source.DayOfWeek != null) {
            this.DayOfWeek = new String(source.DayOfWeek);
        }
        if (source.DayOfMonth != null) {
            this.DayOfMonth = new String(source.DayOfMonth);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Settings.", this.Settings);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "Clock", this.Clock);
        this.setParamSimple(map, prefix + "DayOfWeek", this.DayOfWeek);
        this.setParamSimple(map, prefix + "DayOfMonth", this.DayOfMonth);
        this.setParamSimple(map, prefix + "JobId", this.JobId);

    }
}

