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

public class ContainerGroupDeploy extends AbstractModel{

    /**
    * 部署组id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 分组名称
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentNum")
    @Expose
    private Long CurrentNum;

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
    * 业务容器初始分配的 CPU 核数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuRequest")
    @Expose
    private String CpuRequest;

    /**
    * 业务容器最大分配的 CPU 核数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuLimit")
    @Expose
    private String CpuLimit;

    /**
    * 业务容器初始分配的内存 MiB 数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemRequest")
    @Expose
    private String MemRequest;

    /**
    * 业务容器最大分配的内存 MiB 数，对应 K8S limit
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
    * 端口映射
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProtocolPorts")
    @Expose
    private ProtocolPort [] ProtocolPorts;

    /**
    * 更新方式：0:快速更新 1:滚动更新
注意：此字段可能返回 null，表示取不到有效值。
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
    * jvm参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JvmOpts")
    @Expose
    private String JvmOpts;

    /**
    * 子网id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * agent容器初始分配的 CPU 核数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentCpuRequest")
    @Expose
    private String AgentCpuRequest;

    /**
    * agent容器最大分配的 CPU 核数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentCpuLimit")
    @Expose
    private String AgentCpuLimit;

    /**
    * agent容器初始分配的内存 MiB 数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentMemRequest")
    @Expose
    private String AgentMemRequest;

    /**
    * agent容器最大分配的内存 MiB 数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AgentMemLimit")
    @Expose
    private String AgentMemLimit;

    /**
    * istioproxy容器初始分配的 CPU 核数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IstioCpuRequest")
    @Expose
    private String IstioCpuRequest;

    /**
    * istioproxy容器最大分配的 CPU 核数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IstioCpuLimit")
    @Expose
    private String IstioCpuLimit;

    /**
    * istioproxy容器初始分配的内存 MiB 数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IstioMemRequest")
    @Expose
    private String IstioMemRequest;

    /**
    * istioproxy容器最大分配的内存 MiB 数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IstioMemLimit")
    @Expose
    private String IstioMemLimit;

    /**
    * 部署组的环境变量数组，这里没有展示 tsf 使用的环境变量，只展示了用户设置的环境变量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Envs")
    @Expose
    private Env [] Envs;

    /**
    * 健康检查配置信息，若不指定该参数，则默认不设置健康检查。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthCheckSettings")
    @Expose
    private HealthCheckSettings HealthCheckSettings;

    /**
    * 是否部署Agent容器
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeployAgent")
    @Expose
    private Boolean DeployAgent;

    /**
    * 部署组备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 是否创建 k8s service
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DisableService")
    @Expose
    private Boolean DisableService;

    /**
    * service 是否为 headless 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeadlessService")
    @Expose
    private Boolean HeadlessService;

    /**
    * TcrRepoInfo值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TcrRepoInfo")
    @Expose
    private TcrRepoInfo TcrRepoInfo;

    /**
    * 数据卷信息，list
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeInfos")
    @Expose
    private VolumeInfo [] VolumeInfos;

    /**
    * 数据卷挂载信息，list
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeMountInfos")
    @Expose
    private VolumeMountInfo [] VolumeMountInfos;

    /**
    * KubeInjectEnable值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KubeInjectEnable")
    @Expose
    private Boolean KubeInjectEnable;

    /**
    * 仓库类型 (person, tcr)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepoType")
    @Expose
    private String RepoType;

    /**
     * Get 部署组id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId 部署组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 部署组id
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 部署组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 分组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupName 分组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 分组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName 分组名称
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentNum 已启动实例总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCurrentNum() {
        return this.CurrentNum;
    }

    /**
     * Set 已启动实例总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentNum 已启动实例总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentNum(Long CurrentNum) {
        this.CurrentNum = CurrentNum;
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
     * Get 业务容器初始分配的 CPU 核数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuRequest 业务容器初始分配的 CPU 核数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCpuRequest() {
        return this.CpuRequest;
    }

    /**
     * Set 业务容器初始分配的 CPU 核数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuRequest 业务容器初始分配的 CPU 核数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuRequest(String CpuRequest) {
        this.CpuRequest = CpuRequest;
    }

    /**
     * Get 业务容器最大分配的 CPU 核数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuLimit 业务容器最大分配的 CPU 核数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCpuLimit() {
        return this.CpuLimit;
    }

    /**
     * Set 业务容器最大分配的 CPU 核数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuLimit 业务容器最大分配的 CPU 核数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuLimit(String CpuLimit) {
        this.CpuLimit = CpuLimit;
    }

    /**
     * Get 业务容器初始分配的内存 MiB 数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemRequest 业务容器初始分配的内存 MiB 数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemRequest() {
        return this.MemRequest;
    }

    /**
     * Set 业务容器初始分配的内存 MiB 数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemRequest 业务容器初始分配的内存 MiB 数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemRequest(String MemRequest) {
        this.MemRequest = MemRequest;
    }

    /**
     * Get 业务容器最大分配的内存 MiB 数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemLimit 业务容器最大分配的内存 MiB 数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemLimit() {
        return this.MemLimit;
    }

    /**
     * Set 业务容器最大分配的内存 MiB 数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemLimit 业务容器最大分配的内存 MiB 数，对应 K8S limit
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
     * Get 端口映射
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProtocolPorts 端口映射
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProtocolPort [] getProtocolPorts() {
        return this.ProtocolPorts;
    }

    /**
     * Set 端口映射
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProtocolPorts 端口映射
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocolPorts(ProtocolPort [] ProtocolPorts) {
        this.ProtocolPorts = ProtocolPorts;
    }

    /**
     * Get 更新方式：0:快速更新 1:滚动更新
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateType 更新方式：0:快速更新 1:滚动更新
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateType() {
        return this.UpdateType;
    }

    /**
     * Set 更新方式：0:快速更新 1:滚动更新
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateType 更新方式：0:快速更新 1:滚动更新
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get jvm参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JvmOpts jvm参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJvmOpts() {
        return this.JvmOpts;
    }

    /**
     * Set jvm参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param JvmOpts jvm参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJvmOpts(String JvmOpts) {
        this.JvmOpts = JvmOpts;
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
     * Get agent容器初始分配的 CPU 核数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentCpuRequest agent容器初始分配的 CPU 核数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentCpuRequest() {
        return this.AgentCpuRequest;
    }

    /**
     * Set agent容器初始分配的 CPU 核数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentCpuRequest agent容器初始分配的 CPU 核数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentCpuRequest(String AgentCpuRequest) {
        this.AgentCpuRequest = AgentCpuRequest;
    }

    /**
     * Get agent容器最大分配的 CPU 核数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentCpuLimit agent容器最大分配的 CPU 核数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentCpuLimit() {
        return this.AgentCpuLimit;
    }

    /**
     * Set agent容器最大分配的 CPU 核数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentCpuLimit agent容器最大分配的 CPU 核数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentCpuLimit(String AgentCpuLimit) {
        this.AgentCpuLimit = AgentCpuLimit;
    }

    /**
     * Get agent容器初始分配的内存 MiB 数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentMemRequest agent容器初始分配的内存 MiB 数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentMemRequest() {
        return this.AgentMemRequest;
    }

    /**
     * Set agent容器初始分配的内存 MiB 数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentMemRequest agent容器初始分配的内存 MiB 数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentMemRequest(String AgentMemRequest) {
        this.AgentMemRequest = AgentMemRequest;
    }

    /**
     * Get agent容器最大分配的内存 MiB 数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AgentMemLimit agent容器最大分配的内存 MiB 数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAgentMemLimit() {
        return this.AgentMemLimit;
    }

    /**
     * Set agent容器最大分配的内存 MiB 数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
     * @param AgentMemLimit agent容器最大分配的内存 MiB 数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAgentMemLimit(String AgentMemLimit) {
        this.AgentMemLimit = AgentMemLimit;
    }

    /**
     * Get istioproxy容器初始分配的 CPU 核数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IstioCpuRequest istioproxy容器初始分配的 CPU 核数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIstioCpuRequest() {
        return this.IstioCpuRequest;
    }

    /**
     * Set istioproxy容器初始分配的 CPU 核数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
     * @param IstioCpuRequest istioproxy容器初始分配的 CPU 核数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIstioCpuRequest(String IstioCpuRequest) {
        this.IstioCpuRequest = IstioCpuRequest;
    }

    /**
     * Get istioproxy容器最大分配的 CPU 核数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IstioCpuLimit istioproxy容器最大分配的 CPU 核数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIstioCpuLimit() {
        return this.IstioCpuLimit;
    }

    /**
     * Set istioproxy容器最大分配的 CPU 核数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
     * @param IstioCpuLimit istioproxy容器最大分配的 CPU 核数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIstioCpuLimit(String IstioCpuLimit) {
        this.IstioCpuLimit = IstioCpuLimit;
    }

    /**
     * Get istioproxy容器初始分配的内存 MiB 数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IstioMemRequest istioproxy容器初始分配的内存 MiB 数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIstioMemRequest() {
        return this.IstioMemRequest;
    }

    /**
     * Set istioproxy容器初始分配的内存 MiB 数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
     * @param IstioMemRequest istioproxy容器初始分配的内存 MiB 数，对应 K8S request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIstioMemRequest(String IstioMemRequest) {
        this.IstioMemRequest = IstioMemRequest;
    }

    /**
     * Get istioproxy容器最大分配的内存 MiB 数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IstioMemLimit istioproxy容器最大分配的内存 MiB 数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIstioMemLimit() {
        return this.IstioMemLimit;
    }

    /**
     * Set istioproxy容器最大分配的内存 MiB 数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
     * @param IstioMemLimit istioproxy容器最大分配的内存 MiB 数，对应 K8S limit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIstioMemLimit(String IstioMemLimit) {
        this.IstioMemLimit = IstioMemLimit;
    }

    /**
     * Get 部署组的环境变量数组，这里没有展示 tsf 使用的环境变量，只展示了用户设置的环境变量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Envs 部署组的环境变量数组，这里没有展示 tsf 使用的环境变量，只展示了用户设置的环境变量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Env [] getEnvs() {
        return this.Envs;
    }

    /**
     * Set 部署组的环境变量数组，这里没有展示 tsf 使用的环境变量，只展示了用户设置的环境变量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Envs 部署组的环境变量数组，这里没有展示 tsf 使用的环境变量，只展示了用户设置的环境变量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvs(Env [] Envs) {
        this.Envs = Envs;
    }

    /**
     * Get 健康检查配置信息，若不指定该参数，则默认不设置健康检查。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthCheckSettings 健康检查配置信息，若不指定该参数，则默认不设置健康检查。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HealthCheckSettings getHealthCheckSettings() {
        return this.HealthCheckSettings;
    }

    /**
     * Set 健康检查配置信息，若不指定该参数，则默认不设置健康检查。
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthCheckSettings 健康检查配置信息，若不指定该参数，则默认不设置健康检查。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthCheckSettings(HealthCheckSettings HealthCheckSettings) {
        this.HealthCheckSettings = HealthCheckSettings;
    }

    /**
     * Get 是否部署Agent容器
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeployAgent 是否部署Agent容器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDeployAgent() {
        return this.DeployAgent;
    }

    /**
     * Set 是否部署Agent容器
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeployAgent 是否部署Agent容器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeployAgent(Boolean DeployAgent) {
        this.DeployAgent = DeployAgent;
    }

    /**
     * Get 部署组备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Alias 部署组备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 部署组备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Alias 部署组备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 是否创建 k8s service
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DisableService 是否创建 k8s service
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDisableService() {
        return this.DisableService;
    }

    /**
     * Set 是否创建 k8s service
注意：此字段可能返回 null，表示取不到有效值。
     * @param DisableService 是否创建 k8s service
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDisableService(Boolean DisableService) {
        this.DisableService = DisableService;
    }

    /**
     * Get service 是否为 headless 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeadlessService service 是否为 headless 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHeadlessService() {
        return this.HeadlessService;
    }

    /**
     * Set service 是否为 headless 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeadlessService service 是否为 headless 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeadlessService(Boolean HeadlessService) {
        this.HeadlessService = HeadlessService;
    }

    /**
     * Get TcrRepoInfo值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TcrRepoInfo TcrRepoInfo值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TcrRepoInfo getTcrRepoInfo() {
        return this.TcrRepoInfo;
    }

    /**
     * Set TcrRepoInfo值
注意：此字段可能返回 null，表示取不到有效值。
     * @param TcrRepoInfo TcrRepoInfo值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTcrRepoInfo(TcrRepoInfo TcrRepoInfo) {
        this.TcrRepoInfo = TcrRepoInfo;
    }

    /**
     * Get 数据卷信息，list
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeInfos 数据卷信息，list
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VolumeInfo [] getVolumeInfos() {
        return this.VolumeInfos;
    }

    /**
     * Set 数据卷信息，list
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeInfos 数据卷信息，list
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeInfos(VolumeInfo [] VolumeInfos) {
        this.VolumeInfos = VolumeInfos;
    }

    /**
     * Get 数据卷挂载信息，list
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeMountInfos 数据卷挂载信息，list
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VolumeMountInfo [] getVolumeMountInfos() {
        return this.VolumeMountInfos;
    }

    /**
     * Set 数据卷挂载信息，list
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeMountInfos 数据卷挂载信息，list
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeMountInfos(VolumeMountInfo [] VolumeMountInfos) {
        this.VolumeMountInfos = VolumeMountInfos;
    }

    /**
     * Get KubeInjectEnable值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KubeInjectEnable KubeInjectEnable值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getKubeInjectEnable() {
        return this.KubeInjectEnable;
    }

    /**
     * Set KubeInjectEnable值
注意：此字段可能返回 null，表示取不到有效值。
     * @param KubeInjectEnable KubeInjectEnable值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKubeInjectEnable(Boolean KubeInjectEnable) {
        this.KubeInjectEnable = KubeInjectEnable;
    }

    /**
     * Get 仓库类型 (person, tcr)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepoType 仓库类型 (person, tcr)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepoType() {
        return this.RepoType;
    }

    /**
     * Set 仓库类型 (person, tcr)
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepoType 仓库类型 (person, tcr)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepoType(String RepoType) {
        this.RepoType = RepoType;
    }

    public ContainerGroupDeploy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerGroupDeploy(ContainerGroupDeploy source) {
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
        if (source.Server != null) {
            this.Server = new String(source.Server);
        }
        if (source.Reponame != null) {
            this.Reponame = new String(source.Reponame);
        }
        if (source.TagName != null) {
            this.TagName = new String(source.TagName);
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
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
        }
        if (source.ProtocolPorts != null) {
            this.ProtocolPorts = new ProtocolPort[source.ProtocolPorts.length];
            for (int i = 0; i < source.ProtocolPorts.length; i++) {
                this.ProtocolPorts[i] = new ProtocolPort(source.ProtocolPorts[i]);
            }
        }
        if (source.UpdateType != null) {
            this.UpdateType = new Long(source.UpdateType);
        }
        if (source.UpdateIvl != null) {
            this.UpdateIvl = new Long(source.UpdateIvl);
        }
        if (source.JvmOpts != null) {
            this.JvmOpts = new String(source.JvmOpts);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
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
        if (source.Envs != null) {
            this.Envs = new Env[source.Envs.length];
            for (int i = 0; i < source.Envs.length; i++) {
                this.Envs[i] = new Env(source.Envs[i]);
            }
        }
        if (source.HealthCheckSettings != null) {
            this.HealthCheckSettings = new HealthCheckSettings(source.HealthCheckSettings);
        }
        if (source.DeployAgent != null) {
            this.DeployAgent = new Boolean(source.DeployAgent);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.DisableService != null) {
            this.DisableService = new Boolean(source.DisableService);
        }
        if (source.HeadlessService != null) {
            this.HeadlessService = new Boolean(source.HeadlessService);
        }
        if (source.TcrRepoInfo != null) {
            this.TcrRepoInfo = new TcrRepoInfo(source.TcrRepoInfo);
        }
        if (source.VolumeInfos != null) {
            this.VolumeInfos = new VolumeInfo[source.VolumeInfos.length];
            for (int i = 0; i < source.VolumeInfos.length; i++) {
                this.VolumeInfos[i] = new VolumeInfo(source.VolumeInfos[i]);
            }
        }
        if (source.VolumeMountInfos != null) {
            this.VolumeMountInfos = new VolumeMountInfo[source.VolumeMountInfos.length];
            for (int i = 0; i < source.VolumeMountInfos.length; i++) {
                this.VolumeMountInfos[i] = new VolumeMountInfo(source.VolumeMountInfos[i]);
            }
        }
        if (source.KubeInjectEnable != null) {
            this.KubeInjectEnable = new Boolean(source.KubeInjectEnable);
        }
        if (source.RepoType != null) {
            this.RepoType = new String(source.RepoType);
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
        this.setParamSimple(map, prefix + "Server", this.Server);
        this.setParamSimple(map, prefix + "Reponame", this.Reponame);
        this.setParamSimple(map, prefix + "TagName", this.TagName);
        this.setParamSimple(map, prefix + "CpuRequest", this.CpuRequest);
        this.setParamSimple(map, prefix + "CpuLimit", this.CpuLimit);
        this.setParamSimple(map, prefix + "MemRequest", this.MemRequest);
        this.setParamSimple(map, prefix + "MemLimit", this.MemLimit);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamArrayObj(map, prefix + "ProtocolPorts.", this.ProtocolPorts);
        this.setParamSimple(map, prefix + "UpdateType", this.UpdateType);
        this.setParamSimple(map, prefix + "UpdateIvl", this.UpdateIvl);
        this.setParamSimple(map, prefix + "JvmOpts", this.JvmOpts);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "AgentCpuRequest", this.AgentCpuRequest);
        this.setParamSimple(map, prefix + "AgentCpuLimit", this.AgentCpuLimit);
        this.setParamSimple(map, prefix + "AgentMemRequest", this.AgentMemRequest);
        this.setParamSimple(map, prefix + "AgentMemLimit", this.AgentMemLimit);
        this.setParamSimple(map, prefix + "IstioCpuRequest", this.IstioCpuRequest);
        this.setParamSimple(map, prefix + "IstioCpuLimit", this.IstioCpuLimit);
        this.setParamSimple(map, prefix + "IstioMemRequest", this.IstioMemRequest);
        this.setParamSimple(map, prefix + "IstioMemLimit", this.IstioMemLimit);
        this.setParamArrayObj(map, prefix + "Envs.", this.Envs);
        this.setParamObj(map, prefix + "HealthCheckSettings.", this.HealthCheckSettings);
        this.setParamSimple(map, prefix + "DeployAgent", this.DeployAgent);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "DisableService", this.DisableService);
        this.setParamSimple(map, prefix + "HeadlessService", this.HeadlessService);
        this.setParamObj(map, prefix + "TcrRepoInfo.", this.TcrRepoInfo);
        this.setParamArrayObj(map, prefix + "VolumeInfos.", this.VolumeInfos);
        this.setParamArrayObj(map, prefix + "VolumeMountInfos.", this.VolumeMountInfos);
        this.setParamSimple(map, prefix + "KubeInjectEnable", this.KubeInjectEnable);
        this.setParamSimple(map, prefix + "RepoType", this.RepoType);

    }
}

