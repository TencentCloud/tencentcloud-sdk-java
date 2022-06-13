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

public class SdkAppIdTrtcMcuTranscodeTimeNewUsage extends AbstractModel{

    /**
    * 本组数据对应的时间点，格式如：2020-09-07或2020-09-07 00:05:05。
    */
    @SerializedName("TimeKey")
    @Expose
    private String TimeKey;

    /**
    * 语音时长，单位：秒。
    */
    @SerializedName("AudioTime")
    @Expose
    private Long AudioTime;

    /**
    * 视频时长-标清SD，单位：秒。
    */
    @SerializedName("VideoTimeH264SD")
    @Expose
    private Long VideoTimeH264SD;

    /**
    * 视频时长-高清HD，单位：秒。
    */
    @SerializedName("VideoTimeH264HD")
    @Expose
    private Long VideoTimeH264HD;

    /**
    * 视频时长-全高清FHD，单位：秒。
    */
    @SerializedName("VideoTimeH264FHD")
    @Expose
    private Long VideoTimeH264FHD;

    /**
    * 视频时长-带宽，单位：mbps。
    */
    @SerializedName("Flux")
    @Expose
    private Float Flux;

    /**
    * 视频时长-标清2K，单位：秒。
    */
    @SerializedName("VideoTimeH2642K")
    @Expose
    private Long VideoTimeH2642K;

    /**
    * 视频时长-标清4K，单位：秒。
    */
    @SerializedName("VideoTimeH2644K")
    @Expose
    private Long VideoTimeH2644K;

    /**
    * 视频时长-标清265SD，单位：秒。
    */
    @SerializedName("VideoTimeH265SD")
    @Expose
    private Long VideoTimeH265SD;

    /**
    * 视频时长-高清265HD，单位：秒。
    */
    @SerializedName("VideoTimeH265HD")
    @Expose
    private Long VideoTimeH265HD;

    /**
    * 视频时长-全高清265FHD，单位：秒。
    */
    @SerializedName("VideoTimeH265FHD")
    @Expose
    private Long VideoTimeH265FHD;

    /**
    * 视频时长-标清2652K，单位：秒。
    */
    @SerializedName("VideoTimeH2652K")
    @Expose
    private Long VideoTimeH2652K;

    /**
    * 视频时长-标清265 4K，单位：秒。
    */
    @SerializedName("VideoTimeH2654K")
    @Expose
    private Long VideoTimeH2654K;

    /**
     * Get 本组数据对应的时间点，格式如：2020-09-07或2020-09-07 00:05:05。 
     * @return TimeKey 本组数据对应的时间点，格式如：2020-09-07或2020-09-07 00:05:05。
     */
    public String getTimeKey() {
        return this.TimeKey;
    }

    /**
     * Set 本组数据对应的时间点，格式如：2020-09-07或2020-09-07 00:05:05。
     * @param TimeKey 本组数据对应的时间点，格式如：2020-09-07或2020-09-07 00:05:05。
     */
    public void setTimeKey(String TimeKey) {
        this.TimeKey = TimeKey;
    }

    /**
     * Get 语音时长，单位：秒。 
     * @return AudioTime 语音时长，单位：秒。
     */
    public Long getAudioTime() {
        return this.AudioTime;
    }

    /**
     * Set 语音时长，单位：秒。
     * @param AudioTime 语音时长，单位：秒。
     */
    public void setAudioTime(Long AudioTime) {
        this.AudioTime = AudioTime;
    }

    /**
     * Get 视频时长-标清SD，单位：秒。 
     * @return VideoTimeH264SD 视频时长-标清SD，单位：秒。
     */
    public Long getVideoTimeH264SD() {
        return this.VideoTimeH264SD;
    }

    /**
     * Set 视频时长-标清SD，单位：秒。
     * @param VideoTimeH264SD 视频时长-标清SD，单位：秒。
     */
    public void setVideoTimeH264SD(Long VideoTimeH264SD) {
        this.VideoTimeH264SD = VideoTimeH264SD;
    }

    /**
     * Get 视频时长-高清HD，单位：秒。 
     * @return VideoTimeH264HD 视频时长-高清HD，单位：秒。
     */
    public Long getVideoTimeH264HD() {
        return this.VideoTimeH264HD;
    }

