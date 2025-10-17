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

public class DatabaseMeta extends AbstractModel {

    /**
    * 项目Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 技术类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetastoreType")
    @Expose
    private String MetastoreType;

    /**
    * 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceName")
    @Expose
    private String DatasourceName;

    /**
    * 数据源Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private Long DatasourceId;

    /**
    * 项目英文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 数据源类别：绑定引擎、绑定数据库,可用值:DB,ENGINE
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 数据源描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 数据源引擎的实例ID，如CDB实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Instance")
    @Expose
    private String Instance;

    /**
    * 数据源引擎所属区域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 数据源数据源的可见性，1为可见、0为不可见。默认为1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * db名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 项目中文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectDisplayName")
    @Expose
    private String ProjectDisplayName;

    /**
    * 责任人名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerAccountName")
    @Expose
    private String OwnerAccountName;

    /**
    * 数据来源展示名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 数据库ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

    /**
    * 数据来源类型：hive/mysql/hbase等
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * 存储量大小,单位为 byte
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageSize")
    @Expose
    private Long StorageSize;

    /**
    * 格式化后的存储量大小，带单位，如 12B
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageSizeWithUnit")
    @Expose
    private String StorageSizeWithUnit;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 总表数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableCount")
    @Expose
    private Long TableCount;

    /**
    * 数据源信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceList")
    @Expose
    private GovDatasourceInfo [] DatasourceList;

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
    * 引擎id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 引擎名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 库下表的最新更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModifiedTimeByTables")
    @Expose
    private Long ModifiedTimeByTables;

    /**
    * 库下表的最新访问时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastAccessTimeByTables")
    @Expose
    private Long LastAccessTimeByTables;

    /**
    * 库guid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseGuid")
    @Expose
    private String DatabaseGuid;

    /**
    * 环境，取值 prod或者 dev
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Environment")
    @Expose
    private String Environment;

    /**
    * Owner的账户信息：账号信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerAccount")
    @Expose
    private Long OwnerAccount;

    /**
    * 操作权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OperateOption")
    @Expose
    private OperateOption OperateOption;

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
     * Get 技术类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetastoreType 技术类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMetastoreType() {
        return this.MetastoreType;
    }

    /**
     * Set 技术类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetastoreType 技术类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetastoreType(String MetastoreType) {
        this.MetastoreType = MetastoreType;
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
     * Get 数据源Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceId 数据源Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceId 数据源Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceId(Long DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get 项目英文名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectName 项目英文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目英文名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectName 项目英文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 数据源类别：绑定引擎、绑定数据库,可用值:DB,ENGINE
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Category 数据源类别：绑定引擎、绑定数据库,可用值:DB,ENGINE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 数据源类别：绑定引擎、绑定数据库,可用值:DB,ENGINE
注意：此字段可能返回 null，表示取不到有效值。
     * @param Category 数据源类别：绑定引擎、绑定数据库,可用值:DB,ENGINE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 数据源描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 数据源描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 数据源描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 数据源描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 数据源引擎的实例ID，如CDB实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Instance 数据源引擎的实例ID，如CDB实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstance() {
        return this.Instance;
    }

    /**
     * Set 数据源引擎的实例ID，如CDB实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Instance 数据源引擎的实例ID，如CDB实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstance(String Instance) {
        this.Instance = Instance;
    }

    /**
     * Get 数据源引擎所属区域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 数据源引擎所属区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 数据源引擎所属区域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 数据源引擎所属区域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 数据源数据源的可见性，1为可见、0为不可见。默认为1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 数据源数据源的可见性，1为可见、0为不可见。默认为1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 数据源数据源的可见性，1为可见、0为不可见。默认为1
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 数据源数据源的可见性，1为可见、0为不可见。默认为1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get db名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseName db名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set db名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseName db名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 项目中文名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectDisplayName 项目中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectDisplayName() {
        return this.ProjectDisplayName;
    }

    /**
     * Set 项目中文名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectDisplayName 项目中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectDisplayName(String ProjectDisplayName) {
        this.ProjectDisplayName = ProjectDisplayName;
    }

    /**
     * Get 责任人名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerAccountName 责任人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerAccountName() {
        return this.OwnerAccountName;
    }

    /**
     * Set 责任人名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerAccountName 责任人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerAccountName(String OwnerAccountName) {
        this.OwnerAccountName = OwnerAccountName;
    }

    /**
     * Get 数据来源展示名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisplayName 数据来源展示名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 数据来源展示名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisplayName 数据来源展示名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
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
     * Get 数据来源类型：hive/mysql/hbase等
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Catalog 数据来源类型：hive/mysql/hbase等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set 数据来源类型：hive/mysql/hbase等
注意：此字段可能返回 null，表示取不到有效值。
     * @param Catalog 数据来源类型：hive/mysql/hbase等
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get 存储量大小,单位为 byte
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageSize 存储量大小,单位为 byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStorageSize() {
        return this.StorageSize;
    }

    /**
     * Set 存储量大小,单位为 byte
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageSize 存储量大小,单位为 byte
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageSize(Long StorageSize) {
        this.StorageSize = StorageSize;
    }

    /**
     * Get 格式化后的存储量大小，带单位，如 12B
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageSizeWithUnit 格式化后的存储量大小，带单位，如 12B
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageSizeWithUnit() {
        return this.StorageSizeWithUnit;
    }

    /**
     * Set 格式化后的存储量大小，带单位，如 12B
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageSizeWithUnit 格式化后的存储量大小，带单位，如 12B
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageSizeWithUnit(String StorageSizeWithUnit) {
        this.StorageSizeWithUnit = StorageSizeWithUnit;
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
     * Get 总表数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableCount 总表数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTableCount() {
        return this.TableCount;
    }

    /**
     * Set 总表数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableCount 总表数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableCount(Long TableCount) {
        this.TableCount = TableCount;
    }

    /**
     * Get 数据源信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceList 数据源信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GovDatasourceInfo [] getDatasourceList() {
        return this.DatasourceList;
    }

    /**
     * Set 数据源信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceList 数据源信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceList(GovDatasourceInfo [] DatasourceList) {
        this.DatasourceList = DatasourceList;
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
     * Get 引擎id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterId 引擎id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 引擎id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 引擎id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 引擎名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterName 引擎名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 引擎名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName 引擎名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 库下表的最新更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModifiedTimeByTables 库下表的最新更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getModifiedTimeByTables() {
        return this.ModifiedTimeByTables;
    }

    /**
     * Set 库下表的最新更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModifiedTimeByTables 库下表的最新更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifiedTimeByTables(Long ModifiedTimeByTables) {
        this.ModifiedTimeByTables = ModifiedTimeByTables;
    }

    /**
     * Get 库下表的最新访问时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastAccessTimeByTables 库下表的最新访问时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastAccessTimeByTables() {
        return this.LastAccessTimeByTables;
    }

    /**
     * Set 库下表的最新访问时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastAccessTimeByTables 库下表的最新访问时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastAccessTimeByTables(Long LastAccessTimeByTables) {
        this.LastAccessTimeByTables = LastAccessTimeByTables;
    }

    /**
     * Get 库guid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseGuid 库guid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseGuid() {
        return this.DatabaseGuid;
    }

    /**
     * Set 库guid
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseGuid 库guid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseGuid(String DatabaseGuid) {
        this.DatabaseGuid = DatabaseGuid;
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
     * Get Owner的账户信息：账号信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerAccount Owner的账户信息：账号信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOwnerAccount() {
        return this.OwnerAccount;
    }

    /**
     * Set Owner的账户信息：账号信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerAccount Owner的账户信息：账号信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerAccount(Long OwnerAccount) {
        this.OwnerAccount = OwnerAccount;
    }

    /**
     * Get 操作权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OperateOption 操作权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OperateOption getOperateOption() {
        return this.OperateOption;
    }

    /**
     * Set 操作权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param OperateOption 操作权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperateOption(OperateOption OperateOption) {
        this.OperateOption = OperateOption;
    }

    public DatabaseMeta() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DatabaseMeta(DatabaseMeta source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.MetastoreType != null) {
            this.MetastoreType = new String(source.MetastoreType);
        }
        if (source.DatasourceName != null) {
            this.DatasourceName = new String(source.DatasourceName);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new Long(source.DatasourceId);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Instance != null) {
            this.Instance = new String(source.Instance);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.ProjectDisplayName != null) {
            this.ProjectDisplayName = new String(source.ProjectDisplayName);
        }
        if (source.OwnerAccountName != null) {
            this.OwnerAccountName = new String(source.OwnerAccountName);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.DatabaseId != null) {
            this.DatabaseId = new String(source.DatabaseId);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.StorageSize != null) {
            this.StorageSize = new Long(source.StorageSize);
        }
        if (source.StorageSizeWithUnit != null) {
            this.StorageSizeWithUnit = new String(source.StorageSizeWithUnit);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.TableCount != null) {
            this.TableCount = new Long(source.TableCount);
        }
        if (source.DatasourceList != null) {
            this.DatasourceList = new GovDatasourceInfo[source.DatasourceList.length];
            for (int i = 0; i < source.DatasourceList.length; i++) {
                this.DatasourceList[i] = new GovDatasourceInfo(source.DatasourceList[i]);
            }
        }
        if (source.CollectJobId != null) {
            this.CollectJobId = new String(source.CollectJobId);
        }
        if (source.CollectJobName != null) {
            this.CollectJobName = new String(source.CollectJobName);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ModifiedTimeByTables != null) {
            this.ModifiedTimeByTables = new Long(source.ModifiedTimeByTables);
        }
        if (source.LastAccessTimeByTables != null) {
            this.LastAccessTimeByTables = new Long(source.LastAccessTimeByTables);
        }
        if (source.DatabaseGuid != null) {
            this.DatabaseGuid = new String(source.DatabaseGuid);
        }
        if (source.Environment != null) {
            this.Environment = new String(source.Environment);
        }
        if (source.OwnerAccount != null) {
            this.OwnerAccount = new Long(source.OwnerAccount);
        }
        if (source.OperateOption != null) {
            this.OperateOption = new OperateOption(source.OperateOption);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "MetastoreType", this.MetastoreType);
        this.setParamSimple(map, prefix + "DatasourceName", this.DatasourceName);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Instance", this.Instance);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "ProjectDisplayName", this.ProjectDisplayName);
        this.setParamSimple(map, prefix + "OwnerAccountName", this.OwnerAccountName);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "StorageSize", this.StorageSize);
        this.setParamSimple(map, prefix + "StorageSizeWithUnit", this.StorageSizeWithUnit);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "TableCount", this.TableCount);
        this.setParamArrayObj(map, prefix + "DatasourceList.", this.DatasourceList);
        this.setParamSimple(map, prefix + "CollectJobId", this.CollectJobId);
        this.setParamSimple(map, prefix + "CollectJobName", this.CollectJobName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ModifiedTimeByTables", this.ModifiedTimeByTables);
        this.setParamSimple(map, prefix + "LastAccessTimeByTables", this.LastAccessTimeByTables);
        this.setParamSimple(map, prefix + "DatabaseGuid", this.DatabaseGuid);
        this.setParamSimple(map, prefix + "Environment", this.Environment);
        this.setParamSimple(map, prefix + "OwnerAccount", this.OwnerAccount);
        this.setParamObj(map, prefix + "OperateOption.", this.OperateOption);

    }
}

