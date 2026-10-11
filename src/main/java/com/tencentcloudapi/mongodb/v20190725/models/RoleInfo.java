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

public class RoleInfo extends AbstractModel {

    /**
    * <p>角色名称</p>
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * <p>角色所属数据库</p>
    */
    @SerializedName("Database")
    @Expose
    private String Database;

    /**
    * <p>角色类型：builtin_database-内置数据库角色，builtin_cluster-内置集群角色，custom-自定义角色</p>
    */
    @SerializedName("RoleType")
    @Expose
    private String RoleType;

    /**
    * <p>授予的权限</p>
    */
    @SerializedName("Privileges")
    @Expose
    private RolePrivilege [] Privileges;

    /**
    * <p>继承的角色</p>
    */
    @SerializedName("InheritedRoles")
    @Expose
    private Role [] InheritedRoles;

    /**
     * Get <p>角色名称</p> 
     * @return RoleName <p>角色名称</p>
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set <p>角色名称</p>
     * @param RoleName <p>角色名称</p>
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get <p>角色所属数据库</p> 
     * @return Database <p>角色所属数据库</p>
     */
    public String getDatabase() {
        return this.Database;
    }

    /**
     * Set <p>角色所属数据库</p>
     * @param Database <p>角色所属数据库</p>
     */
    public void setDatabase(String Database) {
        this.Database = Database;
    }

    /**
     * Get <p>角色类型：builtin_database-内置数据库角色，builtin_cluster-内置集群角色，custom-自定义角色</p> 
     * @return RoleType <p>角色类型：builtin_database-内置数据库角色，builtin_cluster-内置集群角色，custom-自定义角色</p>
     */
    public String getRoleType() {
        return this.RoleType;
    }

    /**
     * Set <p>角色类型：builtin_database-内置数据库角色，builtin_cluster-内置集群角色，custom-自定义角色</p>
     * @param RoleType <p>角色类型：builtin_database-内置数据库角色，builtin_cluster-内置集群角色，custom-自定义角色</p>
     */
    public void setRoleType(String RoleType) {
        this.RoleType = RoleType;
    }

    /**
     * Get <p>授予的权限</p> 
     * @return Privileges <p>授予的权限</p>
     */
    public RolePrivilege [] getPrivileges() {
        return this.Privileges;
    }

    /**
     * Set <p>授予的权限</p>
     * @param Privileges <p>授予的权限</p>
     */
    public void setPrivileges(RolePrivilege [] Privileges) {
        this.Privileges = Privileges;
    }

    /**
     * Get <p>继承的角色</p> 
     * @return InheritedRoles <p>继承的角色</p>
     */
    public Role [] getInheritedRoles() {
        return this.InheritedRoles;
    }

    /**
     * Set <p>继承的角色</p>
     * @param InheritedRoles <p>继承的角色</p>
     */
    public void setInheritedRoles(Role [] InheritedRoles) {
        this.InheritedRoles = InheritedRoles;
    }

    public RoleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RoleInfo(RoleInfo source) {
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.Database != null) {
            this.Database = new String(source.Database);
        }
        if (source.RoleType != null) {
            this.RoleType = new String(source.RoleType);
        }
        if (source.Privileges != null) {
            this.Privileges = new RolePrivilege[source.Privileges.length];
            for (int i = 0; i < source.Privileges.length; i++) {
                this.Privileges[i] = new RolePrivilege(source.Privileges[i]);
            }
        }
        if (source.InheritedRoles != null) {
            this.InheritedRoles = new Role[source.InheritedRoles.length];
            for (int i = 0; i < source.InheritedRoles.length; i++) {
                this.InheritedRoles[i] = new Role(source.InheritedRoles[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "Database", this.Database);
        this.setParamSimple(map, prefix + "RoleType", this.RoleType);
        this.setParamArrayObj(map, prefix + "Privileges.", this.Privileges);
        this.setParamArrayObj(map, prefix + "InheritedRoles.", this.InheritedRoles);

    }
}

