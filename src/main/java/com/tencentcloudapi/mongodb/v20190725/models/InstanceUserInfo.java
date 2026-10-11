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

public class InstanceUserInfo extends AbstractModel {

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
    * <p>角色列表（新方式）</p>
    */
    @SerializedName("Roles")
    @Expose
    private Role [] Roles;

    /**
    * <p>权限列表（老方式）</p>
    */
    @SerializedName("AuthRole")
    @Expose
    private Auth [] AuthRole;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>控制台密码更新时间</p>
    */
    @SerializedName("ConsolePassUpdateTime")
    @Expose
    private String ConsolePassUpdateTime;

    /**
    * <p>是否开启密码轮转</p>
    */
    @SerializedName("EnablePasswordRotation")
    @Expose
    private Long EnablePasswordRotation;

    /**
    * <p>自定义描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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
     * Get <p>角色列表（新方式）</p> 
     * @return Roles <p>角色列表（新方式）</p>
     */
    public Role [] getRoles() {
        return this.Roles;
    }

    /**
     * Set <p>角色列表（新方式）</p>
     * @param Roles <p>角色列表（新方式）</p>
     */
    public void setRoles(Role [] Roles) {
        this.Roles = Roles;
    }

    /**
     * Get <p>权限列表（老方式）</p> 
     * @return AuthRole <p>权限列表（老方式）</p>
     */
    public Auth [] getAuthRole() {
        return this.AuthRole;
    }

    /**
     * Set <p>权限列表（老方式）</p>
     * @param AuthRole <p>权限列表（老方式）</p>
     */
    public void setAuthRole(Auth [] AuthRole) {
        this.AuthRole = AuthRole;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>控制台密码更新时间</p> 
     * @return ConsolePassUpdateTime <p>控制台密码更新时间</p>
     */
    public String getConsolePassUpdateTime() {
        return this.ConsolePassUpdateTime;
    }

    /**
     * Set <p>控制台密码更新时间</p>
     * @param ConsolePassUpdateTime <p>控制台密码更新时间</p>
     */
    public void setConsolePassUpdateTime(String ConsolePassUpdateTime) {
        this.ConsolePassUpdateTime = ConsolePassUpdateTime;
    }

    /**
     * Get <p>是否开启密码轮转</p> 
     * @return EnablePasswordRotation <p>是否开启密码轮转</p>
     */
    public Long getEnablePasswordRotation() {
        return this.EnablePasswordRotation;
    }

    /**
     * Set <p>是否开启密码轮转</p>
     * @param EnablePasswordRotation <p>是否开启密码轮转</p>
     */
    public void setEnablePasswordRotation(Long EnablePasswordRotation) {
        this.EnablePasswordRotation = EnablePasswordRotation;
    }

    /**
     * Get <p>自定义描述</p> 
     * @return Description <p>自定义描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>自定义描述</p>
     * @param Description <p>自定义描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public InstanceUserInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceUserInfo(InstanceUserInfo source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
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
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ConsolePassUpdateTime != null) {
            this.ConsolePassUpdateTime = new String(source.ConsolePassUpdateTime);
        }
        if (source.EnablePasswordRotation != null) {
            this.EnablePasswordRotation = new Long(source.EnablePasswordRotation);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamArrayObj(map, prefix + "Roles.", this.Roles);
        this.setParamArrayObj(map, prefix + "AuthRole.", this.AuthRole);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ConsolePassUpdateTime", this.ConsolePassUpdateTime);
        this.setParamSimple(map, prefix + "EnablePasswordRotation", this.EnablePasswordRotation);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

