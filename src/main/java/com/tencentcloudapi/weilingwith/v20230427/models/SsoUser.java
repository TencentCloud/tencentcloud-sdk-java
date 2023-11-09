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

public class SsoUser extends AbstractModel {

    /**
    * 用户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RealName")
    @Expose
    private String RealName;

    /**
    * 用户类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserType")
    @Expose
    private String UserType;

    /**
    * 所属租户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * 所属组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserGroup")
    @Expose
    private String UserGroup;

    /**
    * 邮箱
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
    * 电话
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Phone")
    @Expose
    private String Phone;

    /**
    * 用户状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateAt")
    @Expose
    private Long CreateAt;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateAt")
    @Expose
    private Long UpdateAt;

    /**
    * 是否属于团队
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BelongTeam")
    @Expose
    private Long BelongTeam;

    /**
    * ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DepartmentId")
    @Expose
    private String DepartmentId;

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DepartmentName")
    @Expose
    private String DepartmentName;

    /**
    * 子账户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DepartmentUserId")
    @Expose
    private Long DepartmentUserId;

    /**
    * 密码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
     * Get 用户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 用户昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 用户昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 用户名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RealName 用户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRealName() {
        return this.RealName;
    }

    /**
     * Set 用户名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RealName 用户名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRealName(String RealName) {
        this.RealName = RealName;
    }

    /**
     * Get 用户类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserType 用户类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserType() {
        return this.UserType;
    }

    /**
     * Set 用户类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserType 用户类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    /**
     * Get 所属租户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TenantId 所属租户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 所属租户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TenantId 所属租户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get 所属组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserGroup 所属组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserGroup() {
        return this.UserGroup;
    }

    /**
     * Set 所属组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserGroup 所属组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserGroup(String UserGroup) {
        this.UserGroup = UserGroup;
    }

    /**
     * Get 邮箱
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Email 邮箱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * Set 邮箱
注意：此字段可能返回 null，表示取不到有效值。
     * @param Email 邮箱
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Get 电话
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Phone 电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPhone() {
        return this.Phone;
    }

    /**
     * Set 电话
注意：此字段可能返回 null，表示取不到有效值。
     * @param Phone 电话
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * Get 用户状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 用户状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 用户状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 用户状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateAt 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateAt 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateAt(Long CreateAt) {
        this.CreateAt = CreateAt;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateAt 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateAt() {
        return this.UpdateAt;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateAt 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateAt(Long UpdateAt) {
        this.UpdateAt = UpdateAt;
    }

    /**
     * Get 是否属于团队
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BelongTeam 是否属于团队
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBelongTeam() {
        return this.BelongTeam;
    }

    /**
     * Set 是否属于团队
注意：此字段可能返回 null，表示取不到有效值。
     * @param BelongTeam 是否属于团队
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBelongTeam(Long BelongTeam) {
        this.BelongTeam = BelongTeam;
    }

    /**
     * Get ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DepartmentId ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDepartmentId() {
        return this.DepartmentId;
    }

    /**
     * Set ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DepartmentId ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDepartmentId(String DepartmentId) {
        this.DepartmentId = DepartmentId;
    }

    /**
     * Get 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DepartmentName 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDepartmentName() {
        return this.DepartmentName;
    }

    /**
     * Set 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DepartmentName 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDepartmentName(String DepartmentName) {
        this.DepartmentName = DepartmentName;
    }

    /**
     * Get 子账户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DepartmentUserId 子账户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDepartmentUserId() {
        return this.DepartmentUserId;
    }

    /**
     * Set 子账户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DepartmentUserId 子账户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDepartmentUserId(Long DepartmentUserId) {
        this.DepartmentUserId = DepartmentUserId;
    }

    /**
     * Get 密码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Password 密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set 密码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Password 密码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    public SsoUser() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SsoUser(SsoUser source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
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
        if (source.UserGroup != null) {
            this.UserGroup = new String(source.UserGroup);
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
        if (source.UpdateAt != null) {
            this.UpdateAt = new Long(source.UpdateAt);
        }
        if (source.BelongTeam != null) {
            this.BelongTeam = new Long(source.BelongTeam);
        }
        if (source.DepartmentId != null) {
            this.DepartmentId = new String(source.DepartmentId);
        }
        if (source.DepartmentName != null) {
            this.DepartmentName = new String(source.DepartmentName);
        }
        if (source.DepartmentUserId != null) {
            this.DepartmentUserId = new Long(source.DepartmentUserId);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "RealName", this.RealName);
        this.setParamSimple(map, prefix + "UserType", this.UserType);
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "UserGroup", this.UserGroup);
        this.setParamSimple(map, prefix + "Email", this.Email);
        this.setParamSimple(map, prefix + "Phone", this.Phone);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateAt", this.CreateAt);
        this.setParamSimple(map, prefix + "UpdateAt", this.UpdateAt);
        this.setParamSimple(map, prefix + "BelongTeam", this.BelongTeam);
        this.setParamSimple(map, prefix + "DepartmentId", this.DepartmentId);
        this.setParamSimple(map, prefix + "DepartmentName", this.DepartmentName);
        this.setParamSimple(map, prefix + "DepartmentUserId", this.DepartmentUserId);
        this.setParamSimple(map, prefix + "Password", this.Password);

    }
}

