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

public class TrainingTuningParams extends AbstractModel {

    /**
    * <p>微调方式：lora / full / freeze；默认由算法决定（SFT/DPO=lora，CPT/GRPO=full）</p>
    */
    @SerializedName("FineTuneType")
    @Expose
    private String FineTuneType;

    /**
    * <p>LoRA rank，仅 finetuneType=lora 时生效</p>
    */
    @SerializedName("LoraRank")
    @Expose
    private Long LoraRank;

    /**
    * <p>LoRA alpha</p>
    */
    @SerializedName("LoraAlpha")
    @Expose
    private Long LoraAlpha;

    /**
    * <p>LoRA dropout</p>
    */
    @SerializedName("LoraDropout")
    @Expose
    private Float LoraDropout;

    /**
    * <p>LoRA 目标层，默认 all</p>
    */
    @SerializedName("LoraTarget")
    @Expose
    private String LoraTarget;

    /**
    * <p>训练模式：balanced / quality / speed / custom</p>
    */
    @SerializedName("TrainingMode")
    @Expose
    private String TrainingMode;

    /**
    * <p>训练轮数</p>
    */
    @SerializedName("Epochs")
    @Expose
    private Long Epochs;

    /**
    * <p>学习率</p>
    */
    @SerializedName("LearningRate")
    @Expose
    private Float LearningRate;

    /**
    * <p>每卡 batch size</p>
    */
    @SerializedName("PerDeviceBatchSize")
    @Expose
    private Long PerDeviceBatchSize;

    /**
    * <p>梯度累积步数</p>
    */
    @SerializedName("GradientAccumulationSteps")
    @Expose
    private Long GradientAccumulationSteps;

    /**
    * <p>上下文长度</p>
    */
    @SerializedName("CutoffLen")
    @Expose
    private Long CutoffLen;

    /**
    * <p>最大样本数</p>
    */
    @SerializedName("MaxSamples")
    @Expose
    private Long MaxSamples;

    /**
    * <p>是否启用 gradient checkpointing，默认 true</p>
    */
    @SerializedName("GradientCheckPointing")
    @Expose
    private Boolean GradientCheckPointing;

    /**
    * <p>学习率调度器类型，默认 cosine</p>
    */
    @SerializedName("LrScheduler")
    @Expose
    private String LrScheduler;

    /**
    * <p>warmup 比例，默认 0.03</p>
    */
    @SerializedName("WarmupRatio")
    @Expose
    private Float WarmupRatio;

    /**
    * <p>DPO beta，仅 mode=dpo 时生效</p>
    */
    @SerializedName("DPOBeta")
    @Expose
    private Float DPOBeta;

    /**
    * <p>DPO loss：sigmoid / hinge / ipo / kto_pair</p>
    */
    @SerializedName("DPOLoss")
    @Expose
    private String DPOLoss;

    /**
    * <p>兼容旧请求；当前 GRPO 默认使用 verl 内置 rule reward</p>
    */
    @SerializedName("RewardFunctionCode")
    @Expose
    private String RewardFunctionCode;

    /**
    * <p>兼容旧请求；当前 GRPO 默认使用 verl 内置 rule reward</p>
    */
    @SerializedName("RewardFunctionCosPath")
    @Expose
    private String RewardFunctionCosPath;

    /**
    * <p>GRPO KL 系数，默认 0.001</p>
    */
    @SerializedName("KLCoefficient")
    @Expose
    private Float KLCoefficient;

    /**
    * <p>每个 prompt 的采样数（group size），默认 8</p>
    */
    @SerializedName("NumSamplesPerPrompt")
    @Expose
    private Long NumSamplesPerPrompt;

    /**
    * <p>最大响应生成长度，默认 1024</p>
    */
    @SerializedName("MaxResponseLength")
    @Expose
    private Long MaxResponseLength;

    /**
    * <p>rollout 生成温度，默认 1.0</p>
    */
    @SerializedName("RollOutTemperature")
    @Expose
    private Float RollOutTemperature;

