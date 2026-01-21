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

public class AudioTranscript extends AbstractModel {

    /**
    * 音频的发言者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Speaker")
    @Expose
    private String Speaker;

    /**
    * 音频转录为文字后的内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Transcript")
    @Expose
    private String Transcript;

    /**
     * Get 音频的发言者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Speaker 音频的发言者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpeaker() {
        return this.Speaker;
    }

    /**
     * Set 音频的发言者
注意：此字段可能返回 null，表示取不到有效值。
     * @param Speaker 音频的发言者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpeaker(String Speaker) {
        this.Speaker = Speaker;
    }

    /**
     * Get 音频转录为文字后的内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Transcript 音频转录为文字后的内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTranscript() {
        return this.Transcript;
    }

    /**
     * Set 音频转录为文字后的内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Transcript 音频转录为文字后的内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTranscript(String Transcript) {
        this.Transcript = Transcript;
    }

    public AudioTranscript() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioTranscript(AudioTranscript source) {
        if (source.Speaker != null) {
            this.Speaker = new String(source.Speaker);
        }
        if (source.Transcript != null) {
            this.Transcript = new String(source.Transcript);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Speaker", this.Speaker);
        this.setParamSimple(map, prefix + "Transcript", this.Transcript);

    }
}

