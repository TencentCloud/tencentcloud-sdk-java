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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WhoisContactAddress extends AbstractModel {

    /**
    * 城市
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 国家
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 电子邮箱
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 传真
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Fax")
    @Expose
    private String Fax;

    /**
    * 传真分机号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FaxExt")
    @Expose
    private String FaxExt;

    /**
    * 无
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Handle")
    @Expose
    private String Handle;

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 组织机构
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Organization")
    @Expose
    private String Organization;

    /**
    * 电话
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 邮编
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostalCode")
    @Expose
    private String PostalCode;

    /**
    * 省份/州
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 街道地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Street")
    @Expose
    private String Street;

    /**
     * Get 城市
注意：此字段可能返回 null，表示取不到有效值。 
     * @return City 城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 城市
注意：此字段可能返回 null，表示取不到有效值。
     * @param City 城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 国家
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Country 国家
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 国家
注意：此字段可能返回 null，表示取不到有效值。
     * @param Country 国家
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get 电子邮箱
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Email 电子邮箱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 电子邮箱
注意：此字段可能返回 null，表示取不到有效值。
     * @param Email 电子邮箱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 传真
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Fax 传真
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFax() {
        return this.Fax;
    }

    /**
     * Set 传真
注意：此字段可能返回 null，表示取不到有效值。
     * @param Fax 传真
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    /**
     * Get 传真分机号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FaxExt 传真分机号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFaxExt() {
        return this.FaxExt;
    }

    /**
     * Set 传真分机号
注意：此字段可能返回 null，表示取不到有效值。
     * @param FaxExt 传真分机号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFaxExt(String FaxExt) {
        this.FaxExt = FaxExt;
    }

    /**
     * Get 无
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Handle 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHandle() {
        return this.Handle;
    }

    /**
     * Set 无
注意：此字段可能返回 null，表示取不到有效值。
     * @param Handle 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHandle(String Handle) {
        this.Handle = Handle;
    }

    /**
     * Get 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 组织机构
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Organization 组织机构
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrganization() {
        return this.Organization;
    }

    /**
     * Set 组织机构
注意：此字段可能返回 null，表示取不到有效值。
     * @param Organization 组织机构
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrganization(String Organization) {
        this.Organization = Organization;
    }

    /**
     * Get 电话
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Phone 电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 电话
注意：此字段可能返回 null，表示取不到有效值。
     * @param Phone 电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 邮编
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostalCode 邮编
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPostalCode() {
        return this.PostalCode;
    }

    /**
     * Set 邮编
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostalCode 邮编
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    /**
     * Get 省份/州
注意：此字段可能返回 null，表示取不到有效值。 
     * @return State 省份/州
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 省份/州
注意：此字段可能返回 null，表示取不到有效值。
     * @param State 省份/州
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 街道地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Street 街道地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStreet() {
        return this.Street;
    }

    /**
     * Set 街道地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Street 街道地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStreet(String Street) {
        this.Street = Street;
    }

    public WhoisContactAddress() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WhoisContactAddress(WhoisContactAddress source) {
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Fax != null) {
            this.Fax = new String(source.Fax);
        }
        if (source.FaxExt != null) {
            this.FaxExt = new String(source.FaxExt);
        }
        if (source.Handle != null) {
            this.Handle = new String(source.Handle);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Organization != null) {
            this.Organization = new String(source.Organization);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.PostalCode != null) {
            this.PostalCode = new String(source.PostalCode);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Street != null) {
            this.Street = new String(source.Street);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Fax", this.Fax);
        this.setParamSimple(map, prefix + "FaxExt", this.FaxExt);
        this.setParamSimple(map, prefix + "Handle", this.Handle);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Organization", this.Organization);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "PostalCode", this.PostalCode);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Street", this.Street);

    }
}

