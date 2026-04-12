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

public class MarkInfo extends AbstractModel {

    /**
    * <p>题目的题干信息</p>
    */
    @SerializedName("MarkItemTitle")
    @Expose
    private String MarkItemTitle;

    /**
    * <p>批改答案列表（每个小题存在多个答案，比如多个填空区域答案，循序按照从左到右，从上到下排列）</p>
    */
    @SerializedName("AnswerInfos")
    @Expose
    private AnswerInfo [] AnswerInfos;

    /**
    * <p>嵌套题目结构（如果有多层嵌套则会返回子题信息，如果没有嵌套题目则返回空）</p>
    */
    @SerializedName("MarkInfos")
    @Expose
    private MarkInfo [] MarkInfos;

    /**
    * <p>题干坐标</p><p>单位：px</p>
    */
    @SerializedName("QuestionPositions")
    @Expose
    private Long [] QuestionPositions;

    /**
    * <p>题干插图坐标列表，每个元素包含一张插图的4个角点坐标</p>
    */
    @SerializedName("QuestionImagePositions")
    @Expose
    private Positions [] QuestionImagePositions;

    /**
    * <p>题目级正确答案（步骤批改时使用，包含完整解题步骤）</p>
    */
    @SerializedName("RightAnswer")
    @Expose
    private String RightAnswer;

    /**
     * Get <p>题目的题干信息</p> 
     * @return MarkItemTitle <p>题目的题干信息</p>
     */
    public String getMarkItemTitle() {
        return this.MarkItemTitle;
    }

    /**
     * Set <p>题目的题干信息</p>
     * @param MarkItemTitle <p>题目的题干信息</p>
     */
    public void setMarkItemTitle(String MarkItemTitle) {
        this.MarkItemTitle = MarkItemTitle;
    }

    /**
     * Get <p>批改答案列表（每个小题存在多个答案，比如多个填空区域答案，循序按照从左到右，从上到下排列）</p> 
     * @return AnswerInfos <p>批改答案列表（每个小题存在多个答案，比如多个填空区域答案，循序按照从左到右，从上到下排列）</p>
     */
    public AnswerInfo [] getAnswerInfos() {
        return this.AnswerInfos;
    }

    /**
     * Set <p>批改答案列表（每个小题存在多个答案，比如多个填空区域答案，循序按照从左到右，从上到下排列）</p>
     * @param AnswerInfos <p>批改答案列表（每个小题存在多个答案，比如多个填空区域答案，循序按照从左到右，从上到下排列）</p>
     */
    public void setAnswerInfos(AnswerInfo [] AnswerInfos) {
        this.AnswerInfos = AnswerInfos;
    }

    /**
     * Get <p>嵌套题目结构（如果有多层嵌套则会返回子题信息，如果没有嵌套题目则返回空）</p> 
     * @return MarkInfos <p>嵌套题目结构（如果有多层嵌套则会返回子题信息，如果没有嵌套题目则返回空）</p>
     */
    public MarkInfo [] getMarkInfos() {
        return this.MarkInfos;
    }

    /**
     * Set <p>嵌套题目结构（如果有多层嵌套则会返回子题信息，如果没有嵌套题目则返回空）</p>
     * @param MarkInfos <p>嵌套题目结构（如果有多层嵌套则会返回子题信息，如果没有嵌套题目则返回空）</p>
     */
    public void setMarkInfos(MarkInfo [] MarkInfos) {
        this.MarkInfos = MarkInfos;
    }

    /**
     * Get <p>题干坐标</p><p>单位：px</p> 
     * @return QuestionPositions <p>题干坐标</p><p>单位：px</p>
     */
    public Long [] getQuestionPositions() {
        return this.QuestionPositions;
    }

    /**
     * Set <p>题干坐标</p><p>单位：px</p>
     * @param QuestionPositions <p>题干坐标</p><p>单位：px</p>
     */
    public void setQuestionPositions(Long [] QuestionPositions) {
        this.QuestionPositions = QuestionPositions;
    }

    /**
     * Get <p>题干插图坐标列表，每个元素包含一张插图的4个角点坐标</p> 
     * @return QuestionImagePositions <p>题干插图坐标列表，每个元素包含一张插图的4个角点坐标</p>
     */
    public Positions [] getQuestionImagePositions() {
        return this.QuestionImagePositions;
    }

    /**
     * Set <p>题干插图坐标列表，每个元素包含一张插图的4个角点坐标</p>
     * @param QuestionImagePositions <p>题干插图坐标列表，每个元素包含一张插图的4个角点坐标</p>
     */
    public void setQuestionImagePositions(Positions [] QuestionImagePositions) {
        this.QuestionImagePositions = QuestionImagePositions;
    }

    /**
     * Get <p>题目级正确答案（步骤批改时使用，包含完整解题步骤）</p> 
     * @return RightAnswer <p>题目级正确答案（步骤批改时使用，包含完整解题步骤）</p>
     */
    public String getRightAnswer() {
        return this.RightAnswer;
    }

    /**
     * Set <p>题目级正确答案（步骤批改时使用，包含完整解题步骤）</p>
     * @param RightAnswer <p>题目级正确答案（步骤批改时使用，包含完整解题步骤）</p>
     */
    public void setRightAnswer(String RightAnswer) {
        this.RightAnswer = RightAnswer;
    }

    public MarkInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MarkInfo(MarkInfo source) {
        if (source.MarkItemTitle != null) {
            this.MarkItemTitle = new String(source.MarkItemTitle);
        }
        if (source.AnswerInfos != null) {
            this.AnswerInfos = new AnswerInfo[source.AnswerInfos.length];
            for (int i = 0; i < source.AnswerInfos.length; i++) {
                this.AnswerInfos[i] = new AnswerInfo(source.AnswerInfos[i]);
            }
        }
        if (source.MarkInfos != null) {
            this.MarkInfos = new MarkInfo[source.MarkInfos.length];
            for (int i = 0; i < source.MarkInfos.length; i++) {
                this.MarkInfos[i] = new MarkInfo(source.MarkInfos[i]);
            }
        }
        if (source.QuestionPositions != null) {
            this.QuestionPositions = new Long[source.QuestionPositions.length];
            for (int i = 0; i < source.QuestionPositions.length; i++) {
                this.QuestionPositions[i] = new Long(source.QuestionPositions[i]);
            }
        }
        if (source.QuestionImagePositions != null) {
            this.QuestionImagePositions = new Positions[source.QuestionImagePositions.length];
            for (int i = 0; i < source.QuestionImagePositions.length; i++) {
                this.QuestionImagePositions[i] = new Positions(source.QuestionImagePositions[i]);
            }
        }
        if (source.RightAnswer != null) {
            this.RightAnswer = new String(source.RightAnswer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MarkItemTitle", this.MarkItemTitle);
        this.setParamArrayObj(map, prefix + "AnswerInfos.", this.AnswerInfos);
        this.setParamArrayObj(map, prefix + "MarkInfos.", this.MarkInfos);
        this.setParamArraySimple(map, prefix + "QuestionPositions.", this.QuestionPositions);
        this.setParamArrayObj(map, prefix + "QuestionImagePositions.", this.QuestionImagePositions);
        this.setParamSimple(map, prefix + "RightAnswer", this.RightAnswer);

    }
}

