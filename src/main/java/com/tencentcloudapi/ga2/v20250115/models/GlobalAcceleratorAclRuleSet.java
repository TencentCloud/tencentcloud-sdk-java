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

public class GlobalAcceleratorAclRuleSet extends AbstractModel {

    /**
    * 访问控制策略ID。
    */
    @SerializedName("GlobalAcceleratorPolicyId")
    @Expose
    private String GlobalAcceleratorPolicyId;

    /**
    * Acl规则ID。
    */
    @SerializedName("GlobalAcceleratorAclRuleId")
    @Expose
    private String GlobalAcceleratorAclRuleId;

    /**
    * 协议。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 端口。
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 网段。
    */
    @SerializedName("SourceCidrBlock")
    @Expose
    private String SourceCidrBlock;

    /**
    * 动作。
    */
    @SerializedName("Policy")
    @Expose
    private String Policy;

    /**
    * 描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 访问控制策略ID。 
     * @return GlobalAcceleratorPolicyId 访问控制策略ID。
     */
    public String getGlobalAcceleratorPolicyId() {
        return this.GlobalAcceleratorPolicyId;
    }

    /**
     * Set 访问控制策略ID。
     * @param GlobalAcceleratorPolicyId 访问控制策略ID。
     */
    public void setGlobalAcceleratorPolicyId(String GlobalAcceleratorPolicyId) {
        this.GlobalAcceleratorPolicyId = GlobalAcceleratorPolicyId;
    }

    /**
     * Get Acl规则ID。 
     * @return GlobalAcceleratorAclRuleId Acl规则ID。
     */
    public String getGlobalAcceleratorAclRuleId() {
        return this.GlobalAcceleratorAclRuleId;
    }

    /**
     * Set Acl规则ID。
     * @param GlobalAcceleratorAclRuleId Acl规则ID。
     */
    public void setGlobalAcceleratorAclRuleId(String GlobalAcceleratorAclRuleId) {
        this.GlobalAcceleratorAclRuleId = GlobalAcceleratorAclRuleId;
    }

    /**
     * Get 协议。 
     * @return Protocol 协议。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议。
     * @param Protocol 协议。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 端口。 
     * @return Port 端口。
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 端口。
     * @param Port 端口。
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 网段。 
     * @return SourceCidrBlock 网段。
     */
    public String getSourceCidrBlock() {
        return this.SourceCidrBlock;
    }

    /**
     * Set 网段。
     * @param SourceCidrBlock 网段。
     */
    public void setSourceCidrBlock(String SourceCidrBlock) {
        this.SourceCidrBlock = SourceCidrBlock;
    }

    /**
     * Get 动作。 
     * @return Policy 动作。
     */
    public String getPolicy() {
        return this.Policy;
    }

    /**
     * Set 动作。
     * @param Policy 动作。
     */
    public void setPolicy(String Policy) {
        this.Policy = Policy;
    }

    /**
     * Get 描述。 
     * @return Description 描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述。
     * @param Description 描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public GlobalAcceleratorAclRuleSet() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GlobalAcceleratorAclRuleSet(GlobalAcceleratorAclRuleSet source) {
        if (source.GlobalAcceleratorPolicyId != null) {
            this.GlobalAcceleratorPolicyId = new String(source.GlobalAcceleratorPolicyId);
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
        this.setParamSimple(map, prefix + "GlobalAcceleratorPolicyId", this.GlobalAcceleratorPolicyId);
        this.setParamSimple(map, prefix + "GlobalAcceleratorAclRuleId", this.GlobalAcceleratorAclRuleId);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "SourceCidrBlock", this.SourceCidrBlock);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

