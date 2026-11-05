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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MaintenanceWindow extends AbstractModel {

    /**
    * <p>时区</p>
    */
    @SerializedName("TimeZone")
    @Expose
    private String TimeZone;

    /**
    * <p>星期</p>
    */
    @SerializedName("DayOfWeek")
    @Expose
    private Long DayOfWeek;

    /**
    * <p>开始时间</p><p>参数格式：hh:mm</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>结束时间</p><p>参数格式：hh:mm</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get <p>时区</p> 
     * @return TimeZone <p>时区</p>
     */
    public String getTimeZone() {
        return this.TimeZone;
    }

    /**
     * Set <p>时区</p>
     * @param TimeZone <p>时区</p>
     */
    public void setTimeZone(String TimeZone) {
        this.TimeZone = TimeZone;
    }

    /**
     * Get <p>星期</p> 
     * @return DayOfWeek <p>星期</p>
     */
    public Long getDayOfWeek() {
        return this.DayOfWeek;
    }

    /**
     * Set <p>星期</p>
     * @param DayOfWeek <p>星期</p>
     */
    public void setDayOfWeek(Long DayOfWeek) {
        this.DayOfWeek = DayOfWeek;
    }

    /**
     * Get <p>开始时间</p><p>参数格式：hh:mm</p> 
     * @return StartTime <p>开始时间</p><p>参数格式：hh:mm</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间</p><p>参数格式：hh:mm</p>
     * @param StartTime <p>开始时间</p><p>参数格式：hh:mm</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间</p><p>参数格式：hh:mm</p> 
     * @return EndTime <p>结束时间</p><p>参数格式：hh:mm</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间</p><p>参数格式：hh:mm</p>
     * @param EndTime <p>结束时间</p><p>参数格式：hh:mm</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public MaintenanceWindow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MaintenanceWindow(MaintenanceWindow source) {
        if (source.TimeZone != null) {
            this.TimeZone = new String(source.TimeZone);
        }
        if (source.DayOfWeek != null) {
            this.DayOfWeek = new Long(source.DayOfWeek);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeZone", this.TimeZone);
        this.setParamSimple(map, prefix + "DayOfWeek", this.DayOfWeek);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

