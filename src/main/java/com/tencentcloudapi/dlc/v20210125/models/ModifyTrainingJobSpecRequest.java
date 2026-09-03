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

public class ModifyTrainingJobSpecRequest extends AbstractModel {

    /**
    * <p>配置 ID</p>
    */
    @SerializedName("SpecId")
    @Expose
    private String SpecId;

    /**
    * <p>配置名称（不传则不更新）</p>
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * <p>配置描述（不传则不更新）</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>启动命令（不传则不更新）</p>
    */
    @SerializedName("Entrypoint")
    @Expose
    private String Entrypoint;

    /**
    * <p>镜像地址（不传则不更新）</p>
    */
    @SerializedName("Image")
    @Expose
    private String Image;

    /**
    * <p>镜像拉取类型（BuiltIn / Custom / CustomCcr，不传则不更新）</p>
    */
    @SerializedName("ImagePullType")
    @Expose
    private String ImagePullType;

    /**
    * <p>镜像拉取策略（Always / IfNotPresent / Never，不传则不更新）</p>
    */
    @SerializedName("ImagePullPolicy")
    @Expose
    private String ImagePullPolicy;

    /**
    * <p>代码包 COS URL（不传则不更新）</p>
    */
    @SerializedName("CodePackageUrl")
    @Expose
    private String CodePackageUrl;

    /**
    * <p>运行时环境配置 JSON（不传则不更新）</p>
    */
    @SerializedName("RuntimeEnv")
    @Expose
    private String RuntimeEnv;

    /**
    * <p>资源配置模板 ID（可选）</p>
    */
    @SerializedName("ResourceConfigId")
    @Expose
    private String ResourceConfigId;

    /**
    * <p>资源配置 JSON（不传则不更新）</p>
    */
    @SerializedName("ResourceConfig")
    @Expose
    private String ResourceConfig;

    /**
    * <p>资源分区 ID（不传则不更新）</p>
    */
    @SerializedName("ResourcePartitionId")
    @Expose
    private String ResourcePartitionId;

    /**
    * <p>队列名称（不传则不更新）</p>
    */
    @SerializedName("Queue")
    @Expose
    private String Queue;

    /**
    * <p>存储卷挂载配置 JSON（不传则不更新）</p>
    */
    @SerializedName("Catalog")
    @Expose
    private String Catalog;

    /**
    * <p>作业优先级 1-9（不传则不更新）</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * <p>高级参数 JSON（不传则不更新）</p>
    */
    @SerializedName("AdvancedOptions")
    @Expose
    private String AdvancedOptions;

    /**
    * <p>MlFlow 实验追踪配置（不传则不更新）</p>
    */
    @SerializedName("MlFlowConfig")
    @Expose
    private MlFlowConfig MlFlowConfig;

    /**
    * <p>标签列表（TagKey-TagValue），null 不修改，空数组清空，非空全量替换</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>基础模型ID（用于模型挂载）</p>
    */
    @SerializedName("BaseModelUid")
    @Expose
    private String BaseModelUid;

    /**
    * <p>输出模型名（用于产出模型自动注册）</p>
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
    * <p>数据集挂载列表（整体替换，不传则不更新）</p>
    */
    @SerializedName("Datasets")
    @Expose
    private DatasetMount [] Datasets;

    /**
    * <p>Checkpoint 产出配置（整体替换，不传则不更新）</p>
    */
    @SerializedName("Checkpoint")
    @Expose
    private CheckpointConfig Checkpoint;

    /**
    * <p>是否启用断点续训（创建时的意图声明；实际续训由实例级「断点续训」按钮触发，不传则不更新）</p>
    */
    @SerializedName("ResumeTraining")
    @Expose
    private Boolean ResumeTraining;

    /**
    * <p>调优参数（整体替换，未填字段回模板默认值；不传则不更新；仅 POST_TRAINING）</p>
    */
    @SerializedName("TuningParams")
    @Expose
    private TrainingTuningParams TuningParams;

    /**
     * Get <p>配置 ID</p> 
     * @return SpecId <p>配置 ID</p>
     */
    public String getSpecId() {
        return this.SpecId;
    }

    /**
     * Set <p>配置 ID</p>
     * @param SpecId <p>配置 ID</p>
     */
    public void setSpecId(String SpecId) {
        this.SpecId = SpecId;
    }

