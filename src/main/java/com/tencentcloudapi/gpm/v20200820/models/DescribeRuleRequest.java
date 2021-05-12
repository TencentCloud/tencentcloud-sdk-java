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
package com.tencentcloudapi.gpm.v20200820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRuleRequest extends AbstractModel{

    /**
    * 规则code
    */
    @SerializedName("RuleCode")
    @Expose
    private String RuleCode;

    /**
     * Get 规则code 
     * @return RuleCode 规则code
     */
    public String getRuleCode() {
        return this.RuleCode;
    }

    /**
     * Set 规则code
     * @param RuleCode 规则code
     */
    public void setRuleCode(String RuleCode) {
        this.RuleCode = RuleCode;
    }

    public DescribeRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRuleRequest(DescribeRuleRequest source) {
        if (source.RuleCode != null) {
            this.RuleCode = new String(source.RuleCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleCode", this.RuleCode);

    }
}

