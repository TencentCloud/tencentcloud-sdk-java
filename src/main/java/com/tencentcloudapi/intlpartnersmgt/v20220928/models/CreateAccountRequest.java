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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAccountRequest extends AbstractModel{

    /**
    * 新建客户的账户类型标识。本接口取值为：personal或company
    */
    @SerializedName("AccountType")
    @Expose
    private String AccountType;

    /**
    * 注册邮件地址。需要调用方保证邮件地址的有效性和正确性。
需要满足邮件的格式。如：account@qq.com
    */
    @SerializedName("Mail")
    @Expose
    private String Mail;

    /**
    * 账户密码。
长度限制：[8,20]。
需同时包含数字、字母以及特殊符号（!@#$%^&*()等非空格）
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 二次确认密码。必须和Password值相同
    */
    @SerializedName("ConfirmPassword")
    @Expose
    private String ConfirmPassword;

    /**
    * 客户手机号码。需要调用方保证手机号码的有效性和正确性。
长度限制：[1,32]。支持全球手机号。如18888888888
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
    * 客户的国家/地区代码。取值参考获取国家/地区码接口GetCountryCodes。如852
    */
    @SerializedName("CountryCode")
    @Expose
    private String CountryCode;

    /**
    * 客户的IOS2标准国家/地区代码。参考获取国家/地区码接口GetCountryCodes。需要与CountryCode值对应。如HK
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 拓展字段，默认为空
    */
    @SerializedName("Extended")
    @Expose
    private String Extended;

    /**
     * Get 新建客户的账户类型标识。本接口取值为：personal或company 
     * @return AccountType 新建客户的账户类型标识。本接口取值为：personal或company
     */
    public String getAccountType() {
        return this.AccountType;
    }

    /**
     * Set 新建客户的账户类型标识。本接口取值为：personal或company
     * @param AccountType 新建客户的账户类型标识。本接口取值为：personal或company
     */
    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }

    /**
     * Get 注册邮件地址。需要调用方保证邮件地址的有效性和正确性。
需要满足邮件的格式。如：account@qq.com 
     * @return Mail 注册邮件地址。需要调用方保证邮件地址的有效性和正确性。
需要满足邮件的格式。如：account@qq.com
     */
    public String getMail() {
        return this.Mail;
    }

    /**
     * Set 注册邮件地址。需要调用方保证邮件地址的有效性和正确性。
需要满足邮件的格式。如：account@qq.com
     * @param Mail 注册邮件地址。需要调用方保证邮件地址的有效性和正确性。
需要满足邮件的格式。如：account@qq.com
     */
    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    /**
     * Get 账户密码。
长度限制：[8,20]。
需同时包含数字、字母以及特殊符号（!@#$%^&*()等非空格） 
     * @return Password 账户密码。
长度限制：[8,20]。
需同时包含数字、字母以及特殊符号（!@#$%^&*()等非空格）
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 账户密码。
长度限制：[8,20]。
需同时包含数字、字母以及特殊符号（!@#$%^&*()等非空格）
     * @param Password 账户密码。
长度限制：[8,20]。
需同时包含数字、字母以及特殊符号（!@#$%^&*()等非空格）
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get 二次确认密码。必须和Password值相同 
     * @return ConfirmPassword 二次确认密码。必须和Password值相同
     */
    public String getConfirmPassword() {
        return this.ConfirmPassword;
    }

    /**
     * Set 二次确认密码。必须和Password值相同
     * @param ConfirmPassword 二次确认密码。必须和Password值相同
     */
    public void setConfirmPassword(String ConfirmPassword) {
        this.ConfirmPassword = ConfirmPassword;
    }

    /**
     * Get 客户手机号码。需要调用方保证手机号码的有效性和正确性。
长度限制：[1,32]。支持全球手机号。如18888888888 
     * @return PhoneNum 客户手机号码。需要调用方保证手机号码的有效性和正确性。
长度限制：[1,32]。支持全球手机号。如18888888888
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * Set 客户手机号码。需要调用方保证手机号码的有效性和正确性。
长度限制：[1,32]。支持全球手机号。如18888888888
     * @param PhoneNum 客户手机号码。需要调用方保证手机号码的有效性和正确性。
长度限制：[1,32]。支持全球手机号。如18888888888
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * Get 客户的国家/地区代码。取值参考获取国家/地区码接口GetCountryCodes。如852 
     * @return CountryCode 客户的国家/地区代码。取值参考获取国家/地区码接口GetCountryCodes。如852
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set 客户的国家/地区代码。取值参考获取国家/地区码接口GetCountryCodes。如852
     * @param CountryCode 客户的国家/地区代码。取值参考获取国家/地区码接口GetCountryCodes。如852
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Get 客户的IOS2标准国家/地区代码。参考获取国家/地区码接口GetCountryCodes。需要与CountryCode值对应。如HK 
     * @return Area 客户的IOS2标准国家/地区代码。参考获取国家/地区码接口GetCountryCodes。需要与CountryCode值对应。如HK
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 客户的IOS2标准国家/地区代码。参考获取国家/地区码接口GetCountryCodes。需要与CountryCode值对应。如HK
     * @param Area 客户的IOS2标准国家/地区代码。参考获取国家/地区码接口GetCountryCodes。需要与CountryCode值对应。如HK
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 拓展字段，默认为空 
     * @return Extended 拓展字段，默认为空
     */
    public String getExtended() {
        return this.Extended;
    }

    /**
     * Set 拓展字段，默认为空
     * @param Extended 拓展字段，默认为空
     */
    public void setExtended(String Extended) {
        this.Extended = Extended;
    }

    public CreateAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAccountRequest(CreateAccountRequest source) {
        if (source.AccountType != null) {
            this.AccountType = new String(source.AccountType);
        }
        if (source.Mail != null) {
            this.Mail = new String(source.Mail);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.ConfirmPassword != null) {
            this.ConfirmPassword = new String(source.ConfirmPassword);
        }
        if (source.PhoneNum != null) {
            this.PhoneNum = new String(source.PhoneNum);
        }
        if (source.CountryCode != null) {
            this.CountryCode = new String(source.CountryCode);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Extended != null) {
            this.Extended = new String(source.Extended);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountType", this.AccountType);
        this.setParamSimple(map, prefix + "Mail", this.Mail);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "ConfirmPassword", this.ConfirmPassword);
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Extended", this.Extended);

    }
}

