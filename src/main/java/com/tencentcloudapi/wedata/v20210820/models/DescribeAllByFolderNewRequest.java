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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAllByFolderNewRequest extends AbstractModel{

    /**
    * 文件夹属性
    */
    @SerializedName("Folder")
    @Expose
    private FolderOpsDto Folder;

    /**
    * 工作流列表
    */
    @SerializedName("Workflows")
    @Expose
    private WorkflowCanvasOpsDto [] Workflows;

    /**
    * 目标文件id
    */
    @SerializedName("TargetFolderId")
    @Expose
    private String TargetFolderId;

    /**
    * 关键字
    */
    @SerializedName("KeyWords")
    @Expose
    private String KeyWords;

    /**
    * 父文件id
    */
    @SerializedName("ParentsFolderId")
    @Expose
    private String ParentsFolderId;

    /**
    * 拉取文件夹列表
    */
    @SerializedName("IsAddWorkflow")
    @Expose
    private String IsAddWorkflow;

    /**
    * 任务状态
    */
    @SerializedName("TaskStates")
    @Expose
    private String [] TaskStates;

    /**
    * 搜索类型
    */
    @SerializedName("FindType")
    @Expose
    private String FindType;

    /**
    * 访问类型
    */
    @SerializedName("OptType")
    @Expose
    private String OptType;

    /**
    * 操作者名称
    */
    @SerializedName("OperatorName")
    @Expose
    private String OperatorName;

    /**
    * 操作者id
    */
    @SerializedName("OperatorId")
    @Expose
    private String OperatorId;

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 项目标志
    */
    @SerializedName("ProjectIdent")
    @Expose
    private String ProjectIdent;

    /**
    * 项目名称
    */
    @SerializedName("ProjectName")
    @Expose
    private String ProjectName;

    /**
    * 索引页码
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * 页面大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 数据总数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 基础请求信息
    */
    @SerializedName("RequestBaseInfo")
    @Expose
    private ProjectBaseInfoOpsRequest RequestBaseInfo;

    /**
    * 是否计算总数
    */
    @SerializedName("IsCount")
    @Expose
    private Boolean IsCount;

    /**
     * Get 文件夹属性 
     * @return Folder 文件夹属性
     */
    public FolderOpsDto getFolder() {
        return this.Folder;
    }

    /**
     * Set 文件夹属性
     * @param Folder 文件夹属性
     */
    public void setFolder(FolderOpsDto Folder) {
        this.Folder = Folder;
    }

    /**
     * Get 工作流列表 
     * @return Workflows 工作流列表
     */
    public WorkflowCanvasOpsDto [] getWorkflows() {
        return this.Workflows;
    }

    /**
     * Set 工作流列表
     * @param Workflows 工作流列表
     */
    public void setWorkflows(WorkflowCanvasOpsDto [] Workflows) {
        this.Workflows = Workflows;
    }

    /**
     * Get 目标文件id 
     * @return TargetFolderId 目标文件id
     */
    public String getTargetFolderId() {
        return this.TargetFolderId;
    }

    /**
     * Set 目标文件id
     * @param TargetFolderId 目标文件id
     */
    public void setTargetFolderId(String TargetFolderId) {
        this.TargetFolderId = TargetFolderId;
    }

    /**
     * Get 关键字 
     * @return KeyWords 关键字
     */
    public String getKeyWords() {
        return this.KeyWords;
    }

    /**
     * Set 关键字
     * @param KeyWords 关键字
     */
    public void setKeyWords(String KeyWords) {
        this.KeyWords = KeyWords;
    }

    /**
     * Get 父文件id 
     * @return ParentsFolderId 父文件id
     */
    public String getParentsFolderId() {
        return this.ParentsFolderId;
    }

    /**
     * Set 父文件id
     * @param ParentsFolderId 父文件id
     */
    public void setParentsFolderId(String ParentsFolderId) {
        this.ParentsFolderId = ParentsFolderId;
    }

    /**
     * Get 拉取文件夹列表 
     * @return IsAddWorkflow 拉取文件夹列表
     */
    public String getIsAddWorkflow() {
        return this.IsAddWorkflow;
    }

    /**
     * Set 拉取文件夹列表
     * @param IsAddWorkflow 拉取文件夹列表
     */
    public void setIsAddWorkflow(String IsAddWorkflow) {
        this.IsAddWorkflow = IsAddWorkflow;
    }

    /**
     * Get 任务状态 
     * @return TaskStates 任务状态
     */
    public String [] getTaskStates() {
        return this.TaskStates;
    }

    /**
     * Set 任务状态
     * @param TaskStates 任务状态
     */
    public void setTaskStates(String [] TaskStates) {
        this.TaskStates = TaskStates;
    }

    /**
     * Get 搜索类型 
     * @return FindType 搜索类型
     */
    public String getFindType() {
        return this.FindType;
    }

    /**
     * Set 搜索类型
     * @param FindType 搜索类型
     */
    public void setFindType(String FindType) {
        this.FindType = FindType;
    }

    /**
     * Get 访问类型 
     * @return OptType 访问类型
     */
    public String getOptType() {
        return this.OptType;
    }

    /**
     * Set 访问类型
     * @param OptType 访问类型
     */
    public void setOptType(String OptType) {
        this.OptType = OptType;
    }

    /**
     * Get 操作者名称 
     * @return OperatorName 操作者名称
     */
    public String getOperatorName() {
        return this.OperatorName;
    }

    /**
     * Set 操作者名称
     * @param OperatorName 操作者名称
     */
    public void setOperatorName(String OperatorName) {
        this.OperatorName = OperatorName;
    }

    /**
     * Get 操作者id 
     * @return OperatorId 操作者id
     */
    public String getOperatorId() {
        return this.OperatorId;
    }

    /**
     * Set 操作者id
     * @param OperatorId 操作者id
     */
    public void setOperatorId(String OperatorId) {
        this.OperatorId = OperatorId;
    }

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
     * Get 项目标志 
     * @return ProjectIdent 项目标志
     */
    public String getProjectIdent() {
        return this.ProjectIdent;
    }

    /**
     * Set 项目标志
     * @param ProjectIdent 项目标志
     */
    public void setProjectIdent(String ProjectIdent) {
        this.ProjectIdent = ProjectIdent;
    }

    /**
     * Get 项目名称 
     * @return ProjectName 项目名称
     */
    public String getProjectName() {
        return this.ProjectName;
    }

    /**
     * Set 项目名称
     * @param ProjectName 项目名称
     */
    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    /**
     * Get 索引页码 
     * @return PageIndex 索引页码
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set 索引页码
     * @param PageIndex 索引页码
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get 页面大小 
     * @return PageSize 页面大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页面大小
     * @param PageSize 页面大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 数据总数 
     * @return Count 数据总数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 数据总数
     * @param Count 数据总数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 基础请求信息 
     * @return RequestBaseInfo 基础请求信息
     */
    public ProjectBaseInfoOpsRequest getRequestBaseInfo() {
        return this.RequestBaseInfo;
    }

    /**
     * Set 基础请求信息
     * @param RequestBaseInfo 基础请求信息
     */
    public void setRequestBaseInfo(ProjectBaseInfoOpsRequest RequestBaseInfo) {
        this.RequestBaseInfo = RequestBaseInfo;
    }

    /**
     * Get 是否计算总数 
     * @return IsCount 是否计算总数
     */
    public Boolean getIsCount() {
        return this.IsCount;
    }

    /**
     * Set 是否计算总数
     * @param IsCount 是否计算总数
     */
    public void setIsCount(Boolean IsCount) {
        this.IsCount = IsCount;
    }

    public DescribeAllByFolderNewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAllByFolderNewRequest(DescribeAllByFolderNewRequest source) {
        if (source.Folder != null) {
            this.Folder = new FolderOpsDto(source.Folder);
        }
        if (source.Workflows != null) {
            this.Workflows = new WorkflowCanvasOpsDto[source.Workflows.length];
            for (int i = 0; i < source.Workflows.length; i++) {
                this.Workflows[i] = new WorkflowCanvasOpsDto(source.Workflows[i]);
            }
        }
        if (source.TargetFolderId != null) {
            this.TargetFolderId = new String(source.TargetFolderId);
        }
        if (source.KeyWords != null) {
            this.KeyWords = new String(source.KeyWords);
        }
        if (source.ParentsFolderId != null) {
            this.ParentsFolderId = new String(source.ParentsFolderId);
        }
        if (source.IsAddWorkflow != null) {
            this.IsAddWorkflow = new String(source.IsAddWorkflow);
        }
        if (source.TaskStates != null) {
            this.TaskStates = new String[source.TaskStates.length];
            for (int i = 0; i < source.TaskStates.length; i++) {
                this.TaskStates[i] = new String(source.TaskStates[i]);
            }
        }
        if (source.FindType != null) {
            this.FindType = new String(source.FindType);
        }
        if (source.OptType != null) {
            this.OptType = new String(source.OptType);
        }
        if (source.OperatorName != null) {
            this.OperatorName = new String(source.OperatorName);
        }
        if (source.OperatorId != null) {
            this.OperatorId = new String(source.OperatorId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ProjectIdent != null) {
            this.ProjectIdent = new String(source.ProjectIdent);
        }
        if (source.ProjectName != null) {
            this.ProjectName = new String(source.ProjectName);
        }
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.RequestBaseInfo != null) {
            this.RequestBaseInfo = new ProjectBaseInfoOpsRequest(source.RequestBaseInfo);
        }
        if (source.IsCount != null) {
            this.IsCount = new Boolean(source.IsCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Folder.", this.Folder);
        this.setParamArrayObj(map, prefix + "Workflows.", this.Workflows);
        this.setParamSimple(map, prefix + "TargetFolderId", this.TargetFolderId);
        this.setParamSimple(map, prefix + "KeyWords", this.KeyWords);
        this.setParamSimple(map, prefix + "ParentsFolderId", this.ParentsFolderId);
        this.setParamSimple(map, prefix + "IsAddWorkflow", this.IsAddWorkflow);
        this.setParamArraySimple(map, prefix + "TaskStates.", this.TaskStates);
        this.setParamSimple(map, prefix + "FindType", this.FindType);
        this.setParamSimple(map, prefix + "OptType", this.OptType);
        this.setParamSimple(map, prefix + "OperatorName", this.OperatorName);
        this.setParamSimple(map, prefix + "OperatorId", this.OperatorId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProjectIdent", this.ProjectIdent);
        this.setParamSimple(map, prefix + "ProjectName", this.ProjectName);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamObj(map, prefix + "RequestBaseInfo.", this.RequestBaseInfo);
        this.setParamSimple(map, prefix + "IsCount", this.IsCount);

    }
}

