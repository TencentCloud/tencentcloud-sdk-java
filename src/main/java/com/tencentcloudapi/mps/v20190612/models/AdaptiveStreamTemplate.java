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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdaptiveStreamTemplate extends AbstractModel {

    /**
    * 音频参数信息。
    */
    @SerializedName("Audio")
    @Expose
    private AudioTemplateInfo Audio;

    /**
    * 视频参数信息。
    */
    @SerializedName("Video")
    @Expose
    private VideoTemplateInfo Video;

    /**
    * 是否移除音频流，取值范围：
<li>0：否，</li>
<li>1：是。</li>
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
    * 是否移除视频流，取值范围：
<li>0：否，</li>
<li>1：是。</li>
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * 音频参数信息列表。
注意：参数只在自适应转码使用音轨合并多音轨时使用, 参数数组长度最大为64。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioList")
    @Expose
    private AudioTemplateInfo [] AudioList;

    /**
     * Get 音频参数信息。 
     * @return Audio 音频参数信息。
     */
    public AudioTemplateInfo getAudio() {
        return this.Audio;
    }

    /**
     * Set 音频参数信息。
     * @param Audio 音频参数信息。
     */
    public void setAudio(AudioTemplateInfo Audio) {
        this.Audio = Audio;
    }

    /**
     * Get 视频参数信息。 
     * @return Video 视频参数信息。
     */
    public VideoTemplateInfo getVideo() {
        return this.Video;
    }

    /**
     * Set 视频参数信息。
     * @param Video 视频参数信息。
     */
    public void setVideo(VideoTemplateInfo Video) {
        this.Video = Video;
    }

    /**
     * Get 是否移除音频流，取值范围：
<li>0：否，</li>
<li>1：是。</li> 
     * @return RemoveAudio 是否移除音频流，取值范围：
<li>0：否，</li>
<li>1：是。</li>
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set 是否移除音频流，取值范围：
<li>0：否，</li>
<li>1：是。</li>
     * @param RemoveAudio 是否移除音频流，取值范围：
<li>0：否，</li>
<li>1：是。</li>
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    /**
     * Get 是否移除视频流，取值范围：
<li>0：否，</li>
<li>1：是。</li> 
     * @return RemoveVideo 是否移除视频流，取值范围：
<li>0：否，</li>
<li>1：是。</li>
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set 是否移除视频流，取值范围：
<li>0：否，</li>
<li>1：是。</li>
     * @param RemoveVideo 是否移除视频流，取值范围：
<li>0：否，</li>
<li>1：是。</li>
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get 音频参数信息列表。
注意：参数只在自适应转码使用音轨合并多音轨时使用, 参数数组长度最大为64。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioList 音频参数信息列表。
注意：参数只在自适应转码使用音轨合并多音轨时使用, 参数数组长度最大为64。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioTemplateInfo [] getAudioList() {
        return this.AudioList;
    }

    /**
     * Set 音频参数信息列表。
注意：参数只在自适应转码使用音轨合并多音轨时使用, 参数数组长度最大为64。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioList 音频参数信息列表。
注意：参数只在自适应转码使用音轨合并多音轨时使用, 参数数组长度最大为64。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioList(AudioTemplateInfo [] AudioList) {
        this.AudioList = AudioList;
    }

    public AdaptiveStreamTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdaptiveStreamTemplate(AdaptiveStreamTemplate source) {
        if (source.Audio != null) {
            this.Audio = new AudioTemplateInfo(source.Audio);
        }
        if (source.Video != null) {
            this.Video = new VideoTemplateInfo(source.Video);
        }
        if (source.RemoveAudio != null) {
            this.RemoveAudio = new Long(source.RemoveAudio);
        }
        if (source.RemoveVideo != null) {
            this.RemoveVideo = new Long(source.RemoveVideo);
        }
        if (source.AudioList != null) {
            this.AudioList = new AudioTemplateInfo[source.AudioList.length];
            for (int i = 0; i < source.AudioList.length; i++) {
                this.AudioList[i] = new AudioTemplateInfo(source.AudioList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Audio.", this.Audio);
        this.setParamObj(map, prefix + "Video.", this.Video);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);
        this.setParamArrayObj(map, prefix + "AudioList.", this.AudioList);

    }
}

