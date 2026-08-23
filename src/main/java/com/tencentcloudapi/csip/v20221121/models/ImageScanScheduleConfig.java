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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageScanScheduleConfig extends AbstractModel {

    /**
    * <p>周期类型</p><p>枚举值：</p><ul><li>DAILY： 每天</li><li>WEEKLY： 每周</li><li>MONTHLY： 每月</li></ul>
    */
    @SerializedName("CycleType")
    @Expose
    private String CycleType;

    /**
    * <p>具体日期。周类型时: 1-7 (周一到周日); 月类型时: 1-31; 日类型时不生效。</p>
    */
    @SerializedName("CycleDays")
    @Expose
    private Long [] CycleDays;

    /**
    * <p>扫描开始时间</p><p>参数格式：hh:mm</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>时区</p>
    */
    @SerializedName("Timezone")
    @Expose
    private String Timezone;

    /**
     * Get <p>周期类型</p><p>枚举值：</p><ul><li>DAILY： 每天</li><li>WEEKLY： 每周</li><li>MONTHLY： 每月</li></ul> 
     * @return CycleType <p>周期类型</p><p>枚举值：</p><ul><li>DAILY： 每天</li><li>WEEKLY： 每周</li><li>MONTHLY： 每月</li></ul>
     */
    public String getCycleType() {
        return this.CycleType;
    }

    /**
     * Set <p>周期类型</p><p>枚举值：</p><ul><li>DAILY： 每天</li><li>WEEKLY： 每周</li><li>MONTHLY： 每月</li></ul>
     * @param CycleType <p>周期类型</p><p>枚举值：</p><ul><li>DAILY： 每天</li><li>WEEKLY： 每周</li><li>MONTHLY： 每月</li></ul>
     */
    public void setCycleType(String CycleType) {
        this.CycleType = CycleType;
    }

    /**
     * Get <p>具体日期。周类型时: 1-7 (周一到周日); 月类型时: 1-31; 日类型时不生效。</p> 
     * @return CycleDays <p>具体日期。周类型时: 1-7 (周一到周日); 月类型时: 1-31; 日类型时不生效。</p>
     */
    public Long [] getCycleDays() {
        return this.CycleDays;
    }

    /**
     * Set <p>具体日期。周类型时: 1-7 (周一到周日); 月类型时: 1-31; 日类型时不生效。</p>
     * @param CycleDays <p>具体日期。周类型时: 1-7 (周一到周日); 月类型时: 1-31; 日类型时不生效。</p>
     */
    public void setCycleDays(Long [] CycleDays) {
        this.CycleDays = CycleDays;
    }

    /**
     * Get <p>扫描开始时间</p><p>参数格式：hh:mm</p> 
     * @return StartTime <p>扫描开始时间</p><p>参数格式：hh:mm</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>扫描开始时间</p><p>参数格式：hh:mm</p>
     * @param StartTime <p>扫描开始时间</p><p>参数格式：hh:mm</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>时区</p> 
     * @return Timezone <p>时区</p>
     */
    public String getTimezone() {
        return this.Timezone;
    }

    /**
     * Set <p>时区</p>
     * @param Timezone <p>时区</p>
     */
    public void setTimezone(String Timezone) {
        this.Timezone = Timezone;
    }

    public ImageScanScheduleConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageScanScheduleConfig(ImageScanScheduleConfig source) {
        if (source.CycleType != null) {
            this.CycleType = new String(source.CycleType);
        }
        if (source.CycleDays != null) {
            this.CycleDays = new Long[source.CycleDays.length];
            for (int i = 0; i < source.CycleDays.length; i++) {
                this.CycleDays[i] = new Long(source.CycleDays[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Timezone != null) {
            this.Timezone = new String(source.Timezone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CycleType", this.CycleType);
        this.setParamArraySimple(map, prefix + "CycleDays.", this.CycleDays);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Timezone", this.Timezone);

    }
}

