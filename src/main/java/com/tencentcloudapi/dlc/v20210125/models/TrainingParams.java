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

public class TrainingParams extends AbstractModel {

    /**
    * <p>每卡 batch size，SFT/DPO 用。GRPO 返回 null</p>
    */
    @SerializedName("PerDeviceBatchSize")
    @Expose
    private Long PerDeviceBatchSize;

    /**
    * <p>梯度累积步数，用于放大有效 batch；GRPO 返回 null。</p>
    */
    @SerializedName("GradientAccumulationSteps")
    @Expose
    private Long GradientAccumulationSteps;

    /**
    * <p>是否开启梯度检查点（省显存换计算），GRPO 返回 null。</p>
    */
    @SerializedName("GradientCheckpointing")
    @Expose
    private Boolean GradientCheckpointing;

    /**
    * <p>最大序列/上下文长度，所有模式都返回。</p>
    */
    @SerializedName("CutoffLen")
    @Expose
    private Long CutoffLen;

    /**
    * <p>推荐学习率；SFT/DPO 按算法+微调方式给值，GRPO 返回 null（由入口脚本默认值决定）。</p>
    */
    @SerializedName("LearningRate")
    @Expose
    private Float LearningRate;

    /**
    * <p>推荐训练轮次，所有模式都返回。</p>
    */
    @SerializedName("Epochs")
    @Expose
    private Long Epochs;

    /**
    * <p>推荐 LoRA rank（仅 finetuneType=lora 有值，全参微调/GRPO 返回 null）。</p>
    */
    @SerializedName("LoraRank")
    @Expose
    private Long LoraRank;

    /**
    * <p>warmup 步数占总步数比例；GRPO 返回 null。</p>
    */
    @SerializedName("WarmupRatio")
    @Expose
    private Float WarmupRatio;

    /**
    * <p>GRPO 每步训练的 prompt 总数；SFT/DPO 返回 null。</p>
    */
    @SerializedName("TrainBatchSize")
    @Expose
    private Long TrainBatchSize;

    /**
    * <p>GRPO PPO 阶段 mini-batch 大小；SFT/DPO 返回 null。</p>
    */
    @SerializedName("PPOMiniBatchSize")
    @Expose
    private Long PPOMiniBatchSize;

    /**
    * <p>GRPO rollout（vLLM/sglang）占用 GPU 显存比例（0~1）；SFT/DPO 返回 null。</p>
    */
    @SerializedName("GpuMemoryUtilization")
    @Expose
    private Float GpuMemoryUtilization;

    /**
    * <p>GRPO rollout 单次最大生成长度；SFT/DPO 返回 null。</p>
    */
    @SerializedName("MaxResponseLength")
    @Expose
    private Long MaxResponseLength;

    /**
    * <p>GRPO 每个 prompt 的采样数（group size）；SFT/DPO 返回 null。</p>
    */
    @SerializedName("NumSamplesPerPrompt")
    @Expose
    private Long NumSamplesPerPrompt;

    /**
     * Get <p>每卡 batch size，SFT/DPO 用。GRPO 返回 null</p> 
     * @return PerDeviceBatchSize <p>每卡 batch size，SFT/DPO 用。GRPO 返回 null</p>
     */
    public Long getPerDeviceBatchSize() {
        return this.PerDeviceBatchSize;
    }

    /**
     * Set <p>每卡 batch size，SFT/DPO 用。GRPO 返回 null</p>
     * @param PerDeviceBatchSize <p>每卡 batch size，SFT/DPO 用。GRPO 返回 null</p>
     */
    public void setPerDeviceBatchSize(Long PerDeviceBatchSize) {
        this.PerDeviceBatchSize = PerDeviceBatchSize;
    }

    /**
     * Get <p>梯度累积步数，用于放大有效 batch；GRPO 返回 null。</p> 
     * @return GradientAccumulationSteps <p>梯度累积步数，用于放大有效 batch；GRPO 返回 null。</p>
     */
    public Long getGradientAccumulationSteps() {
        return this.GradientAccumulationSteps;
    }

    /**
     * Set <p>梯度累积步数，用于放大有效 batch；GRPO 返回 null。</p>
     * @param GradientAccumulationSteps <p>梯度累积步数，用于放大有效 batch；GRPO 返回 null。</p>
     */
    public void setGradientAccumulationSteps(Long GradientAccumulationSteps) {
        this.GradientAccumulationSteps = GradientAccumulationSteps;
    }

    /**
     * Get <p>是否开启梯度检查点（省显存换计算），GRPO 返回 null。</p> 
     * @return GradientCheckpointing <p>是否开启梯度检查点（省显存换计算），GRPO 返回 null。</p>
     */
    public Boolean getGradientCheckpointing() {
        return this.GradientCheckpointing;
    }

    /**
     * Set <p>是否开启梯度检查点（省显存换计算），GRPO 返回 null。</p>
     * @param GradientCheckpointing <p>是否开启梯度检查点（省显存换计算），GRPO 返回 null。</p>
     */
    public void setGradientCheckpointing(Boolean GradientCheckpointing) {
        this.GradientCheckpointing = GradientCheckpointing;
    }

