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

public class DescribeRuleTemplatesByPageRequest extends AbstractModel{

    /**
    * 当前页
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页记录数
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 工作空间ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 通用排序字段
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderField [] OrderFields;

    /**
    * 通用过滤条件
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 当前页 
     * @return PageNumber 当前页
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 当前页
     * @param PageNumber 当前页
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页记录数 
     * @return PageSize 每页记录数
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页记录数
     * @param PageSize 每页记录数
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 工作空间ID 
     * @return ProjectId 工作空间ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 工作空间ID
     * @param ProjectId 工作空间ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 通用排序字段 
     * @return OrderFields 通用排序字段
     */
    public OrderField [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set 通用排序字段
     * @param OrderFields 通用排序字段
     */
    public void setOrderFields(OrderField [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    /**
     * Get 通用过滤条件 
     * @return Filters 通用过滤条件
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 通用过滤条件
     * @param Filters 通用过滤条件
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeRuleTemplatesByPageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRuleTemplatesByPageRequest(DescribeRuleTemplatesByPageRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
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
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArrayObj(map, prefix + "OrderFields.", this.OrderFields);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

