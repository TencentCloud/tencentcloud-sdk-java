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

public class TurnPushInfo extends AbstractModel {

    /**
    * 视频帧率，单位fps。
    */
    @SerializedName("VideoFps")
    @Expose
    private Long VideoFps;

    /**
    * 音频帧率，单位fps。
    */
    @SerializedName("AudioFps")
    @Expose
    private Long AudioFps;

    /**
    * 视频码率，单位bps。
    */
    @SerializedName("VideoRate")
    @Expose
    private Long VideoRate;

    /**
    * 音频码率，单位bps。
    */
    @SerializedName("AudioRate")
    @Expose
    private Long AudioRate;

    /**
    * 流标识。
    */
    @SerializedName("StreamFlag")
    @Expose
    private String StreamFlag;

    /**
    * 时间，utc格式：yyyy-mm-ddTHH:MM:SSZ，参考https://cloud.tencent.com/document/product/266/11732#I。
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
     * Get 视频帧率，单位fps。 
     * @return VideoFps 视频帧率，单位fps。
     */
    public Long getVideoFps() {
        return this.VideoFps;
    }

    /**
     * Set 视频帧率，单位fps。
     * @param VideoFps 视频帧率，单位fps。
     */
    public void setVideoFps(Long VideoFps) {
        this.VideoFps = VideoFps;
    }

    /**
     * Get 音频帧率，单位fps。 
     * @return AudioFps 音频帧率，单位fps。
     */
    public Long getAudioFps() {
        return this.AudioFps;
    }

    /**
     * Set 音频帧率，单位fps。
     * @param AudioFps 音频帧率，单位fps。
     */
    public void setAudioFps(Long AudioFps) {
        this.AudioFps = AudioFps;
    }

    /**
     * Get 视频码率，单位bps。 
     * @return VideoRate 视频码率，单位bps。
     */
    public Long getVideoRate() {
        return this.VideoRate;
    }

    /**
     * Set 视频码率，单位bps。
     * @param VideoRate 视频码率，单位bps。
     */
    public void setVideoRate(Long VideoRate) {
        this.VideoRate = VideoRate;
    }

    /**
     * Get 音频码率，单位bps。 
     * @return AudioRate 音频码率，单位bps。
     */
    public Long getAudioRate() {
        return this.AudioRate;
    }

    /**
     * Set 音频码率，单位bps。
     * @param AudioRate 音频码率，单位bps。
     */
    public void setAudioRate(Long AudioRate) {
        this.AudioRate = AudioRate;
    }

    /**
     * Get 流标识。 
     * @return StreamFlag 流标识。
     */
    public String getStreamFlag() {
        return this.StreamFlag;
    }

    /**
     * Set 流标识。
     * @param StreamFlag 流标识。
     */
    public void setStreamFlag(String StreamFlag) {
        this.StreamFlag = StreamFlag;
    }

    /**
     * Get 时间，utc格式：yyyy-mm-ddTHH:MM:SSZ，参考https://cloud.tencent.com/document/product/266/11732#I。 
     * @return Time 时间，utc格式：yyyy-mm-ddTHH:MM:SSZ，参考https://cloud.tencent.com/document/product/266/11732#I。
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 时间，utc格式：yyyy-mm-ddTHH:MM:SSZ，参考https://cloud.tencent.com/document/product/266/11732#I。
     * @param Time 时间，utc格式：yyyy-mm-ddTHH:MM:SSZ，参考https://cloud.tencent.com/document/product/266/11732#I。
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    public TurnPushInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TurnPushInfo(TurnPushInfo source) {
        if (source.VideoFps != null) {
            this.VideoFps = new Long(source.VideoFps);
        }
        if (source.AudioFps != null) {
            this.AudioFps = new Long(source.AudioFps);
        }
        if (source.VideoRate != null) {
            this.VideoRate = new Long(source.VideoRate);
        }
        if (source.AudioRate != null) {
            this.AudioRate = new Long(source.AudioRate);
        }
        if (source.StreamFlag != null) {
            this.StreamFlag = new String(source.StreamFlag);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VideoFps", this.VideoFps);
        this.setParamSimple(map, prefix + "AudioFps", this.AudioFps);
        this.setParamSimple(map, prefix + "VideoRate", this.VideoRate);
        this.setParamSimple(map, prefix + "AudioRate", this.AudioRate);
        this.setParamSimple(map, prefix + "StreamFlag", this.StreamFlag);
        this.setParamSimple(map, prefix + "Time", this.Time);

    }
}

