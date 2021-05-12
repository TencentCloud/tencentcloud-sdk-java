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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemplateInfo extends AbstractModel{

    /**
    * 模板ID
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 认证状态：未实名认证:NotUpload, 实名审核中:InAudit，已实名认证:Approved，实名审核失败:Reject
    */
    @SerializedName("AuditStatus")
    @Expose
    private String AuditStatus;

    /**
    * 创建时间
    */
    @SerializedName("CreatedOn")
    @Expose
    private String CreatedOn;

    /**
    * 更新时间
    */
    @SerializedName("UpdatedOn")
    @Expose
    private String UpdatedOn;

    /**
    * 用户UIN
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * 是否是默认模板: 是:yes，否:no
    */
    @SerializedName("IsDefault")
    @Expose
    private String IsDefault;

    /**
    * 认证失败原因
    */
    @SerializedName("AuditReason")
    @Expose
    private String AuditReason;

    /**
    * 认证信息
    */
    @SerializedName("CertificateInfo")
    @Expose
    private CertificateInfo CertificateInfo;

    /**
    * 联系人信息
    */
    @SerializedName("ContactInfo")
    @Expose
    private ContactInfo ContactInfo;

    /**
    * 模板是否符合规范， 1是 0 否
    */
    @SerializedName("IsValidTemplate")
    @Expose
    private Long IsValidTemplate;

    /**
    * 不符合规范原因
    */
    @SerializedName("InvalidReason")
    @Expose
    private String InvalidReason;

    /**
     * Get 模板ID 
     * @return TemplateId 模板ID
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板ID
     * @param TemplateId 模板ID
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 认证状态：未实名认证:NotUpload, 实名审核中:InAudit，已实名认证:Approved，实名审核失败:Reject 
     * @return AuditStatus 认证状态：未实名认证:NotUpload, 实名审核中:InAudit，已实名认证:Approved，实名审核失败:Reject
     */
    public String getAuditStatus() {
        return this.AuditStatus;
    }

    /**
     * Set 认证状态：未实名认证:NotUpload, 实名审核中:InAudit，已实名认证:Approved，实名审核失败:Reject
     * @param AuditStatus 认证状态：未实名认证:NotUpload, 实名审核中:InAudit，已实名认证:Approved，实名审核失败:Reject
     */
    public void setAuditStatus(String AuditStatus) {
        this.AuditStatus = AuditStatus;
    }

    /**
     * Get 创建时间 
     * @return CreatedOn 创建时间
     */
    public String getCreatedOn() {
        return this.CreatedOn;
    }

    /**
     * Set 创建时间
     * @param CreatedOn 创建时间
     */
    public void setCreatedOn(String CreatedOn) {
        this.CreatedOn = CreatedOn;
    }

    /**
     * Get 更新时间 
     * @return UpdatedOn 更新时间
     */
    public String getUpdatedOn() {
        return this.UpdatedOn;
    }

    /**
     * Set 更新时间
     * @param UpdatedOn 更新时间
     */
    public void setUpdatedOn(String UpdatedOn) {
        this.UpdatedOn = UpdatedOn;
    }

    /**
     * Get 用户UIN 
     * @return UserUin 用户UIN
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set 用户UIN
     * @param UserUin 用户UIN
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get 是否是默认模板: 是:yes，否:no 
     * @return IsDefault 是否是默认模板: 是:yes，否:no
     */
    public String getIsDefault() {
        return this.IsDefault;
    }

    /**
     * Set 是否是默认模板: 是:yes，否:no
     * @param IsDefault 是否是默认模板: 是:yes，否:no
     */
    public void setIsDefault(String IsDefault) {
        this.IsDefault = IsDefault;
    }

    /**
     * Get 认证失败原因 
     * @return AuditReason 认证失败原因
     */
    public String getAuditReason() {
        return this.AuditReason;
    }

    /**
     * Set 认证失败原因
     * @param AuditReason 认证失败原因
     */
    public void setAuditReason(String AuditReason) {
        this.AuditReason = AuditReason;
    }

    /**
     * Get 认证信息 
     * @return CertificateInfo 认证信息
     */
    public CertificateInfo getCertificateInfo() {
        return this.CertificateInfo;
    }

    /**
     * Set 认证信息
     * @param CertificateInfo 认证信息
     */
    public void setCertificateInfo(CertificateInfo CertificateInfo) {
        this.CertificateInfo = CertificateInfo;
    }

    /**
     * Get 联系人信息 
     * @return ContactInfo 联系人信息
     */
    public ContactInfo getContactInfo() {
        return this.ContactInfo;
    }

    /**
     * Set 联系人信息
     * @param ContactInfo 联系人信息
     */
    public void setContactInfo(ContactInfo ContactInfo) {
        this.ContactInfo = ContactInfo;
    }

    /**
     * Get 模板是否符合规范， 1是 0 否 
     * @return IsValidTemplate 模板是否符合规范， 1是 0 否
     */
    public Long getIsValidTemplate() {
        return this.IsValidTemplate;
    }

    /**
     * Set 模板是否符合规范， 1是 0 否
     * @param IsValidTemplate 模板是否符合规范， 1是 0 否
     */
    public void setIsValidTemplate(Long IsValidTemplate) {
        this.IsValidTemplate = IsValidTemplate;
    }

    /**
     * Get 不符合规范原因 
     * @return InvalidReason 不符合规范原因
     */
    public String getInvalidReason() {
        return this.InvalidReason;
    }

    /**
     * Set 不符合规范原因
     * @param InvalidReason 不符合规范原因
     */
    public void setInvalidReason(String InvalidReason) {
        this.InvalidReason = InvalidReason;
    }

    public TemplateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplateInfo(TemplateInfo source) {
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.AuditStatus != null) {
            this.AuditStatus = new String(source.AuditStatus);
        }
        if (source.CreatedOn != null) {
            this.CreatedOn = new String(source.CreatedOn);
        }
        if (source.UpdatedOn != null) {
            this.UpdatedOn = new String(source.UpdatedOn);
        }
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
        if (source.IsDefault != null) {
            this.IsDefault = new String(source.IsDefault);
        }
        if (source.AuditReason != null) {
            this.AuditReason = new String(source.AuditReason);
        }
        if (source.CertificateInfo != null) {
            this.CertificateInfo = new CertificateInfo(source.CertificateInfo);
        }
        if (source.ContactInfo != null) {
            this.ContactInfo = new ContactInfo(source.ContactInfo);
        }
        if (source.IsValidTemplate != null) {
            this.IsValidTemplate = new Long(source.IsValidTemplate);
        }
        if (source.InvalidReason != null) {
            this.InvalidReason = new String(source.InvalidReason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "AuditStatus", this.AuditStatus);
        this.setParamSimple(map, prefix + "CreatedOn", this.CreatedOn);
        this.setParamSimple(map, prefix + "UpdatedOn", this.UpdatedOn);
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamSimple(map, prefix + "IsDefault", this.IsDefault);
        this.setParamSimple(map, prefix + "AuditReason", this.AuditReason);
        this.setParamObj(map, prefix + "CertificateInfo.", this.CertificateInfo);
        this.setParamObj(map, prefix + "ContactInfo.", this.ContactInfo);
        this.setParamSimple(map, prefix + "IsValidTemplate", this.IsValidTemplate);
        this.setParamSimple(map, prefix + "InvalidReason", this.InvalidReason);

    }
}

