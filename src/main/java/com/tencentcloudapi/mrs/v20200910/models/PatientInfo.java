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

public class PatientInfo extends AbstractModel{

    /**
    * 患者姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 患者性别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * 患者年龄
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Age")
    @Expose
    private String Age;

    /**
    * 患者手机号码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 患者地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 患者身份证
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
     * Get 患者姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 患者姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 患者姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 患者姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 患者性别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sex 患者性别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set 患者性别
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sex 患者性别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get 患者年龄
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Age 患者年龄
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAge() {
        return this.Age;
    }

    /**
     * Set 患者年龄
注意：此字段可能返回 null，表示取不到有效值。
     * @param Age 患者年龄
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAge(String Age) {
        this.Age = Age;
    }

    /**
     * Get 患者手机号码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Phone 患者手机号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 患者手机号码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Phone 患者手机号码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 患者地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Address 患者地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 患者地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Address 患者地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 患者身份证
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdCard 患者身份证
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * Set 患者身份证
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdCard 患者身份证
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    public PatientInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PatientInfo(PatientInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.Age != null) {
            this.Age = new String(source.Age);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.IdCard != null) {
            this.IdCard = new String(source.IdCard);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "IdCard", this.IdCard);

    }
}

