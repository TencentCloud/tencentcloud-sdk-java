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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KnowledgeModelConfig extends AbstractModel {

    /**
    * 向量模型，该字段只有共享知识库有，应用知识库没有
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EmbeddingModel")
    @Expose
    private String EmbeddingModel;

    /**
    * 问答对生成模型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QaExtractModel")
    @Expose
    private String QaExtractModel;

    /**
    * schema生成模型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchemaModel")
    @Expose
    private String SchemaModel;

    /**
     * Get 向量模型，该字段只有共享知识库有，应用知识库没有
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EmbeddingModel 向量模型，该字段只有共享知识库有，应用知识库没有
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEmbeddingModel() {
        return this.EmbeddingModel;
    }

    /**
     * Set 向量模型，该字段只有共享知识库有，应用知识库没有
注意：此字段可能返回 null，表示取不到有效值。
     * @param EmbeddingModel 向量模型，该字段只有共享知识库有，应用知识库没有
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmbeddingModel(String EmbeddingModel) {
        this.EmbeddingModel = EmbeddingModel;
    }

    /**
     * Get 问答对生成模型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QaExtractModel 问答对生成模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQaExtractModel() {
        return this.QaExtractModel;
    }

    /**
     * Set 问答对生成模型
注意：此字段可能返回 null，表示取不到有效值。
     * @param QaExtractModel 问答对生成模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQaExtractModel(String QaExtractModel) {
        this.QaExtractModel = QaExtractModel;
    }

    /**
     * Get schema生成模型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchemaModel schema生成模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchemaModel() {
        return this.SchemaModel;
    }

    /**
     * Set schema生成模型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchemaModel schema生成模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchemaModel(String SchemaModel) {
        this.SchemaModel = SchemaModel;
    }

    public KnowledgeModelConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeModelConfig(KnowledgeModelConfig source) {
        if (source.EmbeddingModel != null) {
            this.EmbeddingModel = new String(source.EmbeddingModel);
        }
        if (source.QaExtractModel != null) {
            this.QaExtractModel = new String(source.QaExtractModel);
        }
        if (source.SchemaModel != null) {
            this.SchemaModel = new String(source.SchemaModel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EmbeddingModel", this.EmbeddingModel);
        this.setParamSimple(map, prefix + "QaExtractModel", this.QaExtractModel);
        this.setParamSimple(map, prefix + "SchemaModel", this.SchemaModel);

    }
}

