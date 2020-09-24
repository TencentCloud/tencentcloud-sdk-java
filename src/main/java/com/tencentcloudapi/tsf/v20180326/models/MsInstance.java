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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MsInstance extends AbstractModel{

    /**
    * 机器实例ID信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 机器实例名称信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 服务运行的端口号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 机器实例内网IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LanIp")
    @Expose
    private String LanIp;

    /**
    * 机器实例外网IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * 机器可用状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceAvailableStatus")
    @Expose
    private String InstanceAvailableStatus;

    /**
    * 服务运行状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceInstanceStatus")
    @Expose
    private String ServiceInstanceStatus;

    /**
    * 应用ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 应用名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * 集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 部署组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 部署组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 机器TSF可用状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * 健康检查URL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthCheckUrl")
    @Expose
    private String HealthCheckUrl;

    /**
    * 集群类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 应用程序包版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationPackageVersion")
    @Expose
    private String ApplicationPackageVersion;

    /**
    * 应用类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * 服务状态，passing 在线，critical 离线
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceStatus")
    @Expose
    private String ServiceStatus;

    /**
    * 注册时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegistrationTime")
    @Expose
    private Long RegistrationTime;

    /**
    * 上次心跳时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastHeartbeatTime")
    @Expose
    private Long LastHeartbeatTime;

    /**
    * 实例注册id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegistrationId")
    @Expose
    private Long RegistrationId;

    /**
    * 屏蔽状态，hidden 为屏蔽，unhidden 为未屏蔽
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HiddenStatus")
    @Expose
    private String HiddenStatus;

    /**
     * Get 机器实例ID信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 机器实例ID信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 机器实例ID信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 机器实例ID信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 机器实例名称信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 机器实例名称信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 机器实例名称信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 机器实例名称信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 服务运行的端口号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 服务运行的端口号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 服务运行的端口号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 服务运行的端口号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 机器实例内网IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LanIp 机器实例内网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLanIp() {
        return this.LanIp;
    }

    /**
     * Set 机器实例内网IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param LanIp 机器实例内网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLanIp(String LanIp) {
        this.LanIp = LanIp;
    }

    /**
     * Get 机器实例外网IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WanIp 机器实例外网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set 机器实例外网IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param WanIp 机器实例外网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get 机器可用状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceAvailableStatus 机器可用状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceAvailableStatus() {
        return this.InstanceAvailableStatus;
    }

    /**
     * Set 机器可用状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceAvailableStatus 机器可用状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceAvailableStatus(String InstanceAvailableStatus) {
        this.InstanceAvailableStatus = InstanceAvailableStatus;
    }

    /**
     * Get 服务运行状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceInstanceStatus 服务运行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceInstanceStatus() {
        return this.ServiceInstanceStatus;
    }

    /**
     * Set 服务运行状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceInstanceStatus 服务运行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceInstanceStatus(String ServiceInstanceStatus) {
        this.ServiceInstanceStatus = ServiceInstanceStatus;
    }

    /**
     * Get 应用ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationId 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationId 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 应用名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationName 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationName 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
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
     * Get 命名空间ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceId 命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceId 命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NamespaceName 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceName 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get 部署组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId 部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 部署组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName 部署组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 部署组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName 部署组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 机器TSF可用状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceStatus 机器TSF可用状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 机器TSF可用状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceStatus 机器TSF可用状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get 健康检查URL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthCheckUrl 健康检查URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHealthCheckUrl() {
        return this.HealthCheckUrl;
    }

    /**
     * Set 健康检查URL
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthCheckUrl 健康检查URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthCheckUrl(String HealthCheckUrl) {
        this.HealthCheckUrl = HealthCheckUrl;
    }

    /**
     * Get 集群类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterType 集群类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set 集群类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterType 集群类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get 应用程序包版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationPackageVersion 应用程序包版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationPackageVersion() {
        return this.ApplicationPackageVersion;
    }

    /**
     * Set 应用程序包版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationPackageVersion 应用程序包版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationPackageVersion(String ApplicationPackageVersion) {
        this.ApplicationPackageVersion = ApplicationPackageVersion;
    }

    /**
     * Get 应用类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationType 应用类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set 应用类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationType 应用类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get 服务状态，passing 在线，critical 离线
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceStatus 服务状态，passing 在线，critical 离线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceStatus() {
        return this.ServiceStatus;
    }

    /**
     * Set 服务状态，passing 在线，critical 离线
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceStatus 服务状态，passing 在线，critical 离线
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceStatus(String ServiceStatus) {
        this.ServiceStatus = ServiceStatus;
    }

    /**
     * Get 注册时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegistrationTime 注册时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRegistrationTime() {
        return this.RegistrationTime;
    }

    /**
     * Set 注册时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegistrationTime 注册时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegistrationTime(Long RegistrationTime) {
        this.RegistrationTime = RegistrationTime;
    }

    /**
     * Get 上次心跳时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastHeartbeatTime 上次心跳时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastHeartbeatTime() {
        return this.LastHeartbeatTime;
    }

    /**
     * Set 上次心跳时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastHeartbeatTime 上次心跳时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastHeartbeatTime(Long LastHeartbeatTime) {
        this.LastHeartbeatTime = LastHeartbeatTime;
    }

    /**
     * Get 实例注册id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegistrationId 实例注册id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRegistrationId() {
        return this.RegistrationId;
    }

    /**
     * Set 实例注册id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegistrationId 实例注册id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegistrationId(Long RegistrationId) {
        this.RegistrationId = RegistrationId;
    }

    /**
     * Get 屏蔽状态，hidden 为屏蔽，unhidden 为未屏蔽
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HiddenStatus 屏蔽状态，hidden 为屏蔽，unhidden 为未屏蔽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHiddenStatus() {
        return this.HiddenStatus;
    }

    /**
     * Set 屏蔽状态，hidden 为屏蔽，unhidden 为未屏蔽
注意：此字段可能返回 null，表示取不到有效值。
     * @param HiddenStatus 屏蔽状态，hidden 为屏蔽，unhidden 为未屏蔽
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHiddenStatus(String HiddenStatus) {
        this.HiddenStatus = HiddenStatus;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "LanIp", this.LanIp);
        this.setParamSimple(map, prefix + "WanIp", this.WanIp);
        this.setParamSimple(map, prefix + "InstanceAvailableStatus", this.InstanceAvailableStatus);
        this.setParamSimple(map, prefix + "ServiceInstanceStatus", this.ServiceInstanceStatus);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "HealthCheckUrl", this.HealthCheckUrl);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ApplicationPackageVersion", this.ApplicationPackageVersion);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "ServiceStatus", this.ServiceStatus);
        this.setParamSimple(map, prefix + "RegistrationTime", this.RegistrationTime);
        this.setParamSimple(map, prefix + "LastHeartbeatTime", this.LastHeartbeatTime);
        this.setParamSimple(map, prefix + "RegistrationId", this.RegistrationId);
        this.setParamSimple(map, prefix + "HiddenStatus", this.HiddenStatus);

    }
}

