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

public class RuleAndConditions extends AbstractModel {

    /**
    * 规则引擎条件，该数组内所有项全部满足即判断该条件满足。
    */
    @SerializedName("Conditions")
    @Expose
    private RuleCondition [] Conditions;

    /**
     * Get 规则引擎条件，该数组内所有项全部满足即判断该条件满足。 
     * @return Conditions 规则引擎条件，该数组内所有项全部满足即判断该条件满足。
     */
    public RuleCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set 规则引擎条件，该数组内所有项全部满足即判断该条件满足。
     * @param Conditions 规则引擎条件，该数组内所有项全部满足即判断该条件满足。
     */
    public void setConditions(RuleCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    public RuleAndConditions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleAndConditions(RuleAndConditions source) {
        if (source.Conditions != null) {
            this.Conditions = new RuleCondition[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new RuleCondition(source.Conditions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);

    }
}

