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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeployServiceV2Request extends AbstractModel{

    /**
    * 服务ID
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 容器端口
    */
    @SerializedName("ContainerPort")
    @Expose
    private Long ContainerPort;

    /**
    * 初始化 pod 数
    */
    @SerializedName("InitPodNum")
    @Expose
    private Long InitPodNum;

    /**
    * cpu规格
    */
    @SerializedName("CpuSpec")
    @Expose
    private Float CpuSpec;

    /**
    * 内存规格
    */
    @SerializedName("MemorySpec")
    @Expose
    private Float MemorySpec;

    /**
    * 环境ID
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 镜像仓库
    */
    @SerializedName("ImgRepo")
    @Expose
    private String ImgRepo;

    /**
    * 版本描述信息
    */
    @SerializedName("VersionDesc")
    @Expose
    private String VersionDesc;

    /**
    * 启动参数
    */
    @SerializedName("JvmOpts")
    @Expose
    private String JvmOpts;

    /**
    * 弹性伸缩配置，不传默认不启用弹性伸缩配置
    */
    @SerializedName("EsInfo")
    @Expose
    private EsInfo EsInfo;

    /**
    * 环境变量配置
    */
    @SerializedName("EnvConf")
    @Expose
    private Pair [] EnvConf;

    /**
    * 日志配置
    */
    @SerializedName("LogConfs")
    @Expose
    private String [] LogConfs;

    /**
    * 数据卷配置
    */
    @SerializedName("StorageConfs")
    @Expose
    private StorageConf [] StorageConfs;

    /**
    * 数据卷挂载配置
    */
    @SerializedName("StorageMountConfs")
    @Expose
    private StorageMountConf [] StorageMountConfs;

    /**
    * 部署类型。
- JAR：通过 jar 包部署
- WAR：通过 war 包部署
- IMAGE：通过镜像部署
    */
    @SerializedName("DeployMode")
    @Expose
    private String DeployMode;

    /**
    * 部署类型为 IMAGE 时，该参数表示镜像 tag。
部署类型为 JAR/WAR 时，该参数表示包版本号。
    */
    @SerializedName("DeployVersion")
    @Expose
    private String DeployVersion;

    /**
    * 包名。使用 JAR 包或者 WAR 包部署的时候必填。
    */
    @SerializedName("PkgName")
    @Expose
    private String PkgName;

    /**
    * JDK 版本。
- KONA：使用 kona jdk。
- OPEN：使用 open jdk。
    */
    @SerializedName("JdkVersion")
    @Expose
    private String JdkVersion;

    /**
    * 安全组ID s
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 日志输出配置
    */
    @SerializedName("LogOutputConf")
    @Expose
    private LogOutputConf LogOutputConf;

    /**
    * 来源渠道
    */
    @SerializedName("SourceChannel")
    @Expose
    private Long SourceChannel;

    /**
    * 版本描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 镜像命令
    */
    @SerializedName("ImageCommand")
    @Expose
    private String ImageCommand;

    /**
    * 镜像命令参数
    */
    @SerializedName("ImageArgs")
    @Expose
    private String [] ImageArgs;

    /**
    * 服务端口映射
    */
    @SerializedName("PortMappings")
    @Expose
    private PortMapping [] PortMappings;

    /**
    * 是否添加默认注册中心配置
    */
    @SerializedName("UseRegistryDefaultConfig")
    @Expose
    private Boolean UseRegistryDefaultConfig;

    /**
    * 挂载配置信息
    */
    @SerializedName("SettingConfs")
    @Expose
    private MountedSettingConf [] SettingConfs;

    /**
    * eks 访问设置
    */
    @SerializedName("EksService")
    @Expose
    private EksService EksService;

    /**
    * 要回滚到的历史版本id
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * 启动后执行的脚本
    */
    @SerializedName("PostStart")
    @Expose
    private String PostStart;

    /**
    * 停止前执行的脚本
    */
    @SerializedName("PreStop")
    @Expose
    private String PreStop;

    /**
    * 分批发布策略配置
    */
    @SerializedName("DeployStrategyConf")
    @Expose
    private DeployStrategyConf DeployStrategyConf;

    /**
    * 存活探针配置
    */
    @SerializedName("Liveness")
    @Expose
    private HealthCheckConfig Liveness;

    /**
    * 就绪探针配置
    */
    @SerializedName("Readiness")
    @Expose
    private HealthCheckConfig Readiness;

    /**
     * Get 服务ID 
     * @return ServiceId 服务ID
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务ID
     * @param ServiceId 服务ID
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
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
     * Get 初始化 pod 数 
     * @return InitPodNum 初始化 pod 数
     */
    public Long getInitPodNum() {
        return this.InitPodNum;
    }

    /**
     * Set 初始化 pod 数
     * @param InitPodNum 初始化 pod 数
     */
    public void setInitPodNum(Long InitPodNum) {
        this.InitPodNum = InitPodNum;
    }

    /**
     * Get cpu规格 
     * @return CpuSpec cpu规格
     */
    public Float getCpuSpec() {
        return this.CpuSpec;
    }

    /**
     * Set cpu规格
     * @param CpuSpec cpu规格
     */
    public void setCpuSpec(Float CpuSpec) {
        this.CpuSpec = CpuSpec;
    }

    /**
     * Get 内存规格 
     * @return MemorySpec 内存规格
     */
    public Float getMemorySpec() {
        return this.MemorySpec;
    }

    /**
     * Set 内存规格
     * @param MemorySpec 内存规格
     */
    public void setMemorySpec(Float MemorySpec) {
        this.MemorySpec = MemorySpec;
    }

    /**
     * Get 环境ID 
     * @return NamespaceId 环境ID
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set 环境ID
     * @param NamespaceId 环境ID
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get 镜像仓库 
     * @return ImgRepo 镜像仓库
     */
    public String getImgRepo() {
        return this.ImgRepo;
    }

    /**
     * Set 镜像仓库
     * @param ImgRepo 镜像仓库
     */
    public void setImgRepo(String ImgRepo) {
        this.ImgRepo = ImgRepo;
    }

    /**
     * Get 版本描述信息 
     * @return VersionDesc 版本描述信息
     */
    public String getVersionDesc() {
        return this.VersionDesc;
    }

    /**
     * Set 版本描述信息
     * @param VersionDesc 版本描述信息
     */
    public void setVersionDesc(String VersionDesc) {
        this.VersionDesc = VersionDesc;
    }

    /**
     * Get 启动参数 
     * @return JvmOpts 启动参数
     */
    public String getJvmOpts() {
        return this.JvmOpts;
    }

    /**
     * Set 启动参数
     * @param JvmOpts 启动参数
     */
    public void setJvmOpts(String JvmOpts) {
        this.JvmOpts = JvmOpts;
    }

    /**
     * Get 弹性伸缩配置，不传默认不启用弹性伸缩配置 
     * @return EsInfo 弹性伸缩配置，不传默认不启用弹性伸缩配置
     */
    public EsInfo getEsInfo() {
        return this.EsInfo;
    }

    /**
     * Set 弹性伸缩配置，不传默认不启用弹性伸缩配置
     * @param EsInfo 弹性伸缩配置，不传默认不启用弹性伸缩配置
     */
    public void setEsInfo(EsInfo EsInfo) {
        this.EsInfo = EsInfo;
    }

    /**
     * Get 环境变量配置 
     * @return EnvConf 环境变量配置
     */
    public Pair [] getEnvConf() {
        return this.EnvConf;
    }

    /**
     * Set 环境变量配置
     * @param EnvConf 环境变量配置
     */
    public void setEnvConf(Pair [] EnvConf) {
        this.EnvConf = EnvConf;
    }

    /**
     * Get 日志配置 
     * @return LogConfs 日志配置
     */
    public String [] getLogConfs() {
        return this.LogConfs;
    }

    /**
     * Set 日志配置
     * @param LogConfs 日志配置
     */
    public void setLogConfs(String [] LogConfs) {
        this.LogConfs = LogConfs;
    }

    /**
     * Get 数据卷配置 
     * @return StorageConfs 数据卷配置
     */
    public StorageConf [] getStorageConfs() {
        return this.StorageConfs;
    }

    /**
     * Set 数据卷配置
     * @param StorageConfs 数据卷配置
     */
    public void setStorageConfs(StorageConf [] StorageConfs) {
        this.StorageConfs = StorageConfs;
    }

    /**
     * Get 数据卷挂载配置 
     * @return StorageMountConfs 数据卷挂载配置
     */
    public StorageMountConf [] getStorageMountConfs() {
        return this.StorageMountConfs;
    }

    /**
     * Set 数据卷挂载配置
     * @param StorageMountConfs 数据卷挂载配置
     */
    public void setStorageMountConfs(StorageMountConf [] StorageMountConfs) {
        this.StorageMountConfs = StorageMountConfs;
    }

    /**
     * Get 部署类型。
- JAR：通过 jar 包部署
- WAR：通过 war 包部署
- IMAGE：通过镜像部署 
     * @return DeployMode 部署类型。
- JAR：通过 jar 包部署
- WAR：通过 war 包部署
- IMAGE：通过镜像部署
     */
    public String getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set 部署类型。
- JAR：通过 jar 包部署
- WAR：通过 war 包部署
- IMAGE：通过镜像部署
     * @param DeployMode 部署类型。
- JAR：通过 jar 包部署
- WAR：通过 war 包部署
- IMAGE：通过镜像部署
     */
    public void setDeployMode(String DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get 部署类型为 IMAGE 时，该参数表示镜像 tag。
部署类型为 JAR/WAR 时，该参数表示包版本号。 
     * @return DeployVersion 部署类型为 IMAGE 时，该参数表示镜像 tag。
部署类型为 JAR/WAR 时，该参数表示包版本号。
     */
    public String getDeployVersion() {
        return this.DeployVersion;
    }

    /**
     * Set 部署类型为 IMAGE 时，该参数表示镜像 tag。
部署类型为 JAR/WAR 时，该参数表示包版本号。
     * @param DeployVersion 部署类型为 IMAGE 时，该参数表示镜像 tag。
部署类型为 JAR/WAR 时，该参数表示包版本号。
     */
    public void setDeployVersion(String DeployVersion) {
        this.DeployVersion = DeployVersion;
    }

    /**
     * Get 包名。使用 JAR 包或者 WAR 包部署的时候必填。 
     * @return PkgName 包名。使用 JAR 包或者 WAR 包部署的时候必填。
     */
    public String getPkgName() {
        return this.PkgName;
    }

    /**
     * Set 包名。使用 JAR 包或者 WAR 包部署的时候必填。
     * @param PkgName 包名。使用 JAR 包或者 WAR 包部署的时候必填。
     */
    public void setPkgName(String PkgName) {
        this.PkgName = PkgName;
    }

    /**
     * Get JDK 版本。
- KONA：使用 kona jdk。
- OPEN：使用 open jdk。 
     * @return JdkVersion JDK 版本。
- KONA：使用 kona jdk。
- OPEN：使用 open jdk。
     */
    public String getJdkVersion() {
        return this.JdkVersion;
    }

    /**
     * Set JDK 版本。
- KONA：使用 kona jdk。
- OPEN：使用 open jdk。
     * @param JdkVersion JDK 版本。
- KONA：使用 kona jdk。
- OPEN：使用 open jdk。
     */
    public void setJdkVersion(String JdkVersion) {
        this.JdkVersion = JdkVersion;
    }

    /**
     * Get 安全组ID s 
     * @return SecurityGroupIds 安全组ID s
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 安全组ID s
     * @param SecurityGroupIds 安全组ID s
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 日志输出配置 
     * @return LogOutputConf 日志输出配置
     */
    public LogOutputConf getLogOutputConf() {
        return this.LogOutputConf;
    }

    /**
     * Set 日志输出配置
     * @param LogOutputConf 日志输出配置
     */
    public void setLogOutputConf(LogOutputConf LogOutputConf) {
        this.LogOutputConf = LogOutputConf;
    }

    /**
     * Get 来源渠道 
     * @return SourceChannel 来源渠道
     */
    public Long getSourceChannel() {
        return this.SourceChannel;
    }

    /**
     * Set 来源渠道
     * @param SourceChannel 来源渠道
     */
    public void setSourceChannel(Long SourceChannel) {
        this.SourceChannel = SourceChannel;
    }

    /**
     * Get 版本描述 
     * @return Description 版本描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 版本描述
     * @param Description 版本描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 镜像命令 
     * @return ImageCommand 镜像命令
     */
    public String getImageCommand() {
        return this.ImageCommand;
    }

    /**
     * Set 镜像命令
     * @param ImageCommand 镜像命令
     */
    public void setImageCommand(String ImageCommand) {
        this.ImageCommand = ImageCommand;
    }

    /**
     * Get 镜像命令参数 
     * @return ImageArgs 镜像命令参数
     */
    public String [] getImageArgs() {
        return this.ImageArgs;
    }

    /**
     * Set 镜像命令参数
     * @param ImageArgs 镜像命令参数
     */
    public void setImageArgs(String [] ImageArgs) {
        this.ImageArgs = ImageArgs;
    }

    /**
     * Get 服务端口映射 
     * @return PortMappings 服务端口映射
     */
    public PortMapping [] getPortMappings() {
        return this.PortMappings;
    }

    /**
     * Set 服务端口映射
     * @param PortMappings 服务端口映射
     */
    public void setPortMappings(PortMapping [] PortMappings) {
        this.PortMappings = PortMappings;
    }

    /**
     * Get 是否添加默认注册中心配置 
     * @return UseRegistryDefaultConfig 是否添加默认注册中心配置
     */
    public Boolean getUseRegistryDefaultConfig() {
        return this.UseRegistryDefaultConfig;
    }

    /**
     * Set 是否添加默认注册中心配置
     * @param UseRegistryDefaultConfig 是否添加默认注册中心配置
     */
    public void setUseRegistryDefaultConfig(Boolean UseRegistryDefaultConfig) {
        this.UseRegistryDefaultConfig = UseRegistryDefaultConfig;
    }

    /**
     * Get 挂载配置信息 
     * @return SettingConfs 挂载配置信息
     */
    public MountedSettingConf [] getSettingConfs() {
        return this.SettingConfs;
    }

    /**
     * Set 挂载配置信息
     * @param SettingConfs 挂载配置信息
     */
    public void setSettingConfs(MountedSettingConf [] SettingConfs) {
        this.SettingConfs = SettingConfs;
    }

    /**
     * Get eks 访问设置 
     * @return EksService eks 访问设置
     */
    public EksService getEksService() {
        return this.EksService;
    }

    /**
     * Set eks 访问设置
     * @param EksService eks 访问设置
     */
    public void setEksService(EksService EksService) {
        this.EksService = EksService;
    }

    /**
     * Get 要回滚到的历史版本id 
     * @return VersionId 要回滚到的历史版本id
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set 要回滚到的历史版本id
     * @param VersionId 要回滚到的历史版本id
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get 启动后执行的脚本 
     * @return PostStart 启动后执行的脚本
     */
    public String getPostStart() {
        return this.PostStart;
    }

    /**
     * Set 启动后执行的脚本
     * @param PostStart 启动后执行的脚本
     */
    public void setPostStart(String PostStart) {
        this.PostStart = PostStart;
    }

    /**
     * Get 停止前执行的脚本 
     * @return PreStop 停止前执行的脚本
     */
    public String getPreStop() {
        return this.PreStop;
    }

    /**
     * Set 停止前执行的脚本
     * @param PreStop 停止前执行的脚本
     */
    public void setPreStop(String PreStop) {
        this.PreStop = PreStop;
    }

    /**
     * Get 分批发布策略配置 
     * @return DeployStrategyConf 分批发布策略配置
     */
    public DeployStrategyConf getDeployStrategyConf() {
        return this.DeployStrategyConf;
    }

    /**
     * Set 分批发布策略配置
     * @param DeployStrategyConf 分批发布策略配置
     */
    public void setDeployStrategyConf(DeployStrategyConf DeployStrategyConf) {
        this.DeployStrategyConf = DeployStrategyConf;
    }

    /**
     * Get 存活探针配置 
     * @return Liveness 存活探针配置
     */
    public HealthCheckConfig getLiveness() {
        return this.Liveness;
    }

    /**
     * Set 存活探针配置
     * @param Liveness 存活探针配置
     */
    public void setLiveness(HealthCheckConfig Liveness) {
        this.Liveness = Liveness;
    }

    /**
     * Get 就绪探针配置 
     * @return Readiness 就绪探针配置
     */
    public HealthCheckConfig getReadiness() {
        return this.Readiness;
    }

    /**
     * Set 就绪探针配置
     * @param Readiness 就绪探针配置
     */
    public void setReadiness(HealthCheckConfig Readiness) {
        this.Readiness = Readiness;
    }

    public DeployServiceV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeployServiceV2Request(DeployServiceV2Request source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ContainerPort != null) {
            this.ContainerPort = new Long(source.ContainerPort);
        }
        if (source.InitPodNum != null) {
            this.InitPodNum = new Long(source.InitPodNum);
        }
        if (source.CpuSpec != null) {
            this.CpuSpec = new Float(source.CpuSpec);
        }
        if (source.MemorySpec != null) {
            this.MemorySpec = new Float(source.MemorySpec);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.ImgRepo != null) {
            this.ImgRepo = new String(source.ImgRepo);
        }
        if (source.VersionDesc != null) {
            this.VersionDesc = new String(source.VersionDesc);
        }
        if (source.JvmOpts != null) {
            this.JvmOpts = new String(source.JvmOpts);
        }
        if (source.EsInfo != null) {
            this.EsInfo = new EsInfo(source.EsInfo);
        }
        if (source.EnvConf != null) {
            this.EnvConf = new Pair[source.EnvConf.length];
            for (int i = 0; i < source.EnvConf.length; i++) {
                this.EnvConf[i] = new Pair(source.EnvConf[i]);
            }
        }
        if (source.LogConfs != null) {
            this.LogConfs = new String[source.LogConfs.length];
            for (int i = 0; i < source.LogConfs.length; i++) {
                this.LogConfs[i] = new String(source.LogConfs[i]);
            }
        }
        if (source.StorageConfs != null) {
            this.StorageConfs = new StorageConf[source.StorageConfs.length];
            for (int i = 0; i < source.StorageConfs.length; i++) {
                this.StorageConfs[i] = new StorageConf(source.StorageConfs[i]);
            }
        }
        if (source.StorageMountConfs != null) {
            this.StorageMountConfs = new StorageMountConf[source.StorageMountConfs.length];
            for (int i = 0; i < source.StorageMountConfs.length; i++) {
                this.StorageMountConfs[i] = new StorageMountConf(source.StorageMountConfs[i]);
            }
        }
        if (source.DeployMode != null) {
            this.DeployMode = new String(source.DeployMode);
        }
        if (source.DeployVersion != null) {
            this.DeployVersion = new String(source.DeployVersion);
        }
        if (source.PkgName != null) {
            this.PkgName = new String(source.PkgName);
        }
        if (source.JdkVersion != null) {
            this.JdkVersion = new String(source.JdkVersion);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
        }
        if (source.LogOutputConf != null) {
            this.LogOutputConf = new LogOutputConf(source.LogOutputConf);
        }
        if (source.SourceChannel != null) {
            this.SourceChannel = new Long(source.SourceChannel);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ImageCommand != null) {
            this.ImageCommand = new String(source.ImageCommand);
        }
        if (source.ImageArgs != null) {
            this.ImageArgs = new String[source.ImageArgs.length];
            for (int i = 0; i < source.ImageArgs.length; i++) {
                this.ImageArgs[i] = new String(source.ImageArgs[i]);
            }
        }
        if (source.PortMappings != null) {
            this.PortMappings = new PortMapping[source.PortMappings.length];
            for (int i = 0; i < source.PortMappings.length; i++) {
                this.PortMappings[i] = new PortMapping(source.PortMappings[i]);
            }
        }
        if (source.UseRegistryDefaultConfig != null) {
            this.UseRegistryDefaultConfig = new Boolean(source.UseRegistryDefaultConfig);
        }
        if (source.SettingConfs != null) {
            this.SettingConfs = new MountedSettingConf[source.SettingConfs.length];
            for (int i = 0; i < source.SettingConfs.length; i++) {
                this.SettingConfs[i] = new MountedSettingConf(source.SettingConfs[i]);
            }
        }
        if (source.EksService != null) {
            this.EksService = new EksService(source.EksService);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.PostStart != null) {
            this.PostStart = new String(source.PostStart);
        }
        if (source.PreStop != null) {
            this.PreStop = new String(source.PreStop);
        }
        if (source.DeployStrategyConf != null) {
            this.DeployStrategyConf = new DeployStrategyConf(source.DeployStrategyConf);
        }
        if (source.Liveness != null) {
            this.Liveness = new HealthCheckConfig(source.Liveness);
        }
        if (source.Readiness != null) {
            this.Readiness = new HealthCheckConfig(source.Readiness);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ContainerPort", this.ContainerPort);
        this.setParamSimple(map, prefix + "InitPodNum", this.InitPodNum);
        this.setParamSimple(map, prefix + "CpuSpec", this.CpuSpec);
        this.setParamSimple(map, prefix + "MemorySpec", this.MemorySpec);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "ImgRepo", this.ImgRepo);
        this.setParamSimple(map, prefix + "VersionDesc", this.VersionDesc);
        this.setParamSimple(map, prefix + "JvmOpts", this.JvmOpts);
        this.setParamObj(map, prefix + "EsInfo.", this.EsInfo);
        this.setParamArrayObj(map, prefix + "EnvConf.", this.EnvConf);
        this.setParamArraySimple(map, prefix + "LogConfs.", this.LogConfs);
        this.setParamArrayObj(map, prefix + "StorageConfs.", this.StorageConfs);
        this.setParamArrayObj(map, prefix + "StorageMountConfs.", this.StorageMountConfs);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "DeployVersion", this.DeployVersion);
        this.setParamSimple(map, prefix + "PkgName", this.PkgName);
        this.setParamSimple(map, prefix + "JdkVersion", this.JdkVersion);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamObj(map, prefix + "LogOutputConf.", this.LogOutputConf);
        this.setParamSimple(map, prefix + "SourceChannel", this.SourceChannel);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ImageCommand", this.ImageCommand);
        this.setParamArraySimple(map, prefix + "ImageArgs.", this.ImageArgs);
        this.setParamArrayObj(map, prefix + "PortMappings.", this.PortMappings);
        this.setParamSimple(map, prefix + "UseRegistryDefaultConfig", this.UseRegistryDefaultConfig);
        this.setParamArrayObj(map, prefix + "SettingConfs.", this.SettingConfs);
        this.setParamObj(map, prefix + "EksService.", this.EksService);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "PostStart", this.PostStart);
        this.setParamSimple(map, prefix + "PreStop", this.PreStop);
        this.setParamObj(map, prefix + "DeployStrategyConf.", this.DeployStrategyConf);
        this.setParamObj(map, prefix + "Liveness.", this.Liveness);
        this.setParamObj(map, prefix + "Readiness.", this.Readiness);

    }
}

