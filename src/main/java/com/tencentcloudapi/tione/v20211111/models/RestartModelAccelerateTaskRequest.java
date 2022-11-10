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

public class RestartModelAccelerateTaskRequest extends AbstractModel{

    /**
    * 模型加速任务ID
    */
    @SerializedName("ModelAccTaskId")
    @Expose
    private String ModelAccTaskId;

    /**
    * 模型加速任务名称
    */
    @SerializedName("ModelAccTaskName")
    @Expose
    private String ModelAccTaskName;

    /**
    * 模型来源（JOB/COS）
    */
    @SerializedName("ModelSource")
    @Expose
    private String ModelSource;

    /**
    * 算法框架（废弃）
    */
    @SerializedName("AlgorithmFramework")
    @Expose
    private String AlgorithmFramework;

    /**
    * 模型ID
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 模型名称
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 模型版本
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * 模型输入cos路径
    */
    @SerializedName("ModelInputPath")
    @Expose
    private CosPathInfo ModelInputPath;

    /**
    * 优化级别（NO_LOSS/FP16），默认FP16
    */
    @SerializedName("OptimizationLevel")
    @Expose
    private String OptimizationLevel;

    /**
    * input节点个数（废弃）
    */
    @SerializedName("ModelInputNum")
    @Expose
    private Long ModelInputNum;

    /**
    * input节点信息（废弃）
    */
    @SerializedName("ModelInputInfos")
    @Expose
    private ModelInputInfo [] ModelInputInfos;

    /**
    * 模型输出cos路径
    */
    @SerializedName("ModelOutputPath")
    @Expose
    private CosPathInfo ModelOutputPath;

    /**
    * 模型格式（TORCH_SCRIPT/DETECTRON2/SAVED_MODEL/FROZEN_GRAPH/MMDETECTION/ONNX/HUGGING_FACE）
    */
    @SerializedName("ModelFormat")
    @Expose
    private String ModelFormat;

    /**
    * 模型Tensor信息
    */
    @SerializedName("TensorInfos")
    @Expose
    private String [] TensorInfos;

    /**
    * GPU类型（T4/V100），默认T4
    */
    @SerializedName("GPUType")
    @Expose
    private String GPUType;

    /**
    * 模型专业参数
    */
    @SerializedName("HyperParameter")
    @Expose
    private HyperParameter HyperParameter;

    /**
    * 加速引擎版本
    */
    @SerializedName("AccEngineVersion")
    @Expose
    private String AccEngineVersion;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * SavedModel保存时配置的签名
    */
    @SerializedName("ModelSignature")
    @Expose
    private String ModelSignature;

    /**
     * Get 模型加速任务ID 
     * @return ModelAccTaskId 模型加速任务ID
     */
    public String getModelAccTaskId() {
        return this.ModelAccTaskId;
    }

    /**
     * Set 模型加速任务ID
     * @param ModelAccTaskId 模型加速任务ID
     */
    public void setModelAccTaskId(String ModelAccTaskId) {
        this.ModelAccTaskId = ModelAccTaskId;
    }

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
     * Get 模型来源（JOB/COS） 
     * @return ModelSource 模型来源（JOB/COS）
     */
    public String getModelSource() {
        return this.ModelSource;
    }

    /**
     * Set 模型来源（JOB/COS）
     * @param ModelSource 模型来源（JOB/COS）
     */
    public void setModelSource(String ModelSource) {
        this.ModelSource = ModelSource;
    }

    /**
     * Get 算法框架（废弃） 
     * @return AlgorithmFramework 算法框架（废弃）
     */
    public String getAlgorithmFramework() {
        return this.AlgorithmFramework;
    }

    /**
     * Set 算法框架（废弃）
     * @param AlgorithmFramework 算法框架（废弃）
     */
    public void setAlgorithmFramework(String AlgorithmFramework) {
        this.AlgorithmFramework = AlgorithmFramework;
    }

    /**
     * Get 模型ID 
     * @return ModelId 模型ID
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 模型ID
     * @param ModelId 模型ID
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 模型名称 
     * @return ModelName 模型名称
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 模型名称
     * @param ModelName 模型名称
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 模型版本 
     * @return ModelVersion 模型版本
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set 模型版本
     * @param ModelVersion 模型版本
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get 模型输入cos路径 
     * @return ModelInputPath 模型输入cos路径
     */
    public CosPathInfo getModelInputPath() {
        return this.ModelInputPath;
    }

