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

public class TrainingTaskSetItem extends AbstractModel{

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
    * 框架名称
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
    * 训练模式eg：PS_WORKER、DDP、MPI、HOROVOD
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
    * 计费状态，eg：BILLING计费中，ARREARS_STOP欠费停止，NOT_BILLING不在计费中
    */
    @SerializedName("ChargeStatus")
    @Expose
    private String ChargeStatus;

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
    * 标签配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

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
    * 训练结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 训练输出
    */
    @SerializedName("Output")
    @Expose
    private CosPathInfo Output;

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
    * 计费金额信息，eg：2.00元/小时 (for后付费)
    */
    @SerializedName("BillingInfo")
    @Expose
    private String BillingInfo;

    /**
    * 预付费专用资源组名称
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * 自定义镜像信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageInfo")
    @Expose
    private ImageInfo ImageInfo;

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
     * Get 框架名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrameworkName 框架名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrameworkName() {
        return this.FrameworkName;
    }

    /**
     * Set 框架名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrameworkName 框架名称
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
     * Get 训练模式eg：PS_WORKER、DDP、MPI、HOROVOD
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrainingMode 训练模式eg：PS_WORKER、DDP、MPI、HOROVOD
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrainingMode() {
        return this.TrainingMode;
    }

    /**
     * Set 训练模式eg：PS_WORKER、DDP、MPI、HOROVOD
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrainingMode 训练模式eg：PS_WORKER、DDP、MPI、HOROVOD
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
     * Get 计费金额信息，eg：2.00元/小时 (for后付费) 
     * @return BillingInfo 计费金额信息，eg：2.00元/小时 (for后付费)
     */
    public String getBillingInfo() {
        return this.BillingInfo;
    }

    /**
     * Set 计费金额信息，eg：2.00元/小时 (for后付费)
     * @param BillingInfo 计费金额信息，eg：2.00元/小时 (for后付费)
     */
    public void setBillingInfo(String BillingInfo) {
        this.BillingInfo = BillingInfo;
    }

    /**
     * Get 预付费专用资源组名称 
     * @return ResourceGroupName 预付费专用资源组名称
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set 预付费专用资源组名称
     * @param ResourceGroupName 预付费专用资源组名称
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
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
        if (source.TrainingMode != null) {
            this.TrainingMode = new String(source.TrainingMode);
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
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "FrameworkName", this.FrameworkName);
        this.setParamSimple(map, prefix + "FrameworkVersion", this.FrameworkVersion);
        this.setParamSimple(map, prefix + "TrainingMode", this.TrainingMode);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "ChargeStatus", this.ChargeStatus);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamArrayObj(map, prefix + "ResourceConfigInfos.", this.ResourceConfigInfos);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
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

    }
}

