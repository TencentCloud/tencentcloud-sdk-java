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
package com.tencentcloudapi.tms.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnswerQuestionRequest extends AbstractModel {

    /**
    * 用户问题
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
     * Get 用户问题 
     * @return Question 用户问题
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set 用户问题
     * @param Question 用户问题
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    public AnswerQuestionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnswerQuestionRequest(AnswerQuestionRequest source) {
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Question", this.Question);

    }
}

