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

public class ModifySubOrganizationInfoRequest extends AbstractModel{

    /**
    * 调用方信息，该接口 SubOrganizationId 字段与 OpenId 字段二者至少需要传入一个，全部传入时则使用 SubOrganizationId 信息
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 机构在第三方的唯一标识，32位定长字符串，与 Caller 中 SubOrgnizationId 二者至少需要传入一个，全部传入时则使用 SubOrganizationId 信息
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
    * 机构名称全称，修改后机构状态将变为未实名，需要调用实名接口重新实名。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 机构类型可选值：
1. ENTERPRISE - 企业；
2. INDIVIDUALBIZ - 个体工商户；
3. PUBLICINSTITUTION - 政府/事业单位
4. OTHERS - 其他组织
    */
    @SerializedName("OrganizationType")
    @Expose
    private String OrganizationType;

    /**
    * 机构证件照片文件，base64编码。支持jpg，jpeg，png格式；如果传值，则重新上传文件后，机构状态将变为未实名，需要调用实名接口重新实名。
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
    * 机构法人/经营者姓名
    */
    @SerializedName("LegalName")
    @Expose
    private String LegalName;

    /**
    * 机构法人/经营者证件类型，可选值：ID_CARD - 居民身份证。OrganizationType 为 ENTERPRISE、INDIVIDUALBIZ 时，此项必填，其他情况选填。
    */
    @SerializedName("LegalIdCardType")
    @Expose
    private String LegalIdCardType;

    /**
    * 机构法人/经营者证件号码。OrganizationType 为 ENTERPRISE、INDIVIDUALBIZ 时，此项必填，其他情况选填
    */
    @SerializedName("LegalIdCardNumber")
    @Expose
    private String LegalIdCardNumber;

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
    * 企业联系地址
    */
    @SerializedName("ContactAddress")
    @Expose
    private Address ContactAddress;

    /**
    * 机构电子邮箱
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
     * Get 调用方信息，该接口 SubOrganizationId 字段与 OpenId 字段二者至少需要传入一个，全部传入时则使用 SubOrganizationId 信息 
     * @return Caller 调用方信息，该接口 SubOrganizationId 字段与 OpenId 字段二者至少需要传入一个，全部传入时则使用 SubOrganizationId 信息
     */
    public Caller getCaller() {
        return this.Caller;
    }

