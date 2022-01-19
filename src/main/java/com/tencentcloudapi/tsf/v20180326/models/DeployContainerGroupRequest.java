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

public class DeployContainerGroupRequest extends AbstractModel{

    /**
    * 部署组ID，分组唯一标识
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 镜像版本名称,如v1
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
    * 实例数量
    */
    @SerializedName("InstanceNum")
    @Expose
    private Long InstanceNum;

    /**
    * 镜像server
    */
    @SerializedName("Server")
    @Expose
    private String Server;

    /**
    * 旧版镜像名，如/tsf/nginx
    */
    @SerializedName("Reponame")
    @Expose
    private String Reponame;

    /**
    * 业务容器最大的 CPU 核数，对应 K8S 的 limit；不填时默认为 request 的 2 倍
    */
    @SerializedName("CpuLimit")
    @Expose
    private String CpuLimit;

    /**
    * 业务容器最大的内存 MiB 数，对应 K8S 的 limit；不填时默认为 request 的 2 倍
    */
    @SerializedName("MemLimit")
    @Expose
    private String MemLimit;

    /**
    * jvm参数
    */
    @SerializedName("JvmOpts")
    @Expose
    private String JvmOpts;

    /**
    * 业务容器分配的 CPU 核数，对应 K8S 的 request，默认0.25
    */
    @SerializedName("CpuRequest")
    @Expose
    private String CpuRequest;

    /**
    * 业务容器分配的内存 MiB 数，对应 K8S 的 request，默认640 MiB
    */
    @SerializedName("MemRequest")
    @Expose
    private String MemRequest;

    /**
    * 是否不立即启动
    */
    @SerializedName("DoNotStart")
    @Expose
    private Boolean DoNotStart;

    /**
    * （优先使用）新版镜像名，如/tsf/nginx
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * 更新方式：0:快速更新 1:滚动更新
    */
    @SerializedName("UpdateType")
    @Expose
    private Long UpdateType;

    /**
    * 滚动更新必填，更新间隔
    */
    @SerializedName("UpdateIvl")
    @Expose
    private Long UpdateIvl;

    /**
    * agent 容器分配的 CPU 核数，对应 K8S 的 request
    */
    @SerializedName("AgentCpuRequest")
    @Expose
    private String AgentCpuRequest;

    /**
    * agent 容器最大的 CPU 核数，对应 K8S 的 limit
    */
    @SerializedName("AgentCpuLimit")
    @Expose
    private String AgentCpuLimit;

    /**
    * agent 容器分配的内存 MiB 数，对应 K8S 的 request
    */
    @SerializedName("AgentMemRequest")
    @Expose
    private String AgentMemRequest;

    /**
    * agent 容器最大的内存 MiB 数，对应 K8S 的 limit
    */
    @SerializedName("AgentMemLimit")
    @Expose
    private String AgentMemLimit;

    /**
    * istioproxy 容器分配的 CPU 核数，对应 K8S 的 request
    */
    @SerializedName("IstioCpuRequest")
    @Expose
    private String IstioCpuRequest;

    /**
    * istioproxy 容器最大的 CPU 核数，对应 K8S 的 limit
    */
    @SerializedName("IstioCpuLimit")
    @Expose
    private String IstioCpuLimit;

    /**
    * istioproxy 容器分配的内存 MiB 数，对应 K8S 的 request
    */
    @SerializedName("IstioMemRequest")
    @Expose
    private String IstioMemRequest;

    /**
    * istioproxy 容器最大的内存 MiB 数，对应 K8S 的 limit
    */
    @SerializedName("IstioMemLimit")
    @Expose
    private String IstioMemLimit;

    /**
    * kubernetes滚动更新策略的MaxSurge参数
    */
    @SerializedName("MaxSurge")
    @Expose
    private String MaxSurge;

    /**
    * kubernetes滚动更新策略的MaxUnavailable参数
    */
    @SerializedName("MaxUnavailable")
    @Expose
    private String MaxUnavailable;

