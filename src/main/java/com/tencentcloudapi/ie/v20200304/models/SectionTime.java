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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SectionTime extends AbstractModel {

    /**
    * 开始时间点，单位ms
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 时间区间时长，单位ms
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

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

    /**
     * Get 时间区间时长，单位ms 
     * @return Duration 时间区间时长，单位ms
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 时间区间时长，单位ms
     * @param Duration 时间区间时长，单位ms
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    public SectionTime() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SectionTime(SectionTime source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);

    }
}

