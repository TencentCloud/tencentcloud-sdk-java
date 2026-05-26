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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyUserPrivilegesRequest extends AbstractModel {

    /**
    * 实例 ID，形如：tdsql3-5baee8df。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 登录用户名和主机信息
    */
    @SerializedName("Users")
    @Expose
    private User [] Users;

    /**
    * 全局权限
    */
    @SerializedName("GlobalPrivileges")
    @Expose
    private String [] GlobalPrivileges;

    /**
    * Database级别权限
    */
    @SerializedName("DatabasePrivileges")
    @Expose
    private DatabasePrivileges [] DatabasePrivileges;

    /**
    * Table级别权限
    */
    @SerializedName("TablePrivileges")
    @Expose
    private TablePrivileges [] TablePrivileges;

    /**
     * Get 实例 ID，形如：tdsql3-5baee8df。 
     * @return InstanceId 实例 ID，形如：tdsql3-5baee8df。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，形如：tdsql3-5baee8df。
     * @param InstanceId 实例 ID，形如：tdsql3-5baee8df。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 登录用户名和主机信息 
     * @return Users 登录用户名和主机信息
     */
    public User [] getUsers() {
        return this.Users;
    }

    /**
     * Set 登录用户名和主机信息
     * @param Users 登录用户名和主机信息
     */
    public void setUsers(User [] Users) {
        this.Users = Users;
    }

    /**
     * Get 全局权限 
     * @return GlobalPrivileges 全局权限
     */
    public String [] getGlobalPrivileges() {
        return this.GlobalPrivileges;
    }

    /**
     * Set 全局权限
     * @param GlobalPrivileges 全局权限
     */
    public void setGlobalPrivileges(String [] GlobalPrivileges) {
        this.GlobalPrivileges = GlobalPrivileges;
    }

    /**
     * Get Database级别权限 
     * @return DatabasePrivileges Database级别权限
     */
    public DatabasePrivileges [] getDatabasePrivileges() {
        return this.DatabasePrivileges;
    }

    /**
     * Set Database级别权限
     * @param DatabasePrivileges Database级别权限
     */
    public void setDatabasePrivileges(DatabasePrivileges [] DatabasePrivileges) {
        this.DatabasePrivileges = DatabasePrivileges;
    }

    /**
     * Get Table级别权限 
     * @return TablePrivileges Table级别权限
     */
    public TablePrivileges [] getTablePrivileges() {
        return this.TablePrivileges;
    }

    /**
     * Set Table级别权限
     * @param TablePrivileges Table级别权限
     */
    public void setTablePrivileges(TablePrivileges [] TablePrivileges) {
        this.TablePrivileges = TablePrivileges;
    }

    public ModifyUserPrivilegesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUserPrivilegesRequest(ModifyUserPrivilegesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Users != null) {
            this.Users = new User[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new User(source.Users[i]);
            }
        }
        if (source.GlobalPrivileges != null) {
            this.GlobalPrivileges = new String[source.GlobalPrivileges.length];
            for (int i = 0; i < source.GlobalPrivileges.length; i++) {
                this.GlobalPrivileges[i] = new String(source.GlobalPrivileges[i]);
            }
        }
        if (source.DatabasePrivileges != null) {
            this.DatabasePrivileges = new DatabasePrivileges[source.DatabasePrivileges.length];
            for (int i = 0; i < source.DatabasePrivileges.length; i++) {
                this.DatabasePrivileges[i] = new DatabasePrivileges(source.DatabasePrivileges[i]);
            }
        }
        if (source.TablePrivileges != null) {
            this.TablePrivileges = new TablePrivileges[source.TablePrivileges.length];
            for (int i = 0; i < source.TablePrivileges.length; i++) {
                this.TablePrivileges[i] = new TablePrivileges(source.TablePrivileges[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Users.", this.Users);
        this.setParamArraySimple(map, prefix + "GlobalPrivileges.", this.GlobalPrivileges);
        this.setParamArrayObj(map, prefix + "DatabasePrivileges.", this.DatabasePrivileges);
        this.setParamArrayObj(map, prefix + "TablePrivileges.", this.TablePrivileges);

    }
}

