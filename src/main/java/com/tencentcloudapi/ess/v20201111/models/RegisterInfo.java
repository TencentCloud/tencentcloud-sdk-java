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
        if (source.AuthorizationTypes != null) {
            this.AuthorizationTypes = new Long[source.AuthorizationTypes.length];
            for (int i = 0; i < source.AuthorizationTypes.length; i++) {
                this.AuthorizationTypes[i] = new Long(source.AuthorizationTypes[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LegalName", this.LegalName);
        this.setParamSimple(map, prefix + "Uscc", this.Uscc);
        this.setParamSimple(map, prefix + "UnifiedSocialCreditCode", this.UnifiedSocialCreditCode);
        this.setParamArraySimple(map, prefix + "AuthorizationTypes.", this.AuthorizationTypes);

    }
}

