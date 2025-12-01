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

public class RegisterInfoOption extends AbstractModel {

    /**
    * 是否允许编辑企业注册时的法人姓名。
<br/>true：允许编辑<br/>false：不允许编辑（默认值）<br/>

注意：
RegisterInfo 中的LegalName值不为空的时候，才可设置为不可编辑。
    */
    @SerializedName("LegalNameSame")
    @Expose
    private Boolean LegalNameSame;

    /**
    * 是否允许编辑企业注册时统一社会信用代码。
<br/>true:不允许编辑。
<br/>false:允许编辑（默认值）。
<br/>


注意：
RegisterInfo 中的UnifiedSocialCreditCode值不为空的时候，才可设置为不可编辑。

    */
    @SerializedName("UnifiedSocialCreditCodeCNameSame")
    @Expose
    private Boolean UnifiedSocialCreditCodeCNameSame;

    /**
    * 是否允许编辑企业注册时的证照类型
<br/>true:不允许编辑。
<br/>false:允许编辑（默认值）。
<br/>

注意：
RegisterInfo 中的OrganizationIdCardType值不为空的时候，才可设置为不可编辑。
    */
    @SerializedName("OrganizationIdCardTypeSame")
    @Expose
    private Boolean OrganizationIdCardTypeSame;

    /**
     * Get 是否允许编辑企业注册时的法人姓名。
<br/>true：允许编辑<br/>false：不允许编辑（默认值）<br/>

注意：
RegisterInfo 中的LegalName值不为空的时候，才可设置为不可编辑。 
     * @return LegalNameSame 是否允许编辑企业注册时的法人姓名。
<br/>true：允许编辑<br/>false：不允许编辑（默认值）<br/>

注意：
RegisterInfo 中的LegalName值不为空的时候，才可设置为不可编辑。
     */
    public Boolean getLegalNameSame() {
        return this.LegalNameSame;
    }

    /**
     * Set 是否允许编辑企业注册时的法人姓名。
<br/>true：允许编辑<br/>false：不允许编辑（默认值）<br/>

注意：
RegisterInfo 中的LegalName值不为空的时候，才可设置为不可编辑。
     * @param LegalNameSame 是否允许编辑企业注册时的法人姓名。
<br/>true：允许编辑<br/>false：不允许编辑（默认值）<br/>

注意：
RegisterInfo 中的LegalName值不为空的时候，才可设置为不可编辑。
     */
    public void setLegalNameSame(Boolean LegalNameSame) {
        this.LegalNameSame = LegalNameSame;
    }

    /**
     * Get 是否允许编辑企业注册时统一社会信用代码。
<br/>true:不允许编辑。
<br/>false:允许编辑（默认值）。
<br/>


注意：
RegisterInfo 中的UnifiedSocialCreditCode值不为空的时候，才可设置为不可编辑。
 
     * @return UnifiedSocialCreditCodeCNameSame 是否允许编辑企业注册时统一社会信用代码。
<br/>true:不允许编辑。
<br/>false:允许编辑（默认值）。
<br/>


注意：
RegisterInfo 中的UnifiedSocialCreditCode值不为空的时候，才可设置为不可编辑。

     */
    public Boolean getUnifiedSocialCreditCodeCNameSame() {
        return this.UnifiedSocialCreditCodeCNameSame;
    }

    /**
     * Set 是否允许编辑企业注册时统一社会信用代码。
<br/>true:不允许编辑。
<br/>false:允许编辑（默认值）。
<br/>


注意：
RegisterInfo 中的UnifiedSocialCreditCode值不为空的时候，才可设置为不可编辑。

     * @param UnifiedSocialCreditCodeCNameSame 是否允许编辑企业注册时统一社会信用代码。
<br/>true:不允许编辑。
<br/>false:允许编辑（默认值）。
<br/>


注意：
RegisterInfo 中的UnifiedSocialCreditCode值不为空的时候，才可设置为不可编辑。

     */
    public void setUnifiedSocialCreditCodeCNameSame(Boolean UnifiedSocialCreditCodeCNameSame) {
        this.UnifiedSocialCreditCodeCNameSame = UnifiedSocialCreditCodeCNameSame;
    }

    /**
     * Get 是否允许编辑企业注册时的证照类型
<br/>true:不允许编辑。
<br/>false:允许编辑（默认值）。
<br/>

注意：
RegisterInfo 中的OrganizationIdCardType值不为空的时候，才可设置为不可编辑。 
     * @return OrganizationIdCardTypeSame 是否允许编辑企业注册时的证照类型
<br/>true:不允许编辑。
<br/>false:允许编辑（默认值）。
<br/>

注意：
RegisterInfo 中的OrganizationIdCardType值不为空的时候，才可设置为不可编辑。
     */
    public Boolean getOrganizationIdCardTypeSame() {
        return this.OrganizationIdCardTypeSame;
    }

    /**
     * Set 是否允许编辑企业注册时的证照类型
<br/>true:不允许编辑。
<br/>false:允许编辑（默认值）。
<br/>

注意：
RegisterInfo 中的OrganizationIdCardType值不为空的时候，才可设置为不可编辑。
     * @param OrganizationIdCardTypeSame 是否允许编辑企业注册时的证照类型
<br/>true:不允许编辑。
<br/>false:允许编辑（默认值）。
<br/>

注意：
RegisterInfo 中的OrganizationIdCardType值不为空的时候，才可设置为不可编辑。
     */
    public void setOrganizationIdCardTypeSame(Boolean OrganizationIdCardTypeSame) {
        this.OrganizationIdCardTypeSame = OrganizationIdCardTypeSame;
    }

    public RegisterInfoOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegisterInfoOption(RegisterInfoOption source) {
        if (source.LegalNameSame != null) {
            this.LegalNameSame = new Boolean(source.LegalNameSame);
        }
        if (source.UnifiedSocialCreditCodeCNameSame != null) {
            this.UnifiedSocialCreditCodeCNameSame = new Boolean(source.UnifiedSocialCreditCodeCNameSame);
        }
        if (source.OrganizationIdCardTypeSame != null) {
            this.OrganizationIdCardTypeSame = new Boolean(source.OrganizationIdCardTypeSame);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LegalNameSame", this.LegalNameSame);
        this.setParamSimple(map, prefix + "UnifiedSocialCreditCodeCNameSame", this.UnifiedSocialCreditCodeCNameSame);
        this.setParamSimple(map, prefix + "OrganizationIdCardTypeSame", this.OrganizationIdCardTypeSame);

    }
}

