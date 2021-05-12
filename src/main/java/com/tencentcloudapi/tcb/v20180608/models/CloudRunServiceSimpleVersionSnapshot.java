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

public class CloudRunServiceSimpleVersionSnapshot extends AbstractModel{

    /**
    * 版本名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 版本备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * cpu规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * 内存规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Mem")
    @Expose
    private Float Mem;

    /**
    * 最小副本数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinNum")
    @Expose
    private Long MinNum;

    /**
    * 最大副本数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MaxNum")
    @Expose
    private Long MaxNum;

    /**
    * 镜像url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * 扩容策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * 策略阈值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PolicyThreshold")
    @Expose
    private Long PolicyThreshold;

    /**
    * 环境参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvParams")
    @Expose
    private String EnvParams;

    /**
    * 容器端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerPort")
    @Expose
    private Long ContainerPort;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 更新类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UploadType")
    @Expose
    private String UploadType;

    /**
    * dockerfile路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DockerfilePath")
    @Expose
    private String DockerfilePath;

    /**
    * 构建路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BuildDir")
    @Expose
    private String BuildDir;

    /**
    * repo类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepoType")
    @Expose
    private String RepoType;

    /**
    * 仓库
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Repo")
    @Expose
    private String Repo;

    /**
    * 分支
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Branch")
    @Expose
    private String Branch;

    /**
    * 环境id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 服务名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * package名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * package版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageVersion")
    @Expose
    private String PackageVersion;

    /**
    * 自定义log路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomLogs")
    @Expose
    private String CustomLogs;

    /**
    * 延时健康检查时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InitialDelaySeconds")
    @Expose
    private Long InitialDelaySeconds;

    /**
    * snapshot名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * 镜像信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageInfo")
    @Expose
    private CloudBaseRunImageInfo ImageInfo;

    /**
    * 代码仓库信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodeDetail")
    @Expose
    private CloudBaseCodeRepoDetail CodeDetail;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 版本名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionName 版本名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 版本名
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionName 版本名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 版本备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 版本备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 版本备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 版本备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get cpu规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cpu cpu规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set cpu规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cpu cpu规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 内存规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Mem 内存规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getMem() {
        return this.Mem;
    }

    /**
     * Set 内存规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param Mem 内存规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMem(Float Mem) {
        this.Mem = Mem;
    }

    /**
     * Get 最小副本数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinNum 最小副本数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMinNum() {
        return this.MinNum;
    }

    /**
     * Set 最小副本数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinNum 最小副本数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinNum(Long MinNum) {
        this.MinNum = MinNum;
    }

    /**
     * Get 最大副本数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MaxNum 最大副本数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMaxNum() {
        return this.MaxNum;
    }

    /**
     * Set 最大副本数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MaxNum 最大副本数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMaxNum(Long MaxNum) {
        this.MaxNum = MaxNum;
    }

    /**
     * Get 镜像url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageUrl 镜像url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 镜像url
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageUrl 镜像url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get 扩容策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyType 扩容策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set 扩容策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyType 扩容策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get 策略阈值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PolicyThreshold 策略阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPolicyThreshold() {
        return this.PolicyThreshold;
    }

    /**
     * Set 策略阈值
注意：此字段可能返回 null，表示取不到有效值。
     * @param PolicyThreshold 策略阈值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPolicyThreshold(Long PolicyThreshold) {
        this.PolicyThreshold = PolicyThreshold;
    }

    /**
     * Get 环境参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvParams 环境参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnvParams() {
        return this.EnvParams;
    }

    /**
     * Set 环境参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvParams 环境参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvParams(String EnvParams) {
        this.EnvParams = EnvParams;
    }

    /**
     * Get 容器端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerPort 容器端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getContainerPort() {
        return this.ContainerPort;
    }

    /**
     * Set 容器端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerPort 容器端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerPort(Long ContainerPort) {
        this.ContainerPort = ContainerPort;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 更新类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UploadType 更新类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUploadType() {
        return this.UploadType;
    }

    /**
     * Set 更新类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param UploadType 更新类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUploadType(String UploadType) {
        this.UploadType = UploadType;
    }

    /**
     * Get dockerfile路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DockerfilePath dockerfile路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDockerfilePath() {
        return this.DockerfilePath;
    }

    /**
     * Set dockerfile路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param DockerfilePath dockerfile路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDockerfilePath(String DockerfilePath) {
        this.DockerfilePath = DockerfilePath;
    }

    /**
     * Get 构建路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BuildDir 构建路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBuildDir() {
        return this.BuildDir;
    }

    /**
     * Set 构建路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param BuildDir 构建路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBuildDir(String BuildDir) {
        this.BuildDir = BuildDir;
    }

    /**
     * Get repo类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepoType repo类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepoType() {
        return this.RepoType;
    }

    /**
     * Set repo类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepoType repo类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepoType(String RepoType) {
        this.RepoType = RepoType;
    }

    /**
     * Get 仓库
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Repo 仓库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepo() {
        return this.Repo;
    }

    /**
     * Set 仓库
注意：此字段可能返回 null，表示取不到有效值。
     * @param Repo 仓库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepo(String Repo) {
        this.Repo = Repo;
    }

    /**
     * Get 分支
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Branch 分支
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBranch() {
        return this.Branch;
    }

    /**
     * Set 分支
注意：此字段可能返回 null，表示取不到有效值。
     * @param Branch 分支
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    /**
     * Get 环境id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvId 环境id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境id
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvId 环境id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 服务名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServerName 服务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set 服务名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServerName 服务名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get package名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageName package名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set package名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageName package名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get package版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageVersion package版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageVersion() {
        return this.PackageVersion;
    }

    /**
     * Set package版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageVersion package版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageVersion(String PackageVersion) {
        this.PackageVersion = PackageVersion;
    }

    /**
     * Get 自定义log路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomLogs 自定义log路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomLogs() {
        return this.CustomLogs;
    }

    /**
     * Set 自定义log路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomLogs 自定义log路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomLogs(String CustomLogs) {
        this.CustomLogs = CustomLogs;
    }

    /**
     * Get 延时健康检查时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InitialDelaySeconds 延时健康检查时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInitialDelaySeconds() {
        return this.InitialDelaySeconds;
    }

    /**
     * Set 延时健康检查时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param InitialDelaySeconds 延时健康检查时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInitialDelaySeconds(Long InitialDelaySeconds) {
        this.InitialDelaySeconds = InitialDelaySeconds;
    }

    /**
     * Get snapshot名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SnapshotName snapshot名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * Set snapshot名
注意：此字段可能返回 null，表示取不到有效值。
     * @param SnapshotName snapshot名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * Get 镜像信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageInfo 镜像信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CloudBaseRunImageInfo getImageInfo() {
        return this.ImageInfo;
    }

    /**
     * Set 镜像信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageInfo 镜像信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageInfo(CloudBaseRunImageInfo ImageInfo) {
        this.ImageInfo = ImageInfo;
    }

    /**
     * Get 代码仓库信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodeDetail 代码仓库信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CloudBaseCodeRepoDetail getCodeDetail() {
        return this.CodeDetail;
    }

    /**
     * Set 代码仓库信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodeDetail 代码仓库信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodeDetail(CloudBaseCodeRepoDetail CodeDetail) {
        this.CodeDetail = CodeDetail;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public CloudRunServiceSimpleVersionSnapshot() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudRunServiceSimpleVersionSnapshot(CloudRunServiceSimpleVersionSnapshot source) {
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
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
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.PolicyThreshold != null) {
            this.PolicyThreshold = new Long(source.PolicyThreshold);
        }
        if (source.EnvParams != null) {
            this.EnvParams = new String(source.EnvParams);
        }
        if (source.ContainerPort != null) {
            this.ContainerPort = new Long(source.ContainerPort);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.UploadType != null) {
            this.UploadType = new String(source.UploadType);
        }
        if (source.DockerfilePath != null) {
            this.DockerfilePath = new String(source.DockerfilePath);
        }
        if (source.BuildDir != null) {
            this.BuildDir = new String(source.BuildDir);
        }
        if (source.RepoType != null) {
            this.RepoType = new String(source.RepoType);
        }
        if (source.Repo != null) {
            this.Repo = new String(source.Repo);
        }
        if (source.Branch != null) {
            this.Branch = new String(source.Branch);
        }
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.PackageVersion != null) {
            this.PackageVersion = new String(source.PackageVersion);
        }
        if (source.CustomLogs != null) {
            this.CustomLogs = new String(source.CustomLogs);
        }
        if (source.InitialDelaySeconds != null) {
            this.InitialDelaySeconds = new Long(source.InitialDelaySeconds);
        }
        if (source.SnapshotName != null) {
            this.SnapshotName = new String(source.SnapshotName);
        }
        if (source.ImageInfo != null) {
            this.ImageInfo = new CloudBaseRunImageInfo(source.ImageInfo);
        }
        if (source.CodeDetail != null) {
            this.CodeDetail = new CloudBaseCodeRepoDetail(source.CodeDetail);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "MinNum", this.MinNum);
        this.setParamSimple(map, prefix + "MaxNum", this.MaxNum);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "PolicyThreshold", this.PolicyThreshold);
        this.setParamSimple(map, prefix + "EnvParams", this.EnvParams);
        this.setParamSimple(map, prefix + "ContainerPort", this.ContainerPort);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "UploadType", this.UploadType);
        this.setParamSimple(map, prefix + "DockerfilePath", this.DockerfilePath);
        this.setParamSimple(map, prefix + "BuildDir", this.BuildDir);
        this.setParamSimple(map, prefix + "RepoType", this.RepoType);
        this.setParamSimple(map, prefix + "Repo", this.Repo);
        this.setParamSimple(map, prefix + "Branch", this.Branch);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "PackageVersion", this.PackageVersion);
        this.setParamSimple(map, prefix + "CustomLogs", this.CustomLogs);
        this.setParamSimple(map, prefix + "InitialDelaySeconds", this.InitialDelaySeconds);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamObj(map, prefix + "ImageInfo.", this.ImageInfo);
        this.setParamObj(map, prefix + "CodeDetail.", this.CodeDetail);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

