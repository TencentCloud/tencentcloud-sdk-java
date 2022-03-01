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

public class Metric extends AbstractModel{

    /**
    * 指标名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 指标计算方式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Function")
    @Expose
    private String Function;

    /**
     * Get 指标名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 指标名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 指标名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 指标名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 指标计算方式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Function 指标计算方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFunction() {
        return this.Function;
    }

    /**
     * Set 指标计算方式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Function 指标计算方式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFunction(String Function) {
        this.Function = Function;
    }

    public Metric() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Metric(Metric source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Function != null) {
            this.Function = new String(source.Function);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Function", this.Function);

    }
}

