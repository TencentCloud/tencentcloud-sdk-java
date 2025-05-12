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

public class ColumnLineage extends AbstractModel {

    /**
    * 数据源id
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * database 名称
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 表名称
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 列名称
    */
    @SerializedName("ColumnName")
    @Expose
    private String ColumnName;

    /**
    * catalog 名称
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * schema 名称
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 扩展参数
    */
    @SerializedName("ExtParams")
    @Expose
    private ExtParam [] ExtParams;

    /**
    * 表类型
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
    * 列类型
    */
    @SerializedName("ColumnType")
    @Expose
    private String ColumnType;

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
     * Get database 名称 
     * @return DatabaseName database 名称
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set database 名称
     * @param DatabaseName database 名称
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 表名称 
     * @return TableName 表名称
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名称
     * @param TableName 表名称
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 列名称 
     * @return ColumnName 列名称
     */
    public String getColumnName() {
        return this.ColumnName;
    }

    /**
     * Set 列名称
     * @param ColumnName 列名称
     */
    public void setColumnName(String ColumnName) {
        this.ColumnName = ColumnName;
    }

    /**
     * Get catalog 名称 
     * @return CatalogName catalog 名称
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set catalog 名称
     * @param CatalogName catalog 名称
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get schema 名称 
     * @return SchemaName schema 名称
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set schema 名称
     * @param SchemaName schema 名称
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 扩展参数 
     * @return ExtParams 扩展参数
     */
    public ExtParam [] getExtParams() {
        return this.ExtParams;
    }

    /**
     * Set 扩展参数
     * @param ExtParams 扩展参数
     */
    public void setExtParams(ExtParam [] ExtParams) {
        this.ExtParams = ExtParams;
    }

    /**
     * Get 表类型 
     * @return TableType 表类型
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set 表类型
     * @param TableType 表类型
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    /**
     * Get 列类型 
     * @return ColumnType 列类型
     */
    public String getColumnType() {
        return this.ColumnType;
    }

    /**
     * Set 列类型
     * @param ColumnType 列类型
     */
    public void setColumnType(String ColumnType) {
        this.ColumnType = ColumnType;
    }

    public ColumnLineage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ColumnLineage(ColumnLineage source) {
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.ColumnName != null) {
            this.ColumnName = new String(source.ColumnName);
        }
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.ExtParams != null) {
            this.ExtParams = new ExtParam[source.ExtParams.length];
            for (int i = 0; i < source.ExtParams.length; i++) {
                this.ExtParams[i] = new ExtParam(source.ExtParams[i]);
            }
        }
        if (source.TableType != null) {
            this.TableType = new String(source.TableType);
        }
        if (source.ColumnType != null) {
            this.ColumnType = new String(source.ColumnType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "ColumnName", this.ColumnName);
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamArrayObj(map, prefix + "ExtParams.", this.ExtParams);
        this.setParamSimple(map, prefix + "TableType", this.TableType);
        this.setParamSimple(map, prefix + "ColumnType", this.ColumnType);

    }
}

