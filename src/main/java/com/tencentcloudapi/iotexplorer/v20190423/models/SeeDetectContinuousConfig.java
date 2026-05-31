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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SeeDetectContinuousConfig extends AbstractModel {

    /**
    * 检测标签。可选值：
- `person_motionless`：人物静止
    */
    @SerializedName("DetectType")
    @Expose
    private String DetectType;

    /**
    * 启用检测的按日周期起始时间分钟数。取值范围：0 ~ 1440
    */
    @SerializedName("DailyStartTime")
    @Expose
    private Long DailyStartTime;

    /**
    * 启用检测的按日周期结束时间分钟数。取值范围：0 ~ 1440
    */
    @SerializedName("DailyEndTime")
    @Expose
    private Long DailyEndTime;

    /**
    * 检测间隔分钟数。取值范围：5 ~ 60。
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
     * Get 检测标签。可选值：
- `person_motionless`：人物静止 
     * @return DetectType 检测标签。可选值：
- `person_motionless`：人物静止
     */
    public String getDetectType() {
        return this.DetectType;
    }

    /**
     * Set 检测标签。可选值：
- `person_motionless`：人物静止
     * @param DetectType 检测标签。可选值：
- `person_motionless`：人物静止
     */
    public void setDetectType(String DetectType) {
        this.DetectType = DetectType;
    }

    /**
     * Get 启用检测的按日周期起始时间分钟数。取值范围：0 ~ 1440 
     * @return DailyStartTime 启用检测的按日周期起始时间分钟数。取值范围：0 ~ 1440
     */
    public Long getDailyStartTime() {
        return this.DailyStartTime;
    }

    /**
     * Set 启用检测的按日周期起始时间分钟数。取值范围：0 ~ 1440
     * @param DailyStartTime 启用检测的按日周期起始时间分钟数。取值范围：0 ~ 1440
     */
    public void setDailyStartTime(Long DailyStartTime) {
        this.DailyStartTime = DailyStartTime;
    }

    /**
     * Get 启用检测的按日周期结束时间分钟数。取值范围：0 ~ 1440 
     * @return DailyEndTime 启用检测的按日周期结束时间分钟数。取值范围：0 ~ 1440
     */
    public Long getDailyEndTime() {
        return this.DailyEndTime;
    }

    /**
     * Set 启用检测的按日周期结束时间分钟数。取值范围：0 ~ 1440
     * @param DailyEndTime 启用检测的按日周期结束时间分钟数。取值范围：0 ~ 1440
     */
    public void setDailyEndTime(Long DailyEndTime) {
        this.DailyEndTime = DailyEndTime;
    }

    /**
     * Get 检测间隔分钟数。取值范围：5 ~ 60。 
     * @return Interval 检测间隔分钟数。取值范围：5 ~ 60。
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 检测间隔分钟数。取值范围：5 ~ 60。
     * @param Interval 检测间隔分钟数。取值范围：5 ~ 60。
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    public SeeDetectContinuousConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SeeDetectContinuousConfig(SeeDetectContinuousConfig source) {
        if (source.DetectType != null) {
            this.DetectType = new String(source.DetectType);
        }
        if (source.DailyStartTime != null) {
            this.DailyStartTime = new Long(source.DailyStartTime);
        }
        if (source.DailyEndTime != null) {
            this.DailyEndTime = new Long(source.DailyEndTime);
        }
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DetectType", this.DetectType);
        this.setParamSimple(map, prefix + "DailyStartTime", this.DailyStartTime);
        this.setParamSimple(map, prefix + "DailyEndTime", this.DailyEndTime);
        this.setParamSimple(map, prefix + "Interval", this.Interval);

    }
}

