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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAccountPrivilegesRequest extends AbstractModel {

    /**
    * <p>实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>数据库的账号，包括用户名和域名。可通过 <a href="https://cloud.tencent.com/document/api/236/17499">DescribeAccounts</a> 接口获取。</p>
    */
    @SerializedName("Accounts")
    @Expose
    private Account [] Accounts;

    /**
    * <p>全局权限。其中，GlobalPrivileges 中权限的可选值为：&quot;SELECT&quot;,&quot;INSERT&quot;,&quot;UPDATE&quot;,&quot;DELETE&quot;,&quot;CREATE&quot;, &quot;PROCESS&quot;, &quot;DROP&quot;,&quot;REFERENCES&quot;,&quot;INDEX&quot;,&quot;ALTER&quot;,&quot;SHOW DATABASES&quot;,&quot;CREATE TEMPORARY TABLES&quot;,&quot;LOCK TABLES&quot;,&quot;EXECUTE&quot;,&quot;CREATE VIEW&quot;,&quot;SHOW VIEW&quot;,&quot;CREATE ROUTINE&quot;,&quot;ALTER ROUTINE&quot;,&quot;EVENT&quot;,&quot;TRIGGER&quot;,&quot;CREATE USER&quot;,&quot;RELOAD&quot;,&quot;REPLICATION CLIENT&quot;,&quot;REPLICATION SLAVE&quot;。<br>注意，ModifyAction为空时，不传该参数表示清除该权限。</p>
    */
    @SerializedName("GlobalPrivileges")
    @Expose
    private String [] GlobalPrivileges;

    /**
    * <p>数据库的权限。Privileges 权限的可选值为：&quot;SELECT&quot;,&quot;INSERT&quot;,&quot;UPDATE&quot;,&quot;DELETE&quot;,&quot;CREATE&quot;,    &quot;DROP&quot;,&quot;REFERENCES&quot;,&quot;INDEX&quot;,&quot;ALTER&quot;,&quot;CREATE TEMPORARY TABLES&quot;,&quot;LOCK TABLES&quot;,&quot;EXECUTE&quot;,&quot;CREATE VIEW&quot;,&quot;SHOW VIEW&quot;,&quot;CREATE ROUTINE&quot;,&quot;ALTER ROUTINE&quot;,&quot;EVENT&quot;,&quot;TRIGGER&quot;。<br>注意，ModifyAction为空时，不传该参数表示清除该权限。</p>
    */
    @SerializedName("DatabasePrivileges")
    @Expose
    private DatabasePrivilege [] DatabasePrivileges;

    /**
    * <p>数据库中表的权限。Privileges 权限的可选值为：权限的可选值为：&quot;SELECT&quot;,&quot;INSERT&quot;,&quot;UPDATE&quot;,&quot;DELETE&quot;,&quot;CREATE&quot;,    &quot;DROP&quot;,&quot;REFERENCES&quot;,&quot;INDEX&quot;,&quot;ALTER&quot;,&quot;CREATE VIEW&quot;,&quot;SHOW VIEW&quot;, &quot;TRIGGER&quot;。<br>注意，ModifyAction为空时，不传该参数表示清除该权限。</p>
    */
    @SerializedName("TablePrivileges")
    @Expose
    private TablePrivilege [] TablePrivileges;

    /**
    * <p>数据库表中列的权限。Privileges 权限的可选值为：&quot;SELECT&quot;,&quot;INSERT&quot;,&quot;UPDATE&quot;,&quot;REFERENCES&quot;。<br>注意，ModifyAction为空时，不传该参数表示清除该权限。</p>
    */
    @SerializedName("ColumnPrivileges")
    @Expose
    private ColumnPrivilege [] ColumnPrivileges;

    /**
    * <p>该参数不为空时，为批量修改权限。可选值为：grant - 授予权限，revoke - 回收权限。</p>
    */
    @SerializedName("ModifyAction")
    @Expose
    private String ModifyAction;

    /**
     * Get <p>实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。</p> 
     * @return InstanceId <p>实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。</p>
     * @param InstanceId <p>实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>数据库的账号，包括用户名和域名。可通过 <a href="https://cloud.tencent.com/document/api/236/17499">DescribeAccounts</a> 接口获取。</p> 
     * @return Accounts <p>数据库的账号，包括用户名和域名。可通过 <a href="https://cloud.tencent.com/document/api/236/17499">DescribeAccounts</a> 接口获取。</p>
     */
    public Account [] getAccounts() {
        return this.Accounts;
    }

    /**
     * Set <p>数据库的账号，包括用户名和域名。可通过 <a href="https://cloud.tencent.com/document/api/236/17499">DescribeAccounts</a> 接口获取。</p>
     * @param Accounts <p>数据库的账号，包括用户名和域名。可通过 <a href="https://cloud.tencent.com/document/api/236/17499">DescribeAccounts</a> 接口获取。</p>
     */
    public void setAccounts(Account [] Accounts) {
        this.Accounts = Accounts;
    }

    /**
     * Get <p>全局权限。其中，GlobalPrivileges 中权限的可选值为：&quot;SELECT&quot;,&quot;INSERT&quot;,&quot;UPDATE&quot;,&quot;DELETE&quot;,&quot;CREATE&quot;, &quot;PROCESS&quot;, &quot;DROP&quot;,&quot;REFERENCES&quot;,&quot;INDEX&quot;,&quot;ALTER&quot;,&quot;SHOW DATABASES&quot;,&quot;CREATE TEMPORARY TABLES&quot;,&quot;LOCK TABLES&quot;,&quot;EXECUTE&quot;,&quot;CREATE VIEW&quot;,&quot;SHOW VIEW&quot;,&quot;CREATE ROUTINE&quot;,&quot;ALTER ROUTINE&quot;,&quot;EVENT&quot;,&quot;TRIGGER&quot;,&quot;CREATE USER&quot;,&quot;RELOAD&quot;,&quot;REPLICATION CLIENT&quot;,&quot;REPLICATION SLAVE&quot;。<br>注意，ModifyAction为空时，不传该参数表示清除该权限。</p> 
     * @return GlobalPrivileges <p>全局权限。其中，GlobalPrivileges 中权限的可选值为：&quot;SELECT&quot;,&quot;INSERT&quot;,&quot;UPDATE&quot;,&quot;DELETE&quot;,&quot;CREATE&quot;, &quot;PROCESS&quot;, &quot;DROP&quot;,&quot;REFERENCES&quot;,&quot;INDEX&quot;,&quot;ALTER&quot;,&quot;SHOW DATABASES&quot;,&quot;CREATE TEMPORARY TABLES&quot;,&quot;LOCK TABLES&quot;,&quot;EXECUTE&quot;,&quot;CREATE VIEW&quot;,&quot;SHOW VIEW&quot;,&quot;CREATE ROUTINE&quot;,&quot;ALTER ROUTINE&quot;,&quot;EVENT&quot;,&quot;TRIGGER&quot;,&quot;CREATE USER&quot;,&quot;RELOAD&quot;,&quot;REPLICATION CLIENT&quot;,&quot;REPLICATION SLAVE&quot;。<br>注意，ModifyAction为空时，不传该参数表示清除该权限。</p>
     */
    public String [] getGlobalPrivileges() {
        return this.GlobalPrivileges;
    }

    /**
     * Set <p>全局权限。其中，GlobalPrivileges 中权限的可选值为：&quot;SELECT&quot;,&quot;INSERT&quot;,&quot;UPDATE&quot;,&quot;DELETE&quot;,&quot;CREATE&quot;, &quot;PROCESS&quot;, &quot;DROP&quot;,&quot;REFERENCES&quot;,&quot;INDEX&quot;,&quot;ALTER&quot;,&quot;SHOW DATABASES&quot;,&quot;CREATE TEMPORARY TABLES&quot;,&quot;LOCK TABLES&quot;,&quot;EXECUTE&quot;,&quot;CREATE VIEW&quot;,&quot;SHOW VIEW&quot;,&quot;CREATE ROUTINE&quot;,&quot;ALTER ROUTINE&quot;,&quot;EVENT&quot;,&quot;TRIGGER&quot;,&quot;CREATE USER&quot;,&quot;RELOAD&quot;,&quot;REPLICATION CLIENT&quot;,&quot;REPLICATION SLAVE&quot;。<br>注意，ModifyAction为空时，不传该参数表示清除该权限。</p>
     * @param GlobalPrivileges <p>全局权限。其中，GlobalPrivileges 中权限的可选值为：&quot;SELECT&quot;,&quot;INSERT&quot;,&quot;UPDATE&quot;,&quot;DELETE&quot;,&quot;CREATE&quot;, &quot;PROCESS&quot;, &quot;DROP&quot;,&quot;REFERENCES&quot;,&quot;INDEX&quot;,&quot;ALTER&quot;,&quot;SHOW DATABASES&quot;,&quot;CREATE TEMPORARY TABLES&quot;,&quot;LOCK TABLES&quot;,&quot;EXECUTE&quot;,&quot;CREATE VIEW&quot;,&quot;SHOW VIEW&quot;,&quot;CREATE ROUTINE&quot;,&quot;ALTER ROUTINE&quot;,&quot;EVENT&quot;,&quot;TRIGGER&quot;,&quot;CREATE USER&quot;,&quot;RELOAD&quot;,&quot;REPLICATION CLIENT&quot;,&quot;REPLICATION SLAVE&quot;。<br>注意，ModifyAction为空时，不传该参数表示清除该权限。</p>
     */
    public void setGlobalPrivileges(String [] GlobalPrivileges) {
        this.GlobalPrivileges = GlobalPrivileges;
    }

    /**
     * Get <p>数据库的权限。Privileges 权限的可选值为：&quot;SELECT&quot;,&quot;INSERT&quot;,&quot;UPDATE&quot;,&quot;DELETE&quot;,&quot;CREATE&quot;,    &quot;DROP&quot;,&quot;REFERENCES&quot;,&quot;INDEX&quot;,&quot;ALTER&quot;,&quot;CREATE TEMPORARY TABLES&quot;,&quot;LOCK TABLES&quot;,&quot;EXECUTE&quot;,&quot;CREATE VIEW&quot;,&quot;SHOW VIEW&quot;,&quot;CREATE ROUTINE&quot;,&quot;ALTER ROUTINE&quot;,&quot;EVENT&quot;,&quot;TRIGGER&quot;。<br>注意，ModifyAction为空时，不传该参数表示清除该权限。</p> 
     * @return DatabasePrivileges <p>数据库的权限。Privileges 权限的可选值为：&quot;SELECT&quot;,&quot;INSERT&quot;,&quot;UPDATE&quot;,&quot;DELETE&quot;,&quot;CREATE&quot;,    &quot;DROP&quot;,&quot;REFERENCES&quot;,&quot;INDEX&quot;,&quot;ALTER&quot;,&quot;CREATE TEMPORARY TABLES&quot;,&quot;LOCK TABLES&quot;,&quot;EXECUTE&quot;,&quot;CREATE VIEW&quot;,&quot;SHOW VIEW&quot;,&quot;CREATE ROUTINE&quot;,&quot;ALTER ROUTINE&quot;,&quot;EVENT&quot;,&quot;TRIGGER&quot;。<br>注意，ModifyAction为空时，不传该参数表示清除该权限。</p>
     */
    public DatabasePrivilege [] getDatabasePrivileges() {
        return this.DatabasePrivileges;
    }

    /**
     * Set <p>数据库的权限。Privileges 权限的可选值为：&quot;SELECT&quot;,&quot;INSERT&quot;,&quot;UPDATE&quot;,&quot;DELETE&quot;,&quot;CREATE&quot;,    &quot;DROP&quot;,&quot;REFERENCES&quot;,&quot;INDEX&quot;,&quot;ALTER&quot;,&quot;CREATE TEMPORARY TABLES&quot;,&quot;LOCK TABLES&quot;,&quot;EXECUTE&quot;,&quot;CREATE VIEW&quot;,&quot;SHOW VIEW&quot;,&quot;CREATE ROUTINE&quot;,&quot;ALTER ROUTINE&quot;,&quot;EVENT&quot;,&quot;TRIGGER&quot;。<br>注意，ModifyAction为空时，不传该参数表示清除该权限。</p>
     * @param DatabasePrivileges <p>数据库的权限。Privileges 权限的可选值为：&quot;SELECT&quot;,&quot;INSERT&quot;,&quot;UPDATE&quot;,&quot;DELETE&quot;,&quot;CREATE&quot;,    &quot;DROP&quot;,&quot;REFERENCES&quot;,&quot;INDEX&quot;,&quot;ALTER&quot;,&quot;CREATE TEMPORARY TABLES&quot;,&quot;LOCK TABLES&quot;,&quot;EXECUTE&quot;,&quot;CREATE VIEW&quot;,&quot;SHOW VIEW&quot;,&quot;CREATE ROUTINE&quot;,&quot;ALTER ROUTINE&quot;,&quot;EVENT&quot;,&quot;TRIGGER&quot;。<br>注意，ModifyAction为空时，不传该参数表示清除该权限。</p>
     */
    public void setDatabasePrivileges(DatabasePrivilege [] DatabasePrivileges) {
        this.DatabasePrivileges = DatabasePrivileges;
    }

    /**
     * Get <p>数据库中表的权限。Privileges 权限的可选值为：权限的可选值为：&quot;SELECT&quot;,&quot;INSERT&quot;,&quot;UPDATE&quot;,&quot;DELETE&quot;,&quot;CREATE&quot;,    &quot;DROP&quot;,&quot;REFERENCES&quot;,&quot;INDEX&quot;,&quot;ALTER&quot;,&quot;CREATE VIEW&quot;,&quot;SHOW VIEW&quot;, &quot;TRIGGER&quot;。<br>注意，ModifyAction为空时，不传该参数表示清除该权限。</p> 
     * @return TablePrivileges <p>数据库中表的权限。Privileges 权限的可选值为：权限的可选值为：&quot;SELECT&quot;,&quot;INSERT&quot;,&quot;UPDATE&quot;,&quot;DELETE&quot;,&quot;CREATE&quot;,    &quot;DROP&quot;,&quot;REFERENCES&quot;,&quot;INDEX&quot;,&quot;ALTER&quot;,&quot;CREATE VIEW&quot;,&quot;SHOW VIEW&quot;, &quot;TRIGGER&quot;。<br>注意，ModifyAction为空时，不传该参数表示清除该权限。</p>
     */
    public TablePrivilege [] getTablePrivileges() {
        return this.TablePrivileges;
    }

    /**
     * Set <p>数据库中表的权限。Privileges 权限的可选值为：权限的可选值为：&quot;SELECT&quot;,&quot;INSERT&quot;,&quot;UPDATE&quot;,&quot;DELETE&quot;,&quot;CREATE&quot;,    &quot;DROP&quot;,&quot;REFERENCES&quot;,&quot;INDEX&quot;,&quot;ALTER&quot;,&quot;CREATE VIEW&quot;,&quot;SHOW VIEW&quot;, &quot;TRIGGER&quot;。<br>注意，ModifyAction为空时，不传该参数表示清除该权限。</p>
     * @param TablePrivileges <p>数据库中表的权限。Privileges 权限的可选值为：权限的可选值为：&quot;SELECT&quot;,&quot;INSERT&quot;,&quot;UPDATE&quot;,&quot;DELETE&quot;,&quot;CREATE&quot;,    &quot;DROP&quot;,&quot;REFERENCES&quot;,&quot;INDEX&quot;,&quot;ALTER&quot;,&quot;CREATE VIEW&quot;,&quot;SHOW VIEW&quot;, &quot;TRIGGER&quot;。<br>注意，ModifyAction为空时，不传该参数表示清除该权限。</p>
     */
    public void setTablePrivileges(TablePrivilege [] TablePrivileges) {
        this.TablePrivileges = TablePrivileges;
    }

    /**
     * Get <p>数据库表中列的权限。Privileges 权限的可选值为：&quot;SELECT&quot;,&quot;INSERT&quot;,&quot;UPDATE&quot;,&quot;REFERENCES&quot;。<br>注意，ModifyAction为空时，不传该参数表示清除该权限。</p> 
     * @return ColumnPrivileges <p>数据库表中列的权限。Privileges 权限的可选值为：&quot;SELECT&quot;,&quot;INSERT&quot;,&quot;UPDATE&quot;,&quot;REFERENCES&quot;。<br>注意，ModifyAction为空时，不传该参数表示清除该权限。</p>
     */
    public ColumnPrivilege [] getColumnPrivileges() {
        return this.ColumnPrivileges;
    }

    /**
     * Set <p>数据库表中列的权限。Privileges 权限的可选值为：&quot;SELECT&quot;,&quot;INSERT&quot;,&quot;UPDATE&quot;,&quot;REFERENCES&quot;。<br>注意，ModifyAction为空时，不传该参数表示清除该权限。</p>
     * @param ColumnPrivileges <p>数据库表中列的权限。Privileges 权限的可选值为：&quot;SELECT&quot;,&quot;INSERT&quot;,&quot;UPDATE&quot;,&quot;REFERENCES&quot;。<br>注意，ModifyAction为空时，不传该参数表示清除该权限。</p>
     */
    public void setColumnPrivileges(ColumnPrivilege [] ColumnPrivileges) {
        this.ColumnPrivileges = ColumnPrivileges;
    }

    /**
     * Get <p>该参数不为空时，为批量修改权限。可选值为：grant - 授予权限，revoke - 回收权限。</p> 
     * @return ModifyAction <p>该参数不为空时，为批量修改权限。可选值为：grant - 授予权限，revoke - 回收权限。</p>
     */
    public String getModifyAction() {
        return this.ModifyAction;
    }

    /**
     * Set <p>该参数不为空时，为批量修改权限。可选值为：grant - 授予权限，revoke - 回收权限。</p>
     * @param ModifyAction <p>该参数不为空时，为批量修改权限。可选值为：grant - 授予权限，revoke - 回收权限。</p>
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

