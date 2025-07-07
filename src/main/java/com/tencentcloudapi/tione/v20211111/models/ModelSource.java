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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModelSource extends AbstractModel {

    /**
    * 来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 来源任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 来源任务版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobVersion")
    @Expose
    private String JobVersion;

    /**
    * 来源任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 模型名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 算法框架
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlgorithmFramework")
    @Expose
    private String AlgorithmFramework;

    /**
    * 训练偏好
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrainingPreference")
    @Expose
    private String TrainingPreference;

    /**
    * 推理环境来源，SYSTEM/CUSTOM
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReasoningEnvironmentSource")
    @Expose
    private String ReasoningEnvironmentSource;

    /**
    * 推理环境
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReasoningEnvironment")
    @Expose
    private String ReasoningEnvironment;

    /**
    * 推理环境id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReasoningEnvironmentId")
    @Expose
    private String ReasoningEnvironmentId;

    /**
    * 自定义推理环境
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReasoningImageInfo")
    @Expose
    private ImageInfo ReasoningImageInfo;

    /**
     * Get 来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Source 来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param Source 来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 来源任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobName 来源任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set 来源任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobName 来源任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get 来源任务版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobVersion 来源任务版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobVersion() {
        return this.JobVersion;
    }

    /**
     * Set 来源任务版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobVersion 来源任务版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobVersion(String JobVersion) {
        this.JobVersion = JobVersion;
    }

    /**
     * Get 来源任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobId 来源任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 来源任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId 来源任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 模型名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelName 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelName 模型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get 算法框架
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlgorithmFramework 算法框架
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlgorithmFramework() {
        return this.AlgorithmFramework;
    }

    /**
     * Set 算法框架
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlgorithmFramework 算法框架
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlgorithmFramework(String AlgorithmFramework) {
        this.AlgorithmFramework = AlgorithmFramework;
    }

    /**
     * Get 训练偏好
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrainingPreference 训练偏好
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrainingPreference() {
        return this.TrainingPreference;
    }

    /**
     * Set 训练偏好
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrainingPreference 训练偏好
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrainingPreference(String TrainingPreference) {
        this.TrainingPreference = TrainingPreference;
    }

    /**
     * Get 推理环境来源，SYSTEM/CUSTOM
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReasoningEnvironmentSource 推理环境来源，SYSTEM/CUSTOM
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReasoningEnvironmentSource() {
        return this.ReasoningEnvironmentSource;
    }

    /**
     * Set 推理环境来源，SYSTEM/CUSTOM
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReasoningEnvironmentSource 推理环境来源，SYSTEM/CUSTOM
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReasoningEnvironmentSource(String ReasoningEnvironmentSource) {
        this.ReasoningEnvironmentSource = ReasoningEnvironmentSource;
    }

    /**
     * Get 推理环境
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReasoningEnvironment 推理环境
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReasoningEnvironment() {
        return this.ReasoningEnvironment;
    }

    /**
     * Set 推理环境
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReasoningEnvironment 推理环境
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReasoningEnvironment(String ReasoningEnvironment) {
        this.ReasoningEnvironment = ReasoningEnvironment;
    }

    /**
     * Get 推理环境id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReasoningEnvironmentId 推理环境id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReasoningEnvironmentId() {
        return this.ReasoningEnvironmentId;
    }

    /**
     * Set 推理环境id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReasoningEnvironmentId 推理环境id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReasoningEnvironmentId(String ReasoningEnvironmentId) {
        this.ReasoningEnvironmentId = ReasoningEnvironmentId;
    }

    /**
     * Get 自定义推理环境
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReasoningImageInfo 自定义推理环境
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageInfo getReasoningImageInfo() {
        return this.ReasoningImageInfo;
    }

    /**
     * Set 自定义推理环境
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReasoningImageInfo 自定义推理环境
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReasoningImageInfo(ImageInfo ReasoningImageInfo) {
        this.ReasoningImageInfo = ReasoningImageInfo;
    }

    public ModelSource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelSource(ModelSource source) {
        if (source.Source != null) {
            this.Source = new String(source.Source);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.JobVersion != null) {
            this.JobVersion = new String(source.JobVersion);
        }
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.AlgorithmFramework != null) {
            this.AlgorithmFramework = new String(source.AlgorithmFramework);
        }
        if (source.TrainingPreference != null) {
            this.TrainingPreference = new String(source.TrainingPreference);
        }
        if (source.ReasoningEnvironmentSource != null) {
            this.ReasoningEnvironmentSource = new String(source.ReasoningEnvironmentSource);
        }
        if (source.ReasoningEnvironment != null) {
            this.ReasoningEnvironment = new String(source.ReasoningEnvironment);
        }
        if (source.ReasoningEnvironmentId != null) {
            this.ReasoningEnvironmentId = new String(source.ReasoningEnvironmentId);
        }
        if (source.ReasoningImageInfo != null) {
            this.ReasoningImageInfo = new ImageInfo(source.ReasoningImageInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "JobVersion", this.JobVersion);
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "AlgorithmFramework", this.AlgorithmFramework);
        this.setParamSimple(map, prefix + "TrainingPreference", this.TrainingPreference);
        this.setParamSimple(map, prefix + "ReasoningEnvironmentSource", this.ReasoningEnvironmentSource);
        this.setParamSimple(map, prefix + "ReasoningEnvironment", this.ReasoningEnvironment);
        this.setParamSimple(map, prefix + "ReasoningEnvironmentId", this.ReasoningEnvironmentId);
        this.setParamObj(map, prefix + "ReasoningImageInfo.", this.ReasoningImageInfo);

    }
}

