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

public class PushQualityData extends AbstractModel{

    /**
    * 数据时间，格式: %Y-%m-%d %H:%M:%S.%ms，精确到毫秒级。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 推流域名。
    */
    @SerializedName("PushDomain")
    @Expose
    private String PushDomain;

    /**
    * 推流路径。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 推流客户端 IP。
    */
    @SerializedName("ClientIp")
    @Expose
    private String ClientIp;

    /**
    * 开始推流时间，格式: %Y-%m-%d %H:%M:%S.%ms，精确到毫秒级。
    */
    @SerializedName("BeginPushTime")
    @Expose
    private String BeginPushTime;

    /**
    * 分辨率信息。
    */
    @SerializedName("Resolution")
    @Expose
    private String Resolution;

    /**
    * 视频编码格式。
    */
    @SerializedName("VCodec")
    @Expose
    private String VCodec;

    /**
    * 音频编码格式。
    */
    @SerializedName("ACodec")
    @Expose
    private String ACodec;

    /**
    * 推流序列号，用来唯一的标志一次推流。
    */
    @SerializedName("Sequence")
    @Expose
    private String Sequence;

    /**
    * 视频帧率。
    */
    @SerializedName("VideoFps")
    @Expose
    private Long VideoFps;

    /**
    * 视频码率，单位: bps。
    */
    @SerializedName("VideoRate")
    @Expose
    private Long VideoRate;

    /**
    * 音频帧率。
    */
    @SerializedName("AudioFps")
    @Expose
    private Long AudioFps;

    /**
    * 音频码率，单位: bps。
    */
    @SerializedName("AudioRate")
    @Expose
    private Long AudioRate;

    /**
    * 本地流逝时间，单位: ms，音视频流逝时间与本地流逝时间的差距越大表示推流质量越差，上行卡顿越严重。
    */
    @SerializedName("LocalTs")
    @Expose
    private Long LocalTs;

    /**
    * 视频流逝时间，单位: ms。
    */
    @SerializedName("VideoTs")
    @Expose
    private Long VideoTs;

    /**
    * 音频流逝时间，单位: ms。
    */
    @SerializedName("AudioTs")
    @Expose
    private Long AudioTs;

    /**
    * metadata 中的视频码率，单位: kbps。
    */
    @SerializedName("MetaVideoRate")
    @Expose
    private Long MetaVideoRate;

    /**
    * metadata 中的音频码率，单位: kbps。
    */
    @SerializedName("MetaAudioRate")
    @Expose
    private Long MetaAudioRate;

    /**
    * metadata 中的帧率。
    */
    @SerializedName("MateFps")
    @Expose
    private Long MateFps;

