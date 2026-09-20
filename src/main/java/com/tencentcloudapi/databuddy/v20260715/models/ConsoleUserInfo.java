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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsoleUserInfo extends AbstractModel {

    /**
    * 用户 UIN
    */
    @SerializedName("UserUin")
    @Expose
    private String UserUin;

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 昵称
    */
    @SerializedName("Nickname")
    @Expose
    private String Nickname;

    /**
    * 角色列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Roles")
    @Expose
    private RoleBasicInfo [] Roles;

    /**
    * 用户来源，group：用户组、user:用户
    */
    @SerializedName("UserSource")
    @Expose
    private String UserSource;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 是否主账号
    */
    @SerializedName("IsOwner")
    @Expose
    private Boolean IsOwner;

    /**
    * 0: 普通用户 1: entraId用户
    */
    @SerializedName("UserTag")
    @Expose
    private Long UserTag;

    /**
    * 是否具有 admin 权限的子账号
    */
    @SerializedName("IsAdmin")
    @Expose
    private Boolean IsAdmin;

    /**
     * Get 用户 UIN 
     * @return UserUin 用户 UIN
     */
    public String getUserUin() {
        return this.UserUin;
    }

    /**
     * Set 用户 UIN
     * @param UserUin 用户 UIN
     */
    public void setUserUin(String UserUin) {
        this.UserUin = UserUin;
    }

    /**
     * Get 用户名 
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 昵称 
     * @return Nickname 昵称
     */
    public String getNickname() {
        return this.Nickname;
    }

    /**
     * Set 昵称
     * @param Nickname 昵称
     */
    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    /**
     * Get 角色列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Roles 角色列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RoleBasicInfo [] getRoles() {
        return this.Roles;
    }

    /**
     * Set 角色列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Roles 角色列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoles(RoleBasicInfo [] Roles) {
        this.Roles = Roles;
    }

    /**
     * Get 用户来源，group：用户组、user:用户 
     * @return UserSource 用户来源，group：用户组、user:用户
     */
    public String getUserSource() {
        return this.UserSource;
    }

    /**
     * Set 用户来源，group：用户组、user:用户
     * @param UserSource 用户来源，group：用户组、user:用户
     */
    public void setUserSource(String UserSource) {
        this.UserSource = UserSource;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 是否主账号 
     * @return IsOwner 是否主账号
     */
    public Boolean getIsOwner() {
        return this.IsOwner;
    }

    /**
     * Set 是否主账号
     * @param IsOwner 是否主账号
     */
    public void setIsOwner(Boolean IsOwner) {
        this.IsOwner = IsOwner;
    }

    /**
     * Get 0: 普通用户 1: entraId用户 
     * @return UserTag 0: 普通用户 1: entraId用户
     */
    public Long getUserTag() {
        return this.UserTag;
    }

    /**
     * Set 0: 普通用户 1: entraId用户
     * @param UserTag 0: 普通用户 1: entraId用户
     */
    public void setUserTag(Long UserTag) {
        this.UserTag = UserTag;
    }

    /**
     * Get 是否具有 admin 权限的子账号 
     * @return IsAdmin 是否具有 admin 权限的子账号
     */
    public Boolean getIsAdmin() {
        return this.IsAdmin;
    }

    /**
     * Set 是否具有 admin 权限的子账号
     * @param IsAdmin 是否具有 admin 权限的子账号
     */
    public void setIsAdmin(Boolean IsAdmin) {
        this.IsAdmin = IsAdmin;
    }

    public ConsoleUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsoleUserInfo(ConsoleUserInfo source) {
        if (source.UserUin != null) {
            this.UserUin = new String(source.UserUin);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Nickname != null) {
            this.Nickname = new String(source.Nickname);
        }
        if (source.Roles != null) {
            this.Roles = new RoleBasicInfo[source.Roles.length];
            for (int i = 0; i < source.Roles.length; i++) {
                this.Roles[i] = new RoleBasicInfo(source.Roles[i]);
            }
        }
        if (source.UserSource != null) {
            this.UserSource = new String(source.UserSource);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.IsOwner != null) {
            this.IsOwner = new Boolean(source.IsOwner);
        }
        if (source.UserTag != null) {
            this.UserTag = new Long(source.UserTag);
        }
        if (source.IsAdmin != null) {
            this.IsAdmin = new Boolean(source.IsAdmin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserUin", this.UserUin);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Nickname", this.Nickname);
        this.setParamArrayObj(map, prefix + "Roles.", this.Roles);
        this.setParamSimple(map, prefix + "UserSource", this.UserSource);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "IsOwner", this.IsOwner);
        this.setParamSimple(map, prefix + "UserTag", this.UserTag);
        this.setParamSimple(map, prefix + "IsAdmin", this.IsAdmin);

    }
}

