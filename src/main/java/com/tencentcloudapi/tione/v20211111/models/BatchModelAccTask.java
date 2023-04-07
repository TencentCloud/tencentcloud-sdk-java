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

public class BatchModelAccTask extends AbstractModel{

    /**
    * 模型ID
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 模型版本
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * 模型来源(JOB/COS)
    */
    @SerializedName("ModelSource")
    @Expose
    private String ModelSource;

    /**
    * 模型格式(TORCH_SCRIPT/DETECTRON2/SAVED_MODEL/FROZEN_GRAPH/MMDETECTION/ONNX/HUGGING_FACE)
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
    * 加速引擎版本
    */
    @SerializedName("AccEngineVersion")
    @Expose
    private String AccEngineVersion;

    /**
    * 模型输入cos路径
    */
    @SerializedName("ModelInputPath")
    @Expose
    private CosPathInfo ModelInputPath;

    /**
    * 模型名称
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * SavedModel保存时配置的签名
    */
    @SerializedName("ModelSignature")
    @Expose
    private String ModelSignature;

    /**
    * 加速引擎对应的框架版本
    */
    @SerializedName("FrameworkVersion")
    @Expose
    private String FrameworkVersion;

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
     * Get 模型来源(JOB/COS) 
     * @return ModelSource 模型来源(JOB/COS)
     */
    public String getModelSource() {
        return this.ModelSource;
    }

    /**
     * Set 模型来源(JOB/COS)
     * @param ModelSource 模型来源(JOB/COS)
     */
    public void setModelSource(String ModelSource) {
        this.ModelSource = ModelSource;
    }

    /**
     * Get 模型格式(TORCH_SCRIPT/DETECTRON2/SAVED_MODEL/FROZEN_GRAPH/MMDETECTION/ONNX/HUGGING_FACE) 
     * @return ModelFormat 模型格式(TORCH_SCRIPT/DETECTRON2/SAVED_MODEL/FROZEN_GRAPH/MMDETECTION/ONNX/HUGGING_FACE)
     */
    public String getModelFormat() {
        return this.ModelFormat;
    }

    /**
     * Set 模型格式(TORCH_SCRIPT/DETECTRON2/SAVED_MODEL/FROZEN_GRAPH/MMDETECTION/ONNX/HUGGING_FACE)
     * @param ModelFormat 模型格式(TORCH_SCRIPT/DETECTRON2/SAVED_MODEL/FROZEN_GRAPH/MMDETECTION/ONNX/HUGGING_FACE)
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

    /**
     * Get 加速引擎对应的框架版本 
     * @return FrameworkVersion 加速引擎对应的框架版本
     */
    public String getFrameworkVersion() {
        return this.FrameworkVersion;
    }

    /**
     * Set 加速引擎对应的框架版本
     * @param FrameworkVersion 加速引擎对应的框架版本
     */
    public void setFrameworkVersion(String FrameworkVersion) {
        this.FrameworkVersion = FrameworkVersion;
    }

    public BatchModelAccTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchModelAccTask(BatchModelAccTask source) {
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.ModelSource != null) {
            this.ModelSource = new String(source.ModelSource);
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
        if (source.AccEngineVersion != null) {
            this.AccEngineVersion = new String(source.AccEngineVersion);
        }
        if (source.ModelInputPath != null) {
            this.ModelInputPath = new CosPathInfo(source.ModelInputPath);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.ModelSignature != null) {
            this.ModelSignature = new String(source.ModelSignature);
        }
        if (source.FrameworkVersion != null) {
            this.FrameworkVersion = new String(source.FrameworkVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "ModelSource", this.ModelSource);
        this.setParamSimple(map, prefix + "ModelFormat", this.ModelFormat);
        this.setParamArraySimple(map, prefix + "TensorInfos.", this.TensorInfos);
        this.setParamSimple(map, prefix + "AccEngineVersion", this.AccEngineVersion);
        this.setParamObj(map, prefix + "ModelInputPath.", this.ModelInputPath);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelSignature", this.ModelSignature);
        this.setParamSimple(map, prefix + "FrameworkVersion", this.FrameworkVersion);

    }
}

