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
package com.tencentcloudapi.taf.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputRecognizeTargetAudienceValue extends AbstractModel{

    /**
    * 模型ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelId")
    @Expose
    private Long ModelId;

    /**
    * 是否正常返回结果
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsFound")
    @Expose
    private Long IsFound;

    /**
    * 返回分值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Score")
    @Expose
    private Float Score;

    /**
     * Get 模型ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelId 模型ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getModelId() {
        return this.ModelId;
    }

    /**
     * Set 模型ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelId 模型ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelId(Long ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 是否正常返回结果
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsFound 是否正常返回结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsFound() {
        return this.IsFound;
    }

    /**
     * Set 是否正常返回结果
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsFound 是否正常返回结果
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsFound(Long IsFound) {
        this.IsFound = IsFound;
    }

    /**
     * Get 返回分值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Score 返回分值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getScore() {
        return this.Score;
    }

    /**
     * Set 返回分值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Score 返回分值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScore(Float Score) {
        this.Score = Score;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "IsFound", this.IsFound);
        this.setParamSimple(map, prefix + "Score", this.Score);

    }
}

