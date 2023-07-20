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

public class EventOpsDto extends AbstractModel{

    /**
    * 事件名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

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
    * 数据时间格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DimensionFormat")
    @Expose
    private String DimensionFormat;

    /**
    * 存活时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeToLive")
    @Expose
    private Long TimeToLive;

    /**
    * 存活时间单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeUnit")
    @Expose
    private String TimeUnit;

    /**
    * 创建时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreationTimestamp")
    @Expose
    private String CreationTimestamp;

    /**
    * 所属者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Properties")
    @Expose
    private String Properties;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 监听器
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Listeners")
    @Expose
    private EventListenerOpsDto [] Listeners;

    /**
    * 事件案例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventCases")
    @Expose
    private EventCaseOpsDto [] EventCases;

    /**
     * Get 事件名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 事件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 事件名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 事件名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get 数据时间格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DimensionFormat 数据时间格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDimensionFormat() {
        return this.DimensionFormat;
    }

    /**
     * Set 数据时间格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param DimensionFormat 数据时间格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDimensionFormat(String DimensionFormat) {
        this.DimensionFormat = DimensionFormat;
    }

    /**
     * Get 存活时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeToLive 存活时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeToLive() {
        return this.TimeToLive;
    }

    /**
     * Set 存活时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeToLive 存活时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeToLive(Long TimeToLive) {
        this.TimeToLive = TimeToLive;
    }

    /**
     * Get 存活时间单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeUnit 存活时间单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeUnit() {
        return this.TimeUnit;
    }

    /**
     * Set 存活时间单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeUnit 存活时间单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeUnit(String TimeUnit) {
        this.TimeUnit = TimeUnit;
    }

    /**
     * Get 创建时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreationTimestamp 创建时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreationTimestamp() {
        return this.CreationTimestamp;
    }

    /**
     * Set 创建时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreationTimestamp 创建时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreationTimestamp(String CreationTimestamp) {
        this.CreationTimestamp = CreationTimestamp;
    }

    /**
     * Get 所属者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Owner 所属者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 所属者
注意：此字段可能返回 null，表示取不到有效值。
     * @param Owner 所属者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Properties 属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProperties() {
        return this.Properties;
    }

    /**
     * Set 属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param Properties 属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProperties(String Properties) {
        this.Properties = Properties;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 监听器
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Listeners 监听器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EventListenerOpsDto [] getListeners() {
        return this.Listeners;
    }

    /**
     * Set 监听器
注意：此字段可能返回 null，表示取不到有效值。
     * @param Listeners 监听器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setListeners(EventListenerOpsDto [] Listeners) {
        this.Listeners = Listeners;
    }

    /**
     * Get 事件案例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventCases 事件案例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EventCaseOpsDto [] getEventCases() {
        return this.EventCases;
    }

    /**
     * Set 事件案例
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventCases 事件案例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventCases(EventCaseOpsDto [] EventCases) {
        this.EventCases = EventCases;
    }

    public EventOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventOpsDto(EventOpsDto source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.DimensionFormat != null) {
            this.DimensionFormat = new String(source.DimensionFormat);
        }
        if (source.TimeToLive != null) {
            this.TimeToLive = new Long(source.TimeToLive);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
        }
        if (source.CreationTimestamp != null) {
            this.CreationTimestamp = new String(source.CreationTimestamp);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.Properties != null) {
            this.Properties = new String(source.Properties);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Listeners != null) {
            this.Listeners = new EventListenerOpsDto[source.Listeners.length];
            for (int i = 0; i < source.Listeners.length; i++) {
                this.Listeners[i] = new EventListenerOpsDto(source.Listeners[i]);
            }
        }
        if (source.EventCases != null) {
            this.EventCases = new EventCaseOpsDto[source.EventCases.length];
            for (int i = 0; i < source.EventCases.length; i++) {
                this.EventCases[i] = new EventCaseOpsDto(source.EventCases[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "EventSubType", this.EventSubType);
        this.setParamSimple(map, prefix + "EventBroadcastType", this.EventBroadcastType);
        this.setParamSimple(map, prefix + "DimensionFormat", this.DimensionFormat);
        this.setParamSimple(map, prefix + "TimeToLive", this.TimeToLive);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "CreationTimestamp", this.CreationTimestamp);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "Properties", this.Properties);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Listeners.", this.Listeners);
        this.setParamArrayObj(map, prefix + "EventCases.", this.EventCases);

    }
}

