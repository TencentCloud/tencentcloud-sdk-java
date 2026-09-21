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
    * 模块ID
    */
    @SerializedName("ModuleId")
    @Expose
    private String ModuleId;

    /**
    * 权限点
    */
    @SerializedName("Permissions")
    @Expose
    private String Permissions;

    /**
     * Get 模块ID 
     * @return ModuleId 模块ID
     */
    public String getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set 模块ID
     * @param ModuleId 模块ID
     */
    public void setModuleId(String ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * Get 权限点 
     * @return Permissions 权限点
     */
    public String getPermissions() {
        return this.Permissions;
    }

    /**
     * Set 权限点
     * @param Permissions 权限点
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

