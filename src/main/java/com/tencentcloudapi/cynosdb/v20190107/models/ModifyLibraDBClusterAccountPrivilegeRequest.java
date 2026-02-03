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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLibraDBClusterAccountPrivilegeRequest extends AbstractModel {

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 账号
    */
    @SerializedName("Account")
    @Expose
    private InputAccount Account;

    /**
    * 全局权限
    */
    @SerializedName("GlobalPrivileges")
    @Expose
    private String [] GlobalPrivileges;

    /**
    * 数据库权限
    */
    @SerializedName("DatabasePrivileges")
    @Expose
    private DatabasePrivileges [] DatabasePrivileges;

    /**
    * 表权限
    */
    @SerializedName("TablePrivileges")
    @Expose
    private TablePrivileges [] TablePrivileges;

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
     * Get 账号 
     * @return Account 账号
     */
    public InputAccount getAccount() {
        return this.Account;
    }

    /**
     * Set 账号
     * @param Account 账号
     */
    public void setAccount(InputAccount Account) {
        this.Account = Account;
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
     * Get 数据库权限 
     * @return DatabasePrivileges 数据库权限
     */
    public DatabasePrivileges [] getDatabasePrivileges() {
        return this.DatabasePrivileges;
    }

    /**
     * Set 数据库权限
     * @param DatabasePrivileges 数据库权限
     */
    public void setDatabasePrivileges(DatabasePrivileges [] DatabasePrivileges) {
        this.DatabasePrivileges = DatabasePrivileges;
    }

    /**
     * Get 表权限 
     * @return TablePrivileges 表权限
     */
    public TablePrivileges [] getTablePrivileges() {
        return this.TablePrivileges;
    }

    /**
     * Set 表权限
     * @param TablePrivileges 表权限
     */
    public void setTablePrivileges(TablePrivileges [] TablePrivileges) {
        this.TablePrivileges = TablePrivileges;
    }

    public ModifyLibraDBClusterAccountPrivilegeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLibraDBClusterAccountPrivilegeRequest(ModifyLibraDBClusterAccountPrivilegeRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Account != null) {
            this.Account = new InputAccount(source.Account);
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
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamObj(map, prefix + "Account.", this.Account);
        this.setParamArraySimple(map, prefix + "GlobalPrivileges.", this.GlobalPrivileges);
        this.setParamArrayObj(map, prefix + "DatabasePrivileges.", this.DatabasePrivileges);
        this.setParamArrayObj(map, prefix + "TablePrivileges.", this.TablePrivileges);

    }
}

