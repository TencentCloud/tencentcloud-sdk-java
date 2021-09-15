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

public class CreateSubOrganizationAndSealRequest extends AbstractModel{

    /**
    * 调用方信息
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 机构名称全称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 机构证件号码类型可选值：
1. USCC - 统一社会信用代码
2. BIZREGISTNO - 营业执照注册号
    */
    @SerializedName("IdCardType")
    @Expose
    private String IdCardType;

    /**
    * 机构证件号码
    */
    @SerializedName("IdCardNumber")
    @Expose
    private String IdCardNumber;

    /**
    * 机构类型可选值：
1. ENTERPRISE - 企业
2. INDIVIDUALBIZ - 个体工商户
3. PUBLICINSTITUTION - 政府/事业单位
4. OTHERS - 其他组织
    */
    @SerializedName("OrganizationType")
    @Expose
    private String OrganizationType;

    /**
    * 机构法人/经营者姓名
    */
    @SerializedName("LegalName")
    @Expose
    private String LegalName;

    /**
    * 机构法人/经营者证件类型可选值：
1. ID_CARD - 居民身份证
2. PASSPORT - 护照
3. MAINLAND_TRAVEL_PERMIT_FOR_HONGKONG_AND_MACAO_RESIDENTS - 港澳居民来往内地通行证
4. MAINLAND_TRAVEL_PERMIT_FOR_TAIWAN_RESIDENTS - 台湾居民来往大陆通行证
5. HOUSEHOLD_REGISTER - 户口本
6. TEMP_ID_CARD - 临时居民身份证
    */
    @SerializedName("LegalIdCardType")
    @Expose
    private String LegalIdCardType;

    /**
    * 机构法人/经营者证件号码；
OrganizationType 为 ENTERPRISE时，INDIVIDUALBIZ 时必填，其他情况选填
    */
    @SerializedName("LegalIdCardNumber")
    @Expose
    private String LegalIdCardNumber;

    /**
    * 实名认证的客户端IP/请求生成企业印章的客户端Ip
    */
    @SerializedName("VerifyClientIp")
    @Expose
    private String VerifyClientIp;

    /**
    * 机构电子邮箱
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 机构证件文件类型可选值：
1. USCCFILE - 统一社会信用代码证书
2. LICENSEFILE - 营业执照
    */
    @SerializedName("IdCardFileType")
    @Expose
    private String IdCardFileType;

    /**
    * 机构证件照片文件，base64编码，支持jpg、jpeg、png格式
    */
    @SerializedName("BizLicenseFile")
    @Expose
    private String BizLicenseFile;

    /**
    * 机构证件照片文件名
    */
    @SerializedName("BizLicenseFileName")
    @Expose
    private String BizLicenseFileName;

    /**
    * 机构法人/经营者/联系人手机号码
    */
    @SerializedName("LegalMobile")
    @Expose
    private String LegalMobile;

    /**
    * 组织联系人姓名
    */
    @SerializedName("ContactName")
    @Expose
    private String ContactName;

    /**
    * 实名认证的服务器IP
    */
    @SerializedName("VerifyServerIp")
    @Expose
    private String VerifyServerIp;

    /**
    * 企业联系地址
    */
    @SerializedName("ContactAddress")
    @Expose
    private Address ContactAddress;

    /**
    * 电子印章名称
    */
    @SerializedName("SealName")
    @Expose
    private String SealName;

    /**
    * 印章类型：默认: CONTRACT
1. OFFICIAL-公章
2. SPECIAL_FINANCIAL-财务专用章
3. CONTRACT-合同专用章
4. LEGAL_REPRESENTATIVE-法定代表人章
5. SPECIAL_NATIONWIDE_INVOICE-发票专用章
6. OTHER-其他
    */
    @SerializedName("SealType")
    @Expose
    private String SealType;

    /**
    * 企业印章横向文字，最多可填8个汉字（可为空，默认为"电子签名专用章"）
    */
    @SerializedName("SealHorizontalText")
    @Expose
    private String SealHorizontalText;

