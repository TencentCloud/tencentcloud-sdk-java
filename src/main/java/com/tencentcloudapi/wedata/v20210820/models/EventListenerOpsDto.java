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

public class EventListenerOpsDto extends AbstractModel{

    /**
    * 事件名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EventName")
    @Expose
    private String EventName;

    /**
    * 关键字，如果是任务，则是任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 触发方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 事件属性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Properties")
    @Expose
    private String Properties;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreationTimestamp")
    @Expose
    private String CreationTimestamp;

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
     * Get 关键字，如果是任务，则是任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key 关键字，如果是任务，则是任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 关键字，如果是任务，则是任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key 关键字，如果是任务，则是任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 触发方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 触发方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 触发方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 触发方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 事件属性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Properties 事件属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProperties() {
        return this.Properties;
    }

    /**
     * Set 事件属性
注意：此字段可能返回 null，表示取不到有效值。
     * @param Properties 事件属性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProperties(String Properties) {
        this.Properties = Properties;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreationTimestamp 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreationTimestamp() {
        return this.CreationTimestamp;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreationTimestamp 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreationTimestamp(String CreationTimestamp) {
        this.CreationTimestamp = CreationTimestamp;
    }

    public EventListenerOpsDto() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EventListenerOpsDto(EventListenerOpsDto source) {
        if (source.EventName != null) {
            this.EventName = new String(source.EventName);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Properties != null) {
            this.Properties = new String(source.Properties);
        }
        if (source.CreationTimestamp != null) {
            this.CreationTimestamp = new String(source.CreationTimestamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventName", this.EventName);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Properties", this.Properties);
        this.setParamSimple(map, prefix + "CreationTimestamp", this.CreationTimestamp);

    }
}

