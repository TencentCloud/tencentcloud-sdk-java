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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TranscodeDetailInfo extends AbstractModel {

    /**
    * 流名称。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 开始时间（北京时间），格式：yyyy-mm-dd HH:MM。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间（北京时间），格式：yyyy-mm-dd HH:MM。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 转码时长，单位：分钟。
注意：因推流过程中可能有中断重推情况，此处时长为真实转码时长累加值，并非结束时间和开始时间的间隔。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 编码方式，带模块，
示例：
liveprocessor_ACC:  音频转码，
liveprocessor_H264：直播转码-H264，
liveprocessor_H265： 直播转码-H265，
topspeed_H264：极速高清-H264，
topspeed_H265：极速高清-H265。
    */
    @SerializedName("ModuleCodec")
    @Expose
    private String ModuleCodec;

    /**
    * 码率。
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 类型，包含：转码（Transcode），混流（MixStream），水印（WaterMark），快直播（Webrtc）。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 推流域名。
    */
    @SerializedName("PushDomain")
    @Expose
    private String PushDomain;

    /**
    * 分辨率。
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * 地域：
Mainland：国内。
Overseas：海外。
    */
    @SerializedName("MainlandOrOversea")
    @Expose
    private String MainlandOrOversea;

    /**
     * Get 流名称。 
     * @return StreamName 流名称。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set 流名称。
     * @param StreamName 流名称。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get 开始时间（北京时间），格式：yyyy-mm-dd HH:MM。 
     * @return StartTime 开始时间（北京时间），格式：yyyy-mm-dd HH:MM。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间（北京时间），格式：yyyy-mm-dd HH:MM。
     * @param StartTime 开始时间（北京时间），格式：yyyy-mm-dd HH:MM。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间（北京时间），格式：yyyy-mm-dd HH:MM。 
     * @return EndTime 结束时间（北京时间），格式：yyyy-mm-dd HH:MM。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间（北京时间），格式：yyyy-mm-dd HH:MM。
     * @param EndTime 结束时间（北京时间），格式：yyyy-mm-dd HH:MM。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 转码时长，单位：分钟。
注意：因推流过程中可能有中断重推情况，此处时长为真实转码时长累加值，并非结束时间和开始时间的间隔。 
     * @return Duration 转码时长，单位：分钟。
注意：因推流过程中可能有中断重推情况，此处时长为真实转码时长累加值，并非结束时间和开始时间的间隔。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 转码时长，单位：分钟。
注意：因推流过程中可能有中断重推情况，此处时长为真实转码时长累加值，并非结束时间和开始时间的间隔。
     * @param Duration 转码时长，单位：分钟。
注意：因推流过程中可能有中断重推情况，此处时长为真实转码时长累加值，并非结束时间和开始时间的间隔。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 编码方式，带模块，
示例：
liveprocessor_ACC:  音频转码，
liveprocessor_H264：直播转码-H264，
liveprocessor_H265： 直播转码-H265，
topspeed_H264：极速高清-H264，
topspeed_H265：极速高清-H265。 
     * @return ModuleCodec 编码方式，带模块，
示例：
liveprocessor_ACC:  音频转码，
liveprocessor_H264：直播转码-H264，
liveprocessor_H265： 直播转码-H265，
topspeed_H264：极速高清-H264，
topspeed_H265：极速高清-H265。
     */
    public String getModuleCodec() {
        return this.ModuleCodec;
    }

    /**
     * Set 编码方式，带模块，
示例：
liveprocessor_ACC:  音频转码，
liveprocessor_H264：直播转码-H264，
liveprocessor_H265： 直播转码-H265，
topspeed_H264：极速高清-H264，
topspeed_H265：极速高清-H265。
     * @param ModuleCodec 编码方式，带模块，
示例：
liveprocessor_ACC:  音频转码，
liveprocessor_H264：直播转码-H264，
liveprocessor_H265： 直播转码-H265，
topspeed_H264：极速高清-H264，
topspeed_H265：极速高清-H265。
     */
    public void setModuleCodec(String ModuleCodec) {
        this.ModuleCodec = ModuleCodec;
    }

    /**
     * Get 码率。 
     * @return Bitrate 码率。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 码率。
     * @param Bitrate 码率。
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get 类型，包含：转码（Transcode），混流（MixStream），水印（WaterMark），快直播（Webrtc）。 
     * @return Type 类型，包含：转码（Transcode），混流（MixStream），水印（WaterMark），快直播（Webrtc）。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型，包含：转码（Transcode），混流（MixStream），水印（WaterMark），快直播（Webrtc）。
     * @param Type 类型，包含：转码（Transcode），混流（MixStream），水印（WaterMark），快直播（Webrtc）。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 推流域名。 
     * @return PushDomain 推流域名。
     */
    public String getPushDomain() {
        return this.PushDomain;
    }

    /**
     * Set 推流域名。
     * @param PushDomain 推流域名。
     */
    public void setPushDomain(String PushDomain) {
        this.PushDomain = PushDomain;
    }

    /**
     * Get 分辨率。 
     * @return Resolution 分辨率。
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set 分辨率。
     * @param Resolution 分辨率。
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get 地域：
Mainland：国内。
Overseas：海外。 
     * @return MainlandOrOversea 地域：
Mainland：国内。
Overseas：海外。
     */
    public String getMainlandOrOversea() {
        return this.MainlandOrOversea;
    }

    /**
     * Set 地域：
Mainland：国内。
Overseas：海外。
     * @param MainlandOrOversea 地域：
Mainland：国内。
Overseas：海外。
     */
    public void setMainlandOrOversea(String MainlandOrOversea) {
        this.MainlandOrOversea = MainlandOrOversea;
    }

    public TranscodeDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranscodeDetailInfo(TranscodeDetailInfo source) {
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.ModuleCodec != null) {
            this.ModuleCodec = new String(source.ModuleCodec);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.PushDomain != null) {
            this.PushDomain = new String(source.PushDomain);
        }
        if (source.Resolution != null) {
            this.Resolution = new String(source.Resolution);
        }
        if (source.MainlandOrOversea != null) {
            this.MainlandOrOversea = new String(source.MainlandOrOversea);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "ModuleCodec", this.ModuleCodec);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "PushDomain", this.PushDomain);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "MainlandOrOversea", this.MainlandOrOversea);

    }
}

