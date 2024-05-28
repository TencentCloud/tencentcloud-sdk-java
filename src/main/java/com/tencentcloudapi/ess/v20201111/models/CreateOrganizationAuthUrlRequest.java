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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOrganizationAuthUrlRequest extends AbstractModel {

    /**
    * 操作人信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 指定授权方式 支持多选:
1-上传授权书方式
2- 法人授权方式
3- 法人身份认证方式
    */
    @SerializedName("AuthorizationTypes")
    @Expose
    private Long [] AuthorizationTypes;

    /**
    * 企业名称
EndPointType=“H5”或者"SHORT_H5"时，该参数必填

    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 企业统一社会信用代码
    */
    @SerializedName("UniformSocialCreditCode")
    @Expose
    private String UniformSocialCreditCode;

    /**
    * 法人姓名
    */
    @SerializedName("LegalName")
    @Expose
    private String LegalName;

    /**
    * 认证完成跳转链接
    */
    @SerializedName("AutoJumpUrl")
    @Expose
    private String AutoJumpUrl;

    /**
    * 营业执照企业地址
示例：xx省xx市xx县/区xx街道
    */
    @SerializedName("OrganizationAddress")
    @Expose
    private String OrganizationAddress;

    /**
    * 认证人姓名
    */
    @SerializedName("AdminName")
    @Expose
    private String AdminName;

    /**
    * 认证人手机号
    */
    @SerializedName("AdminMobile")
    @Expose
    private String AdminMobile;

    /**
    * 认证人身份证号
    */
    @SerializedName("AdminIdCardNumber")
    @Expose
    private String AdminIdCardNumber;

    /**
    * 认证人证件类型
支持以下类型
<ul><li>ID_CARD : 中国大陆居民身份证  (默认值)</li>
<li>HONGKONG_AND_MACAO : 港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN : 港澳台居民居住证(格式同居民身份证)</li></ul>

    */
    @SerializedName("AdminIdCardType")
    @Expose
    private String AdminIdCardType;

    /**
    * 营业执照的社会信用代码保持一致
false 关闭-默认
true 开启
    */
    @SerializedName("UniformSocialCreditCodeSame")
    @Expose
    private Boolean UniformSocialCreditCodeSame;

    /**
    * 法人姓名保持一致
false 关闭-默认
true 开启
    */
    @SerializedName("LegalNameSame")
    @Expose
    private Boolean LegalNameSame;

    /**
    * 认证人姓名一致
false 关闭-默认
true 开启
注意：
开启后在认证过程前会校验拦截
    */
    @SerializedName("AdminNameSame")
    @Expose
    private Boolean AdminNameSame;

    /**
    * 认证人居民身份证件号一致
false 关闭-默认
true 开启
注意：
开启后在认证过程前会校验拦截
    */
    @SerializedName("AdminIdCardNumberSame")
    @Expose
    private Boolean AdminIdCardNumberSame;

    /**
    * 认证人手机号一致
false 关闭-默认
true 开启
注意：
开启后在认证过程前会校验拦截
    */
    @SerializedName("AdminMobileSame")
    @Expose
    private Boolean AdminMobileSame;

    /**
    * 企业名称保持一致
false 关闭-默认
true 开启
    */
    @SerializedName("OrganizationNameSame")
    @Expose
    private Boolean OrganizationNameSame;

    /**
    * 营业执照正面照(PNG或JPG) base64格式, 大小不超过5M
    */
    @SerializedName("BusinessLicense")
    @Expose
    private String BusinessLicense;

    /**
    * 跳转链接类型：
"PC"-PC端认证链接 
"APP"-全屏或半屏跳转小程序链接
“H5”-H5页面认证链接 "SHORT_H5"- H5认证短链
"SHORT_URL"- 跳转小程序短链	
    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
     * Get 操作人信息 
     * @return Operator 操作人信息
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人信息
     * @param Operator 操作人信息
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 指定授权方式 支持多选:
1-上传授权书方式
2- 法人授权方式
3- 法人身份认证方式 
     * @return AuthorizationTypes 指定授权方式 支持多选:
1-上传授权书方式
2- 法人授权方式
3- 法人身份认证方式
     */
    public Long [] getAuthorizationTypes() {
        return this.AuthorizationTypes;
    }

    /**
     * Set 指定授权方式 支持多选:
1-上传授权书方式
2- 法人授权方式
3- 法人身份认证方式
     * @param AuthorizationTypes 指定授权方式 支持多选:
1-上传授权书方式
2- 法人授权方式
3- 法人身份认证方式
     */
    public void setAuthorizationTypes(Long [] AuthorizationTypes) {
        this.AuthorizationTypes = AuthorizationTypes;
    }

    /**
     * Get 企业名称
EndPointType=“H5”或者"SHORT_H5"时，该参数必填
 
     * @return OrganizationName 企业名称
EndPointType=“H5”或者"SHORT_H5"时，该参数必填

     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 企业名称
EndPointType=“H5”或者"SHORT_H5"时，该参数必填

     * @param OrganizationName 企业名称
EndPointType=“H5”或者"SHORT_H5"时，该参数必填

     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 企业统一社会信用代码 
     * @return UniformSocialCreditCode 企业统一社会信用代码
     */
    public String getUniformSocialCreditCode() {
        return this.UniformSocialCreditCode;
    }

    /**
     * Set 企业统一社会信用代码
     * @param UniformSocialCreditCode 企业统一社会信用代码
     */
    public void setUniformSocialCreditCode(String UniformSocialCreditCode) {
        this.UniformSocialCreditCode = UniformSocialCreditCode;
    }

    /**
     * Get 法人姓名 
     * @return LegalName 法人姓名
     */
    public String getLegalName() {
        return this.LegalName;
    }

    /**
     * Set 法人姓名
     * @param LegalName 法人姓名
     */
    public void setLegalName(String LegalName) {
        this.LegalName = LegalName;
    }

    /**
     * Get 认证完成跳转链接 
     * @return AutoJumpUrl 认证完成跳转链接
     */
    public String getAutoJumpUrl() {
        return this.AutoJumpUrl;
    }

    /**
     * Set 认证完成跳转链接
     * @param AutoJumpUrl 认证完成跳转链接
     */
    public void setAutoJumpUrl(String AutoJumpUrl) {
        this.AutoJumpUrl = AutoJumpUrl;
    }

    /**
     * Get 营业执照企业地址
示例：xx省xx市xx县/区xx街道 
     * @return OrganizationAddress 营业执照企业地址
示例：xx省xx市xx县/区xx街道
     */
    public String getOrganizationAddress() {
        return this.OrganizationAddress;
    }

    /**
     * Set 营业执照企业地址
示例：xx省xx市xx县/区xx街道
     * @param OrganizationAddress 营业执照企业地址
示例：xx省xx市xx县/区xx街道
     */
    public void setOrganizationAddress(String OrganizationAddress) {
        this.OrganizationAddress = OrganizationAddress;
    }

    /**
     * Get 认证人姓名 
     * @return AdminName 认证人姓名
     */
    public String getAdminName() {
        return this.AdminName;
    }

    /**
     * Set 认证人姓名
     * @param AdminName 认证人姓名
     */
    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    /**
     * Get 认证人手机号 
     * @return AdminMobile 认证人手机号
     */
    public String getAdminMobile() {
        return this.AdminMobile;
    }

    /**
     * Set 认证人手机号
     * @param AdminMobile 认证人手机号
     */
    public void setAdminMobile(String AdminMobile) {
        this.AdminMobile = AdminMobile;
    }

    /**
     * Get 认证人身份证号 
     * @return AdminIdCardNumber 认证人身份证号
     */
    public String getAdminIdCardNumber() {
        return this.AdminIdCardNumber;
    }

    /**
     * Set 认证人身份证号
     * @param AdminIdCardNumber 认证人身份证号
     */
    public void setAdminIdCardNumber(String AdminIdCardNumber) {
        this.AdminIdCardNumber = AdminIdCardNumber;
    }

    /**
     * Get 认证人证件类型
支持以下类型
<ul><li>ID_CARD : 中国大陆居民身份证  (默认值)</li>
<li>HONGKONG_AND_MACAO : 港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN : 港澳台居民居住证(格式同居民身份证)</li></ul>
 
     * @return AdminIdCardType 认证人证件类型
支持以下类型
<ul><li>ID_CARD : 中国大陆居民身份证  (默认值)</li>
<li>HONGKONG_AND_MACAO : 港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN : 港澳台居民居住证(格式同居民身份证)</li></ul>

     */
    public String getAdminIdCardType() {
        return this.AdminIdCardType;
    }

    /**
     * Set 认证人证件类型
支持以下类型
<ul><li>ID_CARD : 中国大陆居民身份证  (默认值)</li>
<li>HONGKONG_AND_MACAO : 港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN : 港澳台居民居住证(格式同居民身份证)</li></ul>

     * @param AdminIdCardType 认证人证件类型
支持以下类型
<ul><li>ID_CARD : 中国大陆居民身份证  (默认值)</li>
<li>HONGKONG_AND_MACAO : 港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN : 港澳台居民居住证(格式同居民身份证)</li></ul>

     */
    public void setAdminIdCardType(String AdminIdCardType) {
        this.AdminIdCardType = AdminIdCardType;
    }

    /**
     * Get 营业执照的社会信用代码保持一致
false 关闭-默认
true 开启 
     * @return UniformSocialCreditCodeSame 营业执照的社会信用代码保持一致
false 关闭-默认
true 开启
     */
    public Boolean getUniformSocialCreditCodeSame() {
        return this.UniformSocialCreditCodeSame;
    }

    /**
     * Set 营业执照的社会信用代码保持一致
false 关闭-默认
true 开启
     * @param UniformSocialCreditCodeSame 营业执照的社会信用代码保持一致
false 关闭-默认
true 开启
     */
    public void setUniformSocialCreditCodeSame(Boolean UniformSocialCreditCodeSame) {
        this.UniformSocialCreditCodeSame = UniformSocialCreditCodeSame;
    }

    /**
     * Get 法人姓名保持一致
false 关闭-默认
true 开启 
     * @return LegalNameSame 法人姓名保持一致
false 关闭-默认
true 开启
     */
    public Boolean getLegalNameSame() {
        return this.LegalNameSame;
    }

    /**
     * Set 法人姓名保持一致
false 关闭-默认
true 开启
     * @param LegalNameSame 法人姓名保持一致
false 关闭-默认
true 开启
     */
    public void setLegalNameSame(Boolean LegalNameSame) {
        this.LegalNameSame = LegalNameSame;
    }

    /**
     * Get 认证人姓名一致
false 关闭-默认
true 开启
注意：
开启后在认证过程前会校验拦截 
     * @return AdminNameSame 认证人姓名一致
false 关闭-默认
true 开启
注意：
开启后在认证过程前会校验拦截
     */
    public Boolean getAdminNameSame() {
        return this.AdminNameSame;
    }

    /**
     * Set 认证人姓名一致
false 关闭-默认
true 开启
注意：
开启后在认证过程前会校验拦截
     * @param AdminNameSame 认证人姓名一致
false 关闭-默认
true 开启
注意：
开启后在认证过程前会校验拦截
     */
    public void setAdminNameSame(Boolean AdminNameSame) {
        this.AdminNameSame = AdminNameSame;
    }

    /**
     * Get 认证人居民身份证件号一致
false 关闭-默认
true 开启
注意：
开启后在认证过程前会校验拦截 
     * @return AdminIdCardNumberSame 认证人居民身份证件号一致
false 关闭-默认
true 开启
注意：
开启后在认证过程前会校验拦截
     */
    public Boolean getAdminIdCardNumberSame() {
        return this.AdminIdCardNumberSame;
    }

    /**
     * Set 认证人居民身份证件号一致
false 关闭-默认
true 开启
注意：
开启后在认证过程前会校验拦截
     * @param AdminIdCardNumberSame 认证人居民身份证件号一致
false 关闭-默认
true 开启
注意：
开启后在认证过程前会校验拦截
     */
    public void setAdminIdCardNumberSame(Boolean AdminIdCardNumberSame) {
        this.AdminIdCardNumberSame = AdminIdCardNumberSame;
    }

    /**
     * Get 认证人手机号一致
false 关闭-默认
true 开启
注意：
开启后在认证过程前会校验拦截 
     * @return AdminMobileSame 认证人手机号一致
false 关闭-默认
true 开启
注意：
开启后在认证过程前会校验拦截
     */
    public Boolean getAdminMobileSame() {
        return this.AdminMobileSame;
    }

    /**
     * Set 认证人手机号一致
false 关闭-默认
true 开启
注意：
开启后在认证过程前会校验拦截
     * @param AdminMobileSame 认证人手机号一致
false 关闭-默认
true 开启
注意：
开启后在认证过程前会校验拦截
     */
    public void setAdminMobileSame(Boolean AdminMobileSame) {
        this.AdminMobileSame = AdminMobileSame;
    }

    /**
     * Get 企业名称保持一致
false 关闭-默认
true 开启 
     * @return OrganizationNameSame 企业名称保持一致
false 关闭-默认
true 开启
     */
    public Boolean getOrganizationNameSame() {
        return this.OrganizationNameSame;
    }

    /**
     * Set 企业名称保持一致
false 关闭-默认
true 开启
     * @param OrganizationNameSame 企业名称保持一致
false 关闭-默认
true 开启
     */
    public void setOrganizationNameSame(Boolean OrganizationNameSame) {
        this.OrganizationNameSame = OrganizationNameSame;
    }

    /**
     * Get 营业执照正面照(PNG或JPG) base64格式, 大小不超过5M 
     * @return BusinessLicense 营业执照正面照(PNG或JPG) base64格式, 大小不超过5M
     */
    public String getBusinessLicense() {
        return this.BusinessLicense;
    }

    /**
     * Set 营业执照正面照(PNG或JPG) base64格式, 大小不超过5M
     * @param BusinessLicense 营业执照正面照(PNG或JPG) base64格式, 大小不超过5M
     */
    public void setBusinessLicense(String BusinessLicense) {
        this.BusinessLicense = BusinessLicense;
    }

    /**
     * Get 跳转链接类型：
"PC"-PC端认证链接 
"APP"-全屏或半屏跳转小程序链接
“H5”-H5页面认证链接 "SHORT_H5"- H5认证短链
"SHORT_URL"- 跳转小程序短链	 
     * @return Endpoint 跳转链接类型：
"PC"-PC端认证链接 
"APP"-全屏或半屏跳转小程序链接
“H5”-H5页面认证链接 "SHORT_H5"- H5认证短链
"SHORT_URL"- 跳转小程序短链	
     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set 跳转链接类型：
"PC"-PC端认证链接 
"APP"-全屏或半屏跳转小程序链接
“H5”-H5页面认证链接 "SHORT_H5"- H5认证短链
"SHORT_URL"- 跳转小程序短链	
     * @param Endpoint 跳转链接类型：
"PC"-PC端认证链接 
"APP"-全屏或半屏跳转小程序链接
“H5”-H5页面认证链接 "SHORT_H5"- H5认证短链
"SHORT_URL"- 跳转小程序短链	
     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    public CreateOrganizationAuthUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrganizationAuthUrlRequest(CreateOrganizationAuthUrlRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.AuthorizationTypes != null) {
            this.AuthorizationTypes = new Long[source.AuthorizationTypes.length];
            for (int i = 0; i < source.AuthorizationTypes.length; i++) {
                this.AuthorizationTypes[i] = new Long(source.AuthorizationTypes[i]);
            }
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.UniformSocialCreditCode != null) {
            this.UniformSocialCreditCode = new String(source.UniformSocialCreditCode);
        }
        if (source.LegalName != null) {
            this.LegalName = new String(source.LegalName);
        }
        if (source.AutoJumpUrl != null) {
            this.AutoJumpUrl = new String(source.AutoJumpUrl);
        }
        if (source.OrganizationAddress != null) {
            this.OrganizationAddress = new String(source.OrganizationAddress);
        }
        if (source.AdminName != null) {
            this.AdminName = new String(source.AdminName);
        }
        if (source.AdminMobile != null) {
            this.AdminMobile = new String(source.AdminMobile);
        }
        if (source.AdminIdCardNumber != null) {
            this.AdminIdCardNumber = new String(source.AdminIdCardNumber);
        }
        if (source.AdminIdCardType != null) {
            this.AdminIdCardType = new String(source.AdminIdCardType);
        }
        if (source.UniformSocialCreditCodeSame != null) {
            this.UniformSocialCreditCodeSame = new Boolean(source.UniformSocialCreditCodeSame);
        }
        if (source.LegalNameSame != null) {
            this.LegalNameSame = new Boolean(source.LegalNameSame);
        }
        if (source.AdminNameSame != null) {
            this.AdminNameSame = new Boolean(source.AdminNameSame);
        }
        if (source.AdminIdCardNumberSame != null) {
            this.AdminIdCardNumberSame = new Boolean(source.AdminIdCardNumberSame);
        }
        if (source.AdminMobileSame != null) {
            this.AdminMobileSame = new Boolean(source.AdminMobileSame);
        }
        if (source.OrganizationNameSame != null) {
            this.OrganizationNameSame = new Boolean(source.OrganizationNameSame);
        }
        if (source.BusinessLicense != null) {
            this.BusinessLicense = new String(source.BusinessLicense);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamArraySimple(map, prefix + "AuthorizationTypes.", this.AuthorizationTypes);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "UniformSocialCreditCode", this.UniformSocialCreditCode);
        this.setParamSimple(map, prefix + "LegalName", this.LegalName);
        this.setParamSimple(map, prefix + "AutoJumpUrl", this.AutoJumpUrl);
        this.setParamSimple(map, prefix + "OrganizationAddress", this.OrganizationAddress);
        this.setParamSimple(map, prefix + "AdminName", this.AdminName);
        this.setParamSimple(map, prefix + "AdminMobile", this.AdminMobile);
        this.setParamSimple(map, prefix + "AdminIdCardNumber", this.AdminIdCardNumber);
        this.setParamSimple(map, prefix + "AdminIdCardType", this.AdminIdCardType);
        this.setParamSimple(map, prefix + "UniformSocialCreditCodeSame", this.UniformSocialCreditCodeSame);
        this.setParamSimple(map, prefix + "LegalNameSame", this.LegalNameSame);
        this.setParamSimple(map, prefix + "AdminNameSame", this.AdminNameSame);
        this.setParamSimple(map, prefix + "AdminIdCardNumberSame", this.AdminIdCardNumberSame);
        this.setParamSimple(map, prefix + "AdminMobileSame", this.AdminMobileSame);
        this.setParamSimple(map, prefix + "OrganizationNameSame", this.OrganizationNameSame);
        this.setParamSimple(map, prefix + "BusinessLicense", this.BusinessLicense);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);

    }
}

