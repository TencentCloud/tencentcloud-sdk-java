/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExceptUserRule extends AbstractModel{

    /**
    * 规则ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * 规则名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则的处置方式。
1. skip 跳过
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 规则生效状态。
1. on 生效
2. off 失效
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleStatus")
    @Expose
    private String RuleStatus;

    /**
    * 更新时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 匹配条件。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Conditions")
    @Expose
    private ExceptUserRuleCondition [] Conditions;

    /**
    * 规则生效的范围。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scope")
    @Expose
    private ExceptUserRuleScope Scope;

    /**
    * 优先级。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RulePriority")
    @Expose
    private Long RulePriority;

    /**
     * Get 规则ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleID 规则ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set 规则ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleID 规则ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get 规则名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleName 规则名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleName 规则名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 规则的处置方式。
1. skip 跳过
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Action 规则的处置方式。
1. skip 跳过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 规则的处置方式。
1. skip 跳过
注意：此字段可能返回 null，表示取不到有效值。
     * @param Action 规则的处置方式。
1. skip 跳过
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 规则生效状态。
1. on 生效
2. off 失效
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleStatus 规则生效状态。
1. on 生效
2. off 失效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleStatus() {
        return this.RuleStatus;
    }

    /**
     * Set 规则生效状态。
1. on 生效
2. off 失效
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleStatus 规则生效状态。
1. on 生效
2. off 失效
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleStatus(String RuleStatus) {
        this.RuleStatus = RuleStatus;
    }

    /**
     * Get 更新时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 匹配条件。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Conditions 匹配条件。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExceptUserRuleCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set 匹配条件。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Conditions 匹配条件。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditions(ExceptUserRuleCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get 规则生效的范围。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scope 规则生效的范围。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExceptUserRuleScope getScope() {
        return this.Scope;
    }

    /**
     * Set 规则生效的范围。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scope 规则生效的范围。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScope(ExceptUserRuleScope Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 优先级。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RulePriority 优先级。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRulePriority() {
        return this.RulePriority;
    }

    /**
     * Set 优先级。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RulePriority 优先级。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRulePriority(Long RulePriority) {
        this.RulePriority = RulePriority;
    }

    public ExceptUserRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExceptUserRule(ExceptUserRule source) {
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.RuleStatus != null) {
            this.RuleStatus = new String(source.RuleStatus);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Conditions != null) {
            this.Conditions = new ExceptUserRuleCondition[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new ExceptUserRuleCondition(source.Conditions[i]);
            }
        }
        if (source.Scope != null) {
            this.Scope = new ExceptUserRuleScope(source.Scope);
        }
        if (source.RulePriority != null) {
            this.RulePriority = new Long(source.RulePriority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "RuleStatus", this.RuleStatus);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamObj(map, prefix + "Scope.", this.Scope);
        this.setParamSimple(map, prefix + "RulePriority", this.RulePriority);

    }
}

