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

public class ModelAccelerateVersion extends AbstractModel {

    /**
    * 模型id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 优化模型版本id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelVersionId")
    @Expose
    private String ModelVersionId;

    /**
    * 优化任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelJobId")
    @Expose
    private String ModelJobId;

    /**
    * 优化任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelJobName")
    @Expose
    private String ModelJobName;

    /**
    * 优化后模型版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * 加速比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpeedUp")
    @Expose
    private String SpeedUp;

    /**
    * 模型来源/任务名称/任务版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelSource")
    @Expose
    private ModelSource ModelSource;

    /**
    * 模型cos路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosPathInfo")
    @Expose
    private CosPathInfo CosPathInfo;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 模型规范
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelFormat")
    @Expose
    private String ModelFormat;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Progress")
    @Expose
    private Long Progress;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * GPU类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GPUType")
    @Expose
    private String GPUType;

    /**
    * 模型cos路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelCosPath")
    @Expose
    private CosPathInfo ModelCosPath;

    /**
     * Get 模型id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelId 模型id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 模型id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelId 模型id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 优化模型版本id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelVersionId 优化模型版本id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelVersionId() {
        return this.ModelVersionId;
    }

    /**
     * Set 优化模型版本id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelVersionId 优化模型版本id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelVersionId(String ModelVersionId) {
        this.ModelVersionId = ModelVersionId;
    }

    /**
     * Get 优化任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelJobId 优化任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelJobId() {
        return this.ModelJobId;
    }

    /**
     * Set 优化任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelJobId 优化任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelJobId(String ModelJobId) {
        this.ModelJobId = ModelJobId;
    }

    /**
     * Get 优化任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelJobName 优化任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelJobName() {
        return this.ModelJobName;
    }

    /**
     * Set 优化任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelJobName 优化任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelJobName(String ModelJobName) {
        this.ModelJobName = ModelJobName;
    }

    /**
     * Get 优化后模型版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelVersion 优化后模型版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set 优化后模型版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelVersion 优化后模型版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get 加速比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpeedUp 加速比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpeedUp() {
        return this.SpeedUp;
    }

    /**
     * Set 加速比
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpeedUp 加速比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpeedUp(String SpeedUp) {
        this.SpeedUp = SpeedUp;
    }

    /**
     * Get 模型来源/任务名称/任务版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelSource 模型来源/任务名称/任务版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModelSource getModelSource() {
        return this.ModelSource;
    }

    /**
     * Set 模型来源/任务名称/任务版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelSource 模型来源/任务名称/任务版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelSource(ModelSource ModelSource) {
        this.ModelSource = ModelSource;
    }

    /**
     * Get 模型cos路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosPathInfo 模型cos路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CosPathInfo getCosPathInfo() {
        return this.CosPathInfo;
    }

    /**
     * Set 模型cos路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosPathInfo 模型cos路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosPathInfo(CosPathInfo CosPathInfo) {
        this.CosPathInfo = CosPathInfo;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 模型规范
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelFormat 模型规范
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelFormat() {
        return this.ModelFormat;
    }

    /**
     * Set 模型规范
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelFormat 模型规范
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelFormat(String ModelFormat) {
        this.ModelFormat = ModelFormat;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Progress 进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProgress() {
        return this.Progress;
    }

    /**
     * Set 进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param Progress 进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProgress(Long Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMsg 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMsg() {
        return this.ErrorMsg;
    }

    /**
     * Set 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMsg 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMsg(String ErrorMsg) {
        this.ErrorMsg = ErrorMsg;
    }

    /**
     * Get GPU类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GPUType GPU类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGPUType() {
        return this.GPUType;
    }

    /**
     * Set GPU类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param GPUType GPU类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGPUType(String GPUType) {
        this.GPUType = GPUType;
    }

    /**
     * Get 模型cos路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelCosPath 模型cos路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CosPathInfo getModelCosPath() {
        return this.ModelCosPath;
    }

    /**
     * Set 模型cos路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelCosPath 模型cos路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelCosPath(CosPathInfo ModelCosPath) {
        this.ModelCosPath = ModelCosPath;
    }

    public ModelAccelerateVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelAccelerateVersion(ModelAccelerateVersion source) {
        if (source.ModelId != null) {
            this.ModelId = new String(source.ModelId);
        }
        if (source.ModelVersionId != null) {
            this.ModelVersionId = new String(source.ModelVersionId);
        }
        if (source.ModelJobId != null) {
            this.ModelJobId = new String(source.ModelJobId);
        }
        if (source.ModelJobName != null) {
            this.ModelJobName = new String(source.ModelJobName);
        }
        if (source.ModelVersion != null) {
            this.ModelVersion = new String(source.ModelVersion);
        }
        if (source.SpeedUp != null) {
            this.SpeedUp = new String(source.SpeedUp);
        }
        if (source.ModelSource != null) {
            this.ModelSource = new ModelSource(source.ModelSource);
        }
        if (source.CosPathInfo != null) {
            this.CosPathInfo = new CosPathInfo(source.CosPathInfo);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModelFormat != null) {
            this.ModelFormat = new String(source.ModelFormat);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Progress != null) {
            this.Progress = new Long(source.Progress);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.GPUType != null) {
            this.GPUType = new String(source.GPUType);
        }
        if (source.ModelCosPath != null) {
            this.ModelCosPath = new CosPathInfo(source.ModelCosPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ModelVersionId", this.ModelVersionId);
        this.setParamSimple(map, prefix + "ModelJobId", this.ModelJobId);
        this.setParamSimple(map, prefix + "ModelJobName", this.ModelJobName);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "SpeedUp", this.SpeedUp);
        this.setParamObj(map, prefix + "ModelSource.", this.ModelSource);
        this.setParamObj(map, prefix + "CosPathInfo.", this.CosPathInfo);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModelFormat", this.ModelFormat);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Progress", this.Progress);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "GPUType", this.GPUType);
        this.setParamObj(map, prefix + "ModelCosPath.", this.ModelCosPath);

    }
}

