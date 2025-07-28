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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExecRulesTask extends AbstractModel {

    /**
    * 条件判断信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rules")
    @Expose
    private Rules [] Rules;

    /**
     * Get 条件判断信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rules 条件判断信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Rules [] getRules() {
        return this.Rules;
    }

    /**
     * Set 条件判断信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rules 条件判断信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRules(Rules [] Rules) {
        this.Rules = Rules;
    }

    public ExecRulesTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecRulesTask(ExecRulesTask source) {
        if (source.Rules != null) {
            this.Rules = new Rules[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new Rules(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

