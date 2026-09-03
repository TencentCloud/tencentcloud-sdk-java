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

public class CheckpointMetrics extends AbstractModel {

    /**
    * <p>当前 checkpoint 对应的 epoch</p>
    */
    @SerializedName("Epoch")
    @Expose
    private Float Epoch;

    /**
    * <p>全局训练步数</p>
    */
    @SerializedName("Step")
    @Expose
    private Long Step;

    /**
    * <p>训练 loss（归一化后）</p>
    */
    @SerializedName("Loss")
    @Expose
    private Float Loss;

    /**
    * <p>评估 loss（归一化后）</p>
    */
    @SerializedName("EvalLoss")
    @Expose
    private Float EvalLoss;

    /**
    * <p>学习率</p>
    */
    @SerializedName("LearningRate")
    @Expose
    private Float LearningRate;

    /**
    * <p>snapshot 中的原始 metrics 键值对列表（前端可展开查看）</p>
    */
    @SerializedName("RawMetrics")
    @Expose
    private MetricItem [] RawMetrics;

    /**
     * Get <p>当前 checkpoint 对应的 epoch</p> 
     * @return Epoch <p>当前 checkpoint 对应的 epoch</p>
     */
    public Float getEpoch() {
        return this.Epoch;
    }

    /**
     * Set <p>当前 checkpoint 对应的 epoch</p>
     * @param Epoch <p>当前 checkpoint 对应的 epoch</p>
     */
    public void setEpoch(Float Epoch) {
        this.Epoch = Epoch;
    }

    /**
     * Get <p>全局训练步数</p> 
     * @return Step <p>全局训练步数</p>
     */
    public Long getStep() {
        return this.Step;
    }

    /**
     * Set <p>全局训练步数</p>
     * @param Step <p>全局训练步数</p>
     */
    public void setStep(Long Step) {
        this.Step = Step;
    }

    /**
     * Get <p>训练 loss（归一化后）</p> 
     * @return Loss <p>训练 loss（归一化后）</p>
     */
    public Float getLoss() {
        return this.Loss;
    }

    /**
     * Set <p>训练 loss（归一化后）</p>
     * @param Loss <p>训练 loss（归一化后）</p>
     */
    public void setLoss(Float Loss) {
        this.Loss = Loss;
    }

    /**
     * Get <p>评估 loss（归一化后）</p> 
     * @return EvalLoss <p>评估 loss（归一化后）</p>
     */
    public Float getEvalLoss() {
        return this.EvalLoss;
    }

    /**
     * Set <p>评估 loss（归一化后）</p>
     * @param EvalLoss <p>评估 loss（归一化后）</p>
     */
    public void setEvalLoss(Float EvalLoss) {
        this.EvalLoss = EvalLoss;
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
     * Get <p>snapshot 中的原始 metrics 键值对列表（前端可展开查看）</p> 
     * @return RawMetrics <p>snapshot 中的原始 metrics 键值对列表（前端可展开查看）</p>
     */
    public MetricItem [] getRawMetrics() {
        return this.RawMetrics;
    }

    /**
     * Set <p>snapshot 中的原始 metrics 键值对列表（前端可展开查看）</p>
     * @param RawMetrics <p>snapshot 中的原始 metrics 键值对列表（前端可展开查看）</p>
     */
    public void setRawMetrics(MetricItem [] RawMetrics) {
        this.RawMetrics = RawMetrics;
    }

    public CheckpointMetrics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckpointMetrics(CheckpointMetrics source) {
        if (source.Epoch != null) {
            this.Epoch = new Float(source.Epoch);
        }
        if (source.Step != null) {
            this.Step = new Long(source.Step);
        }
        if (source.Loss != null) {
            this.Loss = new Float(source.Loss);
        }
        if (source.EvalLoss != null) {
            this.EvalLoss = new Float(source.EvalLoss);
        }
        if (source.LearningRate != null) {
            this.LearningRate = new Float(source.LearningRate);
        }
        if (source.RawMetrics != null) {
            this.RawMetrics = new MetricItem[source.RawMetrics.length];
            for (int i = 0; i < source.RawMetrics.length; i++) {
                this.RawMetrics[i] = new MetricItem(source.RawMetrics[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Epoch", this.Epoch);
        this.setParamSimple(map, prefix + "Step", this.Step);
        this.setParamSimple(map, prefix + "Loss", this.Loss);
        this.setParamSimple(map, prefix + "EvalLoss", this.EvalLoss);
        this.setParamSimple(map, prefix + "LearningRate", this.LearningRate);
        this.setParamArrayObj(map, prefix + "RawMetrics.", this.RawMetrics);

    }
}

