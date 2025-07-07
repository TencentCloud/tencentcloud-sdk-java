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

public class DescribeDsParentFolderTreeRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 文件夹ID
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * 工作流ID
    */
    @SerializedName("WorkflowId")
    @Expose
    private String WorkflowId;

    /**
    * 任务id
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务展示形式, 示例取值
-    classification:分类展示
-    catalog:目录展示
    */
    @SerializedName("DisplayType")
    @Expose
    private String DisplayType;

    /**
    * 是否新模式展示目录树
    */
    @SerializedName("NewFolderTreeMode")
    @Expose
    private Boolean NewFolderTreeMode;

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
     * Get 文件夹ID 
     * @return FolderId 文件夹ID
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set 文件夹ID
     * @param FolderId 文件夹ID
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
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
     * Get 任务id 
     * @return TaskId 任务id
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
     * @param TaskId 任务id
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 任务展示形式, 示例取值
-    classification:分类展示
-    catalog:目录展示 
     * @return DisplayType 任务展示形式, 示例取值
-    classification:分类展示
-    catalog:目录展示
     */
    public String getDisplayType() {
        return this.DisplayType;
    }

    /**
     * Set 任务展示形式, 示例取值
-    classification:分类展示
-    catalog:目录展示
     * @param DisplayType 任务展示形式, 示例取值
-    classification:分类展示
-    catalog:目录展示
     */
    public void setDisplayType(String DisplayType) {
        this.DisplayType = DisplayType;
    }

    /**
     * Get 是否新模式展示目录树 
     * @return NewFolderTreeMode 是否新模式展示目录树
     */
    public Boolean getNewFolderTreeMode() {
        return this.NewFolderTreeMode;
    }

    /**
     * Set 是否新模式展示目录树
     * @param NewFolderTreeMode 是否新模式展示目录树
     */
    public void setNewFolderTreeMode(Boolean NewFolderTreeMode) {
        this.NewFolderTreeMode = NewFolderTreeMode;
    }

    public DescribeDsParentFolderTreeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDsParentFolderTreeRequest(DescribeDsParentFolderTreeRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.DisplayType != null) {
            this.DisplayType = new String(source.DisplayType);
        }
        if (source.NewFolderTreeMode != null) {
            this.NewFolderTreeMode = new Boolean(source.NewFolderTreeMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "DisplayType", this.DisplayType);
        this.setParamSimple(map, prefix + "NewFolderTreeMode", this.NewFolderTreeMode);

    }
}

