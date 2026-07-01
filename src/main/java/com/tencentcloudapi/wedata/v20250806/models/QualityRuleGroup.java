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

public class QualityRuleGroup extends AbstractModel {

    /**
    * <p>规则组Id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleGroupId")
    @Expose
    private Long RuleGroupId;

    /**
    * <p>数据源Id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceId")
    @Expose
    private String DatasourceId;

    /**
    * <p>数据源名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceName")
    @Expose
    private String DatasourceName;

    /**
    * <p>数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatasourceType")
    @Expose
    private Long DatasourceType;

    /**
    * <p>监控类型 1.未配置, 2.关联生产调度, 3.离线周期检测</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorType")
    @Expose
    private Long MonitorType;

    /**
    * <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>关联数据表名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * <p>关联数据表Id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableId")
    @Expose
    private String TableId;

    /**
    * <p>关联数据表负责人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableOwnerName")
    @Expose
    private String TableOwnerName;

    /**
    * <p>执行策略</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecStrategy")
    @Expose
    private QualityRuleGroupExecStrategy ExecStrategy;

    /**
    * <p>订阅信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Subscription")
    @Expose
    private QualityRuleGroupSubscribe Subscription;

    /**
    * <p>数据库id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseId")
    @Expose
    private String DatabaseId;

    /**
    * <p>数据库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * <p>模式名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SchemaName")
    @Expose
    private String SchemaName;

    /**
    * <p>是否有权限</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Permission")
    @Expose
    private Boolean Permission;

    /**
    * <p>已经配置的规则数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleCount")
    @Expose
    private Long RuleCount;

    /**
    * <p>监控状态</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MonitorStatus")
    @Expose
    private Boolean MonitorStatus;

    /**
    * <p>表负责人UserId</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableOwnerUserId")
    @Expose
    private Long TableOwnerUserId;

    /**
    * <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>是否已配置执行策略</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrategyConfig")
    @Expose
    private Boolean StrategyConfig;

    /**
    * <p>是否已配置执行策略</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubscribeConfig")
    @Expose
    private Boolean SubscribeConfig;

    /**
    * <p>数据源环境：0或者未返回.未定义，1.生产 2.开发</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DsEnvType")
    @Expose
    private Long DsEnvType;

    /**
    * <p>EMR集群部署方式：CVM/TKE</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterDeployType")
    @Expose
    private String ClusterDeployType;

    /**
    * <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>执行详情</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExecDetail")
    @Expose
    private String ExecDetail;

    /**
    * <p>事中关联任务数量</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PipelineTaskCount")
    @Expose
    private Long PipelineTaskCount;

    /**
    * <p>有效规则数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableRuleCount")
    @Expose
    private Long EnableRuleCount;

    /**
    * <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>监控创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUserName")
    @Expose
    private String CreateUserName;

    /**
    * <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupType")
    @Expose
    private String GroupType;

    /**
    * <p>任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AspectTaskId")
    @Expose
    private String AspectTaskId;

    /**
    * <p>数据目录名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CatalogName")
    @Expose
    private String CatalogName;

    /**
    * <p>负责人ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InChargeId")
    @Expose
    private String InChargeId;

    /**
    * <p>负责人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InChargeName")
    @Expose
    private String InChargeName;

    /**
     * Get <p>规则组Id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleGroupId <p>规则组Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleGroupId() {
        return this.RuleGroupId;
    }

    /**
     * Set <p>规则组Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleGroupId <p>规则组Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleGroupId(Long RuleGroupId) {
        this.RuleGroupId = RuleGroupId;
    }

    /**
     * Get <p>数据源Id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceId <p>数据源Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceId() {
        return this.DatasourceId;
    }

    /**
     * Set <p>数据源Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceId <p>数据源Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceId(String DatasourceId) {
        this.DatasourceId = DatasourceId;
    }

    /**
     * Get <p>数据源名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceName <p>数据源名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatasourceName() {
        return this.DatasourceName;
    }

    /**
     * Set <p>数据源名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceName <p>数据源名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceName(String DatasourceName) {
        this.DatasourceName = DatasourceName;
    }

    /**
     * Get <p>数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatasourceType <p>数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDatasourceType() {
        return this.DatasourceType;
    }

    /**
     * Set <p>数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatasourceType <p>数据源类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatasourceType(Long DatasourceType) {
        this.DatasourceType = DatasourceType;
    }

    /**
     * Get <p>监控类型 1.未配置, 2.关联生产调度, 3.离线周期检测</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorType <p>监控类型 1.未配置, 2.关联生产调度, 3.离线周期检测</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMonitorType() {
        return this.MonitorType;
    }

    /**
     * Set <p>监控类型 1.未配置, 2.关联生产调度, 3.离线周期检测</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorType <p>监控类型 1.未配置, 2.关联生产调度, 3.离线周期检测</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorType(Long MonitorType) {
        this.MonitorType = MonitorType;
    }

    /**
     * Get <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>更新时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>关联数据表名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName <p>关联数据表名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set <p>关联数据表名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName <p>关联数据表名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get <p>关联数据表Id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableId <p>关联数据表Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableId() {
        return this.TableId;
    }

    /**
     * Set <p>关联数据表Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableId <p>关联数据表Id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    /**
     * Get <p>关联数据表负责人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableOwnerName <p>关联数据表负责人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableOwnerName() {
        return this.TableOwnerName;
    }

    /**
     * Set <p>关联数据表负责人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableOwnerName <p>关联数据表负责人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableOwnerName(String TableOwnerName) {
        this.TableOwnerName = TableOwnerName;
    }

    /**
     * Get <p>执行策略</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecStrategy <p>执行策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityRuleGroupExecStrategy getExecStrategy() {
        return this.ExecStrategy;
    }

    /**
     * Set <p>执行策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecStrategy <p>执行策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecStrategy(QualityRuleGroupExecStrategy ExecStrategy) {
        this.ExecStrategy = ExecStrategy;
    }

    /**
     * Get <p>订阅信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Subscription <p>订阅信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QualityRuleGroupSubscribe getSubscription() {
        return this.Subscription;
    }

    /**
     * Set <p>订阅信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Subscription <p>订阅信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubscription(QualityRuleGroupSubscribe Subscription) {
        this.Subscription = Subscription;
    }

    /**
     * Get <p>数据库id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseId <p>数据库id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseId() {
        return this.DatabaseId;
    }

    /**
     * Set <p>数据库id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseId <p>数据库id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseId(String DatabaseId) {
        this.DatabaseId = DatabaseId;
    }

    /**
     * Get <p>数据库名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseName <p>数据库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set <p>数据库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseName <p>数据库名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get <p>模式名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SchemaName <p>模式名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSchemaName() {
        return this.SchemaName;
    }

    /**
     * Set <p>模式名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SchemaName <p>模式名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSchemaName(String SchemaName) {
        this.SchemaName = SchemaName;
    }

    /**
     * Get <p>是否有权限</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Permission <p>是否有权限</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getPermission() {
        return this.Permission;
    }

    /**
     * Set <p>是否有权限</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Permission <p>是否有权限</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPermission(Boolean Permission) {
        this.Permission = Permission;
    }

    /**
     * Get <p>已经配置的规则数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleCount <p>已经配置的规则数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleCount() {
        return this.RuleCount;
    }

    /**
     * Set <p>已经配置的规则数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleCount <p>已经配置的规则数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleCount(Long RuleCount) {
        this.RuleCount = RuleCount;
    }

    /**
     * Get <p>监控状态</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MonitorStatus <p>监控状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getMonitorStatus() {
        return this.MonitorStatus;
    }

    /**
     * Set <p>监控状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param MonitorStatus <p>监控状态</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMonitorStatus(Boolean MonitorStatus) {
        this.MonitorStatus = MonitorStatus;
    }

    /**
     * Get <p>表负责人UserId</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableOwnerUserId <p>表负责人UserId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTableOwnerUserId() {
        return this.TableOwnerUserId;
    }

    /**
     * Set <p>表负责人UserId</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableOwnerUserId <p>表负责人UserId</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableOwnerUserId(Long TableOwnerUserId) {
        this.TableOwnerUserId = TableOwnerUserId;
    }

    /**
     * Get <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>是否已配置执行策略</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrategyConfig <p>是否已配置执行策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getStrategyConfig() {
        return this.StrategyConfig;
    }

    /**
     * Set <p>是否已配置执行策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrategyConfig <p>是否已配置执行策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategyConfig(Boolean StrategyConfig) {
        this.StrategyConfig = StrategyConfig;
    }

    /**
     * Get <p>是否已配置执行策略</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubscribeConfig <p>是否已配置执行策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSubscribeConfig() {
        return this.SubscribeConfig;
    }

    /**
     * Set <p>是否已配置执行策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubscribeConfig <p>是否已配置执行策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubscribeConfig(Boolean SubscribeConfig) {
        this.SubscribeConfig = SubscribeConfig;
    }

    /**
     * Get <p>数据源环境：0或者未返回.未定义，1.生产 2.开发</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DsEnvType <p>数据源环境：0或者未返回.未定义，1.生产 2.开发</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDsEnvType() {
        return this.DsEnvType;
    }

    /**
     * Set <p>数据源环境：0或者未返回.未定义，1.生产 2.开发</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DsEnvType <p>数据源环境：0或者未返回.未定义，1.生产 2.开发</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDsEnvType(Long DsEnvType) {
        this.DsEnvType = DsEnvType;
    }

    /**
     * Get <p>EMR集群部署方式：CVM/TKE</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterDeployType <p>EMR集群部署方式：CVM/TKE</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterDeployType() {
        return this.ClusterDeployType;
    }

    /**
     * Set <p>EMR集群部署方式：CVM/TKE</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterDeployType <p>EMR集群部署方式：CVM/TKE</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterDeployType(String ClusterDeployType) {
        this.ClusterDeployType = ClusterDeployType;
    }

    /**
     * Get <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>执行详情</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExecDetail <p>执行详情</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExecDetail() {
        return this.ExecDetail;
    }

    /**
     * Set <p>执行详情</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExecDetail <p>执行详情</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExecDetail(String ExecDetail) {
        this.ExecDetail = ExecDetail;
    }

    /**
     * Get <p>事中关联任务数量</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PipelineTaskCount <p>事中关联任务数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPipelineTaskCount() {
        return this.PipelineTaskCount;
    }

    /**
     * Set <p>事中关联任务数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PipelineTaskCount <p>事中关联任务数量</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPipelineTaskCount(Long PipelineTaskCount) {
        this.PipelineTaskCount = PipelineTaskCount;
    }

    /**
     * Get <p>有效规则数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableRuleCount <p>有效规则数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnableRuleCount() {
        return this.EnableRuleCount;
    }

    /**
     * Set <p>有效规则数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableRuleCount <p>有效规则数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableRuleCount(Long EnableRuleCount) {
        this.EnableRuleCount = EnableRuleCount;
    }

    /**
     * Get <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>任务描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>监控创建人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUserName <p>监控创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateUserName() {
        return this.CreateUserName;
    }

    /**
     * Set <p>监控创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUserName <p>监控创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUserName(String CreateUserName) {
        this.CreateUserName = CreateUserName;
    }

    /**
     * Get <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupType <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupType() {
        return this.GroupType;
    }

    /**
     * Set <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupType <p>任务类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupType(String GroupType) {
        this.GroupType = GroupType;
    }

    /**
     * Get <p>任务id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AspectTaskId <p>任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAspectTaskId() {
        return this.AspectTaskId;
    }

    /**
     * Set <p>任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AspectTaskId <p>任务id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAspectTaskId(String AspectTaskId) {
        this.AspectTaskId = AspectTaskId;
    }

    /**
     * Get <p>数据目录名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CatalogName <p>数据目录名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCatalogName() {
        return this.CatalogName;
    }

    /**
     * Set <p>数据目录名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CatalogName <p>数据目录名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalogName(String CatalogName) {
        this.CatalogName = CatalogName;
    }

    /**
     * Get <p>负责人ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InChargeId <p>负责人ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInChargeId() {
        return this.InChargeId;
    }

    /**
     * Set <p>负责人ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InChargeId <p>负责人ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInChargeId(String InChargeId) {
        this.InChargeId = InChargeId;
    }

    /**
     * Get <p>负责人名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InChargeName <p>负责人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInChargeName() {
        return this.InChargeName;
    }

    /**
     * Set <p>负责人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InChargeName <p>负责人名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInChargeName(String InChargeName) {
        this.InChargeName = InChargeName;
    }

    public QualityRuleGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityRuleGroup(QualityRuleGroup source) {
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
            this.ExecStrategy = new QualityRuleGroupExecStrategy(source.ExecStrategy);
        }
        if (source.Subscription != null) {
            this.Subscription = new QualityRuleGroupSubscribe(source.Subscription);
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
        if (source.GroupType != null) {
            this.GroupType = new String(source.GroupType);
        }
        if (source.AspectTaskId != null) {
            this.AspectTaskId = new String(source.AspectTaskId);
        }
        if (source.CatalogName != null) {
            this.CatalogName = new String(source.CatalogName);
        }
        if (source.InChargeId != null) {
            this.InChargeId = new String(source.InChargeId);
        }
        if (source.InChargeName != null) {
            this.InChargeName = new String(source.InChargeName);
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
        this.setParamSimple(map, prefix + "GroupType", this.GroupType);
        this.setParamSimple(map, prefix + "AspectTaskId", this.AspectTaskId);
        this.setParamSimple(map, prefix + "CatalogName", this.CatalogName);
        this.setParamSimple(map, prefix + "InChargeId", this.InChargeId);
        this.setParamSimple(map, prefix + "InChargeName", this.InChargeName);

    }
}

