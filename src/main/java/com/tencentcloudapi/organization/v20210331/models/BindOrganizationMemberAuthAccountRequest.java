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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindOrganizationMemberAuthAccountRequest extends AbstractModel{

    /**
    * 成员Uin。
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
    * 策略ID。
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 组织子账号Uin。
    */
    @SerializedName("OrgSubAccountUins")
    @Expose
    private Long [] OrgSubAccountUins;

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
     * Get 策略ID。 
     * @return PolicyId 策略ID。
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set 策略ID。
     * @param PolicyId 策略ID。
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get 组织子账号Uin。 
     * @return OrgSubAccountUins 组织子账号Uin。
     */
    public Long [] getOrgSubAccountUins() {
        return this.OrgSubAccountUins;
    }

    /**
     * Set 组织子账号Uin。
     * @param OrgSubAccountUins 组织子账号Uin。
     */
    public void setOrgSubAccountUins(Long [] OrgSubAccountUins) {
        this.OrgSubAccountUins = OrgSubAccountUins;
    }

    public BindOrganizationMemberAuthAccountRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindOrganizationMemberAuthAccountRequest(BindOrganizationMemberAuthAccountRequest source) {
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.OrgSubAccountUins != null) {
            this.OrgSubAccountUins = new Long[source.OrgSubAccountUins.length];
            for (int i = 0; i < source.OrgSubAccountUins.length; i++) {
                this.OrgSubAccountUins[i] = new Long(source.OrgSubAccountUins[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamArraySimple(map, prefix + "OrgSubAccountUins.", this.OrgSubAccountUins);

    }
}

