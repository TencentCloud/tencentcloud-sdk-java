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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetAccountSummaryResponse extends AbstractModel{

    /**
    * 策略数
    */
    @SerializedName("Policies")
    @Expose
    private Long Policies;

    /**
    * 角色数
    */
    @SerializedName("Roles")
    @Expose
    private Long Roles;

    /**
    * 身份提供商数
    */
    @SerializedName("Idps")
    @Expose
    private Long Idps;

    /**
    * 子账户数
    */
    @SerializedName("User")
    @Expose
    private Long User;

    /**
    * 分组数
    */
    @SerializedName("Group")
    @Expose
    private Long Group;

    /**
    * 分组用户总数
    */
    @SerializedName("Member")
    @Expose
    private Long Member;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 策略数 
     * @return Policies 策略数
     */
    public Long getPolicies() {
        return this.Policies;
    }

    /**
     * Set 策略数
     * @param Policies 策略数
     */
    public void setPolicies(Long Policies) {
        this.Policies = Policies;
    }

    /**
     * Get 角色数 
     * @return Roles 角色数
     */
    public Long getRoles() {
        return this.Roles;
    }

    /**
     * Set 角色数
     * @param Roles 角色数
     */
    public void setRoles(Long Roles) {
        this.Roles = Roles;
    }

    /**
     * Get 身份提供商数 
     * @return Idps 身份提供商数
     */
    public Long getIdps() {
        return this.Idps;
    }

    /**
     * Set 身份提供商数
     * @param Idps 身份提供商数
     */
    public void setIdps(Long Idps) {
        this.Idps = Idps;
    }

    /**
     * Get 子账户数 
     * @return User 子账户数
     */
    public Long getUser() {
        return this.User;
    }

    /**
     * Set 子账户数
     * @param User 子账户数
     */
    public void setUser(Long User) {
        this.User = User;
    }

    /**
     * Get 分组数 
     * @return Group 分组数
     */
    public Long getGroup() {
        return this.Group;
    }

    /**
     * Set 分组数
     * @param Group 分组数
     */
    public void setGroup(Long Group) {
        this.Group = Group;
    }

    /**
     * Get 分组用户总数 
     * @return Member 分组用户总数
     */
    public Long getMember() {
        return this.Member;
    }

    /**
     * Set 分组用户总数
     * @param Member 分组用户总数
     */
    public void setMember(Long Member) {
        this.Member = Member;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetAccountSummaryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAccountSummaryResponse(GetAccountSummaryResponse source) {
        if (source.Policies != null) {
            this.Policies = new Long(source.Policies);
        }
        if (source.Roles != null) {
            this.Roles = new Long(source.Roles);
        }
        if (source.Idps != null) {
            this.Idps = new Long(source.Idps);
        }
        if (source.User != null) {
            this.User = new Long(source.User);
        }
        if (source.Group != null) {
            this.Group = new Long(source.Group);
        }
        if (source.Member != null) {
            this.Member = new Long(source.Member);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Policies", this.Policies);
        this.setParamSimple(map, prefix + "Roles", this.Roles);
        this.setParamSimple(map, prefix + "Idps", this.Idps);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "Member", this.Member);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

