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

public class TrainingJobInstance extends AbstractModel {

    /**
    * <p>实例 ID（即 RayJob UUID）</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>关联配置 ID</p>
    */
    @SerializedName("SpecId")
    @Expose
    private String SpecId;

    /**
    * <p>配置名称</p>
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * <p>作业优先级（1-9，数字越大优先级越高）</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * <p>综合状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>错误信息</p>
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * <p>RayJob 实际启动时间（毫秒）</p>
    */
    @SerializedName("JobCreateTime")
    @Expose
    private Long JobCreateTime;

    /**
    * <p>RayJob 运行时长（毫秒）</p>
    */
    @SerializedName("JobRunningTime")
    @Expose
    private Long JobRunningTime;

    /**
    * <p>Ray Dashboard History 链接</p>
    */
    @SerializedName("HistoryUrl")
    @Expose
    private String HistoryUrl;

    /**
    * <p>创建人</p>
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * <p>创建时间（毫秒时间戳）</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * <p>资源分区 ID</p>
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
    */
    @SerializedName("Queue")
    @Expose
    private String Queue;

    /**
    * <p>提交时 runtime_env JSON</p>
    */
    @SerializedName("RuntimeEnv")
    @Expose
    private String RuntimeEnv;

    /**
    * <p>提交时 entrypoint</p>
    */
    @SerializedName("Entrypoint")
    @Expose
    private String Entrypoint;

    /**
    * <p>提交时镜像</p>
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>提交时资源配置 JSON</p>
    */
    @SerializedName("ResourceConfig")
    @Expose
    private String ResourceConfig;

    /**
    * <p>提交时存储卷挂载配置 JSON</p>
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * <p>提交时高级参数 JSON</p>
    */
    @SerializedName("AdvancedOptions")
    @Expose
    private String AdvancedOptions;

    /**
    * <p>训练子类型快照（LAB / CUSTOM_CODE / POST_TRAINING）</p>
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * <p>提交时代码包 URL</p>
    */
    @SerializedName("CodePackageUrl")
    @Expose
    private String CodePackageUrl;

    /**
    * <p>提交时 MLflow 配置 JSON</p>
    */
    @SerializedName("MlFlowConfig")
    @Expose
    private String MlFlowConfig;

    /**
    * <p>Checkpoint 挂载摘要（实例级）</p>
    */
    @SerializedName("CheckpointMountInfo")
    @Expose
    private CheckpointMountInfo CheckpointMountInfo;

    /**
    * <p>训练方式（sft / dpo / cpt / grpo），仅 POST_TRAINING 有值</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>基础模型 modelUid（仅 POST_TRAINING 有值，用于关联推理模型仓库）</p>
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
    * <p>标签列表（TagKey-TagValue）</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>创建实例时的数据集挂载列表快照（List&lt;DatasetMount&gt;，仅详情返回）</p>
    */
    @SerializedName("Datasets")
    @Expose
    private DatasetMount [] Datasets;

    /**
    * <p>创建实例时的 Checkpoint 产出配置快照（仅详情返回）</p>
    */
    @SerializedName("Checkpoint")
    @Expose
    private CheckpointConfig Checkpoint;

    /**
    * <p>创建实例时的调优参数快照（仅 POST_TRAINING，仅详情返回）</p>
    */
    @SerializedName("TuningParams")
    @Expose
    private TrainingTuningParams TuningParams;

    /**
    * <p>创建实例时的断点续训意图声明快照（仅详情返回）</p>
    */
    @SerializedName("ResumeTraining")
    @Expose
    private Boolean ResumeTraining;

    /**
     * Get <p>实例 ID（即 RayJob UUID）</p> 
     * @return InstanceId <p>实例 ID（即 RayJob UUID）</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID（即 RayJob UUID）</p>
     * @param InstanceId <p>实例 ID（即 RayJob UUID）</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>关联配置 ID</p> 
     * @return SpecId <p>关联配置 ID</p>
     */
    public String getSpecId() {
        return this.SpecId;
    }

    /**
     * Set <p>关联配置 ID</p>
     * @param SpecId <p>关联配置 ID</p>
     */
    public void setSpecId(String SpecId) {
        this.SpecId = SpecId;
    }

    /**
     * Get <p>配置名称</p> 
     * @return SpecName <p>配置名称</p>
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set <p>配置名称</p>
     * @param SpecName <p>配置名称</p>
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get <p>作业优先级（1-9，数字越大优先级越高）</p> 
     * @return Priority <p>作业优先级（1-9，数字越大优先级越高）</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>作业优先级（1-9，数字越大优先级越高）</p>
     * @param Priority <p>作业优先级（1-9，数字越大优先级越高）</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>综合状态</p> 
     * @return Status <p>综合状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>综合状态</p>
     * @param Status <p>综合状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>错误信息</p> 
     * @return ErrorMessage <p>错误信息</p>
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>错误信息</p>
     * @param ErrorMessage <p>错误信息</p>
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get <p>RayJob 实际启动时间（毫秒）</p> 
     * @return JobCreateTime <p>RayJob 实际启动时间（毫秒）</p>
     */
    public Long getJobCreateTime() {
        return this.JobCreateTime;
    }

