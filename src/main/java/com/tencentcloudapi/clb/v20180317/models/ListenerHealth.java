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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListenerHealth  extends AbstractModel{

    /**
    * 监听器ID
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
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 监听器的端口
    */
    @SerializedName("Port")
    @Expose
    private Integer Port;

    /**
    * 监听器的转发规则列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rules")
    @Expose
    private RuleHealth [] Rules;

    /**
     * 获取监听器ID
     * @return ListenerId 监听器ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * 设置监听器ID
     * @param ListenerId 监听器ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * 获取监听器名称
注意：此字段可能返回 null，表示取不到有效值。
     * @return ListenerName 监听器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * 设置监听器名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ListenerName 监听器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * 获取监听器的协议
     * @return Protocol 监听器的协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * 设置监听器的协议
     * @param Protocol 监听器的协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * 获取监听器的端口
     * @return Port 监听器的端口
     */
    public Integer getPort() {
        return this.Port;
    }

    /**
     * 设置监听器的端口
     * @param Port 监听器的端口
     */
    public void setPort(Integer Port) {
        this.Port = Port;
    }

    /**
     * 获取监听器的转发规则列表
注意：此字段可能返回 null，表示取不到有效值。
     * @return Rules 监听器的转发规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleHealth [] getRules() {
        return this.Rules;
    }

    /**
     * 设置监听器的转发规则列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rules 监听器的转发规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRules(RuleHealth [] Rules) {
        this.Rules = Rules;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