    /**
    * 健康检查配置信息，若不指定该参数，则默认不设置健康检查。
    */
    @SerializedName("HealthCheckSettings")
    @Expose
    private HealthCheckSettings HealthCheckSettings;

    /**
    * 部署组应用运行的环境变量。若不指定该参数，则默认不设置额外的环境变量。
    */
    @SerializedName("Envs")
    @Expose
    private Env [] Envs;

    /**
    * 容器部署组的网络设置。
    */
    @SerializedName("ServiceSetting")
    @Expose
    private ServiceSetting ServiceSetting;

    /**
    * 是否部署 agent 容器。若不指定该参数，则默认不部署 agent 容器。
    */
    @SerializedName("DeployAgent")
    @Expose
    private Boolean DeployAgent;

    /**
    * 节点调度策略。若不指定改参数，则默认不使用节点调度策略。
    */
    @SerializedName("SchedulingStrategy")
    @Expose
    private SchedulingStrategy SchedulingStrategy;

    /**
    * 是否进行增量部署，默认为false，全量更新
    */
    @SerializedName("IncrementalDeployment")
    @Expose
    private Boolean IncrementalDeployment;

    /**
    * tcr或者不填
    */
    @SerializedName("RepoType")
    @Expose
    private String RepoType;

    /**
    * 数据卷信息-废弃，请用VolumeInfoList参数
    */
    @SerializedName("VolumeInfos")
    @Expose
    private VolumeInfo VolumeInfos;

    /**
    * 数据卷挂载点信息-废弃，请用VolumeMountInfoList参数
    */
    @SerializedName("VolumeMountInfos")
    @Expose
    private VolumeMountInfo VolumeMountInfos;

    /**
    * 数据卷信息，list
    */
    @SerializedName("VolumeInfoList")
    @Expose
    private VolumeInfo [] VolumeInfoList;

    /**
    * 数据卷挂载点信息，list
    */
    @SerializedName("VolumeMountInfoList")
    @Expose
    private VolumeMountInfo [] VolumeMountInfoList;

    /**
    * 是否清除数据卷信息，默认false
    */
    @SerializedName("VolumeClean")
    @Expose
    private Boolean VolumeClean;

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
     * Get 镜像版本名称,如v1 
     * @return TagName 镜像版本名称,如v1
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * Set 镜像版本名称,如v1
     * @param TagName 镜像版本名称,如v1
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
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
     * Get 镜像server 
     * @return Server 镜像server
     */
    public String getServer() {
        return this.Server;
    }

    /**
     * Set 镜像server
     * @param Server 镜像server
     */
    public void setServer(String Server) {
        this.Server = Server;
    }

    /**
     * Get 旧版镜像名，如/tsf/nginx 
     * @return Reponame 旧版镜像名，如/tsf/nginx
     */
    public String getReponame() {
        return this.Reponame;
    }

    /**
     * Set 旧版镜像名，如/tsf/nginx
     * @param Reponame 旧版镜像名，如/tsf/nginx
     */
    public void setReponame(String Reponame) {
        this.Reponame = Reponame;
    }

    /**
     * Get 业务容器最大的 CPU 核数，对应 K8S 的 limit；不填时默认为 request 的 2 倍 
     * @return CpuLimit 业务容器最大的 CPU 核数，对应 K8S 的 limit；不填时默认为 request 的 2 倍
     */
    public String getCpuLimit() {
        return this.CpuLimit;
    }

    /**
     * Set 业务容器最大的 CPU 核数，对应 K8S 的 limit；不填时默认为 request 的 2 倍
     * @param CpuLimit 业务容器最大的 CPU 核数，对应 K8S 的 limit；不填时默认为 request 的 2 倍
     */
    public void setCpuLimit(String CpuLimit) {
        this.CpuLimit = CpuLimit;
    }

