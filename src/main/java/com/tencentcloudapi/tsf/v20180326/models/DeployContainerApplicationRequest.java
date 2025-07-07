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

public class DeployContainerApplicationRequest extends AbstractModel {

    /**
    * 应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 可观测配置
    */
    @SerializedName("ObservabilityConfig")
    @Expose
    private ContainerGroupObservabilityConfig ObservabilityConfig;

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 部署组ID，分组唯一标识
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 业务容器的环境变量参数
    */
    @SerializedName("Envs")
    @Expose
    private Env [] Envs;

    /**
    * 业务容器的挂载信息
    */
    @SerializedName("VolumeMountInfoList")
    @Expose
    private VolumeMountInfo [] VolumeMountInfoList;

    /**
    * 业务主容器生命周期钩子列表
    */
    @SerializedName("LifeCycleHookList")
    @Expose
    private LifeCycleHook [] LifeCycleHookList;

    /**
    * 附属容器列表
    */
    @SerializedName("AdditionalContainerList")
    @Expose
    private ContainerInfo [] AdditionalContainerList;

    /**
    * 容器卷信息
    */
    @SerializedName("VolumeInfoList")
    @Expose
    private VolumeInfo [] VolumeInfoList;

    /**
    * Service访问配置列表
    */
    @SerializedName("ServiceSettingList")
    @Expose
    private ServiceSetting [] ServiceSettingList;

    /**
    * 备注
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 部署组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 标签列表
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 容器类型
    */
    @SerializedName("ContainerKind")
    @Expose
    private String ContainerKind;

    /**
    * 业务容器的 镜像Server ccr.ccs.tencentyun.com
    */
    @SerializedName("Server")
    @Expose
    private String Server;

    /**
    * 业务容器的镜像名
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * 仓库类型
    */
    @SerializedName("RepoType")
    @Expose
    private String RepoType;

    /**
    * TCR仓库信息
    */
    @SerializedName("TcrRepoInfo")
    @Expose
    private TcrRepoInfo TcrRepoInfo;

    /**
    * 容器访问凭证名称
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * 业务容器的镜像版本号
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
    * 健康检查
    */
    @SerializedName("HealthCheckSettings")
    @Expose
    private HealthCheckSettings HealthCheckSettings;

    /**
    * 业务容器的 cpu  request
    */
    @SerializedName("CpuRequest")
    @Expose
    private String CpuRequest;

    /**
    * 业务容器的 cpu limit
    */
    @SerializedName("CpuLimit")
    @Expose
    private String CpuLimit;

    /**
    * 业务容器的 mem request
    */
    @SerializedName("MemRequest")
    @Expose
    private String MemRequest;

    /**
    * 业务容器的 mem limit
    */
    @SerializedName("MemLimit")
    @Expose
    private String MemLimit;

    /**
    * 业务容器的 jvm 参数
    */
    @SerializedName("JvmOpts")
    @Expose
    private String JvmOpts;

    /**
    * 是否为初始化容器 业务主容器不能为初始化容
    */
    @SerializedName("InitContainerEnable")
    @Expose
    private Boolean InitContainerEnable;

    /**
    * 业务主容器是否为特权容器
    */
    @SerializedName("PrivilegeContainerEnable")
    @Expose
    private Boolean PrivilegeContainerEnable;

    /**
    * 业务主容器运行命令(转base64)
    */
    @SerializedName("RunCommand")
    @Expose
    private String RunCommand;

    /**
    * 业务主容器运行参数(转base64)
    */
    @SerializedName("RunArg")
    @Expose
    private String RunArg;

    /**
    * 实例数量
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * 调度策略
    */
    @SerializedName("SchedulingStrategy")
    @Expose
    private SchedulingStrategy SchedulingStrategy;

    /**
    * 重启策略
    */
    @SerializedName("RestartPolicy")
    @Expose
    private String RestartPolicy;

    /**
    * 服务治理配置
    */
    @SerializedName("ServiceSpecEncode")
    @Expose
    private String ServiceSpecEncode;

    /**
    * istio容器的 mem Request
    */
    @SerializedName("IstioMemRequest")
    @Expose
    private String IstioMemRequest;

    /**
    *  istio容器的 cpu Request
    */
    @SerializedName("IstioCpuRequest")
    @Expose
    private String IstioCpuRequest;

    /**
    * istio容器的 mem Limit
    */
    @SerializedName("IstioMemLimit")
    @Expose
    private String IstioMemLimit;

    /**
    * istio容器的 cpu Limit
    */
    @SerializedName("IstioCpuLimit")
    @Expose
    private String IstioCpuLimit;

    /**
    * 服务治理配置
    */
    @SerializedName("ServiceGovernanceConfig")
    @Expose
    private ContainerGroupServiceGovernanceConfig ServiceGovernanceConfig;

    /**
    * agent容器的 mem Request
    */
    @SerializedName("AgentMemRequest")
    @Expose
    private String AgentMemRequest;

    /**
    * agent容器的 cpu Request
    */
    @SerializedName("AgentCpuRequest")
    @Expose
    private String AgentCpuRequest;

