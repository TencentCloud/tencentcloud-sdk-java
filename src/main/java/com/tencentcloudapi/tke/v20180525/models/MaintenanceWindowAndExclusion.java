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

public class MaintenanceWindowAndExclusion extends AbstractModel {

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
    * 集群ID
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * 维护周期（一周中的哪几天）
    */
    @SerializedName("DayOfWeek")
    @Expose
    private String [] DayOfWeek;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 集群版本
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * 排除项
    */
    @SerializedName("Exclusions")
    @Expose
    private MaintenanceExclusion [] Exclusions;

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
     * Get 集群ID 
     * @return ClusterID 集群ID
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set 集群ID
     * @param ClusterID 集群ID
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
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
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 集群版本 
     * @return ClusterVersion 集群版本
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set 集群版本
     * @param ClusterVersion 集群版本
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get 排除项 
     * @return Exclusions 排除项
     */
    public MaintenanceExclusion [] getExclusions() {
        return this.Exclusions;
    }

    /**
     * Set 排除项
     * @param Exclusions 排除项
     */
    public void setExclusions(MaintenanceExclusion [] Exclusions) {
        this.Exclusions = Exclusions;
    }

    public MaintenanceWindowAndExclusion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MaintenanceWindowAndExclusion(MaintenanceWindowAndExclusion source) {
        if (source.MaintenanceTime != null) {
            this.MaintenanceTime = new String(source.MaintenanceTime);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.DayOfWeek != null) {
            this.DayOfWeek = new String[source.DayOfWeek.length];
            for (int i = 0; i < source.DayOfWeek.length; i++) {
                this.DayOfWeek[i] = new String(source.DayOfWeek[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
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
        this.setParamSimple(map, prefix + "MaintenanceTime", this.MaintenanceTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamArraySimple(map, prefix + "DayOfWeek.", this.DayOfWeek);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamArrayObj(map, prefix + "Exclusions.", this.Exclusions);

    }
}

