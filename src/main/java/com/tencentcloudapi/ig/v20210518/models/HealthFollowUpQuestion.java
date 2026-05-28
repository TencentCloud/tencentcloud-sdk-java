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
package com.tencentcloudapi.ig.v20210518.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthFollowUpQuestion extends AbstractModel {

    /**
    * <p>追问类型</p>
    */
    @SerializedName("PromptType")
    @Expose
    private String PromptType;

    /**
    * <p>追问选项列表</p>
    */
    @SerializedName("Choices")
    @Expose
    private String [] Choices;

    /**
    * <p>追问题型，单选或多选</p>
    */
    @SerializedName("QuestionType")
    @Expose
    private String QuestionType;

    /**
    * <p>追问特殊类型，如部位题、时间题</p>
    */
    @SerializedName("SpecialType")
    @Expose
    private String SpecialType;

    /**
    * <p>追问问题内容</p>
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
     * Get <p>追问类型</p> 
     * @return PromptType <p>追问类型</p>
     */
    public String getPromptType() {
        return this.PromptType;
    }

    /**
     * Set <p>追问类型</p>
     * @param PromptType <p>追问类型</p>
     */
    public void setPromptType(String PromptType) {
        this.PromptType = PromptType;
    }

    /**
     * Get <p>追问选项列表</p> 
     * @return Choices <p>追问选项列表</p>
     */
    public String [] getChoices() {
        return this.Choices;
    }

    /**
     * Set <p>追问选项列表</p>
     * @param Choices <p>追问选项列表</p>
     */
    public void setChoices(String [] Choices) {
        this.Choices = Choices;
    }

    /**
     * Get <p>追问题型，单选或多选</p> 
     * @return QuestionType <p>追问题型，单选或多选</p>
     */
    public String getQuestionType() {
        return this.QuestionType;
    }

    /**
     * Set <p>追问题型，单选或多选</p>
     * @param QuestionType <p>追问题型，单选或多选</p>
     */
    public void setQuestionType(String QuestionType) {
        this.QuestionType = QuestionType;
    }

    /**
     * Get <p>追问特殊类型，如部位题、时间题</p> 
     * @return SpecialType <p>追问特殊类型，如部位题、时间题</p>
     */
    public String getSpecialType() {
        return this.SpecialType;
    }

    /**
     * Set <p>追问特殊类型，如部位题、时间题</p>
     * @param SpecialType <p>追问特殊类型，如部位题、时间题</p>
     */
    public void setSpecialType(String SpecialType) {
        this.SpecialType = SpecialType;
    }

    /**
     * Get <p>追问问题内容</p> 
     * @return Question <p>追问问题内容</p>
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set <p>追问问题内容</p>
     * @param Question <p>追问问题内容</p>
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public HealthFollowUpQuestion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthFollowUpQuestion(HealthFollowUpQuestion source) {
        if (source.PromptType != null) {
            this.PromptType = new String(source.PromptType);
        }
        if (source.Choices != null) {
            this.Choices = new String[source.Choices.length];
            for (int i = 0; i < source.Choices.length; i++) {
                this.Choices[i] = new String(source.Choices[i]);
            }
        }
        if (source.QuestionType != null) {
            this.QuestionType = new String(source.QuestionType);
        }
        if (source.SpecialType != null) {
            this.SpecialType = new String(source.SpecialType);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PromptType", this.PromptType);
        this.setParamArraySimple(map, prefix + "Choices.", this.Choices);
        this.setParamSimple(map, prefix + "QuestionType", this.QuestionType);
        this.setParamSimple(map, prefix + "SpecialType", this.SpecialType);
        this.setParamSimple(map, prefix + "Question", this.Question);

    }
}