    /**
    * agent容器的 mem Limit
    */
    @SerializedName("AgentMemLimit")
    @Expose
    private String AgentMemLimit;

    /**
    * agent容器的 cpu Limit
    */
    @SerializedName("AgentCpuLimit")
    @Expose
    private String AgentCpuLimit;

    /**
    * 发布策略(0表示快速更新，1表示滚动更新。默认值为0)
    */
    @SerializedName("UpdateType")
    @Expose
    private Long UpdateType;

    /**
    * 更新间隔,单位秒
    */
    @SerializedName("UpdateIvl")
    @Expose
    private Long UpdateIvl;

    /**
    * 对应更新策略和策略配置参数
    */
    @SerializedName("MaxSurge")
    @Expose
    private String MaxSurge;

    /**
    * 对应更新策略和策略配置参数
    */
    @SerializedName("MaxUnavailable")
    @Expose
    private String MaxUnavailable;

    /**
    * 预热参数配置
    */
    @SerializedName("WarmupSetting")
    @Expose
    private WarmupSetting WarmupSetting;

    /**
    * 配置模版ID
    */
    @SerializedName("ConfigTemplateId")
    @Expose
    private String ConfigTemplateId;

    /**
    * 配置模版Version
    */
    @SerializedName("ConfigTemplateVersion")
    @Expose
    private Long ConfigTemplateVersion;

    /**
    * 是否清除数据卷信息
    */
    @SerializedName("VolumeClean")
    @Expose
    private Boolean VolumeClean;

    /**
    * 命名空间Id
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 是否部署agent容器
    */
    @SerializedName("DeployAgent")
    @Expose
    private Boolean DeployAgent;

    /**
    * javaagent信息: SERVICE_AGENT/OT_AGENT
    */
    @SerializedName("AgentProfileList")
    @Expose
    private AgentProfile [] AgentProfileList;

    /**
    * 是否清除Service信息
    */
    @SerializedName("ServiceClean")
    @Expose
    private Boolean ServiceClean;

    /**
    * 是否清除Env信息
    */
    @SerializedName("EnvClean")
    @Expose
    private Boolean EnvClean;

    /**
    * 本次部署的描述信息
    */
    @SerializedName("DeployDesc")
    @Expose
    private String DeployDesc;

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
     * Get 可观测配置 
     * @return ObservabilityConfig 可观测配置
     */
    public ContainerGroupObservabilityConfig getObservabilityConfig() {
        return this.ObservabilityConfig;
    }

