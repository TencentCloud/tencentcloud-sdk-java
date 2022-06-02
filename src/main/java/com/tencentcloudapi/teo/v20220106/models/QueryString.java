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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryString extends AbstractModel{

    /**
    * on | off CacheKey是否由QueryString组成
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * includeCustom:使用部分url参数
excludeCustom:排除部分url参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 使用/排除的url参数数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private String [] Value;

    /**
     * Get on | off CacheKey是否由QueryString组成
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Switch on | off CacheKey是否由QueryString组成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set on | off CacheKey是否由QueryString组成
注意：此字段可能返回 null，表示取不到有效值。
     * @param Switch on | off CacheKey是否由QueryString组成
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get includeCustom:使用部分url参数
excludeCustom:排除部分url参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Action includeCustom:使用部分url参数
excludeCustom:排除部分url参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set includeCustom:使用部分url参数
excludeCustom:排除部分url参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Action includeCustom:使用部分url参数
excludeCustom:排除部分url参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 使用/排除的url参数数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 使用/排除的url参数数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getValue() {
        return this.Value;
    }

    /**
     * Set 使用/排除的url参数数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 使用/排除的url参数数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(String [] Value) {
        this.Value = Value;
    }

    public QueryString() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryString(QueryString source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Value != null) {
            this.Value = new String[source.Value.length];
            for (int i = 0; i < source.Value.length; i++) {
                this.Value[i] = new String(source.Value[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamArraySimple(map, prefix + "Value.", this.Value);

    }
}

