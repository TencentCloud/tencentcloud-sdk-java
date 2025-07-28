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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReportTableRequest extends AbstractModel {

    /**
    * 数据源id
    */
    @SerializedName("DatasourceId")
    @Expose
    private Long DatasourceId;

    /**
    * database名称,字符长度128内
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * table名称,字符长度128内
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 表类型,VIEW/TABLE
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * schema名称,字符长度128内
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 描述,字符长度1000内
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间戳,毫秒,为空默认当前时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 修改时间戳,毫秒,为空默认当前时间
    */
    @SerializedName("ModifiedTime")
    @Expose
    private Long ModifiedTime;

    /**
    * 字段信息
    */
    @SerializedName("Columns")
    @Expose
    private ReportColumnInfo [] Columns;

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
     * Get database名称,字符长度128内 
     * @return DatabaseName database名称,字符长度128内
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set database名称,字符长度128内
     * @param DatabaseName database名称,字符长度128内
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get table名称,字符长度128内 
     * @return TableName table名称,字符长度128内
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set table名称,字符长度128内
     * @param TableName table名称,字符长度128内
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 表类型,VIEW/TABLE 
     * @return Type 表类型,VIEW/TABLE
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 表类型,VIEW/TABLE
     * @param Type 表类型,VIEW/TABLE
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get schema名称,字符长度128内 
     * @return SchemaName schema名称,字符长度128内
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set schema名称,字符长度128内
     * @param SchemaName schema名称,字符长度128内
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 描述,字符长度1000内 
     * @return Description 描述,字符长度1000内
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述,字符长度1000内
     * @param Description 描述,字符长度1000内
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 创建时间戳,毫秒,为空默认当前时间 
     * @return CreateTime 创建时间戳,毫秒,为空默认当前时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间戳,毫秒,为空默认当前时间
     * @param CreateTime 创建时间戳,毫秒,为空默认当前时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 修改时间戳,毫秒,为空默认当前时间 
     * @return ModifiedTime 修改时间戳,毫秒,为空默认当前时间
     */
    public Long getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 修改时间戳,毫秒,为空默认当前时间
     * @param ModifiedTime 修改时间戳,毫秒,为空默认当前时间
     */
    public void setModifiedTime(Long ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get 字段信息 
     * @return Columns 字段信息
     */
    public ReportColumnInfo [] getColumns() {
        return this.Columns;
    }

    /**
     * Set 字段信息
     * @param Columns 字段信息
     */
    public void setColumns(ReportColumnInfo [] Columns) {
        this.Columns = Columns;
    }

    public ReportTableRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReportTableRequest(ReportTableRequest source) {
        if (source.DatasourceId != null) {
            this.DatasourceId = new Long(source.DatasourceId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new Long(source.ModifiedTime);
        }
        if (source.Columns != null) {
            this.Columns = new ReportColumnInfo[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new ReportColumnInfo(source.Columns[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);

    }
}

