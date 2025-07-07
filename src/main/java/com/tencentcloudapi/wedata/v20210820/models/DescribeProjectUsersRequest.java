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

public class DescribeProjectUsersRequest extends AbstractModel {

    /**
    * 分页号
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
    * 【过滤参数】自定义条件查询
    */
    @SerializedName("Filters")
    @Expose
    private FilterOptional [] Filters;

    /**
    * 【排序参数】排序字段
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderFieldOptional [] OrderFields;

    /**
    * 是否项目管理员
    */
    @SerializedName("IsProjectAdmin")
    @Expose
    private Boolean IsProjectAdmin;

    /**
     * Get 分页号 
     * @return PageNumber 分页号
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页号
     * @param PageNumber 分页号
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
     * Get 【过滤参数】自定义条件查询 
     * @return Filters 【过滤参数】自定义条件查询
     */
    public FilterOptional [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 【过滤参数】自定义条件查询
     * @param Filters 【过滤参数】自定义条件查询
     */
    public void setFilters(FilterOptional [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 【排序参数】排序字段 
     * @return OrderFields 【排序参数】排序字段
     */
    public OrderFieldOptional [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set 【排序参数】排序字段
     * @param OrderFields 【排序参数】排序字段
     */
    public void setOrderFields(OrderFieldOptional [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    /**
     * Get 是否项目管理员 
     * @return IsProjectAdmin 是否项目管理员
     */
    public Boolean getIsProjectAdmin() {
        return this.IsProjectAdmin;
    }

    /**
     * Set 是否项目管理员
     * @param IsProjectAdmin 是否项目管理员
     */
    public void setIsProjectAdmin(Boolean IsProjectAdmin) {
        this.IsProjectAdmin = IsProjectAdmin;
    }

    public DescribeProjectUsersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProjectUsersRequest(DescribeProjectUsersRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Filters != null) {
            this.Filters = new FilterOptional[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new FilterOptional(source.Filters[i]);
            }
        }
        if (source.OrderFields != null) {
            this.OrderFields = new OrderFieldOptional[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new OrderFieldOptional(source.OrderFields[i]);
            }
        }
        if (source.IsProjectAdmin != null) {
            this.IsProjectAdmin = new Boolean(source.IsProjectAdmin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "OrderFields.", this.OrderFields);
        this.setParamSimple(map, prefix + "IsProjectAdmin", this.IsProjectAdmin);

    }
}

