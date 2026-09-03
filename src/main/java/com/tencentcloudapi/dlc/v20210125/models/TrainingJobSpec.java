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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrainingJobSpec extends AbstractModel {

    /**
    * <p>训练作业配置 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecId")
    @Expose
    private String SpecId;

    /**
    * <p>训练作业配置名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * <p>配置描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>提交模式（LAB / CUSTOM_CODE / POST_TRAINING / UNKNOWN）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * <p>启动命令</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Entrypoint")
    @Expose
    private String Entrypoint;

    /**
    * <p>镜像地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>镜像拉取类型（BuiltIn / Custom / CustomCcr）</p>
    */
    @SerializedName("ImagePullType")
    @Expose
    private String ImagePullType;

    /**
    * <p>镜像拉取策略（Always / IfNotPresent / Never）</p>
    */
    @SerializedName("ImagePullPolicy")
    @Expose
    private String ImagePullPolicy;

    /**
    * <p>代码包 COS URL</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CodePackageUrl")
    @Expose
    private String CodePackageUrl;

    /**
    * <p>Ray runtime_env 配置 JSON</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuntimeEnv")
    @Expose
    private String RuntimeEnv;

    /**
    * <p>资源配置模板 ID</p>
    */
    @SerializedName("ResourceConfigId")
    @Expose
    private String ResourceConfigId;

    /**
    * <p>资源配置 JSON</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceConfig")
    @Expose
    private String ResourceConfig;

    /**
    * <p>资源分区 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourcePartitionId")
    @Expose
    private String ResourcePartitionId;

    /**
    * <p>资源分区名称</p>
    */
    @SerializedName("ResourcePartitionName")
    @Expose
    private String ResourcePartitionName;

    /**
    * <p>队列名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Queue")
    @Expose
    private String Queue;

    /**
    * <p>Checkpoint 挂载摘要</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CheckpointMountInfo")
    @Expose
    private CheckpointMountInfo CheckpointMountInfo;

    /**
    * <p>存储卷挂载配置 JSON</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * <p>创建时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>更新时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
    * <p>关联实例总数</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceCount")
    @Expose
    private Long InstanceCount;

    /**
    * <p>是否存在运行中实例</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HasRunningInstances")
    @Expose
    private Boolean HasRunningInstances;

    /**
    * <p>作业优先级（1-9，数字越大优先级越高）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * <p>提交时 MLflow 配置 JSON（含 MlFlowMode / MlFlowTrackingUri 等）</p>
    */
    @SerializedName("MlFlowConfig")
    @Expose
    private String MlFlowConfig;

    /**
    * <p>产出模型名称（用于后续模型注册）</p>
    */
    @SerializedName("OutputModelName")
    @Expose
    private String OutputModelName;

    /**
    * <p>训练模式：sft / dpo / cpt / grpo（仅 POST_TRAINING 有值）</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>基础模型 modelUid（仅 POST_TRAINING 有值）</p>
    */
    @SerializedName("BaseModelUid")
    @Expose
    private String BaseModelUid;

    /**
    * <p>基础模型名称（仅 POST_TRAINING 有值）</p>
    */
    @SerializedName("BaseModelName")
    @Expose
    private String BaseModelName;

    /**
    * <p>提交时的数据集挂载列表（List&lt;DatasetMount&gt;，仅详情返回）</p>
    */
    @SerializedName("Datasets")
    @Expose
    private DatasetMount [] Datasets;

    /**
    * <p>提交时的 Checkpoint 产出配置（仅详情返回）</p>
    */
    @SerializedName("LastInstanceStatus")
    @Expose
    private String LastInstanceStatus;

    /**
    * <p>标签列表（TagKey-TagValue）</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>提交时的 Checkpoint 产出配置（仅详情返回）</p>
    */
    @SerializedName("Checkpoint")
    @Expose
    private CheckpointConfig Checkpoint;

    /**
    * <p>提交时的调优参数（仅 POST_TRAINING，仅详情返回）</p>
    */
    @SerializedName("TuningParams")
    @Expose
    private TrainingTuningParams TuningParams;

    /**
    * <p>提交时的断点续训意图声明（仅详情返回）</p>
    */
    @SerializedName("ResumeTraining")
    @Expose
    private Boolean ResumeTraining;

    /**
    * <p>高级参数 JSON（透传给 Neutrino advanced_options）</p>
    */
    @SerializedName("AdvancedOptions")
    @Expose
    private String AdvancedOptions;

    /**
     * Get <p>训练作业配置 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecId <p>训练作业配置 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpecId() {
        return this.SpecId;
    }

    /**
     * Set <p>训练作业配置 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecId <p>训练作业配置 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecId(String SpecId) {
        this.SpecId = SpecId;
    }

    /**
     * Get <p>训练作业配置名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecName <p>训练作业配置名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set <p>训练作业配置名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecName <p>训练作业配置名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get <p>配置描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description <p>配置描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>配置描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description <p>配置描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>提交模式（LAB / CUSTOM_CODE / POST_TRAINING / UNKNOWN）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Kind <p>提交模式（LAB / CUSTOM_CODE / POST_TRAINING / UNKNOWN）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set <p>提交模式（LAB / CUSTOM_CODE / POST_TRAINING / UNKNOWN）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Kind <p>提交模式（LAB / CUSTOM_CODE / POST_TRAINING / UNKNOWN）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get <p>启动命令</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Entrypoint <p>启动命令</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEntrypoint() {
        return this.Entrypoint;
    }

    /**
     * Set <p>启动命令</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Entrypoint <p>启动命令</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEntrypoint(String Entrypoint) {
        this.Entrypoint = Entrypoint;
    }

    /**
     * Get <p>镜像地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Image <p>镜像地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set <p>镜像地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Image <p>镜像地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get <p>镜像拉取类型（BuiltIn / Custom / CustomCcr）</p> 
     * @return ImagePullType <p>镜像拉取类型（BuiltIn / Custom / CustomCcr）</p>
     */
    public String getImagePullType() {
        return this.ImagePullType;
    }

    /**
     * Set <p>镜像拉取类型（BuiltIn / Custom / CustomCcr）</p>
     * @param ImagePullType <p>镜像拉取类型（BuiltIn / Custom / CustomCcr）</p>
     */
    public void setImagePullType(String ImagePullType) {
        this.ImagePullType = ImagePullType;
    }

    /**
     * Get <p>镜像拉取策略（Always / IfNotPresent / Never）</p> 
     * @return ImagePullPolicy <p>镜像拉取策略（Always / IfNotPresent / Never）</p>
     */
    public String getImagePullPolicy() {
        return this.ImagePullPolicy;
    }

    /**
     * Set <p>镜像拉取策略（Always / IfNotPresent / Never）</p>
     * @param ImagePullPolicy <p>镜像拉取策略（Always / IfNotPresent / Never）</p>
     */
    public void setImagePullPolicy(String ImagePullPolicy) {
        this.ImagePullPolicy = ImagePullPolicy;
    }

    /**
     * Get <p>代码包 COS URL</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CodePackageUrl <p>代码包 COS URL</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodePackageUrl() {
        return this.CodePackageUrl;
    }

    /**
     * Set <p>代码包 COS URL</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CodePackageUrl <p>代码包 COS URL</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodePackageUrl(String CodePackageUrl) {
        this.CodePackageUrl = CodePackageUrl;
    }

    /**
     * Get <p>Ray runtime_env 配置 JSON</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuntimeEnv <p>Ray runtime_env 配置 JSON</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuntimeEnv() {
        return this.RuntimeEnv;
    }

    /**
     * Set <p>Ray runtime_env 配置 JSON</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuntimeEnv <p>Ray runtime_env 配置 JSON</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuntimeEnv(String RuntimeEnv) {
        this.RuntimeEnv = RuntimeEnv;
    }

    /**
     * Get <p>资源配置模板 ID</p> 
     * @return ResourceConfigId <p>资源配置模板 ID</p>
     */
    public String getResourceConfigId() {
        return this.ResourceConfigId;
    }

    /**
     * Set <p>资源配置模板 ID</p>
     * @param ResourceConfigId <p>资源配置模板 ID</p>
     */
    public void setResourceConfigId(String ResourceConfigId) {
        this.ResourceConfigId = ResourceConfigId;
    }

    /**
     * Get <p>资源配置 JSON</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceConfig <p>资源配置 JSON</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceConfig() {
        return this.ResourceConfig;
    }

    /**
     * Set <p>资源配置 JSON</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceConfig <p>资源配置 JSON</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceConfig(String ResourceConfig) {
        this.ResourceConfig = ResourceConfig;
    }

    /**
     * Get <p>资源分区 ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourcePartitionId <p>资源分区 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourcePartitionId() {
        return this.ResourcePartitionId;
    }

    /**
     * Set <p>资源分区 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourcePartitionId <p>资源分区 ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourcePartitionId(String ResourcePartitionId) {
        this.ResourcePartitionId = ResourcePartitionId;
    }

    /**
     * Get <p>资源分区名称</p> 
     * @return ResourcePartitionName <p>资源分区名称</p>
     */
    public String getResourcePartitionName() {
        return this.ResourcePartitionName;
    }

    /**
     * Set <p>资源分区名称</p>
     * @param ResourcePartitionName <p>资源分区名称</p>
     */
    public void setResourcePartitionName(String ResourcePartitionName) {
        this.ResourcePartitionName = ResourcePartitionName;
    }

    /**
     * Get <p>队列名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Queue <p>队列名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueue() {
        return this.Queue;
    }

    /**
     * Set <p>队列名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Queue <p>队列名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueue(String Queue) {
        this.Queue = Queue;
    }

    /**
     * Get <p>Checkpoint 挂载摘要</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CheckpointMountInfo <p>Checkpoint 挂载摘要</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CheckpointMountInfo getCheckpointMountInfo() {
        return this.CheckpointMountInfo;
    }

    /**
     * Set <p>Checkpoint 挂载摘要</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CheckpointMountInfo <p>Checkpoint 挂载摘要</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCheckpointMountInfo(CheckpointMountInfo CheckpointMountInfo) {
        this.CheckpointMountInfo = CheckpointMountInfo;
    }

    /**
     * Get <p>存储卷挂载配置 JSON</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Catalog <p>存储卷挂载配置 JSON</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set <p>存储卷挂载配置 JSON</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Catalog <p>存储卷挂载配置 JSON</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Creator <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creator <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>创建时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>创建时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>创建时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime <p>更新时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime <p>更新时间（毫秒时间戳）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>关联实例总数</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceCount <p>关联实例总数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * Set <p>关联实例总数</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceCount <p>关联实例总数</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceCount(Long InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * Get <p>是否存在运行中实例</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HasRunningInstances <p>是否存在运行中实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getHasRunningInstances() {
        return this.HasRunningInstances;
    }

    /**
     * Set <p>是否存在运行中实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HasRunningInstances <p>是否存在运行中实例</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHasRunningInstances(Boolean HasRunningInstances) {
        this.HasRunningInstances = HasRunningInstances;
    }

    /**
     * Get <p>作业优先级（1-9，数字越大优先级越高）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Priority <p>作业优先级（1-9，数字越大优先级越高）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>作业优先级（1-9，数字越大优先级越高）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Priority <p>作业优先级（1-9，数字越大优先级越高）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>提交时 MLflow 配置 JSON（含 MlFlowMode / MlFlowTrackingUri 等）</p> 
     * @return MlFlowConfig <p>提交时 MLflow 配置 JSON（含 MlFlowMode / MlFlowTrackingUri 等）</p>
     */
    public String getMlFlowConfig() {
        return this.MlFlowConfig;
    }

    /**
     * Set <p>提交时 MLflow 配置 JSON（含 MlFlowMode / MlFlowTrackingUri 等）</p>
     * @param MlFlowConfig <p>提交时 MLflow 配置 JSON（含 MlFlowMode / MlFlowTrackingUri 等）</p>
     */
    public void setMlFlowConfig(String MlFlowConfig) {
        this.MlFlowConfig = MlFlowConfig;
    }

    /**
     * Get <p>产出模型名称（用于后续模型注册）</p> 
     * @return OutputModelName <p>产出模型名称（用于后续模型注册）</p>
     */
    public String getOutputModelName() {
        return this.OutputModelName;
    }

    /**
     * Set <p>产出模型名称（用于后续模型注册）</p>
     * @param OutputModelName <p>产出模型名称（用于后续模型注册）</p>
     */
    public void setOutputModelName(String OutputModelName) {
        this.OutputModelName = OutputModelName;
    }

    /**
     * Get <p>训练模式：sft / dpo / cpt / grpo（仅 POST_TRAINING 有值）</p> 
     * @return Mode <p>训练模式：sft / dpo / cpt / grpo（仅 POST_TRAINING 有值）</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>训练模式：sft / dpo / cpt / grpo（仅 POST_TRAINING 有值）</p>
     * @param Mode <p>训练模式：sft / dpo / cpt / grpo（仅 POST_TRAINING 有值）</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>基础模型 modelUid（仅 POST_TRAINING 有值）</p> 
     * @return BaseModelUid <p>基础模型 modelUid（仅 POST_TRAINING 有值）</p>
     */
    public String getBaseModelUid() {
        return this.BaseModelUid;
    }

    /**
     * Set <p>基础模型 modelUid（仅 POST_TRAINING 有值）</p>
     * @param BaseModelUid <p>基础模型 modelUid（仅 POST_TRAINING 有值）</p>
     */
    public void setBaseModelUid(String BaseModelUid) {
        this.BaseModelUid = BaseModelUid;
    }

    /**
     * Get <p>基础模型名称（仅 POST_TRAINING 有值）</p> 
     * @return BaseModelName <p>基础模型名称（仅 POST_TRAINING 有值）</p>
     */
    public String getBaseModelName() {
        return this.BaseModelName;
    }

    /**
     * Set <p>基础模型名称（仅 POST_TRAINING 有值）</p>
     * @param BaseModelName <p>基础模型名称（仅 POST_TRAINING 有值）</p>
     */
    public void setBaseModelName(String BaseModelName) {
        this.BaseModelName = BaseModelName;
    }

    /**
     * Get <p>提交时的数据集挂载列表（List&lt;DatasetMount&gt;，仅详情返回）</p> 
     * @return Datasets <p>提交时的数据集挂载列表（List&lt;DatasetMount&gt;，仅详情返回）</p>
     */
    public DatasetMount [] getDatasets() {
        return this.Datasets;
    }

    /**
     * Set <p>提交时的数据集挂载列表（List&lt;DatasetMount&gt;，仅详情返回）</p>
     * @param Datasets <p>提交时的数据集挂载列表（List&lt;DatasetMount&gt;，仅详情返回）</p>
     */
    public void setDatasets(DatasetMount [] Datasets) {
        this.Datasets = Datasets;
    }

    /**
     * Get <p>提交时的 Checkpoint 产出配置（仅详情返回）</p> 
     * @return LastInstanceStatus <p>提交时的 Checkpoint 产出配置（仅详情返回）</p>
     */
    public String getLastInstanceStatus() {
        return this.LastInstanceStatus;
    }

    /**
     * Set <p>提交时的 Checkpoint 产出配置（仅详情返回）</p>
     * @param LastInstanceStatus <p>提交时的 Checkpoint 产出配置（仅详情返回）</p>
     */
    public void setLastInstanceStatus(String LastInstanceStatus) {
        this.LastInstanceStatus = LastInstanceStatus;
    }

    /**
     * Get <p>标签列表（TagKey-TagValue）</p> 
     * @return Tags <p>标签列表（TagKey-TagValue）</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表（TagKey-TagValue）</p>
     * @param Tags <p>标签列表（TagKey-TagValue）</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>提交时的 Checkpoint 产出配置（仅详情返回）</p> 
     * @return Checkpoint <p>提交时的 Checkpoint 产出配置（仅详情返回）</p>
     */
    public CheckpointConfig getCheckpoint() {
        return this.Checkpoint;
    }

    /**
     * Set <p>提交时的 Checkpoint 产出配置（仅详情返回）</p>
     * @param Checkpoint <p>提交时的 Checkpoint 产出配置（仅详情返回）</p>
     */
    public void setCheckpoint(CheckpointConfig Checkpoint) {
        this.Checkpoint = Checkpoint;
    }

    /**
     * Get <p>提交时的调优参数（仅 POST_TRAINING，仅详情返回）</p> 
     * @return TuningParams <p>提交时的调优参数（仅 POST_TRAINING，仅详情返回）</p>
     */
    public TrainingTuningParams getTuningParams() {
        return this.TuningParams;
    }

    /**
     * Set <p>提交时的调优参数（仅 POST_TRAINING，仅详情返回）</p>
     * @param TuningParams <p>提交时的调优参数（仅 POST_TRAINING，仅详情返回）</p>
     */
    public void setTuningParams(TrainingTuningParams TuningParams) {
        this.TuningParams = TuningParams;
    }

    /**
     * Get <p>提交时的断点续训意图声明（仅详情返回）</p> 
     * @return ResumeTraining <p>提交时的断点续训意图声明（仅详情返回）</p>
     */
    public Boolean getResumeTraining() {
        return this.ResumeTraining;
    }

    /**
     * Set <p>提交时的断点续训意图声明（仅详情返回）</p>
     * @param ResumeTraining <p>提交时的断点续训意图声明（仅详情返回）</p>
     */
    public void setResumeTraining(Boolean ResumeTraining) {
        this.ResumeTraining = ResumeTraining;
    }

    /**
     * Get <p>高级参数 JSON（透传给 Neutrino advanced_options）</p> 
     * @return AdvancedOptions <p>高级参数 JSON（透传给 Neutrino advanced_options）</p>
     */
    public String getAdvancedOptions() {
        return this.AdvancedOptions;
    }

    /**
     * Set <p>高级参数 JSON（透传给 Neutrino advanced_options）</p>
     * @param AdvancedOptions <p>高级参数 JSON（透传给 Neutrino advanced_options）</p>
     */
    public void setAdvancedOptions(String AdvancedOptions) {
        this.AdvancedOptions = AdvancedOptions;
    }

    public TrainingJobSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrainingJobSpec(TrainingJobSpec source) {
        if (source.SpecId != null) {
            this.SpecId = new String(source.SpecId);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Entrypoint != null) {
            this.Entrypoint = new String(source.Entrypoint);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.ImagePullType != null) {
            this.ImagePullType = new String(source.ImagePullType);
        }
        if (source.ImagePullPolicy != null) {
            this.ImagePullPolicy = new String(source.ImagePullPolicy);
        }
        if (source.CodePackageUrl != null) {
            this.CodePackageUrl = new String(source.CodePackageUrl);
        }
        if (source.RuntimeEnv != null) {
            this.RuntimeEnv = new String(source.RuntimeEnv);
        }
        if (source.ResourceConfigId != null) {
            this.ResourceConfigId = new String(source.ResourceConfigId);
        }
        if (source.ResourceConfig != null) {
            this.ResourceConfig = new String(source.ResourceConfig);
        }
        if (source.ResourcePartitionId != null) {
            this.ResourcePartitionId = new String(source.ResourcePartitionId);
        }
        if (source.ResourcePartitionName != null) {
            this.ResourcePartitionName = new String(source.ResourcePartitionName);
        }
        if (source.Queue != null) {
            this.Queue = new String(source.Queue);
        }
        if (source.CheckpointMountInfo != null) {
            this.CheckpointMountInfo = new CheckpointMountInfo(source.CheckpointMountInfo);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
        if (source.InstanceCount != null) {
            this.InstanceCount = new Long(source.InstanceCount);
        }
        if (source.HasRunningInstances != null) {
            this.HasRunningInstances = new Boolean(source.HasRunningInstances);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.MlFlowConfig != null) {
            this.MlFlowConfig = new String(source.MlFlowConfig);
        }
        if (source.OutputModelName != null) {
            this.OutputModelName = new String(source.OutputModelName);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.BaseModelUid != null) {
            this.BaseModelUid = new String(source.BaseModelUid);
        }
        if (source.BaseModelName != null) {
            this.BaseModelName = new String(source.BaseModelName);
        }
        if (source.Datasets != null) {
            this.Datasets = new DatasetMount[source.Datasets.length];
            for (int i = 0; i < source.Datasets.length; i++) {
                this.Datasets[i] = new DatasetMount(source.Datasets[i]);
            }
        }
        if (source.LastInstanceStatus != null) {
            this.LastInstanceStatus = new String(source.LastInstanceStatus);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Checkpoint != null) {
            this.Checkpoint = new CheckpointConfig(source.Checkpoint);
        }
        if (source.TuningParams != null) {
            this.TuningParams = new TrainingTuningParams(source.TuningParams);
        }
        if (source.ResumeTraining != null) {
            this.ResumeTraining = new Boolean(source.ResumeTraining);
        }
        if (source.AdvancedOptions != null) {
            this.AdvancedOptions = new String(source.AdvancedOptions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecId", this.SpecId);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Entrypoint", this.Entrypoint);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "ImagePullType", this.ImagePullType);
        this.setParamSimple(map, prefix + "ImagePullPolicy", this.ImagePullPolicy);
        this.setParamSimple(map, prefix + "CodePackageUrl", this.CodePackageUrl);
        this.setParamSimple(map, prefix + "RuntimeEnv", this.RuntimeEnv);
        this.setParamSimple(map, prefix + "ResourceConfigId", this.ResourceConfigId);
        this.setParamSimple(map, prefix + "ResourceConfig", this.ResourceConfig);
        this.setParamSimple(map, prefix + "ResourcePartitionId", this.ResourcePartitionId);
        this.setParamSimple(map, prefix + "ResourcePartitionName", this.ResourcePartitionName);
        this.setParamSimple(map, prefix + "Queue", this.Queue);
        this.setParamObj(map, prefix + "CheckpointMountInfo.", this.CheckpointMountInfo);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "HasRunningInstances", this.HasRunningInstances);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "MlFlowConfig", this.MlFlowConfig);
        this.setParamSimple(map, prefix + "OutputModelName", this.OutputModelName);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "BaseModelUid", this.BaseModelUid);
        this.setParamSimple(map, prefix + "BaseModelName", this.BaseModelName);
        this.setParamArrayObj(map, prefix + "Datasets.", this.Datasets);
        this.setParamSimple(map, prefix + "LastInstanceStatus", this.LastInstanceStatus);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "Checkpoint.", this.Checkpoint);
        this.setParamObj(map, prefix + "TuningParams.", this.TuningParams);
        this.setParamSimple(map, prefix + "ResumeTraining", this.ResumeTraining);
        this.setParamSimple(map, prefix + "AdvancedOptions", this.AdvancedOptions);

    }
}

