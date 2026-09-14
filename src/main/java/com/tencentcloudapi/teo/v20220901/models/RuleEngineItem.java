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
    * <p>规则状态。取值有：<li> enable: 启用； </li><li> disable: 未启用。</li></p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>规则 ID。规则的唯一性标识，当调用 ModifyL7AccRule 时，该参数必填。</p>
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * <p>规则名称。名称长度限制不超过 255 个字符。</p>
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * <p>规则注释。可以填写多个注释。</p>
    */
    @SerializedName("Description")
    @Expose
    private String [] Description;

    /**
    * <p>规则级自定义变量列表。CustomVariable.Name 需要使用 user.rule. 作为前缀。变量按照数组顺序依次初始化，InitialValue 支持引用站点级自定义变量，以及位于当前变量之前的规则级自定义变量，不支持引用当前变量自身或位于其后的规则级自定义变量。站点级自定义变量可通过 DescribeZoneCustomVariables 接口查询。当 Branches 为空时 CustomVariable 不允许填写，填写无效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomVariables")
    @Expose
    private CustomVariable [] CustomVariables;

    /**
    * <p>规则级自定义变量运算详情。运算中支持引用站点级自定义变量和当前规则已定义的规则级自定义变量。站点级自定义变量可通过 DescribeZoneCustomVariables 接口查询。此列表当前只支持填写一项规则，多填无效。当 Branches 为空时 CustomVariableOperations 不允许填写，填写无效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomVariableOperations")
    @Expose
    private CustomVariableOperation [] CustomVariableOperations;

    /**
    * <p>子规则分支。此列表当前只支持填写一项规则，多填无效。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Branches")
    @Expose
    private RuleBranch [] Branches;

    /**
    * <p>规则优先级。仅作为出参使用。</p>
    */
    @SerializedName("RulePriority")
    @Expose
    private Long RulePriority;

    /**
     * Get <p>规则状态。取值有：<li> enable: 启用； </li><li> disable: 未启用。</li></p> 
     * @return Status <p>规则状态。取值有：<li> enable: 启用； </li><li> disable: 未启用。</li></p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>规则状态。取值有：<li> enable: 启用； </li><li> disable: 未启用。</li></p>
     * @param Status <p>规则状态。取值有：<li> enable: 启用； </li><li> disable: 未启用。</li></p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>规则 ID。规则的唯一性标识，当调用 ModifyL7AccRule 时，该参数必填。</p> 
     * @return RuleId <p>规则 ID。规则的唯一性标识，当调用 ModifyL7AccRule 时，该参数必填。</p>
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>规则 ID。规则的唯一性标识，当调用 ModifyL7AccRule 时，该参数必填。</p>
     * @param RuleId <p>规则 ID。规则的唯一性标识，当调用 ModifyL7AccRule 时，该参数必填。</p>
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>规则名称。名称长度限制不超过 255 个字符。</p> 
     * @return RuleName <p>规则名称。名称长度限制不超过 255 个字符。</p>
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set <p>规则名称。名称长度限制不超过 255 个字符。</p>
     * @param RuleName <p>规则名称。名称长度限制不超过 255 个字符。</p>
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get <p>规则注释。可以填写多个注释。</p> 
     * @return Description <p>规则注释。可以填写多个注释。</p>
     */
    public String [] getDescription() {
        return this.Description;
    }

    /**
     * Set <p>规则注释。可以填写多个注释。</p>
     * @param Description <p>规则注释。可以填写多个注释。</p>
     */
    public void setDescription(String [] Description) {
        this.Description = Description;
    }

    /**
     * Get <p>规则级自定义变量列表。CustomVariable.Name 需要使用 user.rule. 作为前缀。变量按照数组顺序依次初始化，InitialValue 支持引用站点级自定义变量，以及位于当前变量之前的规则级自定义变量，不支持引用当前变量自身或位于其后的规则级自定义变量。站点级自定义变量可通过 DescribeZoneCustomVariables 接口查询。当 Branches 为空时 CustomVariable 不允许填写，填写无效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomVariables <p>规则级自定义变量列表。CustomVariable.Name 需要使用 user.rule. 作为前缀。变量按照数组顺序依次初始化，InitialValue 支持引用站点级自定义变量，以及位于当前变量之前的规则级自定义变量，不支持引用当前变量自身或位于其后的规则级自定义变量。站点级自定义变量可通过 DescribeZoneCustomVariables 接口查询。当 Branches 为空时 CustomVariable 不允许填写，填写无效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CustomVariable [] getCustomVariables() {
        return this.CustomVariables;
    }

    /**
     * Set <p>规则级自定义变量列表。CustomVariable.Name 需要使用 user.rule. 作为前缀。变量按照数组顺序依次初始化，InitialValue 支持引用站点级自定义变量，以及位于当前变量之前的规则级自定义变量，不支持引用当前变量自身或位于其后的规则级自定义变量。站点级自定义变量可通过 DescribeZoneCustomVariables 接口查询。当 Branches 为空时 CustomVariable 不允许填写，填写无效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomVariables <p>规则级自定义变量列表。CustomVariable.Name 需要使用 user.rule. 作为前缀。变量按照数组顺序依次初始化，InitialValue 支持引用站点级自定义变量，以及位于当前变量之前的规则级自定义变量，不支持引用当前变量自身或位于其后的规则级自定义变量。站点级自定义变量可通过 DescribeZoneCustomVariables 接口查询。当 Branches 为空时 CustomVariable 不允许填写，填写无效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomVariables(CustomVariable [] CustomVariables) {
        this.CustomVariables = CustomVariables;
    }

    /**
     * Get <p>规则级自定义变量运算详情。运算中支持引用站点级自定义变量和当前规则已定义的规则级自定义变量。站点级自定义变量可通过 DescribeZoneCustomVariables 接口查询。此列表当前只支持填写一项规则，多填无效。当 Branches 为空时 CustomVariableOperations 不允许填写，填写无效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomVariableOperations <p>规则级自定义变量运算详情。运算中支持引用站点级自定义变量和当前规则已定义的规则级自定义变量。站点级自定义变量可通过 DescribeZoneCustomVariables 接口查询。此列表当前只支持填写一项规则，多填无效。当 Branches 为空时 CustomVariableOperations 不允许填写，填写无效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CustomVariableOperation [] getCustomVariableOperations() {
        return this.CustomVariableOperations;
    }

    /**
     * Set <p>规则级自定义变量运算详情。运算中支持引用站点级自定义变量和当前规则已定义的规则级自定义变量。站点级自定义变量可通过 DescribeZoneCustomVariables 接口查询。此列表当前只支持填写一项规则，多填无效。当 Branches 为空时 CustomVariableOperations 不允许填写，填写无效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomVariableOperations <p>规则级自定义变量运算详情。运算中支持引用站点级自定义变量和当前规则已定义的规则级自定义变量。站点级自定义变量可通过 DescribeZoneCustomVariables 接口查询。此列表当前只支持填写一项规则，多填无效。当 Branches 为空时 CustomVariableOperations 不允许填写，填写无效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomVariableOperations(CustomVariableOperation [] CustomVariableOperations) {
        this.CustomVariableOperations = CustomVariableOperations;
    }

    /**
     * Get <p>子规则分支。此列表当前只支持填写一项规则，多填无效。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Branches <p>子规则分支。此列表当前只支持填写一项规则，多填无效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleBranch [] getBranches() {
        return this.Branches;
    }

    /**
     * Set <p>子规则分支。此列表当前只支持填写一项规则，多填无效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Branches <p>子规则分支。此列表当前只支持填写一项规则，多填无效。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBranches(RuleBranch [] Branches) {
        this.Branches = Branches;
    }

    /**
     * Get <p>规则优先级。仅作为出参使用。</p> 
     * @return RulePriority <p>规则优先级。仅作为出参使用。</p>
     */
    public Long getRulePriority() {
        return this.RulePriority;
    }

    /**
     * Set <p>规则优先级。仅作为出参使用。</p>
     * @param RulePriority <p>规则优先级。仅作为出参使用。</p>
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
        if (source.CustomVariables != null) {
            this.CustomVariables = new CustomVariable[source.CustomVariables.length];
            for (int i = 0; i < source.CustomVariables.length; i++) {
                this.CustomVariables[i] = new CustomVariable(source.CustomVariables[i]);
            }
        }
        if (source.CustomVariableOperations != null) {
            this.CustomVariableOperations = new CustomVariableOperation[source.CustomVariableOperations.length];
            for (int i = 0; i < source.CustomVariableOperations.length; i++) {
                this.CustomVariableOperations[i] = new CustomVariableOperation(source.CustomVariableOperations[i]);
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
        this.setParamArrayObj(map, prefix + "CustomVariables.", this.CustomVariables);
        this.setParamArrayObj(map, prefix + "CustomVariableOperations.", this.CustomVariableOperations);
        this.setParamArrayObj(map, prefix + "Branches.", this.Branches);
        this.setParamSimple(map, prefix + "RulePriority", this.RulePriority);

    }
}

