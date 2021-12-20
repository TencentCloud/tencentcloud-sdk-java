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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDatabaseRequest extends AbstractModel{

    /**
    * 数据库基础信息
    */
    @SerializedName("DatabaseInfo")
    @Expose
    private DatabaseInfo DatabaseInfo;

    /**
    * 数据源名称，默认为DataLakeCatalog
    */
    @SerializedName("DatasourceConnectionName")
    @Expose
    private String DatasourceConnectionName;

    /**
     * Get 数据库基础信息 
     * @return DatabaseInfo 数据库基础信息
     */
    public DatabaseInfo getDatabaseInfo() {
        return this.DatabaseInfo;
    }

    /**
     * Set 数据库基础信息
     * @param DatabaseInfo 数据库基础信息
     */
    public void setDatabaseInfo(DatabaseInfo DatabaseInfo) {
        this.DatabaseInfo = DatabaseInfo;
    }

    /**
     * Get 数据源名称，默认为DataLakeCatalog 
     * @return DatasourceConnectionName 数据源名称，默认为DataLakeCatalog
     */
    public String getDatasourceConnectionName() {
        return this.DatasourceConnectionName;
    }

    /**
     * Set 数据源名称，默认为DataLakeCatalog
     * @param DatasourceConnectionName 数据源名称，默认为DataLakeCatalog
     */
    public void setDatasourceConnectionName(String DatasourceConnectionName) {
        this.DatasourceConnectionName = DatasourceConnectionName;
    }

    public CreateDatabaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDatabaseRequest(CreateDatabaseRequest source) {
        if (source.DatabaseInfo != null) {
            this.DatabaseInfo = new DatabaseInfo(source.DatabaseInfo);
        }
        if (source.DatasourceConnectionName != null) {
            this.DatasourceConnectionName = new String(source.DatasourceConnectionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "DatabaseInfo.", this.DatabaseInfo);
        this.setParamSimple(map, prefix + "DatasourceConnectionName", this.DatasourceConnectionName);

    }
}

