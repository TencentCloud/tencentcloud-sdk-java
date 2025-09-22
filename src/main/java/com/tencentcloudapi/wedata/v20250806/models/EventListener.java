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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventListener extends AbstractModel {

    /**
    * 事件名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * 事件周期：SECOND, MIN, HOUR, DAY
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventSubType")
    @Expose
    private String EventSubType;

    /**
    * 事件广播类型：SINGLE, BROADCAST
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventBroadcastType")
    @Expose
    private String EventBroadcastType;

    /**
    * 扩展信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PropertiesList")
    @Expose
    private ParamInfo [] PropertiesList;

    /**
     * Get 事件名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventName 事件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventName() {
        return this.EventName;
    }

    /**
     * Set 事件名
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventName 事件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventName(String EventName) {
        this.EventName = EventName;
    }

    /**
     * Get 事件周期：SECOND, MIN, HOUR, DAY
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventSubType 事件周期：SECOND, MIN, HOUR, DAY
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventSubType() {
        return this.EventSubType;
    }

    /**
     * Set 事件周期：SECOND, MIN, HOUR, DAY
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventSubType 事件周期：SECOND, MIN, HOUR, DAY
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventSubType(String EventSubType) {
        this.EventSubType = EventSubType;
    }

    /**
     * Get 事件广播类型：SINGLE, BROADCAST
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EventBroadcastType 事件广播类型：SINGLE, BROADCAST
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEventBroadcastType() {
        return this.EventBroadcastType;
    }

    /**
     * Set 事件广播类型：SINGLE, BROADCAST
注意：此字段可能返回 null，表示取不到有效值。
     * @param EventBroadcastType 事件广播类型：SINGLE, BROADCAST
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEventBroadcastType(String EventBroadcastType) {
        this.EventBroadcastType = EventBroadcastType;
    }

    /**
     * Get 扩展信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PropertiesList 扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ParamInfo [] getPropertiesList() {
        return this.PropertiesList;
    }

    /**
     * Set 扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PropertiesList 扩展信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPropertiesList(ParamInfo [] PropertiesList) {
        this.PropertiesList = PropertiesList;
    }

    public EventListener() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventListener(EventListener source) {
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.EventSubType != null) {
            this.EventSubType = new String(source.EventSubType);
        }
        if (source.EventBroadcastType != null) {
            this.EventBroadcastType = new String(source.EventBroadcastType);
        }
        if (source.PropertiesList != null) {
            this.PropertiesList = new ParamInfo[source.PropertiesList.length];
            for (int i = 0; i < source.PropertiesList.length; i++) {
                this.PropertiesList[i] = new ParamInfo(source.PropertiesList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "EventSubType", this.EventSubType);
        this.setParamSimple(map, prefix + "EventBroadcastType", this.EventBroadcastType);
        this.setParamArrayObj(map, prefix + "PropertiesList.", this.PropertiesList);

    }
}

