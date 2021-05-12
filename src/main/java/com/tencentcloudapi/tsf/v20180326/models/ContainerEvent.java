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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContainerEvent extends AbstractModel{

    /**
    * 第一次出现的时间，以 ms 为单位的时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstTimestamp")
    @Expose
    private Long FirstTimestamp;

    /**
    * 最后一次出现的时间，以 ms 为单位的时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastTimestamp")
    @Expose
    private Long LastTimestamp;

    /**
    * 级别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 资源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * 资源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 详细描述
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
     * Get 第一次出现的时间，以 ms 为单位的时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstTimestamp 第一次出现的时间，以 ms 为单位的时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFirstTimestamp() {
        return this.FirstTimestamp;
    }

    /**
     * Set 第一次出现的时间，以 ms 为单位的时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstTimestamp 第一次出现的时间，以 ms 为单位的时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstTimestamp(Long FirstTimestamp) {
        this.FirstTimestamp = FirstTimestamp;
    }

    /**
     * Get 最后一次出现的时间，以 ms 为单位的时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastTimestamp 最后一次出现的时间，以 ms 为单位的时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastTimestamp() {
        return this.LastTimestamp;
    }

    /**
     * Set 最后一次出现的时间，以 ms 为单位的时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastTimestamp 最后一次出现的时间，以 ms 为单位的时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastTimestamp(Long LastTimestamp) {
        this.LastTimestamp = LastTimestamp;
    }

    /**
     * Get 级别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 级别
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 资源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Kind 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Kind 资源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get 资源名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 资源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 资源名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 资源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reason 内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reason 内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 详细描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 详细描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 详细描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 详细描述
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

    public ContainerEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerEvent(ContainerEvent source) {
        if (source.FirstTimestamp != null) {
            this.FirstTimestamp = new Long(source.FirstTimestamp);
        }
        if (source.LastTimestamp != null) {
            this.LastTimestamp = new Long(source.LastTimestamp);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        this.setParamSimple(map, prefix + "FirstTimestamp", this.FirstTimestamp);
        this.setParamSimple(map, prefix + "LastTimestamp", this.LastTimestamp);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

