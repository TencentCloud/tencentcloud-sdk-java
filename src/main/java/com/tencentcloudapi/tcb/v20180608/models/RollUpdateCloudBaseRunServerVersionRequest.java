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

public class RollUpdateCloudBaseRunServerVersionRequest extends AbstractModel{

    /**
    * 环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 要替换的版本名称，可以为latest
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 枚举（package/repository/image)
    */
    @SerializedName("UploadType")
    @Expose
    private String UploadType;

    /**
    * repository的类型(coding/gitlab/github)
    */
    @SerializedName("RepositoryType")
    @Expose
    private String RepositoryType;

    /**
    * 流量占比
    */
    @SerializedName("FlowRatio")
    @Expose
    private Long FlowRatio;

    /**
    * dockerfile地址
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
    * Cpu的大小，单位：核
    */
    @SerializedName("Cpu")
    @Expose
    private String Cpu;

    /**
    * Mem的大小，单位：G
    */
    @SerializedName("Mem")
    @Expose
    private String Mem;

    /**
    * 最小副本数，最小值：0
    */
    @SerializedName("MinNum")
    @Expose
    private String MinNum;

    /**
    * 最大副本数
    */
    @SerializedName("MaxNum")
    @Expose
    private String MaxNum;

    /**
    * 策略类型
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * 策略阈值
    */
    @SerializedName("PolicyThreshold")
    @Expose
    private String PolicyThreshold;

    /**
    * 环境变量
    */
    @SerializedName("EnvParams")
    @Expose
    private String EnvParams;

    /**
    * 容器端口
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
    * 代码包版本
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
    * 是否回放流量
    */
    @SerializedName("IsRebuild")
    @Expose
    private Boolean IsRebuild;

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
    * 是否回滚
    */
    @SerializedName("Rollback")
    @Expose
    private Boolean Rollback;

    /**
    * 版本历史名
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * 自定义采集路径
    */
    @SerializedName("CustomLogs")
    @Expose
    private String CustomLogs;

    /**
    * 是否启用统一域名
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
    * 服务路径（只会第一次生效）
    */
    @SerializedName("ServerPath")
    @Expose
    private String ServerPath;

    /**
    * 是否更新Cls
    */
    @SerializedName("IsUpdateCls")
    @Expose
    private Boolean IsUpdateCls;

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
     * Get 要替换的版本名称，可以为latest 
     * @return VersionName 要替换的版本名称，可以为latest
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 要替换的版本名称，可以为latest
     * @param VersionName 要替换的版本名称，可以为latest
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
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
     * Get repository的类型(coding/gitlab/github) 
     * @return RepositoryType repository的类型(coding/gitlab/github)
     */
    public String getRepositoryType() {
        return this.RepositoryType;
    }

