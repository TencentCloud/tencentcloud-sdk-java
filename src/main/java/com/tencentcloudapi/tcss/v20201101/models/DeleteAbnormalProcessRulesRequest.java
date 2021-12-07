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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAbnormalProcessRulesRequest extends AbstractModel{

    /**
    * 策略的ids
    */
    @SerializedName("RuleIdSet")
    @Expose
    private String [] RuleIdSet;

    /**
     * Get 策略的ids 
     * @return RuleIdSet 策略的ids
     */
    public String [] getRuleIdSet() {
        return this.RuleIdSet;
    }

    /**
     * Set 策略的ids
     * @param RuleIdSet 策略的ids
     */
    public void setRuleIdSet(String [] RuleIdSet) {
        this.RuleIdSet = RuleIdSet;
    }

    public DeleteAbnormalProcessRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAbnormalProcessRulesRequest(DeleteAbnormalProcessRulesRequest source) {
        if (source.RuleIdSet != null) {
            this.RuleIdSet = new String[source.RuleIdSet.length];
            for (int i = 0; i < source.RuleIdSet.length; i++) {
                this.RuleIdSet[i] = new String(source.RuleIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RuleIdSet.", this.RuleIdSet);

    }
}

