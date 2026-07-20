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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyGlobalAcceleratorAclRuleRequest extends AbstractModel {

    /**
    * <p>全球加速实例ID。</p>
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * <p>安全策略ID</p>
    */
    @SerializedName("GlobalAcceleratorAclPolicyId")
    @Expose
    private String GlobalAcceleratorAclPolicyId;

    /**
    * <p>Acl规则ID。</p>
    */
    @SerializedName("GlobalAcceleratorAclRuleId")
    @Expose
    private String GlobalAcceleratorAclRuleId;

    /**
    * <p>协议。</p><p>入参限制：支持选择&#39;TCP&#39;, &#39;UDP&#39;, &#39;ALL&#39;。</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>端口。</p>
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * <p>网段。</p>
    */
    @SerializedName("SourceCidrBlock")
    @Expose
    private String SourceCidrBlock;

    /**
    * <p>动作。</p><p>入参限制：支持选择&#39;ACCEPT&#39;, &#39;DROP&#39;。</p><p>枚举值：</p><ul><li>ACCEPT： 允许。</li><li>DROP： 拒绝。</li></ul>
    */
    @SerializedName("Policy")
    @Expose
    private String Policy;

    /**
    * <p>描述信息，最大长度不能超过100个字节。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>全球加速实例ID。</p> 
     * @return GlobalAcceleratorId <p>全球加速实例ID。</p>
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set <p>全球加速实例ID。</p>
     * @param GlobalAcceleratorId <p>全球加速实例ID。</p>
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get <p>安全策略ID</p> 
     * @return GlobalAcceleratorAclPolicyId <p>安全策略ID</p>
     */
    public String getGlobalAcceleratorAclPolicyId() {
        return this.GlobalAcceleratorAclPolicyId;
    }

    /**
     * Set <p>安全策略ID</p>
     * @param GlobalAcceleratorAclPolicyId <p>安全策略ID</p>
     */
    public void setGlobalAcceleratorAclPolicyId(String GlobalAcceleratorAclPolicyId) {
        this.GlobalAcceleratorAclPolicyId = GlobalAcceleratorAclPolicyId;
    }

    /**
     * Get <p>Acl规则ID。</p> 
     * @return GlobalAcceleratorAclRuleId <p>Acl规则ID。</p>
     */
    public String getGlobalAcceleratorAclRuleId() {
        return this.GlobalAcceleratorAclRuleId;
    }

    /**
     * Set <p>Acl规则ID。</p>
     * @param GlobalAcceleratorAclRuleId <p>Acl规则ID。</p>
     */
    public void setGlobalAcceleratorAclRuleId(String GlobalAcceleratorAclRuleId) {
        this.GlobalAcceleratorAclRuleId = GlobalAcceleratorAclRuleId;
    }

    /**
     * Get <p>协议。</p><p>入参限制：支持选择&#39;TCP&#39;, &#39;UDP&#39;, &#39;ALL&#39;。</p> 
     * @return Protocol <p>协议。</p><p>入参限制：支持选择&#39;TCP&#39;, &#39;UDP&#39;, &#39;ALL&#39;。</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>协议。</p><p>入参限制：支持选择&#39;TCP&#39;, &#39;UDP&#39;, &#39;ALL&#39;。</p>
     * @param Protocol <p>协议。</p><p>入参限制：支持选择&#39;TCP&#39;, &#39;UDP&#39;, &#39;ALL&#39;。</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>端口。</p> 
     * @return Port <p>端口。</p>
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set <p>端口。</p>
     * @param Port <p>端口。</p>
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get <p>网段。</p> 
     * @return SourceCidrBlock <p>网段。</p>
     */
    public String getSourceCidrBlock() {
        return this.SourceCidrBlock;
    }

    /**
     * Set <p>网段。</p>
     * @param SourceCidrBlock <p>网段。</p>
     */
    public void setSourceCidrBlock(String SourceCidrBlock) {
        this.SourceCidrBlock = SourceCidrBlock;
    }

    /**
     * Get <p>动作。</p><p>入参限制：支持选择&#39;ACCEPT&#39;, &#39;DROP&#39;。</p><p>枚举值：</p><ul><li>ACCEPT： 允许。</li><li>DROP： 拒绝。</li></ul> 
     * @return Policy <p>动作。</p><p>入参限制：支持选择&#39;ACCEPT&#39;, &#39;DROP&#39;。</p><p>枚举值：</p><ul><li>ACCEPT： 允许。</li><li>DROP： 拒绝。</li></ul>
     */
    public String getPolicy() {
        return this.Policy;
    }

    /**
     * Set <p>动作。</p><p>入参限制：支持选择&#39;ACCEPT&#39;, &#39;DROP&#39;。</p><p>枚举值：</p><ul><li>ACCEPT： 允许。</li><li>DROP： 拒绝。</li></ul>
     * @param Policy <p>动作。</p><p>入参限制：支持选择&#39;ACCEPT&#39;, &#39;DROP&#39;。</p><p>枚举值：</p><ul><li>ACCEPT： 允许。</li><li>DROP： 拒绝。</li></ul>
     */
    public void setPolicy(String Policy) {
        this.Policy = Policy;
    }

    /**
     * Get <p>描述信息，最大长度不能超过100个字节。</p> 
     * @return Description <p>描述信息，最大长度不能超过100个字节。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述信息，最大长度不能超过100个字节。</p>
     * @param Description <p>描述信息，最大长度不能超过100个字节。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ModifyGlobalAcceleratorAclRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyGlobalAcceleratorAclRuleRequest(ModifyGlobalAcceleratorAclRuleRequest source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.GlobalAcceleratorAclPolicyId != null) {
            this.GlobalAcceleratorAclPolicyId = new String(source.GlobalAcceleratorAclPolicyId);
        }
        if (source.GlobalAcceleratorAclRuleId != null) {
            this.GlobalAcceleratorAclRuleId = new String(source.GlobalAcceleratorAclRuleId);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.SourceCidrBlock != null) {
            this.SourceCidrBlock = new String(source.SourceCidrBlock);
        }
        if (source.Policy != null) {
            this.Policy = new String(source.Policy);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "GlobalAcceleratorAclPolicyId", this.GlobalAcceleratorAclPolicyId);
        this.setParamSimple(map, prefix + "GlobalAcceleratorAclRuleId", this.GlobalAcceleratorAclRuleId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "SourceCidrBlock", this.SourceCidrBlock);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