    /**
     * Get 业务容器最大的内存 MiB 数，对应 K8S 的 limit；不填时默认为 request 的 2 倍 
     * @return MemLimit 业务容器最大的内存 MiB 数，对应 K8S 的 limit；不填时默认为 request 的 2 倍
     */
    public String getMemLimit() {
        return this.MemLimit;
    }

    /**
     * Set 业务容器最大的内存 MiB 数，对应 K8S 的 limit；不填时默认为 request 的 2 倍
     * @param MemLimit 业务容器最大的内存 MiB 数，对应 K8S 的 limit；不填时默认为 request 的 2 倍
     */
    public void setMemLimit(String MemLimit) {
        this.MemLimit = MemLimit;
    }

    /**
     * Get jvm参数 
     * @return JvmOpts jvm参数
     */
    public String getJvmOpts() {
        return this.JvmOpts;
    }

    /**
     * Set jvm参数
     * @param JvmOpts jvm参数
     */
    public void setJvmOpts(String JvmOpts) {
        this.JvmOpts = JvmOpts;
    }

    /**
     * Get 业务容器分配的 CPU 核数，对应 K8S 的 request，默认0.25 
     * @return CpuRequest 业务容器分配的 CPU 核数，对应 K8S 的 request，默认0.25
     */
    public String getCpuRequest() {
        return this.CpuRequest;
    }

    /**
     * Set 业务容器分配的 CPU 核数，对应 K8S 的 request，默认0.25
     * @param CpuRequest 业务容器分配的 CPU 核数，对应 K8S 的 request，默认0.25
     */
    public void setCpuRequest(String CpuRequest) {
        this.CpuRequest = CpuRequest;
    }

    /**
     * Get 业务容器分配的内存 MiB 数，对应 K8S 的 request，默认640 MiB 
     * @return MemRequest 业务容器分配的内存 MiB 数，对应 K8S 的 request，默认640 MiB
     */
    public String getMemRequest() {
        return this.MemRequest;
    }

    /**
     * Set 业务容器分配的内存 MiB 数，对应 K8S 的 request，默认640 MiB
     * @param MemRequest 业务容器分配的内存 MiB 数，对应 K8S 的 request，默认640 MiB
     */
    public void setMemRequest(String MemRequest) {
        this.MemRequest = MemRequest;
    }

    /**
     * Get 是否不立即启动 
     * @return DoNotStart 是否不立即启动
     */
    public Boolean getDoNotStart() {
        return this.DoNotStart;
    }

    /**
     * Set 是否不立即启动
     * @param DoNotStart 是否不立即启动
     */
    public void setDoNotStart(Boolean DoNotStart) {
        this.DoNotStart = DoNotStart;
    }

    /**
     * Get （优先使用）新版镜像名，如/tsf/nginx 
     * @return RepoName （优先使用）新版镜像名，如/tsf/nginx
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set （优先使用）新版镜像名，如/tsf/nginx
     * @param RepoName （优先使用）新版镜像名，如/tsf/nginx
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
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
     * Get 滚动更新必填，更新间隔 
     * @return UpdateIvl 滚动更新必填，更新间隔
     */
    public Long getUpdateIvl() {
        return this.UpdateIvl;
    }

    /**
     * Set 滚动更新必填，更新间隔
     * @param UpdateIvl 滚动更新必填，更新间隔
     */
    public void setUpdateIvl(Long UpdateIvl) {
        this.UpdateIvl = UpdateIvl;
    }

    /**
     * Get agent 容器分配的 CPU 核数，对应 K8S 的 request 
     * @return AgentCpuRequest agent 容器分配的 CPU 核数，对应 K8S 的 request
     */
    public String getAgentCpuRequest() {
        return this.AgentCpuRequest;
    }

    /**
     * Set agent 容器分配的 CPU 核数，对应 K8S 的 request
     * @param AgentCpuRequest agent 容器分配的 CPU 核数，对应 K8S 的 request
     */
    public void setAgentCpuRequest(String AgentCpuRequest) {
        this.AgentCpuRequest = AgentCpuRequest;
    }