    /**
     * Set 调用方信息，该接口 SubOrganizationId 字段与 OpenId 字段二者至少需要传入一个，全部传入时则使用 SubOrganizationId 信息
     * @param Caller 调用方信息，该接口 SubOrganizationId 字段与 OpenId 字段二者至少需要传入一个，全部传入时则使用 SubOrganizationId 信息
     */
    public void setCaller(Caller Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 机构在第三方的唯一标识，32位定长字符串，与 Caller 中 SubOrgnizationId 二者至少需要传入一个，全部传入时则使用 SubOrganizationId 信息 
     * @return OpenId 机构在第三方的唯一标识，32位定长字符串，与 Caller 中 SubOrgnizationId 二者至少需要传入一个，全部传入时则使用 SubOrganizationId 信息
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 机构在第三方的唯一标识，32位定长字符串，与 Caller 中 SubOrgnizationId 二者至少需要传入一个，全部传入时则使用 SubOrganizationId 信息
     * @param OpenId 机构在第三方的唯一标识，32位定长字符串，与 Caller 中 SubOrgnizationId 二者至少需要传入一个，全部传入时则使用 SubOrganizationId 信息
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Get 机构名称全称，修改后机构状态将变为未实名，需要调用实名接口重新实名。 
     * @return Name 机构名称全称，修改后机构状态将变为未实名，需要调用实名接口重新实名。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 机构名称全称，修改后机构状态将变为未实名，需要调用实名接口重新实名。
     * @param Name 机构名称全称，修改后机构状态将变为未实名，需要调用实名接口重新实名。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 机构类型可选值：
1. ENTERPRISE - 企业；
2. INDIVIDUALBIZ - 个体工商户；
3. PUBLICINSTITUTION - 政府/事业单位
4. OTHERS - 其他组织 
     * @return OrganizationType 机构类型可选值：
1. ENTERPRISE - 企业；
2. INDIVIDUALBIZ - 个体工商户；
3. PUBLICINSTITUTION - 政府/事业单位
4. OTHERS - 其他组织
     */
    public String getOrganizationType() {
        return this.OrganizationType;
    }

    /**
     * Set 机构类型可选值：
1. ENTERPRISE - 企业；
2. INDIVIDUALBIZ - 个体工商户；
3. PUBLICINSTITUTION - 政府/事业单位
4. OTHERS - 其他组织
     * @param OrganizationType 机构类型可选值：
1. ENTERPRISE - 企业；
2. INDIVIDUALBIZ - 个体工商户；
3. PUBLICINSTITUTION - 政府/事业单位
4. OTHERS - 其他组织
     */
    public void setOrganizationType(String OrganizationType) {
        this.OrganizationType = OrganizationType;
    }

    /**
     * Get 机构证件照片文件，base64编码。支持jpg，jpeg，png格式；如果传值，则重新上传文件后，机构状态将变为未实名，需要调用实名接口重新实名。 
     * @return BizLicenseFile 机构证件照片文件，base64编码。支持jpg，jpeg，png格式；如果传值，则重新上传文件后，机构状态将变为未实名，需要调用实名接口重新实名。
     */
    public String getBizLicenseFile() {
        return this.BizLicenseFile;
    }

    /**
     * Set 机构证件照片文件，base64编码。支持jpg，jpeg，png格式；如果传值，则重新上传文件后，机构状态将变为未实名，需要调用实名接口重新实名。
     * @param BizLicenseFile 机构证件照片文件，base64编码。支持jpg，jpeg，png格式；如果传值，则重新上传文件后，机构状态将变为未实名，需要调用实名接口重新实名。
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
     * Get 机构法人/经营者证件类型，可选值：ID_CARD - 居民身份证。OrganizationType 为 ENTERPRISE、INDIVIDUALBIZ 时，此项必填，其他情况选填。 
     * @return LegalIdCardType 机构法人/经营者证件类型，可选值：ID_CARD - 居民身份证。OrganizationType 为 ENTERPRISE、INDIVIDUALBIZ 时，此项必填，其他情况选填。
     */
    public String getLegalIdCardType() {
        return this.LegalIdCardType;
    }

    /**
     * Set 机构法人/经营者证件类型，可选值：ID_CARD - 居民身份证。OrganizationType 为 ENTERPRISE、INDIVIDUALBIZ 时，此项必填，其他情况选填。
     * @param LegalIdCardType 机构法人/经营者证件类型，可选值：ID_CARD - 居民身份证。OrganizationType 为 ENTERPRISE、INDIVIDUALBIZ 时，此项必填，其他情况选填。
     */
    public void setLegalIdCardType(String LegalIdCardType) {
        this.LegalIdCardType = LegalIdCardType;
    }

    /**
     * Get 机构法人/经营者证件号码。OrganizationType 为 ENTERPRISE、INDIVIDUALBIZ 时，此项必填，其他情况选填 
     * @return LegalIdCardNumber 机构法人/经营者证件号码。OrganizationType 为 ENTERPRISE、INDIVIDUALBIZ 时，此项必填，其他情况选填
     */
    public String getLegalIdCardNumber() {
        return this.LegalIdCardNumber;
    }

    /**
     * Set 机构法人/经营者证件号码。OrganizationType 为 ENTERPRISE、INDIVIDUALBIZ 时，此项必填，其他情况选填
     * @param LegalIdCardNumber 机构法人/经营者证件号码。OrganizationType 为 ENTERPRISE、INDIVIDUALBIZ 时，此项必填，其他情况选填
     */
    public void setLegalIdCardNumber(String LegalIdCardNumber) {
        this.LegalIdCardNumber = LegalIdCardNumber;
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

    public ModifySubOrganizationInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifySubOrganizationInfoRequest(ModifySubOrganizationInfoRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.OpenId != null) {
            this.OpenId = new String(source.OpenId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.OrganizationType != null) {
            this.OrganizationType = new String(source.OrganizationType);
        }
        if (source.BizLicenseFile != null) {
            this.BizLicenseFile = new String(source.BizLicenseFile);
        }
        if (source.BizLicenseFileName != null) {
            this.BizLicenseFileName = new String(source.BizLicenseFileName);
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
        if (source.LegalMobile != null) {
            this.LegalMobile = new String(source.LegalMobile);
        }
        if (source.ContactName != null) {
            this.ContactName = new String(source.ContactName);
        }
        if (source.ContactAddress != null) {
            this.ContactAddress = new Address(source.ContactAddress);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "OrganizationType", this.OrganizationType);
        this.setParamSimple(map, prefix + "BizLicenseFile", this.BizLicenseFile);
        this.setParamSimple(map, prefix + "BizLicenseFileName", this.BizLicenseFileName);
        this.setParamSimple(map, prefix + "LegalName", this.LegalName);
        this.setParamSimple(map, prefix + "LegalIdCardType", this.LegalIdCardType);
        this.setParamSimple(map, prefix + "LegalIdCardNumber", this.LegalIdCardNumber);
        this.setParamSimple(map, prefix + "LegalMobile", this.LegalMobile);
        this.setParamSimple(map, prefix + "ContactName", this.ContactName);
        this.setParamObj(map, prefix + "ContactAddress.", this.ContactAddress);
        this.setParamSimple(map, prefix + "Email", this.Email);

    }
}

