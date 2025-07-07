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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOrganizationMemberPolicyRequest extends AbstractModel {

    /**
    * 成员Uin。
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
    * 策略名。最大长度为128个字符，支持英文字母、数字、符号+=,.@_-
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 成员访问身份ID。可以调用[DescribeOrganizationMemberAuthIdentities](https://cloud.tencent.com/document/product/850/82936)获取
    */
    @SerializedName("IdentityId")
    @Expose
    private Long IdentityId;

    /**
    * 描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 成员Uin。 
     * @return MemberUin 成员Uin。
     */
    public Long getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set 成员Uin。
     * @param MemberUin 成员Uin。
     */
    public void setMemberUin(Long MemberUin) {
        this.MemberUin = MemberUin;
    }

    /**
     * Get 策略名。最大长度为128个字符，支持英文字母、数字、符号+=,.@_- 
     * @return PolicyName 策略名。最大长度为128个字符，支持英文字母、数字、符号+=,.@_-
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 策略名。最大长度为128个字符，支持英文字母、数字、符号+=,.@_-
     * @param PolicyName 策略名。最大长度为128个字符，支持英文字母、数字、符号+=,.@_-
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 成员访问身份ID。可以调用[DescribeOrganizationMemberAuthIdentities](https://cloud.tencent.com/document/product/850/82936)获取 
     * @return IdentityId 成员访问身份ID。可以调用[DescribeOrganizationMemberAuthIdentities](https://cloud.tencent.com/document/product/850/82936)获取
     */
    public Long getIdentityId() {
        return this.IdentityId;
    }

    /**
     * Set 成员访问身份ID。可以调用[DescribeOrganizationMemberAuthIdentities](https://cloud.tencent.com/document/product/850/82936)获取
     * @param IdentityId 成员访问身份ID。可以调用[DescribeOrganizationMemberAuthIdentities](https://cloud.tencent.com/document/product/850/82936)获取
     */
    public void setIdentityId(Long IdentityId) {
        this.IdentityId = IdentityId;
    }

    /**
     * Get 描述。 
     * @return Description 描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述。
     * @param Description 描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateOrganizationMemberPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrganizationMemberPolicyRequest(CreateOrganizationMemberPolicyRequest source) {
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
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
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "IdentityId", this.IdentityId);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