    /**
    * <p>rollout backend：vllm / sglang，默认 vllm</p>
    */
    @SerializedName("RollOutBackend")
    @Expose
    private String RollOutBackend;

    /**
    * <p>PPO clip ratio，默认 0.2</p>
    */
    @SerializedName("ClipRatio")
    @Expose
    private Float ClipRatio;

    /**
    * <p>PPO mini batch size，默认 128</p>
    */
    @SerializedName("PPOMiniBatchSize")
    @Expose
    private Long PPOMiniBatchSize;

    /**
    * <p>PPO epochs（每批数据的更新轮数），默认 1</p>
    */
    @SerializedName("PPOEpochs")
    @Expose
    private Long PPOEpochs;

    /**
    * <p>训练总 batch size（每步 prompt 数量），默认 128</p>
    */
    @SerializedName("TrainBatchSize")
    @Expose
    private Long TrainBatchSize;

    /**
    * <p>rollout tensor model parallel size，默认 1</p>
    */
    @SerializedName("TensorModelParallelSize")
    @Expose
    private Long TensorModelParallelSize;

    /**
    * <p>vLLM GPU memory utilization，默认 0.5</p>
    */
    @SerializedName("GpuMemoryUtilization")
    @Expose
    private Float GpuMemoryUtilization;

    /**
     * Get <p>微调方式：lora / full / freeze；默认由算法决定（SFT/DPO=lora，CPT/GRPO=full）</p> 
     * @return FineTuneType <p>微调方式：lora / full / freeze；默认由算法决定（SFT/DPO=lora，CPT/GRPO=full）</p>
     */
    public String getFineTuneType() {
        return this.FineTuneType;
    }

    /**
     * Set <p>微调方式：lora / full / freeze；默认由算法决定（SFT/DPO=lora，CPT/GRPO=full）</p>
     * @param FineTuneType <p>微调方式：lora / full / freeze；默认由算法决定（SFT/DPO=lora，CPT/GRPO=full）</p>
     */
    public void setFineTuneType(String FineTuneType) {
        this.FineTuneType = FineTuneType;
    }

    /**
     * Get <p>LoRA rank，仅 finetuneType=lora 时生效</p> 
     * @return LoraRank <p>LoRA rank，仅 finetuneType=lora 时生效</p>
     */
    public Long getLoraRank() {
        return this.LoraRank;
    }

    /**
     * Set <p>LoRA rank，仅 finetuneType=lora 时生效</p>
     * @param LoraRank <p>LoRA rank，仅 finetuneType=lora 时生效</p>
     */
    public void setLoraRank(Long LoraRank) {
        this.LoraRank = LoraRank;
    }

    /**
     * Get <p>LoRA alpha</p> 
     * @return LoraAlpha <p>LoRA alpha</p>
     */
    public Long getLoraAlpha() {
        return this.LoraAlpha;
    }

    /**
     * Set <p>LoRA alpha</p>
     * @param LoraAlpha <p>LoRA alpha</p>
     */
    public void setLoraAlpha(Long LoraAlpha) {
        this.LoraAlpha = LoraAlpha;
    }

    /**
     * Get <p>LoRA dropout</p> 
     * @return LoraDropout <p>LoRA dropout</p>
     */
    public Float getLoraDropout() {
        return this.LoraDropout;
    }

    /**
     * Set <p>LoRA dropout</p>
     * @param LoraDropout <p>LoRA dropout</p>
     */
    public void setLoraDropout(Float LoraDropout) {
        this.LoraDropout = LoraDropout;
    }

    /**
     * Get <p>LoRA 目标层，默认 all</p> 
     * @return LoraTarget <p>LoRA 目标层，默认 all</p>
     */
    public String getLoraTarget() {
        return this.LoraTarget;
    }

    /**
     * Set <p>LoRA 目标层，默认 all</p>
     * @param LoraTarget <p>LoRA 目标层，默认 all</p>
     */
    public void setLoraTarget(String LoraTarget) {
        this.LoraTarget = LoraTarget;
    }

