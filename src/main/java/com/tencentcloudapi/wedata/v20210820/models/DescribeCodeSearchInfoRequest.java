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

public class DescribeCodeSearchInfoRequest extends AbstractModel {

    /**
    * 搜索关键词
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 要查询的搜索范围
    */
    @SerializedName("SearchScope")
    @Expose
    private String SearchScope;

    /**
    * 页数
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 条数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 搜索范围列表
    */
    @SerializedName("SearchScopes")
    @Expose
    private String [] SearchScopes;

    /**
    * 责任人ID列表
    */
    @SerializedName("OwnerIds")
    @Expose
    private String [] OwnerIds;

    /**
    * 文件类型列表
    */
    @SerializedName("FileTypes")
    @Expose
    private String [] FileTypes;

    /**
    * 任务类型列表
    */
    @SerializedName("TaskTypes")
    @Expose
    private String [] TaskTypes;

    /**
    * 更新时间范围：开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 更新时间范围：结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 开发态/生产态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 工作流ID
    */
    @SerializedName("WorkflowIds")
    @Expose
    private String [] WorkflowIds;

    /**
    * 文件夹ID
    */
    @SerializedName("FolderIds")
    @Expose
    private String [] FolderIds;

    /**
    * 数据源ID
    */
    @SerializedName("DatasourceIds")
    @Expose
    private String [] DatasourceIds;

    /**
    * 文件夹路径
    */
    @SerializedName("FolderPaths")
    @Expose
    private String [] FolderPaths;

    /**
    * 任务状态
    */
    @SerializedName("TaskStatus")
    @Expose
    private String [] TaskStatus;

    /**
     * Get 搜索关键词 
     * @return Keyword 搜索关键词
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 搜索关键词
     * @param Keyword 搜索关键词
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 要查询的搜索范围 
     * @return SearchScope 要查询的搜索范围
     */
    public String getSearchScope() {
        return this.SearchScope;
    }

    /**
     * Set 要查询的搜索范围
     * @param SearchScope 要查询的搜索范围
     */
    public void setSearchScope(String SearchScope) {
        this.SearchScope = SearchScope;
    }

    /**
     * Get 页数 
     * @return PageNumber 页数
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页数
     * @param PageNumber 页数
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 条数 
     * @return PageSize 条数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 条数
     * @param PageSize 条数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 搜索范围列表 
     * @return SearchScopes 搜索范围列表
     */
    public String [] getSearchScopes() {
        return this.SearchScopes;
    }

    /**
     * Set 搜索范围列表
     * @param SearchScopes 搜索范围列表
     */
    public void setSearchScopes(String [] SearchScopes) {
        this.SearchScopes = SearchScopes;
    }

    /**
     * Get 责任人ID列表 
     * @return OwnerIds 责任人ID列表
     */
    public String [] getOwnerIds() {
        return this.OwnerIds;
    }

    /**
     * Set 责任人ID列表
     * @param OwnerIds 责任人ID列表
     */
    public void setOwnerIds(String [] OwnerIds) {
        this.OwnerIds = OwnerIds;
    }

    /**
     * Get 文件类型列表 
     * @return FileTypes 文件类型列表
     */
    public String [] getFileTypes() {
        return this.FileTypes;
    }

    /**
     * Set 文件类型列表
     * @param FileTypes 文件类型列表
     */
    public void setFileTypes(String [] FileTypes) {
        this.FileTypes = FileTypes;
    }

    /**
     * Get 任务类型列表 
     * @return TaskTypes 任务类型列表
     */
    public String [] getTaskTypes() {
        return this.TaskTypes;
    }

    /**
     * Set 任务类型列表
     * @param TaskTypes 任务类型列表
     */
    public void setTaskTypes(String [] TaskTypes) {
        this.TaskTypes = TaskTypes;
    }

    /**
     * Get 更新时间范围：开始时间 
     * @return StartTime 更新时间范围：开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 更新时间范围：开始时间
     * @param StartTime 更新时间范围：开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 更新时间范围：结束时间 
     * @return EndTime 更新时间范围：结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 更新时间范围：结束时间
     * @param EndTime 更新时间范围：结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 开发态/生产态 
     * @return Status 开发态/生产态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 开发态/生产态
     * @param Status 开发态/生产态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 工作流ID 
     * @return WorkflowIds 工作流ID
     */
    public String [] getWorkflowIds() {
        return this.WorkflowIds;
    }

    /**
     * Set 工作流ID
     * @param WorkflowIds 工作流ID
     */
    public void setWorkflowIds(String [] WorkflowIds) {
        this.WorkflowIds = WorkflowIds;
    }