    /**
     * Set <p>RayJob 实际启动时间（毫秒）</p>
     * @param JobCreateTime <p>RayJob 实际启动时间（毫秒）</p>
     */
    public void setJobCreateTime(Long JobCreateTime) {
        this.JobCreateTime = JobCreateTime;
    }

    /**
     * Get <p>RayJob 运行时长（毫秒）</p> 
     * @return JobRunningTime <p>RayJob 运行时长（毫秒）</p>
     */
    public Long getJobRunningTime() {
        return this.JobRunningTime;
    }

    /**
     * Set <p>RayJob 运行时长（毫秒）</p>
     * @param JobRunningTime <p>RayJob 运行时长（毫秒）</p>
     */
    public void setJobRunningTime(Long JobRunningTime) {
        this.JobRunningTime = JobRunningTime;
    }

    /**
     * Get <p>Ray Dashboard History 链接</p> 
     * @return HistoryUrl <p>Ray Dashboard History 链接</p>
     */
    public String getHistoryUrl() {
        return this.HistoryUrl;
    }

    /**
     * Set <p>Ray Dashboard History 链接</p>
     * @param HistoryUrl <p>Ray Dashboard History 链接</p>
     */
    public void setHistoryUrl(String HistoryUrl) {
        this.HistoryUrl = HistoryUrl;
    }

    /**
     * Get <p>创建人</p> 
     * @return Creator <p>创建人</p>
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>创建人</p>
     * @param Creator <p>创建人</p>
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>创建时间（毫秒时间戳）</p> 
     * @return CreateTime <p>创建时间（毫秒时间戳）</p>
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间（毫秒时间戳）</p>
     * @param CreateTime <p>创建时间（毫秒时间戳）</p>
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>资源分区 ID</p> 
     * @return ResourcePartitionId <p>资源分区 ID</p>
     */
    public String getResourcePartitionId() {
        return this.ResourcePartitionId;
    }

    /**
     * Set <p>资源分区 ID</p>
     * @param ResourcePartitionId <p>资源分区 ID</p>
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
     * @return Queue <p>队列名称</p>
     */
    public String getQueue() {
        return this.Queue;
    }

    /**
     * Set <p>队列名称</p>
     * @param Queue <p>队列名称</p>
     */
    public void setQueue(String Queue) {
        this.Queue = Queue;
    }

    /**
     * Get <p>提交时 runtime_env JSON</p> 
     * @return RuntimeEnv <p>提交时 runtime_env JSON</p>
     */
    public String getRuntimeEnv() {
        return this.RuntimeEnv;
    }

    /**
     * Set <p>提交时 runtime_env JSON</p>
     * @param RuntimeEnv <p>提交时 runtime_env JSON</p>
     */
    public void setRuntimeEnv(String RuntimeEnv) {
        this.RuntimeEnv = RuntimeEnv;
    }

    /**
     * Get <p>提交时 entrypoint</p> 
     * @return Entrypoint <p>提交时 entrypoint</p>
     */
    public String getEntrypoint() {
        return this.Entrypoint;
    }

    /**
     * Set <p>提交时 entrypoint</p>
     * @param Entrypoint <p>提交时 entrypoint</p>
     */
    public void setEntrypoint(String Entrypoint) {
        this.Entrypoint = Entrypoint;
    }

    /**
     * Get <p>提交时镜像</p> 
     * @return Image <p>提交时镜像</p>
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set <p>提交时镜像</p>
     * @param Image <p>提交时镜像</p>
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get <p>提交时资源配置 JSON</p> 
     * @return ResourceConfig <p>提交时资源配置 JSON</p>
     */
    public String getResourceConfig() {
        return this.ResourceConfig;
    }

    /**
     * Set <p>提交时资源配置 JSON</p>
     * @param ResourceConfig <p>提交时资源配置 JSON</p>
     */
    public void setResourceConfig(String ResourceConfig) {
        this.ResourceConfig = ResourceConfig;
    }

    /**
     * Get <p>提交时存储卷挂载配置 JSON</p> 
     * @return Catalog <p>提交时存储卷挂载配置 JSON</p>
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set <p>提交时存储卷挂载配置 JSON</p>
     * @param Catalog <p>提交时存储卷挂载配置 JSON</p>
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get <p>提交时高级参数 JSON</p> 
     * @return AdvancedOptions <p>提交时高级参数 JSON</p>
     */
    public String getAdvancedOptions() {
        return this.AdvancedOptions;
    }