    /**
     * Get <p>最大序列/上下文长度，所有模式都返回。</p> 
     * @return CutoffLen <p>最大序列/上下文长度，所有模式都返回。</p>
     */
    public Long getCutoffLen() {
        return this.CutoffLen;
    }

    /**
     * Set <p>最大序列/上下文长度，所有模式都返回。</p>
     * @param CutoffLen <p>最大序列/上下文长度，所有模式都返回。</p>
     */
    public void setCutoffLen(Long CutoffLen) {
        this.CutoffLen = CutoffLen;
    }

    /**
     * Get <p>推荐学习率；SFT/DPO 按算法+微调方式给值，GRPO 返回 null（由入口脚本默认值决定）。</p> 
     * @return LearningRate <p>推荐学习率；SFT/DPO 按算法+微调方式给值，GRPO 返回 null（由入口脚本默认值决定）。</p>
     */
    public Float getLearningRate() {
        return this.LearningRate;
    }

    /**
     * Set <p>推荐学习率；SFT/DPO 按算法+微调方式给值，GRPO 返回 null（由入口脚本默认值决定）。</p>
     * @param LearningRate <p>推荐学习率；SFT/DPO 按算法+微调方式给值，GRPO 返回 null（由入口脚本默认值决定）。</p>
     */
    public void setLearningRate(Float LearningRate) {
        this.LearningRate = LearningRate;
    }

    /**
     * Get <p>推荐训练轮次，所有模式都返回。</p> 
     * @return Epochs <p>推荐训练轮次，所有模式都返回。</p>
     */
    public Long getEpochs() {
        return this.Epochs;
    }

    /**
     * Set <p>推荐训练轮次，所有模式都返回。</p>
     * @param Epochs <p>推荐训练轮次，所有模式都返回。</p>
     */
    public void setEpochs(Long Epochs) {
        this.Epochs = Epochs;
    }

    /**
     * Get <p>推荐 LoRA rank（仅 finetuneType=lora 有值，全参微调/GRPO 返回 null）。</p> 
     * @return LoraRank <p>推荐 LoRA rank（仅 finetuneType=lora 有值，全参微调/GRPO 返回 null）。</p>
     */
    public Long getLoraRank() {
        return this.LoraRank;
    }

    /**
     * Set <p>推荐 LoRA rank（仅 finetuneType=lora 有值，全参微调/GRPO 返回 null）。</p>
     * @param LoraRank <p>推荐 LoRA rank（仅 finetuneType=lora 有值，全参微调/GRPO 返回 null）。</p>
     */
    public void setLoraRank(Long LoraRank) {
        this.LoraRank = LoraRank;
    }

    /**
     * Get <p>warmup 步数占总步数比例；GRPO 返回 null。</p> 
     * @return WarmupRatio <p>warmup 步数占总步数比例；GRPO 返回 null。</p>
     */
    public Float getWarmupRatio() {
        return this.WarmupRatio;
    }

    /**
     * Set <p>warmup 步数占总步数比例；GRPO 返回 null。</p>
     * @param WarmupRatio <p>warmup 步数占总步数比例；GRPO 返回 null。</p>
     */
    public void setWarmupRatio(Float WarmupRatio) {
        this.WarmupRatio = WarmupRatio;
    }

    /**
     * Get <p>GRPO 每步训练的 prompt 总数；SFT/DPO 返回 null。</p> 
     * @return TrainBatchSize <p>GRPO 每步训练的 prompt 总数；SFT/DPO 返回 null。</p>
     */
    public Long getTrainBatchSize() {
        return this.TrainBatchSize;
    }

    /**
     * Set <p>GRPO 每步训练的 prompt 总数；SFT/DPO 返回 null。</p>
     * @param TrainBatchSize <p>GRPO 每步训练的 prompt 总数；SFT/DPO 返回 null。</p>
     */
    public void setTrainBatchSize(Long TrainBatchSize) {
        this.TrainBatchSize = TrainBatchSize;
    }

    /**
     * Get <p>GRPO PPO 阶段 mini-batch 大小；SFT/DPO 返回 null。</p> 
     * @return PPOMiniBatchSize <p>GRPO PPO 阶段 mini-batch 大小；SFT/DPO 返回 null。</p>
     */
    public Long getPPOMiniBatchSize() {
        return this.PPOMiniBatchSize;
    }

    /**
     * Set <p>GRPO PPO 阶段 mini-batch 大小；SFT/DPO 返回 null。</p>
     * @param PPOMiniBatchSize <p>GRPO PPO 阶段 mini-batch 大小；SFT/DPO 返回 null。</p>
     */
    public void setPPOMiniBatchSize(Long PPOMiniBatchSize) {
        this.PPOMiniBatchSize = PPOMiniBatchSize;
    }

    /**
     * Get <p>GRPO rollout（vLLM/sglang）占用 GPU 显存比例（0~1）；SFT/DPO 返回 null。</p> 
     * @return GpuMemoryUtilization <p>GRPO rollout（vLLM/sglang）占用 GPU 显存比例（0~1）；SFT/DPO 返回 null。</p>
     */
    public Float getGpuMemoryUtilization() {
        return this.GpuMemoryUtilization;
    }

