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

public class KnowledgeQaOutput extends AbstractModel {

    /**
    * 输出方式 1：流式 2：非流式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Method")
    @Expose
    private Long Method;

    /**
    * 通用模型回复
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UseGeneralKnowledge")
    @Expose
    private Boolean UseGeneralKnowledge;

    /**
    * 未知回复语，300字符以内
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BareAnswer")
    @Expose
    private String BareAnswer;

    /**
    * 是否展示问题澄清开关
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShowQuestionClarify")
    @Expose
    private Boolean ShowQuestionClarify;

    /**
    * 是否打开问题澄清
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UseQuestionClarify")
    @Expose
    private Boolean UseQuestionClarify;

    /**
    * 问题澄清关键词列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QuestionClarifyKeywords")
    @Expose
    private String [] QuestionClarifyKeywords;

    /**
    * 是否打开推荐问题开关
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UseRecommended")
    @Expose
    private Boolean UseRecommended;

    /**
    * 推荐问模式，0.结合知识库&对话历史推荐问题Prompt(默认) 1.仅结合知识库输出推荐问的prompt
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecommendedPromptMode")
    @Expose
    private Long RecommendedPromptMode;

    /**
    * 输入框按钮配置
    */
    @SerializedName("InputBoxConfig")
    @Expose
    private InputBoxConfig InputBoxConfig;

    /**
     * Get 输出方式 1：流式 2：非流式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Method 输出方式 1：流式 2：非流式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMethod() {
        return this.Method;
    }

    /**
     * Set 输出方式 1：流式 2：非流式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Method 输出方式 1：流式 2：非流式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMethod(Long Method) {
        this.Method = Method;
    }

    /**
     * Get 通用模型回复
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UseGeneralKnowledge 通用模型回复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getUseGeneralKnowledge() {
        return this.UseGeneralKnowledge;
    }

    /**
     * Set 通用模型回复
注意：此字段可能返回 null，表示取不到有效值。
     * @param UseGeneralKnowledge 通用模型回复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUseGeneralKnowledge(Boolean UseGeneralKnowledge) {
        this.UseGeneralKnowledge = UseGeneralKnowledge;
    }

    /**
     * Get 未知回复语，300字符以内
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BareAnswer 未知回复语，300字符以内
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBareAnswer() {
        return this.BareAnswer;
    }

    /**
     * Set 未知回复语，300字符以内
注意：此字段可能返回 null，表示取不到有效值。
     * @param BareAnswer 未知回复语，300字符以内
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBareAnswer(String BareAnswer) {
        this.BareAnswer = BareAnswer;
    }

    /**
     * Get 是否展示问题澄清开关
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShowQuestionClarify 是否展示问题澄清开关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getShowQuestionClarify() {
        return this.ShowQuestionClarify;
    }

    /**
     * Set 是否展示问题澄清开关
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShowQuestionClarify 是否展示问题澄清开关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShowQuestionClarify(Boolean ShowQuestionClarify) {
        this.ShowQuestionClarify = ShowQuestionClarify;
    }

    /**
     * Get 是否打开问题澄清
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UseQuestionClarify 是否打开问题澄清
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getUseQuestionClarify() {
        return this.UseQuestionClarify;
    }

    /**
     * Set 是否打开问题澄清
注意：此字段可能返回 null，表示取不到有效值。
     * @param UseQuestionClarify 是否打开问题澄清
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUseQuestionClarify(Boolean UseQuestionClarify) {
        this.UseQuestionClarify = UseQuestionClarify;
    }

    /**
     * Get 问题澄清关键词列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QuestionClarifyKeywords 问题澄清关键词列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getQuestionClarifyKeywords() {
        return this.QuestionClarifyKeywords;
    }

    /**
     * Set 问题澄清关键词列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param QuestionClarifyKeywords 问题澄清关键词列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuestionClarifyKeywords(String [] QuestionClarifyKeywords) {
        this.QuestionClarifyKeywords = QuestionClarifyKeywords;
    }

    /**
     * Get 是否打开推荐问题开关
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UseRecommended 是否打开推荐问题开关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getUseRecommended() {
        return this.UseRecommended;
    }

    /**
     * Set 是否打开推荐问题开关
注意：此字段可能返回 null，表示取不到有效值。
     * @param UseRecommended 是否打开推荐问题开关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUseRecommended(Boolean UseRecommended) {
        this.UseRecommended = UseRecommended;
    }

    /**
     * Get 推荐问模式，0.结合知识库&对话历史推荐问题Prompt(默认) 1.仅结合知识库输出推荐问的prompt
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecommendedPromptMode 推荐问模式，0.结合知识库&对话历史推荐问题Prompt(默认) 1.仅结合知识库输出推荐问的prompt
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRecommendedPromptMode() {
        return this.RecommendedPromptMode;
    }

    /**
     * Set 推荐问模式，0.结合知识库&对话历史推荐问题Prompt(默认) 1.仅结合知识库输出推荐问的prompt
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecommendedPromptMode 推荐问模式，0.结合知识库&对话历史推荐问题Prompt(默认) 1.仅结合知识库输出推荐问的prompt
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecommendedPromptMode(Long RecommendedPromptMode) {
        this.RecommendedPromptMode = RecommendedPromptMode;
    }

    /**
     * Get 输入框按钮配置 
     * @return InputBoxConfig 输入框按钮配置
     */
    public InputBoxConfig getInputBoxConfig() {
        return this.InputBoxConfig;
    }

