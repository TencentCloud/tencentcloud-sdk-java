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

public class PublicAlgoVersion extends AbstractModel {

    /**
    * 公共算法版本Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicAlgoVersionId")
    @Expose
    private String PublicAlgoVersionId;

    /**
    * 对应的公共算法组Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicAlgoGroupId")
    @Expose
    private String PublicAlgoGroupId;

    /**
    * 版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 模型简介
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Introduction")
    @Expose
    private String Introduction;

    /**
    * 预览信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PreviewInfo")
    @Expose
    private String PreviewInfo;

    /**
    * 预置训练镜像信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PresetTrainImageInfo")
    @Expose
    private ImageInfo PresetTrainImageInfo;

    /**
    * 预置训练代码信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PresetTrainCodeInfo")
    @Expose
    private MaterialInfo PresetTrainCodeInfo;

    /**
    * 预置模型信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PresetModelInfo")
    @Expose
    private MaterialInfo PresetModelInfo;

    /**
    * 是否已经被导入到我的算法
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsImported")
    @Expose
    private Boolean IsImported;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 默认训练资源规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultResourceSpec")
    @Expose
    private ResourceSpec DefaultResourceSpec;

    /**
    * 默认推理资源规格
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultInferenceResourceSpec")
    @Expose
    private ResourceSpec DefaultInferenceResourceSpec;

    /**
    * 是否支持直接部署推理服务
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SupportDeploy")
    @Expose
    private Boolean SupportDeploy;

    /**
    * 内置训练数据集
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PresetTrainDataset")
    @Expose
    private MaterialInfo PresetTrainDataset;

    /**
    * 训练代码包下载路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrainCodeDownloadUrl")
    @Expose
    private String TrainCodeDownloadUrl;

    /**
    * 内置数据下载路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrainDataDownloadUrl")
    @Expose
    private String TrainDataDownloadUrl;

    /**
    * 训练参数列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrainParams")
    @Expose
    private TrainParam [] TrainParams;

    /**
    * 训练启动命令
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PresetTrainCodeStartCmd")
    @Expose
    private String PresetTrainCodeStartCmd;

    /**
    * 是否非公开模型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsPrivateModel")
    @Expose
    private Boolean IsPrivateModel;

    /**
    * 各种设备下的训练镜像
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PresetTrainImageInfoList")
    @Expose
    private DeviceImageInfo [] PresetTrainImageInfoList;

    /**
    * 各种设备下的推理镜像
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PresetInferenceImageInfoList")
    @Expose
    private DeviceImageInfo [] PresetInferenceImageInfoList;

    /**
    * 各种设备下的训练代码信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PresetTrainCodeInfoList")
    @Expose
    private DeviceMaterialInfo [] PresetTrainCodeInfoList;

    /**
    * 各种设备下的内置模型信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PresetModelInfoList")
    @Expose
    private DeviceMaterialInfo [] PresetModelInfoList;

    /**
    * 模型类别，比如LLM/MultiModal
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelCategory")
    @Expose
    private String ModelCategory;

    /**
    * 公共算法Id
    */
    @SerializedName("PublicAlgoSeriesId")
    @Expose
    private String PublicAlgoSeriesId;

