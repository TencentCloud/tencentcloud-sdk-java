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

public class SubmitTrainingJobRequest extends AbstractModel {

    /**
    * <p>训练作业配置名称（≤255 字符）</p>
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * <p>描述（≤1024 字符）</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>启动命令</p>
    */
    @SerializedName("Entrypoint")
    @Expose
    private String Entrypoint;

    /**
    * <p>镜像地址</p>
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>镜像拉取类型（BuiltIn: 内置, Custom: 自定义-TCR, CustomCcr: 自定义-CCR）</p>
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
    */
    @SerializedName("CodePackageUrl")
    @Expose
    private String CodePackageUrl;

    /**
    * <p>Ray runtime_env 配置 JSON（含 pip 依赖、env_vars 等，结构参见 2.1）</p>
    */
    @SerializedName("RuntimeEnv")
    @Expose
    private String RuntimeEnv;

    /**
    * <p>资源配置模板 ID(可选)</p>
    */
    @SerializedName("ResourceConfigId")
    @Expose
    private String ResourceConfigId;

    /**
    * <p>资源配置 JSON</p>
    */
    @SerializedName("ResourceConfig")
    @Expose
    private String ResourceConfig;

    /**
    * <p>资源分区 ID</p>
    */
    @SerializedName("ResourcePartitionId")
    @Expose
    private String ResourcePartitionId;

    /**
    * <p>队列名称</p>
    */
    @SerializedName("Queue")
    @Expose
    private String Queue;

    /**
    * <p>存储卷挂载配置 JSON（含 Source 字段标记用途）</p>
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * <p>高级参数 JSON（不传则不更新）</p>
    */
    @SerializedName("AdvancedOptions")
    @Expose
    private String AdvancedOptions;

    /**
    * <p>基础模型Uid</p>
    */
    @SerializedName("BaseModelUid")
    @Expose
    private String BaseModelUid;

    /**
    * <p>算法模式：sft / dpo / cpt / grpo（仅 POST_TRAINING 必填，CUSTOM_CODE / LAB 禁止传入）</p>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>数据集挂载列表（元素含 DatasetId 或 Catalog 二选一 + DatasetName + Eval 属性）</p>
    */
    @SerializedName("Datasets")
    @Expose
    private DatasetMount [] Datasets;

    /**
    * <p>Checkpoint 产出配置（POST_TRAINING 必填；CUSTOM_CODE / LAB 可选）</p>
    */
    @SerializedName("Checkpoint")
    @Expose
    private CheckpointConfig Checkpoint;

    /**
    * <p>是否启用断点续训</p>
    */
    @SerializedName("ResumeTraining")
    @Expose
    private Boolean ResumeTraining;

    /**
    * <p>调优参数（高级参数，仅 POST_TRAINING 使用；CUSTOM_CODE / LAB 禁止传入）</p>
    */
    @SerializedName("TuningParams")
    @Expose
    private TrainingTuningParams TuningParams;

    /**
    * <p>作业优先级（1-9，数字越大优先级越高）</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * <p>提交来源标签：LAB / CUSTOM_CODE（可选，用于溯源，不影响处理逻辑）</p>
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * <p>MlFlow 实验追踪配置（可选，不传则不启用 MlFlow）</p>
    */
    @SerializedName("MlFlowConfig")
    @Expose
    private MlFlowConfig MlFlowConfig;

    /**
    * <p>标签列表（TagKey-TagValue），用于将任务与腾讯云标签系统中的标签绑定</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>产出模型名称（用于后续模型注册，当前仅保存）</p>
    */
    @SerializedName("OutputModelName")
    @Expose
    private String OutputModelName;

    /**
     * Get <p>训练作业配置名称（≤255 字符）</p> 
     * @return SpecName <p>训练作业配置名称（≤255 字符）</p>
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set <p>训练作业配置名称（≤255 字符）</p>
     * @param SpecName <p>训练作业配置名称（≤255 字符）</p>
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get <p>描述（≤1024 字符）</p> 
     * @return Description <p>描述（≤1024 字符）</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述（≤1024 字符）</p>
     * @param Description <p>描述（≤1024 字符）</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>启动命令</p> 
     * @return Entrypoint <p>启动命令</p>
     */
    public String getEntrypoint() {
        return this.Entrypoint;
    }

