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

public class TrainingModelVersionDTO extends AbstractModel{

    /**
    * 模型id
    */
    @SerializedName("TrainingModelId")
    @Expose
    private String TrainingModelId;

    /**
    * 模型版本id
    */
    @SerializedName("TrainingModelVersionId")
    @Expose
    private String TrainingModelVersionId;

    /**
    * 模型版本
    */
    @SerializedName("TrainingModelVersion")
    @Expose
    private String TrainingModelVersion;

    /**
    * 模型来源
    */
    @SerializedName("TrainingModelSource")
    @Expose
    private String TrainingModelSource;

    /**
    * 创建时间
    */
    @SerializedName("TrainingModelCreateTime")
    @Expose
    private String TrainingModelCreateTime;

    /**
    * 创建人uin
    */
    @SerializedName("TrainingModelCreator")
    @Expose
    private String TrainingModelCreator;

    /**
    * 算法框架
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
    * 推理环境来源
    */
    @SerializedName("ReasoningEnvironmentSource")
    @Expose
    private String ReasoningEnvironmentSource;

    /**
    * 模型指标
    */
    @SerializedName("TrainingModelIndex")
    @Expose
    private String TrainingModelIndex;

    /**
    * 训练任务名称
    */
    @SerializedName("TrainingJobName")
    @Expose
    private String TrainingJobName;

    /**
    * 模型cos路径
    */
    @SerializedName("TrainingModelCosPath")
    @Expose
    private CosPathInfo TrainingModelCosPath;

    /**
    * 模型名称
    */
    @SerializedName("TrainingModelName")
    @Expose
    private String TrainingModelName;

    /**
    * 训练任务id
    */
    @SerializedName("TrainingJobId")
    @Expose
    private String TrainingJobId;

    /**
    * 自定义推理环境
    */
    @SerializedName("ReasoningImageInfo")
    @Expose
    private ImageInfo ReasoningImageInfo;

    /**
    * 模型版本创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 模型处理状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrainingModelStatus")
    @Expose
    private String TrainingModelStatus;

    /**
    * 模型处理进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrainingModelProgress")
    @Expose
    private Long TrainingModelProgress;

    /**
    * 模型错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrainingModelErrorMsg")
    @Expose
    private String TrainingModelErrorMsg;

    /**
    * 模型格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrainingModelFormat")
    @Expose
    private String TrainingModelFormat;

    /**
     * Get 模型id 
     * @return TrainingModelId 模型id
     */
    public String getTrainingModelId() {
        return this.TrainingModelId;
    }

    /**
     * Set 模型id
     * @param TrainingModelId 模型id
     */
    public void setTrainingModelId(String TrainingModelId) {
        this.TrainingModelId = TrainingModelId;
    }

    /**
     * Get 模型版本id 
     * @return TrainingModelVersionId 模型版本id
     */
    public String getTrainingModelVersionId() {
        return this.TrainingModelVersionId;
    }

