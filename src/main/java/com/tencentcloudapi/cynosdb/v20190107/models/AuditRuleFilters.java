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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditRuleFilters extends AbstractModel {

    /**
    * 单条审计规则。
    */
    @SerializedName("RuleFilters")
    @Expose
    private RuleFilters [] RuleFilters;

    /**
     * Get 单条审计规则。 
     * @return RuleFilters 单条审计规则。
     */
    public RuleFilters [] getRuleFilters() {
        return this.RuleFilters;
    }

    /**
     * Set 单条审计规则。
     * @param RuleFilters 单条审计规则。
     */
    public void setRuleFilters(RuleFilters [] RuleFilters) {
        this.RuleFilters = RuleFilters;
    }

    public AuditRuleFilters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditRuleFilters(AuditRuleFilters source) {
        if (source.RuleFilters != null) {
            this.RuleFilters = new RuleFilters[source.RuleFilters.length];
            for (int i = 0; i < source.RuleFilters.length; i++) {
                this.RuleFilters[i] = new RuleFilters(source.RuleFilters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RuleFilters.", this.RuleFilters);

    }
}

