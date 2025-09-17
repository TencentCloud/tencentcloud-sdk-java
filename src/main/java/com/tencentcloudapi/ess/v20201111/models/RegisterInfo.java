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
     * @deprecated
     */
    @Deprecated
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
     * @deprecated
     */
    @Deprecated
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
     */
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
     */
    public void setAuthorizationType(Long AuthorizationType) {
        this.AuthorizationType = AuthorizationType;
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

    }
}

