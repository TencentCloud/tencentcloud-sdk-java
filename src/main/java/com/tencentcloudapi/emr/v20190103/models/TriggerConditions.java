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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerConditions extends AbstractModel {

    /**
    * 规则触发条件数组。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Conditions")
    @Expose
    private TriggerCondition [] Conditions;

    /**
     * Get 规则触发条件数组。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Conditions 规则触发条件数组。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TriggerCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set 规则触发条件数组。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Conditions 规则触发条件数组。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditions(TriggerCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    public TriggerConditions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerConditions(TriggerConditions source) {
        if (source.Conditions != null) {
            this.Conditions = new TriggerCondition[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new TriggerCondition(source.Conditions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);

    }
}

