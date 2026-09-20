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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventInfo extends AbstractModel {

    /**
    * <p>事件 ID。为空时由服务生成。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * <p>调用 ID，最大长度 128 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvocationId")
    @Expose
    private String InvocationId;

    /**
    * <p>事件作者，最大长度 128 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Author")
    @Expose
    private String Author;

    /**
    * <p>事件内容。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Content")
    @Expose
    private EventContentInfo Content;

    /**
    * <p>事件动作信息。StateDelta 为 JSON 对象字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Actions")
    @Expose
    private EventActionsInfo Actions;

    /**
    * <p>事件元数据。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Metadata")
    @Expose
    private String Metadata;

    /**
    * <p>事件扩展信息 JSON 对象字符串，最大长度 8192 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Extensions")
    @Expose
    private String Extensions;

    /**
    * <p>错误码，最大长度 128 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * <p>错误信息，最大长度 2048 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * <p>事件时间。</p>
    */
    @SerializedName("Timestamp")
    @Expose
    private String Timestamp;

    /**
     * Get <p>事件 ID。为空时由服务生成。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventId <p>事件 ID。为空时由服务生成。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set <p>事件 ID。为空时由服务生成。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventId <p>事件 ID。为空时由服务生成。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get <p>调用 ID，最大长度 128 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvocationId <p>调用 ID，最大长度 128 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInvocationId() {
        return this.InvocationId;
    }

    /**
     * Set <p>调用 ID，最大长度 128 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvocationId <p>调用 ID，最大长度 128 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvocationId(String InvocationId) {
        this.InvocationId = InvocationId;
    }

    /**
     * Get <p>事件作者，最大长度 128 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Author <p>事件作者，最大长度 128 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuthor() {
        return this.Author;
    }

    /**
     * Set <p>事件作者，最大长度 128 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Author <p>事件作者，最大长度 128 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    /**
     * Get <p>事件内容。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Content <p>事件内容。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EventContentInfo getContent() {
        return this.Content;
    }

    /**
     * Set <p>事件内容。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Content <p>事件内容。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContent(EventContentInfo Content) {
        this.Content = Content;
    }

    /**
     * Get <p>事件动作信息。StateDelta 为 JSON 对象字符串</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Actions <p>事件动作信息。StateDelta 为 JSON 对象字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EventActionsInfo getActions() {
        return this.Actions;
    }

    /**
     * Set <p>事件动作信息。StateDelta 为 JSON 对象字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Actions <p>事件动作信息。StateDelta 为 JSON 对象字符串</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActions(EventActionsInfo Actions) {
        this.Actions = Actions;
    }

    /**
     * Get <p>事件元数据。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Metadata <p>事件元数据。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetadata() {
        return this.Metadata;
    }

    /**
     * Set <p>事件元数据。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Metadata <p>事件元数据。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetadata(String Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * Get <p>事件扩展信息 JSON 对象字符串，最大长度 8192 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Extensions <p>事件扩展信息 JSON 对象字符串，最大长度 8192 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExtensions() {
        return this.Extensions;
    }

    /**
     * Set <p>事件扩展信息 JSON 对象字符串，最大长度 8192 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Extensions <p>事件扩展信息 JSON 对象字符串，最大长度 8192 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtensions(String Extensions) {
        this.Extensions = Extensions;
    }

    /**
     * Get <p>错误码，最大长度 128 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorCode <p>错误码，最大长度 128 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set <p>错误码，最大长度 128 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorCode <p>错误码，最大长度 128 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get <p>错误信息，最大长度 2048 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMessage <p>错误信息，最大长度 2048 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>错误信息，最大长度 2048 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMessage <p>错误信息，最大长度 2048 字符。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get <p>事件时间。</p> 
     * @return Timestamp <p>事件时间。</p>
     */
    public String getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>事件时间。</p>
     * @param Timestamp <p>事件时间。</p>
     */
    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    public EventInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventInfo(EventInfo source) {
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.InvocationId != null) {
            this.InvocationId = new String(source.InvocationId);
        }
        if (source.Author != null) {
            this.Author = new String(source.Author);
        }
        if (source.Content != null) {
            this.Content = new EventContentInfo(source.Content);
        }
        if (source.Actions != null) {
            this.Actions = new EventActionsInfo(source.Actions);
        }
        if (source.Metadata != null) {
            this.Metadata = new String(source.Metadata);
        }
        if (source.Extensions != null) {
            this.Extensions = new String(source.Extensions);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.Timestamp != null) {
            this.Timestamp = new String(source.Timestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "InvocationId", this.InvocationId);
        this.setParamSimple(map, prefix + "Author", this.Author);
        this.setParamObj(map, prefix + "Content.", this.Content);
        this.setParamObj(map, prefix + "Actions.", this.Actions);
        this.setParamSimple(map, prefix + "Metadata", this.Metadata);
        this.setParamSimple(map, prefix + "Extensions", this.Extensions);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);

    }
}

