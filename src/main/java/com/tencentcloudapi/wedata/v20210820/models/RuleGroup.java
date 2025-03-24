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

public class RuleGroup extends AbstractModel {

    /**
    * 规则组Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleGroupId")
    @Expose
    private Long RuleGroupId;

    /**
    * 数据源Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * 数据源名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceName")
    @Expose
    private String DatasourceName;

    /**
    * 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceType")
    @Expose
    private Long DatasourceType;

    /**
    * 监控类型 1.未配置, 2.关联生产调度, 3.离线周期检测
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorType")
    @Expose
    private Long MonitorType;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 关联数据表名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 关联数据表Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * 关联数据表负责人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableOwnerName")
    @Expose
    private String TableOwnerName;

    /**
    * 执行策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecStrategy")
    @Expose
    private RuleGroupExecStrategy ExecStrategy;

    /**
    * 执行策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Subscription")
    @Expose
    private RuleGroupSubscribe Subscription;

    /**
    * 数据库id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

    /**
    * 数据库名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 模式名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * 是否有权限
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Permission")
    @Expose
    private Boolean Permission;

    /**
    * 已经配置的规则数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleCount")
    @Expose
    private Long RuleCount;

    /**
    * 监控状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorStatus")
    @Expose
    private Boolean MonitorStatus;

    /**
    * 表负责人UserId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableOwnerUserId")
    @Expose
    private Long TableOwnerUserId;

    /**
    * 实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 是否已配置执行策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrategyConfig")
    @Expose
    private Boolean StrategyConfig;

    /**
    * 是否已配置执行策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubscribeConfig")
    @Expose
    private Boolean SubscribeConfig;

    /**
    * 数据源环境：0或者未返回.未定义，1.生产 2.开发
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DsEnvType")
    @Expose
    private Long DsEnvType;

    /**
    * EMR集群部署方式：CVM/TKE
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterDeployType")
    @Expose
    private String ClusterDeployType;

    /**
    * 任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 执行详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecDetail")
    @Expose
    private String ExecDetail;

    /**
    * 事中关联任务数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PipelineTaskCount")
    @Expose
    private Long PipelineTaskCount;

    /**
    * 有效规则数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableRuleCount")
    @Expose
    private Long EnableRuleCount;

    /**
    * 任务描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 监控创建人
    */
    @SerializedName("CreateUserName")
    @Expose
    private String CreateUserName;