    /**
     * Set 视频时长-高清HD，单位：秒。
     * @param VideoTimeH264HD 视频时长-高清HD，单位：秒。
     */
    public void setVideoTimeH264HD(Long VideoTimeH264HD) {
        this.VideoTimeH264HD = VideoTimeH264HD;
    }

    /**
     * Get 视频时长-全高清FHD，单位：秒。 
     * @return VideoTimeH264FHD 视频时长-全高清FHD，单位：秒。
     */
    public Long getVideoTimeH264FHD() {
        return this.VideoTimeH264FHD;
    }

    /**
     * Set 视频时长-全高清FHD，单位：秒。
     * @param VideoTimeH264FHD 视频时长-全高清FHD，单位：秒。
     */
    public void setVideoTimeH264FHD(Long VideoTimeH264FHD) {
        this.VideoTimeH264FHD = VideoTimeH264FHD;
    }

    /**
     * Get 视频时长-带宽，单位：mbps。 
     * @return Flux 视频时长-带宽，单位：mbps。
     */
    public Float getFlux() {
        return this.Flux;
    }

    /**
     * Set 视频时长-带宽，单位：mbps。
     * @param Flux 视频时长-带宽，单位：mbps。
     */
    public void setFlux(Float Flux) {
        this.Flux = Flux;
    }

    /**
     * Get 视频时长-标清2K，单位：秒。 
     * @return VideoTimeH2642K 视频时长-标清2K，单位：秒。
     */
    public Long getVideoTimeH2642K() {
        return this.VideoTimeH2642K;
    }

    /**
     * Set 视频时长-标清2K，单位：秒。
     * @param VideoTimeH2642K 视频时长-标清2K，单位：秒。
     */
    public void setVideoTimeH2642K(Long VideoTimeH2642K) {
        this.VideoTimeH2642K = VideoTimeH2642K;
    }

    /**
     * Get 视频时长-标清4K，单位：秒。 
     * @return VideoTimeH2644K 视频时长-标清4K，单位：秒。
     */
    public Long getVideoTimeH2644K() {
        return this.VideoTimeH2644K;
    }

    /**
     * Set 视频时长-标清4K，单位：秒。
     * @param VideoTimeH2644K 视频时长-标清4K，单位：秒。
     */
    public void setVideoTimeH2644K(Long VideoTimeH2644K) {
        this.VideoTimeH2644K = VideoTimeH2644K;
    }

    /**
     * Get 视频时长-标清265SD，单位：秒。 
     * @return VideoTimeH265SD 视频时长-标清265SD，单位：秒。
     */
    public Long getVideoTimeH265SD() {
        return this.VideoTimeH265SD;
    }

    /**
     * Set 视频时长-标清265SD，单位：秒。
     * @param VideoTimeH265SD 视频时长-标清265SD，单位：秒。
     */
    public void setVideoTimeH265SD(Long VideoTimeH265SD) {
        this.VideoTimeH265SD = VideoTimeH265SD;
    }

    /**
     * Get 视频时长-高清265HD，单位：秒。 
     * @return VideoTimeH265HD 视频时长-高清265HD，单位：秒。
     */
    public Long getVideoTimeH265HD() {
        return this.VideoTimeH265HD;
    }

    /**
     * Set 视频时长-高清265HD，单位：秒。
     * @param VideoTimeH265HD 视频时长-高清265HD，单位：秒。
     */
    public void setVideoTimeH265HD(Long VideoTimeH265HD) {
        this.VideoTimeH265HD = VideoTimeH265HD;
    }

    /**
     * Get 视频时长-全高清265FHD，单位：秒。 
     * @return VideoTimeH265FHD 视频时长-全高清265FHD，单位：秒。
     */
    public Long getVideoTimeH265FHD() {
        return this.VideoTimeH265FHD;
    }

    /**
     * Set 视频时长-全高清265FHD，单位：秒。
     * @param VideoTimeH265FHD 视频时长-全高清265FHD，单位：秒。
     */
    public void setVideoTimeH265FHD(Long VideoTimeH265FHD) {
        this.VideoTimeH265FHD = VideoTimeH265FHD;
    }