    /**
     * Get agent 容器最大的 CPU 核数，对应 K8S 的 limit 
     * @return AgentCpuLimit agent 容器最大的 CPU 核数，对应 K8S 的 limit
     */
    public String getAgentCpuLimit() {
        return this.AgentCpuLimit;
    }

    /**
     * Set agent 容器最大的 CPU 核数，对应 K8S 的 limit
     * @param AgentCpuLimit agent 容器最大的 CPU 核数，对应 K8S 的 limit
     */
    public void setAgentCpuLimit(String AgentCpuLimit) {
        this.AgentCpuLimit = AgentCpuLimit;
    }

    /**
     * Get agent 容器分配的内存 MiB 数，对应 K8S 的 request 
     * @return AgentMemRequest agent 容器分配的内存 MiB 数，对应 K8S 的 request
     */
    public String getAgentMemRequest() {
        return this.AgentMemRequest;
    }

    /**
     * Set agent 容器分配的内存 MiB 数，对应 K8S 的 request
     * @param AgentMemRequest agent 容器分配的内存 MiB 数，对应 K8S 的 request
     */
    public void setAgentMemRequest(String AgentMemRequest) {
        this.AgentMemRequest = AgentMemRequest;
    }

    /**
     * Get agent 容器最大的内存 MiB 数，对应 K8S 的 limit 
     * @return AgentMemLimit agent 容器最大的内存 MiB 数，对应 K8S 的 limit
     */
    public String getAgentMemLimit() {
        return this.AgentMemLimit;
    }

    /**
     * Set agent 容器最大的内存 MiB 数，对应 K8S 的 limit
     * @param AgentMemLimit agent 容器最大的内存 MiB 数，对应 K8S 的 limit
     */
    public void setAgentMemLimit(String AgentMemLimit) {
        this.AgentMemLimit = AgentMemLimit;
    }

    /**
     * Get istioproxy 容器分配的 CPU 核数，对应 K8S 的 request 
     * @return IstioCpuRequest istioproxy 容器分配的 CPU 核数，对应 K8S 的 request
     */
    public String getIstioCpuRequest() {
        return this.IstioCpuRequest;
    }

    /**
     * Set istioproxy 容器分配的 CPU 核数，对应 K8S 的 request
     * @param IstioCpuRequest istioproxy 容器分配的 CPU 核数，对应 K8S 的 request
     */
    public void setIstioCpuRequest(String IstioCpuRequest) {
        this.IstioCpuRequest = IstioCpuRequest;
    }

    /**
     * Get istioproxy 容器最大的 CPU 核数，对应 K8S 的 limit 
     * @return IstioCpuLimit istioproxy 容器最大的 CPU 核数，对应 K8S 的 limit
     */
    public String getIstioCpuLimit() {
        return this.IstioCpuLimit;
    }

    /**
     * Set istioproxy 容器最大的 CPU 核数，对应 K8S 的 limit
     * @param IstioCpuLimit istioproxy 容器最大的 CPU 核数，对应 K8S 的 limit
     */
    public void setIstioCpuLimit(String IstioCpuLimit) {
        this.IstioCpuLimit = IstioCpuLimit;
    }

    /**
     * Get istioproxy 容器分配的内存 MiB 数，对应 K8S 的 request 
     * @return IstioMemRequest istioproxy 容器分配的内存 MiB 数，对应 K8S 的 request
     */
    public String getIstioMemRequest() {
        return this.IstioMemRequest;
    }

    /**
     * Set istioproxy 容器分配的内存 MiB 数，对应 K8S 的 request
     * @param IstioMemRequest istioproxy 容器分配的内存 MiB 数，对应 K8S 的 request
     */
    public void setIstioMemRequest(String IstioMemRequest) {
        this.IstioMemRequest = IstioMemRequest;
    }

