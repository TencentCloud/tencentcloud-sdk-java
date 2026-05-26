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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MaintenanceWindowInfo extends AbstractModel {

    /**
    * 
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 
    */
    @SerializedName("WeekDays")
    @Expose
    private String [] WeekDays;

    /**
     * Get  
     * @return StartTime 
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 
     * @param StartTime 
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get  
     * @return Duration 
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 
     * @param Duration 
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get  
     * @return WeekDays 
     */
    public String [] getWeekDays() {
        return this.WeekDays;
    }

    /**
     * Set 
     * @param WeekDays 
     */
    public void setWeekDays(String [] WeekDays) {
        this.WeekDays = WeekDays;
    }

    public MaintenanceWindowInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MaintenanceWindowInfo(MaintenanceWindowInfo source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.WeekDays != null) {
            this.WeekDays = new String[source.WeekDays.length];
            for (int i = 0; i < source.WeekDays.length; i++) {
                this.WeekDays[i] = new String(source.WeekDays[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamArraySimple(map, prefix + "WeekDays.", this.WeekDays);

    }
}