    /**
     * Set <p>启动命令</p>
     * @param Entrypoint <p>启动命令</p>
     */
    public void setEntrypoint(String Entrypoint) {
        this.Entrypoint = Entrypoint;
    }

    /**
     * Get <p>镜像地址</p> 
     * @return Image <p>镜像地址</p>
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set <p>镜像地址</p>
     * @param Image <p>镜像地址</p>
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get <p>镜像拉取类型（BuiltIn: 内置, Custom: 自定义-TCR, CustomCcr: 自定义-CCR）</p> 
     * @return ImagePullType <p>镜像拉取类型（BuiltIn: 内置, Custom: 自定义-TCR, CustomCcr: 自定义-CCR）</p>
     */
    public String getImagePullType() {
        return this.ImagePullType;
    }

    /**
     * Set <p>镜像拉取类型（BuiltIn: 内置, Custom: 自定义-TCR, CustomCcr: 自定义-CCR）</p>
     * @param ImagePullType <p>镜像拉取类型（BuiltIn: 内置, Custom: 自定义-TCR, CustomCcr: 自定义-CCR）</p>
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
     * @return CodePackageUrl <p>代码包 COS URL</p>
     */
    public String getCodePackageUrl() {
        return this.CodePackageUrl;
    }

    /**
     * Set <p>代码包 COS URL</p>
     * @param CodePackageUrl <p>代码包 COS URL</p>
     */
    public void setCodePackageUrl(String CodePackageUrl) {
        this.CodePackageUrl = CodePackageUrl;
    }

    /**
     * Get <p>Ray runtime_env 配置 JSON（含 pip 依赖、env_vars 等，结构参见 2.1）</p> 
     * @return RuntimeEnv <p>Ray runtime_env 配置 JSON（含 pip 依赖、env_vars 等，结构参见 2.1）</p>
     */
    public String getRuntimeEnv() {
        return this.RuntimeEnv;
    }

    /**
     * Set <p>Ray runtime_env 配置 JSON（含 pip 依赖、env_vars 等，结构参见 2.1）</p>
     * @param RuntimeEnv <p>Ray runtime_env 配置 JSON（含 pip 依赖、env_vars 等，结构参见 2.1）</p>
     */
    public void setRuntimeEnv(String RuntimeEnv) {
        this.RuntimeEnv = RuntimeEnv;
    }

    /**
     * Get <p>资源配置模板 ID(可选)</p> 
     * @return ResourceConfigId <p>资源配置模板 ID(可选)</p>
     */
    public String getResourceConfigId() {
        return this.ResourceConfigId;
    }

    /**
     * Set <p>资源配置模板 ID(可选)</p>
     * @param ResourceConfigId <p>资源配置模板 ID(可选)</p>
     */
    public void setResourceConfigId(String ResourceConfigId) {
        this.ResourceConfigId = ResourceConfigId;
    }

    /**
     * Get <p>资源配置 JSON</p> 
     * @return ResourceConfig <p>资源配置 JSON</p>
     */
    public String getResourceConfig() {
        return this.ResourceConfig;
    }

