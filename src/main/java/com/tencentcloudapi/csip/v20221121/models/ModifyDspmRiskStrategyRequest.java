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
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>风险策略类型</p>
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * <p>是否启用</p>
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * <p>策略内容，如：{     ThresholdValue: &quot;100&quot; }</p>
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * <p>可选值：Info/Low/Medium/High</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * <p>策略id</p>
    */
    @SerializedName("StrategyId")
    @Expose
    private Long [] StrategyId;

    /**
    * <p>策略名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>策略描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>支持的数据库类型</p>
    */
    @SerializedName("DbTypes")
    @Expose
    private String DbTypes;

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
     * Get <p>风险策略类型</p> 
     * @return StrategyType <p>风险策略类型</p>
     */
    public String getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set <p>风险策略类型</p>
     * @param StrategyType <p>风险策略类型</p>
     */
    public void setStrategyType(String StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get <p>是否启用</p> 
     * @return IsEnabled <p>是否启用</p>
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set <p>是否启用</p>
     * @param IsEnabled <p>是否启用</p>
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get <p>策略内容，如：{     ThresholdValue: &quot;100&quot; }</p> 
     * @return Rule <p>策略内容，如：{     ThresholdValue: &quot;100&quot; }</p>
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set <p>策略内容，如：{     ThresholdValue: &quot;100&quot; }</p>
     * @param Rule <p>策略内容，如：{     ThresholdValue: &quot;100&quot; }</p>
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get <p>可选值：Info/Low/Medium/High</p> 
     * @return RiskLevel <p>可选值：Info/Low/Medium/High</p>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>可选值：Info/Low/Medium/High</p>
     * @param RiskLevel <p>可选值：Info/Low/Medium/High</p>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>策略id</p> 
     * @return StrategyId <p>策略id</p>
     */
    public Long [] getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set <p>策略id</p>
     * @param StrategyId <p>策略id</p>
     */
    public void setStrategyId(Long [] StrategyId) {
        this.StrategyId = StrategyId;
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
     * Get <p>支持的数据库类型</p> 
     * @return DbTypes <p>支持的数据库类型</p>
     */
    public String getDbTypes() {
        return this.DbTypes;
    }

    /**
     * Set <p>支持的数据库类型</p>
     * @param DbTypes <p>支持的数据库类型</p>
     */
    public void setDbTypes(String DbTypes) {
        this.DbTypes = DbTypes;
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
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DbTypes != null) {
            this.DbTypes = new String(source.DbTypes);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DbTypes", this.DbTypes);

    }
}

