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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleItem extends AbstractModel{

    /**
    * 执行功能判断条件。
注意：满足该数组内任意一项条件，功能即可执行。
    */
    @SerializedName("Conditions")
    @Expose
    private RuleAndConditions [] Conditions;

    /**
    * 执行的功能。
    */
    @SerializedName("Actions")
    @Expose
    private RuleAction [] Actions;

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
     * Get 执行的功能。 
     * @return Actions 执行的功能。
     */
    public RuleAction [] getActions() {
        return this.Actions;
    }

    /**
     * Set 执行的功能。
     * @param Actions 执行的功能。
     */
    public void setActions(RuleAction [] Actions) {
        this.Actions = Actions;
    }

    public RuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleItem(RuleItem source) {
        if (source.Conditions != null) {
            this.Conditions = new RuleAndConditions[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new RuleAndConditions(source.Conditions[i]);
            }
        }
        if (source.Actions != null) {
            this.Actions = new RuleAction[source.Actions.length];
            for (int i = 0; i < source.Actions.length; i++) {
                this.Actions[i] = new RuleAction(source.Actions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamArrayObj(map, prefix + "Actions.", this.Actions);

    }
}