    /**
     * Get <p>训练模式：balanced / quality / speed / custom</p> 
     * @return TrainingMode <p>训练模式：balanced / quality / speed / custom</p>
     */
    public String getTrainingMode() {
        return this.TrainingMode;
    }

    /**
     * Set <p>训练模式：balanced / quality / speed / custom</p>
     * @param TrainingMode <p>训练模式：balanced / quality / speed / custom</p>
     */
    public void setTrainingMode(String TrainingMode) {
        this.TrainingMode = TrainingMode;
    }

    /**
     * Get <p>训练轮数</p> 
     * @return Epochs <p>训练轮数</p>
     */
    public Long getEpochs() {
        return this.Epochs;
    }

    /**
     * Set <p>训练轮数</p>
     * @param Epochs <p>训练轮数</p>
     */
    public void setEpochs(Long Epochs) {
        this.Epochs = Epochs;
    }

    /**
     * Get <p>学习率</p> 
     * @return LearningRate <p>学习率</p>
     */
    public Float getLearningRate() {
        return this.LearningRate;
    }

    /**
     * Set <p>学习率</p>
     * @param LearningRate <p>学习率</p>
     */
    public void setLearningRate(Float LearningRate) {
        this.LearningRate = LearningRate;
    }

    /**
     * Get <p>每卡 batch size</p> 
     * @return PerDeviceBatchSize <p>每卡 batch size</p>
     */
    public Long getPerDeviceBatchSize() {
        return this.PerDeviceBatchSize;
    }

    /**
     * Set <p>每卡 batch size</p>
     * @param PerDeviceBatchSize <p>每卡 batch size</p>
     */
    public void setPerDeviceBatchSize(Long PerDeviceBatchSize) {
        this.PerDeviceBatchSize = PerDeviceBatchSize;
    }

    /**
     * Get <p>梯度累积步数</p> 
     * @return GradientAccumulationSteps <p>梯度累积步数</p>
     */
    public Long getGradientAccumulationSteps() {
        return this.GradientAccumulationSteps;
    }

    /**
     * Set <p>梯度累积步数</p>
     * @param GradientAccumulationSteps <p>梯度累积步数</p>
     */
    public void setGradientAccumulationSteps(Long GradientAccumulationSteps) {
        this.GradientAccumulationSteps = GradientAccumulationSteps;
    }

    /**
     * Get <p>上下文长度</p> 
     * @return CutoffLen <p>上下文长度</p>
     */
    public Long getCutoffLen() {
        return this.CutoffLen;
    }

    /**
     * Set <p>上下文长度</p>
     * @param CutoffLen <p>上下文长度</p>
     */
    public void setCutoffLen(Long CutoffLen) {
        this.CutoffLen = CutoffLen;
    }

    /**
     * Get <p>最大样本数</p> 
     * @return MaxSamples <p>最大样本数</p>
     */
    public Long getMaxSamples() {
        return this.MaxSamples;
    }

    /**
     * Set <p>最大样本数</p>
     * @param MaxSamples <p>最大样本数</p>
     */
    public void setMaxSamples(Long MaxSamples) {
        this.MaxSamples = MaxSamples;
    }

    /**
     * Get <p>是否启用 gradient checkpointing，默认 true</p> 
     * @return GradientCheckPointing <p>是否启用 gradient checkpointing，默认 true</p>
     */
    public Boolean getGradientCheckPointing() {
        return this.GradientCheckPointing;
    }

    /**
     * Set <p>是否启用 gradient checkpointing，默认 true</p>
     * @param GradientCheckPointing <p>是否启用 gradient checkpointing，默认 true</p>
     */
    public void setGradientCheckPointing(Boolean GradientCheckPointing) {
        this.GradientCheckPointing = GradientCheckPointing;
    }

    /**
     * Get <p>学习率调度器类型，默认 cosine</p> 
     * @return LrScheduler <p>学习率调度器类型，默认 cosine</p>
     */
    public String getLrScheduler() {
        return this.LrScheduler;
    }

    /**
     * Set <p>学习率调度器类型，默认 cosine</p>
     * @param LrScheduler <p>学习率调度器类型，默认 cosine</p>
     */
    public void setLrScheduler(String LrScheduler) {
        this.LrScheduler = LrScheduler;
    }

