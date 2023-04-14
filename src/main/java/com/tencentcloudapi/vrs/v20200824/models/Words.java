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
package com.tencentcloudapi.vrs.v20200824.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Words extends AbstractModel{

    /**
    * 准确度 (<75则认为不合格)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PronAccuracy")
    @Expose
    private Float PronAccuracy;

    /**
    * 流畅度 (<0.95则认为不合格)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PronFluency")
    @Expose
    private Float PronFluency;

    /**
    * tag: 
0: match  匹配
1: insert   多读
2: delete  少读
3: replace 错读
4: oov  待评估字不在发音评估的词库
5: unknown 未知错误
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tag")
    @Expose
    private Long Tag;

    /**
    * 字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Word")
    @Expose
    private String Word;

    /**
     * Get 准确度 (<75则认为不合格)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PronAccuracy 准确度 (<75则认为不合格)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getPronAccuracy() {
        return this.PronAccuracy;
    }

    /**
     * Set 准确度 (<75则认为不合格)
注意：此字段可能返回 null，表示取不到有效值。
     * @param PronAccuracy 准确度 (<75则认为不合格)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPronAccuracy(Float PronAccuracy) {
        this.PronAccuracy = PronAccuracy;
    }

    /**
     * Get 流畅度 (<0.95则认为不合格)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PronFluency 流畅度 (<0.95则认为不合格)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getPronFluency() {
        return this.PronFluency;
    }

    /**
     * Set 流畅度 (<0.95则认为不合格)
注意：此字段可能返回 null，表示取不到有效值。
     * @param PronFluency 流畅度 (<0.95则认为不合格)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPronFluency(Float PronFluency) {
        this.PronFluency = PronFluency;
    }

    /**
     * Get tag: 
0: match  匹配
1: insert   多读
2: delete  少读
3: replace 错读
4: oov  待评估字不在发音评估的词库
5: unknown 未知错误
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tag tag: 
0: match  匹配
1: insert   多读
2: delete  少读
3: replace 错读
4: oov  待评估字不在发音评估的词库
5: unknown 未知错误
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTag() {
        return this.Tag;
    }

    /**
     * Set tag: 
0: match  匹配
1: insert   多读
2: delete  少读
3: replace 错读
4: oov  待评估字不在发音评估的词库
5: unknown 未知错误
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tag tag: 
0: match  匹配
1: insert   多读
2: delete  少读
3: replace 错读
4: oov  待评估字不在发音评估的词库
5: unknown 未知错误
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTag(Long Tag) {
        this.Tag = Tag;
    }

    /**
     * Get 字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Word 字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWord() {
        return this.Word;
    }

    /**
     * Set 字
注意：此字段可能返回 null，表示取不到有效值。
     * @param Word 字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWord(String Word) {
        this.Word = Word;
    }

    public Words() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Words(Words source) {
        if (source.PronAccuracy != null) {
            this.PronAccuracy = new Float(source.PronAccuracy);
        }
        if (source.PronFluency != null) {
            this.PronFluency = new Float(source.PronFluency);
        }
        if (source.Tag != null) {
            this.Tag = new Long(source.Tag);
        }
        if (source.Word != null) {
            this.Word = new String(source.Word);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PronAccuracy", this.PronAccuracy);
        this.setParamSimple(map, prefix + "PronFluency", this.PronFluency);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "Word", this.Word);

    }
}

