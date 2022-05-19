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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAccountPrivilegesRequest extends AbstractModel{

    /**
    * 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据库的账号，包括用户名和域名。
    */
    @SerializedName("Accounts")
    @Expose
    private Account [] Accounts;

    /**
    * 全局权限。其中，GlobalPrivileges 中权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE", "PROCESS", "DROP","REFERENCES","INDEX","ALTER","SHOW DATABASES","CREATE TEMPORARY TABLES","LOCK TABLES","EXECUTE","CREATE VIEW","SHOW VIEW","CREATE ROUTINE","ALTER ROUTINE","EVENT","TRIGGER","CREATE USER","RELOAD","REPLICATION CLIENT","REPLICATION SLAVE"。
注意，ModifyAction为空时，不传该参数表示清除该权限。
    */
    @SerializedName("GlobalPrivileges")
    @Expose
    private String [] GlobalPrivileges;

    /**
    * 数据库的权限。Privileges 权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE",	"DROP","REFERENCES","INDEX","ALTER","CREATE TEMPORARY TABLES","LOCK TABLES","EXECUTE","CREATE VIEW","SHOW VIEW","CREATE ROUTINE","ALTER ROUTINE","EVENT","TRIGGER"。
注意，ModifyAction为空时，不传该参数表示清除该权限。
    */
    @SerializedName("DatabasePrivileges")
    @Expose
    private DatabasePrivilege [] DatabasePrivileges;

    /**
    * 数据库中表的权限。Privileges 权限的可选值为：权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE",	"DROP","REFERENCES","INDEX","ALTER","CREATE VIEW","SHOW VIEW", "TRIGGER"。
注意，ModifyAction为空时，不传该参数表示清除该权限。
    */
    @SerializedName("TablePrivileges")
    @Expose
    private TablePrivilege [] TablePrivileges;

    /**
    * 数据库表中列的权限。Privileges 权限的可选值为："SELECT","INSERT","UPDATE","REFERENCES"。
注意，ModifyAction为空时，不传该参数表示清除该权限。
    */
    @SerializedName("ColumnPrivileges")
    @Expose
    private ColumnPrivilege [] ColumnPrivileges;

    /**
    * 该参数不为空时，为批量修改权限。可选值为：grant - 授予权限，revoke - 回收权限。
    */
    @SerializedName("ModifyAction")
    @Expose
    private String ModifyAction;

    /**
     * Get 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。 
     * @return InstanceId 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     * @param InstanceId 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 数据库的账号，包括用户名和域名。 
     * @return Accounts 数据库的账号，包括用户名和域名。
     */
    public Account [] getAccounts() {
        return this.Accounts;
    }

    /**
     * Set 数据库的账号，包括用户名和域名。
     * @param Accounts 数据库的账号，包括用户名和域名。
     */
    public void setAccounts(Account [] Accounts) {
        this.Accounts = Accounts;
    }

    /**
     * Get 全局权限。其中，GlobalPrivileges 中权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE", "PROCESS", "DROP","REFERENCES","INDEX","ALTER","SHOW DATABASES","CREATE TEMPORARY TABLES","LOCK TABLES","EXECUTE","CREATE VIEW","SHOW VIEW","CREATE ROUTINE","ALTER ROUTINE","EVENT","TRIGGER","CREATE USER","RELOAD","REPLICATION CLIENT","REPLICATION SLAVE"。
注意，ModifyAction为空时，不传该参数表示清除该权限。 
     * @return GlobalPrivileges 全局权限。其中，GlobalPrivileges 中权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE", "PROCESS", "DROP","REFERENCES","INDEX","ALTER","SHOW DATABASES","CREATE TEMPORARY TABLES","LOCK TABLES","EXECUTE","CREATE VIEW","SHOW VIEW","CREATE ROUTINE","ALTER ROUTINE","EVENT","TRIGGER","CREATE USER","RELOAD","REPLICATION CLIENT","REPLICATION SLAVE"。
注意，ModifyAction为空时，不传该参数表示清除该权限。
     */
    public String [] getGlobalPrivileges() {
        return this.GlobalPrivileges;
    }

    /**
     * Set 全局权限。其中，GlobalPrivileges 中权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE", "PROCESS", "DROP","REFERENCES","INDEX","ALTER","SHOW DATABASES","CREATE TEMPORARY TABLES","LOCK TABLES","EXECUTE","CREATE VIEW","SHOW VIEW","CREATE ROUTINE","ALTER ROUTINE","EVENT","TRIGGER","CREATE USER","RELOAD","REPLICATION CLIENT","REPLICATION SLAVE"。
注意，ModifyAction为空时，不传该参数表示清除该权限。
     * @param GlobalPrivileges 全局权限。其中，GlobalPrivileges 中权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE", "PROCESS", "DROP","REFERENCES","INDEX","ALTER","SHOW DATABASES","CREATE TEMPORARY TABLES","LOCK TABLES","EXECUTE","CREATE VIEW","SHOW VIEW","CREATE ROUTINE","ALTER ROUTINE","EVENT","TRIGGER","CREATE USER","RELOAD","REPLICATION CLIENT","REPLICATION SLAVE"。
注意，ModifyAction为空时，不传该参数表示清除该权限。
     */
    public void setGlobalPrivileges(String [] GlobalPrivileges) {
        this.GlobalPrivileges = GlobalPrivileges;
    }

    /**
     * Get 数据库的权限。Privileges 权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE",	"DROP","REFERENCES","INDEX","ALTER","CREATE TEMPORARY TABLES","LOCK TABLES","EXECUTE","CREATE VIEW","SHOW VIEW","CREATE ROUTINE","ALTER ROUTINE","EVENT","TRIGGER"。
注意，ModifyAction为空时，不传该参数表示清除该权限。 
     * @return DatabasePrivileges 数据库的权限。Privileges 权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE",	"DROP","REFERENCES","INDEX","ALTER","CREATE TEMPORARY TABLES","LOCK TABLES","EXECUTE","CREATE VIEW","SHOW VIEW","CREATE ROUTINE","ALTER ROUTINE","EVENT","TRIGGER"。
注意，ModifyAction为空时，不传该参数表示清除该权限。
     */
    public DatabasePrivilege [] getDatabasePrivileges() {
        return this.DatabasePrivileges;
    }

    /**
     * Set 数据库的权限。Privileges 权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE",	"DROP","REFERENCES","INDEX","ALTER","CREATE TEMPORARY TABLES","LOCK TABLES","EXECUTE","CREATE VIEW","SHOW VIEW","CREATE ROUTINE","ALTER ROUTINE","EVENT","TRIGGER"。
注意，ModifyAction为空时，不传该参数表示清除该权限。
     * @param DatabasePrivileges 数据库的权限。Privileges 权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE",	"DROP","REFERENCES","INDEX","ALTER","CREATE TEMPORARY TABLES","LOCK TABLES","EXECUTE","CREATE VIEW","SHOW VIEW","CREATE ROUTINE","ALTER ROUTINE","EVENT","TRIGGER"。
注意，ModifyAction为空时，不传该参数表示清除该权限。
     */
    public void setDatabasePrivileges(DatabasePrivilege [] DatabasePrivileges) {
        this.DatabasePrivileges = DatabasePrivileges;
    }

    /**
     * Get 数据库中表的权限。Privileges 权限的可选值为：权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE",	"DROP","REFERENCES","INDEX","ALTER","CREATE VIEW","SHOW VIEW", "TRIGGER"。
注意，ModifyAction为空时，不传该参数表示清除该权限。 
     * @return TablePrivileges 数据库中表的权限。Privileges 权限的可选值为：权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE",	"DROP","REFERENCES","INDEX","ALTER","CREATE VIEW","SHOW VIEW", "TRIGGER"。
注意，ModifyAction为空时，不传该参数表示清除该权限。
     */
    public TablePrivilege [] getTablePrivileges() {
        return this.TablePrivileges;
    }

    /**
     * Set 数据库中表的权限。Privileges 权限的可选值为：权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE",	"DROP","REFERENCES","INDEX","ALTER","CREATE VIEW","SHOW VIEW", "TRIGGER"。
注意，ModifyAction为空时，不传该参数表示清除该权限。
     * @param TablePrivileges 数据库中表的权限。Privileges 权限的可选值为：权限的可选值为："SELECT","INSERT","UPDATE","DELETE","CREATE",	"DROP","REFERENCES","INDEX","ALTER","CREATE VIEW","SHOW VIEW", "TRIGGER"。
注意，ModifyAction为空时，不传该参数表示清除该权限。
     */
    public void setTablePrivileges(TablePrivilege [] TablePrivileges) {
        this.TablePrivileges = TablePrivileges;
    }

    /**
     * Get 数据库表中列的权限。Privileges 权限的可选值为："SELECT","INSERT","UPDATE","REFERENCES"。
注意，ModifyAction为空时，不传该参数表示清除该权限。 
     * @return ColumnPrivileges 数据库表中列的权限。Privileges 权限的可选值为："SELECT","INSERT","UPDATE","REFERENCES"。
注意，ModifyAction为空时，不传该参数表示清除该权限。
     */
    public ColumnPrivilege [] getColumnPrivileges() {
        return this.ColumnPrivileges;
    }

    /**
     * Set 数据库表中列的权限。Privileges 权限的可选值为："SELECT","INSERT","UPDATE","REFERENCES"。
注意，ModifyAction为空时，不传该参数表示清除该权限。
     * @param ColumnPrivileges 数据库表中列的权限。Privileges 权限的可选值为："SELECT","INSERT","UPDATE","REFERENCES"。
注意，ModifyAction为空时，不传该参数表示清除该权限。
     */
    public void setColumnPrivileges(ColumnPrivilege [] ColumnPrivileges) {
        this.ColumnPrivileges = ColumnPrivileges;
    }

    /**
     * Get 该参数不为空时，为批量修改权限。可选值为：grant - 授予权限，revoke - 回收权限。 
     * @return ModifyAction 该参数不为空时，为批量修改权限。可选值为：grant - 授予权限，revoke - 回收权限。
     */
    public String getModifyAction() {
        return this.ModifyAction;
    }

    /**
     * Set 该参数不为空时，为批量修改权限。可选值为：grant - 授予权限，revoke - 回收权限。
     * @param ModifyAction 该参数不为空时，为批量修改权限。可选值为：grant - 授予权限，revoke - 回收权限。
     */
    public void setModifyAction(String ModifyAction) {
        this.ModifyAction = ModifyAction;
    }

    public ModifyAccountPrivilegesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAccountPrivilegesRequest(ModifyAccountPrivilegesRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Accounts != null) {
            this.Accounts = new Account[source.Accounts.length];
            for (int i = 0; i < source.Accounts.length; i++) {
                this.Accounts[i] = new Account(source.Accounts[i]);
            }
        }
        if (source.GlobalPrivileges != null) {
            this.GlobalPrivileges = new String[source.GlobalPrivileges.length];
            for (int i = 0; i < source.GlobalPrivileges.length; i++) {
                this.GlobalPrivileges[i] = new String(source.GlobalPrivileges[i]);
            }
        }
        if (source.DatabasePrivileges != null) {
            this.DatabasePrivileges = new DatabasePrivilege[source.DatabasePrivileges.length];
            for (int i = 0; i < source.DatabasePrivileges.length; i++) {
                this.DatabasePrivileges[i] = new DatabasePrivilege(source.DatabasePrivileges[i]);
            }
        }
        if (source.TablePrivileges != null) {
            this.TablePrivileges = new TablePrivilege[source.TablePrivileges.length];
            for (int i = 0; i < source.TablePrivileges.length; i++) {
                this.TablePrivileges[i] = new TablePrivilege(source.TablePrivileges[i]);
            }
        }
        if (source.ColumnPrivileges != null) {
            this.ColumnPrivileges = new ColumnPrivilege[source.ColumnPrivileges.length];
            for (int i = 0; i < source.ColumnPrivileges.length; i++) {
                this.ColumnPrivileges[i] = new ColumnPrivilege(source.ColumnPrivileges[i]);
            }
        }
        if (source.ModifyAction != null) {
            this.ModifyAction = new String(source.ModifyAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Accounts.", this.Accounts);
        this.setParamArraySimple(map, prefix + "GlobalPrivileges.", this.GlobalPrivileges);
        this.setParamArrayObj(map, prefix + "DatabasePrivileges.", this.DatabasePrivileges);
        this.setParamArrayObj(map, prefix + "TablePrivileges.", this.TablePrivileges);
        this.setParamArrayObj(map, prefix + "ColumnPrivileges.", this.ColumnPrivileges);
        this.setParamSimple(map, prefix + "ModifyAction", this.ModifyAction);

    }
}

