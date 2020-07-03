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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteSecurityRulesRequest extends AbstractModel{

    /**
    * 安全策略ID
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * 访问规则ID列表
    */
    @SerializedName("RuleIdList")
    @Expose
    private String [] RuleIdList;

    /**
     * Get 安全策略ID 
     * @return PolicyId 安全策略ID
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 安全策略ID
     * @param PolicyId 安全策略ID
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 访问规则ID列表 
     * @return RuleIdList 访问规则ID列表
     */
    public String [] getRuleIdList() {
        return this.RuleIdList;
    }

    /**
     * Set 访问规则ID列表
     * @param RuleIdList 访问规则ID列表
     */
    public void setRuleIdList(String [] RuleIdList) {
        this.RuleIdList = RuleIdList;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamArraySimple(map, prefix + "RuleIdList.", this.RuleIdList);

    }
}

