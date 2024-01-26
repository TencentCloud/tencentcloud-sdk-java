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

public class TableHybrisReq extends AbstractModel {

    /**
    * 数据类型：HIVE，ICEBERG，CDW，DLC
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsType")
    @Expose
    private String MsType;

    /**
    * DbName类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * Name表名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 创建人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 数据源id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private Float DatasourceId;

    /**
    * 创建人账号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerAccount")
    @Expose
    private Float OwnerAccount;

    /**
    * 普通字段列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Columns")
    @Expose
    private Columns [] Columns;

    /**
    * 分区字段列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PartitionKeys")
    @Expose
    private Columns [] PartitionKeys;

    /**
    * Catalog类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * Type类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 废弃
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NameCn")
    @Expose
    private String NameCn;

    /**
    * 中文描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 废弃
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PartitionType")
    @Expose
    private Long PartitionType;

    /**
    * 生命周期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LifeTime")
    @Expose
    private Long LifeTime;

    /**
    * 废弃
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageFormat")
    @Expose
    private String StorageFormat;

    /**
    * 废弃
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnDelimiter")
    @Expose
    private String ColumnDelimiter;

    /**
    * 废弃
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConnectionType")
    @Expose
    private String ConnectionType;

    /**
    * 废弃
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 表英文名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NameEn")
    @Expose
    private String NameEn;

    /**
    * 建表 SQL，DDL 模式 建 hive 表时，wedata 会对其进行 base64 解码，故传进来之前应该进行 base64转码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Sql")
    @Expose
    private String Sql;

    /**
    * 表业务参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizParams")
    @Expose
    private BizParams BizParams;

    /**
    * 模式名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
     * Get 数据类型：HIVE，ICEBERG，CDW，DLC
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsType 数据类型：HIVE，ICEBERG，CDW，DLC
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsType() {
        return this.MsType;
    }

    /**
     * Set 数据类型：HIVE，ICEBERG，CDW，DLC
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsType 数据类型：HIVE，ICEBERG，CDW，DLC
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsType(String MsType) {
        this.MsType = MsType;
    }

    /**
     * Get DbName类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DbName DbName类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * Set DbName类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DbName DbName类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * Get Name表名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name Name表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name表名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name Name表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 创建人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Owner 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 创建人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Owner 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    /**
     * Get 数据源id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceId 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceId 数据源id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceId(Float DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 创建人账号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerAccount 创建人账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getOwnerAccount() {
        return this.OwnerAccount;
    }

    /**
     * Set 创建人账号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerAccount 创建人账号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerAccount(Float OwnerAccount) {
        this.OwnerAccount = OwnerAccount;
    }

    /**
     * Get 普通字段列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Columns 普通字段列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Columns [] getColumns() {
        return this.Columns;
    }

    /**
     * Set 普通字段列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Columns 普通字段列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumns(Columns [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get 分区字段列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PartitionKeys 分区字段列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Columns [] getPartitionKeys() {
        return this.PartitionKeys;
    }

    /**
     * Set 分区字段列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PartitionKeys 分区字段列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitionKeys(Columns [] PartitionKeys) {
        this.PartitionKeys = PartitionKeys;
    }

    /**
     * Get Catalog类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Catalog Catalog类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set Catalog类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Catalog Catalog类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get Type类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type Type类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type Type类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 废弃
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NameCn 废弃
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNameCn() {
        return this.NameCn;
    }

    /**
     * Set 废弃
注意：此字段可能返回 null，表示取不到有效值。
     * @param NameCn 废弃
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNameCn(String NameCn) {
        this.NameCn = NameCn;
    }

    /**
     * Get 中文描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 中文描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 中文描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 中文描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 废弃
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PartitionType 废弃
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPartitionType() {
        return this.PartitionType;
    }

    /**
     * Set 废弃
注意：此字段可能返回 null，表示取不到有效值。
     * @param PartitionType 废弃
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitionType(Long PartitionType) {
        this.PartitionType = PartitionType;
    }

    /**
     * Get 生命周期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LifeTime 生命周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLifeTime() {
        return this.LifeTime;
    }

    /**
     * Set 生命周期
注意：此字段可能返回 null，表示取不到有效值。
     * @param LifeTime 生命周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLifeTime(Long LifeTime) {
        this.LifeTime = LifeTime;
    }

    /**
     * Get 废弃
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageFormat 废弃
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageFormat() {
        return this.StorageFormat;
    }

    /**
     * Set 废弃
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageFormat 废弃
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageFormat(String StorageFormat) {
        this.StorageFormat = StorageFormat;
    }

    /**
     * Get 废弃
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnDelimiter 废弃
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColumnDelimiter() {
        return this.ColumnDelimiter;
    }

    /**
     * Set 废弃
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnDelimiter 废弃
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnDelimiter(String ColumnDelimiter) {
        this.ColumnDelimiter = ColumnDelimiter;
    }

    /**
     * Get 废弃
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConnectionType 废弃
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConnectionType() {
        return this.ConnectionType;
    }

    /**
     * Set 废弃
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConnectionType 废弃
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConnectionType(String ConnectionType) {
        this.ConnectionType = ConnectionType;
    }

    /**
     * Get 废弃
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace 废弃
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 废弃
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace 废弃
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 表英文名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NameEn 表英文名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNameEn() {
        return this.NameEn;
    }

    /**
     * Set 表英文名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NameEn 表英文名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNameEn(String NameEn) {
        this.NameEn = NameEn;
    }

    /**
     * Get 建表 SQL，DDL 模式 建 hive 表时，wedata 会对其进行 base64 解码，故传进来之前应该进行 base64转码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Sql 建表 SQL，DDL 模式 建 hive 表时，wedata 会对其进行 base64 解码，故传进来之前应该进行 base64转码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSql() {
        return this.Sql;
    }

    /**
     * Set 建表 SQL，DDL 模式 建 hive 表时，wedata 会对其进行 base64 解码，故传进来之前应该进行 base64转码
注意：此字段可能返回 null，表示取不到有效值。
     * @param Sql 建表 SQL，DDL 模式 建 hive 表时，wedata 会对其进行 base64 解码，故传进来之前应该进行 base64转码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSql(String Sql) {
        this.Sql = Sql;
    }

    /**
     * Get 表业务参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizParams 表业务参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BizParams getBizParams() {
        return this.BizParams;
    }

    /**
     * Set 表业务参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizParams 表业务参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizParams(BizParams BizParams) {
        this.BizParams = BizParams;
    }

    /**
     * Get 模式名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchemaName 模式名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set 模式名
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchemaName 模式名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    public TableHybrisReq() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableHybrisReq(TableHybrisReq source) {
        if (source.MsType != null) {
            this.MsType = new String(source.MsType);
        }
        if (source.DbName != null) {
            this.DbName = new String(source.DbName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new Float(source.DatasourceId);
        }
        if (source.OwnerAccount != null) {
            this.OwnerAccount = new Float(source.OwnerAccount);
        }
        if (source.Columns != null) {
            this.Columns = new Columns[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new Columns(source.Columns[i]);
            }
        }
        if (source.PartitionKeys != null) {
            this.PartitionKeys = new Columns[source.PartitionKeys.length];
            for (int i = 0; i < source.PartitionKeys.length; i++) {
                this.PartitionKeys[i] = new Columns(source.PartitionKeys[i]);
            }
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.NameCn != null) {
            this.NameCn = new String(source.NameCn);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.PartitionType != null) {
            this.PartitionType = new Long(source.PartitionType);
        }
        if (source.LifeTime != null) {
            this.LifeTime = new Long(source.LifeTime);
        }
        if (source.StorageFormat != null) {
            this.StorageFormat = new String(source.StorageFormat);
        }
        if (source.ColumnDelimiter != null) {
            this.ColumnDelimiter = new String(source.ColumnDelimiter);
        }
        if (source.ConnectionType != null) {
            this.ConnectionType = new String(source.ConnectionType);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.NameEn != null) {
            this.NameEn = new String(source.NameEn);
        }
        if (source.Sql != null) {
            this.Sql = new String(source.Sql);
        }
        if (source.BizParams != null) {
            this.BizParams = new BizParams(source.BizParams);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MsType", this.MsType);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "OwnerAccount", this.OwnerAccount);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);
        this.setParamArrayObj(map, prefix + "PartitionKeys.", this.PartitionKeys);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "NameCn", this.NameCn);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "PartitionType", this.PartitionType);
        this.setParamSimple(map, prefix + "LifeTime", this.LifeTime);
        this.setParamSimple(map, prefix + "StorageFormat", this.StorageFormat);
        this.setParamSimple(map, prefix + "ColumnDelimiter", this.ColumnDelimiter);
        this.setParamSimple(map, prefix + "ConnectionType", this.ConnectionType);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "NameEn", this.NameEn);
        this.setParamSimple(map, prefix + "Sql", this.Sql);
        this.setParamObj(map, prefix + "BizParams.", this.BizParams);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);

    }
}

