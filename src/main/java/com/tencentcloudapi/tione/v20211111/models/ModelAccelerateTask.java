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

public class ModelAccelerateTask extends AbstractModel{

    /**
    * 模型加速任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelAccTaskId")
    @Expose
    private String ModelAccTaskId;

    /**
    * 模型加速任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelAccTaskName")
    @Expose
    private String ModelAccTaskName;

    /**
    * 模型ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelId")
    @Expose
    private String ModelId;

    /**
    * 模型名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * 模型版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelVersion")
    @Expose
    private String ModelVersion;

    /**
    * 模型来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelSource")
    @Expose
    private String ModelSource;

    /**
    * 优化级别
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OptimizationLevel")
    @Expose
    private String OptimizationLevel;

    /**
    * 任务状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * input节点个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelInputNum")
    @Expose
    private Long ModelInputNum;

    /**
    * input节点信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelInputInfos")
    @Expose
    private ModelInputInfo [] ModelInputInfos;

    /**
    * GPU型号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GPUType")
    @Expose
    private String GPUType;

    /**
    * 计费模式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 加速比
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Speedup")
    @Expose
    private String Speedup;

    /**
    * 模型输入cos路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelInputPath")
    @Expose
    private CosPathInfo ModelInputPath;

    /**
    * 模型输出cos路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelOutputPath")
    @Expose
    private CosPathInfo ModelOutputPath;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMsg")
    @Expose
    private String ErrorMsg;

    /**
    * 算法框架
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlgorithmFramework")
    @Expose
    private String AlgorithmFramework;

    /**
    * 排队个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WaitNumber")
    @Expose
    private Long WaitNumber;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskProgress")
    @Expose
    private Long TaskProgress;

    /**
    * 模型格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelFormat")
    @Expose
    private String ModelFormat;

    /**
    * 模型Tensor信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TensorInfos")
    @Expose
    private String [] TensorInfos;

    /**
    * 模型专业参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HyperParameter")
    @Expose
    private HyperParameter HyperParameter;

    /**
    * 加速引擎版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AccEngineVersion")
    @Expose
    private String AccEngineVersion;

    /**
    * 标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 优化模型是否已保存到模型仓库
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSaved")
    @Expose
    private Boolean IsSaved;

    /**
    * SAVED_MODEL保存时配置的签名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelSignature")
    @Expose
    private String ModelSignature;

    /**
    * 是否是QAT模型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QATModel")
    @Expose
    private Boolean QATModel;

    /**
    * 加速引擎对应的框架版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FrameworkVersion")
    @Expose
    private String FrameworkVersion;

    /**
     * Get 模型加速任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelAccTaskId 模型加速任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelAccTaskId() {
        return this.ModelAccTaskId;
    }

    /**
     * Set 模型加速任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelAccTaskId 模型加速任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelAccTaskId(String ModelAccTaskId) {
        this.ModelAccTaskId = ModelAccTaskId;
    }

    /**
     * Get 模型加速任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelAccTaskName 模型加速任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelAccTaskName() {
        return this.ModelAccTaskName;
    }

    /**
     * Set 模型加速任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelAccTaskName 模型加速任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelAccTaskName(String ModelAccTaskName) {
        this.ModelAccTaskName = ModelAccTaskName;
    }

    /**
     * Get 模型ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelId 模型ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelId() {
        return this.ModelId;
    }

    /**
     * Set 模型ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelId 模型ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelId(String ModelId) {
        this.ModelId = ModelId;
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
     * Get 模型版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelVersion 模型版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelVersion() {
        return this.ModelVersion;
    }

    /**
     * Set 模型版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelVersion 模型版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelVersion(String ModelVersion) {
        this.ModelVersion = ModelVersion;
    }

    /**
     * Get 模型来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelSource 模型来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelSource() {
        return this.ModelSource;
    }

    /**
     * Set 模型来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelSource 模型来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelSource(String ModelSource) {
        this.ModelSource = ModelSource;
    }

    /**
     * Get 优化级别
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OptimizationLevel 优化级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOptimizationLevel() {
        return this.OptimizationLevel;
    }

    /**
     * Set 优化级别
注意：此字段可能返回 null，表示取不到有效值。
     * @param OptimizationLevel 优化级别
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOptimizationLevel(String OptimizationLevel) {
        this.OptimizationLevel = OptimizationLevel;
    }

    /**
     * Get 任务状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskStatus 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskStatus 任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get input节点个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelInputNum input节点个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getModelInputNum() {
        return this.ModelInputNum;
    }

    /**
     * Set input节点个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelInputNum input节点个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelInputNum(Long ModelInputNum) {
        this.ModelInputNum = ModelInputNum;
    }

    /**
     * Get input节点信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelInputInfos input节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModelInputInfo [] getModelInputInfos() {
        return this.ModelInputInfos;
    }

    /**
     * Set input节点信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelInputInfos input节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelInputInfos(ModelInputInfo [] ModelInputInfos) {
        this.ModelInputInfos = ModelInputInfos;
    }

    /**
     * Get GPU型号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GPUType GPU型号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGPUType() {
        return this.GPUType;
    }

    /**
     * Set GPU型号
注意：此字段可能返回 null，表示取不到有效值。
     * @param GPUType GPU型号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGPUType(String GPUType) {
        this.GPUType = GPUType;
    }

    /**
     * Get 计费模式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChargeType 计费模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 计费模式
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChargeType 计费模式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 加速比
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Speedup 加速比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSpeedup() {
        return this.Speedup;
    }

    /**
     * Set 加速比
注意：此字段可能返回 null，表示取不到有效值。
     * @param Speedup 加速比
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpeedup(String Speedup) {
        this.Speedup = Speedup;
    }

    /**
     * Get 模型输入cos路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelInputPath 模型输入cos路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CosPathInfo getModelInputPath() {
        return this.ModelInputPath;
    }

    /**
     * Set 模型输入cos路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelInputPath 模型输入cos路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelInputPath(CosPathInfo ModelInputPath) {
        this.ModelInputPath = ModelInputPath;
    }

    /**
     * Get 模型输出cos路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelOutputPath 模型输出cos路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CosPathInfo getModelOutputPath() {
        return this.ModelOutputPath;
    }

    /**
     * Set 模型输出cos路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelOutputPath 模型输出cos路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelOutputPath(CosPathInfo ModelOutputPath) {
        this.ModelOutputPath = ModelOutputPath;
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
     * Get 排队个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WaitNumber 排队个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWaitNumber() {
        return this.WaitNumber;
    }

    /**
     * Set 排队个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param WaitNumber 排队个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWaitNumber(Long WaitNumber) {
        this.WaitNumber = WaitNumber;
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
     * Get 任务进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskProgress 任务进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskProgress() {
        return this.TaskProgress;
    }

    /**
     * Set 任务进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskProgress 任务进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskProgress(Long TaskProgress) {
        this.TaskProgress = TaskProgress;
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
     * Get 模型Tensor信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TensorInfos 模型Tensor信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTensorInfos() {
        return this.TensorInfos;
    }

    /**
     * Set 模型Tensor信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TensorInfos 模型Tensor信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTensorInfos(String [] TensorInfos) {
        this.TensorInfos = TensorInfos;
    }

    /**
     * Get 模型专业参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HyperParameter 模型专业参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HyperParameter getHyperParameter() {
        return this.HyperParameter;
    }

    /**
     * Set 模型专业参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param HyperParameter 模型专业参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHyperParameter(HyperParameter HyperParameter) {
        this.HyperParameter = HyperParameter;
    }

    /**
     * Get 加速引擎版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AccEngineVersion 加速引擎版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAccEngineVersion() {
        return this.AccEngineVersion;
    }

    /**
     * Set 加速引擎版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param AccEngineVersion 加速引擎版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAccEngineVersion(String AccEngineVersion) {
        this.AccEngineVersion = AccEngineVersion;
    }

    /**
     * Get 标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 优化模型是否已保存到模型仓库
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSaved 优化模型是否已保存到模型仓库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsSaved() {
        return this.IsSaved;
    }

    /**
     * Set 优化模型是否已保存到模型仓库
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSaved 优化模型是否已保存到模型仓库
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSaved(Boolean IsSaved) {
        this.IsSaved = IsSaved;
    }

    /**
     * Get SAVED_MODEL保存时配置的签名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelSignature SAVED_MODEL保存时配置的签名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModelSignature() {
        return this.ModelSignature;
    }

    /**
     * Set SAVED_MODEL保存时配置的签名
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelSignature SAVED_MODEL保存时配置的签名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelSignature(String ModelSignature) {
        this.ModelSignature = ModelSignature;
    }

    /**
     * Get 是否是QAT模型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QATModel 是否是QAT模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getQATModel() {
        return this.QATModel;
    }

    /**
     * Set 是否是QAT模型
注意：此字段可能返回 null，表示取不到有效值。
     * @param QATModel 是否是QAT模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQATModel(Boolean QATModel) {
        this.QATModel = QATModel;
    }

    /**
     * Get 加速引擎对应的框架版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FrameworkVersion 加速引擎对应的框架版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFrameworkVersion() {
        return this.FrameworkVersion;
    }

    /**
     * Set 加速引擎对应的框架版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param FrameworkVersion 加速引擎对应的框架版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFrameworkVersion(String FrameworkVersion) {
        this.FrameworkVersion = FrameworkVersion;
    }

    public ModelAccelerateTask() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelAccelerateTask(ModelAccelerateTask source) {
        if (source.ModelAccTaskId != null) {
            this.ModelAccTaskId = new String(source.ModelAccTaskId);
        }
        if (source.ModelAccTaskName != null) {
            this.ModelAccTaskName = new String(source.ModelAccTaskName);
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
        if (source.OptimizationLevel != null) {
            this.OptimizationLevel = new String(source.OptimizationLevel);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
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
        if (source.GPUType != null) {
            this.GPUType = new String(source.GPUType);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.Speedup != null) {
            this.Speedup = new String(source.Speedup);
        }
        if (source.ModelInputPath != null) {
            this.ModelInputPath = new CosPathInfo(source.ModelInputPath);
        }
        if (source.ModelOutputPath != null) {
            this.ModelOutputPath = new CosPathInfo(source.ModelOutputPath);
        }
        if (source.ErrorMsg != null) {
            this.ErrorMsg = new String(source.ErrorMsg);
        }
        if (source.AlgorithmFramework != null) {
            this.AlgorithmFramework = new String(source.AlgorithmFramework);
        }
        if (source.WaitNumber != null) {
            this.WaitNumber = new Long(source.WaitNumber);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.TaskProgress != null) {
            this.TaskProgress = new Long(source.TaskProgress);
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
        if (source.IsSaved != null) {
            this.IsSaved = new Boolean(source.IsSaved);
        }
        if (source.ModelSignature != null) {
            this.ModelSignature = new String(source.ModelSignature);
        }
        if (source.QATModel != null) {
            this.QATModel = new Boolean(source.QATModel);
        }
        if (source.FrameworkVersion != null) {
            this.FrameworkVersion = new String(source.FrameworkVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelAccTaskId", this.ModelAccTaskId);
        this.setParamSimple(map, prefix + "ModelAccTaskName", this.ModelAccTaskName);
        this.setParamSimple(map, prefix + "ModelId", this.ModelId);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "ModelVersion", this.ModelVersion);
        this.setParamSimple(map, prefix + "ModelSource", this.ModelSource);
        this.setParamSimple(map, prefix + "OptimizationLevel", this.OptimizationLevel);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "ModelInputNum", this.ModelInputNum);
        this.setParamArrayObj(map, prefix + "ModelInputInfos.", this.ModelInputInfos);
        this.setParamSimple(map, prefix + "GPUType", this.GPUType);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "Speedup", this.Speedup);
        this.setParamObj(map, prefix + "ModelInputPath.", this.ModelInputPath);
        this.setParamObj(map, prefix + "ModelOutputPath.", this.ModelOutputPath);
        this.setParamSimple(map, prefix + "ErrorMsg", this.ErrorMsg);
        this.setParamSimple(map, prefix + "AlgorithmFramework", this.AlgorithmFramework);
        this.setParamSimple(map, prefix + "WaitNumber", this.WaitNumber);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "TaskProgress", this.TaskProgress);
        this.setParamSimple(map, prefix + "ModelFormat", this.ModelFormat);
        this.setParamArraySimple(map, prefix + "TensorInfos.", this.TensorInfos);
        this.setParamObj(map, prefix + "HyperParameter.", this.HyperParameter);
        this.setParamSimple(map, prefix + "AccEngineVersion", this.AccEngineVersion);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "IsSaved", this.IsSaved);
        this.setParamSimple(map, prefix + "ModelSignature", this.ModelSignature);
        this.setParamSimple(map, prefix + "QATModel", this.QATModel);
        this.setParamSimple(map, prefix + "FrameworkVersion", this.FrameworkVersion);

    }
}

