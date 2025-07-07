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

public class ContainerInfo extends AbstractModel {

    /**
    * 容器名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 容器ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerId")
    @Expose
    private String ContainerId;

    /**
    * 容器状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 容器的Reason
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 镜像地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * 是否为业务主容器
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsBusinessMainContainer")
    @Expose
    private Boolean IsBusinessMainContainer;

    /**
    * 镜像Server
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Server")
    @Expose
    private String Server;

    /**
    * 镜像名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * 仓库类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepoType")
    @Expose
    private String RepoType;

    /**
    * TCR 仓库信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TcrRepoInfo")
    @Expose
    private TcrRepoInfo TcrRepoInfo;

    /**
    * 容器访问凭证名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * 镜像版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
    * 健康检查
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthCheckSettings")
    @Expose
    private HealthCheckSettings HealthCheckSettings;

    /**
    * 容器Cpu request
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuRequest")
    @Expose
    private String CpuRequest;

    /**
    * 容器Cpu limit
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CpuLimit")
    @Expose
    private String CpuLimit;

    /**
    * 容器Mem request
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemRequest")
    @Expose
    private String MemRequest;

    /**
    * 容器Mem Limit
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemLimit")
    @Expose
    private String MemLimit;

    /**
    * 环境变量参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Envs")
    @Expose
    private Env [] Envs;

    /**
    * 环境变量参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserEnvs")
    @Expose
    private Env [] UserEnvs;

    /**
    * JVM参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JvmOpts")
    @Expose
    private String JvmOpts;

    /**
    * 挂载信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeMountInfoList")
    @Expose
    private VolumeMountInfo [] VolumeMountInfoList;

    /**
    * 是否为初始化容器
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InitContainerEnable")
    @Expose
    private Boolean InitContainerEnable;

    /**
    * 生命周期钩子
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LifeCycleHookList")
    @Expose
    private LifeCycleHook [] LifeCycleHookList;

    /**
    * 是否为特权容器
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivilegeContainerEnable")
    @Expose
    private Boolean PrivilegeContainerEnable;

    /**
    * 运行命令
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunCommand")
    @Expose
    private String RunCommand;

    /**
    * 运行参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunArg")
    @Expose
    private String RunArg;

    /**
    * 容器名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
     * Get 容器名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 容器名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 容器名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 容器名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 容器ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerId 容器ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContainerId() {
        return this.ContainerId;
    }

    /**
     * Set 容器ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerId 容器ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerId(String ContainerId) {
        this.ContainerId = ContainerId;
    }

    /**
     * Get 容器状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 容器状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 容器状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 容器状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 容器的Reason
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reason 容器的Reason
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 容器的Reason
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reason 容器的Reason
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 镜像地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Image 镜像地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set 镜像地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Image 镜像地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get 是否为业务主容器
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsBusinessMainContainer 是否为业务主容器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsBusinessMainContainer() {
        return this.IsBusinessMainContainer;
    }

    /**
     * Set 是否为业务主容器
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsBusinessMainContainer 是否为业务主容器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsBusinessMainContainer(Boolean IsBusinessMainContainer) {
        this.IsBusinessMainContainer = IsBusinessMainContainer;
    }

    /**
     * Get 镜像Server
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Server 镜像Server
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServer() {
        return this.Server;
    }

    /**
     * Set 镜像Server
注意：此字段可能返回 null，表示取不到有效值。
     * @param Server 镜像Server
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServer(String Server) {
        this.Server = Server;
    }

    /**
     * Get 镜像名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepoName 镜像名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * Set 镜像名
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepoName 镜像名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    /**
     * Get 仓库类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepoType 仓库类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepoType() {
        return this.RepoType;
    }

    /**
     * Set 仓库类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepoType 仓库类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepoType(String RepoType) {
        this.RepoType = RepoType;
    }

    /**
     * Get TCR 仓库信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TcrRepoInfo TCR 仓库信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TcrRepoInfo getTcrRepoInfo() {
        return this.TcrRepoInfo;
    }

    /**
     * Set TCR 仓库信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TcrRepoInfo TCR 仓库信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTcrRepoInfo(TcrRepoInfo TcrRepoInfo) {
        this.TcrRepoInfo = TcrRepoInfo;
    }

    /**
     * Get 容器访问凭证名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretName 容器访问凭证名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set 容器访问凭证名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretName 容器访问凭证名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get 镜像版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagName 镜像版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * Set 镜像版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagName 镜像版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
    }

    /**
     * Get 健康检查
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthCheckSettings 健康检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HealthCheckSettings getHealthCheckSettings() {
        return this.HealthCheckSettings;
    }

    /**
     * Set 健康检查
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthCheckSettings 健康检查
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthCheckSettings(HealthCheckSettings HealthCheckSettings) {
        this.HealthCheckSettings = HealthCheckSettings;
    }

    /**
     * Get 容器Cpu request
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuRequest 容器Cpu request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCpuRequest() {
        return this.CpuRequest;
    }

    /**
     * Set 容器Cpu request
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuRequest 容器Cpu request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuRequest(String CpuRequest) {
        this.CpuRequest = CpuRequest;
    }

    /**
     * Get 容器Cpu limit
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CpuLimit 容器Cpu limit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCpuLimit() {
        return this.CpuLimit;
    }

    /**
     * Set 容器Cpu limit
注意：此字段可能返回 null，表示取不到有效值。
     * @param CpuLimit 容器Cpu limit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpuLimit(String CpuLimit) {
        this.CpuLimit = CpuLimit;
    }

    /**
     * Get 容器Mem request
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemRequest 容器Mem request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemRequest() {
        return this.MemRequest;
    }

    /**
     * Set 容器Mem request
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemRequest 容器Mem request
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemRequest(String MemRequest) {
        this.MemRequest = MemRequest;
    }

    /**
     * Get 容器Mem Limit
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemLimit 容器Mem Limit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMemLimit() {
        return this.MemLimit;
    }

    /**
     * Set 容器Mem Limit
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemLimit 容器Mem Limit
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemLimit(String MemLimit) {
        this.MemLimit = MemLimit;
    }

    /**
     * Get 环境变量参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Envs 环境变量参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Env [] getEnvs() {
        return this.Envs;
    }

    /**
     * Set 环境变量参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Envs 环境变量参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvs(Env [] Envs) {
        this.Envs = Envs;
    }

    /**
     * Get 环境变量参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserEnvs 环境变量参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Env [] getUserEnvs() {
        return this.UserEnvs;
    }

    /**
     * Set 环境变量参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserEnvs 环境变量参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserEnvs(Env [] UserEnvs) {
        this.UserEnvs = UserEnvs;
    }

    /**
     * Get JVM参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JvmOpts JVM参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJvmOpts() {
        return this.JvmOpts;
    }

    /**
     * Set JVM参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param JvmOpts JVM参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJvmOpts(String JvmOpts) {
        this.JvmOpts = JvmOpts;
    }

    /**
     * Get 挂载信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeMountInfoList 挂载信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VolumeMountInfo [] getVolumeMountInfoList() {
        return this.VolumeMountInfoList;
    }

    /**
     * Set 挂载信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeMountInfoList 挂载信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeMountInfoList(VolumeMountInfo [] VolumeMountInfoList) {
        this.VolumeMountInfoList = VolumeMountInfoList;
    }

    /**
     * Get 是否为初始化容器
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InitContainerEnable 是否为初始化容器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getInitContainerEnable() {
        return this.InitContainerEnable;
    }

    /**
     * Set 是否为初始化容器
注意：此字段可能返回 null，表示取不到有效值。
     * @param InitContainerEnable 是否为初始化容器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInitContainerEnable(Boolean InitContainerEnable) {
        this.InitContainerEnable = InitContainerEnable;
    }

    /**
     * Get 生命周期钩子
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LifeCycleHookList 生命周期钩子
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LifeCycleHook [] getLifeCycleHookList() {
        return this.LifeCycleHookList;
    }

    /**
     * Set 生命周期钩子
注意：此字段可能返回 null，表示取不到有效值。
     * @param LifeCycleHookList 生命周期钩子
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLifeCycleHookList(LifeCycleHook [] LifeCycleHookList) {
        this.LifeCycleHookList = LifeCycleHookList;
    }

    /**
     * Get 是否为特权容器
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivilegeContainerEnable 是否为特权容器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getPrivilegeContainerEnable() {
        return this.PrivilegeContainerEnable;
    }

    /**
     * Set 是否为特权容器
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivilegeContainerEnable 是否为特权容器
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivilegeContainerEnable(Boolean PrivilegeContainerEnable) {
        this.PrivilegeContainerEnable = PrivilegeContainerEnable;
    }

    /**
     * Get 运行命令
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunCommand 运行命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunCommand() {
        return this.RunCommand;
    }

    /**
     * Set 运行命令
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunCommand 运行命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunCommand(String RunCommand) {
        this.RunCommand = RunCommand;
    }

    /**
     * Get 运行参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RunArg 运行参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunArg() {
        return this.RunArg;
    }

    /**
     * Set 运行参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunArg 运行参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunArg(String RunArg) {
        this.RunArg = RunArg;
    }

    /**
     * Get 容器名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerName 容器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set 容器名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerName 容器名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    public ContainerInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ContainerInfo(ContainerInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ContainerId != null) {
            this.ContainerId = new String(source.ContainerId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.IsBusinessMainContainer != null) {
            this.IsBusinessMainContainer = new Boolean(source.IsBusinessMainContainer);
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
        if (source.Envs != null) {
            this.Envs = new Env[source.Envs.length];
            for (int i = 0; i < source.Envs.length; i++) {
                this.Envs[i] = new Env(source.Envs[i]);
            }
        }
        if (source.UserEnvs != null) {
            this.UserEnvs = new Env[source.UserEnvs.length];
            for (int i = 0; i < source.UserEnvs.length; i++) {
                this.UserEnvs[i] = new Env(source.UserEnvs[i]);
            }
        }
        if (source.JvmOpts != null) {
            this.JvmOpts = new String(source.JvmOpts);
        }
        if (source.VolumeMountInfoList != null) {
            this.VolumeMountInfoList = new VolumeMountInfo[source.VolumeMountInfoList.length];
            for (int i = 0; i < source.VolumeMountInfoList.length; i++) {
                this.VolumeMountInfoList[i] = new VolumeMountInfo(source.VolumeMountInfoList[i]);
            }
        }
        if (source.InitContainerEnable != null) {
            this.InitContainerEnable = new Boolean(source.InitContainerEnable);
        }
        if (source.LifeCycleHookList != null) {
            this.LifeCycleHookList = new LifeCycleHook[source.LifeCycleHookList.length];
            for (int i = 0; i < source.LifeCycleHookList.length; i++) {
                this.LifeCycleHookList[i] = new LifeCycleHook(source.LifeCycleHookList[i]);
            }
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
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ContainerId", this.ContainerId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "IsBusinessMainContainer", this.IsBusinessMainContainer);
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
        this.setParamArrayObj(map, prefix + "Envs.", this.Envs);
        this.setParamArrayObj(map, prefix + "UserEnvs.", this.UserEnvs);
        this.setParamSimple(map, prefix + "JvmOpts", this.JvmOpts);
        this.setParamArrayObj(map, prefix + "VolumeMountInfoList.", this.VolumeMountInfoList);
        this.setParamSimple(map, prefix + "InitContainerEnable", this.InitContainerEnable);
        this.setParamArrayObj(map, prefix + "LifeCycleHookList.", this.LifeCycleHookList);
        this.setParamSimple(map, prefix + "PrivilegeContainerEnable", this.PrivilegeContainerEnable);
        this.setParamSimple(map, prefix + "RunCommand", this.RunCommand);
        this.setParamSimple(map, prefix + "RunArg", this.RunArg);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);

    }
}

