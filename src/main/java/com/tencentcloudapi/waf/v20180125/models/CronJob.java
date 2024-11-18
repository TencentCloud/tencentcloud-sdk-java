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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CronJob extends AbstractModel {

    /**
    * 每个月的几号执行
    */
    @SerializedName("Days")
    @Expose
    private Long [] Days;

    /**
    * 每个星期的星期几执行
    */
    @SerializedName("WDays")
    @Expose
    private Long [] WDays;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 每个月的几号执行 
     * @return Days 每个月的几号执行
     */
    public Long [] getDays() {
        return this.Days;
    }

    /**
     * Set 每个月的几号执行
     * @param Days 每个月的几号执行
     */
    public void setDays(Long [] Days) {
        this.Days = Days;
    }

    /**
     * Get 每个星期的星期几执行 
     * @return WDays 每个星期的星期几执行
     */
    public Long [] getWDays() {
        return this.WDays;
    }

    /**
     * Set 每个星期的星期几执行
     * @param WDays 每个星期的星期几执行
     */
    public void setWDays(Long [] WDays) {
        this.WDays = WDays;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间 
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public CronJob() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CronJob(CronJob source) {
        if (source.Days != null) {
            this.Days = new Long[source.Days.length];
            for (int i = 0; i < source.Days.length; i++) {
                this.Days[i] = new Long(source.Days[i]);
            }
        }
        if (source.WDays != null) {
            this.WDays = new Long[source.WDays.length];
            for (int i = 0; i < source.WDays.length; i++) {
                this.WDays[i] = new Long(source.WDays[i]);
            }
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
        this.setParamArraySimple(map, prefix + "Days.", this.Days);
        this.setParamArraySimple(map, prefix + "WDays.", this.WDays);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

