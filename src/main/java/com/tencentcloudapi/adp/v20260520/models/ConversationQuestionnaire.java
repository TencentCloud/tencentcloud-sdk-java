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

public class ConversationQuestionnaire extends AbstractModel {

    /**
    * <p>问卷标题</p>
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * <p>答案列表</p>
    */
    @SerializedName("AnswerList")
    @Expose
    private ConversationQuestionAnswer [] AnswerList;

    /**
    * <p>答案列表</p>
    */
    @SerializedName("Answers")
    @Expose
    private ConversationQuestionAnswer [] Answers;

    /**
    * <p>问题列表</p>
    */
    @SerializedName("QuestionList")
    @Expose
    private ConversationQuestion [] QuestionList;

    /**
    * <p>问题列表</p>
    */
    @SerializedName("Questions")
    @Expose
    private ConversationQuestion [] Questions;

    /**
     * Get <p>问卷标题</p> 
     * @return Title <p>问卷标题</p>
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set <p>问卷标题</p>
     * @param Title <p>问卷标题</p>
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get <p>答案列表</p> 
     * @return AnswerList <p>答案列表</p>
     */
    public ConversationQuestionAnswer [] getAnswerList() {
        return this.AnswerList;
    }

    /**
     * Set <p>答案列表</p>
     * @param AnswerList <p>答案列表</p>
     */
    public void setAnswerList(ConversationQuestionAnswer [] AnswerList) {
        this.AnswerList = AnswerList;
    }

    /**
     * Get <p>答案列表</p> 
     * @return Answers <p>答案列表</p>
     */
    public ConversationQuestionAnswer [] getAnswers() {
        return this.Answers;
    }

    /**
     * Set <p>答案列表</p>
     * @param Answers <p>答案列表</p>
     */
    public void setAnswers(ConversationQuestionAnswer [] Answers) {
        this.Answers = Answers;
    }

    /**
     * Get <p>问题列表</p> 
     * @return QuestionList <p>问题列表</p>
     */
    public ConversationQuestion [] getQuestionList() {
        return this.QuestionList;
    }

    /**
     * Set <p>问题列表</p>
     * @param QuestionList <p>问题列表</p>
     */
    public void setQuestionList(ConversationQuestion [] QuestionList) {
        this.QuestionList = QuestionList;
    }

    /**
     * Get <p>问题列表</p> 
     * @return Questions <p>问题列表</p>
     */
    public ConversationQuestion [] getQuestions() {
        return this.Questions;
    }

    /**
     * Set <p>问题列表</p>
     * @param Questions <p>问题列表</p>
     */
    public void setQuestions(ConversationQuestion [] Questions) {
        this.Questions = Questions;
    }

    public ConversationQuestionnaire() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConversationQuestionnaire(ConversationQuestionnaire source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.AnswerList != null) {
            this.AnswerList = new ConversationQuestionAnswer[source.AnswerList.length];
            for (int i = 0; i < source.AnswerList.length; i++) {
                this.AnswerList[i] = new ConversationQuestionAnswer(source.AnswerList[i]);
            }
        }
        if (source.Answers != null) {
            this.Answers = new ConversationQuestionAnswer[source.Answers.length];
            for (int i = 0; i < source.Answers.length; i++) {
                this.Answers[i] = new ConversationQuestionAnswer(source.Answers[i]);
            }
        }
        if (source.QuestionList != null) {
            this.QuestionList = new ConversationQuestion[source.QuestionList.length];
            for (int i = 0; i < source.QuestionList.length; i++) {
                this.QuestionList[i] = new ConversationQuestion(source.QuestionList[i]);
            }
        }
        if (source.Questions != null) {
            this.Questions = new ConversationQuestion[source.Questions.length];
            for (int i = 0; i < source.Questions.length; i++) {
                this.Questions[i] = new ConversationQuestion(source.Questions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamArrayObj(map, prefix + "AnswerList.", this.AnswerList);
        this.setParamArrayObj(map, prefix + "Answers.", this.Answers);
        this.setParamArrayObj(map, prefix + "QuestionList.", this.QuestionList);
        this.setParamArrayObj(map, prefix + "Questions.", this.Questions);

    }
}

