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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QuestionInfo extends AbstractModel{

    /**
    * 问题ID
    */
    @SerializedName("QuestionId")
    @Expose
    private String QuestionId;

    /**
    * 问题内容
    */
    @SerializedName("QuestionContent")
    @Expose
    private String QuestionContent;

    /**
    * 倒计时答题设置的秒数（0 表示不计时）
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 正确答案（按照位表示是否选择，如0x1表示选择A，0x11表示选择AB）
    */
    @SerializedName("CorrectAnswer")
    @Expose
    private Long CorrectAnswer;

    /**
    * 每个选项答题人数统计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnswerStats")
    @Expose
    private AnswerStat [] AnswerStats;

    /**
     * Get 问题ID 
     * @return QuestionId 问题ID
     */
    public String getQuestionId() {
        return this.QuestionId;
    }

    /**
     * Set 问题ID
     * @param QuestionId 问题ID
     */
    public void setQuestionId(String QuestionId) {
        this.QuestionId = QuestionId;
    }

    /**
     * Get 问题内容 
     * @return QuestionContent 问题内容
     */
    public String getQuestionContent() {
        return this.QuestionContent;
    }

    /**
     * Set 问题内容
     * @param QuestionContent 问题内容
     */
    public void setQuestionContent(String QuestionContent) {
        this.QuestionContent = QuestionContent;
    }

    /**
     * Get 倒计时答题设置的秒数（0 表示不计时） 
     * @return Duration 倒计时答题设置的秒数（0 表示不计时）
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 倒计时答题设置的秒数（0 表示不计时）
     * @param Duration 倒计时答题设置的秒数（0 表示不计时）
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 正确答案（按照位表示是否选择，如0x1表示选择A，0x11表示选择AB） 
     * @return CorrectAnswer 正确答案（按照位表示是否选择，如0x1表示选择A，0x11表示选择AB）
     */
    public Long getCorrectAnswer() {
        return this.CorrectAnswer;
    }

    /**
     * Set 正确答案（按照位表示是否选择，如0x1表示选择A，0x11表示选择AB）
     * @param CorrectAnswer 正确答案（按照位表示是否选择，如0x1表示选择A，0x11表示选择AB）
     */
    public void setCorrectAnswer(Long CorrectAnswer) {
        this.CorrectAnswer = CorrectAnswer;
    }

    /**
     * Get 每个选项答题人数统计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnswerStats 每个选项答题人数统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AnswerStat [] getAnswerStats() {
        return this.AnswerStats;
    }

    /**
     * Set 每个选项答题人数统计
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnswerStats 每个选项答题人数统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnswerStats(AnswerStat [] AnswerStats) {
        this.AnswerStats = AnswerStats;
    }

    public QuestionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuestionInfo(QuestionInfo source) {
        if (source.QuestionId != null) {
            this.QuestionId = new String(source.QuestionId);
        }
        if (source.QuestionContent != null) {
            this.QuestionContent = new String(source.QuestionContent);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.CorrectAnswer != null) {
            this.CorrectAnswer = new Long(source.CorrectAnswer);
        }
        if (source.AnswerStats != null) {
            this.AnswerStats = new AnswerStat[source.AnswerStats.length];
            for (int i = 0; i < source.AnswerStats.length; i++) {
                this.AnswerStats[i] = new AnswerStat(source.AnswerStats[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QuestionId", this.QuestionId);
        this.setParamSimple(map, prefix + "QuestionContent", this.QuestionContent);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "CorrectAnswer", this.CorrectAnswer);
        this.setParamArrayObj(map, prefix + "AnswerStats.", this.AnswerStats);

    }
}

