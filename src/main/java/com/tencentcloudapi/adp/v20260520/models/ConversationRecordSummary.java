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

public class ConversationRecordSummary extends AbstractModel {

    /**
    * <p>回复记录 ID，对应 messages 中回复消息的 record_id</p>
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * <p>用户提问记录 ID，对应 messages 中用户消息的 record_id</p>
    */
    @SerializedName("RelatedRecordId")
    @Expose
    private String RelatedRecordId;

    /**
    * <p>单次对话耗时信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeUsage")
    @Expose
    private ConversationRecordTimeUsage TimeUsage;

    /**
    * <p>单次对话 token 消耗信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TokenUsage")
    @Expose
    private ConversationRecordTokenUsage TokenUsage;

    /**
    * <p>单次对话失败信息；成功时为空</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorInfo")
    @Expose
    private ConversationRecordErrorInfo ErrorInfo;

    /**
    * <p>单次员工助理对话当前状态</p><p>枚举值：</p><ul><li>pending： 待处理</li><li>processing： 处理中</li><li>success： 成功</li><li>failed： 失败</li><li>stop： 停止</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get <p>回复记录 ID，对应 messages 中回复消息的 record_id</p> 
     * @return RecordId <p>回复记录 ID，对应 messages 中回复消息的 record_id</p>
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set <p>回复记录 ID，对应 messages 中回复消息的 record_id</p>
     * @param RecordId <p>回复记录 ID，对应 messages 中回复消息的 record_id</p>
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get <p>用户提问记录 ID，对应 messages 中用户消息的 record_id</p> 
     * @return RelatedRecordId <p>用户提问记录 ID，对应 messages 中用户消息的 record_id</p>
     */
    public String getRelatedRecordId() {
        return this.RelatedRecordId;
    }

    /**
     * Set <p>用户提问记录 ID，对应 messages 中用户消息的 record_id</p>
     * @param RelatedRecordId <p>用户提问记录 ID，对应 messages 中用户消息的 record_id</p>
     */
    public void setRelatedRecordId(String RelatedRecordId) {
        this.RelatedRecordId = RelatedRecordId;
    }

    /**
     * Get <p>单次对话耗时信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeUsage <p>单次对话耗时信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConversationRecordTimeUsage getTimeUsage() {
        return this.TimeUsage;
    }

    /**
     * Set <p>单次对话耗时信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeUsage <p>单次对话耗时信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeUsage(ConversationRecordTimeUsage TimeUsage) {
        this.TimeUsage = TimeUsage;
    }

    /**
     * Get <p>单次对话 token 消耗信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TokenUsage <p>单次对话 token 消耗信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConversationRecordTokenUsage getTokenUsage() {
        return this.TokenUsage;
    }

    /**
     * Set <p>单次对话 token 消耗信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TokenUsage <p>单次对话 token 消耗信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTokenUsage(ConversationRecordTokenUsage TokenUsage) {
        this.TokenUsage = TokenUsage;
    }

    /**
     * Get <p>单次对话失败信息；成功时为空</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorInfo <p>单次对话失败信息；成功时为空</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ConversationRecordErrorInfo getErrorInfo() {
        return this.ErrorInfo;
    }

    /**
     * Set <p>单次对话失败信息；成功时为空</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorInfo <p>单次对话失败信息；成功时为空</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorInfo(ConversationRecordErrorInfo ErrorInfo) {
        this.ErrorInfo = ErrorInfo;
    }

    /**
     * Get <p>单次员工助理对话当前状态</p><p>枚举值：</p><ul><li>pending： 待处理</li><li>processing： 处理中</li><li>success： 成功</li><li>failed： 失败</li><li>stop： 停止</li></ul> 
     * @return Status <p>单次员工助理对话当前状态</p><p>枚举值：</p><ul><li>pending： 待处理</li><li>processing： 处理中</li><li>success： 成功</li><li>failed： 失败</li><li>stop： 停止</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>单次员工助理对话当前状态</p><p>枚举值：</p><ul><li>pending： 待处理</li><li>processing： 处理中</li><li>success： 成功</li><li>failed： 失败</li><li>stop： 停止</li></ul>
     * @param Status <p>单次员工助理对话当前状态</p><p>枚举值：</p><ul><li>pending： 待处理</li><li>processing： 处理中</li><li>success： 成功</li><li>failed： 失败</li><li>stop： 停止</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ConversationRecordSummary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConversationRecordSummary(ConversationRecordSummary source) {
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.RelatedRecordId != null) {
            this.RelatedRecordId = new String(source.RelatedRecordId);
        }
        if (source.TimeUsage != null) {
            this.TimeUsage = new ConversationRecordTimeUsage(source.TimeUsage);
        }
        if (source.TokenUsage != null) {
            this.TokenUsage = new ConversationRecordTokenUsage(source.TokenUsage);
        }
        if (source.ErrorInfo != null) {
            this.ErrorInfo = new ConversationRecordErrorInfo(source.ErrorInfo);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "RelatedRecordId", this.RelatedRecordId);
        this.setParamObj(map, prefix + "TimeUsage.", this.TimeUsage);
        this.setParamObj(map, prefix + "TokenUsage.", this.TokenUsage);
        this.setParamObj(map, prefix + "ErrorInfo.", this.ErrorInfo);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