    /**
     * Set repository的类型(coding/gitlab/github)
     * @param RepositoryType repository的类型(coding/gitlab/github)
     */
    public void setRepositoryType(String RepositoryType) {
        this.RepositoryType = RepositoryType;
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
     * Get dockerfile地址 
     * @return DockerfilePath dockerfile地址
     */
    public String getDockerfilePath() {
        return this.DockerfilePath;
    }

    /**
     * Set dockerfile地址
     * @param DockerfilePath dockerfile地址
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
     * Get Cpu的大小，单位：核 
     * @return Cpu Cpu的大小，单位：核
     */
    public String getCpu() {
        return this.Cpu;
    }

    /**
     * Set Cpu的大小，单位：核
     * @param Cpu Cpu的大小，单位：核
     */
    public void setCpu(String Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Mem的大小，单位：G 
     * @return Mem Mem的大小，单位：G
     */
    public String getMem() {
        return this.Mem;
    }

    /**
     * Set Mem的大小，单位：G
     * @param Mem Mem的大小，单位：G
     */
    public void setMem(String Mem) {
        this.Mem = Mem;
    }

    /**
     * Get 最小副本数，最小值：0 
     * @return MinNum 最小副本数，最小值：0
     */
    public String getMinNum() {
        return this.MinNum;
    }

    /**
     * Set 最小副本数，最小值：0
     * @param MinNum 最小副本数，最小值：0
     */
    public void setMinNum(String MinNum) {
        this.MinNum = MinNum;
    }

    /**
     * Get 最大副本数 
     * @return MaxNum 最大副本数
     */
    public String getMaxNum() {
        return this.MaxNum;
    }

    /**
     * Set 最大副本数
     * @param MaxNum 最大副本数
     */
    public void setMaxNum(String MaxNum) {
        this.MaxNum = MaxNum;
    }

    /**
     * Get 策略类型 
     * @return PolicyType 策略类型
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 策略类型
     * @param PolicyType 策略类型
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 策略阈值 
     * @return PolicyThreshold 策略阈值
     */
    public String getPolicyThreshold() {
        return this.PolicyThreshold;
    }

    /**
     * Set 策略阈值
     * @param PolicyThreshold 策略阈值
     */
    public void setPolicyThreshold(String PolicyThreshold) {
        this.PolicyThreshold = PolicyThreshold;
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
     * Get 容器端口 
     * @return ContainerPort 容器端口
     */
    public Long getContainerPort() {
        return this.ContainerPort;
    }

    /**
     * Set 容器端口
     * @param ContainerPort 容器端口
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
     * Get 代码包版本 
     * @return PackageVersion 代码包版本
     */
    public String getPackageVersion() {
        return this.PackageVersion;
    }

    /**
     * Set 代码包版本
     * @param PackageVersion 代码包版本
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
     * Get 是否回放流量 
     * @return IsRebuild 是否回放流量
     */
    public Boolean getIsRebuild() {
        return this.IsRebuild;
    }

    /**
     * Set 是否回放流量
     * @param IsRebuild 是否回放流量
     */
    public void setIsRebuild(Boolean IsRebuild) {
        this.IsRebuild = IsRebuild;
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
     * Get 是否回滚 
     * @return Rollback 是否回滚
     */
    public Boolean getRollback() {
        return this.Rollback;
    }

    /**
     * Set 是否回滚
     * @param Rollback 是否回滚
     */
    public void setRollback(Boolean Rollback) {
        this.Rollback = Rollback;
    }

    /**
     * Get 版本历史名 
     * @return SnapshotName 版本历史名
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set 版本历史名
     * @param SnapshotName 版本历史名
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get 自定义采集路径 
     * @return CustomLogs 自定义采集路径
     */
    public String getCustomLogs() {
        return this.CustomLogs;
    }

    /**
     * Set 自定义采集路径
     * @param CustomLogs 自定义采集路径
     */
    public void setCustomLogs(String CustomLogs) {
        this.CustomLogs = CustomLogs;
    }

    /**
     * Get 是否启用统一域名 
     * @return EnableUnion 是否启用统一域名
     */
    public Boolean getEnableUnion() {
        return this.EnableUnion;
    }

    /**
     * Set 是否启用统一域名
     * @param EnableUnion 是否启用统一域名
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
     * Get 服务路径（只会第一次生效） 
     * @return ServerPath 服务路径（只会第一次生效）
     */
    public String getServerPath() {
        return this.ServerPath;
    }

    /**
     * Set 服务路径（只会第一次生效）
     * @param ServerPath 服务路径（只会第一次生效）
     */
    public void setServerPath(String ServerPath) {
        this.ServerPath = ServerPath;
    }

    /**
     * Get 是否更新Cls 
     * @return IsUpdateCls 是否更新Cls
     */
    public Boolean getIsUpdateCls() {
        return this.IsUpdateCls;
    }

    /**
     * Set 是否更新Cls
     * @param IsUpdateCls 是否更新Cls
     */
    public void setIsUpdateCls(Boolean IsUpdateCls) {
        this.IsUpdateCls = IsUpdateCls;
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

    public RollUpdateCloudBaseRunServerVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RollUpdateCloudBaseRunServerVersionRequest(RollUpdateCloudBaseRunServerVersionRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.UploadType != null) {
            this.UploadType = new String(source.UploadType);
        }
        if (source.RepositoryType != null) {
            this.RepositoryType = new String(source.RepositoryType);
        }
        if (source.FlowRatio != null) {
            this.FlowRatio = new Long(source.FlowRatio);
        }
        if (source.DockerfilePath != null) {
            this.DockerfilePath = new String(source.DockerfilePath);
        }
        if (source.BuildDir != null) {
            this.BuildDir = new String(source.BuildDir);
        }
        if (source.Cpu != null) {
            this.Cpu = new String(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new String(source.Mem);
        }
        if (source.MinNum != null) {
            this.MinNum = new String(source.MinNum);
        }
        if (source.MaxNum != null) {
            this.MaxNum = new String(source.MaxNum);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.PolicyThreshold != null) {
            this.PolicyThreshold = new String(source.PolicyThreshold);
        }
        if (source.EnvParams != null) {
            this.EnvParams = new String(source.EnvParams);
        }
        if (source.ContainerPort != null) {
            this.ContainerPort = new Long(source.ContainerPort);
        }
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
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
        if (source.IsRebuild != null) {
            this.IsRebuild = new Boolean(source.IsRebuild);
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
        if (source.Rollback != null) {
            this.Rollback = new Boolean(source.Rollback);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.CustomLogs != null) {
            this.CustomLogs = new String(source.CustomLogs);
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
        if (source.IsUpdateCls != null) {
            this.IsUpdateCls = new Boolean(source.IsUpdateCls);
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
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "UploadType", this.UploadType);
        this.setParamSimple(map, prefix + "RepositoryType", this.RepositoryType);
        this.setParamSimple(map, prefix + "FlowRatio", this.FlowRatio);
        this.setParamSimple(map, prefix + "DockerfilePath", this.DockerfilePath);
        this.setParamSimple(map, prefix + "BuildDir", this.BuildDir);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "MinNum", this.MinNum);
        this.setParamSimple(map, prefix + "MaxNum", this.MaxNum);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "PolicyThreshold", this.PolicyThreshold);
        this.setParamSimple(map, prefix + "EnvParams", this.EnvParams);
        this.setParamSimple(map, prefix + "ContainerPort", this.ContainerPort);
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamSimple(map, prefix + "Repository", this.Repository);
        this.setParamSimple(map, prefix + "Branch", this.Branch);
        this.setParamSimple(map, prefix + "VersionRemark", this.VersionRemark);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "PackageVersion", this.PackageVersion);
        this.setParamObj(map, prefix + "ImageInfo.", this.ImageInfo);
        this.setParamObj(map, prefix + "CodeDetail.", this.CodeDetail);
        this.setParamSimple(map, prefix + "IsRebuild", this.IsRebuild);
        this.setParamSimple(map, prefix + "InitialDelaySeconds", this.InitialDelaySeconds);
        this.setParamArrayObj(map, prefix + "MountVolumeInfo.", this.MountVolumeInfo);
        this.setParamSimple(map, prefix + "Rollback", this.Rollback);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "CustomLogs", this.CustomLogs);
        this.setParamSimple(map, prefix + "EnableUnion", this.EnableUnion);
        this.setParamSimple(map, prefix + "OperatorRemark", this.OperatorRemark);
        this.setParamSimple(map, prefix + "ServerPath", this.ServerPath);
        this.setParamSimple(map, prefix + "IsUpdateCls", this.IsUpdateCls);
        this.setParamArrayObj(map, prefix + "PolicyDetail.", this.PolicyDetail);

    }
}

