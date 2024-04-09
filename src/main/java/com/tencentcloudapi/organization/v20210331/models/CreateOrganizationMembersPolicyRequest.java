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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOrganizationMembersPolicyRequest extends AbstractModel {

    /**
    * 成员Uin列表。最多10个
    */
    @SerializedName("MemberUins")
    @Expose
    private Long [] MemberUins;

    /**
    * 策略名。长度1～128个字符，支持英文字母、数字、符号+=,.@_-
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 成员访问身份ID。可以通过[ListOrganizationIdentity](https://cloud.tencent.com/document/product/850/82934)获取
    */
    @SerializedName("IdentityId")
    @Expose
    private Long IdentityId;

    /**
    * 策略描述。最大长度为128个字符
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 成员Uin列表。最多10个 
     * @return MemberUins 成员Uin列表。最多10个
     */
    public Long [] getMemberUins() {
        return this.MemberUins;
    }

    /**
     * Set 成员Uin列表。最多10个
     * @param MemberUins 成员Uin列表。最多10个
     */
    public void setMemberUins(Long [] MemberUins) {
        this.MemberUins = MemberUins;
    }

    /**
     * Get 策略名。长度1～128个字符，支持英文字母、数字、符号+=,.@_- 
     * @return PolicyName 策略名。长度1～128个字符，支持英文字母、数字、符号+=,.@_-
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 策略名。长度1～128个字符，支持英文字母、数字、符号+=,.@_-
     * @param PolicyName 策略名。长度1～128个字符，支持英文字母、数字、符号+=,.@_-
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 成员访问身份ID。可以通过[ListOrganizationIdentity](https://cloud.tencent.com/document/product/850/82934)获取 
     * @return IdentityId 成员访问身份ID。可以通过[ListOrganizationIdentity](https://cloud.tencent.com/document/product/850/82934)获取
     */
    public Long getIdentityId() {
        return this.IdentityId;
    }

    /**
     * Set 成员访问身份ID。可以通过[ListOrganizationIdentity](https://cloud.tencent.com/document/product/850/82934)获取
     * @param IdentityId 成员访问身份ID。可以通过[ListOrganizationIdentity](https://cloud.tencent.com/document/product/850/82934)获取
     */
    public void setIdentityId(Long IdentityId) {
        this.IdentityId = IdentityId;
    }

    /**
     * Get 策略描述。最大长度为128个字符 
     * @return Description 策略描述。最大长度为128个字符
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 策略描述。最大长度为128个字符
     * @param Description 策略描述。最大长度为128个字符
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateOrganizationMembersPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrganizationMembersPolicyRequest(CreateOrganizationMembersPolicyRequest source) {
        if (source.MemberUins != null) {
            this.MemberUins = new Long[source.MemberUins.length];
            for (int i = 0; i < source.MemberUins.length; i++) {
                this.MemberUins[i] = new Long(source.MemberUins[i]);
            }
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.IdentityId != null) {
            this.IdentityId = new Long(source.IdentityId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberUins.", this.MemberUins);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "IdentityId", this.IdentityId);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