    /**
     * Get 公共算法版本Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicAlgoVersionId 公共算法版本Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicAlgoVersionId() {
        return this.PublicAlgoVersionId;
    }

    /**
     * Set 公共算法版本Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicAlgoVersionId 公共算法版本Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicAlgoVersionId(String PublicAlgoVersionId) {
        this.PublicAlgoVersionId = PublicAlgoVersionId;
    }

    /**
     * Get 对应的公共算法组Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicAlgoGroupId 对应的公共算法组Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicAlgoGroupId() {
        return this.PublicAlgoGroupId;
    }

    /**
     * Set 对应的公共算法组Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicAlgoGroupId 对应的公共算法组Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicAlgoGroupId(String PublicAlgoGroupId) {
        this.PublicAlgoGroupId = PublicAlgoGroupId;
    }

    /**
     * Get 版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version 版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version 版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get 模型简介
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Introduction 模型简介
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIntroduction() {
        return this.Introduction;
    }

    /**
     * Set 模型简介
注意：此字段可能返回 null，表示取不到有效值。
     * @param Introduction 模型简介
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntroduction(String Introduction) {
        this.Introduction = Introduction;
    }

    /**
     * Get 预览信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PreviewInfo 预览信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPreviewInfo() {
        return this.PreviewInfo;
    }

    /**
     * Set 预览信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PreviewInfo 预览信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPreviewInfo(String PreviewInfo) {
        this.PreviewInfo = PreviewInfo;
    }

    /**
     * Get 预置训练镜像信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PresetTrainImageInfo 预置训练镜像信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageInfo getPresetTrainImageInfo() {
        return this.PresetTrainImageInfo;
    }

    /**
     * Set 预置训练镜像信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PresetTrainImageInfo 预置训练镜像信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPresetTrainImageInfo(ImageInfo PresetTrainImageInfo) {
        this.PresetTrainImageInfo = PresetTrainImageInfo;
    }

    /**
     * Get 预置训练代码信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PresetTrainCodeInfo 预置训练代码信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MaterialInfo getPresetTrainCodeInfo() {
        return this.PresetTrainCodeInfo;
    }

    /**
     * Set 预置训练代码信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PresetTrainCodeInfo 预置训练代码信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPresetTrainCodeInfo(MaterialInfo PresetTrainCodeInfo) {
        this.PresetTrainCodeInfo = PresetTrainCodeInfo;
    }

    /**
     * Get 预置模型信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PresetModelInfo 预置模型信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MaterialInfo getPresetModelInfo() {
        return this.PresetModelInfo;
    }

    /**
     * Set 预置模型信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PresetModelInfo 预置模型信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPresetModelInfo(MaterialInfo PresetModelInfo) {
        this.PresetModelInfo = PresetModelInfo;
    }

    /**
     * Get 是否已经被导入到我的算法
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsImported 是否已经被导入到我的算法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsImported() {
        return this.IsImported;
    }

    /**
     * Set 是否已经被导入到我的算法
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsImported 是否已经被导入到我的算法
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsImported(Boolean IsImported) {
        this.IsImported = IsImported;
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
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 默认训练资源规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultResourceSpec 默认训练资源规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceSpec getDefaultResourceSpec() {
        return this.DefaultResourceSpec;
    }

    /**
     * Set 默认训练资源规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultResourceSpec 默认训练资源规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultResourceSpec(ResourceSpec DefaultResourceSpec) {
        this.DefaultResourceSpec = DefaultResourceSpec;
    }

    /**
     * Get 默认推理资源规格
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultInferenceResourceSpec 默认推理资源规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceSpec getDefaultInferenceResourceSpec() {
        return this.DefaultInferenceResourceSpec;
    }

    /**
     * Set 默认推理资源规格
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultInferenceResourceSpec 默认推理资源规格
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultInferenceResourceSpec(ResourceSpec DefaultInferenceResourceSpec) {
        this.DefaultInferenceResourceSpec = DefaultInferenceResourceSpec;
    }

    /**
     * Get 是否支持直接部署推理服务
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SupportDeploy 是否支持直接部署推理服务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getSupportDeploy() {
        return this.SupportDeploy;
    }

    /**
     * Set 是否支持直接部署推理服务
注意：此字段可能返回 null，表示取不到有效值。
     * @param SupportDeploy 是否支持直接部署推理服务
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSupportDeploy(Boolean SupportDeploy) {
        this.SupportDeploy = SupportDeploy;
    }

    /**
     * Get 内置训练数据集
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PresetTrainDataset 内置训练数据集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MaterialInfo getPresetTrainDataset() {
        return this.PresetTrainDataset;
    }

    /**
     * Set 内置训练数据集
注意：此字段可能返回 null，表示取不到有效值。
     * @param PresetTrainDataset 内置训练数据集
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPresetTrainDataset(MaterialInfo PresetTrainDataset) {
        this.PresetTrainDataset = PresetTrainDataset;
    }

    /**
     * Get 训练代码包下载路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrainCodeDownloadUrl 训练代码包下载路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrainCodeDownloadUrl() {
        return this.TrainCodeDownloadUrl;
    }

    /**
     * Set 训练代码包下载路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrainCodeDownloadUrl 训练代码包下载路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrainCodeDownloadUrl(String TrainCodeDownloadUrl) {
        this.TrainCodeDownloadUrl = TrainCodeDownloadUrl;
    }

    /**
     * Get 内置数据下载路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrainDataDownloadUrl 内置数据下载路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrainDataDownloadUrl() {
        return this.TrainDataDownloadUrl;
    }

    /**
     * Set 内置数据下载路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrainDataDownloadUrl 内置数据下载路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrainDataDownloadUrl(String TrainDataDownloadUrl) {
        this.TrainDataDownloadUrl = TrainDataDownloadUrl;
    }

    /**
     * Get 训练参数列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrainParams 训练参数列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TrainParam [] getTrainParams() {
        return this.TrainParams;
    }

    /**
     * Set 训练参数列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrainParams 训练参数列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrainParams(TrainParam [] TrainParams) {
        this.TrainParams = TrainParams;
    }

    /**
     * Get 训练启动命令
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PresetTrainCodeStartCmd 训练启动命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPresetTrainCodeStartCmd() {
        return this.PresetTrainCodeStartCmd;
    }

    /**
     * Set 训练启动命令
注意：此字段可能返回 null，表示取不到有效值。
     * @param PresetTrainCodeStartCmd 训练启动命令
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPresetTrainCodeStartCmd(String PresetTrainCodeStartCmd) {
        this.PresetTrainCodeStartCmd = PresetTrainCodeStartCmd;
    }

    /**
     * Get 是否非公开模型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsPrivateModel 是否非公开模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsPrivateModel() {
        return this.IsPrivateModel;
    }

    /**
     * Set 是否非公开模型
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsPrivateModel 是否非公开模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsPrivateModel(Boolean IsPrivateModel) {
        this.IsPrivateModel = IsPrivateModel;
    }

    /**
     * Get 各种设备下的训练镜像
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PresetTrainImageInfoList 各种设备下的训练镜像
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeviceImageInfo [] getPresetTrainImageInfoList() {
        return this.PresetTrainImageInfoList;
    }

    /**
     * Set 各种设备下的训练镜像
注意：此字段可能返回 null，表示取不到有效值。
     * @param PresetTrainImageInfoList 各种设备下的训练镜像
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPresetTrainImageInfoList(DeviceImageInfo [] PresetTrainImageInfoList) {
        this.PresetTrainImageInfoList = PresetTrainImageInfoList;
    }

    /**
     * Get 各种设备下的推理镜像
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PresetInferenceImageInfoList 各种设备下的推理镜像
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeviceImageInfo [] getPresetInferenceImageInfoList() {
        return this.PresetInferenceImageInfoList;
    }

    /**
     * Set 各种设备下的推理镜像
注意：此字段可能返回 null，表示取不到有效值。
     * @param PresetInferenceImageInfoList 各种设备下的推理镜像
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPresetInferenceImageInfoList(DeviceImageInfo [] PresetInferenceImageInfoList) {
        this.PresetInferenceImageInfoList = PresetInferenceImageInfoList;
    }

    /**
     * Get 各种设备下的训练代码信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PresetTrainCodeInfoList 各种设备下的训练代码信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeviceMaterialInfo [] getPresetTrainCodeInfoList() {
        return this.PresetTrainCodeInfoList;
    }

    /**
     * Set 各种设备下的训练代码信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PresetTrainCodeInfoList 各种设备下的训练代码信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPresetTrainCodeInfoList(DeviceMaterialInfo [] PresetTrainCodeInfoList) {
        this.PresetTrainCodeInfoList = PresetTrainCodeInfoList;
    }

    /**
     * Get 各种设备下的内置模型信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PresetModelInfoList 各种设备下的内置模型信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeviceMaterialInfo [] getPresetModelInfoList() {
        return this.PresetModelInfoList;
    }

    /**
     * Set 各种设备下的内置模型信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PresetModelInfoList 各种设备下的内置模型信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPresetModelInfoList(DeviceMaterialInfo [] PresetModelInfoList) {
        this.PresetModelInfoList = PresetModelInfoList;
    }

    /**
     * Get 模型类别，比如LLM/MultiModal
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelCategory 模型类别，比如LLM/MultiModal
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelCategory() {
        return this.ModelCategory;
    }

    /**
     * Set 模型类别，比如LLM/MultiModal
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelCategory 模型类别，比如LLM/MultiModal
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelCategory(String ModelCategory) {
        this.ModelCategory = ModelCategory;
    }

    /**
     * Get 公共算法Id 
     * @return PublicAlgoSeriesId 公共算法Id
     */
    public String getPublicAlgoSeriesId() {
        return this.PublicAlgoSeriesId;
    }

