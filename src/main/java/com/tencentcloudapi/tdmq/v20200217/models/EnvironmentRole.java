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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnvironmentRole extends AbstractModel{

    /**
    * 环境（命名空间）。
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 角色名称。
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * 授权项，最多只能包含produce、consume两项的非空字符串数组。
    */
    @SerializedName("Permissions")
    @Expose
    private String [] Permissions;

    /**
    * 角色描述。
    */
    @SerializedName("RoleDescribe")
    @Expose
    private String RoleDescribe;

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
     * Get 环境（命名空间）。 
     * @return EnvironmentId 环境（命名空间）。
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境（命名空间）。
     * @param EnvironmentId 环境（命名空间）。
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 角色名称。 
     * @return RoleName 角色名称。
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 角色名称。
     * @param RoleName 角色名称。
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get 授权项，最多只能包含produce、consume两项的非空字符串数组。 
     * @return Permissions 授权项，最多只能包含produce、consume两项的非空字符串数组。
     */
    public String [] getPermissions() {
        return this.Permissions;
    }

    /**
     * Set 授权项，最多只能包含produce、consume两项的非空字符串数组。
     * @param Permissions 授权项，最多只能包含produce、consume两项的非空字符串数组。
     */
    public void setPermissions(String [] Permissions) {
        this.Permissions = Permissions;
    }

    /**
     * Get 角色描述。 
     * @return RoleDescribe 角色描述。
     */
    public String getRoleDescribe() {
        return this.RoleDescribe;
    }

    /**
     * Set 角色描述。
     * @param RoleDescribe 角色描述。
     */
    public void setRoleDescribe(String RoleDescribe) {
        this.RoleDescribe = RoleDescribe;
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamArraySimple(map, prefix + "Permissions.", this.Permissions);
        this.setParamSimple(map, prefix + "RoleDescribe", this.RoleDescribe);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

