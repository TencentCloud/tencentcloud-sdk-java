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

public class RegistrationOrganizationInfo extends AbstractModel {

    /**
    * 组织机构名称。
请确认该名称与企业营业执照中注册的名称一致。
如果名称中包含英文括号()，请使用中文括号（）代替。
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 组织机构企业统一社会信用代码。
请确认该企业统一社会信用代码与企业营业执照中注册的统一社会信用代码一致。
    */
    @SerializedName("UniformSocialCreditCode")
    @Expose
    private String UniformSocialCreditCode;

    /**
    * 组织机构法人的姓名。
请确认该企业统一社会信用代码与企业营业执照中注册的法人姓名一致。
    */
    @SerializedName("LegalName")
    @Expose
    private String LegalName;

    /**
    * 组织机构企业注册地址。
请确认该企业注册地址与企业营业执照中注册的地址一致。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 组织机构超管姓名。
在注册流程中，必须是超管本人进行操作。
如果法人做为超管管理组织机构,超管姓名就是法人姓名
如果入参中传递超管授权书PowerOfAttorneys，则此参数为必填参数。
    */
    @SerializedName("AdminName")
    @Expose
    private String AdminName;

    /**
    * 组织机构超管手机号。
在注册流程中，这个手机号必须跟操作人在电子签注册的个人手机号一致。
如果入参中传递超管授权书PowerOfAttorneys，则此参数为必填参数
    */
    @SerializedName("AdminMobile")
    @Expose
    private String AdminMobile;

    /**
    * 可选的此企业允许的授权方式, 可以设置的方式有:
1：上传授权书
2：法人授权超管
5：授权书+对公打款


注:
`1. 当前仅支持一种认证方式`
`2. 如果当前的企业类型是政府/事业单位, 则只支持上传授权书+对公打款`
`3. 如果当前操作人是法人,则是法人认证`
    */
    @SerializedName("AuthorizationTypes")
    @Expose
    private Long [] AuthorizationTypes;

    /**
    * 认证人身份证号，如果入参中传递超管授权书PowerOfAttorneys，则此参数为必填参数

    */
    @SerializedName("AdminIdCardNumber")
    @Expose
    private String AdminIdCardNumber;

    /**
    * 认证人证件类型 
支持以下类型
<ul><li>ID_CARD : 中国大陆居民身份证  (默认值)</li>
<li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>

    */
    @SerializedName("AdminIdCardType")
    @Expose
    private String AdminIdCardType;

    /**
    * 营业执照正面照(PNG或JPG) base64格式, 大小不超过5M
    */
    @SerializedName("BusinessLicense")
    @Expose
    private String BusinessLicense;

    /**
    * 授权书(PNG或JPG或PDF) base64格式, 大小不超过8M 。
p.s. 如果上传授权书 ，需遵循以下条件
1. 超管的信息（超管姓名，超管手机号）必须为必填参数。
2. 超管的个人身份必须在电子签已经实名。
2. 认证方式AuthorizationTypes必须只能是上传授权书方式 

    */
    @SerializedName("PowerOfAttorneys")
    @Expose
    private String [] PowerOfAttorneys;

    /**
     * Get 组织机构名称。
请确认该名称与企业营业执照中注册的名称一致。
如果名称中包含英文括号()，请使用中文括号（）代替。 
     * @return OrganizationName 组织机构名称。
请确认该名称与企业营业执照中注册的名称一致。
如果名称中包含英文括号()，请使用中文括号（）代替。
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 组织机构名称。
请确认该名称与企业营业执照中注册的名称一致。
如果名称中包含英文括号()，请使用中文括号（）代替。
     * @param OrganizationName 组织机构名称。
请确认该名称与企业营业执照中注册的名称一致。
如果名称中包含英文括号()，请使用中文括号（）代替。
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 组织机构企业统一社会信用代码。
请确认该企业统一社会信用代码与企业营业执照中注册的统一社会信用代码一致。 
     * @return UniformSocialCreditCode 组织机构企业统一社会信用代码。
请确认该企业统一社会信用代码与企业营业执照中注册的统一社会信用代码一致。
     */
    public String getUniformSocialCreditCode() {
        return this.UniformSocialCreditCode;
    }

