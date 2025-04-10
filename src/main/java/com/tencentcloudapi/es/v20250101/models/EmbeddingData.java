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

public class EmbeddingData extends AbstractModel {

    /**
    * embedding 内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Embedding")
    @Expose
    private Float [] Embedding;

    /**
    * 索引序号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
     * Get embedding 内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Embedding embedding 内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float [] getEmbedding() {
        return this.Embedding;
    }

    /**
     * Set embedding 内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Embedding embedding 内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmbedding(Float [] Embedding) {
        this.Embedding = Embedding;
    }

    /**
     * Get 索引序号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Index 索引序号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 索引序号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Index 索引序号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    public EmbeddingData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EmbeddingData(EmbeddingData source) {
        if (source.Embedding != null) {
            this.Embedding = new Float[source.Embedding.length];
            for (int i = 0; i < source.Embedding.length; i++) {
                this.Embedding[i] = new Float(source.Embedding[i]);
            }
        }
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Embedding.", this.Embedding);
        this.setParamSimple(map, prefix + "Index", this.Index);

    }
}