    /**
     * Get <p>warmup 比例，默认 0.03</p> 
     * @return WarmupRatio <p>warmup 比例，默认 0.03</p>
     */
    public Float getWarmupRatio() {
        return this.WarmupRatio;
    }

    /**
     * Set <p>warmup 比例，默认 0.03</p>
     * @param WarmupRatio <p>warmup 比例，默认 0.03</p>
     */
    public void setWarmupRatio(Float WarmupRatio) {
        this.WarmupRatio = WarmupRatio;
    }

    /**
     * Get <p>DPO beta，仅 mode=dpo 时生效</p> 
     * @return DPOBeta <p>DPO beta，仅 mode=dpo 时生效</p>
     */
    public Float getDPOBeta() {
        return this.DPOBeta;
    }

    /**
     * Set <p>DPO beta，仅 mode=dpo 时生效</p>
     * @param DPOBeta <p>DPO beta，仅 mode=dpo 时生效</p>
     */
    public void setDPOBeta(Float DPOBeta) {
        this.DPOBeta = DPOBeta;
    }

    /**
     * Get <p>DPO loss：sigmoid / hinge / ipo / kto_pair</p> 
     * @return DPOLoss <p>DPO loss：sigmoid / hinge / ipo / kto_pair</p>
     */
    public String getDPOLoss() {
        return this.DPOLoss;
    }

    /**
     * Set <p>DPO loss：sigmoid / hinge / ipo / kto_pair</p>
     * @param DPOLoss <p>DPO loss：sigmoid / hinge / ipo / kto_pair</p>
     */
    public void setDPOLoss(String DPOLoss) {
        this.DPOLoss = DPOLoss;
    }

    /**
     * Get <p>兼容旧请求；当前 GRPO 默认使用 verl 内置 rule reward</p> 
     * @return RewardFunctionCode <p>兼容旧请求；当前 GRPO 默认使用 verl 内置 rule reward</p>
     */
    public String getRewardFunctionCode() {
        return this.RewardFunctionCode;
    }

    /**
     * Set <p>兼容旧请求；当前 GRPO 默认使用 verl 内置 rule reward</p>
     * @param RewardFunctionCode <p>兼容旧请求；当前 GRPO 默认使用 verl 内置 rule reward</p>
     */
    public void setRewardFunctionCode(String RewardFunctionCode) {
        this.RewardFunctionCode = RewardFunctionCode;
    }

    /**
     * Get <p>兼容旧请求；当前 GRPO 默认使用 verl 内置 rule reward</p> 
     * @return RewardFunctionCosPath <p>兼容旧请求；当前 GRPO 默认使用 verl 内置 rule reward</p>
     */
    public String getRewardFunctionCosPath() {
        return this.RewardFunctionCosPath;
    }

    /**
     * Set <p>兼容旧请求；当前 GRPO 默认使用 verl 内置 rule reward</p>
     * @param RewardFunctionCosPath <p>兼容旧请求；当前 GRPO 默认使用 verl 内置 rule reward</p>
     */
    public void setRewardFunctionCosPath(String RewardFunctionCosPath) {
        this.RewardFunctionCosPath = RewardFunctionCosPath;
    }

    /**
     * Get <p>GRPO KL 系数，默认 0.001</p> 
     * @return KLCoefficient <p>GRPO KL 系数，默认 0.001</p>
     */
    public Float getKLCoefficient() {
        return this.KLCoefficient;
    }

    /**
     * Set <p>GRPO KL 系数，默认 0.001</p>
     * @param KLCoefficient <p>GRPO KL 系数，默认 0.001</p>
     */
    public void setKLCoefficient(Float KLCoefficient) {
        this.KLCoefficient = KLCoefficient;
    }

    /**
     * Get <p>每个 prompt 的采样数（group size），默认 8</p> 
     * @return NumSamplesPerPrompt <p>每个 prompt 的采样数（group size），默认 8</p>
     */
    public Long getNumSamplesPerPrompt() {
        return this.NumSamplesPerPrompt;
    }

