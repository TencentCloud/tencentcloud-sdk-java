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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmRiskStrategyGroup extends AbstractModel {

    /**
    * <p>策略类型</p>
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * <p>策略名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>策略类型</p>
    */
    @SerializedName("StrategyCategory")
    @Expose
    private String StrategyCategory;

    /**
    * <p>是否启用。0-禁用 1-启用</p>
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * <p>命中次数</p>
    */
    @SerializedName("HitCount")
    @Expose
    private Long HitCount;

    /**
    * <p>风险类型。risk-风险；alarm-告警。</p>
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * <p>策略列表</p>
    */
    @SerializedName("StrategyList")
    @Expose
    private DspmRiskStrategy [] StrategyList;

    /**
    * <p>规则来源</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleSource")
    @Expose
    private String RuleSource;

    /**
     * Get <p>策略类型</p> 
     * @return StrategyType <p>策略类型</p>
     */
    public String getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set <p>策略类型</p>
     * @param StrategyType <p>策略类型</p>
     */
    public void setStrategyType(String StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get <p>策略名</p> 
     * @return Name <p>策略名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>策略名</p>
     * @param Name <p>策略名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>策略类型</p> 
     * @return StrategyCategory <p>策略类型</p>
     */
    public String getStrategyCategory() {
        return this.StrategyCategory;
    }

    /**
     * Set <p>策略类型</p>
     * @param StrategyCategory <p>策略类型</p>
     */
    public void setStrategyCategory(String StrategyCategory) {
        this.StrategyCategory = StrategyCategory;
    }

    /**
     * Get <p>是否启用。0-禁用 1-启用</p> 
     * @return IsEnabled <p>是否启用。0-禁用 1-启用</p>
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set <p>是否启用。0-禁用 1-启用</p>
     * @param IsEnabled <p>是否启用。0-禁用 1-启用</p>
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get <p>命中次数</p> 
     * @return HitCount <p>命中次数</p>
     */
    public Long getHitCount() {
        return this.HitCount;
    }

    /**
     * Set <p>命中次数</p>
     * @param HitCount <p>命中次数</p>
     */
    public void setHitCount(Long HitCount) {
        this.HitCount = HitCount;
    }

    /**
     * Get <p>风险类型。risk-风险；alarm-告警。</p> 
     * @return RiskType <p>风险类型。risk-风险；alarm-告警。</p>
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set <p>风险类型。risk-风险；alarm-告警。</p>
     * @param RiskType <p>风险类型。risk-风险；alarm-告警。</p>
     */
    public void setRiskType(String RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get <p>策略列表</p> 
     * @return StrategyList <p>策略列表</p>
     */
    public DspmRiskStrategy [] getStrategyList() {
        return this.StrategyList;
    }

    /**
     * Set <p>策略列表</p>
     * @param StrategyList <p>策略列表</p>
     */
    public void setStrategyList(DspmRiskStrategy [] StrategyList) {
        this.StrategyList = StrategyList;
    }

    /**
     * Get <p>规则来源</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleSource <p>规则来源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleSource() {
        return this.RuleSource;
    }

    /**
     * Set <p>规则来源</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleSource <p>规则来源</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleSource(String RuleSource) {
        this.RuleSource = RuleSource;
    }

    public DspmRiskStrategyGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmRiskStrategyGroup(DspmRiskStrategyGroup source) {
        if (source.StrategyType != null) {
            this.StrategyType = new String(source.StrategyType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StrategyCategory != null) {
            this.StrategyCategory = new String(source.StrategyCategory);
        }
        if (source.IsEnabled != null) {
            this.IsEnabled = new Long(source.IsEnabled);
        }
        if (source.HitCount != null) {
            this.HitCount = new Long(source.HitCount);
        }
        if (source.RiskType != null) {
            this.RiskType = new String(source.RiskType);
        }
        if (source.StrategyList != null) {
            this.StrategyList = new DspmRiskStrategy[source.StrategyList.length];
            for (int i = 0; i < source.StrategyList.length; i++) {
                this.StrategyList[i] = new DspmRiskStrategy(source.StrategyList[i]);
            }
        }
        if (source.RuleSource != null) {
            this.RuleSource = new String(source.RuleSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StrategyCategory", this.StrategyCategory);
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "HitCount", this.HitCount);
        this.setParamSimple(map, prefix + "RiskType", this.RiskType);
        this.setParamArrayObj(map, prefix + "StrategyList.", this.StrategyList);
        this.setParamSimple(map, prefix + "RuleSource", this.RuleSource);

    }
}

