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

public class HitRules extends AbstractModel {

    /**
    * 规则Id
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
     * Get 规则Id 
     * @return RuleId 规则Id
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则Id
     * @param RuleId 规则Id
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则 
     * @return RuleName 规则
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则
     * @param RuleName 规则
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    public HitRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HitRules(HitRules source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);

    }
}

