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

public class ModifyBlockIgnoreRuleRequest extends AbstractModel {

    /**
    * 规则列表
    */
    @SerializedName("Rule")
    @Expose
    private IntrusionDefenseRule Rule;

    /**
    * 规则类型，1封禁，2放通
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
     * Get 规则列表 
     * @return Rule 规则列表
     */
    public IntrusionDefenseRule getRule() {
        return this.Rule;
    }

    /**
     * Set 规则列表
     * @param Rule 规则列表
     */
    public void setRule(IntrusionDefenseRule Rule) {
        this.Rule = Rule;
    }

    /**
     * Get 规则类型，1封禁，2放通 
     * @return RuleType 规则类型，1封禁，2放通
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型，1封禁，2放通
     * @param RuleType 规则类型，1封禁，2放通
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    public ModifyBlockIgnoreRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBlockIgnoreRuleRequest(ModifyBlockIgnoreRuleRequest source) {
        if (source.Rule != null) {
            this.Rule = new IntrusionDefenseRule(source.Rule);
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

