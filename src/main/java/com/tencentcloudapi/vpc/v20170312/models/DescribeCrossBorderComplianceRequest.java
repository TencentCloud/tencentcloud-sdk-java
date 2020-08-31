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

public class DescribeCrossBorderComplianceRequest extends AbstractModel{

    /**
    * （精确匹配）服务商，可选值：`UNICOM`。
    */
    @SerializedName("ServiceProvider")
    @Expose
    private String ServiceProvider;

    /**
    * （精确匹配）合规化审批单`ID`。
    */
    @SerializedName("ComplianceId")
    @Expose
    private Long ComplianceId;

    /**
    * （模糊查询）公司名称。
    */
    @SerializedName("Company")
    @Expose
    private String Company;

    /**
    * （精确匹配）统一社会信用代码。
    */
    @SerializedName("UniformSocialCreditCode")
    @Expose
    private String UniformSocialCreditCode;

    /**
    * （模糊查询）法定代表人。
    */
    @SerializedName("LegalPerson")
    @Expose
    private String LegalPerson;

    /**
    * （模糊查询）发证机关。
    */
    @SerializedName("IssuingAuthority")
    @Expose
    private String IssuingAuthority;

    /**
    * （模糊查询）营业执照住所。
    */
    @SerializedName("BusinessAddress")
    @Expose
    private String BusinessAddress;

    /**
    * （精确匹配）邮编。
    */
    @SerializedName("PostCode")
    @Expose
    private Long PostCode;

    /**
    * （模糊查询）经办人。
    */
    @SerializedName("Manager")
    @Expose
    private String Manager;

    /**
    * （精确查询）经办人身份证号。
    */
    @SerializedName("ManagerId")
    @Expose
    private String ManagerId;

    /**
    * （模糊查询）经办人身份证地址。
    */
    @SerializedName("ManagerAddress")
    @Expose
    private String ManagerAddress;

    /**
    * （精确匹配）经办人联系电话。
    */
    @SerializedName("ManagerTelephone")
    @Expose
    private String ManagerTelephone;

    /**
    * （精确匹配）电子邮箱。
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * （精确匹配）服务开始日期，如：`2020-07-28`。
    */
    @SerializedName("ServiceStartDate")
    @Expose
    private String ServiceStartDate;

    /**
    * （精确匹配）服务结束日期，如：`2021-07-28`。
    */
    @SerializedName("ServiceEndDate")
    @Expose
    private String ServiceEndDate;

    /**
    * （精确匹配）状态。待审批：`PENDING`，通过：`APPROVED `，拒绝：`DENY`。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
     * Get （精确匹配）服务商，可选值：`UNICOM`。 
     * @return ServiceProvider （精确匹配）服务商，可选值：`UNICOM`。
     */
    public String getServiceProvider() {
        return this.ServiceProvider;
    }

    /**
     * Set （精确匹配）服务商，可选值：`UNICOM`。
     * @param ServiceProvider （精确匹配）服务商，可选值：`UNICOM`。
     */
    public void setServiceProvider(String ServiceProvider) {
        this.ServiceProvider = ServiceProvider;
    }

    /**
     * Get （精确匹配）合规化审批单`ID`。 
     * @return ComplianceId （精确匹配）合规化审批单`ID`。
     */
    public Long getComplianceId() {
        return this.ComplianceId;
    }

    /**
     * Set （精确匹配）合规化审批单`ID`。
     * @param ComplianceId （精确匹配）合规化审批单`ID`。
     */
    public void setComplianceId(Long ComplianceId) {
        this.ComplianceId = ComplianceId;
    }

    /**
     * Get （模糊查询）公司名称。 
     * @return Company （模糊查询）公司名称。
     */
    public String getCompany() {
        return this.Company;
    }

    /**
     * Set （模糊查询）公司名称。
     * @param Company （模糊查询）公司名称。
     */
    public void setCompany(String Company) {
        this.Company = Company;
    }

    /**
     * Get （精确匹配）统一社会信用代码。 
     * @return UniformSocialCreditCode （精确匹配）统一社会信用代码。
     */
    public String getUniformSocialCreditCode() {
        return this.UniformSocialCreditCode;
    }

    /**
     * Set （精确匹配）统一社会信用代码。
     * @param UniformSocialCreditCode （精确匹配）统一社会信用代码。
     */
    public void setUniformSocialCreditCode(String UniformSocialCreditCode) {
        this.UniformSocialCreditCode = UniformSocialCreditCode;
    }

    /**
     * Get （模糊查询）法定代表人。 
     * @return LegalPerson （模糊查询）法定代表人。
     */
    public String getLegalPerson() {
        return this.LegalPerson;
    }

    /**
     * Set （模糊查询）法定代表人。
     * @param LegalPerson （模糊查询）法定代表人。
     */
    public void setLegalPerson(String LegalPerson) {
        this.LegalPerson = LegalPerson;
    }

    /**
     * Get （模糊查询）发证机关。 
     * @return IssuingAuthority （模糊查询）发证机关。
     */
    public String getIssuingAuthority() {
        return this.IssuingAuthority;
    }

