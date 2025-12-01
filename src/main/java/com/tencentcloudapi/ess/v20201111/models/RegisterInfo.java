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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegisterInfo extends AbstractModel {

    /**
    * 法人姓名
    */
    @SerializedName("LegalName")
    @Expose
    private String LegalName;

    /**
    * 社会统一信用代码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uscc")
    @Expose
    private String Uscc;

    /**
    * 社会统一信用代码
    */
    @SerializedName("UnifiedSocialCreditCode")
    @Expose
    private String UnifiedSocialCreditCode;

    /**
    * 组织机构企业注册地址。 请确认该企业注册地址与企业营业执照中注册的地址一致。
    */
    @SerializedName("OrganizationAddress")
    @Expose
    private String OrganizationAddress;

    /**
    * 指定企业认证的授权方式 支持多选:

<ul>
<li><strong>2</strong>: 法人授权方式</li>
<li><strong>5</strong>: 授权书+对公打款方式</li>
</ul>
    */
    @SerializedName("AuthorizationTypes")
    @Expose
    private Long [] AuthorizationTypes;

    /**
    * 指定企业认证的授权方式:

<ul>
<li><strong>2</strong>: 法人授权方式</li>
<li><strong>5</strong>: 授权书+对公打款方式</li>
</ul>
    */
    @SerializedName("AuthorizationType")
    @Expose
    private Long AuthorizationType;

    /**
    * 指定企业认证的授权方式 支持多选:

<ul>
<li><strong>1</strong>: 上传营业执照</li>
<li><strong>2</strong>: 腾讯云快速认证</li>
<li><strong>3</strong>: 腾讯商户号授权<font color="red">（仅支持小程序端）</font></li>
</ul>
    */
    @SerializedName("AuthorizationMethods")
    @Expose
    private Long [] AuthorizationMethods;

    /**
    * 企业证照类型：

USCC :(默认)工商组织营业执照
PRACTICELICENSEOFMEDICALINSTITUTION :医疗机构执业许可证
    */
    @SerializedName("OrganizationIdCardType")
    @Expose
    private String OrganizationIdCardType;

    /**
    * 企业创建时候的个性化参数。
其中，包括一下内容：
LegalNameSame  是否可以编辑法人。
UnifiedSocialCreditCodeSame  是否可以编辑证件号码。
OrganizationIdCardTypeSame  是否可以更改证照类型。
    */
    @SerializedName("RegisterInfoOption")
    @Expose
    private RegisterInfoOption RegisterInfoOption;

    /**
     * Get 法人姓名 
     * @return LegalName 法人姓名
     */
    public String getLegalName() {
        return this.LegalName;
    }

    /**
     * Set 法人姓名
     * @param LegalName 法人姓名
     */
    public void setLegalName(String LegalName) {
        this.LegalName = LegalName;
    }

    /**
     * Get 社会统一信用代码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uscc 社会统一信用代码
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getUscc() {
        return this.Uscc;
    }

    /**
     * Set 社会统一信用代码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uscc 社会统一信用代码
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setUscc(String Uscc) {
        this.Uscc = Uscc;
    }

    /**
     * Get 社会统一信用代码 
     * @return UnifiedSocialCreditCode 社会统一信用代码
     */
    public String getUnifiedSocialCreditCode() {
        return this.UnifiedSocialCreditCode;
    }

    /**
     * Set 社会统一信用代码
     * @param UnifiedSocialCreditCode 社会统一信用代码
     */
    public void setUnifiedSocialCreditCode(String UnifiedSocialCreditCode) {
        this.UnifiedSocialCreditCode = UnifiedSocialCreditCode;
    }

    /**
     * Get 组织机构企业注册地址。 请确认该企业注册地址与企业营业执照中注册的地址一致。 
     * @return OrganizationAddress 组织机构企业注册地址。 请确认该企业注册地址与企业营业执照中注册的地址一致。
     */
    public String getOrganizationAddress() {
        return this.OrganizationAddress;
    }

    /**
     * Set 组织机构企业注册地址。 请确认该企业注册地址与企业营业执照中注册的地址一致。
     * @param OrganizationAddress 组织机构企业注册地址。 请确认该企业注册地址与企业营业执照中注册的地址一致。
     */
    public void setOrganizationAddress(String OrganizationAddress) {
        this.OrganizationAddress = OrganizationAddress;
    }

    /**
     * Get 指定企业认证的授权方式 支持多选:

<ul>
<li><strong>2</strong>: 法人授权方式</li>
<li><strong>5</strong>: 授权书+对公打款方式</li>
</ul> 
     * @return AuthorizationTypes 指定企业认证的授权方式 支持多选:

<ul>
<li><strong>2</strong>: 法人授权方式</li>
<li><strong>5</strong>: 授权书+对公打款方式</li>
</ul>
     */
    public Long [] getAuthorizationTypes() {
        return this.AuthorizationTypes;
    }

    /**
     * Set 指定企业认证的授权方式 支持多选:

<ul>
<li><strong>2</strong>: 法人授权方式</li>
<li><strong>5</strong>: 授权书+对公打款方式</li>
</ul>
     * @param AuthorizationTypes 指定企业认证的授权方式 支持多选:

<ul>
<li><strong>2</strong>: 法人授权方式</li>
<li><strong>5</strong>: 授权书+对公打款方式</li>
</ul>
     */
    public void setAuthorizationTypes(Long [] AuthorizationTypes) {
        this.AuthorizationTypes = AuthorizationTypes;
    }

    /**
     * Get 指定企业认证的授权方式:

<ul>
<li><strong>2</strong>: 法人授权方式</li>
<li><strong>5</strong>: 授权书+对公打款方式</li>
</ul> 
     * @return AuthorizationType 指定企业认证的授权方式:

<ul>
<li><strong>2</strong>: 法人授权方式</li>
<li><strong>5</strong>: 授权书+对公打款方式</li>
</ul>
     * @deprecated
     */
    @Deprecated
    public Long getAuthorizationType() {
        return this.AuthorizationType;
    }

    /**
     * Set 指定企业认证的授权方式:

<ul>
<li><strong>2</strong>: 法人授权方式</li>
<li><strong>5</strong>: 授权书+对公打款方式</li>
</ul>
     * @param AuthorizationType 指定企业认证的授权方式:

<ul>
<li><strong>2</strong>: 法人授权方式</li>
<li><strong>5</strong>: 授权书+对公打款方式</li>
</ul>
     * @deprecated
     */
    @Deprecated
    public void setAuthorizationType(Long AuthorizationType) {
        this.AuthorizationType = AuthorizationType;
    }

    /**
     * Get 指定企业认证的授权方式 支持多选:

<ul>
<li><strong>1</strong>: 上传营业执照</li>
<li><strong>2</strong>: 腾讯云快速认证</li>
<li><strong>3</strong>: 腾讯商户号授权<font color="red">（仅支持小程序端）</font></li>
</ul> 
     * @return AuthorizationMethods 指定企业认证的授权方式 支持多选:

<ul>
<li><strong>1</strong>: 上传营业执照</li>
<li><strong>2</strong>: 腾讯云快速认证</li>
<li><strong>3</strong>: 腾讯商户号授权<font color="red">（仅支持小程序端）</font></li>
</ul>
     */
    public Long [] getAuthorizationMethods() {
        return this.AuthorizationMethods;
    }

    /**
     * Set 指定企业认证的授权方式 支持多选:

<ul>
<li><strong>1</strong>: 上传营业执照</li>
<li><strong>2</strong>: 腾讯云快速认证</li>
<li><strong>3</strong>: 腾讯商户号授权<font color="red">（仅支持小程序端）</font></li>
</ul>
     * @param AuthorizationMethods 指定企业认证的授权方式 支持多选:

<ul>
<li><strong>1</strong>: 上传营业执照</li>
<li><strong>2</strong>: 腾讯云快速认证</li>
<li><strong>3</strong>: 腾讯商户号授权<font color="red">（仅支持小程序端）</font></li>
</ul>
     */
    public void setAuthorizationMethods(Long [] AuthorizationMethods) {
        this.AuthorizationMethods = AuthorizationMethods;
    }

    /**
     * Get 企业证照类型：

USCC :(默认)工商组织营业执照
PRACTICELICENSEOFMEDICALINSTITUTION :医疗机构执业许可证 
     * @return OrganizationIdCardType 企业证照类型：

USCC :(默认)工商组织营业执照
PRACTICELICENSEOFMEDICALINSTITUTION :医疗机构执业许可证
     */
    public String getOrganizationIdCardType() {
        return this.OrganizationIdCardType;
    }

    /**
     * Set 企业证照类型：

USCC :(默认)工商组织营业执照
PRACTICELICENSEOFMEDICALINSTITUTION :医疗机构执业许可证
     * @param OrganizationIdCardType 企业证照类型：

USCC :(默认)工商组织营业执照
PRACTICELICENSEOFMEDICALINSTITUTION :医疗机构执业许可证
     */
    public void setOrganizationIdCardType(String OrganizationIdCardType) {
        this.OrganizationIdCardType = OrganizationIdCardType;
    }

    /**
     * Get 企业创建时候的个性化参数。
其中，包括一下内容：
LegalNameSame  是否可以编辑法人。
UnifiedSocialCreditCodeSame  是否可以编辑证件号码。
OrganizationIdCardTypeSame  是否可以更改证照类型。 
     * @return RegisterInfoOption 企业创建时候的个性化参数。
其中，包括一下内容：
LegalNameSame  是否可以编辑法人。
UnifiedSocialCreditCodeSame  是否可以编辑证件号码。
OrganizationIdCardTypeSame  是否可以更改证照类型。
     */
    public RegisterInfoOption getRegisterInfoOption() {
        return this.RegisterInfoOption;
    }

    /**
     * Set 企业创建时候的个性化参数。
其中，包括一下内容：
LegalNameSame  是否可以编辑法人。
UnifiedSocialCreditCodeSame  是否可以编辑证件号码。
OrganizationIdCardTypeSame  是否可以更改证照类型。
     * @param RegisterInfoOption 企业创建时候的个性化参数。
其中，包括一下内容：
LegalNameSame  是否可以编辑法人。
UnifiedSocialCreditCodeSame  是否可以编辑证件号码。
OrganizationIdCardTypeSame  是否可以更改证照类型。
     */
    public void setRegisterInfoOption(RegisterInfoOption RegisterInfoOption) {
        this.RegisterInfoOption = RegisterInfoOption;
    }

    public RegisterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterInfo(RegisterInfo source) {
        if (source.LegalName != null) {
            this.LegalName = new String(source.LegalName);
        }
        if (source.Uscc != null) {
            this.Uscc = new String(source.Uscc);
        }
        if (source.UnifiedSocialCreditCode != null) {
            this.UnifiedSocialCreditCode = new String(source.UnifiedSocialCreditCode);
        }
        if (source.OrganizationAddress != null) {
            this.OrganizationAddress = new String(source.OrganizationAddress);
        }
        if (source.AuthorizationTypes != null) {
            this.AuthorizationTypes = new Long[source.AuthorizationTypes.length];
            for (int i = 0; i < source.AuthorizationTypes.length; i++) {
                this.AuthorizationTypes[i] = new Long(source.AuthorizationTypes[i]);
            }
        }
        if (source.AuthorizationType != null) {
            this.AuthorizationType = new Long(source.AuthorizationType);
        }
        if (source.AuthorizationMethods != null) {
            this.AuthorizationMethods = new Long[source.AuthorizationMethods.length];
            for (int i = 0; i < source.AuthorizationMethods.length; i++) {
                this.AuthorizationMethods[i] = new Long(source.AuthorizationMethods[i]);
            }
        }
        if (source.OrganizationIdCardType != null) {
            this.OrganizationIdCardType = new String(source.OrganizationIdCardType);
        }
        if (source.RegisterInfoOption != null) {
            this.RegisterInfoOption = new RegisterInfoOption(source.RegisterInfoOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LegalName", this.LegalName);
        this.setParamSimple(map, prefix + "Uscc", this.Uscc);
        this.setParamSimple(map, prefix + "UnifiedSocialCreditCode", this.UnifiedSocialCreditCode);
        this.setParamSimple(map, prefix + "OrganizationAddress", this.OrganizationAddress);
        this.setParamArraySimple(map, prefix + "AuthorizationTypes.", this.AuthorizationTypes);
        this.setParamSimple(map, prefix + "AuthorizationType", this.AuthorizationType);
        this.setParamArraySimple(map, prefix + "AuthorizationMethods.", this.AuthorizationMethods);
        this.setParamSimple(map, prefix + "OrganizationIdCardType", this.OrganizationIdCardType);
        this.setParamObj(map, prefix + "RegisterInfoOption.", this.RegisterInfoOption);

    }
}

