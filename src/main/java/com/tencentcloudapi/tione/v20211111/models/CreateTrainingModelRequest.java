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

public class CreateTrainingModelRequest extends AbstractModel{

    /**
    * 导入方式（MODEL/VERSION）
    */
    @SerializedName("ImportMethod")
    @Expose
    private String ImportMethod;

    /**
    * 模型来源cos目录，以/结尾
    */
    @SerializedName("TrainingModelCosPath")
    @Expose
    private CosPathInfo TrainingModelCosPath;

    /**
    * 推理环境来源（SYSTEM/CUSTOM）
    */
    @SerializedName("ReasoningEnvironmentSource")
    @Expose
    private String ReasoningEnvironmentSource;

    /**
    * 模型名称，不超过60个字符，仅支持中英文、数字、下划线"_"、短横"-"，只能以中英文、数字开头
    */
    @SerializedName("TrainingModelName")
    @Expose
    private String TrainingModelName;

    /**
    * 标签配置
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 训练任务名称
    */
    @SerializedName("TrainingJobName")
    @Expose
    private String TrainingJobName;

    /**
    * 算法框架 （PYTORCH/TENSORFLOW/DETECTRON2/PMML)
    */
    @SerializedName("AlgorithmFramework")
    @Expose
    private String AlgorithmFramework;

    /**
    * 推理环境
    */
    @SerializedName("ReasoningEnvironment")
    @Expose
    private String ReasoningEnvironment;

    /**
    * 训练指标，最多支持1000字符
    */
    @SerializedName("TrainingModelIndex")
    @Expose
    private String TrainingModelIndex;

    /**
    * 模型版本
    */
    @SerializedName("TrainingModelVersion")
    @Expose
    private String TrainingModelVersion;

    /**
    * 自定义推理环境
    */
    @SerializedName("ReasoningImageInfo")
    @Expose
    private ImageInfo ReasoningImageInfo;

    /**
    * 模型移动方式（CUT/COPY）
    */
    @SerializedName("ModelMoveMode")
    @Expose
    private String ModelMoveMode;

    /**
    * 训练任务ID
    */
    @SerializedName("TrainingJobId")
    @Expose
    private String TrainingJobId;

    /**
    * 模型ID（导入新模型不需要，导入新版本需要）
    */
    @SerializedName("TrainingModelId")
    @Expose
    private String TrainingModelId;

    /**
    * 模型存储cos目录
    */
    @SerializedName("ModelOutputPath")
    @Expose
    private CosPathInfo ModelOutputPath;

    /**
    * 模型来源 （JOB/COS/AUTO_ML）
    */
    @SerializedName("TrainingModelSource")
    @Expose
    private String TrainingModelSource;

    /**
    * 模型偏好
    */
    @SerializedName("TrainingPreference")
    @Expose
    private String TrainingPreference;

    /**
    * 自动学习任务ID
    */
    @SerializedName("AutoMLTaskId")
    @Expose
    private String AutoMLTaskId;

    /**
    * 任务版本
    */
    @SerializedName("TrainingJobVersion")
    @Expose
    private String TrainingJobVersion;

    /**
    * 模型版本类型；
枚举值：NORMAL(通用)  ACCELERATE(加速)
注意:  默认为NORMAL
    */
    @SerializedName("ModelVersionType")
    @Expose
    private String ModelVersionType;

    /**
    * 模型格式 （PYTORCH/TORCH_SCRIPT/DETECTRON2/SAVED_MODEL/FROZEN_GRAPH/PMML）
    */
    @SerializedName("ModelFormat")
    @Expose
    private String ModelFormat;

    /**
     * Get 导入方式（MODEL/VERSION） 
     * @return ImportMethod 导入方式（MODEL/VERSION）
     */
    public String getImportMethod() {
        return this.ImportMethod;
    }

    /**
     * Set 导入方式（MODEL/VERSION）
     * @param ImportMethod 导入方式（MODEL/VERSION）
     */
    public void setImportMethod(String ImportMethod) {
        this.ImportMethod = ImportMethod;
    }

    /**
     * Get 模型来源cos目录，以/结尾 
     * @return TrainingModelCosPath 模型来源cos目录，以/结尾
     */
    public CosPathInfo getTrainingModelCosPath() {
        return this.TrainingModelCosPath;
    }

    /**
     * Set 模型来源cos目录，以/结尾
     * @param TrainingModelCosPath 模型来源cos目录，以/结尾
     */
    public void setTrainingModelCosPath(CosPathInfo TrainingModelCosPath) {
        this.TrainingModelCosPath = TrainingModelCosPath;
    }

