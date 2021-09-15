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

public class SubOrganizationDetail extends AbstractModel{

    /**
    * 组织ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 机构名称全称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 机构电子邮箱
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 机构证件号码类型
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
    * 机构类型
    */
    @SerializedName("OrganizationType")
    @Expose
    private String OrganizationType;

    /**
    * 机构证件文件类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdCardFileType")
    @Expose
    private String IdCardFileType;

    /**
    * 机构证件照片文件，base64编码
注意：此字段可能返回 null，表示取不到有效值。
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
    * 机构法人/经营者证件类型
    */
    @SerializedName("LegalIdCardType")
    @Expose
    private String LegalIdCardType;

    /**
    * 机构法人/经营者证件号码
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContactName")
    @Expose
    private String ContactName;

    /**
    * 机构实名状态
    */
    @SerializedName("VerifyStatus")
    @Expose
    private String VerifyStatus;

    /**
    * 机构通过实名时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VerifiedOn")
    @Expose
    private Long VerifiedOn;

    /**
    * 机构创建时间
    */
    @SerializedName("CreatedOn")
    @Expose
    private Long CreatedOn;

    /**
    * 机构更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedOn")
    @Expose
    private Long UpdatedOn;

    /**
    * 实名认证的客户端IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VerifyClientIp")
    @Expose
    private String VerifyClientIp;

    /**
    * 实名认证的服务器IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VerifyServerIp")
    @Expose
    private String VerifyServerIp;

    /**
    * 企业联系地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContactAddress")
    @Expose
    private Address ContactAddress;

    /**
     * Get 组织ID 
     * @return Id 组织ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 组织ID
     * @param Id 组织ID
     */
    public void setId(String Id) {
        this.Id = Id;
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
     * Get 机构证件号码类型 
     * @return IdCardType 机构证件号码类型
     */
    public String getIdCardType() {
        return this.IdCardType;
    }

    /**
     * Set 机构证件号码类型
     * @param IdCardType 机构证件号码类型
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
     * Get 机构类型 
     * @return OrganizationType 机构类型
     */
    public String getOrganizationType() {
        return this.OrganizationType;
    }

    /**
     * Set 机构类型
     * @param OrganizationType 机构类型
     */
    public void setOrganizationType(String OrganizationType) {
        this.OrganizationType = OrganizationType;
    }

    /**
     * Get 机构证件文件类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdCardFileType 机构证件文件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdCardFileType() {
        return this.IdCardFileType;
    }

    /**
     * Set 机构证件文件类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdCardFileType 机构证件文件类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdCardFileType(String IdCardFileType) {
        this.IdCardFileType = IdCardFileType;
    }

    /**
     * Get 机构证件照片文件，base64编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizLicenseFile 机构证件照片文件，base64编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBizLicenseFile() {
        return this.BizLicenseFile;
    }

    /**
     * Set 机构证件照片文件，base64编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizLicenseFile 机构证件照片文件，base64编码
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get 机构法人/经营者证件类型 
     * @return LegalIdCardType 机构法人/经营者证件类型
     */
    public String getLegalIdCardType() {
        return this.LegalIdCardType;
    }

    /**
     * Set 机构法人/经营者证件类型
     * @param LegalIdCardType 机构法人/经营者证件类型
     */
    public void setLegalIdCardType(String LegalIdCardType) {
        this.LegalIdCardType = LegalIdCardType;
    }

    /**
     * Get 机构法人/经营者证件号码 
     * @return LegalIdCardNumber 机构法人/经营者证件号码
     */
    public String getLegalIdCardNumber() {
        return this.LegalIdCardNumber;
    }

    /**
     * Set 机构法人/经营者证件号码
     * @param LegalIdCardNumber 机构法人/经营者证件号码
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContactName 组织联系人姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContactName() {
        return this.ContactName;
    }

    /**
     * Set 组织联系人姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContactName 组织联系人姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContactName(String ContactName) {
        this.ContactName = ContactName;
    }

    /**
     * Get 机构实名状态 
     * @return VerifyStatus 机构实名状态
     */
    public String getVerifyStatus() {
        return this.VerifyStatus;
    }

    /**
     * Set 机构实名状态
     * @param VerifyStatus 机构实名状态
     */
    public void setVerifyStatus(String VerifyStatus) {
        this.VerifyStatus = VerifyStatus;
    }

    /**
     * Get 机构通过实名时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VerifiedOn 机构通过实名时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVerifiedOn() {
        return this.VerifiedOn;
    }

    /**
     * Set 机构通过实名时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param VerifiedOn 机构通过实名时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVerifiedOn(Long VerifiedOn) {
        this.VerifiedOn = VerifiedOn;
    }

    /**
     * Get 机构创建时间 
     * @return CreatedOn 机构创建时间
     */
    public Long getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 机构创建时间
     * @param CreatedOn 机构创建时间
     */
    public void setCreatedOn(Long CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 机构更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedOn 机构更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set 机构更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedOn 机构更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedOn(Long UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    /**
     * Get 实名认证的客户端IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VerifyClientIp 实名认证的客户端IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVerifyClientIp() {
        return this.VerifyClientIp;
    }

    /**
     * Set 实名认证的客户端IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param VerifyClientIp 实名认证的客户端IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVerifyClientIp(String VerifyClientIp) {
        this.VerifyClientIp = VerifyClientIp;
    }

    /**
     * Get 实名认证的服务器IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VerifyServerIp 实名认证的服务器IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVerifyServerIp() {
        return this.VerifyServerIp;
    }

    /**
     * Set 实名认证的服务器IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param VerifyServerIp 实名认证的服务器IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVerifyServerIp(String VerifyServerIp) {
        this.VerifyServerIp = VerifyServerIp;
    }

    /**
     * Get 企业联系地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContactAddress 企业联系地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Address getContactAddress() {
        return this.ContactAddress;
    }

    /**
     * Set 企业联系地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContactAddress 企业联系地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContactAddress(Address ContactAddress) {
        this.ContactAddress = ContactAddress;
    }

    public SubOrganizationDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubOrganizationDetail(SubOrganizationDetail source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
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
        if (source.IdCardFileType != null) {
            this.IdCardFileType = new String(source.IdCardFileType);
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
        if (source.VerifyStatus != null) {
            this.VerifyStatus = new String(source.VerifyStatus);
        }
        if (source.VerifiedOn != null) {
            this.VerifiedOn = new Long(source.VerifiedOn);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new Long(source.CreatedOn);
        }
        if (source.UpdatedOn != null) {
            this.UpdatedOn = new Long(source.UpdatedOn);
        }
        if (source.VerifyClientIp != null) {
            this.VerifyClientIp = new String(source.VerifyClientIp);
        }
        if (source.VerifyServerIp != null) {
            this.VerifyServerIp = new String(source.VerifyServerIp);
        }
        if (source.ContactAddress != null) {
            this.ContactAddress = new Address(source.ContactAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "IdCardType", this.IdCardType);
        this.setParamSimple(map, prefix + "IdCardNumber", this.IdCardNumber);
        this.setParamSimple(map, prefix + "OrganizationType", this.OrganizationType);
        this.setParamSimple(map, prefix + "IdCardFileType", this.IdCardFileType);
        this.setParamSimple(map, prefix + "BizLicenseFile", this.BizLicenseFile);
        this.setParamSimple(map, prefix + "BizLicenseFileName", this.BizLicenseFileName);
        this.setParamSimple(map, prefix + "LegalName", this.LegalName);
        this.setParamSimple(map, prefix + "LegalIdCardType", this.LegalIdCardType);
        this.setParamSimple(map, prefix + "LegalIdCardNumber", this.LegalIdCardNumber);
        this.setParamSimple(map, prefix + "LegalMobile", this.LegalMobile);
        this.setParamSimple(map, prefix + "ContactName", this.ContactName);
        this.setParamSimple(map, prefix + "VerifyStatus", this.VerifyStatus);
        this.setParamSimple(map, prefix + "VerifiedOn", this.VerifiedOn);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);
        this.setParamSimple(map, prefix + "VerifyClientIp", this.VerifyClientIp);
        this.setParamSimple(map, prefix + "VerifyServerIp", this.VerifyServerIp);
        this.setParamObj(map, prefix + "ContactAddress.", this.ContactAddress);

    }
}

