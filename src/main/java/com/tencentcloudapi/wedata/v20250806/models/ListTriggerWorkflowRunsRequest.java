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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListTriggerWorkflowRunsRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 过滤参数, 工作流名称或ID查询名称: Keyword, 工作流ID查询名称: WorkflowId,文件夹查询名称: FolderId, 负责人查询名称: InChargeUin, 工作流执行id: ExecutionId, 计划调度时间区间: ScheduleTimeGreaterEqual, ScheduleTimeLessEqual
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序字段，排序字段名称	如下开始时间：CreateTime，结束时间：EndTime，计划调度时间：ScheduleTime
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderField [] OrderFields;

    /**
    * 页码
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

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
     * Get 过滤参数, 工作流名称或ID查询名称: Keyword, 工作流ID查询名称: WorkflowId,文件夹查询名称: FolderId, 负责人查询名称: InChargeUin, 工作流执行id: ExecutionId, 计划调度时间区间: ScheduleTimeGreaterEqual, ScheduleTimeLessEqual 
     * @return Filters 过滤参数, 工作流名称或ID查询名称: Keyword, 工作流ID查询名称: WorkflowId,文件夹查询名称: FolderId, 负责人查询名称: InChargeUin, 工作流执行id: ExecutionId, 计划调度时间区间: ScheduleTimeGreaterEqual, ScheduleTimeLessEqual
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤参数, 工作流名称或ID查询名称: Keyword, 工作流ID查询名称: WorkflowId,文件夹查询名称: FolderId, 负责人查询名称: InChargeUin, 工作流执行id: ExecutionId, 计划调度时间区间: ScheduleTimeGreaterEqual, ScheduleTimeLessEqual
     * @param Filters 过滤参数, 工作流名称或ID查询名称: Keyword, 工作流ID查询名称: WorkflowId,文件夹查询名称: FolderId, 负责人查询名称: InChargeUin, 工作流执行id: ExecutionId, 计划调度时间区间: ScheduleTimeGreaterEqual, ScheduleTimeLessEqual
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序字段，排序字段名称	如下开始时间：CreateTime，结束时间：EndTime，计划调度时间：ScheduleTime 
     * @return OrderFields 排序字段，排序字段名称	如下开始时间：CreateTime，结束时间：EndTime，计划调度时间：ScheduleTime
     */
    public OrderField [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set 排序字段，排序字段名称	如下开始时间：CreateTime，结束时间：EndTime，计划调度时间：ScheduleTime
     * @param OrderFields 排序字段，排序字段名称	如下开始时间：CreateTime，结束时间：EndTime，计划调度时间：ScheduleTime
     */
    public void setOrderFields(OrderField [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    /**
     * Get 页码 
     * @return PageNumber 页码
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码
     * @param PageNumber 页码
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 页大小 
     * @return PageSize 页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页大小
     * @param PageSize 页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListTriggerWorkflowRunsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTriggerWorkflowRunsRequest(ListTriggerWorkflowRunsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.OrderFields != null) {
            this.OrderFields = new OrderField[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new OrderField(source.OrderFields[i]);
            }
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "OrderFields.", this.OrderFields);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