    /**
     * Set 组织机构企业统一社会信用代码。
请确认该企业统一社会信用代码与企业营业执照中注册的统一社会信用代码一致。
     * @param UniformSocialCreditCode 组织机构企业统一社会信用代码。
请确认该企业统一社会信用代码与企业营业执照中注册的统一社会信用代码一致。
     */
    public void setUniformSocialCreditCode(String UniformSocialCreditCode) {
        this.UniformSocialCreditCode = UniformSocialCreditCode;
    }

    /**
     * Get 组织机构法人的姓名。
请确认该企业统一社会信用代码与企业营业执照中注册的法人姓名一致。 
     * @return LegalName 组织机构法人的姓名。
请确认该企业统一社会信用代码与企业营业执照中注册的法人姓名一致。
     */
    public String getLegalName() {
        return this.LegalName;
    }

    /**
     * Set 组织机构法人的姓名。
请确认该企业统一社会信用代码与企业营业执照中注册的法人姓名一致。
     * @param LegalName 组织机构法人的姓名。
请确认该企业统一社会信用代码与企业营业执照中注册的法人姓名一致。
     */
    public void setLegalName(String LegalName) {
        this.LegalName = LegalName;
    }

    /**
     * Get 组织机构企业注册地址。
请确认该企业注册地址与企业营业执照中注册的地址一致。 
     * @return Address 组织机构企业注册地址。
请确认该企业注册地址与企业营业执照中注册的地址一致。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 组织机构企业注册地址。
请确认该企业注册地址与企业营业执照中注册的地址一致。
     * @param Address 组织机构企业注册地址。
请确认该企业注册地址与企业营业执照中注册的地址一致。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 组织机构超管姓名。
在注册流程中，必须是超管本人进行操作。
如果法人做为超管管理组织机构,超管姓名就是法人姓名
如果入参中传递超管授权书PowerOfAttorneys，则此参数为必填参数。 
     * @return AdminName 组织机构超管姓名。
在注册流程中，必须是超管本人进行操作。
如果法人做为超管管理组织机构,超管姓名就是法人姓名
如果入参中传递超管授权书PowerOfAttorneys，则此参数为必填参数。
     */
    public String getAdminName() {
        return this.AdminName;
    }

    /**
     * Set 组织机构超管姓名。
在注册流程中，必须是超管本人进行操作。
如果法人做为超管管理组织机构,超管姓名就是法人姓名
如果入参中传递超管授权书PowerOfAttorneys，则此参数为必填参数。
     * @param AdminName 组织机构超管姓名。
在注册流程中，必须是超管本人进行操作。
如果法人做为超管管理组织机构,超管姓名就是法人姓名
如果入参中传递超管授权书PowerOfAttorneys，则此参数为必填参数。
     */
    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    /**
     * Get 组织机构超管手机号。
在注册流程中，这个手机号必须跟操作人在电子签注册的个人手机号一致。
如果入参中传递超管授权书PowerOfAttorneys，则此参数为必填参数 
     * @return AdminMobile 组织机构超管手机号。
在注册流程中，这个手机号必须跟操作人在电子签注册的个人手机号一致。
如果入参中传递超管授权书PowerOfAttorneys，则此参数为必填参数
     */
    public String getAdminMobile() {
        return this.AdminMobile;
    }

    /**
     * Set 组织机构超管手机号。
在注册流程中，这个手机号必须跟操作人在电子签注册的个人手机号一致。
如果入参中传递超管授权书PowerOfAttorneys，则此参数为必填参数
     * @param AdminMobile 组织机构超管手机号。
在注册流程中，这个手机号必须跟操作人在电子签注册的个人手机号一致。
如果入参中传递超管授权书PowerOfAttorneys，则此参数为必填参数
     */
    public void setAdminMobile(String AdminMobile) {
        this.AdminMobile = AdminMobile;
    }

