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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EventItem extends AbstractModel {

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * <p>事件</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Event")
    @Expose
    private String Event;

    /**
    * <p>发消息或者收消息的clientid</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * <p>事件的相关信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Info")
    @Expose
    private EventInfo [] Info;

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Timestamp <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Timestamp <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get <p>事件</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Event <p>事件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEvent() {
        return this.Event;
    }

    /**
     * Set <p>事件</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Event <p>事件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEvent(String Event) {
        this.Event = Event;
    }

    /**
     * Get <p>发消息或者收消息的clientid</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClientId <p>发消息或者收消息的clientid</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set <p>发消息或者收消息的clientid</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientId <p>发消息或者收消息的clientid</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get <p>事件的相关信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Info <p>事件的相关信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EventInfo [] getInfo() {
        return this.Info;
    }

    /**
     * Set <p>事件的相关信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Info <p>事件的相关信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInfo(EventInfo [] Info) {
        this.Info = Info;
    }

    public EventItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventItem(EventItem source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Event != null) {
            this.Event = new String(source.Event);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.Info != null) {
            this.Info = new EventInfo[source.Info.length];
            for (int i = 0; i < source.Info.length; i++) {
                this.Info[i] = new EventInfo(source.Info[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamSimple(map, prefix + "Event", this.Event);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamArrayObj(map, prefix + "Info.", this.Info);

    }
}

