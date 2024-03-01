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

public class ColumnBasicInfo extends AbstractModel {

    /**
    * 表的全局唯一ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 数据源全局唯一ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 数据源名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceName")
    @Expose
    private String DatasourceName;

    /**
    * 数据库ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

    /**
    * 数据库名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 表名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 字段名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnName")
    @Expose
    private String ColumnName;

    /**
    * 数据类型,string/int等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataType")
    @Expose
    private String DataType;

    /**
    * 字段类型, varchar(32)/int(10)等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnType")
    @Expose
    private String ColumnType;

    /**
    * 字段默认值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnDefault")
    @Expose
    private String ColumnDefault;

    /**
    * 索引类型, PRI/MUL/PARTITION等,普通字段该值为空串
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnKey")
    @Expose
    private String ColumnKey;

    /**
    * 字段顺序标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnPosition")
    @Expose
    private Long ColumnPosition;

    /**
    * 字段注释
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnComment")
    @Expose
    private String ColumnComment;

    /**
    * 数据类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StoreType")
    @Expose
    private String StoreType;

    /**
    * 所属项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 所属项目英文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 所属项目中文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectDisplayName")
    @Expose
    private String ProjectDisplayName;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 精度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scale")
    @Expose
    private Long Scale;

    /**
     * Get 表的全局唯一ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableId 表的全局唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 表的全局唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableId 表的全局唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 数据源全局唯一ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceId 数据源全局唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源全局唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceId 数据源全局唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 数据源名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceName 数据源名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceName() {
        return this.DatasourceName;
    }

    /**
     * Set 数据源名
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceName 数据源名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceName(String DatasourceName) {
        this.DatasourceName = DatasourceName;
    }

    /**
     * Get 数据库ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseId 数据库ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set 数据库ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseId 数据库ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseId(String DatabaseId) {
        this.DatabaseId = DatabaseId;
    }

    /**
     * Get 数据库名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseName 数据库名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseName 数据库名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 表名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName 表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 表名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName 表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 字段名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnName 字段名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColumnName() {
        return this.ColumnName;
    }

    /**
     * Set 字段名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnName 字段名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnName(String ColumnName) {
        this.ColumnName = ColumnName;
    }

    /**
     * Get 数据类型,string/int等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataType 数据类型,string/int等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataType() {
        return this.DataType;
    }

    /**
     * Set 数据类型,string/int等
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataType 数据类型,string/int等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataType(String DataType) {
        this.DataType = DataType;
    }

    /**
     * Get 字段类型, varchar(32)/int(10)等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnType 字段类型, varchar(32)/int(10)等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColumnType() {
        return this.ColumnType;
    }

    /**
     * Set 字段类型, varchar(32)/int(10)等
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnType 字段类型, varchar(32)/int(10)等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnType(String ColumnType) {
        this.ColumnType = ColumnType;
    }

    /**
     * Get 字段默认值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnDefault 字段默认值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColumnDefault() {
        return this.ColumnDefault;
    }

    /**
     * Set 字段默认值
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnDefault 字段默认值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnDefault(String ColumnDefault) {
        this.ColumnDefault = ColumnDefault;
    }

    /**
     * Get 索引类型, PRI/MUL/PARTITION等,普通字段该值为空串
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnKey 索引类型, PRI/MUL/PARTITION等,普通字段该值为空串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColumnKey() {
        return this.ColumnKey;
    }

    /**
     * Set 索引类型, PRI/MUL/PARTITION等,普通字段该值为空串
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnKey 索引类型, PRI/MUL/PARTITION等,普通字段该值为空串
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnKey(String ColumnKey) {
        this.ColumnKey = ColumnKey;
    }

    /**
     * Get 字段顺序标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnPosition 字段顺序标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getColumnPosition() {
        return this.ColumnPosition;
    }

    /**
     * Set 字段顺序标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnPosition 字段顺序标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnPosition(Long ColumnPosition) {
        this.ColumnPosition = ColumnPosition;
    }

    /**
     * Get 字段注释
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnComment 字段注释
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColumnComment() {
        return this.ColumnComment;
    }

    /**
     * Set 字段注释
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnComment 字段注释
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnComment(String ColumnComment) {
        this.ColumnComment = ColumnComment;
    }

    /**
     * Get 数据类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StoreType 数据类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStoreType() {
        return this.StoreType;
    }

    /**
     * Set 数据类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param StoreType 数据类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStoreType(String StoreType) {
        this.StoreType = StoreType;
    }

    /**
     * Get 所属项目ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 所属项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 所属项目ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 所属项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 所属项目英文名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName 所属项目英文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 所属项目英文名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName 所属项目英文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 所属项目中文名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectDisplayName 所属项目中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectDisplayName() {
        return this.ProjectDisplayName;
    }

    /**
     * Set 所属项目中文名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectDisplayName 所属项目中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectDisplayName(String ProjectDisplayName) {
        this.ProjectDisplayName = ProjectDisplayName;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 精度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scale 精度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScale() {
        return this.Scale;
    }

    /**
     * Set 精度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scale 精度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScale(Long Scale) {
        this.Scale = Scale;
    }

    public ColumnBasicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ColumnBasicInfo(ColumnBasicInfo source) {
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.DatasourceName != null) {
            this.DatasourceName = new String(source.DatasourceName);
        }
        if (source.DatabaseId != null) {
            this.DatabaseId = new String(source.DatabaseId);
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
        if (source.DataType != null) {
            this.DataType = new String(source.DataType);
        }
        if (source.ColumnType != null) {
            this.ColumnType = new String(source.ColumnType);
        }
        if (source.ColumnDefault != null) {
            this.ColumnDefault = new String(source.ColumnDefault);
        }
        if (source.ColumnKey != null) {
            this.ColumnKey = new String(source.ColumnKey);
        }
        if (source.ColumnPosition != null) {
            this.ColumnPosition = new Long(source.ColumnPosition);
        }
        if (source.ColumnComment != null) {
            this.ColumnComment = new String(source.ColumnComment);
        }
        if (source.StoreType != null) {
            this.StoreType = new String(source.StoreType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.ProjectDisplayName != null) {
            this.ProjectDisplayName = new String(source.ProjectDisplayName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Scale != null) {
            this.Scale = new Long(source.Scale);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatasourceName", this.DatasourceName);
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "ColumnName", this.ColumnName);
        this.setParamSimple(map, prefix + "DataType", this.DataType);
        this.setParamSimple(map, prefix + "ColumnType", this.ColumnType);
        this.setParamSimple(map, prefix + "ColumnDefault", this.ColumnDefault);
        this.setParamSimple(map, prefix + "ColumnKey", this.ColumnKey);
        this.setParamSimple(map, prefix + "ColumnPosition", this.ColumnPosition);
        this.setParamSimple(map, prefix + "ColumnComment", this.ColumnComment);
        this.setParamSimple(map, prefix + "StoreType", this.StoreType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "ProjectDisplayName", this.ProjectDisplayName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Scale", this.Scale);

    }
}

