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
    * 电子签企业Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * 电子签企业OpenId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrganizationOpenId")
    @Expose
    private String OrganizationOpenId;

    /**
    * 企业名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 企业信用代码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnifiedSocialCreditCode")
    @Expose
    private String UnifiedSocialCreditCode;

    /**
    * 法人姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LegalName")
    @Expose
    private String LegalName;

    /**
    * 法人OpenId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LegalOpenId")
    @Expose
    private String LegalOpenId;

    /**
    * 超管姓名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdminName")
    @Expose
    private String AdminName;

    /**
    * 超管OpenId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdminOpenId")
    @Expose
    private String AdminOpenId;

    /**
    * 超管手机号，脱敏后返回
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthorizationType")
    @Expose
    private String AuthorizationType;

    /**
     * Get 电子签企业Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrganizationId 电子签企业Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set 电子签企业Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrganizationId 电子签企业Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get 电子签企业OpenId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrganizationOpenId 电子签企业OpenId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrganizationOpenId() {
        return this.OrganizationOpenId;
    }

    /**
     * Set 电子签企业OpenId
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrganizationOpenId 电子签企业OpenId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrganizationOpenId(String OrganizationOpenId) {
        this.OrganizationOpenId = OrganizationOpenId;
    }

    /**
     * Get 企业名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrganizationName 企业名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 企业名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrganizationName 企业名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 企业信用代码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnifiedSocialCreditCode 企业信用代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnifiedSocialCreditCode() {
        return this.UnifiedSocialCreditCode;
    }

    /**
     * Set 企业信用代码
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnifiedSocialCreditCode 企业信用代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnifiedSocialCreditCode(String UnifiedSocialCreditCode) {
        this.UnifiedSocialCreditCode = UnifiedSocialCreditCode;
    }

    /**
     * Get 法人姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LegalName 法人姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLegalName() {
        return this.LegalName;
    }

    /**
     * Set 法人姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param LegalName 法人姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLegalName(String LegalName) {
        this.LegalName = LegalName;
    }

    /**
     * Get 法人OpenId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LegalOpenId 法人OpenId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLegalOpenId() {
        return this.LegalOpenId;
    }

    /**
     * Set 法人OpenId
注意：此字段可能返回 null，表示取不到有效值。
     * @param LegalOpenId 法人OpenId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLegalOpenId(String LegalOpenId) {
        this.LegalOpenId = LegalOpenId;
    }

    /**
     * Get 超管姓名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdminName 超管姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdminName() {
        return this.AdminName;
    }

    /**
     * Set 超管姓名
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdminName 超管姓名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    /**
     * Get 超管OpenId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdminOpenId 超管OpenId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdminOpenId() {
        return this.AdminOpenId;
    }

    /**
     * Set 超管OpenId
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdminOpenId 超管OpenId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdminOpenId(String AdminOpenId) {
        this.AdminOpenId = AdminOpenId;
    }

    /**
     * Get 超管手机号，脱敏后返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdminMobile 超管手机号，脱敏后返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAdminMobile() {
        return this.AdminMobile;
    }

    /**
     * Set 超管手机号，脱敏后返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdminMobile 超管手机号，脱敏后返回
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthorizationStatus 企业认证状态字段。值如下：
<ul>
  <li>**"UNVERIFIED"**： 未认证的企业</li>
  <li>**"VERIFYINGLEGALPENDINGAUTHORIZATION"**： 认证中待法人授权的企业</li>
  <li>**"VERIFYINGAUTHORIZATIONFILEPENDING"**： 认证中授权书审核中的企业</li>
  <li>**"VERIFYINGAUTHORIZATIONFILEREJECT"**： 认证中授权书已驳回的企业</li>
  <li>**"VERIFYING"**： 认证中的企业</li>
  <li>**"VERIFIED"**： 已认证的企业</li>
</ul>
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthorizationStatus 企业认证状态字段。值如下：
<ul>
  <li>**"UNVERIFIED"**： 未认证的企业</li>
  <li>**"VERIFYINGLEGALPENDINGAUTHORIZATION"**： 认证中待法人授权的企业</li>
  <li>**"VERIFYINGAUTHORIZATIONFILEPENDING"**： 认证中授权书审核中的企业</li>
  <li>**"VERIFYINGAUTHORIZATIONFILEREJECT"**： 认证中授权书已驳回的企业</li>
  <li>**"VERIFYING"**： 认证中的企业</li>
  <li>**"VERIFIED"**： 已认证的企业</li>
</ul>
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthorizationType 企业认证方式字段。值如下：
<ul>
  <li>**"AuthorizationInit"**： 暂未选择授权方式</li>
  <li>**"AuthorizationFile"**： 授权书</li>
  <li>**"AuthorizationLegalPerson"**： 法人授权超管</li>
  <li>**"AuthorizationLegalIdentity"**： 法人直接认证</li>
</ul>
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthorizationType 企业认证方式字段。值如下：
<ul>
  <li>**"AuthorizationInit"**： 暂未选择授权方式</li>
  <li>**"AuthorizationFile"**： 授权书</li>
  <li>**"AuthorizationLegalPerson"**： 法人授权超管</li>
  <li>**"AuthorizationLegalIdentity"**： 法人直接认证</li>
</ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthorizationType(String AuthorizationType) {
        this.AuthorizationType = AuthorizationType;
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

    }
}

