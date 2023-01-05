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
package com.tencentcloudapi.hasim.v20210716.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRuleStatusRequest extends AbstractModel{

    /**
    * 自动化规则ID
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * 是否激活
    */
    @SerializedName("IsActive")
    @Expose
    private Boolean IsActive;

    /**
     * Get 自动化规则ID 
     * @return RuleID 自动化规则ID
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set 自动化规则ID
     * @param RuleID 自动化规则ID
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get 是否激活 
     * @return IsActive 是否激活
     */
    public Boolean getIsActive() {
        return this.IsActive;
    }

    /**
     * Set 是否激活
     * @param IsActive 是否激活
     */
    public void setIsActive(Boolean IsActive) {
        this.IsActive = IsActive;
    }

    public ModifyRuleStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRuleStatusRequest(ModifyRuleStatusRequest source) {
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.IsActive != null) {
            this.IsActive = new Boolean(source.IsActive);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "IsActive", this.IsActive);

    }
}

