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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RevokeAccountPrivilegesRequest extends AbstractModel{

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 账号信息
    */
    @SerializedName("Account")
    @Expose
    private InputAccount Account;

    /**
    * 数据库表权限数组
    */
    @SerializedName("DbTablePrivileges")
    @Expose
    private String [] DbTablePrivileges;

    /**
    * 数据库表信息
    */
    @SerializedName("DbTables")
    @Expose
    private DbTable [] DbTables;

    /**
     * Get 集群id 
     * @return ClusterId 集群id
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群id
     * @param ClusterId 集群id
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 账号信息 
     * @return Account 账号信息
     */
    public InputAccount getAccount() {
        return this.Account;
    }

    /**
     * Set 账号信息
     * @param Account 账号信息
     */
    public void setAccount(InputAccount Account) {
        this.Account = Account;
    }

    /**
     * Get 数据库表权限数组 
     * @return DbTablePrivileges 数据库表权限数组
     */
    public String [] getDbTablePrivileges() {
        return this.DbTablePrivileges;
    }

    /**
     * Set 数据库表权限数组
     * @param DbTablePrivileges 数据库表权限数组
     */
    public void setDbTablePrivileges(String [] DbTablePrivileges) {
        this.DbTablePrivileges = DbTablePrivileges;
    }

    /**
     * Get 数据库表信息 
     * @return DbTables 数据库表信息
     */
    public DbTable [] getDbTables() {
        return this.DbTables;
    }

    /**
     * Set 数据库表信息
     * @param DbTables 数据库表信息
     */
    public void setDbTables(DbTable [] DbTables) {
        this.DbTables = DbTables;
    }

    public RevokeAccountPrivilegesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RevokeAccountPrivilegesRequest(RevokeAccountPrivilegesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Account != null) {
            this.Account = new InputAccount(source.Account);
        }
        if (source.DbTablePrivileges != null) {
            this.DbTablePrivileges = new String[source.DbTablePrivileges.length];
            for (int i = 0; i < source.DbTablePrivileges.length; i++) {
                this.DbTablePrivileges[i] = new String(source.DbTablePrivileges[i]);
            }
        }
        if (source.DbTables != null) {
            this.DbTables = new DbTable[source.DbTables.length];
            for (int i = 0; i < source.DbTables.length; i++) {
                this.DbTables[i] = new DbTable(source.DbTables[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamObj(map, prefix + "Account.", this.Account);
        this.setParamArraySimple(map, prefix + "DbTablePrivileges.", this.DbTablePrivileges);
        this.setParamArrayObj(map, prefix + "DbTables.", this.DbTables);

    }
}

