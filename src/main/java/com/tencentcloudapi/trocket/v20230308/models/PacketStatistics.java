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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PacketStatistics extends AbstractModel {

    /**
    * 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MessageType")
    @Expose
    private String MessageType;

    /**
    * 服务质量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Qos")
    @Expose
    private Long Qos;

    /**
    * 指标值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MessageType 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessageType() {
        return this.MessageType;
    }

    /**
     * Set 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param MessageType 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessageType(String MessageType) {
        this.MessageType = MessageType;
    }

    /**
     * Get 服务质量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Qos 服务质量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQos() {
        return this.Qos;
    }

    /**
     * Set 服务质量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Qos 服务质量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQos(Long Qos) {
        this.Qos = Qos;
    }

    /**
     * Get 指标值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Count 指标值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 指标值
注意：此字段可能返回 null，表示取不到有效值。
     * @param Count 指标值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public PacketStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PacketStatistics(PacketStatistics source) {
        if (source.MessageType != null) {
            this.MessageType = new String(source.MessageType);
        }
        if (source.Qos != null) {
            this.Qos = new Long(source.Qos);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MessageType", this.MessageType);
        this.setParamSimple(map, prefix + "Qos", this.Qos);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

