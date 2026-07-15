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

public class SkillRuleCatalogItem extends AbstractModel {

    /**
    * 融合规则 ID
参数格式：形如 9xxxx
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

    /**
    * 风险类别名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
     * Get 融合规则 ID
参数格式：形如 9xxxx 
     * @return RuleID 融合规则 ID
参数格式：形如 9xxxx
     */
    public String getRuleID() {
        return this.RuleID;
    }

    /**
     * Set 融合规则 ID
参数格式：形如 9xxxx
     * @param RuleID 融合规则 ID
参数格式：形如 9xxxx
     */
    public void setRuleID(String RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get 风险类别名称 
     * @return RuleName 风险类别名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 风险类别名称
     * @param RuleName 风险类别名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    public SkillRuleCatalogItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillRuleCatalogItem(SkillRuleCatalogItem source) {
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);

    }
}

