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

public class OrgMemberAuthIdentity extends AbstractModel {

    /**
    * 身份ID。
    */
    @SerializedName("IdentityId")
    @Expose
    private Long IdentityId;

    /**
    * 身份的角色名。
    */
    @SerializedName("IdentityRoleName")
    @Expose
    private String IdentityRoleName;

    /**
    * 身份的角色别名。
    */
    @SerializedName("IdentityRoleAliasName")
    @Expose
    private String IdentityRoleAliasName;

    /**
    * 身份描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 首次配置成功的时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最后一次配置成功的时间。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 身份类型。取值： 1-预设身份  2-自定义身份
    */
    @SerializedName("IdentityType")
    @Expose
    private Long IdentityType;

    /**
    * 配置状态。取值：1-配置完成 2-需重新配置
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 成员Uin。
    */
    @SerializedName("MemberUin")
    @Expose
    private Long MemberUin;

    /**
    * 成员名称。
    */
    @SerializedName("MemberName")
    @Expose
    private String MemberName;

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
     * Get 身份的角色名。 
     * @return IdentityRoleName 身份的角色名。
     */
    public String getIdentityRoleName() {
        return this.IdentityRoleName;
    }

    /**
     * Set 身份的角色名。
     * @param IdentityRoleName 身份的角色名。
     */
    public void setIdentityRoleName(String IdentityRoleName) {
        this.IdentityRoleName = IdentityRoleName;
    }

    /**
     * Get 身份的角色别名。 
     * @return IdentityRoleAliasName 身份的角色别名。
     */
    public String getIdentityRoleAliasName() {
        return this.IdentityRoleAliasName;
    }

    /**
     * Set 身份的角色别名。
     * @param IdentityRoleAliasName 身份的角色别名。
     */
    public void setIdentityRoleAliasName(String IdentityRoleAliasName) {
        this.IdentityRoleAliasName = IdentityRoleAliasName;
    }

    /**
     * Get 身份描述。 
     * @return Description 身份描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 身份描述。
     * @param Description 身份描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 首次配置成功的时间。 
     * @return CreateTime 首次配置成功的时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 首次配置成功的时间。
     * @param CreateTime 首次配置成功的时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最后一次配置成功的时间。 
     * @return UpdateTime 最后一次配置成功的时间。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 最后一次配置成功的时间。
     * @param UpdateTime 最后一次配置成功的时间。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 身份类型。取值： 1-预设身份  2-自定义身份 
     * @return IdentityType 身份类型。取值： 1-预设身份  2-自定义身份
     */
    public Long getIdentityType() {
        return this.IdentityType;
    }

    /**
     * Set 身份类型。取值： 1-预设身份  2-自定义身份
     * @param IdentityType 身份类型。取值： 1-预设身份  2-自定义身份
     */
    public void setIdentityType(Long IdentityType) {
        this.IdentityType = IdentityType;
    }

    /**
     * Get 配置状态。取值：1-配置完成 2-需重新配置 
     * @return Status 配置状态。取值：1-配置完成 2-需重新配置
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 配置状态。取值：1-配置完成 2-需重新配置
     * @param Status 配置状态。取值：1-配置完成 2-需重新配置
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

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
     * Get 成员名称。 
     * @return MemberName 成员名称。
     */
    public String getMemberName() {
        return this.MemberName;
    }

    /**
     * Set 成员名称。
     * @param MemberName 成员名称。
     */
    public void setMemberName(String MemberName) {
        this.MemberName = MemberName;
    }

    public OrgMemberAuthIdentity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrgMemberAuthIdentity(OrgMemberAuthIdentity source) {
        if (source.IdentityId != null) {
            this.IdentityId = new Long(source.IdentityId);
        }
        if (source.IdentityRoleName != null) {
            this.IdentityRoleName = new String(source.IdentityRoleName);
        }
        if (source.IdentityRoleAliasName != null) {
            this.IdentityRoleAliasName = new String(source.IdentityRoleAliasName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.IdentityType != null) {
            this.IdentityType = new Long(source.IdentityType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.MemberUin != null) {
            this.MemberUin = new Long(source.MemberUin);
        }
        if (source.MemberName != null) {
            this.MemberName = new String(source.MemberName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdentityId", this.IdentityId);
        this.setParamSimple(map, prefix + "IdentityRoleName", this.IdentityRoleName);
        this.setParamSimple(map, prefix + "IdentityRoleAliasName", this.IdentityRoleAliasName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "IdentityType", this.IdentityType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MemberUin", this.MemberUin);
        this.setParamSimple(map, prefix + "MemberName", this.MemberName);

    }
}

