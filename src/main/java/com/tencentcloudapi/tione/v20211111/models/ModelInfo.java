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

public class ModelInfo extends AbstractModel {

    /**
    * 模型版本id, DescribeTrainingModelVersion查询模型接口时的id
自动学习类型的模型填写自动学习的任务id
    */
    @SerializedName("ModelVersionId")
    @Expose
    private String ModelVersionId;

    /**
    * 模型id
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 模型名
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
    * 模型来源
    */
    @SerializedName("ModelSource")
    @Expose
    private String ModelSource;

    /**
    * cos路径信息
    */
    @SerializedName("CosPathInfo")
    @Expose
    private CosPathInfo CosPathInfo;

    /**
    * GooseFSx的配置，ModelSource为GooseFSx时有效
    */
    @SerializedName("GooseFSx")
    @Expose
    private GooseFSx GooseFSx;

    /**
    * 模型对应的算法框架，预留
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlgorithmFramework")
    @Expose
    private String AlgorithmFramework;

    /**
    * 默认为 NORMAL, 已加速模型: ACCELERATE, 自动学习模型 AUTO_ML
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelType")
    @Expose
    private String ModelType;

    /**
    * 模型格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelFormat")
    @Expose
    private String ModelFormat;

    /**
    * 是否为私有化大模型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsPrivateModel")
    @Expose
    private Boolean IsPrivateModel;

    /**
    * 模型的类别 多模态MultiModal, 文本大模型 LLM
    */
    @SerializedName("ModelCategory")
    @Expose
    private String ModelCategory;

    /**
    * 数据源的配置
    */
    @SerializedName("PublicDataSource")
    @Expose
    private PublicDataSourceFS PublicDataSource;

    /**
     * Get 模型版本id, DescribeTrainingModelVersion查询模型接口时的id
自动学习类型的模型填写自动学习的任务id 
     * @return ModelVersionId 模型版本id, DescribeTrainingModelVersion查询模型接口时的id
自动学习类型的模型填写自动学习的任务id
     */
    public String getModelVersionId() {
        return this.ModelVersionId;
    }

    /**
     * Set 模型版本id, DescribeTrainingModelVersion查询模型接口时的id
自动学习类型的模型填写自动学习的任务id
     * @param ModelVersionId 模型版本id, DescribeTrainingModelVersion查询模型接口时的id
自动学习类型的模型填写自动学习的任务id
     */
    public void setModelVersionId(String ModelVersionId) {
        this.ModelVersionId = ModelVersionId;
    }

    /**
     * Get 模型id 
     * @return ModelId 模型id
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 模型id
     * @param ModelId 模型id
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get 模型名 
     * @return ModelName 模型名
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set 模型名
     * @param ModelName 模型名
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
     * Get 模型来源 
     * @return ModelSource 模型来源
     */
    public String getModelSource() {
        return this.ModelSource;
    }

    /**
     * Set 模型来源
     * @param ModelSource 模型来源
     */
    public void setModelSource(String ModelSource) {
        this.ModelSource = ModelSource;
    }

    /**
     * Get cos路径信息 
     * @return CosPathInfo cos路径信息
     */
    public CosPathInfo getCosPathInfo() {
        return this.CosPathInfo;
    }

    /**
     * Set cos路径信息
     * @param CosPathInfo cos路径信息
     */
    public void setCosPathInfo(CosPathInfo CosPathInfo) {
        this.CosPathInfo = CosPathInfo;
    }

    /**
     * Get GooseFSx的配置，ModelSource为GooseFSx时有效 
     * @return GooseFSx GooseFSx的配置，ModelSource为GooseFSx时有效
     */
    public GooseFSx getGooseFSx() {
        return this.GooseFSx;
    }

    /**
     * Set GooseFSx的配置，ModelSource为GooseFSx时有效
     * @param GooseFSx GooseFSx的配置，ModelSource为GooseFSx时有效
     */
    public void setGooseFSx(GooseFSx GooseFSx) {
        this.GooseFSx = GooseFSx;
    }