    /**
     * Get istioproxy 容器最大的内存 MiB 数，对应 K8S 的 limit 
     * @return IstioMemLimit istioproxy 容器最大的内存 MiB 数，对应 K8S 的 limit
     */
    public String getIstioMemLimit() {
        return this.IstioMemLimit;
    }

    /**
     * Set istioproxy 容器最大的内存 MiB 数，对应 K8S 的 limit
     * @param IstioMemLimit istioproxy 容器最大的内存 MiB 数，对应 K8S 的 limit
     */
    public void setIstioMemLimit(String IstioMemLimit) {
        this.IstioMemLimit = IstioMemLimit;
    }

    /**
     * Get kubernetes滚动更新策略的MaxSurge参数 
     * @return MaxSurge kubernetes滚动更新策略的MaxSurge参数
     */
    public String getMaxSurge() {
        return this.MaxSurge;
    }

    /**
     * Set kubernetes滚动更新策略的MaxSurge参数
     * @param MaxSurge kubernetes滚动更新策略的MaxSurge参数
     */
    public void setMaxSurge(String MaxSurge) {
        this.MaxSurge = MaxSurge;
    }

    /**
     * Get kubernetes滚动更新策略的MaxUnavailable参数 
     * @return MaxUnavailable kubernetes滚动更新策略的MaxUnavailable参数
     */
    public String getMaxUnavailable() {
        return this.MaxUnavailable;
    }

    /**
     * Set kubernetes滚动更新策略的MaxUnavailable参数
     * @param MaxUnavailable kubernetes滚动更新策略的MaxUnavailable参数
     */
    public void setMaxUnavailable(String MaxUnavailable) {
        this.MaxUnavailable = MaxUnavailable;
    }

    /**
     * Get 健康检查配置信息，若不指定该参数，则默认不设置健康检查。 
     * @return HealthCheckSettings 健康检查配置信息，若不指定该参数，则默认不设置健康检查。
     */
    public HealthCheckSettings getHealthCheckSettings() {
        return this.HealthCheckSettings;
    }

    /**
     * Set 健康检查配置信息，若不指定该参数，则默认不设置健康检查。
     * @param HealthCheckSettings 健康检查配置信息，若不指定该参数，则默认不设置健康检查。
     */
    public void setHealthCheckSettings(HealthCheckSettings HealthCheckSettings) {
        this.HealthCheckSettings = HealthCheckSettings;
    }

    /**
     * Get 部署组应用运行的环境变量。若不指定该参数，则默认不设置额外的环境变量。 
     * @return Envs 部署组应用运行的环境变量。若不指定该参数，则默认不设置额外的环境变量。
     */
    public Env [] getEnvs() {
        return this.Envs;
    }

    /**
     * Set 部署组应用运行的环境变量。若不指定该参数，则默认不设置额外的环境变量。
     * @param Envs 部署组应用运行的环境变量。若不指定该参数，则默认不设置额外的环境变量。
     */
    public void setEnvs(Env [] Envs) {
        this.Envs = Envs;
    }

    /**
     * Get 容器部署组的网络设置。 
     * @return ServiceSetting 容器部署组的网络设置。
     */
    public ServiceSetting getServiceSetting() {
        return this.ServiceSetting;
    }

    /**
     * Set 容器部署组的网络设置。
     * @param ServiceSetting 容器部署组的网络设置。
     */
    public void setServiceSetting(ServiceSetting ServiceSetting) {
        this.ServiceSetting = ServiceSetting;
    }

    /**
     * Get 是否部署 agent 容器。若不指定该参数，则默认不部署 agent 容器。 
     * @return DeployAgent 是否部署 agent 容器。若不指定该参数，则默认不部署 agent 容器。
     */
    public Boolean getDeployAgent() {
        return this.DeployAgent;
    }

    /**
     * Set 是否部署 agent 容器。若不指定该参数，则默认不部署 agent 容器。
     * @param DeployAgent 是否部署 agent 容器。若不指定该参数，则默认不部署 agent 容器。
     */
    public void setDeployAgent(Boolean DeployAgent) {
        this.DeployAgent = DeployAgent;
    }

