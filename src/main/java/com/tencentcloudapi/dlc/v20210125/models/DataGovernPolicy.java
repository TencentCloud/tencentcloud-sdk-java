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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataGovernPolicy extends AbstractModel{

    /**
    * 治理规则类型，Customize: 自定义；Intelligence: 智能治理
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 治理引擎
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GovernEngine")
    @Expose
    private String GovernEngine;

    /**
     * Get 治理规则类型，Customize: 自定义；Intelligence: 智能治理
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleType 治理规则类型，Customize: 自定义；Intelligence: 智能治理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 治理规则类型，Customize: 自定义；Intelligence: 智能治理
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleType 治理规则类型，Customize: 自定义；Intelligence: 智能治理
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 治理引擎
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GovernEngine 治理引擎
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGovernEngine() {
        return this.GovernEngine;
    }

    /**
     * Set 治理引擎
注意：此字段可能返回 null，表示取不到有效值。
     * @param GovernEngine 治理引擎
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGovernEngine(String GovernEngine) {
        this.GovernEngine = GovernEngine;
    }

    public DataGovernPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataGovernPolicy(DataGovernPolicy source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.GovernEngine != null) {
            this.GovernEngine = new String(source.GovernEngine);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "GovernEngine", this.GovernEngine);

    }
}

