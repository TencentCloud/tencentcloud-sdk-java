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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QuestionObj extends AbstractModel{

    /**
    * 题号
    */
    @SerializedName("QuestionTextNo")
    @Expose
    private String QuestionTextNo;

    /**
    * 题型：
1: "选择题"
2: "填空题"
3: "解答题"
    */
    @SerializedName("QuestionTextType")
    @Expose
    private Long QuestionTextType;

    /**
    * 题干
    */
    @SerializedName("QuestionText")
    @Expose
    private String QuestionText;

    /**
    * 选择题选项，包含1个或多个option
    */
    @SerializedName("QuestionOptions")
    @Expose
    private String QuestionOptions;

    /**
    * 所有子题的question属性
    */
    @SerializedName("QuestionSubquestion")
    @Expose
    private String QuestionSubquestion;

    /**
     * Get 题号 
     * @return QuestionTextNo 题号
     */
    public String getQuestionTextNo() {
        return this.QuestionTextNo;
    }

    /**
     * Set 题号
     * @param QuestionTextNo 题号
     */
    public void setQuestionTextNo(String QuestionTextNo) {
        this.QuestionTextNo = QuestionTextNo;
    }

    /**
     * Get 题型：
1: "选择题"
2: "填空题"
3: "解答题" 
     * @return QuestionTextType 题型：
1: "选择题"
2: "填空题"
3: "解答题"
     */
    public Long getQuestionTextType() {
        return this.QuestionTextType;
    }

    /**
     * Set 题型：
1: "选择题"
2: "填空题"
3: "解答题"
     * @param QuestionTextType 题型：
1: "选择题"
2: "填空题"
3: "解答题"
     */
    public void setQuestionTextType(Long QuestionTextType) {
        this.QuestionTextType = QuestionTextType;
    }

    /**
     * Get 题干 
     * @return QuestionText 题干
     */
    public String getQuestionText() {
        return this.QuestionText;
    }

    /**
     * Set 题干
     * @param QuestionText 题干
     */
    public void setQuestionText(String QuestionText) {
        this.QuestionText = QuestionText;
    }

    /**
     * Get 选择题选项，包含1个或多个option 
     * @return QuestionOptions 选择题选项，包含1个或多个option
     */
    public String getQuestionOptions() {
        return this.QuestionOptions;
    }

    /**
     * Set 选择题选项，包含1个或多个option
     * @param QuestionOptions 选择题选项，包含1个或多个option
     */
    public void setQuestionOptions(String QuestionOptions) {
        this.QuestionOptions = QuestionOptions;
    }

    /**
     * Get 所有子题的question属性 
     * @return QuestionSubquestion 所有子题的question属性
     */
    public String getQuestionSubquestion() {
        return this.QuestionSubquestion;
    }

    /**
     * Set 所有子题的question属性
     * @param QuestionSubquestion 所有子题的question属性
     */
    public void setQuestionSubquestion(String QuestionSubquestion) {
        this.QuestionSubquestion = QuestionSubquestion;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QuestionTextNo", this.QuestionTextNo);
        this.setParamSimple(map, prefix + "QuestionTextType", this.QuestionTextType);
        this.setParamSimple(map, prefix + "QuestionText", this.QuestionText);
        this.setParamSimple(map, prefix + "QuestionOptions", this.QuestionOptions);
        this.setParamSimple(map, prefix + "QuestionSubquestion", this.QuestionSubquestion);

    }
}

