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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddVulIgnoreRuleRequest extends AbstractModel {

    /**
    * 忽略规则集合
    */
    @SerializedName("RuleDetailList")
    @Expose
    private VulIgnoreRule [] RuleDetailList;

    /**
     * Get 忽略规则集合 
     * @return RuleDetailList 忽略规则集合
     */
    public VulIgnoreRule [] getRuleDetailList() {
        return this.RuleDetailList;
    }

    /**
     * Set 忽略规则集合
     * @param RuleDetailList 忽略规则集合
     */
    public void setRuleDetailList(VulIgnoreRule [] RuleDetailList) {
        this.RuleDetailList = RuleDetailList;
    }

    public AddVulIgnoreRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddVulIgnoreRuleRequest(AddVulIgnoreRuleRequest source) {
        if (source.RuleDetailList != null) {
            this.RuleDetailList = new VulIgnoreRule[source.RuleDetailList.length];
            for (int i = 0; i < source.RuleDetailList.length; i++) {
                this.RuleDetailList[i] = new VulIgnoreRule(source.RuleDetailList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RuleDetailList.", this.RuleDetailList);

    }
}

