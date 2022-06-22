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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimeShiftBillData extends AbstractModel{

    /**
    * 推流域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 时移文件时长，单位分钟。
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 时移配置天数，单位天。
    */
    @SerializedName("StoragePeriod")
    @Expose
    private Float StoragePeriod;

    /**
    * 时间点，格式: yyyy-mm-ddTHH:MM:SSZ。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 时移总时长，单位分钟。
    */
    @SerializedName("TotalDuration")
    @Expose
    private Float TotalDuration;

    /**
     * Get 推流域名。 
     * @return Domain 推流域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 推流域名。
     * @param Domain 推流域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 时移文件时长，单位分钟。 
     * @return Duration 时移文件时长，单位分钟。
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set 时移文件时长，单位分钟。
     * @param Duration 时移文件时长，单位分钟。
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 时移配置天数，单位天。 
     * @return StoragePeriod 时移配置天数，单位天。
     */
    public Float getStoragePeriod() {
        return this.StoragePeriod;
    }

    /**
     * Set 时移配置天数，单位天。
     * @param StoragePeriod 时移配置天数，单位天。
     */
    public void setStoragePeriod(Float StoragePeriod) {
        this.StoragePeriod = StoragePeriod;
    }

    /**
     * Get 时间点，格式: yyyy-mm-ddTHH:MM:SSZ。 
     * @return Time 时间点，格式: yyyy-mm-ddTHH:MM:SSZ。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 时间点，格式: yyyy-mm-ddTHH:MM:SSZ。
     * @param Time 时间点，格式: yyyy-mm-ddTHH:MM:SSZ。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 时移总时长，单位分钟。 
     * @return TotalDuration 时移总时长，单位分钟。
     */
    public Float getTotalDuration() {
        return this.TotalDuration;
    }

    /**
     * Set 时移总时长，单位分钟。
     * @param TotalDuration 时移总时长，单位分钟。
     */
    public void setTotalDuration(Float TotalDuration) {
        this.TotalDuration = TotalDuration;
    }

    public TimeShiftBillData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimeShiftBillData(TimeShiftBillData source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.StoragePeriod != null) {
            this.StoragePeriod = new Float(source.StoragePeriod);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.TotalDuration != null) {
            this.TotalDuration = new Float(source.TotalDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "StoragePeriod", this.StoragePeriod);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "TotalDuration", this.TotalDuration);

    }
}

