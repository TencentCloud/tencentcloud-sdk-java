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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PhoneDetect extends AbstractModel{

    /**
    * 恶意类型
100：正常
21000：综合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EvilType")
    @Expose
    private Long EvilType;

    /**
    * 特征中文描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Labels")
    @Expose
    private String [] Labels;

    /**
    * 分值范围 0-100，分数越高倾向越明显
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Score")
    @Expose
    private Long Score;

    /**
    * 处置判定 0：正常 1：可疑
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HitFlag")
    @Expose
    private Long HitFlag;

    /**
     * Get 恶意类型
100：正常
21000：综合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EvilType 恶意类型
100：正常
21000：综合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEvilType() {
        return this.EvilType;
    }

    /**
     * Set 恶意类型
100：正常
21000：综合
注意：此字段可能返回 null，表示取不到有效值。
     * @param EvilType 恶意类型
100：正常
21000：综合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEvilType(Long EvilType) {
        this.EvilType = EvilType;
    }

    /**
     * Get 特征中文描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Labels 特征中文描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 特征中文描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Labels 特征中文描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabels(String [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 分值范围 0-100，分数越高倾向越明显
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Score 分值范围 0-100，分数越高倾向越明显
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScore() {
        return this.Score;
    }

    /**
     * Set 分值范围 0-100，分数越高倾向越明显
注意：此字段可能返回 null，表示取不到有效值。
     * @param Score 分值范围 0-100，分数越高倾向越明显
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScore(Long Score) {
        this.Score = Score;
    }

    /**
     * Get 处置判定 0：正常 1：可疑
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HitFlag 处置判定 0：正常 1：可疑
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHitFlag() {
        return this.HitFlag;
    }

    /**
     * Set 处置判定 0：正常 1：可疑
注意：此字段可能返回 null，表示取不到有效值。
     * @param HitFlag 处置判定 0：正常 1：可疑
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHitFlag(Long HitFlag) {
        this.HitFlag = HitFlag;
    }

    public PhoneDetect() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PhoneDetect(PhoneDetect source) {
        if (source.EvilType != null) {
            this.EvilType = new Long(source.EvilType);
        }
        if (source.Labels != null) {
            this.Labels = new String[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new String(source.Labels[i]);
            }
        }
        if (source.Score != null) {
            this.Score = new Long(source.Score);
        }
        if (source.HitFlag != null) {
            this.HitFlag = new Long(source.HitFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EvilType", this.EvilType);
        this.setParamArraySimple(map, prefix + "Labels.", this.Labels);
        this.setParamSimple(map, prefix + "Score", this.Score);
        this.setParamSimple(map, prefix + "HitFlag", this.HitFlag);

    }
}

