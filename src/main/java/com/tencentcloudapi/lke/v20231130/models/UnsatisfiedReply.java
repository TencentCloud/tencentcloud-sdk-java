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
    * 问题回复
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
    * 处理状态，0：待处理，1：已拒答，2：已忽略，3：已纠错
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间，秒级时间戳
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间,秒级时间戳
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 操作人
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 自定义反馈
    */
    @SerializedName("FeedbackContent")
    @Expose
    private String FeedbackContent;

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
     * Get 问题回复
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Answer 问题回复
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAnswer() {
        return this.Answer;
    }

    /**
     * Set 问题回复
注意：此字段可能返回 null，表示取不到有效值。
     * @param Answer 问题回复
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

    /**
     * Get 处理状态，0：待处理，1：已拒答，2：已忽略，3：已纠错
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 处理状态，0：待处理，1：已拒答，2：已忽略，3：已纠错
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 处理状态，0：待处理，1：已拒答，2：已忽略，3：已纠错
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 处理状态，0：待处理，1：已拒答，2：已忽略，3：已纠错
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间，秒级时间戳 
     * @return CreateTime 创建时间，秒级时间戳
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，秒级时间戳
     * @param CreateTime 创建时间，秒级时间戳
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间,秒级时间戳 
     * @return UpdateTime 更新时间,秒级时间戳
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间,秒级时间戳
     * @param UpdateTime 更新时间,秒级时间戳
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 操作人 
     * @return Operator 操作人
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人
     * @param Operator 操作人
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 自定义反馈 
     * @return FeedbackContent 自定义反馈
     */
    public String getFeedbackContent() {
        return this.FeedbackContent;
    }

    /**
     * Set 自定义反馈
     * @param FeedbackContent 自定义反馈
     */
    public void setFeedbackContent(String FeedbackContent) {
        this.FeedbackContent = FeedbackContent;
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
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.FeedbackContent != null) {
            this.FeedbackContent = new String(source.FeedbackContent);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "FeedbackContent", this.FeedbackContent);

    }
}

