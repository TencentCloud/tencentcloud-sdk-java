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

public class ModifyDatabaseOwnerRequest extends AbstractModel {

    /**
    * 实例ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 数据库名称。可通过[DescribeDatabases](https://cloud.tencent.com/document/api/409/43353)接口获取
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 数据库新所有者。可通过[DescribeAccounts](https://cloud.tencent.com/document/api/409/18109)接口获取
    */
    @SerializedName("DatabaseOwner")
    @Expose
    private String DatabaseOwner;

    /**
     * Get 实例ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取 
     * @return DBInstanceId 实例ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set 实例ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
     * @param DBInstanceId 实例ID。可通过[DescribeDBInstances](https://cloud.tencent.com/document/api/409/16773)接口获取
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get 数据库名称。可通过[DescribeDatabases](https://cloud.tencent.com/document/api/409/43353)接口获取 
     * @return DatabaseName 数据库名称。可通过[DescribeDatabases](https://cloud.tencent.com/document/api/409/43353)接口获取
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名称。可通过[DescribeDatabases](https://cloud.tencent.com/document/api/409/43353)接口获取
     * @param DatabaseName 数据库名称。可通过[DescribeDatabases](https://cloud.tencent.com/document/api/409/43353)接口获取
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 数据库新所有者。可通过[DescribeAccounts](https://cloud.tencent.com/document/api/409/18109)接口获取 
     * @return DatabaseOwner 数据库新所有者。可通过[DescribeAccounts](https://cloud.tencent.com/document/api/409/18109)接口获取
     */
    public String getDatabaseOwner() {
        return this.DatabaseOwner;
    }

    /**
     * Set 数据库新所有者。可通过[DescribeAccounts](https://cloud.tencent.com/document/api/409/18109)接口获取
     * @param DatabaseOwner 数据库新所有者。可通过[DescribeAccounts](https://cloud.tencent.com/document/api/409/18109)接口获取
     */
    public void setDatabaseOwner(String DatabaseOwner) {
        this.DatabaseOwner = DatabaseOwner;
    }

    public ModifyDatabaseOwnerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDatabaseOwnerRequest(ModifyDatabaseOwnerRequest source) {
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.DatabaseOwner != null) {
            this.DatabaseOwner = new String(source.DatabaseOwner);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "DatabaseOwner", this.DatabaseOwner);

    }
}

