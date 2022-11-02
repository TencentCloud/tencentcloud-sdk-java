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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatefulSetCondition extends AbstractModel{

    /**
    * 信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * Status of the condition, one of True, False, Unknown.
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 上次更新的时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastTransitionTime")
    @Expose
    private String LastTransitionTime;

    /**
     * Get 信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
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
     * Get Status of the condition, one of True, False, Unknown.
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status Status of the condition, one of True, False, Unknown.
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status of the condition, one of True, False, Unknown.
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status Status of the condition, one of True, False, Unknown.
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 上次更新的时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastTransitionTime 上次更新的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastTransitionTime() {
        return this.LastTransitionTime;
    }

    /**
     * Set 上次更新的时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastTransitionTime 上次更新的时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastTransitionTime(String LastTransitionTime) {
        this.LastTransitionTime = LastTransitionTime;
    }

    public StatefulSetCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatefulSetCondition(StatefulSetCondition source) {
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.LastTransitionTime != null) {
            this.LastTransitionTime = new String(source.LastTransitionTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "LastTransitionTime", this.LastTransitionTime);

    }
}

