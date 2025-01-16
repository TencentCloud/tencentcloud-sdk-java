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

public class DescribeTaskTableMetricOverviewRequest extends AbstractModel {

    /**
    * 任务TaskId
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 来源类型，支持枚举： SOURCE、SINK
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

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
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 任务类型：201. stream, 202. offline，当前只支持实时201
    */
    @SerializedName("TaskType")
    @Expose
    private Long TaskType;

    /**
    * 根据SchemaName来模糊搜索
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderFields [] OrderFields;

    /**
     * Get 任务TaskId 
     * @return TaskId 任务TaskId
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务TaskId
     * @param TaskId 任务TaskId
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 来源类型，支持枚举： SOURCE、SINK 
     * @return NodeType 来源类型，支持枚举： SOURCE、SINK
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 来源类型，支持枚举： SOURCE、SINK
     * @param NodeType 来源类型，支持枚举： SOURCE、SINK
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
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
     * Get 任务类型：201. stream, 202. offline，当前只支持实时201 
     * @return TaskType 任务类型：201. stream, 202. offline，当前只支持实时201
     */
    public Long getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型：201. stream, 202. offline，当前只支持实时201
     * @param TaskType 任务类型：201. stream, 202. offline，当前只支持实时201
     */
    public void setTaskType(Long TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 根据SchemaName来模糊搜索 
     * @return Filters 根据SchemaName来模糊搜索
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 根据SchemaName来模糊搜索
     * @param Filters 根据SchemaName来模糊搜索
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序 
     * @return OrderFields 排序
     */
    public OrderFields [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set 排序
     * @param OrderFields 排序
     */
    public void setOrderFields(OrderFields [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    public DescribeTaskTableMetricOverviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskTableMetricOverviewRequest(DescribeTaskTableMetricOverviewRequest source) {
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
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
        if (source.TaskType != null) {
            this.TaskType = new Long(source.TaskType);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.OrderFields != null) {
            this.OrderFields = new OrderFields[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new OrderFields(source.OrderFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "OrderFields.", this.OrderFields);

    }
}