    /**
     * Set <p>每个 prompt 的采样数（group size），默认 8</p>
     * @param NumSamplesPerPrompt <p>每个 prompt 的采样数（group size），默认 8</p>
     */
    public void setNumSamplesPerPrompt(Long NumSamplesPerPrompt) {
        this.NumSamplesPerPrompt = NumSamplesPerPrompt;
    }

    /**
     * Get <p>最大响应生成长度，默认 1024</p> 
     * @return MaxResponseLength <p>最大响应生成长度，默认 1024</p>
     */
    public Long getMaxResponseLength() {
        return this.MaxResponseLength;
    }

    /**
     * Set <p>最大响应生成长度，默认 1024</p>
     * @param MaxResponseLength <p>最大响应生成长度，默认 1024</p>
     */
    public void setMaxResponseLength(Long MaxResponseLength) {
        this.MaxResponseLength = MaxResponseLength;
    }

    /**
     * Get <p>rollout 生成温度，默认 1.0</p> 
     * @return RollOutTemperature <p>rollout 生成温度，默认 1.0</p>
     */
    public Float getRollOutTemperature() {
        return this.RollOutTemperature;
    }

    /**
     * Set <p>rollout 生成温度，默认 1.0</p>
     * @param RollOutTemperature <p>rollout 生成温度，默认 1.0</p>
     */
    public void setRollOutTemperature(Float RollOutTemperature) {
        this.RollOutTemperature = RollOutTemperature;
    }

    /**
     * Get <p>rollout backend：vllm / sglang，默认 vllm</p> 
     * @return RollOutBackend <p>rollout backend：vllm / sglang，默认 vllm</p>
     */
    public String getRollOutBackend() {
        return this.RollOutBackend;
    }

    /**
     * Set <p>rollout backend：vllm / sglang，默认 vllm</p>
     * @param RollOutBackend <p>rollout backend：vllm / sglang，默认 vllm</p>
     */
    public void setRollOutBackend(String RollOutBackend) {
        this.RollOutBackend = RollOutBackend;
    }

    /**
     * Get <p>PPO clip ratio，默认 0.2</p> 
     * @return ClipRatio <p>PPO clip ratio，默认 0.2</p>
     */
    public Float getClipRatio() {
        return this.ClipRatio;
    }

    /**
     * Set <p>PPO clip ratio，默认 0.2</p>
     * @param ClipRatio <p>PPO clip ratio，默认 0.2</p>
     */
    public void setClipRatio(Float ClipRatio) {
        this.ClipRatio = ClipRatio;
    }

    /**
     * Get <p>PPO mini batch size，默认 128</p> 
     * @return PPOMiniBatchSize <p>PPO mini batch size，默认 128</p>
     */
    public Long getPPOMiniBatchSize() {
        return this.PPOMiniBatchSize;
    }

    /**
     * Set <p>PPO mini batch size，默认 128</p>
     * @param PPOMiniBatchSize <p>PPO mini batch size，默认 128</p>
     */
    public void setPPOMiniBatchSize(Long PPOMiniBatchSize) {
        this.PPOMiniBatchSize = PPOMiniBatchSize;
    }

    /**
     * Get <p>PPO epochs（每批数据的更新轮数），默认 1</p> 
     * @return PPOEpochs <p>PPO epochs（每批数据的更新轮数），默认 1</p>
     */
    public Long getPPOEpochs() {
        return this.PPOEpochs;
    }

    /**
     * Set <p>PPO epochs（每批数据的更新轮数），默认 1</p>
     * @param PPOEpochs <p>PPO epochs（每批数据的更新轮数），默认 1</p>
     */
    public void setPPOEpochs(Long PPOEpochs) {
        this.PPOEpochs = PPOEpochs;
    }

    /**
     * Get <p>训练总 batch size（每步 prompt 数量），默认 128</p> 
     * @return TrainBatchSize <p>训练总 batch size（每步 prompt 数量），默认 128</p>
     */
    public Long getTrainBatchSize() {
        return this.TrainBatchSize;
    }

