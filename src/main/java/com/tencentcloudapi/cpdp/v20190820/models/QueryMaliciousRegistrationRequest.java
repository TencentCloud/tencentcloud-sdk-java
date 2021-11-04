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

public class QueryMaliciousRegistrationRequest extends AbstractModel{

    /**
    * 商户ID，调用方使用的商户号信息，与商户主体一一对应
    */
    @SerializedName("MerchantId")
    @Expose
    private String MerchantId;

    /**
    * 商户名称
    */
    @SerializedName("MerchantName")
    @Expose
    private String MerchantName;

    /**
    * 企业工商注册标准名称
    */
    @SerializedName("CompanyName")
    @Expose
    private String CompanyName;

    /**
    * 注册地址
    */
    @SerializedName("RegAddress")
    @Expose
    private String RegAddress;

    /**
    * 商户进件Unix时间，单位秒（非企业注册工商时间)
    */
    @SerializedName("RegTime")
    @Expose
    private Long RegTime;

    /**
    * 统一社会信用代码
    */
    @SerializedName("USCI")
    @Expose
    private String USCI;

    /**
    * 工商注册码，匹配优先级为Usci>RegNumber>CompanyName
    */
    @SerializedName("RegNumber")
    @Expose
    private String RegNumber;

    /**
    * 手机号码32位MD5加密结果，全大写，格式为0086-13812345678
    */
    @SerializedName("EncryptedPhoneNumber")
    @Expose
    private String EncryptedPhoneNumber;

    /**
    * 邮箱32位MD5加密结果，全大写
    */
    @SerializedName("EncryptedEmailAddress")
    @Expose
    private String EncryptedEmailAddress;

    /**
    * 身份证MD5加密结果，最后一位x大写
    */
    @SerializedName("EncryptedPersonId")
    @Expose
    private String EncryptedPersonId;

    /**
    * 填写信息设备的IP地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 进件渠道号，客户自行编码即可
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
     * Get 商户ID，调用方使用的商户号信息，与商户主体一一对应 
     * @return MerchantId 商户ID，调用方使用的商户号信息，与商户主体一一对应
     */
    public String getMerchantId() {
        return this.MerchantId;
    }

    /**
     * Set 商户ID，调用方使用的商户号信息，与商户主体一一对应
     * @param MerchantId 商户ID，调用方使用的商户号信息，与商户主体一一对应
     */
    public void setMerchantId(String MerchantId) {
        this.MerchantId = MerchantId;
    }

    /**
     * Get 商户名称 
     * @return MerchantName 商户名称
     */
    public String getMerchantName() {
        return this.MerchantName;
    }

    /**
     * Set 商户名称
     * @param MerchantName 商户名称
     */
    public void setMerchantName(String MerchantName) {
        this.MerchantName = MerchantName;
    }

    /**
     * Get 企业工商注册标准名称 
     * @return CompanyName 企业工商注册标准名称
     */
    public String getCompanyName() {
        return this.CompanyName;
    }

    /**
     * Set 企业工商注册标准名称
     * @param CompanyName 企业工商注册标准名称
     */
    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    /**
     * Get 注册地址 
     * @return RegAddress 注册地址
     */
    public String getRegAddress() {
        return this.RegAddress;
    }

    /**
     * Set 注册地址
     * @param RegAddress 注册地址
     */
    public void setRegAddress(String RegAddress) {
        this.RegAddress = RegAddress;
    }

    /**
     * Get 商户进件Unix时间，单位秒（非企业注册工商时间) 
     * @return RegTime 商户进件Unix时间，单位秒（非企业注册工商时间)
     */
    public Long getRegTime() {
        return this.RegTime;
    }

    /**
     * Set 商户进件Unix时间，单位秒（非企业注册工商时间)
     * @param RegTime 商户进件Unix时间，单位秒（非企业注册工商时间)
     */
    public void setRegTime(Long RegTime) {
        this.RegTime = RegTime;
    }

    /**
     * Get 统一社会信用代码 
     * @return USCI 统一社会信用代码
     */
    public String getUSCI() {
        return this.USCI;
    }

    /**
     * Set 统一社会信用代码
     * @param USCI 统一社会信用代码
     */
    public void setUSCI(String USCI) {
        this.USCI = USCI;
    }

    /**
     * Get 工商注册码，匹配优先级为Usci>RegNumber>CompanyName 
     * @return RegNumber 工商注册码，匹配优先级为Usci>RegNumber>CompanyName
     */
    public String getRegNumber() {
        return this.RegNumber;
    }

