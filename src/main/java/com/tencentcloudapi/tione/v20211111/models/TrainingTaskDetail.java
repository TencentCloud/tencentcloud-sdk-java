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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrainingTaskDetail extends AbstractModel {

    /**
    * <p>训练任务ID</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>训练任务名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>主账号uin</p>
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * <p>子账号uin</p>
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
    * <p>创建者名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubUinName")
    @Expose
    private String SubUinName;

    /**
    * <p>地域</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>训练框架名称，eg：SPARK、PYSARK、TENSORFLOW、PYTORCH</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrameworkName")
    @Expose
    private String FrameworkName;

    /**
    * <p>训练框架版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrameworkVersion")
    @Expose
    private String FrameworkVersion;

    /**
    * <p>框架运行环境</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrameworkEnvironment")
    @Expose
    private String FrameworkEnvironment;

    /**
    * <p>计费模式</p>
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * <p>预付费专用资源组</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * <p>资源配置</p>
    */
    @SerializedName("ResourceConfigInfos")
    @Expose
    private ResourceConfigInfo [] ResourceConfigInfos;

    /**
    * <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>训练模式，eg：PS_WORKER、DDP、MPI、HOROVOD</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrainingMode")
    @Expose
    private String TrainingMode;

    /**
    * <p>代码包</p>
    */
    @SerializedName("CodePackagePath")
    @Expose
    private CosPathInfo CodePackagePath;

    /**
    * <p>启动命令信息</p>
    */
    @SerializedName("StartCmdInfo")
    @Expose
    private StartCmdInfo StartCmdInfo;

    /**
    * <p>数据来源，eg：DATASET、COS</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSource")
    @Expose
    private String DataSource;

    /**
    * <p>数据配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataConfigs")
    @Expose
    private DataConfig [] DataConfigs;

    /**
    * <p>调优参数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TuningParameters")
    @Expose
    private String TuningParameters;

    /**
    * <p>训练输出</p>
    */
    @SerializedName("Output")
    @Expose
    private CosPathInfo Output;

    /**
    * <p>是否上报日志</p>
    */
    @SerializedName("LogEnable")
    @Expose
    private Boolean LogEnable;

    /**
    * <p>日志配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogConfig")
    @Expose
    private LogConfig LogConfig;

    /**
    * <p>VPC ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>子网ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>自定义镜像信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageInfo")
    @Expose
    private ImageInfo ImageInfo;

    /**
    * <p>运行时长</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuntimeInSeconds")
    @Expose
    private Long RuntimeInSeconds;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>训练开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>计费状态，eg：BILLING计费中，ARREARS_STOP欠费停止，NOT_BILLING不在计费中</p>
    */
    @SerializedName("ChargeStatus")
    @Expose
    private String ChargeStatus;

    /**
    * <p>最近一次实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestInstanceId")
    @Expose
    private String LatestInstanceId;

    /**
    * <p>TensorBoard ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TensorBoardId")
    @Expose
    private String TensorBoardId;

    /**
    * <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailureReason")
    @Expose
    private String FailureReason;

    /**
    * <p>更新时间</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>训练结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>计费金额信息，eg：2.00元/小时 (按量计费)</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillingInfo")
    @Expose
    private String BillingInfo;

    /**
    * <p>预付费专用资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * <p>任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>任务状态，eg：STARTING启动中、RUNNING运行中、STOPPING停止中、STOPPED已停止、FAILED异常、SUCCEED已完成</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>回调地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * <p>任务关联的代码仓库配置</p>
    */
    @SerializedName("CodeRepos")
    @Expose
    private CodeRepoConfig [] CodeRepos;

    /**
    * <p>暴露网络配置</p>
    */
    @SerializedName("ExposeNetworkConfig")
    @Expose
    private ExposeNetworkConfig ExposeNetworkConfig;

    /**
    * <p>操作者信息</p>
    */
    @SerializedName("OperatorInfo")
    @Expose
    private OperatorInfo OperatorInfo;

    /**
     * Get <p>训练任务ID</p> 
     * @return Id <p>训练任务ID</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>训练任务ID</p>
     * @param Id <p>训练任务ID</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>训练任务名称</p> 
     * @return Name <p>训练任务名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>训练任务名称</p>
     * @param Name <p>训练任务名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>主账号uin</p> 
     * @return Uin <p>主账号uin</p>
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set <p>主账号uin</p>
     * @param Uin <p>主账号uin</p>
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get <p>子账号uin</p> 
     * @return SubUin <p>子账号uin</p>
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set <p>子账号uin</p>
     * @param SubUin <p>子账号uin</p>
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get <p>创建者名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubUinName <p>创建者名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubUinName() {
        return this.SubUinName;
    }

    /**
     * Set <p>创建者名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubUinName <p>创建者名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubUinName(String SubUinName) {
        this.SubUinName = SubUinName;
    }

    /**
     * Get <p>地域</p> 
     * @return Region <p>地域</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域</p>
     * @param Region <p>地域</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>训练框架名称，eg：SPARK、PYSARK、TENSORFLOW、PYTORCH</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrameworkName <p>训练框架名称，eg：SPARK、PYSARK、TENSORFLOW、PYTORCH</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrameworkName() {
        return this.FrameworkName;
    }

    /**
     * Set <p>训练框架名称，eg：SPARK、PYSARK、TENSORFLOW、PYTORCH</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrameworkName <p>训练框架名称，eg：SPARK、PYSARK、TENSORFLOW、PYTORCH</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrameworkName(String FrameworkName) {
        this.FrameworkName = FrameworkName;
    }

    /**
     * Get <p>训练框架版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrameworkVersion <p>训练框架版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrameworkVersion() {
        return this.FrameworkVersion;
    }

    /**
     * Set <p>训练框架版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrameworkVersion <p>训练框架版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrameworkVersion(String FrameworkVersion) {
        this.FrameworkVersion = FrameworkVersion;
    }

    /**
     * Get <p>框架运行环境</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrameworkEnvironment <p>框架运行环境</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrameworkEnvironment() {
        return this.FrameworkEnvironment;
    }

    /**
     * Set <p>框架运行环境</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrameworkEnvironment <p>框架运行环境</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrameworkEnvironment(String FrameworkEnvironment) {
        this.FrameworkEnvironment = FrameworkEnvironment;
    }

    /**
     * Get <p>计费模式</p> 
     * @return ChargeType <p>计费模式</p>
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set <p>计费模式</p>
     * @param ChargeType <p>计费模式</p>
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get <p>预付费专用资源组</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupId <p>预付费专用资源组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set <p>预付费专用资源组</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupId <p>预付费专用资源组</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get <p>资源配置</p> 
     * @return ResourceConfigInfos <p>资源配置</p>
     */
    public ResourceConfigInfo [] getResourceConfigInfos() {
        return this.ResourceConfigInfos;
    }

    /**
     * Set <p>资源配置</p>
     * @param ResourceConfigInfos <p>资源配置</p>
     */
    public void setResourceConfigInfos(ResourceConfigInfo [] ResourceConfigInfos) {
        this.ResourceConfigInfos = ResourceConfigInfos;
    }

    /**
     * Get <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>标签</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>训练模式，eg：PS_WORKER、DDP、MPI、HOROVOD</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrainingMode <p>训练模式，eg：PS_WORKER、DDP、MPI、HOROVOD</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrainingMode() {
        return this.TrainingMode;
    }

    /**
     * Set <p>训练模式，eg：PS_WORKER、DDP、MPI、HOROVOD</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrainingMode <p>训练模式，eg：PS_WORKER、DDP、MPI、HOROVOD</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrainingMode(String TrainingMode) {
        this.TrainingMode = TrainingMode;
    }

    /**
     * Get <p>代码包</p> 
     * @return CodePackagePath <p>代码包</p>
     */
    public CosPathInfo getCodePackagePath() {
        return this.CodePackagePath;
    }

    /**
     * Set <p>代码包</p>
     * @param CodePackagePath <p>代码包</p>
     */
    public void setCodePackagePath(CosPathInfo CodePackagePath) {
        this.CodePackagePath = CodePackagePath;
    }

    /**
     * Get <p>启动命令信息</p> 
     * @return StartCmdInfo <p>启动命令信息</p>
     */
    public StartCmdInfo getStartCmdInfo() {
        return this.StartCmdInfo;
    }

    /**
     * Set <p>启动命令信息</p>
     * @param StartCmdInfo <p>启动命令信息</p>
     */
    public void setStartCmdInfo(StartCmdInfo StartCmdInfo) {
        this.StartCmdInfo = StartCmdInfo;
    }

    /**
     * Get <p>数据来源，eg：DATASET、COS</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSource <p>数据来源，eg：DATASET、COS</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSource() {
        return this.DataSource;
    }

    /**
     * Set <p>数据来源，eg：DATASET、COS</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSource <p>数据来源，eg：DATASET、COS</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSource(String DataSource) {
        this.DataSource = DataSource;
    }

    /**
     * Get <p>数据配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataConfigs <p>数据配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataConfig [] getDataConfigs() {
        return this.DataConfigs;
    }

    /**
     * Set <p>数据配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataConfigs <p>数据配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataConfigs(DataConfig [] DataConfigs) {
        this.DataConfigs = DataConfigs;
    }

    /**
     * Get <p>调优参数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TuningParameters <p>调优参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTuningParameters() {
        return this.TuningParameters;
    }

    /**
     * Set <p>调优参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TuningParameters <p>调优参数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTuningParameters(String TuningParameters) {
        this.TuningParameters = TuningParameters;
    }

    /**
     * Get <p>训练输出</p> 
     * @return Output <p>训练输出</p>
     */
    public CosPathInfo getOutput() {
        return this.Output;
    }

    /**
     * Set <p>训练输出</p>
     * @param Output <p>训练输出</p>
     */
    public void setOutput(CosPathInfo Output) {
        this.Output = Output;
    }

    /**
     * Get <p>是否上报日志</p> 
     * @return LogEnable <p>是否上报日志</p>
     */
    public Boolean getLogEnable() {
        return this.LogEnable;
    }

    /**
     * Set <p>是否上报日志</p>
     * @param LogEnable <p>是否上报日志</p>
     */
    public void setLogEnable(Boolean LogEnable) {
        this.LogEnable = LogEnable;
    }

    /**
     * Get <p>日志配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogConfig <p>日志配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LogConfig getLogConfig() {
        return this.LogConfig;
    }

    /**
     * Set <p>日志配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogConfig <p>日志配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogConfig(LogConfig LogConfig) {
        this.LogConfig = LogConfig;
    }

    /**
     * Get <p>VPC ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId <p>VPC ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId <p>VPC ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>子网ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId <p>子网ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>子网ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId <p>子网ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>自定义镜像信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageInfo <p>自定义镜像信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageInfo getImageInfo() {
        return this.ImageInfo;
    }

    /**
     * Set <p>自定义镜像信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageInfo <p>自定义镜像信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageInfo(ImageInfo ImageInfo) {
        this.ImageInfo = ImageInfo;
    }

    /**
     * Get <p>运行时长</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuntimeInSeconds <p>运行时长</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuntimeInSeconds() {
        return this.RuntimeInSeconds;
    }

    /**
     * Set <p>运行时长</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuntimeInSeconds <p>运行时长</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuntimeInSeconds(Long RuntimeInSeconds) {
        this.RuntimeInSeconds = RuntimeInSeconds;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>训练开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime <p>训练开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>训练开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime <p>训练开始时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>计费状态，eg：BILLING计费中，ARREARS_STOP欠费停止，NOT_BILLING不在计费中</p> 
     * @return ChargeStatus <p>计费状态，eg：BILLING计费中，ARREARS_STOP欠费停止，NOT_BILLING不在计费中</p>
     */
    public String getChargeStatus() {
        return this.ChargeStatus;
    }

    /**
     * Set <p>计费状态，eg：BILLING计费中，ARREARS_STOP欠费停止，NOT_BILLING不在计费中</p>
     * @param ChargeStatus <p>计费状态，eg：BILLING计费中，ARREARS_STOP欠费停止，NOT_BILLING不在计费中</p>
     */
    public void setChargeStatus(String ChargeStatus) {
        this.ChargeStatus = ChargeStatus;
    }

    /**
     * Get <p>最近一次实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestInstanceId <p>最近一次实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestInstanceId() {
        return this.LatestInstanceId;
    }

    /**
     * Set <p>最近一次实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestInstanceId <p>最近一次实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestInstanceId(String LatestInstanceId) {
        this.LatestInstanceId = LatestInstanceId;
    }

    /**
     * Get <p>TensorBoard ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TensorBoardId <p>TensorBoard ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTensorBoardId() {
        return this.TensorBoardId;
    }

    /**
     * Set <p>TensorBoard ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TensorBoardId <p>TensorBoard ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTensorBoardId(String TensorBoardId) {
        this.TensorBoardId = TensorBoardId;
    }

    /**
     * Get <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailureReason <p>失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailureReason() {
        return this.FailureReason;
    }

    /**
     * Set <p>失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailureReason <p>失败原因</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailureReason(String FailureReason) {
        this.FailureReason = FailureReason;
    }

    /**
     * Get <p>更新时间</p> 
     * @return UpdateTime <p>更新时间</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间</p>
     * @param UpdateTime <p>更新时间</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>训练结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime <p>训练结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>训练结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime <p>训练结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>计费金额信息，eg：2.00元/小时 (按量计费)</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillingInfo <p>计费金额信息，eg：2.00元/小时 (按量计费)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBillingInfo() {
        return this.BillingInfo;
    }

    /**
     * Set <p>计费金额信息，eg：2.00元/小时 (按量计费)</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillingInfo <p>计费金额信息，eg：2.00元/小时 (按量计费)</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillingInfo(String BillingInfo) {
        this.BillingInfo = BillingInfo;
    }

    /**
     * Get <p>预付费专用资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupName <p>预付费专用资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set <p>预付费专用资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupName <p>预付费专用资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get <p>任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message <p>任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set <p>任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message <p>任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get <p>任务状态，eg：STARTING启动中、RUNNING运行中、STOPPING停止中、STOPPED已停止、FAILED异常、SUCCEED已完成</p> 
     * @return Status <p>任务状态，eg：STARTING启动中、RUNNING运行中、STOPPING停止中、STOPPED已停止、FAILED异常、SUCCEED已完成</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态，eg：STARTING启动中、RUNNING运行中、STOPPING停止中、STOPPED已停止、FAILED异常、SUCCEED已完成</p>
     * @param Status <p>任务状态，eg：STARTING启动中、RUNNING运行中、STOPPING停止中、STOPPED已停止、FAILED异常、SUCCEED已完成</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>回调地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CallbackUrl <p>回调地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCallbackUrl() {
        return this.CallbackUrl;
    }

    /**
     * Set <p>回调地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CallbackUrl <p>回调地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCallbackUrl(String CallbackUrl) {
        this.CallbackUrl = CallbackUrl;
    }

    /**
     * Get <p>任务关联的代码仓库配置</p> 
     * @return CodeRepos <p>任务关联的代码仓库配置</p>
     */
    public CodeRepoConfig [] getCodeRepos() {
        return this.CodeRepos;
    }

    /**
     * Set <p>任务关联的代码仓库配置</p>
     * @param CodeRepos <p>任务关联的代码仓库配置</p>
     */
    public void setCodeRepos(CodeRepoConfig [] CodeRepos) {
        this.CodeRepos = CodeRepos;
    }

    /**
     * Get <p>暴露网络配置</p> 
     * @return ExposeNetworkConfig <p>暴露网络配置</p>
     */
    public ExposeNetworkConfig getExposeNetworkConfig() {
        return this.ExposeNetworkConfig;
    }

    /**
     * Set <p>暴露网络配置</p>
     * @param ExposeNetworkConfig <p>暴露网络配置</p>
     */
    public void setExposeNetworkConfig(ExposeNetworkConfig ExposeNetworkConfig) {
        this.ExposeNetworkConfig = ExposeNetworkConfig;
    }

    /**
     * Get <p>操作者信息</p> 
     * @return OperatorInfo <p>操作者信息</p>
     */
    public OperatorInfo getOperatorInfo() {
        return this.OperatorInfo;
    }

    /**
     * Set <p>操作者信息</p>
     * @param OperatorInfo <p>操作者信息</p>
     */
    public void setOperatorInfo(OperatorInfo OperatorInfo) {
        this.OperatorInfo = OperatorInfo;
    }

    public TrainingTaskDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrainingTaskDetail(TrainingTaskDetail source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.SubUin != null) {
            this.SubUin = new String(source.SubUin);
        }
        if (source.SubUinName != null) {
            this.SubUinName = new String(source.SubUinName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.FrameworkName != null) {
            this.FrameworkName = new String(source.FrameworkName);
        }
        if (source.FrameworkVersion != null) {
            this.FrameworkVersion = new String(source.FrameworkVersion);
        }
        if (source.FrameworkEnvironment != null) {
            this.FrameworkEnvironment = new String(source.FrameworkEnvironment);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.ResourceConfigInfos != null) {
            this.ResourceConfigInfos = new ResourceConfigInfo[source.ResourceConfigInfos.length];
            for (int i = 0; i < source.ResourceConfigInfos.length; i++) {
                this.ResourceConfigInfos[i] = new ResourceConfigInfo(source.ResourceConfigInfos[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.TrainingMode != null) {
            this.TrainingMode = new String(source.TrainingMode);
        }
        if (source.CodePackagePath != null) {
            this.CodePackagePath = new CosPathInfo(source.CodePackagePath);
        }
        if (source.StartCmdInfo != null) {
            this.StartCmdInfo = new StartCmdInfo(source.StartCmdInfo);
        }
        if (source.DataSource != null) {
            this.DataSource = new String(source.DataSource);
        }
        if (source.DataConfigs != null) {
            this.DataConfigs = new DataConfig[source.DataConfigs.length];
            for (int i = 0; i < source.DataConfigs.length; i++) {
                this.DataConfigs[i] = new DataConfig(source.DataConfigs[i]);
            }
        }
        if (source.TuningParameters != null) {
            this.TuningParameters = new String(source.TuningParameters);
        }
        if (source.Output != null) {
            this.Output = new CosPathInfo(source.Output);
        }
        if (source.LogEnable != null) {
            this.LogEnable = new Boolean(source.LogEnable);
        }
        if (source.LogConfig != null) {
            this.LogConfig = new LogConfig(source.LogConfig);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ImageInfo != null) {
            this.ImageInfo = new ImageInfo(source.ImageInfo);
        }
        if (source.RuntimeInSeconds != null) {
            this.RuntimeInSeconds = new Long(source.RuntimeInSeconds);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.ChargeStatus != null) {
            this.ChargeStatus = new String(source.ChargeStatus);
        }
        if (source.LatestInstanceId != null) {
            this.LatestInstanceId = new String(source.LatestInstanceId);
        }
        if (source.TensorBoardId != null) {
            this.TensorBoardId = new String(source.TensorBoardId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.FailureReason != null) {
            this.FailureReason = new String(source.FailureReason);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.BillingInfo != null) {
            this.BillingInfo = new String(source.BillingInfo);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.CodeRepos != null) {
            this.CodeRepos = new CodeRepoConfig[source.CodeRepos.length];
            for (int i = 0; i < source.CodeRepos.length; i++) {
                this.CodeRepos[i] = new CodeRepoConfig(source.CodeRepos[i]);
            }
        }
        if (source.ExposeNetworkConfig != null) {
            this.ExposeNetworkConfig = new ExposeNetworkConfig(source.ExposeNetworkConfig);
        }
        if (source.OperatorInfo != null) {
            this.OperatorInfo = new OperatorInfo(source.OperatorInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "SubUinName", this.SubUinName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "FrameworkName", this.FrameworkName);
        this.setParamSimple(map, prefix + "FrameworkVersion", this.FrameworkVersion);
        this.setParamSimple(map, prefix + "FrameworkEnvironment", this.FrameworkEnvironment);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamArrayObj(map, prefix + "ResourceConfigInfos.", this.ResourceConfigInfos);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "TrainingMode", this.TrainingMode);
        this.setParamObj(map, prefix + "CodePackagePath.", this.CodePackagePath);
        this.setParamObj(map, prefix + "StartCmdInfo.", this.StartCmdInfo);
        this.setParamSimple(map, prefix + "DataSource", this.DataSource);
        this.setParamArrayObj(map, prefix + "DataConfigs.", this.DataConfigs);
        this.setParamSimple(map, prefix + "TuningParameters", this.TuningParameters);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "LogEnable", this.LogEnable);
        this.setParamObj(map, prefix + "LogConfig.", this.LogConfig);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamObj(map, prefix + "ImageInfo.", this.ImageInfo);
        this.setParamSimple(map, prefix + "RuntimeInSeconds", this.RuntimeInSeconds);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ChargeStatus", this.ChargeStatus);
        this.setParamSimple(map, prefix + "LatestInstanceId", this.LatestInstanceId);
        this.setParamSimple(map, prefix + "TensorBoardId", this.TensorBoardId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "FailureReason", this.FailureReason);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "BillingInfo", this.BillingInfo);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamArrayObj(map, prefix + "CodeRepos.", this.CodeRepos);
        this.setParamObj(map, prefix + "ExposeNetworkConfig.", this.ExposeNetworkConfig);
        this.setParamObj(map, prefix + "OperatorInfo.", this.OperatorInfo);

    }
}

