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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SsoTeamUser extends AbstractModel {

    /**
    * 用户ID
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户名称
    */
    @SerializedName("RealName")
    @Expose
    private String RealName;

    /**
    * 用户类型，1-超级管理员；2-1号管理员；3-普通管理员；99-普通用户
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * 所属租户ID
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * 邮箱
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 电话
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 用户状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间
    */
    @SerializedName("CreateAt")
    @Expose
    private Long CreateAt;

    /**
    * 部门ID
    */
    @SerializedName("DepartmentId")
    @Expose
    private String DepartmentId;

    /**
    * 部门名称
    */
    @SerializedName("DepartmentName")
    @Expose
    private String DepartmentName;

    /**
    * 是否关联权限
    */
    @SerializedName("LinkFilter")
    @Expose
    private Long LinkFilter;

    /**
     * Get 用户ID 
     * @return UserId 用户ID
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID
     * @param UserId 用户ID
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户名称 
     * @return RealName 用户名称
     */
    public String getRealName() {
        return this.RealName;
    }

    /**
     * Set 用户名称
     * @param RealName 用户名称
     */
    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    /**
     * Get 用户类型，1-超级管理员；2-1号管理员；3-普通管理员；99-普通用户 
     * @return UserType 用户类型，1-超级管理员；2-1号管理员；3-普通管理员；99-普通用户
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set 用户类型，1-超级管理员；2-1号管理员；3-普通管理员；99-普通用户
     * @param UserType 用户类型，1-超级管理员；2-1号管理员；3-普通管理员；99-普通用户
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get 所属租户ID 
     * @return TenantId 所属租户ID
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 所属租户ID
     * @param TenantId 所属租户ID
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get 邮箱 
     * @return Email 邮箱
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱
     * @param Email 邮箱
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 电话 
     * @return Phone 电话
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 电话
     * @param Phone 电话
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 用户状态 
     * @return Status 用户状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 用户状态
     * @param Status 用户状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间 
     * @return CreateAt 创建时间
     */
    public Long getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set 创建时间
     * @param CreateAt 创建时间
     */
    public void setCreateAt(Long CreateAt) {
        this.CreateAt = CreateAt;
    }

    /**
     * Get 部门ID 
     * @return DepartmentId 部门ID
     */
    public String getDepartmentId() {
        return this.DepartmentId;
    }

    /**
     * Set 部门ID
     * @param DepartmentId 部门ID
     */
    public void setDepartmentId(String DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    /**
     * Get 部门名称 
     * @return DepartmentName 部门名称
     */
    public String getDepartmentName() {
        return this.DepartmentName;
    }

    /**
     * Set 部门名称
     * @param DepartmentName 部门名称
     */
    public void setDepartmentName(String DepartmentName) {
        this.DepartmentName = DepartmentName;
    }

    /**
     * Get 是否关联权限 
     * @return LinkFilter 是否关联权限
     */
    public Long getLinkFilter() {
        return this.LinkFilter;
    }

    /**
     * Set 是否关联权限
     * @param LinkFilter 是否关联权限
     */
    public void setLinkFilter(Long LinkFilter) {
        this.LinkFilter = LinkFilter;
    }

    public SsoTeamUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SsoTeamUser(SsoTeamUser source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.RealName != null) {
            this.RealName = new String(source.RealName);
        }
        if (source.UserType != null) {
            this.UserType = new String(source.UserType);
        }
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.Email != null) {
            this.Email = new String(source.Email);
        }
        if (source.Phone != null) {
            this.Phone = new String(source.Phone);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateAt != null) {
            this.CreateAt = new Long(source.CreateAt);
        }
        if (source.DepartmentId != null) {
            this.DepartmentId = new String(source.DepartmentId);
        }
        if (source.DepartmentName != null) {
            this.DepartmentName = new String(source.DepartmentName);
        }
        if (source.LinkFilter != null) {
            this.LinkFilter = new Long(source.LinkFilter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "RealName", this.RealName);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateAt", this.CreateAt);
        this.setParamSimple(map, prefix + "DepartmentId", this.DepartmentId);
        this.setParamSimple(map, prefix + "DepartmentName", this.DepartmentName);
        this.setParamSimple(map, prefix + "LinkFilter", this.LinkFilter);

    }
}

