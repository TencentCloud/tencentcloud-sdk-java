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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteForwardRuleRequest extends AbstractModel {

    /**
    * 转发规则ID数组
    */
    @SerializedName("RuleIdSet")
    @Expose
    private String [] RuleIdSet;

    /**
     * Get 转发规则ID数组 
     * @return RuleIdSet 转发规则ID数组
     */
    public String [] getRuleIdSet() {
        return this.RuleIdSet;
    }

    /**
     * Set 转发规则ID数组
     * @param RuleIdSet 转发规则ID数组
     */
    public void setRuleIdSet(String [] RuleIdSet) {
        this.RuleIdSet = RuleIdSet;
    }

    public DeleteForwardRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteForwardRuleRequest(DeleteForwardRuleRequest source) {
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

