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

public class ModifyDspmRiskStrategyRequest extends AbstractModel {

    /**
    * 集团账号的成员id
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * 风险策略类型
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * 是否启用
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * 策略内容，如：{     ThresholdValue: "100" }
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * 可选值：Info/Low/Medium/High
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 策略id
    */
    @SerializedName("StrategyId")
    @Expose
    private Long [] StrategyId;

    /**
     * Get 集团账号的成员id 
     * @return MemberId 集团账号的成员id
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 集团账号的成员id
     * @param MemberId 集团账号的成员id
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get 风险策略类型 
     * @return StrategyType 风险策略类型
     */
    public String getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set 风险策略类型
     * @param StrategyType 风险策略类型
     */
    public void setStrategyType(String StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get 是否启用 
     * @return IsEnabled 是否启用
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set 是否启用
     * @param IsEnabled 是否启用
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get 策略内容，如：{     ThresholdValue: "100" } 
     * @return Rule 策略内容，如：{     ThresholdValue: "100" }
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set 策略内容，如：{     ThresholdValue: "100" }
     * @param Rule 策略内容，如：{     ThresholdValue: "100" }
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get 可选值：Info/Low/Medium/High 
     * @return RiskLevel 可选值：Info/Low/Medium/High
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 可选值：Info/Low/Medium/High
     * @param RiskLevel 可选值：Info/Low/Medium/High
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 策略id 
     * @return StrategyId 策略id
     */
    public Long [] getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 策略id
     * @param StrategyId 策略id
     */
    public void setStrategyId(Long [] StrategyId) {
        this.StrategyId = StrategyId;
    }

    public ModifyDspmRiskStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDspmRiskStrategyRequest(ModifyDspmRiskStrategyRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.StrategyType != null) {
            this.StrategyType = new String(source.StrategyType);
        }
        if (source.IsEnabled != null) {
            this.IsEnabled = new Long(source.IsEnabled);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.StrategyId != null) {
            this.StrategyId = new Long[source.StrategyId.length];
            for (int i = 0; i < source.StrategyId.length; i++) {
                this.StrategyId[i] = new Long(source.StrategyId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamArraySimple(map, prefix + "StrategyId.", this.StrategyId);

    }
}