    /**
     * Get 可选的此企业允许的授权方式, 可以设置的方式有:
1：上传授权书
2：法人授权超管
5：授权书+对公打款


注:
`1. 当前仅支持一种认证方式`
`2. 如果当前的企业类型是政府/事业单位, 则只支持上传授权书+对公打款`
`3. 如果当前操作人是法人,则是法人认证` 
     * @return AuthorizationTypes 可选的此企业允许的授权方式, 可以设置的方式有:
1：上传授权书
2：法人授权超管
5：授权书+对公打款


注:
`1. 当前仅支持一种认证方式`
`2. 如果当前的企业类型是政府/事业单位, 则只支持上传授权书+对公打款`
`3. 如果当前操作人是法人,则是法人认证`
     */
    public Long [] getAuthorizationTypes() {
        return this.AuthorizationTypes;
    }

    /**
     * Set 可选的此企业允许的授权方式, 可以设置的方式有:
1：上传授权书
2：法人授权超管
5：授权书+对公打款


注:
`1. 当前仅支持一种认证方式`
`2. 如果当前的企业类型是政府/事业单位, 则只支持上传授权书+对公打款`
`3. 如果当前操作人是法人,则是法人认证`
     * @param AuthorizationTypes 可选的此企业允许的授权方式, 可以设置的方式有:
1：上传授权书
2：法人授权超管
5：授权书+对公打款


注:
`1. 当前仅支持一种认证方式`
`2. 如果当前的企业类型是政府/事业单位, 则只支持上传授权书+对公打款`
`3. 如果当前操作人是法人,则是法人认证`
     */
    public void setAuthorizationTypes(Long [] AuthorizationTypes) {
        this.AuthorizationTypes = AuthorizationTypes;
    }

    /**
     * Get 认证人身份证号，如果入参中传递超管授权书PowerOfAttorneys，则此参数为必填参数
 
     * @return AdminIdCardNumber 认证人身份证号，如果入参中传递超管授权书PowerOfAttorneys，则此参数为必填参数

     */
    public String getAdminIdCardNumber() {
        return this.AdminIdCardNumber;
    }

    /**
     * Set 认证人身份证号，如果入参中传递超管授权书PowerOfAttorneys，则此参数为必填参数

     * @param AdminIdCardNumber 认证人身份证号，如果入参中传递超管授权书PowerOfAttorneys，则此参数为必填参数

     */
    public void setAdminIdCardNumber(String AdminIdCardNumber) {
        this.AdminIdCardNumber = AdminIdCardNumber;
    }

    /**
     * Get 认证人证件类型 
支持以下类型
<ul><li>ID_CARD : 中国大陆居民身份证  (默认值)</li>
<li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>
 
     * @return AdminIdCardType 认证人证件类型 
支持以下类型
<ul><li>ID_CARD : 中国大陆居民身份证  (默认值)</li>
<li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>

     */
    public String getAdminIdCardType() {
        return this.AdminIdCardType;
    }

