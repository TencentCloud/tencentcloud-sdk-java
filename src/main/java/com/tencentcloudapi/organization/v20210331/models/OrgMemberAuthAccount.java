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

public class OrgMemberAuthAccount extends AbstractModel {

    /**
    * 组织子账号Uin。
    */
    @SerializedName("OrgSubAccountUin")
    @Expose
    private Long OrgSubAccountUin;

    /**
    * 策略ID。
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 策略名。
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * 身份ID。
    */
    @SerializedName("IdentityId")
    @Expose
    private Long IdentityId;

    /**
    * 身份角色名。
    */
    @SerializedName("IdentityRoleName")
    @Expose
    private String IdentityRoleName;

    /**
    * 身份角色别名。
    */
    @SerializedName("IdentityRoleAliasName")
    @Expose
    private String IdentityRoleAliasName;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 子账号名称
    */
    @SerializedName("OrgSubAccountName")
    @Expose
    private String OrgSubAccountName;

    /**
     * Get 组织子账号Uin。 
     * @return OrgSubAccountUin 组织子账号Uin。
     */
    public Long getOrgSubAccountUin() {
        return this.OrgSubAccountUin;
    }

    /**
     * Set 组织子账号Uin。
     * @param OrgSubAccountUin 组织子账号Uin。
     */
    public void setOrgSubAccountUin(Long OrgSubAccountUin) {
        this.OrgSubAccountUin = OrgSubAccountUin;
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
     * Get 策略名。 
     * @return PolicyName 策略名。
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set 策略名。
     * @param PolicyName 策略名。
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get 身份ID。 
     * @return IdentityId 身份ID。
     */
    public Long getIdentityId() {
        return this.IdentityId;
    }

    /**
     * Set 身份ID。
     * @param IdentityId 身份ID。
     */
    public void setIdentityId(Long IdentityId) {
        this.IdentityId = IdentityId;
    }

    /**
     * Get 身份角色名。 
     * @return IdentityRoleName 身份角色名。
     */
    public String getIdentityRoleName() {
        return this.IdentityRoleName;
    }

    /**
     * Set 身份角色名。
     * @param IdentityRoleName 身份角色名。
     */
    public void setIdentityRoleName(String IdentityRoleName) {
        this.IdentityRoleName = IdentityRoleName;
    }

    /**
     * Get 身份角色别名。 
     * @return IdentityRoleAliasName 身份角色别名。
     */
    public String getIdentityRoleAliasName() {
        return this.IdentityRoleAliasName;
    }

    /**
     * Set 身份角色别名。
     * @param IdentityRoleAliasName 身份角色别名。
     */
    public void setIdentityRoleAliasName(String IdentityRoleAliasName) {
        this.IdentityRoleAliasName = IdentityRoleAliasName;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间。 
     * @return UpdateTime 更新时间。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间。
     * @param UpdateTime 更新时间。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 子账号名称 
     * @return OrgSubAccountName 子账号名称
     */
    public String getOrgSubAccountName() {
        return this.OrgSubAccountName;
    }

    /**
     * Set 子账号名称
     * @param OrgSubAccountName 子账号名称
     */
    public void setOrgSubAccountName(String OrgSubAccountName) {
        this.OrgSubAccountName = OrgSubAccountName;
    }

    public OrgMemberAuthAccount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrgMemberAuthAccount(OrgMemberAuthAccount source) {
        if (source.OrgSubAccountUin != null) {
            this.OrgSubAccountUin = new Long(source.OrgSubAccountUin);
        }
        if (source.PolicyId != null) {
            this.PolicyId = new Long(source.PolicyId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.IdentityId != null) {
            this.IdentityId = new Long(source.IdentityId);
        }
        if (source.IdentityRoleName != null) {
            this.IdentityRoleName = new String(source.IdentityRoleName);
        }
        if (source.IdentityRoleAliasName != null) {
            this.IdentityRoleAliasName = new String(source.IdentityRoleAliasName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.OrgSubAccountName != null) {
            this.OrgSubAccountName = new String(source.OrgSubAccountName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrgSubAccountUin", this.OrgSubAccountUin);
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "IdentityId", this.IdentityId);
        this.setParamSimple(map, prefix + "IdentityRoleName", this.IdentityRoleName);
        this.setParamSimple(map, prefix + "IdentityRoleAliasName", this.IdentityRoleAliasName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "OrgSubAccountName", this.OrgSubAccountName);

    }
}

