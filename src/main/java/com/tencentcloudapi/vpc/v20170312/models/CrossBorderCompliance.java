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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CrossBorderCompliance extends AbstractModel{

    /**
    * 服务商，可选值：`UNICOM`。
    */
    @SerializedName("ServiceProvider")
    @Expose
    private String ServiceProvider;

    /**
    * 合规化审批单`ID`。
    */
    @SerializedName("ComplianceId")
    @Expose
    private Long ComplianceId;

    /**
    * 公司全称。
    */
    @SerializedName("Company")
    @Expose
    private String Company;

    /**
    * 统一社会信用代码。
    */
    @SerializedName("UniformSocialCreditCode")
    @Expose
    private String UniformSocialCreditCode;

    /**
    * 法定代表人。
    */
    @SerializedName("LegalPerson")
    @Expose
    private String LegalPerson;

    /**
    * 发证机关。
    */
    @SerializedName("IssuingAuthority")
    @Expose
    private String IssuingAuthority;

    /**
    * 营业执照。
    */
    @SerializedName("BusinessLicense")
    @Expose
    private String BusinessLicense;

    /**
    * 营业执照住所。
    */
    @SerializedName("BusinessAddress")
    @Expose
    private String BusinessAddress;

    /**
    * 邮编。
    */
    @SerializedName("PostCode")
    @Expose
    private Long PostCode;

    /**
    * 经办人。
    */
    @SerializedName("Manager")
    @Expose
    private String Manager;

    /**
    * 经办人身份证号。
    */
    @SerializedName("ManagerId")
    @Expose
    private String ManagerId;

    /**
    * 经办人身份证。
    */
    @SerializedName("ManagerIdCard")
    @Expose
    private String ManagerIdCard;

    /**
    * 经办人身份证地址。
    */
    @SerializedName("ManagerAddress")
    @Expose
    private String ManagerAddress;

    /**
    * 经办人联系电话。
    */
    @SerializedName("ManagerTelephone")
    @Expose
    private String ManagerTelephone;

    /**
    * 电子邮箱。
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 服务受理单。
    */
    @SerializedName("ServiceHandlingForm")
    @Expose
    private String ServiceHandlingForm;

    /**
    * 授权函。
    */
    @SerializedName("AuthorizationLetter")
    @Expose
    private String AuthorizationLetter;

    /**
    * 信息安全承诺书。
    */
    @SerializedName("SafetyCommitment")
    @Expose
    private String SafetyCommitment;

    /**
    * 服务开始时间。
    */
    @SerializedName("ServiceStartDate")
    @Expose
    private String ServiceStartDate;

    /**
    * 服务截止时间。
    */
    @SerializedName("ServiceEndDate")
    @Expose
    private String ServiceEndDate;

    /**
    * 状态。待审批：`PENDING`，已通过：`APPROVED`，已拒绝：`DENY`。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 审批单创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get 服务商，可选值：`UNICOM`。 
     * @return ServiceProvider 服务商，可选值：`UNICOM`。
     */
    public String getServiceProvider() {
        return this.ServiceProvider;
    }

    /**
     * Set 服务商，可选值：`UNICOM`。
     * @param ServiceProvider 服务商，可选值：`UNICOM`。
     */
    public void setServiceProvider(String ServiceProvider) {
        this.ServiceProvider = ServiceProvider;
    }

    /**
     * Get 合规化审批单`ID`。 
     * @return ComplianceId 合规化审批单`ID`。
     */
    public Long getComplianceId() {
        return this.ComplianceId;
    }

    /**
     * Set 合规化审批单`ID`。
     * @param ComplianceId 合规化审批单`ID`。
     */
    public void setComplianceId(Long ComplianceId) {
        this.ComplianceId = ComplianceId;
    }

    /**
     * Get 公司全称。 
     * @return Company 公司全称。
     */
    public String getCompany() {
        return this.Company;
    }

    /**
     * Set 公司全称。
     * @param Company 公司全称。
     */
    public void setCompany(String Company) {
        this.Company = Company;
    }

    /**
     * Get 统一社会信用代码。 
     * @return UniformSocialCreditCode 统一社会信用代码。
     */
    public String getUniformSocialCreditCode() {
        return this.UniformSocialCreditCode;
    }

    /**
     * Set 统一社会信用代码。
     * @param UniformSocialCreditCode 统一社会信用代码。
     */
    public void setUniformSocialCreditCode(String UniformSocialCreditCode) {
        this.UniformSocialCreditCode = UniformSocialCreditCode;
    }

    /**
     * Get 法定代表人。 
     * @return LegalPerson 法定代表人。
     */
    public String getLegalPerson() {
        return this.LegalPerson;
    }

    /**
     * Set 法定代表人。
     * @param LegalPerson 法定代表人。
     */
    public void setLegalPerson(String LegalPerson) {
        this.LegalPerson = LegalPerson;
    }

    /**
     * Get 发证机关。 
     * @return IssuingAuthority 发证机关。
     */
    public String getIssuingAuthority() {
        return this.IssuingAuthority;
    }

    /**
     * Set 发证机关。
     * @param IssuingAuthority 发证机关。
     */
    public void setIssuingAuthority(String IssuingAuthority) {
        this.IssuingAuthority = IssuingAuthority;
    }

    /**
     * Get 营业执照。 
     * @return BusinessLicense 营业执照。
     */
    public String getBusinessLicense() {
        return this.BusinessLicense;
    }

    /**
     * Set 营业执照。
     * @param BusinessLicense 营业执照。
     */
    public void setBusinessLicense(String BusinessLicense) {
        this.BusinessLicense = BusinessLicense;
    }

    /**
     * Get 营业执照住所。 
     * @return BusinessAddress 营业执照住所。
     */
    public String getBusinessAddress() {
        return this.BusinessAddress;
    }

    /**
     * Set 营业执照住所。
     * @param BusinessAddress 营业执照住所。
     */
    public void setBusinessAddress(String BusinessAddress) {
        this.BusinessAddress = BusinessAddress;
    }

    /**
     * Get 邮编。 
     * @return PostCode 邮编。
     */
    public Long getPostCode() {
        return this.PostCode;
    }

    /**
     * Set 邮编。
     * @param PostCode 邮编。
     */
    public void setPostCode(Long PostCode) {
        this.PostCode = PostCode;
    }

    /**
     * Get 经办人。 
     * @return Manager 经办人。
     */
    public String getManager() {
        return this.Manager;
    }

    /**
     * Set 经办人。
     * @param Manager 经办人。
     */
    public void setManager(String Manager) {
        this.Manager = Manager;
    }

    /**
     * Get 经办人身份证号。 
     * @return ManagerId 经办人身份证号。
     */
    public String getManagerId() {
        return this.ManagerId;
    }

    /**
     * Set 经办人身份证号。
     * @param ManagerId 经办人身份证号。
     */
    public void setManagerId(String ManagerId) {
        this.ManagerId = ManagerId;
    }

    /**
     * Get 经办人身份证。 
     * @return ManagerIdCard 经办人身份证。
     */
    public String getManagerIdCard() {
        return this.ManagerIdCard;
    }

    /**
     * Set 经办人身份证。
     * @param ManagerIdCard 经办人身份证。
     */
    public void setManagerIdCard(String ManagerIdCard) {
        this.ManagerIdCard = ManagerIdCard;
    }

    /**
     * Get 经办人身份证地址。 
     * @return ManagerAddress 经办人身份证地址。
     */
    public String getManagerAddress() {
        return this.ManagerAddress;
    }

    /**
     * Set 经办人身份证地址。
     * @param ManagerAddress 经办人身份证地址。
     */
    public void setManagerAddress(String ManagerAddress) {
        this.ManagerAddress = ManagerAddress;
    }

    /**
     * Get 经办人联系电话。 
     * @return ManagerTelephone 经办人联系电话。
     */
    public String getManagerTelephone() {
        return this.ManagerTelephone;
    }

    /**
     * Set 经办人联系电话。
     * @param ManagerTelephone 经办人联系电话。
     */
    public void setManagerTelephone(String ManagerTelephone) {
        this.ManagerTelephone = ManagerTelephone;
    }

    /**
     * Get 电子邮箱。 
     * @return Email 电子邮箱。
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 电子邮箱。
     * @param Email 电子邮箱。
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 服务受理单。 
     * @return ServiceHandlingForm 服务受理单。
     */
    public String getServiceHandlingForm() {
        return this.ServiceHandlingForm;
    }

    /**
     * Set 服务受理单。
     * @param ServiceHandlingForm 服务受理单。
     */
    public void setServiceHandlingForm(String ServiceHandlingForm) {
        this.ServiceHandlingForm = ServiceHandlingForm;
    }

    /**
     * Get 授权函。 
     * @return AuthorizationLetter 授权函。
     */
    public String getAuthorizationLetter() {
        return this.AuthorizationLetter;
    }

    /**
     * Set 授权函。
     * @param AuthorizationLetter 授权函。
     */
    public void setAuthorizationLetter(String AuthorizationLetter) {
        this.AuthorizationLetter = AuthorizationLetter;
    }

    /**
     * Get 信息安全承诺书。 
     * @return SafetyCommitment 信息安全承诺书。
     */
    public String getSafetyCommitment() {
        return this.SafetyCommitment;
    }

    /**
     * Set 信息安全承诺书。
     * @param SafetyCommitment 信息安全承诺书。
     */
    public void setSafetyCommitment(String SafetyCommitment) {
        this.SafetyCommitment = SafetyCommitment;
    }

    /**
     * Get 服务开始时间。 
     * @return ServiceStartDate 服务开始时间。
     */
    public String getServiceStartDate() {
        return this.ServiceStartDate;
    }

    /**
     * Set 服务开始时间。
     * @param ServiceStartDate 服务开始时间。
     */
    public void setServiceStartDate(String ServiceStartDate) {
        this.ServiceStartDate = ServiceStartDate;
    }

    /**
     * Get 服务截止时间。 
     * @return ServiceEndDate 服务截止时间。
     */
    public String getServiceEndDate() {
        return this.ServiceEndDate;
    }

    /**
     * Set 服务截止时间。
     * @param ServiceEndDate 服务截止时间。
     */
    public void setServiceEndDate(String ServiceEndDate) {
        this.ServiceEndDate = ServiceEndDate;
    }

    /**
     * Get 状态。待审批：`PENDING`，已通过：`APPROVED`，已拒绝：`DENY`。 
     * @return State 状态。待审批：`PENDING`，已通过：`APPROVED`，已拒绝：`DENY`。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 状态。待审批：`PENDING`，已通过：`APPROVED`，已拒绝：`DENY`。
     * @param State 状态。待审批：`PENDING`，已通过：`APPROVED`，已拒绝：`DENY`。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 审批单创建时间。 
     * @return CreatedTime 审批单创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 审批单创建时间。
     * @param CreatedTime 审批单创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceProvider", this.ServiceProvider);
        this.setParamSimple(map, prefix + "ComplianceId", this.ComplianceId);
        this.setParamSimple(map, prefix + "Company", this.Company);
        this.setParamSimple(map, prefix + "UniformSocialCreditCode", this.UniformSocialCreditCode);
        this.setParamSimple(map, prefix + "LegalPerson", this.LegalPerson);
        this.setParamSimple(map, prefix + "IssuingAuthority", this.IssuingAuthority);
        this.setParamSimple(map, prefix + "BusinessLicense", this.BusinessLicense);
        this.setParamSimple(map, prefix + "BusinessAddress", this.BusinessAddress);
        this.setParamSimple(map, prefix + "PostCode", this.PostCode);
        this.setParamSimple(map, prefix + "Manager", this.Manager);
        this.setParamSimple(map, prefix + "ManagerId", this.ManagerId);
        this.setParamSimple(map, prefix + "ManagerIdCard", this.ManagerIdCard);
        this.setParamSimple(map, prefix + "ManagerAddress", this.ManagerAddress);
        this.setParamSimple(map, prefix + "ManagerTelephone", this.ManagerTelephone);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "ServiceHandlingForm", this.ServiceHandlingForm);
        this.setParamSimple(map, prefix + "AuthorizationLetter", this.AuthorizationLetter);
        this.setParamSimple(map, prefix + "SafetyCommitment", this.SafetyCommitment);
        this.setParamSimple(map, prefix + "ServiceStartDate", this.ServiceStartDate);
        this.setParamSimple(map, prefix + "ServiceEndDate", this.ServiceEndDate);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

