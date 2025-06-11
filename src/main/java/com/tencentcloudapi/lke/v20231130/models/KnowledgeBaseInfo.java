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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KnowledgeBaseInfo extends AbstractModel {

    /**
    * 共享知识库业务ID
    */
    @SerializedName("KnowledgeBizId")
    @Expose
    private String KnowledgeBizId;

    /**
    * 共享知识库名称
    */
    @SerializedName("KnowledgeName")
    @Expose
    private String KnowledgeName;

    /**
    * 共享知识库描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KnowledgeDescription")
    @Expose
    private String KnowledgeDescription;

    /**
    * Embedding模型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EmbeddingModel")
    @Expose
    private String EmbeddingModel;

    /**
    * 问答提取模型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QaExtractModel")
    @Expose
    private String QaExtractModel;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 共享知识库业务ID 
     * @return KnowledgeBizId 共享知识库业务ID
     */
    public String getKnowledgeBizId() {
        return this.KnowledgeBizId;
    }

    /**
     * Set 共享知识库业务ID
     * @param KnowledgeBizId 共享知识库业务ID
     */
    public void setKnowledgeBizId(String KnowledgeBizId) {
        this.KnowledgeBizId = KnowledgeBizId;
    }

    /**
     * Get 共享知识库名称 
     * @return KnowledgeName 共享知识库名称
     */
    public String getKnowledgeName() {
        return this.KnowledgeName;
    }

    /**
     * Set 共享知识库名称
     * @param KnowledgeName 共享知识库名称
     */
    public void setKnowledgeName(String KnowledgeName) {
        this.KnowledgeName = KnowledgeName;
    }

    /**
     * Get 共享知识库描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KnowledgeDescription 共享知识库描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKnowledgeDescription() {
        return this.KnowledgeDescription;
    }

    /**
     * Set 共享知识库描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param KnowledgeDescription 共享知识库描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKnowledgeDescription(String KnowledgeDescription) {
        this.KnowledgeDescription = KnowledgeDescription;
    }

    /**
     * Get Embedding模型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EmbeddingModel Embedding模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEmbeddingModel() {
        return this.EmbeddingModel;
    }

    /**
     * Set Embedding模型
注意：此字段可能返回 null，表示取不到有效值。
     * @param EmbeddingModel Embedding模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmbeddingModel(String EmbeddingModel) {
        this.EmbeddingModel = EmbeddingModel;
    }

    /**
     * Get 问答提取模型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QaExtractModel 问答提取模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQaExtractModel() {
        return this.QaExtractModel;
    }

    /**
     * Set 问答提取模型
注意：此字段可能返回 null，表示取不到有效值。
     * @param QaExtractModel 问答提取模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQaExtractModel(String QaExtractModel) {
        this.QaExtractModel = QaExtractModel;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public KnowledgeBaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeBaseInfo(KnowledgeBaseInfo source) {
        if (source.KnowledgeBizId != null) {
            this.KnowledgeBizId = new String(source.KnowledgeBizId);
        }
        if (source.KnowledgeName != null) {
            this.KnowledgeName = new String(source.KnowledgeName);
        }
        if (source.KnowledgeDescription != null) {
            this.KnowledgeDescription = new String(source.KnowledgeDescription);
        }
        if (source.EmbeddingModel != null) {
            this.EmbeddingModel = new String(source.EmbeddingModel);
        }
        if (source.QaExtractModel != null) {
            this.QaExtractModel = new String(source.QaExtractModel);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KnowledgeBizId", this.KnowledgeBizId);
        this.setParamSimple(map, prefix + "KnowledgeName", this.KnowledgeName);
        this.setParamSimple(map, prefix + "KnowledgeDescription", this.KnowledgeDescription);
        this.setParamSimple(map, prefix + "EmbeddingModel", this.EmbeddingModel);
        this.setParamSimple(map, prefix + "QaExtractModel", this.QaExtractModel);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

