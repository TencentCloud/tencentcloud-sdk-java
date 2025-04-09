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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ContainerGroupDetail extends AbstractModel {

    /**
    * 部署组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 分组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 实例总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * 已启动实例总数
    */
    @SerializedName("CurrentNum")
    @Expose
    private Long CurrentNum;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 镜像server
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Server")
    @Expose
    private String Server;

    /**
    * 镜像名，如/tsf/nginx
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reponame")
    @Expose
    private String Reponame;

    /**
    * 镜像版本名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名称
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 命名空间ID
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 命名空间名称
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 负载均衡ip
    */
    @SerializedName("LbIp")
    @Expose
    private String LbIp;

    /**
    * 应用类型
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
    * Service ip
    */
    @SerializedName("ClusterIp")
    @Expose
    private String ClusterIp;

    /**
    * NodePort端口，只有公网和NodePort访问方式才有值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodePort")
    @Expose
    private Long NodePort;

    /**
    * 最大分配的 CPU 核数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuLimit")
    @Expose
    private String CpuLimit;

    /**
    * 最大分配的内存 MiB 数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemLimit")
    @Expose
    private String MemLimit;

    /**
    * 0:公网 1:集群内访问 2：NodePort
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * 更新方式：0:快速更新 1:滚动更新
    */
    @SerializedName("UpdateType")
    @Expose
    private Long UpdateType;

    /**
    * 更新间隔,单位秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateIvl")
    @Expose
    private Long UpdateIvl;

    /**
    * 端口数组对象
    */
    @SerializedName("ProtocolPorts")
    @Expose
    private ProtocolPort [] ProtocolPorts;

    /**
    * 环境变量数组对象
    */
    @SerializedName("Envs")
    @Expose
    private Env [] Envs;

    /**
    * 应用名称
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * pod错误信息描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 部署组状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 服务类型
    */
    @SerializedName("MicroserviceType")
    @Expose
    private String MicroserviceType;

    /**
    * 初始分配的 CPU 核数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuRequest")
    @Expose
    private String CpuRequest;

    /**
    * 初始分配的内存 MiB 数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemRequest")
    @Expose
    private String MemRequest;

    /**
    * 子网id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 部署组资源类型
    */
    @SerializedName("GroupResourceType")
    @Expose
    private String GroupResourceType;

    /**
    * 部署组实例个数
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * 部署组更新时间戳
    */
    @SerializedName("UpdatedTime")
    @Expose
    private Long UpdatedTime;

    /**
    * kubernetes滚动更新策略的MaxSurge参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxSurge")
    @Expose
    private String MaxSurge;

    /**
    * kubernetes滚动更新策略的MaxUnavailable参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxUnavailable")
    @Expose
    private String MaxUnavailable;

    /**
    * 部署组健康检查设置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthCheckSettings")
    @Expose
    private HealthCheckSettings HealthCheckSettings;

    /**
    * 允许PlainYamlDeploy
    */
    @SerializedName("AllowPlainYamlDeploy")
    @Expose
    private Boolean AllowPlainYamlDeploy;

    /**
    * 是否不等于ServiceConfig
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsNotEqualServiceConfig")
    @Expose
    private Boolean IsNotEqualServiceConfig;

    /**
    * 仓库名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * 别名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
     * Get 部署组ID 
     * @return GroupId 部署组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 部署组ID
     * @param GroupId 部署组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 分组名称 
     * @return GroupName 分组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 分组名称
     * @param GroupName 分组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 实例总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceNum 实例总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set 实例总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceNum 实例总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    /**
     * Get 已启动实例总数 
     * @return CurrentNum 已启动实例总数
     */
    public Long getCurrentNum() {
        return this.CurrentNum;
    }

    /**
     * Set 已启动实例总数
     * @param CurrentNum 已启动实例总数
     */
    public void setCurrentNum(Long CurrentNum) {
        this.CurrentNum = CurrentNum;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 镜像server
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Server 镜像server
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServer() {
        return this.Server;
    }

    /**
     * Set 镜像server
注意：此字段可能返回 null，表示取不到有效值。
     * @param Server 镜像server
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServer(String Server) {
        this.Server = Server;
    }

    /**
     * Get 镜像名，如/tsf/nginx
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reponame 镜像名，如/tsf/nginx
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReponame() {
        return this.Reponame;
    }

    /**
     * Set 镜像名，如/tsf/nginx
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reponame 镜像名，如/tsf/nginx
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReponame(String Reponame) {
        this.Reponame = Reponame;
    }

    /**
     * Get 镜像版本名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagName 镜像版本名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * Set 镜像版本名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagName 镜像版本名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
    }

    /**
     * Get 集群ID 
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 集群名称 
     * @return ClusterName 集群名称
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 集群名称
     * @param ClusterName 集群名称
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 命名空间ID 
     * @return NamespaceId 命名空间ID
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间ID
     * @param NamespaceId 命名空间ID
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 命名空间名称 
     * @return NamespaceName 命名空间名称
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set 命名空间名称
     * @param NamespaceName 命名空间名称
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get 应用ID 
     * @return ApplicationId 应用ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用ID
     * @param ApplicationId 应用ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 负载均衡ip 
     * @return LbIp 负载均衡ip
     */
    public String getLbIp() {
        return this.LbIp;
    }

    /**
     * Set 负载均衡ip
     * @param LbIp 负载均衡ip
     */
    public void setLbIp(String LbIp) {
        this.LbIp = LbIp;
    }

    /**
     * Get 应用类型 
     * @return ApplicationType 应用类型
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * Set 应用类型
     * @param ApplicationType 应用类型
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * Get Service ip 
     * @return ClusterIp Service ip
     */
    public String getClusterIp() {
        return this.ClusterIp;
    }

    /**
     * Set Service ip
     * @param ClusterIp Service ip
     */
    public void setClusterIp(String ClusterIp) {
        this.ClusterIp = ClusterIp;
    }

    /**
     * Get NodePort端口，只有公网和NodePort访问方式才有值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodePort NodePort端口，只有公网和NodePort访问方式才有值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNodePort() {
        return this.NodePort;
    }

    /**
     * Set NodePort端口，只有公网和NodePort访问方式才有值
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodePort NodePort端口，只有公网和NodePort访问方式才有值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodePort(Long NodePort) {
        this.NodePort = NodePort;
    }

    /**
     * Get 最大分配的 CPU 核数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuLimit 最大分配的 CPU 核数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCpuLimit() {
        return this.CpuLimit;
    }

    /**
     * Set 最大分配的 CPU 核数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuLimit 最大分配的 CPU 核数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuLimit(String CpuLimit) {
        this.CpuLimit = CpuLimit;
    }

    /**
     * Get 最大分配的内存 MiB 数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemLimit 最大分配的内存 MiB 数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemLimit() {
        return this.MemLimit;
    }

    /**
     * Set 最大分配的内存 MiB 数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemLimit 最大分配的内存 MiB 数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemLimit(String MemLimit) {
        this.MemLimit = MemLimit;
    }

    /**
     * Get 0:公网 1:集群内访问 2：NodePort
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccessType 0:公网 1:集群内访问 2：NodePort
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 0:公网 1:集群内访问 2：NodePort
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccessType 0:公网 1:集群内访问 2：NodePort
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get 更新方式：0:快速更新 1:滚动更新 
     * @return UpdateType 更新方式：0:快速更新 1:滚动更新
     */
    public Long getUpdateType() {
        return this.UpdateType;
    }

    /**
     * Set 更新方式：0:快速更新 1:滚动更新
     * @param UpdateType 更新方式：0:快速更新 1:滚动更新
     */
    public void setUpdateType(Long UpdateType) {
        this.UpdateType = UpdateType;
    }

    /**
     * Get 更新间隔,单位秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateIvl 更新间隔,单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateIvl() {
        return this.UpdateIvl;
    }

    /**
     * Set 更新间隔,单位秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateIvl 更新间隔,单位秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateIvl(Long UpdateIvl) {
        this.UpdateIvl = UpdateIvl;
    }

    /**
     * Get 端口数组对象 
     * @return ProtocolPorts 端口数组对象
     */
    public ProtocolPort [] getProtocolPorts() {
        return this.ProtocolPorts;
    }

    /**
     * Set 端口数组对象
     * @param ProtocolPorts 端口数组对象
     */
    public void setProtocolPorts(ProtocolPort [] ProtocolPorts) {
        this.ProtocolPorts = ProtocolPorts;
    }

    /**
     * Get 环境变量数组对象 
     * @return Envs 环境变量数组对象
     */
    public Env [] getEnvs() {
        return this.Envs;
    }

    /**
     * Set 环境变量数组对象
     * @param Envs 环境变量数组对象
     */
    public void setEnvs(Env [] Envs) {
        this.Envs = Envs;
    }

    /**
     * Get 应用名称 
     * @return ApplicationName 应用名称
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 应用名称
     * @param ApplicationName 应用名称
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get pod错误信息描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message pod错误信息描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set pod错误信息描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message pod错误信息描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 部署组状态 
     * @return Status 部署组状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 部署组状态
     * @param Status 部署组状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 服务类型 
     * @return MicroserviceType 服务类型
     */
    public String getMicroserviceType() {
        return this.MicroserviceType;
    }

    /**
     * Set 服务类型
     * @param MicroserviceType 服务类型
     */
    public void setMicroserviceType(String MicroserviceType) {
        this.MicroserviceType = MicroserviceType;
    }

    /**
     * Get 初始分配的 CPU 核数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuRequest 初始分配的 CPU 核数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCpuRequest() {
        return this.CpuRequest;
    }

    /**
     * Set 初始分配的 CPU 核数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuRequest 初始分配的 CPU 核数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuRequest(String CpuRequest) {
        this.CpuRequest = CpuRequest;
    }

    /**
     * Get 初始分配的内存 MiB 数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemRequest 初始分配的内存 MiB 数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemRequest() {
        return this.MemRequest;
    }

    /**
     * Set 初始分配的内存 MiB 数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemRequest 初始分配的内存 MiB 数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemRequest(String MemRequest) {
        this.MemRequest = MemRequest;
    }

    /**
     * Get 子网id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 部署组资源类型 
     * @return GroupResourceType 部署组资源类型
     */
    public String getGroupResourceType() {
        return this.GroupResourceType;
    }

    /**
     * Set 部署组资源类型
     * @param GroupResourceType 部署组资源类型
     */
    public void setGroupResourceType(String GroupResourceType) {
        this.GroupResourceType = GroupResourceType;
    }

    /**
     * Get 部署组实例个数 
     * @return InstanceCount 部署组实例个数
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set 部署组实例个数
     * @param InstanceCount 部署组实例个数
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get 部署组更新时间戳 
     * @return UpdatedTime 部署组更新时间戳
     */
    public Long getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 部署组更新时间戳
     * @param UpdatedTime 部署组更新时间戳
     */
    public void setUpdatedTime(Long UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get kubernetes滚动更新策略的MaxSurge参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxSurge kubernetes滚动更新策略的MaxSurge参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMaxSurge() {
        return this.MaxSurge;
    }

    /**
     * Set kubernetes滚动更新策略的MaxSurge参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxSurge kubernetes滚动更新策略的MaxSurge参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxSurge(String MaxSurge) {
        this.MaxSurge = MaxSurge;
    }

    /**
     * Get kubernetes滚动更新策略的MaxUnavailable参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxUnavailable kubernetes滚动更新策略的MaxUnavailable参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMaxUnavailable() {
        return this.MaxUnavailable;
    }

    /**
     * Set kubernetes滚动更新策略的MaxUnavailable参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxUnavailable kubernetes滚动更新策略的MaxUnavailable参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxUnavailable(String MaxUnavailable) {
        this.MaxUnavailable = MaxUnavailable;
    }

    /**
     * Get 部署组健康检查设置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthCheckSettings 部署组健康检查设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HealthCheckSettings getHealthCheckSettings() {
        return this.HealthCheckSettings;
    }

    /**
     * Set 部署组健康检查设置
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthCheckSettings 部署组健康检查设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthCheckSettings(HealthCheckSettings HealthCheckSettings) {
        this.HealthCheckSettings = HealthCheckSettings;
    }

    /**
     * Get 允许PlainYamlDeploy 
     * @return AllowPlainYamlDeploy 允许PlainYamlDeploy
     */
    public Boolean getAllowPlainYamlDeploy() {
        return this.AllowPlainYamlDeploy;
    }

    /**
     * Set 允许PlainYamlDeploy
     * @param AllowPlainYamlDeploy 允许PlainYamlDeploy
     */
    public void setAllowPlainYamlDeploy(Boolean AllowPlainYamlDeploy) {
        this.AllowPlainYamlDeploy = AllowPlainYamlDeploy;
    }

    /**
     * Get 是否不等于ServiceConfig
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsNotEqualServiceConfig 是否不等于ServiceConfig
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsNotEqualServiceConfig() {
        return this.IsNotEqualServiceConfig;
    }

    /**
     * Set 是否不等于ServiceConfig
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsNotEqualServiceConfig 是否不等于ServiceConfig
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsNotEqualServiceConfig(Boolean IsNotEqualServiceConfig) {
        this.IsNotEqualServiceConfig = IsNotEqualServiceConfig;
    }

    /**
     * Get 仓库名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepoName 仓库名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set 仓库名
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepoName 仓库名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    /**
     * Get 别名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Alias 别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 别名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Alias 别名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public ContainerGroupDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerGroupDetail(ContainerGroupDetail source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.InstanceNum != null) {
            this.InstanceNum = new Long(source.InstanceNum);
        }
        if (source.CurrentNum != null) {
            this.CurrentNum = new Long(source.CurrentNum);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Server != null) {
            this.Server = new String(source.Server);
        }
        if (source.Reponame != null) {
            this.Reponame = new String(source.Reponame);
        }
        if (source.TagName != null) {
            this.TagName = new String(source.TagName);
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
        if (source.LbIp != null) {
            this.LbIp = new String(source.LbIp);
        }
        if (source.ApplicationType != null) {
            this.ApplicationType = new String(source.ApplicationType);
        }
        if (source.ClusterIp != null) {
            this.ClusterIp = new String(source.ClusterIp);
        }
        if (source.NodePort != null) {
            this.NodePort = new Long(source.NodePort);
        }
        if (source.CpuLimit != null) {
            this.CpuLimit = new String(source.CpuLimit);
        }
        if (source.MemLimit != null) {
            this.MemLimit = new String(source.MemLimit);
        }
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
        }
        if (source.UpdateType != null) {
            this.UpdateType = new Long(source.UpdateType);
        }
        if (source.UpdateIvl != null) {
            this.UpdateIvl = new Long(source.UpdateIvl);
        }
        if (source.ProtocolPorts != null) {
            this.ProtocolPorts = new ProtocolPort[source.ProtocolPorts.length];
            for (int i = 0; i < source.ProtocolPorts.length; i++) {
                this.ProtocolPorts[i] = new ProtocolPort(source.ProtocolPorts[i]);
            }
        }
        if (source.Envs != null) {
            this.Envs = new Env[source.Envs.length];
            for (int i = 0; i < source.Envs.length; i++) {
                this.Envs[i] = new Env(source.Envs[i]);
            }
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.MicroserviceType != null) {
            this.MicroserviceType = new String(source.MicroserviceType);
        }
        if (source.CpuRequest != null) {
            this.CpuRequest = new String(source.CpuRequest);
        }
        if (source.MemRequest != null) {
            this.MemRequest = new String(source.MemRequest);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.GroupResourceType != null) {
            this.GroupResourceType = new String(source.GroupResourceType);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new Long(source.UpdatedTime);
        }
        if (source.MaxSurge != null) {
            this.MaxSurge = new String(source.MaxSurge);
        }
        if (source.MaxUnavailable != null) {
            this.MaxUnavailable = new String(source.MaxUnavailable);
        }
        if (source.HealthCheckSettings != null) {
            this.HealthCheckSettings = new HealthCheckSettings(source.HealthCheckSettings);
        }
        if (source.AllowPlainYamlDeploy != null) {
            this.AllowPlainYamlDeploy = new Boolean(source.AllowPlainYamlDeploy);
        }
        if (source.IsNotEqualServiceConfig != null) {
            this.IsNotEqualServiceConfig = new Boolean(source.IsNotEqualServiceConfig);
        }
        if (source.RepoName != null) {
            this.RepoName = new String(source.RepoName);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);
        this.setParamSimple(map, prefix + "CurrentNum", this.CurrentNum);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Server", this.Server);
        this.setParamSimple(map, prefix + "Reponame", this.Reponame);
        this.setParamSimple(map, prefix + "TagName", this.TagName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "LbIp", this.LbIp);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);
        this.setParamSimple(map, prefix + "ClusterIp", this.ClusterIp);
        this.setParamSimple(map, prefix + "NodePort", this.NodePort);
        this.setParamSimple(map, prefix + "CpuLimit", this.CpuLimit);
        this.setParamSimple(map, prefix + "MemLimit", this.MemLimit);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamSimple(map, prefix + "UpdateType", this.UpdateType);
        this.setParamSimple(map, prefix + "UpdateIvl", this.UpdateIvl);
        this.setParamArrayObj(map, prefix + "ProtocolPorts.", this.ProtocolPorts);
        this.setParamArrayObj(map, prefix + "Envs.", this.Envs);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "MicroserviceType", this.MicroserviceType);
        this.setParamSimple(map, prefix + "CpuRequest", this.CpuRequest);
        this.setParamSimple(map, prefix + "MemRequest", this.MemRequest);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "GroupResourceType", this.GroupResourceType);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamSimple(map, prefix + "MaxSurge", this.MaxSurge);
        this.setParamSimple(map, prefix + "MaxUnavailable", this.MaxUnavailable);
        this.setParamObj(map, prefix + "HealthCheckSettings.", this.HealthCheckSettings);
        this.setParamSimple(map, prefix + "AllowPlainYamlDeploy", this.AllowPlainYamlDeploy);
        this.setParamSimple(map, prefix + "IsNotEqualServiceConfig", this.IsNotEqualServiceConfig);
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "Alias", this.Alias);

    }
}