    /**
     * Set 认证人证件类型 
支持以下类型
<ul><li>ID_CARD : 中国大陆居民身份证  (默认值)</li>
<li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>

     * @param AdminIdCardType 认证人证件类型 
支持以下类型
<ul><li>ID_CARD : 中国大陆居民身份证  (默认值)</li>
<li>HONGKONG_AND_MACAO : 中国港澳居民来往内地通行证</li>
<li>HONGKONG_MACAO_AND_TAIWAN : 中国港澳台居民居住证(格式同中国大陆居民身份证)</li></ul>

     */
    public void setAdminIdCardType(String AdminIdCardType) {
        this.AdminIdCardType = AdminIdCardType;
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
     * Get 授权书(PNG或JPG或PDF) base64格式, 大小不超过8M 。
p.s. 如果上传授权书 ，需遵循以下条件
1. 超管的信息（超管姓名，超管手机号）必须为必填参数。
2. 超管的个人身份必须在电子签已经实名。
2. 认证方式AuthorizationTypes必须只能是上传授权书方式 
 
     * @return PowerOfAttorneys 授权书(PNG或JPG或PDF) base64格式, 大小不超过8M 。
p.s. 如果上传授权书 ，需遵循以下条件
1. 超管的信息（超管姓名，超管手机号）必须为必填参数。
2. 超管的个人身份必须在电子签已经实名。
2. 认证方式AuthorizationTypes必须只能是上传授权书方式 

     */
    public String [] getPowerOfAttorneys() {
        return this.PowerOfAttorneys;
    }

    /**
     * Set 授权书(PNG或JPG或PDF) base64格式, 大小不超过8M 。
p.s. 如果上传授权书 ，需遵循以下条件
1. 超管的信息（超管姓名，超管手机号）必须为必填参数。
2. 超管的个人身份必须在电子签已经实名。
2. 认证方式AuthorizationTypes必须只能是上传授权书方式 

     * @param PowerOfAttorneys 授权书(PNG或JPG或PDF) base64格式, 大小不超过8M 。
p.s. 如果上传授权书 ，需遵循以下条件
1. 超管的信息（超管姓名，超管手机号）必须为必填参数。
2. 超管的个人身份必须在电子签已经实名。
2. 认证方式AuthorizationTypes必须只能是上传授权书方式 

     */
    public void setPowerOfAttorneys(String [] PowerOfAttorneys) {
        this.PowerOfAttorneys = PowerOfAttorneys;
    }

    public RegistrationOrganizationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegistrationOrganizationInfo(RegistrationOrganizationInfo source) {
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.UniformSocialCreditCode != null) {
            this.UniformSocialCreditCode = new String(source.UniformSocialCreditCode);
        }
        if (source.LegalName != null) {
            this.LegalName = new String(source.LegalName);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.AdminName != null) {
            this.AdminName = new String(source.AdminName);
        }
        if (source.AdminMobile != null) {
            this.AdminMobile = new String(source.AdminMobile);
        }
        if (source.AuthorizationTypes != null) {
            this.AuthorizationTypes = new Long[source.AuthorizationTypes.length];
            for (int i = 0; i < source.AuthorizationTypes.length; i++) {
                this.AuthorizationTypes[i] = new Long(source.AuthorizationTypes[i]);
            }
        }
        if (source.AdminIdCardNumber != null) {
            this.AdminIdCardNumber = new String(source.AdminIdCardNumber);
        }
        if (source.AdminIdCardType != null) {
            this.AdminIdCardType = new String(source.AdminIdCardType);
        }
        if (source.BusinessLicense != null) {
            this.BusinessLicense = new String(source.BusinessLicense);
        }
        if (source.PowerOfAttorneys != null) {
            this.PowerOfAttorneys = new String[source.PowerOfAttorneys.length];
            for (int i = 0; i < source.PowerOfAttorneys.length; i++) {
                this.PowerOfAttorneys[i] = new String(source.PowerOfAttorneys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "UniformSocialCreditCode", this.UniformSocialCreditCode);
        this.setParamSimple(map, prefix + "LegalName", this.LegalName);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "AdminName", this.AdminName);
        this.setParamSimple(map, prefix + "AdminMobile", this.AdminMobile);
        this.setParamArraySimple(map, prefix + "AuthorizationTypes.", this.AuthorizationTypes);
        this.setParamSimple(map, prefix + "AdminIdCardNumber", this.AdminIdCardNumber);
        this.setParamSimple(map, prefix + "AdminIdCardType", this.AdminIdCardType);
        this.setParamSimple(map, prefix + "BusinessLicense", this.BusinessLicense);
        this.setParamArraySimple(map, prefix + "PowerOfAttorneys.", this.PowerOfAttorneys);

    }
}