    /**
     * Get 节点调度策略。若不指定改参数，则默认不使用节点调度策略。 
     * @return SchedulingStrategy 节点调度策略。若不指定改参数，则默认不使用节点调度策略。
     */
    public SchedulingStrategy getSchedulingStrategy() {
        return this.SchedulingStrategy;
    }

    /**
     * Set 节点调度策略。若不指定改参数，则默认不使用节点调度策略。
     * @param SchedulingStrategy 节点调度策略。若不指定改参数，则默认不使用节点调度策略。
     */
    public void setSchedulingStrategy(SchedulingStrategy SchedulingStrategy) {
        this.SchedulingStrategy = SchedulingStrategy;
    }

    /**
     * Get 是否进行增量部署，默认为false，全量更新 
     * @return IncrementalDeployment 是否进行增量部署，默认为false，全量更新
     */
    public Boolean getIncrementalDeployment() {
        return this.IncrementalDeployment;
    }

    /**
     * Set 是否进行增量部署，默认为false，全量更新
     * @param IncrementalDeployment 是否进行增量部署，默认为false，全量更新
     */
    public void setIncrementalDeployment(Boolean IncrementalDeployment) {
        this.IncrementalDeployment = IncrementalDeployment;
    }

    /**
     * Get tcr或者不填 
     * @return RepoType tcr或者不填
     */
    public String getRepoType() {
        return this.RepoType;
    }

    /**
     * Set tcr或者不填
     * @param RepoType tcr或者不填
     */
    public void setRepoType(String RepoType) {
        this.RepoType = RepoType;
    }

    /**
     * Get 数据卷信息-废弃，请用VolumeInfoList参数 
     * @return VolumeInfos 数据卷信息-废弃，请用VolumeInfoList参数
     */
    public VolumeInfo getVolumeInfos() {
        return this.VolumeInfos;
    }

    /**
     * Set 数据卷信息-废弃，请用VolumeInfoList参数
     * @param VolumeInfos 数据卷信息-废弃，请用VolumeInfoList参数
     */
    public void setVolumeInfos(VolumeInfo VolumeInfos) {
        this.VolumeInfos = VolumeInfos;
    }

    /**
     * Get 数据卷挂载点信息-废弃，请用VolumeMountInfoList参数 
     * @return VolumeMountInfos 数据卷挂载点信息-废弃，请用VolumeMountInfoList参数
     */
    public VolumeMountInfo getVolumeMountInfos() {
        return this.VolumeMountInfos;
    }

    /**
     * Set 数据卷挂载点信息-废弃，请用VolumeMountInfoList参数
     * @param VolumeMountInfos 数据卷挂载点信息-废弃，请用VolumeMountInfoList参数
     */
    public void setVolumeMountInfos(VolumeMountInfo VolumeMountInfos) {
        this.VolumeMountInfos = VolumeMountInfos;
    }

    /**
     * Get 数据卷信息，list 
     * @return VolumeInfoList 数据卷信息，list
     */
    public VolumeInfo [] getVolumeInfoList() {
        return this.VolumeInfoList;
    }

    /**
     * Set 数据卷信息，list
     * @param VolumeInfoList 数据卷信息，list
     */
    public void setVolumeInfoList(VolumeInfo [] VolumeInfoList) {
        this.VolumeInfoList = VolumeInfoList;
    }

    /**
     * Get 数据卷挂载点信息，list 
     * @return VolumeMountInfoList 数据卷挂载点信息，list
     */
    public VolumeMountInfo [] getVolumeMountInfoList() {
        return this.VolumeMountInfoList;
    }

    /**
     * Set 数据卷挂载点信息，list
     * @param VolumeMountInfoList 数据卷挂载点信息，list
     */
    public void setVolumeMountInfoList(VolumeMountInfo [] VolumeMountInfoList) {
        this.VolumeMountInfoList = VolumeMountInfoList;
    }

