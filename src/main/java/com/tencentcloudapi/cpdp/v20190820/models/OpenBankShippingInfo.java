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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OpenBankShippingInfo extends AbstractModel{

    /**
    * 收货人名字
    */
    @SerializedName("FirstName")
    @Expose
    private String FirstName;

    /**
    * 收货人姓氏
    */
    @SerializedName("LastName")
    @Expose
    private String LastName;

    /**
    * 收货地址1
    */
    @SerializedName("AddressOne")
    @Expose
    private String AddressOne;

    /**
    * 收货地址2
    */
    @SerializedName("AddressTwo")
    @Expose
    private String AddressTwo;

    /**
    * 收货地址所在城市
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 收货地址所在州，当国家是美国或加拿大时，使用ISO-3166-2:US或ISO -3166-2:CA 中该
国家地区编码标准中的两位字母编码
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 使用ISO-3166-1标准中的两位字母编码
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 收货地址邮编
    */
    @SerializedName("ZipCode")
    @Expose
    private String ZipCode;

    /**
    * 收货联系电话
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
     * Get 收货人名字 
     * @return FirstName 收货人名字
     */
    public String getFirstName() {
        return this.FirstName;
    }

    /**
     * Set 收货人名字
     * @param FirstName 收货人名字
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Get 收货人姓氏 
     * @return LastName 收货人姓氏
     */
    public String getLastName() {
        return this.LastName;
    }

    /**
     * Set 收货人姓氏
     * @param LastName 收货人姓氏
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * Get 收货地址1 
     * @return AddressOne 收货地址1
     */
    public String getAddressOne() {
        return this.AddressOne;
    }

    /**
     * Set 收货地址1
     * @param AddressOne 收货地址1
     */
    public void setAddressOne(String AddressOne) {
        this.AddressOne = AddressOne;
    }

    /**
     * Get 收货地址2 
     * @return AddressTwo 收货地址2
     */
    public String getAddressTwo() {
        return this.AddressTwo;
    }

    /**
     * Set 收货地址2
     * @param AddressTwo 收货地址2
     */
    public void setAddressTwo(String AddressTwo) {
        this.AddressTwo = AddressTwo;
    }

    /**
     * Get 收货地址所在城市 
     * @return City 收货地址所在城市
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 收货地址所在城市
     * @param City 收货地址所在城市
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 收货地址所在州，当国家是美国或加拿大时，使用ISO-3166-2:US或ISO -3166-2:CA 中该
国家地区编码标准中的两位字母编码 
     * @return State 收货地址所在州，当国家是美国或加拿大时，使用ISO-3166-2:US或ISO -3166-2:CA 中该
国家地区编码标准中的两位字母编码
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 收货地址所在州，当国家是美国或加拿大时，使用ISO-3166-2:US或ISO -3166-2:CA 中该
国家地区编码标准中的两位字母编码
     * @param State 收货地址所在州，当国家是美国或加拿大时，使用ISO-3166-2:US或ISO -3166-2:CA 中该
国家地区编码标准中的两位字母编码
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 使用ISO-3166-1标准中的两位字母编码 
     * @return Country 使用ISO-3166-1标准中的两位字母编码
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 使用ISO-3166-1标准中的两位字母编码
     * @param Country 使用ISO-3166-1标准中的两位字母编码
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get 收货地址邮编 
     * @return ZipCode 收货地址邮编
     */
    public String getZipCode() {
        return this.ZipCode;
    }

    /**
     * Set 收货地址邮编
     * @param ZipCode 收货地址邮编
     */
    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }

    /**
     * Get 收货联系电话 
     * @return Phone 收货联系电话
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 收货联系电话
     * @param Phone 收货联系电话
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public OpenBankShippingInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenBankShippingInfo(OpenBankShippingInfo source) {
        if (source.FirstName != null) {
            this.FirstName = new String(source.FirstName);
        }
        if (source.LastName != null) {
            this.LastName = new String(source.LastName);
        }
        if (source.AddressOne != null) {
            this.AddressOne = new String(source.AddressOne);
        }
        if (source.AddressTwo != null) {
            this.AddressTwo = new String(source.AddressTwo);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
        if (source.ZipCode != null) {
            this.ZipCode = new String(source.ZipCode);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FirstName", this.FirstName);
        this.setParamSimple(map, prefix + "LastName", this.LastName);
        this.setParamSimple(map, prefix + "AddressOne", this.AddressOne);
        this.setParamSimple(map, prefix + "AddressTwo", this.AddressTwo);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Country", this.Country);
        this.setParamSimple(map, prefix + "ZipCode", this.ZipCode);
        this.setParamSimple(map, prefix + "Phone", this.Phone);

    }
}

