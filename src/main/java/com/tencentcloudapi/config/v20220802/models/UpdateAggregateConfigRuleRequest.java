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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateAggregateConfigRuleRequest extends AbstractModel {

    /**
    * 触发类型，最多支持两种
    */
    @SerializedName("TriggerType")
    @Expose
    private TriggerType [] TriggerType;

    /**
    * 风险等级
1：高风险。
2：中风险。
3：低风险。
    */
    @SerializedName("RiskLevel")
    @Expose
    private Long RiskLevel;

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 账号组ID
    */
    @SerializedName("AccountGroupId")
    @Expose
    private String AccountGroupId;

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 入参
    */
    @SerializedName("InputParameter")
    @Expose
    private InputParameter [] InputParameter;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 关联地域
    */
    @SerializedName("RegionScope")
    @Expose
    private String [] RegionScope;

    /**
    * 关联标签
    */
    @SerializedName("TagsScope")
    @Expose
    private Tag [] TagsScope;

    /**
    * 排除的资源ID
    */
    @SerializedName("ExcludeResourceIdsScope")
    @Expose
    private String [] ExcludeResourceIdsScope;

    /**
     * Get 触发类型，最多支持两种 
     * @return TriggerType 触发类型，最多支持两种
     */
    public TriggerType [] getTriggerType() {
        return this.TriggerType;
    }

    /**
     * Set 触发类型，最多支持两种
     * @param TriggerType 触发类型，最多支持两种
     */
    public void setTriggerType(TriggerType [] TriggerType) {
        this.TriggerType = TriggerType;
    }

    /**
     * Get 风险等级
1：高风险。
2：中风险。
3：低风险。 
     * @return RiskLevel 风险等级
1：高风险。
2：中风险。
3：低风险。
     */
    public Long getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级
1：高风险。
2：中风险。
3：低风险。
     * @param RiskLevel 风险等级
1：高风险。
2：中风险。
3：低风险。
     */
    public void setRiskLevel(Long RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 规则ID 
     * @return RuleId 规则ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 账号组ID 
     * @return AccountGroupId 账号组ID
     */
    public String getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set 账号组ID
     * @param AccountGroupId 账号组ID
     */
    public void setAccountGroupId(String AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get 规则名称 
     * @return RuleName 规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
     * @param RuleName 规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 入参 
     * @return InputParameter 入参
     */
    public InputParameter [] getInputParameter() {
        return this.InputParameter;
    }

    /**
     * Set 入参
     * @param InputParameter 入参
     */
    public void setInputParameter(InputParameter [] InputParameter) {
        this.InputParameter = InputParameter;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 关联地域 
     * @return RegionScope 关联地域
     */
    public String [] getRegionScope() {
        return this.RegionScope;
    }

    /**
     * Set 关联地域
     * @param RegionScope 关联地域
     */
    public void setRegionScope(String [] RegionScope) {
        this.RegionScope = RegionScope;
    }

    /**
     * Get 关联标签 
     * @return TagsScope 关联标签
     */
    public Tag [] getTagsScope() {
        return this.TagsScope;
    }

    /**
     * Set 关联标签
     * @param TagsScope 关联标签
     */
    public void setTagsScope(Tag [] TagsScope) {
        this.TagsScope = TagsScope;
    }

    /**
     * Get 排除的资源ID 
     * @return ExcludeResourceIdsScope 排除的资源ID
     */
    public String [] getExcludeResourceIdsScope() {
        return this.ExcludeResourceIdsScope;
    }

    /**
     * Set 排除的资源ID
     * @param ExcludeResourceIdsScope 排除的资源ID
     */
    public void setExcludeResourceIdsScope(String [] ExcludeResourceIdsScope) {
        this.ExcludeResourceIdsScope = ExcludeResourceIdsScope;
    }

    public UpdateAggregateConfigRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAggregateConfigRuleRequest(UpdateAggregateConfigRuleRequest source) {
        if (source.TriggerType != null) {
            this.TriggerType = new TriggerType[source.TriggerType.length];
            for (int i = 0; i < source.TriggerType.length; i++) {
                this.TriggerType[i] = new TriggerType(source.TriggerType[i]);
            }
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new Long(source.RiskLevel);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.AccountGroupId != null) {
            this.AccountGroupId = new String(source.AccountGroupId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.InputParameter != null) {
            this.InputParameter = new InputParameter[source.InputParameter.length];
            for (int i = 0; i < source.InputParameter.length; i++) {
                this.InputParameter[i] = new InputParameter(source.InputParameter[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RegionScope != null) {
            this.RegionScope = new String[source.RegionScope.length];
            for (int i = 0; i < source.RegionScope.length; i++) {
                this.RegionScope[i] = new String(source.RegionScope[i]);
            }
        }
        if (source.TagsScope != null) {
            this.TagsScope = new Tag[source.TagsScope.length];
            for (int i = 0; i < source.TagsScope.length; i++) {
                this.TagsScope[i] = new Tag(source.TagsScope[i]);
            }
        }
        if (source.ExcludeResourceIdsScope != null) {
            this.ExcludeResourceIdsScope = new String[source.ExcludeResourceIdsScope.length];
            for (int i = 0; i < source.ExcludeResourceIdsScope.length; i++) {
                this.ExcludeResourceIdsScope[i] = new String(source.ExcludeResourceIdsScope[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TriggerType.", this.TriggerType);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamArrayObj(map, prefix + "InputParameter.", this.InputParameter);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "RegionScope.", this.RegionScope);
        this.setParamArrayObj(map, prefix + "TagsScope.", this.TagsScope);
        this.setParamArraySimple(map, prefix + "ExcludeResourceIdsScope.", this.ExcludeResourceIdsScope);

    }
}

