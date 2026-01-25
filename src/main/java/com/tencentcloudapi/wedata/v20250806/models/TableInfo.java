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

public class TableInfo extends AbstractModel {

    /**
    * 数据表GUID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Guid")
    @Expose
    private String Guid;

    /**
    * 数据表名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 数据表描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 数据库Schema名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 表类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

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
    * 表的技术元数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TechnicalMetadata")
    @Expose
    private TechnicalMetadata TechnicalMetadata;

    /**
    * 表的业务元数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessMetadata")
    @Expose
    private BusinessMetadata BusinessMetadata;

    /**
    * 数据目录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private Long DatasourceId;

    /**
    * 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceType")
    @Expose
    private String DatasourceType;

    /**
     * Get 数据表GUID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Guid 数据表GUID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGuid() {
        return this.Guid;
    }

    /**
     * Set 数据表GUID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Guid 数据表GUID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGuid(String Guid) {
        this.Guid = Guid;
    }

    /**
     * Get 数据表名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 数据表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 数据表名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 数据表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 数据表描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 数据表描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 数据表描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 数据表描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get 数据库Schema名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchemaName 数据库Schema名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set 数据库Schema名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchemaName 数据库Schema名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 表类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableType 表类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set 表类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableType 表类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
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
     * Get 表的技术元数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TechnicalMetadata 表的技术元数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TechnicalMetadata getTechnicalMetadata() {
        return this.TechnicalMetadata;
    }

    /**
     * Set 表的技术元数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param TechnicalMetadata 表的技术元数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTechnicalMetadata(TechnicalMetadata TechnicalMetadata) {
        this.TechnicalMetadata = TechnicalMetadata;
    }

    /**
     * Get 表的业务元数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessMetadata 表的业务元数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BusinessMetadata getBusinessMetadata() {
        return this.BusinessMetadata;
    }

    /**
     * Set 表的业务元数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessMetadata 表的业务元数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessMetadata(BusinessMetadata BusinessMetadata) {
        this.BusinessMetadata = BusinessMetadata;
    }

    /**
     * Get 数据目录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CatalogName 数据目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set 数据目录
注意：此字段可能返回 null，表示取不到有效值。
     * @param CatalogName 数据目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get 数据源ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceId 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceId 数据源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceId(Long DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 数据源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceType 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceType() {
        return this.DatasourceType;
    }

    /**
     * Set 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceType 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceType(String DatasourceType) {
        this.DatasourceType = DatasourceType;
    }

    public TableInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableInfo(TableInfo source) {
        if (source.Guid != null) {
            this.Guid = new String(source.Guid);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.TableType != null) {
            this.TableType = new String(source.TableType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.TechnicalMetadata != null) {
            this.TechnicalMetadata = new TechnicalMetadata(source.TechnicalMetadata);
        }
        if (source.BusinessMetadata != null) {
            this.BusinessMetadata = new BusinessMetadata(source.BusinessMetadata);
        }
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new Long(source.DatasourceId);
        }
        if (source.DatasourceType != null) {
            this.DatasourceType = new String(source.DatasourceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Guid", this.Guid);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "TableType", this.TableType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "TechnicalMetadata.", this.TechnicalMetadata);
        this.setParamObj(map, prefix + "BusinessMetadata.", this.BusinessMetadata);
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatasourceType", this.DatasourceType);

    }
}

