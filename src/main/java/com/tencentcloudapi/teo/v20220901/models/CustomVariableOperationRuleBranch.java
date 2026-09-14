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

public class CustomVariableOperationRuleBranch extends AbstractModel {

    /**
    * <p><a href="https://cloud.tencent.com/document/product/1552/90438#33f65828-c6c6-4b66-a011-25a20b548d5d">匹配条件</a>。</p>
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * <p><a href="https://cloud.tencent.com/document/product/1552/90438#c7bd7e02-9247-4a72-b0e4-11c27cadb198">操作</a>。<br>注意：Actions 和 SubRules 不可同时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Actions")
    @Expose
    private CustomVariableOperationRuleAction [] Actions;

    /**
    * <p>子规则列表。此列表中若存在多条规则，按照从上往下的顺序依次执行。<br>注意：SubRules 和 Actions 不可同时为空。且当前只支持填写一层 SubRules。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubRules")
    @Expose
    private CustomVariableOperationSubRule [] SubRules;

    /**
     * Get <p><a href="https://cloud.tencent.com/document/product/1552/90438#33f65828-c6c6-4b66-a011-25a20b548d5d">匹配条件</a>。</p> 
     * @return Condition <p><a href="https://cloud.tencent.com/document/product/1552/90438#33f65828-c6c6-4b66-a011-25a20b548d5d">匹配条件</a>。</p>
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set <p><a href="https://cloud.tencent.com/document/product/1552/90438#33f65828-c6c6-4b66-a011-25a20b548d5d">匹配条件</a>。</p>
     * @param Condition <p><a href="https://cloud.tencent.com/document/product/1552/90438#33f65828-c6c6-4b66-a011-25a20b548d5d">匹配条件</a>。</p>
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get <p><a href="https://cloud.tencent.com/document/product/1552/90438#c7bd7e02-9247-4a72-b0e4-11c27cadb198">操作</a>。<br>注意：Actions 和 SubRules 不可同时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Actions <p><a href="https://cloud.tencent.com/document/product/1552/90438#c7bd7e02-9247-4a72-b0e4-11c27cadb198">操作</a>。<br>注意：Actions 和 SubRules 不可同时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CustomVariableOperationRuleAction [] getActions() {
        return this.Actions;
    }

    /**
     * Set <p><a href="https://cloud.tencent.com/document/product/1552/90438#c7bd7e02-9247-4a72-b0e4-11c27cadb198">操作</a>。<br>注意：Actions 和 SubRules 不可同时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Actions <p><a href="https://cloud.tencent.com/document/product/1552/90438#c7bd7e02-9247-4a72-b0e4-11c27cadb198">操作</a>。<br>注意：Actions 和 SubRules 不可同时为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActions(CustomVariableOperationRuleAction [] Actions) {
        this.Actions = Actions;
    }

    /**
     * Get <p>子规则列表。此列表中若存在多条规则，按照从上往下的顺序依次执行。<br>注意：SubRules 和 Actions 不可同时为空。且当前只支持填写一层 SubRules。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubRules <p>子规则列表。此列表中若存在多条规则，按照从上往下的顺序依次执行。<br>注意：SubRules 和 Actions 不可同时为空。且当前只支持填写一层 SubRules。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CustomVariableOperationSubRule [] getSubRules() {
        return this.SubRules;
    }

    /**
     * Set <p>子规则列表。此列表中若存在多条规则，按照从上往下的顺序依次执行。<br>注意：SubRules 和 Actions 不可同时为空。且当前只支持填写一层 SubRules。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubRules <p>子规则列表。此列表中若存在多条规则，按照从上往下的顺序依次执行。<br>注意：SubRules 和 Actions 不可同时为空。且当前只支持填写一层 SubRules。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubRules(CustomVariableOperationSubRule [] SubRules) {
        this.SubRules = SubRules;
    }

    public CustomVariableOperationRuleBranch() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomVariableOperationRuleBranch(CustomVariableOperationRuleBranch source) {
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.Actions != null) {
            this.Actions = new CustomVariableOperationRuleAction[source.Actions.length];
            for (int i = 0; i < source.Actions.length; i++) {
                this.Actions[i] = new CustomVariableOperationRuleAction(source.Actions[i]);
            }
        }
        if (source.SubRules != null) {
            this.SubRules = new CustomVariableOperationSubRule[source.SubRules.length];
            for (int i = 0; i < source.SubRules.length; i++) {
                this.SubRules[i] = new CustomVariableOperationSubRule(source.SubRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamArrayObj(map, prefix + "Actions.", this.Actions);
        this.setParamArrayObj(map, prefix + "SubRules.", this.SubRules);

    }
}

