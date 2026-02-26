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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskDataRegistry extends AbstractModel {

    /**
    * 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 数据库名称
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
    * 分区名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PartitionName")
    @Expose
    private String PartitionName;

    /**
    * 输入输出表类型
      输入流
 UPSTREAM,
      输出流
  DOWNSTREAM;
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataFlowType")
    @Expose
    private String DataFlowType;

    /**
    * 表物理唯一ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TablePhysicalId")
    @Expose
    private String TablePhysicalId;

    /**
    * 库唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbGuid")
    @Expose
    private String DbGuid;

    /**
    * 表唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableGuid")
    @Expose
    private String TableGuid;

    /**
    * Catalog名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceName")
    @Expose
    private String DatasourceName;

    /**
    * Catalog(如有).数据库(如有).表名名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QualifiedName")
    @Expose
    private String QualifiedName;

    /**
     * Get 数据源ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceId 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceId 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 数据库名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseName 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseName 数据库名称
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
     * Get 分区名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PartitionName 分区名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPartitionName() {
        return this.PartitionName;
    }

    /**
     * Set 分区名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PartitionName 分区名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitionName(String PartitionName) {
        this.PartitionName = PartitionName;
    }

    /**
     * Get 输入输出表类型
      输入流
 UPSTREAM,
      输出流
  DOWNSTREAM;
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataFlowType 输入输出表类型
      输入流
 UPSTREAM,
      输出流
  DOWNSTREAM;
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataFlowType() {
        return this.DataFlowType;
    }

    /**
     * Set 输入输出表类型
      输入流
 UPSTREAM,
      输出流
  DOWNSTREAM;
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataFlowType 输入输出表类型
      输入流
 UPSTREAM,
      输出流
  DOWNSTREAM;
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataFlowType(String DataFlowType) {
        this.DataFlowType = DataFlowType;
    }

    /**
     * Get 表物理唯一ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TablePhysicalId 表物理唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTablePhysicalId() {
        return this.TablePhysicalId;
    }

    /**
     * Set 表物理唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TablePhysicalId 表物理唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTablePhysicalId(String TablePhysicalId) {
        this.TablePhysicalId = TablePhysicalId;
    }

    /**
     * Get 库唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbGuid 库唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbGuid() {
        return this.DbGuid;
    }

    /**
     * Set 库唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbGuid 库唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbGuid(String DbGuid) {
        this.DbGuid = DbGuid;
    }

    /**
     * Get 表唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableGuid 表唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableGuid() {
        return this.TableGuid;
    }

    /**
     * Set 表唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableGuid 表唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableGuid(String TableGuid) {
        this.TableGuid = TableGuid;
    }

    /**
     * Get Catalog名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CatalogName Catalog名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set Catalog名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CatalogName Catalog名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get 数据源名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceName 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceName() {
        return this.DatasourceName;
    }

    /**
     * Set 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceName 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceName(String DatasourceName) {
        this.DatasourceName = DatasourceName;
    }

    /**
     * Get Catalog(如有).数据库(如有).表名名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QualifiedName Catalog(如有).数据库(如有).表名名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQualifiedName() {
        return this.QualifiedName;
    }

    /**
     * Set Catalog(如有).数据库(如有).表名名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param QualifiedName Catalog(如有).数据库(如有).表名名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQualifiedName(String QualifiedName) {
        this.QualifiedName = QualifiedName;
    }

    public TaskDataRegistry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskDataRegistry(TaskDataRegistry source) {
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.PartitionName != null) {
            this.PartitionName = new String(source.PartitionName);
        }
        if (source.DataFlowType != null) {
            this.DataFlowType = new String(source.DataFlowType);
        }
        if (source.TablePhysicalId != null) {
            this.TablePhysicalId = new String(source.TablePhysicalId);
        }
        if (source.DbGuid != null) {
            this.DbGuid = new String(source.DbGuid);
        }
        if (source.TableGuid != null) {
            this.TableGuid = new String(source.TableGuid);
        }
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.DatasourceName != null) {
            this.DatasourceName = new String(source.DatasourceName);
        }
        if (source.QualifiedName != null) {
            this.QualifiedName = new String(source.QualifiedName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "PartitionName", this.PartitionName);
        this.setParamSimple(map, prefix + "DataFlowType", this.DataFlowType);
        this.setParamSimple(map, prefix + "TablePhysicalId", this.TablePhysicalId);
        this.setParamSimple(map, prefix + "DbGuid", this.DbGuid);
        this.setParamSimple(map, prefix + "TableGuid", this.TableGuid);
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "DatasourceName", this.DatasourceName);
        this.setParamSimple(map, prefix + "QualifiedName", this.QualifiedName);

    }
}

