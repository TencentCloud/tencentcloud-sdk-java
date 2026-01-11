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

public class EnhanceConfigForUpdate extends AbstractModel {

    /**
    * 视频增强配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoEnhance")
    @Expose
    private VideoEnhanceConfig VideoEnhance;

    /**
    * 音频增强配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioEnhance")
    @Expose
    private AudioEnhanceConfig AudioEnhance;

    /**
     * Get 视频增强配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoEnhance 视频增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VideoEnhanceConfig getVideoEnhance() {
        return this.VideoEnhance;
    }

    /**
     * Set 视频增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoEnhance 视频增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoEnhance(VideoEnhanceConfig VideoEnhance) {
        this.VideoEnhance = VideoEnhance;
    }

    /**
     * Get 音频增强配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioEnhance 音频增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioEnhanceConfig getAudioEnhance() {
        return this.AudioEnhance;
    }

    /**
     * Set 音频增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioEnhance 音频增强配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioEnhance(AudioEnhanceConfig AudioEnhance) {
        this.AudioEnhance = AudioEnhance;
    }

    public EnhanceConfigForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnhanceConfigForUpdate(EnhanceConfigForUpdate source) {
        if (source.VideoEnhance != null) {
            this.VideoEnhance = new VideoEnhanceConfig(source.VideoEnhance);
        }
        if (source.AudioEnhance != null) {
            this.AudioEnhance = new AudioEnhanceConfig(source.AudioEnhance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "VideoEnhance.", this.VideoEnhance);
        this.setParamObj(map, prefix + "AudioEnhance.", this.AudioEnhance);

    }
}