    /**
     * Set 工商注册码，匹配优先级为Usci>RegNumber>CompanyName
     * @param RegNumber 工商注册码，匹配优先级为Usci>RegNumber>CompanyName
     */
    public void setRegNumber(String RegNumber) {
        this.RegNumber = RegNumber;
    }

    /**
     * Get 手机号码32位MD5加密结果，全大写，格式为0086-13812345678 
     * @return EncryptedPhoneNumber 手机号码32位MD5加密结果，全大写，格式为0086-13812345678
     */
    public String getEncryptedPhoneNumber() {
        return this.EncryptedPhoneNumber;
    }

    /**
     * Set 手机号码32位MD5加密结果，全大写，格式为0086-13812345678
     * @param EncryptedPhoneNumber 手机号码32位MD5加密结果，全大写，格式为0086-13812345678
     */
    public void setEncryptedPhoneNumber(String EncryptedPhoneNumber) {
        this.EncryptedPhoneNumber = EncryptedPhoneNumber;
    }

    /**
     * Get 邮箱32位MD5加密结果，全大写 
     * @return EncryptedEmailAddress 邮箱32位MD5加密结果，全大写
     */
    public String getEncryptedEmailAddress() {
        return this.EncryptedEmailAddress;
    }

    /**
     * Set 邮箱32位MD5加密结果，全大写
     * @param EncryptedEmailAddress 邮箱32位MD5加密结果，全大写
     */
    public void setEncryptedEmailAddress(String EncryptedEmailAddress) {
        this.EncryptedEmailAddress = EncryptedEmailAddress;
    }

    /**
     * Get 身份证MD5加密结果，最后一位x大写 
     * @return EncryptedPersonId 身份证MD5加密结果，最后一位x大写
     */
    public String getEncryptedPersonId() {
        return this.EncryptedPersonId;
    }

    /**
     * Set 身份证MD5加密结果，最后一位x大写
     * @param EncryptedPersonId 身份证MD5加密结果，最后一位x大写
     */
    public void setEncryptedPersonId(String EncryptedPersonId) {
        this.EncryptedPersonId = EncryptedPersonId;
    }

    /**
     * Get 填写信息设备的IP地址 
     * @return Ip 填写信息设备的IP地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 填写信息设备的IP地址
     * @param Ip 填写信息设备的IP地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 进件渠道号，客户自行编码即可 
     * @return Channel 进件渠道号，客户自行编码即可
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set 进件渠道号，客户自行编码即可
     * @param Channel 进件渠道号，客户自行编码即可
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    public QueryMaliciousRegistrationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryMaliciousRegistrationRequest(QueryMaliciousRegistrationRequest source) {
        if (source.MerchantId != null) {
            this.MerchantId = new String(source.MerchantId);
        }
        if (source.MerchantName != null) {
            this.MerchantName = new String(source.MerchantName);
        }
        if (source.CompanyName != null) {
            this.CompanyName = new String(source.CompanyName);
        }
        if (source.RegAddress != null) {
            this.RegAddress = new String(source.RegAddress);
        }
        if (source.RegTime != null) {
            this.RegTime = new Long(source.RegTime);
        }
        if (source.USCI != null) {
            this.USCI = new String(source.USCI);
        }
        if (source.RegNumber != null) {
            this.RegNumber = new String(source.RegNumber);
        }
        if (source.EncryptedPhoneNumber != null) {
            this.EncryptedPhoneNumber = new String(source.EncryptedPhoneNumber);
        }
        if (source.EncryptedEmailAddress != null) {
            this.EncryptedEmailAddress = new String(source.EncryptedEmailAddress);
        }
        if (source.EncryptedPersonId != null) {
            this.EncryptedPersonId = new String(source.EncryptedPersonId);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MerchantId", this.MerchantId);
        this.setParamSimple(map, prefix + "MerchantName", this.MerchantName);
        this.setParamSimple(map, prefix + "CompanyName", this.CompanyName);
        this.setParamSimple(map, prefix + "RegAddress", this.RegAddress);
        this.setParamSimple(map, prefix + "RegTime", this.RegTime);
        this.setParamSimple(map, prefix + "USCI", this.USCI);
        this.setParamSimple(map, prefix + "RegNumber", this.RegNumber);
        this.setParamSimple(map, prefix + "EncryptedPhoneNumber", this.EncryptedPhoneNumber);
        this.setParamSimple(map, prefix + "EncryptedEmailAddress", this.EncryptedEmailAddress);
        this.setParamSimple(map, prefix + "EncryptedPersonId", this.EncryptedPersonId);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Channel", this.Channel);

    }
}