    /**
     * Get <p>配置名称（不传则不更新）</p> 
     * @return SpecName <p>配置名称（不传则不更新）</p>
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set <p>配置名称（不传则不更新）</p>
     * @param SpecName <p>配置名称（不传则不更新）</p>
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get <p>配置描述（不传则不更新）</p> 
     * @return Description <p>配置描述（不传则不更新）</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>配置描述（不传则不更新）</p>
     * @param Description <p>配置描述（不传则不更新）</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>启动命令（不传则不更新）</p> 
     * @return Entrypoint <p>启动命令（不传则不更新）</p>
     */
    public String getEntrypoint() {
        return this.Entrypoint;
    }

    /**
     * Set <p>启动命令（不传则不更新）</p>
     * @param Entrypoint <p>启动命令（不传则不更新）</p>
     */
    public void setEntrypoint(String Entrypoint) {
        this.Entrypoint = Entrypoint;
    }

    /**
     * Get <p>镜像地址（不传则不更新）</p> 
     * @return Image <p>镜像地址（不传则不更新）</p>
     */
    public String getImage() {
        return this.Image;
    }

    /**
     * Set <p>镜像地址（不传则不更新）</p>
     * @param Image <p>镜像地址（不传则不更新）</p>
     */
    public void setImage(String Image) {
        this.Image = Image;
    }

    /**
     * Get <p>镜像拉取类型（BuiltIn / Custom / CustomCcr，不传则不更新）</p> 
     * @return ImagePullType <p>镜像拉取类型（BuiltIn / Custom / CustomCcr，不传则不更新）</p>
     */
    public String getImagePullType() {
        return this.ImagePullType;
    }

    /**
     * Set <p>镜像拉取类型（BuiltIn / Custom / CustomCcr，不传则不更新）</p>
     * @param ImagePullType <p>镜像拉取类型（BuiltIn / Custom / CustomCcr，不传则不更新）</p>
     */
    public void setImagePullType(String ImagePullType) {
        this.ImagePullType = ImagePullType;
    }

    /**
     * Get <p>镜像拉取策略（Always / IfNotPresent / Never，不传则不更新）</p> 
     * @return ImagePullPolicy <p>镜像拉取策略（Always / IfNotPresent / Never，不传则不更新）</p>
     */
    public String getImagePullPolicy() {
        return this.ImagePullPolicy;
    }

    /**
     * Set <p>镜像拉取策略（Always / IfNotPresent / Never，不传则不更新）</p>
     * @param ImagePullPolicy <p>镜像拉取策略（Always / IfNotPresent / Never，不传则不更新）</p>
     */
    public void setImagePullPolicy(String ImagePullPolicy) {
        this.ImagePullPolicy = ImagePullPolicy;
    }

    /**
     * Get <p>代码包 COS URL（不传则不更新）</p> 
     * @return CodePackageUrl <p>代码包 COS URL（不传则不更新）</p>
     */
    public String getCodePackageUrl() {
        return this.CodePackageUrl;
    }

    /**
     * Set <p>代码包 COS URL（不传则不更新）</p>
     * @param CodePackageUrl <p>代码包 COS URL（不传则不更新）</p>
     */
    public void setCodePackageUrl(String CodePackageUrl) {
        this.CodePackageUrl = CodePackageUrl;
    }

    /**
     * Get <p>运行时环境配置 JSON（不传则不更新）</p> 
     * @return RuntimeEnv <p>运行时环境配置 JSON（不传则不更新）</p>
     */
    public String getRuntimeEnv() {
        return this.RuntimeEnv;
    }

    /**
     * Set <p>运行时环境配置 JSON（不传则不更新）</p>
     * @param RuntimeEnv <p>运行时环境配置 JSON（不传则不更新）</p>
     */
    public void setRuntimeEnv(String RuntimeEnv) {
        this.RuntimeEnv = RuntimeEnv;
    }

    /**
     * Get <p>资源配置模板 ID（可选）</p> 
     * @return ResourceConfigId <p>资源配置模板 ID（可选）</p>
     */
    public String getResourceConfigId() {
        return this.ResourceConfigId;
    }

