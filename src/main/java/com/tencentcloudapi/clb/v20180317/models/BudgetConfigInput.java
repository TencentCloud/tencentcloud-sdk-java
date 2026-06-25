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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BudgetConfigInput extends AbstractModel {

    /**
    * <p>预算刷新周期。</p><p>支持取值：</p><ul><li>1d：按天刷新</li><li>7d：按周刷新</li><li>30d：按月刷新</li></ul><p>不传时默认使用30d。同一个Budget下每种刷新周期最多配置一次。</p>
    */
    @SerializedName("BudgetDuration")
    @Expose
    private String BudgetDuration;

    /**
    * <p>最大预算。</p><p>单位：credit。取值需大于0且不超过10000000000；不传时默认100000。</p>
    */
    @SerializedName("MaxBudget")
    @Expose
    private Float MaxBudget;

    /**
     * Get <p>预算刷新周期。</p><p>支持取值：</p><ul><li>1d：按天刷新</li><li>7d：按周刷新</li><li>30d：按月刷新</li></ul><p>不传时默认使用30d。同一个Budget下每种刷新周期最多配置一次。</p> 
     * @return BudgetDuration <p>预算刷新周期。</p><p>支持取值：</p><ul><li>1d：按天刷新</li><li>7d：按周刷新</li><li>30d：按月刷新</li></ul><p>不传时默认使用30d。同一个Budget下每种刷新周期最多配置一次。</p>
     */
    public String getBudgetDuration() {
        return this.BudgetDuration;
    }

    /**
     * Set <p>预算刷新周期。</p><p>支持取值：</p><ul><li>1d：按天刷新</li><li>7d：按周刷新</li><li>30d：按月刷新</li></ul><p>不传时默认使用30d。同一个Budget下每种刷新周期最多配置一次。</p>
     * @param BudgetDuration <p>预算刷新周期。</p><p>支持取值：</p><ul><li>1d：按天刷新</li><li>7d：按周刷新</li><li>30d：按月刷新</li></ul><p>不传时默认使用30d。同一个Budget下每种刷新周期最多配置一次。</p>
     */
    public void setBudgetDuration(String BudgetDuration) {
        this.BudgetDuration = BudgetDuration;
    }

    /**
     * Get <p>最大预算。</p><p>单位：credit。取值需大于0且不超过10000000000；不传时默认100000。</p> 
     * @return MaxBudget <p>最大预算。</p><p>单位：credit。取值需大于0且不超过10000000000；不传时默认100000。</p>
     */
    public Float getMaxBudget() {
        return this.MaxBudget;
    }

    /**
     * Set <p>最大预算。</p><p>单位：credit。取值需大于0且不超过10000000000；不传时默认100000。</p>
     * @param MaxBudget <p>最大预算。</p><p>单位：credit。取值需大于0且不超过10000000000；不传时默认100000。</p>
     */
    public void setMaxBudget(Float MaxBudget) {
        this.MaxBudget = MaxBudget;
    }

    public BudgetConfigInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BudgetConfigInput(BudgetConfigInput source) {
        if (source.BudgetDuration != null) {
            this.BudgetDuration = new String(source.BudgetDuration);
        }
        if (source.MaxBudget != null) {
            this.MaxBudget = new Float(source.MaxBudget);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BudgetDuration", this.BudgetDuration);
        this.setParamSimple(map, prefix + "MaxBudget", this.MaxBudget);

    }
}