    /**
     * Set 模型输入cos路径
     * @param ModelInputPath 模型输入cos路径
     */
    public void setModelInputPath(CosPathInfo ModelInputPath) {
        this.ModelInputPath = ModelInputPath;
    }

    /**
     * Get 优化级别（NO_LOSS/FP16），默认FP16 
     * @return OptimizationLevel 优化级别（NO_LOSS/FP16），默认FP16
     */
    public String getOptimizationLevel() {
        return this.OptimizationLevel;
    }

    /**
     * Set 优化级别（NO_LOSS/FP16），默认FP16
     * @param OptimizationLevel 优化级别（NO_LOSS/FP16），默认FP16
     */
    public void setOptimizationLevel(String OptimizationLevel) {
        this.OptimizationLevel = OptimizationLevel;
    }

    /**
     * Get input节点个数（废弃） 
     * @return ModelInputNum input节点个数（废弃）
     */
    public Long getModelInputNum() {
        return this.ModelInputNum;
    }

    /**
     * Set input节点个数（废弃）
     * @param ModelInputNum input节点个数（废弃）
     */
    public void setModelInputNum(Long ModelInputNum) {
        this.ModelInputNum = ModelInputNum;
    }

    /**
     * Get input节点信息（废弃） 
     * @return ModelInputInfos input节点信息（废弃）
     */
    public ModelInputInfo [] getModelInputInfos() {
        return this.ModelInputInfos;
    }

    /**
     * Set input节点信息（废弃）
     * @param ModelInputInfos input节点信息（废弃）
     */
    public void setModelInputInfos(ModelInputInfo [] ModelInputInfos) {
        this.ModelInputInfos = ModelInputInfos;
    }

    /**
     * Get 模型输出cos路径 
     * @return ModelOutputPath 模型输出cos路径
     */
    public CosPathInfo getModelOutputPath() {
        return this.ModelOutputPath;
    }

    /**
     * Set 模型输出cos路径
     * @param ModelOutputPath 模型输出cos路径
     */
    public void setModelOutputPath(CosPathInfo ModelOutputPath) {
        this.ModelOutputPath = ModelOutputPath;
    }

    /**
     * Get 模型格式（TORCH_SCRIPT/DETECTRON2/SAVED_MODEL/FROZEN_GRAPH/MMDETECTION/ONNX/HUGGING_FACE） 
     * @return ModelFormat 模型格式（TORCH_SCRIPT/DETECTRON2/SAVED_MODEL/FROZEN_GRAPH/MMDETECTION/ONNX/HUGGING_FACE）
     */
    public String getModelFormat() {
        return this.ModelFormat;
    }

    /**
     * Set 模型格式（TORCH_SCRIPT/DETECTRON2/SAVED_MODEL/FROZEN_GRAPH/MMDETECTION/ONNX/HUGGING_FACE）
     * @param ModelFormat 模型格式（TORCH_SCRIPT/DETECTRON2/SAVED_MODEL/FROZEN_GRAPH/MMDETECTION/ONNX/HUGGING_FACE）
     */
    public void setModelFormat(String ModelFormat) {
        this.ModelFormat = ModelFormat;
    }

    /**
     * Get 模型Tensor信息 
     * @return TensorInfos 模型Tensor信息
     */
    public String [] getTensorInfos() {
        return this.TensorInfos;
    }

    /**
     * Set 模型Tensor信息
     * @param TensorInfos 模型Tensor信息
     */
    public void setTensorInfos(String [] TensorInfos) {
        this.TensorInfos = TensorInfos;
    }

    /**
     * Get GPU类型（T4/V100），默认T4 
     * @return GPUType GPU类型（T4/V100），默认T4
     */
    public String getGPUType() {
        return this.GPUType;
    }

    /**
     * Set GPU类型（T4/V100），默认T4
     * @param GPUType GPU类型（T4/V100），默认T4
     */
    public void setGPUType(String GPUType) {
        this.GPUType = GPUType;
    }

    /**
     * Get 模型专业参数 
     * @return HyperParameter 模型专业参数
     */
    public HyperParameter getHyperParameter() {
        return this.HyperParameter;
    }

    /**
     * Set 模型专业参数
     * @param HyperParameter 模型专业参数
     */
    public void setHyperParameter(HyperParameter HyperParameter) {
        this.HyperParameter = HyperParameter;
    }

