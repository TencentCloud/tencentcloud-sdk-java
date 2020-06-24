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

public class AdaptiveStreamTemplate extends AbstractModel{

    /**
    * 视频参数信息。
    */
    @SerializedName("Video")
    @Expose
    private VideoTemplateInfo Video;

    /**
    * 音频参数信息。
    */
    @SerializedName("Audio")
    @Expose
    private AudioTemplateInfo Audio;

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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Video.", this.Video);
        this.setParamObj(map, prefix + "Audio.", this.Audio);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);

    }
}