    /**
    * 机构在第三方的唯一标识，32位以内标识符
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 是否使用OpenId作为数据主键，如果为true，请确保OpenId在当前应用号唯一
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
     * Get 机构名称全称 
     * @return Name 机构名称全称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 机构名称全称
     * @param Name 机构名称全称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 机构证件号码类型可选值：
1. USCC - 统一社会信用代码
2. BIZREGISTNO - 营业执照注册号 
     * @return IdCardType 机构证件号码类型可选值：
1. USCC - 统一社会信用代码
2. BIZREGISTNO - 营业执照注册号
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set 机构证件号码类型可选值：
1. USCC - 统一社会信用代码
2. BIZREGISTNO - 营业执照注册号
     * @param IdCardType 机构证件号码类型可选值：
1. USCC - 统一社会信用代码
2. BIZREGISTNO - 营业执照注册号
     */
    public void setIdCardType(String IdCardType) {
        this.IdCardType = IdCardType;
    }

    /**
     * Get 机构证件号码 
     * @return IdCardNumber 机构证件号码
     */
    public String getIdCardNumber() {
        return this.IdCardNumber;
    }

    /**
     * Set 机构证件号码
     * @param IdCardNumber 机构证件号码
     */
    public void setIdCardNumber(String IdCardNumber) {
        this.IdCardNumber = IdCardNumber;
    }

    /**
     * Get 机构类型可选值：
1. ENTERPRISE - 企业
2. INDIVIDUALBIZ - 个体工商户
3. PUBLICINSTITUTION - 政府/事业单位
4. OTHERS - 其他组织 
     * @return OrganizationType 机构类型可选值：
1. ENTERPRISE - 企业
2. INDIVIDUALBIZ - 个体工商户
3. PUBLICINSTITUTION - 政府/事业单位
4. OTHERS - 其他组织
     */
    public String getOrganizationType() {
        return this.OrganizationType;
    }

    /**
     * Set 机构类型可选值：
1. ENTERPRISE - 企业
2. INDIVIDUALBIZ - 个体工商户
3. PUBLICINSTITUTION - 政府/事业单位
4. OTHERS - 其他组织
     * @param OrganizationType 机构类型可选值：
1. ENTERPRISE - 企业
2. INDIVIDUALBIZ - 个体工商户
3. PUBLICINSTITUTION - 政府/事业单位
4. OTHERS - 其他组织
     */
    public void setOrganizationType(String OrganizationType) {
        this.OrganizationType = OrganizationType;
    }

    /**
     * Get 机构法人/经营者姓名 
     * @return LegalName 机构法人/经营者姓名
     */
    public String getLegalName() {
        return this.LegalName;
    }

    /**
     * Set 机构法人/经营者姓名
     * @param LegalName 机构法人/经营者姓名
     */
    public void setLegalName(String LegalName) {
        this.LegalName = LegalName;
    }

    /**
     * Get 机构法人/经营者证件类型可选值：
1. ID_CARD - 居民身份证
2. PASSPORT - 护照
3. MAINLAND_TRAVEL_PERMIT_FOR_HONGKONG_AND_MACAO_RESIDENTS - 港澳居民来往内地通行证
4. MAINLAND_TRAVEL_PERMIT_FOR_TAIWAN_RESIDENTS - 台湾居民来往大陆通行证
5. HOUSEHOLD_REGISTER - 户口本
6. TEMP_ID_CARD - 临时居民身份证 
     * @return LegalIdCardType 机构法人/经营者证件类型可选值：
1. ID_CARD - 居民身份证
2. PASSPORT - 护照
3. MAINLAND_TRAVEL_PERMIT_FOR_HONGKONG_AND_MACAO_RESIDENTS - 港澳居民来往内地通行证
4. MAINLAND_TRAVEL_PERMIT_FOR_TAIWAN_RESIDENTS - 台湾居民来往大陆通行证
5. HOUSEHOLD_REGISTER - 户口本
6. TEMP_ID_CARD - 临时居民身份证
     */
    public String getLegalIdCardType() {
        return this.LegalIdCardType;
    }