    /**
     * Get 推理环境来源（SYSTEM/CUSTOM） 
     * @return ReasoningEnvironmentSource 推理环境来源（SYSTEM/CUSTOM）
     */
    public String getReasoningEnvironmentSource() {
        return this.ReasoningEnvironmentSource;
    }

    /**
     * Set 推理环境来源（SYSTEM/CUSTOM）
     * @param ReasoningEnvironmentSource 推理环境来源（SYSTEM/CUSTOM）
     */
    public void setReasoningEnvironmentSource(String ReasoningEnvironmentSource) {
        this.ReasoningEnvironmentSource = ReasoningEnvironmentSource;
    }

    /**
     * Get 模型名称，不超过60个字符，仅支持中英文、数字、下划线"_"、短横"-"，只能以中英文、数字开头 
     * @return TrainingModelName 模型名称，不超过60个字符，仅支持中英文、数字、下划线"_"、短横"-"，只能以中英文、数字开头
     */
    public String getTrainingModelName() {
        return this.TrainingModelName;
    }

    /**
     * Set 模型名称，不超过60个字符，仅支持中英文、数字、下划线"_"、短横"-"，只能以中英文、数字开头
     * @param TrainingModelName 模型名称，不超过60个字符，仅支持中英文、数字、下划线"_"、短横"-"，只能以中英文、数字开头
     */
    public void setTrainingModelName(String TrainingModelName) {
        this.TrainingModelName = TrainingModelName;
    }

    /**
     * Get 标签配置 
     * @return Tags 标签配置
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签配置
     * @param Tags 标签配置
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 训练任务名称 
     * @return TrainingJobName 训练任务名称
     */
    public String getTrainingJobName() {
        return this.TrainingJobName;
    }

    /**
     * Set 训练任务名称
     * @param TrainingJobName 训练任务名称
     */
    public void setTrainingJobName(String TrainingJobName) {
        this.TrainingJobName = TrainingJobName;
    }

    /**
     * Get 算法框架 （PYTORCH/TENSORFLOW/DETECTRON2/PMML) 
     * @return AlgorithmFramework 算法框架 （PYTORCH/TENSORFLOW/DETECTRON2/PMML)
     */
    public String getAlgorithmFramework() {
        return this.AlgorithmFramework;
    }

    /**
     * Set 算法框架 （PYTORCH/TENSORFLOW/DETECTRON2/PMML)
     * @param AlgorithmFramework 算法框架 （PYTORCH/TENSORFLOW/DETECTRON2/PMML)
     */
    public void setAlgorithmFramework(String AlgorithmFramework) {
        this.AlgorithmFramework = AlgorithmFramework;
    }

    /**
     * Get 推理环境 
     * @return ReasoningEnvironment 推理环境
     */
    public String getReasoningEnvironment() {
        return this.ReasoningEnvironment;
    }

    /**
     * Set 推理环境
     * @param ReasoningEnvironment 推理环境
     */
    public void setReasoningEnvironment(String ReasoningEnvironment) {
        this.ReasoningEnvironment = ReasoningEnvironment;
    }

    /**
     * Get 训练指标，最多支持1000字符 
     * @return TrainingModelIndex 训练指标，最多支持1000字符
     */
    public String getTrainingModelIndex() {
        return this.TrainingModelIndex;
    }

    /**
     * Set 训练指标，最多支持1000字符
     * @param TrainingModelIndex 训练指标，最多支持1000字符
     */
    public void setTrainingModelIndex(String TrainingModelIndex) {
        this.TrainingModelIndex = TrainingModelIndex;
    }

    /**
     * Get 模型版本 
     * @return TrainingModelVersion 模型版本
     */
    public String getTrainingModelVersion() {
        return this.TrainingModelVersion;
    }

    /**
     * Set 模型版本
     * @param TrainingModelVersion 模型版本
     */
    public void setTrainingModelVersion(String TrainingModelVersion) {
        this.TrainingModelVersion = TrainingModelVersion;
    }

    /**
     * Get 自定义推理环境 
     * @return ReasoningImageInfo 自定义推理环境
     */
    public ImageInfo getReasoningImageInfo() {
        return this.ReasoningImageInfo;
    }

    /**
     * Set 自定义推理环境
     * @param ReasoningImageInfo 自定义推理环境
     */
    public void setReasoningImageInfo(ImageInfo ReasoningImageInfo) {
        this.ReasoningImageInfo = ReasoningImageInfo;
    }

    /**
     * Get 模型移动方式（CUT/COPY） 
     * @return ModelMoveMode 模型移动方式（CUT/COPY）
     */
    public String getModelMoveMode() {
        return this.ModelMoveMode;
    }

    /**
     * Set 模型移动方式（CUT/COPY）
     * @param ModelMoveMode 模型移动方式（CUT/COPY）
     */
    public void setModelMoveMode(String ModelMoveMode) {
        this.ModelMoveMode = ModelMoveMode;
    }

