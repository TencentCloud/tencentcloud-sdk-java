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

public class DescribePostTrainingPresetRequest extends AbstractModel {

    /**
    * <p>使用的大模型微调算法</p><p>枚举值：</p><ul><li>sft： Supervised Fine-Tuning，监督微调</li><li>dpo： Direct Preference Optimization，模型偏好训练微调</li><li>grpo： Group Relative Policy Optimization，组相对策略优化</li></ul>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>训练模式，会根据不同训练模式推荐不同的训练参数</p><p>枚举值：</p><ul><li>balanced： 均衡模式，标准配置，兼顾训练速度和模型效果</li><li>quality： 质量优先，更低学习率 / 更多轮次 / 更大 LoRA rank，追求最佳效果</li><li>speed： 速度优先，大 batch / 关闭 grad_ckpt / 短序列，最快迭代验证</li><li>custom： 自定义模式，手动调整各项参数</li></ul><p>默认值：balanced</p>
    */
    @SerializedName("TrainingMode")
    @Expose
    private String TrainingMode;

    /**
    * <p>参数微调方式</p><p>枚举值：</p><ul><li>lora： 轻量级微调大模型的方法</li><li>full： 全参数大模型微调</li></ul>
    */
    @SerializedName("FineTuneType")
    @Expose
    private String FineTuneType;

    /**
    * <p>模型参数大小，如 0.8B，就是 0.8的参数量。370B 模型，就是 370</p>
    */
    @SerializedName("ParameterSize")
    @Expose
    private Float ParameterSize;

    /**
     * Get <p>使用的大模型微调算法</p><p>枚举值：</p><ul><li>sft： Supervised Fine-Tuning，监督微调</li><li>dpo： Direct Preference Optimization，模型偏好训练微调</li><li>grpo： Group Relative Policy Optimization，组相对策略优化</li></ul> 
     * @return Mode <p>使用的大模型微调算法</p><p>枚举值：</p><ul><li>sft： Supervised Fine-Tuning，监督微调</li><li>dpo： Direct Preference Optimization，模型偏好训练微调</li><li>grpo： Group Relative Policy Optimization，组相对策略优化</li></ul>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>使用的大模型微调算法</p><p>枚举值：</p><ul><li>sft： Supervised Fine-Tuning，监督微调</li><li>dpo： Direct Preference Optimization，模型偏好训练微调</li><li>grpo： Group Relative Policy Optimization，组相对策略优化</li></ul>
     * @param Mode <p>使用的大模型微调算法</p><p>枚举值：</p><ul><li>sft： Supervised Fine-Tuning，监督微调</li><li>dpo： Direct Preference Optimization，模型偏好训练微调</li><li>grpo： Group Relative Policy Optimization，组相对策略优化</li></ul>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>训练模式，会根据不同训练模式推荐不同的训练参数</p><p>枚举值：</p><ul><li>balanced： 均衡模式，标准配置，兼顾训练速度和模型效果</li><li>quality： 质量优先，更低学习率 / 更多轮次 / 更大 LoRA rank，追求最佳效果</li><li>speed： 速度优先，大 batch / 关闭 grad_ckpt / 短序列，最快迭代验证</li><li>custom： 自定义模式，手动调整各项参数</li></ul><p>默认值：balanced</p> 
     * @return TrainingMode <p>训练模式，会根据不同训练模式推荐不同的训练参数</p><p>枚举值：</p><ul><li>balanced： 均衡模式，标准配置，兼顾训练速度和模型效果</li><li>quality： 质量优先，更低学习率 / 更多轮次 / 更大 LoRA rank，追求最佳效果</li><li>speed： 速度优先，大 batch / 关闭 grad_ckpt / 短序列，最快迭代验证</li><li>custom： 自定义模式，手动调整各项参数</li></ul><p>默认值：balanced</p>
     */
    public String getTrainingMode() {
        return this.TrainingMode;
    }

    /**
     * Set <p>训练模式，会根据不同训练模式推荐不同的训练参数</p><p>枚举值：</p><ul><li>balanced： 均衡模式，标准配置，兼顾训练速度和模型效果</li><li>quality： 质量优先，更低学习率 / 更多轮次 / 更大 LoRA rank，追求最佳效果</li><li>speed： 速度优先，大 batch / 关闭 grad_ckpt / 短序列，最快迭代验证</li><li>custom： 自定义模式，手动调整各项参数</li></ul><p>默认值：balanced</p>
     * @param TrainingMode <p>训练模式，会根据不同训练模式推荐不同的训练参数</p><p>枚举值：</p><ul><li>balanced： 均衡模式，标准配置，兼顾训练速度和模型效果</li><li>quality： 质量优先，更低学习率 / 更多轮次 / 更大 LoRA rank，追求最佳效果</li><li>speed： 速度优先，大 batch / 关闭 grad_ckpt / 短序列，最快迭代验证</li><li>custom： 自定义模式，手动调整各项参数</li></ul><p>默认值：balanced</p>
     */
    public void setTrainingMode(String TrainingMode) {
        this.TrainingMode = TrainingMode;
    }

    /**
     * Get <p>参数微调方式</p><p>枚举值：</p><ul><li>lora： 轻量级微调大模型的方法</li><li>full： 全参数大模型微调</li></ul> 
     * @return FineTuneType <p>参数微调方式</p><p>枚举值：</p><ul><li>lora： 轻量级微调大模型的方法</li><li>full： 全参数大模型微调</li></ul>
     */
    public String getFineTuneType() {
        return this.FineTuneType;
    }

    /**
     * Set <p>参数微调方式</p><p>枚举值：</p><ul><li>lora： 轻量级微调大模型的方法</li><li>full： 全参数大模型微调</li></ul>
     * @param FineTuneType <p>参数微调方式</p><p>枚举值：</p><ul><li>lora： 轻量级微调大模型的方法</li><li>full： 全参数大模型微调</li></ul>
     */
    public void setFineTuneType(String FineTuneType) {
        this.FineTuneType = FineTuneType;
    }

    /**
     * Get <p>模型参数大小，如 0.8B，就是 0.8的参数量。370B 模型，就是 370</p> 
     * @return ParameterSize <p>模型参数大小，如 0.8B，就是 0.8的参数量。370B 模型，就是 370</p>
     */
    public Float getParameterSize() {
        return this.ParameterSize;
    }

    /**
     * Set <p>模型参数大小，如 0.8B，就是 0.8的参数量。370B 模型，就是 370</p>
     * @param ParameterSize <p>模型参数大小，如 0.8B，就是 0.8的参数量。370B 模型，就是 370</p>
     */
    public void setParameterSize(Float ParameterSize) {
        this.ParameterSize = ParameterSize;
    }

    public DescribePostTrainingPresetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePostTrainingPresetRequest(DescribePostTrainingPresetRequest source) {
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.TrainingMode != null) {
            this.TrainingMode = new String(source.TrainingMode);
        }
        if (source.FineTuneType != null) {
            this.FineTuneType = new String(source.FineTuneType);
        }
        if (source.ParameterSize != null) {
            this.ParameterSize = new Float(source.ParameterSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "TrainingMode", this.TrainingMode);
        this.setParamSimple(map, prefix + "FineTuneType", this.FineTuneType);
        this.setParamSimple(map, prefix + "ParameterSize", this.ParameterSize);

    }
}

