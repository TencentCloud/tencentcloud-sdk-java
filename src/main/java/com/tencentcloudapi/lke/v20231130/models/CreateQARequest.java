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

public class CreateQARequest extends AbstractModel {

    /**
    * 应用ID
    */
    @SerializedName("BotBizId")
    @Expose
    private String BotBizId;

    /**
    * 问题
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * 答案
    */
    @SerializedName("Answer")
    @Expose
    private String Answer;

    /**
    * 标签适用范围 1：全部，2：按条件
    */
    @SerializedName("AttrRange")
    @Expose
    private Long AttrRange;

    /**
    * 自定义参数
    */
    @SerializedName("CustomParam")
    @Expose
    private String CustomParam;

    /**
    * 标签引用
    */
    @SerializedName("AttrLabels")
    @Expose
    private AttrLabelRefer [] AttrLabels;

    /**
    * 文档ID
    */
    @SerializedName("DocBizId")
    @Expose
    private String DocBizId;

    /**
    * 分类ID
    */
    @SerializedName("CateBizId")
    @Expose
    private String CateBizId;

    /**
    * 有效开始时间，unix时间戳
    */
    @SerializedName("ExpireStart")
    @Expose
    private String ExpireStart;

    /**
    * 有效结束时间，unix时间戳，0代表永久有效
    */
    @SerializedName("ExpireEnd")
    @Expose
    private String ExpireEnd;

    /**
    * 相似问内容
    */
    @SerializedName("SimilarQuestions")
    @Expose
    private String [] SimilarQuestions;

    /**
    * 问题描述
    */
    @SerializedName("QuestionDesc")
    @Expose
    private String QuestionDesc;

    /**
     * Get 应用ID 
     * @return BotBizId 应用ID
     */
    public String getBotBizId() {
        return this.BotBizId;
    }

    /**
     * Set 应用ID
     * @param BotBizId 应用ID
     */
    public void setBotBizId(String BotBizId) {
        this.BotBizId = BotBizId;
    }

    /**
     * Get 问题 
     * @return Question 问题
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set 问题
     * @param Question 问题
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get 答案 
     * @return Answer 答案
     */
    public String getAnswer() {
        return this.Answer;
    }

    /**
     * Set 答案
     * @param Answer 答案
     */
    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    /**
     * Get 标签适用范围 1：全部，2：按条件 
     * @return AttrRange 标签适用范围 1：全部，2：按条件
     */
    public Long getAttrRange() {
        return this.AttrRange;
    }

    /**
     * Set 标签适用范围 1：全部，2：按条件
     * @param AttrRange 标签适用范围 1：全部，2：按条件
     */
    public void setAttrRange(Long AttrRange) {
        this.AttrRange = AttrRange;
    }

    /**
     * Get 自定义参数 
     * @return CustomParam 自定义参数
     */
    public String getCustomParam() {
        return this.CustomParam;
    }

    /**
     * Set 自定义参数
     * @param CustomParam 自定义参数
     */
    public void setCustomParam(String CustomParam) {
        this.CustomParam = CustomParam;
    }

    /**
     * Get 标签引用 
     * @return AttrLabels 标签引用
     */
    public AttrLabelRefer [] getAttrLabels() {
        return this.AttrLabels;
    }

    /**
     * Set 标签引用
     * @param AttrLabels 标签引用
     */
    public void setAttrLabels(AttrLabelRefer [] AttrLabels) {
        this.AttrLabels = AttrLabels;
    }

    /**
     * Get 文档ID 
     * @return DocBizId 文档ID
     */
    public String getDocBizId() {
        return this.DocBizId;
    }

    /**
     * Set 文档ID
     * @param DocBizId 文档ID
     */
    public void setDocBizId(String DocBizId) {
        this.DocBizId = DocBizId;
    }

    /**
     * Get 分类ID 
     * @return CateBizId 分类ID
     */
    public String getCateBizId() {
        return this.CateBizId;
    }

    /**
     * Set 分类ID
     * @param CateBizId 分类ID
     */
    public void setCateBizId(String CateBizId) {
        this.CateBizId = CateBizId;
    }

