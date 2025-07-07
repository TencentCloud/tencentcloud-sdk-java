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

public class DescribeTasksForCodeTemplateRequest extends AbstractModel {

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 页码，最小1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 单页大小，最小10，最大200
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 模板id
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
    * 工作流id列表
    */
    @SerializedName("WorkflowIdList")
    @Expose
    private String [] WorkflowIdList;

    /**
    * 责任人名列表
    */
    @SerializedName("OwnerIdList")
    @Expose
    private String [] OwnerIdList;

    /**
    * 任务名
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 排序提交，目前只支持workflowName
    */
    @SerializedName("OrderCondition")
    @Expose
    private OrderCondition OrderCondition;

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
     * Get 页码，最小1 
     * @return PageNumber 页码，最小1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码，最小1
     * @param PageNumber 页码，最小1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 单页大小，最小10，最大200 
     * @return PageSize 单页大小，最小10，最大200
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 单页大小，最小10，最大200
     * @param PageSize 单页大小，最小10，最大200
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 模板id 
     * @return TemplateId 模板id
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模板id
     * @param TemplateId 模板id
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 工作流id列表 
     * @return WorkflowIdList 工作流id列表
     */
    public String [] getWorkflowIdList() {
        return this.WorkflowIdList;
    }

    /**
     * Set 工作流id列表
     * @param WorkflowIdList 工作流id列表
     */
    public void setWorkflowIdList(String [] WorkflowIdList) {
        this.WorkflowIdList = WorkflowIdList;
    }

    /**
     * Get 责任人名列表 
     * @return OwnerIdList 责任人名列表
     */
    public String [] getOwnerIdList() {
        return this.OwnerIdList;
    }

    /**
     * Set 责任人名列表
     * @param OwnerIdList 责任人名列表
     */
    public void setOwnerIdList(String [] OwnerIdList) {
        this.OwnerIdList = OwnerIdList;
    }

    /**
     * Get 任务名 
     * @return TaskName 任务名
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 任务名
     * @param TaskName 任务名
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 排序提交，目前只支持workflowName 
     * @return OrderCondition 排序提交，目前只支持workflowName
     */
    public OrderCondition getOrderCondition() {
        return this.OrderCondition;
    }

    /**
     * Set 排序提交，目前只支持workflowName
     * @param OrderCondition 排序提交，目前只支持workflowName
     */
    public void setOrderCondition(OrderCondition OrderCondition) {
        this.OrderCondition = OrderCondition;
    }

    public DescribeTasksForCodeTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTasksForCodeTemplateRequest(DescribeTasksForCodeTemplateRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
        if (source.WorkflowIdList != null) {
            this.WorkflowIdList = new String[source.WorkflowIdList.length];
            for (int i = 0; i < source.WorkflowIdList.length; i++) {
                this.WorkflowIdList[i] = new String(source.WorkflowIdList[i]);
            }
        }
        if (source.OwnerIdList != null) {
            this.OwnerIdList = new String[source.OwnerIdList.length];
            for (int i = 0; i < source.OwnerIdList.length; i++) {
                this.OwnerIdList[i] = new String(source.OwnerIdList[i]);
            }
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.OrderCondition != null) {
            this.OrderCondition = new OrderCondition(source.OrderCondition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamArraySimple(map, prefix + "WorkflowIdList.", this.WorkflowIdList);
        this.setParamArraySimple(map, prefix + "OwnerIdList.", this.OwnerIdList);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamObj(map, prefix + "OrderCondition.", this.OrderCondition);

    }
}

