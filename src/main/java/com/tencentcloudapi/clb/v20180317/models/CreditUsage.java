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

public class CreditUsage extends AbstractModel {

    /**
    * <p>Budget刷新周期。</p><p>枚举值：</p><ul><li>1d：按天刷新</li><li>7d：按周刷新</li><li>30d：按月刷新</li></ul><p>仅在 CreditUsageSet 数组元素中返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BudgetDuration")
    @Expose
    private String BudgetDuration;

    /**
    * <p>下次刷新时间。</p><p>用户组关联Budget且Budget设置重置周期时返回；未关联Budget或未设置重置周期时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BudgetResetAt")
    @Expose
    private String BudgetResetAt;

    /**
    * <p>Credit上限。</p><p>用户组关联Budget且Budget设置最大预算时返回；未设置最大预算时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Limit")
    @Expose
    private Float Limit;

    /**
    * <p>用户组已使用的Credit数量。</p>
    */
    @SerializedName("Used")
    @Expose
    private Float Used;

    /**
     * Get <p>Budget刷新周期。</p><p>枚举值：</p><ul><li>1d：按天刷新</li><li>7d：按周刷新</li><li>30d：按月刷新</li></ul><p>仅在 CreditUsageSet 数组元素中返回。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BudgetDuration <p>Budget刷新周期。</p><p>枚举值：</p><ul><li>1d：按天刷新</li><li>7d：按周刷新</li><li>30d：按月刷新</li></ul><p>仅在 CreditUsageSet 数组元素中返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBudgetDuration() {
        return this.BudgetDuration;
    }

    /**
     * Set <p>Budget刷新周期。</p><p>枚举值：</p><ul><li>1d：按天刷新</li><li>7d：按周刷新</li><li>30d：按月刷新</li></ul><p>仅在 CreditUsageSet 数组元素中返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BudgetDuration <p>Budget刷新周期。</p><p>枚举值：</p><ul><li>1d：按天刷新</li><li>7d：按周刷新</li><li>30d：按月刷新</li></ul><p>仅在 CreditUsageSet 数组元素中返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBudgetDuration(String BudgetDuration) {
        this.BudgetDuration = BudgetDuration;
    }

    /**
     * Get <p>下次刷新时间。</p><p>用户组关联Budget且Budget设置重置周期时返回；未关联Budget或未设置重置周期时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BudgetResetAt <p>下次刷新时间。</p><p>用户组关联Budget且Budget设置重置周期时返回；未关联Budget或未设置重置周期时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBudgetResetAt() {
        return this.BudgetResetAt;
    }

    /**
     * Set <p>下次刷新时间。</p><p>用户组关联Budget且Budget设置重置周期时返回；未关联Budget或未设置重置周期时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BudgetResetAt <p>下次刷新时间。</p><p>用户组关联Budget且Budget设置重置周期时返回；未关联Budget或未设置重置周期时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBudgetResetAt(String BudgetResetAt) {
        this.BudgetResetAt = BudgetResetAt;
    }

    /**
     * Get <p>Credit上限。</p><p>用户组关联Budget且Budget设置最大预算时返回；未设置最大预算时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Limit <p>Credit上限。</p><p>用户组关联Budget且Budget设置最大预算时返回；未设置最大预算时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Credit上限。</p><p>用户组关联Budget且Budget设置最大预算时返回；未设置最大预算时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Limit <p>Credit上限。</p><p>用户组关联Budget且Budget设置最大预算时返回；未设置最大预算时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLimit(Float Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>用户组已使用的Credit数量。</p> 
     * @return Used <p>用户组已使用的Credit数量。</p>
     */
    public Float getUsed() {
        return this.Used;
    }

    /**
     * Set <p>用户组已使用的Credit数量。</p>
     * @param Used <p>用户组已使用的Credit数量。</p>
     */
    public void setUsed(Float Used) {
        this.Used = Used;
    }

    public CreditUsage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreditUsage(CreditUsage source) {
        if (source.BudgetDuration != null) {
            this.BudgetDuration = new String(source.BudgetDuration);
        }
        if (source.BudgetResetAt != null) {
            this.BudgetResetAt = new String(source.BudgetResetAt);
        }
        if (source.Limit != null) {
            this.Limit = new Float(source.Limit);
        }
        if (source.Used != null) {
            this.Used = new Float(source.Used);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BudgetDuration", this.BudgetDuration);
        this.setParamSimple(map, prefix + "BudgetResetAt", this.BudgetResetAt);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Used", this.Used);

    }
}