    /**
     * Get 训练任务ID 
     * @return TrainingJobId 训练任务ID
     */
    public String getTrainingJobId() {
        return this.TrainingJobId;
    }

    /**
     * Set 训练任务ID
     * @param TrainingJobId 训练任务ID
     */
    public void setTrainingJobId(String TrainingJobId) {
        this.TrainingJobId = TrainingJobId;
    }

    /**
     * Get 模型ID（导入新模型不需要，导入新版本需要） 
     * @return TrainingModelId 模型ID（导入新模型不需要，导入新版本需要）
     */
    public String getTrainingModelId() {
        return this.TrainingModelId;
    }

    /**
     * Set 模型ID（导入新模型不需要，导入新版本需要）
     * @param TrainingModelId 模型ID（导入新模型不需要，导入新版本需要）
     */
    public void setTrainingModelId(String TrainingModelId) {
        this.TrainingModelId = TrainingModelId;
    }

    /**
     * Get 模型存储cos目录 
     * @return ModelOutputPath 模型存储cos目录
     */
    public CosPathInfo getModelOutputPath() {
        return this.ModelOutputPath;
    }

    /**
     * Set 模型存储cos目录
     * @param ModelOutputPath 模型存储cos目录
     */
    public void setModelOutputPath(CosPathInfo ModelOutputPath) {
        this.ModelOutputPath = ModelOutputPath;
    }

    /**
     * Get 模型来源 （JOB/COS/AUTO_ML） 
     * @return TrainingModelSource 模型来源 （JOB/COS/AUTO_ML）
     */
    public String getTrainingModelSource() {
        return this.TrainingModelSource;
    }

    /**
     * Set 模型来源 （JOB/COS/AUTO_ML）
     * @param TrainingModelSource 模型来源 （JOB/COS/AUTO_ML）
     */
    public void setTrainingModelSource(String TrainingModelSource) {
        this.TrainingModelSource = TrainingModelSource;
    }

    /**
     * Get 模型偏好 
     * @return TrainingPreference 模型偏好
     */
    public String getTrainingPreference() {
        return this.TrainingPreference;
    }

    /**
     * Set 模型偏好
     * @param TrainingPreference 模型偏好
     */
    public void setTrainingPreference(String TrainingPreference) {
        this.TrainingPreference = TrainingPreference;
    }

    /**
     * Get 自动学习任务ID 
     * @return AutoMLTaskId 自动学习任务ID
     */
    public String getAutoMLTaskId() {
        return this.AutoMLTaskId;
    }

    /**
     * Set 自动学习任务ID
     * @param AutoMLTaskId 自动学习任务ID
     */
    public void setAutoMLTaskId(String AutoMLTaskId) {
        this.AutoMLTaskId = AutoMLTaskId;
    }

    /**
     * Get 任务版本 
     * @return TrainingJobVersion 任务版本
     */
    public String getTrainingJobVersion() {
        return this.TrainingJobVersion;
    }

    /**
     * Set 任务版本
     * @param TrainingJobVersion 任务版本
     */
    public void setTrainingJobVersion(String TrainingJobVersion) {
        this.TrainingJobVersion = TrainingJobVersion;
    }

    /**
     * Get 模型版本类型；
枚举值：NORMAL(通用)  ACCELERATE(加速)
注意:  默认为NORMAL 
     * @return ModelVersionType 模型版本类型；
枚举值：NORMAL(通用)  ACCELERATE(加速)
注意:  默认为NORMAL
     */
    public String getModelVersionType() {
        return this.ModelVersionType;
    }

    /**
     * Set 模型版本类型；
枚举值：NORMAL(通用)  ACCELERATE(加速)
注意:  默认为NORMAL
     * @param ModelVersionType 模型版本类型；
枚举值：NORMAL(通用)  ACCELERATE(加速)
注意:  默认为NORMAL
     */
    public void setModelVersionType(String ModelVersionType) {
        this.ModelVersionType = ModelVersionType;
    }

    /**
     * Get 模型格式 （PYTORCH/TORCH_SCRIPT/DETECTRON2/SAVED_MODEL/FROZEN_GRAPH/PMML） 
     * @return ModelFormat 模型格式 （PYTORCH/TORCH_SCRIPT/DETECTRON2/SAVED_MODEL/FROZEN_GRAPH/PMML）
     */
    public String getModelFormat() {
        return this.ModelFormat;
    }

