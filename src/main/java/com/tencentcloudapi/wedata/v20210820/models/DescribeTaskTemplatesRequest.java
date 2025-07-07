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

public class DescribeTaskTemplatesRequest extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 页号
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 分页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 排序字段, 仅支持更新时间, 取值示例

- UpdateTime
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderField [] OrderFields;

    /**
    * 过滤条件, 取值列表

- TemplateName    模版名称
- TaskType    支持任务类型
- InCharge    责任人
- FolderId    文件夹id
- Status    提交状态
- UpdateStartTime    更新时间,时间区间查询
- UpdateEndTime    更新时间,时间区间查询
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

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
     * @return PageNumber 页号
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页号
     * @param PageNumber 页号
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页大小 
     * @return PageSize 分页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页大小
     * @param PageSize 分页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 排序字段, 仅支持更新时间, 取值示例

- UpdateTime 
     * @return OrderFields 排序字段, 仅支持更新时间, 取值示例

- UpdateTime
     */
    public OrderField [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set 排序字段, 仅支持更新时间, 取值示例

- UpdateTime
     * @param OrderFields 排序字段, 仅支持更新时间, 取值示例

- UpdateTime
     */
    public void setOrderFields(OrderField [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    /**
     * Get 过滤条件, 取值列表

- TemplateName    模版名称
- TaskType    支持任务类型
- InCharge    责任人
- FolderId    文件夹id
- Status    提交状态
- UpdateStartTime    更新时间,时间区间查询
- UpdateEndTime    更新时间,时间区间查询 
     * @return Filters 过滤条件, 取值列表

- TemplateName    模版名称
- TaskType    支持任务类型
- InCharge    责任人
- FolderId    文件夹id
- Status    提交状态
- UpdateStartTime    更新时间,时间区间查询
- UpdateEndTime    更新时间,时间区间查询
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件, 取值列表

- TemplateName    模版名称
- TaskType    支持任务类型
- InCharge    责任人
- FolderId    文件夹id
- Status    提交状态
- UpdateStartTime    更新时间,时间区间查询
- UpdateEndTime    更新时间,时间区间查询
     * @param Filters 过滤条件, 取值列表

- TemplateName    模版名称
- TaskType    支持任务类型
- InCharge    责任人
- FolderId    文件夹id
- Status    提交状态
- UpdateStartTime    更新时间,时间区间查询
- UpdateEndTime    更新时间,时间区间查询
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeTaskTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTaskTemplatesRequest(DescribeTaskTemplatesRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.OrderFields != null) {
            this.OrderFields = new OrderField[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new OrderField(source.OrderFields[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "OrderFields.", this.OrderFields);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

