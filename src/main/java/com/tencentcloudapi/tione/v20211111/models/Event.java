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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Event extends AbstractModel {

    /**
    * 事件的id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 事件的具体信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 事件第一次发生的时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstTimestamp")
    @Expose
    private String FirstTimestamp;

    /**
    * 事件最后一次发生的时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastTimestamp")
    @Expose
    private String LastTimestamp;

    /**
    * 事件发生的次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 事件的类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 事件关联的资源的类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceKind")
    @Expose
    private String ResourceKind;

    /**
    * 事件关联的资源的名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
     * Get 事件的id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 事件的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 事件的id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 事件的id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 事件的具体信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 事件的具体信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 事件的具体信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 事件的具体信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 事件第一次发生的时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstTimestamp 事件第一次发生的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFirstTimestamp() {
        return this.FirstTimestamp;
    }

    /**
     * Set 事件第一次发生的时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstTimestamp 事件第一次发生的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstTimestamp(String FirstTimestamp) {
        this.FirstTimestamp = FirstTimestamp;
    }

    /**
     * Get 事件最后一次发生的时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastTimestamp 事件最后一次发生的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastTimestamp() {
        return this.LastTimestamp;
    }

    /**
     * Set 事件最后一次发生的时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastTimestamp 事件最后一次发生的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastTimestamp(String LastTimestamp) {
        this.LastTimestamp = LastTimestamp;
    }

    /**
     * Get 事件发生的次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Count 事件发生的次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 事件发生的次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Count 事件发生的次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 事件的类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 事件的类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 事件的类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 事件的类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 事件关联的资源的类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceKind 事件关联的资源的类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceKind() {
        return this.ResourceKind;
    }

    /**
     * Set 事件关联的资源的类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceKind 事件关联的资源的类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceKind(String ResourceKind) {
        this.ResourceKind = ResourceKind;
    }

    /**
     * Get 事件关联的资源的名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceName 事件关联的资源的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 事件关联的资源的名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceName 事件关联的资源的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    public Event() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Event(Event source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.FirstTimestamp != null) {
            this.FirstTimestamp = new String(source.FirstTimestamp);
        }
        if (source.LastTimestamp != null) {
            this.LastTimestamp = new String(source.LastTimestamp);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ResourceKind != null) {
            this.ResourceKind = new String(source.ResourceKind);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "FirstTimestamp", this.FirstTimestamp);
        this.setParamSimple(map, prefix + "LastTimestamp", this.LastTimestamp);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ResourceKind", this.ResourceKind);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);

    }
}

