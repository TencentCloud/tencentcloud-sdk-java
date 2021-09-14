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

public class ListenerItem extends AbstractModel{

    /**
    * 监听器ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 监听器协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 监听器端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 绑定规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rules")
    @Expose
    private RulesItems [] Rules;

    /**
    * 四层绑定对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Targets")
    @Expose
    private LbRsTargets [] Targets;

    /**
    * 端口段监听器的结束端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndPort")
    @Expose
    private Long EndPort;

    /**
     * Get 监听器ID 
     * @return ListenerId 监听器ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器ID
     * @param ListenerId 监听器ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 监听器协议 
     * @return Protocol 监听器协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 监听器协议
     * @param Protocol 监听器协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 监听器端口 
     * @return Port 监听器端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 监听器端口
     * @param Port 监听器端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 绑定规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rules 绑定规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RulesItems [] getRules() {
        return this.Rules;
    }

    /**
     * Set 绑定规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rules 绑定规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRules(RulesItems [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get 四层绑定对象
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Targets 四层绑定对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LbRsTargets [] getTargets() {
        return this.Targets;
    }

    /**
     * Set 四层绑定对象
注意：此字段可能返回 null，表示取不到有效值。
     * @param Targets 四层绑定对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargets(LbRsTargets [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get 端口段监听器的结束端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndPort 端口段监听器的结束端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndPort() {
        return this.EndPort;
    }

    /**
     * Set 端口段监听器的结束端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndPort 端口段监听器的结束端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndPort(Long EndPort) {
        this.EndPort = EndPort;
    }

    public ListenerItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListenerItem(ListenerItem source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Rules != null) {
            this.Rules = new RulesItems[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new RulesItems(source.Rules[i]);
            }
        }
        if (source.Targets != null) {
            this.Targets = new LbRsTargets[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new LbRsTargets(source.Targets[i]);
            }
        }
        if (source.EndPort != null) {
            this.EndPort = new Long(source.EndPort);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);
        this.setParamSimple(map, prefix + "EndPort", this.EndPort);

    }
}

