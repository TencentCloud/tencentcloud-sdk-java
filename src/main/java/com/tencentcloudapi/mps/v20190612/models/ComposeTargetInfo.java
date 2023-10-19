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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComposeTargetInfo extends AbstractModel {

    /**
    * 封装容器格式，可选值：
<li>mp4：视频文件（默认）。</li>
<li>mp3：纯音频文件。</li>
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * 是否去除视频数据，可选值：
<li>0：保留（默认）。</li>
<li>1：去除。</li>
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * 是否去除音频数据，可选值：
<li>0：保留（默认）。</li>
<li>1：去除。</li>
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
    * 输出视频流信息。
    */
    @SerializedName("VideoStream")
    @Expose
    private ComposeVideoStream VideoStream;

    /**
    * 输出音频流信息。
    */
    @SerializedName("AudioStream")
    @Expose
    private ComposeAudioStream AudioStream;

    /**
     * Get 封装容器格式，可选值：
<li>mp4：视频文件（默认）。</li>
<li>mp3：纯音频文件。</li> 
     * @return Container 封装容器格式，可选值：
<li>mp4：视频文件（默认）。</li>
<li>mp3：纯音频文件。</li>
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set 封装容器格式，可选值：
<li>mp4：视频文件（默认）。</li>
<li>mp3：纯音频文件。</li>
     * @param Container 封装容器格式，可选值：
<li>mp4：视频文件（默认）。</li>
<li>mp3：纯音频文件。</li>
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get 是否去除视频数据，可选值：
<li>0：保留（默认）。</li>
<li>1：去除。</li> 
     * @return RemoveVideo 是否去除视频数据，可选值：
<li>0：保留（默认）。</li>
<li>1：去除。</li>
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set 是否去除视频数据，可选值：
<li>0：保留（默认）。</li>
<li>1：去除。</li>
     * @param RemoveVideo 是否去除视频数据，可选值：
<li>0：保留（默认）。</li>
<li>1：去除。</li>
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get 是否去除音频数据，可选值：
<li>0：保留（默认）。</li>
<li>1：去除。</li> 
     * @return RemoveAudio 是否去除音频数据，可选值：
<li>0：保留（默认）。</li>
<li>1：去除。</li>
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set 是否去除音频数据，可选值：
<li>0：保留（默认）。</li>
<li>1：去除。</li>
     * @param RemoveAudio 是否去除音频数据，可选值：
<li>0：保留（默认）。</li>
<li>1：去除。</li>
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    /**
     * Get 输出视频流信息。 
     * @return VideoStream 输出视频流信息。
     */
    public ComposeVideoStream getVideoStream() {
        return this.VideoStream;
    }

    /**
     * Set 输出视频流信息。
     * @param VideoStream 输出视频流信息。
     */
    public void setVideoStream(ComposeVideoStream VideoStream) {
        this.VideoStream = VideoStream;
    }

    /**
     * Get 输出音频流信息。 
     * @return AudioStream 输出音频流信息。
     */
    public ComposeAudioStream getAudioStream() {
        return this.AudioStream;
    }

    /**
     * Set 输出音频流信息。
     * @param AudioStream 输出音频流信息。
     */
    public void setAudioStream(ComposeAudioStream AudioStream) {
        this.AudioStream = AudioStream;
    }

    public ComposeTargetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeTargetInfo(ComposeTargetInfo source) {
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.RemoveVideo != null) {
            this.RemoveVideo = new Long(source.RemoveVideo);
        }
        if (source.RemoveAudio != null) {
            this.RemoveAudio = new Long(source.RemoveAudio);
        }
        if (source.VideoStream != null) {
            this.VideoStream = new ComposeVideoStream(source.VideoStream);
        }
        if (source.AudioStream != null) {
            this.AudioStream = new ComposeAudioStream(source.AudioStream);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);
        this.setParamObj(map, prefix + "VideoStream.", this.VideoStream);
        this.setParamObj(map, prefix + "AudioStream.", this.AudioStream);

    }
}