    /**
     * Set <p>提交时高级参数 JSON</p>
     * @param AdvancedOptions <p>提交时高级参数 JSON</p>
     */
    public void setAdvancedOptions(String AdvancedOptions) {
        this.AdvancedOptions = AdvancedOptions;
    }

    /**
     * Get <p>训练子类型快照（LAB / CUSTOM_CODE / POST_TRAINING）</p> 
     * @return Kind <p>训练子类型快照（LAB / CUSTOM_CODE / POST_TRAINING）</p>
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set <p>训练子类型快照（LAB / CUSTOM_CODE / POST_TRAINING）</p>
     * @param Kind <p>训练子类型快照（LAB / CUSTOM_CODE / POST_TRAINING）</p>
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get <p>提交时代码包 URL</p> 
     * @return CodePackageUrl <p>提交时代码包 URL</p>
     */
    public String getCodePackageUrl() {
        return this.CodePackageUrl;
    }

    /**
     * Set <p>提交时代码包 URL</p>
     * @param CodePackageUrl <p>提交时代码包 URL</p>
     */
    public void setCodePackageUrl(String CodePackageUrl) {
        this.CodePackageUrl = CodePackageUrl;
    }

    /**
     * Get <p>提交时 MLflow 配置 JSON</p> 
     * @return MlFlowConfig <p>提交时 MLflow 配置 JSON</p>
     */
    public String getMlFlowConfig() {
        return this.MlFlowConfig;
    }

    /**
     * Set <p>提交时 MLflow 配置 JSON</p>
     * @param MlFlowConfig <p>提交时 MLflow 配置 JSON</p>
     */
    public void setMlFlowConfig(String MlFlowConfig) {
        this.MlFlowConfig = MlFlowConfig;
    }

    /**
     * Get <p>Checkpoint 挂载摘要（实例级）</p> 
     * @return CheckpointMountInfo <p>Checkpoint 挂载摘要（实例级）</p>
     */
    public CheckpointMountInfo getCheckpointMountInfo() {
        return this.CheckpointMountInfo;
    }

    /**
     * Set <p>Checkpoint 挂载摘要（实例级）</p>
     * @param CheckpointMountInfo <p>Checkpoint 挂载摘要（实例级）</p>
     */
    public void setCheckpointMountInfo(CheckpointMountInfo CheckpointMountInfo) {
        this.CheckpointMountInfo = CheckpointMountInfo;
    }

    /**
     * Get <p>训练方式（sft / dpo / cpt / grpo），仅 POST_TRAINING 有值</p> 
     * @return Mode <p>训练方式（sft / dpo / cpt / grpo），仅 POST_TRAINING 有值</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>训练方式（sft / dpo / cpt / grpo），仅 POST_TRAINING 有值</p>
     * @param Mode <p>训练方式（sft / dpo / cpt / grpo），仅 POST_TRAINING 有值</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>基础模型 modelUid（仅 POST_TRAINING 有值，用于关联推理模型仓库）</p> 
     * @return BaseModelUid <p>基础模型 modelUid（仅 POST_TRAINING 有值，用于关联推理模型仓库）</p>
     */
    public String getBaseModelUid() {
        return this.BaseModelUid;
    }

    /**
     * Set <p>基础模型 modelUid（仅 POST_TRAINING 有值，用于关联推理模型仓库）</p>
     * @param BaseModelUid <p>基础模型 modelUid（仅 POST_TRAINING 有值，用于关联推理模型仓库）</p>
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
     * Get <p>创建实例时的数据集挂载列表快照（List&lt;DatasetMount&gt;，仅详情返回）</p> 
     * @return Datasets <p>创建实例时的数据集挂载列表快照（List&lt;DatasetMount&gt;，仅详情返回）</p>
     */
    public DatasetMount [] getDatasets() {
        return this.Datasets;
    }

    /**
     * Set <p>创建实例时的数据集挂载列表快照（List&lt;DatasetMount&gt;，仅详情返回）</p>
     * @param Datasets <p>创建实例时的数据集挂载列表快照（List&lt;DatasetMount&gt;，仅详情返回）</p>
     */
    public void setDatasets(DatasetMount [] Datasets) {
        this.Datasets = Datasets;
    }

    /**
     * Get <p>创建实例时的 Checkpoint 产出配置快照（仅详情返回）</p> 
     * @return Checkpoint <p>创建实例时的 Checkpoint 产出配置快照（仅详情返回）</p>
     */
    public CheckpointConfig getCheckpoint() {
        return this.Checkpoint;
    }

