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
package com.tencentcloudapi.tione.v20191022.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrainingJobResponse extends AbstractModel{

    /**
    * 算法镜像配置
    */
    @SerializedName("AlgorithmSpecification")
    @Expose
    private AlgorithmSpecification AlgorithmSpecification;

    /**
    * 任务名称
    */
    @SerializedName("TrainingJobName")
    @Expose
    private String TrainingJobName;

    /**
    * 算法超级参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HyperParameters")
    @Expose
    private String HyperParameters;

    /**
    * 输入数据配置
    */
    @SerializedName("InputDataConfig")
    @Expose
    private InputDataConfig [] InputDataConfig;

    /**
    * 输出数据配置
    */
    @SerializedName("OutputDataConfig")
    @Expose
    private OutputDataConfig OutputDataConfig;

    /**
    * 中止条件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StoppingCondition")
    @Expose
    private StoppingCondition StoppingCondition;

    /**
    * 计算实例配置
    */
    @SerializedName("ResourceConfig")
    @Expose
    private ResourceConfig ResourceConfig;

    /**
    * 私有网络配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcConfig")
    @Expose
    private VpcConfig VpcConfig;

    /**
    * 失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailureReason")
    @Expose
    private String FailureReason;

    /**
    * 最近修改时间
    */
    @SerializedName("LastModifiedTime")
    @Expose
    private String LastModifiedTime;

    /**
    * 任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrainingStartTime")
    @Expose
    private String TrainingStartTime;

    /**
    * 任务完成时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TrainingEndTime")
    @Expose
    private String TrainingEndTime;

    /**
    * 模型输出配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModelArtifacts")
    @Expose
    private ModelArtifacts ModelArtifacts;

    /**
    * 详细状态，取值范围
Starting：启动中
Downloading: 准备训练数据
Training: 正在训练
Uploading: 上传训练结果
Completed：已完成
Failed: 失败
MaxRuntimeExceeded: 任务超过最大运行时间
Stopping: 停止中
Stopped：已停止
    */
    @SerializedName("SecondaryStatus")
    @Expose
    private String SecondaryStatus;

    /**
    * 详细状态事件记录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecondaryStatusTransitions")
    @Expose
    private SecondaryStatusTransition [] SecondaryStatusTransitions;

    /**
    * 角色名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * 训练任务状态，取值范围
InProgress：运行中
Completed: 已完成
Failed: 失败
Stopping: 停止中
Stopped：已停止
    */
    @SerializedName("TrainingJobStatus")
    @Expose
    private String TrainingJobStatus;

    /**
    * 训练任务日志链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LogUrl")
    @Expose
    private String LogUrl;

    /**
    * 训练任务实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 算法镜像配置 
     * @return AlgorithmSpecification 算法镜像配置
     */
    public AlgorithmSpecification getAlgorithmSpecification() {
        return this.AlgorithmSpecification;
    }

    /**
     * Set 算法镜像配置
     * @param AlgorithmSpecification 算法镜像配置
     */
    public void setAlgorithmSpecification(AlgorithmSpecification AlgorithmSpecification) {
        this.AlgorithmSpecification = AlgorithmSpecification;
    }

    /**
     * Get 任务名称 
     * @return TrainingJobName 任务名称
     */
    public String getTrainingJobName() {
        return this.TrainingJobName;
    }

    /**
     * Set 任务名称
     * @param TrainingJobName 任务名称
     */
    public void setTrainingJobName(String TrainingJobName) {
        this.TrainingJobName = TrainingJobName;
    }

    /**
     * Get 算法超级参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HyperParameters 算法超级参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHyperParameters() {
        return this.HyperParameters;
    }

    /**
     * Set 算法超级参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param HyperParameters 算法超级参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHyperParameters(String HyperParameters) {
        this.HyperParameters = HyperParameters;
    }

    /**
     * Get 输入数据配置 
     * @return InputDataConfig 输入数据配置
     */
    public InputDataConfig [] getInputDataConfig() {
        return this.InputDataConfig;
    }

    /**
     * Set 输入数据配置
     * @param InputDataConfig 输入数据配置
     */
    public void setInputDataConfig(InputDataConfig [] InputDataConfig) {
        this.InputDataConfig = InputDataConfig;
    }

    /**
     * Get 输出数据配置 
     * @return OutputDataConfig 输出数据配置
     */
    public OutputDataConfig getOutputDataConfig() {
        return this.OutputDataConfig;
    }

    /**
     * Set 输出数据配置
     * @param OutputDataConfig 输出数据配置
     */
    public void setOutputDataConfig(OutputDataConfig OutputDataConfig) {
        this.OutputDataConfig = OutputDataConfig;
    }

    /**
     * Get 中止条件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StoppingCondition 中止条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StoppingCondition getStoppingCondition() {
        return this.StoppingCondition;
    }

    /**
     * Set 中止条件
注意：此字段可能返回 null，表示取不到有效值。
     * @param StoppingCondition 中止条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStoppingCondition(StoppingCondition StoppingCondition) {
        this.StoppingCondition = StoppingCondition;
    }

    /**
     * Get 计算实例配置 
     * @return ResourceConfig 计算实例配置
     */
    public ResourceConfig getResourceConfig() {
        return this.ResourceConfig;
    }

    /**
     * Set 计算实例配置
     * @param ResourceConfig 计算实例配置
     */
    public void setResourceConfig(ResourceConfig ResourceConfig) {
        this.ResourceConfig = ResourceConfig;
    }

    /**
     * Get 私有网络配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcConfig 私有网络配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public VpcConfig getVpcConfig() {
        return this.VpcConfig;
    }

    /**
     * Set 私有网络配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcConfig 私有网络配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcConfig(VpcConfig VpcConfig) {
        this.VpcConfig = VpcConfig;
    }

    /**
     * Get 失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailureReason 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailureReason() {
        return this.FailureReason;
    }

    /**
     * Set 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailureReason 失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailureReason(String FailureReason) {
        this.FailureReason = FailureReason;
    }

    /**
     * Get 最近修改时间 
     * @return LastModifiedTime 最近修改时间
     */
    public String getLastModifiedTime() {
        return this.LastModifiedTime;
    }

    /**
     * Set 最近修改时间
     * @param LastModifiedTime 最近修改时间
     */
    public void setLastModifiedTime(String LastModifiedTime) {
        this.LastModifiedTime = LastModifiedTime;
    }

    /**
     * Get 任务开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrainingStartTime 任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrainingStartTime() {
        return this.TrainingStartTime;
    }

    /**
     * Set 任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrainingStartTime 任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrainingStartTime(String TrainingStartTime) {
        this.TrainingStartTime = TrainingStartTime;
    }

    /**
     * Get 任务完成时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TrainingEndTime 任务完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTrainingEndTime() {
        return this.TrainingEndTime;
    }

    /**
     * Set 任务完成时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TrainingEndTime 任务完成时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTrainingEndTime(String TrainingEndTime) {
        this.TrainingEndTime = TrainingEndTime;
    }

    /**
     * Get 模型输出配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModelArtifacts 模型输出配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ModelArtifacts getModelArtifacts() {
        return this.ModelArtifacts;
    }

    /**
     * Set 模型输出配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModelArtifacts 模型输出配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModelArtifacts(ModelArtifacts ModelArtifacts) {
        this.ModelArtifacts = ModelArtifacts;
    }

    /**
     * Get 详细状态，取值范围
Starting：启动中
Downloading: 准备训练数据
Training: 正在训练
Uploading: 上传训练结果
Completed：已完成
Failed: 失败
MaxRuntimeExceeded: 任务超过最大运行时间
Stopping: 停止中
Stopped：已停止 
     * @return SecondaryStatus 详细状态，取值范围
Starting：启动中
Downloading: 准备训练数据
Training: 正在训练
Uploading: 上传训练结果
Completed：已完成
Failed: 失败
MaxRuntimeExceeded: 任务超过最大运行时间
Stopping: 停止中
Stopped：已停止
     */
    public String getSecondaryStatus() {
        return this.SecondaryStatus;
    }

    /**
     * Set 详细状态，取值范围
Starting：启动中
Downloading: 准备训练数据
Training: 正在训练
Uploading: 上传训练结果
Completed：已完成
Failed: 失败
MaxRuntimeExceeded: 任务超过最大运行时间
Stopping: 停止中
Stopped：已停止
     * @param SecondaryStatus 详细状态，取值范围
Starting：启动中
Downloading: 准备训练数据
Training: 正在训练
Uploading: 上传训练结果
Completed：已完成
Failed: 失败
MaxRuntimeExceeded: 任务超过最大运行时间
Stopping: 停止中
Stopped：已停止
     */
    public void setSecondaryStatus(String SecondaryStatus) {
        this.SecondaryStatus = SecondaryStatus;
    }

    /**
     * Get 详细状态事件记录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecondaryStatusTransitions 详细状态事件记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SecondaryStatusTransition [] getSecondaryStatusTransitions() {
        return this.SecondaryStatusTransitions;
    }

    /**
     * Set 详细状态事件记录
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecondaryStatusTransitions 详细状态事件记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecondaryStatusTransitions(SecondaryStatusTransition [] SecondaryStatusTransitions) {
        this.SecondaryStatusTransitions = SecondaryStatusTransitions;
    }

    /**
     * Get 角色名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RoleName 角色名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 角色名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RoleName 角色名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get 训练任务状态，取值范围
InProgress：运行中
Completed: 已完成
Failed: 失败
Stopping: 停止中
Stopped：已停止 
     * @return TrainingJobStatus 训练任务状态，取值范围
InProgress：运行中
Completed: 已完成
Failed: 失败
Stopping: 停止中
Stopped：已停止
     */
    public String getTrainingJobStatus() {
        return this.TrainingJobStatus;
    }

    /**
     * Set 训练任务状态，取值范围
InProgress：运行中
Completed: 已完成
Failed: 失败
Stopping: 停止中
Stopped：已停止
     * @param TrainingJobStatus 训练任务状态，取值范围
InProgress：运行中
Completed: 已完成
Failed: 失败
Stopping: 停止中
Stopped：已停止
     */
    public void setTrainingJobStatus(String TrainingJobStatus) {
        this.TrainingJobStatus = TrainingJobStatus;
    }

    /**
     * Get 训练任务日志链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LogUrl 训练任务日志链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLogUrl() {
        return this.LogUrl;
    }

    /**
     * Set 训练任务日志链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param LogUrl 训练任务日志链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLogUrl(String LogUrl) {
        this.LogUrl = LogUrl;
    }

    /**
     * Get 训练任务实例ID 
     * @return InstanceId 训练任务实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 训练任务实例ID
     * @param InstanceId 训练任务实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AlgorithmSpecification.", this.AlgorithmSpecification);
        this.setParamSimple(map, prefix + "TrainingJobName", this.TrainingJobName);
        this.setParamSimple(map, prefix + "HyperParameters", this.HyperParameters);
        this.setParamArrayObj(map, prefix + "InputDataConfig.", this.InputDataConfig);
        this.setParamObj(map, prefix + "OutputDataConfig.", this.OutputDataConfig);
        this.setParamObj(map, prefix + "StoppingCondition.", this.StoppingCondition);
        this.setParamObj(map, prefix + "ResourceConfig.", this.ResourceConfig);
        this.setParamObj(map, prefix + "VpcConfig.", this.VpcConfig);
        this.setParamSimple(map, prefix + "FailureReason", this.FailureReason);
        this.setParamSimple(map, prefix + "LastModifiedTime", this.LastModifiedTime);
        this.setParamSimple(map, prefix + "TrainingStartTime", this.TrainingStartTime);
        this.setParamSimple(map, prefix + "TrainingEndTime", this.TrainingEndTime);
        this.setParamObj(map, prefix + "ModelArtifacts.", this.ModelArtifacts);
        this.setParamSimple(map, prefix + "SecondaryStatus", this.SecondaryStatus);
        this.setParamArrayObj(map, prefix + "SecondaryStatusTransitions.", this.SecondaryStatusTransitions);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "TrainingJobStatus", this.TrainingJobStatus);
        this.setParamSimple(map, prefix + "LogUrl", this.LogUrl);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

