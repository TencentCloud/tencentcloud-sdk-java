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
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RerankResult extends AbstractModel {

    /**
    * 对应的doc在输入候选doc数组中的位置索引值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * 相似度分数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RelevanceScore")
    @Expose
    private Float RelevanceScore;

    /**
    * doc原文内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Document")
    @Expose
    private String Document;

    /**
     * Get 对应的doc在输入候选doc数组中的位置索引值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Index 对应的doc在输入候选doc数组中的位置索引值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 对应的doc在输入候选doc数组中的位置索引值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Index 对应的doc在输入候选doc数组中的位置索引值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * Get 相似度分数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RelevanceScore 相似度分数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getRelevanceScore() {
        return this.RelevanceScore;
    }

    /**
     * Set 相似度分数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RelevanceScore 相似度分数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRelevanceScore(Float RelevanceScore) {
        this.RelevanceScore = RelevanceScore;
    }

    /**
     * Get doc原文内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Document doc原文内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDocument() {
        return this.Document;
    }

    /**
     * Set doc原文内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Document doc原文内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocument(String Document) {
        this.Document = Document;
    }

    public RerankResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RerankResult(RerankResult source) {
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
        if (source.RelevanceScore != null) {
            this.RelevanceScore = new Float(source.RelevanceScore);
        }
        if (source.Document != null) {
            this.Document = new String(source.Document);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "RelevanceScore", this.RelevanceScore);
        this.setParamSimple(map, prefix + "Document", this.Document);

    }
}

