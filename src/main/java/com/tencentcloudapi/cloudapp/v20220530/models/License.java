/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.cloudapp.v20220530.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class License extends AbstractModel {

    /**
    * <p>License ID</p>
    */
    @SerializedName("LicenseId")
    @Expose
    private String LicenseId;

    /**
    * <p>软件授权模式。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>Permanent</td><td>永久授权。该授权不受有效期限制。</td></tr><tr><td>Subscription</td><td>订阅授权。授权如果过了有效期，则会进入过期状态。</td></tr><tr><td>Accept</td><td>验收期授权。用于需要验收的软件处于验收期间的授权，授权如果过了验收有效期，则会进入过期状态。</td></tr></tbody></table></p>
    */
    @SerializedName("LicenseMode")
    @Expose
    private String LicenseMode;

    /**
    * <p>软件的授权状态。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>Issued</td><td>已颁发，等待激活。一般来说，如果软件已经在运行，不会出现该状态。</td></tr><tr><td>Active</td><td>授权在有效期内，这是软件运行期间最常见的状态。</td></tr><tr><td>Expired</td><td>授权已过期。订阅类的软件授权有有效期，如果服务器时间已晚于有效期，则会进入过期状态。</td></tr><tr><td>Isolated</td><td>授权已隔离。有截止日期的授权，当用户授权到期时，先进入此状态，用户可以去续费，超过7天不续费则授权进入Destroyed状态。</td></tr><tr><td>Destroyed</td><td>授权已失效/销毁。用户如果退货软件，则授权会自动失效。</td></tr></tbody></table></p>
    */
    @SerializedName("LicenseStatus")
    @Expose
    private String LicenseStatus;

    /**
    * <p>软件供应方 ID。</p>
    */
    @SerializedName("ProviderId")
    @Expose
    private Long ProviderId;

    /**
    * <p>软件包 ID。</p>
    */
    @SerializedName("SoftwarePackageId")
    @Expose
    private String SoftwarePackageId;

    /**
    * <p>软件包版本。</p>
    */
    @SerializedName("SoftwarePackageVersion")
    @Expose
    private String SoftwarePackageVersion;

    /**
    * <p>被授权的用户 UIN。</p>
    */
    @SerializedName("AuthorizedUserUin")
    @Expose
    private String AuthorizedUserUin;

    /**
    * <p>被授权的应用实例 ID。</p>
    */
    @SerializedName("AuthorizedCloudappId")
    @Expose
    private String AuthorizedCloudappId;

    /**
    * <p>被授权的角色 ID。</p>
    */
    @SerializedName("AuthorizedCloudappRoleId")
    @Expose
    private String AuthorizedCloudappRoleId;

    /**
    * <p>被授权的软件规格，具体字段请参考结构SaleParam</p>
    */
    @SerializedName("AuthorizedSpecification")
    @Expose
    private SaleParam [] AuthorizedSpecification;

    /**
    * <p>被授权的软件的计费模式。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>1</td><td>线上计费，软件的授权从腾讯云线上购买，支持续费、退款等操作。</td></tr><tr><td>2</td><td>线下计费，软件的授权线下签订合同购买，定向客户交付，无法从线上续费和退款。</td></tr><tr><td>4</td><td>免费</td></tr></tbody></table></p>
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
    * <p>授权时长（单位由LifeSpanUnit确定，枚举值有Y年/M月/D日三种）</p>
    */
    @SerializedName("LifeSpan")
    @Expose
    private Long LifeSpan;

    /**
    * <p>授权颁发时间。</p>
    */
    @SerializedName("IssueDate")
    @Expose
    private String IssueDate;

    /**
    * <p>授权激活时间，如从未激活则返回 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivationDate")
    @Expose
    private String ActivationDate;

    /**
    * <p>授权过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpirationDate")
    @Expose
    private String ExpirationDate;

    /**
    * <p>授权时长单位，枚举值有Y年/M月/D日三种</p>
    */
    @SerializedName("LifeSpanUnit")
    @Expose
    private String LifeSpanUnit;

    /**
    * <p>授权的类型：Standard正式版/Development开发版/Trial体验版</p>
    */
    @SerializedName("LicenseType")
    @Expose
    private String LicenseType;

    /**
    * <p>授权的层级：Master 主授权；Child 子授权/增强型授权</p>
    */
    @SerializedName("LicenseLevel")
    @Expose
    private String LicenseLevel;

    /**
     * Get <p>License ID</p> 
     * @return LicenseId <p>License ID</p>
     */
    public String getLicenseId() {
        return this.LicenseId;
    }

    /**
     * Set <p>License ID</p>
     * @param LicenseId <p>License ID</p>
     */
    public void setLicenseId(String LicenseId) {
        this.LicenseId = LicenseId;
    }

    /**
     * Get <p>软件授权模式。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>Permanent</td><td>永久授权。该授权不受有效期限制。</td></tr><tr><td>Subscription</td><td>订阅授权。授权如果过了有效期，则会进入过期状态。</td></tr><tr><td>Accept</td><td>验收期授权。用于需要验收的软件处于验收期间的授权，授权如果过了验收有效期，则会进入过期状态。</td></tr></tbody></table></p> 
     * @return LicenseMode <p>软件授权模式。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>Permanent</td><td>永久授权。该授权不受有效期限制。</td></tr><tr><td>Subscription</td><td>订阅授权。授权如果过了有效期，则会进入过期状态。</td></tr><tr><td>Accept</td><td>验收期授权。用于需要验收的软件处于验收期间的授权，授权如果过了验收有效期，则会进入过期状态。</td></tr></tbody></table></p>
     */
    public String getLicenseMode() {
        return this.LicenseMode;
    }

    /**
     * Set <p>软件授权模式。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>Permanent</td><td>永久授权。该授权不受有效期限制。</td></tr><tr><td>Subscription</td><td>订阅授权。授权如果过了有效期，则会进入过期状态。</td></tr><tr><td>Accept</td><td>验收期授权。用于需要验收的软件处于验收期间的授权，授权如果过了验收有效期，则会进入过期状态。</td></tr></tbody></table></p>
     * @param LicenseMode <p>软件授权模式。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>Permanent</td><td>永久授权。该授权不受有效期限制。</td></tr><tr><td>Subscription</td><td>订阅授权。授权如果过了有效期，则会进入过期状态。</td></tr><tr><td>Accept</td><td>验收期授权。用于需要验收的软件处于验收期间的授权，授权如果过了验收有效期，则会进入过期状态。</td></tr></tbody></table></p>
     */
    public void setLicenseMode(String LicenseMode) {
        this.LicenseMode = LicenseMode;
    }

    /**
     * Get <p>软件的授权状态。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>Issued</td><td>已颁发，等待激活。一般来说，如果软件已经在运行，不会出现该状态。</td></tr><tr><td>Active</td><td>授权在有效期内，这是软件运行期间最常见的状态。</td></tr><tr><td>Expired</td><td>授权已过期。订阅类的软件授权有有效期，如果服务器时间已晚于有效期，则会进入过期状态。</td></tr><tr><td>Isolated</td><td>授权已隔离。有截止日期的授权，当用户授权到期时，先进入此状态，用户可以去续费，超过7天不续费则授权进入Destroyed状态。</td></tr><tr><td>Destroyed</td><td>授权已失效/销毁。用户如果退货软件，则授权会自动失效。</td></tr></tbody></table></p> 
     * @return LicenseStatus <p>软件的授权状态。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>Issued</td><td>已颁发，等待激活。一般来说，如果软件已经在运行，不会出现该状态。</td></tr><tr><td>Active</td><td>授权在有效期内，这是软件运行期间最常见的状态。</td></tr><tr><td>Expired</td><td>授权已过期。订阅类的软件授权有有效期，如果服务器时间已晚于有效期，则会进入过期状态。</td></tr><tr><td>Isolated</td><td>授权已隔离。有截止日期的授权，当用户授权到期时，先进入此状态，用户可以去续费，超过7天不续费则授权进入Destroyed状态。</td></tr><tr><td>Destroyed</td><td>授权已失效/销毁。用户如果退货软件，则授权会自动失效。</td></tr></tbody></table></p>
     */
    public String getLicenseStatus() {
        return this.LicenseStatus;
    }

    /**
     * Set <p>软件的授权状态。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>Issued</td><td>已颁发，等待激活。一般来说，如果软件已经在运行，不会出现该状态。</td></tr><tr><td>Active</td><td>授权在有效期内，这是软件运行期间最常见的状态。</td></tr><tr><td>Expired</td><td>授权已过期。订阅类的软件授权有有效期，如果服务器时间已晚于有效期，则会进入过期状态。</td></tr><tr><td>Isolated</td><td>授权已隔离。有截止日期的授权，当用户授权到期时，先进入此状态，用户可以去续费，超过7天不续费则授权进入Destroyed状态。</td></tr><tr><td>Destroyed</td><td>授权已失效/销毁。用户如果退货软件，则授权会自动失效。</td></tr></tbody></table></p>
     * @param LicenseStatus <p>软件的授权状态。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>Issued</td><td>已颁发，等待激活。一般来说，如果软件已经在运行，不会出现该状态。</td></tr><tr><td>Active</td><td>授权在有效期内，这是软件运行期间最常见的状态。</td></tr><tr><td>Expired</td><td>授权已过期。订阅类的软件授权有有效期，如果服务器时间已晚于有效期，则会进入过期状态。</td></tr><tr><td>Isolated</td><td>授权已隔离。有截止日期的授权，当用户授权到期时，先进入此状态，用户可以去续费，超过7天不续费则授权进入Destroyed状态。</td></tr><tr><td>Destroyed</td><td>授权已失效/销毁。用户如果退货软件，则授权会自动失效。</td></tr></tbody></table></p>
     */
    public void setLicenseStatus(String LicenseStatus) {
        this.LicenseStatus = LicenseStatus;
    }

    /**
     * Get <p>软件供应方 ID。</p> 
     * @return ProviderId <p>软件供应方 ID。</p>
     */
    public Long getProviderId() {
        return this.ProviderId;
    }

    /**
     * Set <p>软件供应方 ID。</p>
     * @param ProviderId <p>软件供应方 ID。</p>
     */
    public void setProviderId(Long ProviderId) {
        this.ProviderId = ProviderId;
    }

    /**
     * Get <p>软件包 ID。</p> 
     * @return SoftwarePackageId <p>软件包 ID。</p>
     */
    public String getSoftwarePackageId() {
        return this.SoftwarePackageId;
    }

    /**
     * Set <p>软件包 ID。</p>
     * @param SoftwarePackageId <p>软件包 ID。</p>
     */
    public void setSoftwarePackageId(String SoftwarePackageId) {
        this.SoftwarePackageId = SoftwarePackageId;
    }

    /**
     * Get <p>软件包版本。</p> 
     * @return SoftwarePackageVersion <p>软件包版本。</p>
     */
    public String getSoftwarePackageVersion() {
        return this.SoftwarePackageVersion;
    }

    /**
     * Set <p>软件包版本。</p>
     * @param SoftwarePackageVersion <p>软件包版本。</p>
     */
    public void setSoftwarePackageVersion(String SoftwarePackageVersion) {
        this.SoftwarePackageVersion = SoftwarePackageVersion;
    }

    /**
     * Get <p>被授权的用户 UIN。</p> 
     * @return AuthorizedUserUin <p>被授权的用户 UIN。</p>
     */
    public String getAuthorizedUserUin() {
        return this.AuthorizedUserUin;
    }

    /**
     * Set <p>被授权的用户 UIN。</p>
     * @param AuthorizedUserUin <p>被授权的用户 UIN。</p>
     */
    public void setAuthorizedUserUin(String AuthorizedUserUin) {
        this.AuthorizedUserUin = AuthorizedUserUin;
    }

    /**
     * Get <p>被授权的应用实例 ID。</p> 
     * @return AuthorizedCloudappId <p>被授权的应用实例 ID。</p>
     */
    public String getAuthorizedCloudappId() {
        return this.AuthorizedCloudappId;
    }

    /**
     * Set <p>被授权的应用实例 ID。</p>
     * @param AuthorizedCloudappId <p>被授权的应用实例 ID。</p>
     */
    public void setAuthorizedCloudappId(String AuthorizedCloudappId) {
        this.AuthorizedCloudappId = AuthorizedCloudappId;
    }

    /**
     * Get <p>被授权的角色 ID。</p> 
     * @return AuthorizedCloudappRoleId <p>被授权的角色 ID。</p>
     */
    public String getAuthorizedCloudappRoleId() {
        return this.AuthorizedCloudappRoleId;
    }

    /**
     * Set <p>被授权的角色 ID。</p>
     * @param AuthorizedCloudappRoleId <p>被授权的角色 ID。</p>
     */
    public void setAuthorizedCloudappRoleId(String AuthorizedCloudappRoleId) {
        this.AuthorizedCloudappRoleId = AuthorizedCloudappRoleId;
    }

    /**
     * Get <p>被授权的软件规格，具体字段请参考结构SaleParam</p> 
     * @return AuthorizedSpecification <p>被授权的软件规格，具体字段请参考结构SaleParam</p>
     */
    public SaleParam [] getAuthorizedSpecification() {
        return this.AuthorizedSpecification;
    }

    /**
     * Set <p>被授权的软件规格，具体字段请参考结构SaleParam</p>
     * @param AuthorizedSpecification <p>被授权的软件规格，具体字段请参考结构SaleParam</p>
     */
    public void setAuthorizedSpecification(SaleParam [] AuthorizedSpecification) {
        this.AuthorizedSpecification = AuthorizedSpecification;
    }

    /**
     * Get <p>被授权的软件的计费模式。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>1</td><td>线上计费，软件的授权从腾讯云线上购买，支持续费、退款等操作。</td></tr><tr><td>2</td><td>线下计费，软件的授权线下签订合同购买，定向客户交付，无法从线上续费和退款。</td></tr><tr><td>4</td><td>免费</td></tr></tbody></table></p> 
     * @return BillingMode <p>被授权的软件的计费模式。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>1</td><td>线上计费，软件的授权从腾讯云线上购买，支持续费、退款等操作。</td></tr><tr><td>2</td><td>线下计费，软件的授权线下签订合同购买，定向客户交付，无法从线上续费和退款。</td></tr><tr><td>4</td><td>免费</td></tr></tbody></table></p>
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set <p>被授权的软件的计费模式。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>1</td><td>线上计费，软件的授权从腾讯云线上购买，支持续费、退款等操作。</td></tr><tr><td>2</td><td>线下计费，软件的授权线下签订合同购买，定向客户交付，无法从线上续费和退款。</td></tr><tr><td>4</td><td>免费</td></tr></tbody></table></p>
     * @param BillingMode <p>被授权的软件的计费模式。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>1</td><td>线上计费，软件的授权从腾讯云线上购买，支持续费、退款等操作。</td></tr><tr><td>2</td><td>线下计费，软件的授权线下签订合同购买，定向客户交付，无法从线上续费和退款。</td></tr><tr><td>4</td><td>免费</td></tr></tbody></table></p>
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get <p>授权时长（单位由LifeSpanUnit确定，枚举值有Y年/M月/D日三种）</p> 
     * @return LifeSpan <p>授权时长（单位由LifeSpanUnit确定，枚举值有Y年/M月/D日三种）</p>
     */
    public Long getLifeSpan() {
        return this.LifeSpan;
    }

    /**
     * Set <p>授权时长（单位由LifeSpanUnit确定，枚举值有Y年/M月/D日三种）</p>
     * @param LifeSpan <p>授权时长（单位由LifeSpanUnit确定，枚举值有Y年/M月/D日三种）</p>
     */
    public void setLifeSpan(Long LifeSpan) {
        this.LifeSpan = LifeSpan;
    }

    /**
     * Get <p>授权颁发时间。</p> 
     * @return IssueDate <p>授权颁发时间。</p>
     */
    public String getIssueDate() {
        return this.IssueDate;
    }

    /**
     * Set <p>授权颁发时间。</p>
     * @param IssueDate <p>授权颁发时间。</p>
     */
    public void setIssueDate(String IssueDate) {
        this.IssueDate = IssueDate;
    }

    /**
     * Get <p>授权激活时间，如从未激活则返回 null。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActivationDate <p>授权激活时间，如从未激活则返回 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActivationDate() {
        return this.ActivationDate;
    }

    /**
     * Set <p>授权激活时间，如从未激活则返回 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivationDate <p>授权激活时间，如从未激活则返回 null。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivationDate(String ActivationDate) {
        this.ActivationDate = ActivationDate;
    }

    /**
     * Get <p>授权过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpirationDate <p>授权过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpirationDate() {
        return this.ExpirationDate;
    }

    /**
     * Set <p>授权过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpirationDate <p>授权过期时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    /**
     * Get <p>授权时长单位，枚举值有Y年/M月/D日三种</p> 
     * @return LifeSpanUnit <p>授权时长单位，枚举值有Y年/M月/D日三种</p>
     */
    public String getLifeSpanUnit() {
        return this.LifeSpanUnit;
    }

    /**
     * Set <p>授权时长单位，枚举值有Y年/M月/D日三种</p>
     * @param LifeSpanUnit <p>授权时长单位，枚举值有Y年/M月/D日三种</p>
     */
    public void setLifeSpanUnit(String LifeSpanUnit) {
        this.LifeSpanUnit = LifeSpanUnit;
    }

    /**
     * Get <p>授权的类型：Standard正式版/Development开发版/Trial体验版</p> 
     * @return LicenseType <p>授权的类型：Standard正式版/Development开发版/Trial体验版</p>
     */
    public String getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set <p>授权的类型：Standard正式版/Development开发版/Trial体验版</p>
     * @param LicenseType <p>授权的类型：Standard正式版/Development开发版/Trial体验版</p>
     */
    public void setLicenseType(String LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get <p>授权的层级：Master 主授权；Child 子授权/增强型授权</p> 
     * @return LicenseLevel <p>授权的层级：Master 主授权；Child 子授权/增强型授权</p>
     */
    public String getLicenseLevel() {
        return this.LicenseLevel;
    }

    /**
     * Set <p>授权的层级：Master 主授权；Child 子授权/增强型授权</p>
     * @param LicenseLevel <p>授权的层级：Master 主授权；Child 子授权/增强型授权</p>
     */
    public void setLicenseLevel(String LicenseLevel) {
        this.LicenseLevel = LicenseLevel;
    }

    public License() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public License(License source) {
        if (source.LicenseId != null) {
            this.LicenseId = new String(source.LicenseId);
        }
        if (source.LicenseMode != null) {
            this.LicenseMode = new String(source.LicenseMode);
        }
        if (source.LicenseStatus != null) {
            this.LicenseStatus = new String(source.LicenseStatus);
        }
        if (source.ProviderId != null) {
            this.ProviderId = new Long(source.ProviderId);
        }
        if (source.SoftwarePackageId != null) {
            this.SoftwarePackageId = new String(source.SoftwarePackageId);
        }
        if (source.SoftwarePackageVersion != null) {
            this.SoftwarePackageVersion = new String(source.SoftwarePackageVersion);
        }
        if (source.AuthorizedUserUin != null) {
            this.AuthorizedUserUin = new String(source.AuthorizedUserUin);
        }
        if (source.AuthorizedCloudappId != null) {
            this.AuthorizedCloudappId = new String(source.AuthorizedCloudappId);
        }
        if (source.AuthorizedCloudappRoleId != null) {
            this.AuthorizedCloudappRoleId = new String(source.AuthorizedCloudappRoleId);
        }
        if (source.AuthorizedSpecification != null) {
            this.AuthorizedSpecification = new SaleParam[source.AuthorizedSpecification.length];
            for (int i = 0; i < source.AuthorizedSpecification.length; i++) {
                this.AuthorizedSpecification[i] = new SaleParam(source.AuthorizedSpecification[i]);
            }
        }
        if (source.BillingMode != null) {
            this.BillingMode = new Long(source.BillingMode);
        }
        if (source.LifeSpan != null) {
            this.LifeSpan = new Long(source.LifeSpan);
        }
        if (source.IssueDate != null) {
            this.IssueDate = new String(source.IssueDate);
        }
        if (source.ActivationDate != null) {
            this.ActivationDate = new String(source.ActivationDate);
        }
        if (source.ExpirationDate != null) {
            this.ExpirationDate = new String(source.ExpirationDate);
        }
        if (source.LifeSpanUnit != null) {
            this.LifeSpanUnit = new String(source.LifeSpanUnit);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new String(source.LicenseType);
        }
        if (source.LicenseLevel != null) {
            this.LicenseLevel = new String(source.LicenseLevel);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LicenseId", this.LicenseId);
        this.setParamSimple(map, prefix + "LicenseMode", this.LicenseMode);
        this.setParamSimple(map, prefix + "LicenseStatus", this.LicenseStatus);
        this.setParamSimple(map, prefix + "ProviderId", this.ProviderId);
        this.setParamSimple(map, prefix + "SoftwarePackageId", this.SoftwarePackageId);
        this.setParamSimple(map, prefix + "SoftwarePackageVersion", this.SoftwarePackageVersion);
        this.setParamSimple(map, prefix + "AuthorizedUserUin", this.AuthorizedUserUin);
        this.setParamSimple(map, prefix + "AuthorizedCloudappId", this.AuthorizedCloudappId);
        this.setParamSimple(map, prefix + "AuthorizedCloudappRoleId", this.AuthorizedCloudappRoleId);
        this.setParamArrayObj(map, prefix + "AuthorizedSpecification.", this.AuthorizedSpecification);
        this.setParamSimple(map, prefix + "BillingMode", this.BillingMode);
        this.setParamSimple(map, prefix + "LifeSpan", this.LifeSpan);
        this.setParamSimple(map, prefix + "IssueDate", this.IssueDate);
        this.setParamSimple(map, prefix + "ActivationDate", this.ActivationDate);
        this.setParamSimple(map, prefix + "ExpirationDate", this.ExpirationDate);
        this.setParamSimple(map, prefix + "LifeSpanUnit", this.LifeSpanUnit);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "LicenseLevel", this.LicenseLevel);

    }
}

