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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyTop extends AbstractModel {

    /**
    * 相似度打分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Score")
    @Expose
    private String Score;

    /**
    * 说话人id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoicePrintId")
    @Expose
    private String VoicePrintId;

    /**
    * 说话人昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpeakerId")
    @Expose
    private String SpeakerId;

    /**
     * Get 相似度打分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Score 相似度打分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScore() {
        return this.Score;
    }

    /**
     * Set 相似度打分
注意：此字段可能返回 null，表示取不到有效值。
     * @param Score 相似度打分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScore(String Score) {
        this.Score = Score;
    }

    /**
     * Get 说话人id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VoicePrintId 说话人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVoicePrintId() {
        return this.VoicePrintId;
    }

    /**
     * Set 说话人id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VoicePrintId 说话人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoicePrintId(String VoicePrintId) {
        this.VoicePrintId = VoicePrintId;
    }

    /**
     * Get 说话人昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpeakerId 说话人昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpeakerId() {
        return this.SpeakerId;
    }

    /**
     * Set 说话人昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpeakerId 说话人昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpeakerId(String SpeakerId) {
        this.SpeakerId = SpeakerId;
    }

    public VerifyTop() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyTop(VerifyTop source) {
        if (source.Score != null) {
            this.Score = new String(source.Score);
        }
        if (source.VoicePrintId != null) {
            this.VoicePrintId = new String(source.VoicePrintId);
        }
        if (source.SpeakerId != null) {
            this.SpeakerId = new String(source.SpeakerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "VoicePrintId", this.VoicePrintId);
        this.setParamSimple(map, prefix + "SpeakerId", this.SpeakerId);

    }
}

