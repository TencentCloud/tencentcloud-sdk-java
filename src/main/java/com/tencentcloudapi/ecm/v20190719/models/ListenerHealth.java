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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListenerHealth extends AbstractModel{

    /**
    * 监听器ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 监听器名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 监听器的协议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 监听器的端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 监听器的转发规则列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rules")
    @Expose
    private RuleHealth [] Rules;

    /**
     * Get 监听器ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ListenerId 监听器ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ListenerId 监听器ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 监听器名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ListenerName 监听器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set 监听器名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ListenerName 监听器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get 监听器的协议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol 监听器的协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 监听器的协议
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol 监听器的协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 监听器的端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 监听器的端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 监听器的端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 监听器的端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 监听器的转发规则列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rules 监听器的转发规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleHealth [] getRules() {
        return this.Rules;
    }

    /**
     * Set 监听器的转发规则列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rules 监听器的转发规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRules(RuleHealth [] Rules) {
        this.Rules = Rules;
    }

    public ListenerHealth() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListenerHealth(ListenerHealth source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Rules != null) {
            this.Rules = new RuleHealth[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new RuleHealth(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

