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
    * 策略类型
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * 策略名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 策略类型
    */
    @SerializedName("StrategyCategory")
    @Expose
    private String StrategyCategory;

    /**
    * 是否启用。0-禁用 1-启用
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * 命中次数
    */
    @SerializedName("HitCount")
    @Expose
    private Long HitCount;

    /**
    * 风险类型。risk-风险；alarm-告警。
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * 策略列表
    */
    @SerializedName("StrategyList")
    @Expose
    private DspmRiskStrategy [] StrategyList;

    /**
     * Get 策略类型 
     * @return StrategyType 策略类型
     */
    public String getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set 策略类型
     * @param StrategyType 策略类型
     */
    public void setStrategyType(String StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get 策略名 
     * @return Name 策略名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 策略名
     * @param Name 策略名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 策略类型 
     * @return StrategyCategory 策略类型
     */
    public String getStrategyCategory() {
        return this.StrategyCategory;
    }

    /**
     * Set 策略类型
     * @param StrategyCategory 策略类型
     */
    public void setStrategyCategory(String StrategyCategory) {
        this.StrategyCategory = StrategyCategory;
    }

    /**
     * Get 是否启用。0-禁用 1-启用 
     * @return IsEnabled 是否启用。0-禁用 1-启用
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set 是否启用。0-禁用 1-启用
     * @param IsEnabled 是否启用。0-禁用 1-启用
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get 命中次数 
     * @return HitCount 命中次数
     */
    public Long getHitCount() {
        return this.HitCount;
    }

    /**
     * Set 命中次数
     * @param HitCount 命中次数
     */
    public void setHitCount(Long HitCount) {
        this.HitCount = HitCount;
    }

    /**
     * Get 风险类型。risk-风险；alarm-告警。 
     * @return RiskType 风险类型。risk-风险；alarm-告警。
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set 风险类型。risk-风险；alarm-告警。
     * @param RiskType 风险类型。risk-风险；alarm-告警。
     */
    public void setRiskType(String RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get 策略列表 
     * @return StrategyList 策略列表
     */
    public DspmRiskStrategy [] getStrategyList() {
        return this.StrategyList;
    }

    /**
     * Set 策略列表
     * @param StrategyList 策略列表
     */
    public void setStrategyList(DspmRiskStrategy [] StrategyList) {
        this.StrategyList = StrategyList;
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

    }
}