    /**
     * Set 机构法人/经营者证件类型可选值：
1. ID_CARD - 居民身份证
2. PASSPORT - 护照
3. MAINLAND_TRAVEL_PERMIT_FOR_HONGKONG_AND_MACAO_RESIDENTS - 港澳居民来往内地通行证
4. MAINLAND_TRAVEL_PERMIT_FOR_TAIWAN_RESIDENTS - 台湾居民来往大陆通行证
5. HOUSEHOLD_REGISTER - 户口本
6. TEMP_ID_CARD - 临时居民身份证
     * @param LegalIdCardType 机构法人/经营者证件类型可选值：
1. ID_CARD - 居民身份证
2. PASSPORT - 护照
3. MAINLAND_TRAVEL_PERMIT_FOR_HONGKONG_AND_MACAO_RESIDENTS - 港澳居民来往内地通行证
4. MAINLAND_TRAVEL_PERMIT_FOR_TAIWAN_RESIDENTS - 台湾居民来往大陆通行证
5. HOUSEHOLD_REGISTER - 户口本
6. TEMP_ID_CARD - 临时居民身份证
     */
    public void setLegalIdCardType(String LegalIdCardType) {
        this.LegalIdCardType = LegalIdCardType;
    }

    /**
     * Get 机构法人/经营者证件号码；
OrganizationType 为 ENTERPRISE时，INDIVIDUALBIZ 时必填，其他情况选填 
     * @return LegalIdCardNumber 机构法人/经营者证件号码；
OrganizationType 为 ENTERPRISE时，INDIVIDUALBIZ 时必填，其他情况选填
     */
    public String getLegalIdCardNumber() {
        return this.LegalIdCardNumber;
    }

    /**
     * Set 机构法人/经营者证件号码；
OrganizationType 为 ENTERPRISE时，INDIVIDUALBIZ 时必填，其他情况选填
     * @param LegalIdCardNumber 机构法人/经营者证件号码；
OrganizationType 为 ENTERPRISE时，INDIVIDUALBIZ 时必填，其他情况选填
     */
    public void setLegalIdCardNumber(String LegalIdCardNumber) {
        this.LegalIdCardNumber = LegalIdCardNumber;
    }

    /**
     * Get 实名认证的客户端IP/请求生成企业印章的客户端Ip 
     * @return VerifyClientIp 实名认证的客户端IP/请求生成企业印章的客户端Ip
     */
    public String getVerifyClientIp() {
        return this.VerifyClientIp;
    }

    /**
     * Set 实名认证的客户端IP/请求生成企业印章的客户端Ip
     * @param VerifyClientIp 实名认证的客户端IP/请求生成企业印章的客户端Ip
     */
    public void setVerifyClientIp(String VerifyClientIp) {
        this.VerifyClientIp = VerifyClientIp;
    }

    /**
     * Get 机构电子邮箱 
     * @return Email 机构电子邮箱
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 机构电子邮箱
     * @param Email 机构电子邮箱
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 机构证件文件类型可选值：
1. USCCFILE - 统一社会信用代码证书
2. LICENSEFILE - 营业执照 
     * @return IdCardFileType 机构证件文件类型可选值：
1. USCCFILE - 统一社会信用代码证书
2. LICENSEFILE - 营业执照
     */
    public String getIdCardFileType() {
        return this.IdCardFileType;
    }

    /**
     * Set 机构证件文件类型可选值：
1. USCCFILE - 统一社会信用代码证书
2. LICENSEFILE - 营业执照
     * @param IdCardFileType 机构证件文件类型可选值：
1. USCCFILE - 统一社会信用代码证书
2. LICENSEFILE - 营业执照
     */
    public void setIdCardFileType(String IdCardFileType) {
        this.IdCardFileType = IdCardFileType;
    }

    /**
     * Get 机构证件照片文件，base64编码，支持jpg、jpeg、png格式 
     * @return BizLicenseFile 机构证件照片文件，base64编码，支持jpg、jpeg、png格式
     */
    public String getBizLicenseFile() {
        return this.BizLicenseFile;
    }

    /**
     * Set 机构证件照片文件，base64编码，支持jpg、jpeg、png格式
     * @param BizLicenseFile 机构证件照片文件，base64编码，支持jpg、jpeg、png格式
     */
    public void setBizLicenseFile(String BizLicenseFile) {
        this.BizLicenseFile = BizLicenseFile;
    }

    /**
     * Get 机构证件照片文件名 
     * @return BizLicenseFileName 机构证件照片文件名
     */
    public String getBizLicenseFileName() {
        return this.BizLicenseFileName;
    }

