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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateQARequest extends AbstractModel {

    /**
    * 知识库ID
    */
    @SerializedName("KnowledgeBaseId")
    @Expose
    private String KnowledgeBaseId;

    /**
    * 问题，最大1000个英文字符
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * 答案，最大4000个英文字符
    */
    @SerializedName("Answer")
    @Expose
    private String Answer;

    /**
    * 属性标签
    */
    @SerializedName("AttributeLabels")
    @Expose
    private AttributeLabelReferItem [] AttributeLabels;

    /**
     * Get 知识库ID 
     * @return KnowledgeBaseId 知识库ID
     */
    public String getKnowledgeBaseId() {
        return this.KnowledgeBaseId;
    }

    /**
     * Set 知识库ID
     * @param KnowledgeBaseId 知识库ID
     */
    public void setKnowledgeBaseId(String KnowledgeBaseId) {
        this.KnowledgeBaseId = KnowledgeBaseId;
    }

    /**
     * Get 问题，最大1000个英文字符 
     * @return Question 问题，最大1000个英文字符
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set 问题，最大1000个英文字符
     * @param Question 问题，最大1000个英文字符
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get 答案，最大4000个英文字符 
     * @return Answer 答案，最大4000个英文字符
     */
    public String getAnswer() {
        return this.Answer;
    }

    /**
     * Set 答案，最大4000个英文字符
     * @param Answer 答案，最大4000个英文字符
     */
    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    /**
     * Get 属性标签 
     * @return AttributeLabels 属性标签
     */
    public AttributeLabelReferItem [] getAttributeLabels() {
        return this.AttributeLabels;
    }

    /**
     * Set 属性标签
     * @param AttributeLabels 属性标签
     */
    public void setAttributeLabels(AttributeLabelReferItem [] AttributeLabels) {
        this.AttributeLabels = AttributeLabels;
    }

    public CreateQARequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateQARequest(CreateQARequest source) {
        if (source.KnowledgeBaseId != null) {
            this.KnowledgeBaseId = new String(source.KnowledgeBaseId);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.Answer != null) {
            this.Answer = new String(source.Answer);
        }
        if (source.AttributeLabels != null) {
            this.AttributeLabels = new AttributeLabelReferItem[source.AttributeLabels.length];
            for (int i = 0; i < source.AttributeLabels.length; i++) {
                this.AttributeLabels[i] = new AttributeLabelReferItem(source.AttributeLabels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KnowledgeBaseId", this.KnowledgeBaseId);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "Answer", this.Answer);
        this.setParamArrayObj(map, prefix + "AttributeLabels.", this.AttributeLabels);

    }
}

