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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccountPrivilegesRequest extends AbstractModel {

    /**
    * 实例ID。	可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 查询此账号对某数据库对象所拥有的权限信息。账号名可通过[DescribeAccounts](https://cloud.tencent.com/document/api/409/18109)接口获取
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 要查询的数据库对象信息
    */
    @SerializedName("DatabaseObjectSet")
    @Expose
    private DatabaseObject [] DatabaseObjectSet;

    /**
     * Get 实例ID。	可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取 
     * @return DBInstanceId 实例ID。	可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例ID。	可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
     * @param DBInstanceId 实例ID。	可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 查询此账号对某数据库对象所拥有的权限信息。账号名可通过[DescribeAccounts](https://cloud.tencent.com/document/api/409/18109)接口获取 
     * @return UserName 查询此账号对某数据库对象所拥有的权限信息。账号名可通过[DescribeAccounts](https://cloud.tencent.com/document/api/409/18109)接口获取
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 查询此账号对某数据库对象所拥有的权限信息。账号名可通过[DescribeAccounts](https://cloud.tencent.com/document/api/409/18109)接口获取
     * @param UserName 查询此账号对某数据库对象所拥有的权限信息。账号名可通过[DescribeAccounts](https://cloud.tencent.com/document/api/409/18109)接口获取
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 要查询的数据库对象信息 
     * @return DatabaseObjectSet 要查询的数据库对象信息
     */
    public DatabaseObject [] getDatabaseObjectSet() {
        return this.DatabaseObjectSet;
    }

    /**
     * Set 要查询的数据库对象信息
     * @param DatabaseObjectSet 要查询的数据库对象信息
     */
    public void setDatabaseObjectSet(DatabaseObject [] DatabaseObjectSet) {
        this.DatabaseObjectSet = DatabaseObjectSet;
    }

    public DescribeAccountPrivilegesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccountPrivilegesRequest(DescribeAccountPrivilegesRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.DatabaseObjectSet != null) {
            this.DatabaseObjectSet = new DatabaseObject[source.DatabaseObjectSet.length];
            for (int i = 0; i < source.DatabaseObjectSet.length; i++) {
                this.DatabaseObjectSet[i] = new DatabaseObject(source.DatabaseObjectSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamArrayObj(map, prefix + "DatabaseObjectSet.", this.DatabaseObjectSet);

    }
}

