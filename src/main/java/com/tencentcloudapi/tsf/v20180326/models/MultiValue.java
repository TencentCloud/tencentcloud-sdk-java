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

public class MultiValue extends AbstractModel{

    /**
    * 数据点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Values")
    @Expose
    private Float [] Values;

    /**
     * Get 数据点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Values 数据点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float [] getValues() {
        return this.Values;
    }

    /**
     * Set 数据点
注意：此字段可能返回 null，表示取不到有效值。
     * @param Values 数据点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValues(Float [] Values) {
        this.Values = Values;
    }

    public MultiValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiValue(MultiValue source) {
        if (source.Values != null) {
            this.Values = new Float[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new Float(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