    /**
     * Set 可观测配置
     * @param ObservabilityConfig 可观测配置
     */
    public void setObservabilityConfig(ContainerGroupObservabilityConfig ObservabilityConfig) {
        this.ObservabilityConfig = ObservabilityConfig;
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
     * Get 部署组ID，分组唯一标识 
     * @return GroupId 部署组ID，分组唯一标识
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 部署组ID，分组唯一标识
     * @param GroupId 部署组ID，分组唯一标识
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 业务容器的环境变量参数 
     * @return Envs 业务容器的环境变量参数
     */
    public Env [] getEnvs() {
        return this.Envs;
    }

    /**
     * Set 业务容器的环境变量参数
     * @param Envs 业务容器的环境变量参数
     */
    public void setEnvs(Env [] Envs) {
        this.Envs = Envs;
    }

    /**
     * Get 业务容器的挂载信息 
     * @return VolumeMountInfoList 业务容器的挂载信息
     */
    public VolumeMountInfo [] getVolumeMountInfoList() {
        return this.VolumeMountInfoList;
    }

    /**
     * Set 业务容器的挂载信息
     * @param VolumeMountInfoList 业务容器的挂载信息
     */
    public void setVolumeMountInfoList(VolumeMountInfo [] VolumeMountInfoList) {
        this.VolumeMountInfoList = VolumeMountInfoList;
    }

    /**
     * Get 业务主容器生命周期钩子列表 
     * @return LifeCycleHookList 业务主容器生命周期钩子列表
     */
    public LifeCycleHook [] getLifeCycleHookList() {
        return this.LifeCycleHookList;
    }

    /**
     * Set 业务主容器生命周期钩子列表
     * @param LifeCycleHookList 业务主容器生命周期钩子列表
     */
    public void setLifeCycleHookList(LifeCycleHook [] LifeCycleHookList) {
        this.LifeCycleHookList = LifeCycleHookList;
    }

    /**
     * Get 附属容器列表 
     * @return AdditionalContainerList 附属容器列表
     */
    public ContainerInfo [] getAdditionalContainerList() {
        return this.AdditionalContainerList;
    }

    /**
     * Set 附属容器列表
     * @param AdditionalContainerList 附属容器列表
     */
    public void setAdditionalContainerList(ContainerInfo [] AdditionalContainerList) {
        this.AdditionalContainerList = AdditionalContainerList;
    }

    /**
     * Get 容器卷信息 
     * @return VolumeInfoList 容器卷信息
     */
    public VolumeInfo [] getVolumeInfoList() {
        return this.VolumeInfoList;
    }

    /**
     * Set 容器卷信息
     * @param VolumeInfoList 容器卷信息
     */
    public void setVolumeInfoList(VolumeInfo [] VolumeInfoList) {
        this.VolumeInfoList = VolumeInfoList;
    }

    /**
     * Get Service访问配置列表 
     * @return ServiceSettingList Service访问配置列表
     */
    public ServiceSetting [] getServiceSettingList() {
        return this.ServiceSettingList;
    }

    /**
     * Set Service访问配置列表
     * @param ServiceSettingList Service访问配置列表
     */
    public void setServiceSettingList(ServiceSetting [] ServiceSettingList) {
        this.ServiceSettingList = ServiceSettingList;
    }

    /**
     * Get 备注 
     * @return Alias 备注
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 备注
     * @param Alias 备注
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 部署组名称 
     * @return GroupName 部署组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 部署组名称
     * @param GroupName 部署组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 标签列表 
     * @return Tags 标签列表
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签列表
     * @param Tags 标签列表
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 容器类型 
     * @return ContainerKind 容器类型
     */
    public String getContainerKind() {
        return this.ContainerKind;
    }

    /**
     * Set 容器类型
     * @param ContainerKind 容器类型
     */
    public void setContainerKind(String ContainerKind) {
        this.ContainerKind = ContainerKind;
    }

    /**
     * Get 业务容器的 镜像Server ccr.ccs.tencentyun.com 
     * @return Server 业务容器的 镜像Server ccr.ccs.tencentyun.com
     */
    public String getServer() {
        return this.Server;
    }

    /**
     * Set 业务容器的 镜像Server ccr.ccs.tencentyun.com
     * @param Server 业务容器的 镜像Server ccr.ccs.tencentyun.com
     */
    public void setServer(String Server) {
        this.Server = Server;
    }

    /**
     * Get 业务容器的镜像名 
     * @return RepoName 业务容器的镜像名
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set 业务容器的镜像名
     * @param RepoName 业务容器的镜像名
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    /**
     * Get 仓库类型 
     * @return RepoType 仓库类型
     */
    public String getRepoType() {
        return this.RepoType;
    }

    /**
     * Set 仓库类型
     * @param RepoType 仓库类型
     */
    public void setRepoType(String RepoType) {
        this.RepoType = RepoType;
    }

    /**
     * Get TCR仓库信息 
     * @return TcrRepoInfo TCR仓库信息
     */
    public TcrRepoInfo getTcrRepoInfo() {
        return this.TcrRepoInfo;
    }

    /**
     * Set TCR仓库信息
     * @param TcrRepoInfo TCR仓库信息
     */
    public void setTcrRepoInfo(TcrRepoInfo TcrRepoInfo) {
        this.TcrRepoInfo = TcrRepoInfo;
    }

    /**
     * Get 容器访问凭证名称 
     * @return SecretName 容器访问凭证名称
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set 容器访问凭证名称
     * @param SecretName 容器访问凭证名称
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get 业务容器的镜像版本号 
     * @return TagName 业务容器的镜像版本号
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * Set 业务容器的镜像版本号
     * @param TagName 业务容器的镜像版本号
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
    }

    /**
     * Get 健康检查 
     * @return HealthCheckSettings 健康检查
     */
    public HealthCheckSettings getHealthCheckSettings() {
        return this.HealthCheckSettings;
    }

    /**
     * Set 健康检查
     * @param HealthCheckSettings 健康检查
     */
    public void setHealthCheckSettings(HealthCheckSettings HealthCheckSettings) {
        this.HealthCheckSettings = HealthCheckSettings;
    }

    /**
     * Get 业务容器的 cpu  request 
     * @return CpuRequest 业务容器的 cpu  request
     */
    public String getCpuRequest() {
        return this.CpuRequest;
    }

    /**
     * Set 业务容器的 cpu  request
     * @param CpuRequest 业务容器的 cpu  request
     */
    public void setCpuRequest(String CpuRequest) {
        this.CpuRequest = CpuRequest;
    }

    /**
     * Get 业务容器的 cpu limit 
     * @return CpuLimit 业务容器的 cpu limit
     */
    public String getCpuLimit() {
        return this.CpuLimit;
    }

    /**
     * Set 业务容器的 cpu limit
     * @param CpuLimit 业务容器的 cpu limit
     */
    public void setCpuLimit(String CpuLimit) {
        this.CpuLimit = CpuLimit;
    }

    /**
     * Get 业务容器的 mem request 
     * @return MemRequest 业务容器的 mem request
     */
    public String getMemRequest() {
        return this.MemRequest;
    }

    /**
     * Set 业务容器的 mem request
     * @param MemRequest 业务容器的 mem request
     */
    public void setMemRequest(String MemRequest) {
        this.MemRequest = MemRequest;
    }

    /**
     * Get 业务容器的 mem limit 
     * @return MemLimit 业务容器的 mem limit
     */
    public String getMemLimit() {
        return this.MemLimit;
    }

    /**
     * Set 业务容器的 mem limit
     * @param MemLimit 业务容器的 mem limit
     */
    public void setMemLimit(String MemLimit) {
        this.MemLimit = MemLimit;
    }

    /**
     * Get 业务容器的 jvm 参数 
     * @return JvmOpts 业务容器的 jvm 参数
     */
    public String getJvmOpts() {
        return this.JvmOpts;
    }

    /**
     * Set 业务容器的 jvm 参数
     * @param JvmOpts 业务容器的 jvm 参数
     */
    public void setJvmOpts(String JvmOpts) {
        this.JvmOpts = JvmOpts;
    }

    /**
     * Get 是否为初始化容器 业务主容器不能为初始化容 
     * @return InitContainerEnable 是否为初始化容器 业务主容器不能为初始化容
     */
    public Boolean getInitContainerEnable() {
        return this.InitContainerEnable;
    }

    /**
     * Set 是否为初始化容器 业务主容器不能为初始化容
     * @param InitContainerEnable 是否为初始化容器 业务主容器不能为初始化容
     */
    public void setInitContainerEnable(Boolean InitContainerEnable) {
        this.InitContainerEnable = InitContainerEnable;
    }

    /**
     * Get 业务主容器是否为特权容器 
     * @return PrivilegeContainerEnable 业务主容器是否为特权容器
     */
    public Boolean getPrivilegeContainerEnable() {
        return this.PrivilegeContainerEnable;
    }

    /**
     * Set 业务主容器是否为特权容器
     * @param PrivilegeContainerEnable 业务主容器是否为特权容器
     */
    public void setPrivilegeContainerEnable(Boolean PrivilegeContainerEnable) {
        this.PrivilegeContainerEnable = PrivilegeContainerEnable;
    }

    /**
     * Get 业务主容器运行命令(转base64) 
     * @return RunCommand 业务主容器运行命令(转base64)
     */
    public String getRunCommand() {
        return this.RunCommand;
    }

    /**
     * Set 业务主容器运行命令(转base64)
     * @param RunCommand 业务主容器运行命令(转base64)
     */
    public void setRunCommand(String RunCommand) {
        this.RunCommand = RunCommand;
    }

    /**
     * Get 业务主容器运行参数(转base64) 
     * @return RunArg 业务主容器运行参数(转base64)
     */
    public String getRunArg() {
        return this.RunArg;
    }

    /**
     * Set 业务主容器运行参数(转base64)
     * @param RunArg 业务主容器运行参数(转base64)
     */
    public void setRunArg(String RunArg) {
        this.RunArg = RunArg;
    }

    /**
     * Get 实例数量 
     * @return InstanceNum 实例数量
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set 实例数量
     * @param InstanceNum 实例数量
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    /**
     * Get 调度策略 
     * @return SchedulingStrategy 调度策略
     */
    public SchedulingStrategy getSchedulingStrategy() {
        return this.SchedulingStrategy;
    }

    /**
     * Set 调度策略
     * @param SchedulingStrategy 调度策略
     */
    public void setSchedulingStrategy(SchedulingStrategy SchedulingStrategy) {
        this.SchedulingStrategy = SchedulingStrategy;
    }

    /**
     * Get 重启策略 
     * @return RestartPolicy 重启策略
     */
    public String getRestartPolicy() {
        return this.RestartPolicy;
    }

    /**
     * Set 重启策略
     * @param RestartPolicy 重启策略
     */
    public void setRestartPolicy(String RestartPolicy) {
        this.RestartPolicy = RestartPolicy;
    }

    /**
     * Get 服务治理配置 
     * @return ServiceSpecEncode 服务治理配置
     */
    public String getServiceSpecEncode() {
        return this.ServiceSpecEncode;
    }

    /**
     * Set 服务治理配置
     * @param ServiceSpecEncode 服务治理配置
     */
    public void setServiceSpecEncode(String ServiceSpecEncode) {
        this.ServiceSpecEncode = ServiceSpecEncode;
    }

    /**
     * Get istio容器的 mem Request 
     * @return IstioMemRequest istio容器的 mem Request
     */
    public String getIstioMemRequest() {
        return this.IstioMemRequest;
    }

    /**
     * Set istio容器的 mem Request
     * @param IstioMemRequest istio容器的 mem Request
     */
    public void setIstioMemRequest(String IstioMemRequest) {
        this.IstioMemRequest = IstioMemRequest;
    }

    /**
     * Get  istio容器的 cpu Request 
     * @return IstioCpuRequest  istio容器的 cpu Request
     */
    public String getIstioCpuRequest() {
        return this.IstioCpuRequest;
    }

    /**
     * Set  istio容器的 cpu Request
     * @param IstioCpuRequest  istio容器的 cpu Request
     */
    public void setIstioCpuRequest(String IstioCpuRequest) {
        this.IstioCpuRequest = IstioCpuRequest;
    }

    /**
     * Get istio容器的 mem Limit 
     * @return IstioMemLimit istio容器的 mem Limit
     */
    public String getIstioMemLimit() {
        return this.IstioMemLimit;
    }

    /**
     * Set istio容器的 mem Limit
     * @param IstioMemLimit istio容器的 mem Limit
     */
    public void setIstioMemLimit(String IstioMemLimit) {
        this.IstioMemLimit = IstioMemLimit;
    }

    /**
     * Get istio容器的 cpu Limit 
     * @return IstioCpuLimit istio容器的 cpu Limit
     */
    public String getIstioCpuLimit() {
        return this.IstioCpuLimit;
    }

    /**
     * Set istio容器的 cpu Limit
     * @param IstioCpuLimit istio容器的 cpu Limit
     */
    public void setIstioCpuLimit(String IstioCpuLimit) {
        this.IstioCpuLimit = IstioCpuLimit;
    }

    /**
     * Get 服务治理配置 
     * @return ServiceGovernanceConfig 服务治理配置
     */
    public ContainerGroupServiceGovernanceConfig getServiceGovernanceConfig() {
        return this.ServiceGovernanceConfig;
    }

    /**
     * Set 服务治理配置
     * @param ServiceGovernanceConfig 服务治理配置
     */
    public void setServiceGovernanceConfig(ContainerGroupServiceGovernanceConfig ServiceGovernanceConfig) {
        this.ServiceGovernanceConfig = ServiceGovernanceConfig;
    }

    /**
     * Get agent容器的 mem Request 
     * @return AgentMemRequest agent容器的 mem Request
     */
    public String getAgentMemRequest() {
        return this.AgentMemRequest;
    }

    /**
     * Set agent容器的 mem Request
     * @param AgentMemRequest agent容器的 mem Request
     */
    public void setAgentMemRequest(String AgentMemRequest) {
        this.AgentMemRequest = AgentMemRequest;
    }

    /**
     * Get agent容器的 cpu Request 
     * @return AgentCpuRequest agent容器的 cpu Request
     */
    public String getAgentCpuRequest() {
        return this.AgentCpuRequest;
    }

    /**
     * Set agent容器的 cpu Request
     * @param AgentCpuRequest agent容器的 cpu Request
     */
    public void setAgentCpuRequest(String AgentCpuRequest) {
        this.AgentCpuRequest = AgentCpuRequest;
    }

    /**
     * Get agent容器的 mem Limit 
     * @return AgentMemLimit agent容器的 mem Limit
     */
    public String getAgentMemLimit() {
        return this.AgentMemLimit;
    }

    /**
     * Set agent容器的 mem Limit
     * @param AgentMemLimit agent容器的 mem Limit
     */
    public void setAgentMemLimit(String AgentMemLimit) {
        this.AgentMemLimit = AgentMemLimit;
    }

    /**
     * Get agent容器的 cpu Limit 
     * @return AgentCpuLimit agent容器的 cpu Limit
     */
    public String getAgentCpuLimit() {
        return this.AgentCpuLimit;
    }

    /**
     * Set agent容器的 cpu Limit
     * @param AgentCpuLimit agent容器的 cpu Limit
     */
    public void setAgentCpuLimit(String AgentCpuLimit) {
        this.AgentCpuLimit = AgentCpuLimit;
    }

    /**
     * Get 发布策略(0表示快速更新，1表示滚动更新。默认值为0) 
     * @return UpdateType 发布策略(0表示快速更新，1表示滚动更新。默认值为0)
     */
    public Long getUpdateType() {
        return this.UpdateType;
    }

    /**
     * Set 发布策略(0表示快速更新，1表示滚动更新。默认值为0)
     * @param UpdateType 发布策略(0表示快速更新，1表示滚动更新。默认值为0)
     */
    public void setUpdateType(Long UpdateType) {
        this.UpdateType = UpdateType;
    }

    /**
     * Get 更新间隔,单位秒 
     * @return UpdateIvl 更新间隔,单位秒
     */
    public Long getUpdateIvl() {
        return this.UpdateIvl;
    }

    /**
     * Set 更新间隔,单位秒
     * @param UpdateIvl 更新间隔,单位秒
     */
    public void setUpdateIvl(Long UpdateIvl) {
        this.UpdateIvl = UpdateIvl;
    }

    /**
     * Get 对应更新策略和策略配置参数 
     * @return MaxSurge 对应更新策略和策略配置参数
     */
    public String getMaxSurge() {
        return this.MaxSurge;
    }

    /**
     * Set 对应更新策略和策略配置参数
     * @param MaxSurge 对应更新策略和策略配置参数
     */
    public void setMaxSurge(String MaxSurge) {
        this.MaxSurge = MaxSurge;
    }

    /**
     * Get 对应更新策略和策略配置参数 
     * @return MaxUnavailable 对应更新策略和策略配置参数
     */
    public String getMaxUnavailable() {
        return this.MaxUnavailable;
    }

    /**
     * Set 对应更新策略和策略配置参数
     * @param MaxUnavailable 对应更新策略和策略配置参数
     */
    public void setMaxUnavailable(String MaxUnavailable) {
        this.MaxUnavailable = MaxUnavailable;
    }

    /**
     * Get 预热参数配置 
     * @return WarmupSetting 预热参数配置
     */
    public WarmupSetting getWarmupSetting() {
        return this.WarmupSetting;
    }

    /**
     * Set 预热参数配置
     * @param WarmupSetting 预热参数配置
     */
    public void setWarmupSetting(WarmupSetting WarmupSetting) {
        this.WarmupSetting = WarmupSetting;
    }

    /**
     * Get 配置模版ID 
     * @return ConfigTemplateId 配置模版ID
     */
    public String getConfigTemplateId() {
        return this.ConfigTemplateId;
    }

    /**
     * Set 配置模版ID
     * @param ConfigTemplateId 配置模版ID
     */
    public void setConfigTemplateId(String ConfigTemplateId) {
        this.ConfigTemplateId = ConfigTemplateId;
    }

    /**
     * Get 配置模版Version 
     * @return ConfigTemplateVersion 配置模版Version
     */
    public Long getConfigTemplateVersion() {
        return this.ConfigTemplateVersion;
    }

    /**
     * Set 配置模版Version
     * @param ConfigTemplateVersion 配置模版Version
     */
    public void setConfigTemplateVersion(Long ConfigTemplateVersion) {
        this.ConfigTemplateVersion = ConfigTemplateVersion;
    }

    /**
     * Get 是否清除数据卷信息 
     * @return VolumeClean 是否清除数据卷信息
     */
    public Boolean getVolumeClean() {
        return this.VolumeClean;
    }

    /**
     * Set 是否清除数据卷信息
     * @param VolumeClean 是否清除数据卷信息
     */
    public void setVolumeClean(Boolean VolumeClean) {
        this.VolumeClean = VolumeClean;
    }

    /**
     * Get 命名空间Id 
     * @return NamespaceId 命名空间Id
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 命名空间Id
     * @param NamespaceId 命名空间Id
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 是否部署agent容器 
     * @return DeployAgent 是否部署agent容器
     */
    public Boolean getDeployAgent() {
        return this.DeployAgent;
    }

    /**
     * Set 是否部署agent容器
     * @param DeployAgent 是否部署agent容器
     */
    public void setDeployAgent(Boolean DeployAgent) {
        this.DeployAgent = DeployAgent;
    }

    /**
     * Get javaagent信息: SERVICE_AGENT/OT_AGENT 
     * @return AgentProfileList javaagent信息: SERVICE_AGENT/OT_AGENT
     */
    public AgentProfile [] getAgentProfileList() {
        return this.AgentProfileList;
    }

    /**
     * Set javaagent信息: SERVICE_AGENT/OT_AGENT
     * @param AgentProfileList javaagent信息: SERVICE_AGENT/OT_AGENT
     */
    public void setAgentProfileList(AgentProfile [] AgentProfileList) {
        this.AgentProfileList = AgentProfileList;
    }

    /**
     * Get 是否清除Service信息 
     * @return ServiceClean 是否清除Service信息
     */
    public Boolean getServiceClean() {
        return this.ServiceClean;
    }

    /**
     * Set 是否清除Service信息
     * @param ServiceClean 是否清除Service信息
     */
    public void setServiceClean(Boolean ServiceClean) {
        this.ServiceClean = ServiceClean;
    }

    /**
     * Get 是否清除Env信息 
     * @return EnvClean 是否清除Env信息
     */
    public Boolean getEnvClean() {
        return this.EnvClean;
    }

    /**
     * Set 是否清除Env信息
     * @param EnvClean 是否清除Env信息
     */
    public void setEnvClean(Boolean EnvClean) {
        this.EnvClean = EnvClean;
    }

    /**
     * Get 本次部署的描述信息 
     * @return DeployDesc 本次部署的描述信息
     */
    public String getDeployDesc() {
        return this.DeployDesc;
    }

    /**
     * Set 本次部署的描述信息
     * @param DeployDesc 本次部署的描述信息
     */
    public void setDeployDesc(String DeployDesc) {
        this.DeployDesc = DeployDesc;
    }

    public DeployContainerApplicationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployContainerApplicationRequest(DeployContainerApplicationRequest source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ObservabilityConfig != null) {
            this.ObservabilityConfig = new ContainerGroupObservabilityConfig(source.ObservabilityConfig);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Envs != null) {
            this.Envs = new Env[source.Envs.length];
            for (int i = 0; i < source.Envs.length; i++) {
                this.Envs[i] = new Env(source.Envs[i]);
            }
        }
        if (source.VolumeMountInfoList != null) {
            this.VolumeMountInfoList = new VolumeMountInfo[source.VolumeMountInfoList.length];
            for (int i = 0; i < source.VolumeMountInfoList.length; i++) {
                this.VolumeMountInfoList[i] = new VolumeMountInfo(source.VolumeMountInfoList[i]);
            }
        }
        if (source.LifeCycleHookList != null) {
            this.LifeCycleHookList = new LifeCycleHook[source.LifeCycleHookList.length];
            for (int i = 0; i < source.LifeCycleHookList.length; i++) {
                this.LifeCycleHookList[i] = new LifeCycleHook(source.LifeCycleHookList[i]);
            }
        }
        if (source.AdditionalContainerList != null) {
            this.AdditionalContainerList = new ContainerInfo[source.AdditionalContainerList.length];
            for (int i = 0; i < source.AdditionalContainerList.length; i++) {
                this.AdditionalContainerList[i] = new ContainerInfo(source.AdditionalContainerList[i]);
            }
        }
        if (source.VolumeInfoList != null) {
            this.VolumeInfoList = new VolumeInfo[source.VolumeInfoList.length];
            for (int i = 0; i < source.VolumeInfoList.length; i++) {
                this.VolumeInfoList[i] = new VolumeInfo(source.VolumeInfoList[i]);
            }
        }
        if (source.ServiceSettingList != null) {
            this.ServiceSettingList = new ServiceSetting[source.ServiceSettingList.length];
            for (int i = 0; i < source.ServiceSettingList.length; i++) {
                this.ServiceSettingList[i] = new ServiceSetting(source.ServiceSettingList[i]);
            }
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.ContainerKind != null) {
            this.ContainerKind = new String(source.ContainerKind);
        }
        if (source.Server != null) {
            this.Server = new String(source.Server);
        }
        if (source.RepoName != null) {
            this.RepoName = new String(source.RepoName);
        }
        if (source.RepoType != null) {
            this.RepoType = new String(source.RepoType);
        }
        if (source.TcrRepoInfo != null) {
            this.TcrRepoInfo = new TcrRepoInfo(source.TcrRepoInfo);
        }
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.TagName != null) {
            this.TagName = new String(source.TagName);
        }
        if (source.HealthCheckSettings != null) {
            this.HealthCheckSettings = new HealthCheckSettings(source.HealthCheckSettings);
        }
        if (source.CpuRequest != null) {
            this.CpuRequest = new String(source.CpuRequest);
        }
        if (source.CpuLimit != null) {
            this.CpuLimit = new String(source.CpuLimit);
        }
        if (source.MemRequest != null) {
            this.MemRequest = new String(source.MemRequest);
        }
        if (source.MemLimit != null) {
            this.MemLimit = new String(source.MemLimit);
        }
        if (source.JvmOpts != null) {
            this.JvmOpts = new String(source.JvmOpts);
        }
        if (source.InitContainerEnable != null) {
            this.InitContainerEnable = new Boolean(source.InitContainerEnable);
        }
        if (source.PrivilegeContainerEnable != null) {
            this.PrivilegeContainerEnable = new Boolean(source.PrivilegeContainerEnable);
        }
        if (source.RunCommand != null) {
            this.RunCommand = new String(source.RunCommand);
        }
        if (source.RunArg != null) {
            this.RunArg = new String(source.RunArg);
        }
        if (source.InstanceNum != null) {
            this.InstanceNum = new Long(source.InstanceNum);
        }
        if (source.SchedulingStrategy != null) {
            this.SchedulingStrategy = new SchedulingStrategy(source.SchedulingStrategy);
        }
        if (source.RestartPolicy != null) {
            this.RestartPolicy = new String(source.RestartPolicy);
        }
        if (source.ServiceSpecEncode != null) {
            this.ServiceSpecEncode = new String(source.ServiceSpecEncode);
        }
        if (source.IstioMemRequest != null) {
            this.IstioMemRequest = new String(source.IstioMemRequest);
        }
        if (source.IstioCpuRequest != null) {
            this.IstioCpuRequest = new String(source.IstioCpuRequest);
        }
        if (source.IstioMemLimit != null) {
            this.IstioMemLimit = new String(source.IstioMemLimit);
        }
        if (source.IstioCpuLimit != null) {
            this.IstioCpuLimit = new String(source.IstioCpuLimit);
        }
        if (source.ServiceGovernanceConfig != null) {
            this.ServiceGovernanceConfig = new ContainerGroupServiceGovernanceConfig(source.ServiceGovernanceConfig);
        }
        if (source.AgentMemRequest != null) {
            this.AgentMemRequest = new String(source.AgentMemRequest);
        }
        if (source.AgentCpuRequest != null) {
            this.AgentCpuRequest = new String(source.AgentCpuRequest);
        }
        if (source.AgentMemLimit != null) {
            this.AgentMemLimit = new String(source.AgentMemLimit);
        }
        if (source.AgentCpuLimit != null) {
            this.AgentCpuLimit = new String(source.AgentCpuLimit);
        }
        if (source.UpdateType != null) {
            this.UpdateType = new Long(source.UpdateType);
        }
        if (source.UpdateIvl != null) {
            this.UpdateIvl = new Long(source.UpdateIvl);
        }
        if (source.MaxSurge != null) {
            this.MaxSurge = new String(source.MaxSurge);
        }
        if (source.MaxUnavailable != null) {
            this.MaxUnavailable = new String(source.MaxUnavailable);
        }
        if (source.WarmupSetting != null) {
            this.WarmupSetting = new WarmupSetting(source.WarmupSetting);
        }
        if (source.ConfigTemplateId != null) {
            this.ConfigTemplateId = new String(source.ConfigTemplateId);
        }
        if (source.ConfigTemplateVersion != null) {
            this.ConfigTemplateVersion = new Long(source.ConfigTemplateVersion);
        }
        if (source.VolumeClean != null) {
            this.VolumeClean = new Boolean(source.VolumeClean);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.DeployAgent != null) {
            this.DeployAgent = new Boolean(source.DeployAgent);
        }
        if (source.AgentProfileList != null) {
            this.AgentProfileList = new AgentProfile[source.AgentProfileList.length];
            for (int i = 0; i < source.AgentProfileList.length; i++) {
                this.AgentProfileList[i] = new AgentProfile(source.AgentProfileList[i]);
            }
        }
        if (source.ServiceClean != null) {
            this.ServiceClean = new Boolean(source.ServiceClean);
        }
        if (source.EnvClean != null) {
            this.EnvClean = new Boolean(source.EnvClean);
        }
        if (source.DeployDesc != null) {
            this.DeployDesc = new String(source.DeployDesc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamObj(map, prefix + "ObservabilityConfig.", this.ObservabilityConfig);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArrayObj(map, prefix + "Envs.", this.Envs);
        this.setParamArrayObj(map, prefix + "VolumeMountInfoList.", this.VolumeMountInfoList);
        this.setParamArrayObj(map, prefix + "LifeCycleHookList.", this.LifeCycleHookList);
        this.setParamArrayObj(map, prefix + "AdditionalContainerList.", this.AdditionalContainerList);
        this.setParamArrayObj(map, prefix + "VolumeInfoList.", this.VolumeInfoList);
        this.setParamArrayObj(map, prefix + "ServiceSettingList.", this.ServiceSettingList);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ContainerKind", this.ContainerKind);
        this.setParamSimple(map, prefix + "Server", this.Server);
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "RepoType", this.RepoType);
        this.setParamObj(map, prefix + "TcrRepoInfo.", this.TcrRepoInfo);
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "TagName", this.TagName);
        this.setParamObj(map, prefix + "HealthCheckSettings.", this.HealthCheckSettings);
        this.setParamSimple(map, prefix + "CpuRequest", this.CpuRequest);
        this.setParamSimple(map, prefix + "CpuLimit", this.CpuLimit);
        this.setParamSimple(map, prefix + "MemRequest", this.MemRequest);
        this.setParamSimple(map, prefix + "MemLimit", this.MemLimit);
        this.setParamSimple(map, prefix + "JvmOpts", this.JvmOpts);
        this.setParamSimple(map, prefix + "InitContainerEnable", this.InitContainerEnable);
        this.setParamSimple(map, prefix + "PrivilegeContainerEnable", this.PrivilegeContainerEnable);
        this.setParamSimple(map, prefix + "RunCommand", this.RunCommand);
        this.setParamSimple(map, prefix + "RunArg", this.RunArg);
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);
        this.setParamObj(map, prefix + "SchedulingStrategy.", this.SchedulingStrategy);
        this.setParamSimple(map, prefix + "RestartPolicy", this.RestartPolicy);
        this.setParamSimple(map, prefix + "ServiceSpecEncode", this.ServiceSpecEncode);
        this.setParamSimple(map, prefix + "IstioMemRequest", this.IstioMemRequest);
        this.setParamSimple(map, prefix + "IstioCpuRequest", this.IstioCpuRequest);
        this.setParamSimple(map, prefix + "IstioMemLimit", this.IstioMemLimit);
        this.setParamSimple(map, prefix + "IstioCpuLimit", this.IstioCpuLimit);
        this.setParamObj(map, prefix + "ServiceGovernanceConfig.", this.ServiceGovernanceConfig);
        this.setParamSimple(map, prefix + "AgentMemRequest", this.AgentMemRequest);
        this.setParamSimple(map, prefix + "AgentCpuRequest", this.AgentCpuRequest);
        this.setParamSimple(map, prefix + "AgentMemLimit", this.AgentMemLimit);
        this.setParamSimple(map, prefix + "AgentCpuLimit", this.AgentCpuLimit);
        this.setParamSimple(map, prefix + "UpdateType", this.UpdateType);
        this.setParamSimple(map, prefix + "UpdateIvl", this.UpdateIvl);
        this.setParamSimple(map, prefix + "MaxSurge", this.MaxSurge);
        this.setParamSimple(map, prefix + "MaxUnavailable", this.MaxUnavailable);
        this.setParamObj(map, prefix + "WarmupSetting.", this.WarmupSetting);
        this.setParamSimple(map, prefix + "ConfigTemplateId", this.ConfigTemplateId);
        this.setParamSimple(map, prefix + "ConfigTemplateVersion", this.ConfigTemplateVersion);
        this.setParamSimple(map, prefix + "VolumeClean", this.VolumeClean);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "DeployAgent", this.DeployAgent);
        this.setParamArrayObj(map, prefix + "AgentProfileList.", this.AgentProfileList);
        this.setParamSimple(map, prefix + "ServiceClean", this.ServiceClean);
        this.setParamSimple(map, prefix + "EnvClean", this.EnvClean);
        this.setParamSimple(map, prefix + "DeployDesc", this.DeployDesc);

    }
}

