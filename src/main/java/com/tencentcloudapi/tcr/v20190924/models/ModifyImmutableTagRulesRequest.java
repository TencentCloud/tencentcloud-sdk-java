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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyImmutableTagRulesRequest extends AbstractModel{

    /**
    * 实例 Id
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 命名空间
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 规则 Id
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则
    */
    @SerializedName("Rule")
    @Expose
    private ImmutableTagRule Rule;

    /**
     * Get 实例 Id 
     * @return RegistryId 实例 Id
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 实例 Id
     * @param RegistryId 实例 Id
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 命名空间 
     * @return NamespaceName 命名空间
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 命名空间
     * @param NamespaceName 命名空间
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get 规则 Id 
     * @return RuleId 规则 Id
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则 Id
     * @param RuleId 规则 Id
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则 
     * @return Rule 规则
     */
    public ImmutableTagRule getRule() {
        return this.Rule;
    }

    /**
     * Set 规则
     * @param Rule 规则
     */
    public void setRule(ImmutableTagRule Rule) {
        this.Rule = Rule;
    }

    public ModifyImmutableTagRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyImmutableTagRulesRequest(ModifyImmutableTagRulesRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.Rule != null) {
            this.Rule = new ImmutableTagRule(source.Rule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamObj(map, prefix + "Rule.", this.Rule);

    }
}

