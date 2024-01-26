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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProjectCloneTaskInfo extends AbstractModel {

    /**
    * 工作流id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 责任人名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerName")
    @Expose
    private String OwnerName;

    /**
    * 任务id
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
    * 任务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * N-新建
NS-草稿
Y-运行
F-停止
O-冻结
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * 任务最近一次提交时间（未提交则为 null）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskLatestSubmitTime")
    @Expose
    private String TaskLatestSubmitTime;

    /**
    * 原始资源组id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginalResourceGroup")
    @Expose
    private String OriginalResourceGroup;

    /**
    * 目标资源组id（迁移使用），目前为 null
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetResourceGroup")
    @Expose
    private String TargetResourceGroup;

    /**
     * Get 工作流id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowId 工作流id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流id
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowId 工作流id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 责任人名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerName 责任人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerName() {
        return this.OwnerName;
    }

    /**
     * Set 责任人名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerName 责任人名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    /**
     * Get 任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务id
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
     * Get 任务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get N-新建
NS-草稿
Y-运行
F-停止
O-冻结
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskStatus N-新建
NS-草稿
Y-运行
F-停止
O-冻结
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set N-新建
NS-草稿
Y-运行
F-停止
O-冻结
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskStatus N-新建
NS-草稿
Y-运行
F-停止
O-冻结
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 任务最近一次提交时间（未提交则为 null）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskLatestSubmitTime 任务最近一次提交时间（未提交则为 null）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskLatestSubmitTime() {
        return this.TaskLatestSubmitTime;
    }

    /**
     * Set 任务最近一次提交时间（未提交则为 null）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskLatestSubmitTime 任务最近一次提交时间（未提交则为 null）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskLatestSubmitTime(String TaskLatestSubmitTime) {
        this.TaskLatestSubmitTime = TaskLatestSubmitTime;
    }

    /**
     * Get 原始资源组id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginalResourceGroup 原始资源组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginalResourceGroup() {
        return this.OriginalResourceGroup;
    }

    /**
     * Set 原始资源组id
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginalResourceGroup 原始资源组id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginalResourceGroup(String OriginalResourceGroup) {
        this.OriginalResourceGroup = OriginalResourceGroup;
    }

    /**
     * Get 目标资源组id（迁移使用），目前为 null
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetResourceGroup 目标资源组id（迁移使用），目前为 null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetResourceGroup() {
        return this.TargetResourceGroup;
    }

    /**
     * Set 目标资源组id（迁移使用），目前为 null
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetResourceGroup 目标资源组id（迁移使用），目前为 null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetResourceGroup(String TargetResourceGroup) {
        this.TargetResourceGroup = TargetResourceGroup;
    }

    public ProjectCloneTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProjectCloneTaskInfo(ProjectCloneTaskInfo source) {
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.OwnerName != null) {
            this.OwnerName = new String(source.OwnerName);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.TaskLatestSubmitTime != null) {
            this.TaskLatestSubmitTime = new String(source.TaskLatestSubmitTime);
        }
        if (source.OriginalResourceGroup != null) {
            this.OriginalResourceGroup = new String(source.OriginalResourceGroup);
        }
        if (source.TargetResourceGroup != null) {
            this.TargetResourceGroup = new String(source.TargetResourceGroup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "OwnerName", this.OwnerName);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "TaskLatestSubmitTime", this.TaskLatestSubmitTime);
        this.setParamSimple(map, prefix + "OriginalResourceGroup", this.OriginalResourceGroup);
        this.setParamSimple(map, prefix + "TargetResourceGroup", this.TargetResourceGroup);

    }
}

