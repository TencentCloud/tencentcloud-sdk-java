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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetAttackTopInfo extends AbstractModel {

    /**
    * 网络攻击主机维度top统计数据
    */
    @SerializedName("Agent")
    @Expose
    private TopInfo [] Agent;

    /**
    * 网络攻击ip来源维度top统计数据
    */
    @SerializedName("SrcIp")
    @Expose
    private TopInfo [] SrcIp;

    /**
    * 网络攻击目标端口维度top统计数据
    */
    @SerializedName("DstPort")
    @Expose
    private TopInfo [] DstPort;

    /**
    * 网络攻击漏洞维度top统计数据
    */
    @SerializedName("Vul")
    @Expose
    private TopInfo [] Vul;

    /**
     * Get 网络攻击主机维度top统计数据 
     * @return Agent 网络攻击主机维度top统计数据
     */
    public TopInfo [] getAgent() {
        return this.Agent;
    }

    /**
     * Set 网络攻击主机维度top统计数据
     * @param Agent 网络攻击主机维度top统计数据
     */
    public void setAgent(TopInfo [] Agent) {
        this.Agent = Agent;
    }

    /**
     * Get 网络攻击ip来源维度top统计数据 
     * @return SrcIp 网络攻击ip来源维度top统计数据
     */
    public TopInfo [] getSrcIp() {
        return this.SrcIp;
    }

    /**
     * Set 网络攻击ip来源维度top统计数据
     * @param SrcIp 网络攻击ip来源维度top统计数据
     */
    public void setSrcIp(TopInfo [] SrcIp) {
        this.SrcIp = SrcIp;
    }

    /**
     * Get 网络攻击目标端口维度top统计数据 
     * @return DstPort 网络攻击目标端口维度top统计数据
     */
    public TopInfo [] getDstPort() {
        return this.DstPort;
    }

    /**
     * Set 网络攻击目标端口维度top统计数据
     * @param DstPort 网络攻击目标端口维度top统计数据
     */
    public void setDstPort(TopInfo [] DstPort) {
        this.DstPort = DstPort;
    }

    /**
     * Get 网络攻击漏洞维度top统计数据 
     * @return Vul 网络攻击漏洞维度top统计数据
     */
    public TopInfo [] getVul() {
        return this.Vul;
    }

    /**
     * Set 网络攻击漏洞维度top统计数据
     * @param Vul 网络攻击漏洞维度top统计数据
     */
    public void setVul(TopInfo [] Vul) {
        this.Vul = Vul;
    }

    public NetAttackTopInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NetAttackTopInfo(NetAttackTopInfo source) {
        if (source.Agent != null) {
            this.Agent = new TopInfo[source.Agent.length];
            for (int i = 0; i < source.Agent.length; i++) {
                this.Agent[i] = new TopInfo(source.Agent[i]);
            }
        }
        if (source.SrcIp != null) {
            this.SrcIp = new TopInfo[source.SrcIp.length];
            for (int i = 0; i < source.SrcIp.length; i++) {
                this.SrcIp[i] = new TopInfo(source.SrcIp[i]);
            }
        }
        if (source.DstPort != null) {
            this.DstPort = new TopInfo[source.DstPort.length];
            for (int i = 0; i < source.DstPort.length; i++) {
                this.DstPort[i] = new TopInfo(source.DstPort[i]);
            }
        }
        if (source.Vul != null) {
            this.Vul = new TopInfo[source.Vul.length];
            for (int i = 0; i < source.Vul.length; i++) {
                this.Vul[i] = new TopInfo(source.Vul[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Agent.", this.Agent);
        this.setParamArrayObj(map, prefix + "SrcIp.", this.SrcIp);
        this.setParamArrayObj(map, prefix + "DstPort.", this.DstPort);
        this.setParamArrayObj(map, prefix + "Vul.", this.Vul);

    }
}