    /**
     * Set 公共算法Id
     * @param PublicAlgoSeriesId 公共算法Id
     */
    public void setPublicAlgoSeriesId(String PublicAlgoSeriesId) {
        this.PublicAlgoSeriesId = PublicAlgoSeriesId;
    }

    public PublicAlgoVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublicAlgoVersion(PublicAlgoVersion source) {
        if (source.PublicAlgoVersionId != null) {
            this.PublicAlgoVersionId = new String(source.PublicAlgoVersionId);
        }
        if (source.PublicAlgoGroupId != null) {
            this.PublicAlgoGroupId = new String(source.PublicAlgoGroupId);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.Introduction != null) {
            this.Introduction = new String(source.Introduction);
        }
        if (source.PreviewInfo != null) {
            this.PreviewInfo = new String(source.PreviewInfo);
        }
        if (source.PresetTrainImageInfo != null) {
            this.PresetTrainImageInfo = new ImageInfo(source.PresetTrainImageInfo);
        }
        if (source.PresetTrainCodeInfo != null) {
            this.PresetTrainCodeInfo = new MaterialInfo(source.PresetTrainCodeInfo);
        }
        if (source.PresetModelInfo != null) {
            this.PresetModelInfo = new MaterialInfo(source.PresetModelInfo);
        }
        if (source.IsImported != null) {
            this.IsImported = new Boolean(source.IsImported);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.DefaultResourceSpec != null) {
            this.DefaultResourceSpec = new ResourceSpec(source.DefaultResourceSpec);
        }
        if (source.DefaultInferenceResourceSpec != null) {
            this.DefaultInferenceResourceSpec = new ResourceSpec(source.DefaultInferenceResourceSpec);
        }
        if (source.SupportDeploy != null) {
            this.SupportDeploy = new Boolean(source.SupportDeploy);
        }
        if (source.PresetTrainDataset != null) {
            this.PresetTrainDataset = new MaterialInfo(source.PresetTrainDataset);
        }
        if (source.TrainCodeDownloadUrl != null) {
            this.TrainCodeDownloadUrl = new String(source.TrainCodeDownloadUrl);
        }
        if (source.TrainDataDownloadUrl != null) {
            this.TrainDataDownloadUrl = new String(source.TrainDataDownloadUrl);
        }
        if (source.TrainParams != null) {
            this.TrainParams = new TrainParam[source.TrainParams.length];
            for (int i = 0; i < source.TrainParams.length; i++) {
                this.TrainParams[i] = new TrainParam(source.TrainParams[i]);
            }
        }
        if (source.PresetTrainCodeStartCmd != null) {
            this.PresetTrainCodeStartCmd = new String(source.PresetTrainCodeStartCmd);
        }
        if (source.IsPrivateModel != null) {
            this.IsPrivateModel = new Boolean(source.IsPrivateModel);
        }
        if (source.PresetTrainImageInfoList != null) {
            this.PresetTrainImageInfoList = new DeviceImageInfo[source.PresetTrainImageInfoList.length];
            for (int i = 0; i < source.PresetTrainImageInfoList.length; i++) {
                this.PresetTrainImageInfoList[i] = new DeviceImageInfo(source.PresetTrainImageInfoList[i]);
            }
        }
        if (source.PresetInferenceImageInfoList != null) {
            this.PresetInferenceImageInfoList = new DeviceImageInfo[source.PresetInferenceImageInfoList.length];
            for (int i = 0; i < source.PresetInferenceImageInfoList.length; i++) {
                this.PresetInferenceImageInfoList[i] = new DeviceImageInfo(source.PresetInferenceImageInfoList[i]);
            }
        }
        if (source.PresetTrainCodeInfoList != null) {
            this.PresetTrainCodeInfoList = new DeviceMaterialInfo[source.PresetTrainCodeInfoList.length];
            for (int i = 0; i < source.PresetTrainCodeInfoList.length; i++) {
                this.PresetTrainCodeInfoList[i] = new DeviceMaterialInfo(source.PresetTrainCodeInfoList[i]);
            }
        }
        if (source.PresetModelInfoList != null) {
            this.PresetModelInfoList = new DeviceMaterialInfo[source.PresetModelInfoList.length];
            for (int i = 0; i < source.PresetModelInfoList.length; i++) {
                this.PresetModelInfoList[i] = new DeviceMaterialInfo(source.PresetModelInfoList[i]);
            }
        }
        if (source.ModelCategory != null) {
            this.ModelCategory = new String(source.ModelCategory);
        }
        if (source.PublicAlgoSeriesId != null) {
            this.PublicAlgoSeriesId = new String(source.PublicAlgoSeriesId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublicAlgoVersionId", this.PublicAlgoVersionId);
        this.setParamSimple(map, prefix + "PublicAlgoGroupId", this.PublicAlgoGroupId);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Introduction", this.Introduction);
        this.setParamSimple(map, prefix + "PreviewInfo", this.PreviewInfo);
        this.setParamObj(map, prefix + "PresetTrainImageInfo.", this.PresetTrainImageInfo);
        this.setParamObj(map, prefix + "PresetTrainCodeInfo.", this.PresetTrainCodeInfo);
        this.setParamObj(map, prefix + "PresetModelInfo.", this.PresetModelInfo);
        this.setParamSimple(map, prefix + "IsImported", this.IsImported);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "DefaultResourceSpec.", this.DefaultResourceSpec);
        this.setParamObj(map, prefix + "DefaultInferenceResourceSpec.", this.DefaultInferenceResourceSpec);
        this.setParamSimple(map, prefix + "SupportDeploy", this.SupportDeploy);
        this.setParamObj(map, prefix + "PresetTrainDataset.", this.PresetTrainDataset);
        this.setParamSimple(map, prefix + "TrainCodeDownloadUrl", this.TrainCodeDownloadUrl);
        this.setParamSimple(map, prefix + "TrainDataDownloadUrl", this.TrainDataDownloadUrl);
        this.setParamArrayObj(map, prefix + "TrainParams.", this.TrainParams);
        this.setParamSimple(map, prefix + "PresetTrainCodeStartCmd", this.PresetTrainCodeStartCmd);
        this.setParamSimple(map, prefix + "IsPrivateModel", this.IsPrivateModel);
        this.setParamArrayObj(map, prefix + "PresetTrainImageInfoList.", this.PresetTrainImageInfoList);
        this.setParamArrayObj(map, prefix + "PresetInferenceImageInfoList.", this.PresetInferenceImageInfoList);
        this.setParamArrayObj(map, prefix + "PresetTrainCodeInfoList.", this.PresetTrainCodeInfoList);
        this.setParamArrayObj(map, prefix + "PresetModelInfoList.", this.PresetModelInfoList);
        this.setParamSimple(map, prefix + "ModelCategory", this.ModelCategory);
        this.setParamSimple(map, prefix + "PublicAlgoSeriesId", this.PublicAlgoSeriesId);

    }
}