    /**
     * Get 视频时长-标清2652K，单位：秒。 
     * @return VideoTimeH2652K 视频时长-标清2652K，单位：秒。
     */
    public Long getVideoTimeH2652K() {
        return this.VideoTimeH2652K;
    }

    /**
     * Set 视频时长-标清2652K，单位：秒。
     * @param VideoTimeH2652K 视频时长-标清2652K，单位：秒。
     */
    public void setVideoTimeH2652K(Long VideoTimeH2652K) {
        this.VideoTimeH2652K = VideoTimeH2652K;
    }

    /**
     * Get 视频时长-标清265 4K，单位：秒。 
     * @return VideoTimeH2654K 视频时长-标清265 4K，单位：秒。
     */
    public Long getVideoTimeH2654K() {
        return this.VideoTimeH2654K;
    }

    /**
     * Set 视频时长-标清265 4K，单位：秒。
     * @param VideoTimeH2654K 视频时长-标清265 4K，单位：秒。
     */
    public void setVideoTimeH2654K(Long VideoTimeH2654K) {
        this.VideoTimeH2654K = VideoTimeH2654K;
    }

    public SdkAppIdTrtcMcuTranscodeTimeNewUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SdkAppIdTrtcMcuTranscodeTimeNewUsage(SdkAppIdTrtcMcuTranscodeTimeNewUsage source) {
        if (source.TimeKey != null) {
            this.TimeKey = new String(source.TimeKey);
        }
        if (source.AudioTime != null) {
            this.AudioTime = new Long(source.AudioTime);
        }
        if (source.VideoTimeH264SD != null) {
            this.VideoTimeH264SD = new Long(source.VideoTimeH264SD);
        }
        if (source.VideoTimeH264HD != null) {
            this.VideoTimeH264HD = new Long(source.VideoTimeH264HD);
        }
        if (source.VideoTimeH264FHD != null) {
            this.VideoTimeH264FHD = new Long(source.VideoTimeH264FHD);
        }
        if (source.Flux != null) {
            this.Flux = new Float(source.Flux);
        }
        if (source.VideoTimeH2642K != null) {
            this.VideoTimeH2642K = new Long(source.VideoTimeH2642K);
        }
        if (source.VideoTimeH2644K != null) {
            this.VideoTimeH2644K = new Long(source.VideoTimeH2644K);
        }
        if (source.VideoTimeH265SD != null) {
            this.VideoTimeH265SD = new Long(source.VideoTimeH265SD);
        }
        if (source.VideoTimeH265HD != null) {
            this.VideoTimeH265HD = new Long(source.VideoTimeH265HD);
        }
        if (source.VideoTimeH265FHD != null) {
            this.VideoTimeH265FHD = new Long(source.VideoTimeH265FHD);
        }
        if (source.VideoTimeH2652K != null) {
            this.VideoTimeH2652K = new Long(source.VideoTimeH2652K);
        }
        if (source.VideoTimeH2654K != null) {
            this.VideoTimeH2654K = new Long(source.VideoTimeH2654K);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeKey", this.TimeKey);
        this.setParamSimple(map, prefix + "AudioTime", this.AudioTime);
        this.setParamSimple(map, prefix + "VideoTimeH264SD", this.VideoTimeH264SD);
        this.setParamSimple(map, prefix + "VideoTimeH264HD", this.VideoTimeH264HD);
        this.setParamSimple(map, prefix + "VideoTimeH264FHD", this.VideoTimeH264FHD);
        this.setParamSimple(map, prefix + "Flux", this.Flux);
        this.setParamSimple(map, prefix + "VideoTimeH2642K", this.VideoTimeH2642K);
        this.setParamSimple(map, prefix + "VideoTimeH2644K", this.VideoTimeH2644K);
        this.setParamSimple(map, prefix + "VideoTimeH265SD", this.VideoTimeH265SD);
        this.setParamSimple(map, prefix + "VideoTimeH265HD", this.VideoTimeH265HD);
        this.setParamSimple(map, prefix + "VideoTimeH265FHD", this.VideoTimeH265FHD);
        this.setParamSimple(map, prefix + "VideoTimeH2652K", this.VideoTimeH2652K);
        this.setParamSimple(map, prefix + "VideoTimeH2654K", this.VideoTimeH2654K);

    }
}

