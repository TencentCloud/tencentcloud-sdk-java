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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FirewallRule extends AbstractModel{

    /**
    * 协议，取值：TCP，UDP，ICMP，ALL。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 端口，取值：ALL，单独的端口，逗号分隔的离散端口，减号分隔的端口范围。
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 网段或 IP (互斥)。默认为 0.0.0.0/0，表示所有来源。
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 取值：ACCEPT，DROP。默认为 ACCEPT。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 防火墙规则描述。
    */
    @SerializedName("FirewallRuleDescription")
    @Expose
    private String FirewallRuleDescription;

    /**
     * Get 协议，取值：TCP，UDP，ICMP，ALL。 
     * @return Protocol 协议，取值：TCP，UDP，ICMP，ALL。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议，取值：TCP，UDP，ICMP，ALL。
     * @param Protocol 协议，取值：TCP，UDP，ICMP，ALL。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 端口，取值：ALL，单独的端口，逗号分隔的离散端口，减号分隔的端口范围。 
     * @return Port 端口，取值：ALL，单独的端口，逗号分隔的离散端口，减号分隔的端口范围。
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 端口，取值：ALL，单独的端口，逗号分隔的离散端口，减号分隔的端口范围。
     * @param Port 端口，取值：ALL，单独的端口，逗号分隔的离散端口，减号分隔的端口范围。
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 网段或 IP (互斥)。默认为 0.0.0.0/0，表示所有来源。 
     * @return CidrBlock 网段或 IP (互斥)。默认为 0.0.0.0/0，表示所有来源。
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set 网段或 IP (互斥)。默认为 0.0.0.0/0，表示所有来源。
     * @param CidrBlock 网段或 IP (互斥)。默认为 0.0.0.0/0，表示所有来源。
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get 取值：ACCEPT，DROP。默认为 ACCEPT。 
     * @return Action 取值：ACCEPT，DROP。默认为 ACCEPT。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 取值：ACCEPT，DROP。默认为 ACCEPT。
     * @param Action 取值：ACCEPT，DROP。默认为 ACCEPT。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 防火墙规则描述。 
     * @return FirewallRuleDescription 防火墙规则描述。
     */
    public String getFirewallRuleDescription() {
        return this.FirewallRuleDescription;
    }

    /**
     * Set 防火墙规则描述。
     * @param FirewallRuleDescription 防火墙规则描述。
     */
    public void setFirewallRuleDescription(String FirewallRuleDescription) {
        this.FirewallRuleDescription = FirewallRuleDescription;
    }

    public FirewallRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FirewallRule(FirewallRule source) {
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.FirewallRuleDescription != null) {
            this.FirewallRuleDescription = new String(source.FirewallRuleDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "FirewallRuleDescription", this.FirewallRuleDescription);

    }
}

