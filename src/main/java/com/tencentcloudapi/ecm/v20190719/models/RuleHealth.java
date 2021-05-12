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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleHealth extends AbstractModel{

    /**
    * 本规则上绑定的后端的健康检查状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Targets")
    @Expose
    private TargetHealth [] Targets;

    /**
     * Get 本规则上绑定的后端的健康检查状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Targets 本规则上绑定的后端的健康检查状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TargetHealth [] getTargets() {
        return this.Targets;
    }

    /**
     * Set 本规则上绑定的后端的健康检查状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Targets 本规则上绑定的后端的健康检查状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargets(TargetHealth [] Targets) {
        this.Targets = Targets;
    }

    public RuleHealth() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleHealth(RuleHealth source) {
        if (source.Targets != null) {
            this.Targets = new TargetHealth[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new TargetHealth(source.Targets[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);

    }
}

