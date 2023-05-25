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

public class DescribeAccountPrivilegesRequest extends AbstractModel{

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 账户名
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 主机
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 数据库名，为*时，忽略Type/TableName, 表示修改用户全局权限；
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * 指定数据库下的对象类型，可选"table"，"*"
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 当Type="table"时，用来指定表名
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

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
     * Get 账户名 
     * @return AccountName 账户名
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 账户名
     * @param AccountName 账户名
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get 主机 
     * @return Host 主机
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 主机
     * @param Host 主机
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 数据库名，为*时，忽略Type/TableName, 表示修改用户全局权限； 
     * @return Db 数据库名，为*时，忽略Type/TableName, 表示修改用户全局权限；
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * Set 数据库名，为*时，忽略Type/TableName, 表示修改用户全局权限；
     * @param Db 数据库名，为*时，忽略Type/TableName, 表示修改用户全局权限；
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * Get 指定数据库下的对象类型，可选"table"，"*" 
     * @return Type 指定数据库下的对象类型，可选"table"，"*"
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 指定数据库下的对象类型，可选"table"，"*"
     * @param Type 指定数据库下的对象类型，可选"table"，"*"
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 当Type="table"时，用来指定表名 
     * @return TableName 当Type="table"时，用来指定表名
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 当Type="table"时，用来指定表名
     * @param TableName 当Type="table"时，用来指定表名
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    public DescribeAccountPrivilegesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountPrivilegesRequest(DescribeAccountPrivilegesRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Db != null) {
            this.Db = new String(source.Db);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Db", this.Db);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "TableName", this.TableName);

    }
}

