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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoutingStrategy extends AbstractModel{

    /**
    * 别名的路由策略的类型，有效值常规别名(SIMPLE)、终止别名(TERMINAL)
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 别名指向的队列的唯一标识符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * 与终端路由策略一起使用的消息文本，长度不小于1字符不超过1024字符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * Get 别名的路由策略的类型，有效值常规别名(SIMPLE)、终止别名(TERMINAL) 
     * @return Type 别名的路由策略的类型，有效值常规别名(SIMPLE)、终止别名(TERMINAL)
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 别名的路由策略的类型，有效值常规别名(SIMPLE)、终止别名(TERMINAL)
     * @param Type 别名的路由策略的类型，有效值常规别名(SIMPLE)、终止别名(TERMINAL)
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 别名指向的队列的唯一标识符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FleetId 别名指向的队列的唯一标识符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set 别名指向的队列的唯一标识符
注意：此字段可能返回 null，表示取不到有效值。
     * @param FleetId 别名指向的队列的唯一标识符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get 与终端路由策略一起使用的消息文本，长度不小于1字符不超过1024字符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message 与终端路由策略一起使用的消息文本，长度不小于1字符不超过1024字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 与终端路由策略一起使用的消息文本，长度不小于1字符不超过1024字符
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 与终端路由策略一起使用的消息文本，长度不小于1字符不超过1024字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    public RoutingStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoutingStrategy(RoutingStrategy source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.FleetId != null) {
            this.FleetId = new String(source.FleetId);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

