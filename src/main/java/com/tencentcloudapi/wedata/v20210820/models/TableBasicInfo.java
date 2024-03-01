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

public class TableBasicInfo extends AbstractModel {

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
    * 引擎/存储类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * 表类型，视图，外部表等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableType")
    @Expose
    private String TableType;

    /**
    * 项目Id
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
    * 所属项目英中文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectDisplayName")
    @Expose
    private String ProjectDisplayName;

    /**
    * 责任人ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableOwnerId")
    @Expose
    private String TableOwnerId;

    /**
    * 责任人名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableOwnerName")
    @Expose
    private String TableOwnerName;

    /**
    * 存储位置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageLocation")
    @Expose
    private Long StorageLocation;

    /**
    * 表描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 是否分区表，0-全量表 1-分区表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsPartitionTable")
    @Expose
    private Long IsPartitionTable;

    /**
    * 分区字段list
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PartitionColumns")
    @Expose
    private String [] PartitionColumns;

    /**
    * 存储格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageFormat")
    @Expose
    private String StorageFormat;

    /**
    * 存储量，字节数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * 存储量，单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageSizeWithUnit")
    @Expose
    private String StorageSizeWithUnit;

    /**
    * 累计存储【MB】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalSizeMb")
    @Expose
    private Long TotalSizeMb;

    /**
    * 副本数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplicaCount")
    @Expose
    private Long ReplicaCount;

    /**
    * 文件数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileCount")
    @Expose
    private Long FileCount;

    /**
    * 分区总数（包含hive，iceberg）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PartitionCount")
    @Expose
    private Long PartitionCount;

    /**
    * 分区字段数量（包含hive，iceberg）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PartitionFieldCount")
    @Expose
    private Long PartitionFieldCount;

    /**
    * 生命周期-分区保留天数【分区保留策略时有效】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PartitionExpireDays")
    @Expose
    private Long PartitionExpireDays;

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
    * 存储位置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Location")
    @Expose
    private String Location;

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
     * Get 引擎/存储类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineType 引擎/存储类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set 引擎/存储类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineType 引擎/存储类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get 表类型，视图，外部表等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableType 表类型，视图，外部表等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set 表类型，视图，外部表等
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableType 表类型，视图，外部表等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableType(String TableType) {
        this.TableType = TableType;
    }

    /**
     * Get 项目Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目Id
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
     * Get 所属项目英中文名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectDisplayName 所属项目英中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectDisplayName() {
        return this.ProjectDisplayName;
    }

    /**
     * Set 所属项目英中文名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectDisplayName 所属项目英中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectDisplayName(String ProjectDisplayName) {
        this.ProjectDisplayName = ProjectDisplayName;
    }

    /**
     * Get 责任人ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableOwnerId 责任人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableOwnerId() {
        return this.TableOwnerId;
    }

    /**
     * Set 责任人ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableOwnerId 责任人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableOwnerId(String TableOwnerId) {
        this.TableOwnerId = TableOwnerId;
    }

    /**
     * Get 责任人名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableOwnerName 责任人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableOwnerName() {
        return this.TableOwnerName;
    }

    /**
     * Set 责任人名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableOwnerName 责任人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableOwnerName(String TableOwnerName) {
        this.TableOwnerName = TableOwnerName;
    }

    /**
     * Get 存储位置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageLocation 存储位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStorageLocation() {
        return this.StorageLocation;
    }

    /**
     * Set 存储位置
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageLocation 存储位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageLocation(Long StorageLocation) {
        this.StorageLocation = StorageLocation;
    }

    /**
     * Get 表描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 表描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 表描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 表描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 是否分区表，0-全量表 1-分区表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsPartitionTable 是否分区表，0-全量表 1-分区表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsPartitionTable() {
        return this.IsPartitionTable;
    }

    /**
     * Set 是否分区表，0-全量表 1-分区表
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsPartitionTable 是否分区表，0-全量表 1-分区表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsPartitionTable(Long IsPartitionTable) {
        this.IsPartitionTable = IsPartitionTable;
    }

    /**
     * Get 分区字段list
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PartitionColumns 分区字段list
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPartitionColumns() {
        return this.PartitionColumns;
    }

    /**
     * Set 分区字段list
注意：此字段可能返回 null，表示取不到有效值。
     * @param PartitionColumns 分区字段list
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitionColumns(String [] PartitionColumns) {
        this.PartitionColumns = PartitionColumns;
    }

    /**
     * Get 存储格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageFormat 存储格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageFormat() {
        return this.StorageFormat;
    }

    /**
     * Set 存储格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageFormat 存储格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageFormat(String StorageFormat) {
        this.StorageFormat = StorageFormat;
    }

    /**
     * Get 存储量，字节数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageSize 存储量，字节数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set 存储量，字节数
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageSize 存储量，字节数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get 存储量，单位
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageSizeWithUnit 存储量，单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageSizeWithUnit() {
        return this.StorageSizeWithUnit;
    }

    /**
     * Set 存储量，单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageSizeWithUnit 存储量，单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageSizeWithUnit(String StorageSizeWithUnit) {
        this.StorageSizeWithUnit = StorageSizeWithUnit;
    }

    /**
     * Get 累计存储【MB】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalSizeMb 累计存储【MB】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalSizeMb() {
        return this.TotalSizeMb;
    }

    /**
     * Set 累计存储【MB】
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalSizeMb 累计存储【MB】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalSizeMb(Long TotalSizeMb) {
        this.TotalSizeMb = TotalSizeMb;
    }

    /**
     * Get 副本数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplicaCount 副本数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReplicaCount() {
        return this.ReplicaCount;
    }

    /**
     * Set 副本数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplicaCount 副本数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplicaCount(Long ReplicaCount) {
        this.ReplicaCount = ReplicaCount;
    }

    /**
     * Get 文件数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileCount 文件数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileCount() {
        return this.FileCount;
    }

    /**
     * Set 文件数
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileCount 文件数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileCount(Long FileCount) {
        this.FileCount = FileCount;
    }

    /**
     * Get 分区总数（包含hive，iceberg）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PartitionCount 分区总数（包含hive，iceberg）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPartitionCount() {
        return this.PartitionCount;
    }

    /**
     * Set 分区总数（包含hive，iceberg）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PartitionCount 分区总数（包含hive，iceberg）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitionCount(Long PartitionCount) {
        this.PartitionCount = PartitionCount;
    }

    /**
     * Get 分区字段数量（包含hive，iceberg）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PartitionFieldCount 分区字段数量（包含hive，iceberg）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPartitionFieldCount() {
        return this.PartitionFieldCount;
    }

    /**
     * Set 分区字段数量（包含hive，iceberg）
注意：此字段可能返回 null，表示取不到有效值。
     * @param PartitionFieldCount 分区字段数量（包含hive，iceberg）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitionFieldCount(Long PartitionFieldCount) {
        this.PartitionFieldCount = PartitionFieldCount;
    }

    /**
     * Get 生命周期-分区保留天数【分区保留策略时有效】
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PartitionExpireDays 生命周期-分区保留天数【分区保留策略时有效】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPartitionExpireDays() {
        return this.PartitionExpireDays;
    }

    /**
     * Set 生命周期-分区保留天数【分区保留策略时有效】
注意：此字段可能返回 null，表示取不到有效值。
     * @param PartitionExpireDays 生命周期-分区保留天数【分区保留策略时有效】
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitionExpireDays(Long PartitionExpireDays) {
        this.PartitionExpireDays = PartitionExpireDays;
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
     * Get 存储位置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Location 存储位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 存储位置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Location 存储位置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    public TableBasicInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableBasicInfo(TableBasicInfo source) {
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
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.TableType != null) {
            this.TableType = new String(source.TableType);
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
        if (source.TableOwnerId != null) {
            this.TableOwnerId = new String(source.TableOwnerId);
        }
        if (source.TableOwnerName != null) {
            this.TableOwnerName = new String(source.TableOwnerName);
        }
        if (source.StorageLocation != null) {
            this.StorageLocation = new Long(source.StorageLocation);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IsPartitionTable != null) {
            this.IsPartitionTable = new Long(source.IsPartitionTable);
        }
        if (source.PartitionColumns != null) {
            this.PartitionColumns = new String[source.PartitionColumns.length];
            for (int i = 0; i < source.PartitionColumns.length; i++) {
                this.PartitionColumns[i] = new String(source.PartitionColumns[i]);
            }
        }
        if (source.StorageFormat != null) {
            this.StorageFormat = new String(source.StorageFormat);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.StorageSizeWithUnit != null) {
            this.StorageSizeWithUnit = new String(source.StorageSizeWithUnit);
        }
        if (source.TotalSizeMb != null) {
            this.TotalSizeMb = new Long(source.TotalSizeMb);
        }
        if (source.ReplicaCount != null) {
            this.ReplicaCount = new Long(source.ReplicaCount);
        }
        if (source.FileCount != null) {
            this.FileCount = new Long(source.FileCount);
        }
        if (source.PartitionCount != null) {
            this.PartitionCount = new Long(source.PartitionCount);
        }
        if (source.PartitionFieldCount != null) {
            this.PartitionFieldCount = new Long(source.PartitionFieldCount);
        }
        if (source.PartitionExpireDays != null) {
            this.PartitionExpireDays = new Long(source.PartitionExpireDays);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
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
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamSimple(map, prefix + "TableType", this.TableType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "ProjectDisplayName", this.ProjectDisplayName);
        this.setParamSimple(map, prefix + "TableOwnerId", this.TableOwnerId);
        this.setParamSimple(map, prefix + "TableOwnerName", this.TableOwnerName);
        this.setParamSimple(map, prefix + "StorageLocation", this.StorageLocation);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IsPartitionTable", this.IsPartitionTable);
        this.setParamArraySimple(map, prefix + "PartitionColumns.", this.PartitionColumns);
        this.setParamSimple(map, prefix + "StorageFormat", this.StorageFormat);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "StorageSizeWithUnit", this.StorageSizeWithUnit);
        this.setParamSimple(map, prefix + "TotalSizeMb", this.TotalSizeMb);
        this.setParamSimple(map, prefix + "ReplicaCount", this.ReplicaCount);
        this.setParamSimple(map, prefix + "FileCount", this.FileCount);
        this.setParamSimple(map, prefix + "PartitionCount", this.PartitionCount);
        this.setParamSimple(map, prefix + "PartitionFieldCount", this.PartitionFieldCount);
        this.setParamSimple(map, prefix + "PartitionExpireDays", this.PartitionExpireDays);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Location", this.Location);

    }
}

