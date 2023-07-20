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

public class DescribeDrInstancePageRequest extends AbstractModel{

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务来源 ADHOC || WORKFLOW
    */
    @SerializedName("TaskSource")
    @Expose
    private String TaskSource;

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
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 提交开始时间 yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 提交结束时间 yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 文件夹id
    */
    @SerializedName("FolderIds")
    @Expose
    private String [] FolderIds;

    /**
    * 工作流id
    */
    @SerializedName("WorkflowIds")
    @Expose
    private String [] WorkflowIds;

    /**
    * 只看我的
    */
    @SerializedName("JustMe")
    @Expose
    private Boolean JustMe;

    /**
    * 任务类型
    */
    @SerializedName("TaskTypes")
    @Expose
    private String [] TaskTypes;

    /**
    * 试运行提交人userId列表
    */
    @SerializedName("SubmitUsers")
    @Expose
    private String [] SubmitUsers;

    /**
    * 试运行状态
    */
    @SerializedName("StatusList")
    @Expose
    private String [] StatusList;

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
     * Get 任务来源 ADHOC || WORKFLOW 
     * @return TaskSource 任务来源 ADHOC || WORKFLOW
     */
    public String getTaskSource() {
        return this.TaskSource;
    }

    /**
     * Set 任务来源 ADHOC || WORKFLOW
     * @param TaskSource 任务来源 ADHOC || WORKFLOW
     */
    public void setTaskSource(String TaskSource) {
        this.TaskSource = TaskSource;
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
     * Get 任务名称 
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 提交开始时间 yyyy-MM-dd HH:mm:ss 
     * @return StartTime 提交开始时间 yyyy-MM-dd HH:mm:ss
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 提交开始时间 yyyy-MM-dd HH:mm:ss
     * @param StartTime 提交开始时间 yyyy-MM-dd HH:mm:ss
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 提交结束时间 yyyy-MM-dd HH:mm:ss 
     * @return EndTime 提交结束时间 yyyy-MM-dd HH:mm:ss
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 提交结束时间 yyyy-MM-dd HH:mm:ss
     * @param EndTime 提交结束时间 yyyy-MM-dd HH:mm:ss
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 文件夹id 
     * @return FolderIds 文件夹id
     */
    public String [] getFolderIds() {
        return this.FolderIds;
    }

    /**
     * Set 文件夹id
     * @param FolderIds 文件夹id
     */
    public void setFolderIds(String [] FolderIds) {
        this.FolderIds = FolderIds;
    }

    /**
     * Get 工作流id 
     * @return WorkflowIds 工作流id
     */
    public String [] getWorkflowIds() {
        return this.WorkflowIds;
    }

    /**
     * Set 工作流id
     * @param WorkflowIds 工作流id
     */
    public void setWorkflowIds(String [] WorkflowIds) {
        this.WorkflowIds = WorkflowIds;
    }

    /**
     * Get 只看我的 
     * @return JustMe 只看我的
     */
    public Boolean getJustMe() {
        return this.JustMe;
    }

    /**
     * Set 只看我的
     * @param JustMe 只看我的
     */
    public void setJustMe(Boolean JustMe) {
        this.JustMe = JustMe;
    }

    /**
     * Get 任务类型 
     * @return TaskTypes 任务类型
     */
    public String [] getTaskTypes() {
        return this.TaskTypes;
    }

    /**
     * Set 任务类型
     * @param TaskTypes 任务类型
     */
    public void setTaskTypes(String [] TaskTypes) {
        this.TaskTypes = TaskTypes;
    }

    /**
     * Get 试运行提交人userId列表 
     * @return SubmitUsers 试运行提交人userId列表
     */
    public String [] getSubmitUsers() {
        return this.SubmitUsers;
    }

    /**
     * Set 试运行提交人userId列表
     * @param SubmitUsers 试运行提交人userId列表
     */
    public void setSubmitUsers(String [] SubmitUsers) {
        this.SubmitUsers = SubmitUsers;
    }

    /**
     * Get 试运行状态 
     * @return StatusList 试运行状态
     */
    public String [] getStatusList() {
        return this.StatusList;
    }

    /**
     * Set 试运行状态
     * @param StatusList 试运行状态
     */
    public void setStatusList(String [] StatusList) {
        this.StatusList = StatusList;
    }

    public DescribeDrInstancePageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDrInstancePageRequest(DescribeDrInstancePageRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.TaskSource != null) {
            this.TaskSource = new String(source.TaskSource);
        }
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.FolderIds != null) {
            this.FolderIds = new String[source.FolderIds.length];
            for (int i = 0; i < source.FolderIds.length; i++) {
                this.FolderIds[i] = new String(source.FolderIds[i]);
            }
        }
        if (source.WorkflowIds != null) {
            this.WorkflowIds = new String[source.WorkflowIds.length];
            for (int i = 0; i < source.WorkflowIds.length; i++) {
                this.WorkflowIds[i] = new String(source.WorkflowIds[i]);
            }
        }
        if (source.JustMe != null) {
            this.JustMe = new Boolean(source.JustMe);
        }
        if (source.TaskTypes != null) {
            this.TaskTypes = new String[source.TaskTypes.length];
            for (int i = 0; i < source.TaskTypes.length; i++) {
                this.TaskTypes[i] = new String(source.TaskTypes[i]);
            }
        }
        if (source.SubmitUsers != null) {
            this.SubmitUsers = new String[source.SubmitUsers.length];
            for (int i = 0; i < source.SubmitUsers.length; i++) {
                this.SubmitUsers[i] = new String(source.SubmitUsers[i]);
            }
        }
        if (source.StatusList != null) {
            this.StatusList = new String[source.StatusList.length];
            for (int i = 0; i < source.StatusList.length; i++) {
                this.StatusList[i] = new String(source.StatusList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskSource", this.TaskSource);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "FolderIds.", this.FolderIds);
        this.setParamArraySimple(map, prefix + "WorkflowIds.", this.WorkflowIds);
        this.setParamSimple(map, prefix + "JustMe", this.JustMe);
        this.setParamArraySimple(map, prefix + "TaskTypes.", this.TaskTypes);
        this.setParamArraySimple(map, prefix + "SubmitUsers.", this.SubmitUsers);
        this.setParamArraySimple(map, prefix + "StatusList.", this.StatusList);

    }
}