    /**
     * Set <p>资源配置 JSON</p>
     * @param ResourceConfig <p>资源配置 JSON</p>
     */
    public void setResourceConfig(String ResourceConfig) {
        this.ResourceConfig = ResourceConfig;
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
     * Get <p>存储卷挂载配置 JSON（含 Source 字段标记用途）</p> 
     * @return Catalog <p>存储卷挂载配置 JSON（含 Source 字段标记用途）</p>
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set <p>存储卷挂载配置 JSON（含 Source 字段标记用途）</p>
     * @param Catalog <p>存储卷挂载配置 JSON（含 Source 字段标记用途）</p>
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get <p>高级参数 JSON（不传则不更新）</p> 
     * @return AdvancedOptions <p>高级参数 JSON（不传则不更新）</p>
     */
    public String getAdvancedOptions() {
        return this.AdvancedOptions;
    }

    /**
     * Set <p>高级参数 JSON（不传则不更新）</p>
     * @param AdvancedOptions <p>高级参数 JSON（不传则不更新）</p>
     */
    public void setAdvancedOptions(String AdvancedOptions) {
        this.AdvancedOptions = AdvancedOptions;
    }

    /**
     * Get <p>基础模型Uid</p> 
     * @return BaseModelUid <p>基础模型Uid</p>
     */
    public String getBaseModelUid() {
        return this.BaseModelUid;
    }

    /**
     * Set <p>基础模型Uid</p>
     * @param BaseModelUid <p>基础模型Uid</p>
     */
    public void setBaseModelUid(String BaseModelUid) {
        this.BaseModelUid = BaseModelUid;
    }

    /**
     * Get <p>算法模式：sft / dpo / cpt / grpo（仅 POST_TRAINING 必填，CUSTOM_CODE / LAB 禁止传入）</p> 
     * @return Mode <p>算法模式：sft / dpo / cpt / grpo（仅 POST_TRAINING 必填，CUSTOM_CODE / LAB 禁止传入）</p>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>算法模式：sft / dpo / cpt / grpo（仅 POST_TRAINING 必填，CUSTOM_CODE / LAB 禁止传入）</p>
     * @param Mode <p>算法模式：sft / dpo / cpt / grpo（仅 POST_TRAINING 必填，CUSTOM_CODE / LAB 禁止传入）</p>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>数据集挂载列表（元素含 DatasetId 或 Catalog 二选一 + DatasetName + Eval 属性）</p> 
     * @return Datasets <p>数据集挂载列表（元素含 DatasetId 或 Catalog 二选一 + DatasetName + Eval 属性）</p>
     */
    public DatasetMount [] getDatasets() {
        return this.Datasets;
    }

    /**
     * Set <p>数据集挂载列表（元素含 DatasetId 或 Catalog 二选一 + DatasetName + Eval 属性）</p>
     * @param Datasets <p>数据集挂载列表（元素含 DatasetId 或 Catalog 二选一 + DatasetName + Eval 属性）</p>
     */
    public void setDatasets(DatasetMount [] Datasets) {
        this.Datasets = Datasets;
    }

    /**
     * Get <p>Checkpoint 产出配置（POST_TRAINING 必填；CUSTOM_CODE / LAB 可选）</p> 
     * @return Checkpoint <p>Checkpoint 产出配置（POST_TRAINING 必填；CUSTOM_CODE / LAB 可选）</p>
     */
    public CheckpointConfig getCheckpoint() {
        return this.Checkpoint;
    }

    /**
     * Set <p>Checkpoint 产出配置（POST_TRAINING 必填；CUSTOM_CODE / LAB 可选）</p>
     * @param Checkpoint <p>Checkpoint 产出配置（POST_TRAINING 必填；CUSTOM_CODE / LAB 可选）</p>
     */
    public void setCheckpoint(CheckpointConfig Checkpoint) {
        this.Checkpoint = Checkpoint;
    }

    /**
     * Get <p>是否启用断点续训</p> 
     * @return ResumeTraining <p>是否启用断点续训</p>
     */
    public Boolean getResumeTraining() {
        return this.ResumeTraining;
    }

    /**
     * Set <p>是否启用断点续训</p>
     * @param ResumeTraining <p>是否启用断点续训</p>
     */
    public void setResumeTraining(Boolean ResumeTraining) {
        this.ResumeTraining = ResumeTraining;
    }

    /**
     * Get <p>调优参数（高级参数，仅 POST_TRAINING 使用；CUSTOM_CODE / LAB 禁止传入）</p> 
     * @return TuningParams <p>调优参数（高级参数，仅 POST_TRAINING 使用；CUSTOM_CODE / LAB 禁止传入）</p>
     */
    public TrainingTuningParams getTuningParams() {
        return this.TuningParams;
    }

    /**
     * Set <p>调优参数（高级参数，仅 POST_TRAINING 使用；CUSTOM_CODE / LAB 禁止传入）</p>
     * @param TuningParams <p>调优参数（高级参数，仅 POST_TRAINING 使用；CUSTOM_CODE / LAB 禁止传入）</p>
     */
    public void setTuningParams(TrainingTuningParams TuningParams) {
        this.TuningParams = TuningParams;
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
     * Get <p>提交来源标签：LAB / CUSTOM_CODE（可选，用于溯源，不影响处理逻辑）</p> 
     * @return Kind <p>提交来源标签：LAB / CUSTOM_CODE（可选，用于溯源，不影响处理逻辑）</p>
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set <p>提交来源标签：LAB / CUSTOM_CODE（可选，用于溯源，不影响处理逻辑）</p>
     * @param Kind <p>提交来源标签：LAB / CUSTOM_CODE（可选，用于溯源，不影响处理逻辑）</p>
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get <p>MlFlow 实验追踪配置（可选，不传则不启用 MlFlow）</p> 
     * @return MlFlowConfig <p>MlFlow 实验追踪配置（可选，不传则不启用 MlFlow）</p>
     */
    public MlFlowConfig getMlFlowConfig() {
        return this.MlFlowConfig;
    }

    /**
     * Set <p>MlFlow 实验追踪配置（可选，不传则不启用 MlFlow）</p>
     * @param MlFlowConfig <p>MlFlow 实验追踪配置（可选，不传则不启用 MlFlow）</p>
     */
    public void setMlFlowConfig(MlFlowConfig MlFlowConfig) {
        this.MlFlowConfig = MlFlowConfig;
    }

    /**
     * Get <p>标签列表（TagKey-TagValue），用于将任务与腾讯云标签系统中的标签绑定</p> 
     * @return Tags <p>标签列表（TagKey-TagValue），用于将任务与腾讯云标签系统中的标签绑定</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表（TagKey-TagValue），用于将任务与腾讯云标签系统中的标签绑定</p>
     * @param Tags <p>标签列表（TagKey-TagValue），用于将任务与腾讯云标签系统中的标签绑定</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>产出模型名称（用于后续模型注册，当前仅保存）</p> 
     * @return OutputModelName <p>产出模型名称（用于后续模型注册，当前仅保存）</p>
     */
    public String getOutputModelName() {
        return this.OutputModelName;
    }

    /**
     * Set <p>产出模型名称（用于后续模型注册，当前仅保存）</p>
     * @param OutputModelName <p>产出模型名称（用于后续模型注册，当前仅保存）</p>
     */
    public void setOutputModelName(String OutputModelName) {
        this.OutputModelName = OutputModelName;
    }

    public SubmitTrainingJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitTrainingJobRequest(SubmitTrainingJobRequest source) {
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
        if (source.Queue != null) {
            this.Queue = new String(source.Queue);
        }
        if (source.Catalog != null) {
            this.Catalog = new String(source.Catalog);
        }
        if (source.AdvancedOptions != null) {
            this.AdvancedOptions = new String(source.AdvancedOptions);
        }
        if (source.BaseModelUid != null) {
            this.BaseModelUid = new String(source.BaseModelUid);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
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
        if (source.ResumeTraining != null) {
            this.ResumeTraining = new Boolean(source.ResumeTraining);
        }
        if (source.TuningParams != null) {
            this.TuningParams = new TrainingTuningParams(source.TuningParams);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.MlFlowConfig != null) {
            this.MlFlowConfig = new MlFlowConfig(source.MlFlowConfig);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.OutputModelName != null) {
            this.OutputModelName = new String(source.OutputModelName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Entrypoint", this.Entrypoint);
        this.setParamSimple(map, prefix + "Image", this.Image);
        this.setParamSimple(map, prefix + "ImagePullType", this.ImagePullType);
        this.setParamSimple(map, prefix + "ImagePullPolicy", this.ImagePullPolicy);
        this.setParamSimple(map, prefix + "CodePackageUrl", this.CodePackageUrl);
        this.setParamSimple(map, prefix + "RuntimeEnv", this.RuntimeEnv);
        this.setParamSimple(map, prefix + "ResourceConfigId", this.ResourceConfigId);
        this.setParamSimple(map, prefix + "ResourceConfig", this.ResourceConfig);
        this.setParamSimple(map, prefix + "ResourcePartitionId", this.ResourcePartitionId);
        this.setParamSimple(map, prefix + "Queue", this.Queue);
        this.setParamSimple(map, prefix + "Catalog", this.Catalog);
        this.setParamSimple(map, prefix + "AdvancedOptions", this.AdvancedOptions);
        this.setParamSimple(map, prefix + "BaseModelUid", this.BaseModelUid);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArrayObj(map, prefix + "Datasets.", this.Datasets);
        this.setParamObj(map, prefix + "Checkpoint.", this.Checkpoint);
        this.setParamSimple(map, prefix + "ResumeTraining", this.ResumeTraining);
        this.setParamObj(map, prefix + "TuningParams.", this.TuningParams);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamObj(map, prefix + "MlFlowConfig.", this.MlFlowConfig);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "OutputModelName", this.OutputModelName);

    }
}