    /**
     * Set 输入框按钮配置
     * @param InputBoxConfig 输入框按钮配置
     */
    public void setInputBoxConfig(InputBoxConfig InputBoxConfig) {
        this.InputBoxConfig = InputBoxConfig;
    }

    public KnowledgeQaOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnowledgeQaOutput(KnowledgeQaOutput source) {
        if (source.Method != null) {
            this.Method = new Long(source.Method);
        }
        if (source.UseGeneralKnowledge != null) {
            this.UseGeneralKnowledge = new Boolean(source.UseGeneralKnowledge);
        }
        if (source.BareAnswer != null) {
            this.BareAnswer = new String(source.BareAnswer);
        }
        if (source.ShowQuestionClarify != null) {
            this.ShowQuestionClarify = new Boolean(source.ShowQuestionClarify);
        }
        if (source.UseQuestionClarify != null) {
            this.UseQuestionClarify = new Boolean(source.UseQuestionClarify);
        }
        if (source.QuestionClarifyKeywords != null) {
            this.QuestionClarifyKeywords = new String[source.QuestionClarifyKeywords.length];
            for (int i = 0; i < source.QuestionClarifyKeywords.length; i++) {
                this.QuestionClarifyKeywords[i] = new String(source.QuestionClarifyKeywords[i]);
            }
        }
        if (source.UseRecommended != null) {
            this.UseRecommended = new Boolean(source.UseRecommended);
        }
        if (source.RecommendedPromptMode != null) {
            this.RecommendedPromptMode = new Long(source.RecommendedPromptMode);
        }
        if (source.InputBoxConfig != null) {
            this.InputBoxConfig = new InputBoxConfig(source.InputBoxConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "UseGeneralKnowledge", this.UseGeneralKnowledge);
        this.setParamSimple(map, prefix + "BareAnswer", this.BareAnswer);
        this.setParamSimple(map, prefix + "ShowQuestionClarify", this.ShowQuestionClarify);
        this.setParamSimple(map, prefix + "UseQuestionClarify", this.UseQuestionClarify);
        this.setParamArraySimple(map, prefix + "QuestionClarifyKeywords.", this.QuestionClarifyKeywords);
        this.setParamSimple(map, prefix + "UseRecommended", this.UseRecommended);
        this.setParamSimple(map, prefix + "RecommendedPromptMode", this.RecommendedPromptMode);
        this.setParamObj(map, prefix + "InputBoxConfig.", this.InputBoxConfig);

    }
}

