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

public class BatchTaskDetail extends AbstractModel{

    /**
    * 跑批任务ID
    */
    @SerializedName("BatchTaskId")
    @Expose
    private String BatchTaskId;

    /**
    * 跑批任务名称
    */
    @SerializedName("BatchTaskName")
    @Expose
    private String BatchTaskName;

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
    * 计费模式
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 包年包月资源组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * 包年包月资源组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * 资源配置
    */
    @SerializedName("ResourceConfigInfo")
    @Expose
    private ResourceConfigInfo ResourceConfigInfo;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 服务对应的模型信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelInfo")
    @Expose
    private ModelInfo ModelInfo;

    /**
    * 自定义镜像信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageInfo")
    @Expose
    private ImageInfo ImageInfo;

    /**
    * 代码包
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodePackagePath")
    @Expose
    private CosPathInfo CodePackagePath;

    /**
    * 启动命令
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartCmd")
    @Expose
    private String StartCmd;

    /**
    * 输入数据配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataConfigs")
    @Expose
    private DataConfig [] DataConfigs;

    /**
    * 输出数据配置
    */
    @SerializedName("Outputs")
    @Expose
    private DataConfig [] Outputs;

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
    * vpc id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网id
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
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

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
    * 计费金额信息，eg：2.00元/小时 (for 按量计费)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillingInfo")
    @Expose
    private String BillingInfo;

    /**
    * 运行中的Pod的名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodList")
    @Expose
    private String [] PodList;

    /**
    * 模型推理代码信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelInferenceCodeInfo")
    @Expose
    private CosPathInfo ModelInferenceCodeInfo;

    /**
     * Get 跑批任务ID 
     * @return BatchTaskId 跑批任务ID
     */
    public String getBatchTaskId() {
        return this.BatchTaskId;
    }

    /**
     * Set 跑批任务ID
     * @param BatchTaskId 跑批任务ID
     */
    public void setBatchTaskId(String BatchTaskId) {
        this.BatchTaskId = BatchTaskId;
    }

    /**
     * Get 跑批任务名称 
     * @return BatchTaskName 跑批任务名称
     */
    public String getBatchTaskName() {
        return this.BatchTaskName;
    }

