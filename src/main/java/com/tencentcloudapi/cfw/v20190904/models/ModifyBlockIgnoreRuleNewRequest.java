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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBlockIgnoreRuleNewRequest extends AbstractModel {

    /**
    * 规则
    */
    @SerializedName("Rule")
    @Expose
    private BanAndAllowRule Rule;

    /**
    * RuleType: 1放通列表 2外部IP 3域名 4情报 5资产 6自定义规则  7入侵防御规则
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
     * Get 规则 
     * @return Rule 规则
     */
    public BanAndAllowRule getRule() {
        return this.Rule;
    }

    /**
     * Set 规则
     * @param Rule 规则
     */
    public void setRule(BanAndAllowRule Rule) {
        this.Rule = Rule;
    }

    /**
     * Get RuleType: 1放通列表 2外部IP 3域名 4情报 5资产 6自定义规则  7入侵防御规则 
     * @return RuleType RuleType: 1放通列表 2外部IP 3域名 4情报 5资产 6自定义规则  7入侵防御规则
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set RuleType: 1放通列表 2外部IP 3域名 4情报 5资产 6自定义规则  7入侵防御规则
     * @param RuleType RuleType: 1放通列表 2外部IP 3域名 4情报 5资产 6自定义规则  7入侵防御规则
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    public ModifyBlockIgnoreRuleNewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBlockIgnoreRuleNewRequest(ModifyBlockIgnoreRuleNewRequest source) {
        if (source.Rule != null) {
            this.Rule = new BanAndAllowRule(source.Rule);
        }
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Rule.", this.Rule);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);

    }
}

