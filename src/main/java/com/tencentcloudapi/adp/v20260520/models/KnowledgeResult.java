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

public class KnowledgeResult extends AbstractModel {

    /**
    * <p>置信度</p>
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * <p>命中知识类型：1=问答，2=文档片段，3=数据库，4=图谱<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_QA</td><td>1</td><td>问答</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_DOC</td><td>2</td><td>文档片段</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_DB</td><td>3</td><td>数据库</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_GRAPH</td><td>4</td><td>图谱</td></tr></tbody></table></p>
    */
    @SerializedName("KnowledgeType")
    @Expose
    private Long KnowledgeType;

    /**
    * <p>召回类型列表</p>
    */
    @SerializedName("RecallTypeList")
    @Expose
    private Long [] RecallTypeList;

    /**
    * <p>结果负载</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultPayload")
    @Expose
    private SearchResultPayload ResultPayload;

    /**
    * <p>检索结果类型<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>SEARCH_RESULT_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_RESULT_TYPE_RETRIEVAL</td><td>1</td><td>普通检索结果</td></tr><tr><td>SEARCH_RESULT_TYPE_TEXT_TO_SQL</td><td>2</td><td>text2sql 结果</td></tr><tr><td>SEARCH_RESULT_TYPE_IMAGE_SEARCH_IMAGE</td><td>3</td><td></td></tr><tr><td>SEARCH_RESULT_TYPE_TEXT_SEARCH_IMAGE</td><td>4</td><td></td></tr></tbody></table></p>
    */
    @SerializedName("ResultType")
    @Expose
    private Long ResultType;

    /**
    * <p>相似问额外信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SimilarQuestionExtra")
    @Expose
    private SimilarQuestionExtra SimilarQuestionExtra;

    /**
    * <p>知识片段基础信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnippetProfile")
    @Expose
    private KnowledgeSnippetProfile SnippetProfile;

    /**
    * <p>知识来源信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceInfo")
    @Expose
    private KnowledgeSource SourceInfo;

    /**
     * Get <p>置信度</p> 
     * @return Confidence <p>置信度</p>
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set <p>置信度</p>
     * @param Confidence <p>置信度</p>
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get <p>命中知识类型：1=问答，2=文档片段，3=数据库，4=图谱<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_QA</td><td>1</td><td>问答</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_DOC</td><td>2</td><td>文档片段</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_DB</td><td>3</td><td>数据库</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_GRAPH</td><td>4</td><td>图谱</td></tr></tbody></table></p> 
     * @return KnowledgeType <p>命中知识类型：1=问答，2=文档片段，3=数据库，4=图谱<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_QA</td><td>1</td><td>问答</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_DOC</td><td>2</td><td>文档片段</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_DB</td><td>3</td><td>数据库</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_GRAPH</td><td>4</td><td>图谱</td></tr></tbody></table></p>
     */
    public Long getKnowledgeType() {
        return this.KnowledgeType;
    }

    /**
     * Set <p>命中知识类型：1=问答，2=文档片段，3=数据库，4=图谱<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_QA</td><td>1</td><td>问答</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_DOC</td><td>2</td><td>文档片段</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_DB</td><td>3</td><td>数据库</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_GRAPH</td><td>4</td><td>图谱</td></tr></tbody></table></p>
     * @param KnowledgeType <p>命中知识类型：1=问答，2=文档片段，3=数据库，4=图谱<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_QA</td><td>1</td><td>问答</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_DOC</td><td>2</td><td>文档片段</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_DB</td><td>3</td><td>数据库</td></tr><tr><td>KNOWLEDGE_SOURCE_TYPE_GRAPH</td><td>4</td><td>图谱</td></tr></tbody></table></p>
     */
    public void setKnowledgeType(Long KnowledgeType) {
        this.KnowledgeType = KnowledgeType;
    }

    /**
     * Get <p>召回类型列表</p> 
     * @return RecallTypeList <p>召回类型列表</p>
     */
    public Long [] getRecallTypeList() {
        return this.RecallTypeList;
    }

    /**
     * Set <p>召回类型列表</p>
     * @param RecallTypeList <p>召回类型列表</p>
     */
    public void setRecallTypeList(Long [] RecallTypeList) {
        this.RecallTypeList = RecallTypeList;
    }

    /**
     * Get <p>结果负载</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultPayload <p>结果负载</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SearchResultPayload getResultPayload() {
        return this.ResultPayload;
    }

    /**
     * Set <p>结果负载</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultPayload <p>结果负载</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultPayload(SearchResultPayload ResultPayload) {
        this.ResultPayload = ResultPayload;
    }

    /**
     * Get <p>检索结果类型<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>SEARCH_RESULT_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_RESULT_TYPE_RETRIEVAL</td><td>1</td><td>普通检索结果</td></tr><tr><td>SEARCH_RESULT_TYPE_TEXT_TO_SQL</td><td>2</td><td>text2sql 结果</td></tr><tr><td>SEARCH_RESULT_TYPE_IMAGE_SEARCH_IMAGE</td><td>3</td><td></td></tr><tr><td>SEARCH_RESULT_TYPE_TEXT_SEARCH_IMAGE</td><td>4</td><td></td></tr></tbody></table></p> 
     * @return ResultType <p>检索结果类型<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>SEARCH_RESULT_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_RESULT_TYPE_RETRIEVAL</td><td>1</td><td>普通检索结果</td></tr><tr><td>SEARCH_RESULT_TYPE_TEXT_TO_SQL</td><td>2</td><td>text2sql 结果</td></tr><tr><td>SEARCH_RESULT_TYPE_IMAGE_SEARCH_IMAGE</td><td>3</td><td></td></tr><tr><td>SEARCH_RESULT_TYPE_TEXT_SEARCH_IMAGE</td><td>4</td><td></td></tr></tbody></table></p>
     */
    public Long getResultType() {
        return this.ResultType;
    }