    /**
     * Get 规则组Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleGroupId 规则组Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleGroupId() {
        return this.RuleGroupId;
    }

    /**
     * Set 规则组Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleGroupId 规则组Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleGroupId(Long RuleGroupId) {
        this.RuleGroupId = RuleGroupId;
    }

    /**
     * Get 数据源Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceId 数据源Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set 数据源Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceId 数据源Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
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
     * Get 数据源类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceType 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDatasourceType() {
        return this.DatasourceType;
    }

    /**
     * Set 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceType 数据源类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceType(Long DatasourceType) {
        this.DatasourceType = DatasourceType;
    }

    /**
     * Get 监控类型 1.未配置, 2.关联生产调度, 3.离线周期检测
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorType 监控类型 1.未配置, 2.关联生产调度, 3.离线周期检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set 监控类型 1.未配置, 2.关联生产调度, 3.离线周期检测
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorType 监控类型 1.未配置, 2.关联生产调度, 3.离线周期检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorType(Long MonitorType) {
        this.MonitorType = MonitorType;
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
     * Get 关联数据表名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName 关联数据表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 关联数据表名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName 关联数据表名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 关联数据表Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableId 关联数据表Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set 关联数据表Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableId 关联数据表Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get 关联数据表负责人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableOwnerName 关联数据表负责人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableOwnerName() {
        return this.TableOwnerName;
    }

    /**
     * Set 关联数据表负责人
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableOwnerName 关联数据表负责人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableOwnerName(String TableOwnerName) {
        this.TableOwnerName = TableOwnerName;
    }

    /**
     * Get 执行策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecStrategy 执行策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleGroupExecStrategy getExecStrategy() {
        return this.ExecStrategy;
    }

    /**
     * Set 执行策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecStrategy 执行策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecStrategy(RuleGroupExecStrategy ExecStrategy) {
        this.ExecStrategy = ExecStrategy;
    }

    /**
     * Get 执行策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Subscription 执行策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RuleGroupSubscribe getSubscription() {
        return this.Subscription;
    }

    /**
     * Set 执行策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param Subscription 执行策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubscription(RuleGroupSubscribe Subscription) {
        this.Subscription = Subscription;
    }

    /**
     * Get 数据库id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseId 数据库id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set 数据库id
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseId 数据库id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseId(String DatabaseId) {
        this.DatabaseId = DatabaseId;
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
     * Get 模式名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchemaName 模式名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set 模式名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchemaName 模式名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get 是否有权限
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Permission 是否有权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getPermission() {
        return this.Permission;
    }

    /**
     * Set 是否有权限
注意：此字段可能返回 null，表示取不到有效值。
     * @param Permission 是否有权限
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPermission(Boolean Permission) {
        this.Permission = Permission;
    }

    /**
     * Get 已经配置的规则数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleCount 已经配置的规则数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleCount() {
        return this.RuleCount;
    }

    /**
     * Set 已经配置的规则数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleCount 已经配置的规则数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleCount(Long RuleCount) {
        this.RuleCount = RuleCount;
    }

    /**
     * Get 监控状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorStatus 监控状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getMonitorStatus() {
        return this.MonitorStatus;
    }

    /**
     * Set 监控状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorStatus 监控状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorStatus(Boolean MonitorStatus) {
        this.MonitorStatus = MonitorStatus;
    }

    /**
     * Get 表负责人UserId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableOwnerUserId 表负责人UserId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTableOwnerUserId() {
        return this.TableOwnerUserId;
    }

    /**
     * Set 表负责人UserId
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableOwnerUserId 表负责人UserId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableOwnerUserId(Long TableOwnerUserId) {
        this.TableOwnerUserId = TableOwnerUserId;
    }

    /**
     * Get 实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get 是否已配置执行策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrategyConfig 是否已配置执行策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getStrategyConfig() {
        return this.StrategyConfig;
    }

    /**
     * Set 是否已配置执行策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrategyConfig 是否已配置执行策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategyConfig(Boolean StrategyConfig) {
        this.StrategyConfig = StrategyConfig;
    }

    /**
     * Get 是否已配置执行策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubscribeConfig 是否已配置执行策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSubscribeConfig() {
        return this.SubscribeConfig;
    }

    /**
     * Set 是否已配置执行策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubscribeConfig 是否已配置执行策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubscribeConfig(Boolean SubscribeConfig) {
        this.SubscribeConfig = SubscribeConfig;
    }

    /**
     * Get 数据源环境：0或者未返回.未定义，1.生产 2.开发
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DsEnvType 数据源环境：0或者未返回.未定义，1.生产 2.开发
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDsEnvType() {
        return this.DsEnvType;
    }

    /**
     * Set 数据源环境：0或者未返回.未定义，1.生产 2.开发
注意：此字段可能返回 null，表示取不到有效值。
     * @param DsEnvType 数据源环境：0或者未返回.未定义，1.生产 2.开发
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDsEnvType(Long DsEnvType) {
        this.DsEnvType = DsEnvType;
    }

    /**
     * Get EMR集群部署方式：CVM/TKE
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterDeployType EMR集群部署方式：CVM/TKE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterDeployType() {
        return this.ClusterDeployType;
    }

    /**
     * Set EMR集群部署方式：CVM/TKE
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterDeployType EMR集群部署方式：CVM/TKE
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterDeployType(String ClusterDeployType) {
        this.ClusterDeployType = ClusterDeployType;
    }

    /**
     * Get 任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 执行详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecDetail 执行详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecDetail() {
        return this.ExecDetail;
    }

    /**
     * Set 执行详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecDetail 执行详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecDetail(String ExecDetail) {
        this.ExecDetail = ExecDetail;
    }

    /**
     * Get 事中关联任务数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PipelineTaskCount 事中关联任务数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPipelineTaskCount() {
        return this.PipelineTaskCount;
    }

    /**
     * Set 事中关联任务数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param PipelineTaskCount 事中关联任务数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPipelineTaskCount(Long PipelineTaskCount) {
        this.PipelineTaskCount = PipelineTaskCount;
    }

    /**
     * Get 有效规则数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableRuleCount 有效规则数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnableRuleCount() {
        return this.EnableRuleCount;
    }

    /**
     * Set 有效规则数
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableRuleCount 有效规则数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableRuleCount(Long EnableRuleCount) {
        this.EnableRuleCount = EnableRuleCount;
    }

    /**
     * Get 任务描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 任务描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 任务描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 任务描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 监控创建人 
     * @return CreateUserName 监控创建人
     */
    public String getCreateUserName() {
        return this.CreateUserName;
    }

