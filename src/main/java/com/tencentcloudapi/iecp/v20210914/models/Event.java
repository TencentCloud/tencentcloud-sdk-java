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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Event extends AbstractModel{

    /**
    * 第一次出现时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstTime")
    @Expose
    private String FirstTime;

    /**
    * 最后一次出现时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastTime")
    @Expose
    private String LastTime;

    /**
    * 事件关联对象类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvolvedObjectKind")
    @Expose
    private String InvolvedObjectKind;

    /**
    * 事件关联对象名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvolvedObjectName")
    @Expose
    private String InvolvedObjectName;

    /**
    * 事件类型(Normal|Warning)
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 出现次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 第一次出现时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstTime 第一次出现时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFirstTime() {
        return this.FirstTime;
    }

    /**
     * Set 第一次出现时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstTime 第一次出现时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstTime(String FirstTime) {
        this.FirstTime = FirstTime;
    }

    /**
     * Get 最后一次出现时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastTime 最后一次出现时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastTime() {
        return this.LastTime;
    }

    /**
     * Set 最后一次出现时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastTime 最后一次出现时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastTime(String LastTime) {
        this.LastTime = LastTime;
    }

    /**
     * Get 事件关联对象类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvolvedObjectKind 事件关联对象类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInvolvedObjectKind() {
        return this.InvolvedObjectKind;
    }

    /**
     * Set 事件关联对象类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvolvedObjectKind 事件关联对象类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvolvedObjectKind(String InvolvedObjectKind) {
        this.InvolvedObjectKind = InvolvedObjectKind;
    }

    /**
     * Get 事件关联对象名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvolvedObjectName 事件关联对象名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInvolvedObjectName() {
        return this.InvolvedObjectName;
    }

    /**
     * Set 事件关联对象名
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvolvedObjectName 事件关联对象名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvolvedObjectName(String InvolvedObjectName) {
        this.InvolvedObjectName = InvolvedObjectName;
    }

    /**
     * Get 事件类型(Normal|Warning) 
     * @return Type 事件类型(Normal|Warning)
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 事件类型(Normal|Warning)
     * @param Type 事件类型(Normal|Warning)
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reason 原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reason 原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 出现次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Count 出现次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 出现次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Count 出现次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public Event() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Event(Event source) {
        if (source.FirstTime != null) {
            this.FirstTime = new String(source.FirstTime);
        }
        if (source.LastTime != null) {
            this.LastTime = new String(source.LastTime);
        }
        if (source.InvolvedObjectKind != null) {
            this.InvolvedObjectKind = new String(source.InvolvedObjectKind);
        }
        if (source.InvolvedObjectName != null) {
            this.InvolvedObjectName = new String(source.InvolvedObjectName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FirstTime", this.FirstTime);
        this.setParamSimple(map, prefix + "LastTime", this.LastTime);
        this.setParamSimple(map, prefix + "InvolvedObjectKind", this.InvolvedObjectKind);
        this.setParamSimple(map, prefix + "InvolvedObjectName", this.InvolvedObjectName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

