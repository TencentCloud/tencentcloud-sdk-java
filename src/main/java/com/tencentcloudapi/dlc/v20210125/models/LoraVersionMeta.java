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

public class LoraVersionMeta extends AbstractModel {

    /**
    * <p>Lora Rank</p>
    */
    @SerializedName("Rank")
    @Expose
    private Long Rank;

    /**
    * <p>Lora Alpha</p>
    */
    @SerializedName("Alpha")
    @Expose
    private Long Alpha;

    /**
    * <p>LoRA dropout</p>
    */
    @SerializedName("Dropout")
    @Expose
    private Float Dropout;

    /**
    * <p>注入的目标模块</p>
    */
    @SerializedName("TargetModules")
    @Expose
    private String [] TargetModules;

    /**
    * <p>PEFT 类型（如 LORA）</p>
    */
    @SerializedName("PEFTType")
    @Expose
    private String PEFTType;

    /**
    * <p>任务类型（如 CAUSAL_LM）</p>
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * <p>训练时声明的基座名称或路径（base_model_name_or_path）</p>
    */
    @SerializedName("BaseModelNameOrPath")
    @Expose
    private String BaseModelNameOrPath;

    /**
    * <p>最大 rank（含 rank_pattern 分模块 rank；仅当其大于 Rank 时返回）</p>
    */
    @SerializedName("MaxRank")
    @Expose
    private Long MaxRank;

    /**
     * Get <p>Lora Rank</p> 
     * @return Rank <p>Lora Rank</p>
     */
    public Long getRank() {
        return this.Rank;
    }

    /**
     * Set <p>Lora Rank</p>
     * @param Rank <p>Lora Rank</p>
     */
    public void setRank(Long Rank) {
        this.Rank = Rank;
    }

    /**
     * Get <p>Lora Alpha</p> 
     * @return Alpha <p>Lora Alpha</p>
     */
    public Long getAlpha() {
        return this.Alpha;
    }

    /**
     * Set <p>Lora Alpha</p>
     * @param Alpha <p>Lora Alpha</p>
     */
    public void setAlpha(Long Alpha) {
        this.Alpha = Alpha;
    }

    /**
     * Get <p>LoRA dropout</p> 
     * @return Dropout <p>LoRA dropout</p>
     */
    public Float getDropout() {
        return this.Dropout;
    }

    /**
     * Set <p>LoRA dropout</p>
     * @param Dropout <p>LoRA dropout</p>
     */
    public void setDropout(Float Dropout) {
        this.Dropout = Dropout;
    }

    /**
     * Get <p>注入的目标模块</p> 
     * @return TargetModules <p>注入的目标模块</p>
     */
    public String [] getTargetModules() {
        return this.TargetModules;
    }

    /**
     * Set <p>注入的目标模块</p>
     * @param TargetModules <p>注入的目标模块</p>
     */
    public void setTargetModules(String [] TargetModules) {
        this.TargetModules = TargetModules;
    }

    /**
     * Get <p>PEFT 类型（如 LORA）</p> 
     * @return PEFTType <p>PEFT 类型（如 LORA）</p>
     */
    public String getPEFTType() {
        return this.PEFTType;
    }

    /**
     * Set <p>PEFT 类型（如 LORA）</p>
     * @param PEFTType <p>PEFT 类型（如 LORA）</p>
     */
    public void setPEFTType(String PEFTType) {
        this.PEFTType = PEFTType;
    }

    /**
     * Get <p>任务类型（如 CAUSAL_LM）</p> 
     * @return TaskType <p>任务类型（如 CAUSAL_LM）</p>
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set <p>任务类型（如 CAUSAL_LM）</p>
     * @param TaskType <p>任务类型（如 CAUSAL_LM）</p>
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get <p>训练时声明的基座名称或路径（base_model_name_or_path）</p> 
     * @return BaseModelNameOrPath <p>训练时声明的基座名称或路径（base_model_name_or_path）</p>
     */
    public String getBaseModelNameOrPath() {
        return this.BaseModelNameOrPath;
    }

    /**
     * Set <p>训练时声明的基座名称或路径（base_model_name_or_path）</p>
     * @param BaseModelNameOrPath <p>训练时声明的基座名称或路径（base_model_name_or_path）</p>
     */
    public void setBaseModelNameOrPath(String BaseModelNameOrPath) {
        this.BaseModelNameOrPath = BaseModelNameOrPath;
    }

    /**
     * Get <p>最大 rank（含 rank_pattern 分模块 rank；仅当其大于 Rank 时返回）</p> 
     * @return MaxRank <p>最大 rank（含 rank_pattern 分模块 rank；仅当其大于 Rank 时返回）</p>
     */
    public Long getMaxRank() {
        return this.MaxRank;
    }

    /**
     * Set <p>最大 rank（含 rank_pattern 分模块 rank；仅当其大于 Rank 时返回）</p>
     * @param MaxRank <p>最大 rank（含 rank_pattern 分模块 rank；仅当其大于 Rank 时返回）</p>
     */
    public void setMaxRank(Long MaxRank) {
        this.MaxRank = MaxRank;
    }

    public LoraVersionMeta() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoraVersionMeta(LoraVersionMeta source) {
        if (source.Rank != null) {
            this.Rank = new Long(source.Rank);
        }
        if (source.Alpha != null) {
            this.Alpha = new Long(source.Alpha);
        }
        if (source.Dropout != null) {
            this.Dropout = new Float(source.Dropout);
        }
        if (source.TargetModules != null) {
            this.TargetModules = new String[source.TargetModules.length];
            for (int i = 0; i < source.TargetModules.length; i++) {
                this.TargetModules[i] = new String(source.TargetModules[i]);
            }
        }
        if (source.PEFTType != null) {
            this.PEFTType = new String(source.PEFTType);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.BaseModelNameOrPath != null) {
            this.BaseModelNameOrPath = new String(source.BaseModelNameOrPath);
        }
        if (source.MaxRank != null) {
            this.MaxRank = new Long(source.MaxRank);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Rank", this.Rank);
        this.setParamSimple(map, prefix + "Alpha", this.Alpha);
        this.setParamSimple(map, prefix + "Dropout", this.Dropout);
        this.setParamArraySimple(map, prefix + "TargetModules.", this.TargetModules);
        this.setParamSimple(map, prefix + "PEFTType", this.PEFTType);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "BaseModelNameOrPath", this.BaseModelNameOrPath);
        this.setParamSimple(map, prefix + "MaxRank", this.MaxRank);

    }
}

