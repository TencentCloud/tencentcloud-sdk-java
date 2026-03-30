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

public class AdaptiveStreamTemplate extends AbstractModel {

    /**
    * <p>视频参数信息。</p>
    */
    @SerializedName("Video")
    @Expose
    private VideoTemplateInfo Video;

    /**
    * <p>音频参数信息。</p>
    */
    @SerializedName("Audio")
    @Expose
    private AudioTemplateInfo Audio;

    /**
    * <p>是否移除音频流，取值范围：</p><li>0：否，</li><li>1：是。</li>
    */
    @SerializedName("RemoveAudio")
    @Expose
    private Long RemoveAudio;

    /**
    * <p>是否移除视频流，取值范围：</p><li>0：否，</li><li>1：是。</li>
    */
    @SerializedName("RemoveVideo")
    @Expose
    private Long RemoveVideo;

    /**
    * <p>极速高清转码参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TEHDConfig")
    @Expose
    private TEHDConfig TEHDConfig;

    /**
    * <p>音视频增强配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnhanceConfig")
    @Expose
    private EnhanceConfig EnhanceConfig;

    /**
    * <p>扩展参数。</p>
    */
    @SerializedName("StdExtInfo")
    @Expose
    private String StdExtInfo;

    /**
     * Get <p>视频参数信息。</p> 
     * @return Video <p>视频参数信息。</p>
     */
    public VideoTemplateInfo getVideo() {
        return this.Video;
    }

    /**
     * Set <p>视频参数信息。</p>
     * @param Video <p>视频参数信息。</p>
     */
    public void setVideo(VideoTemplateInfo Video) {
        this.Video = Video;
    }

    /**
     * Get <p>音频参数信息。</p> 
     * @return Audio <p>音频参数信息。</p>
     */
    public AudioTemplateInfo getAudio() {
        return this.Audio;
    }

    /**
     * Set <p>音频参数信息。</p>
     * @param Audio <p>音频参数信息。</p>
     */
    public void setAudio(AudioTemplateInfo Audio) {
        this.Audio = Audio;
    }

    /**
     * Get <p>是否移除音频流，取值范围：</p><li>0：否，</li><li>1：是。</li> 
     * @return RemoveAudio <p>是否移除音频流，取值范围：</p><li>0：否，</li><li>1：是。</li>
     */
    public Long getRemoveAudio() {
        return this.RemoveAudio;
    }

    /**
     * Set <p>是否移除音频流，取值范围：</p><li>0：否，</li><li>1：是。</li>
     * @param RemoveAudio <p>是否移除音频流，取值范围：</p><li>0：否，</li><li>1：是。</li>
     */
    public void setRemoveAudio(Long RemoveAudio) {
        this.RemoveAudio = RemoveAudio;
    }

    /**
     * Get <p>是否移除视频流，取值范围：</p><li>0：否，</li><li>1：是。</li> 
     * @return RemoveVideo <p>是否移除视频流，取值范围：</p><li>0：否，</li><li>1：是。</li>
     */
    public Long getRemoveVideo() {
        return this.RemoveVideo;
    }

    /**
     * Set <p>是否移除视频流，取值范围：</p><li>0：否，</li><li>1：是。</li>
     * @param RemoveVideo <p>是否移除视频流，取值范围：</p><li>0：否，</li><li>1：是。</li>
     */
    public void setRemoveVideo(Long RemoveVideo) {
        this.RemoveVideo = RemoveVideo;
    }

    /**
     * Get <p>极速高清转码参数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TEHDConfig <p>极速高清转码参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TEHDConfig getTEHDConfig() {
        return this.TEHDConfig;
    }

    /**
     * Set <p>极速高清转码参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TEHDConfig <p>极速高清转码参数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTEHDConfig(TEHDConfig TEHDConfig) {
        this.TEHDConfig = TEHDConfig;
    }

    /**
     * Get <p>音视频增强配置。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnhanceConfig <p>音视频增强配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EnhanceConfig getEnhanceConfig() {
        return this.EnhanceConfig;
    }

    /**
     * Set <p>音视频增强配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnhanceConfig <p>音视频增强配置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnhanceConfig(EnhanceConfig EnhanceConfig) {
        this.EnhanceConfig = EnhanceConfig;
    }

    /**
     * Get <p>扩展参数。</p> 
     * @return StdExtInfo <p>扩展参数。</p>
     */
    public String getStdExtInfo() {
        return this.StdExtInfo;
    }

    /**
     * Set <p>扩展参数。</p>
     * @param StdExtInfo <p>扩展参数。</p>
     */
    public void setStdExtInfo(String StdExtInfo) {
        this.StdExtInfo = StdExtInfo;
    }

    public AdaptiveStreamTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdaptiveStreamTemplate(AdaptiveStreamTemplate source) {
        if (source.Video != null) {
            this.Video = new VideoTemplateInfo(source.Video);
        }
        if (source.Audio != null) {
            this.Audio = new AudioTemplateInfo(source.Audio);
        }
        if (source.RemoveAudio != null) {
            this.RemoveAudio = new Long(source.RemoveAudio);
        }
        if (source.RemoveVideo != null) {
            this.RemoveVideo = new Long(source.RemoveVideo);
        }
        if (source.TEHDConfig != null) {
            this.TEHDConfig = new TEHDConfig(source.TEHDConfig);
        }
        if (source.EnhanceConfig != null) {
            this.EnhanceConfig = new EnhanceConfig(source.EnhanceConfig);
        }
        if (source.StdExtInfo != null) {
            this.StdExtInfo = new String(source.StdExtInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Video.", this.Video);
        this.setParamObj(map, prefix + "Audio.", this.Audio);
        this.setParamSimple(map, prefix + "RemoveAudio", this.RemoveAudio);
        this.setParamSimple(map, prefix + "RemoveVideo", this.RemoveVideo);
        this.setParamObj(map, prefix + "TEHDConfig.", this.TEHDConfig);
        this.setParamObj(map, prefix + "EnhanceConfig.", this.EnhanceConfig);
        this.setParamSimple(map, prefix + "StdExtInfo", this.StdExtInfo);

    }
}

