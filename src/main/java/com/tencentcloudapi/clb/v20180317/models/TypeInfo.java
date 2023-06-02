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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TypeInfo extends AbstractModel{

    /**
    * 运营商类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 规格可用性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecAvailabilitySet")
    @Expose
    private SpecAvailability [] SpecAvailabilitySet;

    /**
     * Get 运营商类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 运营商类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 运营商类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 运营商类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 规格可用性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecAvailabilitySet 规格可用性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SpecAvailability [] getSpecAvailabilitySet() {
        return this.SpecAvailabilitySet;
    }

    /**
     * Set 规格可用性
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecAvailabilitySet 规格可用性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecAvailabilitySet(SpecAvailability [] SpecAvailabilitySet) {
        this.SpecAvailabilitySet = SpecAvailabilitySet;
    }

    public TypeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TypeInfo(TypeInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SpecAvailabilitySet != null) {
            this.SpecAvailabilitySet = new SpecAvailability[source.SpecAvailabilitySet.length];
            for (int i = 0; i < source.SpecAvailabilitySet.length; i++) {
                this.SpecAvailabilitySet[i] = new SpecAvailability(source.SpecAvailabilitySet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "SpecAvailabilitySet.", this.SpecAvailabilitySet);

    }
}

