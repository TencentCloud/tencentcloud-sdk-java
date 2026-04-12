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

public class TrainingTaskSetItem extends AbstractModel {

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
    * <p>框架名称</p>
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
    * <p>计费状态，eg：BILLING计费中，ARREARS_STOP欠费停止，NOT_BILLING不在计费中</p>
    */
    @SerializedName("ChargeStatus")
    @Expose
    private String ChargeStatus;

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
    * <p>训练模式eg：PS_WORKER、DDP、MPI、HOROVOD</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrainingMode")
    @Expose
    private String TrainingMode;

    /**
    * <p>任务状态，eg：SUBMITTING提交中、PENDING排队中、<br>STARTING启动中、RUNNING运行中、STOPPING停止中、STOPPED已停止、FAILED异常、SUCCEED已完成</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

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
    * <p>训练结束时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>训练输出</p>
    */
    @SerializedName("Output")
    @Expose
    private CosPathInfo Output;

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
    * <p>计费金额信息，eg：2.00元/小时 (按量计费)</p>
    */
    @SerializedName("BillingInfo")
    @Expose
    private String BillingInfo;

    /**
    * <p>预付费专用资源组名称</p>
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * <p>自定义镜像信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageInfo")
    @Expose
    private ImageInfo ImageInfo;

    /**
    * <p>任务信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * <p>标签配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>回调地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CallbackUrl")
    @Expose
    private String CallbackUrl;

    /**
    * <p>任务subUin信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubUin")
    @Expose
    private String SubUin;

    /**
    * <p>任务创建者名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubUinName")
    @Expose
    private String SubUinName;

    /**
    * <p>任务AppId</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>环境变量</p>
    */
    @SerializedName("Envs")
    @Expose
    private EnvVar [] Envs;

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
     * Get <p>框架名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrameworkName <p>框架名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrameworkName() {
        return this.FrameworkName;
    }

    /**
     * Set <p>框架名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrameworkName <p>框架名称</p>
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
     * Get <p>训练模式eg：PS_WORKER、DDP、MPI、HOROVOD</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrainingMode <p>训练模式eg：PS_WORKER、DDP、MPI、HOROVOD</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrainingMode() {
        return this.TrainingMode;
    }

    /**
     * Set <p>训练模式eg：PS_WORKER、DDP、MPI、HOROVOD</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrainingMode <p>训练模式eg：PS_WORKER、DDP、MPI、HOROVOD</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrainingMode(String TrainingMode) {
        this.TrainingMode = TrainingMode;
    }

    /**
     * Get <p>任务状态，eg：SUBMITTING提交中、PENDING排队中、<br>STARTING启动中、RUNNING运行中、STOPPING停止中、STOPPED已停止、FAILED异常、SUCCEED已完成</p> 
     * @return Status <p>任务状态，eg：SUBMITTING提交中、PENDING排队中、<br>STARTING启动中、RUNNING运行中、STOPPING停止中、STOPPED已停止、FAILED异常、SUCCEED已完成</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态，eg：SUBMITTING提交中、PENDING排队中、<br>STARTING启动中、RUNNING运行中、STOPPING停止中、STOPPED已停止、FAILED异常、SUCCEED已完成</p>
     * @param Status <p>任务状态，eg：SUBMITTING提交中、PENDING排队中、<br>STARTING启动中、RUNNING运行中、STOPPING停止中、STOPPED已停止、FAILED异常、SUCCEED已完成</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
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
     * Get <p>计费金额信息，eg：2.00元/小时 (按量计费)</p> 
     * @return BillingInfo <p>计费金额信息，eg：2.00元/小时 (按量计费)</p>
     */
    public String getBillingInfo() {
        return this.BillingInfo;
    }

    /**
     * Set <p>计费金额信息，eg：2.00元/小时 (按量计费)</p>
     * @param BillingInfo <p>计费金额信息，eg：2.00元/小时 (按量计费)</p>
     */
    public void setBillingInfo(String BillingInfo) {
        this.BillingInfo = BillingInfo;
    }

    /**
     * Get <p>预付费专用资源组名称</p> 
     * @return ResourceGroupName <p>预付费专用资源组名称</p>
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set <p>预付费专用资源组名称</p>
     * @param ResourceGroupName <p>预付费专用资源组名称</p>
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
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
     * Get <p>标签配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags <p>标签配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags <p>标签配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
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
     * Get <p>任务subUin信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubUin <p>任务subUin信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubUin() {
        return this.SubUin;
    }

    /**
     * Set <p>任务subUin信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubUin <p>任务subUin信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubUin(String SubUin) {
        this.SubUin = SubUin;
    }

    /**
     * Get <p>任务创建者名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubUinName <p>任务创建者名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubUinName() {
        return this.SubUinName;
    }

    /**
     * Set <p>任务创建者名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubUinName <p>任务创建者名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubUinName(String SubUinName) {
        this.SubUinName = SubUinName;
    }

    /**
     * Get <p>任务AppId</p> 
     * @return AppId <p>任务AppId</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>任务AppId</p>
     * @param AppId <p>任务AppId</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>环境变量</p> 
     * @return Envs <p>环境变量</p>
     */
    public EnvVar [] getEnvs() {
        return this.Envs;
    }

    /**
     * Set <p>环境变量</p>
     * @param Envs <p>环境变量</p>
     */
    public void setEnvs(EnvVar [] Envs) {
        this.Envs = Envs;
    }

    public TrainingTaskSetItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrainingTaskSetItem(TrainingTaskSetItem source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
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
        if (source.ChargeStatus != null) {
            this.ChargeStatus = new String(source.ChargeStatus);
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
        if (source.TrainingMode != null) {
            this.TrainingMode = new String(source.TrainingMode);
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
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Output != null) {
            this.Output = new CosPathInfo(source.Output);
        }
        if (source.FailureReason != null) {
            this.FailureReason = new String(source.FailureReason);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.BillingInfo != null) {
            this.BillingInfo = new String(source.BillingInfo);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
        if (source.ImageInfo != null) {
            this.ImageInfo = new ImageInfo(source.ImageInfo);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.CallbackUrl != null) {
            this.CallbackUrl = new String(source.CallbackUrl);
        }
        if (source.SubUin != null) {
            this.SubUin = new String(source.SubUin);
        }
        if (source.SubUinName != null) {
            this.SubUinName = new String(source.SubUinName);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.Envs != null) {
            this.Envs = new EnvVar[source.Envs.length];
            for (int i = 0; i < source.Envs.length; i++) {
                this.Envs[i] = new EnvVar(source.Envs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "FrameworkName", this.FrameworkName);
        this.setParamSimple(map, prefix + "FrameworkVersion", this.FrameworkVersion);
        this.setParamSimple(map, prefix + "FrameworkEnvironment", this.FrameworkEnvironment);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "ChargeStatus", this.ChargeStatus);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamArrayObj(map, prefix + "ResourceConfigInfos.", this.ResourceConfigInfos);
        this.setParamSimple(map, prefix + "TrainingMode", this.TrainingMode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RuntimeInSeconds", this.RuntimeInSeconds);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamObj(map, prefix + "Output.", this.Output);
        this.setParamSimple(map, prefix + "FailureReason", this.FailureReason);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "BillingInfo", this.BillingInfo);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);
        this.setParamObj(map, prefix + "ImageInfo.", this.ImageInfo);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CallbackUrl", this.CallbackUrl);
        this.setParamSimple(map, prefix + "SubUin", this.SubUin);
        this.setParamSimple(map, prefix + "SubUinName", this.SubUinName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamArrayObj(map, prefix + "Envs.", this.Envs);

    }
}

