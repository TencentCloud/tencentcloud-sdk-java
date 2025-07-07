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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudBaseRunVersionResponse extends AbstractModel {

    /**
    * 版本名称
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Dockerfile的路径
    */
    @SerializedName("DockerfilePath")
    @Expose
    private String DockerfilePath;

    /**
    * DockerBuild的目录
    */
    @SerializedName("BuildDir")
    @Expose
    private String BuildDir;

    /**
    * 副本最小值
    */
    @SerializedName("MinNum")
    @Expose
    private Long MinNum;

    /**
    * 副本最大值
    */
    @SerializedName("MaxNum")
    @Expose
    private Long MaxNum;

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
    private Float PolicyThreshold;

    /**
    * 环境变量
    */
    @SerializedName("EnvParams")
    @Expose
    private String EnvParams;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * 版本的IP
    */
    @SerializedName("VersionIP")
    @Expose
    private String VersionIP;

    /**
    * 版本的端口号
    */
    @SerializedName("VersionPort")
    @Expose
    private Long VersionPort;

    /**
    * 版本状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 代码包的名字
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * 代码版本的名字
    */
    @SerializedName("PackageVersion")
    @Expose
    private String PackageVersion;

    /**
    * 枚举（package/repository/image)
    */
    @SerializedName("UploadType")
    @Expose
    private String UploadType;

    /**
    * Repo的类型(coding/gitlab/github/coding)
    */
    @SerializedName("RepoType")
    @Expose
    private String RepoType;

    /**
    * 地址
    */
    @SerializedName("Repo")
    @Expose
    private String Repo;

    /**
    * 分支
    */
    @SerializedName("Branch")
    @Expose
    private String Branch;

    /**
    * 服务名字
    */
    @SerializedName("ServerName")
    @Expose
    private String ServerName;

    /**
    * 是否对于外网开放
    */
    @SerializedName("IsPublic")
    @Expose
    private Boolean IsPublic;

    /**
    * vpc id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网实例id
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * 日志采集路径
    */
    @SerializedName("CustomLogs")
    @Expose
    private String CustomLogs;

    /**
    * 监听端口
    */
    @SerializedName("ContainerPort")
    @Expose
    private Long ContainerPort;

    /**
    * 延迟多长时间开始健康检查（单位s）
    */
    @SerializedName("InitialDelaySeconds")
    @Expose
    private Long InitialDelaySeconds;

    /**
    * 镜像地址
    */
    @SerializedName("ImageUrl")
    @Expose
    private String ImageUrl;

    /**
    * CPU 大小
    */
    @SerializedName("CpuSize")
    @Expose
    private Float CpuSize;

    /**
    * MEM 大小
    */
    @SerializedName("MemSize")
    @Expose
    private Float MemSize;

    /**
    * 扩缩容策略详情
    */
    @SerializedName("PolicyDetail")
    @Expose
    private HpaPolicy [] PolicyDetail;

    /**
    * Cpu的Request值
    */
    @SerializedName("Cpu")
    @Expose
    private Float Cpu;

    /**
    * Mem的Request值
    */
    @SerializedName("Mem")
    @Expose
    private Float Mem;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 版本名称 
     * @return VersionName 版本名称
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 版本名称
     * @param VersionName 版本名称
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Dockerfile的路径 
     * @return DockerfilePath Dockerfile的路径
     */
    public String getDockerfilePath() {
        return this.DockerfilePath;
    }

    /**
     * Set Dockerfile的路径
     * @param DockerfilePath Dockerfile的路径
     */
    public void setDockerfilePath(String DockerfilePath) {
        this.DockerfilePath = DockerfilePath;
    }

    /**
     * Get DockerBuild的目录 
     * @return BuildDir DockerBuild的目录
     */
    public String getBuildDir() {
        return this.BuildDir;
    }

    /**
     * Set DockerBuild的目录
     * @param BuildDir DockerBuild的目录
     */
    public void setBuildDir(String BuildDir) {
        this.BuildDir = BuildDir;
    }

    /**
     * Get 副本最小值 
     * @return MinNum 副本最小值
     */
    public Long getMinNum() {
        return this.MinNum;
    }

    /**
     * Set 副本最小值
     * @param MinNum 副本最小值
     */
    public void setMinNum(Long MinNum) {
        this.MinNum = MinNum;
    }

    /**
     * Get 副本最大值 
     * @return MaxNum 副本最大值
     */
    public Long getMaxNum() {
        return this.MaxNum;
    }

    /**
     * Set 副本最大值
     * @param MaxNum 副本最大值
     */
    public void setMaxNum(Long MaxNum) {
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
    public Float getPolicyThreshold() {
        return this.PolicyThreshold;
    }

    /**
     * Set 策略阈值
     * @param PolicyThreshold 策略阈值
     */
    public void setPolicyThreshold(Float PolicyThreshold) {
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
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 更新时间 
     * @return UpdatedTime 更新时间
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 更新时间
     * @param UpdatedTime 更新时间
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get 版本的IP 
     * @return VersionIP 版本的IP
     */
    public String getVersionIP() {
        return this.VersionIP;
    }

    /**
     * Set 版本的IP
     * @param VersionIP 版本的IP
     */
    public void setVersionIP(String VersionIP) {
        this.VersionIP = VersionIP;
    }

    /**
     * Get 版本的端口号 
     * @return VersionPort 版本的端口号
     */
    public Long getVersionPort() {
        return this.VersionPort;
    }

    /**
     * Set 版本的端口号
     * @param VersionPort 版本的端口号
     */
    public void setVersionPort(Long VersionPort) {
        this.VersionPort = VersionPort;
    }

    /**
     * Get 版本状态 
     * @return Status 版本状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 版本状态
     * @param Status 版本状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 代码包的名字 
     * @return PackageName 代码包的名字
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set 代码包的名字
     * @param PackageName 代码包的名字
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get 代码版本的名字 
     * @return PackageVersion 代码版本的名字
     */
    public String getPackageVersion() {
        return this.PackageVersion;
    }

    /**
     * Set 代码版本的名字
     * @param PackageVersion 代码版本的名字
     */
    public void setPackageVersion(String PackageVersion) {
        this.PackageVersion = PackageVersion;
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
     * Get Repo的类型(coding/gitlab/github/coding) 
     * @return RepoType Repo的类型(coding/gitlab/github/coding)
     */
    public String getRepoType() {
        return this.RepoType;
    }

    /**
     * Set Repo的类型(coding/gitlab/github/coding)
     * @param RepoType Repo的类型(coding/gitlab/github/coding)
     */
    public void setRepoType(String RepoType) {
        this.RepoType = RepoType;
    }

    /**
     * Get 地址 
     * @return Repo 地址
     */
    public String getRepo() {
        return this.Repo;
    }

    /**
     * Set 地址
     * @param Repo 地址
     */
    public void setRepo(String Repo) {
        this.Repo = Repo;
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
     * Get 服务名字 
     * @return ServerName 服务名字
     */
    public String getServerName() {
        return this.ServerName;
    }

    /**
     * Set 服务名字
     * @param ServerName 服务名字
     */
    public void setServerName(String ServerName) {
        this.ServerName = ServerName;
    }

    /**
     * Get 是否对于外网开放 
     * @return IsPublic 是否对于外网开放
     */
    public Boolean getIsPublic() {
        return this.IsPublic;
    }

    /**
     * Set 是否对于外网开放
     * @param IsPublic 是否对于外网开放
     */
    public void setIsPublic(Boolean IsPublic) {
        this.IsPublic = IsPublic;
    }

    /**
     * Get vpc id 
     * @return VpcId vpc id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc id
     * @param VpcId vpc id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网实例id 
     * @return SubnetIds 子网实例id
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网实例id
     * @param SubnetIds 子网实例id
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get 日志采集路径 
     * @return CustomLogs 日志采集路径
     */
    public String getCustomLogs() {
        return this.CustomLogs;
    }

    /**
     * Set 日志采集路径
     * @param CustomLogs 日志采集路径
     */
    public void setCustomLogs(String CustomLogs) {
        this.CustomLogs = CustomLogs;
    }

    /**
     * Get 监听端口 
     * @return ContainerPort 监听端口
     */
    public Long getContainerPort() {
        return this.ContainerPort;
    }

    /**
     * Set 监听端口
     * @param ContainerPort 监听端口
     */
    public void setContainerPort(Long ContainerPort) {
        this.ContainerPort = ContainerPort;
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
     * Get 镜像地址 
     * @return ImageUrl 镜像地址
     */
    public String getImageUrl() {
        return this.ImageUrl;
    }

    /**
     * Set 镜像地址
     * @param ImageUrl 镜像地址
     */
    public void setImageUrl(String ImageUrl) {
        this.ImageUrl = ImageUrl;
    }

    /**
     * Get CPU 大小 
     * @return CpuSize CPU 大小
     */
    public Float getCpuSize() {
        return this.CpuSize;
    }

    /**
     * Set CPU 大小
     * @param CpuSize CPU 大小
     */
    public void setCpuSize(Float CpuSize) {
        this.CpuSize = CpuSize;
    }

    /**
     * Get MEM 大小 
     * @return MemSize MEM 大小
     */
    public Float getMemSize() {
        return this.MemSize;
    }

    /**
     * Set MEM 大小
     * @param MemSize MEM 大小
     */
    public void setMemSize(Float MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get 扩缩容策略详情 
     * @return PolicyDetail 扩缩容策略详情
     */
    public HpaPolicy [] getPolicyDetail() {
        return this.PolicyDetail;
    }

    /**
     * Set 扩缩容策略详情
     * @param PolicyDetail 扩缩容策略详情
     */
    public void setPolicyDetail(HpaPolicy [] PolicyDetail) {
        this.PolicyDetail = PolicyDetail;
    }

    /**
     * Get Cpu的Request值 
     * @return Cpu Cpu的Request值
     */
    public Float getCpu() {
        return this.Cpu;
    }

    /**
     * Set Cpu的Request值
     * @param Cpu Cpu的Request值
     */
    public void setCpu(Float Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get Mem的Request值 
     * @return Mem Mem的Request值
     */
    public Float getMem() {
        return this.Mem;
    }

    /**
     * Set Mem的Request值
     * @param Mem Mem的Request值
     */
    public void setMem(Float Mem) {
        this.Mem = Mem;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeCloudBaseRunVersionResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCloudBaseRunVersionResponse(DescribeCloudBaseRunVersionResponse source) {
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.DockerfilePath != null) {
            this.DockerfilePath = new String(source.DockerfilePath);
        }
        if (source.BuildDir != null) {
            this.BuildDir = new String(source.BuildDir);
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
            this.PolicyThreshold = new Float(source.PolicyThreshold);
        }
        if (source.EnvParams != null) {
            this.EnvParams = new String(source.EnvParams);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.VersionIP != null) {
            this.VersionIP = new String(source.VersionIP);
        }
        if (source.VersionPort != null) {
            this.VersionPort = new Long(source.VersionPort);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.PackageVersion != null) {
            this.PackageVersion = new String(source.PackageVersion);
        }
        if (source.UploadType != null) {
            this.UploadType = new String(source.UploadType);
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
        if (source.ServerName != null) {
            this.ServerName = new String(source.ServerName);
        }
        if (source.IsPublic != null) {
            this.IsPublic = new Boolean(source.IsPublic);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.CustomLogs != null) {
            this.CustomLogs = new String(source.CustomLogs);
        }
        if (source.ContainerPort != null) {
            this.ContainerPort = new Long(source.ContainerPort);
        }
        if (source.InitialDelaySeconds != null) {
            this.InitialDelaySeconds = new Long(source.InitialDelaySeconds);
        }
        if (source.ImageUrl != null) {
            this.ImageUrl = new String(source.ImageUrl);
        }
        if (source.CpuSize != null) {
            this.CpuSize = new Float(source.CpuSize);
        }
        if (source.MemSize != null) {
            this.MemSize = new Float(source.MemSize);
        }
        if (source.PolicyDetail != null) {
            this.PolicyDetail = new HpaPolicy[source.PolicyDetail.length];
            for (int i = 0; i < source.PolicyDetail.length; i++) {
                this.PolicyDetail[i] = new HpaPolicy(source.PolicyDetail[i]);
            }
        }
        if (source.Cpu != null) {
            this.Cpu = new Float(source.Cpu);
        }
        if (source.Mem != null) {
            this.Mem = new Float(source.Mem);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "DockerfilePath", this.DockerfilePath);
        this.setParamSimple(map, prefix + "BuildDir", this.BuildDir);
        this.setParamSimple(map, prefix + "MinNum", this.MinNum);
        this.setParamSimple(map, prefix + "MaxNum", this.MaxNum);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "PolicyThreshold", this.PolicyThreshold);
        this.setParamSimple(map, prefix + "EnvParams", this.EnvParams);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamSimple(map, prefix + "VersionIP", this.VersionIP);
        this.setParamSimple(map, prefix + "VersionPort", this.VersionPort);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "PackageVersion", this.PackageVersion);
        this.setParamSimple(map, prefix + "UploadType", this.UploadType);
        this.setParamSimple(map, prefix + "RepoType", this.RepoType);
        this.setParamSimple(map, prefix + "Repo", this.Repo);
        this.setParamSimple(map, prefix + "Branch", this.Branch);
        this.setParamSimple(map, prefix + "ServerName", this.ServerName);
        this.setParamSimple(map, prefix + "IsPublic", this.IsPublic);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "CustomLogs", this.CustomLogs);
        this.setParamSimple(map, prefix + "ContainerPort", this.ContainerPort);
        this.setParamSimple(map, prefix + "InitialDelaySeconds", this.InitialDelaySeconds);
        this.setParamSimple(map, prefix + "ImageUrl", this.ImageUrl);
        this.setParamSimple(map, prefix + "CpuSize", this.CpuSize);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamArrayObj(map, prefix + "PolicyDetail.", this.PolicyDetail);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

