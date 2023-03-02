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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParentInfo extends AbstractModel{

    /**
    * 名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 年龄
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Age")
    @Expose
    private String Age;

    /**
    * 证件号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * 民族
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ethnicity")
    @Expose
    private String Ethnicity;

    /**
    * 国籍
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * 地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
     * Get 名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 年龄
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Age 年龄
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAge() {
        return this.Age;
    }

    /**
     * Set 年龄
注意：此字段可能返回 null，表示取不到有效值。
     * @param Age 年龄
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAge(String Age) {
        this.Age = Age;
    }

    /**
     * Get 证件号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdCard 证件号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set 证件号
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdCard 证件号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * Get 民族
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ethnicity 民族
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEthnicity() {
        return this.Ethnicity;
    }

    /**
     * Set 民族
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ethnicity 民族
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEthnicity(String Ethnicity) {
        this.Ethnicity = Ethnicity;
    }

    /**
     * Get 国籍
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nationality 国籍
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set 国籍
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nationality 国籍
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get 地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Address 地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Address 地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    public ParentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParentInfo(ParentInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Age != null) {
            this.Age = new String(source.Age);
        }
        if (source.IdCard != null) {
            this.IdCard = new String(source.IdCard);
        }
        if (source.Ethnicity != null) {
            this.Ethnicity = new String(source.Ethnicity);
        }
        if (source.Nationality != null) {
            this.Nationality = new String(source.Nationality);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "IdCard", this.IdCard);
        this.setParamSimple(map, prefix + "Ethnicity", this.Ethnicity);
        this.setParamSimple(map, prefix + "Nationality", this.Nationality);
        this.setParamSimple(map, prefix + "Address", this.Address);

    }
}

