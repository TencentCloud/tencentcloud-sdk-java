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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListenerBackend extends AbstractModel {

    /**
    * 监听器 ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

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
    private Long Port;

    /**
    * 监听器下的规则信息（仅适用于HTTP/HTTPS监听器）
    */
    @SerializedName("Rules")
    @Expose
    private RuleTargets [] Rules;

    /**
    * 监听器上绑定的后端服务列表（仅适用于TCP/UDP/TCP_SSL监听器）
    */
    @SerializedName("Targets")
    @Expose
    private Backend [] Targets;

    /**
    * 若支持端口段，则为端口段结束端口；若不支持端口段，则为0
    */
    @SerializedName("EndPort")
    @Expose
    private Long EndPort;

    /**
     * Get 监听器 ID 
     * @return ListenerId 监听器 ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器 ID
     * @param ListenerId 监听器 ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 监听器的协议 
     * @return Protocol 监听器的协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 监听器的协议
     * @param Protocol 监听器的协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 监听器的端口 
     * @return Port 监听器的端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 监听器的端口
     * @param Port 监听器的端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get 监听器下的规则信息（仅适用于HTTP/HTTPS监听器） 
     * @return Rules 监听器下的规则信息（仅适用于HTTP/HTTPS监听器）
     */
    public RuleTargets [] getRules() {
        return this.Rules;
    }

    /**
     * Set 监听器下的规则信息（仅适用于HTTP/HTTPS监听器）
     * @param Rules 监听器下的规则信息（仅适用于HTTP/HTTPS监听器）
     */
    public void setRules(RuleTargets [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get 监听器上绑定的后端服务列表（仅适用于TCP/UDP/TCP_SSL监听器） 
     * @return Targets 监听器上绑定的后端服务列表（仅适用于TCP/UDP/TCP_SSL监听器）
     */
    public Backend [] getTargets() {
        return this.Targets;
    }

    /**
     * Set 监听器上绑定的后端服务列表（仅适用于TCP/UDP/TCP_SSL监听器）
     * @param Targets 监听器上绑定的后端服务列表（仅适用于TCP/UDP/TCP_SSL监听器）
     */
    public void setTargets(Backend [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get 若支持端口段，则为端口段结束端口；若不支持端口段，则为0 
     * @return EndPort 若支持端口段，则为端口段结束端口；若不支持端口段，则为0
     */
    public Long getEndPort() {
        return this.EndPort;
    }

    /**
     * Set 若支持端口段，则为端口段结束端口；若不支持端口段，则为0
     * @param EndPort 若支持端口段，则为端口段结束端口；若不支持端口段，则为0
     */
    public void setEndPort(Long EndPort) {
        this.EndPort = EndPort;
    }

    public ListenerBackend() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListenerBackend(ListenerBackend source) {
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
            this.Rules = new RuleTargets[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new RuleTargets(source.Rules[i]);
            }
        }
        if (source.Targets != null) {
            this.Targets = new Backend[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new Backend(source.Targets[i]);
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

