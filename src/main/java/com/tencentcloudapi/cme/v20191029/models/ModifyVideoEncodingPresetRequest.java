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

public class ModifyVideoEncodingPresetRequest extends AbstractModel{

    /**
    * 平台名称，指定访问的平台。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 配置 ID。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 更改后的视频编码配置名，不填则不修改。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

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
    * 更改后的编码配置的视频设置。
    */
    @SerializedName("VideoSetting")
    @Expose
    private VideoEncodingPresetVideoSettingForUpdate VideoSetting;

    /**
    * 更改后的编码配置的音频设置。
    */
    @SerializedName("AudioSetting")
    @Expose
    private VideoEncodingPresetAudioSettingForUpdate AudioSetting;

    /**
     * Get 平台名称，指定访问的平台。 
     * @return Platform 平台名称，指定访问的平台。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台名称，指定访问的平台。
     * @param Platform 平台名称，指定访问的平台。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

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
     * Get 更改后的视频编码配置名，不填则不修改。 
     * @return Name 更改后的视频编码配置名，不填则不修改。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 更改后的视频编码配置名，不填则不修改。
     * @param Name 更改后的视频编码配置名，不填则不修改。
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get 更改后的编码配置的视频设置。 
     * @return VideoSetting 更改后的编码配置的视频设置。
     */
    public VideoEncodingPresetVideoSettingForUpdate getVideoSetting() {
        return this.VideoSetting;
    }

    /**
     * Set 更改后的编码配置的视频设置。
     * @param VideoSetting 更改后的编码配置的视频设置。
     */
    public void setVideoSetting(VideoEncodingPresetVideoSettingForUpdate VideoSetting) {
        this.VideoSetting = VideoSetting;
    }

    /**
     * Get 更改后的编码配置的音频设置。 
     * @return AudioSetting 更改后的编码配置的音频设置。
     */
    public VideoEncodingPresetAudioSettingForUpdate getAudioSetting() {
        return this.AudioSetting;
    }

    /**
     * Set 更改后的编码配置的音频设置。
     * @param AudioSetting 更改后的编码配置的音频设置。
     */
    public void setAudioSetting(VideoEncodingPresetAudioSettingForUpdate AudioSetting) {
        this.AudioSetting = AudioSetting;
    }

    public ModifyVideoEncodingPresetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVideoEncodingPresetRequest(ModifyVideoEncodingPresetRequest source) {
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.RemoveVideo != null) {
            this.RemoveVideo = new Long(source.RemoveVideo);
        }
        if (source.RemoveAudio != null) {
            this.RemoveAudio = new Long(source.RemoveAudio);
        }
        if (source.VideoSetting != null) {
            this.VideoSetting = new VideoEncodingPresetVideoSettingForUpdate(source.VideoSetting);
        }
        if (source.AudioSetting != null) {
            this.AudioSetting = new VideoEncodingPresetAudioSettingForUpdate(source.AudioSetting);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);
        this.setParamObj(map, prefix + "VideoSetting.", this.VideoSetting);
        this.setParamObj(map, prefix + "AudioSetting.", this.AudioSetting);

    }
}

