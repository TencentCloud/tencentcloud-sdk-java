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

public class NotebookDetail extends AbstractModel{

    /**
    * notebook  ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * notebook 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 生命周期脚本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LifecycleScriptId")
    @Expose
    private String LifecycleScriptId;

    /**
    * Pod-Name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * Update-Time
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 是否访问公网
    */
    @SerializedName("DirectInternetAccess")
    @Expose
    private Boolean DirectInternetAccess;

    /**
    * 预付费专用资源组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * 标签配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 是否自动停止
    */
    @SerializedName("AutoStopping")
    @Expose
    private Boolean AutoStopping;

    /**
    * 其他GIT存储库，最多3个，单个
长度不超过512字符
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdditionalCodeRepoIds")
    @Expose
    private String [] AdditionalCodeRepoIds;

    /**
    * 自动停止时间，单位小时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutomaticStopTime")
    @Expose
    private Long AutomaticStopTime;

    /**
    * 资源配置
    */
    @SerializedName("ResourceConf")
    @Expose
    private ResourceConf ResourceConf;

    /**
    * 默认GIT存储库，长度不超过512字符
    */
    @SerializedName("DefaultCodeRepoId")
    @Expose
    private String DefaultCodeRepoId;

    /**
    * 训练输出
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChargeStatus")
    @Expose
    private String ChargeStatus;

    /**
    * 是否ROOT权限
    */
    @SerializedName("RootAccess")
    @Expose
    private Boolean RootAccess;

    /**
    * 计贺金额信息，eg:2.00元/小时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillingInfos")
    @Expose
    private String [] BillingInfos;

    /**
    * 存储卷大小 （单位时GB，最小10GB，必须是10G的倍数）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeSizeInGB")
    @Expose
    private Long VolumeSizeInGB;

    /**
    * 失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailureReason")
    @Expose
    private String FailureReason;

    /**
    * 计算资源付费模式 (- PREPAID：预付费，即包年包月 - POSTPAID_BY_HOUR：按小时后付费)
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 后付费资源规格说明
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceTypeAlias")
    @Expose
    private String InstanceTypeAlias;

    /**
    * 预付费资源组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * 存储的类型。取值包含： 
    FREE:        预付费的免费存储
    CLOUD_PREMIUM： 高性能云硬盘
    CLOUD_SSD： SSD云硬盘
    CFS:     CFS存储，包含NFS和turbo
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeSourceType")
    @Expose
    private String VolumeSourceType;

    /**
    * CFS存储的配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VolumeSourceCFS")
    @Expose
    private CFSConfig VolumeSourceCFS;

    /**
    * 数据配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataConfigs")
    @Expose
    private DataConfig [] DataConfigs;

    /**
    * notebook 信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 数据源来源，eg：WeData_HDFS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSource")
    @Expose
    private String DataSource;

    /**
    * 镜像信息
    */
    @SerializedName("ImageInfo")
    @Expose
    private ImageInfo ImageInfo;

    /**
    * 镜像类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageType")
    @Expose
    private String ImageType;

    /**
     * Get notebook  ID 
     * @return Id notebook  ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set notebook  ID
     * @param Id notebook  ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get notebook 名称 
     * @return Name notebook 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set notebook 名称
     * @param Name notebook 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 生命周期脚本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LifecycleScriptId 生命周期脚本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLifecycleScriptId() {
        return this.LifecycleScriptId;
    }

    /**
     * Set 生命周期脚本
注意：此字段可能返回 null，表示取不到有效值。
     * @param LifecycleScriptId 生命周期脚本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLifecycleScriptId(String LifecycleScriptId) {
        this.LifecycleScriptId = LifecycleScriptId;
    }

    /**
     * Get Pod-Name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodName Pod-Name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set Pod-Name
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodName Pod-Name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get Update-Time 
     * @return UpdateTime Update-Time
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update-Time
     * @param UpdateTime Update-Time
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 是否访问公网 
     * @return DirectInternetAccess 是否访问公网
     */
    public Boolean getDirectInternetAccess() {
        return this.DirectInternetAccess;
    }

