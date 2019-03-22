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

public class TranscodeDetailInfo  extends AbstractModel{

    /**
    * 流名称。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 开始时间，北京时间，
格式：yyyy-mm-dd HH:MM。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，北京时间，
格式：yyyy-mm-dd HH:MM。
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
    private Integer Duration;

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
    * 码率。
    */
    @SerializedName("Bitrate")
    @Expose
    private Integer Bitrate;

    /**
    * 类型，包含：转码(Transcode)，混流(MixStream)，水印(WaterMark)。
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
     * 获取流名称。
     * @return StreamName 流名称。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * 设置流名称。
     * @param StreamName 流名称。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * 获取开始时间，北京时间，
格式：yyyy-mm-dd HH:MM。
     * @return StartTime 开始时间，北京时间，
格式：yyyy-mm-dd HH:MM。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置开始时间，北京时间，
格式：yyyy-mm-dd HH:MM。
     * @param StartTime 开始时间，北京时间，
格式：yyyy-mm-dd HH:MM。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取结束时间，北京时间，
格式：yyyy-mm-dd HH:MM。
     * @return EndTime 结束时间，北京时间，
格式：yyyy-mm-dd HH:MM。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置结束时间，北京时间，
格式：yyyy-mm-dd HH:MM。
     * @param EndTime 结束时间，北京时间，
格式：yyyy-mm-dd HH:MM。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取转码时长，单位：分钟。
注意：因推流过程中可能有中断重推情况，此处时长为真实转码时长累加值，并非结束时间和开始时间的间隔。
     * @return Duration 转码时长，单位：分钟。
注意：因推流过程中可能有中断重推情况，此处时长为真实转码时长累加值，并非结束时间和开始时间的间隔。
     */
    public Integer getDuration() {
        return this.Duration;
    }

    /**
     * 设置转码时长，单位：分钟。
注意：因推流过程中可能有中断重推情况，此处时长为真实转码时长累加值，并非结束时间和开始时间的间隔。
     * @param Duration 转码时长，单位：分钟。
注意：因推流过程中可能有中断重推情况，此处时长为真实转码时长累加值，并非结束时间和开始时间的间隔。
     */
    public void setDuration(Integer Duration) {
        this.Duration = Duration;
    }

    /**
     * 获取编码方式，带模块，
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
     * 设置编码方式，带模块，
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
     * 获取码率。
     * @return Bitrate 码率。
     */
    public Integer getBitrate() {
        return this.Bitrate;
    }

    /**
     * 设置码率。
     * @param Bitrate 码率。
     */
    public void setBitrate(Integer Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * 获取类型，包含：转码(Transcode)，混流(MixStream)，水印(WaterMark)。
     * @return Type 类型，包含：转码(Transcode)，混流(MixStream)，水印(WaterMark)。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置类型，包含：转码(Transcode)，混流(MixStream)，水印(WaterMark)。
     * @param Type 类型，包含：转码(Transcode)，混流(MixStream)，水印(WaterMark)。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 获取推流域名。
     * @return PushDomain 推流域名。
     */
    public String getPushDomain() {
        return this.PushDomain;
    }

    /**
     * 设置推流域名。
     * @param PushDomain 推流域名。
     */
    public void setPushDomain(String PushDomain) {
        this.PushDomain = PushDomain;
    }

    /**
     * 内部实现，用户禁止调用
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

    }
}

