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

public class CreateSimilarQuestionRequest extends AbstractModel {

    /**
    * <p>所属知识库 ID</p>
    */
    @SerializedName("KbId")
    @Expose
    private String KbId;

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
     * Get <p>所属知识库 ID</p> 
     * @return KbId <p>所属知识库 ID</p>
     */
    public String getKbId() {
        return this.KbId;
    }

    /**
     * Set <p>所属知识库 ID</p>
     * @param KbId <p>所属知识库 ID</p>
     */
    public void setKbId(String KbId) {
        this.KbId = KbId;
    }

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

    public CreateSimilarQuestionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSimilarQuestionRequest(CreateSimilarQuestionRequest source) {
        if (source.KbId != null) {
            this.KbId = new String(source.KbId);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.Answer != null) {
            this.Answer = new String(source.Answer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KbId", this.KbId);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "Answer", this.Answer);

    }
}

