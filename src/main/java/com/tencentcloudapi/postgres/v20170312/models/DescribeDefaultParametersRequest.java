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

public class DescribeDefaultParametersRequest extends AbstractModel{

    /**
    * 数据库版本，大版本号，例如11，12，13
    */
    @SerializedName("DBMajorVersion")
    @Expose
    private String DBMajorVersion;

    /**
    * 数据库引擎，例如：postgresql,mssql_compatible
    */
    @SerializedName("DBEngine")
    @Expose
    private String DBEngine;

    /**
     * Get 数据库版本，大版本号，例如11，12，13 
     * @return DBMajorVersion 数据库版本，大版本号，例如11，12，13
     */
    public String getDBMajorVersion() {
        return this.DBMajorVersion;
    }

    /**
     * Set 数据库版本，大版本号，例如11，12，13
     * @param DBMajorVersion 数据库版本，大版本号，例如11，12，13
     */
    public void setDBMajorVersion(String DBMajorVersion) {
        this.DBMajorVersion = DBMajorVersion;
    }

    /**
     * Get 数据库引擎，例如：postgresql,mssql_compatible 
     * @return DBEngine 数据库引擎，例如：postgresql,mssql_compatible
     */
    public String getDBEngine() {
        return this.DBEngine;
    }

    /**
     * Set 数据库引擎，例如：postgresql,mssql_compatible
     * @param DBEngine 数据库引擎，例如：postgresql,mssql_compatible
     */
    public void setDBEngine(String DBEngine) {
        this.DBEngine = DBEngine;
    }

    public DescribeDefaultParametersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDefaultParametersRequest(DescribeDefaultParametersRequest source) {
        if (source.DBMajorVersion != null) {
            this.DBMajorVersion = new String(source.DBMajorVersion);
        }
        if (source.DBEngine != null) {
            this.DBEngine = new String(source.DBEngine);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBMajorVersion", this.DBMajorVersion);
        this.setParamSimple(map, prefix + "DBEngine", this.DBEngine);

    }
}

