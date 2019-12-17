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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WatermarkCycleConfigForUpdate extends AbstractModel{

    /**
    * 水印在视频里第一次出现的播放时间点，单位：秒。
    */
    @SerializedName("StartTime")
    @Expose
    private Float StartTime;

    /**
    * 在一个水印周期内，水印显示的持续时间，单位：秒。
    */
    @SerializedName("DisplayDuration")
    @Expose
    private Float DisplayDuration;

    /**
    * 一个水印周期的持续时间，单位：秒。
填 0 表示水印只持续一个水印周期（即在整个视频里只显示 DisplayDuration 秒）。
    */
    @SerializedName("CycleDuration")
    @Expose
    private Float CycleDuration;

    /**
     * Get 水印在视频里第一次出现的播放时间点，单位：秒。 
     * @return StartTime 水印在视频里第一次出现的播放时间点，单位：秒。
     */
    public Float getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 水印在视频里第一次出现的播放时间点，单位：秒。
     * @param StartTime 水印在视频里第一次出现的播放时间点，单位：秒。
     */
    public void setStartTime(Float StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 在一个水印周期内，水印显示的持续时间，单位：秒。 
     * @return DisplayDuration 在一个水印周期内，水印显示的持续时间，单位：秒。
     */
    public Float getDisplayDuration() {
        return this.DisplayDuration;
    }

    /**
     * Set 在一个水印周期内，水印显示的持续时间，单位：秒。
     * @param DisplayDuration 在一个水印周期内，水印显示的持续时间，单位：秒。
     */
    public void setDisplayDuration(Float DisplayDuration) {
        this.DisplayDuration = DisplayDuration;
    }

    /**
     * Get 一个水印周期的持续时间，单位：秒。
填 0 表示水印只持续一个水印周期（即在整个视频里只显示 DisplayDuration 秒）。 
     * @return CycleDuration 一个水印周期的持续时间，单位：秒。
填 0 表示水印只持续一个水印周期（即在整个视频里只显示 DisplayDuration 秒）。
     */
    public Float getCycleDuration() {
        return this.CycleDuration;
    }

    /**
     * Set 一个水印周期的持续时间，单位：秒。
填 0 表示水印只持续一个水印周期（即在整个视频里只显示 DisplayDuration 秒）。
     * @param CycleDuration 一个水印周期的持续时间，单位：秒。
填 0 表示水印只持续一个水印周期（即在整个视频里只显示 DisplayDuration 秒）。
     */
    public void setCycleDuration(Float CycleDuration) {
        this.CycleDuration = CycleDuration;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "DisplayDuration", this.DisplayDuration);
        this.setParamSimple(map, prefix + "CycleDuration", this.CycleDuration);

    }
}

