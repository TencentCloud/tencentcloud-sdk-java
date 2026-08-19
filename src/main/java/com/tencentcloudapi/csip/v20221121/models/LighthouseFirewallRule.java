/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LighthouseFirewallRule extends AbstractModel {

    /**
    * <p>应用类型</p>
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
    * <p>协议</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>端口</p>
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * <p>地址</p>
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * <p>ipv6地址</p>
    */
    @SerializedName("Ipv6CidrBlock")
    @Expose
    private String Ipv6CidrBlock;

    /**
    * <p>状态</p>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>描述</p>
    */
    @SerializedName("FirewallRuleDescription")
    @Expose
    private String FirewallRuleDescription;

    /**
     * Get <p>应用类型</p> 
     * @return AppType <p>应用类型</p>
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * Set <p>应用类型</p>
     * @param AppType <p>应用类型</p>
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    /**
     * Get <p>协议</p> 
     * @return Protocol <p>协议</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>协议</p>
     * @param Protocol <p>协议</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>端口</p> 
     * @return Port <p>端口</p>
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set <p>端口</p>
     * @param Port <p>端口</p>
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get <p>地址</p> 
     * @return CidrBlock <p>地址</p>
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * Set <p>地址</p>
     * @param CidrBlock <p>地址</p>
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * Get <p>ipv6地址</p> 
     * @return Ipv6CidrBlock <p>ipv6地址</p>
     */
    public String getIpv6CidrBlock() {
        return this.Ipv6CidrBlock;
    }

    /**
     * Set <p>ipv6地址</p>
     * @param Ipv6CidrBlock <p>ipv6地址</p>
     */
    public void setIpv6CidrBlock(String Ipv6CidrBlock) {
        this.Ipv6CidrBlock = Ipv6CidrBlock;
    }

    /**
     * Get <p>状态</p> 
     * @return Action <p>状态</p>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>状态</p>
     * @param Action <p>状态</p>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>描述</p> 
     * @return FirewallRuleDescription <p>描述</p>
     */
    public String getFirewallRuleDescription() {
        return this.FirewallRuleDescription;
    }

    /**
     * Set <p>描述</p>
     * @param FirewallRuleDescription <p>描述</p>
     */
    public void setFirewallRuleDescription(String FirewallRuleDescription) {
        this.FirewallRuleDescription = FirewallRuleDescription;
    }

    public LighthouseFirewallRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LighthouseFirewallRule(LighthouseFirewallRule source) {
        if (source.AppType != null) {
            this.AppType = new String(source.AppType);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.CidrBlock != null) {
            this.CidrBlock = new String(source.CidrBlock);
        }
        if (source.Ipv6CidrBlock != null) {
            this.Ipv6CidrBlock = new String(source.Ipv6CidrBlock);
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
        this.setParamSimple(map, prefix + "AppType", this.AppType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "Ipv6CidrBlock", this.Ipv6CidrBlock);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "FirewallRuleDescription", this.FirewallRuleDescription);

    }
}