    /**
     * Get 加速引擎版本 
     * @return AccEngineVersion 加速引擎版本
     */
    public String getAccEngineVersion() {
        return this.AccEngineVersion;
    }

    /**
     * Set 加速引擎版本
     * @param AccEngineVersion 加速引擎版本
     */
    public void setAccEngineVersion(String AccEngineVersion) {
        this.AccEngineVersion = AccEngineVersion;
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
     * Get SavedModel保存时配置的签名 
     * @return ModelSignature SavedModel保存时配置的签名
     */
    public String getModelSignature() {
        return this.ModelSignature;
    }

    /**
     * Set SavedModel保存时配置的签名
     * @param ModelSignature SavedModel保存时配置的签名
     */
    public void setModelSignature(String ModelSignature) {
        this.ModelSignature = ModelSignature;
    }

    public RestartModelAccelerateTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestartModelAccelerateTaskRequest(RestartModelAccelerateTaskRequest source) {
        if (source.ModelAccTaskId != null) {
            this.ModelAccTaskId = new String(source.ModelAccTaskId);
        }
        if (source.ModelAccTaskName != null) {
            this.ModelAccTaskName = new String(source.ModelAccTaskName);
        }
        if (source.ModelSource != null) {
            this.ModelSource = new String(source.ModelSource);
        }
        if (source.AlgorithmFramework != null) {
            this.AlgorithmFramework = new String(source.AlgorithmFramework);
        }
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.ModelInputPath != null) {
            this.ModelInputPath = new CosPathInfo(source.ModelInputPath);
        }
        if (source.OptimizationLevel != null) {
            this.OptimizationLevel = new String(source.OptimizationLevel);
        }
        if (source.ModelInputNum != null) {
            this.ModelInputNum = new Long(source.ModelInputNum);
        }
        if (source.ModelInputInfos != null) {
            this.ModelInputInfos = new ModelInputInfo[source.ModelInputInfos.length];
            for (int i = 0; i < source.ModelInputInfos.length; i++) {
                this.ModelInputInfos[i] = new ModelInputInfo(source.ModelInputInfos[i]);
            }
        }
        if (source.ModelOutputPath != null) {
            this.ModelOutputPath = new CosPathInfo(source.ModelOutputPath);
        }
        if (source.ModelFormat != null) {
            this.ModelFormat = new String(source.ModelFormat);
        }
        if (source.TensorInfos != null) {
            this.TensorInfos = new String[source.TensorInfos.length];
            for (int i = 0; i < source.TensorInfos.length; i++) {
                this.TensorInfos[i] = new String(source.TensorInfos[i]);
            }
        }
        if (source.GPUType != null) {
            this.GPUType = new String(source.GPUType);
        }
        if (source.HyperParameter != null) {
            this.HyperParameter = new HyperParameter(source.HyperParameter);
        }
        if (source.AccEngineVersion != null) {
            this.AccEngineVersion = new String(source.AccEngineVersion);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.ModelSignature != null) {
            this.ModelSignature = new String(source.ModelSignature);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelAccTaskId", this.ModelAccTaskId);
        this.setParamSimple(map, prefix + "ModelAccTaskName", this.ModelAccTaskName);
        this.setParamSimple(map, prefix + "ModelSource", this.ModelSource);
        this.setParamSimple(map, prefix + "AlgorithmFramework", this.AlgorithmFramework);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamObj(map, prefix + "ModelInputPath.", this.ModelInputPath);
        this.setParamSimple(map, prefix + "OptimizationLevel", this.OptimizationLevel);
        this.setParamSimple(map, prefix + "ModelInputNum", this.ModelInputNum);
        this.setParamArrayObj(map, prefix + "ModelInputInfos.", this.ModelInputInfos);
        this.setParamObj(map, prefix + "ModelOutputPath.", this.ModelOutputPath);
        this.setParamSimple(map, prefix + "ModelFormat", this.ModelFormat);
        this.setParamArraySimple(map, prefix + "TensorInfos.", this.TensorInfos);
        this.setParamSimple(map, prefix + "GPUType", this.GPUType);
        this.setParamObj(map, prefix + "HyperParameter.", this.HyperParameter);
        this.setParamSimple(map, prefix + "AccEngineVersion", this.AccEngineVersion);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ModelSignature", this.ModelSignature);

    }
}

