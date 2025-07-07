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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Rule extends AbstractModel {

    /**
    * 执行功能判断条件。
注意：满足该数组内任意一项条件，功能即可执行。
    */
    @SerializedName("Conditions")
    @Expose
    private RuleAndConditions [] Conditions;

    /**
    * 执行的功能。注意：Actions 和 SubRules 不可都为空
    */
    @SerializedName("Actions")
    @Expose
    private Action [] Actions;

    /**
    * 嵌套规则。注意：SubRules 和 Actions 不可都为空
    */
    @SerializedName("SubRules")
    @Expose
    private SubRuleItem [] SubRules;

    /**
     * Get 执行功能判断条件。
注意：满足该数组内任意一项条件，功能即可执行。 
     * @return Conditions 执行功能判断条件。
注意：满足该数组内任意一项条件，功能即可执行。
     */
    public RuleAndConditions [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set 执行功能判断条件。
注意：满足该数组内任意一项条件，功能即可执行。
     * @param Conditions 执行功能判断条件。
注意：满足该数组内任意一项条件，功能即可执行。
     */
    public void setConditions(RuleAndConditions [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get 执行的功能。注意：Actions 和 SubRules 不可都为空 
     * @return Actions 执行的功能。注意：Actions 和 SubRules 不可都为空
     */
    public Action [] getActions() {
        return this.Actions;
    }

    /**
     * Set 执行的功能。注意：Actions 和 SubRules 不可都为空
     * @param Actions 执行的功能。注意：Actions 和 SubRules 不可都为空
     */
    public void setActions(Action [] Actions) {
        this.Actions = Actions;
    }

    /**
     * Get 嵌套规则。注意：SubRules 和 Actions 不可都为空 
     * @return SubRules 嵌套规则。注意：SubRules 和 Actions 不可都为空
     */
    public SubRuleItem [] getSubRules() {
        return this.SubRules;
    }

    /**
     * Set 嵌套规则。注意：SubRules 和 Actions 不可都为空
     * @param SubRules 嵌套规则。注意：SubRules 和 Actions 不可都为空
     */
    public void setSubRules(SubRuleItem [] SubRules) {
        this.SubRules = SubRules;
    }

    public Rule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Rule(Rule source) {
        if (source.Conditions != null) {
            this.Conditions = new RuleAndConditions[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new RuleAndConditions(source.Conditions[i]);
            }
        }
        if (source.Actions != null) {
            this.Actions = new Action[source.Actions.length];
            for (int i = 0; i < source.Actions.length; i++) {
                this.Actions[i] = new Action(source.Actions[i]);
            }
        }
        if (source.SubRules != null) {
            this.SubRules = new SubRuleItem[source.SubRules.length];
            for (int i = 0; i < source.SubRules.length; i++) {
                this.SubRules[i] = new SubRuleItem(source.SubRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamArrayObj(map, prefix + "Actions.", this.Actions);
        this.setParamArrayObj(map, prefix + "SubRules.", this.SubRules);

    }
}

