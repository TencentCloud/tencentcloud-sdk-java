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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Task extends AbstractModel{

    /**
    * 应用程序信息
    */
    @SerializedName("Application")
    @Expose
    private Application Application;

    /**
    * 任务名称，在一个作业内部唯一
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务实例运行个数
    */
    @SerializedName("TaskInstanceNum")
    @Expose
    private Long TaskInstanceNum;

    /**
    * 运行环境信息，ComputeEnv 和 EnvId 必须指定一个（且只有一个）参数。
    */
    @SerializedName("ComputeEnv")
    @Expose
    private AnonymousComputeEnv ComputeEnv;

    /**
    * 计算环境ID，ComputeEnv 和 EnvId 必须指定一个（且只有一个）参数。
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 重定向信息
    */
    @SerializedName("RedirectInfo")
    @Expose
    private RedirectInfo RedirectInfo;

    /**
    * 重定向本地信息
    */
    @SerializedName("RedirectLocalInfo")
    @Expose
    private RedirectLocalInfo RedirectLocalInfo;

    /**
    * 输入映射
    */
    @SerializedName("InputMappings")
    @Expose
    private InputMapping [] InputMappings;

    /**
    * 输出映射
    */
    @SerializedName("OutputMappings")
    @Expose
    private OutputMapping [] OutputMappings;

    /**
    * 输出映射配置
    */
    @SerializedName("OutputMappingConfigs")
    @Expose
    private OutputMappingConfig [] OutputMappingConfigs;

    /**
    * 自定义环境变量
    */
    @SerializedName("EnvVars")
    @Expose
    private EnvVar [] EnvVars;

    /**
    * 授权信息
    */
    @SerializedName("Authentications")
    @Expose
    private Authentication [] Authentications;

    /**
    * TaskInstance失败后处理方式，取值包括TERMINATE（默认）、INTERRUPT、FAST_INTERRUPT。
    */
    @SerializedName("FailedAction")
    @Expose
    private String FailedAction;

    /**
    * 任务失败后的最大重试次数，默认为0
    */
    @SerializedName("MaxRetryCount")
    @Expose
    private Long MaxRetryCount;

    /**
    * 任务启动后的超时时间，单位秒，默认为86400秒
    */
    @SerializedName("Timeout")
    @Expose
    private Long Timeout;

    /**
    * 任务最大并发数限制，默认没有限制。
    */
    @SerializedName("MaxConcurrentNum")
    @Expose
    private Long MaxConcurrentNum;

    /**
    * 任务完成后，重启计算节点。适用于指定计算环境执行任务。
    */
    @SerializedName("RestartComputeNode")
    @Expose
    private Boolean RestartComputeNode;

    /**
    * 启动任务过程中，创建计算资源如CVM失败后的最大重试次数，默认为0。
    */
    @SerializedName("ResourceMaxRetryCount")
    @Expose
    private Long ResourceMaxRetryCount;

    /**
     * Get 应用程序信息 
     * @return Application 应用程序信息
     */
    public Application getApplication() {
        return this.Application;
    }

    /**
     * Set 应用程序信息
     * @param Application 应用程序信息
     */
    public void setApplication(Application Application) {
        this.Application = Application;
    }

    /**
     * Get 任务名称，在一个作业内部唯一 
     * @return TaskName 任务名称，在一个作业内部唯一
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称，在一个作业内部唯一
     * @param TaskName 任务名称，在一个作业内部唯一
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 任务实例运行个数 
     * @return TaskInstanceNum 任务实例运行个数
     */
    public Long getTaskInstanceNum() {
        return this.TaskInstanceNum;
    }

    /**
     * Set 任务实例运行个数
     * @param TaskInstanceNum 任务实例运行个数
     */
    public void setTaskInstanceNum(Long TaskInstanceNum) {
        this.TaskInstanceNum = TaskInstanceNum;
    }

    /**
     * Get 运行环境信息，ComputeEnv 和 EnvId 必须指定一个（且只有一个）参数。 
     * @return ComputeEnv 运行环境信息，ComputeEnv 和 EnvId 必须指定一个（且只有一个）参数。
     */
    public AnonymousComputeEnv getComputeEnv() {
        return this.ComputeEnv;
    }

    /**
     * Set 运行环境信息，ComputeEnv 和 EnvId 必须指定一个（且只有一个）参数。
     * @param ComputeEnv 运行环境信息，ComputeEnv 和 EnvId 必须指定一个（且只有一个）参数。
     */
    public void setComputeEnv(AnonymousComputeEnv ComputeEnv) {
        this.ComputeEnv = ComputeEnv;
    }

    /**
     * Get 计算环境ID，ComputeEnv 和 EnvId 必须指定一个（且只有一个）参数。 
     * @return EnvId 计算环境ID，ComputeEnv 和 EnvId 必须指定一个（且只有一个）参数。
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 计算环境ID，ComputeEnv 和 EnvId 必须指定一个（且只有一个）参数。
     * @param EnvId 计算环境ID，ComputeEnv 和 EnvId 必须指定一个（且只有一个）参数。
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 重定向信息 
     * @return RedirectInfo 重定向信息
     */
    public RedirectInfo getRedirectInfo() {
        return this.RedirectInfo;
    }

    /**
     * Set 重定向信息
     * @param RedirectInfo 重定向信息
     */
    public void setRedirectInfo(RedirectInfo RedirectInfo) {
        this.RedirectInfo = RedirectInfo;
    }

    /**
     * Get 重定向本地信息 
     * @return RedirectLocalInfo 重定向本地信息
     */
    public RedirectLocalInfo getRedirectLocalInfo() {
        return this.RedirectLocalInfo;
    }

    /**
     * Set 重定向本地信息
     * @param RedirectLocalInfo 重定向本地信息
     */
    public void setRedirectLocalInfo(RedirectLocalInfo RedirectLocalInfo) {
        this.RedirectLocalInfo = RedirectLocalInfo;
    }

    /**
     * Get 输入映射 
     * @return InputMappings 输入映射
     */
    public InputMapping [] getInputMappings() {
        return this.InputMappings;
    }

    /**
     * Set 输入映射
     * @param InputMappings 输入映射
     */
    public void setInputMappings(InputMapping [] InputMappings) {
        this.InputMappings = InputMappings;
    }

    /**
     * Get 输出映射 
     * @return OutputMappings 输出映射
     */
    public OutputMapping [] getOutputMappings() {
        return this.OutputMappings;
    }

    /**
     * Set 输出映射
     * @param OutputMappings 输出映射
     */
    public void setOutputMappings(OutputMapping [] OutputMappings) {
        this.OutputMappings = OutputMappings;
    }

    /**
     * Get 输出映射配置 
     * @return OutputMappingConfigs 输出映射配置
     */
    public OutputMappingConfig [] getOutputMappingConfigs() {
        return this.OutputMappingConfigs;
    }

    /**
     * Set 输出映射配置
     * @param OutputMappingConfigs 输出映射配置
     */
    public void setOutputMappingConfigs(OutputMappingConfig [] OutputMappingConfigs) {
        this.OutputMappingConfigs = OutputMappingConfigs;
    }

    /**
     * Get 自定义环境变量 
     * @return EnvVars 自定义环境变量
     */
    public EnvVar [] getEnvVars() {
        return this.EnvVars;
    }

    /**
     * Set 自定义环境变量
     * @param EnvVars 自定义环境变量
     */
    public void setEnvVars(EnvVar [] EnvVars) {
        this.EnvVars = EnvVars;
    }

    /**
     * Get 授权信息 
     * @return Authentications 授权信息
     */
    public Authentication [] getAuthentications() {
        return this.Authentications;
    }

    /**
     * Set 授权信息
     * @param Authentications 授权信息
     */
    public void setAuthentications(Authentication [] Authentications) {
        this.Authentications = Authentications;
    }

    /**
     * Get TaskInstance失败后处理方式，取值包括TERMINATE（默认）、INTERRUPT、FAST_INTERRUPT。 
     * @return FailedAction TaskInstance失败后处理方式，取值包括TERMINATE（默认）、INTERRUPT、FAST_INTERRUPT。
     */
    public String getFailedAction() {
        return this.FailedAction;
    }

    /**
     * Set TaskInstance失败后处理方式，取值包括TERMINATE（默认）、INTERRUPT、FAST_INTERRUPT。
     * @param FailedAction TaskInstance失败后处理方式，取值包括TERMINATE（默认）、INTERRUPT、FAST_INTERRUPT。
     */
    public void setFailedAction(String FailedAction) {
        this.FailedAction = FailedAction;
    }

    /**
     * Get 任务失败后的最大重试次数，默认为0 
     * @return MaxRetryCount 任务失败后的最大重试次数，默认为0
     */
    public Long getMaxRetryCount() {
        return this.MaxRetryCount;
    }

    /**
     * Set 任务失败后的最大重试次数，默认为0
     * @param MaxRetryCount 任务失败后的最大重试次数，默认为0
     */
    public void setMaxRetryCount(Long MaxRetryCount) {
        this.MaxRetryCount = MaxRetryCount;
    }

    /**
     * Get 任务启动后的超时时间，单位秒，默认为86400秒 
     * @return Timeout 任务启动后的超时时间，单位秒，默认为86400秒
     */
    public Long getTimeout() {
        return this.Timeout;
    }

    /**
     * Set 任务启动后的超时时间，单位秒，默认为86400秒
     * @param Timeout 任务启动后的超时时间，单位秒，默认为86400秒
     */
    public void setTimeout(Long Timeout) {
        this.Timeout = Timeout;
    }

    /**
     * Get 任务最大并发数限制，默认没有限制。 
     * @return MaxConcurrentNum 任务最大并发数限制，默认没有限制。
     */
    public Long getMaxConcurrentNum() {
        return this.MaxConcurrentNum;
    }

    /**
     * Set 任务最大并发数限制，默认没有限制。
     * @param MaxConcurrentNum 任务最大并发数限制，默认没有限制。
     */
    public void setMaxConcurrentNum(Long MaxConcurrentNum) {
        this.MaxConcurrentNum = MaxConcurrentNum;
    }

    /**
     * Get 任务完成后，重启计算节点。适用于指定计算环境执行任务。 
     * @return RestartComputeNode 任务完成后，重启计算节点。适用于指定计算环境执行任务。
     */
    public Boolean getRestartComputeNode() {
        return this.RestartComputeNode;
    }

    /**
     * Set 任务完成后，重启计算节点。适用于指定计算环境执行任务。
     * @param RestartComputeNode 任务完成后，重启计算节点。适用于指定计算环境执行任务。
     */
    public void setRestartComputeNode(Boolean RestartComputeNode) {
        this.RestartComputeNode = RestartComputeNode;
    }

    /**
     * Get 启动任务过程中，创建计算资源如CVM失败后的最大重试次数，默认为0。 
     * @return ResourceMaxRetryCount 启动任务过程中，创建计算资源如CVM失败后的最大重试次数，默认为0。
     */
    public Long getResourceMaxRetryCount() {
        return this.ResourceMaxRetryCount;
    }

    /**
     * Set 启动任务过程中，创建计算资源如CVM失败后的最大重试次数，默认为0。
     * @param ResourceMaxRetryCount 启动任务过程中，创建计算资源如CVM失败后的最大重试次数，默认为0。
     */
    public void setResourceMaxRetryCount(Long ResourceMaxRetryCount) {
        this.ResourceMaxRetryCount = ResourceMaxRetryCount;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Application.", this.Application);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskInstanceNum", this.TaskInstanceNum);
        this.setParamObj(map, prefix + "ComputeEnv.", this.ComputeEnv);
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamObj(map, prefix + "RedirectInfo.", this.RedirectInfo);
        this.setParamObj(map, prefix + "RedirectLocalInfo.", this.RedirectLocalInfo);
        this.setParamArrayObj(map, prefix + "InputMappings.", this.InputMappings);
        this.setParamArrayObj(map, prefix + "OutputMappings.", this.OutputMappings);
        this.setParamArrayObj(map, prefix + "OutputMappingConfigs.", this.OutputMappingConfigs);
        this.setParamArrayObj(map, prefix + "EnvVars.", this.EnvVars);
        this.setParamArrayObj(map, prefix + "Authentications.", this.Authentications);
        this.setParamSimple(map, prefix + "FailedAction", this.FailedAction);
        this.setParamSimple(map, prefix + "MaxRetryCount", this.MaxRetryCount);
        this.setParamSimple(map, prefix + "Timeout", this.Timeout);
        this.setParamSimple(map, prefix + "MaxConcurrentNum", this.MaxConcurrentNum);
        this.setParamSimple(map, prefix + "RestartComputeNode", this.RestartComputeNode);
        this.setParamSimple(map, prefix + "ResourceMaxRetryCount", this.ResourceMaxRetryCount);

    }
}

