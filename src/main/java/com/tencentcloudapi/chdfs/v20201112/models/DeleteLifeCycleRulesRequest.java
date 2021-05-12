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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteLifeCycleRulesRequest extends AbstractModel{

    /**
    * 多个生命周期规则ID，上限为10
    */
    @SerializedName("LifeCycleRuleIds")
    @Expose
    private Long [] LifeCycleRuleIds;

    /**
     * Get 多个生命周期规则ID，上限为10 
     * @return LifeCycleRuleIds 多个生命周期规则ID，上限为10
     */
    public Long [] getLifeCycleRuleIds() {
        return this.LifeCycleRuleIds;
    }

    /**
     * Set 多个生命周期规则ID，上限为10
     * @param LifeCycleRuleIds 多个生命周期规则ID，上限为10
     */
    public void setLifeCycleRuleIds(Long [] LifeCycleRuleIds) {
        this.LifeCycleRuleIds = LifeCycleRuleIds;
    }

    public DeleteLifeCycleRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteLifeCycleRulesRequest(DeleteLifeCycleRulesRequest source) {
        if (source.LifeCycleRuleIds != null) {
            this.LifeCycleRuleIds = new Long[source.LifeCycleRuleIds.length];
            for (int i = 0; i < source.LifeCycleRuleIds.length; i++) {
                this.LifeCycleRuleIds[i] = new Long(source.LifeCycleRuleIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "LifeCycleRuleIds.", this.LifeCycleRuleIds);

    }
}

