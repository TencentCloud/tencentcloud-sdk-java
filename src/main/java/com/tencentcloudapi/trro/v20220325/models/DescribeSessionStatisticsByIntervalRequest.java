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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSessionStatisticsByIntervalRequest extends AbstractModel {

    /**
    * <p>项目ID</p>
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * <p>统计时间间隔：hour|day|month</p>
    */
    @SerializedName("StatisticInterval")
    @Expose
    private String StatisticInterval;

    /**
    * <p>设备ID</p>
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * <p>起始时间，单位：秒</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>结束时间，单位：秒</p>
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get <p>项目ID</p> 
     * @return ProjectId <p>项目ID</p>
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set <p>项目ID</p>
     * @param ProjectId <p>项目ID</p>
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get <p>统计时间间隔：hour|day|month</p> 
     * @return StatisticInterval <p>统计时间间隔：hour|day|month</p>
     */
    public String getStatisticInterval() {
        return this.StatisticInterval;
    }

    /**
     * Set <p>统计时间间隔：hour|day|month</p>
     * @param StatisticInterval <p>统计时间间隔：hour|day|month</p>
     */
    public void setStatisticInterval(String StatisticInterval) {
        this.StatisticInterval = StatisticInterval;
    }

    /**
     * Get <p>设备ID</p> 
     * @return DeviceId <p>设备ID</p>
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set <p>设备ID</p>
     * @param DeviceId <p>设备ID</p>
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get <p>起始时间，单位：秒</p> 
     * @return StartTime <p>起始时间，单位：秒</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>起始时间，单位：秒</p>
     * @param StartTime <p>起始时间，单位：秒</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>结束时间，单位：秒</p> 
     * @return EndTime <p>结束时间，单位：秒</p>
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>结束时间，单位：秒</p>
     * @param EndTime <p>结束时间，单位：秒</p>
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeSessionStatisticsByIntervalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSessionStatisticsByIntervalRequest(DescribeSessionStatisticsByIntervalRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.StatisticInterval != null) {
            this.StatisticInterval = new String(source.StatisticInterval);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "StatisticInterval", this.StatisticInterval);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

