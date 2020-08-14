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

public class CreateTrainingJobRequest extends AbstractModel{

    /**
    * 算法镜像配置
    */
    @SerializedName("AlgorithmSpecification")
    @Expose
    private AlgorithmSpecification AlgorithmSpecification;

    /**
    * 输出数据配置
    */
    @SerializedName("OutputDataConfig")
    @Expose
    private OutputDataConfig OutputDataConfig;

    /**
    * 资源实例配置
    */
    @SerializedName("ResourceConfig")
    @Expose
    private ResourceConfig ResourceConfig;

    /**
    * 训练任务名称
    */
    @SerializedName("TrainingJobName")
    @Expose
    private String TrainingJobName;

    /**
    * 输入数据配置
    */
    @SerializedName("InputDataConfig")
    @Expose
    private InputDataConfig [] InputDataConfig;

    /**
    * 中止条件
    */
    @SerializedName("StoppingCondition")
    @Expose
    private StoppingCondition StoppingCondition;

    /**
    * 私有网络配置
    */
    @SerializedName("VpcConfig")
    @Expose
    private VpcConfig VpcConfig;

    /**
    * 算法超级参数
    */
    @SerializedName("HyperParameters")
    @Expose
    private String HyperParameters;

    /**
    * 环境变量配置
    */
    @SerializedName("EnvConfig")
    @Expose
    private EnvConfig [] EnvConfig;

    /**
    * 角色名称
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * 在资源不足（ResourceInsufficient）时后台不定时尝试重新创建训练任务。可取值Enabled/Disabled
默认值为Disabled即不重新尝试。设为Enabled时重新尝试有一定的时间期限，定义在 StoppingCondition 中 MaxWaitTimeInSecond中 ，默认值为1天，超过该期限创建失败。
    */
    @SerializedName("RetryWhenResourceInsufficient")
    @Expose
    private String RetryWhenResourceInsufficient;

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
     * Get 资源实例配置 
     * @return ResourceConfig 资源实例配置
     */
    public ResourceConfig getResourceConfig() {
        return this.ResourceConfig;
    }

    /**
     * Set 资源实例配置
     * @param ResourceConfig 资源实例配置
     */
    public void setResourceConfig(ResourceConfig ResourceConfig) {
        this.ResourceConfig = ResourceConfig;
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
     * Get 中止条件 
     * @return StoppingCondition 中止条件
     */
    public StoppingCondition getStoppingCondition() {
        return this.StoppingCondition;
    }

    /**
     * Set 中止条件
     * @param StoppingCondition 中止条件
     */
    public void setStoppingCondition(StoppingCondition StoppingCondition) {
        this.StoppingCondition = StoppingCondition;
    }

    /**
     * Get 私有网络配置 
     * @return VpcConfig 私有网络配置
     */
    public VpcConfig getVpcConfig() {
        return this.VpcConfig;
    }

    /**
     * Set 私有网络配置
     * @param VpcConfig 私有网络配置
     */
    public void setVpcConfig(VpcConfig VpcConfig) {
        this.VpcConfig = VpcConfig;
    }

    /**
     * Get 算法超级参数 
     * @return HyperParameters 算法超级参数
     */
    public String getHyperParameters() {
        return this.HyperParameters;
    }

    /**
     * Set 算法超级参数
     * @param HyperParameters 算法超级参数
     */
    public void setHyperParameters(String HyperParameters) {
        this.HyperParameters = HyperParameters;
    }

    /**
     * Get 环境变量配置 
     * @return EnvConfig 环境变量配置
     */
    public EnvConfig [] getEnvConfig() {
        return this.EnvConfig;
    }

    /**
     * Set 环境变量配置
     * @param EnvConfig 环境变量配置
     */
    public void setEnvConfig(EnvConfig [] EnvConfig) {
        this.EnvConfig = EnvConfig;
    }

    /**
     * Get 角色名称 
     * @return RoleName 角色名称
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 角色名称
     * @param RoleName 角色名称
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get 在资源不足（ResourceInsufficient）时后台不定时尝试重新创建训练任务。可取值Enabled/Disabled
默认值为Disabled即不重新尝试。设为Enabled时重新尝试有一定的时间期限，定义在 StoppingCondition 中 MaxWaitTimeInSecond中 ，默认值为1天，超过该期限创建失败。 
     * @return RetryWhenResourceInsufficient 在资源不足（ResourceInsufficient）时后台不定时尝试重新创建训练任务。可取值Enabled/Disabled
默认值为Disabled即不重新尝试。设为Enabled时重新尝试有一定的时间期限，定义在 StoppingCondition 中 MaxWaitTimeInSecond中 ，默认值为1天，超过该期限创建失败。
     */
    public String getRetryWhenResourceInsufficient() {
        return this.RetryWhenResourceInsufficient;
    }

    /**
     * Set 在资源不足（ResourceInsufficient）时后台不定时尝试重新创建训练任务。可取值Enabled/Disabled
默认值为Disabled即不重新尝试。设为Enabled时重新尝试有一定的时间期限，定义在 StoppingCondition 中 MaxWaitTimeInSecond中 ，默认值为1天，超过该期限创建失败。
     * @param RetryWhenResourceInsufficient 在资源不足（ResourceInsufficient）时后台不定时尝试重新创建训练任务。可取值Enabled/Disabled
默认值为Disabled即不重新尝试。设为Enabled时重新尝试有一定的时间期限，定义在 StoppingCondition 中 MaxWaitTimeInSecond中 ，默认值为1天，超过该期限创建失败。
     */
    public void setRetryWhenResourceInsufficient(String RetryWhenResourceInsufficient) {
        this.RetryWhenResourceInsufficient = RetryWhenResourceInsufficient;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "AlgorithmSpecification.", this.AlgorithmSpecification);
        this.setParamObj(map, prefix + "OutputDataConfig.", this.OutputDataConfig);
        this.setParamObj(map, prefix + "ResourceConfig.", this.ResourceConfig);
        this.setParamSimple(map, prefix + "TrainingJobName", this.TrainingJobName);
        this.setParamArrayObj(map, prefix + "InputDataConfig.", this.InputDataConfig);
        this.setParamObj(map, prefix + "StoppingCondition.", this.StoppingCondition);
        this.setParamObj(map, prefix + "VpcConfig.", this.VpcConfig);
        this.setParamSimple(map, prefix + "HyperParameters", this.HyperParameters);
        this.setParamArrayObj(map, prefix + "EnvConfig.", this.EnvConfig);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "RetryWhenResourceInsufficient", this.RetryWhenResourceInsufficient);

    }
}

