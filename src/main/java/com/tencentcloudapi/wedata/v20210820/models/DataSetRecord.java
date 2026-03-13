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

public class DataSetRecord extends AbstractModel {

    /**
    * 资产 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceName")
    @Expose
    private String DatasourceName;

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
    * 数据资产名称展示名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableNameCn")
    @Expose
    private String TableNameCn;

    /**
    * 数据资产名称展示名称EN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableNameEn")
    @Expose
    private String TableNameEn;

    /**
    * 资产描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 资产热度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeatValue")
    @Expose
    private Float HeatValue;

    /**
    * 标签列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelNames")
    @Expose
    private String [] LabelNames;

    /**
    * 负责人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InCharge")
    @Expose
    private String InCharge;

    /**
    * 元数据采集类型：Table View Index
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetaCrawlType")
    @Expose
    private String MetaCrawlType;

    /**
    * 数据资产归属的项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 生命周期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LifeTime")
    @Expose
    private Long LifeTime;

    /**
    * 判断是否是分区表1 是 0否
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsPartitionTable")
    @Expose
    private Long IsPartitionTable;

    /**
    * 表字段集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableRecordFieldSet")
    @Expose
    private SearchColumnDocVO [] TableRecordFieldSet;

    /**
    * 表属性评分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TablePropertyScore")
    @Expose
    private TablePropertyScore TablePropertyScore;

    /**
    * 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MsType")
    @Expose
    private String MsType;

    /**
    * 数据存储大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * 数据资产等级
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetLevel")
    @Expose
    private Long AssetLevel;

    /**
    * 数据资产状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetStatus")
    @Expose
    private Long AssetStatus;

    /**
    * 数据目录ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizCatalogIds")
    @Expose
    private String [] BizCatalogIds;

    /**
    * 数据目录名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BizCatalogNames")
    @Expose
    private String [] BizCatalogNames;

    /**
    * 数据源 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private Long DatasourceId;

    /**
    * 数据库 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 表 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 数据资产操作选项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperateOption")
    @Expose
    private DataAssetOption OperateOption;

    /**
    * 数据库模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Schema")
    @Expose
    private String Schema;

    /**
    * 环境，取值 prod或者 dev
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
    * 是否为视图
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsView")
    @Expose
    private Boolean IsView;

    /**
    * 数据来源技术类型
取值： HIVE/MYSQL/HBASE/KAFKA等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TechnologyType")
    @Expose
    private String TechnologyType;

    /**
    * 项目名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 项目展示名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectDisplayName")
    @Expose
    private String ProjectDisplayName;

    /**
    * 集群 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 存储大小，已转为如9.31TB:
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageSizeWithUnit")
    @Expose
    private String StorageSizeWithUnit;

    /**
    * 多数据源信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CollectDatasourceList")
    @Expose
    private GovDatasourceInfo [] CollectDatasourceList;

    /**
    * 集群名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 数据源Category: 系统源-CLUSTER, DB-自定义源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSourceCategory")
    @Expose
    private String DataSourceCategory;

    /**
    * 采集任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CollectId")
    @Expose
    private Long CollectId;

    /**
    * 采集唯一性urn
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Urn")
    @Expose
    private String Urn;

    /**
    * 数据资产名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * 资产运行状态： 任务运行状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetRunningStatus")
    @Expose
    private String AssetRunningStatus;

    /**
    * 任务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypeId")
    @Expose
    private Long TaskTypeId;

    /**
    * 资产运行时间， 任务最近执行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecuteTime")
    @Expose
    private String ExecuteTime;

    /**
    * 资产日志，任务资产取 自动转交日志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetLog")
    @Expose
    private String AssetLog;

    /**
    * 资产类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 任务 Job名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 资产失效时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 安全等级值范围1-10

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LevelRank")
    @Expose
    private Long LevelRank;

    /**
    * 安全等级名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LevelName")
    @Expose
    private String LevelName;

    /**
    * 资产编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetCode")
    @Expose
    private String AssetCode;

    /**
    * 责任人 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerAccount")
    @Expose
    private Long OwnerAccount;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 最近访问时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastAccessTime")
    @Expose
    private String LastAccessTime;

    /**
    * 引擎侧创建人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerByEngine")
    @Expose
    private String OwnerByEngine;

    /**
    * 数仓分层 UUID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataLayerUuid")
    @Expose
    private String DataLayerUuid;

    /**
    * 数仓分层名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataLayerName")
    @Expose
    private String DataLayerName;

    /**
    * 字段数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ColumnCount")
    @Expose
    private Long ColumnCount;

    /**
    * 关键字搜索命中的表字段列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SearchHitColumns")
    @Expose
    private SearchColumnDocVO [] SearchHitColumns;

    /**
    * 标签对象集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LabelTagList")
    @Expose
    private LabelTag [] LabelTagList;

    /**
    * 模型别名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Aliases")
    @Expose
    private RegisteredModelAlias [] Aliases;

    /**
    * 是否已经部署服务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDeployed")
    @Expose
    private Boolean IsDeployed;

    /**
    * 模型标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private RegisteredModelTag [] Tags;

    /**
    * 模型类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelType")
    @Expose
    private String ModelType;

    /**
    * 资产全称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * Catalog名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Catalog来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetaFrom")
    @Expose
    private String MetaFrom;

    /**
     * Get 资产 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetId 资产 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 资产 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetId 资产 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
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
     * Get 数据资产名称展示名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableNameCn 数据资产名称展示名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableNameCn() {
        return this.TableNameCn;
    }

    /**
     * Set 数据资产名称展示名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableNameCn 数据资产名称展示名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableNameCn(String TableNameCn) {
        this.TableNameCn = TableNameCn;
    }

    /**
     * Get 数据资产名称展示名称EN
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableNameEn 数据资产名称展示名称EN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableNameEn() {
        return this.TableNameEn;
    }

    /**
     * Set 数据资产名称展示名称EN
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableNameEn 数据资产名称展示名称EN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableNameEn(String TableNameEn) {
        this.TableNameEn = TableNameEn;
    }

    /**
     * Get 资产描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 资产描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 资产描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 资产描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 资产热度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeatValue 资产热度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getHeatValue() {
        return this.HeatValue;
    }

    /**
     * Set 资产热度
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeatValue 资产热度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeatValue(Float HeatValue) {
        this.HeatValue = HeatValue;
    }

    /**
     * Get 标签列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelNames 标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLabelNames() {
        return this.LabelNames;
    }

    /**
     * Set 标签列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelNames 标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelNames(String [] LabelNames) {
        this.LabelNames = LabelNames;
    }

    /**
     * Get 负责人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InCharge 负责人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInCharge() {
        return this.InCharge;
    }

    /**
     * Set 负责人
注意：此字段可能返回 null，表示取不到有效值。
     * @param InCharge 负责人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInCharge(String InCharge) {
        this.InCharge = InCharge;
    }

    /**
     * Get 元数据采集类型：Table View Index
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetaCrawlType 元数据采集类型：Table View Index
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetaCrawlType() {
        return this.MetaCrawlType;
    }

    /**
     * Set 元数据采集类型：Table View Index
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetaCrawlType 元数据采集类型：Table View Index
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetaCrawlType(String MetaCrawlType) {
        this.MetaCrawlType = MetaCrawlType;
    }

    /**
     * Get 数据资产归属的项目ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 数据资产归属的项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 数据资产归属的项目ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 数据资产归属的项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
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
     * Get 表字段集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableRecordFieldSet 表字段集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SearchColumnDocVO [] getTableRecordFieldSet() {
        return this.TableRecordFieldSet;
    }

    /**
     * Set 表字段集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableRecordFieldSet 表字段集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableRecordFieldSet(SearchColumnDocVO [] TableRecordFieldSet) {
        this.TableRecordFieldSet = TableRecordFieldSet;
    }

    /**
     * Get 表属性评分
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TablePropertyScore 表属性评分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TablePropertyScore getTablePropertyScore() {
        return this.TablePropertyScore;
    }

    /**
     * Set 表属性评分
注意：此字段可能返回 null，表示取不到有效值。
     * @param TablePropertyScore 表属性评分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTablePropertyScore(TablePropertyScore TablePropertyScore) {
        this.TablePropertyScore = TablePropertyScore;
    }

    /**
     * Get 数据源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MsType 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsType() {
        return this.MsType;
    }

    /**
     * Set 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param MsType 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsType(String MsType) {
        this.MsType = MsType;
    }

    /**
     * Get 数据存储大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageSize 数据存储大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set 数据存储大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageSize 数据存储大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get 数据资产等级
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetLevel 数据资产等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAssetLevel() {
        return this.AssetLevel;
    }

    /**
     * Set 数据资产等级
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetLevel 数据资产等级
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetLevel(Long AssetLevel) {
        this.AssetLevel = AssetLevel;
    }

    /**
     * Get 数据资产状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetStatus 数据资产状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAssetStatus() {
        return this.AssetStatus;
    }

    /**
     * Set 数据资产状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetStatus 数据资产状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetStatus(Long AssetStatus) {
        this.AssetStatus = AssetStatus;
    }

    /**
     * Get 数据目录ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizCatalogIds 数据目录ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBizCatalogIds() {
        return this.BizCatalogIds;
    }

    /**
     * Set 数据目录ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizCatalogIds 数据目录ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizCatalogIds(String [] BizCatalogIds) {
        this.BizCatalogIds = BizCatalogIds;
    }

    /**
     * Get 数据目录名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BizCatalogNames 数据目录名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBizCatalogNames() {
        return this.BizCatalogNames;
    }

    /**
     * Set 数据目录名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param BizCatalogNames 数据目录名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBizCatalogNames(String [] BizCatalogNames) {
        this.BizCatalogNames = BizCatalogNames;
    }

    /**
     * Get 数据源 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceId 数据源 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceId 数据源 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceId(Long DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 数据库 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseId 数据库 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set 数据库 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseId 数据库 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseId(String DatabaseId) {
        this.DatabaseId = DatabaseId;
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
     * Get 表 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableId 表 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 表 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableId 表 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 数据资产操作选项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperateOption 数据资产操作选项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataAssetOption getOperateOption() {
        return this.OperateOption;
    }

    /**
     * Set 数据资产操作选项
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperateOption 数据资产操作选项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperateOption(DataAssetOption OperateOption) {
        this.OperateOption = OperateOption;
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
     * Get 是否为视图
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsView 是否为视图
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsView() {
        return this.IsView;
    }

    /**
     * Set 是否为视图
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsView 是否为视图
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsView(Boolean IsView) {
        this.IsView = IsView;
    }

    /**
     * Get 数据来源技术类型
取值： HIVE/MYSQL/HBASE/KAFKA等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TechnologyType 数据来源技术类型
取值： HIVE/MYSQL/HBASE/KAFKA等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTechnologyType() {
        return this.TechnologyType;
    }

    /**
     * Set 数据来源技术类型
取值： HIVE/MYSQL/HBASE/KAFKA等
注意：此字段可能返回 null，表示取不到有效值。
     * @param TechnologyType 数据来源技术类型
取值： HIVE/MYSQL/HBASE/KAFKA等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTechnologyType(String TechnologyType) {
        this.TechnologyType = TechnologyType;
    }

    /**
     * Get 项目名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName 项目名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 项目展示名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectDisplayName 项目展示名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectDisplayName() {
        return this.ProjectDisplayName;
    }

    /**
     * Set 项目展示名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectDisplayName 项目展示名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectDisplayName(String ProjectDisplayName) {
        this.ProjectDisplayName = ProjectDisplayName;
    }

    /**
     * Get 集群 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 集群 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 集群 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 存储大小，已转为如9.31TB:
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageSizeWithUnit 存储大小，已转为如9.31TB:
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageSizeWithUnit() {
        return this.StorageSizeWithUnit;
    }

    /**
     * Set 存储大小，已转为如9.31TB:
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageSizeWithUnit 存储大小，已转为如9.31TB:
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageSizeWithUnit(String StorageSizeWithUnit) {
        this.StorageSizeWithUnit = StorageSizeWithUnit;
    }

    /**
     * Get 多数据源信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CollectDatasourceList 多数据源信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GovDatasourceInfo [] getCollectDatasourceList() {
        return this.CollectDatasourceList;
    }

    /**
     * Set 多数据源信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CollectDatasourceList 多数据源信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCollectDatasourceList(GovDatasourceInfo [] CollectDatasourceList) {
        this.CollectDatasourceList = CollectDatasourceList;
    }

    /**
     * Get 集群名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterName 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 数据源Category: 系统源-CLUSTER, DB-自定义源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSourceCategory 数据源Category: 系统源-CLUSTER, DB-自定义源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSourceCategory() {
        return this.DataSourceCategory;
    }

    /**
     * Set 数据源Category: 系统源-CLUSTER, DB-自定义源
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSourceCategory 数据源Category: 系统源-CLUSTER, DB-自定义源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSourceCategory(String DataSourceCategory) {
        this.DataSourceCategory = DataSourceCategory;
    }

    /**
     * Get 采集任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CollectId 采集任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCollectId() {
        return this.CollectId;
    }

    /**
     * Set 采集任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CollectId 采集任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCollectId(Long CollectId) {
        this.CollectId = CollectId;
    }

    /**
     * Get 采集唯一性urn
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Urn 采集唯一性urn
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUrn() {
        return this.Urn;
    }

    /**
     * Set 采集唯一性urn
注意：此字段可能返回 null，表示取不到有效值。
     * @param Urn 采集唯一性urn
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrn(String Urn) {
        this.Urn = Urn;
    }

    /**
     * Get 数据资产名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetName 数据资产名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set 数据资产名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetName 数据资产名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get 资产运行状态： 任务运行状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetRunningStatus 资产运行状态： 任务运行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetRunningStatus() {
        return this.AssetRunningStatus;
    }

    /**
     * Set 资产运行状态： 任务运行状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetRunningStatus 资产运行状态： 任务运行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetRunningStatus(String AssetRunningStatus) {
        this.AssetRunningStatus = AssetRunningStatus;
    }

    /**
     * Get 任务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypeId 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskTypeId() {
        return this.TaskTypeId;
    }

    /**
     * Set 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypeId 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypeId(Long TaskTypeId) {
        this.TaskTypeId = TaskTypeId;
    }

    /**
     * Get 资产运行时间， 任务最近执行时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecuteTime 资产运行时间， 任务最近执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecuteTime() {
        return this.ExecuteTime;
    }

    /**
     * Set 资产运行时间， 任务最近执行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecuteTime 资产运行时间， 任务最近执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecuteTime(String ExecuteTime) {
        this.ExecuteTime = ExecuteTime;
    }

    /**
     * Get 资产日志，任务资产取 自动转交日志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetLog 资产日志，任务资产取 自动转交日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetLog() {
        return this.AssetLog;
    }

    /**
     * Set 资产日志，任务资产取 自动转交日志
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetLog 资产日志，任务资产取 自动转交日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetLog(String AssetLog) {
        this.AssetLog = AssetLog;
    }

    /**
     * Get 资产类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetType 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetType 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 任务 Job名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobName 任务 Job名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set 任务 Job名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobName 任务 Job名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get 资产失效时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 资产失效时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 资产失效时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 资产失效时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 安全等级值范围1-10

注意：此字段可能返回 null，表示取不到有效值。 
     * @return LevelRank 安全等级值范围1-10

注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLevelRank() {
        return this.LevelRank;
    }

    /**
     * Set 安全等级值范围1-10

注意：此字段可能返回 null，表示取不到有效值。
     * @param LevelRank 安全等级值范围1-10

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevelRank(Long LevelRank) {
        this.LevelRank = LevelRank;
    }

    /**
     * Get 安全等级名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LevelName 安全等级名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLevelName() {
        return this.LevelName;
    }

    /**
     * Set 安全等级名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param LevelName 安全等级名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevelName(String LevelName) {
        this.LevelName = LevelName;
    }

    /**
     * Get 资产编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetCode 资产编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetCode() {
        return this.AssetCode;
    }

    /**
     * Set 资产编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetCode 资产编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetCode(String AssetCode) {
        this.AssetCode = AssetCode;
    }

    /**
     * Get 责任人 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerAccount 责任人 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOwnerAccount() {
        return this.OwnerAccount;
    }

    /**
     * Set 责任人 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerAccount 责任人 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerAccount(Long OwnerAccount) {
        this.OwnerAccount = OwnerAccount;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifyTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifyTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 最近访问时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastAccessTime 最近访问时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastAccessTime() {
        return this.LastAccessTime;
    }

    /**
     * Set 最近访问时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastAccessTime 最近访问时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastAccessTime(String LastAccessTime) {
        this.LastAccessTime = LastAccessTime;
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
     * Get 数仓分层 UUID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataLayerUuid 数仓分层 UUID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataLayerUuid() {
        return this.DataLayerUuid;
    }

    /**
     * Set 数仓分层 UUID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataLayerUuid 数仓分层 UUID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataLayerUuid(String DataLayerUuid) {
        this.DataLayerUuid = DataLayerUuid;
    }

    /**
     * Get 数仓分层名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataLayerName 数仓分层名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataLayerName() {
        return this.DataLayerName;
    }

    /**
     * Set 数仓分层名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataLayerName 数仓分层名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataLayerName(String DataLayerName) {
        this.DataLayerName = DataLayerName;
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

    /**
     * Get 关键字搜索命中的表字段列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SearchHitColumns 关键字搜索命中的表字段列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SearchColumnDocVO [] getSearchHitColumns() {
        return this.SearchHitColumns;
    }

    /**
     * Set 关键字搜索命中的表字段列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param SearchHitColumns 关键字搜索命中的表字段列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSearchHitColumns(SearchColumnDocVO [] SearchHitColumns) {
        this.SearchHitColumns = SearchHitColumns;
    }

    /**
     * Get 标签对象集合
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LabelTagList 标签对象集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LabelTag [] getLabelTagList() {
        return this.LabelTagList;
    }

    /**
     * Set 标签对象集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param LabelTagList 标签对象集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabelTagList(LabelTag [] LabelTagList) {
        this.LabelTagList = LabelTagList;
    }

    /**
     * Get 模型别名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Aliases 模型别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RegisteredModelAlias [] getAliases() {
        return this.Aliases;
    }

    /**
     * Set 模型别名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Aliases 模型别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAliases(RegisteredModelAlias [] Aliases) {
        this.Aliases = Aliases;
    }

    /**
     * Get 是否已经部署服务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDeployed 是否已经部署服务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsDeployed() {
        return this.IsDeployed;
    }

    /**
     * Set 是否已经部署服务
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDeployed 是否已经部署服务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDeployed(Boolean IsDeployed) {
        this.IsDeployed = IsDeployed;
    }

    /**
     * Get 模型标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 模型标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RegisteredModelTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 模型标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 模型标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(RegisteredModelTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 模型类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelType 模型类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelType() {
        return this.ModelType;
    }

    /**
     * Set 模型类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelType 模型类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelType(String ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * Get 资产全称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FullName 资产全称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set 资产全称
注意：此字段可能返回 null，表示取不到有效值。
     * @param FullName 资产全称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * Get Catalog名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace Catalog名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Catalog名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace Catalog名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Catalog来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetaFrom Catalog来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetaFrom() {
        return this.MetaFrom;
    }

    /**
     * Set Catalog来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetaFrom Catalog来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetaFrom(String MetaFrom) {
        this.MetaFrom = MetaFrom;
    }

    public DataSetRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataSetRecord(DataSetRecord source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.DatasourceName != null) {
            this.DatasourceName = new String(source.DatasourceName);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableNameCn != null) {
            this.TableNameCn = new String(source.TableNameCn);
        }
        if (source.TableNameEn != null) {
            this.TableNameEn = new String(source.TableNameEn);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.HeatValue != null) {
            this.HeatValue = new Float(source.HeatValue);
        }
        if (source.LabelNames != null) {
            this.LabelNames = new String[source.LabelNames.length];
            for (int i = 0; i < source.LabelNames.length; i++) {
                this.LabelNames[i] = new String(source.LabelNames[i]);
            }
        }
        if (source.InCharge != null) {
            this.InCharge = new String(source.InCharge);
        }
        if (source.MetaCrawlType != null) {
            this.MetaCrawlType = new String(source.MetaCrawlType);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.LifeTime != null) {
            this.LifeTime = new Long(source.LifeTime);
        }
        if (source.IsPartitionTable != null) {
            this.IsPartitionTable = new Long(source.IsPartitionTable);
        }
        if (source.TableRecordFieldSet != null) {
            this.TableRecordFieldSet = new SearchColumnDocVO[source.TableRecordFieldSet.length];
            for (int i = 0; i < source.TableRecordFieldSet.length; i++) {
                this.TableRecordFieldSet[i] = new SearchColumnDocVO(source.TableRecordFieldSet[i]);
            }
        }
        if (source.TablePropertyScore != null) {
            this.TablePropertyScore = new TablePropertyScore(source.TablePropertyScore);
        }
        if (source.MsType != null) {
            this.MsType = new String(source.MsType);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.AssetLevel != null) {
            this.AssetLevel = new Long(source.AssetLevel);
        }
        if (source.AssetStatus != null) {
            this.AssetStatus = new Long(source.AssetStatus);
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
        if (source.DatasourceId != null) {
            this.DatasourceId = new Long(source.DatasourceId);
        }
        if (source.DatabaseId != null) {
            this.DatabaseId = new String(source.DatabaseId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.OperateOption != null) {
            this.OperateOption = new DataAssetOption(source.OperateOption);
        }
        if (source.Schema != null) {
            this.Schema = new String(source.Schema);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
        if (source.IsView != null) {
            this.IsView = new Boolean(source.IsView);
        }
        if (source.TechnologyType != null) {
            this.TechnologyType = new String(source.TechnologyType);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.ProjectDisplayName != null) {
            this.ProjectDisplayName = new String(source.ProjectDisplayName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.StorageSizeWithUnit != null) {
            this.StorageSizeWithUnit = new String(source.StorageSizeWithUnit);
        }
        if (source.CollectDatasourceList != null) {
            this.CollectDatasourceList = new GovDatasourceInfo[source.CollectDatasourceList.length];
            for (int i = 0; i < source.CollectDatasourceList.length; i++) {
                this.CollectDatasourceList[i] = new GovDatasourceInfo(source.CollectDatasourceList[i]);
            }
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.DataSourceCategory != null) {
            this.DataSourceCategory = new String(source.DataSourceCategory);
        }
        if (source.CollectId != null) {
            this.CollectId = new Long(source.CollectId);
        }
        if (source.Urn != null) {
            this.Urn = new String(source.Urn);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.AssetRunningStatus != null) {
            this.AssetRunningStatus = new String(source.AssetRunningStatus);
        }
        if (source.TaskTypeId != null) {
            this.TaskTypeId = new Long(source.TaskTypeId);
        }
        if (source.ExecuteTime != null) {
            this.ExecuteTime = new String(source.ExecuteTime);
        }
        if (source.AssetLog != null) {
            this.AssetLog = new String(source.AssetLog);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.LevelRank != null) {
            this.LevelRank = new Long(source.LevelRank);
        }
        if (source.LevelName != null) {
            this.LevelName = new String(source.LevelName);
        }
        if (source.AssetCode != null) {
            this.AssetCode = new String(source.AssetCode);
        }
        if (source.OwnerAccount != null) {
            this.OwnerAccount = new Long(source.OwnerAccount);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.LastAccessTime != null) {
            this.LastAccessTime = new String(source.LastAccessTime);
        }
        if (source.OwnerByEngine != null) {
            this.OwnerByEngine = new String(source.OwnerByEngine);
        }
        if (source.DataLayerUuid != null) {
            this.DataLayerUuid = new String(source.DataLayerUuid);
        }
        if (source.DataLayerName != null) {
            this.DataLayerName = new String(source.DataLayerName);
        }
        if (source.ColumnCount != null) {
            this.ColumnCount = new Long(source.ColumnCount);
        }
        if (source.SearchHitColumns != null) {
            this.SearchHitColumns = new SearchColumnDocVO[source.SearchHitColumns.length];
            for (int i = 0; i < source.SearchHitColumns.length; i++) {
                this.SearchHitColumns[i] = new SearchColumnDocVO(source.SearchHitColumns[i]);
            }
        }
        if (source.LabelTagList != null) {
            this.LabelTagList = new LabelTag[source.LabelTagList.length];
            for (int i = 0; i < source.LabelTagList.length; i++) {
                this.LabelTagList[i] = new LabelTag(source.LabelTagList[i]);
            }
        }
        if (source.Aliases != null) {
            this.Aliases = new RegisteredModelAlias[source.Aliases.length];
            for (int i = 0; i < source.Aliases.length; i++) {
                this.Aliases[i] = new RegisteredModelAlias(source.Aliases[i]);
            }
        }
        if (source.IsDeployed != null) {
            this.IsDeployed = new Boolean(source.IsDeployed);
        }
        if (source.Tags != null) {
            this.Tags = new RegisteredModelTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new RegisteredModelTag(source.Tags[i]);
            }
        }
        if (source.ModelType != null) {
            this.ModelType = new String(source.ModelType);
        }
        if (source.FullName != null) {
            this.FullName = new String(source.FullName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.MetaFrom != null) {
            this.MetaFrom = new String(source.MetaFrom);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "DatasourceName", this.DatasourceName);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableNameCn", this.TableNameCn);
        this.setParamSimple(map, prefix + "TableNameEn", this.TableNameEn);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "HeatValue", this.HeatValue);
        this.setParamArraySimple(map, prefix + "LabelNames.", this.LabelNames);
        this.setParamSimple(map, prefix + "InCharge", this.InCharge);
        this.setParamSimple(map, prefix + "MetaCrawlType", this.MetaCrawlType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "LifeTime", this.LifeTime);
        this.setParamSimple(map, prefix + "IsPartitionTable", this.IsPartitionTable);
        this.setParamArrayObj(map, prefix + "TableRecordFieldSet.", this.TableRecordFieldSet);
        this.setParamObj(map, prefix + "TablePropertyScore.", this.TablePropertyScore);
        this.setParamSimple(map, prefix + "MsType", this.MsType);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "AssetLevel", this.AssetLevel);
        this.setParamSimple(map, prefix + "AssetStatus", this.AssetStatus);
        this.setParamArraySimple(map, prefix + "BizCatalogIds.", this.BizCatalogIds);
        this.setParamArraySimple(map, prefix + "BizCatalogNames.", this.BizCatalogNames);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamObj(map, prefix + "OperateOption.", this.OperateOption);
        this.setParamSimple(map, prefix + "Schema", this.Schema);
        this.setParamSimple(map, prefix + "Environment", this.Environment);
        this.setParamSimple(map, prefix + "IsView", this.IsView);
        this.setParamSimple(map, prefix + "TechnologyType", this.TechnologyType);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "ProjectDisplayName", this.ProjectDisplayName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "StorageSizeWithUnit", this.StorageSizeWithUnit);
        this.setParamArrayObj(map, prefix + "CollectDatasourceList.", this.CollectDatasourceList);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "DataSourceCategory", this.DataSourceCategory);
        this.setParamSimple(map, prefix + "CollectId", this.CollectId);
        this.setParamSimple(map, prefix + "Urn", this.Urn);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "AssetRunningStatus", this.AssetRunningStatus);
        this.setParamSimple(map, prefix + "TaskTypeId", this.TaskTypeId);
        this.setParamSimple(map, prefix + "ExecuteTime", this.ExecuteTime);
        this.setParamSimple(map, prefix + "AssetLog", this.AssetLog);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "LevelRank", this.LevelRank);
        this.setParamSimple(map, prefix + "LevelName", this.LevelName);
        this.setParamSimple(map, prefix + "AssetCode", this.AssetCode);
        this.setParamSimple(map, prefix + "OwnerAccount", this.OwnerAccount);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "LastAccessTime", this.LastAccessTime);
        this.setParamSimple(map, prefix + "OwnerByEngine", this.OwnerByEngine);
        this.setParamSimple(map, prefix + "DataLayerUuid", this.DataLayerUuid);
        this.setParamSimple(map, prefix + "DataLayerName", this.DataLayerName);
        this.setParamSimple(map, prefix + "ColumnCount", this.ColumnCount);
        this.setParamArrayObj(map, prefix + "SearchHitColumns.", this.SearchHitColumns);
        this.setParamArrayObj(map, prefix + "LabelTagList.", this.LabelTagList);
        this.setParamArrayObj(map, prefix + "Aliases.", this.Aliases);
        this.setParamSimple(map, prefix + "IsDeployed", this.IsDeployed);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ModelType", this.ModelType);
        this.setParamSimple(map, prefix + "FullName", this.FullName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "MetaFrom", this.MetaFrom);

    }
}