    /**
     * Get 是否清除数据卷信息，默认false 
     * @return VolumeClean 是否清除数据卷信息，默认false
     */
    public Boolean getVolumeClean() {
        return this.VolumeClean;
    }

    /**
     * Set 是否清除数据卷信息，默认false
     * @param VolumeClean 是否清除数据卷信息，默认false
     */
    public void setVolumeClean(Boolean VolumeClean) {
        this.VolumeClean = VolumeClean;
    }

    public DeployContainerGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployContainerGroupRequest(DeployContainerGroupRequest source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.TagName != null) {
            this.TagName = new String(source.TagName);
        }
        if (source.InstanceNum != null) {
            this.InstanceNum = new Long(source.InstanceNum);
        }
        if (source.Server != null) {
            this.Server = new String(source.Server);
        }
        if (source.Reponame != null) {
            this.Reponame = new String(source.Reponame);
        }
        if (source.CpuLimit != null) {
            this.CpuLimit = new String(source.CpuLimit);
        }
        if (source.MemLimit != null) {
            this.MemLimit = new String(source.MemLimit);
        }
        if (source.JvmOpts != null) {
            this.JvmOpts = new String(source.JvmOpts);
        }
        if (source.CpuRequest != null) {
            this.CpuRequest = new String(source.CpuRequest);
        }
        if (source.MemRequest != null) {
            this.MemRequest = new String(source.MemRequest);
        }
        if (source.DoNotStart != null) {
            this.DoNotStart = new Boolean(source.DoNotStart);
        }
        if (source.RepoName != null) {
            this.RepoName = new String(source.RepoName);
        }
        if (source.UpdateType != null) {
            this.UpdateType = new Long(source.UpdateType);
        }
        if (source.UpdateIvl != null) {
            this.UpdateIvl = new Long(source.UpdateIvl);
        }
        if (source.AgentCpuRequest != null) {
            this.AgentCpuRequest = new String(source.AgentCpuRequest);
        }
        if (source.AgentCpuLimit != null) {
            this.AgentCpuLimit = new String(source.AgentCpuLimit);
        }
        if (source.AgentMemRequest != null) {
            this.AgentMemRequest = new String(source.AgentMemRequest);
        }
        if (source.AgentMemLimit != null) {
            this.AgentMemLimit = new String(source.AgentMemLimit);
        }
        if (source.IstioCpuRequest != null) {
            this.IstioCpuRequest = new String(source.IstioCpuRequest);
        }
        if (source.IstioCpuLimit != null) {
            this.IstioCpuLimit = new String(source.IstioCpuLimit);
        }
        if (source.IstioMemRequest != null) {
            this.IstioMemRequest = new String(source.IstioMemRequest);
        }
        if (source.IstioMemLimit != null) {
            this.IstioMemLimit = new String(source.IstioMemLimit);
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
        if (source.Envs != null) {
            this.Envs = new Env[source.Envs.length];
            for (int i = 0; i < source.Envs.length; i++) {
                this.Envs[i] = new Env(source.Envs[i]);
            }
        }
        if (source.ServiceSetting != null) {
            this.ServiceSetting = new ServiceSetting(source.ServiceSetting);
        }
        if (source.DeployAgent != null) {
            this.DeployAgent = new Boolean(source.DeployAgent);
        }
        if (source.SchedulingStrategy != null) {
            this.SchedulingStrategy = new SchedulingStrategy(source.SchedulingStrategy);
        }
        if (source.IncrementalDeployment != null) {
            this.IncrementalDeployment = new Boolean(source.IncrementalDeployment);
        }
        if (source.RepoType != null) {
            this.RepoType = new String(source.RepoType);
        }
        if (source.VolumeInfos != null) {
            this.VolumeInfos = new VolumeInfo(source.VolumeInfos);
        }
        if (source.VolumeMountInfos != null) {
            this.VolumeMountInfos = new VolumeMountInfo(source.VolumeMountInfos);
        }
        if (source.VolumeInfoList != null) {
            this.VolumeInfoList = new VolumeInfo[source.VolumeInfoList.length];
            for (int i = 0; i < source.VolumeInfoList.length; i++) {
                this.VolumeInfoList[i] = new VolumeInfo(source.VolumeInfoList[i]);
            }
        }
        if (source.VolumeMountInfoList != null) {
            this.VolumeMountInfoList = new VolumeMountInfo[source.VolumeMountInfoList.length];
            for (int i = 0; i < source.VolumeMountInfoList.length; i++) {
                this.VolumeMountInfoList[i] = new VolumeMountInfo(source.VolumeMountInfoList[i]);
            }
        }
        if (source.VolumeClean != null) {
            this.VolumeClean = new Boolean(source.VolumeClean);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "TagName", this.TagName);
        this.setParamSimple(map, prefix + "InstanceNum", this.InstanceNum);
        this.setParamSimple(map, prefix + "Server", this.Server);
        this.setParamSimple(map, prefix + "Reponame", this.Reponame);
        this.setParamSimple(map, prefix + "CpuLimit", this.CpuLimit);
        this.setParamSimple(map, prefix + "MemLimit", this.MemLimit);
        this.setParamSimple(map, prefix + "JvmOpts", this.JvmOpts);
        this.setParamSimple(map, prefix + "CpuRequest", this.CpuRequest);
        this.setParamSimple(map, prefix + "MemRequest", this.MemRequest);
        this.setParamSimple(map, prefix + "DoNotStart", this.DoNotStart);
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "UpdateType", this.UpdateType);
        this.setParamSimple(map, prefix + "UpdateIvl", this.UpdateIvl);
        this.setParamSimple(map, prefix + "AgentCpuRequest", this.AgentCpuRequest);
        this.setParamSimple(map, prefix + "AgentCpuLimit", this.AgentCpuLimit);
        this.setParamSimple(map, prefix + "AgentMemRequest", this.AgentMemRequest);
        this.setParamSimple(map, prefix + "AgentMemLimit", this.AgentMemLimit);
        this.setParamSimple(map, prefix + "IstioCpuRequest", this.IstioCpuRequest);
        this.setParamSimple(map, prefix + "IstioCpuLimit", this.IstioCpuLimit);
        this.setParamSimple(map, prefix + "IstioMemRequest", this.IstioMemRequest);
        this.setParamSimple(map, prefix + "IstioMemLimit", this.IstioMemLimit);
        this.setParamSimple(map, prefix + "MaxSurge", this.MaxSurge);
        this.setParamSimple(map, prefix + "MaxUnavailable", this.MaxUnavailable);
        this.setParamObj(map, prefix + "HealthCheckSettings.", this.HealthCheckSettings);
        this.setParamArrayObj(map, prefix + "Envs.", this.Envs);
        this.setParamObj(map, prefix + "ServiceSetting.", this.ServiceSetting);
        this.setParamSimple(map, prefix + "DeployAgent", this.DeployAgent);
        this.setParamObj(map, prefix + "SchedulingStrategy.", this.SchedulingStrategy);
        this.setParamSimple(map, prefix + "IncrementalDeployment", this.IncrementalDeployment);
        this.setParamSimple(map, prefix + "RepoType", this.RepoType);
        this.setParamObj(map, prefix + "VolumeInfos.", this.VolumeInfos);
        this.setParamObj(map, prefix + "VolumeMountInfos.", this.VolumeMountInfos);
        this.setParamArrayObj(map, prefix + "VolumeInfoList.", this.VolumeInfoList);
        this.setParamArrayObj(map, prefix + "VolumeMountInfoList.", this.VolumeMountInfoList);
        this.setParamSimple(map, prefix + "VolumeClean", this.VolumeClean);

    }
}

