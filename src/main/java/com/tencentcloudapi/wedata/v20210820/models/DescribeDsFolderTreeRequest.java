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

public class DescribeDsFolderTreeRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 是否一级拉取 true 是 
false 否
    */
    @SerializedName("FirstLevelPull")
    @Expose
    private Boolean FirstLevelPull;

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
    * 关键字搜索
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 是否包含工作流 true 是 
false 否
    */
    @SerializedName("IncludeWorkflow")
    @Expose
    private Boolean IncludeWorkflow;

    /**
    * 是否包含任务 true 是 
false 否
    */
    @SerializedName("IncludeTask")
    @Expose
    private Boolean IncludeTask;

    /**
    * 是否包含虚拟任务，当 IncludeTask 为 true 的时候，该参数才生效，默认为 true
    */
    @SerializedName("IncludeVirtualTask")
    @Expose
    private Boolean IncludeVirtualTask;

    /**
    * 任务目录id
    */
    @SerializedName("TaskFolderId")
    @Expose
    private String TaskFolderId;

    /**
    * classification.分类展示  catalog.目录展示
    */
    @SerializedName("DisplayType")
    @Expose
    private String DisplayType;

    /**
    * 是否包含任务目录 true 是 
false 否
    */
    @SerializedName("IncludeTaskFolder")
    @Expose
    private Boolean IncludeTaskFolder;

    /**
    * 是否使用最新模式展示目录树
    */
    @SerializedName("NewFolderTreeMode")
    @Expose
    private Boolean NewFolderTreeMode;

    /**
    * 节点分类ID
    */
    @SerializedName("TaskNodeId")
    @Expose
    private String TaskNodeId;

    /**
    * 工作流类型, 使用场景: 任务复制,选择工作流. 取值范围

- cycle    周期工作流
- manual    手动工作流
    */
    @SerializedName("WorkflowType")
    @Expose
    private String WorkflowType;

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
     * Get 是否一级拉取 true 是 
false 否 
     * @return FirstLevelPull 是否一级拉取 true 是 