    /**
     * Set <p>训练总 batch size（每步 prompt 数量），默认 128</p>
     * @param TrainBatchSize <p>训练总 batch size（每步 prompt 数量），默认 128</p>
     */
    public void setTrainBatchSize(Long TrainBatchSize) {
        this.TrainBatchSize = TrainBatchSize;
    }

    /**
     * Get <p>rollout tensor model parallel size，默认 1</p> 
     * @return TensorModelParallelSize <p>rollout tensor model parallel size，默认 1</p>
     */
    public Long getTensorModelParallelSize() {
        return this.TensorModelParallelSize;
    }

    /**
     * Set <p>rollout tensor model parallel size，默认 1</p>
     * @param TensorModelParallelSize <p>rollout tensor model parallel size，默认 1</p>
     */
    public void setTensorModelParallelSize(Long TensorModelParallelSize) {
        this.TensorModelParallelSize = TensorModelParallelSize;
    }

    /**
     * Get <p>vLLM GPU memory utilization，默认 0.5</p> 
     * @return GpuMemoryUtilization <p>vLLM GPU memory utilization，默认 0.5</p>
     */
    public Float getGpuMemoryUtilization() {
        return this.GpuMemoryUtilization;
    }

    /**
     * Set <p>vLLM GPU memory utilization，默认 0.5</p>
     * @param GpuMemoryUtilization <p>vLLM GPU memory utilization，默认 0.5</p>
     */
    public void setGpuMemoryUtilization(Float GpuMemoryUtilization) {
        this.GpuMemoryUtilization = GpuMemoryUtilization;
    }

