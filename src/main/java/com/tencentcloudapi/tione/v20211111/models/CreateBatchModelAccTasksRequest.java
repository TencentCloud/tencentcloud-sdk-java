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

public class CreateBatchModelAccTasksRequest extends AbstractModel{

    /**
    * 模型加速任务名称
    */
    @SerializedName("ModelAccTaskName")
    @Expose
    private String ModelAccTaskName;

    /**
    * 批量模型加速任务
    */
    @SerializedName("BatchModelAccTasks")
    @Expose
    private BatchModelAccTask [] BatchModelAccTasks;

    /**
    * 模型加速保存路径
    */
    @SerializedName("ModelOutputPath")
    @Expose
    private CosPathInfo ModelOutputPath;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 优化级别(NO_LOSS/FP16/INT8)，默认FP16
    */
    @SerializedName("OptimizationLevel")
    @Expose
    private String OptimizationLevel;

    /**
    * GPU卡类型(T4/V100/A10)，默认T4
    */
    @SerializedName("GPUType")
    @Expose
    private String GPUType;

    /**
    * 专业参数设置
    */
    @SerializedName("HyperParameter")
    @Expose
    private HyperParameter HyperParameter;

    /**
     * Get 模型加速任务名称 
     * @return ModelAccTaskName 模型加速任务名称
     */
    public String getModelAccTaskName() {
        return this.ModelAccTaskName;
    }

    /**
     * Set 模型加速任务名称
     * @param ModelAccTaskName 模型加速任务名称
     */
    public void setModelAccTaskName(String ModelAccTaskName) {
        this.ModelAccTaskName = ModelAccTaskName;
    }

    /**
     * Get 批量模型加速任务 
     * @return BatchModelAccTasks 批量模型加速任务
     */
    public BatchModelAccTask [] getBatchModelAccTasks() {
        return this.BatchModelAccTasks;
    }

    /**
     * Set 批量模型加速任务
     * @param BatchModelAccTasks 批量模型加速任务
     */
    public void setBatchModelAccTasks(BatchModelAccTask [] BatchModelAccTasks) {
        this.BatchModelAccTasks = BatchModelAccTasks;
    }

    /**
     * Get 模型加速保存路径 
     * @return ModelOutputPath 模型加速保存路径
     */
    public CosPathInfo getModelOutputPath() {
        return this.ModelOutputPath;
    }

    /**
     * Set 模型加速保存路径
     * @param ModelOutputPath 模型加速保存路径
     */
    public void setModelOutputPath(CosPathInfo ModelOutputPath) {
        this.ModelOutputPath = ModelOutputPath;
    }

    /**
     * Get 标签 
     * @return Tags 标签
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
     * @param Tags 标签
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 优化级别(NO_LOSS/FP16/INT8)，默认FP16 
     * @return OptimizationLevel 优化级别(NO_LOSS/FP16/INT8)，默认FP16
     */
    public String getOptimizationLevel() {
        return this.OptimizationLevel;
    }

    /**
     * Set 优化级别(NO_LOSS/FP16/INT8)，默认FP16
     * @param OptimizationLevel 优化级别(NO_LOSS/FP16/INT8)，默认FP16
     */
    public void setOptimizationLevel(String OptimizationLevel) {
        this.OptimizationLevel = OptimizationLevel;
    }

    /**
     * Get GPU卡类型(T4/V100/A10)，默认T4 
     * @return GPUType GPU卡类型(T4/V100/A10)，默认T4
     */
    public String getGPUType() {
        return this.GPUType;
    }

    /**
     * Set GPU卡类型(T4/V100/A10)，默认T4
     * @param GPUType GPU卡类型(T4/V100/A10)，默认T4
     */
    public void setGPUType(String GPUType) {
        this.GPUType = GPUType;
    }

    /**
     * Get 专业参数设置 
     * @return HyperParameter 专业参数设置
     */
    public HyperParameter getHyperParameter() {
        return this.HyperParameter;
    }

    /**
     * Set 专业参数设置
     * @param HyperParameter 专业参数设置
     */
    public void setHyperParameter(HyperParameter HyperParameter) {
        this.HyperParameter = HyperParameter;
    }

    public CreateBatchModelAccTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBatchModelAccTasksRequest(CreateBatchModelAccTasksRequest source) {
        if (source.ModelAccTaskName != null) {
            this.ModelAccTaskName = new String(source.ModelAccTaskName);
        }
        if (source.BatchModelAccTasks != null) {
            this.BatchModelAccTasks = new BatchModelAccTask[source.BatchModelAccTasks.length];
            for (int i = 0; i < source.BatchModelAccTasks.length; i++) {
                this.BatchModelAccTasks[i] = new BatchModelAccTask(source.BatchModelAccTasks[i]);
            }
        }
        if (source.ModelOutputPath != null) {
            this.ModelOutputPath = new CosPathInfo(source.ModelOutputPath);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.OptimizationLevel != null) {
            this.OptimizationLevel = new String(source.OptimizationLevel);
        }
        if (source.GPUType != null) {
            this.GPUType = new String(source.GPUType);
        }
        if (source.HyperParameter != null) {
            this.HyperParameter = new HyperParameter(source.HyperParameter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelAccTaskName", this.ModelAccTaskName);
        this.setParamArrayObj(map, prefix + "BatchModelAccTasks.", this.BatchModelAccTasks);
        this.setParamObj(map, prefix + "ModelOutputPath.", this.ModelOutputPath);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "OptimizationLevel", this.OptimizationLevel);
        this.setParamSimple(map, prefix + "GPUType", this.GPUType);
        this.setParamObj(map, prefix + "HyperParameter.", this.HyperParameter);

    }
}

