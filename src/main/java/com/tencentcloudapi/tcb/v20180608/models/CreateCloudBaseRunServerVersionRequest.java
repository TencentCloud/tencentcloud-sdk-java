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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCloudBaseRunServerVersionRequest extends AbstractModel{

    /**
    * 环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 枚举（package/repository/image/jar/war)
    */
    @SerializedName("UploadType")
    @Expose
    private String UploadType;

    /**
    * 流量占比
    */
    @SerializedName("FlowRatio")
    @Expose
    private Long FlowRatio;

    /**
    * Cpu的大小，单位：核
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * Mem的大小，单位：G
    */
    @SerializedName("Mem")
    @Expose
    private Float Mem;

    /**
    * 最小副本数，最小值：0
    */
    @SerializedName("MinNum")
    @Expose
    private Long MinNum;

    /**
    * 副本最大数，最大值：50
    */
    @SerializedName("MaxNum")
    @Expose
    private Long MaxNum;

    /**
    * 策略类型(枚举值：比如cpu)
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * 策略阈值
    */
    @SerializedName("PolicyThreshold")
    @Expose
    private Long PolicyThreshold;

    /**
    * 服务端口
    */
    @SerializedName("ContainerPort")
    @Expose
    private Long ContainerPort;

    /**
    * 服务名称
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * repository的类型(coding/gitlab/github/coding)
    */
    @SerializedName("RepositoryType")
    @Expose
    private String RepositoryType;

    /**
    * Dockerfile地址
    */
    @SerializedName("DockerfilePath")
    @Expose
    private String DockerfilePath;

    /**
    * 构建目录
    */
    @SerializedName("BuildDir")
    @Expose
    private String BuildDir;

    /**
    * 环境变量
    */
    @SerializedName("EnvParams")
    @Expose
    private String EnvParams;

    /**
    * repository地址
    */
    @SerializedName("Repository")
    @Expose
    private String Repository;

    /**
    * 分支
    */
    @SerializedName("Branch")
    @Expose
    private String Branch;

    /**
    * 版本备注
    */
    @SerializedName("VersionRemark")
    @Expose
    private String VersionRemark;

    /**
    * 代码包名字
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * 代码包的版本
    */
    @SerializedName("PackageVersion")
    @Expose
    private String PackageVersion;

    /**
    * Image的详情
    */
    @SerializedName("ImageInfo")
    @Expose
    private CloudBaseRunImageInfo ImageInfo;

    /**
    * Github等拉取代码的详情
    */
    @SerializedName("CodeDetail")
    @Expose
    private CloudBaseCodeRepoDetail CodeDetail;

    /**
    * 私有镜像秘钥信息
    */
    @SerializedName("ImageSecretInfo")
    @Expose
    private CloudBaseRunImageSecretInfo ImageSecretInfo;

    /**
    * 私有镜像 认证名称
    */
    @SerializedName("ImagePullSecret")
    @Expose
    private String ImagePullSecret;

    /**
    * 用户自定义采集日志路径
    */
    @SerializedName("CustomLogs")
    @Expose
    private String CustomLogs;

    /**
    * 延迟多长时间开始健康检查（单位s）
    */
    @SerializedName("InitialDelaySeconds")
    @Expose
    private Long InitialDelaySeconds;

    /**
    * cfs挂载信息
    */
    @SerializedName("MountVolumeInfo")
    @Expose
    private CloudBaseRunVolumeMount [] MountVolumeInfo;

    /**
    * 4 代表只能微信链路访问
    */
    @SerializedName("AccessType")
    @Expose
    private Long AccessType;

    /**
    * es信息
    */
    @SerializedName("EsInfo")
    @Expose
    private CloudBaseEsInfo EsInfo;

    /**
    * 是否使用统一域名
    */
    @SerializedName("EnableUnion")
    @Expose
    private Boolean EnableUnion;

    /**
    * 操作备注
    */
    @SerializedName("OperatorRemark")
    @Expose
    private String OperatorRemark;

    /**
    * 服务路径
    */
    @SerializedName("ServerPath")
    @Expose
    private String ServerPath;

    /**
    * 镜像复用的key
    */
    @SerializedName("ImageReuseKey")
    @Expose
    private String ImageReuseKey;

    /**
    * 容器的描述文件
    */
    @SerializedName("SidecarSpecs")
    @Expose
    private CloudBaseRunSideSpec [] SidecarSpecs;

    /**
    * 安全特性
    */
    @SerializedName("Security")
    @Expose
    private CloudBaseSecurityContext Security;

    /**
    * 服务磁盘挂载
    */
    @SerializedName("ServiceVolumes")
    @Expose
    private CloudRunServiceVolume [] ServiceVolumes;

    /**
    * 是否创建JnsGw 0未传默认创建 1创建 2不创建
    */
    @SerializedName("IsCreateJnsGw")
    @Expose
    private Long IsCreateJnsGw;

    /**
    * 数据卷挂载参数
    */
    @SerializedName("ServiceVolumeMounts")
    @Expose
    private CloudBaseRunServiceVolumeMount [] ServiceVolumeMounts;

    /**
    * 是否有Dockerfile：0-default has, 1-has, 2-has not
    */
    @SerializedName("HasDockerfile")
    @Expose
    private Long HasDockerfile;

    /**
    * 基础镜像
    */
    @SerializedName("BaseImage")
    @Expose
    private String BaseImage;

    /**
    * 容器启动入口命令
    */
    @SerializedName("EntryPoint")
    @Expose
    private String EntryPoint;

    /**
    * 仓库语言
    */
    @SerializedName("RepoLanguage")
    @Expose
    private String RepoLanguage;

    /**
    * 用户实际上传文件名（仅UploadType为jar/war时必填）
    */
    @SerializedName("UploadFilename")
    @Expose
    private String UploadFilename;

    /**
    * 自动扩缩容策略组
    */
    @SerializedName("PolicyDetail")
    @Expose
    private HpaPolicy [] PolicyDetail;

    /**
     * Get 环境ID 
     * @return EnvId 环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境ID
     * @param EnvId 环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 枚举（package/repository/image/jar/war) 
     * @return UploadType 枚举（package/repository/image/jar/war)
     */
    public String getUploadType() {
        return this.UploadType;
    }

    /**
     * Set 枚举（package/repository/image/jar/war)
     * @param UploadType 枚举（package/repository/image/jar/war)
     */
    public void setUploadType(String UploadType) {
        this.UploadType = UploadType;
    }

    /**
     * Get 流量占比 
     * @return FlowRatio 流量占比
     */
    public Long getFlowRatio() {
        return this.FlowRatio;
    }

    /**
     * Set 流量占比
     * @param FlowRatio 流量占比
     */
    public void setFlowRatio(Long FlowRatio) {
        this.FlowRatio = FlowRatio;
    }

    /**
     * Get Cpu的大小，单位：核 
     * @return Cpu Cpu的大小，单位：核
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set Cpu的大小，单位：核
     * @param Cpu Cpu的大小，单位：核
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Mem的大小，单位：G 
     * @return Mem Mem的大小，单位：G
     */
    public Float getMem() {
        return this.Mem;
    }

    /**
     * Set Mem的大小，单位：G
     * @param Mem Mem的大小，单位：G
     */
    public void setMem(Float Mem) {
        this.Mem = Mem;
    }

    /**
     * Get 最小副本数，最小值：0 
     * @return MinNum 最小副本数，最小值：0
     */
    public Long getMinNum() {
        return this.MinNum;
    }

    /**
     * Set 最小副本数，最小值：0
     * @param MinNum 最小副本数，最小值：0
     */
    public void setMinNum(Long MinNum) {
        this.MinNum = MinNum;
    }

    /**
     * Get 副本最大数，最大值：50 
     * @return MaxNum 副本最大数，最大值：50
     */
    public Long getMaxNum() {
        return this.MaxNum;
    }

    /**
     * Set 副本最大数，最大值：50
     * @param MaxNum 副本最大数，最大值：50
     */
    public void setMaxNum(Long MaxNum) {
        this.MaxNum = MaxNum;
    }

    /**
     * Get 策略类型(枚举值：比如cpu) 
     * @return PolicyType 策略类型(枚举值：比如cpu)
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 策略类型(枚举值：比如cpu)
     * @param PolicyType 策略类型(枚举值：比如cpu)
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 策略阈值 
     * @return PolicyThreshold 策略阈值
     */
    public Long getPolicyThreshold() {
        return this.PolicyThreshold;
    }

    /**
     * Set 策略阈值
     * @param PolicyThreshold 策略阈值
     */
    public void setPolicyThreshold(Long PolicyThreshold) {
        this.PolicyThreshold = PolicyThreshold;
    }

    /**
     * Get 服务端口 
     * @return ContainerPort 服务端口
     */
    public Long getContainerPort() {
        return this.ContainerPort;
    }

    /**
     * Set 服务端口
     * @param ContainerPort 服务端口
     */
    public void setContainerPort(Long ContainerPort) {
        this.ContainerPort = ContainerPort;
    }

    /**
     * Get 服务名称 
     * @return ServerName 服务名称
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set 服务名称
     * @param ServerName 服务名称
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get repository的类型(coding/gitlab/github/coding) 
     * @return RepositoryType repository的类型(coding/gitlab/github/coding)
     */
    public String getRepositoryType() {
        return this.RepositoryType;
    }

    /**
     * Set repository的类型(coding/gitlab/github/coding)
     * @param RepositoryType repository的类型(coding/gitlab/github/coding)
     */
    public void setRepositoryType(String RepositoryType) {
        this.RepositoryType = RepositoryType;
    }

    /**
     * Get Dockerfile地址 
     * @return DockerfilePath Dockerfile地址
     */
    public String getDockerfilePath() {
        return this.DockerfilePath;
    }

    /**
     * Set Dockerfile地址
     * @param DockerfilePath Dockerfile地址
     */
    public void setDockerfilePath(String DockerfilePath) {
        this.DockerfilePath = DockerfilePath;
    }

    /**
     * Get 构建目录 
     * @return BuildDir 构建目录
     */
    public String getBuildDir() {
        return this.BuildDir;
    }

    /**
     * Set 构建目录
     * @param BuildDir 构建目录
     */
    public void setBuildDir(String BuildDir) {
        this.BuildDir = BuildDir;
    }

    /**
     * Get 环境变量 
     * @return EnvParams 环境变量
     */
    public String getEnvParams() {
        return this.EnvParams;
    }

    /**
     * Set 环境变量
     * @param EnvParams 环境变量
     */
    public void setEnvParams(String EnvParams) {
        this.EnvParams = EnvParams;
    }

    /**
     * Get repository地址 
     * @return Repository repository地址
     */
    public String getRepository() {
        return this.Repository;
    }

    /**
     * Set repository地址
     * @param Repository repository地址
     */
    public void setRepository(String Repository) {
        this.Repository = Repository;
    }

    /**
     * Get 分支 
     * @return Branch 分支
     */
    public String getBranch() {
        return this.Branch;
    }

    /**
     * Set 分支
     * @param Branch 分支
     */
    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    /**
     * Get 版本备注 
     * @return VersionRemark 版本备注
     */
    public String getVersionRemark() {
        return this.VersionRemark;
    }

    /**
     * Set 版本备注
     * @param VersionRemark 版本备注
     */
    public void setVersionRemark(String VersionRemark) {
        this.VersionRemark = VersionRemark;
    }

    /**
     * Get 代码包名字 
     * @return PackageName 代码包名字
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set 代码包名字
     * @param PackageName 代码包名字
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get 代码包的版本 
     * @return PackageVersion 代码包的版本
     */
    public String getPackageVersion() {
        return this.PackageVersion;
    }

    /**
     * Set 代码包的版本
     * @param PackageVersion 代码包的版本
     */
    public void setPackageVersion(String PackageVersion) {
        this.PackageVersion = PackageVersion;
    }

    /**
     * Get Image的详情 
     * @return ImageInfo Image的详情
     */
    public CloudBaseRunImageInfo getImageInfo() {
        return this.ImageInfo;
    }

    /**
     * Set Image的详情
     * @param ImageInfo Image的详情
     */
    public void setImageInfo(CloudBaseRunImageInfo ImageInfo) {
        this.ImageInfo = ImageInfo;
    }

    /**
     * Get Github等拉取代码的详情 
     * @return CodeDetail Github等拉取代码的详情
     */
    public CloudBaseCodeRepoDetail getCodeDetail() {
        return this.CodeDetail;
    }

    /**
     * Set Github等拉取代码的详情
     * @param CodeDetail Github等拉取代码的详情
     */
    public void setCodeDetail(CloudBaseCodeRepoDetail CodeDetail) {
        this.CodeDetail = CodeDetail;
    }

    /**
     * Get 私有镜像秘钥信息 
     * @return ImageSecretInfo 私有镜像秘钥信息
     */
    public CloudBaseRunImageSecretInfo getImageSecretInfo() {
        return this.ImageSecretInfo;
    }

    /**
     * Set 私有镜像秘钥信息
     * @param ImageSecretInfo 私有镜像秘钥信息
     */
    public void setImageSecretInfo(CloudBaseRunImageSecretInfo ImageSecretInfo) {
        this.ImageSecretInfo = ImageSecretInfo;
    }

    /**
     * Get 私有镜像 认证名称 
     * @return ImagePullSecret 私有镜像 认证名称
     */
    public String getImagePullSecret() {
        return this.ImagePullSecret;
    }

    /**
     * Set 私有镜像 认证名称
     * @param ImagePullSecret 私有镜像 认证名称
     */
    public void setImagePullSecret(String ImagePullSecret) {
        this.ImagePullSecret = ImagePullSecret;
    }

    /**
     * Get 用户自定义采集日志路径 
     * @return CustomLogs 用户自定义采集日志路径
     */
    public String getCustomLogs() {
        return this.CustomLogs;
    }

    /**
     * Set 用户自定义采集日志路径
     * @param CustomLogs 用户自定义采集日志路径
     */
    public void setCustomLogs(String CustomLogs) {
        this.CustomLogs = CustomLogs;
    }

    /**
     * Get 延迟多长时间开始健康检查（单位s） 
     * @return InitialDelaySeconds 延迟多长时间开始健康检查（单位s）
     */
    public Long getInitialDelaySeconds() {
        return this.InitialDelaySeconds;
    }

    /**
     * Set 延迟多长时间开始健康检查（单位s）
     * @param InitialDelaySeconds 延迟多长时间开始健康检查（单位s）
     */
    public void setInitialDelaySeconds(Long InitialDelaySeconds) {
        this.InitialDelaySeconds = InitialDelaySeconds;
    }

    /**
     * Get cfs挂载信息 
     * @return MountVolumeInfo cfs挂载信息
     */
    public CloudBaseRunVolumeMount [] getMountVolumeInfo() {
        return this.MountVolumeInfo;
    }

    /**
     * Set cfs挂载信息
     * @param MountVolumeInfo cfs挂载信息
     */
    public void setMountVolumeInfo(CloudBaseRunVolumeMount [] MountVolumeInfo) {
        this.MountVolumeInfo = MountVolumeInfo;
    }

    /**
     * Get 4 代表只能微信链路访问 
     * @return AccessType 4 代表只能微信链路访问
     */
    public Long getAccessType() {
        return this.AccessType;
    }

    /**
     * Set 4 代表只能微信链路访问
     * @param AccessType 4 代表只能微信链路访问
     */
    public void setAccessType(Long AccessType) {
        this.AccessType = AccessType;
    }

    /**
     * Get es信息 
     * @return EsInfo es信息
     */
    public CloudBaseEsInfo getEsInfo() {
        return this.EsInfo;
    }

    /**
     * Set es信息
     * @param EsInfo es信息
     */
    public void setEsInfo(CloudBaseEsInfo EsInfo) {
        this.EsInfo = EsInfo;
    }

    /**
     * Get 是否使用统一域名 
     * @return EnableUnion 是否使用统一域名
     */
    public Boolean getEnableUnion() {
        return this.EnableUnion;
    }

    /**
     * Set 是否使用统一域名
     * @param EnableUnion 是否使用统一域名
     */
    public void setEnableUnion(Boolean EnableUnion) {
        this.EnableUnion = EnableUnion;
    }

    /**
     * Get 操作备注 
     * @return OperatorRemark 操作备注
     */
    public String getOperatorRemark() {
        return this.OperatorRemark;
    }

    /**
     * Set 操作备注
     * @param OperatorRemark 操作备注
     */
    public void setOperatorRemark(String OperatorRemark) {
        this.OperatorRemark = OperatorRemark;
    }

    /**
     * Get 服务路径 
     * @return ServerPath 服务路径
     */
    public String getServerPath() {
        return this.ServerPath;
    }

    /**
     * Set 服务路径
     * @param ServerPath 服务路径
     */
    public void setServerPath(String ServerPath) {
        this.ServerPath = ServerPath;
    }

    /**
     * Get 镜像复用的key 
     * @return ImageReuseKey 镜像复用的key
     */
    public String getImageReuseKey() {
        return this.ImageReuseKey;
    }

    /**
     * Set 镜像复用的key
     * @param ImageReuseKey 镜像复用的key
     */
    public void setImageReuseKey(String ImageReuseKey) {
        this.ImageReuseKey = ImageReuseKey;
    }

    /**
     * Get 容器的描述文件 
     * @return SidecarSpecs 容器的描述文件
     */
    public CloudBaseRunSideSpec [] getSidecarSpecs() {
        return this.SidecarSpecs;
    }

    /**
     * Set 容器的描述文件
     * @param SidecarSpecs 容器的描述文件
     */
    public void setSidecarSpecs(CloudBaseRunSideSpec [] SidecarSpecs) {
        this.SidecarSpecs = SidecarSpecs;
    }

    /**
     * Get 安全特性 
     * @return Security 安全特性
     */
    public CloudBaseSecurityContext getSecurity() {
        return this.Security;
    }

    /**
     * Set 安全特性
     * @param Security 安全特性
     */
    public void setSecurity(CloudBaseSecurityContext Security) {
        this.Security = Security;
    }

    /**
     * Get 服务磁盘挂载 
     * @return ServiceVolumes 服务磁盘挂载
     */
    public CloudRunServiceVolume [] getServiceVolumes() {
        return this.ServiceVolumes;
    }

    /**
     * Set 服务磁盘挂载
     * @param ServiceVolumes 服务磁盘挂载
     */
    public void setServiceVolumes(CloudRunServiceVolume [] ServiceVolumes) {
        this.ServiceVolumes = ServiceVolumes;
    }

    /**
     * Get 是否创建JnsGw 0未传默认创建 1创建 2不创建 
     * @return IsCreateJnsGw 是否创建JnsGw 0未传默认创建 1创建 2不创建
     */
    public Long getIsCreateJnsGw() {
        return this.IsCreateJnsGw;
    }

    /**
     * Set 是否创建JnsGw 0未传默认创建 1创建 2不创建
     * @param IsCreateJnsGw 是否创建JnsGw 0未传默认创建 1创建 2不创建
     */
    public void setIsCreateJnsGw(Long IsCreateJnsGw) {
        this.IsCreateJnsGw = IsCreateJnsGw;
    }

    /**
     * Get 数据卷挂载参数 
     * @return ServiceVolumeMounts 数据卷挂载参数
     */
    public CloudBaseRunServiceVolumeMount [] getServiceVolumeMounts() {
        return this.ServiceVolumeMounts;
    }

    /**
     * Set 数据卷挂载参数
     * @param ServiceVolumeMounts 数据卷挂载参数
     */
    public void setServiceVolumeMounts(CloudBaseRunServiceVolumeMount [] ServiceVolumeMounts) {
        this.ServiceVolumeMounts = ServiceVolumeMounts;
    }

    /**
     * Get 是否有Dockerfile：0-default has, 1-has, 2-has not 
     * @return HasDockerfile 是否有Dockerfile：0-default has, 1-has, 2-has not
     */
    public Long getHasDockerfile() {
        return this.HasDockerfile;
    }

    /**
     * Set 是否有Dockerfile：0-default has, 1-has, 2-has not
     * @param HasDockerfile 是否有Dockerfile：0-default has, 1-has, 2-has not
     */
    public void setHasDockerfile(Long HasDockerfile) {
        this.HasDockerfile = HasDockerfile;
    }

    /**
     * Get 基础镜像 
     * @return BaseImage 基础镜像
     */
    public String getBaseImage() {
        return this.BaseImage;
    }

    /**
     * Set 基础镜像
     * @param BaseImage 基础镜像
     */
    public void setBaseImage(String BaseImage) {
        this.BaseImage = BaseImage;
    }

    /**
     * Get 容器启动入口命令 
     * @return EntryPoint 容器启动入口命令
     */
    public String getEntryPoint() {
        return this.EntryPoint;
    }

    /**
     * Set 容器启动入口命令
     * @param EntryPoint 容器启动入口命令
     */
    public void setEntryPoint(String EntryPoint) {
        this.EntryPoint = EntryPoint;
    }

    /**
     * Get 仓库语言 
     * @return RepoLanguage 仓库语言
     */
    public String getRepoLanguage() {
        return this.RepoLanguage;
    }

    /**
     * Set 仓库语言
     * @param RepoLanguage 仓库语言
     */
    public void setRepoLanguage(String RepoLanguage) {
        this.RepoLanguage = RepoLanguage;
    }

    /**
     * Get 用户实际上传文件名（仅UploadType为jar/war时必填） 
     * @return UploadFilename 用户实际上传文件名（仅UploadType为jar/war时必填）
     */
    public String getUploadFilename() {
        return this.UploadFilename;
    }

    /**
     * Set 用户实际上传文件名（仅UploadType为jar/war时必填）
     * @param UploadFilename 用户实际上传文件名（仅UploadType为jar/war时必填）
     */
    public void setUploadFilename(String UploadFilename) {
        this.UploadFilename = UploadFilename;
    }

    /**
     * Get 自动扩缩容策略组 
     * @return PolicyDetail 自动扩缩容策略组
     */
    public HpaPolicy [] getPolicyDetail() {
        return this.PolicyDetail;
    }

    /**
     * Set 自动扩缩容策略组
     * @param PolicyDetail 自动扩缩容策略组
     */
    public void setPolicyDetail(HpaPolicy [] PolicyDetail) {
        this.PolicyDetail = PolicyDetail;
    }

    public CreateCloudBaseRunServerVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCloudBaseRunServerVersionRequest(CreateCloudBaseRunServerVersionRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.UploadType != null) {
            this.UploadType = new String(source.UploadType);
        }
        if (source.FlowRatio != null) {
            this.FlowRatio = new Long(source.FlowRatio);
        }
        if (source.Cpu != null) {
            this.Cpu = new Float(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Float(source.Mem);
        }
        if (source.MinNum != null) {
            this.MinNum = new Long(source.MinNum);
        }
        if (source.MaxNum != null) {
            this.MaxNum = new Long(source.MaxNum);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.PolicyThreshold != null) {
            this.PolicyThreshold = new Long(source.PolicyThreshold);
        }
        if (source.ContainerPort != null) {
            this.ContainerPort = new Long(source.ContainerPort);
        }
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
        }
        if (source.RepositoryType != null) {
            this.RepositoryType = new String(source.RepositoryType);
        }
        if (source.DockerfilePath != null) {
            this.DockerfilePath = new String(source.DockerfilePath);
        }
        if (source.BuildDir != null) {
            this.BuildDir = new String(source.BuildDir);
        }
        if (source.EnvParams != null) {
            this.EnvParams = new String(source.EnvParams);
        }
        if (source.Repository != null) {
            this.Repository = new String(source.Repository);
        }
        if (source.Branch != null) {
            this.Branch = new String(source.Branch);
        }
        if (source.VersionRemark != null) {
            this.VersionRemark = new String(source.VersionRemark);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.PackageVersion != null) {
            this.PackageVersion = new String(source.PackageVersion);
        }
        if (source.ImageInfo != null) {
            this.ImageInfo = new CloudBaseRunImageInfo(source.ImageInfo);
        }
        if (source.CodeDetail != null) {
            this.CodeDetail = new CloudBaseCodeRepoDetail(source.CodeDetail);
        }
        if (source.ImageSecretInfo != null) {
            this.ImageSecretInfo = new CloudBaseRunImageSecretInfo(source.ImageSecretInfo);
        }
        if (source.ImagePullSecret != null) {
            this.ImagePullSecret = new String(source.ImagePullSecret);
        }
        if (source.CustomLogs != null) {
            this.CustomLogs = new String(source.CustomLogs);
        }
        if (source.InitialDelaySeconds != null) {
            this.InitialDelaySeconds = new Long(source.InitialDelaySeconds);
        }
        if (source.MountVolumeInfo != null) {
            this.MountVolumeInfo = new CloudBaseRunVolumeMount[source.MountVolumeInfo.length];
            for (int i = 0; i < source.MountVolumeInfo.length; i++) {
                this.MountVolumeInfo[i] = new CloudBaseRunVolumeMount(source.MountVolumeInfo[i]);
            }
        }
        if (source.AccessType != null) {
            this.AccessType = new Long(source.AccessType);
        }
        if (source.EsInfo != null) {
            this.EsInfo = new CloudBaseEsInfo(source.EsInfo);
        }
        if (source.EnableUnion != null) {
            this.EnableUnion = new Boolean(source.EnableUnion);
        }
        if (source.OperatorRemark != null) {
            this.OperatorRemark = new String(source.OperatorRemark);
        }
        if (source.ServerPath != null) {
            this.ServerPath = new String(source.ServerPath);
        }
        if (source.ImageReuseKey != null) {
            this.ImageReuseKey = new String(source.ImageReuseKey);
        }
        if (source.SidecarSpecs != null) {
            this.SidecarSpecs = new CloudBaseRunSideSpec[source.SidecarSpecs.length];
            for (int i = 0; i < source.SidecarSpecs.length; i++) {
                this.SidecarSpecs[i] = new CloudBaseRunSideSpec(source.SidecarSpecs[i]);
            }
        }
        if (source.Security != null) {
            this.Security = new CloudBaseSecurityContext(source.Security);
        }
        if (source.ServiceVolumes != null) {
            this.ServiceVolumes = new CloudRunServiceVolume[source.ServiceVolumes.length];
            for (int i = 0; i < source.ServiceVolumes.length; i++) {
                this.ServiceVolumes[i] = new CloudRunServiceVolume(source.ServiceVolumes[i]);
            }
        }
        if (source.IsCreateJnsGw != null) {
            this.IsCreateJnsGw = new Long(source.IsCreateJnsGw);
        }
        if (source.ServiceVolumeMounts != null) {
            this.ServiceVolumeMounts = new CloudBaseRunServiceVolumeMount[source.ServiceVolumeMounts.length];
            for (int i = 0; i < source.ServiceVolumeMounts.length; i++) {
                this.ServiceVolumeMounts[i] = new CloudBaseRunServiceVolumeMount(source.ServiceVolumeMounts[i]);
            }
        }
        if (source.HasDockerfile != null) {
            this.HasDockerfile = new Long(source.HasDockerfile);
        }
        if (source.BaseImage != null) {
            this.BaseImage = new String(source.BaseImage);
        }
        if (source.EntryPoint != null) {
            this.EntryPoint = new String(source.EntryPoint);
        }
        if (source.RepoLanguage != null) {
            this.RepoLanguage = new String(source.RepoLanguage);
        }
        if (source.UploadFilename != null) {
            this.UploadFilename = new String(source.UploadFilename);
        }
        if (source.PolicyDetail != null) {
            this.PolicyDetail = new HpaPolicy[source.PolicyDetail.length];
            for (int i = 0; i < source.PolicyDetail.length; i++) {
                this.PolicyDetail[i] = new HpaPolicy(source.PolicyDetail[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "UploadType", this.UploadType);
        this.setParamSimple(map, prefix + "FlowRatio", this.FlowRatio);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "MinNum", this.MinNum);
        this.setParamSimple(map, prefix + "MaxNum", this.MaxNum);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "PolicyThreshold", this.PolicyThreshold);
        this.setParamSimple(map, prefix + "ContainerPort", this.ContainerPort);
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamSimple(map, prefix + "RepositoryType", this.RepositoryType);
        this.setParamSimple(map, prefix + "DockerfilePath", this.DockerfilePath);
        this.setParamSimple(map, prefix + "BuildDir", this.BuildDir);
        this.setParamSimple(map, prefix + "EnvParams", this.EnvParams);
        this.setParamSimple(map, prefix + "Repository", this.Repository);
        this.setParamSimple(map, prefix + "Branch", this.Branch);
        this.setParamSimple(map, prefix + "VersionRemark", this.VersionRemark);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "PackageVersion", this.PackageVersion);
        this.setParamObj(map, prefix + "ImageInfo.", this.ImageInfo);
        this.setParamObj(map, prefix + "CodeDetail.", this.CodeDetail);
        this.setParamObj(map, prefix + "ImageSecretInfo.", this.ImageSecretInfo);
        this.setParamSimple(map, prefix + "ImagePullSecret", this.ImagePullSecret);
        this.setParamSimple(map, prefix + "CustomLogs", this.CustomLogs);
        this.setParamSimple(map, prefix + "InitialDelaySeconds", this.InitialDelaySeconds);
        this.setParamArrayObj(map, prefix + "MountVolumeInfo.", this.MountVolumeInfo);
        this.setParamSimple(map, prefix + "AccessType", this.AccessType);
        this.setParamObj(map, prefix + "EsInfo.", this.EsInfo);
        this.setParamSimple(map, prefix + "EnableUnion", this.EnableUnion);
        this.setParamSimple(map, prefix + "OperatorRemark", this.OperatorRemark);
        this.setParamSimple(map, prefix + "ServerPath", this.ServerPath);
        this.setParamSimple(map, prefix + "ImageReuseKey", this.ImageReuseKey);
        this.setParamArrayObj(map, prefix + "SidecarSpecs.", this.SidecarSpecs);
        this.setParamObj(map, prefix + "Security.", this.Security);
        this.setParamArrayObj(map, prefix + "ServiceVolumes.", this.ServiceVolumes);
        this.setParamSimple(map, prefix + "IsCreateJnsGw", this.IsCreateJnsGw);
        this.setParamArrayObj(map, prefix + "ServiceVolumeMounts.", this.ServiceVolumeMounts);
        this.setParamSimple(map, prefix + "HasDockerfile", this.HasDockerfile);
        this.setParamSimple(map, prefix + "BaseImage", this.BaseImage);
        this.setParamSimple(map, prefix + "EntryPoint", this.EntryPoint);
        this.setParamSimple(map, prefix + "RepoLanguage", this.RepoLanguage);
        this.setParamSimple(map, prefix + "UploadFilename", this.UploadFilename);
        this.setParamArrayObj(map, prefix + "PolicyDetail.", this.PolicyDetail);

    }
}

