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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UDFPolicyInfo extends AbstractModel {

    /**
    * 权限类型
示例：select，alter，drop
    */
    @SerializedName("Accesses")
    @Expose
    private String [] Accesses;

    /**
    * 拥有权限的用户信息
    */
    @SerializedName("Users")
    @Expose
    private String [] Users;

    /**
    * 拥有权限的工作组的信息
    */
    @SerializedName("Groups")
    @Expose
    private String [] Groups;

    /**
     * Get 权限类型
示例：select，alter，drop 
     * @return Accesses 权限类型
示例：select，alter，drop
     */
    public String [] getAccesses() {
        return this.Accesses;
    }

    /**
     * Set 权限类型
示例：select，alter，drop
     * @param Accesses 权限类型
示例：select，alter，drop
     */
    public void setAccesses(String [] Accesses) {
        this.Accesses = Accesses;
    }

    /**
     * Get 拥有权限的用户信息 
     * @return Users 拥有权限的用户信息
     */
    public String [] getUsers() {
        return this.Users;
    }

    /**
     * Set 拥有权限的用户信息
     * @param Users 拥有权限的用户信息
     */
    public void setUsers(String [] Users) {
        this.Users = Users;
    }

    /**
     * Get 拥有权限的工作组的信息 
     * @return Groups 拥有权限的工作组的信息
     */
    public String [] getGroups() {
        return this.Groups;
    }

    /**
     * Set 拥有权限的工作组的信息
     * @param Groups 拥有权限的工作组的信息
     */
    public void setGroups(String [] Groups) {
        this.Groups = Groups;
    }

    public UDFPolicyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UDFPolicyInfo(UDFPolicyInfo source) {
        if (source.Accesses != null) {
            this.Accesses = new String[source.Accesses.length];
            for (int i = 0; i < source.Accesses.length; i++) {
                this.Accesses[i] = new String(source.Accesses[i]);
            }
        }
        if (source.Users != null) {
            this.Users = new String[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new String(source.Users[i]);
            }
        }
        if (source.Groups != null) {
            this.Groups = new String[source.Groups.length];
            for (int i = 0; i < source.Groups.length; i++) {
                this.Groups[i] = new String(source.Groups[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Accesses.", this.Accesses);
        this.setParamArraySimple(map, prefix + "Users.", this.Users);
        this.setParamArraySimple(map, prefix + "Groups.", this.Groups);

    }
}