    /**
     * Set 机构证件照片文件名
     * @param BizLicenseFileName 机构证件照片文件名
     */
    public void setBizLicenseFileName(String BizLicenseFileName) {
        this.BizLicenseFileName = BizLicenseFileName;
    }

    /**
     * Get 机构法人/经营者/联系人手机号码 
     * @return LegalMobile 机构法人/经营者/联系人手机号码
     */
    public String getLegalMobile() {
        return this.LegalMobile;
    }

    /**
     * Set 机构法人/经营者/联系人手机号码
     * @param LegalMobile 机构法人/经营者/联系人手机号码
     */
    public void setLegalMobile(String LegalMobile) {
        this.LegalMobile = LegalMobile;
    }

    /**
     * Get 组织联系人姓名 
     * @return ContactName 组织联系人姓名
     */
    public String getContactName() {
        return this.ContactName;
    }

    /**
     * Set 组织联系人姓名
     * @param ContactName 组织联系人姓名
     */
    public void setContactName(String ContactName) {
        this.ContactName = ContactName;
    }

    /**
     * Get 实名认证的服务器IP 
     * @return VerifyServerIp 实名认证的服务器IP
     */
    public String getVerifyServerIp() {
        return this.VerifyServerIp;
    }

    /**
     * Set 实名认证的服务器IP
     * @param VerifyServerIp 实名认证的服务器IP
     */
    public void setVerifyServerIp(String VerifyServerIp) {
        this.VerifyServerIp = VerifyServerIp;
    }

    /**
     * Get 企业联系地址 
     * @return ContactAddress 企业联系地址
     */
    public Address getContactAddress() {
        return this.ContactAddress;
    }

    /**
     * Set 企业联系地址
     * @param ContactAddress 企业联系地址
     */
    public void setContactAddress(Address ContactAddress) {
        this.ContactAddress = ContactAddress;
    }

    /**
     * Get 电子印章名称 
     * @return SealName 电子印章名称
     */
    public String getSealName() {
        return this.SealName;
    }

    /**
     * Set 电子印章名称
     * @param SealName 电子印章名称
     */
    public void setSealName(String SealName) {
        this.SealName = SealName;
    }

    /**
     * Get 印章类型：默认: CONTRACT
1. OFFICIAL-公章
2. SPECIAL_FINANCIAL-财务专用章
3. CONTRACT-合同专用章
4. LEGAL_REPRESENTATIVE-法定代表人章
5. SPECIAL_NATIONWIDE_INVOICE-发票专用章
6. OTHER-其他 
     * @return SealType 印章类型：默认: CONTRACT
1. OFFICIAL-公章
2. SPECIAL_FINANCIAL-财务专用章
3. CONTRACT-合同专用章
4. LEGAL_REPRESENTATIVE-法定代表人章
5. SPECIAL_NATIONWIDE_INVOICE-发票专用章
6. OTHER-其他
     */
    public String getSealType() {
        return this.SealType;
    }

    /**
     * Set 印章类型：默认: CONTRACT
1. OFFICIAL-公章
2. SPECIAL_FINANCIAL-财务专用章
3. CONTRACT-合同专用章
4. LEGAL_REPRESENTATIVE-法定代表人章
5. SPECIAL_NATIONWIDE_INVOICE-发票专用章
6. OTHER-其他
     * @param SealType 印章类型：默认: CONTRACT
1. OFFICIAL-公章
2. SPECIAL_FINANCIAL-财务专用章
3. CONTRACT-合同专用章
4. LEGAL_REPRESENTATIVE-法定代表人章
5. SPECIAL_NATIONWIDE_INVOICE-发票专用章
6. OTHER-其他
     */
    public void setSealType(String SealType) {
        this.SealType = SealType;
    }

    /**
     * Get 企业印章横向文字，最多可填8个汉字（可为空，默认为"电子签名专用章"） 
     * @return SealHorizontalText 企业印章横向文字，最多可填8个汉字（可为空，默认为"电子签名专用章"）
     */
    public String getSealHorizontalText() {
        return this.SealHorizontalText;
    }