false 否
     */
    public Boolean getFirstLevelPull() {
        return this.FirstLevelPull;
    }

    /**
     * Set 是否一级拉取 true 是 
false 否
     * @param FirstLevelPull 是否一级拉取 true 是 
false 否
     */
    public void setFirstLevelPull(Boolean FirstLevelPull) {
        this.FirstLevelPull = FirstLevelPull;
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
     * Get 关键字搜索 
     * @return Keyword 关键字搜索
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 关键字搜索
     * @param Keyword 关键字搜索
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 是否包含工作流 true 是 
false 否 
     * @return IncludeWorkflow 是否包含工作流 true 是 
false 否
     */
    public Boolean getIncludeWorkflow() {
        return this.IncludeWorkflow;
    }

    /**
     * Set 是否包含工作流 true 是 
false 否
     * @param IncludeWorkflow 是否包含工作流 true 是 
false 否
     */
    public void setIncludeWorkflow(Boolean IncludeWorkflow) {
        this.IncludeWorkflow = IncludeWorkflow;
    }

    /**
     * Get 是否包含任务 true 是 
false 否 
     * @return IncludeTask 是否包含任务 true 是 
false 否
     */
    public Boolean getIncludeTask() {
        return this.IncludeTask;
    }

    /**
     * Set 是否包含任务 true 是 
false 否
     * @param IncludeTask 是否包含任务 true 是 
false 否
     */
    public void setIncludeTask(Boolean IncludeTask) {
        this.IncludeTask = IncludeTask;
    }

    /**
     * Get 是否包含虚拟任务，当 IncludeTask 为 true 的时候，该参数才生效，默认为 true 
     * @return IncludeVirtualTask 是否包含虚拟任务，当 IncludeTask 为 true 的时候，该参数才生效，默认为 true
     */
    public Boolean getIncludeVirtualTask() {
        return this.IncludeVirtualTask;
    }

    /**
     * Set 是否包含虚拟任务，当 IncludeTask 为 true 的时候，该参数才生效，默认为 true
     * @param IncludeVirtualTask 是否包含虚拟任务，当 IncludeTask 为 true 的时候，该参数才生效，默认为 true
     */
    public void setIncludeVirtualTask(Boolean IncludeVirtualTask) {
        this.IncludeVirtualTask = IncludeVirtualTask;
    }

    /**
     * Get 任务目录id 
     * @return TaskFolderId 任务目录id
     */
    public String getTaskFolderId() {
        return this.TaskFolderId;
    }

    /**
     * Set 任务目录id
     * @param TaskFolderId 任务目录id
     */
    public void setTaskFolderId(String TaskFolderId) {
        this.TaskFolderId = TaskFolderId;
    }

    /**
     * Get classification.分类展示  catalog.目录展示 
     * @return DisplayType classification.分类展示  catalog.目录展示
     */
    public String getDisplayType() {
        return this.DisplayType;
    }

    /**
     * Set classification.分类展示  catalog.目录展示
     * @param DisplayType classification.分类展示  catalog.目录展示
     */
    public void setDisplayType(String DisplayType) {
        this.DisplayType = DisplayType;
    }

    /**
     * Get 是否包含任务目录 true 是 
false 否 
     * @return IncludeTaskFolder 是否包含任务目录 true 是 
false 否
     */
    public Boolean getIncludeTaskFolder() {
        return this.IncludeTaskFolder;
    }

    /**
     * Set 是否包含任务目录 true 是 
false 否
     * @param IncludeTaskFolder 是否包含任务目录 true 是 
false 否
     */
    public void setIncludeTaskFolder(Boolean IncludeTaskFolder) {
        this.IncludeTaskFolder = IncludeTaskFolder;
    }

    /**
     * Get 是否使用最新模式展示目录树 
     * @return NewFolderTreeMode 是否使用最新模式展示目录树
     */
    public Boolean getNewFolderTreeMode() {
        return this.NewFolderTreeMode;
    }

    /**
     * Set 是否使用最新模式展示目录树
     * @param NewFolderTreeMode 是否使用最新模式展示目录树
     */
    public void setNewFolderTreeMode(Boolean NewFolderTreeMode) {
        this.NewFolderTreeMode = NewFolderTreeMode;
    }

    /**
     * Get 节点分类ID 
     * @return TaskNodeId 节点分类ID
     */
    public String getTaskNodeId() {
        return this.TaskNodeId;
    }

    /**
     * Set 节点分类ID
     * @param TaskNodeId 节点分类ID
     */
    public void setTaskNodeId(String TaskNodeId) {
        this.TaskNodeId = TaskNodeId;
    }

    /**
     * Get 工作流类型, 使用场景: 任务复制,选择工作流. 取值范围

- cycle    周期工作流
- manual    手动工作流 
     * @return WorkflowType 工作流类型, 使用场景: 任务复制,选择工作流. 取值范围

- cycle    周期工作流
- manual    手动工作流
     */
    public String getWorkflowType() {
        return this.WorkflowType;
    }

    /**
     * Set 工作流类型, 使用场景: 任务复制,选择工作流. 取值范围

- cycle    周期工作流
- manual    手动工作流
     * @param WorkflowType 工作流类型, 使用场景: 任务复制,选择工作流. 取值范围

- cycle    周期工作流
- manual    手动工作流
     */
    public void setWorkflowType(String WorkflowType) {
        this.WorkflowType = WorkflowType;
    }

    public DescribeDsFolderTreeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDsFolderTreeRequest(DescribeDsFolderTreeRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.FirstLevelPull != null) {
            this.FirstLevelPull = new Boolean(source.FirstLevelPull);
        }
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.WorkflowId != null) {
            this.WorkflowId = new String(source.WorkflowId);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.IncludeWorkflow != null) {
            this.IncludeWorkflow = new Boolean(source.IncludeWorkflow);
        }
        if (source.IncludeTask != null) {
            this.IncludeTask = new Boolean(source.IncludeTask);
        }
        if (source.IncludeVirtualTask != null) {
            this.IncludeVirtualTask = new Boolean(source.IncludeVirtualTask);
        }
        if (source.TaskFolderId != null) {
            this.TaskFolderId = new String(source.TaskFolderId);
        }
        if (source.DisplayType != null) {
            this.DisplayType = new String(source.DisplayType);
        }
        if (source.IncludeTaskFolder != null) {
            this.IncludeTaskFolder = new Boolean(source.IncludeTaskFolder);
        }
        if (source.NewFolderTreeMode != null) {
            this.NewFolderTreeMode = new Boolean(source.NewFolderTreeMode);
        }
        if (source.TaskNodeId != null) {
            this.TaskNodeId = new String(source.TaskNodeId);
        }
        if (source.WorkflowType != null) {
            this.WorkflowType = new String(source.WorkflowType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "FirstLevelPull", this.FirstLevelPull);
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "WorkflowId", this.WorkflowId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "IncludeWorkflow", this.IncludeWorkflow);
        this.setParamSimple(map, prefix + "IncludeTask", this.IncludeTask);
        this.setParamSimple(map, prefix + "IncludeVirtualTask", this.IncludeVirtualTask);
        this.setParamSimple(map, prefix + "TaskFolderId", this.TaskFolderId);
        this.setParamSimple(map, prefix + "DisplayType", this.DisplayType);
        this.setParamSimple(map, prefix + "IncludeTaskFolder", this.IncludeTaskFolder);
        this.setParamSimple(map, prefix + "NewFolderTreeMode", this.NewFolderTreeMode);
        this.setParamSimple(map, prefix + "TaskNodeId", this.TaskNodeId);
        this.setParamSimple(map, prefix + "WorkflowType", this.WorkflowType);

    }
}