    /**
     * Get 数据时间，格式: %Y-%m-%d %H:%M:%S.%ms，精确到毫秒级。 
     * @return Time 数据时间，格式: %Y-%m-%d %H:%M:%S.%ms，精确到毫秒级。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 数据时间，格式: %Y-%m-%d %H:%M:%S.%ms，精确到毫秒级。
     * @param Time 数据时间，格式: %Y-%m-%d %H:%M:%S.%ms，精确到毫秒级。
     */
    public void setTime(String Time) {
        this.Time = Time;
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
     * Get 推流路径。 
     * @return AppName 推流路径。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 推流路径。
     * @param AppName 推流路径。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get 推流客户端 IP。 
     * @return ClientIp 推流客户端 IP。
     */
    public String getClientIp() {
        return this.ClientIp;
    }

    /**
     * Set 推流客户端 IP。
     * @param ClientIp 推流客户端 IP。
     */
    public void setClientIp(String ClientIp) {
        this.ClientIp = ClientIp;
    }

    /**
     * Get 开始推流时间，格式: %Y-%m-%d %H:%M:%S.%ms，精确到毫秒级。 
     * @return BeginPushTime 开始推流时间，格式: %Y-%m-%d %H:%M:%S.%ms，精确到毫秒级。
     */
    public String getBeginPushTime() {
        return this.BeginPushTime;
    }

    /**
     * Set 开始推流时间，格式: %Y-%m-%d %H:%M:%S.%ms，精确到毫秒级。
     * @param BeginPushTime 开始推流时间，格式: %Y-%m-%d %H:%M:%S.%ms，精确到毫秒级。
     */
    public void setBeginPushTime(String BeginPushTime) {
        this.BeginPushTime = BeginPushTime;
    }

    /**
     * Get 分辨率信息。 
     * @return Resolution 分辨率信息。
     */
    public String getResolution() {
        return this.Resolution;
    }

    /**
     * Set 分辨率信息。
     * @param Resolution 分辨率信息。
     */
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    /**
     * Get 视频编码格式。 
     * @return VCodec 视频编码格式。
     */
    public String getVCodec() {
        return this.VCodec;
    }

    /**
     * Set 视频编码格式。
     * @param VCodec 视频编码格式。
     */
    public void setVCodec(String VCodec) {
        this.VCodec = VCodec;
    }

    /**
     * Get 音频编码格式。 
     * @return ACodec 音频编码格式。
     */
    public String getACodec() {
        return this.ACodec;
    }

    /**
     * Set 音频编码格式。
     * @param ACodec 音频编码格式。
     */
    public void setACodec(String ACodec) {
        this.ACodec = ACodec;
    }

    /**
     * Get 推流序列号，用来唯一的标志一次推流。 
     * @return Sequence 推流序列号，用来唯一的标志一次推流。
     */
    public String getSequence() {
        return this.Sequence;
    }

    /**
     * Set 推流序列号，用来唯一的标志一次推流。
     * @param Sequence 推流序列号，用来唯一的标志一次推流。
     */
    public void setSequence(String Sequence) {
        this.Sequence = Sequence;
    }

    /**
     * Get 视频帧率。 
     * @return VideoFps 视频帧率。
     */
    public Long getVideoFps() {
        return this.VideoFps;
    }

    /**
     * Set 视频帧率。
     * @param VideoFps 视频帧率。
     */
    public void setVideoFps(Long VideoFps) {
        this.VideoFps = VideoFps;
    }

    /**
     * Get 视频码率，单位: bps。 
     * @return VideoRate 视频码率，单位: bps。
     */
    public Long getVideoRate() {
        return this.VideoRate;
    }

    /**
     * Set 视频码率，单位: bps。
     * @param VideoRate 视频码率，单位: bps。
     */
    public void setVideoRate(Long VideoRate) {
        this.VideoRate = VideoRate;
    }

    /**
     * Get 音频帧率。 
     * @return AudioFps 音频帧率。
     */
    public Long getAudioFps() {
        return this.AudioFps;
    }

    /**
     * Set 音频帧率。
     * @param AudioFps 音频帧率。
     */
    public void setAudioFps(Long AudioFps) {
        this.AudioFps = AudioFps;
    }

    /**
     * Get 音频码率，单位: bps。 
     * @return AudioRate 音频码率，单位: bps。
     */
    public Long getAudioRate() {
        return this.AudioRate;
    }

    /**
     * Set 音频码率，单位: bps。
     * @param AudioRate 音频码率，单位: bps。
     */
    public void setAudioRate(Long AudioRate) {
        this.AudioRate = AudioRate;
    }

    /**
     * Get 本地流逝时间，单位: ms，音视频流逝时间与本地流逝时间的差距越大表示推流质量越差，上行卡顿越严重。 
     * @return LocalTs 本地流逝时间，单位: ms，音视频流逝时间与本地流逝时间的差距越大表示推流质量越差，上行卡顿越严重。
     */
    public Long getLocalTs() {
        return this.LocalTs;
    }

    /**
     * Set 本地流逝时间，单位: ms，音视频流逝时间与本地流逝时间的差距越大表示推流质量越差，上行卡顿越严重。
     * @param LocalTs 本地流逝时间，单位: ms，音视频流逝时间与本地流逝时间的差距越大表示推流质量越差，上行卡顿越严重。
     */
    public void setLocalTs(Long LocalTs) {
        this.LocalTs = LocalTs;
    }

    /**
     * Get 视频流逝时间，单位: ms。 
     * @return VideoTs 视频流逝时间，单位: ms。
     */
    public Long getVideoTs() {
        return this.VideoTs;
    }

    /**
     * Set 视频流逝时间，单位: ms。
     * @param VideoTs 视频流逝时间，单位: ms。
     */
    public void setVideoTs(Long VideoTs) {
        this.VideoTs = VideoTs;
    }

    /**
     * Get 音频流逝时间，单位: ms。 
     * @return AudioTs 音频流逝时间，单位: ms。
     */
    public Long getAudioTs() {
        return this.AudioTs;
    }

    /**
     * Set 音频流逝时间，单位: ms。
     * @param AudioTs 音频流逝时间，单位: ms。
     */
    public void setAudioTs(Long AudioTs) {
        this.AudioTs = AudioTs;
    }

    /**
     * Get metadata 中的视频码率，单位: kbps。 
     * @return MetaVideoRate metadata 中的视频码率，单位: kbps。
     */
    public Long getMetaVideoRate() {
        return this.MetaVideoRate;
    }

    /**
     * Set metadata 中的视频码率，单位: kbps。
     * @param MetaVideoRate metadata 中的视频码率，单位: kbps。
     */
    public void setMetaVideoRate(Long MetaVideoRate) {
        this.MetaVideoRate = MetaVideoRate;
    }

    /**
     * Get metadata 中的音频码率，单位: kbps。 
     * @return MetaAudioRate metadata 中的音频码率，单位: kbps。
     */
    public Long getMetaAudioRate() {
        return this.MetaAudioRate;
    }

    /**
     * Set metadata 中的音频码率，单位: kbps。
     * @param MetaAudioRate metadata 中的音频码率，单位: kbps。
     */
    public void setMetaAudioRate(Long MetaAudioRate) {
        this.MetaAudioRate = MetaAudioRate;
    }

    /**
     * Get metadata 中的帧率。 
     * @return MateFps metadata 中的帧率。
     */
    public Long getMateFps() {
        return this.MateFps;
    }

    /**
     * Set metadata 中的帧率。
     * @param MateFps metadata 中的帧率。
     */
    public void setMateFps(Long MateFps) {
        this.MateFps = MateFps;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "PushDomain", this.PushDomain);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "ClientIp", this.ClientIp);
        this.setParamSimple(map, prefix + "BeginPushTime", this.BeginPushTime);
        this.setParamSimple(map, prefix + "Resolution", this.Resolution);
        this.setParamSimple(map, prefix + "VCodec", this.VCodec);
        this.setParamSimple(map, prefix + "ACodec", this.ACodec);
        this.setParamSimple(map, prefix + "Sequence", this.Sequence);
        this.setParamSimple(map, prefix + "VideoFps", this.VideoFps);
        this.setParamSimple(map, prefix + "VideoRate", this.VideoRate);
        this.setParamSimple(map, prefix + "AudioFps", this.AudioFps);
        this.setParamSimple(map, prefix + "AudioRate", this.AudioRate);
        this.setParamSimple(map, prefix + "LocalTs", this.LocalTs);
        this.setParamSimple(map, prefix + "VideoTs", this.VideoTs);
        this.setParamSimple(map, prefix + "AudioTs", this.AudioTs);
        this.setParamSimple(map, prefix + "MetaVideoRate", this.MetaVideoRate);
        this.setParamSimple(map, prefix + "MetaAudioRate", this.MetaAudioRate);
        this.setParamSimple(map, prefix + "MateFps", this.MateFps);

    }
}