    /**
     * Set 跑批任务名称
     * @param BatchTaskName 跑批任务名称
     */
    public void setBatchTaskName(String BatchTaskName) {
        this.BatchTaskName = BatchTaskName;
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
     * Get 包年包月资源组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupId 包年包月资源组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set 包年包月资源组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupId 包年包月资源组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get 包年包月资源组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupName 包年包月资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set 包年包月资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupName 包年包月资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get 资源配置 
     * @return ResourceConfigInfo 资源配置
     */
    public ResourceConfigInfo getResourceConfigInfo() {
        return this.ResourceConfigInfo;
    }

    /**
     * Set 资源配置
     * @param ResourceConfigInfo 资源配置
     */
    public void setResourceConfigInfo(ResourceConfigInfo ResourceConfigInfo) {
        this.ResourceConfigInfo = ResourceConfigInfo;
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
     * Get 服务对应的模型信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelInfo 服务对应的模型信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModelInfo getModelInfo() {
        return this.ModelInfo;
    }

    /**
     * Set 服务对应的模型信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelInfo 服务对应的模型信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelInfo(ModelInfo ModelInfo) {
        this.ModelInfo = ModelInfo;
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodePackagePath 代码包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CosPathInfo getCodePackagePath() {
        return this.CodePackagePath;
    }

    /**
     * Set 代码包
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodePackagePath 代码包
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodePackagePath(CosPathInfo CodePackagePath) {
        this.CodePackagePath = CodePackagePath;
    }

    /**
     * Get 启动命令
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartCmd 启动命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartCmd() {
        return this.StartCmd;
    }

    /**
     * Set 启动命令
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartCmd 启动命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartCmd(String StartCmd) {
        this.StartCmd = StartCmd;
    }

    /**
     * Get 输入数据配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataConfigs 输入数据配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DataConfig [] getDataConfigs() {
        return this.DataConfigs;
    }

    /**
     * Set 输入数据配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataConfigs 输入数据配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataConfigs(DataConfig [] DataConfigs) {
        this.DataConfigs = DataConfigs;
    }

    /**
     * Get 输出数据配置 
     * @return Outputs 输出数据配置
     */
    public DataConfig [] getOutputs() {
        return this.Outputs;
    }

    /**
     * Set 输出数据配置
     * @param Outputs 输出数据配置
     */
    public void setOutputs(DataConfig [] Outputs) {
        this.Outputs = Outputs;
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
     * Get vpc id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId vpc id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId vpc id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网id
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网id
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
     * Get 任务开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndTime 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
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
     * Get 计费金额信息，eg：2.00元/小时 (for 按量计费)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BillingInfo 计费金额信息，eg：2.00元/小时 (for 按量计费)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBillingInfo() {
        return this.BillingInfo;
    }

    /**
     * Set 计费金额信息，eg：2.00元/小时 (for 按量计费)
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillingInfo 计费金额信息，eg：2.00元/小时 (for 按量计费)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillingInfo(String BillingInfo) {
        this.BillingInfo = BillingInfo;
    }

    /**
     * Get 运行中的Pod的名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodList 运行中的Pod的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getPodList() {
        return this.PodList;
    }

    /**
     * Set 运行中的Pod的名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodList 运行中的Pod的名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodList(String [] PodList) {
        this.PodList = PodList;
    }

    /**
     * Get 模型推理代码信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelInferenceCodeInfo 模型推理代码信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CosPathInfo getModelInferenceCodeInfo() {
        return this.ModelInferenceCodeInfo;
    }

    /**
     * Set 模型推理代码信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelInferenceCodeInfo 模型推理代码信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelInferenceCodeInfo(CosPathInfo ModelInferenceCodeInfo) {
        this.ModelInferenceCodeInfo = ModelInferenceCodeInfo;
    }

    public BatchTaskDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchTaskDetail(BatchTaskDetail source) {
        if (source.BatchTaskId != null) {
            this.BatchTaskId = new String(source.BatchTaskId);
        }
        if (source.BatchTaskName != null) {
            this.BatchTaskName = new String(source.BatchTaskName);
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
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
        if (source.ResourceConfigInfo != null) {
            this.ResourceConfigInfo = new ResourceConfigInfo(source.ResourceConfigInfo);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.ModelInfo != null) {
            this.ModelInfo = new ModelInfo(source.ModelInfo);
        }
        if (source.ImageInfo != null) {
            this.ImageInfo = new ImageInfo(source.ImageInfo);
        }
        if (source.CodePackagePath != null) {
            this.CodePackagePath = new CosPathInfo(source.CodePackagePath);
        }
        if (source.StartCmd != null) {
            this.StartCmd = new String(source.StartCmd);
        }
        if (source.DataConfigs != null) {
            this.DataConfigs = new DataConfig[source.DataConfigs.length];
            for (int i = 0; i < source.DataConfigs.length; i++) {
                this.DataConfigs[i] = new DataConfig(source.DataConfigs[i]);
            }
        }
        if (source.Outputs != null) {
            this.Outputs = new DataConfig[source.Outputs.length];
            for (int i = 0; i < source.Outputs.length; i++) {
                this.Outputs[i] = new DataConfig(source.Outputs[i]);
            }
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
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.ChargeStatus != null) {
            this.ChargeStatus = new String(source.ChargeStatus);
        }
        if (source.LatestInstanceId != null) {
            this.LatestInstanceId = new String(source.LatestInstanceId);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.FailureReason != null) {
            this.FailureReason = new String(source.FailureReason);
        }
        if (source.BillingInfo != null) {
            this.BillingInfo = new String(source.BillingInfo);
        }
        if (source.PodList != null) {
            this.PodList = new String[source.PodList.length];
            for (int i = 0; i < source.PodList.length; i++) {
                this.PodList[i] = new String(source.PodList[i]);
            }
        }
        if (source.ModelInferenceCodeInfo != null) {
            this.ModelInferenceCodeInfo = new CosPathInfo(source.ModelInferenceCodeInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BatchTaskId", this.BatchTaskId);
        this.setParamSimple(map, prefix + "BatchTaskName", this.BatchTaskName);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);
        this.setParamObj(map, prefix + "ResourceConfigInfo.", this.ResourceConfigInfo);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "ModelInfo.", this.ModelInfo);
        this.setParamObj(map, prefix + "ImageInfo.", this.ImageInfo);
        this.setParamObj(map, prefix + "CodePackagePath.", this.CodePackagePath);
        this.setParamSimple(map, prefix + "StartCmd", this.StartCmd);
        this.setParamArrayObj(map, prefix + "DataConfigs.", this.DataConfigs);
        this.setParamArrayObj(map, prefix + "Outputs.", this.Outputs);
        this.setParamSimple(map, prefix + "LogEnable", this.LogEnable);
        this.setParamObj(map, prefix + "LogConfig.", this.LogConfig);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RuntimeInSeconds", this.RuntimeInSeconds);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "ChargeStatus", this.ChargeStatus);
        this.setParamSimple(map, prefix + "LatestInstanceId", this.LatestInstanceId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "FailureReason", this.FailureReason);
        this.setParamSimple(map, prefix + "BillingInfo", this.BillingInfo);
        this.setParamArraySimple(map, prefix + "PodList.", this.PodList);
        this.setParamObj(map, prefix + "ModelInferenceCodeInfo.", this.ModelInferenceCodeInfo);

    }
}

