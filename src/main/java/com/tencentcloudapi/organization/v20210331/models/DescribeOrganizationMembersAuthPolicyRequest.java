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

public class DescribeOrganizationMembersAuthPolicyRequest extends AbstractModel {

    /**
    * <p>偏移量。取值是limit的整数倍。默认值 : 0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>限制数目。取值范围：1~50。默认值：10。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>成员uin。</p>
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
    * <p>集团管理员子账号uin。</p>
    */
    @SerializedName("OrgSubAccountUin")
    @Expose
    private Long OrgSubAccountUin;

    /**
    * <p>成员访问策略Id。</p>
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
     * Get <p>偏移量。取值是limit的整数倍。默认值 : 0。</p> 
     * @return Offset <p>偏移量。取值是limit的整数倍。默认值 : 0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量。取值是limit的整数倍。默认值 : 0。</p>
     * @param Offset <p>偏移量。取值是limit的整数倍。默认值 : 0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>限制数目。取值范围：1~50。默认值：10。</p> 
     * @return Limit <p>限制数目。取值范围：1~50。默认值：10。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>限制数目。取值范围：1~50。默认值：10。</p>
     * @param Limit <p>限制数目。取值范围：1~50。默认值：10。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>成员uin。</p> 
     * @return MemberUin <p>成员uin。</p>
     */
    public Long getMemberUin() {
        return this.MemberUin;
    }

    /**
     * Set <p>成员uin。</p>
     * @param MemberUin <p>成员uin。</p>
     */
    public void setMemberUin(Long MemberUin) {
        this.MemberUin = MemberUin;
    }

    /**
     * Get <p>集团管理员子账号uin。</p> 
     * @return OrgSubAccountUin <p>集团管理员子账号uin。</p>
     */
    public Long getOrgSubAccountUin() {
        return this.OrgSubAccountUin;
    }

    /**
     * Set <p>集团管理员子账号uin。</p>
     * @param OrgSubAccountUin <p>集团管理员子账号uin。</p>
     */
    public void setOrgSubAccountUin(Long OrgSubAccountUin) {
        this.OrgSubAccountUin = OrgSubAccountUin;
    }

    /**
     * Get <p>成员访问策略Id。</p> 
     * @return PolicyId <p>成员访问策略Id。</p>
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set <p>成员访问策略Id。</p>
     * @param PolicyId <p>成员访问策略Id。</p>
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    public DescribeOrganizationMembersAuthPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrganizationMembersAuthPolicyRequest(DescribeOrganizationMembersAuthPolicyRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
        if (source.OrgSubAccountUin != null) {
            this.OrgSubAccountUin = new Long(source.OrgSubAccountUin);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "OrgSubAccountUin", this.OrgSubAccountUin);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);

    }
}

