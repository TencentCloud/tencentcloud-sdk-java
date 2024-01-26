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

public class ModifyTaskFolderRequest extends AbstractModel {

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 文件夹名称
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * 工作量ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 任务文件夹ID
    */
    @SerializedName("TaskFolderId")
    @Expose
    private String TaskFolderId;

    /**
    * 父文件夹ID
    */
    @SerializedName("ParentFolderId")
    @Expose
    private String ParentFolderId;

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 文件夹名称 
     * @return FolderName 文件夹名称
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set 文件夹名称
     * @param FolderName 文件夹名称
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    /**
     * Get 工作量ID 
     * @return WorkflowId 工作量ID
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作量ID
     * @param WorkflowId 工作量ID
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
    }

    /**
     * Get 任务文件夹ID 
     * @return TaskFolderId 任务文件夹ID
     */
    public String getTaskFolderId() {
        return this.TaskFolderId;
    }

    /**
     * Set 任务文件夹ID
     * @param TaskFolderId 任务文件夹ID
     */
    public void setTaskFolderId(String TaskFolderId) {
        this.TaskFolderId = TaskFolderId;
    }

    /**
     * Get 父文件夹ID 
     * @return ParentFolderId 父文件夹ID
     */
    public String getParentFolderId() {
        return this.ParentFolderId;
    }

    /**
     * Set 父文件夹ID
     * @param ParentFolderId 父文件夹ID
     */
    public void setParentFolderId(String ParentFolderId) {
        this.ParentFolderId = ParentFolderId;
    }

    public ModifyTaskFolderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTaskFolderRequest(ModifyTaskFolderRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.TaskFolderId != null) {
            this.TaskFolderId = new String(source.TaskFolderId);
        }
        if (source.ParentFolderId != null) {
            this.ParentFolderId = new String(source.ParentFolderId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "TaskFolderId", this.TaskFolderId);
        this.setParamSimple(map, prefix + "ParentFolderId", this.ParentFolderId);

    }
}

