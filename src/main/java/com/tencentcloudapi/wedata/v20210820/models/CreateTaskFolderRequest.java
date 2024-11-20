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

public class CreateTaskFolderRequest extends AbstractModel {

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
    * 工作流ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 父文件夹ID
    */
    @SerializedName("ParentFolderId")
    @Expose
    private String ParentFolderId;

    /**
    * 目录分类
    */
    @SerializedName("TaskNodeType")
    @Expose
    private String TaskNodeType;

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
     * Get 工作流ID 
     * @return WorkflowId 工作流ID
     */
    public String getWorkflowId() {
        return this.WorkflowId;
    }

    /**
     * Set 工作流ID
     * @param WorkflowId 工作流ID
     */
    public void setWorkflowId(String WorkflowId) {
        this.WorkflowId = WorkflowId;
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

    /**
     * Get 目录分类 
     * @return TaskNodeType 目录分类
     */
    public String getTaskNodeType() {
        return this.TaskNodeType;
    }

    /**
     * Set 目录分类
     * @param TaskNodeType 目录分类
     */
    public void setTaskNodeType(String TaskNodeType) {
        this.TaskNodeType = TaskNodeType;
    }

    public CreateTaskFolderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTaskFolderRequest(CreateTaskFolderRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.ParentFolderId != null) {
            this.ParentFolderId = new String(source.ParentFolderId);
        }
        if (source.TaskNodeType != null) {
            this.TaskNodeType = new String(source.TaskNodeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "ParentFolderId", this.ParentFolderId);
        this.setParamSimple(map, prefix + "TaskNodeType", this.TaskNodeType);

    }
}

