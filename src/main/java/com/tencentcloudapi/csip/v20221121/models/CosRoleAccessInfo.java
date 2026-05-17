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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosRoleAccessInfo extends AbstractModel {

    /**
    * 角色ID
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * 角色名称
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * 角色描述
    */
    @SerializedName("RoleDescription")
    @Expose
    private String RoleDescription;

    /**
    * 可访问权限数
    */
    @SerializedName("PermissionCount")
    @Expose
    private Long PermissionCount;

    /**
    * 策略创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
     * Get 角色ID 
     * @return RoleId 角色ID
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set 角色ID
     * @param RoleId 角色ID
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get 角色名称 
     * @return RoleName 角色名称
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 角色名称
     * @param RoleName 角色名称
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get 角色描述 
     * @return RoleDescription 角色描述
     */
    public String getRoleDescription() {
        return this.RoleDescription;
    }

    /**
     * Set 角色描述
     * @param RoleDescription 角色描述
     */
    public void setRoleDescription(String RoleDescription) {
        this.RoleDescription = RoleDescription;
    }

    /**
     * Get 可访问权限数 
     * @return PermissionCount 可访问权限数
     */
    public Long getPermissionCount() {
        return this.PermissionCount;
    }

    /**
     * Set 可访问权限数
     * @param PermissionCount 可访问权限数
     */
    public void setPermissionCount(Long PermissionCount) {
        this.PermissionCount = PermissionCount;
    }

    /**
     * Get 策略创建时间 
     * @return CreateTime 策略创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 策略创建时间
     * @param CreateTime 策略创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    public CosRoleAccessInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosRoleAccessInfo(CosRoleAccessInfo source) {
        if (source.RoleId != null) {
            this.RoleId = new String(source.RoleId);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.RoleDescription != null) {
            this.RoleDescription = new String(source.RoleDescription);
        }
        if (source.PermissionCount != null) {
            this.PermissionCount = new Long(source.PermissionCount);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "RoleDescription", this.RoleDescription);
        this.setParamSimple(map, prefix + "PermissionCount", this.PermissionCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