    /**
     * Set 企业印章横向文字，最多可填8个汉字（可为空，默认为"电子签名专用章"）
     * @param SealHorizontalText 企业印章横向文字，最多可填8个汉字（可为空，默认为"电子签名专用章"）
     */
    public void setSealHorizontalText(String SealHorizontalText) {
        this.SealHorizontalText = SealHorizontalText;
    }

    /**
     * Get 机构在第三方的唯一标识，32位以内标识符 
     * @return OpenId 机构在第三方的唯一标识，32位以内标识符
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 机构在第三方的唯一标识，32位以内标识符
     * @param OpenId 机构在第三方的唯一标识，32位以内标识符
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 是否使用OpenId作为数据主键，如果为true，请确保OpenId在当前应用号唯一 
     * @return UseOpenId 是否使用OpenId作为数据主键，如果为true，请确保OpenId在当前应用号唯一
     */
    public Boolean getUseOpenId() {
        return this.UseOpenId;
    }

    /**
     * Set 是否使用OpenId作为数据主键，如果为true，请确保OpenId在当前应用号唯一
     * @param UseOpenId 是否使用OpenId作为数据主键，如果为true，请确保OpenId在当前应用号唯一
     */
    public void setUseOpenId(Boolean UseOpenId) {
        this.UseOpenId = UseOpenId;
    }

    public CreateSubOrganizationAndSealRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSubOrganizationAndSealRequest(CreateSubOrganizationAndSealRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
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
        if (source.OrganizationType != null) {
            this.OrganizationType = new String(source.OrganizationType);
        }
        if (source.LegalName != null) {
            this.LegalName = new String(source.LegalName);
        }
        if (source.LegalIdCardType != null) {
            this.LegalIdCardType = new String(source.LegalIdCardType);
        }
        if (source.LegalIdCardNumber != null) {
            this.LegalIdCardNumber = new String(source.LegalIdCardNumber);
        }
        if (source.VerifyClientIp != null) {
            this.VerifyClientIp = new String(source.VerifyClientIp);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.IdCardFileType != null) {
            this.IdCardFileType = new String(source.IdCardFileType);
        }
        if (source.BizLicenseFile != null) {
            this.BizLicenseFile = new String(source.BizLicenseFile);
        }
        if (source.BizLicenseFileName != null) {
            this.BizLicenseFileName = new String(source.BizLicenseFileName);
        }
        if (source.LegalMobile != null) {
            this.LegalMobile = new String(source.LegalMobile);
        }
        if (source.ContactName != null) {
            this.ContactName = new String(source.ContactName);
        }
        if (source.VerifyServerIp != null) {
            this.VerifyServerIp = new String(source.VerifyServerIp);
        }
        if (source.ContactAddress != null) {
            this.ContactAddress = new Address(source.ContactAddress);
        }
        if (source.SealName != null) {
            this.SealName = new String(source.SealName);
        }
        if (source.SealType != null) {
            this.SealType = new String(source.SealType);
        }
        if (source.SealHorizontalText != null) {
            this.SealHorizontalText = new String(source.SealHorizontalText);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
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
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "OrganizationType", this.OrganizationType);
        this.setParamSimple(map, prefix + "LegalName", this.LegalName);
        this.setParamSimple(map, prefix + "LegalIdCardType", this.LegalIdCardType);
        this.setParamSimple(map, prefix + "LegalIdCardNumber", this.LegalIdCardNumber);
        this.setParamSimple(map, prefix + "VerifyClientIp", this.VerifyClientIp);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "IdCardFileType", this.IdCardFileType);
        this.setParamSimple(map, prefix + "BizLicenseFile", this.BizLicenseFile);
        this.setParamSimple(map, prefix + "BizLicenseFileName", this.BizLicenseFileName);
        this.setParamSimple(map, prefix + "LegalMobile", this.LegalMobile);
        this.setParamSimple(map, prefix + "ContactName", this.ContactName);
        this.setParamSimple(map, prefix + "VerifyServerIp", this.VerifyServerIp);
        this.setParamObj(map, prefix + "ContactAddress.", this.ContactAddress);
        this.setParamSimple(map, prefix + "SealName", this.SealName);
        this.setParamSimple(map, prefix + "SealType", this.SealType);
        this.setParamSimple(map, prefix + "SealHorizontalText", this.SealHorizontalText);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "UseOpenId", this.UseOpenId);

    }
}

