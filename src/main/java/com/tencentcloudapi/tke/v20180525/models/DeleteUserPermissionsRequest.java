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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteUserPermissionsRequest extends AbstractModel {

    /**
    * 要授权的用户的唯一标识符（支持子账号 UIN和角色UIN）
    */
    @SerializedName("TargetUin")
    @Expose
    private String TargetUin;

    /**
    * 用户最终应拥有的完整权限列表。采用声明式语义，传入的列表代表用户最终应该拥有的全部权限，系统会自动计算差异并执行必要的创建/删除操作。为空或不提供时将清除该用户的所有权限。最大支持 100 个权限项。
    */
    @SerializedName("Permissions")
    @Expose
    private PermissionItem [] Permissions;

    /**
     * Get 要授权的用户的唯一标识符（支持子账号 UIN和角色UIN） 
     * @return TargetUin 要授权的用户的唯一标识符（支持子账号 UIN和角色UIN）
     */
    public String getTargetUin() {
        return this.TargetUin;
    }

    /**
     * Set 要授权的用户的唯一标识符（支持子账号 UIN和角色UIN）
     * @param TargetUin 要授权的用户的唯一标识符（支持子账号 UIN和角色UIN）
     */
    public void setTargetUin(String TargetUin) {
        this.TargetUin = TargetUin;
    }

    /**
     * Get 用户最终应拥有的完整权限列表。采用声明式语义，传入的列表代表用户最终应该拥有的全部权限，系统会自动计算差异并执行必要的创建/删除操作。为空或不提供时将清除该用户的所有权限。最大支持 100 个权限项。 
     * @return Permissions 用户最终应拥有的完整权限列表。采用声明式语义，传入的列表代表用户最终应该拥有的全部权限，系统会自动计算差异并执行必要的创建/删除操作。为空或不提供时将清除该用户的所有权限。最大支持 100 个权限项。
     */
    public PermissionItem [] getPermissions() {
        return this.Permissions;
    }

    /**
     * Set 用户最终应拥有的完整权限列表。采用声明式语义，传入的列表代表用户最终应该拥有的全部权限，系统会自动计算差异并执行必要的创建/删除操作。为空或不提供时将清除该用户的所有权限。最大支持 100 个权限项。
     * @param Permissions 用户最终应拥有的完整权限列表。采用声明式语义，传入的列表代表用户最终应该拥有的全部权限，系统会自动计算差异并执行必要的创建/删除操作。为空或不提供时将清除该用户的所有权限。最大支持 100 个权限项。
     */
    public void setPermissions(PermissionItem [] Permissions) {
        this.Permissions = Permissions;
    }

    public DeleteUserPermissionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteUserPermissionsRequest(DeleteUserPermissionsRequest source) {
        if (source.TargetUin != null) {
            this.TargetUin = new String(source.TargetUin);
        }
        if (source.Permissions != null) {
            this.Permissions = new PermissionItem[source.Permissions.length];
            for (int i = 0; i < source.Permissions.length; i++) {
                this.Permissions[i] = new PermissionItem(source.Permissions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetUin", this.TargetUin);
        this.setParamArrayObj(map, prefix + "Permissions.", this.Permissions);

    }
}

