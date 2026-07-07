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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleModify extends AbstractModel {

    /**
    * 转发规则动作列表。
    */
    @SerializedName("Actions")
    @Expose
    private RuleAction [] Actions;

    /**
    * 转发规则条件列表。
    */
    @SerializedName("Conditions")
    @Expose
    private RuleCondition [] Conditions;

    /**
    * 优先级，值越小优先级越高，取值范围：1~10000。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 转发规则 ID，格式为 rule- 后接 8 位字母数字。
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 转发规则名称。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
     * Get 转发规则动作列表。 
     * @return Actions 转发规则动作列表。
     */
    public RuleAction [] getActions() {
        return this.Actions;
    }

    /**
     * Set 转发规则动作列表。
     * @param Actions 转发规则动作列表。
     */
    public void setActions(RuleAction [] Actions) {
        this.Actions = Actions;
    }

    /**
     * Get 转发规则条件列表。 
     * @return Conditions 转发规则条件列表。
     */
    public RuleCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set 转发规则条件列表。
     * @param Conditions 转发规则条件列表。
     */
    public void setConditions(RuleCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get 优先级，值越小优先级越高，取值范围：1~10000。 
     * @return Priority 优先级，值越小优先级越高，取值范围：1~10000。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 优先级，值越小优先级越高，取值范围：1~10000。
     * @param Priority 优先级，值越小优先级越高，取值范围：1~10000。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 转发规则 ID，格式为 rule- 后接 8 位字母数字。 
     * @return RuleId 转发规则 ID，格式为 rule- 后接 8 位字母数字。
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 转发规则 ID，格式为 rule- 后接 8 位字母数字。
     * @param RuleId 转发规则 ID，格式为 rule- 后接 8 位字母数字。
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 转发规则名称。 
     * @return RuleName 转发规则名称。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 转发规则名称。
     * @param RuleName 转发规则名称。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    public RuleModify() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleModify(RuleModify source) {
        if (source.Actions != null) {
            this.Actions = new RuleAction[source.Actions.length];
            for (int i = 0; i < source.Actions.length; i++) {
                this.Actions[i] = new RuleAction(source.Actions[i]);
            }
        }
        if (source.Conditions != null) {
            this.Conditions = new RuleCondition[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new RuleCondition(source.Conditions[i]);
            }
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Actions.", this.Actions);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);

    }
}