    /**
     * Get 文件夹ID 
     * @return FolderIds 文件夹ID
     */
    public String [] getFolderIds() {
        return this.FolderIds;
    }

    /**
     * Set 文件夹ID
     * @param FolderIds 文件夹ID
     */
    public void setFolderIds(String [] FolderIds) {
        this.FolderIds = FolderIds;
    }

    /**
     * Get 数据源ID 
     * @return DatasourceIds 数据源ID
     */
    public String [] getDatasourceIds() {
        return this.DatasourceIds;
    }

    /**
     * Set 数据源ID
     * @param DatasourceIds 数据源ID
     */
    public void setDatasourceIds(String [] DatasourceIds) {
        this.DatasourceIds = DatasourceIds;
    }

    /**
     * Get 文件夹路径 
     * @return FolderPaths 文件夹路径
     */
    public String [] getFolderPaths() {
        return this.FolderPaths;
    }

    /**
     * Set 文件夹路径
     * @param FolderPaths 文件夹路径
     */
    public void setFolderPaths(String [] FolderPaths) {
        this.FolderPaths = FolderPaths;
    }

    /**
     * Get 任务状态 
     * @return TaskStatus 任务状态
     */
    public String [] getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态
     * @param TaskStatus 任务状态
     */
    public void setTaskStatus(String [] TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    public DescribeCodeSearchInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCodeSearchInfoRequest(DescribeCodeSearchInfoRequest source) {
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.SearchScope != null) {
            this.SearchScope = new String(source.SearchScope);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.SearchScopes != null) {
            this.SearchScopes = new String[source.SearchScopes.length];
            for (int i = 0; i < source.SearchScopes.length; i++) {
                this.SearchScopes[i] = new String(source.SearchScopes[i]);
            }
        }
        if (source.OwnerIds != null) {
            this.OwnerIds = new String[source.OwnerIds.length];
            for (int i = 0; i < source.OwnerIds.length; i++) {
                this.OwnerIds[i] = new String(source.OwnerIds[i]);
            }
        }
        if (source.FileTypes != null) {
            this.FileTypes = new String[source.FileTypes.length];
            for (int i = 0; i < source.FileTypes.length; i++) {
                this.FileTypes[i] = new String(source.FileTypes[i]);
            }
        }
        if (source.TaskTypes != null) {
            this.TaskTypes = new String[source.TaskTypes.length];
            for (int i = 0; i < source.TaskTypes.length; i++) {
                this.TaskTypes[i] = new String(source.TaskTypes[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.WorkflowIds != null) {
            this.WorkflowIds = new String[source.WorkflowIds.length];
            for (int i = 0; i < source.WorkflowIds.length; i++) {
                this.WorkflowIds[i] = new String(source.WorkflowIds[i]);
            }
        }
        if (source.FolderIds != null) {
            this.FolderIds = new String[source.FolderIds.length];
            for (int i = 0; i < source.FolderIds.length; i++) {
                this.FolderIds[i] = new String(source.FolderIds[i]);
            }
        }
        if (source.DatasourceIds != null) {
            this.DatasourceIds = new String[source.DatasourceIds.length];
            for (int i = 0; i < source.DatasourceIds.length; i++) {
                this.DatasourceIds[i] = new String(source.DatasourceIds[i]);
            }
        }
        if (source.FolderPaths != null) {
            this.FolderPaths = new String[source.FolderPaths.length];
            for (int i = 0; i < source.FolderPaths.length; i++) {
                this.FolderPaths[i] = new String(source.FolderPaths[i]);
            }
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String[source.TaskStatus.length];
            for (int i = 0; i < source.TaskStatus.length; i++) {
                this.TaskStatus[i] = new String(source.TaskStatus[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "SearchScope", this.SearchScope);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "SearchScopes.", this.SearchScopes);
        this.setParamArraySimple(map, prefix + "OwnerIds.", this.OwnerIds);
        this.setParamArraySimple(map, prefix + "FileTypes.", this.FileTypes);
        this.setParamArraySimple(map, prefix + "TaskTypes.", this.TaskTypes);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "WorkflowIds.", this.WorkflowIds);
        this.setParamArraySimple(map, prefix + "FolderIds.", this.FolderIds);
        this.setParamArraySimple(map, prefix + "DatasourceIds.", this.DatasourceIds);
        this.setParamArraySimple(map, prefix + "FolderPaths.", this.FolderPaths);
        this.setParamArraySimple(map, prefix + "TaskStatus.", this.TaskStatus);

    }
}

