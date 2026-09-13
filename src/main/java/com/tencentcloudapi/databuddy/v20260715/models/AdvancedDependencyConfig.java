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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdvancedDependencyConfig extends AbstractModel {

    /**
    * 逻辑运算符号OR / AND
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 任务运行条件规则列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Conditions")
    @Expose
    private TaskRunConditionRule [] Conditions;

    /**
     * Get 逻辑运算符号OR / AND
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operator 逻辑运算符号OR / AND
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 逻辑运算符号OR / AND
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operator 逻辑运算符号OR / AND
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 任务运行条件规则列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Conditions 任务运行条件规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskRunConditionRule [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set 任务运行条件规则列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Conditions 任务运行条件规则列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditions(TaskRunConditionRule [] Conditions) {
        this.Conditions = Conditions;
    }

    public AdvancedDependencyConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedDependencyConfig(AdvancedDependencyConfig source) {
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Conditions != null) {
            this.Conditions = new TaskRunConditionRule[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new TaskRunConditionRule(source.Conditions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);

    }
}

