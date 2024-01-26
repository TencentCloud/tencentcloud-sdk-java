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

public class DescribeTasksForProjectCloneRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 页号
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 分页大小
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 排序类型。两种取值 DESC、ASC，当前仅支持按提交时间排序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 任务名称（筛选用）
    */
    @SerializedName("FilterTaskName")
    @Expose
    private String FilterTaskName;

    /**
    * 任务责任人名称
    */
    @SerializedName("OwnerName")
    @Expose
    private String OwnerName;

    /**
    * 工作流名称
    */
    @SerializedName("WorkflowName")
    @Expose
    private String WorkflowName;

    /**
    * 任务状态
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * 提交开始时间（筛选用）
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 提交结束时间（筛选用）
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

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
     * Get 页号 
     * @return Page 页号
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 页号
     * @param Page 页号
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 分页大小 
     * @return Size 分页大小
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 分页大小
     * @param Size 分页大小
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 排序类型。两种取值 DESC、ASC，当前仅支持按提交时间排序 
     * @return Order 排序类型。两种取值 DESC、ASC，当前仅支持按提交时间排序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序类型。两种取值 DESC、ASC，当前仅支持按提交时间排序
     * @param Order 排序类型。两种取值 DESC、ASC，当前仅支持按提交时间排序
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 任务名称（筛选用） 
     * @return FilterTaskName 任务名称（筛选用）
     */
    public String getFilterTaskName() {
        return this.FilterTaskName;
    }

    /**
     * Set 任务名称（筛选用）
     * @param FilterTaskName 任务名称（筛选用）
     */
    public void setFilterTaskName(String FilterTaskName) {
        this.FilterTaskName = FilterTaskName;
    }

    /**
     * Get 任务责任人名称 
     * @return OwnerName 任务责任人名称
     */
    public String getOwnerName() {
        return this.OwnerName;
    }

    /**
     * Set 任务责任人名称
     * @param OwnerName 任务责任人名称
     */
    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    /**
     * Get 工作流名称 
     * @return WorkflowName 工作流名称
     */
    public String getWorkflowName() {
        return this.WorkflowName;
    }

    /**
     * Set 工作流名称
     * @param WorkflowName 工作流名称
     */
    public void setWorkflowName(String WorkflowName) {
        this.WorkflowName = WorkflowName;
    }

    /**
     * Get 任务状态 
     * @return TaskStatus 任务状态
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set 任务状态
     * @param TaskStatus 任务状态
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get 提交开始时间（筛选用） 
     * @return StartTime 提交开始时间（筛选用）
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 提交开始时间（筛选用）
     * @param StartTime 提交开始时间（筛选用）
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 提交结束时间（筛选用） 
     * @return EndTime 提交结束时间（筛选用）
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 提交结束时间（筛选用）
     * @param EndTime 提交结束时间（筛选用）
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public DescribeTasksForProjectCloneRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTasksForProjectCloneRequest(DescribeTasksForProjectCloneRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.FilterTaskName != null) {
            this.FilterTaskName = new String(source.FilterTaskName);
        }
        if (source.OwnerName != null) {
            this.OwnerName = new String(source.OwnerName);
        }
        if (source.WorkflowName != null) {
            this.WorkflowName = new String(source.WorkflowName);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "FilterTaskName", this.FilterTaskName);
        this.setParamSimple(map, prefix + "OwnerName", this.OwnerName);
        this.setParamSimple(map, prefix + "WorkflowName", this.WorkflowName);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

