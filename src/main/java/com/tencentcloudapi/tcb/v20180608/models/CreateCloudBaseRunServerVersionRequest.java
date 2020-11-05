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
    * 枚举（package/repository/image)
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
     * Get 枚举（package/repository/image) 
     * @return UploadType 枚举（package/repository/image)
     */
    public String getUploadType() {
        return this.UploadType;
    }

    /**
     * Set 枚举（package/repository/image)
     * @param UploadType 枚举（package/repository/image)
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

    }
}

