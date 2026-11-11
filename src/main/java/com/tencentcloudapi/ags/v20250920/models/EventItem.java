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

public class EventItem extends AbstractModel {

    /**
    * <p>事件唯一标识，用于区分事件及识别重复投递。聚合模式下为该聚合结果代表事件的标识。</p>
    */
    @SerializedName("EventId")
    @Expose
    private String EventId;

    /**
    * <p>事件来源。</p>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * <p>事件关联的对象类型。</p>
    */
    @SerializedName("ObjectType")
    @Expose
    private String ObjectType;

    /**
    * <p>事件关联的对象 ID。</p>
    */
    @SerializedName("ObjectId")
    @Expose
    private String ObjectId;

    /**
    * <p>事件级别。Normal 表示正常事件，Warning 表示告警事件。</p>
    */
    @SerializedName("EventLevel")
    @Expose
    private String EventLevel;

    /**
    * <p>事件类型。</p>
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * <p>事件原因标识，无原因信息时不返回。例如 Manual 表示通过停止接口主动停止，包括人工、脚本或 SDK 调用，不代表一定由人工操作。</p>
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * <p>事件的说明文本。建议使用 EventType 和 Reason 判断事件类型及原因，不依赖说明文本进行业务判断。</p>
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>事件扩展信息，以 JSON 字符串返回。当前 Sandbox 事件包含 ToolId、ToolType，以及可选的 ToolName。调用方需解析 JSON 字符串后读取扩展字段。</p>
    */
    @SerializedName("Extensions")
    @Expose
    private String Extensions;

    /**
    * <p>事件发生时间，RFC3339 格式。仅 Raw 模式返回。</p>
    */
    @SerializedName("OccurredAt")
    @Expose
    private String OccurredAt;

    /**
    * <p>当前查询范围内，该聚合结果包含的去重事件数。仅 Aggregate 模式返回。当前生命周期事件逐条展示，该值为 1。</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * <p>当前查询范围内，该聚合结果中最早的事件发生时间，RFC3339 格式。仅 Aggregate 模式返回，不代表该对象历史上的首次事件时间。</p>
    */
    @SerializedName("FirstOccurredAt")
    @Expose
    private String FirstOccurredAt;

    /**
    * <p>当前查询范围内，该聚合结果中最近的事件发生时间，RFC3339 格式。仅 Aggregate 模式返回，不代表该对象此后不会再发生事件。</p>
    */
    @SerializedName("LastOccurredAt")
    @Expose
    private String LastOccurredAt;

    /**
     * Get <p>事件唯一标识，用于区分事件及识别重复投递。聚合模式下为该聚合结果代表事件的标识。</p> 
     * @return EventId <p>事件唯一标识，用于区分事件及识别重复投递。聚合模式下为该聚合结果代表事件的标识。</p>
     */
    public String getEventId() {
        return this.EventId;
    }

    /**
     * Set <p>事件唯一标识，用于区分事件及识别重复投递。聚合模式下为该聚合结果代表事件的标识。</p>
     * @param EventId <p>事件唯一标识，用于区分事件及识别重复投递。聚合模式下为该聚合结果代表事件的标识。</p>
     */
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    /**
     * Get <p>事件来源。</p> 
     * @return Source <p>事件来源。</p>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set <p>事件来源。</p>
     * @param Source <p>事件来源。</p>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get <p>事件关联的对象类型。</p> 
     * @return ObjectType <p>事件关联的对象类型。</p>
     */
    public String getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set <p>事件关联的对象类型。</p>
     * @param ObjectType <p>事件关联的对象类型。</p>
     */
    public void setObjectType(String ObjectType) {
        this.ObjectType = ObjectType;
    }

    /**
     * Get <p>事件关联的对象 ID。</p> 
     * @return ObjectId <p>事件关联的对象 ID。</p>
     */
    public String getObjectId() {
        return this.ObjectId;
    }

