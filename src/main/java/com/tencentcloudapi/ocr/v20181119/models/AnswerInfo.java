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

public class AnswerInfo extends AbstractModel {

    /**
    * 手写答案内容，比如选择题的手写的选项、填空题的手写内容
    */
    @SerializedName("HandwriteInfo")
    @Expose
    private String HandwriteInfo;

    /**
    * 答案是否正确
    */
    @SerializedName("IsCorrect")
    @Expose
    private Boolean IsCorrect;

    /**
    * 答案分析结果

    */
    @SerializedName("AnswerAnalysis")
    @Expose
    private String AnswerAnalysis;

    /**
    * 答案区域的4个角点坐标, 是个长度为8的数组

[0,1,2,3,4,5,6,7]

(0,1) 左上角坐标
(2,3) 右上角坐标
(4,5) 右下角坐标
(6,7) 左下角坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HandwriteInfoPositions")
    @Expose
    private Long [] HandwriteInfoPositions;

    /**
    * 返回正确答案内容

QuestionConfigMap配置了（“TrueAnswer”：1）才生效返回
    */
    @SerializedName("RightAnswer")
    @Expose
    private String RightAnswer;

    /**
    * 返回题目的知识点内容

QuestionConfigMap配置了（“KnowledgePoints”：1）才生效返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KnowledgePoints")
    @Expose
    private String [] KnowledgePoints;

    /**
     * Get 手写答案内容，比如选择题的手写的选项、填空题的手写内容 
     * @return HandwriteInfo 手写答案内容，比如选择题的手写的选项、填空题的手写内容
     */
    public String getHandwriteInfo() {
        return this.HandwriteInfo;
    }

    /**
     * Set 手写答案内容，比如选择题的手写的选项、填空题的手写内容
     * @param HandwriteInfo 手写答案内容，比如选择题的手写的选项、填空题的手写内容
     */
    public void setHandwriteInfo(String HandwriteInfo) {
        this.HandwriteInfo = HandwriteInfo;
    }

    /**
     * Get 答案是否正确 
     * @return IsCorrect 答案是否正确
     */
    public Boolean getIsCorrect() {
        return this.IsCorrect;
    }

    /**
     * Set 答案是否正确
     * @param IsCorrect 答案是否正确
     */
    public void setIsCorrect(Boolean IsCorrect) {
        this.IsCorrect = IsCorrect;
    }

    /**
     * Get 答案分析结果
 
     * @return AnswerAnalysis 答案分析结果

     */
    public String getAnswerAnalysis() {
        return this.AnswerAnalysis;
    }

    /**
     * Set 答案分析结果

     * @param AnswerAnalysis 答案分析结果

     */
    public void setAnswerAnalysis(String AnswerAnalysis) {
        this.AnswerAnalysis = AnswerAnalysis;
    }

    /**
     * Get 答案区域的4个角点坐标, 是个长度为8的数组

[0,1,2,3,4,5,6,7]

(0,1) 左上角坐标
(2,3) 右上角坐标
(4,5) 右下角坐标
(6,7) 左下角坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HandwriteInfoPositions 答案区域的4个角点坐标, 是个长度为8的数组

[0,1,2,3,4,5,6,7]

(0,1) 左上角坐标
(2,3) 右上角坐标
(4,5) 右下角坐标
(6,7) 左下角坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getHandwriteInfoPositions() {
        return this.HandwriteInfoPositions;
    }

    /**
     * Set 答案区域的4个角点坐标, 是个长度为8的数组

[0,1,2,3,4,5,6,7]

(0,1) 左上角坐标
(2,3) 右上角坐标
(4,5) 右下角坐标
(6,7) 左下角坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param HandwriteInfoPositions 答案区域的4个角点坐标, 是个长度为8的数组

[0,1,2,3,4,5,6,7]

(0,1) 左上角坐标
(2,3) 右上角坐标
(4,5) 右下角坐标
(6,7) 左下角坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHandwriteInfoPositions(Long [] HandwriteInfoPositions) {
        this.HandwriteInfoPositions = HandwriteInfoPositions;
    }

    /**
     * Get 返回正确答案内容

QuestionConfigMap配置了（“TrueAnswer”：1）才生效返回 
     * @return RightAnswer 返回正确答案内容

QuestionConfigMap配置了（“TrueAnswer”：1）才生效返回
     */
    public String getRightAnswer() {
        return this.RightAnswer;
    }

    /**
     * Set 返回正确答案内容

QuestionConfigMap配置了（“TrueAnswer”：1）才生效返回
     * @param RightAnswer 返回正确答案内容

QuestionConfigMap配置了（“TrueAnswer”：1）才生效返回
     */
    public void setRightAnswer(String RightAnswer) {
        this.RightAnswer = RightAnswer;
    }

    /**
     * Get 返回题目的知识点内容

QuestionConfigMap配置了（“KnowledgePoints”：1）才生效返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KnowledgePoints 返回题目的知识点内容

QuestionConfigMap配置了（“KnowledgePoints”：1）才生效返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getKnowledgePoints() {
        return this.KnowledgePoints;
    }

    /**
     * Set 返回题目的知识点内容

QuestionConfigMap配置了（“KnowledgePoints”：1）才生效返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param KnowledgePoints 返回题目的知识点内容

QuestionConfigMap配置了（“KnowledgePoints”：1）才生效返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKnowledgePoints(String [] KnowledgePoints) {
        this.KnowledgePoints = KnowledgePoints;
    }

    public AnswerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnswerInfo(AnswerInfo source) {
        if (source.HandwriteInfo != null) {
            this.HandwriteInfo = new String(source.HandwriteInfo);
        }
        if (source.IsCorrect != null) {
            this.IsCorrect = new Boolean(source.IsCorrect);
        }
        if (source.AnswerAnalysis != null) {
            this.AnswerAnalysis = new String(source.AnswerAnalysis);
        }
        if (source.HandwriteInfoPositions != null) {
            this.HandwriteInfoPositions = new Long[source.HandwriteInfoPositions.length];
            for (int i = 0; i < source.HandwriteInfoPositions.length; i++) {
                this.HandwriteInfoPositions[i] = new Long(source.HandwriteInfoPositions[i]);
            }
        }
        if (source.RightAnswer != null) {
            this.RightAnswer = new String(source.RightAnswer);
        }
        if (source.KnowledgePoints != null) {
            this.KnowledgePoints = new String[source.KnowledgePoints.length];
            for (int i = 0; i < source.KnowledgePoints.length; i++) {
                this.KnowledgePoints[i] = new String(source.KnowledgePoints[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HandwriteInfo", this.HandwriteInfo);
        this.setParamSimple(map, prefix + "IsCorrect", this.IsCorrect);
        this.setParamSimple(map, prefix + "AnswerAnalysis", this.AnswerAnalysis);
        this.setParamArraySimple(map, prefix + "HandwriteInfoPositions.", this.HandwriteInfoPositions);
        this.setParamSimple(map, prefix + "RightAnswer", this.RightAnswer);
        this.setParamArraySimple(map, prefix + "KnowledgePoints.", this.KnowledgePoints);

    }
}