    /**
     * Set 模型格式 （PYTORCH/TORCH_SCRIPT/DETECTRON2/SAVED_MODEL/FROZEN_GRAPH/PMML）
     * @param ModelFormat 模型格式 （PYTORCH/TORCH_SCRIPT/DETECTRON2/SAVED_MODEL/FROZEN_GRAPH/PMML）
     */
    public void setModelFormat(String ModelFormat) {
        this.ModelFormat = ModelFormat;
    }

    public CreateTrainingModelRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTrainingModelRequest(CreateTrainingModelRequest source) {
        if (source.ImportMethod != null) {
            this.ImportMethod = new String(source.ImportMethod);
        }
        if (source.TrainingModelCosPath != null) {
            this.TrainingModelCosPath = new CosPathInfo(source.TrainingModelCosPath);
        }
        if (source.ReasoningEnvironmentSource != null) {
            this.ReasoningEnvironmentSource = new String(source.ReasoningEnvironmentSource);
        }
        if (source.TrainingModelName != null) {
            this.TrainingModelName = new String(source.TrainingModelName);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.TrainingJobName != null) {
            this.TrainingJobName = new String(source.TrainingJobName);
        }
        if (source.AlgorithmFramework != null) {
            this.AlgorithmFramework = new String(source.AlgorithmFramework);
        }
        if (source.ReasoningEnvironment != null) {
            this.ReasoningEnvironment = new String(source.ReasoningEnvironment);
        }
        if (source.TrainingModelIndex != null) {
            this.TrainingModelIndex = new String(source.TrainingModelIndex);
        }
        if (source.TrainingModelVersion != null) {
            this.TrainingModelVersion = new String(source.TrainingModelVersion);
        }
        if (source.ReasoningImageInfo != null) {
            this.ReasoningImageInfo = new ImageInfo(source.ReasoningImageInfo);
        }
        if (source.ModelMoveMode != null) {
            this.ModelMoveMode = new String(source.ModelMoveMode);
        }
        if (source.TrainingJobId != null) {
            this.TrainingJobId = new String(source.TrainingJobId);
        }
        if (source.TrainingModelId != null) {
            this.TrainingModelId = new String(source.TrainingModelId);
        }
        if (source.ModelOutputPath != null) {
            this.ModelOutputPath = new CosPathInfo(source.ModelOutputPath);
        }
        if (source.TrainingModelSource != null) {
            this.TrainingModelSource = new String(source.TrainingModelSource);
        }
        if (source.TrainingPreference != null) {
            this.TrainingPreference = new String(source.TrainingPreference);
        }
        if (source.AutoMLTaskId != null) {
            this.AutoMLTaskId = new String(source.AutoMLTaskId);
        }
        if (source.TrainingJobVersion != null) {
            this.TrainingJobVersion = new String(source.TrainingJobVersion);
        }
        if (source.ModelVersionType != null) {
            this.ModelVersionType = new String(source.ModelVersionType);
        }
        if (source.ModelFormat != null) {
            this.ModelFormat = new String(source.ModelFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImportMethod", this.ImportMethod);
        this.setParamObj(map, prefix + "TrainingModelCosPath.", this.TrainingModelCosPath);
        this.setParamSimple(map, prefix + "ReasoningEnvironmentSource", this.ReasoningEnvironmentSource);
        this.setParamSimple(map, prefix + "TrainingModelName", this.TrainingModelName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "TrainingJobName", this.TrainingJobName);
        this.setParamSimple(map, prefix + "AlgorithmFramework", this.AlgorithmFramework);
        this.setParamSimple(map, prefix + "ReasoningEnvironment", this.ReasoningEnvironment);
        this.setParamSimple(map, prefix + "TrainingModelIndex", this.TrainingModelIndex);
        this.setParamSimple(map, prefix + "TrainingModelVersion", this.TrainingModelVersion);
        this.setParamObj(map, prefix + "ReasoningImageInfo.", this.ReasoningImageInfo);
        this.setParamSimple(map, prefix + "ModelMoveMode", this.ModelMoveMode);
        this.setParamSimple(map, prefix + "TrainingJobId", this.TrainingJobId);
        this.setParamSimple(map, prefix + "TrainingModelId", this.TrainingModelId);
        this.setParamObj(map, prefix + "ModelOutputPath.", this.ModelOutputPath);
        this.setParamSimple(map, prefix + "TrainingModelSource", this.TrainingModelSource);
        this.setParamSimple(map, prefix + "TrainingPreference", this.TrainingPreference);
        this.setParamSimple(map, prefix + "AutoMLTaskId", this.AutoMLTaskId);
        this.setParamSimple(map, prefix + "TrainingJobVersion", this.TrainingJobVersion);
        this.setParamSimple(map, prefix + "ModelVersionType", this.ModelVersionType);
        this.setParamSimple(map, prefix + "ModelFormat", this.ModelFormat);

    }
}