    /**
     * Set （模糊查询）发证机关。
     * @param IssuingAuthority （模糊查询）发证机关。
     */
    public void setIssuingAuthority(String IssuingAuthority) {
        this.IssuingAuthority = IssuingAuthority;
    }

    /**
     * Get （模糊查询）营业执照住所。 
     * @return BusinessAddress （模糊查询）营业执照住所。
     */
    public String getBusinessAddress() {
        return this.BusinessAddress;
    }

    /**
     * Set （模糊查询）营业执照住所。
     * @param BusinessAddress （模糊查询）营业执照住所。
     */
    public void setBusinessAddress(String BusinessAddress) {
        this.BusinessAddress = BusinessAddress;
    }

    /**
     * Get （精确匹配）邮编。 
     * @return PostCode （精确匹配）邮编。
     */
    public Long getPostCode() {
        return this.PostCode;
    }

    /**
     * Set （精确匹配）邮编。
     * @param PostCode （精确匹配）邮编。
     */
    public void setPostCode(Long PostCode) {
        this.PostCode = PostCode;
    }

    /**
     * Get （模糊查询）经办人。 
     * @return Manager （模糊查询）经办人。
     */
    public String getManager() {
        return this.Manager;
    }

    /**
     * Set （模糊查询）经办人。
     * @param Manager （模糊查询）经办人。
     */
    public void setManager(String Manager) {
        this.Manager = Manager;
    }

    /**
     * Get （精确查询）经办人身份证号。 
     * @return ManagerId （精确查询）经办人身份证号。
     */
    public String getManagerId() {
        return this.ManagerId;
    }

    /**
     * Set （精确查询）经办人身份证号。
     * @param ManagerId （精确查询）经办人身份证号。
     */
    public void setManagerId(String ManagerId) {
        this.ManagerId = ManagerId;
    }

    /**
     * Get （模糊查询）经办人身份证地址。 
     * @return ManagerAddress （模糊查询）经办人身份证地址。
     */
    public String getManagerAddress() {
        return this.ManagerAddress;
    }

    /**
     * Set （模糊查询）经办人身份证地址。
     * @param ManagerAddress （模糊查询）经办人身份证地址。
     */
    public void setManagerAddress(String ManagerAddress) {
        this.ManagerAddress = ManagerAddress;
    }

    /**
     * Get （精确匹配）经办人联系电话。 
     * @return ManagerTelephone （精确匹配）经办人联系电话。
     */
    public String getManagerTelephone() {
        return this.ManagerTelephone;
    }

    /**
     * Set （精确匹配）经办人联系电话。
     * @param ManagerTelephone （精确匹配）经办人联系电话。
     */
    public void setManagerTelephone(String ManagerTelephone) {
        this.ManagerTelephone = ManagerTelephone;
    }

    /**
     * Get （精确匹配）电子邮箱。 
     * @return Email （精确匹配）电子邮箱。
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set （精确匹配）电子邮箱。
     * @param Email （精确匹配）电子邮箱。
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get （精确匹配）服务开始日期，如：`2020-07-28`。 
     * @return ServiceStartDate （精确匹配）服务开始日期，如：`2020-07-28`。
     */
    public String getServiceStartDate() {
        return this.ServiceStartDate;
    }

    /**
     * Set （精确匹配）服务开始日期，如：`2020-07-28`。
     * @param ServiceStartDate （精确匹配）服务开始日期，如：`2020-07-28`。
     */
    public void setServiceStartDate(String ServiceStartDate) {
        this.ServiceStartDate = ServiceStartDate;
    }

    /**
     * Get （精确匹配）服务结束日期，如：`2021-07-28`。 
     * @return ServiceEndDate （精确匹配）服务结束日期，如：`2021-07-28`。
     */
    public String getServiceEndDate() {
        return this.ServiceEndDate;
    }

    /**
     * Set （精确匹配）服务结束日期，如：`2021-07-28`。
     * @param ServiceEndDate （精确匹配）服务结束日期，如：`2021-07-28`。
     */
    public void setServiceEndDate(String ServiceEndDate) {
        this.ServiceEndDate = ServiceEndDate;
    }

    /**
     * Get （精确匹配）状态。待审批：`PENDING`，通过：`APPROVED `，拒绝：`DENY`。 
     * @return State （精确匹配）状态。待审批：`PENDING`，通过：`APPROVED `，拒绝：`DENY`。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set （精确匹配）状态。待审批：`PENDING`，通过：`APPROVED `，拒绝：`DENY`。
     * @param State （精确匹配）状态。待审批：`PENDING`，通过：`APPROVED `，拒绝：`DENY`。
     */
    public void setState(String State) {
        this.State = State;
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
        this.setParamSimple(map, prefix + "BusinessAddress", this.BusinessAddress);
        this.setParamSimple(map, prefix + "PostCode", this.PostCode);
        this.setParamSimple(map, prefix + "Manager", this.Manager);
        this.setParamSimple(map, prefix + "ManagerId", this.ManagerId);
        this.setParamSimple(map, prefix + "ManagerAddress", this.ManagerAddress);
        this.setParamSimple(map, prefix + "ManagerTelephone", this.ManagerTelephone);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "ServiceStartDate", this.ServiceStartDate);
        this.setParamSimple(map, prefix + "ServiceEndDate", this.ServiceEndDate);
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

