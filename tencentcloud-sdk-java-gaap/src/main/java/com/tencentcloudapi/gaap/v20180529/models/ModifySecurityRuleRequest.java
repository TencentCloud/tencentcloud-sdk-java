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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);

    }
}

