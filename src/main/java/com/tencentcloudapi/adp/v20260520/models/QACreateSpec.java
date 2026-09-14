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

public class QACreateSpec extends AbstractModel {

    /**
    * <p>问题</p>
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * <p>答案</p>
    */
    @SerializedName("Answer")
    @Expose
    private String Answer;

    /**
    * <p>分类 ID</p>
    */
    @SerializedName("CategoryId")
    @Expose
    private String CategoryId;

    /**
    * <p>关联文档 ID</p>
    */
    @SerializedName("DocId")
    @Expose
    private String DocId;

    /**
    * <p>知识生效作用域<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>停用</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>仅开发域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>仅发布域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>全域</td></tr></tbody></table></p>
    */
    @SerializedName("EffectiveDomain")
    @Expose
    private Long EffectiveDomain;

    /**
    * <p>过期策略（有效时间与超过有效时间后的行为）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpirationPolicy")
    @Expose
    private ExpirationPolicy ExpirationPolicy;

    /**
    * <p>适用范围（标签条件）</p>
    */
    @SerializedName("LabelRefList")
    @Expose
    private LabelRefIdentity [] LabelRefList;

    /**
    * <p>问题描述</p>
    */
    @SerializedName("QuestionDescription")
    @Expose
    private String QuestionDescription;

    /**
    * <p>相似问列表</p>
    */
    @SerializedName("SimilarQuestionList")
    @Expose
    private String [] SimilarQuestionList;

    /**
     * Get <p>问题</p> 
     * @return Question <p>问题</p>
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set <p>问题</p>
     * @param Question <p>问题</p>
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get <p>答案</p> 
     * @return Answer <p>答案</p>
     */
    public String getAnswer() {
        return this.Answer;
    }

    /**
     * Set <p>答案</p>
     * @param Answer <p>答案</p>
     */
    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    /**
     * Get <p>分类 ID</p> 
     * @return CategoryId <p>分类 ID</p>
     */
    public String getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set <p>分类 ID</p>
     * @param CategoryId <p>分类 ID</p>
     */
    public void setCategoryId(String CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get <p>关联文档 ID</p> 
     * @return DocId <p>关联文档 ID</p>
     */
    public String getDocId() {
        return this.DocId;
    }

    /**
     * Set <p>关联文档 ID</p>
     * @param DocId <p>关联文档 ID</p>
     */
    public void setDocId(String DocId) {
        this.DocId = DocId;
    }

    /**
     * Get <p>知识生效作用域<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>停用</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>仅开发域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>仅发布域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>全域</td></tr></tbody></table></p> 
     * @return EffectiveDomain <p>知识生效作用域<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>停用</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>仅开发域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>仅发布域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>全域</td></tr></tbody></table></p>
     */
    public Long getEffectiveDomain() {
        return this.EffectiveDomain;
    }

    /**
     * Set <p>知识生效作用域<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>停用</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>仅开发域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>仅发布域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>全域</td></tr></tbody></table></p>
     * @param EffectiveDomain <p>知识生效作用域<table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_UNKNOWN</td><td>0</td><td></td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_NONE</td><td>1</td><td>停用</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_DEV</td><td>2</td><td>仅开发域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_RELEASE</td><td>3</td><td>仅发布域</td></tr><tr><td>KNOWLEDGE_EFFECTIVE_DOMAIN_ALL</td><td>4</td><td>全域</td></tr></tbody></table></p>
     */
    public void setEffectiveDomain(Long EffectiveDomain) {
        this.EffectiveDomain = EffectiveDomain;
    }

    /**
     * Get <p>过期策略（有效时间与超过有效时间后的行为）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpirationPolicy <p>过期策略（有效时间与超过有效时间后的行为）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExpirationPolicy getExpirationPolicy() {
        return this.ExpirationPolicy;
    }

    /**
     * Set <p>过期策略（有效时间与超过有效时间后的行为）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpirationPolicy <p>过期策略（有效时间与超过有效时间后的行为）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpirationPolicy(ExpirationPolicy ExpirationPolicy) {
        this.ExpirationPolicy = ExpirationPolicy;
    }

    /**
     * Get <p>适用范围（标签条件）</p> 
     * @return LabelRefList <p>适用范围（标签条件）</p>
     */
    public LabelRefIdentity [] getLabelRefList() {
        return this.LabelRefList;
    }

    /**
     * Set <p>适用范围（标签条件）</p>
     * @param LabelRefList <p>适用范围（标签条件）</p>
     */
    public void setLabelRefList(LabelRefIdentity [] LabelRefList) {
        this.LabelRefList = LabelRefList;
    }

    /**
     * Get <p>问题描述</p> 
     * @return QuestionDescription <p>问题描述</p>
     */
    public String getQuestionDescription() {
        return this.QuestionDescription;
    }

    /**
     * Set <p>问题描述</p>
     * @param QuestionDescription <p>问题描述</p>
     */
    public void setQuestionDescription(String QuestionDescription) {
        this.QuestionDescription = QuestionDescription;
    }

    /**
     * Get <p>相似问列表</p> 
     * @return SimilarQuestionList <p>相似问列表</p>
     */
    public String [] getSimilarQuestionList() {
        return this.SimilarQuestionList;
    }

    /**
     * Set <p>相似问列表</p>
     * @param SimilarQuestionList <p>相似问列表</p>
     */
    public void setSimilarQuestionList(String [] SimilarQuestionList) {
        this.SimilarQuestionList = SimilarQuestionList;
    }

    public QACreateSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QACreateSpec(QACreateSpec source) {
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.Answer != null) {
            this.Answer = new String(source.Answer);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new String(source.CategoryId);
        }
        if (source.DocId != null) {
            this.DocId = new String(source.DocId);
        }
        if (source.EffectiveDomain != null) {
            this.EffectiveDomain = new Long(source.EffectiveDomain);
        }
        if (source.ExpirationPolicy != null) {
            this.ExpirationPolicy = new ExpirationPolicy(source.ExpirationPolicy);
        }
        if (source.LabelRefList != null) {
            this.LabelRefList = new LabelRefIdentity[source.LabelRefList.length];
            for (int i = 0; i < source.LabelRefList.length; i++) {
                this.LabelRefList[i] = new LabelRefIdentity(source.LabelRefList[i]);
            }
        }
        if (source.QuestionDescription != null) {
            this.QuestionDescription = new String(source.QuestionDescription);
        }
        if (source.SimilarQuestionList != null) {
            this.SimilarQuestionList = new String[source.SimilarQuestionList.length];
            for (int i = 0; i < source.SimilarQuestionList.length; i++) {
                this.SimilarQuestionList[i] = new String(source.SimilarQuestionList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "Answer", this.Answer);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "DocId", this.DocId);
        this.setParamSimple(map, prefix + "EffectiveDomain", this.EffectiveDomain);
        this.setParamObj(map, prefix + "ExpirationPolicy.", this.ExpirationPolicy);
        this.setParamArrayObj(map, prefix + "LabelRefList.", this.LabelRefList);
        this.setParamSimple(map, prefix + "QuestionDescription", this.QuestionDescription);
        this.setParamArraySimple(map, prefix + "SimilarQuestionList.", this.SimilarQuestionList);

    }
}

