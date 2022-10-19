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

public class OpenBankBillingInfo extends AbstractModel{

    /**
    * 账单人名字
    */
    @SerializedName("FirstName")
    @Expose
    private String FirstName;

    /**
    * 账单人姓氏
    */
    @SerializedName("LastName")
    @Expose
    private String LastName;

    /**
    * 账单地址1
    */
    @SerializedName("AddressOne")
    @Expose
    private String AddressOne;

    /**
    * 账单地址1
    */
    @SerializedName("AddressTwo")
    @Expose
    private String AddressTwo;

    /**
    * 账单地址所在城市
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * 账单地址所在州/省，当国家是美国或加拿大时，使用ISO-3166-2:US或ISO -3166-2:CA 中该国家地区编 码标准中的两位字母编码。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 账单地址所在国家，使用ISO-3166-1标准中的两位字母编码。
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
    * 账单地址邮编
    */
    @SerializedName("ZipCode")
    @Expose
    private String ZipCode;

    /**
    * 账单人手机号
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
     * Get 账单人名字 
     * @return FirstName 账单人名字
     */
    public String getFirstName() {
        return this.FirstName;
    }

    /**
     * Set 账单人名字
     * @param FirstName 账单人名字
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Get 账单人姓氏 
     * @return LastName 账单人姓氏
     */
    public String getLastName() {
        return this.LastName;
    }

    /**
     * Set 账单人姓氏
     * @param LastName 账单人姓氏
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * Get 账单地址1 
     * @return AddressOne 账单地址1
     */
    public String getAddressOne() {
        return this.AddressOne;
    }

    /**
     * Set 账单地址1
     * @param AddressOne 账单地址1
     */
    public void setAddressOne(String AddressOne) {
        this.AddressOne = AddressOne;
    }

    /**
     * Get 账单地址1 
     * @return AddressTwo 账单地址1
     */
    public String getAddressTwo() {
        return this.AddressTwo;
    }

    /**
     * Set 账单地址1
     * @param AddressTwo 账单地址1
     */
    public void setAddressTwo(String AddressTwo) {
        this.AddressTwo = AddressTwo;
    }

    /**
     * Get 账单地址所在城市 
     * @return City 账单地址所在城市
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set 账单地址所在城市
     * @param City 账单地址所在城市
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get 账单地址所在州/省，当国家是美国或加拿大时，使用ISO-3166-2:US或ISO -3166-2:CA 中该国家地区编 码标准中的两位字母编码。 
     * @return State 账单地址所在州/省，当国家是美国或加拿大时，使用ISO-3166-2:US或ISO -3166-2:CA 中该国家地区编 码标准中的两位字母编码。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 账单地址所在州/省，当国家是美国或加拿大时，使用ISO-3166-2:US或ISO -3166-2:CA 中该国家地区编 码标准中的两位字母编码。
     * @param State 账单地址所在州/省，当国家是美国或加拿大时，使用ISO-3166-2:US或ISO -3166-2:CA 中该国家地区编 码标准中的两位字母编码。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 账单地址所在国家，使用ISO-3166-1标准中的两位字母编码。 
     * @return Country 账单地址所在国家，使用ISO-3166-1标准中的两位字母编码。
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set 账单地址所在国家，使用ISO-3166-1标准中的两位字母编码。
     * @param Country 账单地址所在国家，使用ISO-3166-1标准中的两位字母编码。
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * Get 账单地址邮编 
     * @return ZipCode 账单地址邮编
     */
    public String getZipCode() {
        return this.ZipCode;
    }

    /**
     * Set 账单地址邮编
     * @param ZipCode 账单地址邮编
     */
    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }

    /**
     * Get 账单人手机号 
     * @return Phone 账单人手机号
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 账单人手机号
     * @param Phone 账单人手机号
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public OpenBankBillingInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpenBankBillingInfo(OpenBankBillingInfo source) {
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

