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

public class TableMeta extends AbstractModel {

    /**
    * 表的全局唯一ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 表名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 责任人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableOwnerName")
    @Expose
    private String TableOwnerName;

    /**
    * 数据源全局唯一ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private Long DatasourceId;

    /**
    * 所属集群名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 数据源名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceName")
    @Expose
    private String DatasourceName;

    /**
    * 数据库名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 表路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TablePath")
    @Expose
    private String TablePath;

    /**
    * 表中文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableNameCn")
    @Expose
    private String TableNameCn;

    /**
    * 元数据租户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetastoreId")
    @Expose
    private Long MetastoreId;

    /**
    * 技术类型，可用值:HIVE,MYSQL,KAFKA, HBASE
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetastoreType")
    @Expose
    private String MetastoreType;

    /**
    * 表描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 列分隔符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnSeparator")
    @Expose
    private String ColumnSeparator;

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
    * 表类型，如hive MANAGED_TABLE;EXTERNAL_TABLE
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
    * 最近数据变更时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 最近DDL变更时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DdlModifyTime")
    @Expose
    private String DdlModifyTime;

    /**
    * 数据最后访问时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastAccessTime")
    @Expose
    private String LastAccessTime;

    /**
    * 所属项目英文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 所属数据目录id（可能多个）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizCatalogIds")
    @Expose
    private String [] BizCatalogIds;

    /**
    * 所属数据目录（可能多个）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizCatalogNames")
    @Expose
    private String [] BizCatalogNames;

    /**
    * true已收藏/false表示未收藏状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasFavorite")
    @Expose
    private Boolean HasFavorite;

    /**
    * 生命周期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LifeCycleTime")
    @Expose
    private Long LifeCycleTime;

    /**
    * 存储量，已转为适合的单位展示
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageSizeWithUnit")
    @Expose
    private String StorageSizeWithUnit;

    /**
    * 数据源引擎的实例ID：如EMR集群实例ID/数据源实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据来源技术类型：HIVE/MYSQL/HBASE/KAFKA等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TechnologyType")
    @Expose
    private String TechnologyType;

    /**
    * 表英文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableNameEn")
    @Expose
    private String TableNameEn;

    /**
    * 项目Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * Kafka Topic 分区数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Partitions")
    @Expose
    private String Partitions;

    /**
    * Kafka Topic 副本数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReplicationFactor")
    @Expose
    private String ReplicationFactor;

    /**
    * 所属项目英中文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectDisplayName")
    @Expose
    private String ProjectDisplayName;

    /**
    * 数据最后修改时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataModifyTime")
    @Expose
    private String DataModifyTime;

    /**
    * 集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 当前用户是否有管理员权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasAdminAuthority")
    @Expose
    private Boolean HasAdminAuthority;

    /**
    * 数据源展示名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceDisplayName")
    @Expose
    private String DatasourceDisplayName;

    /**
    * 数据库ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

    /**
    * 租户下对表的收藏总次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FavoriteCount")
    @Expose
    private Long FavoriteCount;

    /**
    * 租户下对表的点赞总次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LikeCount")
    @Expose
    private Long LikeCount;

    /**
    * true已点赞/false表示未点赞状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasLike")
    @Expose
    private Boolean HasLike;

    /**
    * 表的资产评分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TablePropertyScore")
    @Expose
    private TablePropertyScore TablePropertyScore;

    /**
    * 表的热度值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableHeat")
    @Expose
    private TableHeat TableHeat;

    /**
    * 数据源ownerProjectId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerProjectId")
    @Expose
    private String OwnerProjectId;

    /**
    * 表负责人ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableOwnerId")
    @Expose
    private String TableOwnerId;

    /**
    * 系统源-CLUSTER, DB-自定义源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSourceCategory")
    @Expose
    private String DataSourceCategory;

    /**
    * 表字段信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Columns")
    @Expose
    private SearchColumnDocVO [] Columns;

    /**
    * 表采集类型
TABLE, VIEW, MANAGED_TABLE(Hive管理表), EXTERNAL_TABLE(Hive外部表), VIRTUAL_VIEW(虚拟视图), MATERIALIZED_VIEW(物化视图), LATERAL_VIEW, INDEX_TABLE(索引表), END_SELECT(查询结构), INSTANCE(中间临时表类型(数据血缘)), CDW(CDW表类型)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetaCrawlType")
    @Expose
    private String MetaCrawlType;

    /**
    * 是否视图
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsView")
    @Expose
    private Boolean IsView;

    /**
    * 存储位置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 判断是否是分区表1 是 0否
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsPartitionTable")
    @Expose
    private Long IsPartitionTable;

    /**
    * 分区字段 key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PartitionColumns")
    @Expose
    private String [] PartitionColumns;

    /**
    * 生命周期-分区保留天数【分区保留策略时有效】
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PartitionExpireDays")
    @Expose
    private Long PartitionExpireDays;

    /**
    * 表附属信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableProperties")
    @Expose
    private TableMetaProperty [] TableProperties;

    /**
    * 环境，取值 prod或者 dev
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
    * 数据库模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Schema")
    @Expose
    private String Schema;

    /**
    * 关联数据眼信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CollectDatasourceList")
    @Expose
    private GovDatasourceInfo [] CollectDatasourceList;

    /**
    * 采集任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CollectJobId")
    @Expose
    private String CollectJobId;

    /**
    * 采集任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CollectJobName")
    @Expose
    private String CollectJobName;

    /**
    * 数据源urn
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Urn")
    @Expose
    private String Urn;

    /**
    * 是否有修改业务权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasBizPermission")
    @Expose
    private Boolean HasBizPermission;

    /**
    * 引擎侧创建人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerByEngine")
    @Expose
    private String OwnerByEngine;

    /**
    * 用户无映射账户，请先完成账户映射后再来申请。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorTips")
    @Expose
    private String ErrorTips;

    /**
    * 是否支持select or ddl
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IfSupportCreateAndDDL")
    @Expose
    private CreateAndDDLSupport IfSupportCreateAndDDL;

    /**
    * 字段数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnCount")
    @Expose
    private Long ColumnCount;

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
     * Get 责任人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableOwnerName 责任人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableOwnerName() {
        return this.TableOwnerName;
    }

    /**
     * Set 责任人
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableOwnerName 责任人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableOwnerName(String TableOwnerName) {
        this.TableOwnerName = TableOwnerName;
    }

    /**
     * Get 数据源全局唯一ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceId 数据源全局唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源全局唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceId 数据源全局唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceId(Long DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 所属集群名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterName 所属集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 所属集群名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName 所属集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
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
     * Get 表路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TablePath 表路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTablePath() {
        return this.TablePath;
    }

    /**
     * Set 表路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param TablePath 表路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTablePath(String TablePath) {
        this.TablePath = TablePath;
    }

    /**
     * Get 表中文名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableNameCn 表中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableNameCn() {
        return this.TableNameCn;
    }

    /**
     * Set 表中文名
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableNameCn 表中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableNameCn(String TableNameCn) {
        this.TableNameCn = TableNameCn;
    }

    /**
     * Get 元数据租户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetastoreId 元数据租户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMetastoreId() {
        return this.MetastoreId;
    }

    /**
     * Set 元数据租户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetastoreId 元数据租户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetastoreId(Long MetastoreId) {
        this.MetastoreId = MetastoreId;
    }

    /**
     * Get 技术类型，可用值:HIVE,MYSQL,KAFKA, HBASE
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetastoreType 技术类型，可用值:HIVE,MYSQL,KAFKA, HBASE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetastoreType() {
        return this.MetastoreType;
    }

    /**
     * Set 技术类型，可用值:HIVE,MYSQL,KAFKA, HBASE
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetastoreType 技术类型，可用值:HIVE,MYSQL,KAFKA, HBASE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetastoreType(String MetastoreType) {
        this.MetastoreType = MetastoreType;
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
     * Get 列分隔符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnSeparator 列分隔符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getColumnSeparator() {
        return this.ColumnSeparator;
    }

    /**
     * Set 列分隔符
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnSeparator 列分隔符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnSeparator(String ColumnSeparator) {
        this.ColumnSeparator = ColumnSeparator;
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
     * Get 表类型，如hive MANAGED_TABLE;EXTERNAL_TABLE
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableType 表类型，如hive MANAGED_TABLE;EXTERNAL_TABLE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableType() {
        return this.TableType;
    }

    /**
     * Set 表类型，如hive MANAGED_TABLE;EXTERNAL_TABLE
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableType 表类型，如hive MANAGED_TABLE;EXTERNAL_TABLE
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
     * Get 最近数据变更时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 最近数据变更时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 最近数据变更时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 最近数据变更时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 最近DDL变更时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DdlModifyTime 最近DDL变更时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDdlModifyTime() {
        return this.DdlModifyTime;
    }

    /**
     * Set 最近DDL变更时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param DdlModifyTime 最近DDL变更时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDdlModifyTime(String DdlModifyTime) {
        this.DdlModifyTime = DdlModifyTime;
    }

    /**
     * Get 数据最后访问时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastAccessTime 数据最后访问时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastAccessTime() {
        return this.LastAccessTime;
    }

    /**
     * Set 数据最后访问时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastAccessTime 数据最后访问时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastAccessTime(String LastAccessTime) {
        this.LastAccessTime = LastAccessTime;
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
     * Get 所属数据目录id（可能多个）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizCatalogIds 所属数据目录id（可能多个）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBizCatalogIds() {
        return this.BizCatalogIds;
    }

    /**
     * Set 所属数据目录id（可能多个）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizCatalogIds 所属数据目录id（可能多个）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizCatalogIds(String [] BizCatalogIds) {
        this.BizCatalogIds = BizCatalogIds;
    }

    /**
     * Get 所属数据目录（可能多个）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizCatalogNames 所属数据目录（可能多个）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBizCatalogNames() {
        return this.BizCatalogNames;
    }

    /**
     * Set 所属数据目录（可能多个）
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizCatalogNames 所属数据目录（可能多个）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizCatalogNames(String [] BizCatalogNames) {
        this.BizCatalogNames = BizCatalogNames;
    }

    /**
     * Get true已收藏/false表示未收藏状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasFavorite true已收藏/false表示未收藏状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHasFavorite() {
        return this.HasFavorite;
    }

    /**
     * Set true已收藏/false表示未收藏状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasFavorite true已收藏/false表示未收藏状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasFavorite(Boolean HasFavorite) {
        this.HasFavorite = HasFavorite;
    }

    /**
     * Get 生命周期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LifeCycleTime 生命周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLifeCycleTime() {
        return this.LifeCycleTime;
    }

    /**
     * Set 生命周期
注意：此字段可能返回 null，表示取不到有效值。
     * @param LifeCycleTime 生命周期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLifeCycleTime(Long LifeCycleTime) {
        this.LifeCycleTime = LifeCycleTime;
    }

    /**
     * Get 存储量，已转为适合的单位展示
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageSizeWithUnit 存储量，已转为适合的单位展示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageSizeWithUnit() {
        return this.StorageSizeWithUnit;
    }

    /**
     * Set 存储量，已转为适合的单位展示
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageSizeWithUnit 存储量，已转为适合的单位展示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageSizeWithUnit(String StorageSizeWithUnit) {
        this.StorageSizeWithUnit = StorageSizeWithUnit;
    }

    /**
     * Get 数据源引擎的实例ID：如EMR集群实例ID/数据源实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 数据源引擎的实例ID：如EMR集群实例ID/数据源实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 数据源引擎的实例ID：如EMR集群实例ID/数据源实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 数据源引擎的实例ID：如EMR集群实例ID/数据源实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 数据来源技术类型：HIVE/MYSQL/HBASE/KAFKA等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TechnologyType 数据来源技术类型：HIVE/MYSQL/HBASE/KAFKA等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTechnologyType() {
        return this.TechnologyType;
    }

    /**
     * Set 数据来源技术类型：HIVE/MYSQL/HBASE/KAFKA等
注意：此字段可能返回 null，表示取不到有效值。
     * @param TechnologyType 数据来源技术类型：HIVE/MYSQL/HBASE/KAFKA等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTechnologyType(String TechnologyType) {
        this.TechnologyType = TechnologyType;
    }

    /**
     * Get 表英文名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableNameEn 表英文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableNameEn() {
        return this.TableNameEn;
    }

    /**
     * Set 表英文名
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableNameEn 表英文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableNameEn(String TableNameEn) {
        this.TableNameEn = TableNameEn;
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
     * Get Kafka Topic 分区数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Partitions Kafka Topic 分区数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPartitions() {
        return this.Partitions;
    }

    /**
     * Set Kafka Topic 分区数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Partitions Kafka Topic 分区数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitions(String Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get Kafka Topic 副本数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReplicationFactor Kafka Topic 副本数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReplicationFactor() {
        return this.ReplicationFactor;
    }

    /**
     * Set Kafka Topic 副本数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReplicationFactor Kafka Topic 副本数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplicationFactor(String ReplicationFactor) {
        this.ReplicationFactor = ReplicationFactor;
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
     * Get 数据最后修改时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataModifyTime 数据最后修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataModifyTime() {
        return this.DataModifyTime;
    }

    /**
     * Set 数据最后修改时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataModifyTime 数据最后修改时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataModifyTime(String DataModifyTime) {
        this.DataModifyTime = DataModifyTime;
    }

    /**
     * Get 集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 当前用户是否有管理员权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasAdminAuthority 当前用户是否有管理员权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHasAdminAuthority() {
        return this.HasAdminAuthority;
    }

    /**
     * Set 当前用户是否有管理员权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasAdminAuthority 当前用户是否有管理员权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasAdminAuthority(Boolean HasAdminAuthority) {
        this.HasAdminAuthority = HasAdminAuthority;
    }

    /**
     * Get 数据源展示名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceDisplayName 数据源展示名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceDisplayName() {
        return this.DatasourceDisplayName;
    }

    /**
     * Set 数据源展示名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceDisplayName 数据源展示名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceDisplayName(String DatasourceDisplayName) {
        this.DatasourceDisplayName = DatasourceDisplayName;
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
     * Get 租户下对表的收藏总次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FavoriteCount 租户下对表的收藏总次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFavoriteCount() {
        return this.FavoriteCount;
    }

    /**
     * Set 租户下对表的收藏总次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param FavoriteCount 租户下对表的收藏总次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFavoriteCount(Long FavoriteCount) {
        this.FavoriteCount = FavoriteCount;
    }

    /**
     * Get 租户下对表的点赞总次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LikeCount 租户下对表的点赞总次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLikeCount() {
        return this.LikeCount;
    }

    /**
     * Set 租户下对表的点赞总次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param LikeCount 租户下对表的点赞总次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLikeCount(Long LikeCount) {
        this.LikeCount = LikeCount;
    }

    /**
     * Get true已点赞/false表示未点赞状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasLike true已点赞/false表示未点赞状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHasLike() {
        return this.HasLike;
    }

    /**
     * Set true已点赞/false表示未点赞状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasLike true已点赞/false表示未点赞状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasLike(Boolean HasLike) {
        this.HasLike = HasLike;
    }

    /**
     * Get 表的资产评分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TablePropertyScore 表的资产评分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TablePropertyScore getTablePropertyScore() {
        return this.TablePropertyScore;
    }

    /**
     * Set 表的资产评分
注意：此字段可能返回 null，表示取不到有效值。
     * @param TablePropertyScore 表的资产评分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTablePropertyScore(TablePropertyScore TablePropertyScore) {
        this.TablePropertyScore = TablePropertyScore;
    }

    /**
     * Get 表的热度值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableHeat 表的热度值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TableHeat getTableHeat() {
        return this.TableHeat;
    }

    /**
     * Set 表的热度值
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableHeat 表的热度值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableHeat(TableHeat TableHeat) {
        this.TableHeat = TableHeat;
    }

    /**
     * Get 数据源ownerProjectId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerProjectId 数据源ownerProjectId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerProjectId() {
        return this.OwnerProjectId;
    }

    /**
     * Set 数据源ownerProjectId
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerProjectId 数据源ownerProjectId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerProjectId(String OwnerProjectId) {
        this.OwnerProjectId = OwnerProjectId;
    }

    /**
     * Get 表负责人ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableOwnerId 表负责人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableOwnerId() {
        return this.TableOwnerId;
    }

    /**
     * Set 表负责人ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableOwnerId 表负责人ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableOwnerId(String TableOwnerId) {
        this.TableOwnerId = TableOwnerId;
    }

    /**
     * Get 系统源-CLUSTER, DB-自定义源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSourceCategory 系统源-CLUSTER, DB-自定义源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSourceCategory() {
        return this.DataSourceCategory;
    }

    /**
     * Set 系统源-CLUSTER, DB-自定义源
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSourceCategory 系统源-CLUSTER, DB-自定义源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSourceCategory(String DataSourceCategory) {
        this.DataSourceCategory = DataSourceCategory;
    }

    /**
     * Get 表字段信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Columns 表字段信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SearchColumnDocVO [] getColumns() {
        return this.Columns;
    }

    /**
     * Set 表字段信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Columns 表字段信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumns(SearchColumnDocVO [] Columns) {
        this.Columns = Columns;
    }

    /**
     * Get 表采集类型
TABLE, VIEW, MANAGED_TABLE(Hive管理表), EXTERNAL_TABLE(Hive外部表), VIRTUAL_VIEW(虚拟视图), MATERIALIZED_VIEW(物化视图), LATERAL_VIEW, INDEX_TABLE(索引表), END_SELECT(查询结构), INSTANCE(中间临时表类型(数据血缘)), CDW(CDW表类型)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetaCrawlType 表采集类型
TABLE, VIEW, MANAGED_TABLE(Hive管理表), EXTERNAL_TABLE(Hive外部表), VIRTUAL_VIEW(虚拟视图), MATERIALIZED_VIEW(物化视图), LATERAL_VIEW, INDEX_TABLE(索引表), END_SELECT(查询结构), INSTANCE(中间临时表类型(数据血缘)), CDW(CDW表类型)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetaCrawlType() {
        return this.MetaCrawlType;
    }

    /**
     * Set 表采集类型
TABLE, VIEW, MANAGED_TABLE(Hive管理表), EXTERNAL_TABLE(Hive外部表), VIRTUAL_VIEW(虚拟视图), MATERIALIZED_VIEW(物化视图), LATERAL_VIEW, INDEX_TABLE(索引表), END_SELECT(查询结构), INSTANCE(中间临时表类型(数据血缘)), CDW(CDW表类型)
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetaCrawlType 表采集类型
TABLE, VIEW, MANAGED_TABLE(Hive管理表), EXTERNAL_TABLE(Hive外部表), VIRTUAL_VIEW(虚拟视图), MATERIALIZED_VIEW(物化视图), LATERAL_VIEW, INDEX_TABLE(索引表), END_SELECT(查询结构), INSTANCE(中间临时表类型(数据血缘)), CDW(CDW表类型)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetaCrawlType(String MetaCrawlType) {
        this.MetaCrawlType = MetaCrawlType;
    }

    /**
     * Get 是否视图
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsView 是否视图
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsView() {
        return this.IsView;
    }

    /**
     * Set 是否视图
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsView 是否视图
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsView(Boolean IsView) {
        this.IsView = IsView;
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

    /**
     * Get 判断是否是分区表1 是 0否
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsPartitionTable 判断是否是分区表1 是 0否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsPartitionTable() {
        return this.IsPartitionTable;
    }

    /**
     * Set 判断是否是分区表1 是 0否
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsPartitionTable 判断是否是分区表1 是 0否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsPartitionTable(Long IsPartitionTable) {
        this.IsPartitionTable = IsPartitionTable;
    }

    /**
     * Get 分区字段 key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PartitionColumns 分区字段 key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPartitionColumns() {
        return this.PartitionColumns;
    }

    /**
     * Set 分区字段 key
注意：此字段可能返回 null，表示取不到有效值。
     * @param PartitionColumns 分区字段 key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitionColumns(String [] PartitionColumns) {
        this.PartitionColumns = PartitionColumns;
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
     * Get 表附属信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableProperties 表附属信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TableMetaProperty [] getTableProperties() {
        return this.TableProperties;
    }

    /**
     * Set 表附属信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableProperties 表附属信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableProperties(TableMetaProperty [] TableProperties) {
        this.TableProperties = TableProperties;
    }

    /**
     * Get 环境，取值 prod或者 dev
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Environment 环境，取值 prod或者 dev
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnvironment() {
        return this.Environment;
    }

    /**
     * Set 环境，取值 prod或者 dev
注意：此字段可能返回 null，表示取不到有效值。
     * @param Environment 环境，取值 prod或者 dev
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }

    /**
     * Get 数据库模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Schema 数据库模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchema() {
        return this.Schema;
    }

    /**
     * Set 数据库模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param Schema 数据库模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchema(String Schema) {
        this.Schema = Schema;
    }

    /**
     * Get 关联数据眼信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CollectDatasourceList 关联数据眼信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GovDatasourceInfo [] getCollectDatasourceList() {
        return this.CollectDatasourceList;
    }

    /**
     * Set 关联数据眼信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CollectDatasourceList 关联数据眼信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCollectDatasourceList(GovDatasourceInfo [] CollectDatasourceList) {
        this.CollectDatasourceList = CollectDatasourceList;
    }

    /**
     * Get 采集任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CollectJobId 采集任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCollectJobId() {
        return this.CollectJobId;
    }

    /**
     * Set 采集任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CollectJobId 采集任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCollectJobId(String CollectJobId) {
        this.CollectJobId = CollectJobId;
    }

    /**
     * Get 采集任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CollectJobName 采集任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCollectJobName() {
        return this.CollectJobName;
    }

    /**
     * Set 采集任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CollectJobName 采集任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCollectJobName(String CollectJobName) {
        this.CollectJobName = CollectJobName;
    }

    /**
     * Get 数据源urn
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Urn 数据源urn
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrn() {
        return this.Urn;
    }

    /**
     * Set 数据源urn
注意：此字段可能返回 null，表示取不到有效值。
     * @param Urn 数据源urn
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrn(String Urn) {
        this.Urn = Urn;
    }

    /**
     * Get 是否有修改业务权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasBizPermission 是否有修改业务权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHasBizPermission() {
        return this.HasBizPermission;
    }

    /**
     * Set 是否有修改业务权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasBizPermission 是否有修改业务权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasBizPermission(Boolean HasBizPermission) {
        this.HasBizPermission = HasBizPermission;
    }

    /**
     * Get 引擎侧创建人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerByEngine 引擎侧创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerByEngine() {
        return this.OwnerByEngine;
    }

    /**
     * Set 引擎侧创建人
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerByEngine 引擎侧创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerByEngine(String OwnerByEngine) {
        this.OwnerByEngine = OwnerByEngine;
    }

    /**
     * Get 用户无映射账户，请先完成账户映射后再来申请。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorTips 用户无映射账户，请先完成账户映射后再来申请。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorTips() {
        return this.ErrorTips;
    }

    /**
     * Set 用户无映射账户，请先完成账户映射后再来申请。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorTips 用户无映射账户，请先完成账户映射后再来申请。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorTips(String ErrorTips) {
        this.ErrorTips = ErrorTips;
    }

    /**
     * Get 是否支持select or ddl
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IfSupportCreateAndDDL 是否支持select or ddl
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CreateAndDDLSupport getIfSupportCreateAndDDL() {
        return this.IfSupportCreateAndDDL;
    }

    /**
     * Set 是否支持select or ddl
注意：此字段可能返回 null，表示取不到有效值。
     * @param IfSupportCreateAndDDL 是否支持select or ddl
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIfSupportCreateAndDDL(CreateAndDDLSupport IfSupportCreateAndDDL) {
        this.IfSupportCreateAndDDL = IfSupportCreateAndDDL;
    }

    /**
     * Get 字段数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ColumnCount 字段数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getColumnCount() {
        return this.ColumnCount;
    }

    /**
     * Set 字段数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param ColumnCount 字段数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setColumnCount(Long ColumnCount) {
        this.ColumnCount = ColumnCount;
    }

    public TableMeta() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TableMeta(TableMeta source) {
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableOwnerName != null) {
            this.TableOwnerName = new String(source.TableOwnerName);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new Long(source.DatasourceId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.DatasourceName != null) {
            this.DatasourceName = new String(source.DatasourceName);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TablePath != null) {
            this.TablePath = new String(source.TablePath);
        }
        if (source.TableNameCn != null) {
            this.TableNameCn = new String(source.TableNameCn);
        }
        if (source.MetastoreId != null) {
            this.MetastoreId = new Long(source.MetastoreId);
        }
        if (source.MetastoreType != null) {
            this.MetastoreType = new String(source.MetastoreType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ColumnSeparator != null) {
            this.ColumnSeparator = new String(source.ColumnSeparator);
        }
        if (source.StorageFormat != null) {
            this.StorageFormat = new String(source.StorageFormat);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.TableType != null) {
            this.TableType = new String(source.TableType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.DdlModifyTime != null) {
            this.DdlModifyTime = new String(source.DdlModifyTime);
        }
        if (source.LastAccessTime != null) {
            this.LastAccessTime = new String(source.LastAccessTime);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.BizCatalogIds != null) {
            this.BizCatalogIds = new String[source.BizCatalogIds.length];
            for (int i = 0; i < source.BizCatalogIds.length; i++) {
                this.BizCatalogIds[i] = new String(source.BizCatalogIds[i]);
            }
        }
        if (source.BizCatalogNames != null) {
            this.BizCatalogNames = new String[source.BizCatalogNames.length];
            for (int i = 0; i < source.BizCatalogNames.length; i++) {
                this.BizCatalogNames[i] = new String(source.BizCatalogNames[i]);
            }
        }
        if (source.HasFavorite != null) {
            this.HasFavorite = new Boolean(source.HasFavorite);
        }
        if (source.LifeCycleTime != null) {
            this.LifeCycleTime = new Long(source.LifeCycleTime);
        }
        if (source.StorageSizeWithUnit != null) {
            this.StorageSizeWithUnit = new String(source.StorageSizeWithUnit);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TechnologyType != null) {
            this.TechnologyType = new String(source.TechnologyType);
        }
        if (source.TableNameEn != null) {
            this.TableNameEn = new String(source.TableNameEn);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Partitions != null) {
            this.Partitions = new String(source.Partitions);
        }
        if (source.ReplicationFactor != null) {
            this.ReplicationFactor = new String(source.ReplicationFactor);
        }
        if (source.ProjectDisplayName != null) {
            this.ProjectDisplayName = new String(source.ProjectDisplayName);
        }
        if (source.DataModifyTime != null) {
            this.DataModifyTime = new String(source.DataModifyTime);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.HasAdminAuthority != null) {
            this.HasAdminAuthority = new Boolean(source.HasAdminAuthority);
        }
        if (source.DatasourceDisplayName != null) {
            this.DatasourceDisplayName = new String(source.DatasourceDisplayName);
        }
        if (source.DatabaseId != null) {
            this.DatabaseId = new String(source.DatabaseId);
        }
        if (source.FavoriteCount != null) {
            this.FavoriteCount = new Long(source.FavoriteCount);
        }
        if (source.LikeCount != null) {
            this.LikeCount = new Long(source.LikeCount);
        }
        if (source.HasLike != null) {
            this.HasLike = new Boolean(source.HasLike);
        }
        if (source.TablePropertyScore != null) {
            this.TablePropertyScore = new TablePropertyScore(source.TablePropertyScore);
        }
        if (source.TableHeat != null) {
            this.TableHeat = new TableHeat(source.TableHeat);
        }
        if (source.OwnerProjectId != null) {
            this.OwnerProjectId = new String(source.OwnerProjectId);
        }
        if (source.TableOwnerId != null) {
            this.TableOwnerId = new String(source.TableOwnerId);
        }
        if (source.DataSourceCategory != null) {
            this.DataSourceCategory = new String(source.DataSourceCategory);
        }
        if (source.Columns != null) {
            this.Columns = new SearchColumnDocVO[source.Columns.length];
            for (int i = 0; i < source.Columns.length; i++) {
                this.Columns[i] = new SearchColumnDocVO(source.Columns[i]);
            }
        }
        if (source.MetaCrawlType != null) {
            this.MetaCrawlType = new String(source.MetaCrawlType);
        }
        if (source.IsView != null) {
            this.IsView = new Boolean(source.IsView);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
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
        if (source.PartitionExpireDays != null) {
            this.PartitionExpireDays = new Long(source.PartitionExpireDays);
        }
        if (source.TableProperties != null) {
            this.TableProperties = new TableMetaProperty[source.TableProperties.length];
            for (int i = 0; i < source.TableProperties.length; i++) {
                this.TableProperties[i] = new TableMetaProperty(source.TableProperties[i]);
            }
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
        if (source.Schema != null) {
            this.Schema = new String(source.Schema);
        }
        if (source.CollectDatasourceList != null) {
            this.CollectDatasourceList = new GovDatasourceInfo[source.CollectDatasourceList.length];
            for (int i = 0; i < source.CollectDatasourceList.length; i++) {
                this.CollectDatasourceList[i] = new GovDatasourceInfo(source.CollectDatasourceList[i]);
            }
        }
        if (source.CollectJobId != null) {
            this.CollectJobId = new String(source.CollectJobId);
        }
        if (source.CollectJobName != null) {
            this.CollectJobName = new String(source.CollectJobName);
        }
        if (source.Urn != null) {
            this.Urn = new String(source.Urn);
        }
        if (source.HasBizPermission != null) {
            this.HasBizPermission = new Boolean(source.HasBizPermission);
        }
        if (source.OwnerByEngine != null) {
            this.OwnerByEngine = new String(source.OwnerByEngine);
        }
        if (source.ErrorTips != null) {
            this.ErrorTips = new String(source.ErrorTips);
        }
        if (source.IfSupportCreateAndDDL != null) {
            this.IfSupportCreateAndDDL = new CreateAndDDLSupport(source.IfSupportCreateAndDDL);
        }
        if (source.ColumnCount != null) {
            this.ColumnCount = new Long(source.ColumnCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableOwnerName", this.TableOwnerName);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "DatasourceName", this.DatasourceName);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TablePath", this.TablePath);
        this.setParamSimple(map, prefix + "TableNameCn", this.TableNameCn);
        this.setParamSimple(map, prefix + "MetastoreId", this.MetastoreId);
        this.setParamSimple(map, prefix + "MetastoreType", this.MetastoreType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ColumnSeparator", this.ColumnSeparator);
        this.setParamSimple(map, prefix + "StorageFormat", this.StorageFormat);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "TableType", this.TableType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "DdlModifyTime", this.DdlModifyTime);
        this.setParamSimple(map, prefix + "LastAccessTime", this.LastAccessTime);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamArraySimple(map, prefix + "BizCatalogIds.", this.BizCatalogIds);
        this.setParamArraySimple(map, prefix + "BizCatalogNames.", this.BizCatalogNames);
        this.setParamSimple(map, prefix + "HasFavorite", this.HasFavorite);
        this.setParamSimple(map, prefix + "LifeCycleTime", this.LifeCycleTime);
        this.setParamSimple(map, prefix + "StorageSizeWithUnit", this.StorageSizeWithUnit);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TechnologyType", this.TechnologyType);
        this.setParamSimple(map, prefix + "TableNameEn", this.TableNameEn);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Partitions", this.Partitions);
        this.setParamSimple(map, prefix + "ReplicationFactor", this.ReplicationFactor);
        this.setParamSimple(map, prefix + "ProjectDisplayName", this.ProjectDisplayName);
        this.setParamSimple(map, prefix + "DataModifyTime", this.DataModifyTime);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "HasAdminAuthority", this.HasAdminAuthority);
        this.setParamSimple(map, prefix + "DatasourceDisplayName", this.DatasourceDisplayName);
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "FavoriteCount", this.FavoriteCount);
        this.setParamSimple(map, prefix + "LikeCount", this.LikeCount);
        this.setParamSimple(map, prefix + "HasLike", this.HasLike);
        this.setParamObj(map, prefix + "TablePropertyScore.", this.TablePropertyScore);
        this.setParamObj(map, prefix + "TableHeat.", this.TableHeat);
        this.setParamSimple(map, prefix + "OwnerProjectId", this.OwnerProjectId);
        this.setParamSimple(map, prefix + "TableOwnerId", this.TableOwnerId);
        this.setParamSimple(map, prefix + "DataSourceCategory", this.DataSourceCategory);
        this.setParamArrayObj(map, prefix + "Columns.", this.Columns);
        this.setParamSimple(map, prefix + "MetaCrawlType", this.MetaCrawlType);
        this.setParamSimple(map, prefix + "IsView", this.IsView);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "IsPartitionTable", this.IsPartitionTable);
        this.setParamArraySimple(map, prefix + "PartitionColumns.", this.PartitionColumns);
        this.setParamSimple(map, prefix + "PartitionExpireDays", this.PartitionExpireDays);
        this.setParamArrayObj(map, prefix + "TableProperties.", this.TableProperties);
        this.setParamSimple(map, prefix + "Environment", this.Environment);
        this.setParamSimple(map, prefix + "Schema", this.Schema);
        this.setParamArrayObj(map, prefix + "CollectDatasourceList.", this.CollectDatasourceList);
        this.setParamSimple(map, prefix + "CollectJobId", this.CollectJobId);
        this.setParamSimple(map, prefix + "CollectJobName", this.CollectJobName);
        this.setParamSimple(map, prefix + "Urn", this.Urn);
        this.setParamSimple(map, prefix + "HasBizPermission", this.HasBizPermission);
        this.setParamSimple(map, prefix + "OwnerByEngine", this.OwnerByEngine);
        this.setParamSimple(map, prefix + "ErrorTips", this.ErrorTips);
        this.setParamObj(map, prefix + "IfSupportCreateAndDDL.", this.IfSupportCreateAndDDL);
        this.setParamSimple(map, prefix + "ColumnCount", this.ColumnCount);

    }
}