    /**
     * Set <p>事件关联的对象 ID。</p>
     * @param ObjectId <p>事件关联的对象 ID。</p>
     */
    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
    }

    /**
     * Get <p>事件级别。Normal 表示正常事件，Warning 表示告警事件。</p> 
     * @return EventLevel <p>事件级别。Normal 表示正常事件，Warning 表示告警事件。</p>
     */
    public String getEventLevel() {
        return this.EventLevel;
    }

    /**
     * Set <p>事件级别。Normal 表示正常事件，Warning 表示告警事件。</p>
     * @param EventLevel <p>事件级别。Normal 表示正常事件，Warning 表示告警事件。</p>
     */
    public void setEventLevel(String EventLevel) {
        this.EventLevel = EventLevel;
    }

    /**
     * Get <p>事件类型。</p> 
     * @return EventType <p>事件类型。</p>
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set <p>事件类型。</p>
     * @param EventType <p>事件类型。</p>
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get <p>事件原因标识，无原因信息时不返回。例如 Manual 表示通过停止接口主动停止，包括人工、脚本或 SDK 调用，不代表一定由人工操作。</p> 
     * @return Reason <p>事件原因标识，无原因信息时不返回。例如 Manual 表示通过停止接口主动停止，包括人工、脚本或 SDK 调用，不代表一定由人工操作。</p>
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>事件原因标识，无原因信息时不返回。例如 Manual 表示通过停止接口主动停止，包括人工、脚本或 SDK 调用，不代表一定由人工操作。</p>
     * @param Reason <p>事件原因标识，无原因信息时不返回。例如 Manual 表示通过停止接口主动停止，包括人工、脚本或 SDK 调用，不代表一定由人工操作。</p>
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get <p>事件的说明文本。建议使用 EventType 和 Reason 判断事件类型及原因，不依赖说明文本进行业务判断。</p> 
     * @return Message <p>事件的说明文本。建议使用 EventType 和 Reason 判断事件类型及原因，不依赖说明文本进行业务判断。</p>
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>事件的说明文本。建议使用 EventType 和 Reason 判断事件类型及原因，不依赖说明文本进行业务判断。</p>
     * @param Message <p>事件的说明文本。建议使用 EventType 和 Reason 判断事件类型及原因，不依赖说明文本进行业务判断。</p>
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>事件扩展信息，以 JSON 字符串返回。当前 Sandbox 事件包含 ToolId、ToolType，以及可选的 ToolName。调用方需解析 JSON 字符串后读取扩展字段。</p> 
     * @return Extensions <p>事件扩展信息，以 JSON 字符串返回。当前 Sandbox 事件包含 ToolId、ToolType，以及可选的 ToolName。调用方需解析 JSON 字符串后读取扩展字段。</p>
     */
    public String getExtensions() {
        return this.Extensions;
    }

    /**
     * Set <p>事件扩展信息，以 JSON 字符串返回。当前 Sandbox 事件包含 ToolId、ToolType，以及可选的 ToolName。调用方需解析 JSON 字符串后读取扩展字段。</p>
     * @param Extensions <p>事件扩展信息，以 JSON 字符串返回。当前 Sandbox 事件包含 ToolId、ToolType，以及可选的 ToolName。调用方需解析 JSON 字符串后读取扩展字段。</p>
     */
    public void setExtensions(String Extensions) {
        this.Extensions = Extensions;
    }

    /**
     * Get <p>事件发生时间，RFC3339 格式。仅 Raw 模式返回。</p> 
     * @return OccurredAt <p>事件发生时间，RFC3339 格式。仅 Raw 模式返回。</p>
     */
    public String getOccurredAt() {
        return this.OccurredAt;
    }

    /**
     * Set <p>事件发生时间，RFC3339 格式。仅 Raw 模式返回。</p>
     * @param OccurredAt <p>事件发生时间，RFC3339 格式。仅 Raw 模式返回。</p>
     */
    public void setOccurredAt(String OccurredAt) {
        this.OccurredAt = OccurredAt;
    }

    /**
     * Get <p>当前查询范围内，该聚合结果包含的去重事件数。仅 Aggregate 模式返回。当前生命周期事件逐条展示，该值为 1。</p> 
     * @return Count <p>当前查询范围内，该聚合结果包含的去重事件数。仅 Aggregate 模式返回。当前生命周期事件逐条展示，该值为 1。</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>当前查询范围内，该聚合结果包含的去重事件数。仅 Aggregate 模式返回。当前生命周期事件逐条展示，该值为 1。</p>
     * @param Count <p>当前查询范围内，该聚合结果包含的去重事件数。仅 Aggregate 模式返回。当前生命周期事件逐条展示，该值为 1。</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get <p>当前查询范围内，该聚合结果中最早的事件发生时间，RFC3339 格式。仅 Aggregate 模式返回，不代表该对象历史上的首次事件时间。</p> 
     * @return FirstOccurredAt <p>当前查询范围内，该聚合结果中最早的事件发生时间，RFC3339 格式。仅 Aggregate 模式返回，不代表该对象历史上的首次事件时间。</p>
     */
    public String getFirstOccurredAt() {
        return this.FirstOccurredAt;
    }

    /**
     * Set <p>当前查询范围内，该聚合结果中最早的事件发生时间，RFC3339 格式。仅 Aggregate 模式返回，不代表该对象历史上的首次事件时间。</p>
     * @param FirstOccurredAt <p>当前查询范围内，该聚合结果中最早的事件发生时间，RFC3339 格式。仅 Aggregate 模式返回，不代表该对象历史上的首次事件时间。</p>
     */
    public void setFirstOccurredAt(String FirstOccurredAt) {
        this.FirstOccurredAt = FirstOccurredAt;
    }

    /**
     * Get <p>当前查询范围内，该聚合结果中最近的事件发生时间，RFC3339 格式。仅 Aggregate 模式返回，不代表该对象此后不会再发生事件。</p> 
     * @return LastOccurredAt <p>当前查询范围内，该聚合结果中最近的事件发生时间，RFC3339 格式。仅 Aggregate 模式返回，不代表该对象此后不会再发生事件。</p>
     */
    public String getLastOccurredAt() {
        return this.LastOccurredAt;
    }

    /**
     * Set <p>当前查询范围内，该聚合结果中最近的事件发生时间，RFC3339 格式。仅 Aggregate 模式返回，不代表该对象此后不会再发生事件。</p>
     * @param LastOccurredAt <p>当前查询范围内，该聚合结果中最近的事件发生时间，RFC3339 格式。仅 Aggregate 模式返回，不代表该对象此后不会再发生事件。</p>
     */
    public void setLastOccurredAt(String LastOccurredAt) {
        this.LastOccurredAt = LastOccurredAt;
    }

    public EventItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventItem(EventItem source) {
        if (source.EventId != null) {
            this.EventId = new String(source.EventId);
        }
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.ObjectType != null) {
            this.ObjectType = new String(source.ObjectType);
        }
        if (source.ObjectId != null) {
            this.ObjectId = new String(source.ObjectId);
        }
        if (source.EventLevel != null) {
            this.EventLevel = new String(source.EventLevel);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Extensions != null) {
            this.Extensions = new String(source.Extensions);
        }
        if (source.OccurredAt != null) {
            this.OccurredAt = new String(source.OccurredAt);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.FirstOccurredAt != null) {
            this.FirstOccurredAt = new String(source.FirstOccurredAt);
        }
        if (source.LastOccurredAt != null) {
            this.LastOccurredAt = new String(source.LastOccurredAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "ObjectType", this.ObjectType);
        this.setParamSimple(map, prefix + "ObjectId", this.ObjectId);
        this.setParamSimple(map, prefix + "EventLevel", this.EventLevel);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Extensions", this.Extensions);
        this.setParamSimple(map, prefix + "OccurredAt", this.OccurredAt);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "FirstOccurredAt", this.FirstOccurredAt);
        this.setParamSimple(map, prefix + "LastOccurredAt", this.LastOccurredAt);

    }
}

