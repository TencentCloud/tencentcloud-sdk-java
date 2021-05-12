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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaRecognitionTaskResult extends AbstractModel{

    /**
    * 帧标签识别结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrameTagResults")
    @Expose
    private FrameTagResult FrameTagResults;

    /**
    * 语音字幕识别结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubtitleResults")
    @Expose
    private SubtitleResult SubtitleResults;

    /**
     * Get 帧标签识别结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrameTagResults 帧标签识别结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FrameTagResult getFrameTagResults() {
        return this.FrameTagResults;
    }

    /**
     * Set 帧标签识别结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrameTagResults 帧标签识别结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrameTagResults(FrameTagResult FrameTagResults) {
        this.FrameTagResults = FrameTagResults;
    }

    /**
     * Get 语音字幕识别结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubtitleResults 语音字幕识别结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SubtitleResult getSubtitleResults() {
        return this.SubtitleResults;
    }

    /**
     * Set 语音字幕识别结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubtitleResults 语音字幕识别结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubtitleResults(SubtitleResult SubtitleResults) {
        this.SubtitleResults = SubtitleResults;
    }

    public MediaRecognitionTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaRecognitionTaskResult(MediaRecognitionTaskResult source) {
        if (source.FrameTagResults != null) {
            this.FrameTagResults = new FrameTagResult(source.FrameTagResults);
        }
        if (source.SubtitleResults != null) {
            this.SubtitleResults = new SubtitleResult(source.SubtitleResults);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FrameTagResults.", this.FrameTagResults);
        this.setParamObj(map, prefix + "SubtitleResults.", this.SubtitleResults);

    }
}

