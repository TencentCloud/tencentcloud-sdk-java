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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QASummary extends AbstractModel {

    /**
    * <p>所属分类路径（包含分类 ID、从根节点开始的分类 ID 路径和分类名称路径）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CategoryPath")
    @Expose
    private CategoryPath CategoryPath;

    /**
    * <p>知识生效范围</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KnowledgeScope")
    @Expose
    private KnowledgeScope KnowledgeScope;

    /**
    * <p>生命周期信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Lifecycle")
    @Expose
    private QALifecycle Lifecycle;

    /**
    * <p>元信息（问题/答案/大小统计）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metadata")
    @Expose
    private QAMetadata Metadata;

    /**
    * <p>操作者信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperatorInfo")
    @Expose
    private QAOperator OperatorInfo;

    /**
    * <p>QA ID</p>
    */
    @SerializedName("QaId")
    @Expose
    private String QaId;

    /**
    * <p>相似问统计</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SimilarQuestion")
    @Expose
    private SimilarQuestionStat SimilarQuestion;

    /**
    * <p>来源信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceInfo")
    @Expose
    private QASourceInfo SourceInfo;

    /**
     * Get <p>所属分类路径（包含分类 ID、从根节点开始的分类 ID 路径和分类名称路径）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CategoryPath <p>所属分类路径（包含分类 ID、从根节点开始的分类 ID 路径和分类名称路径）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CategoryPath getCategoryPath() {
        return this.CategoryPath;
    }

    /**
     * Set <p>所属分类路径（包含分类 ID、从根节点开始的分类 ID 路径和分类名称路径）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CategoryPath <p>所属分类路径（包含分类 ID、从根节点开始的分类 ID 路径和分类名称路径）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategoryPath(CategoryPath CategoryPath) {
        this.CategoryPath = CategoryPath;
    }

    /**
     * Get <p>知识生效范围</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KnowledgeScope <p>知识生效范围</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KnowledgeScope getKnowledgeScope() {
        return this.KnowledgeScope;
    }

    /**
     * Set <p>知识生效范围</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param KnowledgeScope <p>知识生效范围</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKnowledgeScope(KnowledgeScope KnowledgeScope) {
        this.KnowledgeScope = KnowledgeScope;
    }

    /**
     * Get <p>生命周期信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Lifecycle <p>生命周期信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QALifecycle getLifecycle() {
        return this.Lifecycle;
    }

    /**
     * Set <p>生命周期信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Lifecycle <p>生命周期信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLifecycle(QALifecycle Lifecycle) {
        this.Lifecycle = Lifecycle;
    }

    /**
     * Get <p>元信息（问题/答案/大小统计）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Metadata <p>元信息（问题/答案/大小统计）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QAMetadata getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>元信息（问题/答案/大小统计）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Metadata <p>元信息（问题/答案/大小统计）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetadata(QAMetadata Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get <p>操作者信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperatorInfo <p>操作者信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QAOperator getOperatorInfo() {
        return this.OperatorInfo;
    }

    /**
     * Set <p>操作者信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperatorInfo <p>操作者信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperatorInfo(QAOperator OperatorInfo) {
        this.OperatorInfo = OperatorInfo;
    }

    /**
     * Get <p>QA ID</p> 
     * @return QaId <p>QA ID</p>
     */
    public String getQaId() {
        return this.QaId;
    }

    /**
     * Set <p>QA ID</p>
     * @param QaId <p>QA ID</p>
     */
    public void setQaId(String QaId) {
        this.QaId = QaId;
    }

    /**
     * Get <p>相似问统计</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SimilarQuestion <p>相似问统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SimilarQuestionStat getSimilarQuestion() {
        return this.SimilarQuestion;
    }

    /**
     * Set <p>相似问统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SimilarQuestion <p>相似问统计</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSimilarQuestion(SimilarQuestionStat SimilarQuestion) {
        this.SimilarQuestion = SimilarQuestion;
    }

    /**
     * Get <p>来源信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceInfo <p>来源信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QASourceInfo getSourceInfo() {
        return this.SourceInfo;
    }

    /**
     * Set <p>来源信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceInfo <p>来源信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceInfo(QASourceInfo SourceInfo) {
        this.SourceInfo = SourceInfo;
    }

    public QASummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QASummary(QASummary source) {
        if (source.CategoryPath != null) {
            this.CategoryPath = new CategoryPath(source.CategoryPath);
        }
        if (source.KnowledgeScope != null) {
            this.KnowledgeScope = new KnowledgeScope(source.KnowledgeScope);
        }
        if (source.Lifecycle != null) {
            this.Lifecycle = new QALifecycle(source.Lifecycle);
        }
        if (source.Metadata != null) {
            this.Metadata = new QAMetadata(source.Metadata);
        }
        if (source.OperatorInfo != null) {
            this.OperatorInfo = new QAOperator(source.OperatorInfo);
        }
        if (source.QaId != null) {
            this.QaId = new String(source.QaId);
        }
        if (source.SimilarQuestion != null) {
            this.SimilarQuestion = new SimilarQuestionStat(source.SimilarQuestion);
        }
        if (source.SourceInfo != null) {
            this.SourceInfo = new QASourceInfo(source.SourceInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CategoryPath.", this.CategoryPath);
        this.setParamObj(map, prefix + "KnowledgeScope.", this.KnowledgeScope);
        this.setParamObj(map, prefix + "Lifecycle.", this.Lifecycle);
        this.setParamObj(map, prefix + "Metadata.", this.Metadata);
        this.setParamObj(map, prefix + "OperatorInfo.", this.OperatorInfo);
        this.setParamSimple(map, prefix + "QaId", this.QaId);
        this.setParamObj(map, prefix + "SimilarQuestion.", this.SimilarQuestion);
        this.setParamObj(map, prefix + "SourceInfo.", this.SourceInfo);

    }
}

