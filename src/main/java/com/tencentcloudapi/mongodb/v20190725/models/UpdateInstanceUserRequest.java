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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateInstanceUserRequest extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>用户名</p>
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * <p>认证数据库</p>
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * <p>新密码（可选，为空则不修改密码）</p>
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * <p>加密后的密码（可选，与Password二选一）</p>
    */
    @SerializedName("EncryptedPassword")
    @Expose
    private String EncryptedPassword;

    /**
    * <p>新的角色列表（可选，为空则不修改角色）</p>
    */
    @SerializedName("Roles")
    @Expose
    private Role [] Roles;

    /**
    * <p>新的权限列表（可选，为空则不修改权限）</p>
    */
    @SerializedName("AuthRole")
    @Expose
    private Auth [] AuthRole;

    /**
    * <p>用户描述（可选，为空则不修改描述）</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>用户名</p> 
     * @return UserName <p>用户名</p>
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set <p>用户名</p>
     * @param UserName <p>用户名</p>
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get <p>认证数据库</p> 
     * @return Database <p>认证数据库</p>
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set <p>认证数据库</p>
     * @param Database <p>认证数据库</p>
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get <p>新密码（可选，为空则不修改密码）</p> 
     * @return Password <p>新密码（可选，为空则不修改密码）</p>
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set <p>新密码（可选，为空则不修改密码）</p>
     * @param Password <p>新密码（可选，为空则不修改密码）</p>
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get <p>加密后的密码（可选，与Password二选一）</p> 
     * @return EncryptedPassword <p>加密后的密码（可选，与Password二选一）</p>
     */
    public String getEncryptedPassword() {
        return this.EncryptedPassword;
    }

    /**
     * Set <p>加密后的密码（可选，与Password二选一）</p>
     * @param EncryptedPassword <p>加密后的密码（可选，与Password二选一）</p>
     */
    public void setEncryptedPassword(String EncryptedPassword) {
        this.EncryptedPassword = EncryptedPassword;
    }

    /**
     * Get <p>新的角色列表（可选，为空则不修改角色）</p> 
     * @return Roles <p>新的角色列表（可选，为空则不修改角色）</p>
     */
    public Role [] getRoles() {
        return this.Roles;
    }

    /**
     * Set <p>新的角色列表（可选，为空则不修改角色）</p>
     * @param Roles <p>新的角色列表（可选，为空则不修改角色）</p>
     */
    public void setRoles(Role [] Roles) {
        this.Roles = Roles;
    }

    /**
     * Get <p>新的权限列表（可选，为空则不修改权限）</p> 
     * @return AuthRole <p>新的权限列表（可选，为空则不修改权限）</p>
     */
    public Auth [] getAuthRole() {
        return this.AuthRole;
    }

    /**
     * Set <p>新的权限列表（可选，为空则不修改权限）</p>
     * @param AuthRole <p>新的权限列表（可选，为空则不修改权限）</p>
     */
    public void setAuthRole(Auth [] AuthRole) {
        this.AuthRole = AuthRole;
    }

    /**
     * Get <p>用户描述（可选，为空则不修改描述）</p> 
     * @return Description <p>用户描述（可选，为空则不修改描述）</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>用户描述（可选，为空则不修改描述）</p>
     * @param Description <p>用户描述（可选，为空则不修改描述）</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public UpdateInstanceUserRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateInstanceUserRequest(UpdateInstanceUserRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.EncryptedPassword != null) {
            this.EncryptedPassword = new String(source.EncryptedPassword);
        }
        if (source.Roles != null) {
            this.Roles = new Role[source.Roles.length];
            for (int i = 0; i < source.Roles.length; i++) {
                this.Roles[i] = new Role(source.Roles[i]);
            }
        }
        if (source.AuthRole != null) {
            this.AuthRole = new Auth[source.AuthRole.length];
            for (int i = 0; i < source.AuthRole.length; i++) {
                this.AuthRole[i] = new Auth(source.AuthRole[i]);
            }
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "EncryptedPassword", this.EncryptedPassword);
        this.setParamArrayObj(map, prefix + "Roles.", this.Roles);
        this.setParamArrayObj(map, prefix + "AuthRole.", this.AuthRole);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

