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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowTaskNodeBrief extends AbstractModel {

    /**
    * <p>工作流ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * <p>任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * <p>任务类型名称，请参考数据结构TaskType中TaskTypeName字段描述</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypeName")
    @Expose
    private String TaskTypeName;

    /**
    * <p>任务依赖列表</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependOnList")
    @Expose
    private DependOnBrief [] DependOnList;

    /**
    * <p>任务资源组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * <p>任务资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * <p>任务X坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LeftCoordinate")
    @Expose
    private Float LeftCoordinate;

    /**
    * <p>任务Y坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopCoordinate")
    @Expose
    private Float TopCoordinate;

    /**
    * <p>任务重试策略</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskRetryStrategy")
    @Expose
    private TaskRetryStrategy TaskRetryStrategy;

    /**
    * <p>任依赖运行条件</p><ul><li>ALL_SUCCESS: 全部成功：所有上游依赖任务均已执行并成功</li><li>ONE_SUCCESS: 至少一个成功：至少有一个上游依赖任务成功</li><li>NONE_FAILED: 目前没有失败：没有依赖任务失败，并且至少有一个依赖任务在运行中</li><li>ALL_DONE: 全部完成：所有上游依赖任务均已执行并完成（无论成功或失败</li><li>ONE_FAILED: 至少一个失败：至少有一个上游依赖任务失败</li><li>ALL_FAILED: 全部失败：所有上游依赖任务都失败</li><li>ALL_DONE_AT_LEAST_ONE_SUCCESS：上游全部完成至少一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个成功，则依赖判断成功，否则就是跳过运行</li><li>ALL_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ONE_DONE：至少一个完成：上游只要有一个完成了，就进行依赖判断，且依赖判断成功，否则还是等待上游</li><li>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS：上游全部完成，没有失败，至少有一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，上游没有一个失败且至少有一个成功的情况下，依赖判断成功，否则就是跳过运行</li><li>NONE_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ALL_DONE_AT_LEAST_ONE_FAILED：上游全部完成至少一个失败: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个失败，则依赖判断成功，否则就是跳过运行</li><li>ADVANCED:运行条件为高级模式时配置</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependOnRunCondition")
    @Expose
    private String DependOnRunCondition;

    /**
    * <p>高级依赖配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvancedDependencyConfig")
    @Expose
    private AdvancedDependencyConfig AdvancedDependencyConfig;

    /**
    * <p>内嵌工作流任务节点</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InnerTask")
    @Expose
    private WorkflowTaskNodeBrief InnerTask;

    /**
     * Get <p>工作流ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId <p>工作流ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set <p>工作流ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId <p>工作流ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get <p>任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId <p>任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId <p>任务ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName <p>任务名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get <p>任务类型名称，请参考数据结构TaskType中TaskTypeName字段描述</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypeName <p>任务类型名称，请参考数据结构TaskType中TaskTypeName字段描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskTypeName() {
        return this.TaskTypeName;
    }

    /**
     * Set <p>任务类型名称，请参考数据结构TaskType中TaskTypeName字段描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypeName <p>任务类型名称，请参考数据结构TaskType中TaskTypeName字段描述</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypeName(String TaskTypeName) {
        this.TaskTypeName = TaskTypeName;
    }

    /**
     * Get <p>任务依赖列表</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependOnList <p>任务依赖列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DependOnBrief [] getDependOnList() {
        return this.DependOnList;
    }

    /**
     * Set <p>任务依赖列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependOnList <p>任务依赖列表</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependOnList(DependOnBrief [] DependOnList) {
        this.DependOnList = DependOnList;
    }

    /**
     * Get <p>任务资源组ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupId <p>任务资源组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set <p>任务资源组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupId <p>任务资源组ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get <p>任务资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupName <p>任务资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set <p>任务资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupName <p>任务资源组名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get <p>任务X坐标</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LeftCoordinate <p>任务X坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLeftCoordinate() {
        return this.LeftCoordinate;
    }

    /**
     * Set <p>任务X坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LeftCoordinate <p>任务X坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLeftCoordinate(Float LeftCoordinate) {
        this.LeftCoordinate = LeftCoordinate;
    }

    /**
     * Get <p>任务Y坐标</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopCoordinate <p>任务Y坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTopCoordinate() {
        return this.TopCoordinate;
    }

    /**
     * Set <p>任务Y坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopCoordinate <p>任务Y坐标</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopCoordinate(Float TopCoordinate) {
        this.TopCoordinate = TopCoordinate;
    }

    /**
     * Get <p>任务重试策略</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskRetryStrategy <p>任务重试策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskRetryStrategy getTaskRetryStrategy() {
        return this.TaskRetryStrategy;
    }

    /**
     * Set <p>任务重试策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskRetryStrategy <p>任务重试策略</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskRetryStrategy(TaskRetryStrategy TaskRetryStrategy) {
        this.TaskRetryStrategy = TaskRetryStrategy;
    }

    /**
     * Get <p>任依赖运行条件</p><ul><li>ALL_SUCCESS: 全部成功：所有上游依赖任务均已执行并成功</li><li>ONE_SUCCESS: 至少一个成功：至少有一个上游依赖任务成功</li><li>NONE_FAILED: 目前没有失败：没有依赖任务失败，并且至少有一个依赖任务在运行中</li><li>ALL_DONE: 全部完成：所有上游依赖任务均已执行并完成（无论成功或失败</li><li>ONE_FAILED: 至少一个失败：至少有一个上游依赖任务失败</li><li>ALL_FAILED: 全部失败：所有上游依赖任务都失败</li><li>ALL_DONE_AT_LEAST_ONE_SUCCESS：上游全部完成至少一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个成功，则依赖判断成功，否则就是跳过运行</li><li>ALL_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ONE_DONE：至少一个完成：上游只要有一个完成了，就进行依赖判断，且依赖判断成功，否则还是等待上游</li><li>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS：上游全部完成，没有失败，至少有一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，上游没有一个失败且至少有一个成功的情况下，依赖判断成功，否则就是跳过运行</li><li>NONE_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ALL_DONE_AT_LEAST_ONE_FAILED：上游全部完成至少一个失败: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个失败，则依赖判断成功，否则就是跳过运行</li><li>ADVANCED:运行条件为高级模式时配置</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependOnRunCondition <p>任依赖运行条件</p><ul><li>ALL_SUCCESS: 全部成功：所有上游依赖任务均已执行并成功</li><li>ONE_SUCCESS: 至少一个成功：至少有一个上游依赖任务成功</li><li>NONE_FAILED: 目前没有失败：没有依赖任务失败，并且至少有一个依赖任务在运行中</li><li>ALL_DONE: 全部完成：所有上游依赖任务均已执行并完成（无论成功或失败</li><li>ONE_FAILED: 至少一个失败：至少有一个上游依赖任务失败</li><li>ALL_FAILED: 全部失败：所有上游依赖任务都失败</li><li>ALL_DONE_AT_LEAST_ONE_SUCCESS：上游全部完成至少一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个成功，则依赖判断成功，否则就是跳过运行</li><li>ALL_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ONE_DONE：至少一个完成：上游只要有一个完成了，就进行依赖判断，且依赖判断成功，否则还是等待上游</li><li>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS：上游全部完成，没有失败，至少有一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，上游没有一个失败且至少有一个成功的情况下，依赖判断成功，否则就是跳过运行</li><li>NONE_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ALL_DONE_AT_LEAST_ONE_FAILED：上游全部完成至少一个失败: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个失败，则依赖判断成功，否则就是跳过运行</li><li>ADVANCED:运行条件为高级模式时配置</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependOnRunCondition() {
        return this.DependOnRunCondition;
    }

    /**
     * Set <p>任依赖运行条件</p><ul><li>ALL_SUCCESS: 全部成功：所有上游依赖任务均已执行并成功</li><li>ONE_SUCCESS: 至少一个成功：至少有一个上游依赖任务成功</li><li>NONE_FAILED: 目前没有失败：没有依赖任务失败，并且至少有一个依赖任务在运行中</li><li>ALL_DONE: 全部完成：所有上游依赖任务均已执行并完成（无论成功或失败</li><li>ONE_FAILED: 至少一个失败：至少有一个上游依赖任务失败</li><li>ALL_FAILED: 全部失败：所有上游依赖任务都失败</li><li>ALL_DONE_AT_LEAST_ONE_SUCCESS：上游全部完成至少一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个成功，则依赖判断成功，否则就是跳过运行</li><li>ALL_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ONE_DONE：至少一个完成：上游只要有一个完成了，就进行依赖判断，且依赖判断成功，否则还是等待上游</li><li>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS：上游全部完成，没有失败，至少有一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，上游没有一个失败且至少有一个成功的情况下，依赖判断成功，否则就是跳过运行</li><li>NONE_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ALL_DONE_AT_LEAST_ONE_FAILED：上游全部完成至少一个失败: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个失败，则依赖判断成功，否则就是跳过运行</li><li>ADVANCED:运行条件为高级模式时配置</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependOnRunCondition <p>任依赖运行条件</p><ul><li>ALL_SUCCESS: 全部成功：所有上游依赖任务均已执行并成功</li><li>ONE_SUCCESS: 至少一个成功：至少有一个上游依赖任务成功</li><li>NONE_FAILED: 目前没有失败：没有依赖任务失败，并且至少有一个依赖任务在运行中</li><li>ALL_DONE: 全部完成：所有上游依赖任务均已执行并完成（无论成功或失败</li><li>ONE_FAILED: 至少一个失败：至少有一个上游依赖任务失败</li><li>ALL_FAILED: 全部失败：所有上游依赖任务都失败</li><li>ALL_DONE_AT_LEAST_ONE_SUCCESS：上游全部完成至少一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个成功，则依赖判断成功，否则就是跳过运行</li><li>ALL_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ONE_DONE：至少一个完成：上游只要有一个完成了，就进行依赖判断，且依赖判断成功，否则还是等待上游</li><li>ALL_DONE_NONE_FAILED_AT_LEAST_ONE_SUCCESS：上游全部完成，没有失败，至少有一个成功: 所有上游依赖任务都达到终态时，进行依赖判断，上游没有一个失败且至少有一个成功的情况下，依赖判断成功，否则就是跳过运行</li><li>NONE_SKIPPED：上游全部完成，没有跳过运行: 所有上游依赖任务都达到终态时，进行依赖判断, 如果上游状态全部都是成功、失败、上游失败状态，则依赖判断成功，否则为跳过运行</li><li>ALL_DONE_AT_LEAST_ONE_FAILED：上游全部完成至少一个失败: 所有上游依赖任务都达到终态时，进行依赖判断，至少有一个失败，则依赖判断成功，否则就是跳过运行</li><li>ADVANCED:运行条件为高级模式时配置</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependOnRunCondition(String DependOnRunCondition) {
        this.DependOnRunCondition = DependOnRunCondition;
    }

    /**
     * Get <p>高级依赖配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvancedDependencyConfig <p>高级依赖配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdvancedDependencyConfig getAdvancedDependencyConfig() {
        return this.AdvancedDependencyConfig;
    }

    /**
     * Set <p>高级依赖配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvancedDependencyConfig <p>高级依赖配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvancedDependencyConfig(AdvancedDependencyConfig AdvancedDependencyConfig) {
        this.AdvancedDependencyConfig = AdvancedDependencyConfig;
    }

    /**
     * Get <p>内嵌工作流任务节点</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InnerTask <p>内嵌工作流任务节点</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkflowTaskNodeBrief getInnerTask() {
        return this.InnerTask;
    }

    /**
     * Set <p>内嵌工作流任务节点</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InnerTask <p>内嵌工作流任务节点</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInnerTask(WorkflowTaskNodeBrief InnerTask) {
        this.InnerTask = InnerTask;
    }

    public WorkflowTaskNodeBrief() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowTaskNodeBrief(WorkflowTaskNodeBrief source) {
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskTypeName != null) {
            this.TaskTypeName = new String(source.TaskTypeName);
        }
        if (source.DependOnList != null) {
            this.DependOnList = new DependOnBrief[source.DependOnList.length];
            for (int i = 0; i < source.DependOnList.length; i++) {
                this.DependOnList[i] = new DependOnBrief(source.DependOnList[i]);
            }
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
        if (source.LeftCoordinate != null) {
            this.LeftCoordinate = new Float(source.LeftCoordinate);
        }
        if (source.TopCoordinate != null) {
            this.TopCoordinate = new Float(source.TopCoordinate);
        }
        if (source.TaskRetryStrategy != null) {
            this.TaskRetryStrategy = new TaskRetryStrategy(source.TaskRetryStrategy);
        }
        if (source.DependOnRunCondition != null) {
            this.DependOnRunCondition = new String(source.DependOnRunCondition);
        }
        if (source.AdvancedDependencyConfig != null) {
            this.AdvancedDependencyConfig = new AdvancedDependencyConfig(source.AdvancedDependencyConfig);
        }
        if (source.InnerTask != null) {
            this.InnerTask = new WorkflowTaskNodeBrief(source.InnerTask);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskTypeName", this.TaskTypeName);
        this.setParamArrayObj(map, prefix + "DependOnList.", this.DependOnList);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);
        this.setParamSimple(map, prefix + "LeftCoordinate", this.LeftCoordinate);
        this.setParamSimple(map, prefix + "TopCoordinate", this.TopCoordinate);
        this.setParamObj(map, prefix + "TaskRetryStrategy.", this.TaskRetryStrategy);
        this.setParamSimple(map, prefix + "DependOnRunCondition", this.DependOnRunCondition);
        this.setParamObj(map, prefix + "AdvancedDependencyConfig.", this.AdvancedDependencyConfig);
        this.setParamObj(map, prefix + "InnerTask.", this.InnerTask);

    }
}

