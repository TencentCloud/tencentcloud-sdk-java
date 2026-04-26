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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTriggerTaskSchedulerConfiguration extends AbstractModel {

    /**
    * <p>上游依赖的任务数组</p>
    */
    @SerializedName("UpstreamDependencyConfigList")
    @Expose
    private DependencyTriggerTaskBrief [] UpstreamDependencyConfigList;

    /**
    * <p>任务调度优先级 运行优先级 4高 5中 6低 , 默认:6</p>
    */
    @SerializedName("RunPriorityType")
    @Expose
    private Long RunPriorityType;

    /**
    * <p>重试策略 重试等待时间,单位分钟: 默认: 5</p>
    */
    @SerializedName("RetryWaitMinute")
    @Expose
    private Long RetryWaitMinute;

    /**
    * <p>重试策略 最大尝试次数, 默认: 4</p>
    */
    @SerializedName("MaxRetryNumber")
    @Expose
    private Long MaxRetryNumber;

    /**
    * <p>超时处理策略 运行耗时超时（单位：分钟）默认为 -1</p>
    */
    @SerializedName("ExecutionTTLMinute")
    @Expose
    private Long ExecutionTTLMinute;

    /**
    * <p>超时处理策略 等待总时长耗时超时（单位：分钟）默认为 -1</p>
    */
    @SerializedName("WaitExecutionTotalTTLMinute")
    @Expose
    private Long WaitExecutionTotalTTLMinute;

    /**
    * <p>重跑&amp;补录配置, 默认为 ALL; , ALL 运行成功或失败后皆可重跑或补录, FAILURE 运行成功后不可重跑或补录，运行失败后可重跑或补录, NONE 运行成功或失败后皆不可重跑或补录;</p>
    */
    @SerializedName("AllowRedoType")
    @Expose
    private String AllowRedoType;

    /**
    * <p>输出参数数组</p>
    */
    @SerializedName("ParamTaskOutList")
    @Expose
    private OutTaskParameter [] ParamTaskOutList;

    /**
    * <p>输入参数数组</p>
    */
    @SerializedName("ParamTaskInList")
    @Expose
    private InTaskParameter [] ParamTaskInList;

    /**
    * <p>产出登记</p>
    */
    @SerializedName("TaskOutputRegistryList")
    @Expose
    private TaskDataRegistry [] TaskOutputRegistryList;

    /**
    * <ul><li>任务依赖运行条件，默认为ALL_SUCCESS，暂时只支持工作流调度项目下配置</li><li>ALL_SUCCESS： 全部成功：所有上游依赖任务都达到终态时，进行依赖判断，如果上游全部都成功，则依赖判断成功，否则如果上游有一个跳过运行，则标记为跳过运行，其余情况标记为上游失败</li><li>ALL_FAILED：全部失败：所有上游依赖任务都达到终态时，进行依赖判断，如果上游状态都是失败或者上游失败，则依赖判断成功，否则就标记为跳过运行</li><li>ALL_DONE：全部完成：所有上游依赖任务都达到终态时，进行依赖判断，直接是依赖判断成功</li><li>ALL_DONE_AT_LEAST_ONE_SUCCESS：上游全部完成至少一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个成功，则依赖判断成功，否则就是跳过运行</li><li>ALL_SKIPPED：上游全部都跳过: 所有上游依赖任务都达到终态时，进行依赖判断，所有的上游都是跳过状态才算依赖判断成功，否则当前节点就是跳过运行</li><li>ONE_FAILED：至少一个失败: 上游只要有一个失败了，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有失败，则跳过运行</li><li>ONE_SUCCESS：至少一个成功：上游只要有一个成功，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有成功，则跳过运行</li><li>ONE_DONE：至少一个完成：上游只要有一个完成了，就进行依赖判断，且依赖判断成功，否则还是等待上游</li><li>NONE_FAILED：上游全部完成，没有失败: 所有上游依赖任务都达到终态时，进行依赖判断，如果上游都是成功或者跳过运行，则依赖判断成功，否则标记为上游失败</li><li>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS：上游全部完成，没有失败，至少有一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，上游没有一个失败且至少有一个成功的情况下，依赖判断成功，否则就是跳过运行</li><li>NONE_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ALL_DONE_AT_LEAST_ONE_FAILED：上游全部完成至少一个失败: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个失败，则依赖判断成功，否则就是跳过运行</li></ul>
    */
    @SerializedName("DependencyTriggerPolicy")
    @Expose
    private String DependencyTriggerPolicy;

    /**
    * <p>是否允许下游依赖 1允许 0不允许</p><p>取值范围：[0, 1]</p><p>默认值：1</p>
    */
    @SerializedName("AllowDownstreamDependency")
    @Expose
    private Long AllowDownstreamDependency;

    /**
    * <p>调度类型: 0 正常调度 1 空跑调度</p><p>枚举值：</p><ul><li>0： 正常调度</li><li>1： 空跑调度</li></ul><p>默认值：0</p>
    */
    @SerializedName("ScheduleType")
    @Expose
    private Long ScheduleType;

    /**
     * Get <p>上游依赖的任务数组</p> 
     * @return UpstreamDependencyConfigList <p>上游依赖的任务数组</p>
     */
    public DependencyTriggerTaskBrief [] getUpstreamDependencyConfigList() {
        return this.UpstreamDependencyConfigList;
    }

    /**
     * Set <p>上游依赖的任务数组</p>
     * @param UpstreamDependencyConfigList <p>上游依赖的任务数组</p>
     */
    public void setUpstreamDependencyConfigList(DependencyTriggerTaskBrief [] UpstreamDependencyConfigList) {
        this.UpstreamDependencyConfigList = UpstreamDependencyConfigList;
    }

    /**
     * Get <p>任务调度优先级 运行优先级 4高 5中 6低 , 默认:6</p> 
     * @return RunPriorityType <p>任务调度优先级 运行优先级 4高 5中 6低 , 默认:6</p>
     */
    public Long getRunPriorityType() {
        return this.RunPriorityType;
    }

    /**
     * Set <p>任务调度优先级 运行优先级 4高 5中 6低 , 默认:6</p>
     * @param RunPriorityType <p>任务调度优先级 运行优先级 4高 5中 6低 , 默认:6</p>
     */
    public void setRunPriorityType(Long RunPriorityType) {
        this.RunPriorityType = RunPriorityType;
    }

    /**
     * Get <p>重试策略 重试等待时间,单位分钟: 默认: 5</p> 
     * @return RetryWaitMinute <p>重试策略 重试等待时间,单位分钟: 默认: 5</p>
     */
    public Long getRetryWaitMinute() {
        return this.RetryWaitMinute;
    }

    /**
     * Set <p>重试策略 重试等待时间,单位分钟: 默认: 5</p>
     * @param RetryWaitMinute <p>重试策略 重试等待时间,单位分钟: 默认: 5</p>
     */
    public void setRetryWaitMinute(Long RetryWaitMinute) {
        this.RetryWaitMinute = RetryWaitMinute;
    }

    /**
     * Get <p>重试策略 最大尝试次数, 默认: 4</p> 
     * @return MaxRetryNumber <p>重试策略 最大尝试次数, 默认: 4</p>
     */
    public Long getMaxRetryNumber() {
        return this.MaxRetryNumber;
    }

    /**
     * Set <p>重试策略 最大尝试次数, 默认: 4</p>
     * @param MaxRetryNumber <p>重试策略 最大尝试次数, 默认: 4</p>
     */
    public void setMaxRetryNumber(Long MaxRetryNumber) {
        this.MaxRetryNumber = MaxRetryNumber;
    }

    /**
     * Get <p>超时处理策略 运行耗时超时（单位：分钟）默认为 -1</p> 
     * @return ExecutionTTLMinute <p>超时处理策略 运行耗时超时（单位：分钟）默认为 -1</p>
     */
    public Long getExecutionTTLMinute() {
        return this.ExecutionTTLMinute;
    }

    /**
     * Set <p>超时处理策略 运行耗时超时（单位：分钟）默认为 -1</p>
     * @param ExecutionTTLMinute <p>超时处理策略 运行耗时超时（单位：分钟）默认为 -1</p>
     */
    public void setExecutionTTLMinute(Long ExecutionTTLMinute) {
        this.ExecutionTTLMinute = ExecutionTTLMinute;
    }

    /**
     * Get <p>超时处理策略 等待总时长耗时超时（单位：分钟）默认为 -1</p> 
     * @return WaitExecutionTotalTTLMinute <p>超时处理策略 等待总时长耗时超时（单位：分钟）默认为 -1</p>
     */
    public Long getWaitExecutionTotalTTLMinute() {
        return this.WaitExecutionTotalTTLMinute;
    }

    /**
     * Set <p>超时处理策略 等待总时长耗时超时（单位：分钟）默认为 -1</p>
     * @param WaitExecutionTotalTTLMinute <p>超时处理策略 等待总时长耗时超时（单位：分钟）默认为 -1</p>
     */
    public void setWaitExecutionTotalTTLMinute(Long WaitExecutionTotalTTLMinute) {
        this.WaitExecutionTotalTTLMinute = WaitExecutionTotalTTLMinute;
    }

    /**
     * Get <p>重跑&amp;补录配置, 默认为 ALL; , ALL 运行成功或失败后皆可重跑或补录, FAILURE 运行成功后不可重跑或补录，运行失败后可重跑或补录, NONE 运行成功或失败后皆不可重跑或补录;</p> 
     * @return AllowRedoType <p>重跑&amp;补录配置, 默认为 ALL; , ALL 运行成功或失败后皆可重跑或补录, FAILURE 运行成功后不可重跑或补录，运行失败后可重跑或补录, NONE 运行成功或失败后皆不可重跑或补录;</p>
     */
    public String getAllowRedoType() {
        return this.AllowRedoType;
    }

    /**
     * Set <p>重跑&amp;补录配置, 默认为 ALL; , ALL 运行成功或失败后皆可重跑或补录, FAILURE 运行成功后不可重跑或补录，运行失败后可重跑或补录, NONE 运行成功或失败后皆不可重跑或补录;</p>
     * @param AllowRedoType <p>重跑&amp;补录配置, 默认为 ALL; , ALL 运行成功或失败后皆可重跑或补录, FAILURE 运行成功后不可重跑或补录，运行失败后可重跑或补录, NONE 运行成功或失败后皆不可重跑或补录;</p>
     */
    public void setAllowRedoType(String AllowRedoType) {
        this.AllowRedoType = AllowRedoType;
    }

    /**
     * Get <p>输出参数数组</p> 
     * @return ParamTaskOutList <p>输出参数数组</p>
     */
    public OutTaskParameter [] getParamTaskOutList() {
        return this.ParamTaskOutList;
    }

    /**
     * Set <p>输出参数数组</p>
     * @param ParamTaskOutList <p>输出参数数组</p>
     */
    public void setParamTaskOutList(OutTaskParameter [] ParamTaskOutList) {
        this.ParamTaskOutList = ParamTaskOutList;
    }

    /**
     * Get <p>输入参数数组</p> 
     * @return ParamTaskInList <p>输入参数数组</p>
     */
    public InTaskParameter [] getParamTaskInList() {
        return this.ParamTaskInList;
    }

    /**
     * Set <p>输入参数数组</p>
     * @param ParamTaskInList <p>输入参数数组</p>
     */
    public void setParamTaskInList(InTaskParameter [] ParamTaskInList) {
        this.ParamTaskInList = ParamTaskInList;
    }

    /**
     * Get <p>产出登记</p> 
     * @return TaskOutputRegistryList <p>产出登记</p>
     */
    public TaskDataRegistry [] getTaskOutputRegistryList() {
        return this.TaskOutputRegistryList;
    }

    /**
     * Set <p>产出登记</p>
     * @param TaskOutputRegistryList <p>产出登记</p>
     */
    public void setTaskOutputRegistryList(TaskDataRegistry [] TaskOutputRegistryList) {
        this.TaskOutputRegistryList = TaskOutputRegistryList;
    }

    /**
     * Get <ul><li>任务依赖运行条件，默认为ALL_SUCCESS，暂时只支持工作流调度项目下配置</li><li>ALL_SUCCESS： 全部成功：所有上游依赖任务都达到终态时，进行依赖判断，如果上游全部都成功，则依赖判断成功，否则如果上游有一个跳过运行，则标记为跳过运行，其余情况标记为上游失败</li><li>ALL_FAILED：全部失败：所有上游依赖任务都达到终态时，进行依赖判断，如果上游状态都是失败或者上游失败，则依赖判断成功，否则就标记为跳过运行</li><li>ALL_DONE：全部完成：所有上游依赖任务都达到终态时，进行依赖判断，直接是依赖判断成功</li><li>ALL_DONE_AT_LEAST_ONE_SUCCESS：上游全部完成至少一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个成功，则依赖判断成功，否则就是跳过运行</li><li>ALL_SKIPPED：上游全部都跳过: 所有上游依赖任务都达到终态时，进行依赖判断，所有的上游都是跳过状态才算依赖判断成功，否则当前节点就是跳过运行</li><li>ONE_FAILED：至少一个失败: 上游只要有一个失败了，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有失败，则跳过运行</li><li>ONE_SUCCESS：至少一个成功：上游只要有一个成功，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有成功，则跳过运行</li><li>ONE_DONE：至少一个完成：上游只要有一个完成了，就进行依赖判断，且依赖判断成功，否则还是等待上游</li><li>NONE_FAILED：上游全部完成，没有失败: 所有上游依赖任务都达到终态时，进行依赖判断，如果上游都是成功或者跳过运行，则依赖判断成功，否则标记为上游失败</li><li>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS：上游全部完成，没有失败，至少有一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，上游没有一个失败且至少有一个成功的情况下，依赖判断成功，否则就是跳过运行</li><li>NONE_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ALL_DONE_AT_LEAST_ONE_FAILED：上游全部完成至少一个失败: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个失败，则依赖判断成功，否则就是跳过运行</li></ul> 
     * @return DependencyTriggerPolicy <ul><li>任务依赖运行条件，默认为ALL_SUCCESS，暂时只支持工作流调度项目下配置</li><li>ALL_SUCCESS： 全部成功：所有上游依赖任务都达到终态时，进行依赖判断，如果上游全部都成功，则依赖判断成功，否则如果上游有一个跳过运行，则标记为跳过运行，其余情况标记为上游失败</li><li>ALL_FAILED：全部失败：所有上游依赖任务都达到终态时，进行依赖判断，如果上游状态都是失败或者上游失败，则依赖判断成功，否则就标记为跳过运行</li><li>ALL_DONE：全部完成：所有上游依赖任务都达到终态时，进行依赖判断，直接是依赖判断成功</li><li>ALL_DONE_AT_LEAST_ONE_SUCCESS：上游全部完成至少一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个成功，则依赖判断成功，否则就是跳过运行</li><li>ALL_SKIPPED：上游全部都跳过: 所有上游依赖任务都达到终态时，进行依赖判断，所有的上游都是跳过状态才算依赖判断成功，否则当前节点就是跳过运行</li><li>ONE_FAILED：至少一个失败: 上游只要有一个失败了，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有失败，则跳过运行</li><li>ONE_SUCCESS：至少一个成功：上游只要有一个成功，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有成功，则跳过运行</li><li>ONE_DONE：至少一个完成：上游只要有一个完成了，就进行依赖判断，且依赖判断成功，否则还是等待上游</li><li>NONE_FAILED：上游全部完成，没有失败: 所有上游依赖任务都达到终态时，进行依赖判断，如果上游都是成功或者跳过运行，则依赖判断成功，否则标记为上游失败</li><li>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS：上游全部完成，没有失败，至少有一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，上游没有一个失败且至少有一个成功的情况下，依赖判断成功，否则就是跳过运行</li><li>NONE_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ALL_DONE_AT_LEAST_ONE_FAILED：上游全部完成至少一个失败: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个失败，则依赖判断成功，否则就是跳过运行</li></ul>
     */
    public String getDependencyTriggerPolicy() {
        return this.DependencyTriggerPolicy;
    }

    /**
     * Set <ul><li>任务依赖运行条件，默认为ALL_SUCCESS，暂时只支持工作流调度项目下配置</li><li>ALL_SUCCESS： 全部成功：所有上游依赖任务都达到终态时，进行依赖判断，如果上游全部都成功，则依赖判断成功，否则如果上游有一个跳过运行，则标记为跳过运行，其余情况标记为上游失败</li><li>ALL_FAILED：全部失败：所有上游依赖任务都达到终态时，进行依赖判断，如果上游状态都是失败或者上游失败，则依赖判断成功，否则就标记为跳过运行</li><li>ALL_DONE：全部完成：所有上游依赖任务都达到终态时，进行依赖判断，直接是依赖判断成功</li><li>ALL_DONE_AT_LEAST_ONE_SUCCESS：上游全部完成至少一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个成功，则依赖判断成功，否则就是跳过运行</li><li>ALL_SKIPPED：上游全部都跳过: 所有上游依赖任务都达到终态时，进行依赖判断，所有的上游都是跳过状态才算依赖判断成功，否则当前节点就是跳过运行</li><li>ONE_FAILED：至少一个失败: 上游只要有一个失败了，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有失败，则跳过运行</li><li>ONE_SUCCESS：至少一个成功：上游只要有一个成功，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有成功，则跳过运行</li><li>ONE_DONE：至少一个完成：上游只要有一个完成了，就进行依赖判断，且依赖判断成功，否则还是等待上游</li><li>NONE_FAILED：上游全部完成，没有失败: 所有上游依赖任务都达到终态时，进行依赖判断，如果上游都是成功或者跳过运行，则依赖判断成功，否则标记为上游失败</li><li>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS：上游全部完成，没有失败，至少有一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，上游没有一个失败且至少有一个成功的情况下，依赖判断成功，否则就是跳过运行</li><li>NONE_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ALL_DONE_AT_LEAST_ONE_FAILED：上游全部完成至少一个失败: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个失败，则依赖判断成功，否则就是跳过运行</li></ul>
     * @param DependencyTriggerPolicy <ul><li>任务依赖运行条件，默认为ALL_SUCCESS，暂时只支持工作流调度项目下配置</li><li>ALL_SUCCESS： 全部成功：所有上游依赖任务都达到终态时，进行依赖判断，如果上游全部都成功，则依赖判断成功，否则如果上游有一个跳过运行，则标记为跳过运行，其余情况标记为上游失败</li><li>ALL_FAILED：全部失败：所有上游依赖任务都达到终态时，进行依赖判断，如果上游状态都是失败或者上游失败，则依赖判断成功，否则就标记为跳过运行</li><li>ALL_DONE：全部完成：所有上游依赖任务都达到终态时，进行依赖判断，直接是依赖判断成功</li><li>ALL_DONE_AT_LEAST_ONE_SUCCESS：上游全部完成至少一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个成功，则依赖判断成功，否则就是跳过运行</li><li>ALL_SKIPPED：上游全部都跳过: 所有上游依赖任务都达到终态时，进行依赖判断，所有的上游都是跳过状态才算依赖判断成功，否则当前节点就是跳过运行</li><li>ONE_FAILED：至少一个失败: 上游只要有一个失败了，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有失败，则跳过运行</li><li>ONE_SUCCESS：至少一个成功：上游只要有一个成功，就进行依赖判断，且依赖判断成功，如果上游全部完成但是没有成功，则跳过运行</li><li>ONE_DONE：至少一个完成：上游只要有一个完成了，就进行依赖判断，且依赖判断成功，否则还是等待上游</li><li>NONE_FAILED：上游全部完成，没有失败: 所有上游依赖任务都达到终态时，进行依赖判断，如果上游都是成功或者跳过运行，则依赖判断成功，否则标记为上游失败</li><li>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS：上游全部完成，没有失败，至少有一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，上游没有一个失败且至少有一个成功的情况下，依赖判断成功，否则就是跳过运行</li><li>NONE_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ALL_DONE_AT_LEAST_ONE_FAILED：上游全部完成至少一个失败: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个失败，则依赖判断成功，否则就是跳过运行</li></ul>
     */
    public void setDependencyTriggerPolicy(String DependencyTriggerPolicy) {
        this.DependencyTriggerPolicy = DependencyTriggerPolicy;
    }

    /**
     * Get <p>是否允许下游依赖 1允许 0不允许</p><p>取值范围：[0, 1]</p><p>默认值：1</p> 
     * @return AllowDownstreamDependency <p>是否允许下游依赖 1允许 0不允许</p><p>取值范围：[0, 1]</p><p>默认值：1</p>
     */
    public Long getAllowDownstreamDependency() {
        return this.AllowDownstreamDependency;
    }

    /**
     * Set <p>是否允许下游依赖 1允许 0不允许</p><p>取值范围：[0, 1]</p><p>默认值：1</p>
     * @param AllowDownstreamDependency <p>是否允许下游依赖 1允许 0不允许</p><p>取值范围：[0, 1]</p><p>默认值：1</p>
     */
    public void setAllowDownstreamDependency(Long AllowDownstreamDependency) {
        this.AllowDownstreamDependency = AllowDownstreamDependency;
    }

    /**
     * Get <p>调度类型: 0 正常调度 1 空跑调度</p><p>枚举值：</p><ul><li>0： 正常调度</li><li>1： 空跑调度</li></ul><p>默认值：0</p> 
     * @return ScheduleType <p>调度类型: 0 正常调度 1 空跑调度</p><p>枚举值：</p><ul><li>0： 正常调度</li><li>1： 空跑调度</li></ul><p>默认值：0</p>
     */
    public Long getScheduleType() {
        return this.ScheduleType;
    }

    /**
     * Set <p>调度类型: 0 正常调度 1 空跑调度</p><p>枚举值：</p><ul><li>0： 正常调度</li><li>1： 空跑调度</li></ul><p>默认值：0</p>
     * @param ScheduleType <p>调度类型: 0 正常调度 1 空跑调度</p><p>枚举值：</p><ul><li>0： 正常调度</li><li>1： 空跑调度</li></ul><p>默认值：0</p>
     */
    public void setScheduleType(Long ScheduleType) {
        this.ScheduleType = ScheduleType;
    }

    public CreateTriggerTaskSchedulerConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTriggerTaskSchedulerConfiguration(CreateTriggerTaskSchedulerConfiguration source) {
        if (source.UpstreamDependencyConfigList != null) {
            this.UpstreamDependencyConfigList = new DependencyTriggerTaskBrief[source.UpstreamDependencyConfigList.length];
            for (int i = 0; i < source.UpstreamDependencyConfigList.length; i++) {
                this.UpstreamDependencyConfigList[i] = new DependencyTriggerTaskBrief(source.UpstreamDependencyConfigList[i]);
            }
        }
        if (source.RunPriorityType != null) {
            this.RunPriorityType = new Long(source.RunPriorityType);
        }
        if (source.RetryWaitMinute != null) {
            this.RetryWaitMinute = new Long(source.RetryWaitMinute);
        }
        if (source.MaxRetryNumber != null) {
            this.MaxRetryNumber = new Long(source.MaxRetryNumber);
        }
        if (source.ExecutionTTLMinute != null) {
            this.ExecutionTTLMinute = new Long(source.ExecutionTTLMinute);
        }
        if (source.WaitExecutionTotalTTLMinute != null) {
            this.WaitExecutionTotalTTLMinute = new Long(source.WaitExecutionTotalTTLMinute);
        }
        if (source.AllowRedoType != null) {
            this.AllowRedoType = new String(source.AllowRedoType);
        }
        if (source.ParamTaskOutList != null) {
            this.ParamTaskOutList = new OutTaskParameter[source.ParamTaskOutList.length];
            for (int i = 0; i < source.ParamTaskOutList.length; i++) {
                this.ParamTaskOutList[i] = new OutTaskParameter(source.ParamTaskOutList[i]);
            }
        }
        if (source.ParamTaskInList != null) {
            this.ParamTaskInList = new InTaskParameter[source.ParamTaskInList.length];
            for (int i = 0; i < source.ParamTaskInList.length; i++) {
                this.ParamTaskInList[i] = new InTaskParameter(source.ParamTaskInList[i]);
            }
        }
        if (source.TaskOutputRegistryList != null) {
            this.TaskOutputRegistryList = new TaskDataRegistry[source.TaskOutputRegistryList.length];
            for (int i = 0; i < source.TaskOutputRegistryList.length; i++) {
                this.TaskOutputRegistryList[i] = new TaskDataRegistry(source.TaskOutputRegistryList[i]);
            }
        }
        if (source.DependencyTriggerPolicy != null) {
            this.DependencyTriggerPolicy = new String(source.DependencyTriggerPolicy);
        }
        if (source.AllowDownstreamDependency != null) {
            this.AllowDownstreamDependency = new Long(source.AllowDownstreamDependency);
        }
        if (source.ScheduleType != null) {
            this.ScheduleType = new Long(source.ScheduleType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "UpstreamDependencyConfigList.", this.UpstreamDependencyConfigList);
        this.setParamSimple(map, prefix + "RunPriorityType", this.RunPriorityType);
        this.setParamSimple(map, prefix + "RetryWaitMinute", this.RetryWaitMinute);
        this.setParamSimple(map, prefix + "MaxRetryNumber", this.MaxRetryNumber);
        this.setParamSimple(map, prefix + "ExecutionTTLMinute", this.ExecutionTTLMinute);
        this.setParamSimple(map, prefix + "WaitExecutionTotalTTLMinute", this.WaitExecutionTotalTTLMinute);
        this.setParamSimple(map, prefix + "AllowRedoType", this.AllowRedoType);
        this.setParamArrayObj(map, prefix + "ParamTaskOutList.", this.ParamTaskOutList);
        this.setParamArrayObj(map, prefix + "ParamTaskInList.", this.ParamTaskInList);
        this.setParamArrayObj(map, prefix + "TaskOutputRegistryList.", this.TaskOutputRegistryList);
        this.setParamSimple(map, prefix + "DependencyTriggerPolicy", this.DependencyTriggerPolicy);
        this.setParamSimple(map, prefix + "AllowDownstreamDependency", this.AllowDownstreamDependency);
        this.setParamSimple(map, prefix + "ScheduleType", this.ScheduleType);

    }
}