    /**
     * Set <p>GRPO rollout（vLLM/sglang）占用 GPU 显存比例（0~1）；SFT/DPO 返回 null。</p>
     * @param GpuMemoryUtilization <p>GRPO rollout（vLLM/sglang）占用 GPU 显存比例（0~1）；SFT/DPO 返回 null。</p>
     */
    public void setGpuMemoryUtilization(Float GpuMemoryUtilization) {
        this.GpuMemoryUtilization = GpuMemoryUtilization;
    }

    /**
     * Get <p>GRPO rollout 单次最大生成长度；SFT/DPO 返回 null。</p> 
     * @return MaxResponseLength <p>GRPO rollout 单次最大生成长度；SFT/DPO 返回 null。</p>
     */
    public Long getMaxResponseLength() {
        return this.MaxResponseLength;
    }

    /**
     * Set <p>GRPO rollout 单次最大生成长度；SFT/DPO 返回 null。</p>
     * @param MaxResponseLength <p>GRPO rollout 单次最大生成长度；SFT/DPO 返回 null。</p>
     */
    public void setMaxResponseLength(Long MaxResponseLength) {
        this.MaxResponseLength = MaxResponseLength;
    }

    /**
     * Get <p>GRPO 每个 prompt 的采样数（group size）；SFT/DPO 返回 null。</p> 
     * @return NumSamplesPerPrompt <p>GRPO 每个 prompt 的采样数（group size）；SFT/DPO 返回 null。</p>
     */
    public Long getNumSamplesPerPrompt() {
        return this.NumSamplesPerPrompt;
    }

    /**
     * Set <p>GRPO 每个 prompt 的采样数（group size）；SFT/DPO 返回 null。</p>
     * @param NumSamplesPerPrompt <p>GRPO 每个 prompt 的采样数（group size）；SFT/DPO 返回 null。</p>
     */
    public void setNumSamplesPerPrompt(Long NumSamplesPerPrompt) {
        this.NumSamplesPerPrompt = NumSamplesPerPrompt;
    }

    public TrainingParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrainingParams(TrainingParams source) {
        if (source.PerDeviceBatchSize != null) {
            this.PerDeviceBatchSize = new Long(source.PerDeviceBatchSize);
        }
        if (source.GradientAccumulationSteps != null) {
            this.GradientAccumulationSteps = new Long(source.GradientAccumulationSteps);
        }
        if (source.GradientCheckpointing != null) {
            this.GradientCheckpointing = new Boolean(source.GradientCheckpointing);
        }
        if (source.CutoffLen != null) {
            this.CutoffLen = new Long(source.CutoffLen);
        }
        if (source.LearningRate != null) {
            this.LearningRate = new Float(source.LearningRate);
        }
        if (source.Epochs != null) {
            this.Epochs = new Long(source.Epochs);
        }
        if (source.LoraRank != null) {
            this.LoraRank = new Long(source.LoraRank);
        }
        if (source.WarmupRatio != null) {
            this.WarmupRatio = new Float(source.WarmupRatio);
        }
        if (source.TrainBatchSize != null) {
            this.TrainBatchSize = new Long(source.TrainBatchSize);
        }
        if (source.PPOMiniBatchSize != null) {
            this.PPOMiniBatchSize = new Long(source.PPOMiniBatchSize);
        }
        if (source.GpuMemoryUtilization != null) {
            this.GpuMemoryUtilization = new Float(source.GpuMemoryUtilization);
        }
        if (source.MaxResponseLength != null) {
            this.MaxResponseLength = new Long(source.MaxResponseLength);
        }
        if (source.NumSamplesPerPrompt != null) {
            this.NumSamplesPerPrompt = new Long(source.NumSamplesPerPrompt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PerDeviceBatchSize", this.PerDeviceBatchSize);
        this.setParamSimple(map, prefix + "GradientAccumulationSteps", this.GradientAccumulationSteps);
        this.setParamSimple(map, prefix + "GradientCheckpointing", this.GradientCheckpointing);
        this.setParamSimple(map, prefix + "CutoffLen", this.CutoffLen);
        this.setParamSimple(map, prefix + "LearningRate", this.LearningRate);
        this.setParamSimple(map, prefix + "Epochs", this.Epochs);
        this.setParamSimple(map, prefix + "LoraRank", this.LoraRank);
        this.setParamSimple(map, prefix + "WarmupRatio", this.WarmupRatio);
        this.setParamSimple(map, prefix + "TrainBatchSize", this.TrainBatchSize);
        this.setParamSimple(map, prefix + "PPOMiniBatchSize", this.PPOMiniBatchSize);
        this.setParamSimple(map, prefix + "GpuMemoryUtilization", this.GpuMemoryUtilization);
        this.setParamSimple(map, prefix + "MaxResponseLength", this.MaxResponseLength);
        this.setParamSimple(map, prefix + "NumSamplesPerPrompt", this.NumSamplesPerPrompt);

    }
}

