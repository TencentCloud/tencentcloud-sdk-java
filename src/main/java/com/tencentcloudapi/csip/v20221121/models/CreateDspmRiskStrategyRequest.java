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

public class CreateDspmRiskStrategyRequest extends AbstractModel {

    /**
    * <p>策略名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>策略规则，JSON 字符串</p>
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>英文策略名</p>
    */
    @SerializedName("EnName")
    @Expose
    private String EnName;

    /**
    * <p>策略描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>英文策略描述</p>
    */
    @SerializedName("EnDescription")
    @Expose
    private String EnDescription;

    /**
    * <p>风险等级，可选值：Info/Low/Medium/High。不传默认 Medium</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * <p>是否启用。0-禁用，1-启用，不传默认启用</p>
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * <p>风险类型。当前仅支持 alarm，不传默认 alarm</p>
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * <p>策略类别。当前仅支持 SQLOperationAnomaly，不传默认 SQLOperationAnomaly</p>
    */
    @SerializedName("StrategyCategory")
    @Expose
    private String StrategyCategory;

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
     * Get <p>策略规则，JSON 字符串</p> 
     * @return Rule <p>策略规则，JSON 字符串</p>
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set <p>策略规则，JSON 字符串</p>
     * @param Rule <p>策略规则，JSON 字符串</p>
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>英文策略名</p> 
     * @return EnName <p>英文策略名</p>
     */
    public String getEnName() {
        return this.EnName;
    }

    /**
     * Set <p>英文策略名</p>
     * @param EnName <p>英文策略名</p>
     */
    public void setEnName(String EnName) {
        this.EnName = EnName;
    }

    /**
     * Get <p>策略描述</p> 
     * @return Description <p>策略描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>策略描述</p>
     * @param Description <p>策略描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>英文策略描述</p> 
     * @return EnDescription <p>英文策略描述</p>
     */
    public String getEnDescription() {
        return this.EnDescription;
    }

    /**
     * Set <p>英文策略描述</p>
     * @param EnDescription <p>英文策略描述</p>
     */
    public void setEnDescription(String EnDescription) {
        this.EnDescription = EnDescription;
    }

    /**
     * Get <p>风险等级，可选值：Info/Low/Medium/High。不传默认 Medium</p> 
     * @return RiskLevel <p>风险等级，可选值：Info/Low/Medium/High。不传默认 Medium</p>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>风险等级，可选值：Info/Low/Medium/High。不传默认 Medium</p>
     * @param RiskLevel <p>风险等级，可选值：Info/Low/Medium/High。不传默认 Medium</p>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>是否启用。0-禁用，1-启用，不传默认启用</p> 
     * @return IsEnabled <p>是否启用。0-禁用，1-启用，不传默认启用</p>
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set <p>是否启用。0-禁用，1-启用，不传默认启用</p>
     * @param IsEnabled <p>是否启用。0-禁用，1-启用，不传默认启用</p>
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get <p>风险类型。当前仅支持 alarm，不传默认 alarm</p> 
     * @return RiskType <p>风险类型。当前仅支持 alarm，不传默认 alarm</p>
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set <p>风险类型。当前仅支持 alarm，不传默认 alarm</p>
     * @param RiskType <p>风险类型。当前仅支持 alarm，不传默认 alarm</p>
     */
    public void setRiskType(String RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get <p>策略类别。当前仅支持 SQLOperationAnomaly，不传默认 SQLOperationAnomaly</p> 
     * @return StrategyCategory <p>策略类别。当前仅支持 SQLOperationAnomaly，不传默认 SQLOperationAnomaly</p>
     */
    public String getStrategyCategory() {
        return this.StrategyCategory;
    }

    /**
     * Set <p>策略类别。当前仅支持 SQLOperationAnomaly，不传默认 SQLOperationAnomaly</p>
     * @param StrategyCategory <p>策略类别。当前仅支持 SQLOperationAnomaly，不传默认 SQLOperationAnomaly</p>
     */
    public void setStrategyCategory(String StrategyCategory) {
        this.StrategyCategory = StrategyCategory;
    }

    public CreateDspmRiskStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDspmRiskStrategyRequest(CreateDspmRiskStrategyRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.EnName != null) {
            this.EnName = new String(source.EnName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.EnDescription != null) {
            this.EnDescription = new String(source.EnDescription);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.IsEnabled != null) {
            this.IsEnabled = new Long(source.IsEnabled);
        }
        if (source.RiskType != null) {
            this.RiskType = new String(source.RiskType);
        }
        if (source.StrategyCategory != null) {
            this.StrategyCategory = new String(source.StrategyCategory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "EnName", this.EnName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "EnDescription", this.EnDescription);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "RiskType", this.RiskType);
        this.setParamSimple(map, prefix + "StrategyCategory", this.StrategyCategory);

    }
}

