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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeClassesRequest extends AbstractModel{

    /**
    * 可用区ID。可以通过接口DescribeZones获取。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 数据库引擎，支持：
1、postgresql（云数据库PostgreSQL）；
2、mssql_compatible（MSSQL兼容-云数据库PostgreSQL）；
    */
    @SerializedName("DBEngine")
    @Expose
    private String DBEngine;

    /**
    * 数据库主版本号。例如12，13，可以通过接口DescribeDBVersions获取。
    */
    @SerializedName("DBMajorVersion")
    @Expose
    private String DBMajorVersion;

    /**
     * Get 可用区ID。可以通过接口DescribeZones获取。 
     * @return Zone 可用区ID。可以通过接口DescribeZones获取。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区ID。可以通过接口DescribeZones获取。
     * @param Zone 可用区ID。可以通过接口DescribeZones获取。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 数据库引擎，支持：
1、postgresql（云数据库PostgreSQL）；
2、mssql_compatible（MSSQL兼容-云数据库PostgreSQL）； 
     * @return DBEngine 数据库引擎，支持：
1、postgresql（云数据库PostgreSQL）；
2、mssql_compatible（MSSQL兼容-云数据库PostgreSQL）；
     */
    public String getDBEngine() {
        return this.DBEngine;
    }

    /**
     * Set 数据库引擎，支持：
1、postgresql（云数据库PostgreSQL）；
2、mssql_compatible（MSSQL兼容-云数据库PostgreSQL）；
     * @param DBEngine 数据库引擎，支持：
1、postgresql（云数据库PostgreSQL）；
2、mssql_compatible（MSSQL兼容-云数据库PostgreSQL）；
     */
    public void setDBEngine(String DBEngine) {
        this.DBEngine = DBEngine;
    }

    /**
     * Get 数据库主版本号。例如12，13，可以通过接口DescribeDBVersions获取。 
     * @return DBMajorVersion 数据库主版本号。例如12，13，可以通过接口DescribeDBVersions获取。
     */
    public String getDBMajorVersion() {
        return this.DBMajorVersion;
    }

    /**
     * Set 数据库主版本号。例如12，13，可以通过接口DescribeDBVersions获取。
     * @param DBMajorVersion 数据库主版本号。例如12，13，可以通过接口DescribeDBVersions获取。
     */
    public void setDBMajorVersion(String DBMajorVersion) {
        this.DBMajorVersion = DBMajorVersion;
    }

    public DescribeClassesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeClassesRequest(DescribeClassesRequest source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.DBEngine != null) {
            this.DBEngine = new String(source.DBEngine);
        }
        if (source.DBMajorVersion != null) {
            this.DBMajorVersion = new String(source.DBMajorVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "DBEngine", this.DBEngine);
        this.setParamSimple(map, prefix + "DBMajorVersion", this.DBMajorVersion);

    }
}

