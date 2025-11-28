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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyGlobalMaintenanceWindowAndExclusionsRequest extends AbstractModel {

    /**
    * 维护窗口ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 地域
    */
    @SerializedName("TargetRegions")
    @Expose
    private String [] TargetRegions;

    /**
    * 维护开始时间
    */
    @SerializedName("MaintenanceTime")
    @Expose
    private String MaintenanceTime;

    /**
    * 维护时长（小时）
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 维护周期（一周中的哪几天）
    */
    @SerializedName("DayOfWeek")
    @Expose
    private String [] DayOfWeek;

    /**
    * 维护排除项
    */
    @SerializedName("Exclusions")
    @Expose
    private MaintenanceExclusion [] Exclusions;

    /**
     * Get 维护窗口ID 
     * @return ID 维护窗口ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 维护窗口ID
     * @param ID 维护窗口ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 地域 
     * @return TargetRegions 地域
     */
    public String [] getTargetRegions() {
        return this.TargetRegions;
    }

    /**
     * Set 地域
     * @param TargetRegions 地域
     */
    public void setTargetRegions(String [] TargetRegions) {
        this.TargetRegions = TargetRegions;
    }

    /**
     * Get 维护开始时间 
     * @return MaintenanceTime 维护开始时间
     */
    public String getMaintenanceTime() {
        return this.MaintenanceTime;
    }

    /**
     * Set 维护开始时间
     * @param MaintenanceTime 维护开始时间
     */
    public void setMaintenanceTime(String MaintenanceTime) {
        this.MaintenanceTime = MaintenanceTime;
    }

    /**
     * Get 维护时长（小时） 
     * @return Duration 维护时长（小时）
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 维护时长（小时）
     * @param Duration 维护时长（小时）
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 维护周期（一周中的哪几天） 
     * @return DayOfWeek 维护周期（一周中的哪几天）
     */
    public String [] getDayOfWeek() {
        return this.DayOfWeek;
    }

    /**
     * Set 维护周期（一周中的哪几天）
     * @param DayOfWeek 维护周期（一周中的哪几天）
     */
    public void setDayOfWeek(String [] DayOfWeek) {
        this.DayOfWeek = DayOfWeek;
    }

    /**
     * Get 维护排除项 
     * @return Exclusions 维护排除项
     */
    public MaintenanceExclusion [] getExclusions() {
        return this.Exclusions;
    }

    /**
     * Set 维护排除项
     * @param Exclusions 维护排除项
     */
    public void setExclusions(MaintenanceExclusion [] Exclusions) {
        this.Exclusions = Exclusions;
    }

    public ModifyGlobalMaintenanceWindowAndExclusionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyGlobalMaintenanceWindowAndExclusionsRequest(ModifyGlobalMaintenanceWindowAndExclusionsRequest source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.TargetRegions != null) {
            this.TargetRegions = new String[source.TargetRegions.length];
            for (int i = 0; i < source.TargetRegions.length; i++) {
                this.TargetRegions[i] = new String(source.TargetRegions[i]);
            }
        }
        if (source.MaintenanceTime != null) {
            this.MaintenanceTime = new String(source.MaintenanceTime);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.DayOfWeek != null) {
            this.DayOfWeek = new String[source.DayOfWeek.length];
            for (int i = 0; i < source.DayOfWeek.length; i++) {
                this.DayOfWeek[i] = new String(source.DayOfWeek[i]);
            }
        }
        if (source.Exclusions != null) {
            this.Exclusions = new MaintenanceExclusion[source.Exclusions.length];
            for (int i = 0; i < source.Exclusions.length; i++) {
                this.Exclusions[i] = new MaintenanceExclusion(source.Exclusions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamArraySimple(map, prefix + "TargetRegions.", this.TargetRegions);
        this.setParamSimple(map, prefix + "MaintenanceTime", this.MaintenanceTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamArraySimple(map, prefix + "DayOfWeek.", this.DayOfWeek);
        this.setParamArrayObj(map, prefix + "Exclusions.", this.Exclusions);

    }
}

