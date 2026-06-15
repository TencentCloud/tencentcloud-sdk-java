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
    * <p>应用ID</p>
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * <p>可观测配置</p>
    */
    @SerializedName("ObservabilityConfig")
    @Expose
    private ContainerGroupObservabilityConfig ObservabilityConfig;

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>部署组ID，分组唯一标识</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>业务容器的环境变量参数</p>
    */
    @SerializedName("Envs")
    @Expose
    private Env [] Envs;

    /**
    * <p>业务容器的挂载信息</p>
    */
    @SerializedName("VolumeMountInfoList")
    @Expose
    private VolumeMountInfo [] VolumeMountInfoList;

    /**
    * <p>业务主容器生命周期钩子列表</p>
    */
    @SerializedName("LifeCycleHookList")
    @Expose
    private LifeCycleHook [] LifeCycleHookList;

    /**
    * <p>附属容器列表</p>
    */
    @SerializedName("AdditionalContainerList")
    @Expose
    private ContainerInfo [] AdditionalContainerList;

    /**
    * <p>容器卷信息</p>
    */
    @SerializedName("VolumeInfoList")
    @Expose
    private VolumeInfo [] VolumeInfoList;

    /**
    * <p>Service访问配置列表</p>
    */
    @SerializedName("ServiceSettingList")
    @Expose
    private ServiceSetting [] ServiceSettingList;

    /**
    * <p>备注</p>
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * <p>部署组名称</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>标签列表</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>容器类型</p>
    */
    @SerializedName("ContainerKind")
    @Expose
    private String ContainerKind;

    /**
    * <p>业务容器的 镜像Server ccr.ccs.tencentyun.com</p>
    */
    @SerializedName("Server")
    @Expose
    private String Server;

    /**
    * <p>业务容器的镜像名</p>
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * <p>仓库类型</p>
    */
    @SerializedName("RepoType")
    @Expose
    private String RepoType;

    /**
    * <p>TCR仓库信息</p>
    */
    @SerializedName("TcrRepoInfo")
    @Expose
    private TcrRepoInfo TcrRepoInfo;

    /**
    * <p>容器访问凭证名称</p>
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * <p>业务容器的镜像版本号</p>
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
    * <p>健康检查</p>
    */
    @SerializedName("HealthCheckSettings")
    @Expose
    private HealthCheckSettings HealthCheckSettings;

    /**
    * <p>业务容器的 cpu  request</p>
    */
    @SerializedName("CpuRequest")
    @Expose
    private String CpuRequest;

    /**
    * <p>业务容器的 cpu limit</p>
    */
    @SerializedName("CpuLimit")
    @Expose
    private String CpuLimit;

    /**
    * <p>业务容器的 mem request</p>
    */
    @SerializedName("MemRequest")
    @Expose
    private String MemRequest;

    /**
    * <p>业务容器的 mem limit</p>
    */
    @SerializedName("MemLimit")
    @Expose
    private String MemLimit;

    /**
    * <p>业务容器的 jvm 参数</p>
    */
    @SerializedName("JvmOpts")
    @Expose
    private String JvmOpts;

    /**
    * <p>是否为初始化容器 业务主容器不能为初始化容</p>
    */
    @SerializedName("InitContainerEnable")
    @Expose
    private Boolean InitContainerEnable;

    /**
    * <p>业务主容器是否为特权容器</p>
    */
    @SerializedName("PrivilegeContainerEnable")
    @Expose
    private Boolean PrivilegeContainerEnable;

    /**
    * <p>业务主容器运行命令(转base64)</p>
    */
    @SerializedName("RunCommand")
    @Expose
    private String RunCommand;

    /**
    * <p>业务主容器运行参数(转base64)</p>
    */
    @SerializedName("RunArg")
    @Expose
    private String RunArg;

    /**
    * <p>实例数量</p>
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * <p>调度策略</p>
    */
    @SerializedName("SchedulingStrategy")
    @Expose
    private SchedulingStrategy SchedulingStrategy;

    /**
    * <p>重启策略</p>
    */
    @SerializedName("RestartPolicy")
    @Expose
    private String RestartPolicy;

    /**
    * <p>服务治理配置</p>
    */
    @SerializedName("ServiceSpecEncode")
    @Expose
    private String ServiceSpecEncode;

    /**
    * <p>istio容器的 mem Request</p>
    */
    @SerializedName("IstioMemRequest")
    @Expose
    private String IstioMemRequest;

    /**
    * <p>istio容器的 cpu Request</p>
    */
    @SerializedName("IstioCpuRequest")
    @Expose
    private String IstioCpuRequest;

    /**
    * <p>istio容器的 mem Limit</p>
    */
    @SerializedName("IstioMemLimit")
    @Expose
    private String IstioMemLimit;

    /**
    * <p>istio容器的 cpu Limit</p>
    */
    @SerializedName("IstioCpuLimit")
    @Expose
    private String IstioCpuLimit;

    /**
    * <p>服务治理配置</p>
    */
    @SerializedName("ServiceGovernanceConfig")
    @Expose
    private ContainerGroupServiceGovernanceConfig ServiceGovernanceConfig;

    /**
    * <p>agent容器的 mem Request</p>
    */
    @SerializedName("AgentMemRequest")
    @Expose
    private String AgentMemRequest;

    /**
    * <p>agent容器的 cpu Request</p>
    */
    @SerializedName("AgentCpuRequest")
    @Expose
    private String AgentCpuRequest;

    /**
    * <p>agent容器的 mem Limit</p>
    */
    @SerializedName("AgentMemLimit")
    @Expose
    private String AgentMemLimit;

    /**
    * <p>agent容器的 cpu Limit</p>
    */
    @SerializedName("AgentCpuLimit")
    @Expose
    private String AgentCpuLimit;

    /**
    * <p>发布策略(0表示快速更新，1表示滚动更新。默认值为0)</p>
    */
    @SerializedName("UpdateType")
    @Expose
    private Long UpdateType;

    /**
    * <p>更新间隔,单位秒</p>
    */
    @SerializedName("UpdateIvl")
    @Expose
    private Long UpdateIvl;

    /**
    * <p>对应更新策略和策略配置参数</p>
    */
    @SerializedName("MaxSurge")
    @Expose
    private String MaxSurge;

    /**
    * <p>对应更新策略和策略配置参数</p>
    */
    @SerializedName("MaxUnavailable")
    @Expose
    private String MaxUnavailable;

    /**
    * <p>预热参数配置</p>
    */
    @SerializedName("WarmupSetting")
    @Expose
    private WarmupSetting WarmupSetting;

    /**
    * <p>配置模版ID</p>
    */
    @SerializedName("ConfigTemplateId")
    @Expose
    private String ConfigTemplateId;

    /**
    * <p>配置模版Version</p>
    */
    @SerializedName("ConfigTemplateVersion")
    @Expose
    private Long ConfigTemplateVersion;

    /**
    * <p>是否清除数据卷信息</p>
    */
    @SerializedName("VolumeClean")
    @Expose
    private Boolean VolumeClean;

    /**
    * <p>命名空间Id</p>
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * <p>是否部署agent容器</p>
    */
    @SerializedName("DeployAgent")
    @Expose
    private Boolean DeployAgent;

    /**
    * <p>javaagent信息: SERVICE_AGENT/OT_AGENT</p>
    */
    @SerializedName("AgentProfileList")
    @Expose
    private AgentProfile [] AgentProfileList;

    /**
    * <p>是否清除Service信息</p>
    */
    @SerializedName("ServiceClean")
    @Expose
    private Boolean ServiceClean;

    /**
    * <p>是否清除Env信息</p>
    */
    @SerializedName("EnvClean")
    @Expose
    private Boolean EnvClean;

    /**
    * <p>本次部署的描述信息</p>
    */
    @SerializedName("DeployDesc")
    @Expose
    private String DeployDesc;

    /**
    * <p>k8s命名空间名称</p>
    */
    @SerializedName("K8sNamespaceName")
    @Expose
    private String K8sNamespaceName;

    /**
    * <p>是否启用静态IP</p>
    */
    @SerializedName("StaticIpEnabled")
    @Expose
    private Boolean StaticIpEnabled;

    /**
    * <p>启动策略[OrderedReady/Parallel]</p>
    */
    @SerializedName("PodManagementPolicyType")
    @Expose
    private String PodManagementPolicyType;

    /**
    * <p>滚动更新分区序号</p>
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * <p>是否是增量部署，增量部署只运行增量覆盖一级参数，不支持对一级参数中的子参数进行增量更新，例如更新VolumeMountInfoList时必须传入VolumeMountInfoList更新后的全量参数</p>
    */
    @SerializedName("IncrementalDeployment")
    @Expose
    private Boolean IncrementalDeployment;

    /**
    * <p>是否不立即启动</p>
    */
    @SerializedName("DoNotStart")
    @Expose
    private Boolean DoNotStart;

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
     * Get <p>可观测配置</p> 
     * @return ObservabilityConfig <p>可观测配置</p>
     */
    public ContainerGroupObservabilityConfig getObservabilityConfig() {
        return this.ObservabilityConfig;
    }

    /**
     * Set <p>可观测配置</p>
     * @param ObservabilityConfig <p>可观测配置</p>
     */
    public void setObservabilityConfig(ContainerGroupObservabilityConfig ObservabilityConfig) {
        this.ObservabilityConfig = ObservabilityConfig;
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
     * Get <p>部署组ID，分组唯一标识</p> 
     * @return GroupId <p>部署组ID，分组唯一标识</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>部署组ID，分组唯一标识</p>
     * @param GroupId <p>部署组ID，分组唯一标识</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>业务容器的环境变量参数</p> 
     * @return Envs <p>业务容器的环境变量参数</p>
     */
    public Env [] getEnvs() {
        return this.Envs;
    }

    /**
     * Set <p>业务容器的环境变量参数</p>
     * @param Envs <p>业务容器的环境变量参数</p>
     */
    public void setEnvs(Env [] Envs) {
        this.Envs = Envs;
    }

    /**
     * Get <p>业务容器的挂载信息</p> 
     * @return VolumeMountInfoList <p>业务容器的挂载信息</p>
     */
    public VolumeMountInfo [] getVolumeMountInfoList() {
        return this.VolumeMountInfoList;
    }

    /**
     * Set <p>业务容器的挂载信息</p>
     * @param VolumeMountInfoList <p>业务容器的挂载信息</p>
     */
    public void setVolumeMountInfoList(VolumeMountInfo [] VolumeMountInfoList) {
        this.VolumeMountInfoList = VolumeMountInfoList;
    }

    /**
     * Get <p>业务主容器生命周期钩子列表</p> 
     * @return LifeCycleHookList <p>业务主容器生命周期钩子列表</p>
     */
    public LifeCycleHook [] getLifeCycleHookList() {
        return this.LifeCycleHookList;
    }

    /**
     * Set <p>业务主容器生命周期钩子列表</p>
     * @param LifeCycleHookList <p>业务主容器生命周期钩子列表</p>
     */
    public void setLifeCycleHookList(LifeCycleHook [] LifeCycleHookList) {
        this.LifeCycleHookList = LifeCycleHookList;
    }

    /**
     * Get <p>附属容器列表</p> 
     * @return AdditionalContainerList <p>附属容器列表</p>
     */
    public ContainerInfo [] getAdditionalContainerList() {
        return this.AdditionalContainerList;
    }

    /**
     * Set <p>附属容器列表</p>
     * @param AdditionalContainerList <p>附属容器列表</p>
     */
    public void setAdditionalContainerList(ContainerInfo [] AdditionalContainerList) {
        this.AdditionalContainerList = AdditionalContainerList;
    }

    /**
     * Get <p>容器卷信息</p> 
     * @return VolumeInfoList <p>容器卷信息</p>
     */
    public VolumeInfo [] getVolumeInfoList() {
        return this.VolumeInfoList;
    }

    /**
     * Set <p>容器卷信息</p>
     * @param VolumeInfoList <p>容器卷信息</p>
     */
    public void setVolumeInfoList(VolumeInfo [] VolumeInfoList) {
        this.VolumeInfoList = VolumeInfoList;
    }

    /**
     * Get <p>Service访问配置列表</p> 
     * @return ServiceSettingList <p>Service访问配置列表</p>
     */
    public ServiceSetting [] getServiceSettingList() {
        return this.ServiceSettingList;
    }

    /**
     * Set <p>Service访问配置列表</p>
     * @param ServiceSettingList <p>Service访问配置列表</p>
     */
    public void setServiceSettingList(ServiceSetting [] ServiceSettingList) {
        this.ServiceSettingList = ServiceSettingList;
    }

    /**
     * Get <p>备注</p> 
     * @return Alias <p>备注</p>
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set <p>备注</p>
     * @param Alias <p>备注</p>
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
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
     * Get <p>标签列表</p> 
     * @return Tags <p>标签列表</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表</p>
     * @param Tags <p>标签列表</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>容器类型</p> 
     * @return ContainerKind <p>容器类型</p>
     */
    public String getContainerKind() {
        return this.ContainerKind;
    }

    /**
     * Set <p>容器类型</p>
     * @param ContainerKind <p>容器类型</p>
     */
    public void setContainerKind(String ContainerKind) {
        this.ContainerKind = ContainerKind;
    }

    /**
     * Get <p>业务容器的 镜像Server ccr.ccs.tencentyun.com</p> 
     * @return Server <p>业务容器的 镜像Server ccr.ccs.tencentyun.com</p>
     */
    public String getServer() {
        return this.Server;
    }

    /**
     * Set <p>业务容器的 镜像Server ccr.ccs.tencentyun.com</p>
     * @param Server <p>业务容器的 镜像Server ccr.ccs.tencentyun.com</p>
     */
    public void setServer(String Server) {
        this.Server = Server;
    }

    /**
     * Get <p>业务容器的镜像名</p> 
     * @return RepoName <p>业务容器的镜像名</p>
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set <p>业务容器的镜像名</p>
     * @param RepoName <p>业务容器的镜像名</p>
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    /**
     * Get <p>仓库类型</p> 
     * @return RepoType <p>仓库类型</p>
     */
    public String getRepoType() {
        return this.RepoType;
    }

    /**
     * Set <p>仓库类型</p>
     * @param RepoType <p>仓库类型</p>
     */
    public void setRepoType(String RepoType) {
        this.RepoType = RepoType;
    }

    /**
     * Get <p>TCR仓库信息</p> 
     * @return TcrRepoInfo <p>TCR仓库信息</p>
     */
    public TcrRepoInfo getTcrRepoInfo() {
        return this.TcrRepoInfo;
    }

    /**
     * Set <p>TCR仓库信息</p>
     * @param TcrRepoInfo <p>TCR仓库信息</p>
     */
    public void setTcrRepoInfo(TcrRepoInfo TcrRepoInfo) {
        this.TcrRepoInfo = TcrRepoInfo;
    }

    /**
     * Get <p>容器访问凭证名称</p> 
     * @return SecretName <p>容器访问凭证名称</p>
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set <p>容器访问凭证名称</p>
     * @param SecretName <p>容器访问凭证名称</p>
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get <p>业务容器的镜像版本号</p> 
     * @return TagName <p>业务容器的镜像版本号</p>
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * Set <p>业务容器的镜像版本号</p>
     * @param TagName <p>业务容器的镜像版本号</p>
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
    }

    /**
     * Get <p>健康检查</p> 
     * @return HealthCheckSettings <p>健康检查</p>
     */
    public HealthCheckSettings getHealthCheckSettings() {
        return this.HealthCheckSettings;
    }

    /**
     * Set <p>健康检查</p>
     * @param HealthCheckSettings <p>健康检查</p>
     */
    public void setHealthCheckSettings(HealthCheckSettings HealthCheckSettings) {
        this.HealthCheckSettings = HealthCheckSettings;
    }

    /**
     * Get <p>业务容器的 cpu  request</p> 
     * @return CpuRequest <p>业务容器的 cpu  request</p>
     */
    public String getCpuRequest() {
        return this.CpuRequest;
    }

    /**
     * Set <p>业务容器的 cpu  request</p>
     * @param CpuRequest <p>业务容器的 cpu  request</p>
     */
    public void setCpuRequest(String CpuRequest) {
        this.CpuRequest = CpuRequest;
    }

    /**
     * Get <p>业务容器的 cpu limit</p> 
     * @return CpuLimit <p>业务容器的 cpu limit</p>
     */
    public String getCpuLimit() {
        return this.CpuLimit;
    }

    /**
     * Set <p>业务容器的 cpu limit</p>
     * @param CpuLimit <p>业务容器的 cpu limit</p>
     */
    public void setCpuLimit(String CpuLimit) {
        this.CpuLimit = CpuLimit;
    }

    /**
     * Get <p>业务容器的 mem request</p> 
     * @return MemRequest <p>业务容器的 mem request</p>
     */
    public String getMemRequest() {
        return this.MemRequest;
    }

    /**
     * Set <p>业务容器的 mem request</p>
     * @param MemRequest <p>业务容器的 mem request</p>
     */
    public void setMemRequest(String MemRequest) {
        this.MemRequest = MemRequest;
    }

    /**
     * Get <p>业务容器的 mem limit</p> 
     * @return MemLimit <p>业务容器的 mem limit</p>
     */
    public String getMemLimit() {
        return this.MemLimit;
    }

    /**
     * Set <p>业务容器的 mem limit</p>
     * @param MemLimit <p>业务容器的 mem limit</p>
     */
    public void setMemLimit(String MemLimit) {
        this.MemLimit = MemLimit;
    }

    /**
     * Get <p>业务容器的 jvm 参数</p> 
     * @return JvmOpts <p>业务容器的 jvm 参数</p>
     */
    public String getJvmOpts() {
        return this.JvmOpts;
    }

    /**
     * Set <p>业务容器的 jvm 参数</p>
     * @param JvmOpts <p>业务容器的 jvm 参数</p>
     */
    public void setJvmOpts(String JvmOpts) {
        this.JvmOpts = JvmOpts;
    }

    /**
     * Get <p>是否为初始化容器 业务主容器不能为初始化容</p> 
     * @return InitContainerEnable <p>是否为初始化容器 业务主容器不能为初始化容</p>
     */
    public Boolean getInitContainerEnable() {
        return this.InitContainerEnable;
    }

    /**
     * Set <p>是否为初始化容器 业务主容器不能为初始化容</p>
     * @param InitContainerEnable <p>是否为初始化容器 业务主容器不能为初始化容</p>
     */
    public void setInitContainerEnable(Boolean InitContainerEnable) {
        this.InitContainerEnable = InitContainerEnable;
    }

    /**
     * Get <p>业务主容器是否为特权容器</p> 
     * @return PrivilegeContainerEnable <p>业务主容器是否为特权容器</p>
     */
    public Boolean getPrivilegeContainerEnable() {
        return this.PrivilegeContainerEnable;
    }

    /**
     * Set <p>业务主容器是否为特权容器</p>
     * @param PrivilegeContainerEnable <p>业务主容器是否为特权容器</p>
     */
    public void setPrivilegeContainerEnable(Boolean PrivilegeContainerEnable) {
        this.PrivilegeContainerEnable = PrivilegeContainerEnable;
    }

    /**
     * Get <p>业务主容器运行命令(转base64)</p> 
     * @return RunCommand <p>业务主容器运行命令(转base64)</p>
     */
    public String getRunCommand() {
        return this.RunCommand;
    }

    /**
     * Set <p>业务主容器运行命令(转base64)</p>
     * @param RunCommand <p>业务主容器运行命令(转base64)</p>
     */
    public void setRunCommand(String RunCommand) {
        this.RunCommand = RunCommand;
    }

    /**
     * Get <p>业务主容器运行参数(转base64)</p> 
     * @return RunArg <p>业务主容器运行参数(转base64)</p>
     */
    public String getRunArg() {
        return this.RunArg;
    }

    /**
     * Set <p>业务主容器运行参数(转base64)</p>
     * @param RunArg <p>业务主容器运行参数(转base64)</p>
     */
    public void setRunArg(String RunArg) {
        this.RunArg = RunArg;
    }

    /**
     * Get <p>实例数量</p> 
     * @return InstanceNum <p>实例数量</p>
     */
    public Long getInstanceNum() {
        return this.InstanceNum;
    }

    /**
     * Set <p>实例数量</p>
     * @param InstanceNum <p>实例数量</p>
     */
    public void setInstanceNum(Long InstanceNum) {
        this.InstanceNum = InstanceNum;
    }

    /**
     * Get <p>调度策略</p> 
     * @return SchedulingStrategy <p>调度策略</p>
     */
    public SchedulingStrategy getSchedulingStrategy() {
        return this.SchedulingStrategy;
    }

    /**
     * Set <p>调度策略</p>
     * @param SchedulingStrategy <p>调度策略</p>
     */
    public void setSchedulingStrategy(SchedulingStrategy SchedulingStrategy) {
        this.SchedulingStrategy = SchedulingStrategy;
    }

    /**
     * Get <p>重启策略</p> 
     * @return RestartPolicy <p>重启策略</p>
     */
    public String getRestartPolicy() {
        return this.RestartPolicy;
    }

    /**
     * Set <p>重启策略</p>
     * @param RestartPolicy <p>重启策略</p>
     */
    public void setRestartPolicy(String RestartPolicy) {
        this.RestartPolicy = RestartPolicy;
    }

    /**
     * Get <p>服务治理配置</p> 
     * @return ServiceSpecEncode <p>服务治理配置</p>
     */
    public String getServiceSpecEncode() {
        return this.ServiceSpecEncode;
    }

    /**
     * Set <p>服务治理配置</p>
     * @param ServiceSpecEncode <p>服务治理配置</p>
     */
    public void setServiceSpecEncode(String ServiceSpecEncode) {
        this.ServiceSpecEncode = ServiceSpecEncode;
    }

    /**
     * Get <p>istio容器的 mem Request</p> 
     * @return IstioMemRequest <p>istio容器的 mem Request</p>
     */
    public String getIstioMemRequest() {
        return this.IstioMemRequest;
    }

    /**
     * Set <p>istio容器的 mem Request</p>
     * @param IstioMemRequest <p>istio容器的 mem Request</p>
     */
    public void setIstioMemRequest(String IstioMemRequest) {
        this.IstioMemRequest = IstioMemRequest;
    }

    /**
     * Get <p>istio容器的 cpu Request</p> 
     * @return IstioCpuRequest <p>istio容器的 cpu Request</p>
     */
    public String getIstioCpuRequest() {
        return this.IstioCpuRequest;
    }

    /**
     * Set <p>istio容器的 cpu Request</p>
     * @param IstioCpuRequest <p>istio容器的 cpu Request</p>
     */
    public void setIstioCpuRequest(String IstioCpuRequest) {
        this.IstioCpuRequest = IstioCpuRequest;
    }

    /**
     * Get <p>istio容器的 mem Limit</p> 
     * @return IstioMemLimit <p>istio容器的 mem Limit</p>
     */
    public String getIstioMemLimit() {
        return this.IstioMemLimit;
    }

    /**
     * Set <p>istio容器的 mem Limit</p>
     * @param IstioMemLimit <p>istio容器的 mem Limit</p>
     */
    public void setIstioMemLimit(String IstioMemLimit) {
        this.IstioMemLimit = IstioMemLimit;
    }

    /**
     * Get <p>istio容器的 cpu Limit</p> 
     * @return IstioCpuLimit <p>istio容器的 cpu Limit</p>
     */
    public String getIstioCpuLimit() {
        return this.IstioCpuLimit;
    }

    /**
     * Set <p>istio容器的 cpu Limit</p>
     * @param IstioCpuLimit <p>istio容器的 cpu Limit</p>
     */
    public void setIstioCpuLimit(String IstioCpuLimit) {
        this.IstioCpuLimit = IstioCpuLimit;
    }

    /**
     * Get <p>服务治理配置</p> 
     * @return ServiceGovernanceConfig <p>服务治理配置</p>
     */
    public ContainerGroupServiceGovernanceConfig getServiceGovernanceConfig() {
        return this.ServiceGovernanceConfig;
    }

    /**
     * Set <p>服务治理配置</p>
     * @param ServiceGovernanceConfig <p>服务治理配置</p>
     */
    public void setServiceGovernanceConfig(ContainerGroupServiceGovernanceConfig ServiceGovernanceConfig) {
        this.ServiceGovernanceConfig = ServiceGovernanceConfig;
    }

    /**
     * Get <p>agent容器的 mem Request</p> 
     * @return AgentMemRequest <p>agent容器的 mem Request</p>
     */
    public String getAgentMemRequest() {
        return this.AgentMemRequest;
    }

    /**
     * Set <p>agent容器的 mem Request</p>
     * @param AgentMemRequest <p>agent容器的 mem Request</p>
     */
    public void setAgentMemRequest(String AgentMemRequest) {
        this.AgentMemRequest = AgentMemRequest;
    }

    /**
     * Get <p>agent容器的 cpu Request</p> 
     * @return AgentCpuRequest <p>agent容器的 cpu Request</p>
     */
    public String getAgentCpuRequest() {
        return this.AgentCpuRequest;
    }

    /**
     * Set <p>agent容器的 cpu Request</p>
     * @param AgentCpuRequest <p>agent容器的 cpu Request</p>
     */
    public void setAgentCpuRequest(String AgentCpuRequest) {
        this.AgentCpuRequest = AgentCpuRequest;
    }

    /**
     * Get <p>agent容器的 mem Limit</p> 
     * @return AgentMemLimit <p>agent容器的 mem Limit</p>
     */
    public String getAgentMemLimit() {
        return this.AgentMemLimit;
    }

    /**
     * Set <p>agent容器的 mem Limit</p>
     * @param AgentMemLimit <p>agent容器的 mem Limit</p>
     */
    public void setAgentMemLimit(String AgentMemLimit) {
        this.AgentMemLimit = AgentMemLimit;
    }

    /**
     * Get <p>agent容器的 cpu Limit</p> 
     * @return AgentCpuLimit <p>agent容器的 cpu Limit</p>
     */
    public String getAgentCpuLimit() {
        return this.AgentCpuLimit;
    }

    /**
     * Set <p>agent容器的 cpu Limit</p>
     * @param AgentCpuLimit <p>agent容器的 cpu Limit</p>
     */
    public void setAgentCpuLimit(String AgentCpuLimit) {
        this.AgentCpuLimit = AgentCpuLimit;
    }

    /**
     * Get <p>发布策略(0表示快速更新，1表示滚动更新。默认值为0)</p> 
     * @return UpdateType <p>发布策略(0表示快速更新，1表示滚动更新。默认值为0)</p>
     */
    public Long getUpdateType() {
        return this.UpdateType;
    }

    /**
     * Set <p>发布策略(0表示快速更新，1表示滚动更新。默认值为0)</p>
     * @param UpdateType <p>发布策略(0表示快速更新，1表示滚动更新。默认值为0)</p>
     */
    public void setUpdateType(Long UpdateType) {
        this.UpdateType = UpdateType;
    }

    /**
     * Get <p>更新间隔,单位秒</p> 
     * @return UpdateIvl <p>更新间隔,单位秒</p>
     */
    public Long getUpdateIvl() {
        return this.UpdateIvl;
    }

    /**
     * Set <p>更新间隔,单位秒</p>
     * @param UpdateIvl <p>更新间隔,单位秒</p>
     */
    public void setUpdateIvl(Long UpdateIvl) {
        this.UpdateIvl = UpdateIvl;
    }

    /**
     * Get <p>对应更新策略和策略配置参数</p> 
     * @return MaxSurge <p>对应更新策略和策略配置参数</p>
     */
    public String getMaxSurge() {
        return this.MaxSurge;
    }

    /**
     * Set <p>对应更新策略和策略配置参数</p>
     * @param MaxSurge <p>对应更新策略和策略配置参数</p>
     */
    public void setMaxSurge(String MaxSurge) {
        this.MaxSurge = MaxSurge;
    }

    /**
     * Get <p>对应更新策略和策略配置参数</p> 
     * @return MaxUnavailable <p>对应更新策略和策略配置参数</p>
     */
    public String getMaxUnavailable() {
        return this.MaxUnavailable;
    }

    /**
     * Set <p>对应更新策略和策略配置参数</p>
     * @param MaxUnavailable <p>对应更新策略和策略配置参数</p>
     */
    public void setMaxUnavailable(String MaxUnavailable) {
        this.MaxUnavailable = MaxUnavailable;
    }

    /**
     * Get <p>预热参数配置</p> 
     * @return WarmupSetting <p>预热参数配置</p>
     */
    public WarmupSetting getWarmupSetting() {
        return this.WarmupSetting;
    }

    /**
     * Set <p>预热参数配置</p>
     * @param WarmupSetting <p>预热参数配置</p>
     */
    public void setWarmupSetting(WarmupSetting WarmupSetting) {
        this.WarmupSetting = WarmupSetting;
    }

    /**
     * Get <p>配置模版ID</p> 
     * @return ConfigTemplateId <p>配置模版ID</p>
     */
    public String getConfigTemplateId() {
        return this.ConfigTemplateId;
    }

    /**
     * Set <p>配置模版ID</p>
     * @param ConfigTemplateId <p>配置模版ID</p>
     */
    public void setConfigTemplateId(String ConfigTemplateId) {
        this.ConfigTemplateId = ConfigTemplateId;
    }

    /**
     * Get <p>配置模版Version</p> 
     * @return ConfigTemplateVersion <p>配置模版Version</p>
     */
    public Long getConfigTemplateVersion() {
        return this.ConfigTemplateVersion;
    }

    /**
     * Set <p>配置模版Version</p>
     * @param ConfigTemplateVersion <p>配置模版Version</p>
     */
    public void setConfigTemplateVersion(Long ConfigTemplateVersion) {
        this.ConfigTemplateVersion = ConfigTemplateVersion;
    }

    /**
     * Get <p>是否清除数据卷信息</p> 
     * @return VolumeClean <p>是否清除数据卷信息</p>
     */
    public Boolean getVolumeClean() {
        return this.VolumeClean;
    }

    /**
     * Set <p>是否清除数据卷信息</p>
     * @param VolumeClean <p>是否清除数据卷信息</p>
     */
    public void setVolumeClean(Boolean VolumeClean) {
        this.VolumeClean = VolumeClean;
    }

    /**
     * Get <p>命名空间Id</p> 
     * @return NamespaceId <p>命名空间Id</p>
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set <p>命名空间Id</p>
     * @param NamespaceId <p>命名空间Id</p>
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get <p>是否部署agent容器</p> 
     * @return DeployAgent <p>是否部署agent容器</p>
     */
    public Boolean getDeployAgent() {
        return this.DeployAgent;
    }

    /**
     * Set <p>是否部署agent容器</p>
     * @param DeployAgent <p>是否部署agent容器</p>
     */
    public void setDeployAgent(Boolean DeployAgent) {
        this.DeployAgent = DeployAgent;
    }

    /**
     * Get <p>javaagent信息: SERVICE_AGENT/OT_AGENT</p> 
     * @return AgentProfileList <p>javaagent信息: SERVICE_AGENT/OT_AGENT</p>
     */
    public AgentProfile [] getAgentProfileList() {
        return this.AgentProfileList;
    }

    /**
     * Set <p>javaagent信息: SERVICE_AGENT/OT_AGENT</p>
     * @param AgentProfileList <p>javaagent信息: SERVICE_AGENT/OT_AGENT</p>
     */
    public void setAgentProfileList(AgentProfile [] AgentProfileList) {
        this.AgentProfileList = AgentProfileList;
    }

    /**
     * Get <p>是否清除Service信息</p> 
     * @return ServiceClean <p>是否清除Service信息</p>
     */
    public Boolean getServiceClean() {
        return this.ServiceClean;
    }

    /**
     * Set <p>是否清除Service信息</p>
     * @param ServiceClean <p>是否清除Service信息</p>
     */
    public void setServiceClean(Boolean ServiceClean) {
        this.ServiceClean = ServiceClean;
    }

    /**
     * Get <p>是否清除Env信息</p> 
     * @return EnvClean <p>是否清除Env信息</p>
     */
    public Boolean getEnvClean() {
        return this.EnvClean;
    }

    /**
     * Set <p>是否清除Env信息</p>
     * @param EnvClean <p>是否清除Env信息</p>
     */
    public void setEnvClean(Boolean EnvClean) {
        this.EnvClean = EnvClean;
    }

    /**
     * Get <p>本次部署的描述信息</p> 
     * @return DeployDesc <p>本次部署的描述信息</p>
     */
    public String getDeployDesc() {
        return this.DeployDesc;
    }

    /**
     * Set <p>本次部署的描述信息</p>
     * @param DeployDesc <p>本次部署的描述信息</p>
     */
    public void setDeployDesc(String DeployDesc) {
        this.DeployDesc = DeployDesc;
    }

    /**
     * Get <p>k8s命名空间名称</p> 
     * @return K8sNamespaceName <p>k8s命名空间名称</p>
     */
    public String getK8sNamespaceName() {
        return this.K8sNamespaceName;
    }

    /**
     * Set <p>k8s命名空间名称</p>
     * @param K8sNamespaceName <p>k8s命名空间名称</p>
     */
    public void setK8sNamespaceName(String K8sNamespaceName) {
        this.K8sNamespaceName = K8sNamespaceName;
    }

    /**
     * Get <p>是否启用静态IP</p> 
     * @return StaticIpEnabled <p>是否启用静态IP</p>
     */
    public Boolean getStaticIpEnabled() {
        return this.StaticIpEnabled;
    }

    /**
     * Set <p>是否启用静态IP</p>
     * @param StaticIpEnabled <p>是否启用静态IP</p>
     */
    public void setStaticIpEnabled(Boolean StaticIpEnabled) {
        this.StaticIpEnabled = StaticIpEnabled;
    }

    /**
     * Get <p>启动策略[OrderedReady/Parallel]</p> 
     * @return PodManagementPolicyType <p>启动策略[OrderedReady/Parallel]</p>
     */
    public String getPodManagementPolicyType() {
        return this.PodManagementPolicyType;
    }

    /**
     * Set <p>启动策略[OrderedReady/Parallel]</p>
     * @param PodManagementPolicyType <p>启动策略[OrderedReady/Parallel]</p>
     */
    public void setPodManagementPolicyType(String PodManagementPolicyType) {
        this.PodManagementPolicyType = PodManagementPolicyType;
    }

    /**
     * Get <p>滚动更新分区序号</p> 
     * @return Partition <p>滚动更新分区序号</p>
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set <p>滚动更新分区序号</p>
     * @param Partition <p>滚动更新分区序号</p>
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    /**
     * Get <p>是否是增量部署，增量部署只运行增量覆盖一级参数，不支持对一级参数中的子参数进行增量更新，例如更新VolumeMountInfoList时必须传入VolumeMountInfoList更新后的全量参数</p> 
     * @return IncrementalDeployment <p>是否是增量部署，增量部署只运行增量覆盖一级参数，不支持对一级参数中的子参数进行增量更新，例如更新VolumeMountInfoList时必须传入VolumeMountInfoList更新后的全量参数</p>
     */
    public Boolean getIncrementalDeployment() {
        return this.IncrementalDeployment;
    }

    /**
     * Set <p>是否是增量部署，增量部署只运行增量覆盖一级参数，不支持对一级参数中的子参数进行增量更新，例如更新VolumeMountInfoList时必须传入VolumeMountInfoList更新后的全量参数</p>
     * @param IncrementalDeployment <p>是否是增量部署，增量部署只运行增量覆盖一级参数，不支持对一级参数中的子参数进行增量更新，例如更新VolumeMountInfoList时必须传入VolumeMountInfoList更新后的全量参数</p>
     */
    public void setIncrementalDeployment(Boolean IncrementalDeployment) {
        this.IncrementalDeployment = IncrementalDeployment;
    }

    /**
     * Get <p>是否不立即启动</p> 
     * @return DoNotStart <p>是否不立即启动</p>
     */
    public Boolean getDoNotStart() {
        return this.DoNotStart;
    }

    /**
     * Set <p>是否不立即启动</p>
     * @param DoNotStart <p>是否不立即启动</p>
     */
    public void setDoNotStart(Boolean DoNotStart) {
        this.DoNotStart = DoNotStart;
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
        if (source.K8sNamespaceName != null) {
            this.K8sNamespaceName = new String(source.K8sNamespaceName);
        }
        if (source.StaticIpEnabled != null) {
            this.StaticIpEnabled = new Boolean(source.StaticIpEnabled);
        }
        if (source.PodManagementPolicyType != null) {
            this.PodManagementPolicyType = new String(source.PodManagementPolicyType);
        }
        if (source.Partition != null) {
            this.Partition = new Long(source.Partition);
        }
        if (source.IncrementalDeployment != null) {
            this.IncrementalDeployment = new Boolean(source.IncrementalDeployment);
        }
        if (source.DoNotStart != null) {
            this.DoNotStart = new Boolean(source.DoNotStart);
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
        this.setParamSimple(map, prefix + "K8sNamespaceName", this.K8sNamespaceName);
        this.setParamSimple(map, prefix + "StaticIpEnabled", this.StaticIpEnabled);
        this.setParamSimple(map, prefix + "PodManagementPolicyType", this.PodManagementPolicyType);
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamSimple(map, prefix + "IncrementalDeployment", this.IncrementalDeployment);
        this.setParamSimple(map, prefix + "DoNotStart", this.DoNotStart);

    }
}

