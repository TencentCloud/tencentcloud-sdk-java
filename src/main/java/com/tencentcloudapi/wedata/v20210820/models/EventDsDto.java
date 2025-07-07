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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventDsDto extends AbstractModel {

    /**
    * 事件名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 事件类型GENERAL、TIME_SERIES
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

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
    * 事件分割类型 SECOND、MIN、HOUR、DAY
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventSubType")
    @Expose
    private String EventSubType;

    /**
    * 事件广播类型SINGLE、BROADCAST
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventBroadcastType")
    @Expose
    private String EventBroadcastType;

    /**
    * 时间格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DimensionFormat")
    @Expose
    private String DimensionFormat;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreationTs")
    @Expose
    private String CreationTs;

    /**
    * 事件所属人
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
    * 描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 事件监听者信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Listeners")
    @Expose
    private EventListenerDTO [] Listeners;

    /**
    * 项目id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

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
     * Get 事件类型GENERAL、TIME_SERIES
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventType 事件类型GENERAL、TIME_SERIES
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型GENERAL、TIME_SERIES
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventType 事件类型GENERAL、TIME_SERIES
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
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
     * Get 事件分割类型 SECOND、MIN、HOUR、DAY
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventSubType 事件分割类型 SECOND、MIN、HOUR、DAY
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventSubType() {
        return this.EventSubType;
    }

    /**
     * Set 事件分割类型 SECOND、MIN、HOUR、DAY
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventSubType 事件分割类型 SECOND、MIN、HOUR、DAY
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventSubType(String EventSubType) {
        this.EventSubType = EventSubType;
    }

    /**
     * Get 事件广播类型SINGLE、BROADCAST
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventBroadcastType 事件广播类型SINGLE、BROADCAST
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventBroadcastType() {
        return this.EventBroadcastType;
    }

    /**
     * Set 事件广播类型SINGLE、BROADCAST
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventBroadcastType 事件广播类型SINGLE、BROADCAST
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventBroadcastType(String EventBroadcastType) {
        this.EventBroadcastType = EventBroadcastType;
    }

    /**
     * Get 时间格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DimensionFormat 时间格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDimensionFormat() {
        return this.DimensionFormat;
    }

    /**
     * Set 时间格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param DimensionFormat 时间格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDimensionFormat(String DimensionFormat) {
        this.DimensionFormat = DimensionFormat;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreationTs 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreationTs() {
        return this.CreationTs;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreationTs 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreationTs(String CreationTs) {
        this.CreationTs = CreationTs;
    }

    /**
     * Get 事件所属人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Owner 事件所属人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 事件所属人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Owner 事件所属人
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
     * Get 描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 事件监听者信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Listeners 事件监听者信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EventListenerDTO [] getListeners() {
        return this.Listeners;
    }

    /**
     * Set 事件监听者信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Listeners 事件监听者信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setListeners(EventListenerDTO [] Listeners) {
        this.Listeners = Listeners;
    }

    /**
     * Get 项目id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 项目名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public EventDsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventDsDto(EventDsDto source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.TimeToLive != null) {
            this.TimeToLive = new Long(source.TimeToLive);
        }
        if (source.TimeUnit != null) {
            this.TimeUnit = new String(source.TimeUnit);
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
        if (source.CreationTs != null) {
            this.CreationTs = new String(source.CreationTs);
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
            this.Listeners = new EventListenerDTO[source.Listeners.length];
            for (int i = 0; i < source.Listeners.length; i++) {
                this.Listeners[i] = new EventListenerDTO(source.Listeners[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "TimeToLive", this.TimeToLive);
        this.setParamSimple(map, prefix + "TimeUnit", this.TimeUnit);
        this.setParamSimple(map, prefix + "EventSubType", this.EventSubType);
        this.setParamSimple(map, prefix + "EventBroadcastType", this.EventBroadcastType);
        this.setParamSimple(map, prefix + "DimensionFormat", this.DimensionFormat);
        this.setParamSimple(map, prefix + "CreationTs", this.CreationTs);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "Properties", this.Properties);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Listeners.", this.Listeners);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);

    }
}