    /**
     * Get 有效开始时间，unix时间戳 
     * @return ExpireStart 有效开始时间，unix时间戳
     */
    public String getExpireStart() {
        return this.ExpireStart;
    }

    /**
     * Set 有效开始时间，unix时间戳
     * @param ExpireStart 有效开始时间，unix时间戳
     */
    public void setExpireStart(String ExpireStart) {
        this.ExpireStart = ExpireStart;
    }

    /**
     * Get 有效结束时间，unix时间戳，0代表永久有效 
     * @return ExpireEnd 有效结束时间，unix时间戳，0代表永久有效
     */
    public String getExpireEnd() {
        return this.ExpireEnd;
    }

    /**
     * Set 有效结束时间，unix时间戳，0代表永久有效
     * @param ExpireEnd 有效结束时间，unix时间戳，0代表永久有效
     */
    public void setExpireEnd(String ExpireEnd) {
        this.ExpireEnd = ExpireEnd;
    }

    /**
     * Get 相似问内容 
     * @return SimilarQuestions 相似问内容
     */
    public String [] getSimilarQuestions() {
        return this.SimilarQuestions;
    }

    /**
     * Set 相似问内容
     * @param SimilarQuestions 相似问内容
     */
    public void setSimilarQuestions(String [] SimilarQuestions) {
        this.SimilarQuestions = SimilarQuestions;
    }

    /**
     * Get 问题描述 
     * @return QuestionDesc 问题描述
     */
    public String getQuestionDesc() {
        return this.QuestionDesc;
    }

    /**
     * Set 问题描述
     * @param QuestionDesc 问题描述
     */
    public void setQuestionDesc(String QuestionDesc) {
        this.QuestionDesc = QuestionDesc;
    }

    public CreateQARequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateQARequest(CreateQARequest source) {
        if (source.BotBizId != null) {
            this.BotBizId = new String(source.BotBizId);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.Answer != null) {
            this.Answer = new String(source.Answer);
        }
        if (source.AttrRange != null) {
            this.AttrRange = new Long(source.AttrRange);
        }
        if (source.CustomParam != null) {
            this.CustomParam = new String(source.CustomParam);
        }
        if (source.AttrLabels != null) {
            this.AttrLabels = new AttrLabelRefer[source.AttrLabels.length];
            for (int i = 0; i < source.AttrLabels.length; i++) {
                this.AttrLabels[i] = new AttrLabelRefer(source.AttrLabels[i]);
            }
        }
        if (source.DocBizId != null) {
            this.DocBizId = new String(source.DocBizId);
        }
        if (source.CateBizId != null) {
            this.CateBizId = new String(source.CateBizId);
        }
        if (source.ExpireStart != null) {
            this.ExpireStart = new String(source.ExpireStart);
        }
        if (source.ExpireEnd != null) {
            this.ExpireEnd = new String(source.ExpireEnd);
        }
        if (source.SimilarQuestions != null) {
            this.SimilarQuestions = new String[source.SimilarQuestions.length];
            for (int i = 0; i < source.SimilarQuestions.length; i++) {
                this.SimilarQuestions[i] = new String(source.SimilarQuestions[i]);
            }
        }
        if (source.QuestionDesc != null) {
            this.QuestionDesc = new String(source.QuestionDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotBizId", this.BotBizId);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "Answer", this.Answer);
        this.setParamSimple(map, prefix + "AttrRange", this.AttrRange);
        this.setParamSimple(map, prefix + "CustomParam", this.CustomParam);
        this.setParamArrayObj(map, prefix + "AttrLabels.", this.AttrLabels);
        this.setParamSimple(map, prefix + "DocBizId", this.DocBizId);
        this.setParamSimple(map, prefix + "CateBizId", this.CateBizId);
        this.setParamSimple(map, prefix + "ExpireStart", this.ExpireStart);
        this.setParamSimple(map, prefix + "ExpireEnd", this.ExpireEnd);
        this.setParamArraySimple(map, prefix + "SimilarQuestions.", this.SimilarQuestions);
        this.setParamSimple(map, prefix + "QuestionDesc", this.QuestionDesc);

    }
}

