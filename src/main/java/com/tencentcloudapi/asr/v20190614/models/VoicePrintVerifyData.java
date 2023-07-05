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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoicePrintVerifyData extends AbstractModel{

    /**
    * 说话人id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoicePrintId")
    @Expose
    private String VoicePrintId;

    /**
    * 匹配度 取值范围(0.0 - 100.0)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Score")
    @Expose
    private String Score;

    /**
    * 验证结果 0: 未通过 1: 通过
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Decision")
    @Expose
    private Long Decision;

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
     * Get 匹配度 取值范围(0.0 - 100.0)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Score 匹配度 取值范围(0.0 - 100.0)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScore() {
        return this.Score;
    }

    /**
     * Set 匹配度 取值范围(0.0 - 100.0)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Score 匹配度 取值范围(0.0 - 100.0)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScore(String Score) {
        this.Score = Score;
    }

    /**
     * Get 验证结果 0: 未通过 1: 通过
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Decision 验证结果 0: 未通过 1: 通过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDecision() {
        return this.Decision;
    }

    /**
     * Set 验证结果 0: 未通过 1: 通过
注意：此字段可能返回 null，表示取不到有效值。
     * @param Decision 验证结果 0: 未通过 1: 通过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDecision(Long Decision) {
        this.Decision = Decision;
    }

    public VoicePrintVerifyData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VoicePrintVerifyData(VoicePrintVerifyData source) {
        if (source.VoicePrintId != null) {
            this.VoicePrintId = new String(source.VoicePrintId);
        }
        if (source.Score != null) {
            this.Score = new String(source.Score);
        }
        if (source.Decision != null) {
            this.Decision = new Long(source.Decision);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VoicePrintId", this.VoicePrintId);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "Decision", this.Decision);

    }
}