    public TrainingTuningParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrainingTuningParams(TrainingTuningParams source) {
        if (source.FineTuneType != null) {
            this.FineTuneType = new String(source.FineTuneType);
        }
        if (source.LoraRank != null) {
            this.LoraRank = new Long(source.LoraRank);
        }
        if (source.LoraAlpha != null) {
            this.LoraAlpha = new Long(source.LoraAlpha);
        }
        if (source.LoraDropout != null) {
            this.LoraDropout = new Float(source.LoraDropout);
        }
        if (source.LoraTarget != null) {
            this.LoraTarget = new String(source.LoraTarget);
        }
        if (source.TrainingMode != null) {
            this.TrainingMode = new String(source.TrainingMode);
        }
        if (source.Epochs != null) {
            this.Epochs = new Long(source.Epochs);
        }
        if (source.LearningRate != null) {
            this.LearningRate = new Float(source.LearningRate);
        }
        if (source.PerDeviceBatchSize != null) {
            this.PerDeviceBatchSize = new Long(source.PerDeviceBatchSize);
        }
        if (source.GradientAccumulationSteps != null) {
            this.GradientAccumulationSteps = new Long(source.GradientAccumulationSteps);
        }
        if (source.CutoffLen != null) {
            this.CutoffLen = new Long(source.CutoffLen);
        }
        if (source.MaxSamples != null) {
            this.MaxSamples = new Long(source.MaxSamples);
        }
        if (source.GradientCheckPointing != null) {
            this.GradientCheckPointing = new Boolean(source.GradientCheckPointing);
        }
        if (source.LrScheduler != null) {
            this.LrScheduler = new String(source.LrScheduler);
        }
        if (source.WarmupRatio != null) {
            this.WarmupRatio = new Float(source.WarmupRatio);
        }
        if (source.DPOBeta != null) {
            this.DPOBeta = new Float(source.DPOBeta);
        }
        if (source.DPOLoss != null) {
            this.DPOLoss = new String(source.DPOLoss);
        }
        if (source.RewardFunctionCode != null) {
            this.RewardFunctionCode = new String(source.RewardFunctionCode);
        }
        if (source.RewardFunctionCosPath != null) {
            this.RewardFunctionCosPath = new String(source.RewardFunctionCosPath);
        }
        if (source.KLCoefficient != null) {
            this.KLCoefficient = new Float(source.KLCoefficient);
        }
        if (source.NumSamplesPerPrompt != null) {
            this.NumSamplesPerPrompt = new Long(source.NumSamplesPerPrompt);
        }
        if (source.MaxResponseLength != null) {
            this.MaxResponseLength = new Long(source.MaxResponseLength);
        }
        if (source.RollOutTemperature != null) {
            this.RollOutTemperature = new Float(source.RollOutTemperature);
        }
        if (source.RollOutBackend != null) {
            this.RollOutBackend = new String(source.RollOutBackend);
        }
        if (source.ClipRatio != null) {
            this.ClipRatio = new Float(source.ClipRatio);
        }
        if (source.PPOMiniBatchSize != null) {
            this.PPOMiniBatchSize = new Long(source.PPOMiniBatchSize);
        }
        if (source.PPOEpochs != null) {
            this.PPOEpochs = new Long(source.PPOEpochs);
        }
        if (source.TrainBatchSize != null) {
            this.TrainBatchSize = new Long(source.TrainBatchSize);
        }
        if (source.TensorModelParallelSize != null) {
            this.TensorModelParallelSize = new Long(source.TensorModelParallelSize);
        }
        if (source.GpuMemoryUtilization != null) {
            this.GpuMemoryUtilization = new Float(source.GpuMemoryUtilization);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FineTuneType", this.FineTuneType);
        this.setParamSimple(map, prefix + "LoraRank", this.LoraRank);
        this.setParamSimple(map, prefix + "LoraAlpha", this.LoraAlpha);
        this.setParamSimple(map, prefix + "LoraDropout", this.LoraDropout);
        this.setParamSimple(map, prefix + "LoraTarget", this.LoraTarget);
        this.setParamSimple(map, prefix + "TrainingMode", this.TrainingMode);
        this.setParamSimple(map, prefix + "Epochs", this.Epochs);
        this.setParamSimple(map, prefix + "LearningRate", this.LearningRate);
        this.setParamSimple(map, prefix + "PerDeviceBatchSize", this.PerDeviceBatchSize);
        this.setParamSimple(map, prefix + "GradientAccumulationSteps", this.GradientAccumulationSteps);
        this.setParamSimple(map, prefix + "CutoffLen", this.CutoffLen);
        this.setParamSimple(map, prefix + "MaxSamples", this.MaxSamples);
        this.setParamSimple(map, prefix + "GradientCheckPointing", this.GradientCheckPointing);
        this.setParamSimple(map, prefix + "LrScheduler", this.LrScheduler);
        this.setParamSimple(map, prefix + "WarmupRatio", this.WarmupRatio);
        this.setParamSimple(map, prefix + "DPOBeta", this.DPOBeta);
        this.setParamSimple(map, prefix + "DPOLoss", this.DPOLoss);
        this.setParamSimple(map, prefix + "RewardFunctionCode", this.RewardFunctionCode);
        this.setParamSimple(map, prefix + "RewardFunctionCosPath", this.RewardFunctionCosPath);
        this.setParamSimple(map, prefix + "KLCoefficient", this.KLCoefficient);
        this.setParamSimple(map, prefix + "NumSamplesPerPrompt", this.NumSamplesPerPrompt);
        this.setParamSimple(map, prefix + "MaxResponseLength", this.MaxResponseLength);
        this.setParamSimple(map, prefix + "RollOutTemperature", this.RollOutTemperature);
        this.setParamSimple(map, prefix + "RollOutBackend", this.RollOutBackend);
        this.setParamSimple(map, prefix + "ClipRatio", this.ClipRatio);
        this.setParamSimple(map, prefix + "PPOMiniBatchSize", this.PPOMiniBatchSize);
        this.setParamSimple(map, prefix + "PPOEpochs", this.PPOEpochs);
        this.setParamSimple(map, prefix + "TrainBatchSize", this.TrainBatchSize);
        this.setParamSimple(map, prefix + "TensorModelParallelSize", this.TensorModelParallelSize);
        this.setParamSimple(map, prefix + "GpuMemoryUtilization", this.GpuMemoryUtilization);

    }
}

