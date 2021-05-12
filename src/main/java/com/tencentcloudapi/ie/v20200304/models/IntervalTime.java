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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntervalTime extends AbstractModel{

    /**
    * 间隔周期，单位ms
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 开始时间点，单位ms
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
     * Get 间隔周期，单位ms 
     * @return Interval 间隔周期，单位ms
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * Set 间隔周期，单位ms
     * @param Interval 间隔周期，单位ms
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * Get 开始时间点，单位ms 
     * @return StartTime 开始时间点，单位ms
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间点，单位ms
     * @param StartTime 开始时间点，单位ms
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    public IntervalTime() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntervalTime(IntervalTime source) {
        if (source.Interval != null) {
            this.Interval = new Long(source.Interval);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);

    }
}

