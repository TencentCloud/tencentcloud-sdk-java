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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RoleInfo extends AbstractModel {

    /**
    * <p>角色ID</p>
    */
    @SerializedName("RoleId")
    @Expose
    private String RoleId;

    /**
    * <p>名称</p>
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * <p>角色类型。&quot;SYSTEM&quot; 内置角色，&quot;CUSTOMER&quot; 自定义角色</p>
    */
    @SerializedName("RoleType")
    @Expose
    private String RoleType;

    /**
    * <p>描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>绑定的用户数</p>
    */
    @SerializedName("UserCount")
    @Expose
    private Long UserCount;

    /**
     * Get <p>角色ID</p> 
     * @return RoleId <p>角色ID</p>
     */
    public String getRoleId() {
        return this.RoleId;
    }

    /**
     * Set <p>角色ID</p>
     * @param RoleId <p>角色ID</p>
     */
    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }

    /**
     * Get <p>名称</p> 
     * @return RoleName <p>名称</p>
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set <p>名称</p>
     * @param RoleName <p>名称</p>
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get <p>角色类型。&quot;SYSTEM&quot; 内置角色，&quot;CUSTOMER&quot; 自定义角色</p> 
     * @return RoleType <p>角色类型。&quot;SYSTEM&quot; 内置角色，&quot;CUSTOMER&quot; 自定义角色</p>
     */
    public String getRoleType() {
        return this.RoleType;
    }

    /**
     * Set <p>角色类型。&quot;SYSTEM&quot; 内置角色，&quot;CUSTOMER&quot; 自定义角色</p>
     * @param RoleType <p>角色类型。&quot;SYSTEM&quot; 内置角色，&quot;CUSTOMER&quot; 自定义角色</p>
     */
    public void setRoleType(String RoleType) {
        this.RoleType = RoleType;
    }

    /**
     * Get <p>描述</p> 
     * @return Description <p>描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述</p>
     * @param Description <p>描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get <p>绑定的用户数</p> 
     * @return UserCount <p>绑定的用户数</p>
     */
    public Long getUserCount() {
        return this.UserCount;
    }

    /**
     * Set <p>绑定的用户数</p>
     * @param UserCount <p>绑定的用户数</p>
     */
    public void setUserCount(Long UserCount) {
        this.UserCount = UserCount;
    }

    public RoleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoleInfo(RoleInfo source) {
        if (source.RoleId != null) {
            this.RoleId = new String(source.RoleId);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.RoleType != null) {
            this.RoleType = new String(source.RoleType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UserCount != null) {
            this.UserCount = new Long(source.UserCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleId", this.RoleId);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "RoleType", this.RoleType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UserCount", this.UserCount);

    }
}

