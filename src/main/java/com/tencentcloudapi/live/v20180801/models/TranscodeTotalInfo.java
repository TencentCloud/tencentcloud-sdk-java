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

public class TranscodeTotalInfo extends AbstractModel{

    /**
    * 时间点，北京时间，
示例：2019-03-01 00:00:00。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 转码时长，单位：分钟。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 编码方式，带模块，
示例：
liveprocessor_H264 =》直播转码-H264，
liveprocessor_H265 =》 直播转码-H265，
topspeed_H264 =》极速高清-H264，
topspeed_H265 =》极速高清-H265。
    */
    @SerializedName("ModuleCodec")
    @Expose
    private String ModuleCodec;

    /**
    * 分辨率，
示例：540*480。
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
     * Get 时间点，北京时间，
示例：2019-03-01 00:00:00。 
     * @return Time 时间点，北京时间，
示例：2019-03-01 00:00:00。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 时间点，北京时间，
示例：2019-03-01 00:00:00。
     * @param Time 时间点，北京时间，
示例：2019-03-01 00:00:00。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 转码时长，单位：分钟。 
     * @return Duration 转码时长，单位：分钟。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 转码时长，单位：分钟。
     * @param Duration 转码时长，单位：分钟。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 编码方式，带模块，
示例：
liveprocessor_H264 =》直播转码-H264，
liveprocessor_H265 =》 直播转码-H265，
topspeed_H264 =》极速高清-H264，
topspeed_H265 =》极速高清-H265。 
     * @return ModuleCodec 编码方式，带模块，
示例：
liveprocessor_H264 =》直播转码-H264，
liveprocessor_H265 =》 直播转码-H265，
topspeed_H264 =》极速高清-H264，
topspeed_H265 =》极速高清-H265。
     */
    public String getModuleCodec() {
        return this.ModuleCodec;
    }

    /**
     * Set 编码方式，带模块，
示例：
liveprocessor_H264 =》直播转码-H264，
liveprocessor_H265 =》 直播转码-H265，
topspeed_H264 =》极速高清-H264，
topspeed_H265 =》极速高清-H265。
     * @param ModuleCodec 编码方式，带模块，
示例：
liveprocessor_H264 =》直播转码-H264，
liveprocessor_H265 =》 直播转码-H265，
topspeed_H264 =》极速高清-H264，
topspeed_H265 =》极速高清-H265。
     */
    public void setModuleCodec(String ModuleCodec) {
        this.ModuleCodec = ModuleCodec;
    }

    /**
     * Get 分辨率，
示例：540*480。 
     * @return Resolution 分辨率，
示例：540*480。
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set 分辨率，
示例：540*480。
     * @param Resolution 分辨率，
示例：540*480。
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    public TranscodeTotalInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranscodeTotalInfo(TranscodeTotalInfo source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.ModuleCodec != null) {
            this.ModuleCodec = new String(source.ModuleCodec);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "ModuleCodec", this.ModuleCodec);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);

    }
}

