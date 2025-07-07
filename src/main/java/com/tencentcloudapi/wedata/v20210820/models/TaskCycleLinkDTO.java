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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskCycleLinkDTO extends AbstractModel {

    /**
    * 依赖关系唯一标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 上游任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskFrom")
    @Expose
    private String TaskFrom;

    /**
    * 上游任务项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskFromProjectId")
    @Expose
    private String TaskFromProjectId;

    /**
    * 上游任务工作流ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskFromWorkflowId")
    @Expose
    private String TaskFromWorkflowId;

    /**
    * 下游任务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTo")
    @Expose
    private String TaskTo;

    /**
    * 下游任务项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskToProjectId")
    @Expose
    private String TaskToProjectId;

    /**
    * 下游任务工作流ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskToWorkflowId")
    @Expose
    private String TaskToWorkflowId;

    /**
    * 下游任务基本信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskToInfo")
    @Expose
    private TaskDsDTO TaskToInfo;

    /**
    * 依赖类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MainCyclicConfig")
    @Expose
    private String MainCyclicConfig;

    /**
    * 依赖偏移类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubordinateCyclicConfig")
    @Expose
    private String SubordinateCyclicConfig;

    /**
    * 依赖策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DependencyStrategy")
    @Expose
    private String DependencyStrategy;

    /**
    * 自定义依赖偏移量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * 更新人用户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateUserId")
    @Expose
    private String UpdateUserId;

    /**
    * 创建人用户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUserId")
    @Expose
    private String CreateUserId;

    /**
    * 租户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 主账号ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerUserId")
    @Expose
    private String OwnerUserId;

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
     * Get 依赖关系唯一标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 依赖关系唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 依赖关系唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 依赖关系唯一标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 上游任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskFrom 上游任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskFrom() {
        return this.TaskFrom;
    }

    /**
     * Set 上游任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskFrom 上游任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskFrom(String TaskFrom) {
        this.TaskFrom = TaskFrom;
    }

    /**
     * Get 上游任务项目ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskFromProjectId 上游任务项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskFromProjectId() {
        return this.TaskFromProjectId;
    }

    /**
     * Set 上游任务项目ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskFromProjectId 上游任务项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskFromProjectId(String TaskFromProjectId) {
        this.TaskFromProjectId = TaskFromProjectId;
    }

    /**
     * Get 上游任务工作流ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskFromWorkflowId 上游任务工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskFromWorkflowId() {
        return this.TaskFromWorkflowId;
    }

    /**
     * Set 上游任务工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskFromWorkflowId 上游任务工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskFromWorkflowId(String TaskFromWorkflowId) {
        this.TaskFromWorkflowId = TaskFromWorkflowId;
    }

    /**
     * Get 下游任务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTo 下游任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskTo() {
        return this.TaskTo;
    }

    /**
     * Set 下游任务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTo 下游任务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTo(String TaskTo) {
        this.TaskTo = TaskTo;
    }

    /**
     * Get 下游任务项目ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskToProjectId 下游任务项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskToProjectId() {
        return this.TaskToProjectId;
    }

    /**
     * Set 下游任务项目ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskToProjectId 下游任务项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskToProjectId(String TaskToProjectId) {
        this.TaskToProjectId = TaskToProjectId;
    }

    /**
     * Get 下游任务工作流ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskToWorkflowId 下游任务工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskToWorkflowId() {
        return this.TaskToWorkflowId;
    }

    /**
     * Set 下游任务工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskToWorkflowId 下游任务工作流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskToWorkflowId(String TaskToWorkflowId) {
        this.TaskToWorkflowId = TaskToWorkflowId;
    }

    /**
     * Get 下游任务基本信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskToInfo 下游任务基本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskDsDTO getTaskToInfo() {
        return this.TaskToInfo;
    }

    /**
     * Set 下游任务基本信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskToInfo 下游任务基本信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskToInfo(TaskDsDTO TaskToInfo) {
        this.TaskToInfo = TaskToInfo;
    }

    /**
     * Get 依赖类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MainCyclicConfig 依赖类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMainCyclicConfig() {
        return this.MainCyclicConfig;
    }

    /**
     * Set 依赖类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param MainCyclicConfig 依赖类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMainCyclicConfig(String MainCyclicConfig) {
        this.MainCyclicConfig = MainCyclicConfig;
    }

    /**
     * Get 依赖偏移类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubordinateCyclicConfig 依赖偏移类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubordinateCyclicConfig() {
        return this.SubordinateCyclicConfig;
    }

    /**
     * Set 依赖偏移类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubordinateCyclicConfig 依赖偏移类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubordinateCyclicConfig(String SubordinateCyclicConfig) {
        this.SubordinateCyclicConfig = SubordinateCyclicConfig;
    }

    /**
     * Get 依赖策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DependencyStrategy 依赖策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDependencyStrategy() {
        return this.DependencyStrategy;
    }

    /**
     * Set 依赖策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param DependencyStrategy 依赖策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDependencyStrategy(String DependencyStrategy) {
        this.DependencyStrategy = DependencyStrategy;
    }

    /**
     * Get 自定义依赖偏移量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Offset 自定义依赖偏移量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set 自定义依赖偏移量
注意：此字段可能返回 null，表示取不到有效值。
     * @param Offset 自定义依赖偏移量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 更新人用户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateUserId 更新人用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateUserId() {
        return this.UpdateUserId;
    }

    /**
     * Set 更新人用户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateUserId 更新人用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateUserId(String UpdateUserId) {
        this.UpdateUserId = UpdateUserId;
    }

    /**
     * Get 创建人用户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUserId 创建人用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateUserId() {
        return this.CreateUserId;
    }

    /**
     * Set 创建人用户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUserId 创建人用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUserId(String CreateUserId) {
        this.CreateUserId = CreateUserId;
    }

    /**
     * Get 租户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 租户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set 租户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 租户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 主账号ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerUserId 主账号ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerUserId() {
        return this.OwnerUserId;
    }

    /**
     * Set 主账号ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerUserId 主账号ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerUserId(String OwnerUserId) {
        this.OwnerUserId = OwnerUserId;
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

    public TaskCycleLinkDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskCycleLinkDTO(TaskCycleLinkDTO source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.TaskFrom != null) {
            this.TaskFrom = new String(source.TaskFrom);
        }
        if (source.TaskFromProjectId != null) {
            this.TaskFromProjectId = new String(source.TaskFromProjectId);
        }
        if (source.TaskFromWorkflowId != null) {
            this.TaskFromWorkflowId = new String(source.TaskFromWorkflowId);
        }
        if (source.TaskTo != null) {
            this.TaskTo = new String(source.TaskTo);
        }
        if (source.TaskToProjectId != null) {
            this.TaskToProjectId = new String(source.TaskToProjectId);
        }
        if (source.TaskToWorkflowId != null) {
            this.TaskToWorkflowId = new String(source.TaskToWorkflowId);
        }
        if (source.TaskToInfo != null) {
            this.TaskToInfo = new TaskDsDTO(source.TaskToInfo);
        }
        if (source.MainCyclicConfig != null) {
            this.MainCyclicConfig = new String(source.MainCyclicConfig);
        }
        if (source.SubordinateCyclicConfig != null) {
            this.SubordinateCyclicConfig = new String(source.SubordinateCyclicConfig);
        }
        if (source.DependencyStrategy != null) {
            this.DependencyStrategy = new String(source.DependencyStrategy);
        }
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
        if (source.UpdateUserId != null) {
            this.UpdateUserId = new String(source.UpdateUserId);
        }
        if (source.CreateUserId != null) {
            this.CreateUserId = new String(source.CreateUserId);
        }
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.OwnerUserId != null) {
            this.OwnerUserId = new String(source.OwnerUserId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TaskFrom", this.TaskFrom);
        this.setParamSimple(map, prefix + "TaskFromProjectId", this.TaskFromProjectId);
        this.setParamSimple(map, prefix + "TaskFromWorkflowId", this.TaskFromWorkflowId);
        this.setParamSimple(map, prefix + "TaskTo", this.TaskTo);
        this.setParamSimple(map, prefix + "TaskToProjectId", this.TaskToProjectId);
        this.setParamSimple(map, prefix + "TaskToWorkflowId", this.TaskToWorkflowId);
        this.setParamObj(map, prefix + "TaskToInfo.", this.TaskToInfo);
        this.setParamSimple(map, prefix + "MainCyclicConfig", this.MainCyclicConfig);
        this.setParamSimple(map, prefix + "SubordinateCyclicConfig", this.SubordinateCyclicConfig);
        this.setParamSimple(map, prefix + "DependencyStrategy", this.DependencyStrategy);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "UpdateUserId", this.UpdateUserId);
        this.setParamSimple(map, prefix + "CreateUserId", this.CreateUserId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "OwnerUserId", this.OwnerUserId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

