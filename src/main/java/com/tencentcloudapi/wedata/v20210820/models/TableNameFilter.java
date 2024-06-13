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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableNameFilter extends AbstractModel {

    /**
    * 数据源类型
    */
    @SerializedName("MsType")
    @Expose
    private String MsType;

    /**
    * 数据源id
    */
    @SerializedName("DatasourceId")
    @Expose
    private Long DatasourceId;

    /**
    * 数据库名称
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * schema
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 表名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 数据源类型 
     * @return MsType 数据源类型
     */
    public String getMsType() {
        return this.MsType;
    }

    /**
     * Set 数据源类型
     * @param MsType 数据源类型
     */
    public void setMsType(String MsType) {
        this.MsType = MsType;
    }

    /**
     * Get 数据源id 
     * @return DatasourceId 数据源id
     */
    public Long getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源id
     * @param DatasourceId 数据源id
     */
    public void setDatasourceId(Long DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 数据库名称 
     * @return DatabaseName 数据库名称
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名称
     * @param DatabaseName 数据库名称
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get schema 
     * @return SchemaName schema
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set schema
     * @param SchemaName schema
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 表名 
     * @return Name 表名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 表名
     * @param Name 表名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public TableNameFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableNameFilter(TableNameFilter source) {
        if (source.MsType != null) {
            this.MsType = new String(source.MsType);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new Long(source.DatasourceId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MsType", this.MsType);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