    /**
     * Set <p>资源配置模板 ID（可选）</p>
     * @param ResourceConfigId <p>资源配置模板 ID（可选）</p>
     */
    public void setResourceConfigId(String ResourceConfigId) {
        this.ResourceConfigId = ResourceConfigId;
    }

    /**
     * Get <p>资源配置 JSON（不传则不更新）</p> 
     * @return ResourceConfig <p>资源配置 JSON（不传则不更新）</p>
     */
    public String getResourceConfig() {
        return this.ResourceConfig;
    }

    /**
     * Set <p>资源配置 JSON（不传则不更新）</p>
     * @param ResourceConfig <p>资源配置 JSON（不传则不更新）</p>
     */
    public void setResourceConfig(String ResourceConfig) {
        this.ResourceConfig = ResourceConfig;
    }

    /**
     * Get <p>资源分区 ID（不传则不更新）</p> 
     * @return ResourcePartitionId <p>资源分区 ID（不传则不更新）</p>
     */
    public String getResourcePartitionId() {
        return this.ResourcePartitionId;
    }

    /**
     * Set <p>资源分区 ID（不传则不更新）</p>
     * @param ResourcePartitionId <p>资源分区 ID（不传则不更新）</p>
     */
    public void setResourcePartitionId(String ResourcePartitionId) {
        this.ResourcePartitionId = ResourcePartitionId;
    }

    /**
     * Get <p>队列名称（不传则不更新）</p> 
     * @return Queue <p>队列名称（不传则不更新）</p>
     */
    public String getQueue() {
        return this.Queue;
    }

    /**
     * Set <p>队列名称（不传则不更新）</p>
     * @param Queue <p>队列名称（不传则不更新）</p>
     */
    public void setQueue(String Queue) {
        this.Queue = Queue;
    }

    /**
     * Get <p>存储卷挂载配置 JSON（不传则不更新）</p> 
     * @return Catalog <p>存储卷挂载配置 JSON（不传则不更新）</p>
     */
    public String getCatalog() {
        return this.Catalog;
    }

    /**
     * Set <p>存储卷挂载配置 JSON（不传则不更新）</p>
     * @param Catalog <p>存储卷挂载配置 JSON（不传则不更新）</p>
     */
    public void setCatalog(String Catalog) {
        this.Catalog = Catalog;
    }

    /**
     * Get <p>作业优先级 1-9（不传则不更新）</p> 
     * @return Priority <p>作业优先级 1-9（不传则不更新）</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>作业优先级 1-9（不传则不更新）</p>
     * @param Priority <p>作业优先级 1-9（不传则不更新）</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
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
     * Get <p>MlFlow 实验追踪配置（不传则不更新）</p> 
     * @return MlFlowConfig <p>MlFlow 实验追踪配置（不传则不更新）</p>
     */
    public MlFlowConfig getMlFlowConfig() {
        return this.MlFlowConfig;
    }

    /**
     * Set <p>MlFlow 实验追踪配置（不传则不更新）</p>
     * @param MlFlowConfig <p>MlFlow 实验追踪配置（不传则不更新）</p>
     */
    public void setMlFlowConfig(MlFlowConfig MlFlowConfig) {
        this.MlFlowConfig = MlFlowConfig;
    }

    /**
     * Get <p>标签列表（TagKey-TagValue），null 不修改，空数组清空，非空全量替换</p> 
     * @return Tags <p>标签列表（TagKey-TagValue），null 不修改，空数组清空，非空全量替换</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签列表（TagKey-TagValue），null 不修改，空数组清空，非空全量替换</p>
     * @param Tags <p>标签列表（TagKey-TagValue），null 不修改，空数组清空，非空全量替换</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>基础模型ID（用于模型挂载）</p> 
     * @return BaseModelUid <p>基础模型ID（用于模型挂载）</p>
     */
    public String getBaseModelUid() {
        return this.BaseModelUid;
    }

    /**
     * Set <p>基础模型ID（用于模型挂载）</p>
     * @param BaseModelUid <p>基础模型ID（用于模型挂载）</p>
     */
    public void setBaseModelUid(String BaseModelUid) {
        this.BaseModelUid = BaseModelUid;
    }

    /**
     * Get <p>输出模型名（用于产出模型自动注册）</p> 
     * @return OutputModelName <p>输出模型名（用于产出模型自动注册）</p>
     */
    public String getOutputModelName() {
        return this.OutputModelName;
    }

