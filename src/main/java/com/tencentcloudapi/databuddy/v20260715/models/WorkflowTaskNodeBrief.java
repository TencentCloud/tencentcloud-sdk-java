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
    * 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务类型名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTypeName")
    @Expose
    private String TaskTypeName;

    /**
    * 任务依赖列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependOnList")
    @Expose
    private DependOnBrief [] DependOnList;

    /**
    * 任务资源组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * 任务资源组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * 任务X坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LeftCoordinate")
    @Expose
    private Float LeftCoordinate;

    /**
    * 任务Y坐标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TopCoordinate")
    @Expose
    private Float TopCoordinate;

    /**
    * 任务重试策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskRetryStrategy")
    @Expose
    private TaskRetryStrategy TaskRetryStrategy;

    /**
    * 依赖运行条件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependOnRunCondition")
    @Expose
    private String DependOnRunCondition;

    /**
    * 高级依赖配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdvancedDependencyConfig")
    @Expose
    private AdvancedDependencyConfig AdvancedDependencyConfig;

    /**
    * 内嵌工作流任务节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InnerTask")
    @Expose
    private WorkflowTaskNodeBrief InnerTask;

    /**
     * Get 工作流ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId 工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 任务类型名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTypeName 任务类型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskTypeName() {
        return this.TaskTypeName;
    }

    /**
     * Set 任务类型名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTypeName 任务类型名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTypeName(String TaskTypeName) {
        this.TaskTypeName = TaskTypeName;
    }

    /**
     * Get 任务依赖列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependOnList 任务依赖列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DependOnBrief [] getDependOnList() {
        return this.DependOnList;
    }

    /**
     * Set 任务依赖列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependOnList 任务依赖列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependOnList(DependOnBrief [] DependOnList) {
        this.DependOnList = DependOnList;
    }

    /**
     * Get 任务资源组ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupId 任务资源组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set 任务资源组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupId 任务资源组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get 任务资源组名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceGroupName 任务资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set 任务资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceGroupName 任务资源组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get 任务X坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LeftCoordinate 任务X坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getLeftCoordinate() {
        return this.LeftCoordinate;
    }

    /**
     * Set 任务X坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param LeftCoordinate 任务X坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLeftCoordinate(Float LeftCoordinate) {
        this.LeftCoordinate = LeftCoordinate;
    }

    /**
     * Get 任务Y坐标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TopCoordinate 任务Y坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getTopCoordinate() {
        return this.TopCoordinate;
    }

    /**
     * Set 任务Y坐标
注意：此字段可能返回 null，表示取不到有效值。
     * @param TopCoordinate 任务Y坐标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTopCoordinate(Float TopCoordinate) {
        this.TopCoordinate = TopCoordinate;
    }

    /**
     * Get 任务重试策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskRetryStrategy 任务重试策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskRetryStrategy getTaskRetryStrategy() {
        return this.TaskRetryStrategy;
    }

    /**
     * Set 任务重试策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskRetryStrategy 任务重试策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskRetryStrategy(TaskRetryStrategy TaskRetryStrategy) {
        this.TaskRetryStrategy = TaskRetryStrategy;
    }

    /**
     * Get 依赖运行条件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependOnRunCondition 依赖运行条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependOnRunCondition() {
        return this.DependOnRunCondition;
    }

    /**
     * Set 依赖运行条件
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependOnRunCondition 依赖运行条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependOnRunCondition(String DependOnRunCondition) {
        this.DependOnRunCondition = DependOnRunCondition;
    }

    /**
     * Get 高级依赖配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AdvancedDependencyConfig 高级依赖配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdvancedDependencyConfig getAdvancedDependencyConfig() {
        return this.AdvancedDependencyConfig;
    }

    /**
     * Set 高级依赖配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdvancedDependencyConfig 高级依赖配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdvancedDependencyConfig(AdvancedDependencyConfig AdvancedDependencyConfig) {
        this.AdvancedDependencyConfig = AdvancedDependencyConfig;
    }

    /**
     * Get 内嵌工作流任务节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InnerTask 内嵌工作流任务节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public WorkflowTaskNodeBrief getInnerTask() {
        return this.InnerTask;
    }

    /**
     * Set 内嵌工作流任务节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param InnerTask 内嵌工作流任务节点
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

