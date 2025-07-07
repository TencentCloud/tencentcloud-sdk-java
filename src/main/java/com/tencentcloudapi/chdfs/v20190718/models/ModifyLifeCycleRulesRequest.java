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
package com.tencentcloudapi.chdfs.v20190718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLifeCycleRulesRequest extends AbstractModel {

    /**
    * 多个生命周期规则，上限为10
    */
    @SerializedName("LifeCycleRules")
    @Expose
    private LifeCycleRule [] LifeCycleRules;

    /**
     * Get 多个生命周期规则，上限为10 
     * @return LifeCycleRules 多个生命周期规则，上限为10
     */
    public LifeCycleRule [] getLifeCycleRules() {
        return this.LifeCycleRules;
    }

    /**
     * Set 多个生命周期规则，上限为10
     * @param LifeCycleRules 多个生命周期规则，上限为10
     */
    public void setLifeCycleRules(LifeCycleRule [] LifeCycleRules) {
        this.LifeCycleRules = LifeCycleRules;
    }

    public ModifyLifeCycleRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLifeCycleRulesRequest(ModifyLifeCycleRulesRequest source) {
        if (source.LifeCycleRules != null) {
            this.LifeCycleRules = new LifeCycleRule[source.LifeCycleRules.length];
            for (int i = 0; i < source.LifeCycleRules.length; i++) {
                this.LifeCycleRules[i] = new LifeCycleRule(source.LifeCycleRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "LifeCycleRules.", this.LifeCycleRules);

    }
}

