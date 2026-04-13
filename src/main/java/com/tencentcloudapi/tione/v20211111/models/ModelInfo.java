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
    * <p>模型版本id, DescribeTrainingModelVersion查询模型接口时的id<br>自动学习类型的模型填写自动学习的任务id</p>
    */
    @SerializedName("ModelVersionId")
    @Expose
    private String ModelVersionId;

    /**
    * <p>模型id</p>
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * <p>模型名</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>模型版本</p>
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * <p>模型来源</p>
    */
    @SerializedName("ModelSource")
    @Expose
    private String ModelSource;

    /**
    * <p>cos路径信息</p>
    */
    @SerializedName("CosPathInfo")
    @Expose
    private CosPathInfo CosPathInfo;

    /**
    * <p>GooseFSx的配置，ModelSource为GooseFSx时有效</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GooseFSx")
    @Expose
    private GooseFSx GooseFSx;

    /**
    * <p>模型对应的算法框架，预留</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlgorithmFramework")
    @Expose
    private String AlgorithmFramework;

    /**
    * <p>默认为 NORMAL, 已加速模型: ACCELERATE, 自动学习模型 AUTO_ML</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelType")
    @Expose
    private String ModelType;

    /**
    * <p>模型格式</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelFormat")
    @Expose
    private String ModelFormat;

    /**
    * <p>是否为私有化大模型</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsPrivateModel")
    @Expose
    private Boolean IsPrivateModel;

    /**
    * <p>模型的类别 多模态MultiModal, 文本大模型 LLM</p>
    */
    @SerializedName("ModelCategory")
    @Expose
    private String ModelCategory;

    /**
    * <p>数据源的配置</p>
    */
    @SerializedName("PublicDataSource")
    @Expose
    private PublicDataSourceFS PublicDataSource;

    /**
     * Get <p>模型版本id, DescribeTrainingModelVersion查询模型接口时的id<br>自动学习类型的模型填写自动学习的任务id</p> 
     * @return ModelVersionId <p>模型版本id, DescribeTrainingModelVersion查询模型接口时的id<br>自动学习类型的模型填写自动学习的任务id</p>
     */
    public String getModelVersionId() {
        return this.ModelVersionId;
    }

    /**
     * Set <p>模型版本id, DescribeTrainingModelVersion查询模型接口时的id<br>自动学习类型的模型填写自动学习的任务id</p>
     * @param ModelVersionId <p>模型版本id, DescribeTrainingModelVersion查询模型接口时的id<br>自动学习类型的模型填写自动学习的任务id</p>
     */
    public void setModelVersionId(String ModelVersionId) {
        this.ModelVersionId = ModelVersionId;
    }

    /**
     * Get <p>模型id</p> 
     * @return ModelId <p>模型id</p>
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set <p>模型id</p>
     * @param ModelId <p>模型id</p>
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
    }

    /**
     * Get <p>模型名</p> 
     * @return ModelName <p>模型名</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>模型名</p>
     * @param ModelName <p>模型名</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>模型版本</p> 
     * @return ModelVersion <p>模型版本</p>
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set <p>模型版本</p>
     * @param ModelVersion <p>模型版本</p>
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get <p>模型来源</p> 
     * @return ModelSource <p>模型来源</p>
     */
    public String getModelSource() {
        return this.ModelSource;
    }

    /**
     * Set <p>模型来源</p>
     * @param ModelSource <p>模型来源</p>
     */
    public void setModelSource(String ModelSource) {
        this.ModelSource = ModelSource;
    }

    /**
     * Get <p>cos路径信息</p> 
     * @return CosPathInfo <p>cos路径信息</p>
     */
    public CosPathInfo getCosPathInfo() {
        return this.CosPathInfo;
    }

    /**
     * Set <p>cos路径信息</p>
     * @param CosPathInfo <p>cos路径信息</p>
     */
    public void setCosPathInfo(CosPathInfo CosPathInfo) {
        this.CosPathInfo = CosPathInfo;
    }

    /**
     * Get <p>GooseFSx的配置，ModelSource为GooseFSx时有效</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GooseFSx <p>GooseFSx的配置，ModelSource为GooseFSx时有效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GooseFSx getGooseFSx() {
        return this.GooseFSx;
    }

    /**
     * Set <p>GooseFSx的配置，ModelSource为GooseFSx时有效</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param GooseFSx <p>GooseFSx的配置，ModelSource为GooseFSx时有效</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGooseFSx(GooseFSx GooseFSx) {
        this.GooseFSx = GooseFSx;
    }

    /**
     * Get <p>模型对应的算法框架，预留</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlgorithmFramework <p>模型对应的算法框架，预留</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlgorithmFramework() {
        return this.AlgorithmFramework;
    }

    /**
     * Set <p>模型对应的算法框架，预留</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlgorithmFramework <p>模型对应的算法框架，预留</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlgorithmFramework(String AlgorithmFramework) {
        this.AlgorithmFramework = AlgorithmFramework;
    }

    /**
     * Get <p>默认为 NORMAL, 已加速模型: ACCELERATE, 自动学习模型 AUTO_ML</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelType <p>默认为 NORMAL, 已加速模型: ACCELERATE, 自动学习模型 AUTO_ML</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelType() {
        return this.ModelType;
    }

    /**
     * Set <p>默认为 NORMAL, 已加速模型: ACCELERATE, 自动学习模型 AUTO_ML</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelType <p>默认为 NORMAL, 已加速模型: ACCELERATE, 自动学习模型 AUTO_ML</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelType(String ModelType) {
        this.ModelType = ModelType;
    }

    /**
     * Get <p>模型格式</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelFormat <p>模型格式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelFormat() {
        return this.ModelFormat;
    }

    /**
     * Set <p>模型格式</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelFormat <p>模型格式</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelFormat(String ModelFormat) {
        this.ModelFormat = ModelFormat;
    }

    /**
     * Get <p>是否为私有化大模型</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsPrivateModel <p>是否为私有化大模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsPrivateModel() {
        return this.IsPrivateModel;
    }

    /**
     * Set <p>是否为私有化大模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsPrivateModel <p>是否为私有化大模型</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsPrivateModel(Boolean IsPrivateModel) {
        this.IsPrivateModel = IsPrivateModel;
    }

    /**
     * Get <p>模型的类别 多模态MultiModal, 文本大模型 LLM</p> 
     * @return ModelCategory <p>模型的类别 多模态MultiModal, 文本大模型 LLM</p>
     */
    public String getModelCategory() {
        return this.ModelCategory;
    }

    /**
     * Set <p>模型的类别 多模态MultiModal, 文本大模型 LLM</p>
     * @param ModelCategory <p>模型的类别 多模态MultiModal, 文本大模型 LLM</p>
     */
    public void setModelCategory(String ModelCategory) {
        this.ModelCategory = ModelCategory;
    }

    /**
     * Get <p>数据源的配置</p> 
     * @return PublicDataSource <p>数据源的配置</p>
     */
    public PublicDataSourceFS getPublicDataSource() {
        return this.PublicDataSource;
    }

    /**
     * Set <p>数据源的配置</p>
     * @param PublicDataSource <p>数据源的配置</p>
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