    /**
     * Set <p>检索结果类型<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>SEARCH_RESULT_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_RESULT_TYPE_RETRIEVAL</td><td>1</td><td>普通检索结果</td></tr><tr><td>SEARCH_RESULT_TYPE_TEXT_TO_SQL</td><td>2</td><td>text2sql 结果</td></tr><tr><td>SEARCH_RESULT_TYPE_IMAGE_SEARCH_IMAGE</td><td>3</td><td></td></tr><tr><td>SEARCH_RESULT_TYPE_TEXT_SEARCH_IMAGE</td><td>4</td><td></td></tr></tbody></table></p>
     * @param ResultType <p>检索结果类型<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>SEARCH_RESULT_TYPE_UNKNOWN</td><td>0</td><td></td></tr><tr><td>SEARCH_RESULT_TYPE_RETRIEVAL</td><td>1</td><td>普通检索结果</td></tr><tr><td>SEARCH_RESULT_TYPE_TEXT_TO_SQL</td><td>2</td><td>text2sql 结果</td></tr><tr><td>SEARCH_RESULT_TYPE_IMAGE_SEARCH_IMAGE</td><td>3</td><td></td></tr><tr><td>SEARCH_RESULT_TYPE_TEXT_SEARCH_IMAGE</td><td>4</td><td></td></tr></tbody></table></p>
     */
    public void setResultType(Long ResultType) {
        this.ResultType = ResultType;
    }

    /**
     * Get <p>相似问额外信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SimilarQuestionExtra <p>相似问额外信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SimilarQuestionExtra getSimilarQuestionExtra() {
        return this.SimilarQuestionExtra;
    }

    /**
     * Set <p>相似问额外信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SimilarQuestionExtra <p>相似问额外信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSimilarQuestionExtra(SimilarQuestionExtra SimilarQuestionExtra) {
        this.SimilarQuestionExtra = SimilarQuestionExtra;
    }

    /**
     * Get <p>知识片段基础信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnippetProfile <p>知识片段基础信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KnowledgeSnippetProfile getSnippetProfile() {
        return this.SnippetProfile;
    }

    /**
     * Set <p>知识片段基础信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnippetProfile <p>知识片段基础信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnippetProfile(KnowledgeSnippetProfile SnippetProfile) {
        this.SnippetProfile = SnippetProfile;
    }

    /**
     * Get <p>知识来源信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceInfo <p>知识来源信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public KnowledgeSource getSourceInfo() {
        return this.SourceInfo;
    }

    /**
     * Set <p>知识来源信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceInfo <p>知识来源信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceInfo(KnowledgeSource SourceInfo) {
        this.SourceInfo = SourceInfo;
    }

    public KnowledgeResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeResult(KnowledgeResult source) {
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.KnowledgeType != null) {
            this.KnowledgeType = new Long(source.KnowledgeType);
        }
        if (source.RecallTypeList != null) {
            this.RecallTypeList = new Long[source.RecallTypeList.length];
            for (int i = 0; i < source.RecallTypeList.length; i++) {
                this.RecallTypeList[i] = new Long(source.RecallTypeList[i]);
            }
        }
        if (source.ResultPayload != null) {
            this.ResultPayload = new SearchResultPayload(source.ResultPayload);
        }
        if (source.ResultType != null) {
            this.ResultType = new Long(source.ResultType);
        }
        if (source.SimilarQuestionExtra != null) {
            this.SimilarQuestionExtra = new SimilarQuestionExtra(source.SimilarQuestionExtra);
        }
        if (source.SnippetProfile != null) {
            this.SnippetProfile = new KnowledgeSnippetProfile(source.SnippetProfile);
        }
        if (source.SourceInfo != null) {
            this.SourceInfo = new KnowledgeSource(source.SourceInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "KnowledgeType", this.KnowledgeType);
        this.setParamArraySimple(map, prefix + "RecallTypeList.", this.RecallTypeList);
        this.setParamObj(map, prefix + "ResultPayload.", this.ResultPayload);
        this.setParamSimple(map, prefix + "ResultType", this.ResultType);
        this.setParamObj(map, prefix + "SimilarQuestionExtra.", this.SimilarQuestionExtra);
        this.setParamObj(map, prefix + "SnippetProfile.", this.SnippetProfile);
        this.setParamObj(map, prefix + "SourceInfo.", this.SourceInfo);

    }
}

