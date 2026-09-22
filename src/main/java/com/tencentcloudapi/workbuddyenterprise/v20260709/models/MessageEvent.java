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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MessageEvent extends AbstractModel {

    /**
    * <p>序号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sequence")
    @Expose
    private Long Sequence;

    /**
    * <p>类型 USER/TOOL/ASSISTANT</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * <p>发生时间 ISO8601</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OccurredAt")
    @Expose
    private String OccurredAt;

    /**
    * <p>消息内容</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private MessageEventMessage Message;

    /**
    * <p>工具调用</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ToolCall")
    @Expose
    private MessageEventToolCall ToolCall;

    /**
     * Get <p>序号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sequence <p>序号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSequence() {
        return this.Sequence;
    }

    /**
     * Set <p>序号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sequence <p>序号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSequence(Long Sequence) {
        this.Sequence = Sequence;
    }

    /**
     * Get <p>类型 USER/TOOL/ASSISTANT</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventType <p>类型 USER/TOOL/ASSISTANT</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set <p>类型 USER/TOOL/ASSISTANT</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventType <p>类型 USER/TOOL/ASSISTANT</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get <p>发生时间 ISO8601</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OccurredAt <p>发生时间 ISO8601</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOccurredAt() {
        return this.OccurredAt;
    }

    /**
     * Set <p>发生时间 ISO8601</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OccurredAt <p>发生时间 ISO8601</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOccurredAt(String OccurredAt) {
        this.OccurredAt = OccurredAt;
    }

    /**
     * Get <p>消息内容</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message <p>消息内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MessageEventMessage getMessage() {
        return this.Message;
    }

    /**
     * Set <p>消息内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message <p>消息内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(MessageEventMessage Message) {
        this.Message = Message;
    }

    /**
     * Get <p>工具调用</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ToolCall <p>工具调用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MessageEventToolCall getToolCall() {
        return this.ToolCall;
    }

    /**
     * Set <p>工具调用</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ToolCall <p>工具调用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setToolCall(MessageEventToolCall ToolCall) {
        this.ToolCall = ToolCall;
    }

    public MessageEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MessageEvent(MessageEvent source) {
        if (source.Sequence != null) {
            this.Sequence = new Long(source.Sequence);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.OccurredAt != null) {
            this.OccurredAt = new String(source.OccurredAt);
        }
        if (source.Message != null) {
            this.Message = new MessageEventMessage(source.Message);
        }
        if (source.ToolCall != null) {
            this.ToolCall = new MessageEventToolCall(source.ToolCall);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sequence", this.Sequence);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "OccurredAt", this.OccurredAt);
        this.setParamObj(map, prefix + "Message.", this.Message);
        this.setParamObj(map, prefix + "ToolCall.", this.ToolCall);

    }
}

