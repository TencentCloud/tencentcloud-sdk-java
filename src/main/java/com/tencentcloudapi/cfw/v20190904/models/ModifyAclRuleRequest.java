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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAclRuleRequest extends AbstractModel {

    /**
    * 需要编辑的规则数组，基于Uuid唯一id修改该规则
    */
    @SerializedName("Rules")
    @Expose
    private CreateRuleItem [] Rules;

    /**
     * Get 需要编辑的规则数组，基于Uuid唯一id修改该规则 
     * @return Rules 需要编辑的规则数组，基于Uuid唯一id修改该规则
     */
    public CreateRuleItem [] getRules() {
        return this.Rules;
    }

    /**
     * Set 需要编辑的规则数组，基于Uuid唯一id修改该规则
     * @param Rules 需要编辑的规则数组，基于Uuid唯一id修改该规则
     */
    public void setRules(CreateRuleItem [] Rules) {
        this.Rules = Rules;
    }

    public ModifyAclRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAclRuleRequest(ModifyAclRuleRequest source) {
        if (source.Rules != null) {
            this.Rules = new CreateRuleItem[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new CreateRuleItem(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

