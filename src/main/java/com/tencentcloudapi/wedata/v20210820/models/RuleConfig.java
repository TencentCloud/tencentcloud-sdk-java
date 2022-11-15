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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleConfig extends AbstractModel{

    /**
    * 规则ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则检测范围类型 1.全表  2.条件扫描
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConditionType")
    @Expose
    private Long ConditionType;

    /**
    * 检测范围表达式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * 目标检测范围表达式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetCondition")
    @Expose
    private String TargetCondition;

    /**
     * Get 规则ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId 规则ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则检测范围类型 1.全表  2.条件扫描
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConditionType 规则检测范围类型 1.全表  2.条件扫描
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getConditionType() {
        return this.ConditionType;
    }

    /**
     * Set 规则检测范围类型 1.全表  2.条件扫描
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConditionType 规则检测范围类型 1.全表  2.条件扫描
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditionType(Long ConditionType) {
        this.ConditionType = ConditionType;
    }

    /**
     * Get 检测范围表达式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Condition 检测范围表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set 检测范围表达式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Condition 检测范围表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 目标检测范围表达式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetCondition 目标检测范围表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetCondition() {
        return this.TargetCondition;
    }

    /**
     * Set 目标检测范围表达式
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetCondition 目标检测范围表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetCondition(String TargetCondition) {
        this.TargetCondition = TargetCondition;
    }

    public RuleConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleConfig(RuleConfig source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.ConditionType != null) {
            this.ConditionType = new Long(source.ConditionType);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.TargetCondition != null) {
            this.TargetCondition = new String(source.TargetCondition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "ConditionType", this.ConditionType);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "TargetCondition", this.TargetCondition);

    }
}

