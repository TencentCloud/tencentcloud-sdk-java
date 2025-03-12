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

public class UpdateOrganizationMembersPolicyRequest extends AbstractModel {

    /**
    * 成员Uin列表。最多10个
    */
    @SerializedName("MemberUins")
    @Expose
    private Long [] MemberUins;

    /**
    * 成员访问策略Id。可通过DescribeOrganizationMemberPolicies获取
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 成员访问身份ID。可通过ListOrganizationIdentity获取
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
     * Get 成员访问策略Id。可通过DescribeOrganizationMemberPolicies获取 
     * @return PolicyId 成员访问策略Id。可通过DescribeOrganizationMemberPolicies获取
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 成员访问策略Id。可通过DescribeOrganizationMemberPolicies获取
     * @param PolicyId 成员访问策略Id。可通过DescribeOrganizationMemberPolicies获取
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 成员访问身份ID。可通过ListOrganizationIdentity获取 
     * @return IdentityId 成员访问身份ID。可通过ListOrganizationIdentity获取
     */
    public Long getIdentityId() {
        return this.IdentityId;
    }

    /**
     * Set 成员访问身份ID。可通过ListOrganizationIdentity获取
     * @param IdentityId 成员访问身份ID。可通过ListOrganizationIdentity获取
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

    public UpdateOrganizationMembersPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateOrganizationMembersPolicyRequest(UpdateOrganizationMembersPolicyRequest source) {
        if (source.MemberUins != null) {
            this.MemberUins = new Long[source.MemberUins.length];
            for (int i = 0; i < source.MemberUins.length; i++) {
                this.MemberUins[i] = new Long(source.MemberUins[i]);
            }
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
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
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "IdentityId", this.IdentityId);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

