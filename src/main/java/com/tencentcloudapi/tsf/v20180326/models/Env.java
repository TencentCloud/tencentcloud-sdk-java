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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Env extends AbstractModel{

    /**
    * 环境变量名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 环境变量值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * k8s ValueFrom
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValueFrom")
    @Expose
    private ValueFrom ValueFrom;

    /**
     * Get 环境变量名称 
     * @return Name 环境变量名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 环境变量名称
     * @param Name 环境变量名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 环境变量值 
     * @return Value 环境变量值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 环境变量值
     * @param Value 环境变量值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get k8s ValueFrom
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValueFrom k8s ValueFrom
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ValueFrom getValueFrom() {
        return this.ValueFrom;
    }

    /**
     * Set k8s ValueFrom
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValueFrom k8s ValueFrom
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValueFrom(ValueFrom ValueFrom) {
        this.ValueFrom = ValueFrom;
    }

    public Env() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Env(Env source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.ValueFrom != null) {
            this.ValueFrom = new ValueFrom(source.ValueFrom);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamObj(map, prefix + "ValueFrom.", this.ValueFrom);

    }
}

