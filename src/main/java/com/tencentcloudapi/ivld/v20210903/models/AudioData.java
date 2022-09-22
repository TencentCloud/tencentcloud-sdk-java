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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AudioData extends AbstractModel{

    /**
    * 音频识别文本结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioInfoSet")
    @Expose
    private AudioInfo [] AudioInfoSet;

    /**
    * 音频识别标签数据
    */
    @SerializedName("TextTagSet")
    @Expose
    private MultiLevelTag TextTagSet;

    /**
     * Get 音频识别文本结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioInfoSet 音频识别文本结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioInfo [] getAudioInfoSet() {
        return this.AudioInfoSet;
    }

    /**
     * Set 音频识别文本结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioInfoSet 音频识别文本结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioInfoSet(AudioInfo [] AudioInfoSet) {
        this.AudioInfoSet = AudioInfoSet;
    }

    /**
     * Get 音频识别标签数据 
     * @return TextTagSet 音频识别标签数据
     */
    public MultiLevelTag getTextTagSet() {
        return this.TextTagSet;
    }

    /**
     * Set 音频识别标签数据
     * @param TextTagSet 音频识别标签数据
     */
    public void setTextTagSet(MultiLevelTag TextTagSet) {
        this.TextTagSet = TextTagSet;
    }

    public AudioData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AudioData(AudioData source) {
        if (source.AudioInfoSet != null) {
            this.AudioInfoSet = new AudioInfo[source.AudioInfoSet.length];
            for (int i = 0; i < source.AudioInfoSet.length; i++) {
                this.AudioInfoSet[i] = new AudioInfo(source.AudioInfoSet[i]);
            }
        }
        if (source.TextTagSet != null) {
            this.TextTagSet = new MultiLevelTag(source.TextTagSet);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AudioInfoSet.", this.AudioInfoSet);
        this.setParamObj(map, prefix + "TextTagSet.", this.TextTagSet);

    }
}

