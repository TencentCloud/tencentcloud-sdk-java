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

public class OverrideTranscodeParameter extends AbstractModel{

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
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * 是否去除音频数据，取值：
<li>0：保留；</li>
<li>1：去除。</li>
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
    * 视频流配置参数。
    */
    @SerializedName("VideoTemplate")
    @Expose
    private VideoTemplateInfoForUpdate VideoTemplate;

    /**
    * 音频流配置参数。
    */
    @SerializedName("AudioTemplate")
    @Expose
    private AudioTemplateInfoForUpdate AudioTemplate;

    /**
    * 极速高清转码参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TEHDConfig")
    @Expose
    private TEHDConfigForUpdate TEHDConfig;

    /**
    * 字幕流配置参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubtitleTemplate")
    @Expose
    private SubtitleTemplate SubtitleTemplate;

    /**
    * 外挂音轨参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddonAudioStream")
    @Expose
    private MediaInputInfo [] AddonAudioStream;

    /**
    * 转码扩展字段。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StdExtInfo")
    @Expose
    private String StdExtInfo;

    /**
    * 要插入的字幕文件。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AddOnSubtitles")
    @Expose
    private AddOnSubtitle [] AddOnSubtitles;

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
     * @return RemoveVideo 是否去除视频数据，取值：
<li>0：保留；</li>
<li>1：去除。</li>
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set 是否去除视频数据，取值：
<li>0：保留；</li>
<li>1：去除。</li>
     * @param RemoveVideo 是否去除视频数据，取值：
<li>0：保留；</li>
<li>1：去除。</li>
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get 是否去除音频数据，取值：
<li>0：保留；</li>
<li>1：去除。</li> 
     * @return RemoveAudio 是否去除音频数据，取值：
<li>0：保留；</li>
<li>1：去除。</li>
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set 是否去除音频数据，取值：
<li>0：保留；</li>
<li>1：去除。</li>
     * @param RemoveAudio 是否去除音频数据，取值：
<li>0：保留；</li>
<li>1：去除。</li>
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    /**
     * Get 视频流配置参数。 
     * @return VideoTemplate 视频流配置参数。
     */
    public VideoTemplateInfoForUpdate getVideoTemplate() {
        return this.VideoTemplate;
    }

    /**
     * Set 视频流配置参数。
     * @param VideoTemplate 视频流配置参数。
     */
    public void setVideoTemplate(VideoTemplateInfoForUpdate VideoTemplate) {
        this.VideoTemplate = VideoTemplate;
    }

    /**
     * Get 音频流配置参数。 
     * @return AudioTemplate 音频流配置参数。
     */
    public AudioTemplateInfoForUpdate getAudioTemplate() {
        return this.AudioTemplate;
    }

    /**
     * Set 音频流配置参数。
     * @param AudioTemplate 音频流配置参数。
     */
    public void setAudioTemplate(AudioTemplateInfoForUpdate AudioTemplate) {
        this.AudioTemplate = AudioTemplate;
    }

    /**
     * Get 极速高清转码参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TEHDConfig 极速高清转码参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TEHDConfigForUpdate getTEHDConfig() {
        return this.TEHDConfig;
    }

    /**
     * Set 极速高清转码参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TEHDConfig 极速高清转码参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTEHDConfig(TEHDConfigForUpdate TEHDConfig) {
        this.TEHDConfig = TEHDConfig;
    }

    /**
     * Get 字幕流配置参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubtitleTemplate 字幕流配置参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SubtitleTemplate getSubtitleTemplate() {
        return this.SubtitleTemplate;
    }

    /**
     * Set 字幕流配置参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubtitleTemplate 字幕流配置参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubtitleTemplate(SubtitleTemplate SubtitleTemplate) {
        this.SubtitleTemplate = SubtitleTemplate;
    }

    /**
     * Get 外挂音轨参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddonAudioStream 外挂音轨参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaInputInfo [] getAddonAudioStream() {
        return this.AddonAudioStream;
    }

    /**
     * Set 外挂音轨参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddonAudioStream 外挂音轨参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddonAudioStream(MediaInputInfo [] AddonAudioStream) {
        this.AddonAudioStream = AddonAudioStream;
    }

    /**
     * Get 转码扩展字段。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StdExtInfo 转码扩展字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStdExtInfo() {
        return this.StdExtInfo;
    }

    /**
     * Set 转码扩展字段。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StdExtInfo 转码扩展字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStdExtInfo(String StdExtInfo) {
        this.StdExtInfo = StdExtInfo;
    }

    /**
     * Get 要插入的字幕文件。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AddOnSubtitles 要插入的字幕文件。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AddOnSubtitle [] getAddOnSubtitles() {
        return this.AddOnSubtitles;
    }

    /**
     * Set 要插入的字幕文件。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AddOnSubtitles 要插入的字幕文件。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddOnSubtitles(AddOnSubtitle [] AddOnSubtitles) {
        this.AddOnSubtitles = AddOnSubtitles;
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
        if (source.SubtitleTemplate != null) {
            this.SubtitleTemplate = new SubtitleTemplate(source.SubtitleTemplate);
        }
        if (source.AddonAudioStream != null) {
            this.AddonAudioStream = new MediaInputInfo[source.AddonAudioStream.length];
            for (int i = 0; i < source.AddonAudioStream.length; i++) {
                this.AddonAudioStream[i] = new MediaInputInfo(source.AddonAudioStream[i]);
            }
        }
        if (source.StdExtInfo != null) {
            this.StdExtInfo = new String(source.StdExtInfo);
        }
        if (source.AddOnSubtitles != null) {
            this.AddOnSubtitles = new AddOnSubtitle[source.AddOnSubtitles.length];
            for (int i = 0; i < source.AddOnSubtitles.length; i++) {
                this.AddOnSubtitles[i] = new AddOnSubtitle(source.AddOnSubtitles[i]);
            }
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
        this.setParamObj(map, prefix + "SubtitleTemplate.", this.SubtitleTemplate);
        this.setParamArrayObj(map, prefix + "AddonAudioStream.", this.AddonAudioStream);
        this.setParamSimple(map, prefix + "StdExtInfo", this.StdExtInfo);
        this.setParamArrayObj(map, prefix + "AddOnSubtitles.", this.AddOnSubtitles);

    }
}

