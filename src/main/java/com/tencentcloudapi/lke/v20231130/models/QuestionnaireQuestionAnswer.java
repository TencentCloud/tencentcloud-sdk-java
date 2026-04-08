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

public class QuestionnaireQuestionAnswer extends AbstractModel {

    /**
    * <p>问题</p>
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * <p>选中的答案标签</p>
    */
    @SerializedName("SelectedLabels")
    @Expose
    private String [] SelectedLabels;

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
     * Get <p>选中的答案标签</p> 
     * @return SelectedLabels <p>选中的答案标签</p>
     */
    public String [] getSelectedLabels() {
        return this.SelectedLabels;
    }

    /**
     * Set <p>选中的答案标签</p>
     * @param SelectedLabels <p>选中的答案标签</p>
     */
    public void setSelectedLabels(String [] SelectedLabels) {
        this.SelectedLabels = SelectedLabels;
    }

    public QuestionnaireQuestionAnswer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuestionnaireQuestionAnswer(QuestionnaireQuestionAnswer source) {
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.SelectedLabels != null) {
            this.SelectedLabels = new String[source.SelectedLabels.length];
            for (int i = 0; i < source.SelectedLabels.length; i++) {
                this.SelectedLabels[i] = new String(source.SelectedLabels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamArraySimple(map, prefix + "SelectedLabels.", this.SelectedLabels);

    }
}

