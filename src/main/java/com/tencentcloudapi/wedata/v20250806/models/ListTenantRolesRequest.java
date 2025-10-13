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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListTenantRolesRequest extends AbstractModel {

    /**
    * 角色中文展示名模糊查询，只能传一个值
    */
    @SerializedName("RoleDisplayName")
    @Expose
    private String RoleDisplayName;

    /**
     * Get 角色中文展示名模糊查询，只能传一个值 
     * @return RoleDisplayName 角色中文展示名模糊查询，只能传一个值
     */
    public String getRoleDisplayName() {
        return this.RoleDisplayName;
    }

    /**
     * Set 角色中文展示名模糊查询，只能传一个值
     * @param RoleDisplayName 角色中文展示名模糊查询，只能传一个值
     */
    public void setRoleDisplayName(String RoleDisplayName) {
        this.RoleDisplayName = RoleDisplayName;
    }

    public ListTenantRolesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTenantRolesRequest(ListTenantRolesRequest source) {
        if (source.RoleDisplayName != null) {
            this.RoleDisplayName = new String(source.RoleDisplayName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleDisplayName", this.RoleDisplayName);

    }
}

