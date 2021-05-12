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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContactInfo extends AbstractModel{

    /**
    * 注册人（中文）
    */
    @SerializedName("OrganizationNameCN")
    @Expose
    private String OrganizationNameCN;

    /**
    * 注册人（英文）
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 联系人（中文）
    */
    @SerializedName("RegistrantNameCN")
    @Expose
    private String RegistrantNameCN;

    /**
    * 联系人（英文）
    */
    @SerializedName("RegistrantName")
    @Expose
    private String RegistrantName;

    /**
    * 省份（中文）
    */
    @SerializedName("ProvinceCN")
    @Expose
    private String ProvinceCN;

    /**
    * 城市（中文）
    */
    @SerializedName("CityCN")
    @Expose
    private String CityCN;

    /**
    * 街道（中文）
    */
    @SerializedName("StreetCN")
    @Expose
    private String StreetCN;

    /**
    * 街道（英文）
    */
    @SerializedName("Street")
    @Expose
    private String Street;

    /**
    * 国家（中文）
    */
    @SerializedName("CountryCN")
    @Expose
    private String CountryCN;

    /**
    * 联系人手机号
    */
    @SerializedName("Telephone")
    @Expose
    private String Telephone;

    /**
    * 联系人邮箱
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 邮编
    */
    @SerializedName("ZipCode")
    @Expose
    private String ZipCode;

    /**
    * 用户类型 E:组织， I:个人
    */
    @SerializedName("RegistrantType")
    @Expose
    private String RegistrantType;

    /**
    * 省份（英文）。作为入参时可以不填
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * 城市（英文）。作为入参时可以不填
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 国家（英文）。作为入参时可以不填
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
     * Get 注册人（中文） 
     * @return OrganizationNameCN 注册人（中文）
     */
    public String getOrganizationNameCN() {
        return this.OrganizationNameCN;
    }

    /**
     * Set 注册人（中文）
     * @param OrganizationNameCN 注册人（中文）
     */
    public void setOrganizationNameCN(String OrganizationNameCN) {
        this.OrganizationNameCN = OrganizationNameCN;
    }

    /**
     * Get 注册人（英文） 
     * @return OrganizationName 注册人（英文）
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 注册人（英文）
     * @param OrganizationName 注册人（英文）
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 联系人（中文） 
     * @return RegistrantNameCN 联系人（中文）
     */
    public String getRegistrantNameCN() {
        return this.RegistrantNameCN;
    }

    /**
     * Set 联系人（中文）
     * @param RegistrantNameCN 联系人（中文）
     */
    public void setRegistrantNameCN(String RegistrantNameCN) {
        this.RegistrantNameCN = RegistrantNameCN;
    }

    /**
     * Get 联系人（英文） 
     * @return RegistrantName 联系人（英文）
     */
    public String getRegistrantName() {
        return this.RegistrantName;
    }

    /**
     * Set 联系人（英文）
     * @param RegistrantName 联系人（英文）
     */
    public void setRegistrantName(String RegistrantName) {
        this.RegistrantName = RegistrantName;
    }

    /**
     * Get 省份（中文） 
     * @return ProvinceCN 省份（中文）
     */
    public String getProvinceCN() {
        return this.ProvinceCN;
    }

    /**
     * Set 省份（中文）
     * @param ProvinceCN 省份（中文）
     */
    public void setProvinceCN(String ProvinceCN) {
        this.ProvinceCN = ProvinceCN;
    }

    /**
     * Get 城市（中文） 
     * @return CityCN 城市（中文）
     */
    public String getCityCN() {
        return this.CityCN;
    }

    /**
     * Set 城市（中文）
     * @param CityCN 城市（中文）
     */
    public void setCityCN(String CityCN) {
        this.CityCN = CityCN;
    }

    /**
     * Get 街道（中文） 
     * @return StreetCN 街道（中文）
     */
    public String getStreetCN() {
        return this.StreetCN;
    }

    /**
     * Set 街道（中文）
     * @param StreetCN 街道（中文）
     */
    public void setStreetCN(String StreetCN) {
        this.StreetCN = StreetCN;
    }

    /**
     * Get 街道（英文） 
     * @return Street 街道（英文）
     */
    public String getStreet() {
        return this.Street;
    }

    /**
     * Set 街道（英文）
     * @param Street 街道（英文）
     */
    public void setStreet(String Street) {
        this.Street = Street;
    }

    /**
     * Get 国家（中文） 
     * @return CountryCN 国家（中文）
     */
    public String getCountryCN() {
        return this.CountryCN;
    }

    /**
     * Set 国家（中文）
     * @param CountryCN 国家（中文）
     */
    public void setCountryCN(String CountryCN) {
        this.CountryCN = CountryCN;
    }

    /**
     * Get 联系人手机号 
     * @return Telephone 联系人手机号
     */
    public String getTelephone() {
        return this.Telephone;
    }

    /**
     * Set 联系人手机号
     * @param Telephone 联系人手机号
     */
    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    /**
     * Get 联系人邮箱 
     * @return Email 联系人邮箱
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 联系人邮箱
     * @param Email 联系人邮箱
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 邮编 
     * @return ZipCode 邮编
     */
    public String getZipCode() {
        return this.ZipCode;
    }

    /**
     * Set 邮编
     * @param ZipCode 邮编
     */
    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }

    /**
     * Get 用户类型 E:组织， I:个人 
     * @return RegistrantType 用户类型 E:组织， I:个人
     */
    public String getRegistrantType() {
        return this.RegistrantType;
    }

    /**
     * Set 用户类型 E:组织， I:个人
     * @param RegistrantType 用户类型 E:组织， I:个人
     */
    public void setRegistrantType(String RegistrantType) {
        this.RegistrantType = RegistrantType;
    }

    /**
     * Get 省份（英文）。作为入参时可以不填 
     * @return Province 省份（英文）。作为入参时可以不填
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set 省份（英文）。作为入参时可以不填
     * @param Province 省份（英文）。作为入参时可以不填
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get 城市（英文）。作为入参时可以不填 
     * @return City 城市（英文）。作为入参时可以不填
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 城市（英文）。作为入参时可以不填
     * @param City 城市（英文）。作为入参时可以不填
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 国家（英文）。作为入参时可以不填 
     * @return Country 国家（英文）。作为入参时可以不填
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 国家（英文）。作为入参时可以不填
     * @param Country 国家（英文）。作为入参时可以不填
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    public ContactInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContactInfo(ContactInfo source) {
        if (source.OrganizationNameCN != null) {
            this.OrganizationNameCN = new String(source.OrganizationNameCN);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.RegistrantNameCN != null) {
            this.RegistrantNameCN = new String(source.RegistrantNameCN);
        }
        if (source.RegistrantName != null) {
            this.RegistrantName = new String(source.RegistrantName);
        }
        if (source.ProvinceCN != null) {
            this.ProvinceCN = new String(source.ProvinceCN);
        }
        if (source.CityCN != null) {
            this.CityCN = new String(source.CityCN);
        }
        if (source.StreetCN != null) {
            this.StreetCN = new String(source.StreetCN);
        }
        if (source.Street != null) {
            this.Street = new String(source.Street);
        }
        if (source.CountryCN != null) {
            this.CountryCN = new String(source.CountryCN);
        }
        if (source.Telephone != null) {
            this.Telephone = new String(source.Telephone);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.ZipCode != null) {
            this.ZipCode = new String(source.ZipCode);
        }
        if (source.RegistrantType != null) {
            this.RegistrantType = new String(source.RegistrantType);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrganizationNameCN", this.OrganizationNameCN);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "RegistrantNameCN", this.RegistrantNameCN);
        this.setParamSimple(map, prefix + "RegistrantName", this.RegistrantName);
        this.setParamSimple(map, prefix + "ProvinceCN", this.ProvinceCN);
        this.setParamSimple(map, prefix + "CityCN", this.CityCN);
        this.setParamSimple(map, prefix + "StreetCN", this.StreetCN);
        this.setParamSimple(map, prefix + "Street", this.Street);
        this.setParamSimple(map, prefix + "CountryCN", this.CountryCN);
        this.setParamSimple(map, prefix + "Telephone", this.Telephone);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "ZipCode", this.ZipCode);
        this.setParamSimple(map, prefix + "RegistrantType", this.RegistrantType);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Country", this.Country);

    }
}