    /**
     * Set <p>创建实例时的 Checkpoint 产出配置快照（仅详情返回）</p>
     * @param Checkpoint <p>创建实例时的 Checkpoint 产出配置快照（仅详情返回）</p>
     */
    public void setCheckpoint(CheckpointConfig Checkpoint) {
        this.Checkpoint = Checkpoint;
    }

    /**
     * Get <p>创建实例时的调优参数快照（仅 POST_TRAINING，仅详情返回）</p> 
     * @return TuningParams <p>创建实例时的调优参数快照（仅 POST_TRAINING，仅详情返回）</p>
     */
    public TrainingTuningParams getTuningParams() {
        return this.TuningParams;
    }

    /**
     * Set <p>创建实例时的调优参数快照（仅 POST_TRAINING，仅详情返回）</p>
     * @param TuningParams <p>创建实例时的调优参数快照（仅 POST_TRAINING，仅详情返回）</p>
     */
    public void setTuningParams(TrainingTuningParams TuningParams) {
        this.TuningParams = TuningParams;
    }

    /**
     * Get <p>创建实例时的断点续训意图声明快照（仅详情返回）</p> 
     * @return ResumeTraining <p>创建实例时的断点续训意图声明快照（仅详情返回）</p>
     */
    public Boolean getResumeTraining() {
        return this.ResumeTraining;
    }

    /**
     * Set <p>创建实例时的断点续训意图声明快照（仅详情返回）</p>
     * @param ResumeTraining <p>创建实例时的断点续训意图声明快照（仅详情返回）</p>
     */
    public void setResumeTraining(Boolean ResumeTraining) {
        this.ResumeTraining = ResumeTraining;
    }

    public TrainingJobInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrainingJobInstance(TrainingJobInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.SpecId != null) {
            this.SpecId = new String(source.SpecId);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.JobCreateTime != null) {
            this.JobCreateTime = new Long(source.JobCreateTime);
        }
        if (source.JobRunningTime != null) {
            this.JobRunningTime = new Long(source.JobRunningTime);
        }
        if (source.HistoryUrl != null) {
            this.HistoryUrl = new String(source.HistoryUrl);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
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
        if (source.RuntimeEnv != null) {
            this.RuntimeEnv = new String(source.RuntimeEnv);
        }
        if (source.Entrypoint != null) {
            this.Entrypoint = new String(source.Entrypoint);
        }
        if (source.Image != null) {
            this.Image = new String(source.Image);
        }
        if (source.ResourceConfig != null) {
            this.ResourceConfig = new String(source.ResourceConfig);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.AdvancedOptions != null) {
            this.AdvancedOptions = new String(source.AdvancedOptions);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.CodePackageUrl != null) {
            this.CodePackageUrl = new String(source.CodePackageUrl);
        }
        if (source.MlFlowConfig != null) {
            this.MlFlowConfig = new String(source.MlFlowConfig);
        }
        if (source.CheckpointMountInfo != null) {
            this.CheckpointMountInfo = new CheckpointMountInfo(source.CheckpointMountInfo);
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
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.Datasets != null) {
            this.Datasets = new DatasetMount[source.Datasets.length];
            for (int i = 0; i < source.Datasets.length; i++) {
                this.Datasets[i] = new DatasetMount(source.Datasets[i]);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "SpecId", this.SpecId);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "JobCreateTime", this.JobCreateTime);
        this.setParamSimple(map, prefix + "JobRunningTime", this.JobRunningTime);
        this.setParamSimple(map, prefix + "HistoryUrl", this.HistoryUrl);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ResourcePartitionId", this.ResourcePartitionId);
        this.setParamSimple(map, prefix + "ResourcePartitionName", this.ResourcePartitionName);
        this.setParamSimple(map, prefix + "Queue", this.Queue);
        this.setParamSimple(map, prefix + "RuntimeEnv", this.RuntimeEnv);
        this.setParamSimple(map, prefix + "Entrypoint", this.Entrypoint);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "ResourceConfig", this.ResourceConfig);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "AdvancedOptions", this.AdvancedOptions);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "CodePackageUrl", this.CodePackageUrl);
        this.setParamSimple(map, prefix + "MlFlowConfig", this.MlFlowConfig);
        this.setParamObj(map, prefix + "CheckpointMountInfo.", this.CheckpointMountInfo);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "BaseModelUid", this.BaseModelUid);
        this.setParamSimple(map, prefix + "BaseModelName", this.BaseModelName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArrayObj(map, prefix + "Datasets.", this.Datasets);
        this.setParamObj(map, prefix + "Checkpoint.", this.Checkpoint);
        this.setParamObj(map, prefix + "TuningParams.", this.TuningParams);
        this.setParamSimple(map, prefix + "ResumeTraining", this.ResumeTraining);

    }
}

