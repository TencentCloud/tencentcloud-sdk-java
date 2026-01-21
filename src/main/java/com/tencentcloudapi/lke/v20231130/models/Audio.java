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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Audio extends AbstractModel {

    /**
    * 音频文件格式
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 音频文件地址
    */
    @SerializedName("AudioUrl")
    @Expose
    private String AudioUrl;

    /**
    * 音频标题
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 音频文件在正文中的位置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Position")
    @Expose
    private Long Position;

    /**
    * 音频转录后的文字列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioTranscripts")
    @Expose
    private AudioTranscript [] AudioTranscripts;

    /**
     * Get 音频文件格式 
     * @return Format 音频文件格式
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 音频文件格式
     * @param Format 音频文件格式
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 音频文件地址 
     * @return AudioUrl 音频文件地址
     */
    public String getAudioUrl() {
        return this.AudioUrl;
    }

    /**
     * Set 音频文件地址
     * @param AudioUrl 音频文件地址
     */
    public void setAudioUrl(String AudioUrl) {
        this.AudioUrl = AudioUrl;
    }

    /**
     * Get 音频标题
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Title 音频标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 音频标题
注意：此字段可能返回 null，表示取不到有效值。
     * @param Title 音频标题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 音频文件在正文中的位置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Position 音频文件在正文中的位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPosition() {
        return this.Position;
    }

    /**
     * Set 音频文件在正文中的位置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Position 音频文件在正文中的位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPosition(Long Position) {
        this.Position = Position;
    }

    /**
     * Get 音频转录后的文字列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioTranscripts 音频转录后的文字列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioTranscript [] getAudioTranscripts() {
        return this.AudioTranscripts;
    }

    /**
     * Set 音频转录后的文字列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioTranscripts 音频转录后的文字列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioTranscripts(AudioTranscript [] AudioTranscripts) {
        this.AudioTranscripts = AudioTranscripts;
    }

    public Audio() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Audio(Audio source) {
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.AudioUrl != null) {
            this.AudioUrl = new String(source.AudioUrl);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Position != null) {
            this.Position = new Long(source.Position);
        }
        if (source.AudioTranscripts != null) {
            this.AudioTranscripts = new AudioTranscript[source.AudioTranscripts.length];
            for (int i = 0; i < source.AudioTranscripts.length; i++) {
                this.AudioTranscripts[i] = new AudioTranscript(source.AudioTranscripts[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "AudioUrl", this.AudioUrl);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamArrayObj(map, prefix + "AudioTranscripts.", this.AudioTranscripts);

    }
}

