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

public class ModifyBudgetAttributesRequest extends AbstractModel {

    /**
    * <p>Budget ID。</p>
    */
    @SerializedName("BudgetId")
    @Expose
    private String BudgetId;

    /**
    * <p>预算配置数组。</p><p>数组长度最大为1。BudgetResetAt不支持作为入参设置。</p>
    */
    @SerializedName("BudgetConfigs")
    @Expose
    private BudgetConfigInput [] BudgetConfigs;

    /**
    * <p>Budget名称。</p>
    */
    @SerializedName("BudgetName")
    @Expose
    private String BudgetName;

    /**
    * <p>Budget限速配置。</p>
    */
    @SerializedName("RateLimitConfig")
    @Expose
    private RateLimitConfigForBudget RateLimitConfig;

    /**
     * Get <p>Budget ID。</p> 
     * @return BudgetId <p>Budget ID。</p>
     */
    public String getBudgetId() {
        return this.BudgetId;
    }

    /**
     * Set <p>Budget ID。</p>
     * @param BudgetId <p>Budget ID。</p>
     */
    public void setBudgetId(String BudgetId) {
        this.BudgetId = BudgetId;
    }

    /**
     * Get <p>预算配置数组。</p><p>数组长度最大为1。BudgetResetAt不支持作为入参设置。</p> 
     * @return BudgetConfigs <p>预算配置数组。</p><p>数组长度最大为1。BudgetResetAt不支持作为入参设置。</p>
     */
    public BudgetConfigInput [] getBudgetConfigs() {
        return this.BudgetConfigs;
    }

    /**
     * Set <p>预算配置数组。</p><p>数组长度最大为1。BudgetResetAt不支持作为入参设置。</p>
     * @param BudgetConfigs <p>预算配置数组。</p><p>数组长度最大为1。BudgetResetAt不支持作为入参设置。</p>
     */
    public void setBudgetConfigs(BudgetConfigInput [] BudgetConfigs) {
        this.BudgetConfigs = BudgetConfigs;
    }

    /**
     * Get <p>Budget名称。</p> 
     * @return BudgetName <p>Budget名称。</p>
     */
    public String getBudgetName() {
        return this.BudgetName;
    }

    /**
     * Set <p>Budget名称。</p>
     * @param BudgetName <p>Budget名称。</p>
     */
    public void setBudgetName(String BudgetName) {
        this.BudgetName = BudgetName;
    }

    /**
     * Get <p>Budget限速配置。</p> 
     * @return RateLimitConfig <p>Budget限速配置。</p>
     */
    public RateLimitConfigForBudget getRateLimitConfig() {
        return this.RateLimitConfig;
    }

    /**
     * Set <p>Budget限速配置。</p>
     * @param RateLimitConfig <p>Budget限速配置。</p>
     */
    public void setRateLimitConfig(RateLimitConfigForBudget RateLimitConfig) {
        this.RateLimitConfig = RateLimitConfig;
    }

    public ModifyBudgetAttributesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBudgetAttributesRequest(ModifyBudgetAttributesRequest source) {
        if (source.BudgetId != null) {
            this.BudgetId = new String(source.BudgetId);
        }
        if (source.BudgetConfigs != null) {
            this.BudgetConfigs = new BudgetConfigInput[source.BudgetConfigs.length];
            for (int i = 0; i < source.BudgetConfigs.length; i++) {
                this.BudgetConfigs[i] = new BudgetConfigInput(source.BudgetConfigs[i]);
            }
        }
        if (source.BudgetName != null) {
            this.BudgetName = new String(source.BudgetName);
        }
        if (source.RateLimitConfig != null) {
            this.RateLimitConfig = new RateLimitConfigForBudget(source.RateLimitConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BudgetId", this.BudgetId);
        this.setParamArrayObj(map, prefix + "BudgetConfigs.", this.BudgetConfigs);
        this.setParamSimple(map, prefix + "BudgetName", this.BudgetName);
        this.setParamObj(map, prefix + "RateLimitConfig.", this.RateLimitConfig);

    }
}

