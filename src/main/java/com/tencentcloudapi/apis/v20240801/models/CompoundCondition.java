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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CompoundCondition extends AbstractModel {

    /**
    * <p>是否启用</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>匹配信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rules")
    @Expose
    private SimpleCondition [] Rules;

    /**
     * Get <p>是否启用</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Enable <p>是否启用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>是否启用</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Enable <p>是否启用</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>匹配信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rules <p>匹配信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SimpleCondition [] getRules() {
        return this.Rules;
    }

    /**
     * Set <p>匹配信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rules <p>匹配信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRules(SimpleCondition [] Rules) {
        this.Rules = Rules;
    }

    public CompoundCondition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CompoundCondition(CompoundCondition source) {
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.Rules != null) {
            this.Rules = new SimpleCondition[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new SimpleCondition(source.Rules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

