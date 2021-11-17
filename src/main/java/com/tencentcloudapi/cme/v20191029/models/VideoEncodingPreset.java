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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoEncodingPreset extends AbstractModel{

    /**
    * 配置 ID。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 配置名。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 封装格式，可选值：
<li>mp4 ；</li>
<li>mov 。</li>
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * 是否去除视频数据，可选值：
<li>0：保留；</li>
<li>1：去除。</li>
默认值：0。
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * 是否去除音频数据，可选值：
<li>0：保留；</li>
<li>1：去除。</li>
默认值：0。
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
    * 视频编码配置中的视频设置。
    */
    @SerializedName("VideoSetting")
    @Expose
    private VideoEncodingPresetVideoSetting VideoSetting;

    /**
    * 视频编码配置中的音频设置。
    */
    @SerializedName("AudioSetting")
    @Expose
    private VideoEncodingPresetAudioSetting AudioSetting;

    /**
     * Get 配置 ID。 
     * @return Id 配置 ID。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 配置 ID。
     * @param Id 配置 ID。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 配置名。 
     * @return Name 配置名。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 配置名。
     * @param Name 配置名。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 封装格式，可选值：
<li>mp4 ；</li>
<li>mov 。</li> 
     * @return Container 封装格式，可选值：
<li>mp4 ；</li>
<li>mov 。</li>
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set 封装格式，可选值：
<li>mp4 ；</li>
<li>mov 。</li>
     * @param Container 封装格式，可选值：
<li>mp4 ；</li>
<li>mov 。</li>
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get 是否去除视频数据，可选值：
<li>0：保留；</li>
<li>1：去除。</li>
默认值：0。 
     * @return RemoveVideo 是否去除视频数据，可选值：
<li>0：保留；</li>
<li>1：去除。</li>
默认值：0。
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set 是否去除视频数据，可选值：
<li>0：保留；</li>
<li>1：去除。</li>
默认值：0。
     * @param RemoveVideo 是否去除视频数据，可选值：
<li>0：保留；</li>
<li>1：去除。</li>
默认值：0。
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get 是否去除音频数据，可选值：
<li>0：保留；</li>
<li>1：去除。</li>
默认值：0。 
     * @return RemoveAudio 是否去除音频数据，可选值：
<li>0：保留；</li>
<li>1：去除。</li>
默认值：0。
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set 是否去除音频数据，可选值：
<li>0：保留；</li>
<li>1：去除。</li>
默认值：0。
     * @param RemoveAudio 是否去除音频数据，可选值：
<li>0：保留；</li>
<li>1：去除。</li>
默认值：0。
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    /**
     * Get 视频编码配置中的视频设置。 
     * @return VideoSetting 视频编码配置中的视频设置。
     */
    public VideoEncodingPresetVideoSetting getVideoSetting() {
        return this.VideoSetting;
    }

    /**
     * Set 视频编码配置中的视频设置。
     * @param VideoSetting 视频编码配置中的视频设置。
     */
    public void setVideoSetting(VideoEncodingPresetVideoSetting VideoSetting) {
        this.VideoSetting = VideoSetting;
    }

    /**
     * Get 视频编码配置中的音频设置。 
     * @return AudioSetting 视频编码配置中的音频设置。
     */
    public VideoEncodingPresetAudioSetting getAudioSetting() {
        return this.AudioSetting;
    }

    /**
     * Set 视频编码配置中的音频设置。
     * @param AudioSetting 视频编码配置中的音频设置。
     */
    public void setAudioSetting(VideoEncodingPresetAudioSetting AudioSetting) {
        this.AudioSetting = AudioSetting;
    }

    public VideoEncodingPreset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoEncodingPreset(VideoEncodingPreset source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.RemoveVideo != null) {
            this.RemoveVideo = new Long(source.RemoveVideo);
        }
        if (source.RemoveAudio != null) {
            this.RemoveAudio = new Long(source.RemoveAudio);
        }
        if (source.VideoSetting != null) {
            this.VideoSetting = new VideoEncodingPresetVideoSetting(source.VideoSetting);
        }
        if (source.AudioSetting != null) {
            this.AudioSetting = new VideoEncodingPresetAudioSetting(source.AudioSetting);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);
        this.setParamObj(map, prefix + "VideoSetting.", this.VideoSetting);
        this.setParamObj(map, prefix + "AudioSetting.", this.AudioSetting);

    }
}

