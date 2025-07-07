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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityPolicyRuleOut extends AbstractModel {

    /**
    * 策略：允许（ACCEPT）或拒绝（DROP）
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 请求来源Ip或Ip段
    */
    @SerializedName("SourceCidr")
    @Expose
    private String SourceCidr;

    /**
    * 规则别名
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * 目标端口范围
    */
    @SerializedName("DestPortRange")
    @Expose
    private String DestPortRange;

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 要匹配的协议类型（TCP/UDP）
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 安全策略ID
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
     * Get 策略：允许（ACCEPT）或拒绝（DROP） 
     * @return Action 策略：允许（ACCEPT）或拒绝（DROP）
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 策略：允许（ACCEPT）或拒绝（DROP）
     * @param Action 策略：允许（ACCEPT）或拒绝（DROP）
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 请求来源Ip或Ip段 
     * @return SourceCidr 请求来源Ip或Ip段
     */
    public String getSourceCidr() {
        return this.SourceCidr;
    }

    /**
     * Set 请求来源Ip或Ip段
     * @param SourceCidr 请求来源Ip或Ip段
     */
    public void setSourceCidr(String SourceCidr) {
        this.SourceCidr = SourceCidr;
    }

    /**
     * Get 规则别名 
     * @return AliasName 规则别名
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set 规则别名
     * @param AliasName 规则别名
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get 目标端口范围 
     * @return DestPortRange 目标端口范围
     */
    public String getDestPortRange() {
        return this.DestPortRange;
    }

    /**
     * Set 目标端口范围
     * @param DestPortRange 目标端口范围
     */
    public void setDestPortRange(String DestPortRange) {
        this.DestPortRange = DestPortRange;
    }

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
     * Get 要匹配的协议类型（TCP/UDP） 
     * @return Protocol 要匹配的协议类型（TCP/UDP）
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 要匹配的协议类型（TCP/UDP）
     * @param Protocol 要匹配的协议类型（TCP/UDP）
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
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

    public SecurityPolicyRuleOut() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityPolicyRuleOut(SecurityPolicyRuleOut source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.SourceCidr != null) {
            this.SourceCidr = new String(source.SourceCidr);
        }
        if (source.AliasName != null) {
            this.AliasName = new String(source.AliasName);
        }
        if (source.DestPortRange != null) {
            this.DestPortRange = new String(source.DestPortRange);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "SourceCidr", this.SourceCidr);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamSimple(map, prefix + "DestPortRange", this.DestPortRange);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);

    }
}

