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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTableSchemaInfoRequest extends AbstractModel{

    /**
    * 表名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数据库名称
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 表类型
    */
    @SerializedName("MsType")
    @Expose
    private String MsType;

    /**
    * 数据源id
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * HIVE传rpc
    */
    @SerializedName("ConnectionType")
    @Expose
    private String ConnectionType;

    /**
    * 元数据Database下的Schema名称
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
     * Get 表名称 
     * @return Name 表名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 表名称
     * @param Name 表名称
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get 表类型 
     * @return MsType 表类型
     */
    public String getMsType() {
        return this.MsType;
    }

    /**
     * Set 表类型
     * @param MsType 表类型
     */
    public void setMsType(String MsType) {
        this.MsType = MsType;
    }

    /**
     * Get 数据源id 
     * @return DatasourceId 数据源id
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源id
     * @param DatasourceId 数据源id
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get HIVE传rpc 
     * @return ConnectionType HIVE传rpc
     */
    public String getConnectionType() {
        return this.ConnectionType;
    }

    /**
     * Set HIVE传rpc
     * @param ConnectionType HIVE传rpc
     */
    public void setConnectionType(String ConnectionType) {
        this.ConnectionType = ConnectionType;
    }

    /**
     * Get 元数据Database下的Schema名称 
     * @return SchemaName 元数据Database下的Schema名称
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set 元数据Database下的Schema名称
     * @param SchemaName 元数据Database下的Schema名称
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    public DescribeTableSchemaInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTableSchemaInfoRequest(DescribeTableSchemaInfoRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.MsType != null) {
            this.MsType = new String(source.MsType);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.ConnectionType != null) {
            this.ConnectionType = new String(source.ConnectionType);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "MsType", this.MsType);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "ConnectionType", this.ConnectionType);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);

    }
}

