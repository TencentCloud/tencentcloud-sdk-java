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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmPolicyCondition extends AbstractModel{

    /**
    * 指标触发与或条件，0=或，1=与
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsUnionRule")
    @Expose
    private Long IsUnionRule;

    /**
    * 告警触发条件列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rules")
    @Expose
    private AlarmPolicyRule [] Rules;

    /**
     * Get 指标触发与或条件，0=或，1=与
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsUnionRule 指标触发与或条件，0=或，1=与
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsUnionRule() {
        return this.IsUnionRule;
    }

    /**
     * Set 指标触发与或条件，0=或，1=与
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsUnionRule 指标触发与或条件，0=或，1=与
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsUnionRule(Long IsUnionRule) {
        this.IsUnionRule = IsUnionRule;
    }

    /**
     * Get 告警触发条件列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rules 告警触发条件列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AlarmPolicyRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set 告警触发条件列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rules 告警触发条件列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRules(AlarmPolicyRule [] Rules) {
        this.Rules = Rules;
    }

    public AlarmPolicyCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmPolicyCondition(AlarmPolicyCondition source) {
        if (source.IsUnionRule != null) {
            this.IsUnionRule = new Long(source.IsUnionRule);
        }
        if (source.Rules != null) {
            this.Rules = new AlarmPolicyRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new AlarmPolicyRule(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsUnionRule", this.IsUnionRule);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

