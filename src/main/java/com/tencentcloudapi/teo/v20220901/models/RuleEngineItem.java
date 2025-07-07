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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleEngineItem extends AbstractModel {

    /**
    * 规则状态。取值有：<li> enable: 启用； </li><li> disable: 未启用。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 规则 ID。规则的唯一性标识，当调用 ModifyL7AccRules 时，该参数必填。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 规则名称。名称长度限制不超过 255 个字符。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则注释。可以填写多个注释。
    */
    @SerializedName("Description")
    @Expose
    private String [] Description;

    /**
    * 子规则分支。此列表当前只支持填写一项规则，多填无效。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Branches")
    @Expose
    private RuleBranch [] Branches;

    /**
    * 规则优先级。仅作为出参使用。
    */
    @SerializedName("RulePriority")
    @Expose
    private Long RulePriority;

    /**
     * Get 规则状态。取值有：<li> enable: 启用； </li><li> disable: 未启用。</li> 
     * @return Status 规则状态。取值有：<li> enable: 启用； </li><li> disable: 未启用。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 规则状态。取值有：<li> enable: 启用； </li><li> disable: 未启用。</li>
     * @param Status 规则状态。取值有：<li> enable: 启用； </li><li> disable: 未启用。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 规则 ID。规则的唯一性标识，当调用 ModifyL7AccRules 时，该参数必填。 
     * @return RuleId 规则 ID。规则的唯一性标识，当调用 ModifyL7AccRules 时，该参数必填。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则 ID。规则的唯一性标识，当调用 ModifyL7AccRules 时，该参数必填。
     * @param RuleId 规则 ID。规则的唯一性标识，当调用 ModifyL7AccRules 时，该参数必填。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则名称。名称长度限制不超过 255 个字符。 
     * @return RuleName 规则名称。名称长度限制不超过 255 个字符。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称。名称长度限制不超过 255 个字符。
     * @param RuleName 规则名称。名称长度限制不超过 255 个字符。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 规则注释。可以填写多个注释。 
     * @return Description 规则注释。可以填写多个注释。
     */
    public String [] getDescription() {
        return this.Description;
    }

    /**
     * Set 规则注释。可以填写多个注释。
     * @param Description 规则注释。可以填写多个注释。
     */
    public void setDescription(String [] Description) {
        this.Description = Description;
    }

    /**
     * Get 子规则分支。此列表当前只支持填写一项规则，多填无效。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Branches 子规则分支。此列表当前只支持填写一项规则，多填无效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleBranch [] getBranches() {
        return this.Branches;
    }

    /**
     * Set 子规则分支。此列表当前只支持填写一项规则，多填无效。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Branches 子规则分支。此列表当前只支持填写一项规则，多填无效。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBranches(RuleBranch [] Branches) {
        this.Branches = Branches;
    }

    /**
     * Get 规则优先级。仅作为出参使用。 
     * @return RulePriority 规则优先级。仅作为出参使用。
     */
    public Long getRulePriority() {
        return this.RulePriority;
    }

    /**
     * Set 规则优先级。仅作为出参使用。
     * @param RulePriority 规则优先级。仅作为出参使用。
     */
    public void setRulePriority(Long RulePriority) {
        this.RulePriority = RulePriority;
    }

    public RuleEngineItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleEngineItem(RuleEngineItem source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Description != null) {
            this.Description = new String[source.Description.length];
            for (int i = 0; i < source.Description.length; i++) {
                this.Description[i] = new String(source.Description[i]);
            }
        }
        if (source.Branches != null) {
            this.Branches = new RuleBranch[source.Branches.length];
            for (int i = 0; i < source.Branches.length; i++) {
                this.Branches[i] = new RuleBranch(source.Branches[i]);
            }
        }
        if (source.RulePriority != null) {
            this.RulePriority = new Long(source.RulePriority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamArraySimple(map, prefix + "Description.", this.Description);
        this.setParamArrayObj(map, prefix + "Branches.", this.Branches);
        this.setParamSimple(map, prefix + "RulePriority", this.RulePriority);

    }
}

