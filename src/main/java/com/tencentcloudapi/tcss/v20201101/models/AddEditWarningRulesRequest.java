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

public class AddEditWarningRulesRequest extends AbstractModel{

    /**
    * 告警开关策略
    */
    @SerializedName("WarningRules")
    @Expose
    private WarningRule [] WarningRules;

    /**
     * Get 告警开关策略 
     * @return WarningRules 告警开关策略
     */
    public WarningRule [] getWarningRules() {
        return this.WarningRules;
    }

    /**
     * Set 告警开关策略
     * @param WarningRules 告警开关策略
     */
    public void setWarningRules(WarningRule [] WarningRules) {
        this.WarningRules = WarningRules;
    }

    public AddEditWarningRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddEditWarningRulesRequest(AddEditWarningRulesRequest source) {
        if (source.WarningRules != null) {
            this.WarningRules = new WarningRule[source.WarningRules.length];
            for (int i = 0; i < source.WarningRules.length; i++) {
                this.WarningRules[i] = new WarningRule(source.WarningRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "WarningRules.", this.WarningRules);

    }
}

