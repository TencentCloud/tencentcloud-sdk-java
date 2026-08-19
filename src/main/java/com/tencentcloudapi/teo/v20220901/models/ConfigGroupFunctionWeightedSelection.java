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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigGroupFunctionWeightedSelection extends AbstractModel {

    /**
    * <p>指定执行的函数，取值为函数在站点内的唯一标识。当 TriggerType 为 direct 时生效。</p>
    */
    @SerializedName("Function")
    @Expose
    private String Function;

    /**
    * <p>选中权重。取值范围0-100，所有的权重之和需要为100。 选中概率计算方式为： weight/100。例如设置了两个函数 A 和 B ，其中 A 的权重为30，那么 B 的权重必须为70，最终选中 A 的概率为30%，选中 B 的概率为70%。</p>
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get <p>指定执行的函数，取值为函数在站点内的唯一标识。当 TriggerType 为 direct 时生效。</p> 
     * @return Function <p>指定执行的函数，取值为函数在站点内的唯一标识。当 TriggerType 为 direct 时生效。</p>
     */
    public String getFunction() {
        return this.Function;
    }

    /**
     * Set <p>指定执行的函数，取值为函数在站点内的唯一标识。当 TriggerType 为 direct 时生效。</p>
     * @param Function <p>指定执行的函数，取值为函数在站点内的唯一标识。当 TriggerType 为 direct 时生效。</p>
     */
    public void setFunction(String Function) {
        this.Function = Function;
    }

    /**
     * Get <p>选中权重。取值范围0-100，所有的权重之和需要为100。 选中概率计算方式为： weight/100。例如设置了两个函数 A 和 B ，其中 A 的权重为30，那么 B 的权重必须为70，最终选中 A 的概率为30%，选中 B 的概率为70%。</p> 
     * @return Weight <p>选中权重。取值范围0-100，所有的权重之和需要为100。 选中概率计算方式为： weight/100。例如设置了两个函数 A 和 B ，其中 A 的权重为30，那么 B 的权重必须为70，最终选中 A 的概率为30%，选中 B 的概率为70%。</p>
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set <p>选中权重。取值范围0-100，所有的权重之和需要为100。 选中概率计算方式为： weight/100。例如设置了两个函数 A 和 B ，其中 A 的权重为30，那么 B 的权重必须为70，最终选中 A 的概率为30%，选中 B 的概率为70%。</p>
     * @param Weight <p>选中权重。取值范围0-100，所有的权重之和需要为100。 选中概率计算方式为： weight/100。例如设置了两个函数 A 和 B ，其中 A 的权重为30，那么 B 的权重必须为70，最终选中 A 的概率为30%，选中 B 的概率为70%。</p>
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public ConfigGroupFunctionWeightedSelection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigGroupFunctionWeightedSelection(ConfigGroupFunctionWeightedSelection source) {
        if (source.Function != null) {
            this.Function = new String(source.Function);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Function", this.Function);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

