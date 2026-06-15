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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VmGroup extends AbstractModel {

    /**
    * <p>部署组ID</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>部署组名称</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>部署组状态</p>
    */
    @SerializedName("GroupStatus")
    @Expose
    private String GroupStatus;

    /**
    * <p>程序包ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * <p>程序包名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * <p>程序包版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageVersion")
    @Expose
    private String PackageVersion;

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>集群名称</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>命名空间ID</p>
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * <p>命名空间名称</p>
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * <p>应用ID</p>
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * <p>应用名称</p>
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * <p>部署组机器数目</p>
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * <p>部署组运行中机器数目</p>
    */
    @SerializedName("RunInstanceCount")
    @Expose
    private Long RunInstanceCount;

    /**
    * <p>部署组启动参数信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartupParameters")
    @Expose
    private String StartupParameters;

    /**
    * <p>部署组创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>部署组更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>部署组停止机器数目</p>
    */
    @SerializedName("OffInstanceCount")
    @Expose
    private Long OffInstanceCount;

    /**
    * <p>部署组描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupDesc")
    @Expose
    private String GroupDesc;

    /**
    * <p>微服务类型</p>
    */
    @SerializedName("MicroserviceType")
    @Expose
    private String MicroserviceType;

    /**
    * <p>应用类型</p>
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * <p>部署组资源类型</p>
    */
    @SerializedName("GroupResourceType")
    @Expose
    private String GroupResourceType;

    /**
    * <p>部署组更新时间戳</p>
    */
    @SerializedName("UpdatedTime")
    @Expose
    private Long UpdatedTime;

    /**
    * <p>部署应用描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeployDesc")
    @Expose
    private String DeployDesc;

    /**
    * <p>滚动发布的更新方式</p>
    */
    @SerializedName("UpdateType")
    @Expose
    private Long UpdateType;

    /**
    * <p>发布是否启用beta批次</p>
    */
    @SerializedName("DeployBetaEnable")
    @Expose
    private Boolean DeployBetaEnable;

    /**
    * <p>滚动发布的批次比例列表</p>
    */
    @SerializedName("DeployBatch")
    @Expose
    private Float [] DeployBatch;

    /**
    * <p>滚动发布的批次执行方式</p>
    */
    @SerializedName("DeployExeMode")
    @Expose
    private String DeployExeMode;

    /**
    * <p>滚动发布的每个批次的等待时间</p>
    */
    @SerializedName("DeployWaitTime")
    @Expose
    private Long DeployWaitTime;

    /**
    * <p>是否开启了健康检查</p>
    */
    @SerializedName("EnableHealthCheck")
    @Expose
    private Boolean EnableHealthCheck;

    /**
    * <p>健康检查配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthCheckSettings")
    @Expose
    private HealthCheckSettings HealthCheckSettings;

    /**
    * <p>程序包类型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * <p>启动脚本 base64编码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartScript")
    @Expose
    private String StartScript;

    /**
    * <p>停止脚本 base64编码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StopScript")
    @Expose
    private String StopScript;

    /**
    * <p>部署组备注</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * <p>javaagent信息</p>
    */
    @SerializedName("AgentProfileList")
    @Expose
    private AgentProfile [] AgentProfileList;

    /**
    * <p>预热属性配置</p>
    */
    @SerializedName("WarmupSetting")
    @Expose
    private WarmupSetting WarmupSetting;

    /**
    * <p>Envoy网关配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GatewayConfig")
    @Expose
    private GatewayConfig GatewayConfig;

    /**
    * <p>批次是否开启健康检查</p>
    */
    @SerializedName("EnableBatchHealthCheck")
    @Expose
    private Boolean EnableBatchHealthCheck;

    /**
    * <p>是否开启cgroup控制内存cpu</p>
    */
    @SerializedName("FilebeatCgroupEnable")
    @Expose
    private Boolean FilebeatCgroupEnable;

    /**
    * <p>filebeat使用cpu上限</p>
    */
    @SerializedName("FilebeatMaxCpu")
    @Expose
    private Float FilebeatMaxCpu;

    /**
    * <p>filebeat使用内存上限</p>
    */
    @SerializedName("FilebeatMaxMem")
    @Expose
    private Long FilebeatMaxMem;

    /**
    * <p>仓库ID</p>
    */
    @SerializedName("RepositoryId")
    @Expose
    private String RepositoryId;

    /**
    * <p>仓库名称</p>
    */
    @SerializedName("RepositoryName")
    @Expose
    private String RepositoryName;

    /**
    * <p>仓库类型</p>
    */
    @SerializedName("RepositoryType")
    @Expose
    private String RepositoryType;

    /**
    * <p>是否自动重启</p>
    */
    @SerializedName("LivenessAutoRestart")
    @Expose
    private Boolean LivenessAutoRestart;

    /**
     * Get <p>部署组ID</p> 
     * @return GroupId <p>部署组ID</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>部署组ID</p>
     * @param GroupId <p>部署组ID</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>部署组名称</p> 
     * @return GroupName <p>部署组名称</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>部署组名称</p>
     * @param GroupName <p>部署组名称</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get <p>部署组状态</p> 
     * @return GroupStatus <p>部署组状态</p>
     */
    public String getGroupStatus() {
        return this.GroupStatus;
    }

    /**
     * Set <p>部署组状态</p>
     * @param GroupStatus <p>部署组状态</p>
     */
    public void setGroupStatus(String GroupStatus) {
        this.GroupStatus = GroupStatus;
    }

    /**
     * Get <p>程序包ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageId <p>程序包ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set <p>程序包ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageId <p>程序包ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get <p>程序包名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageName <p>程序包名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set <p>程序包名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageName <p>程序包名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get <p>程序包版本号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageVersion <p>程序包版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageVersion() {
        return this.PackageVersion;
    }

    /**
     * Set <p>程序包版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageVersion <p>程序包版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageVersion(String PackageVersion) {
        this.PackageVersion = PackageVersion;
    }

    /**
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>集群名称</p> 
     * @return ClusterName <p>集群名称</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>集群名称</p>
     * @param ClusterName <p>集群名称</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>命名空间ID</p> 
     * @return NamespaceId <p>命名空间ID</p>
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set <p>命名空间ID</p>
     * @param NamespaceId <p>命名空间ID</p>
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get <p>命名空间名称</p> 
     * @return NamespaceName <p>命名空间名称</p>
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set <p>命名空间名称</p>
     * @param NamespaceName <p>命名空间名称</p>
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get <p>应用ID</p> 
     * @return ApplicationId <p>应用ID</p>
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set <p>应用ID</p>
     * @param ApplicationId <p>应用ID</p>
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get <p>应用名称</p> 
     * @return ApplicationName <p>应用名称</p>
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set <p>应用名称</p>
     * @param ApplicationName <p>应用名称</p>
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get <p>部署组机器数目</p> 
     * @return InstanceCount <p>部署组机器数目</p>
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set <p>部署组机器数目</p>
     * @param InstanceCount <p>部署组机器数目</p>
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get <p>部署组运行中机器数目</p> 
     * @return RunInstanceCount <p>部署组运行中机器数目</p>
     */
    public Long getRunInstanceCount() {
        return this.RunInstanceCount;
    }

    /**
     * Set <p>部署组运行中机器数目</p>
     * @param RunInstanceCount <p>部署组运行中机器数目</p>
     */
    public void setRunInstanceCount(Long RunInstanceCount) {
        this.RunInstanceCount = RunInstanceCount;
    }

    /**
     * Get <p>部署组启动参数信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartupParameters <p>部署组启动参数信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartupParameters() {
        return this.StartupParameters;
    }

    /**
     * Set <p>部署组启动参数信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartupParameters <p>部署组启动参数信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartupParameters(String StartupParameters) {
        this.StartupParameters = StartupParameters;
    }

    /**
     * Get <p>部署组创建时间</p> 
     * @return CreateTime <p>部署组创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>部署组创建时间</p>
     * @param CreateTime <p>部署组创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>部署组更新时间</p> 
     * @return UpdateTime <p>部署组更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>部署组更新时间</p>
     * @param UpdateTime <p>部署组更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>部署组停止机器数目</p> 
     * @return OffInstanceCount <p>部署组停止机器数目</p>
     */
    public Long getOffInstanceCount() {
        return this.OffInstanceCount;
    }

    /**
     * Set <p>部署组停止机器数目</p>
     * @param OffInstanceCount <p>部署组停止机器数目</p>
     */
    public void setOffInstanceCount(Long OffInstanceCount) {
        this.OffInstanceCount = OffInstanceCount;
    }

    /**
     * Get <p>部署组描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupDesc <p>部署组描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupDesc() {
        return this.GroupDesc;
    }

    /**
     * Set <p>部署组描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupDesc <p>部署组描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupDesc(String GroupDesc) {
        this.GroupDesc = GroupDesc;
    }

    /**
     * Get <p>微服务类型</p> 
     * @return MicroserviceType <p>微服务类型</p>
     */
    public String getMicroserviceType() {
        return this.MicroserviceType;
    }

    /**
     * Set <p>微服务类型</p>
     * @param MicroserviceType <p>微服务类型</p>
     */
    public void setMicroserviceType(String MicroserviceType) {
        this.MicroserviceType = MicroserviceType;
    }

    /**
     * Get <p>应用类型</p> 
     * @return ApplicationType <p>应用类型</p>
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set <p>应用类型</p>
     * @param ApplicationType <p>应用类型</p>
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get <p>部署组资源类型</p> 
     * @return GroupResourceType <p>部署组资源类型</p>
     */
    public String getGroupResourceType() {
        return this.GroupResourceType;
    }

    /**
     * Set <p>部署组资源类型</p>
     * @param GroupResourceType <p>部署组资源类型</p>
     */
    public void setGroupResourceType(String GroupResourceType) {
        this.GroupResourceType = GroupResourceType;
    }

    /**
     * Get <p>部署组更新时间戳</p> 
     * @return UpdatedTime <p>部署组更新时间戳</p>
     */
    public Long getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set <p>部署组更新时间戳</p>
     * @param UpdatedTime <p>部署组更新时间戳</p>
     */
    public void setUpdatedTime(Long UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get <p>部署应用描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeployDesc <p>部署应用描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeployDesc() {
        return this.DeployDesc;
    }

    /**
     * Set <p>部署应用描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeployDesc <p>部署应用描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeployDesc(String DeployDesc) {
        this.DeployDesc = DeployDesc;
    }

    /**
     * Get <p>滚动发布的更新方式</p> 
     * @return UpdateType <p>滚动发布的更新方式</p>
     */
    public Long getUpdateType() {
        return this.UpdateType;
    }

    /**
     * Set <p>滚动发布的更新方式</p>
     * @param UpdateType <p>滚动发布的更新方式</p>
     */
    public void setUpdateType(Long UpdateType) {
        this.UpdateType = UpdateType;
    }

    /**
     * Get <p>发布是否启用beta批次</p> 
     * @return DeployBetaEnable <p>发布是否启用beta批次</p>
     */
    public Boolean getDeployBetaEnable() {
        return this.DeployBetaEnable;
    }

    /**
     * Set <p>发布是否启用beta批次</p>
     * @param DeployBetaEnable <p>发布是否启用beta批次</p>
     */
    public void setDeployBetaEnable(Boolean DeployBetaEnable) {
        this.DeployBetaEnable = DeployBetaEnable;
    }

    /**
     * Get <p>滚动发布的批次比例列表</p> 
     * @return DeployBatch <p>滚动发布的批次比例列表</p>
     */
    public Float [] getDeployBatch() {
        return this.DeployBatch;
    }

    /**
     * Set <p>滚动发布的批次比例列表</p>
     * @param DeployBatch <p>滚动发布的批次比例列表</p>
     */
    public void setDeployBatch(Float [] DeployBatch) {
        this.DeployBatch = DeployBatch;
    }

    /**
     * Get <p>滚动发布的批次执行方式</p> 
     * @return DeployExeMode <p>滚动发布的批次执行方式</p>
     */
    public String getDeployExeMode() {
        return this.DeployExeMode;
    }

    /**
     * Set <p>滚动发布的批次执行方式</p>
     * @param DeployExeMode <p>滚动发布的批次执行方式</p>
     */
    public void setDeployExeMode(String DeployExeMode) {
        this.DeployExeMode = DeployExeMode;
    }

    /**
     * Get <p>滚动发布的每个批次的等待时间</p> 
     * @return DeployWaitTime <p>滚动发布的每个批次的等待时间</p>
     */
    public Long getDeployWaitTime() {
        return this.DeployWaitTime;
    }

    /**
     * Set <p>滚动发布的每个批次的等待时间</p>
     * @param DeployWaitTime <p>滚动发布的每个批次的等待时间</p>
     */
    public void setDeployWaitTime(Long DeployWaitTime) {
        this.DeployWaitTime = DeployWaitTime;
    }

    /**
     * Get <p>是否开启了健康检查</p> 
     * @return EnableHealthCheck <p>是否开启了健康检查</p>
     */
    public Boolean getEnableHealthCheck() {
        return this.EnableHealthCheck;
    }

    /**
     * Set <p>是否开启了健康检查</p>
     * @param EnableHealthCheck <p>是否开启了健康检查</p>
     */
    public void setEnableHealthCheck(Boolean EnableHealthCheck) {
        this.EnableHealthCheck = EnableHealthCheck;
    }

    /**
     * Get <p>健康检查配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthCheckSettings <p>健康检查配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HealthCheckSettings getHealthCheckSettings() {
        return this.HealthCheckSettings;
    }

    /**
     * Set <p>健康检查配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthCheckSettings <p>健康检查配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthCheckSettings(HealthCheckSettings HealthCheckSettings) {
        this.HealthCheckSettings = HealthCheckSettings;
    }

    /**
     * Get <p>程序包类型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageType <p>程序包类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set <p>程序包类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageType <p>程序包类型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get <p>启动脚本 base64编码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartScript <p>启动脚本 base64编码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartScript() {
        return this.StartScript;
    }

    /**
     * Set <p>启动脚本 base64编码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartScript <p>启动脚本 base64编码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartScript(String StartScript) {
        this.StartScript = StartScript;
    }

    /**
     * Get <p>停止脚本 base64编码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StopScript <p>停止脚本 base64编码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStopScript() {
        return this.StopScript;
    }

    /**
     * Set <p>停止脚本 base64编码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StopScript <p>停止脚本 base64编码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStopScript(String StopScript) {
        this.StopScript = StopScript;
    }

    /**
     * Get <p>部署组备注</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Alias <p>部署组备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>部署组备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Alias <p>部署组备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get <p>javaagent信息</p> 
     * @return AgentProfileList <p>javaagent信息</p>
     */
    public AgentProfile [] getAgentProfileList() {
        return this.AgentProfileList;
    }

    /**
     * Set <p>javaagent信息</p>
     * @param AgentProfileList <p>javaagent信息</p>
     */
    public void setAgentProfileList(AgentProfile [] AgentProfileList) {
        this.AgentProfileList = AgentProfileList;
    }

    /**
     * Get <p>预热属性配置</p> 
     * @return WarmupSetting <p>预热属性配置</p>
     */
    public WarmupSetting getWarmupSetting() {
        return this.WarmupSetting;
    }

    /**
     * Set <p>预热属性配置</p>
     * @param WarmupSetting <p>预热属性配置</p>
     */
    public void setWarmupSetting(WarmupSetting WarmupSetting) {
        this.WarmupSetting = WarmupSetting;
    }

    /**
     * Get <p>Envoy网关配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GatewayConfig <p>Envoy网关配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GatewayConfig getGatewayConfig() {
        return this.GatewayConfig;
    }

    /**
     * Set <p>Envoy网关配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GatewayConfig <p>Envoy网关配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGatewayConfig(GatewayConfig GatewayConfig) {
        this.GatewayConfig = GatewayConfig;
    }

    /**
     * Get <p>批次是否开启健康检查</p> 
     * @return EnableBatchHealthCheck <p>批次是否开启健康检查</p>
     */
    public Boolean getEnableBatchHealthCheck() {
        return this.EnableBatchHealthCheck;
    }

    /**
     * Set <p>批次是否开启健康检查</p>
     * @param EnableBatchHealthCheck <p>批次是否开启健康检查</p>
     */
    public void setEnableBatchHealthCheck(Boolean EnableBatchHealthCheck) {
        this.EnableBatchHealthCheck = EnableBatchHealthCheck;
    }

    /**
     * Get <p>是否开启cgroup控制内存cpu</p> 
     * @return FilebeatCgroupEnable <p>是否开启cgroup控制内存cpu</p>
     */
    public Boolean getFilebeatCgroupEnable() {
        return this.FilebeatCgroupEnable;
    }

    /**
     * Set <p>是否开启cgroup控制内存cpu</p>
     * @param FilebeatCgroupEnable <p>是否开启cgroup控制内存cpu</p>
     */
    public void setFilebeatCgroupEnable(Boolean FilebeatCgroupEnable) {
        this.FilebeatCgroupEnable = FilebeatCgroupEnable;
    }

    /**
     * Get <p>filebeat使用cpu上限</p> 
     * @return FilebeatMaxCpu <p>filebeat使用cpu上限</p>
     */
    public Float getFilebeatMaxCpu() {
        return this.FilebeatMaxCpu;
    }

    /**
     * Set <p>filebeat使用cpu上限</p>
     * @param FilebeatMaxCpu <p>filebeat使用cpu上限</p>
     */
    public void setFilebeatMaxCpu(Float FilebeatMaxCpu) {
        this.FilebeatMaxCpu = FilebeatMaxCpu;
    }

    /**
     * Get <p>filebeat使用内存上限</p> 
     * @return FilebeatMaxMem <p>filebeat使用内存上限</p>
     */
    public Long getFilebeatMaxMem() {
        return this.FilebeatMaxMem;
    }

    /**
     * Set <p>filebeat使用内存上限</p>
     * @param FilebeatMaxMem <p>filebeat使用内存上限</p>
     */
    public void setFilebeatMaxMem(Long FilebeatMaxMem) {
        this.FilebeatMaxMem = FilebeatMaxMem;
    }

    /**
     * Get <p>仓库ID</p> 
     * @return RepositoryId <p>仓库ID</p>
     */
    public String getRepositoryId() {
        return this.RepositoryId;
    }

    /**
     * Set <p>仓库ID</p>
     * @param RepositoryId <p>仓库ID</p>
     */
    public void setRepositoryId(String RepositoryId) {
        this.RepositoryId = RepositoryId;
    }

    /**
     * Get <p>仓库名称</p> 
     * @return RepositoryName <p>仓库名称</p>
     */
    public String getRepositoryName() {
        return this.RepositoryName;
    }

    /**
     * Set <p>仓库名称</p>
     * @param RepositoryName <p>仓库名称</p>
     */
    public void setRepositoryName(String RepositoryName) {
        this.RepositoryName = RepositoryName;
    }

    /**
     * Get <p>仓库类型</p> 
     * @return RepositoryType <p>仓库类型</p>
     */
    public String getRepositoryType() {
        return this.RepositoryType;
    }

    /**
     * Set <p>仓库类型</p>
     * @param RepositoryType <p>仓库类型</p>
     */
    public void setRepositoryType(String RepositoryType) {
        this.RepositoryType = RepositoryType;
    }

    /**
     * Get <p>是否自动重启</p> 
     * @return LivenessAutoRestart <p>是否自动重启</p>
     */
    public Boolean getLivenessAutoRestart() {
        return this.LivenessAutoRestart;
    }

    /**
     * Set <p>是否自动重启</p>
     * @param LivenessAutoRestart <p>是否自动重启</p>
     */
    public void setLivenessAutoRestart(Boolean LivenessAutoRestart) {
        this.LivenessAutoRestart = LivenessAutoRestart;
    }

    public VmGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VmGroup(VmGroup source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.GroupStatus != null) {
            this.GroupStatus = new String(source.GroupStatus);
        }
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.PackageVersion != null) {
            this.PackageVersion = new String(source.PackageVersion);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.RunInstanceCount != null) {
            this.RunInstanceCount = new Long(source.RunInstanceCount);
        }
        if (source.StartupParameters != null) {
            this.StartupParameters = new String(source.StartupParameters);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.OffInstanceCount != null) {
            this.OffInstanceCount = new Long(source.OffInstanceCount);
        }
        if (source.GroupDesc != null) {
            this.GroupDesc = new String(source.GroupDesc);
        }
        if (source.MicroserviceType != null) {
            this.MicroserviceType = new String(source.MicroserviceType);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new String(source.ApplicationType);
        }
        if (source.GroupResourceType != null) {
            this.GroupResourceType = new String(source.GroupResourceType);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new Long(source.UpdatedTime);
        }
        if (source.DeployDesc != null) {
            this.DeployDesc = new String(source.DeployDesc);
        }
        if (source.UpdateType != null) {
            this.UpdateType = new Long(source.UpdateType);
        }
        if (source.DeployBetaEnable != null) {
            this.DeployBetaEnable = new Boolean(source.DeployBetaEnable);
        }
        if (source.DeployBatch != null) {
            this.DeployBatch = new Float[source.DeployBatch.length];
            for (int i = 0; i < source.DeployBatch.length; i++) {
                this.DeployBatch[i] = new Float(source.DeployBatch[i]);
            }
        }
        if (source.DeployExeMode != null) {
            this.DeployExeMode = new String(source.DeployExeMode);
        }
        if (source.DeployWaitTime != null) {
            this.DeployWaitTime = new Long(source.DeployWaitTime);
        }
        if (source.EnableHealthCheck != null) {
            this.EnableHealthCheck = new Boolean(source.EnableHealthCheck);
        }
        if (source.HealthCheckSettings != null) {
            this.HealthCheckSettings = new HealthCheckSettings(source.HealthCheckSettings);
        }
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.StartScript != null) {
            this.StartScript = new String(source.StartScript);
        }
        if (source.StopScript != null) {
            this.StopScript = new String(source.StopScript);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.AgentProfileList != null) {
            this.AgentProfileList = new AgentProfile[source.AgentProfileList.length];
            for (int i = 0; i < source.AgentProfileList.length; i++) {
                this.AgentProfileList[i] = new AgentProfile(source.AgentProfileList[i]);
            }
        }
        if (source.WarmupSetting != null) {
            this.WarmupSetting = new WarmupSetting(source.WarmupSetting);
        }
        if (source.GatewayConfig != null) {
            this.GatewayConfig = new GatewayConfig(source.GatewayConfig);
        }
        if (source.EnableBatchHealthCheck != null) {
            this.EnableBatchHealthCheck = new Boolean(source.EnableBatchHealthCheck);
        }
        if (source.FilebeatCgroupEnable != null) {
            this.FilebeatCgroupEnable = new Boolean(source.FilebeatCgroupEnable);
        }
        if (source.FilebeatMaxCpu != null) {
            this.FilebeatMaxCpu = new Float(source.FilebeatMaxCpu);
        }
        if (source.FilebeatMaxMem != null) {
            this.FilebeatMaxMem = new Long(source.FilebeatMaxMem);
        }
        if (source.RepositoryId != null) {
            this.RepositoryId = new String(source.RepositoryId);
        }
        if (source.RepositoryName != null) {
            this.RepositoryName = new String(source.RepositoryName);
        }
        if (source.RepositoryType != null) {
            this.RepositoryType = new String(source.RepositoryType);
        }
        if (source.LivenessAutoRestart != null) {
            this.LivenessAutoRestart = new Boolean(source.LivenessAutoRestart);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "GroupStatus", this.GroupStatus);
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "PackageVersion", this.PackageVersion);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "RunInstanceCount", this.RunInstanceCount);
        this.setParamSimple(map, prefix + "StartupParameters", this.StartupParameters);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "OffInstanceCount", this.OffInstanceCount);
        this.setParamSimple(map, prefix + "GroupDesc", this.GroupDesc);
        this.setParamSimple(map, prefix + "MicroserviceType", this.MicroserviceType);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "GroupResourceType", this.GroupResourceType);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamSimple(map, prefix + "DeployDesc", this.DeployDesc);
        this.setParamSimple(map, prefix + "UpdateType", this.UpdateType);
        this.setParamSimple(map, prefix + "DeployBetaEnable", this.DeployBetaEnable);
        this.setParamArraySimple(map, prefix + "DeployBatch.", this.DeployBatch);
        this.setParamSimple(map, prefix + "DeployExeMode", this.DeployExeMode);
        this.setParamSimple(map, prefix + "DeployWaitTime", this.DeployWaitTime);
        this.setParamSimple(map, prefix + "EnableHealthCheck", this.EnableHealthCheck);
        this.setParamObj(map, prefix + "HealthCheckSettings.", this.HealthCheckSettings);
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamSimple(map, prefix + "StartScript", this.StartScript);
        this.setParamSimple(map, prefix + "StopScript", this.StopScript);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamArrayObj(map, prefix + "AgentProfileList.", this.AgentProfileList);
        this.setParamObj(map, prefix + "WarmupSetting.", this.WarmupSetting);
        this.setParamObj(map, prefix + "GatewayConfig.", this.GatewayConfig);
        this.setParamSimple(map, prefix + "EnableBatchHealthCheck", this.EnableBatchHealthCheck);
        this.setParamSimple(map, prefix + "FilebeatCgroupEnable", this.FilebeatCgroupEnable);
        this.setParamSimple(map, prefix + "FilebeatMaxCpu", this.FilebeatMaxCpu);
        this.setParamSimple(map, prefix + "FilebeatMaxMem", this.FilebeatMaxMem);
        this.setParamSimple(map, prefix + "RepositoryId", this.RepositoryId);
        this.setParamSimple(map, prefix + "RepositoryName", this.RepositoryName);
        this.setParamSimple(map, prefix + "RepositoryType", this.RepositoryType);
        this.setParamSimple(map, prefix + "LivenessAutoRestart", this.LivenessAutoRestart);

    }
}

