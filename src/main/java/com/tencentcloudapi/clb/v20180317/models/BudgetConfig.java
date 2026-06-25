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

public class BudgetConfig extends AbstractModel {

    /**
    * <p>预算刷新周期。</p><p>枚举值：</p><ul><li>1d：按天刷新</li><li>7d：按周刷新</li><li>30d：按月刷新</li></ul><p>不传时默认30d。同一个Budget下每种刷新周期最多配置一次。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BudgetDuration")
    @Expose
    private String BudgetDuration;

    /**
    * <p>下一次刷新的时间</p>
    */
    @SerializedName("BudgetResetAt")
    @Expose
    private String BudgetResetAt;

    /**
    * <p>最大预算。</p><p>单位：credit。取值需大于0且不超过10000000000；不传时默认100000。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxBudget")
    @Expose
    private Float MaxBudget;

    /**
     * Get <p>预算刷新周期。</p><p>枚举值：</p><ul><li>1d：按天刷新</li><li>7d：按周刷新</li><li>30d：按月刷新</li></ul><p>不传时默认30d。同一个Budget下每种刷新周期最多配置一次。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BudgetDuration <p>预算刷新周期。</p><p>枚举值：</p><ul><li>1d：按天刷新</li><li>7d：按周刷新</li><li>30d：按月刷新</li></ul><p>不传时默认30d。同一个Budget下每种刷新周期最多配置一次。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBudgetDuration() {
        return this.BudgetDuration;
    }

    /**
     * Set <p>预算刷新周期。</p><p>枚举值：</p><ul><li>1d：按天刷新</li><li>7d：按周刷新</li><li>30d：按月刷新</li></ul><p>不传时默认30d。同一个Budget下每种刷新周期最多配置一次。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BudgetDuration <p>预算刷新周期。</p><p>枚举值：</p><ul><li>1d：按天刷新</li><li>7d：按周刷新</li><li>30d：按月刷新</li></ul><p>不传时默认30d。同一个Budget下每种刷新周期最多配置一次。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBudgetDuration(String BudgetDuration) {
        this.BudgetDuration = BudgetDuration;
    }

    /**
     * Get <p>下一次刷新的时间</p> 
     * @return BudgetResetAt <p>下一次刷新的时间</p>
     */
    public String getBudgetResetAt() {
        return this.BudgetResetAt;
    }

    /**
     * Set <p>下一次刷新的时间</p>
     * @param BudgetResetAt <p>下一次刷新的时间</p>
     */
    public void setBudgetResetAt(String BudgetResetAt) {
        this.BudgetResetAt = BudgetResetAt;
    }

    /**
     * Get <p>最大预算。</p><p>单位：credit。取值需大于0且不超过10000000000；不传时默认100000。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxBudget <p>最大预算。</p><p>单位：credit。取值需大于0且不超过10000000000；不传时默认100000。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMaxBudget() {
        return this.MaxBudget;
    }

    /**
     * Set <p>最大预算。</p><p>单位：credit。取值需大于0且不超过10000000000；不传时默认100000。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxBudget <p>最大预算。</p><p>单位：credit。取值需大于0且不超过10000000000；不传时默认100000。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxBudget(Float MaxBudget) {
        this.MaxBudget = MaxBudget;
    }

    public BudgetConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BudgetConfig(BudgetConfig source) {
        if (source.BudgetDuration != null) {
            this.BudgetDuration = new String(source.BudgetDuration);
        }
        if (source.BudgetResetAt != null) {
            this.BudgetResetAt = new String(source.BudgetResetAt);
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
        this.setParamSimple(map, prefix + "BudgetResetAt", this.BudgetResetAt);
        this.setParamSimple(map, prefix + "MaxBudget", this.MaxBudget);

    }
}

