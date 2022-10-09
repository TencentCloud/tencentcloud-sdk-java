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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExceptUserRule extends AbstractModel{

    /**
    * 规则名称，不可使用中文。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则的处置方式，当前仅支持skip：跳过全部托管规则。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 规则生效状态，取值有：
<li>on：生效；</li>
<li>off：失效。</li>
    */
    @SerializedName("RuleStatus")
    @Expose
    private String RuleStatus;

    /**
    * 规则ID。仅出参使用。默认由底层生成。
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * 更新时间，如果为null，默认由底层按当前时间生成。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 匹配条件。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExceptUserRuleConditions")
    @Expose
    private ExceptUserRuleCondition [] ExceptUserRuleConditions;

    /**
    * 规则生效的范围。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExceptUserRuleScope")
    @Expose
    private ExceptUserRuleScope ExceptUserRuleScope;

    /**
    * 优先级，取值范围0-100。如果为null，默认由底层设置为0。
    */
    @SerializedName("RulePriority")
    @Expose
    private Long RulePriority;

    /**
     * Get 规则名称，不可使用中文。 
     * @return RuleName 规则名称，不可使用中文。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称，不可使用中文。
     * @param RuleName 规则名称，不可使用中文。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 规则的处置方式，当前仅支持skip：跳过全部托管规则。 
     * @return Action 规则的处置方式，当前仅支持skip：跳过全部托管规则。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 规则的处置方式，当前仅支持skip：跳过全部托管规则。
     * @param Action 规则的处置方式，当前仅支持skip：跳过全部托管规则。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 规则生效状态，取值有：
<li>on：生效；</li>
<li>off：失效。</li> 
     * @return RuleStatus 规则生效状态，取值有：
<li>on：生效；</li>
<li>off：失效。</li>
     */
    public String getRuleStatus() {
        return this.RuleStatus;
    }

    /**
     * Set 规则生效状态，取值有：
<li>on：生效；</li>
<li>off：失效。</li>
     * @param RuleStatus 规则生效状态，取值有：
<li>on：生效；</li>
<li>off：失效。</li>
     */
    public void setRuleStatus(String RuleStatus) {
        this.RuleStatus = RuleStatus;
    }

    /**
     * Get 规则ID。仅出参使用。默认由底层生成。 
     * @return RuleID 规则ID。仅出参使用。默认由底层生成。
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set 规则ID。仅出参使用。默认由底层生成。
     * @param RuleID 规则ID。仅出参使用。默认由底层生成。
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get 更新时间，如果为null，默认由底层按当前时间生成。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间，如果为null，默认由底层按当前时间生成。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间，如果为null，默认由底层按当前时间生成。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间，如果为null，默认由底层按当前时间生成。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 匹配条件。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExceptUserRuleConditions 匹配条件。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExceptUserRuleCondition [] getExceptUserRuleConditions() {
        return this.ExceptUserRuleConditions;
    }

    /**
     * Set 匹配条件。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExceptUserRuleConditions 匹配条件。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExceptUserRuleConditions(ExceptUserRuleCondition [] ExceptUserRuleConditions) {
        this.ExceptUserRuleConditions = ExceptUserRuleConditions;
    }

    /**
     * Get 规则生效的范围。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExceptUserRuleScope 规则生效的范围。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ExceptUserRuleScope getExceptUserRuleScope() {
        return this.ExceptUserRuleScope;
    }

    /**
     * Set 规则生效的范围。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExceptUserRuleScope 规则生效的范围。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExceptUserRuleScope(ExceptUserRuleScope ExceptUserRuleScope) {
        this.ExceptUserRuleScope = ExceptUserRuleScope;
    }

    /**
     * Get 优先级，取值范围0-100。如果为null，默认由底层设置为0。 
     * @return RulePriority 优先级，取值范围0-100。如果为null，默认由底层设置为0。
     */
    public Long getRulePriority() {
        return this.RulePriority;
    }

    /**
     * Set 优先级，取值范围0-100。如果为null，默认由底层设置为0。
     * @param RulePriority 优先级，取值范围0-100。如果为null，默认由底层设置为0。
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
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.RuleStatus != null) {
            this.RuleStatus = new String(source.RuleStatus);
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ExceptUserRuleConditions != null) {
            this.ExceptUserRuleConditions = new ExceptUserRuleCondition[source.ExceptUserRuleConditions.length];
            for (int i = 0; i < source.ExceptUserRuleConditions.length; i++) {
                this.ExceptUserRuleConditions[i] = new ExceptUserRuleCondition(source.ExceptUserRuleConditions[i]);
            }
        }
        if (source.ExceptUserRuleScope != null) {
            this.ExceptUserRuleScope = new ExceptUserRuleScope(source.ExceptUserRuleScope);
        }
        if (source.RulePriority != null) {
            this.RulePriority = new Long(source.RulePriority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "RuleStatus", this.RuleStatus);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamArrayObj(map, prefix + "ExceptUserRuleConditions.", this.ExceptUserRuleConditions);
        this.setParamObj(map, prefix + "ExceptUserRuleScope.", this.ExceptUserRuleScope);
        this.setParamSimple(map, prefix + "RulePriority", this.RulePriority);

    }
}

