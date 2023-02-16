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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemServiceVersionInfo extends AbstractModel{

    /**
    * 主键
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * 服务id
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 部署方式
    */
    @SerializedName("DeployMode")
    @Expose
    private String DeployMode;

    /**
    * jdk版本
    */
    @SerializedName("JdkVersion")
    @Expose
    private String JdkVersion;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 部署版本
    */
    @SerializedName("DeployVersion")
    @Expose
    private String DeployVersion;

    /**
    * 发布方式
    */
    @SerializedName("PublishMode")
    @Expose
    private String PublishMode;

    /**
    * 启动参数
    */
    @SerializedName("JvmOpts")
    @Expose
    private String JvmOpts;

    /**
    * 初始实例
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
    * 镜像路径
    */
    @SerializedName("ImgRepo")
    @Expose
    private String ImgRepo;

    /**
    * 镜像名称
    */
    @SerializedName("ImgName")
    @Expose
    private String ImgName;

    /**
    * 镜像版本
    */
    @SerializedName("ImgVersion")
    @Expose
    private String ImgVersion;

    /**
    * 弹性配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EsInfo")
    @Expose
    private EsInfo EsInfo;

    /**
    * 环境配置
    */
    @SerializedName("EnvConf")
    @Expose
    private Pair [] EnvConf;

    /**
    * 存储配置
    */
    @SerializedName("StorageConfs")
    @Expose
    private StorageConf [] StorageConfs;

    /**
    * 运行状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 私有网络
    */
    @SerializedName("Vpc")
    @Expose
    private String Vpc;

    /**
    * 子网网络
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 创建时间
    */
    @SerializedName("CreateDate")
    @Expose
    private String CreateDate;

    /**
    * 修改时间
    */
    @SerializedName("ModifyDate")
    @Expose
    private String ModifyDate;

    /**
    * 挂载配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageMountConfs")
    @Expose
    private StorageMountConf [] StorageMountConfs;

    /**
    * 版本名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * 日志输出配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogOutputConf")
    @Expose
    private LogOutputConf LogOutputConf;

    /**
    * 服务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * 服务描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationDescription")
    @Expose
    private String ApplicationDescription;

    /**
    * 环境名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvironmentName")
    @Expose
    private String EnvironmentName;

    /**
    * 环境ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnvironmentId")
    @Expose
    private String EnvironmentId;

    /**
    * 公网地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicDomain")
    @Expose
    private String PublicDomain;

    /**
    * 是否开通公网访问
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnablePublicAccess")
    @Expose
    private Boolean EnablePublicAccess;

    /**
    * 现有的实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrentInstances")
    @Expose
    private Long CurrentInstances;

    /**
    * 期望的实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpectedInstances")
    @Expose
    private Long ExpectedInstances;

    /**
    * 编程语言
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodingLanguage")
    @Expose
    private String CodingLanguage;

    /**
    * 程序包名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PkgName")
    @Expose
    private String PkgName;

    /**
    * 是否启用弹性伸缩
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EsEnable")
    @Expose
    private Long EsEnable;

    /**
    * 弹性策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EsStrategy")
    @Expose
    private Long EsStrategy;

    /**
    * 镜像tag
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageTag")
    @Expose
    private String ImageTag;

    /**
    * 是否启用log
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogEnable")
    @Expose
    private Long LogEnable;

    /**
    * 最小实例数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MinAliveInstances")
    @Expose
    private String MinAliveInstances;

    /**
    * 安全组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 镜像命令
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageCommand")
    @Expose
    private String ImageCommand;

    /**
    * 镜像命令参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageArgs")
    @Expose
    private String [] ImageArgs;

    /**
    * 是否使用默认注册中心配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UseRegistryDefaultConfig")
    @Expose
    private Boolean UseRegistryDefaultConfig;

    /**
    * eks 访问设置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Service")
    @Expose
    private EksService Service;

    /**
    * 挂载配置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SettingConfs")
    @Expose
    private MountedSettingConf [] SettingConfs;

    /**
    * log path数组信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogConfs")
    @Expose
    private String [] LogConfs;

    /**
    * 启动后立即执行的脚本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostStart")
    @Expose
    private String PostStart;

    /**
    * 停止前执行的脚本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PreStop")
    @Expose
    private String PreStop;

    /**
    * 存活探针配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Liveness")
    @Expose
    private HealthCheckConfig Liveness;

    /**
    * 就绪探针配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Readiness")
    @Expose
    private HealthCheckConfig Readiness;

    /**
    * 弹性策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HorizontalAutoscaler")
    @Expose
    private HorizontalAutoscaler [] HorizontalAutoscaler;

    /**
    * 定时弹性策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CronHorizontalAutoscaler")
    @Expose
    private CronHorizontalAutoscaler [] CronHorizontalAutoscaler;

    /**
    * 应用实际可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zones")
    @Expose
    private String [] Zones;

    /**
    * 最新部署时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastDeployDate")
    @Expose
    private String LastDeployDate;

    /**
    * 最新部署成功时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastDeploySuccessDate")
    @Expose
    private String LastDeploySuccessDate;

    /**
    * 应用所在node信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeInfos")
    @Expose
    private NodeInfo [] NodeInfos;

    /**
    * image类型 -0 为demo -1为正常image
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageType")
    @Expose
    private Long ImageType;

    /**
    * 是否启用调用链组件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableTracing")
    @Expose
    private Long EnableTracing;

    /**
    * 是否开启调用链上报，只有 EnableTracing=1 时生效（参数已弃用）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableTracingReport")
    @Expose
    private Long EnableTracingReport;

    /**
    * 镜像类型：0-个人镜像、1-企业镜像、2-公有镜像
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepoType")
    @Expose
    private Long RepoType;

    /**
    * 分批发布子状态：batch_updating、batch_updating_waiting_confirm
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BatchDeployStatus")
    @Expose
    private String BatchDeployStatus;

    /**
    * APM 资源 ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApmInstanceId")
    @Expose
    private String ApmInstanceId;

    /**
    * 工作负载信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkloadInfo")
    @Expose
    private WorkloadInfo WorkloadInfo;

    /**
    * 是否启用应用加速
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpeedUp")
    @Expose
    private Boolean SpeedUp;

    /**
    * 启动检测探针配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartupProbe")
    @Expose
    private HealthCheckConfig StartupProbe;

    /**
    * 操作系统版本，可选参数：
- ALPINE
- CENTOS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OsFlavour")
    @Expose
    private String OsFlavour;

    /**
    * 镜像仓库server
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RepoServer")
    @Expose
    private String RepoServer;

    /**
    * 是否正在发布中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnderDeploying")
    @Expose
    private Boolean UnderDeploying;

    /**
    * 监控业务指标监控
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnablePrometheusConf")
    @Expose
    private EnablePrometheusConf EnablePrometheusConf;

    /**
    * 是否为手动停止
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StoppedManually")
    @Expose
    private Boolean StoppedManually;

    /**
    * tcr实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TcrInstanceId")
    @Expose
    private String TcrInstanceId;

    /**
    * 1：开始自动metrics采集（open-telemetry）；
0：关闭metrics采集；
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableMetrics")
    @Expose
    private Long EnableMetrics;

    /**
    * 用户AppId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 用户SubAccountUin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubAccountUin")
    @Expose
    private String SubAccountUin;

    /**
    * 用户Uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 应用分组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 是否启用注册中心
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnableRegistry")
    @Expose
    private Long EnableRegistry;

    /**
    * 弹性伸缩数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoscalerList")
    @Expose
    private Autoscaler [] AutoscalerList;

    /**
    * 修改人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Modifier")
    @Expose
    private String Modifier;

    /**
    * 创建人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 部署策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeployStrategyConf")
    @Expose
    private DeployStrategyConf DeployStrategyConf;

    /**
    * 实例列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodList")
    @Expose
    private DescribeRunPodPage PodList;

    /**
    * 发布时配置是否有修改
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfEdited")
    @Expose
    private Boolean ConfEdited;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 是否编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PreStopEncoded")
    @Expose
    private String PreStopEncoded;

    /**
    * 是否编码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PostStartEncoded")
    @Expose
    private String PostStartEncoded;

    /**
     * Get 主键 
     * @return VersionId 主键
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set 主键
     * @param VersionId 主键
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get 服务id 
     * @return ApplicationId 服务id
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 服务id
     * @param ApplicationId 服务id
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 部署方式 
     * @return DeployMode 部署方式
     */
    public String getDeployMode() {
        return this.DeployMode;
    }

    /**
     * Set 部署方式
     * @param DeployMode 部署方式
     */
    public void setDeployMode(String DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * Get jdk版本 
     * @return JdkVersion jdk版本
     */
    public String getJdkVersion() {
        return this.JdkVersion;
    }

    /**
     * Set jdk版本
     * @param JdkVersion jdk版本
     */
    public void setJdkVersion(String JdkVersion) {
        this.JdkVersion = JdkVersion;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 部署版本 
     * @return DeployVersion 部署版本
     */
    public String getDeployVersion() {
        return this.DeployVersion;
    }

    /**
     * Set 部署版本
     * @param DeployVersion 部署版本
     */
    public void setDeployVersion(String DeployVersion) {
        this.DeployVersion = DeployVersion;
    }

    /**
     * Get 发布方式 
     * @return PublishMode 发布方式
     */
    public String getPublishMode() {
        return this.PublishMode;
    }

    /**
     * Set 发布方式
     * @param PublishMode 发布方式
     */
    public void setPublishMode(String PublishMode) {
        this.PublishMode = PublishMode;
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
     * Get 初始实例 
     * @return InitPodNum 初始实例
     */
    public Long getInitPodNum() {
        return this.InitPodNum;
    }

    /**
     * Set 初始实例
     * @param InitPodNum 初始实例
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
     * Get 镜像路径 
     * @return ImgRepo 镜像路径
     */
    public String getImgRepo() {
        return this.ImgRepo;
    }

    /**
     * Set 镜像路径
     * @param ImgRepo 镜像路径
     */
    public void setImgRepo(String ImgRepo) {
        this.ImgRepo = ImgRepo;
    }

    /**
     * Get 镜像名称 
     * @return ImgName 镜像名称
     */
    public String getImgName() {
        return this.ImgName;
    }

    /**
     * Set 镜像名称
     * @param ImgName 镜像名称
     */
    public void setImgName(String ImgName) {
        this.ImgName = ImgName;
    }

    /**
     * Get 镜像版本 
     * @return ImgVersion 镜像版本
     */
    public String getImgVersion() {
        return this.ImgVersion;
    }

    /**
     * Set 镜像版本
     * @param ImgVersion 镜像版本
     */
    public void setImgVersion(String ImgVersion) {
        this.ImgVersion = ImgVersion;
    }

    /**
     * Get 弹性配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EsInfo 弹性配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EsInfo getEsInfo() {
        return this.EsInfo;
    }

    /**
     * Set 弹性配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param EsInfo 弹性配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEsInfo(EsInfo EsInfo) {
        this.EsInfo = EsInfo;
    }

    /**
     * Get 环境配置 
     * @return EnvConf 环境配置
     */
    public Pair [] getEnvConf() {
        return this.EnvConf;
    }

    /**
     * Set 环境配置
     * @param EnvConf 环境配置
     */
    public void setEnvConf(Pair [] EnvConf) {
        this.EnvConf = EnvConf;
    }

    /**
     * Get 存储配置 
     * @return StorageConfs 存储配置
     */
    public StorageConf [] getStorageConfs() {
        return this.StorageConfs;
    }

    /**
     * Set 存储配置
     * @param StorageConfs 存储配置
     */
    public void setStorageConfs(StorageConf [] StorageConfs) {
        this.StorageConfs = StorageConfs;
    }

    /**
     * Get 运行状态 
     * @return Status 运行状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 运行状态
     * @param Status 运行状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 私有网络 
     * @return Vpc 私有网络
     */
    public String getVpc() {
        return this.Vpc;
    }

    /**
     * Set 私有网络
     * @param Vpc 私有网络
     */
    public void setVpc(String Vpc) {
        this.Vpc = Vpc;
    }

    /**
     * Get 子网网络 
     * @return SubnetId 子网网络
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网网络
     * @param SubnetId 子网网络
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 创建时间 
     * @return CreateDate 创建时间
     */
    public String getCreateDate() {
        return this.CreateDate;
    }

    /**
     * Set 创建时间
     * @param CreateDate 创建时间
     */
    public void setCreateDate(String CreateDate) {
        this.CreateDate = CreateDate;
    }

    /**
     * Get 修改时间 
     * @return ModifyDate 修改时间
     */
    public String getModifyDate() {
        return this.ModifyDate;
    }

    /**
     * Set 修改时间
     * @param ModifyDate 修改时间
     */
    public void setModifyDate(String ModifyDate) {
        this.ModifyDate = ModifyDate;
    }

    /**
     * Get 挂载配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageMountConfs 挂载配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StorageMountConf [] getStorageMountConfs() {
        return this.StorageMountConfs;
    }

    /**
     * Set 挂载配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageMountConfs 挂载配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageMountConfs(StorageMountConf [] StorageMountConfs) {
        this.StorageMountConfs = StorageMountConfs;
    }

    /**
     * Get 版本名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionName 版本名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set 版本名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionName 版本名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get 日志输出配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogOutputConf 日志输出配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LogOutputConf getLogOutputConf() {
        return this.LogOutputConf;
    }

    /**
     * Set 日志输出配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogOutputConf 日志输出配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogOutputConf(LogOutputConf LogOutputConf) {
        this.LogOutputConf = LogOutputConf;
    }

    /**
     * Get 服务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationName 服务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 服务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationName 服务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get 服务描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationDescription 服务描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationDescription() {
        return this.ApplicationDescription;
    }

    /**
     * Set 服务描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationDescription 服务描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationDescription(String ApplicationDescription) {
        this.ApplicationDescription = ApplicationDescription;
    }

    /**
     * Get 环境名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvironmentName 环境名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnvironmentName() {
        return this.EnvironmentName;
    }

    /**
     * Set 环境名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvironmentName 环境名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvironmentName(String EnvironmentName) {
        this.EnvironmentName = EnvironmentName;
    }

    /**
     * Get 环境ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnvironmentId 环境ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnvironmentId() {
        return this.EnvironmentId;
    }

    /**
     * Set 环境ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnvironmentId 环境ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnvironmentId(String EnvironmentId) {
        this.EnvironmentId = EnvironmentId;
    }

    /**
     * Get 公网地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicDomain 公网地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicDomain() {
        return this.PublicDomain;
    }

    /**
     * Set 公网地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicDomain 公网地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicDomain(String PublicDomain) {
        this.PublicDomain = PublicDomain;
    }

    /**
     * Get 是否开通公网访问
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnablePublicAccess 是否开通公网访问
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getEnablePublicAccess() {
        return this.EnablePublicAccess;
    }

    /**
     * Set 是否开通公网访问
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnablePublicAccess 是否开通公网访问
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnablePublicAccess(Boolean EnablePublicAccess) {
        this.EnablePublicAccess = EnablePublicAccess;
    }

    /**
     * Get 现有的实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrentInstances 现有的实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCurrentInstances() {
        return this.CurrentInstances;
    }

    /**
     * Set 现有的实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrentInstances 现有的实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrentInstances(Long CurrentInstances) {
        this.CurrentInstances = CurrentInstances;
    }

    /**
     * Get 期望的实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpectedInstances 期望的实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExpectedInstances() {
        return this.ExpectedInstances;
    }

    /**
     * Set 期望的实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpectedInstances 期望的实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpectedInstances(Long ExpectedInstances) {
        this.ExpectedInstances = ExpectedInstances;
    }

    /**
     * Get 编程语言
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodingLanguage 编程语言
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodingLanguage() {
        return this.CodingLanguage;
    }

    /**
     * Set 编程语言
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodingLanguage 编程语言
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodingLanguage(String CodingLanguage) {
        this.CodingLanguage = CodingLanguage;
    }

    /**
     * Get 程序包名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PkgName 程序包名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPkgName() {
        return this.PkgName;
    }

    /**
     * Set 程序包名
注意：此字段可能返回 null，表示取不到有效值。
     * @param PkgName 程序包名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPkgName(String PkgName) {
        this.PkgName = PkgName;
    }

    /**
     * Get 是否启用弹性伸缩
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EsEnable 是否启用弹性伸缩
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEsEnable() {
        return this.EsEnable;
    }

    /**
     * Set 是否启用弹性伸缩
注意：此字段可能返回 null，表示取不到有效值。
     * @param EsEnable 是否启用弹性伸缩
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEsEnable(Long EsEnable) {
        this.EsEnable = EsEnable;
    }

    /**
     * Get 弹性策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EsStrategy 弹性策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEsStrategy() {
        return this.EsStrategy;
    }

    /**
     * Set 弹性策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param EsStrategy 弹性策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEsStrategy(Long EsStrategy) {
        this.EsStrategy = EsStrategy;
    }

    /**
     * Get 镜像tag
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageTag 镜像tag
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageTag() {
        return this.ImageTag;
    }

    /**
     * Set 镜像tag
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageTag 镜像tag
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageTag(String ImageTag) {
        this.ImageTag = ImageTag;
    }

    /**
     * Get 是否启用log
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogEnable 是否启用log
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLogEnable() {
        return this.LogEnable;
    }

    /**
     * Set 是否启用log
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogEnable 是否启用log
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogEnable(Long LogEnable) {
        this.LogEnable = LogEnable;
    }

    /**
     * Get 最小实例数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MinAliveInstances 最小实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMinAliveInstances() {
        return this.MinAliveInstances;
    }

    /**
     * Set 最小实例数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MinAliveInstances 最小实例数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMinAliveInstances(String MinAliveInstances) {
        this.MinAliveInstances = MinAliveInstances;
    }

    /**
     * Get 安全组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecurityGroupIds 安全组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * Set 安全组
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecurityGroupIds 安全组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * Get 镜像命令
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageCommand 镜像命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageCommand() {
        return this.ImageCommand;
    }

    /**
     * Set 镜像命令
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageCommand 镜像命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageCommand(String ImageCommand) {
        this.ImageCommand = ImageCommand;
    }

    /**
     * Get 镜像命令参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageArgs 镜像命令参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getImageArgs() {
        return this.ImageArgs;
    }

    /**
     * Set 镜像命令参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageArgs 镜像命令参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageArgs(String [] ImageArgs) {
        this.ImageArgs = ImageArgs;
    }

    /**
     * Get 是否使用默认注册中心配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UseRegistryDefaultConfig 是否使用默认注册中心配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getUseRegistryDefaultConfig() {
        return this.UseRegistryDefaultConfig;
    }

    /**
     * Set 是否使用默认注册中心配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param UseRegistryDefaultConfig 是否使用默认注册中心配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUseRegistryDefaultConfig(Boolean UseRegistryDefaultConfig) {
        this.UseRegistryDefaultConfig = UseRegistryDefaultConfig;
    }

    /**
     * Get eks 访问设置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Service eks 访问设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EksService getService() {
        return this.Service;
    }

    /**
     * Set eks 访问设置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Service eks 访问设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setService(EksService Service) {
        this.Service = Service;
    }

    /**
     * Get 挂载配置信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SettingConfs 挂载配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MountedSettingConf [] getSettingConfs() {
        return this.SettingConfs;
    }

    /**
     * Set 挂载配置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SettingConfs 挂载配置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSettingConfs(MountedSettingConf [] SettingConfs) {
        this.SettingConfs = SettingConfs;
    }

    /**
     * Get log path数组信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogConfs log path数组信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getLogConfs() {
        return this.LogConfs;
    }

    /**
     * Set log path数组信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogConfs log path数组信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogConfs(String [] LogConfs) {
        this.LogConfs = LogConfs;
    }

    /**
     * Get 启动后立即执行的脚本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostStart 启动后立即执行的脚本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPostStart() {
        return this.PostStart;
    }

    /**
     * Set 启动后立即执行的脚本
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostStart 启动后立即执行的脚本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostStart(String PostStart) {
        this.PostStart = PostStart;
    }

    /**
     * Get 停止前执行的脚本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PreStop 停止前执行的脚本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPreStop() {
        return this.PreStop;
    }

    /**
     * Set 停止前执行的脚本
注意：此字段可能返回 null，表示取不到有效值。
     * @param PreStop 停止前执行的脚本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPreStop(String PreStop) {
        this.PreStop = PreStop;
    }

    /**
     * Get 存活探针配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Liveness 存活探针配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HealthCheckConfig getLiveness() {
        return this.Liveness;
    }

    /**
     * Set 存活探针配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Liveness 存活探针配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLiveness(HealthCheckConfig Liveness) {
        this.Liveness = Liveness;
    }

    /**
     * Get 就绪探针配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Readiness 就绪探针配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HealthCheckConfig getReadiness() {
        return this.Readiness;
    }

    /**
     * Set 就绪探针配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Readiness 就绪探针配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReadiness(HealthCheckConfig Readiness) {
        this.Readiness = Readiness;
    }

    /**
     * Get 弹性策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HorizontalAutoscaler 弹性策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HorizontalAutoscaler [] getHorizontalAutoscaler() {
        return this.HorizontalAutoscaler;
    }

    /**
     * Set 弹性策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param HorizontalAutoscaler 弹性策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHorizontalAutoscaler(HorizontalAutoscaler [] HorizontalAutoscaler) {
        this.HorizontalAutoscaler = HorizontalAutoscaler;
    }

    /**
     * Get 定时弹性策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CronHorizontalAutoscaler 定时弹性策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CronHorizontalAutoscaler [] getCronHorizontalAutoscaler() {
        return this.CronHorizontalAutoscaler;
    }

    /**
     * Set 定时弹性策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param CronHorizontalAutoscaler 定时弹性策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCronHorizontalAutoscaler(CronHorizontalAutoscaler [] CronHorizontalAutoscaler) {
        this.CronHorizontalAutoscaler = CronHorizontalAutoscaler;
    }

    /**
     * Get 应用实际可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zones 应用实际可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getZones() {
        return this.Zones;
    }

    /**
     * Set 应用实际可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zones 应用实际可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZones(String [] Zones) {
        this.Zones = Zones;
    }

    /**
     * Get 最新部署时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastDeployDate 最新部署时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastDeployDate() {
        return this.LastDeployDate;
    }

    /**
     * Set 最新部署时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastDeployDate 最新部署时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastDeployDate(String LastDeployDate) {
        this.LastDeployDate = LastDeployDate;
    }

    /**
     * Get 最新部署成功时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastDeploySuccessDate 最新部署成功时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastDeploySuccessDate() {
        return this.LastDeploySuccessDate;
    }

    /**
     * Set 最新部署成功时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastDeploySuccessDate 最新部署成功时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastDeploySuccessDate(String LastDeploySuccessDate) {
        this.LastDeploySuccessDate = LastDeploySuccessDate;
    }

    /**
     * Get 应用所在node信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeInfos 应用所在node信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeInfo [] getNodeInfos() {
        return this.NodeInfos;
    }

    /**
     * Set 应用所在node信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeInfos 应用所在node信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeInfos(NodeInfo [] NodeInfos) {
        this.NodeInfos = NodeInfos;
    }

    /**
     * Get image类型 -0 为demo -1为正常image
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageType image类型 -0 为demo -1为正常image
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getImageType() {
        return this.ImageType;
    }

    /**
     * Set image类型 -0 为demo -1为正常image
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageType image类型 -0 为demo -1为正常image
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageType(Long ImageType) {
        this.ImageType = ImageType;
    }

    /**
     * Get 是否启用调用链组件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableTracing 是否启用调用链组件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnableTracing() {
        return this.EnableTracing;
    }

    /**
     * Set 是否启用调用链组件
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableTracing 是否启用调用链组件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableTracing(Long EnableTracing) {
        this.EnableTracing = EnableTracing;
    }

    /**
     * Get 是否开启调用链上报，只有 EnableTracing=1 时生效（参数已弃用）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableTracingReport 是否开启调用链上报，只有 EnableTracing=1 时生效（参数已弃用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnableTracingReport() {
        return this.EnableTracingReport;
    }

    /**
     * Set 是否开启调用链上报，只有 EnableTracing=1 时生效（参数已弃用）
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableTracingReport 是否开启调用链上报，只有 EnableTracing=1 时生效（参数已弃用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableTracingReport(Long EnableTracingReport) {
        this.EnableTracingReport = EnableTracingReport;
    }

    /**
     * Get 镜像类型：0-个人镜像、1-企业镜像、2-公有镜像
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepoType 镜像类型：0-个人镜像、1-企业镜像、2-公有镜像
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRepoType() {
        return this.RepoType;
    }

    /**
     * Set 镜像类型：0-个人镜像、1-企业镜像、2-公有镜像
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepoType 镜像类型：0-个人镜像、1-企业镜像、2-公有镜像
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepoType(Long RepoType) {
        this.RepoType = RepoType;
    }

    /**
     * Get 分批发布子状态：batch_updating、batch_updating_waiting_confirm
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BatchDeployStatus 分批发布子状态：batch_updating、batch_updating_waiting_confirm
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBatchDeployStatus() {
        return this.BatchDeployStatus;
    }

    /**
     * Set 分批发布子状态：batch_updating、batch_updating_waiting_confirm
注意：此字段可能返回 null，表示取不到有效值。
     * @param BatchDeployStatus 分批发布子状态：batch_updating、batch_updating_waiting_confirm
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBatchDeployStatus(String BatchDeployStatus) {
        this.BatchDeployStatus = BatchDeployStatus;
    }

    /**
     * Get APM 资源 ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApmInstanceId APM 资源 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApmInstanceId() {
        return this.ApmInstanceId;
    }

    /**
     * Set APM 资源 ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApmInstanceId APM 资源 ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApmInstanceId(String ApmInstanceId) {
        this.ApmInstanceId = ApmInstanceId;
    }

    /**
     * Get 工作负载信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkloadInfo 工作负载信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkloadInfo getWorkloadInfo() {
        return this.WorkloadInfo;
    }

    /**
     * Set 工作负载信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkloadInfo 工作负载信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkloadInfo(WorkloadInfo WorkloadInfo) {
        this.WorkloadInfo = WorkloadInfo;
    }

    /**
     * Get 是否启用应用加速
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpeedUp 是否启用应用加速
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSpeedUp() {
        return this.SpeedUp;
    }

    /**
     * Set 是否启用应用加速
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpeedUp 是否启用应用加速
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpeedUp(Boolean SpeedUp) {
        this.SpeedUp = SpeedUp;
    }

    /**
     * Get 启动检测探针配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartupProbe 启动检测探针配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HealthCheckConfig getStartupProbe() {
        return this.StartupProbe;
    }

    /**
     * Set 启动检测探针配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartupProbe 启动检测探针配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartupProbe(HealthCheckConfig StartupProbe) {
        this.StartupProbe = StartupProbe;
    }

    /**
     * Get 操作系统版本，可选参数：
- ALPINE
- CENTOS
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OsFlavour 操作系统版本，可选参数：
- ALPINE
- CENTOS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOsFlavour() {
        return this.OsFlavour;
    }

    /**
     * Set 操作系统版本，可选参数：
- ALPINE
- CENTOS
注意：此字段可能返回 null，表示取不到有效值。
     * @param OsFlavour 操作系统版本，可选参数：
- ALPINE
- CENTOS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOsFlavour(String OsFlavour) {
        this.OsFlavour = OsFlavour;
    }

    /**
     * Get 镜像仓库server
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RepoServer 镜像仓库server
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepoServer() {
        return this.RepoServer;
    }

    /**
     * Set 镜像仓库server
注意：此字段可能返回 null，表示取不到有效值。
     * @param RepoServer 镜像仓库server
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepoServer(String RepoServer) {
        this.RepoServer = RepoServer;
    }

    /**
     * Get 是否正在发布中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnderDeploying 是否正在发布中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getUnderDeploying() {
        return this.UnderDeploying;
    }

    /**
     * Set 是否正在发布中
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnderDeploying 是否正在发布中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnderDeploying(Boolean UnderDeploying) {
        this.UnderDeploying = UnderDeploying;
    }

    /**
     * Get 监控业务指标监控
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnablePrometheusConf 监控业务指标监控
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EnablePrometheusConf getEnablePrometheusConf() {
        return this.EnablePrometheusConf;
    }

    /**
     * Set 监控业务指标监控
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnablePrometheusConf 监控业务指标监控
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnablePrometheusConf(EnablePrometheusConf EnablePrometheusConf) {
        this.EnablePrometheusConf = EnablePrometheusConf;
    }

    /**
     * Get 是否为手动停止
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StoppedManually 是否为手动停止
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getStoppedManually() {
        return this.StoppedManually;
    }

    /**
     * Set 是否为手动停止
注意：此字段可能返回 null，表示取不到有效值。
     * @param StoppedManually 是否为手动停止
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStoppedManually(Boolean StoppedManually) {
        this.StoppedManually = StoppedManually;
    }

    /**
     * Get tcr实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TcrInstanceId tcr实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTcrInstanceId() {
        return this.TcrInstanceId;
    }

    /**
     * Set tcr实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TcrInstanceId tcr实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTcrInstanceId(String TcrInstanceId) {
        this.TcrInstanceId = TcrInstanceId;
    }

    /**
     * Get 1：开始自动metrics采集（open-telemetry）；
0：关闭metrics采集；
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableMetrics 1：开始自动metrics采集（open-telemetry）；
0：关闭metrics采集；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnableMetrics() {
        return this.EnableMetrics;
    }

    /**
     * Set 1：开始自动metrics采集（open-telemetry）；
0：关闭metrics采集；
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableMetrics 1：开始自动metrics采集（open-telemetry）；
0：关闭metrics采集；
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableMetrics(Long EnableMetrics) {
        this.EnableMetrics = EnableMetrics;
    }

    /**
     * Get 用户AppId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 用户AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户AppId
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 用户AppId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 用户SubAccountUin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubAccountUin 用户SubAccountUin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubAccountUin() {
        return this.SubAccountUin;
    }

    /**
     * Set 用户SubAccountUin
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubAccountUin 用户SubAccountUin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubAccountUin(String SubAccountUin) {
        this.SubAccountUin = SubAccountUin;
    }

    /**
     * Get 用户Uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 用户Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 用户Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 用户Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 应用分组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GroupId 应用分组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 应用分组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 应用分组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 是否启用注册中心
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnableRegistry 是否启用注册中心
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEnableRegistry() {
        return this.EnableRegistry;
    }

    /**
     * Set 是否启用注册中心
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnableRegistry 是否启用注册中心
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnableRegistry(Long EnableRegistry) {
        this.EnableRegistry = EnableRegistry;
    }

    /**
     * Get 弹性伸缩数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoscalerList 弹性伸缩数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Autoscaler [] getAutoscalerList() {
        return this.AutoscalerList;
    }

    /**
     * Set 弹性伸缩数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoscalerList 弹性伸缩数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoscalerList(Autoscaler [] AutoscalerList) {
        this.AutoscalerList = AutoscalerList;
    }

    /**
     * Get 修改人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Modifier 修改人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModifier() {
        return this.Modifier;
    }

    /**
     * Set 修改人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Modifier 修改人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModifier(String Modifier) {
        this.Modifier = Modifier;
    }

    /**
     * Get 创建人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creator 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creator 创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 部署策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeployStrategyConf 部署策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeployStrategyConf getDeployStrategyConf() {
        return this.DeployStrategyConf;
    }

    /**
     * Set 部署策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeployStrategyConf 部署策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeployStrategyConf(DeployStrategyConf DeployStrategyConf) {
        this.DeployStrategyConf = DeployStrategyConf;
    }

    /**
     * Get 实例列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodList 实例列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DescribeRunPodPage getPodList() {
        return this.PodList;
    }

    /**
     * Set 实例列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodList 实例列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodList(DescribeRunPodPage PodList) {
        this.PodList = PodList;
    }

    /**
     * Get 发布时配置是否有修改
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfEdited 发布时配置是否有修改
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getConfEdited() {
        return this.ConfEdited;
    }

    /**
     * Set 发布时配置是否有修改
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfEdited 发布时配置是否有修改
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfEdited(Boolean ConfEdited) {
        this.ConfEdited = ConfEdited;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 是否编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PreStopEncoded 是否编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPreStopEncoded() {
        return this.PreStopEncoded;
    }

    /**
     * Set 是否编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param PreStopEncoded 是否编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPreStopEncoded(String PreStopEncoded) {
        this.PreStopEncoded = PreStopEncoded;
    }

    /**
     * Get 是否编码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PostStartEncoded 是否编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPostStartEncoded() {
        return this.PostStartEncoded;
    }

    /**
     * Set 是否编码
注意：此字段可能返回 null，表示取不到有效值。
     * @param PostStartEncoded 是否编码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPostStartEncoded(String PostStartEncoded) {
        this.PostStartEncoded = PostStartEncoded;
    }

    public TemServiceVersionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemServiceVersionInfo(TemServiceVersionInfo source) {
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.DeployMode != null) {
            this.DeployMode = new String(source.DeployMode);
        }
        if (source.JdkVersion != null) {
            this.JdkVersion = new String(source.JdkVersion);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.DeployVersion != null) {
            this.DeployVersion = new String(source.DeployVersion);
        }
        if (source.PublishMode != null) {
            this.PublishMode = new String(source.PublishMode);
        }
        if (source.JvmOpts != null) {
            this.JvmOpts = new String(source.JvmOpts);
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
        if (source.ImgRepo != null) {
            this.ImgRepo = new String(source.ImgRepo);
        }
        if (source.ImgName != null) {
            this.ImgName = new String(source.ImgName);
        }
        if (source.ImgVersion != null) {
            this.ImgVersion = new String(source.ImgVersion);
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
        if (source.StorageConfs != null) {
            this.StorageConfs = new StorageConf[source.StorageConfs.length];
            for (int i = 0; i < source.StorageConfs.length; i++) {
                this.StorageConfs[i] = new StorageConf(source.StorageConfs[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Vpc != null) {
            this.Vpc = new String(source.Vpc);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.CreateDate != null) {
            this.CreateDate = new String(source.CreateDate);
        }
        if (source.ModifyDate != null) {
            this.ModifyDate = new String(source.ModifyDate);
        }
        if (source.StorageMountConfs != null) {
            this.StorageMountConfs = new StorageMountConf[source.StorageMountConfs.length];
            for (int i = 0; i < source.StorageMountConfs.length; i++) {
                this.StorageMountConfs[i] = new StorageMountConf(source.StorageMountConfs[i]);
            }
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.LogOutputConf != null) {
            this.LogOutputConf = new LogOutputConf(source.LogOutputConf);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.ApplicationDescription != null) {
            this.ApplicationDescription = new String(source.ApplicationDescription);
        }
        if (source.EnvironmentName != null) {
            this.EnvironmentName = new String(source.EnvironmentName);
        }
        if (source.EnvironmentId != null) {
            this.EnvironmentId = new String(source.EnvironmentId);
        }
        if (source.PublicDomain != null) {
            this.PublicDomain = new String(source.PublicDomain);
        }
        if (source.EnablePublicAccess != null) {
            this.EnablePublicAccess = new Boolean(source.EnablePublicAccess);
        }
        if (source.CurrentInstances != null) {
            this.CurrentInstances = new Long(source.CurrentInstances);
        }
        if (source.ExpectedInstances != null) {
            this.ExpectedInstances = new Long(source.ExpectedInstances);
        }
        if (source.CodingLanguage != null) {
            this.CodingLanguage = new String(source.CodingLanguage);
        }
        if (source.PkgName != null) {
            this.PkgName = new String(source.PkgName);
        }
        if (source.EsEnable != null) {
            this.EsEnable = new Long(source.EsEnable);
        }
        if (source.EsStrategy != null) {
            this.EsStrategy = new Long(source.EsStrategy);
        }
        if (source.ImageTag != null) {
            this.ImageTag = new String(source.ImageTag);
        }
        if (source.LogEnable != null) {
            this.LogEnable = new Long(source.LogEnable);
        }
        if (source.MinAliveInstances != null) {
            this.MinAliveInstances = new String(source.MinAliveInstances);
        }
        if (source.SecurityGroupIds != null) {
            this.SecurityGroupIds = new String[source.SecurityGroupIds.length];
            for (int i = 0; i < source.SecurityGroupIds.length; i++) {
                this.SecurityGroupIds[i] = new String(source.SecurityGroupIds[i]);
            }
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
        if (source.UseRegistryDefaultConfig != null) {
            this.UseRegistryDefaultConfig = new Boolean(source.UseRegistryDefaultConfig);
        }
        if (source.Service != null) {
            this.Service = new EksService(source.Service);
        }
        if (source.SettingConfs != null) {
            this.SettingConfs = new MountedSettingConf[source.SettingConfs.length];
            for (int i = 0; i < source.SettingConfs.length; i++) {
                this.SettingConfs[i] = new MountedSettingConf(source.SettingConfs[i]);
            }
        }
        if (source.LogConfs != null) {
            this.LogConfs = new String[source.LogConfs.length];
            for (int i = 0; i < source.LogConfs.length; i++) {
                this.LogConfs[i] = new String(source.LogConfs[i]);
            }
        }
        if (source.PostStart != null) {
            this.PostStart = new String(source.PostStart);
        }
        if (source.PreStop != null) {
            this.PreStop = new String(source.PreStop);
        }
        if (source.Liveness != null) {
            this.Liveness = new HealthCheckConfig(source.Liveness);
        }
        if (source.Readiness != null) {
            this.Readiness = new HealthCheckConfig(source.Readiness);
        }
        if (source.HorizontalAutoscaler != null) {
            this.HorizontalAutoscaler = new HorizontalAutoscaler[source.HorizontalAutoscaler.length];
            for (int i = 0; i < source.HorizontalAutoscaler.length; i++) {
                this.HorizontalAutoscaler[i] = new HorizontalAutoscaler(source.HorizontalAutoscaler[i]);
            }
        }
        if (source.CronHorizontalAutoscaler != null) {
            this.CronHorizontalAutoscaler = new CronHorizontalAutoscaler[source.CronHorizontalAutoscaler.length];
            for (int i = 0; i < source.CronHorizontalAutoscaler.length; i++) {
                this.CronHorizontalAutoscaler[i] = new CronHorizontalAutoscaler(source.CronHorizontalAutoscaler[i]);
            }
        }
        if (source.Zones != null) {
            this.Zones = new String[source.Zones.length];
            for (int i = 0; i < source.Zones.length; i++) {
                this.Zones[i] = new String(source.Zones[i]);
            }
        }
        if (source.LastDeployDate != null) {
            this.LastDeployDate = new String(source.LastDeployDate);
        }
        if (source.LastDeploySuccessDate != null) {
            this.LastDeploySuccessDate = new String(source.LastDeploySuccessDate);
        }
        if (source.NodeInfos != null) {
            this.NodeInfos = new NodeInfo[source.NodeInfos.length];
            for (int i = 0; i < source.NodeInfos.length; i++) {
                this.NodeInfos[i] = new NodeInfo(source.NodeInfos[i]);
            }
        }
        if (source.ImageType != null) {
            this.ImageType = new Long(source.ImageType);
        }
        if (source.EnableTracing != null) {
            this.EnableTracing = new Long(source.EnableTracing);
        }
        if (source.EnableTracingReport != null) {
            this.EnableTracingReport = new Long(source.EnableTracingReport);
        }
        if (source.RepoType != null) {
            this.RepoType = new Long(source.RepoType);
        }
        if (source.BatchDeployStatus != null) {
            this.BatchDeployStatus = new String(source.BatchDeployStatus);
        }
        if (source.ApmInstanceId != null) {
            this.ApmInstanceId = new String(source.ApmInstanceId);
        }
        if (source.WorkloadInfo != null) {
            this.WorkloadInfo = new WorkloadInfo(source.WorkloadInfo);
        }
        if (source.SpeedUp != null) {
            this.SpeedUp = new Boolean(source.SpeedUp);
        }
        if (source.StartupProbe != null) {
            this.StartupProbe = new HealthCheckConfig(source.StartupProbe);
        }
        if (source.OsFlavour != null) {
            this.OsFlavour = new String(source.OsFlavour);
        }
        if (source.RepoServer != null) {
            this.RepoServer = new String(source.RepoServer);
        }
        if (source.UnderDeploying != null) {
            this.UnderDeploying = new Boolean(source.UnderDeploying);
        }
        if (source.EnablePrometheusConf != null) {
            this.EnablePrometheusConf = new EnablePrometheusConf(source.EnablePrometheusConf);
        }
        if (source.StoppedManually != null) {
            this.StoppedManually = new Boolean(source.StoppedManually);
        }
        if (source.TcrInstanceId != null) {
            this.TcrInstanceId = new String(source.TcrInstanceId);
        }
        if (source.EnableMetrics != null) {
            this.EnableMetrics = new Long(source.EnableMetrics);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.SubAccountUin != null) {
            this.SubAccountUin = new String(source.SubAccountUin);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.EnableRegistry != null) {
            this.EnableRegistry = new Long(source.EnableRegistry);
        }
        if (source.AutoscalerList != null) {
            this.AutoscalerList = new Autoscaler[source.AutoscalerList.length];
            for (int i = 0; i < source.AutoscalerList.length; i++) {
                this.AutoscalerList[i] = new Autoscaler(source.AutoscalerList[i]);
            }
        }
        if (source.Modifier != null) {
            this.Modifier = new String(source.Modifier);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.DeployStrategyConf != null) {
            this.DeployStrategyConf = new DeployStrategyConf(source.DeployStrategyConf);
        }
        if (source.PodList != null) {
            this.PodList = new DescribeRunPodPage(source.PodList);
        }
        if (source.ConfEdited != null) {
            this.ConfEdited = new Boolean(source.ConfEdited);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.PreStopEncoded != null) {
            this.PreStopEncoded = new String(source.PreStopEncoded);
        }
        if (source.PostStartEncoded != null) {
            this.PostStartEncoded = new String(source.PostStartEncoded);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "DeployMode", this.DeployMode);
        this.setParamSimple(map, prefix + "JdkVersion", this.JdkVersion);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "DeployVersion", this.DeployVersion);
        this.setParamSimple(map, prefix + "PublishMode", this.PublishMode);
        this.setParamSimple(map, prefix + "JvmOpts", this.JvmOpts);
        this.setParamSimple(map, prefix + "InitPodNum", this.InitPodNum);
        this.setParamSimple(map, prefix + "CpuSpec", this.CpuSpec);
        this.setParamSimple(map, prefix + "MemorySpec", this.MemorySpec);
        this.setParamSimple(map, prefix + "ImgRepo", this.ImgRepo);
        this.setParamSimple(map, prefix + "ImgName", this.ImgName);
        this.setParamSimple(map, prefix + "ImgVersion", this.ImgVersion);
        this.setParamObj(map, prefix + "EsInfo.", this.EsInfo);
        this.setParamArrayObj(map, prefix + "EnvConf.", this.EnvConf);
        this.setParamArrayObj(map, prefix + "StorageConfs.", this.StorageConfs);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Vpc", this.Vpc);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "CreateDate", this.CreateDate);
        this.setParamSimple(map, prefix + "ModifyDate", this.ModifyDate);
        this.setParamArrayObj(map, prefix + "StorageMountConfs.", this.StorageMountConfs);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamObj(map, prefix + "LogOutputConf.", this.LogOutputConf);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "ApplicationDescription", this.ApplicationDescription);
        this.setParamSimple(map, prefix + "EnvironmentName", this.EnvironmentName);
        this.setParamSimple(map, prefix + "EnvironmentId", this.EnvironmentId);
        this.setParamSimple(map, prefix + "PublicDomain", this.PublicDomain);
        this.setParamSimple(map, prefix + "EnablePublicAccess", this.EnablePublicAccess);
        this.setParamSimple(map, prefix + "CurrentInstances", this.CurrentInstances);
        this.setParamSimple(map, prefix + "ExpectedInstances", this.ExpectedInstances);
        this.setParamSimple(map, prefix + "CodingLanguage", this.CodingLanguage);
        this.setParamSimple(map, prefix + "PkgName", this.PkgName);
        this.setParamSimple(map, prefix + "EsEnable", this.EsEnable);
        this.setParamSimple(map, prefix + "EsStrategy", this.EsStrategy);
        this.setParamSimple(map, prefix + "ImageTag", this.ImageTag);
        this.setParamSimple(map, prefix + "LogEnable", this.LogEnable);
        this.setParamSimple(map, prefix + "MinAliveInstances", this.MinAliveInstances);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamSimple(map, prefix + "ImageCommand", this.ImageCommand);
        this.setParamArraySimple(map, prefix + "ImageArgs.", this.ImageArgs);
        this.setParamSimple(map, prefix + "UseRegistryDefaultConfig", this.UseRegistryDefaultConfig);
        this.setParamObj(map, prefix + "Service.", this.Service);
        this.setParamArrayObj(map, prefix + "SettingConfs.", this.SettingConfs);
        this.setParamArraySimple(map, prefix + "LogConfs.", this.LogConfs);
        this.setParamSimple(map, prefix + "PostStart", this.PostStart);
        this.setParamSimple(map, prefix + "PreStop", this.PreStop);
        this.setParamObj(map, prefix + "Liveness.", this.Liveness);
        this.setParamObj(map, prefix + "Readiness.", this.Readiness);
        this.setParamArrayObj(map, prefix + "HorizontalAutoscaler.", this.HorizontalAutoscaler);
        this.setParamArrayObj(map, prefix + "CronHorizontalAutoscaler.", this.CronHorizontalAutoscaler);
        this.setParamArraySimple(map, prefix + "Zones.", this.Zones);
        this.setParamSimple(map, prefix + "LastDeployDate", this.LastDeployDate);
        this.setParamSimple(map, prefix + "LastDeploySuccessDate", this.LastDeploySuccessDate);
        this.setParamArrayObj(map, prefix + "NodeInfos.", this.NodeInfos);
        this.setParamSimple(map, prefix + "ImageType", this.ImageType);
        this.setParamSimple(map, prefix + "EnableTracing", this.EnableTracing);
        this.setParamSimple(map, prefix + "EnableTracingReport", this.EnableTracingReport);
        this.setParamSimple(map, prefix + "RepoType", this.RepoType);
        this.setParamSimple(map, prefix + "BatchDeployStatus", this.BatchDeployStatus);
        this.setParamSimple(map, prefix + "ApmInstanceId", this.ApmInstanceId);
        this.setParamObj(map, prefix + "WorkloadInfo.", this.WorkloadInfo);
        this.setParamSimple(map, prefix + "SpeedUp", this.SpeedUp);
        this.setParamObj(map, prefix + "StartupProbe.", this.StartupProbe);
        this.setParamSimple(map, prefix + "OsFlavour", this.OsFlavour);
        this.setParamSimple(map, prefix + "RepoServer", this.RepoServer);
        this.setParamSimple(map, prefix + "UnderDeploying", this.UnderDeploying);
        this.setParamObj(map, prefix + "EnablePrometheusConf.", this.EnablePrometheusConf);
        this.setParamSimple(map, prefix + "StoppedManually", this.StoppedManually);
        this.setParamSimple(map, prefix + "TcrInstanceId", this.TcrInstanceId);
        this.setParamSimple(map, prefix + "EnableMetrics", this.EnableMetrics);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "SubAccountUin", this.SubAccountUin);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "EnableRegistry", this.EnableRegistry);
        this.setParamArrayObj(map, prefix + "AutoscalerList.", this.AutoscalerList);
        this.setParamSimple(map, prefix + "Modifier", this.Modifier);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamObj(map, prefix + "DeployStrategyConf.", this.DeployStrategyConf);
        this.setParamObj(map, prefix + "PodList.", this.PodList);
        this.setParamSimple(map, prefix + "ConfEdited", this.ConfEdited);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "PreStopEncoded", this.PreStopEncoded);
        this.setParamSimple(map, prefix + "PostStartEncoded", this.PostStartEncoded);

    }
}