    /**
     * Set 是否访问公网
     * @param DirectInternetAccess 是否访问公网
     */
    public void setDirectInternetAccess(Boolean DirectInternetAccess) {
        this.DirectInternetAccess = DirectInternetAccess;
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
     * Get 标签配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 是否自动停止 
     * @return AutoStopping 是否自动停止
     */
    public Boolean getAutoStopping() {
        return this.AutoStopping;
    }

    /**
     * Set 是否自动停止
     * @param AutoStopping 是否自动停止
     */
    public void setAutoStopping(Boolean AutoStopping) {
        this.AutoStopping = AutoStopping;
    }

    /**
     * Get 其他GIT存储库，最多3个，单个
长度不超过512字符
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdditionalCodeRepoIds 其他GIT存储库，最多3个，单个
长度不超过512字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAdditionalCodeRepoIds() {
        return this.AdditionalCodeRepoIds;
    }

    /**
     * Set 其他GIT存储库，最多3个，单个
长度不超过512字符
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdditionalCodeRepoIds 其他GIT存储库，最多3个，单个
长度不超过512字符
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdditionalCodeRepoIds(String [] AdditionalCodeRepoIds) {
        this.AdditionalCodeRepoIds = AdditionalCodeRepoIds;
    }

    /**
     * Get 自动停止时间，单位小时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutomaticStopTime 自动停止时间，单位小时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutomaticStopTime() {
        return this.AutomaticStopTime;
    }

    /**
     * Set 自动停止时间，单位小时
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutomaticStopTime 自动停止时间，单位小时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutomaticStopTime(Long AutomaticStopTime) {
        this.AutomaticStopTime = AutomaticStopTime;
    }

    /**
     * Get 资源配置 
     * @return ResourceConf 资源配置
     */
    public ResourceConf getResourceConf() {
        return this.ResourceConf;
    }

    /**
     * Set 资源配置
     * @param ResourceConf 资源配置
     */
    public void setResourceConf(ResourceConf ResourceConf) {
        this.ResourceConf = ResourceConf;
    }

    /**
     * Get 默认GIT存储库，长度不超过512字符 
     * @return DefaultCodeRepoId 默认GIT存储库，长度不超过512字符
     */
    public String getDefaultCodeRepoId() {
        return this.DefaultCodeRepoId;
    }

    /**
     * Set 默认GIT存储库，长度不超过512字符
     * @param DefaultCodeRepoId 默认GIT存储库，长度不超过512字符
     */
    public void setDefaultCodeRepoId(String DefaultCodeRepoId) {
        this.DefaultCodeRepoId = DefaultCodeRepoId;
    }

    /**
     * Get 训练输出
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 训练输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 训练输出
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 训练输出
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChargeStatus 计费状态，eg：BILLING计费中，ARREARS_STOP欠费停止，NOT_BILLING不在计费中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChargeStatus() {
        return this.ChargeStatus;
    }

    /**
     * Set 计费状态，eg：BILLING计费中，ARREARS_STOP欠费停止，NOT_BILLING不在计费中
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChargeStatus 计费状态，eg：BILLING计费中，ARREARS_STOP欠费停止，NOT_BILLING不在计费中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChargeStatus(String ChargeStatus) {
        this.ChargeStatus = ChargeStatus;
    }

    /**
     * Get 是否ROOT权限 
     * @return RootAccess 是否ROOT权限
     */
    public Boolean getRootAccess() {
        return this.RootAccess;
    }

    /**
     * Set 是否ROOT权限
     * @param RootAccess 是否ROOT权限
     */
    public void setRootAccess(Boolean RootAccess) {
        this.RootAccess = RootAccess;
    }

    /**
     * Get 计贺金额信息，eg:2.00元/小时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillingInfos 计贺金额信息，eg:2.00元/小时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getBillingInfos() {
        return this.BillingInfos;
    }

    /**
     * Set 计贺金额信息，eg:2.00元/小时
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillingInfos 计贺金额信息，eg:2.00元/小时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillingInfos(String [] BillingInfos) {
        this.BillingInfos = BillingInfos;
    }

    /**
     * Get 存储卷大小 （单位时GB，最小10GB，必须是10G的倍数）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeSizeInGB 存储卷大小 （单位时GB，最小10GB，必须是10G的倍数）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVolumeSizeInGB() {
        return this.VolumeSizeInGB;
    }

    /**
     * Set 存储卷大小 （单位时GB，最小10GB，必须是10G的倍数）
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeSizeInGB 存储卷大小 （单位时GB，最小10GB，必须是10G的倍数）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeSizeInGB(Long VolumeSizeInGB) {
        this.VolumeSizeInGB = VolumeSizeInGB;
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
     * Get 计算资源付费模式 (- PREPAID：预付费，即包年包月 - POSTPAID_BY_HOUR：按小时后付费) 
     * @return ChargeType 计算资源付费模式 (- PREPAID：预付费，即包年包月 - POSTPAID_BY_HOUR：按小时后付费)
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 计算资源付费模式 (- PREPAID：预付费，即包年包月 - POSTPAID_BY_HOUR：按小时后付费)
     * @param ChargeType 计算资源付费模式 (- PREPAID：预付费，即包年包月 - POSTPAID_BY_HOUR：按小时后付费)
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 后付费资源规格说明
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceTypeAlias 后付费资源规格说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceTypeAlias() {
        return this.InstanceTypeAlias;
    }

    /**
     * Set 后付费资源规格说明
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceTypeAlias 后付费资源规格说明
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceTypeAlias(String InstanceTypeAlias) {
        this.InstanceTypeAlias = InstanceTypeAlias;
    }

    /**
     * Get 预付费资源组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupName 预付费资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set 预付费资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupName 预付费资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get 存储的类型。取值包含： 
    FREE:        预付费的免费存储
    CLOUD_PREMIUM： 高性能云硬盘
    CLOUD_SSD： SSD云硬盘
    CFS:     CFS存储，包含NFS和turbo
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeSourceType 存储的类型。取值包含： 
    FREE:        预付费的免费存储
    CLOUD_PREMIUM： 高性能云硬盘
    CLOUD_SSD： SSD云硬盘
    CFS:     CFS存储，包含NFS和turbo
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVolumeSourceType() {
        return this.VolumeSourceType;
    }

    /**
     * Set 存储的类型。取值包含： 
    FREE:        预付费的免费存储
    CLOUD_PREMIUM： 高性能云硬盘
    CLOUD_SSD： SSD云硬盘
    CFS:     CFS存储，包含NFS和turbo
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeSourceType 存储的类型。取值包含： 
    FREE:        预付费的免费存储
    CLOUD_PREMIUM： 高性能云硬盘
    CLOUD_SSD： SSD云硬盘
    CFS:     CFS存储，包含NFS和turbo
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeSourceType(String VolumeSourceType) {
        this.VolumeSourceType = VolumeSourceType;
    }

    /**
     * Get CFS存储的配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VolumeSourceCFS CFS存储的配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CFSConfig getVolumeSourceCFS() {
        return this.VolumeSourceCFS;
    }

    /**
     * Set CFS存储的配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param VolumeSourceCFS CFS存储的配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVolumeSourceCFS(CFSConfig VolumeSourceCFS) {
        this.VolumeSourceCFS = VolumeSourceCFS;
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
     * Get notebook 信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Message notebook 信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set notebook 信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message notebook 信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 数据源来源，eg：WeData_HDFS
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSource 数据源来源，eg：WeData_HDFS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataSource() {
        return this.DataSource;
    }

    /**
     * Set 数据源来源，eg：WeData_HDFS
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSource 数据源来源，eg：WeData_HDFS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSource(String DataSource) {
        this.DataSource = DataSource;
    }

    /**
     * Get 镜像信息 
     * @return ImageInfo 镜像信息
     */
    public ImageInfo getImageInfo() {
        return this.ImageInfo;
    }

    /**
     * Set 镜像信息
     * @param ImageInfo 镜像信息
     */
    public void setImageInfo(ImageInfo ImageInfo) {
        this.ImageInfo = ImageInfo;
    }

    /**
     * Get 镜像类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageType 镜像类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImageType() {
        return this.ImageType;
    }

    /**
     * Set 镜像类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageType 镜像类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageType(String ImageType) {
        this.ImageType = ImageType;
    }

    public NotebookDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NotebookDetail(NotebookDetail source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.LifecycleScriptId != null) {
            this.LifecycleScriptId = new String(source.LifecycleScriptId);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.DirectInternetAccess != null) {
            this.DirectInternetAccess = new Boolean(source.DirectInternetAccess);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.AutoStopping != null) {
            this.AutoStopping = new Boolean(source.AutoStopping);
        }
        if (source.AdditionalCodeRepoIds != null) {
            this.AdditionalCodeRepoIds = new String[source.AdditionalCodeRepoIds.length];
            for (int i = 0; i < source.AdditionalCodeRepoIds.length; i++) {
                this.AdditionalCodeRepoIds[i] = new String(source.AdditionalCodeRepoIds[i]);
            }
        }
        if (source.AutomaticStopTime != null) {
            this.AutomaticStopTime = new Long(source.AutomaticStopTime);
        }
        if (source.ResourceConf != null) {
            this.ResourceConf = new ResourceConf(source.ResourceConf);
        }
        if (source.DefaultCodeRepoId != null) {
            this.DefaultCodeRepoId = new String(source.DefaultCodeRepoId);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
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
        if (source.RootAccess != null) {
            this.RootAccess = new Boolean(source.RootAccess);
        }
        if (source.BillingInfos != null) {
            this.BillingInfos = new String[source.BillingInfos.length];
            for (int i = 0; i < source.BillingInfos.length; i++) {
                this.BillingInfos[i] = new String(source.BillingInfos[i]);
            }
        }
        if (source.VolumeSizeInGB != null) {
            this.VolumeSizeInGB = new Long(source.VolumeSizeInGB);
        }
        if (source.FailureReason != null) {
            this.FailureReason = new String(source.FailureReason);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.InstanceTypeAlias != null) {
            this.InstanceTypeAlias = new String(source.InstanceTypeAlias);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
        if (source.VolumeSourceType != null) {
            this.VolumeSourceType = new String(source.VolumeSourceType);
        }
        if (source.VolumeSourceCFS != null) {
            this.VolumeSourceCFS = new CFSConfig(source.VolumeSourceCFS);
        }
        if (source.DataConfigs != null) {
            this.DataConfigs = new DataConfig[source.DataConfigs.length];
            for (int i = 0; i < source.DataConfigs.length; i++) {
                this.DataConfigs[i] = new DataConfig(source.DataConfigs[i]);
            }
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.DataSource != null) {
            this.DataSource = new String(source.DataSource);
        }
        if (source.ImageInfo != null) {
            this.ImageInfo = new ImageInfo(source.ImageInfo);
        }
        if (source.ImageType != null) {
            this.ImageType = new String(source.ImageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "LifecycleScriptId", this.LifecycleScriptId);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "DirectInternetAccess", this.DirectInternetAccess);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AutoStopping", this.AutoStopping);
        this.setParamArraySimple(map, prefix + "AdditionalCodeRepoIds.", this.AdditionalCodeRepoIds);
        this.setParamSimple(map, prefix + "AutomaticStopTime", this.AutomaticStopTime);
        this.setParamObj(map, prefix + "ResourceConf.", this.ResourceConf);
        this.setParamSimple(map, prefix + "DefaultCodeRepoId", this.DefaultCodeRepoId);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "LogEnable", this.LogEnable);
        this.setParamObj(map, prefix + "LogConfig.", this.LogConfig);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RuntimeInSeconds", this.RuntimeInSeconds);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ChargeStatus", this.ChargeStatus);
        this.setParamSimple(map, prefix + "RootAccess", this.RootAccess);
        this.setParamArraySimple(map, prefix + "BillingInfos.", this.BillingInfos);
        this.setParamSimple(map, prefix + "VolumeSizeInGB", this.VolumeSizeInGB);
        this.setParamSimple(map, prefix + "FailureReason", this.FailureReason);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "InstanceTypeAlias", this.InstanceTypeAlias);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);
        this.setParamSimple(map, prefix + "VolumeSourceType", this.VolumeSourceType);
        this.setParamObj(map, prefix + "VolumeSourceCFS.", this.VolumeSourceCFS);
        this.setParamArrayObj(map, prefix + "DataConfigs.", this.DataConfigs);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "DataSource", this.DataSource);
        this.setParamObj(map, prefix + "ImageInfo.", this.ImageInfo);
        this.setParamSimple(map, prefix + "ImageType", this.ImageType);

    }
}

