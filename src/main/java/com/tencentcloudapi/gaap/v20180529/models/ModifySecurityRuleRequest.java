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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySecurityRuleRequest extends AbstractModel{

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 规则名：不得超过30个字符，超过部分会被截断。
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * 安全策略ID
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * 安全规则动作
    */
    @SerializedName("RuleAction")
    @Expose
    private String RuleAction;

    /**
    * 规则关联地址，格式需要满足CIDR网络地址规范
    */
    @SerializedName("SourceCidr")
    @Expose
    private String SourceCidr;

    /**
    * 协议类型
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 端口范围，支持以下格式
单个端口: 80
多个端口: 80,443
连续端口: 3306-20000
所有端口: ALL
    */
    @SerializedName("DestPortRange")
    @Expose
    private String DestPortRange;

    /**
     * Get 规则ID 
     * @return RuleId 规则ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则名：不得超过30个字符，超过部分会被截断。 
     * @return AliasName 规则名：不得超过30个字符，超过部分会被截断。
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set 规则名：不得超过30个字符，超过部分会被截断。
     * @param AliasName 规则名：不得超过30个字符，超过部分会被截断。
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get 安全策略ID 
     * @return PolicyId 安全策略ID
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 安全策略ID
     * @param PolicyId 安全策略ID
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 安全规则动作 
     * @return RuleAction 安全规则动作
     */
    public String getRuleAction() {
        return this.RuleAction;
    }

    /**
     * Set 安全规则动作
     * @param RuleAction 安全规则动作
     */
    public void setRuleAction(String RuleAction) {
        this.RuleAction = RuleAction;
    }

    /**
     * Get 规则关联地址，格式需要满足CIDR网络地址规范 
     * @return SourceCidr 规则关联地址，格式需要满足CIDR网络地址规范
     */
    public String getSourceCidr() {
        return this.SourceCidr;
    }

    /**
     * Set 规则关联地址，格式需要满足CIDR网络地址规范
     * @param SourceCidr 规则关联地址，格式需要满足CIDR网络地址规范
     */
    public void setSourceCidr(String SourceCidr) {
        this.SourceCidr = SourceCidr;
    }

    /**
     * Get 协议类型 
     * @return Protocol 协议类型
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议类型
     * @param Protocol 协议类型
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 端口范围，支持以下格式
单个端口: 80
多个端口: 80,443
连续端口: 3306-20000
所有端口: ALL 
     * @return DestPortRange 端口范围，支持以下格式
单个端口: 80
多个端口: 80,443
连续端口: 3306-20000
所有端口: ALL
     */
    public String getDestPortRange() {
        return this.DestPortRange;
    }

    /**
     * Set 端口范围，支持以下格式
单个端口: 80
多个端口: 80,443
连续端口: 3306-20000
所有端口: ALL
     * @param DestPortRange 端口范围，支持以下格式
单个端口: 80
多个端口: 80,443
连续端口: 3306-20000
所有端口: ALL
     */
    public void setDestPortRange(String DestPortRange) {
        this.DestPortRange = DestPortRange;
    }

    public ModifySecurityRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySecurityRuleRequest(ModifySecurityRuleRequest source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.RuleAction != null) {
            this.RuleAction = new String(source.RuleAction);
        }
        if (source.SourceCidr != null) {
            this.SourceCidr = new String(source.SourceCidr);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.DestPortRange != null) {
            this.DestPortRange = new String(source.DestPortRange);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "RuleAction", this.RuleAction);
        this.setParamSimple(map, prefix + "SourceCidr", this.SourceCidr);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "DestPortRange", this.DestPortRange);

    }
}

