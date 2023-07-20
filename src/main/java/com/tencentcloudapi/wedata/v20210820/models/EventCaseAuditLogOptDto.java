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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventCaseAuditLogOptDto extends AbstractModel{

    /**
    * 事件实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CaseId")
    @Expose
    private String CaseId;

    /**
    * 事件名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * 事件类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * 事件分割类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventSubType")
    @Expose
    private String EventSubType;

    /**
    * 事件广播类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventBroadcastType")
    @Expose
    private String EventBroadcastType;

    /**
    * 事件实例存活时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TTL")
    @Expose
    private Long TTL;

    /**
    * 事件实例存活时间单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 数据时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Dimension")
    @Expose
    private String Dimension;

    /**
    * 事件实例状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 事件实例触发时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventTriggerTimestamp")
    @Expose
    private String EventTriggerTimestamp;

    /**
    * 事件实例消费时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogTimestamp")
    @Expose
    private String LogTimestamp;

    /**
    * 事件实例描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 事件实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CaseId 事件实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCaseId() {
        return this.CaseId;
    }

    /**
     * Set 事件实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CaseId 事件实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCaseId(String CaseId) {
        this.CaseId = CaseId;
    }

    /**
     * Get 事件名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventName 事件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set 事件名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventName 事件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get 事件类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventType 事件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventType 事件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 事件分割类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventSubType 事件分割类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventSubType() {
        return this.EventSubType;
    }

    /**
     * Set 事件分割类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventSubType 事件分割类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventSubType(String EventSubType) {
        this.EventSubType = EventSubType;
    }

    /**
     * Get 事件广播类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventBroadcastType 事件广播类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventBroadcastType() {
        return this.EventBroadcastType;
    }

    /**
     * Set 事件广播类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventBroadcastType 事件广播类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventBroadcastType(String EventBroadcastType) {
        this.EventBroadcastType = EventBroadcastType;
    }

    /**
     * Get 事件实例存活时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TTL 事件实例存活时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTTL() {
        return this.TTL;
    }

    /**
     * Set 事件实例存活时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TTL 事件实例存活时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTTL(Long TTL) {
        this.TTL = TTL;
    }

    /**
     * Get 事件实例存活时间单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeUnit 事件实例存活时间单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 事件实例存活时间单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeUnit 事件实例存活时间单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 数据时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Dimension 数据时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDimension() {
        return this.Dimension;
    }

    /**
     * Set 数据时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param Dimension 数据时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDimension(String Dimension) {
        this.Dimension = Dimension;
    }

    /**
     * Get 事件实例状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 事件实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 事件实例状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 事件实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 事件实例触发时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventTriggerTimestamp 事件实例触发时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventTriggerTimestamp() {
        return this.EventTriggerTimestamp;
    }

    /**
     * Set 事件实例触发时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventTriggerTimestamp 事件实例触发时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventTriggerTimestamp(String EventTriggerTimestamp) {
        this.EventTriggerTimestamp = EventTriggerTimestamp;
    }

    /**
     * Get 事件实例消费时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogTimestamp 事件实例消费时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogTimestamp() {
        return this.LogTimestamp;
    }

    /**
     * Set 事件实例消费时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogTimestamp 事件实例消费时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogTimestamp(String LogTimestamp) {
        this.LogTimestamp = LogTimestamp;
    }

    /**
     * Get 事件实例描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 事件实例描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 事件实例描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 事件实例描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public EventCaseAuditLogOptDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventCaseAuditLogOptDto(EventCaseAuditLogOptDto source) {
        if (source.CaseId != null) {
            this.CaseId = new String(source.CaseId);
        }
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.EventSubType != null) {
            this.EventSubType = new String(source.EventSubType);
        }
        if (source.EventBroadcastType != null) {
            this.EventBroadcastType = new String(source.EventBroadcastType);
        }
        if (source.TTL != null) {
            this.TTL = new Long(source.TTL);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.Dimension != null) {
            this.Dimension = new String(source.Dimension);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.EventTriggerTimestamp != null) {
            this.EventTriggerTimestamp = new String(source.EventTriggerTimestamp);
        }
        if (source.LogTimestamp != null) {
            this.LogTimestamp = new String(source.LogTimestamp);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CaseId", this.CaseId);
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "EventSubType", this.EventSubType);
        this.setParamSimple(map, prefix + "EventBroadcastType", this.EventBroadcastType);
        this.setParamSimple(map, prefix + "TTL", this.TTL);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "Dimension", this.Dimension);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EventTriggerTimestamp", this.EventTriggerTimestamp);
        this.setParamSimple(map, prefix + "LogTimestamp", this.LogTimestamp);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

