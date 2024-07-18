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
package com.tencentcloudapi.cloudapp.v20220530.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class License extends AbstractModel {

    /**
    * License ID
    */
    @SerializedName("LicenseId")
    @Expose
    private String LicenseId;

    /**
    * 软件授权模式。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>Permanent</td><td>永久授权。该授权不受有效期限制。</td></tr><tr><td>Subscription</td><td>订阅授权。授权如果过了有效期，则会进入过期状态。</td></tr></tbody></table>
    */
    @SerializedName("LicenseMode")
    @Expose
    private String LicenseMode;

    /**
    * 软件的授权状态。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>Issued</td><td>已颁发，等待激活。一般来说，如果软件已经在运行，不会出现该状态。</td></tr><tr><td>Active</td><td>授权在有效期内，这是软件运行期间最常见的状态。</td></tr><tr><td>Expired</td><td>授权已过期。订阅类的软件授权有有效期，如果服务器时间已晚于有效期，则会进入过期状态。</td></tr><tr><td>Deactivated</td><td>授权已失效。用户如果退货软件，则授权会自动失效。</td></tr></tbody></table>
    */
    @SerializedName("LicenseStatus")
    @Expose
    private String LicenseStatus;

    /**
    * 软件供应方 ID。
    */
    @SerializedName("ProviderId")
    @Expose
    private Long ProviderId;

    /**
    * 软件包 ID。
    */
    @SerializedName("SoftwarePackageId")
    @Expose
    private String SoftwarePackageId;

    /**
    * 软件包版本。
    */
    @SerializedName("SoftwarePackageVersion")
    @Expose
    private String SoftwarePackageVersion;

    /**
    * 被授权的用户 UIN。
    */
    @SerializedName("AuthorizedUserUin")
    @Expose
    private String AuthorizedUserUin;

    /**
    * 被授权的应用实例 ID。
    */
    @SerializedName("AuthorizedCloudappId")
    @Expose
    private String AuthorizedCloudappId;

    /**
    * 被授权的角色 ID。
    */
    @SerializedName("AuthorizedCloudappRoleId")
    @Expose
    private String AuthorizedCloudappRoleId;

    /**
    * 被授权的软件规格，具体字段请参考结构SaleParam
    */
    @SerializedName("AuthorizedSpecification")
    @Expose
    private SaleParam [] AuthorizedSpecification;

    /**
    * 被授权的软件的计费模式。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>1</td><td>线上计费，软件的授权从腾讯云线上购买，支持续费、退款等操作。</td></tr><tr><td>2</td><td>线下计费，软件的授权线下签订合同购买，定向客户交付，无法从线上续费和退款。</td></tr><tr><td>4</td><td>免费</td></tr></tbody></table>
    */
    @SerializedName("BillingMode")
    @Expose
    private Long BillingMode;

    /**
    * 授权时长（单位由LifeSpanUnit确定，枚举值有Y年/M月/D日三种）
    */
    @SerializedName("LifeSpan")
    @Expose
    private Long LifeSpan;

    /**
    * 授权颁发时间。
    */
    @SerializedName("IssueDate")
    @Expose
    private String IssueDate;

    /**
    * 授权激活时间，如从未激活则返回 null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivationDate")
    @Expose
    private String ActivationDate;

    /**
    * 授权过期时间，如未过期或者是永久授权，则返回 null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpirationDate")
    @Expose
    private String ExpirationDate;

    /**
    * 授权时长单位，枚举值有Y年/M月/D日三种
    */
    @SerializedName("LifeSpanUnit")
    @Expose
    private String LifeSpanUnit;

    /**
     * Get License ID 
     * @return LicenseId License ID
     */
    public String getLicenseId() {
        return this.LicenseId;
    }

    /**
     * Set License ID
     * @param LicenseId License ID
     */
    public void setLicenseId(String LicenseId) {
        this.LicenseId = LicenseId;
    }

    /**
     * Get 软件授权模式。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>Permanent</td><td>永久授权。该授权不受有效期限制。</td></tr><tr><td>Subscription</td><td>订阅授权。授权如果过了有效期，则会进入过期状态。</td></tr></tbody></table> 
     * @return LicenseMode 软件授权模式。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>Permanent</td><td>永久授权。该授权不受有效期限制。</td></tr><tr><td>Subscription</td><td>订阅授权。授权如果过了有效期，则会进入过期状态。</td></tr></tbody></table>
     */
    public String getLicenseMode() {
        return this.LicenseMode;
    }

    /**
     * Set 软件授权模式。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>Permanent</td><td>永久授权。该授权不受有效期限制。</td></tr><tr><td>Subscription</td><td>订阅授权。授权如果过了有效期，则会进入过期状态。</td></tr></tbody></table>
     * @param LicenseMode 软件授权模式。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>Permanent</td><td>永久授权。该授权不受有效期限制。</td></tr><tr><td>Subscription</td><td>订阅授权。授权如果过了有效期，则会进入过期状态。</td></tr></tbody></table>
     */
    public void setLicenseMode(String LicenseMode) {
        this.LicenseMode = LicenseMode;
    }

    /**
     * Get 软件的授权状态。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>Issued</td><td>已颁发，等待激活。一般来说，如果软件已经在运行，不会出现该状态。</td></tr><tr><td>Active</td><td>授权在有效期内，这是软件运行期间最常见的状态。</td></tr><tr><td>Expired</td><td>授权已过期。订阅类的软件授权有有效期，如果服务器时间已晚于有效期，则会进入过期状态。</td></tr><tr><td>Deactivated</td><td>授权已失效。用户如果退货软件，则授权会自动失效。</td></tr></tbody></table> 
     * @return LicenseStatus 软件的授权状态。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>Issued</td><td>已颁发，等待激活。一般来说，如果软件已经在运行，不会出现该状态。</td></tr><tr><td>Active</td><td>授权在有效期内，这是软件运行期间最常见的状态。</td></tr><tr><td>Expired</td><td>授权已过期。订阅类的软件授权有有效期，如果服务器时间已晚于有效期，则会进入过期状态。</td></tr><tr><td>Deactivated</td><td>授权已失效。用户如果退货软件，则授权会自动失效。</td></tr></tbody></table>
     */
    public String getLicenseStatus() {
        return this.LicenseStatus;
    }

    /**
     * Set 软件的授权状态。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>Issued</td><td>已颁发，等待激活。一般来说，如果软件已经在运行，不会出现该状态。</td></tr><tr><td>Active</td><td>授权在有效期内，这是软件运行期间最常见的状态。</td></tr><tr><td>Expired</td><td>授权已过期。订阅类的软件授权有有效期，如果服务器时间已晚于有效期，则会进入过期状态。</td></tr><tr><td>Deactivated</td><td>授权已失效。用户如果退货软件，则授权会自动失效。</td></tr></tbody></table>
     * @param LicenseStatus 软件的授权状态。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>Issued</td><td>已颁发，等待激活。一般来说，如果软件已经在运行，不会出现该状态。</td></tr><tr><td>Active</td><td>授权在有效期内，这是软件运行期间最常见的状态。</td></tr><tr><td>Expired</td><td>授权已过期。订阅类的软件授权有有效期，如果服务器时间已晚于有效期，则会进入过期状态。</td></tr><tr><td>Deactivated</td><td>授权已失效。用户如果退货软件，则授权会自动失效。</td></tr></tbody></table>
     */
    public void setLicenseStatus(String LicenseStatus) {
        this.LicenseStatus = LicenseStatus;
    }

    /**
     * Get 软件供应方 ID。 
     * @return ProviderId 软件供应方 ID。
     */
    public Long getProviderId() {
        return this.ProviderId;
    }

    /**
     * Set 软件供应方 ID。
     * @param ProviderId 软件供应方 ID。
     */
    public void setProviderId(Long ProviderId) {
        this.ProviderId = ProviderId;
    }

    /**
     * Get 软件包 ID。 
     * @return SoftwarePackageId 软件包 ID。
     */
    public String getSoftwarePackageId() {
        return this.SoftwarePackageId;
    }

    /**
     * Set 软件包 ID。
     * @param SoftwarePackageId 软件包 ID。
     */
    public void setSoftwarePackageId(String SoftwarePackageId) {
        this.SoftwarePackageId = SoftwarePackageId;
    }

    /**
     * Get 软件包版本。 
     * @return SoftwarePackageVersion 软件包版本。
     */
    public String getSoftwarePackageVersion() {
        return this.SoftwarePackageVersion;
    }

    /**
     * Set 软件包版本。
     * @param SoftwarePackageVersion 软件包版本。
     */
    public void setSoftwarePackageVersion(String SoftwarePackageVersion) {
        this.SoftwarePackageVersion = SoftwarePackageVersion;
    }

    /**
     * Get 被授权的用户 UIN。 
     * @return AuthorizedUserUin 被授权的用户 UIN。
     */
    public String getAuthorizedUserUin() {
        return this.AuthorizedUserUin;
    }

    /**
     * Set 被授权的用户 UIN。
     * @param AuthorizedUserUin 被授权的用户 UIN。
     */
    public void setAuthorizedUserUin(String AuthorizedUserUin) {
        this.AuthorizedUserUin = AuthorizedUserUin;
    }

    /**
     * Get 被授权的应用实例 ID。 
     * @return AuthorizedCloudappId 被授权的应用实例 ID。
     */
    public String getAuthorizedCloudappId() {
        return this.AuthorizedCloudappId;
    }

    /**
     * Set 被授权的应用实例 ID。
     * @param AuthorizedCloudappId 被授权的应用实例 ID。
     */
    public void setAuthorizedCloudappId(String AuthorizedCloudappId) {
        this.AuthorizedCloudappId = AuthorizedCloudappId;
    }

    /**
     * Get 被授权的角色 ID。 
     * @return AuthorizedCloudappRoleId 被授权的角色 ID。
     */
    public String getAuthorizedCloudappRoleId() {
        return this.AuthorizedCloudappRoleId;
    }

    /**
     * Set 被授权的角色 ID。
     * @param AuthorizedCloudappRoleId 被授权的角色 ID。
     */
    public void setAuthorizedCloudappRoleId(String AuthorizedCloudappRoleId) {
        this.AuthorizedCloudappRoleId = AuthorizedCloudappRoleId;
    }

    /**
     * Get 被授权的软件规格，具体字段请参考结构SaleParam 
     * @return AuthorizedSpecification 被授权的软件规格，具体字段请参考结构SaleParam
     */
    public SaleParam [] getAuthorizedSpecification() {
        return this.AuthorizedSpecification;
    }

    /**
     * Set 被授权的软件规格，具体字段请参考结构SaleParam
     * @param AuthorizedSpecification 被授权的软件规格，具体字段请参考结构SaleParam
     */
    public void setAuthorizedSpecification(SaleParam [] AuthorizedSpecification) {
        this.AuthorizedSpecification = AuthorizedSpecification;
    }

    /**
     * Get 被授权的软件的计费模式。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>1</td><td>线上计费，软件的授权从腾讯云线上购买，支持续费、退款等操作。</td></tr><tr><td>2</td><td>线下计费，软件的授权线下签订合同购买，定向客户交付，无法从线上续费和退款。</td></tr><tr><td>4</td><td>免费</td></tr></tbody></table> 
     * @return BillingMode 被授权的软件的计费模式。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>1</td><td>线上计费，软件的授权从腾讯云线上购买，支持续费、退款等操作。</td></tr><tr><td>2</td><td>线下计费，软件的授权线下签订合同购买，定向客户交付，无法从线上续费和退款。</td></tr><tr><td>4</td><td>免费</td></tr></tbody></table>
     */
    public Long getBillingMode() {
        return this.BillingMode;
    }

    /**
     * Set 被授权的软件的计费模式。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>1</td><td>线上计费，软件的授权从腾讯云线上购买，支持续费、退款等操作。</td></tr><tr><td>2</td><td>线下计费，软件的授权线下签订合同购买，定向客户交付，无法从线上续费和退款。</td></tr><tr><td>4</td><td>免费</td></tr></tbody></table>
     * @param BillingMode 被授权的软件的计费模式。<table><thead><tr><th>枚举值</th><th>说明</th></tr></thead><tbody><tr><td>1</td><td>线上计费，软件的授权从腾讯云线上购买，支持续费、退款等操作。</td></tr><tr><td>2</td><td>线下计费，软件的授权线下签订合同购买，定向客户交付，无法从线上续费和退款。</td></tr><tr><td>4</td><td>免费</td></tr></tbody></table>
     */
    public void setBillingMode(Long BillingMode) {
        this.BillingMode = BillingMode;
    }

    /**
     * Get 授权时长（单位由LifeSpanUnit确定，枚举值有Y年/M月/D日三种） 
     * @return LifeSpan 授权时长（单位由LifeSpanUnit确定，枚举值有Y年/M月/D日三种）
     */
    public Long getLifeSpan() {
        return this.LifeSpan;
    }

    /**
     * Set 授权时长（单位由LifeSpanUnit确定，枚举值有Y年/M月/D日三种）
     * @param LifeSpan 授权时长（单位由LifeSpanUnit确定，枚举值有Y年/M月/D日三种）
     */
    public void setLifeSpan(Long LifeSpan) {
        this.LifeSpan = LifeSpan;
    }

    /**
     * Get 授权颁发时间。 
     * @return IssueDate 授权颁发时间。
     */
    public String getIssueDate() {
        return this.IssueDate;
    }

    /**
     * Set 授权颁发时间。
     * @param IssueDate 授权颁发时间。
     */
    public void setIssueDate(String IssueDate) {
        this.IssueDate = IssueDate;
    }

    /**
     * Get 授权激活时间，如从未激活则返回 null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActivationDate 授权激活时间，如从未激活则返回 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActivationDate() {
        return this.ActivationDate;
    }

    /**
     * Set 授权激活时间，如从未激活则返回 null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivationDate 授权激活时间，如从未激活则返回 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivationDate(String ActivationDate) {
        this.ActivationDate = ActivationDate;
    }

    /**
     * Get 授权过期时间，如未过期或者是永久授权，则返回 null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpirationDate 授权过期时间，如未过期或者是永久授权，则返回 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpirationDate() {
        return this.ExpirationDate;
    }

    /**
     * Set 授权过期时间，如未过期或者是永久授权，则返回 null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpirationDate 授权过期时间，如未过期或者是永久授权，则返回 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    /**
     * Get 授权时长单位，枚举值有Y年/M月/D日三种 
     * @return LifeSpanUnit 授权时长单位，枚举值有Y年/M月/D日三种
     */
    public String getLifeSpanUnit() {
        return this.LifeSpanUnit;
    }

    /**
     * Set 授权时长单位，枚举值有Y年/M月/D日三种
     * @param LifeSpanUnit 授权时长单位，枚举值有Y年/M月/D日三种
     */
    public void setLifeSpanUnit(String LifeSpanUnit) {
        this.LifeSpanUnit = LifeSpanUnit;
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

    }
}