    /**
     * Set 监控创建人
     * @param CreateUserName 监控创建人
     */
    public void setCreateUserName(String CreateUserName) {
        this.CreateUserName = CreateUserName;
    }

    public RuleGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleGroup(RuleGroup source) {
        if (source.RuleGroupId != null) {
            this.RuleGroupId = new Long(source.RuleGroupId);
        }
        if (source.DatasourceId != null) {
            this.DatasourceId = new String(source.DatasourceId);
        }
        if (source.DatasourceName != null) {
            this.DatasourceName = new String(source.DatasourceName);
        }
        if (source.DatasourceType != null) {
            this.DatasourceType = new Long(source.DatasourceType);
        }
        if (source.MonitorType != null) {
            this.MonitorType = new Long(source.MonitorType);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.TableId != null) {
            this.TableId = new String(source.TableId);
        }
        if (source.TableOwnerName != null) {
            this.TableOwnerName = new String(source.TableOwnerName);
        }
        if (source.ExecStrategy != null) {
            this.ExecStrategy = new RuleGroupExecStrategy(source.ExecStrategy);
        }
        if (source.Subscription != null) {
            this.Subscription = new RuleGroupSubscribe(source.Subscription);
        }
        if (source.DatabaseId != null) {
            this.DatabaseId = new String(source.DatabaseId);
        }
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.SchemaName != null) {
            this.SchemaName = new String(source.SchemaName);
        }
        if (source.Permission != null) {
            this.Permission = new Boolean(source.Permission);
        }
        if (source.RuleCount != null) {
            this.RuleCount = new Long(source.RuleCount);
        }
        if (source.MonitorStatus != null) {
            this.MonitorStatus = new Boolean(source.MonitorStatus);
        }
        if (source.TableOwnerUserId != null) {
            this.TableOwnerUserId = new Long(source.TableOwnerUserId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.StrategyConfig != null) {
            this.StrategyConfig = new Boolean(source.StrategyConfig);
        }
        if (source.SubscribeConfig != null) {
            this.SubscribeConfig = new Boolean(source.SubscribeConfig);
        }
        if (source.DsEnvType != null) {
            this.DsEnvType = new Long(source.DsEnvType);
        }
        if (source.ClusterDeployType != null) {
            this.ClusterDeployType = new String(source.ClusterDeployType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ExecDetail != null) {
            this.ExecDetail = new String(source.ExecDetail);
        }
        if (source.PipelineTaskCount != null) {
            this.PipelineTaskCount = new Long(source.PipelineTaskCount);
        }
        if (source.EnableRuleCount != null) {
            this.EnableRuleCount = new Long(source.EnableRuleCount);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateUserName != null) {
            this.CreateUserName = new String(source.CreateUserName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleGroupId", this.RuleGroupId);
        this.setParamSimple(map, prefix + "DatasourceId", this.DatasourceId);
        this.setParamSimple(map, prefix + "DatasourceName", this.DatasourceName);
        this.setParamSimple(map, prefix + "DatasourceType", this.DatasourceType);
        this.setParamSimple(map, prefix + "MonitorType", this.MonitorType);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "TableId", this.TableId);
        this.setParamSimple(map, prefix + "TableOwnerName", this.TableOwnerName);
        this.setParamObj(map, prefix + "ExecStrategy.", this.ExecStrategy);
        this.setParamObj(map, prefix + "Subscription.", this.Subscription);
        this.setParamSimple(map, prefix + "DatabaseId", this.DatabaseId);
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "SchemaName", this.SchemaName);
        this.setParamSimple(map, prefix + "Permission", this.Permission);
        this.setParamSimple(map, prefix + "RuleCount", this.RuleCount);
        this.setParamSimple(map, prefix + "MonitorStatus", this.MonitorStatus);
        this.setParamSimple(map, prefix + "TableOwnerUserId", this.TableOwnerUserId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StrategyConfig", this.StrategyConfig);
        this.setParamSimple(map, prefix + "SubscribeConfig", this.SubscribeConfig);
        this.setParamSimple(map, prefix + "DsEnvType", this.DsEnvType);
        this.setParamSimple(map, prefix + "ClusterDeployType", this.ClusterDeployType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ExecDetail", this.ExecDetail);
        this.setParamSimple(map, prefix + "PipelineTaskCount", this.PipelineTaskCount);
        this.setParamSimple(map, prefix + "EnableRuleCount", this.EnableRuleCount);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateUserName", this.CreateUserName);

    }
}

