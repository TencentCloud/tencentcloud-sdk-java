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

public class ImportOfflineTaskRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务名称
    */
    @SerializedName("TaskInfoList")
    @Expose
    private TaskBaseInfo [] TaskInfoList;

    /**
    * 重命名策略，0（跳过）、1（重命名）
    */
    @SerializedName("TaskNameExistMode")
    @Expose
    private Long TaskNameExistMode;

    /**
    * 工作流id
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 任务文件夹id
    */
    @SerializedName("TaskFolderId")
    @Expose
    private String TaskFolderId;

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 任务名称 
     * @return TaskInfoList 任务名称
     */
    public TaskBaseInfo [] getTaskInfoList() {
        return this.TaskInfoList;
    }

    /**
     * Set 任务名称
     * @param TaskInfoList 任务名称
     */
    public void setTaskInfoList(TaskBaseInfo [] TaskInfoList) {
        this.TaskInfoList = TaskInfoList;
    }

    /**
     * Get 重命名策略，0（跳过）、1（重命名） 
     * @return TaskNameExistMode 重命名策略，0（跳过）、1（重命名）
     */
    public Long getTaskNameExistMode() {
        return this.TaskNameExistMode;
    }

    /**
     * Set 重命名策略，0（跳过）、1（重命名）
     * @param TaskNameExistMode 重命名策略，0（跳过）、1（重命名）
     */
    public void setTaskNameExistMode(Long TaskNameExistMode) {
        this.TaskNameExistMode = TaskNameExistMode;
    }

    /**
     * Get 工作流id 
     * @return WorkflowId 工作流id
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流id
     * @param WorkflowId 工作流id
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 任务文件夹id 
     * @return TaskFolderId 任务文件夹id
     */
    public String getTaskFolderId() {
        return this.TaskFolderId;
    }

    /**
     * Set 任务文件夹id
     * @param TaskFolderId 任务文件夹id
     */
    public void setTaskFolderId(String TaskFolderId) {
        this.TaskFolderId = TaskFolderId;
    }

    public ImportOfflineTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportOfflineTaskRequest(ImportOfflineTaskRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskInfoList != null) {
            this.TaskInfoList = new TaskBaseInfo[source.TaskInfoList.length];
            for (int i = 0; i < source.TaskInfoList.length; i++) {
                this.TaskInfoList[i] = new TaskBaseInfo(source.TaskInfoList[i]);
            }
        }
        if (source.TaskNameExistMode != null) {
            this.TaskNameExistMode = new Long(source.TaskNameExistMode);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.TaskFolderId != null) {
            this.TaskFolderId = new String(source.TaskFolderId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "TaskInfoList.", this.TaskInfoList);
        this.setParamSimple(map, prefix + "TaskNameExistMode", this.TaskNameExistMode);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "TaskFolderId", this.TaskFolderId);

    }
}

