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

public class RolePermission extends AbstractModel {

    /**
    * <p>模块ID，须为当前租户已开通的功能模块（叶子节点）的模块ID（层级编码字符串，如 101=快速开始、109=工作流、116101103=工作空间管理_角色权限），非法值返回 InvalidParameterValue；模块清单可通过控制台「工作空间设置-角色权限」页面查看</p>
    */
    @SerializedName("ModuleId")
    @Expose
    private String ModuleId;

    /**
    * <p>模块访问权限，单值：R=只读，RW=读写，RWD=读写删除，N=无权限</p>
    */
    @SerializedName("Permissions")
    @Expose
    private String Permissions;

    /**
     * Get <p>模块ID，须为当前租户已开通的功能模块（叶子节点）的模块ID（层级编码字符串，如 101=快速开始、109=工作流、116101103=工作空间管理_角色权限），非法值返回 InvalidParameterValue；模块清单可通过控制台「工作空间设置-角色权限」页面查看</p> 
     * @return ModuleId <p>模块ID，须为当前租户已开通的功能模块（叶子节点）的模块ID（层级编码字符串，如 101=快速开始、109=工作流、116101103=工作空间管理_角色权限），非法值返回 InvalidParameterValue；模块清单可通过控制台「工作空间设置-角色权限」页面查看</p>
     */
    public String getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set <p>模块ID，须为当前租户已开通的功能模块（叶子节点）的模块ID（层级编码字符串，如 101=快速开始、109=工作流、116101103=工作空间管理_角色权限），非法值返回 InvalidParameterValue；模块清单可通过控制台「工作空间设置-角色权限」页面查看</p>
     * @param ModuleId <p>模块ID，须为当前租户已开通的功能模块（叶子节点）的模块ID（层级编码字符串，如 101=快速开始、109=工作流、116101103=工作空间管理_角色权限），非法值返回 InvalidParameterValue；模块清单可通过控制台「工作空间设置-角色权限」页面查看</p>
     */
    public void setModuleId(String ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * Get <p>模块访问权限，单值：R=只读，RW=读写，RWD=读写删除，N=无权限</p> 
     * @return Permissions <p>模块访问权限，单值：R=只读，RW=读写，RWD=读写删除，N=无权限</p>
     */
    public String getPermissions() {
        return this.Permissions;
    }

    /**
     * Set <p>模块访问权限，单值：R=只读，RW=读写，RWD=读写删除，N=无权限</p>
     * @param Permissions <p>模块访问权限，单值：R=只读，RW=读写，RWD=读写删除，N=无权限</p>
     */
    public void setPermissions(String Permissions) {
        this.Permissions = Permissions;
    }

    public RolePermission() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RolePermission(RolePermission source) {
        if (source.ModuleId != null) {
            this.ModuleId = new String(source.ModuleId);
        }
        if (source.Permissions != null) {
            this.Permissions = new String(source.Permissions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModuleId", this.ModuleId);
        this.setParamSimple(map, prefix + "Permissions", this.Permissions);

    }
}

