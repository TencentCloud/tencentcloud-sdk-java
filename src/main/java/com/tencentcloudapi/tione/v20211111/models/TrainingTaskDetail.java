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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrainingTaskDetail extends AbstractModel{

    /**
    * 训练任务ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 训练任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 主账号uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 子账号uin
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 训练框架名称，eg：SPARK、TENSORFLOW、PYTORCH、LIGHT
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrameworkName")
    @Expose
    private String FrameworkName;

    /**
    * 训练框架版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrameworkVersion")
    @Expose
    private String FrameworkVersion;

    /**
    * 训练模式，eg：PS_WORKER、DDP、MPI、HOROVOD
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrainingMode")
    @Expose
    private String TrainingMode;

    /**
    * 计费模式
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 预付费专用资源组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * 资源配置
    */
    @SerializedName("ResourceConfigInfos")
    @Expose
    private ResourceConfigInfo [] ResourceConfigInfos;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 自定义镜像信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageInfo")
    @Expose
    private ImageInfo ImageInfo;

    /**
    * 代码包
    */
    @SerializedName("CodePackagePath")
    @Expose
    private CosPathInfo CodePackagePath;

    /**
    * 启动命令信息
    */
    @SerializedName("StartCmdInfo")
    @Expose
    private StartCmdInfo StartCmdInfo;

    /**
    * 数据来源，eg：DATASET、COS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSource")
    @Expose
    private String DataSource;

    /**
    * 数据配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataConfigs")
    @Expose
    private DataConfig [] DataConfigs;

    /**
    * 调优参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TuningParameters")
    @Expose
    private String TuningParameters;

    /**
    * 训练输出
    */
    @SerializedName("Output")
    @Expose
    private CosPathInfo Output;

    /**
    * 是否上报日志
    */
    @SerializedName("LogEnable")
    @Expose
    private Boolean LogEnable;

    /**
    * 日志配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogConfig")
    @Expose
    private LogConfig LogConfig;

    /**
    * VPC ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 任务状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 运行时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuntimeInSeconds")
    @Expose
    private Long RuntimeInSeconds;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 训练开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 计费状态，eg：BILLING计费中，ARREARS_STOP欠费停止，NOT_BILLING不在计费中
    */
    @SerializedName("ChargeStatus")
    @Expose
    private String ChargeStatus;

    /**
    * 最近一次实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestInstanceId")
    @Expose
    private String LatestInstanceId;

    /**
    * TensorBoard ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TensorBoardId")
    @Expose
    private String TensorBoardId;

    /**
    * 备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailureReason")
    @Expose
    private String FailureReason;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 训练结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 计费金额信息，eg：2.00元/小时 (for后付费)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillingInfo")
    @Expose
    private String BillingInfo;

    /**
    * 预付费专用资源组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
     * Get 训练任务ID 
     * @return Id 训练任务ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 训练任务ID
     * @param Id 训练任务ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 训练任务名称 
     * @return Name 训练任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 训练任务名称
     * @param Name 训练任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 主账号uin 
     * @return Uin 主账号uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 主账号uin
     * @param Uin 主账号uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 子账号uin 
     * @return SubUin 子账号uin
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set 子账号uin
     * @param SubUin 子账号uin
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 训练框架名称，eg：SPARK、TENSORFLOW、PYTORCH、LIGHT
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrameworkName 训练框架名称，eg：SPARK、TENSORFLOW、PYTORCH、LIGHT
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrameworkName() {
        return this.FrameworkName;
    }

    /**
     * Set 训练框架名称，eg：SPARK、TENSORFLOW、PYTORCH、LIGHT
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrameworkName 训练框架名称，eg：SPARK、TENSORFLOW、PYTORCH、LIGHT
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrameworkName(String FrameworkName) {
        this.FrameworkName = FrameworkName;
    }

    /**
     * Get 训练框架版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrameworkVersion 训练框架版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrameworkVersion() {
        return this.FrameworkVersion;
    }

    /**
     * Set 训练框架版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrameworkVersion 训练框架版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrameworkVersion(String FrameworkVersion) {
        this.FrameworkVersion = FrameworkVersion;
    }

    /**
     * Get 训练模式，eg：PS_WORKER、DDP、MPI、HOROVOD
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrainingMode 训练模式，eg：PS_WORKER、DDP、MPI、HOROVOD
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrainingMode() {
        return this.TrainingMode;
    }

    /**
     * Set 训练模式，eg：PS_WORKER、DDP、MPI、HOROVOD
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrainingMode 训练模式，eg：PS_WORKER、DDP、MPI、HOROVOD
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrainingMode(String TrainingMode) {
        this.TrainingMode = TrainingMode;
    }

    /**
     * Get 计费模式 
     * @return ChargeType 计费模式
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 计费模式
     * @param ChargeType 计费模式
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 预付费专用资源组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupId 预付费专用资源组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set 预付费专用资源组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupId 预付费专用资源组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get 资源配置 
     * @return ResourceConfigInfos 资源配置
     */
    public ResourceConfigInfo [] getResourceConfigInfos() {
        return this.ResourceConfigInfos;
    }

    /**
     * Set 资源配置
     * @param ResourceConfigInfos 资源配置
     */
    public void setResourceConfigInfos(ResourceConfigInfo [] ResourceConfigInfos) {
        this.ResourceConfigInfos = ResourceConfigInfos;
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
     * Get 自定义镜像信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageInfo 自定义镜像信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageInfo getImageInfo() {
        return this.ImageInfo;
    }

    /**
     * Set 自定义镜像信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageInfo 自定义镜像信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageInfo(ImageInfo ImageInfo) {
        this.ImageInfo = ImageInfo;
    }

    /**
     * Get 代码包 
     * @return CodePackagePath 代码包
     */
    public CosPathInfo getCodePackagePath() {
        return this.CodePackagePath;
    }

    /**
     * Set 代码包
     * @param CodePackagePath 代码包
     */
    public void setCodePackagePath(CosPathInfo CodePackagePath) {
        this.CodePackagePath = CodePackagePath;
    }

    /**
     * Get 启动命令信息 
     * @return StartCmdInfo 启动命令信息
     */
    public StartCmdInfo getStartCmdInfo() {
        return this.StartCmdInfo;
    }

    /**
     * Set 启动命令信息
     * @param StartCmdInfo 启动命令信息
     */
    public void setStartCmdInfo(StartCmdInfo StartCmdInfo) {
        this.StartCmdInfo = StartCmdInfo;
    }

    /**
     * Get 数据来源，eg：DATASET、COS
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSource 数据来源，eg：DATASET、COS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSource() {
        return this.DataSource;
    }

    /**
     * Set 数据来源，eg：DATASET、COS
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSource 数据来源，eg：DATASET、COS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSource(String DataSource) {
        this.DataSource = DataSource;
    }

    /**
     * Get 数据配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataConfigs 数据配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataConfig [] getDataConfigs() {
        return this.DataConfigs;
    }

    /**
     * Set 数据配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataConfigs 数据配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataConfigs(DataConfig [] DataConfigs) {
        this.DataConfigs = DataConfigs;
    }

    /**
     * Get 调优参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TuningParameters 调优参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTuningParameters() {
        return this.TuningParameters;
    }

    /**
     * Set 调优参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TuningParameters 调优参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTuningParameters(String TuningParameters) {
        this.TuningParameters = TuningParameters;
    }

    /**
     * Get 训练输出 
     * @return Output 训练输出
     */
    public CosPathInfo getOutput() {
        return this.Output;
    }

    /**
     * Set 训练输出
     * @param Output 训练输出
     */
    public void setOutput(CosPathInfo Output) {
        this.Output = Output;
    }

    /**
     * Get 是否上报日志 
     * @return LogEnable 是否上报日志
     */
    public Boolean getLogEnable() {
        return this.LogEnable;
    }

    /**
     * Set 是否上报日志
     * @param LogEnable 是否上报日志
     */
    public void setLogEnable(Boolean LogEnable) {
        this.LogEnable = LogEnable;
    }

    /**
     * Get 日志配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogConfig 日志配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LogConfig getLogConfig() {
        return this.LogConfig;
    }

    /**
     * Set 日志配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogConfig 日志配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogConfig(LogConfig LogConfig) {
        this.LogConfig = LogConfig;
    }

    /**
     * Get VPC ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId VPC ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId VPC ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 任务状态 
     * @return Status 任务状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态
     * @param Status 任务状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 运行时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuntimeInSeconds 运行时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuntimeInSeconds() {
        return this.RuntimeInSeconds;
    }

    /**
     * Set 运行时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuntimeInSeconds 运行时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuntimeInSeconds(Long RuntimeInSeconds) {
        this.RuntimeInSeconds = RuntimeInSeconds;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 训练开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 训练开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 训练开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 训练开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 计费状态，eg：BILLING计费中，ARREARS_STOP欠费停止，NOT_BILLING不在计费中 
     * @return ChargeStatus 计费状态，eg：BILLING计费中，ARREARS_STOP欠费停止，NOT_BILLING不在计费中
     */
    public String getChargeStatus() {
        return this.ChargeStatus;
    }

    /**
     * Set 计费状态，eg：BILLING计费中，ARREARS_STOP欠费停止，NOT_BILLING不在计费中
     * @param ChargeStatus 计费状态，eg：BILLING计费中，ARREARS_STOP欠费停止，NOT_BILLING不在计费中
     */
    public void setChargeStatus(String ChargeStatus) {
        this.ChargeStatus = ChargeStatus;
    }

    /**
     * Get 最近一次实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestInstanceId 最近一次实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestInstanceId() {
        return this.LatestInstanceId;
    }

    /**
     * Set 最近一次实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestInstanceId 最近一次实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestInstanceId(String LatestInstanceId) {
        this.LatestInstanceId = LatestInstanceId;
    }

    /**
     * Get TensorBoard ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TensorBoardId TensorBoard ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTensorBoardId() {
        return this.TensorBoardId;
    }

    /**
     * Set TensorBoard ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TensorBoardId TensorBoard ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTensorBoardId(String TensorBoardId) {
        this.TensorBoardId = TensorBoardId;
    }

    /**
     * Get 备注
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark 备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailureReason 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailureReason() {
        return this.FailureReason;
    }

    /**
     * Set 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailureReason 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailureReason(String FailureReason) {
        this.FailureReason = FailureReason;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 训练结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 训练结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 训练结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 训练结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 计费金额信息，eg：2.00元/小时 (for后付费)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillingInfo 计费金额信息，eg：2.00元/小时 (for后付费)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBillingInfo() {
        return this.BillingInfo;
    }

    /**
     * Set 计费金额信息，eg：2.00元/小时 (for后付费)
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillingInfo 计费金额信息，eg：2.00元/小时 (for后付费)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillingInfo(String BillingInfo) {
        this.BillingInfo = BillingInfo;
    }

    /**
     * Get 预付费专用资源组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupName 预付费专用资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set 预付费专用资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupName 预付费专用资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
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
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.FrameworkName != null) {
            this.FrameworkName = new String(source.FrameworkName);
        }
        if (source.FrameworkVersion != null) {
            this.FrameworkVersion = new String(source.FrameworkVersion);
        }
        if (source.TrainingMode != null) {
            this.TrainingMode = new String(source.TrainingMode);
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
        if (source.ImageInfo != null) {
            this.ImageInfo = new ImageInfo(source.ImageInfo);
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
        if (source.Status != null) {
            this.Status = new String(source.Status);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "FrameworkName", this.FrameworkName);
        this.setParamSimple(map, prefix + "FrameworkVersion", this.FrameworkVersion);
        this.setParamSimple(map, prefix + "TrainingMode", this.TrainingMode);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamArrayObj(map, prefix + "ResourceConfigInfos.", this.ResourceConfigInfos);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "ImageInfo.", this.ImageInfo);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
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

    }
}

