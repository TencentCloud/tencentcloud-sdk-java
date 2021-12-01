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

public class AppearInfo extends AbstractModel{

    /**
    * 关键词在音频文本结果中的出现位置数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioAppearSet")
    @Expose
    private TextAppearInfo [] AudioAppearSet;

    /**
    * 关键词在可视文本结果中的出现位置数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TextAppearSet")
    @Expose
    private TextAppearInfo [] TextAppearSet;

    /**
    * 关键词在视频信息中的出现位置数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoAppearSet")
    @Expose
    private VideoAppearInfo [] VideoAppearSet;

    /**
     * Get 关键词在音频文本结果中的出现位置数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AudioAppearSet 关键词在音频文本结果中的出现位置数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TextAppearInfo [] getAudioAppearSet() {
        return this.AudioAppearSet;
    }

    /**
     * Set 关键词在音频文本结果中的出现位置数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioAppearSet 关键词在音频文本结果中的出现位置数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioAppearSet(TextAppearInfo [] AudioAppearSet) {
        this.AudioAppearSet = AudioAppearSet;
    }

    /**
     * Get 关键词在可视文本结果中的出现位置数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TextAppearSet 关键词在可视文本结果中的出现位置数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TextAppearInfo [] getTextAppearSet() {
        return this.TextAppearSet;
    }

    /**
     * Set 关键词在可视文本结果中的出现位置数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param TextAppearSet 关键词在可视文本结果中的出现位置数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTextAppearSet(TextAppearInfo [] TextAppearSet) {
        this.TextAppearSet = TextAppearSet;
    }

    /**
     * Get 关键词在视频信息中的出现位置数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoAppearSet 关键词在视频信息中的出现位置数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VideoAppearInfo [] getVideoAppearSet() {
        return this.VideoAppearSet;
    }

    /**
     * Set 关键词在视频信息中的出现位置数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoAppearSet 关键词在视频信息中的出现位置数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoAppearSet(VideoAppearInfo [] VideoAppearSet) {
        this.VideoAppearSet = VideoAppearSet;
    }

    public AppearInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppearInfo(AppearInfo source) {
        if (source.AudioAppearSet != null) {
            this.AudioAppearSet = new TextAppearInfo[source.AudioAppearSet.length];
            for (int i = 0; i < source.AudioAppearSet.length; i++) {
                this.AudioAppearSet[i] = new TextAppearInfo(source.AudioAppearSet[i]);
            }
        }
        if (source.TextAppearSet != null) {
            this.TextAppearSet = new TextAppearInfo[source.TextAppearSet.length];
            for (int i = 0; i < source.TextAppearSet.length; i++) {
                this.TextAppearSet[i] = new TextAppearInfo(source.TextAppearSet[i]);
            }
        }
        if (source.VideoAppearSet != null) {
            this.VideoAppearSet = new VideoAppearInfo[source.VideoAppearSet.length];
            for (int i = 0; i < source.VideoAppearSet.length; i++) {
                this.VideoAppearSet[i] = new VideoAppearInfo(source.VideoAppearSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AudioAppearSet.", this.AudioAppearSet);
        this.setParamArrayObj(map, prefix + "TextAppearSet.", this.TextAppearSet);
        this.setParamArrayObj(map, prefix + "VideoAppearSet.", this.VideoAppearSet);

    }
}

