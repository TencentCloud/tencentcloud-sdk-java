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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleCondition extends AbstractModel {

    /**
    * 七层转发规则条件类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleConditionType")
    @Expose
    private String RuleConditionType;

    /**
    * 七层转发规则条件值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleConditionValue")
    @Expose
    private String [] RuleConditionValue;

    /**
     * Get 七层转发规则条件类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleConditionType 七层转发规则条件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleConditionType() {
        return this.RuleConditionType;
    }

    /**
     * Set 七层转发规则条件类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleConditionType 七层转发规则条件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleConditionType(String RuleConditionType) {
        this.RuleConditionType = RuleConditionType;
    }

    /**
     * Get 七层转发规则条件值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleConditionValue 七层转发规则条件值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getRuleConditionValue() {
        return this.RuleConditionValue;
    }

    /**
     * Set 七层转发规则条件值
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleConditionValue 七层转发规则条件值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleConditionValue(String [] RuleConditionValue) {
        this.RuleConditionValue = RuleConditionValue;
    }

    public RuleCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleCondition(RuleCondition source) {
        if (source.RuleConditionType != null) {
            this.RuleConditionType = new String(source.RuleConditionType);
        }
        if (source.RuleConditionValue != null) {
            this.RuleConditionValue = new String[source.RuleConditionValue.length];
            for (int i = 0; i < source.RuleConditionValue.length; i++) {
                this.RuleConditionValue[i] = new String(source.RuleConditionValue[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleConditionType", this.RuleConditionType);
        this.setParamArraySimple(map, prefix + "RuleConditionValue.", this.RuleConditionValue);

    }
}

