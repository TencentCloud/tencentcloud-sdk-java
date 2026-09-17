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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OverrideTranscodeParameter extends AbstractModel {

    /**
    * <p>封装格式，可选值：mp4、flv、hls、mp3、flac、ogg、m4a、wav。其中，mp3、flac、ogg、m4a、wav 为纯音频文件。</p>
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * <p>是否去除视频数据，取值：<br>&lt;li&gt;0：保留；&lt;\li&gt;<br>&lt;li&gt;1：去除。&lt;\li&gt;</p>
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * <p>是否去除音频数据，取值：<br>&lt;li&gt;0：保留；&lt;\li&gt;<br>&lt;li&gt;1：去除。&lt;\li&gt;</p>
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
    * <p>视频流配置参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoTemplate")
    @Expose
    private VideoTemplateInfoForUpdate VideoTemplate;

    /**
    * <p>音频流配置参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioTemplate")
    @Expose
    private AudioTemplateInfoForUpdate AudioTemplate;

    /**
    * <p>极速高清转码配置参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TEHDConfig")
    @Expose
    private TEHDConfigForUpdate TEHDConfig;

    /**
    * <p>标准扩展字段，特殊用途使用。</p>
    */
    @SerializedName("StdExtInfo")
    @Expose
    private String StdExtInfo;

    /**
     * Get <p>封装格式，可选值：mp4、flv、hls、mp3、flac、ogg、m4a、wav。其中，mp3、flac、ogg、m4a、wav 为纯音频文件。</p> 
     * @return Container <p>封装格式，可选值：mp4、flv、hls、mp3、flac、ogg、m4a、wav。其中，mp3、flac、ogg、m4a、wav 为纯音频文件。</p>
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set <p>封装格式，可选值：mp4、flv、hls、mp3、flac、ogg、m4a、wav。其中，mp3、flac、ogg、m4a、wav 为纯音频文件。</p>
     * @param Container <p>封装格式，可选值：mp4、flv、hls、mp3、flac、ogg、m4a、wav。其中，mp3、flac、ogg、m4a、wav 为纯音频文件。</p>
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get <p>是否去除视频数据，取值：<br>&lt;li&gt;0：保留；&lt;\li&gt;<br>&lt;li&gt;1：去除。&lt;\li&gt;</p> 
     * @return RemoveVideo <p>是否去除视频数据，取值：<br>&lt;li&gt;0：保留；&lt;\li&gt;<br>&lt;li&gt;1：去除。&lt;\li&gt;</p>
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set <p>是否去除视频数据，取值：<br>&lt;li&gt;0：保留；&lt;\li&gt;<br>&lt;li&gt;1：去除。&lt;\li&gt;</p>
     * @param RemoveVideo <p>是否去除视频数据，取值：<br>&lt;li&gt;0：保留；&lt;\li&gt;<br>&lt;li&gt;1：去除。&lt;\li&gt;</p>
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get <p>是否去除音频数据，取值：<br>&lt;li&gt;0：保留；&lt;\li&gt;<br>&lt;li&gt;1：去除。&lt;\li&gt;</p> 
     * @return RemoveAudio <p>是否去除音频数据，取值：<br>&lt;li&gt;0：保留；&lt;\li&gt;<br>&lt;li&gt;1：去除。&lt;\li&gt;</p>
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set <p>是否去除音频数据，取值：<br>&lt;li&gt;0：保留；&lt;\li&gt;<br>&lt;li&gt;1：去除。&lt;\li&gt;</p>
     * @param RemoveAudio <p>是否去除音频数据，取值：<br>&lt;li&gt;0：保留；&lt;\li&gt;<br>&lt;li&gt;1：去除。&lt;\li&gt;</p>
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    /**
     * Get <p>视频流配置参数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoTemplate <p>视频流配置参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VideoTemplateInfoForUpdate getVideoTemplate() {
        return this.VideoTemplate;
    }

    /**
     * Set <p>视频流配置参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoTemplate <p>视频流配置参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoTemplate(VideoTemplateInfoForUpdate VideoTemplate) {
        this.VideoTemplate = VideoTemplate;
    }

    /**
     * Get <p>音频流配置参数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioTemplate <p>音频流配置参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioTemplateInfoForUpdate getAudioTemplate() {
        return this.AudioTemplate;
    }

    /**
     * Set <p>音频流配置参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioTemplate <p>音频流配置参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioTemplate(AudioTemplateInfoForUpdate AudioTemplate) {
        this.AudioTemplate = AudioTemplate;
    }

    /**
     * Get <p>极速高清转码配置参数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TEHDConfig <p>极速高清转码配置参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TEHDConfigForUpdate getTEHDConfig() {
        return this.TEHDConfig;
    }

    /**
     * Set <p>极速高清转码配置参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TEHDConfig <p>极速高清转码配置参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTEHDConfig(TEHDConfigForUpdate TEHDConfig) {
        this.TEHDConfig = TEHDConfig;
    }

    /**
     * Get <p>标准扩展字段，特殊用途使用。</p> 
     * @return StdExtInfo <p>标准扩展字段，特殊用途使用。</p>
     */
    public String getStdExtInfo() {
        return this.StdExtInfo;
    }

    /**
     * Set <p>标准扩展字段，特殊用途使用。</p>
     * @param StdExtInfo <p>标准扩展字段，特殊用途使用。</p>
     */
    public void setStdExtInfo(String StdExtInfo) {
        this.StdExtInfo = StdExtInfo;
    }

    public OverrideTranscodeParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverrideTranscodeParameter(OverrideTranscodeParameter source) {
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.RemoveVideo != null) {
            this.RemoveVideo = new Long(source.RemoveVideo);
        }
        if (source.RemoveAudio != null) {
            this.RemoveAudio = new Long(source.RemoveAudio);
        }
        if (source.VideoTemplate != null) {
            this.VideoTemplate = new VideoTemplateInfoForUpdate(source.VideoTemplate);
        }
        if (source.AudioTemplate != null) {
            this.AudioTemplate = new AudioTemplateInfoForUpdate(source.AudioTemplate);
        }
        if (source.TEHDConfig != null) {
            this.TEHDConfig = new TEHDConfigForUpdate(source.TEHDConfig);
        }
        if (source.StdExtInfo != null) {
            this.StdExtInfo = new String(source.StdExtInfo);
        }
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
        this.setParamSimple(map, prefix + "StdExtInfo", this.StdExtInfo);

    }
}

