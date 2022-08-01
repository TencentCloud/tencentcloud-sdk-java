/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntentionQuestion extends AbstractModel{

    /**
    * 系统播报的问题文本，问题最大长度为150个字符。
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * 用户答案的标准文本列表，用于识别用户回答的语音与标准文本是否一致。列表长度最大为50，单个答案长度限制10个字符。
    */
    @SerializedName("Answers")
    @Expose
    private String [] Answers;

    /**
     * Get 系统播报的问题文本，问题最大长度为150个字符。 
     * @return Question 系统播报的问题文本，问题最大长度为150个字符。
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set 系统播报的问题文本，问题最大长度为150个字符。
     * @param Question 系统播报的问题文本，问题最大长度为150个字符。
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get 用户答案的标准文本列表，用于识别用户回答的语音与标准文本是否一致。列表长度最大为50，单个答案长度限制10个字符。 
     * @return Answers 用户答案的标准文本列表，用于识别用户回答的语音与标准文本是否一致。列表长度最大为50，单个答案长度限制10个字符。
     */
    public String [] getAnswers() {
        return this.Answers;
    }

    /**
     * Set 用户答案的标准文本列表，用于识别用户回答的语音与标准文本是否一致。列表长度最大为50，单个答案长度限制10个字符。
     * @param Answers 用户答案的标准文本列表，用于识别用户回答的语音与标准文本是否一致。列表长度最大为50，单个答案长度限制10个字符。
     */
    public void setAnswers(String [] Answers) {
        this.Answers = Answers;
    }

    public IntentionQuestion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntentionQuestion(IntentionQuestion source) {
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.Answers != null) {
            this.Answers = new String[source.Answers.length];
            for (int i = 0; i < source.Answers.length; i++) {
                this.Answers[i] = new String(source.Answers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamArraySimple(map, prefix + "Answers.", this.Answers);

    }
}

