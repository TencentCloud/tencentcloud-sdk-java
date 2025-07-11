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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSqlApisRequest extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * GetUsers：获取用户列表；
GetDatabases：获取数据库列表；
GetTables：获取数据库表列表；
GetUserPrivilegesV2：获取用户下的权限，粒度到表级别；
DeleteUser：删除用户；
GetCatalog：获取Catalog列表；
    */
    @SerializedName("ApiType")
    @Expose
    private String ApiType;

    /**
    * 用户名称
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户链接来自的 IP
    */
    @SerializedName("WhiteHost")
    @Expose
    private String WhiteHost;

    /**
    * catalog名称
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * catalog集合
    */
    @SerializedName("Catalogs")
    @Expose
    private String [] Catalogs;

    /**
    * 数据库名
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 表名
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 用户名列表
    */
    @SerializedName("UserNames")
    @Expose
    private String [] UserNames;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get GetUsers：获取用户列表；
GetDatabases：获取数据库列表；
GetTables：获取数据库表列表；
GetUserPrivilegesV2：获取用户下的权限，粒度到表级别；
DeleteUser：删除用户；
GetCatalog：获取Catalog列表； 
     * @return ApiType GetUsers：获取用户列表；
GetDatabases：获取数据库列表；
GetTables：获取数据库表列表；
GetUserPrivilegesV2：获取用户下的权限，粒度到表级别；
DeleteUser：删除用户；
GetCatalog：获取Catalog列表；
     */
    public String getApiType() {
        return this.ApiType;
    }

    /**
     * Set GetUsers：获取用户列表；
GetDatabases：获取数据库列表；
GetTables：获取数据库表列表；
GetUserPrivilegesV2：获取用户下的权限，粒度到表级别；
DeleteUser：删除用户；
GetCatalog：获取Catalog列表；
     * @param ApiType GetUsers：获取用户列表；
GetDatabases：获取数据库列表；
GetTables：获取数据库表列表；
GetUserPrivilegesV2：获取用户下的权限，粒度到表级别；
DeleteUser：删除用户；
GetCatalog：获取Catalog列表；
     */
    public void setApiType(String ApiType) {
        this.ApiType = ApiType;
    }

    /**
     * Get 用户名称 
     * @return UserName 用户名称
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 用户名称
     * @param UserName 用户名称
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 用户链接来自的 IP 
     * @return WhiteHost 用户链接来自的 IP
     */
    public String getWhiteHost() {
        return this.WhiteHost;
    }

    /**
     * Set 用户链接来自的 IP
     * @param WhiteHost 用户链接来自的 IP
     */
    public void setWhiteHost(String WhiteHost) {
        this.WhiteHost = WhiteHost;
    }

    /**
     * Get catalog名称 
     * @return Catalog catalog名称
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set catalog名称
     * @param Catalog catalog名称
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get catalog集合 
     * @return Catalogs catalog集合
     */
    public String [] getCatalogs() {
        return this.Catalogs;
    }

    /**
     * Set catalog集合
     * @param Catalogs catalog集合
     */
    public void setCatalogs(String [] Catalogs) {
        this.Catalogs = Catalogs;
    }

    /**
     * Get 数据库名 
     * @return DatabaseName 数据库名
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名
     * @param DatabaseName 数据库名
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
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

    /**
     * Get 用户名列表 
     * @return UserNames 用户名列表
     */
    public String [] getUserNames() {
        return this.UserNames;
    }

    /**
     * Set 用户名列表
     * @param UserNames 用户名列表
     */
    public void setUserNames(String [] UserNames) {
        this.UserNames = UserNames;
    }

    public DescribeSqlApisRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSqlApisRequest(DescribeSqlApisRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ApiType != null) {
            this.ApiType = new String(source.ApiType);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.WhiteHost != null) {
            this.WhiteHost = new String(source.WhiteHost);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.Catalogs != null) {
            this.Catalogs = new String[source.Catalogs.length];
            for (int i = 0; i < source.Catalogs.length; i++) {
                this.Catalogs[i] = new String(source.Catalogs[i]);
            }
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.UserNames != null) {
            this.UserNames = new String[source.UserNames.length];
            for (int i = 0; i < source.UserNames.length; i++) {
                this.UserNames[i] = new String(source.UserNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ApiType", this.ApiType);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "WhiteHost", this.WhiteHost);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamArraySimple(map, prefix + "Catalogs.", this.Catalogs);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamArraySimple(map, prefix + "UserNames.", this.UserNames);

    }
}