    /**
     * Get 模型对应的算法框架，预留
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlgorithmFramework 模型对应的算法框架，预留
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlgorithmFramework() {
        return this.AlgorithmFramework;
    }

    /**
     * Set 模型对应的算法框架，预留
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlgorithmFramework 模型对应的算法框架，预留
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlgorithmFramework(String AlgorithmFramework) {
        this.AlgorithmFramework = AlgorithmFramework;
    }

    /**
     * Get 默认为 NORMAL, 已加速模型: ACCELERATE, 自动学习模型 AUTO_ML
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelType 默认为 NORMAL, 已加速模型: ACCELERATE, 自动学习模型 AUTO_ML
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelType() {
        return this.ModelType;
    }

    /**
     * Set 默认为 NORMAL, 已加速模型: ACCELERATE, 自动学习模型 AUTO_ML
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelType 默认为 NORMAL, 已加速模型: ACCELERATE, 自动学习模型 AUTO_ML
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelType(String ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * Get 模型格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelFormat 模型格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelFormat() {
        return this.ModelFormat;
    }

    /**
     * Set 模型格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelFormat 模型格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelFormat(String ModelFormat) {
        this.ModelFormat = ModelFormat;
    }

    /**
     * Get 是否为私有化大模型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsPrivateModel 是否为私有化大模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsPrivateModel() {
        return this.IsPrivateModel;
    }

    /**
     * Set 是否为私有化大模型
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsPrivateModel 是否为私有化大模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsPrivateModel(Boolean IsPrivateModel) {
        this.IsPrivateModel = IsPrivateModel;
    }

    /**
     * Get 模型的类别 多模态MultiModal, 文本大模型 LLM 
     * @return ModelCategory 模型的类别 多模态MultiModal, 文本大模型 LLM
     */
    public String getModelCategory() {
        return this.ModelCategory;
    }

    /**
     * Set 模型的类别 多模态MultiModal, 文本大模型 LLM
     * @param ModelCategory 模型的类别 多模态MultiModal, 文本大模型 LLM
     */
    public void setModelCategory(String ModelCategory) {
        this.ModelCategory = ModelCategory;
    }

    /**
     * Get 数据源的配置 
     * @return PublicDataSource 数据源的配置
     */
    public PublicDataSourceFS getPublicDataSource() {
        return this.PublicDataSource;
    }

    /**
     * Set 数据源的配置
     * @param PublicDataSource 数据源的配置
     */
    public void setPublicDataSource(PublicDataSourceFS PublicDataSource) {
        this.PublicDataSource = PublicDataSource;
    }

    public ModelInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelInfo(ModelInfo source) {
        if (source.ModelVersionId != null) {
            this.ModelVersionId = new String(source.ModelVersionId);
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
        if (source.ModelSource != null) {
            this.ModelSource = new String(source.ModelSource);
        }
        if (source.CosPathInfo != null) {
            this.CosPathInfo = new CosPathInfo(source.CosPathInfo);
        }
        if (source.GooseFSx != null) {
            this.GooseFSx = new GooseFSx(source.GooseFSx);
        }
        if (source.AlgorithmFramework != null) {
            this.AlgorithmFramework = new String(source.AlgorithmFramework);
        }
        if (source.ModelType != null) {
            this.ModelType = new String(source.ModelType);
        }
        if (source.ModelFormat != null) {
            this.ModelFormat = new String(source.ModelFormat);
        }
        if (source.IsPrivateModel != null) {
            this.IsPrivateModel = new Boolean(source.IsPrivateModel);
        }
        if (source.ModelCategory != null) {
            this.ModelCategory = new String(source.ModelCategory);
        }
        if (source.PublicDataSource != null) {
            this.PublicDataSource = new PublicDataSourceFS(source.PublicDataSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelVersionId", this.ModelVersionId);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "ModelSource", this.ModelSource);
        this.setParamObj(map, prefix + "CosPathInfo.", this.CosPathInfo);
        this.setParamObj(map, prefix + "GooseFSx.", this.GooseFSx);
        this.setParamSimple(map, prefix + "AlgorithmFramework", this.AlgorithmFramework);
        this.setParamSimple(map, prefix + "ModelType", this.ModelType);
        this.setParamSimple(map, prefix + "ModelFormat", this.ModelFormat);
        this.setParamSimple(map, prefix + "IsPrivateModel", this.IsPrivateModel);
        this.setParamSimple(map, prefix + "ModelCategory", this.ModelCategory);
        this.setParamObj(map, prefix + "PublicDataSource.", this.PublicDataSource);

    }
}

