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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUserAndSealRequest extends AbstractModel{

    /**
    * 调用方信息
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 第三方平台唯一标识，要求应用内OpenId唯一
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 用户姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 用户证件类型：
1. ID_CARD - 居民身份证
5. HOUSEHOLD_REGISTER - 户口本
6. TEMP_ID_CARD - 临时居民身份证
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * 用户证件号
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * 请求生成个人印章的客户端IP
    */
    @SerializedName("SourceIp")
    @Expose
    private String SourceIp;

    /**
    * 用户手机号码，不要求唯一
    */
    @SerializedName("Mobile")
    @Expose
    private String Mobile;

    /**
    * 用户邮箱，不要求唯一
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 默认印章名称
    */
    @SerializedName("SealName")
    @Expose
    private String SealName;

    /**
    * 是否以OpenId作为UserId (为true时将直接以OpenId生成腾讯电子签平台的UserId)
    */
    @SerializedName("UseOpenId")
    @Expose
    private Boolean UseOpenId;

    /**
     * Get 调用方信息 
     * @return Caller 调用方信息
     */
    public Caller getCaller() {
        return this.Caller;
    }

    /**
     * Set 调用方信息
     * @param Caller 调用方信息
     */
    public void setCaller(Caller Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 第三方平台唯一标识，要求应用内OpenId唯一 
     * @return OpenId 第三方平台唯一标识，要求应用内OpenId唯一
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 第三方平台唯一标识，要求应用内OpenId唯一
     * @param OpenId 第三方平台唯一标识，要求应用内OpenId唯一
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 用户姓名 
     * @return Name 用户姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 用户姓名
     * @param Name 用户姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 用户证件类型：
1. ID_CARD - 居民身份证
5. HOUSEHOLD_REGISTER - 户口本
6. TEMP_ID_CARD - 临时居民身份证 
     * @return IdCardType 用户证件类型：
1. ID_CARD - 居民身份证
5. HOUSEHOLD_REGISTER - 户口本
6. TEMP_ID_CARD - 临时居民身份证
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set 用户证件类型：
1. ID_CARD - 居民身份证
5. HOUSEHOLD_REGISTER - 户口本
6. TEMP_ID_CARD - 临时居民身份证
     * @param IdCardType 用户证件类型：
1. ID_CARD - 居民身份证
5. HOUSEHOLD_REGISTER - 户口本
6. TEMP_ID_CARD - 临时居民身份证
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get 用户证件号 
     * @return IdCardNumber 用户证件号
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 用户证件号
     * @param IdCardNumber 用户证件号
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get 请求生成个人印章的客户端IP 
     * @return SourceIp 请求生成个人印章的客户端IP
     */
    public String getSourceIp() {
        return this.SourceIp;
    }

    /**
     * Set 请求生成个人印章的客户端IP
     * @param SourceIp 请求生成个人印章的客户端IP
     */
    public void setSourceIp(String SourceIp) {
        this.SourceIp = SourceIp;
    }

    /**
     * Get 用户手机号码，不要求唯一 
     * @return Mobile 用户手机号码，不要求唯一
     */
    public String getMobile() {
        return this.Mobile;
    }

    /**
     * Set 用户手机号码，不要求唯一
     * @param Mobile 用户手机号码，不要求唯一
     */
    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    /**
     * Get 用户邮箱，不要求唯一 
     * @return Email 用户邮箱，不要求唯一
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 用户邮箱，不要求唯一
     * @param Email 用户邮箱，不要求唯一
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 默认印章名称 
     * @return SealName 默认印章名称
     */
    public String getSealName() {
        return this.SealName;
    }

    /**
     * Set 默认印章名称
     * @param SealName 默认印章名称
     */
    public void setSealName(String SealName) {
        this.SealName = SealName;
    }

    /**
     * Get 是否以OpenId作为UserId (为true时将直接以OpenId生成腾讯电子签平台的UserId) 
     * @return UseOpenId 是否以OpenId作为UserId (为true时将直接以OpenId生成腾讯电子签平台的UserId)
     */
    public Boolean getUseOpenId() {
        return this.UseOpenId;
    }

    /**
     * Set 是否以OpenId作为UserId (为true时将直接以OpenId生成腾讯电子签平台的UserId)
     * @param UseOpenId 是否以OpenId作为UserId (为true时将直接以OpenId生成腾讯电子签平台的UserId)
     */
    public void setUseOpenId(Boolean UseOpenId) {
        this.UseOpenId = UseOpenId;
    }

    public CreateUserAndSealRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserAndSealRequest(CreateUserAndSealRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.IdCardType != null) {
            this.IdCardType = new String(source.IdCardType);
        }
        if (source.IdCardNumber != null) {
            this.IdCardNumber = new String(source.IdCardNumber);
        }
        if (source.SourceIp != null) {
            this.SourceIp = new String(source.SourceIp);
        }
        if (source.Mobile != null) {
            this.Mobile = new String(source.Mobile);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.SealName != null) {
            this.SealName = new String(source.SealName);
        }
        if (source.UseOpenId != null) {
            this.UseOpenId = new Boolean(source.UseOpenId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "SourceIp", this.SourceIp);
        this.setParamSimple(map, prefix + "Mobile", this.Mobile);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "SealName", this.SealName);
        this.setParamSimple(map, prefix + "UseOpenId", this.UseOpenId);

    }
}

