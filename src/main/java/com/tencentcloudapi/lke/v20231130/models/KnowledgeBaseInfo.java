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
    * 共享知识库类型，0普通，1公众号
    */
    @SerializedName("KnowledgeType")
    @Expose
    private Long KnowledgeType;

    /**
    * 拥有者id
    */
    @SerializedName("OwnerStaffId")
    @Expose
    private String OwnerStaffId;

    /**
    * 知识库文档数量,当前仅支持公众号知识库
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DocTotal")
    @Expose
    private Long DocTotal;

    /**
    * 知识库处理中状态标记，1：向量embedding变更中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessingFlags")
    @Expose
    private Long [] ProcessingFlags;

    /**
    * 知识库拥有者的名字
    */
    @SerializedName("OwnerStaffName")
    @Expose
    private String OwnerStaffName;

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

    /**
     * Get 共享知识库类型，0普通，1公众号 
     * @return KnowledgeType 共享知识库类型，0普通，1公众号
     */
    public Long getKnowledgeType() {
        return this.KnowledgeType;
    }

    /**
     * Set 共享知识库类型，0普通，1公众号
     * @param KnowledgeType 共享知识库类型，0普通，1公众号
     */
    public void setKnowledgeType(Long KnowledgeType) {
        this.KnowledgeType = KnowledgeType;
    }

    /**
     * Get 拥有者id 
     * @return OwnerStaffId 拥有者id
     */
    public String getOwnerStaffId() {
        return this.OwnerStaffId;
    }

    /**
     * Set 拥有者id
     * @param OwnerStaffId 拥有者id
     */
    public void setOwnerStaffId(String OwnerStaffId) {
        this.OwnerStaffId = OwnerStaffId;
    }

    /**
     * Get 知识库文档数量,当前仅支持公众号知识库
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DocTotal 知识库文档数量,当前仅支持公众号知识库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDocTotal() {
        return this.DocTotal;
    }

    /**
     * Set 知识库文档数量,当前仅支持公众号知识库
注意：此字段可能返回 null，表示取不到有效值。
     * @param DocTotal 知识库文档数量,当前仅支持公众号知识库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDocTotal(Long DocTotal) {
        this.DocTotal = DocTotal;
    }

    /**
     * Get 知识库处理中状态标记，1：向量embedding变更中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessingFlags 知识库处理中状态标记，1：向量embedding变更中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getProcessingFlags() {
        return this.ProcessingFlags;
    }

    /**
     * Set 知识库处理中状态标记，1：向量embedding变更中
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessingFlags 知识库处理中状态标记，1：向量embedding变更中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessingFlags(Long [] ProcessingFlags) {
        this.ProcessingFlags = ProcessingFlags;
    }

    /**
     * Get 知识库拥有者的名字 
     * @return OwnerStaffName 知识库拥有者的名字
     */
    public String getOwnerStaffName() {
        return this.OwnerStaffName;
    }

    /**
     * Set 知识库拥有者的名字
     * @param OwnerStaffName 知识库拥有者的名字
     */
    public void setOwnerStaffName(String OwnerStaffName) {
        this.OwnerStaffName = OwnerStaffName;
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
        if (source.KnowledgeType != null) {
            this.KnowledgeType = new Long(source.KnowledgeType);
        }
        if (source.OwnerStaffId != null) {
            this.OwnerStaffId = new String(source.OwnerStaffId);
        }
        if (source.DocTotal != null) {
            this.DocTotal = new Long(source.DocTotal);
        }
        if (source.ProcessingFlags != null) {
            this.ProcessingFlags = new Long[source.ProcessingFlags.length];
            for (int i = 0; i < source.ProcessingFlags.length; i++) {
                this.ProcessingFlags[i] = new Long(source.ProcessingFlags[i]);
            }
        }
        if (source.OwnerStaffName != null) {
            this.OwnerStaffName = new String(source.OwnerStaffName);
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
        this.setParamSimple(map, prefix + "KnowledgeType", this.KnowledgeType);
        this.setParamSimple(map, prefix + "OwnerStaffId", this.OwnerStaffId);
        this.setParamSimple(map, prefix + "DocTotal", this.DocTotal);
        this.setParamArraySimple(map, prefix + "ProcessingFlags.", this.ProcessingFlags);
        this.setParamSimple(map, prefix + "OwnerStaffName", this.OwnerStaffName);

    }
}

