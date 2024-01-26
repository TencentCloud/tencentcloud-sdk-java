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

public class ProjectCloneWorkflowInfo extends AbstractModel {

    /**
    * 工作流id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * 文件夹名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Folder")
    @Expose
    private String Folder;

    /**
    * 任务数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskNum")
    @Expose
    private Long TaskNum;

    /**
    * 责任人id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Owner")
    @Expose
    private String Owner;

    /**
    * 责任人名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerName")
    @Expose
    private String OwnerName;

    /**
    * 工作流最近一次提交时间（未提交则为 null）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LatestSubmitTime")
    @Expose
    private String LatestSubmitTime;

    /**
    * 工作流任务列表（当前未使用）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tasks")
    @Expose
    private ProjectCloneTaskInfo [] Tasks;

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
     * Get 工作流名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkflowName 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkflowName 工作流名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get 文件夹名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Folder 文件夹名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFolder() {
        return this.Folder;
    }

    /**
     * Set 文件夹名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Folder 文件夹名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFolder(String Folder) {
        this.Folder = Folder;
    }

    /**
     * Get 任务数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskNum 任务数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskNum() {
        return this.TaskNum;
    }

    /**
     * Set 任务数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskNum 任务数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskNum(Long TaskNum) {
        this.TaskNum = TaskNum;
    }

    /**
     * Get 责任人id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Owner 责任人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwner() {
        return this.Owner;
    }

    /**
     * Set 责任人id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Owner 责任人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwner(String Owner) {
        this.Owner = Owner;
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
     * Get 工作流最近一次提交时间（未提交则为 null）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LatestSubmitTime 工作流最近一次提交时间（未提交则为 null）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLatestSubmitTime() {
        return this.LatestSubmitTime;
    }

    /**
     * Set 工作流最近一次提交时间（未提交则为 null）
注意：此字段可能返回 null，表示取不到有效值。
     * @param LatestSubmitTime 工作流最近一次提交时间（未提交则为 null）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLatestSubmitTime(String LatestSubmitTime) {
        this.LatestSubmitTime = LatestSubmitTime;
    }

    /**
     * Get 工作流任务列表（当前未使用）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tasks 工作流任务列表（当前未使用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ProjectCloneTaskInfo [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 工作流任务列表（当前未使用）
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tasks 工作流任务列表（当前未使用）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTasks(ProjectCloneTaskInfo [] Tasks) {
        this.Tasks = Tasks;
    }

    public ProjectCloneWorkflowInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProjectCloneWorkflowInfo(ProjectCloneWorkflowInfo source) {
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.Folder != null) {
            this.Folder = new String(source.Folder);
        }
        if (source.TaskNum != null) {
            this.TaskNum = new Long(source.TaskNum);
        }
        if (source.Owner != null) {
            this.Owner = new String(source.Owner);
        }
        if (source.OwnerName != null) {
            this.OwnerName = new String(source.OwnerName);
        }
        if (source.LatestSubmitTime != null) {
            this.LatestSubmitTime = new String(source.LatestSubmitTime);
        }
        if (source.Tasks != null) {
            this.Tasks = new ProjectCloneTaskInfo[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new ProjectCloneTaskInfo(source.Tasks[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "Folder", this.Folder);
        this.setParamSimple(map, prefix + "TaskNum", this.TaskNum);
        this.setParamSimple(map, prefix + "Owner", this.Owner);
        this.setParamSimple(map, prefix + "OwnerName", this.OwnerName);
        this.setParamSimple(map, prefix + "LatestSubmitTime", this.LatestSubmitTime);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);

    }
}

