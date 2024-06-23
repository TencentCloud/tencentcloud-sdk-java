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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnsatisfiedReply extends AbstractModel {

    /**
    * 不满意回复ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplyBizId")
    @Expose
    private String ReplyBizId;

    /**
    * 消息记录ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordBizId")
    @Expose
    private String RecordBizId;

    /**
    * 用户问题
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * 应用回复
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Answer")
    @Expose
    private String Answer;

    /**
    * 错误类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reasons")
    @Expose
    private String [] Reasons;

    /**
     * Get 不满意回复ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplyBizId 不满意回复ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReplyBizId() {
        return this.ReplyBizId;
    }

    /**
     * Set 不满意回复ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplyBizId 不满意回复ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplyBizId(String ReplyBizId) {
        this.ReplyBizId = ReplyBizId;
    }

    /**
     * Get 消息记录ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordBizId 消息记录ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecordBizId() {
        return this.RecordBizId;
    }

    /**
     * Set 消息记录ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordBizId 消息记录ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordBizId(String RecordBizId) {
        this.RecordBizId = RecordBizId;
    }

    /**
     * Get 用户问题
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Question 用户问题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set 用户问题
注意：此字段可能返回 null，表示取不到有效值。
     * @param Question 用户问题
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get 应用回复
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Answer 应用回复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAnswer() {
        return this.Answer;
    }

    /**
     * Set 应用回复
注意：此字段可能返回 null，表示取不到有效值。
     * @param Answer 应用回复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    /**
     * Get 错误类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reasons 错误类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getReasons() {
        return this.Reasons;
    }

    /**
     * Set 错误类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reasons 错误类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReasons(String [] Reasons) {
        this.Reasons = Reasons;
    }

    public UnsatisfiedReply() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnsatisfiedReply(UnsatisfiedReply source) {
        if (source.ReplyBizId != null) {
            this.ReplyBizId = new String(source.ReplyBizId);
        }
        if (source.RecordBizId != null) {
            this.RecordBizId = new String(source.RecordBizId);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.Answer != null) {
            this.Answer = new String(source.Answer);
        }
        if (source.Reasons != null) {
            this.Reasons = new String[source.Reasons.length];
            for (int i = 0; i < source.Reasons.length; i++) {
                this.Reasons[i] = new String(source.Reasons[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReplyBizId", this.ReplyBizId);
        this.setParamSimple(map, prefix + "RecordBizId", this.RecordBizId);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "Answer", this.Answer);
        this.setParamArraySimple(map, prefix + "Reasons.", this.Reasons);

    }
}

