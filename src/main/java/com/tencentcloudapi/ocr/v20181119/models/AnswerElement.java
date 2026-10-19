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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnswerElement extends AbstractModel {

    /**
    * <p>答案是否正确</p>
    */
    @SerializedName("IsCorrect")
    @Expose
    private Boolean IsCorrect;

    /**
    * <p>答案分析结果</p>
    */
    @SerializedName("AnswerAnalysis")
    @Expose
    private String AnswerAnalysis;

    /**
    * <p>返回正确答案内容</p>
    */
    @SerializedName("RightAnswer")
    @Expose
    private String RightAnswer;

    /**
     * Get <p>答案是否正确</p> 
     * @return IsCorrect <p>答案是否正确</p>
     */
    public Boolean getIsCorrect() {
        return this.IsCorrect;
    }

    /**
     * Set <p>答案是否正确</p>
     * @param IsCorrect <p>答案是否正确</p>
     */
    public void setIsCorrect(Boolean IsCorrect) {
        this.IsCorrect = IsCorrect;
    }

    /**
     * Get <p>答案分析结果</p> 
     * @return AnswerAnalysis <p>答案分析结果</p>
     */
    public String getAnswerAnalysis() {
        return this.AnswerAnalysis;
    }

    /**
     * Set <p>答案分析结果</p>
     * @param AnswerAnalysis <p>答案分析结果</p>
     */
    public void setAnswerAnalysis(String AnswerAnalysis) {
        this.AnswerAnalysis = AnswerAnalysis;
    }

    /**
     * Get <p>返回正确答案内容</p> 
     * @return RightAnswer <p>返回正确答案内容</p>
     */
    public String getRightAnswer() {
        return this.RightAnswer;
    }

    /**
     * Set <p>返回正确答案内容</p>
     * @param RightAnswer <p>返回正确答案内容</p>
     */
    public void setRightAnswer(String RightAnswer) {
        this.RightAnswer = RightAnswer;
    }

    public AnswerElement() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnswerElement(AnswerElement source) {
        if (source.IsCorrect != null) {
            this.IsCorrect = new Boolean(source.IsCorrect);
        }
        if (source.AnswerAnalysis != null) {
            this.AnswerAnalysis = new String(source.AnswerAnalysis);
        }
        if (source.RightAnswer != null) {
            this.RightAnswer = new String(source.RightAnswer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsCorrect", this.IsCorrect);
        this.setParamSimple(map, prefix + "AnswerAnalysis", this.AnswerAnalysis);
        this.setParamSimple(map, prefix + "RightAnswer", this.RightAnswer);

    }
}

