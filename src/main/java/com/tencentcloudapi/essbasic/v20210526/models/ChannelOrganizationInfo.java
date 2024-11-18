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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelOrganizationInfo extends AbstractModel {

    /**
    * 电子签平台给企业分配的ID（在不同应用下同一个企业会分配通用的ID）
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * 第三方平台子客企业的唯一标识
    */
    @SerializedName("OrganizationOpenId")
    @Expose
    private String OrganizationOpenId;

    /**
    * 第三方平台子客企业名称
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 企业的统一社会信用代码
    */
    @SerializedName("UnifiedSocialCreditCode")
    @Expose
    private String UnifiedSocialCreditCode;

    /**
    * 企业法定代表人的姓名
    */
    @SerializedName("LegalName")
    @Expose
    private String LegalName;

    /**
    * 企业法定代表人作为第三方平台子客企业员工的唯一标识
    */
    @SerializedName("LegalOpenId")
    @Expose
    private String LegalOpenId;

    /**
    * 企业超级管理员的姓名
    */
    @SerializedName("AdminName")
    @Expose
    private String AdminName;

    /**
    * 企业超级管理员作为第三方平台子客企业员工的唯一标识
    */
    @SerializedName("AdminOpenId")
    @Expose
    private String AdminOpenId;

    /**
    * 企业超级管理员的手机号码
**注**：`手机号码脱敏（隐藏部分用*替代）`
    */
    @SerializedName("AdminMobile")
    @Expose
    private String AdminMobile;

    /**
    * 企业认证状态字段。值如下：
<ul>
  <li>**"UNVERIFIED"**： 未认证的企业</li>
  <li>**"VERIFYINGLEGALPENDINGAUTHORIZATION"**： 认证中待法人授权的企业</li>
  <li>**"VERIFYINGAUTHORIZATIONFILEPENDING"**： 认证中授权书审核中的企业</li>
  <li>**"VERIFYINGAUTHORIZATIONFILEREJECT"**： 认证中授权书已驳回的企业</li>
  <li>**"VERIFYING"**： 认证中的企业</li>
  <li>**"VERIFIED"**： 已认证的企业</li>
</ul>
    */
    @SerializedName("AuthorizationStatus")
    @Expose
    private String AuthorizationStatus;

    /**
    * 企业认证方式字段。值如下：
<ul>
  <li>**"AuthorizationInit"**： 暂未选择授权方式</li>
  <li>**"AuthorizationFile"**： 授权书</li>
  <li>**"AuthorizationLegalPerson"**： 法人授权超管</li>
  <li>**"AuthorizationLegalIdentity"**： 法人直接认证</li>
</ul>
    */
    @SerializedName("AuthorizationType")
    @Expose
    private String AuthorizationType;

    /**
    * 子企业激活状态。值如下：
<ul>
  <li>**0**： 未激活</li>
  <li>**1**： 已激活</li>
</ul>
    */
    @SerializedName("ActiveStatus")
    @Expose
    private Long ActiveStatus;

    /**
    * 账号过期时间，时间戳
    */
    @SerializedName("LicenseExpireTime")
    @Expose
    private Long LicenseExpireTime;

    /**
     * Get 电子签平台给企业分配的ID（在不同应用下同一个企业会分配通用的ID） 
     * @return OrganizationId 电子签平台给企业分配的ID（在不同应用下同一个企业会分配通用的ID）
     */
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set 电子签平台给企业分配的ID（在不同应用下同一个企业会分配通用的ID）
     * @param OrganizationId 电子签平台给企业分配的ID（在不同应用下同一个企业会分配通用的ID）
     */
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get 第三方平台子客企业的唯一标识 
     * @return OrganizationOpenId 第三方平台子客企业的唯一标识
     */
    public String getOrganizationOpenId() {
        return this.OrganizationOpenId;
    }

    /**
     * Set 第三方平台子客企业的唯一标识
     * @param OrganizationOpenId 第三方平台子客企业的唯一标识
     */
    public void setOrganizationOpenId(String OrganizationOpenId) {
        this.OrganizationOpenId = OrganizationOpenId;
    }

    /**
     * Get 第三方平台子客企业名称 
     * @return OrganizationName 第三方平台子客企业名称
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 第三方平台子客企业名称
     * @param OrganizationName 第三方平台子客企业名称
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 企业的统一社会信用代码 
     * @return UnifiedSocialCreditCode 企业的统一社会信用代码
     */
    public String getUnifiedSocialCreditCode() {
        return this.UnifiedSocialCreditCode;
    }

    /**
     * Set 企业的统一社会信用代码
     * @param UnifiedSocialCreditCode 企业的统一社会信用代码
     */
    public void setUnifiedSocialCreditCode(String UnifiedSocialCreditCode) {
        this.UnifiedSocialCreditCode = UnifiedSocialCreditCode;
    }

    /**
     * Get 企业法定代表人的姓名 
     * @return LegalName 企业法定代表人的姓名
     */
    public String getLegalName() {
        return this.LegalName;
    }

    /**
     * Set 企业法定代表人的姓名
     * @param LegalName 企业法定代表人的姓名
     */
    public void setLegalName(String LegalName) {
        this.LegalName = LegalName;
    }

    /**
     * Get 企业法定代表人作为第三方平台子客企业员工的唯一标识 
     * @return LegalOpenId 企业法定代表人作为第三方平台子客企业员工的唯一标识
     */
    public String getLegalOpenId() {
        return this.LegalOpenId;
    }

    /**
     * Set 企业法定代表人作为第三方平台子客企业员工的唯一标识
     * @param LegalOpenId 企业法定代表人作为第三方平台子客企业员工的唯一标识
     */
    public void setLegalOpenId(String LegalOpenId) {
        this.LegalOpenId = LegalOpenId;
    }

    /**
     * Get 企业超级管理员的姓名 
     * @return AdminName 企业超级管理员的姓名
     */
    public String getAdminName() {
        return this.AdminName;
    }

    /**
     * Set 企业超级管理员的姓名
     * @param AdminName 企业超级管理员的姓名
     */
    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    /**
     * Get 企业超级管理员作为第三方平台子客企业员工的唯一标识 
     * @return AdminOpenId 企业超级管理员作为第三方平台子客企业员工的唯一标识
     */
    public String getAdminOpenId() {
        return this.AdminOpenId;
    }

    /**
     * Set 企业超级管理员作为第三方平台子客企业员工的唯一标识
     * @param AdminOpenId 企业超级管理员作为第三方平台子客企业员工的唯一标识
     */
    public void setAdminOpenId(String AdminOpenId) {
        this.AdminOpenId = AdminOpenId;
    }

    /**
     * Get 企业超级管理员的手机号码
**注**：`手机号码脱敏（隐藏部分用*替代）` 
     * @return AdminMobile 企业超级管理员的手机号码
**注**：`手机号码脱敏（隐藏部分用*替代）`
     */
    public String getAdminMobile() {
        return this.AdminMobile;
    }

    /**
     * Set 企业超级管理员的手机号码
**注**：`手机号码脱敏（隐藏部分用*替代）`
     * @param AdminMobile 企业超级管理员的手机号码
**注**：`手机号码脱敏（隐藏部分用*替代）`
     */
    public void setAdminMobile(String AdminMobile) {
        this.AdminMobile = AdminMobile;
    }

    /**
     * Get 企业认证状态字段。值如下：
<ul>
  <li>**"UNVERIFIED"**： 未认证的企业</li>
  <li>**"VERIFYINGLEGALPENDINGAUTHORIZATION"**： 认证中待法人授权的企业</li>
  <li>**"VERIFYINGAUTHORIZATIONFILEPENDING"**： 认证中授权书审核中的企业</li>
  <li>**"VERIFYINGAUTHORIZATIONFILEREJECT"**： 认证中授权书已驳回的企业</li>
  <li>**"VERIFYING"**： 认证中的企业</li>
  <li>**"VERIFIED"**： 已认证的企业</li>
</ul> 
     * @return AuthorizationStatus 企业认证状态字段。值如下：
<ul>
  <li>**"UNVERIFIED"**： 未认证的企业</li>
  <li>**"VERIFYINGLEGALPENDINGAUTHORIZATION"**： 认证中待法人授权的企业</li>
  <li>**"VERIFYINGAUTHORIZATIONFILEPENDING"**： 认证中授权书审核中的企业</li>
  <li>**"VERIFYINGAUTHORIZATIONFILEREJECT"**： 认证中授权书已驳回的企业</li>
  <li>**"VERIFYING"**： 认证中的企业</li>
  <li>**"VERIFIED"**： 已认证的企业</li>
</ul>
     */
    public String getAuthorizationStatus() {
        return this.AuthorizationStatus;
    }

    /**
     * Set 企业认证状态字段。值如下：
<ul>
  <li>**"UNVERIFIED"**： 未认证的企业</li>
  <li>**"VERIFYINGLEGALPENDINGAUTHORIZATION"**： 认证中待法人授权的企业</li>
  <li>**"VERIFYINGAUTHORIZATIONFILEPENDING"**： 认证中授权书审核中的企业</li>
  <li>**"VERIFYINGAUTHORIZATIONFILEREJECT"**： 认证中授权书已驳回的企业</li>
  <li>**"VERIFYING"**： 认证中的企业</li>
  <li>**"VERIFIED"**： 已认证的企业</li>
</ul>
     * @param AuthorizationStatus 企业认证状态字段。值如下：
<ul>
  <li>**"UNVERIFIED"**： 未认证的企业</li>
  <li>**"VERIFYINGLEGALPENDINGAUTHORIZATION"**： 认证中待法人授权的企业</li>
  <li>**"VERIFYINGAUTHORIZATIONFILEPENDING"**： 认证中授权书审核中的企业</li>
  <li>**"VERIFYINGAUTHORIZATIONFILEREJECT"**： 认证中授权书已驳回的企业</li>
  <li>**"VERIFYING"**： 认证中的企业</li>
  <li>**"VERIFIED"**： 已认证的企业</li>
</ul>
     */
    public void setAuthorizationStatus(String AuthorizationStatus) {
        this.AuthorizationStatus = AuthorizationStatus;
    }

    /**
     * Get 企业认证方式字段。值如下：
<ul>
  <li>**"AuthorizationInit"**： 暂未选择授权方式</li>
  <li>**"AuthorizationFile"**： 授权书</li>
  <li>**"AuthorizationLegalPerson"**： 法人授权超管</li>
  <li>**"AuthorizationLegalIdentity"**： 法人直接认证</li>
</ul> 
     * @return AuthorizationType 企业认证方式字段。值如下：
<ul>
  <li>**"AuthorizationInit"**： 暂未选择授权方式</li>
  <li>**"AuthorizationFile"**： 授权书</li>
  <li>**"AuthorizationLegalPerson"**： 法人授权超管</li>
  <li>**"AuthorizationLegalIdentity"**： 法人直接认证</li>
</ul>
     */
    public String getAuthorizationType() {
        return this.AuthorizationType;
    }

    /**
     * Set 企业认证方式字段。值如下：
<ul>
  <li>**"AuthorizationInit"**： 暂未选择授权方式</li>
  <li>**"AuthorizationFile"**： 授权书</li>
  <li>**"AuthorizationLegalPerson"**： 法人授权超管</li>
  <li>**"AuthorizationLegalIdentity"**： 法人直接认证</li>
</ul>
     * @param AuthorizationType 企业认证方式字段。值如下：
<ul>
  <li>**"AuthorizationInit"**： 暂未选择授权方式</li>
  <li>**"AuthorizationFile"**： 授权书</li>
  <li>**"AuthorizationLegalPerson"**： 法人授权超管</li>
  <li>**"AuthorizationLegalIdentity"**： 法人直接认证</li>
</ul>
     */
    public void setAuthorizationType(String AuthorizationType) {
        this.AuthorizationType = AuthorizationType;
    }

    /**
     * Get 子企业激活状态。值如下：
<ul>
  <li>**0**： 未激活</li>
  <li>**1**： 已激活</li>
</ul> 
     * @return ActiveStatus 子企业激活状态。值如下：
<ul>
  <li>**0**： 未激活</li>
  <li>**1**： 已激活</li>
</ul>
     */
    public Long getActiveStatus() {
        return this.ActiveStatus;
    }

    /**
     * Set 子企业激活状态。值如下：
<ul>
  <li>**0**： 未激活</li>
  <li>**1**： 已激活</li>
</ul>
     * @param ActiveStatus 子企业激活状态。值如下：
<ul>
  <li>**0**： 未激活</li>
  <li>**1**： 已激活</li>
</ul>
     */
    public void setActiveStatus(Long ActiveStatus) {
        this.ActiveStatus = ActiveStatus;
    }

    /**
     * Get 账号过期时间，时间戳 
     * @return LicenseExpireTime 账号过期时间，时间戳
     */
    public Long getLicenseExpireTime() {
        return this.LicenseExpireTime;
    }

    /**
     * Set 账号过期时间，时间戳
     * @param LicenseExpireTime 账号过期时间，时间戳
     */
    public void setLicenseExpireTime(Long LicenseExpireTime) {
        this.LicenseExpireTime = LicenseExpireTime;
    }

    public ChannelOrganizationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelOrganizationInfo(ChannelOrganizationInfo source) {
        if (source.OrganizationId != null) {
            this.OrganizationId = new String(source.OrganizationId);
        }
        if (source.OrganizationOpenId != null) {
            this.OrganizationOpenId = new String(source.OrganizationOpenId);
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.UnifiedSocialCreditCode != null) {
            this.UnifiedSocialCreditCode = new String(source.UnifiedSocialCreditCode);
        }
        if (source.LegalName != null) {
            this.LegalName = new String(source.LegalName);
        }
        if (source.LegalOpenId != null) {
            this.LegalOpenId = new String(source.LegalOpenId);
        }
        if (source.AdminName != null) {
            this.AdminName = new String(source.AdminName);
        }
        if (source.AdminOpenId != null) {
            this.AdminOpenId = new String(source.AdminOpenId);
        }
        if (source.AdminMobile != null) {
            this.AdminMobile = new String(source.AdminMobile);
        }
        if (source.AuthorizationStatus != null) {
            this.AuthorizationStatus = new String(source.AuthorizationStatus);
        }
        if (source.AuthorizationType != null) {
            this.AuthorizationType = new String(source.AuthorizationType);
        }
        if (source.ActiveStatus != null) {
            this.ActiveStatus = new Long(source.ActiveStatus);
        }
        if (source.LicenseExpireTime != null) {
            this.LicenseExpireTime = new Long(source.LicenseExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrganizationId", this.OrganizationId);
        this.setParamSimple(map, prefix + "OrganizationOpenId", this.OrganizationOpenId);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "UnifiedSocialCreditCode", this.UnifiedSocialCreditCode);
        this.setParamSimple(map, prefix + "LegalName", this.LegalName);
        this.setParamSimple(map, prefix + "LegalOpenId", this.LegalOpenId);
        this.setParamSimple(map, prefix + "AdminName", this.AdminName);
        this.setParamSimple(map, prefix + "AdminOpenId", this.AdminOpenId);
        this.setParamSimple(map, prefix + "AdminMobile", this.AdminMobile);
        this.setParamSimple(map, prefix + "AuthorizationStatus", this.AuthorizationStatus);
        this.setParamSimple(map, prefix + "AuthorizationType", this.AuthorizationType);
        this.setParamSimple(map, prefix + "ActiveStatus", this.ActiveStatus);
        this.setParamSimple(map, prefix + "LicenseExpireTime", this.LicenseExpireTime);

    }
}

