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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskDurationInfo extends AbstractModel {

    /**
    * 拉流转推任务的时间点
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 拉流转推任务的时长，单位为分钟
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 拉流转推任务的时长，单位为秒
    */
    @SerializedName("DurationSecond")
    @Expose
    private Long DurationSecond;

    /**
     * Get 拉流转推任务的时间点 
     * @return Time 拉流转推任务的时间点
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 拉流转推任务的时间点
     * @param Time 拉流转推任务的时间点
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 拉流转推任务的时长，单位为分钟 
     * @return Duration 拉流转推任务的时长，单位为分钟
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 拉流转推任务的时长，单位为分钟
     * @param Duration 拉流转推任务的时长，单位为分钟
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 拉流转推任务的时长，单位为秒 
     * @return DurationSecond 拉流转推任务的时长，单位为秒
     */
    public Long getDurationSecond() {
        return this.DurationSecond;
    }

    /**
     * Set 拉流转推任务的时长，单位为秒
     * @param DurationSecond 拉流转推任务的时长，单位为秒
     */
    public void setDurationSecond(Long DurationSecond) {
        this.DurationSecond = DurationSecond;
    }

    public TaskDurationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskDurationInfo(TaskDurationInfo source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.DurationSecond != null) {
            this.DurationSecond = new Long(source.DurationSecond);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "DurationSecond", this.DurationSecond);

    }
}

