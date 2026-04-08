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

public class Questionnaire extends AbstractModel {

    /**
    * <p>问卷的标题</p>
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * <p>问卷的问题列表</p>
    */
    @SerializedName("Questions")
    @Expose
    private QuestionnaireQuestion [] Questions;

    /**
    * <p>问卷的答案列表</p>
    */
    @SerializedName("Answers")
    @Expose
    private QuestionnaireQuestionAnswer [] Answers;

    /**
     * Get <p>问卷的标题</p> 
     * @return Title <p>问卷的标题</p>
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set <p>问卷的标题</p>
     * @param Title <p>问卷的标题</p>
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get <p>问卷的问题列表</p> 
     * @return Questions <p>问卷的问题列表</p>
     */
    public QuestionnaireQuestion [] getQuestions() {
        return this.Questions;
    }

    /**
     * Set <p>问卷的问题列表</p>
     * @param Questions <p>问卷的问题列表</p>
     */
    public void setQuestions(QuestionnaireQuestion [] Questions) {
        this.Questions = Questions;
    }

    /**
     * Get <p>问卷的答案列表</p> 
     * @return Answers <p>问卷的答案列表</p>
     */
    public QuestionnaireQuestionAnswer [] getAnswers() {
        return this.Answers;
    }

    /**
     * Set <p>问卷的答案列表</p>
     * @param Answers <p>问卷的答案列表</p>
     */
    public void setAnswers(QuestionnaireQuestionAnswer [] Answers) {
        this.Answers = Answers;
    }

    public Questionnaire() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Questionnaire(Questionnaire source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Questions != null) {
            this.Questions = new QuestionnaireQuestion[source.Questions.length];
            for (int i = 0; i < source.Questions.length; i++) {
                this.Questions[i] = new QuestionnaireQuestion(source.Questions[i]);
            }
        }
        if (source.Answers != null) {
            this.Answers = new QuestionnaireQuestionAnswer[source.Answers.length];
            for (int i = 0; i < source.Answers.length; i++) {
                this.Answers[i] = new QuestionnaireQuestionAnswer(source.Answers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamArrayObj(map, prefix + "Questions.", this.Questions);
        this.setParamArrayObj(map, prefix + "Answers.", this.Answers);

    }
}

