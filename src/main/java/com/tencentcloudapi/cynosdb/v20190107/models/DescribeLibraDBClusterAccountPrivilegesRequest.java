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

public class DescribeLibraDBClusterAccountPrivilegesRequest extends AbstractModel {

    /**
    * 集群id
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 账号名
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 主机名
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 数据库名
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 表名
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
     * Get 账号名 
     * @return AccountName 账号名
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set 账号名
     * @param AccountName 账号名
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get 主机名 
     * @return Host 主机名
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 主机名
     * @param Host 主机名
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 数据库名 
     * @return Db 数据库名
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * Set 数据库名
     * @param Db 数据库名
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * Get 类型 
     * @return Type 类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 表名 
     * @return TableName 表名
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名
     * @param TableName 表名
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    public DescribeLibraDBClusterAccountPrivilegesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLibraDBClusterAccountPrivilegesRequest(DescribeLibraDBClusterAccountPrivilegesRequest source) {
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

