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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RawTranscodeParameter extends AbstractModel{

    /**
    * 封装格式，可选值：mp4、flv、hls、mp3、flac、ogg、m4a。其中，mp3、flac、ogg、m4a 为纯音频文件。
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * 是否去除视频数据，取值：
<li>0：保留；</li>
<li>1：去除。</li>
默认值：0。
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * 是否去除音频数据，取值：
<li>0：保留；</li>
<li>1：去除。</li>
默认值：0。
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
    * 视频流配置参数，当 RemoveVideo 为 0，该字段必填。
    */
    @SerializedName("VideoTemplate")
    @Expose
    private VideoTemplateInfo VideoTemplate;

    /**
    * 音频流配置参数，当 RemoveAudio 为 0，该字段必填。
    */
    @SerializedName("AudioTemplate")
    @Expose
    private AudioTemplateInfo AudioTemplate;

    /**
    * 极速高清转码参数。
    */
    @SerializedName("TEHDConfig")
    @Expose
    private TEHDConfig TEHDConfig;

    /**
     * Get 封装格式，可选值：mp4、flv、hls、mp3、flac、ogg、m4a。其中，mp3、flac、ogg、m4a 为纯音频文件。 
     * @return Container 封装格式，可选值：mp4、flv、hls、mp3、flac、ogg、m4a。其中，mp3、flac、ogg、m4a 为纯音频文件。
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set 封装格式，可选值：mp4、flv、hls、mp3、flac、ogg、m4a。其中，mp3、flac、ogg、m4a 为纯音频文件。
     * @param Container 封装格式，可选值：mp4、flv、hls、mp3、flac、ogg、m4a。其中，mp3、flac、ogg、m4a 为纯音频文件。
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get 是否去除视频数据，取值：
<li>0：保留；</li>
<li>1：去除。</li>
默认值：0。 
     * @return RemoveVideo 是否去除视频数据，取值：
<li>0：保留；</li>
<li>1：去除。</li>
默认值：0。
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set 是否去除视频数据，取值：
<li>0：保留；</li>
<li>1：去除。</li>
默认值：0。
     * @param RemoveVideo 是否去除视频数据，取值：
<li>0：保留；</li>
<li>1：去除。</li>
默认值：0。
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get 是否去除音频数据，取值：
<li>0：保留；</li>
<li>1：去除。</li>
默认值：0。 
     * @return RemoveAudio 是否去除音频数据，取值：
<li>0：保留；</li>
<li>1：去除。</li>
默认值：0。
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set 是否去除音频数据，取值：
<li>0：保留；</li>
<li>1：去除。</li>
默认值：0。
     * @param RemoveAudio 是否去除音频数据，取值：
<li>0：保留；</li>
<li>1：去除。</li>
默认值：0。
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    /**
     * Get 视频流配置参数，当 RemoveVideo 为 0，该字段必填。 
     * @return VideoTemplate 视频流配置参数，当 RemoveVideo 为 0，该字段必填。
     */
    public VideoTemplateInfo getVideoTemplate() {
        return this.VideoTemplate;
    }

    /**
     * Set 视频流配置参数，当 RemoveVideo 为 0，该字段必填。
     * @param VideoTemplate 视频流配置参数，当 RemoveVideo 为 0，该字段必填。
     */
    public void setVideoTemplate(VideoTemplateInfo VideoTemplate) {
        this.VideoTemplate = VideoTemplate;
    }

    /**
     * Get 音频流配置参数，当 RemoveAudio 为 0，该字段必填。 
     * @return AudioTemplate 音频流配置参数，当 RemoveAudio 为 0，该字段必填。
     */
    public AudioTemplateInfo getAudioTemplate() {
        return this.AudioTemplate;
    }

    /**
     * Set 音频流配置参数，当 RemoveAudio 为 0，该字段必填。
     * @param AudioTemplate 音频流配置参数，当 RemoveAudio 为 0，该字段必填。
     */
    public void setAudioTemplate(AudioTemplateInfo AudioTemplate) {
        this.AudioTemplate = AudioTemplate;
    }

    /**
     * Get 极速高清转码参数。 
     * @return TEHDConfig 极速高清转码参数。
     */
    public TEHDConfig getTEHDConfig() {
        return this.TEHDConfig;
    }

    /**
     * Set 极速高清转码参数。
     * @param TEHDConfig 极速高清转码参数。
     */
    public void setTEHDConfig(TEHDConfig TEHDConfig) {
        this.TEHDConfig = TEHDConfig;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);
        this.setParamObj(map, prefix + "VideoTemplate.", this.VideoTemplate);
        this.setParamObj(map, prefix + "AudioTemplate.", this.AudioTemplate);
        this.setParamObj(map, prefix + "TEHDConfig.", this.TEHDConfig);

    }
}

