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

public class Resource extends AbstractModel{

    /**
    * 运营商内具体资源信息，如"CMCC", "CUCC", "CTCC", "BGP", "INTERNAL"。
    */
    @SerializedName("Type")
    @Expose
    private String [] Type;

    /**
    * 运营商信息，如"CMCC", "CUCC", "CTCC", "BGP", "INTERNAL"。
    */
    @SerializedName("Isp")
    @Expose
    private String Isp;

    /**
    * 可用资源。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AvailabilitySet")
    @Expose
    private ResourceAvailability [] AvailabilitySet;

    /**
    * 运营商类型信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeSet")
    @Expose
    private TypeInfo [] TypeSet;

    /**
     * Get 运营商内具体资源信息，如"CMCC", "CUCC", "CTCC", "BGP", "INTERNAL"。 
     * @return Type 运营商内具体资源信息，如"CMCC", "CUCC", "CTCC", "BGP", "INTERNAL"。
     */
    public String [] getType() {
        return this.Type;
    }

    /**
     * Set 运营商内具体资源信息，如"CMCC", "CUCC", "CTCC", "BGP", "INTERNAL"。
     * @param Type 运营商内具体资源信息，如"CMCC", "CUCC", "CTCC", "BGP", "INTERNAL"。
     */
    public void setType(String [] Type) {
        this.Type = Type;
    }

    /**
     * Get 运营商信息，如"CMCC", "CUCC", "CTCC", "BGP", "INTERNAL"。 
     * @return Isp 运营商信息，如"CMCC", "CUCC", "CTCC", "BGP", "INTERNAL"。
     */
    public String getIsp() {
        return this.Isp;
    }

    /**
     * Set 运营商信息，如"CMCC", "CUCC", "CTCC", "BGP", "INTERNAL"。
     * @param Isp 运营商信息，如"CMCC", "CUCC", "CTCC", "BGP", "INTERNAL"。
     */
    public void setIsp(String Isp) {
        this.Isp = Isp;
    }

    /**
     * Get 可用资源。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AvailabilitySet 可用资源。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceAvailability [] getAvailabilitySet() {
        return this.AvailabilitySet;
    }

    /**
     * Set 可用资源。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AvailabilitySet 可用资源。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAvailabilitySet(ResourceAvailability [] AvailabilitySet) {
        this.AvailabilitySet = AvailabilitySet;
    }

    /**
     * Get 运营商类型信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeSet 运营商类型信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TypeInfo [] getTypeSet() {
        return this.TypeSet;
    }

    /**
     * Set 运营商类型信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeSet 运营商类型信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeSet(TypeInfo [] TypeSet) {
        this.TypeSet = TypeSet;
    }

    public Resource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Resource(Resource source) {
        if (source.Type != null) {
            this.Type = new String[source.Type.length];
            for (int i = 0; i < source.Type.length; i++) {
                this.Type[i] = new String(source.Type[i]);
            }
        }
        if (source.Isp != null) {
            this.Isp = new String(source.Isp);
        }
        if (source.AvailabilitySet != null) {
            this.AvailabilitySet = new ResourceAvailability[source.AvailabilitySet.length];
            for (int i = 0; i < source.AvailabilitySet.length; i++) {
                this.AvailabilitySet[i] = new ResourceAvailability(source.AvailabilitySet[i]);
            }
        }
        if (source.TypeSet != null) {
            this.TypeSet = new TypeInfo[source.TypeSet.length];
            for (int i = 0; i < source.TypeSet.length; i++) {
                this.TypeSet[i] = new TypeInfo(source.TypeSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Type.", this.Type);
        this.setParamSimple(map, prefix + "Isp", this.Isp);
        this.setParamArrayObj(map, prefix + "AvailabilitySet.", this.AvailabilitySet);
        this.setParamArrayObj(map, prefix + "TypeSet.", this.TypeSet);

    }
}