    /**
     * Set <p>输出模型名（用于产出模型自动注册）</p>
     * @param OutputModelName <p>输出模型名（用于产出模型自动注册）</p>
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
     * Get <p>数据集挂载列表（整体替换，不传则不更新）</p> 
     * @return Datasets <p>数据集挂载列表（整体替换，不传则不更新）</p>
     */
    public DatasetMount [] getDatasets() {
        return this.Datasets;
    }

    /**
     * Set <p>数据集挂载列表（整体替换，不传则不更新）</p>
     * @param Datasets <p>数据集挂载列表（整体替换，不传则不更新）</p>
     */
    public void setDatasets(DatasetMount [] Datasets) {
        this.Datasets = Datasets;
    }

    /**
     * Get <p>Checkpoint 产出配置（整体替换，不传则不更新）</p> 
     * @return Checkpoint <p>Checkpoint 产出配置（整体替换，不传则不更新）</p>
     */
    public CheckpointConfig getCheckpoint() {
        return this.Checkpoint;
    }

    /**
     * Set <p>Checkpoint 产出配置（整体替换，不传则不更新）</p>
     * @param Checkpoint <p>Checkpoint 产出配置（整体替换，不传则不更新）</p>
     */
    public void setCheckpoint(CheckpointConfig Checkpoint) {
        this.Checkpoint = Checkpoint;
    }

    /**
     * Get <p>是否启用断点续训（创建时的意图声明；实际续训由实例级「断点续训」按钮触发，不传则不更新）</p> 
     * @return ResumeTraining <p>是否启用断点续训（创建时的意图声明；实际续训由实例级「断点续训」按钮触发，不传则不更新）</p>
     */
    public Boolean getResumeTraining() {
        return this.ResumeTraining;
    }

    /**
     * Set <p>是否启用断点续训（创建时的意图声明；实际续训由实例级「断点续训」按钮触发，不传则不更新）</p>
     * @param ResumeTraining <p>是否启用断点续训（创建时的意图声明；实际续训由实例级「断点续训」按钮触发，不传则不更新）</p>
     */
    public void setResumeTraining(Boolean ResumeTraining) {
        this.ResumeTraining = ResumeTraining;
    }

    /**
     * Get <p>调优参数（整体替换，未填字段回模板默认值；不传则不更新；仅 POST_TRAINING）</p> 
     * @return TuningParams <p>调优参数（整体替换，未填字段回模板默认值；不传则不更新；仅 POST_TRAINING）</p>
     */
    public TrainingTuningParams getTuningParams() {
        return this.TuningParams;
    }

    /**
     * Set <p>调优参数（整体替换，未填字段回模板默认值；不传则不更新；仅 POST_TRAINING）</p>
     * @param TuningParams <p>调优参数（整体替换，未填字段回模板默认值；不传则不更新；仅 POST_TRAINING）</p>
     */
    public void setTuningParams(TrainingTuningParams TuningParams) {
        this.TuningParams = TuningParams;
    }

    public ModifyTrainingJobSpecRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTrainingJobSpecRequest(ModifyTrainingJobSpecRequest source) {
        if (source.SpecId != null) {
            this.SpecId = new String(source.SpecId);
        }
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
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.AdvancedOptions != null) {
            this.AdvancedOptions = new String(source.AdvancedOptions);
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
        if (source.BaseModelUid != null) {
            this.BaseModelUid = new String(source.BaseModelUid);
        }
        if (source.OutputModelName != null) {
            this.OutputModelName = new String(source.OutputModelName);
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecId", this.SpecId);
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
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "AdvancedOptions", this.AdvancedOptions);
        this.setParamObj(map, prefix + "MlFlowConfig.", this.MlFlowConfig);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "BaseModelUid", this.BaseModelUid);
        this.setParamSimple(map, prefix + "OutputModelName", this.OutputModelName);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArrayObj(map, prefix + "Datasets.", this.Datasets);
        this.setParamObj(map, prefix + "Checkpoint.", this.Checkpoint);
        this.setParamSimple(map, prefix + "ResumeTraining", this.ResumeTraining);
        this.setParamObj(map, prefix + "TuningParams.", this.TuningParams);

    }
}

