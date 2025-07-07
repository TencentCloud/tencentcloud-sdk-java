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
package com.tencentcloudapi.vm.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SegmentCosUrlList extends AbstractModel {

    /**
    * 全量图片片段的cos url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageAllUrl")
    @Expose
    private String ImageAllUrl;

    /**
    * 全量音频片段的cos url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioAllUrl")
    @Expose
    private String AudioAllUrl;

    /**
    * 违规图片片段的cos url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageBlockUrl")
    @Expose
    private String ImageBlockUrl;

    /**
    * 违规音频片段的cos url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioBlockUrl")
    @Expose
    private String AudioBlockUrl;

    /**
    * 全量音频识别文本的cos url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsrUrl")
    @Expose
    private String AsrUrl;

    /**
     * Get 全量图片片段的cos url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageAllUrl 全量图片片段的cos url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageAllUrl() {
        return this.ImageAllUrl;
    }

    /**
     * Set 全量图片片段的cos url
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageAllUrl 全量图片片段的cos url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageAllUrl(String ImageAllUrl) {
        this.ImageAllUrl = ImageAllUrl;
    }

    /**
     * Get 全量音频片段的cos url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioAllUrl 全量音频片段的cos url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAudioAllUrl() {
        return this.AudioAllUrl;
    }

    /**
     * Set 全量音频片段的cos url
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioAllUrl 全量音频片段的cos url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioAllUrl(String AudioAllUrl) {
        this.AudioAllUrl = AudioAllUrl;
    }

    /**
     * Get 违规图片片段的cos url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageBlockUrl 违规图片片段的cos url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageBlockUrl() {
        return this.ImageBlockUrl;
    }

    /**
     * Set 违规图片片段的cos url
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageBlockUrl 违规图片片段的cos url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageBlockUrl(String ImageBlockUrl) {
        this.ImageBlockUrl = ImageBlockUrl;
    }

    /**
     * Get 违规音频片段的cos url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioBlockUrl 违规音频片段的cos url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAudioBlockUrl() {
        return this.AudioBlockUrl;
    }

    /**
     * Set 违规音频片段的cos url
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioBlockUrl 违规音频片段的cos url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioBlockUrl(String AudioBlockUrl) {
        this.AudioBlockUrl = AudioBlockUrl;
    }

    /**
     * Get 全量音频识别文本的cos url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AsrUrl 全量音频识别文本的cos url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAsrUrl() {
        return this.AsrUrl;
    }

    /**
     * Set 全量音频识别文本的cos url
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsrUrl 全量音频识别文本的cos url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsrUrl(String AsrUrl) {
        this.AsrUrl = AsrUrl;
    }

    public SegmentCosUrlList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SegmentCosUrlList(SegmentCosUrlList source) {
        if (source.ImageAllUrl != null) {
            this.ImageAllUrl = new String(source.ImageAllUrl);
        }
        if (source.AudioAllUrl != null) {
            this.AudioAllUrl = new String(source.AudioAllUrl);
        }
        if (source.ImageBlockUrl != null) {
            this.ImageBlockUrl = new String(source.ImageBlockUrl);
        }
        if (source.AudioBlockUrl != null) {
            this.AudioBlockUrl = new String(source.AudioBlockUrl);
        }
        if (source.AsrUrl != null) {
            this.AsrUrl = new String(source.AsrUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageAllUrl", this.ImageAllUrl);
        this.setParamSimple(map, prefix + "AudioAllUrl", this.AudioAllUrl);
        this.setParamSimple(map, prefix + "ImageBlockUrl", this.ImageBlockUrl);
        this.setParamSimple(map, prefix + "AudioBlockUrl", this.AudioBlockUrl);
        this.setParamSimple(map, prefix + "AsrUrl", this.AsrUrl);

    }
}