    /**
     * Set 模型版本id
     * @param TrainingModelVersionId 模型版本id
     */
    public void setTrainingModelVersionId(String TrainingModelVersionId) {
        this.TrainingModelVersionId = TrainingModelVersionId;
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
     * Get 模型来源 
     * @return TrainingModelSource 模型来源
     */
    public String getTrainingModelSource() {
        return this.TrainingModelSource;
    }

    /**
     * Set 模型来源
     * @param TrainingModelSource 模型来源
     */
    public void setTrainingModelSource(String TrainingModelSource) {
        this.TrainingModelSource = TrainingModelSource;
    }

    /**
     * Get 创建时间 
     * @return TrainingModelCreateTime 创建时间
     */
    public String getTrainingModelCreateTime() {
        return this.TrainingModelCreateTime;
    }

    /**
     * Set 创建时间
     * @param TrainingModelCreateTime 创建时间
     */
    public void setTrainingModelCreateTime(String TrainingModelCreateTime) {
        this.TrainingModelCreateTime = TrainingModelCreateTime;
    }

    /**
     * Get 创建人uin 
     * @return TrainingModelCreator 创建人uin
     */
    public String getTrainingModelCreator() {
        return this.TrainingModelCreator;
    }

    /**
     * Set 创建人uin
     * @param TrainingModelCreator 创建人uin
     */
    public void setTrainingModelCreator(String TrainingModelCreator) {
        this.TrainingModelCreator = TrainingModelCreator;
    }

    /**
     * Get 算法框架 
     * @return AlgorithmFramework 算法框架
     */
    public String getAlgorithmFramework() {
        return this.AlgorithmFramework;
    }

    /**
     * Set 算法框架
     * @param AlgorithmFramework 算法框架
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
     * Get 推理环境来源 
     * @return ReasoningEnvironmentSource 推理环境来源
     */
    public String getReasoningEnvironmentSource() {
        return this.ReasoningEnvironmentSource;
    }

    /**
     * Set 推理环境来源
     * @param ReasoningEnvironmentSource 推理环境来源
     */
    public void setReasoningEnvironmentSource(String ReasoningEnvironmentSource) {
        this.ReasoningEnvironmentSource = ReasoningEnvironmentSource;
    }

    /**
     * Get 模型指标 
     * @return TrainingModelIndex 模型指标
     */
    public String getTrainingModelIndex() {
        return this.TrainingModelIndex;
    }

    /**
     * Set 模型指标
     * @param TrainingModelIndex 模型指标
     */
    public void setTrainingModelIndex(String TrainingModelIndex) {
        this.TrainingModelIndex = TrainingModelIndex;
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
     * Get 模型cos路径 
     * @return TrainingModelCosPath 模型cos路径
     */
    public CosPathInfo getTrainingModelCosPath() {
        return this.TrainingModelCosPath;
    }

    /**
     * Set 模型cos路径
     * @param TrainingModelCosPath 模型cos路径
     */
    public void setTrainingModelCosPath(CosPathInfo TrainingModelCosPath) {
        this.TrainingModelCosPath = TrainingModelCosPath;
    }

    /**
     * Get 模型名称 
     * @return TrainingModelName 模型名称
     */
    public String getTrainingModelName() {
        return this.TrainingModelName;
    }

    /**
     * Set 模型名称
     * @param TrainingModelName 模型名称
     */
    public void setTrainingModelName(String TrainingModelName) {
        this.TrainingModelName = TrainingModelName;
    }

    /**
     * Get 训练任务id 
     * @return TrainingJobId 训练任务id
     */
    public String getTrainingJobId() {
        return this.TrainingJobId;
    }

    /**
     * Set 训练任务id
     * @param TrainingJobId 训练任务id
     */
    public void setTrainingJobId(String TrainingJobId) {
        this.TrainingJobId = TrainingJobId;
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
     * Get 模型版本创建时间 
     * @return CreateTime 模型版本创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 模型版本创建时间
     * @param CreateTime 模型版本创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 模型处理状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrainingModelStatus 模型处理状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrainingModelStatus() {
        return this.TrainingModelStatus;
    }

    /**
     * Set 模型处理状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrainingModelStatus 模型处理状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrainingModelStatus(String TrainingModelStatus) {
        this.TrainingModelStatus = TrainingModelStatus;
    }

    /**
     * Get 模型处理进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrainingModelProgress 模型处理进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTrainingModelProgress() {
        return this.TrainingModelProgress;
    }

    /**
     * Set 模型处理进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrainingModelProgress 模型处理进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrainingModelProgress(Long TrainingModelProgress) {
        this.TrainingModelProgress = TrainingModelProgress;
    }

    /**
     * Get 模型错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrainingModelErrorMsg 模型错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrainingModelErrorMsg() {
        return this.TrainingModelErrorMsg;
    }

    /**
     * Set 模型错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrainingModelErrorMsg 模型错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrainingModelErrorMsg(String TrainingModelErrorMsg) {
        this.TrainingModelErrorMsg = TrainingModelErrorMsg;
    }

    /**
     * Get 模型格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrainingModelFormat 模型格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrainingModelFormat() {
        return this.TrainingModelFormat;
    }

    /**
     * Set 模型格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrainingModelFormat 模型格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrainingModelFormat(String TrainingModelFormat) {
        this.TrainingModelFormat = TrainingModelFormat;
    }

    public TrainingModelVersionDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrainingModelVersionDTO(TrainingModelVersionDTO source) {
        if (source.TrainingModelId != null) {
            this.TrainingModelId = new String(source.TrainingModelId);
        }
        if (source.TrainingModelVersionId != null) {
            this.TrainingModelVersionId = new String(source.TrainingModelVersionId);
        }
        if (source.TrainingModelVersion != null) {
            this.TrainingModelVersion = new String(source.TrainingModelVersion);
        }
        if (source.TrainingModelSource != null) {
            this.TrainingModelSource = new String(source.TrainingModelSource);
        }
        if (source.TrainingModelCreateTime != null) {
            this.TrainingModelCreateTime = new String(source.TrainingModelCreateTime);
        }
        if (source.TrainingModelCreator != null) {
            this.TrainingModelCreator = new String(source.TrainingModelCreator);
        }
        if (source.AlgorithmFramework != null) {
            this.AlgorithmFramework = new String(source.AlgorithmFramework);
        }
        if (source.ReasoningEnvironment != null) {
            this.ReasoningEnvironment = new String(source.ReasoningEnvironment);
        }
        if (source.ReasoningEnvironmentSource != null) {
            this.ReasoningEnvironmentSource = new String(source.ReasoningEnvironmentSource);
        }
        if (source.TrainingModelIndex != null) {
            this.TrainingModelIndex = new String(source.TrainingModelIndex);
        }
        if (source.TrainingJobName != null) {
            this.TrainingJobName = new String(source.TrainingJobName);
        }
        if (source.TrainingModelCosPath != null) {
            this.TrainingModelCosPath = new CosPathInfo(source.TrainingModelCosPath);
        }
        if (source.TrainingModelName != null) {
            this.TrainingModelName = new String(source.TrainingModelName);
        }
        if (source.TrainingJobId != null) {
            this.TrainingJobId = new String(source.TrainingJobId);
        }
        if (source.ReasoningImageInfo != null) {
            this.ReasoningImageInfo = new ImageInfo(source.ReasoningImageInfo);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.TrainingModelStatus != null) {
            this.TrainingModelStatus = new String(source.TrainingModelStatus);
        }
        if (source.TrainingModelProgress != null) {
            this.TrainingModelProgress = new Long(source.TrainingModelProgress);
        }
        if (source.TrainingModelErrorMsg != null) {
            this.TrainingModelErrorMsg = new String(source.TrainingModelErrorMsg);
        }
        if (source.TrainingModelFormat != null) {
            this.TrainingModelFormat = new String(source.TrainingModelFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrainingModelId", this.TrainingModelId);
        this.setParamSimple(map, prefix + "TrainingModelVersionId", this.TrainingModelVersionId);
        this.setParamSimple(map, prefix + "TrainingModelVersion", this.TrainingModelVersion);
        this.setParamSimple(map, prefix + "TrainingModelSource", this.TrainingModelSource);
        this.setParamSimple(map, prefix + "TrainingModelCreateTime", this.TrainingModelCreateTime);
        this.setParamSimple(map, prefix + "TrainingModelCreator", this.TrainingModelCreator);
        this.setParamSimple(map, prefix + "AlgorithmFramework", this.AlgorithmFramework);
        this.setParamSimple(map, prefix + "ReasoningEnvironment", this.ReasoningEnvironment);
        this.setParamSimple(map, prefix + "ReasoningEnvironmentSource", this.ReasoningEnvironmentSource);
        this.setParamSimple(map, prefix + "TrainingModelIndex", this.TrainingModelIndex);
        this.setParamSimple(map, prefix + "TrainingJobName", this.TrainingJobName);
        this.setParamObj(map, prefix + "TrainingModelCosPath.", this.TrainingModelCosPath);
        this.setParamSimple(map, prefix + "TrainingModelName", this.TrainingModelName);
        this.setParamSimple(map, prefix + "TrainingJobId", this.TrainingJobId);
        this.setParamObj(map, prefix + "ReasoningImageInfo.", this.ReasoningImageInfo);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "TrainingModelStatus", this.TrainingModelStatus);
        this.setParamSimple(map, prefix + "TrainingModelProgress", this.TrainingModelProgress);
        this.setParamSimple(map, prefix + "TrainingModelErrorMsg", this.TrainingModelErrorMsg);
        this.setParamSimple(map, prefix + "TrainingModelFormat", this.TrainingModelFormat);

    }
}

