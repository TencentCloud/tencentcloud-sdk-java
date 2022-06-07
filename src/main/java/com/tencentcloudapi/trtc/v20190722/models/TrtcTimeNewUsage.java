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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrtcTimeNewUsage extends AbstractModel{

    /**
    * 时间点。
    */
    @SerializedName("TimeKey")
    @Expose
    private String TimeKey;

    /**
    * 通话人数。仅供参考。在线人数以仪表盘查询结果为准。
    */
    @SerializedName("VoiceUserNum")
    @Expose
    private Long VoiceUserNum;

    /**
    * 音视频通话时长。单位：秒。
    */
    @SerializedName("VideoTime")
    @Expose
    private Long VideoTime;

    /**
    * 标清视频通话时长。单位：秒。
    */
    @SerializedName("Class1VideoTime")
    @Expose
    private Long Class1VideoTime;

    /**
    * 高清视频通话时长。单位：秒。
    */
    @SerializedName("Class2VideoTime")
    @Expose
    private Long Class2VideoTime;

    /**
    * 超高清视频通话时长。单位：秒。
    */
    @SerializedName("Class3VideoTime")
    @Expose
    private Long Class3VideoTime;

    /**
    * 音频通话时长。单位：秒。
    */
    @SerializedName("AudioTime")
    @Expose
    private Long AudioTime;

    /**
    * 带宽。单位：Mbps。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Float Bandwidth;

    /**
    * 2k视频通话时长。单位：秒。
    */
    @SerializedName("Video2KTime")
    @Expose
    private Long Video2KTime;

    /**
    * 4k视频通话时长。单位：秒。
    */
    @SerializedName("Video4KTime")
    @Expose
    private Long Video4KTime;

    /**
     * Get 时间点。 
     * @return TimeKey 时间点。
     */
    public String getTimeKey() {
        return this.TimeKey;
    }

    /**
     * Set 时间点。
     * @param TimeKey 时间点。
     */
    public void setTimeKey(String TimeKey) {
        this.TimeKey = TimeKey;
    }

    /**
     * Get 通话人数。仅供参考。在线人数以仪表盘查询结果为准。 
     * @return VoiceUserNum 通话人数。仅供参考。在线人数以仪表盘查询结果为准。
     */
    public Long getVoiceUserNum() {
        return this.VoiceUserNum;
    }

    /**
     * Set 通话人数。仅供参考。在线人数以仪表盘查询结果为准。
     * @param VoiceUserNum 通话人数。仅供参考。在线人数以仪表盘查询结果为准。
     */
    public void setVoiceUserNum(Long VoiceUserNum) {
        this.VoiceUserNum = VoiceUserNum;
    }

    /**
     * Get 音视频通话时长。单位：秒。 
     * @return VideoTime 音视频通话时长。单位：秒。
     */
    public Long getVideoTime() {
        return this.VideoTime;
    }

    /**
     * Set 音视频通话时长。单位：秒。
     * @param VideoTime 音视频通话时长。单位：秒。
     */
    public void setVideoTime(Long VideoTime) {
        this.VideoTime = VideoTime;
    }

    /**
     * Get 标清视频通话时长。单位：秒。 
     * @return Class1VideoTime 标清视频通话时长。单位：秒。
     */
    public Long getClass1VideoTime() {
        return this.Class1VideoTime;
    }

    /**
     * Set 标清视频通话时长。单位：秒。
     * @param Class1VideoTime 标清视频通话时长。单位：秒。
     */
    public void setClass1VideoTime(Long Class1VideoTime) {
        this.Class1VideoTime = Class1VideoTime;
    }

    /**
     * Get 高清视频通话时长。单位：秒。 
     * @return Class2VideoTime 高清视频通话时长。单位：秒。
     */
    public Long getClass2VideoTime() {
        return this.Class2VideoTime;
    }

    /**
     * Set 高清视频通话时长。单位：秒。
     * @param Class2VideoTime 高清视频通话时长。单位：秒。
     */
    public void setClass2VideoTime(Long Class2VideoTime) {
        this.Class2VideoTime = Class2VideoTime;
    }

    /**
     * Get 超高清视频通话时长。单位：秒。 
     * @return Class3VideoTime 超高清视频通话时长。单位：秒。
     */
    public Long getClass3VideoTime() {
        return this.Class3VideoTime;
    }

    /**
     * Set 超高清视频通话时长。单位：秒。
     * @param Class3VideoTime 超高清视频通话时长。单位：秒。
     */
    public void setClass3VideoTime(Long Class3VideoTime) {
        this.Class3VideoTime = Class3VideoTime;
    }

    /**
     * Get 音频通话时长。单位：秒。 
     * @return AudioTime 音频通话时长。单位：秒。
     */
    public Long getAudioTime() {
        return this.AudioTime;
    }

    /**
     * Set 音频通话时长。单位：秒。
     * @param AudioTime 音频通话时长。单位：秒。
     */
    public void setAudioTime(Long AudioTime) {
        this.AudioTime = AudioTime;
    }

    /**
     * Get 带宽。单位：Mbps。 
     * @return Bandwidth 带宽。单位：Mbps。
     */
    public Float getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 带宽。单位：Mbps。
     * @param Bandwidth 带宽。单位：Mbps。
     */
    public void setBandwidth(Float Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 2k视频通话时长。单位：秒。 
     * @return Video2KTime 2k视频通话时长。单位：秒。
     */
    public Long getVideo2KTime() {
        return this.Video2KTime;
    }

    /**
     * Set 2k视频通话时长。单位：秒。
     * @param Video2KTime 2k视频通话时长。单位：秒。
     */
    public void setVideo2KTime(Long Video2KTime) {
        this.Video2KTime = Video2KTime;
    }

    /**
     * Get 4k视频通话时长。单位：秒。 
     * @return Video4KTime 4k视频通话时长。单位：秒。
     */
    public Long getVideo4KTime() {
        return this.Video4KTime;
    }

    /**
     * Set 4k视频通话时长。单位：秒。
     * @param Video4KTime 4k视频通话时长。单位：秒。
     */
    public void setVideo4KTime(Long Video4KTime) {
        this.Video4KTime = Video4KTime;
    }

    public TrtcTimeNewUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrtcTimeNewUsage(TrtcTimeNewUsage source) {
        if (source.TimeKey != null) {
            this.TimeKey = new String(source.TimeKey);
        }
        if (source.VoiceUserNum != null) {
            this.VoiceUserNum = new Long(source.VoiceUserNum);
        }
        if (source.VideoTime != null) {
            this.VideoTime = new Long(source.VideoTime);
        }
        if (source.Class1VideoTime != null) {
            this.Class1VideoTime = new Long(source.Class1VideoTime);
        }
        if (source.Class2VideoTime != null) {
            this.Class2VideoTime = new Long(source.Class2VideoTime);
        }
        if (source.Class3VideoTime != null) {
            this.Class3VideoTime = new Long(source.Class3VideoTime);
        }
        if (source.AudioTime != null) {
            this.AudioTime = new Long(source.AudioTime);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Float(source.Bandwidth);
        }
        if (source.Video2KTime != null) {
            this.Video2KTime = new Long(source.Video2KTime);
        }
        if (source.Video4KTime != null) {
            this.Video4KTime = new Long(source.Video4KTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeKey", this.TimeKey);
        this.setParamSimple(map, prefix + "VoiceUserNum", this.VoiceUserNum);
        this.setParamSimple(map, prefix + "VideoTime", this.VideoTime);
        this.setParamSimple(map, prefix + "Class1VideoTime", this.Class1VideoTime);
        this.setParamSimple(map, prefix + "Class2VideoTime", this.Class2VideoTime);
        this.setParamSimple(map, prefix + "Class3VideoTime", this.Class3VideoTime);
        this.setParamSimple(map, prefix + "AudioTime", this.AudioTime);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Video2KTime", this.Video2KTime);
        this.setParamSimple(map, prefix + "Video4KTime", this.Video4KTime);

    }
}

