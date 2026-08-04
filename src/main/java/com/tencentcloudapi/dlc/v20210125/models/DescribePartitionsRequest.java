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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePartitionsRequest extends AbstractModel {

    /**
    * 页码，从1开始，默认为1
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 每页返回数量，默认为10
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 排序字段列表，按数组顺序依次应用，可选
    */
    @SerializedName("SortFields")
    @Expose
    private SortField [] SortFields;

    /**
    * 筛选条件列表，多个条件之间为AND关系，可选
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 页码，从1开始，默认为1 
     * @return Page 页码，从1开始，默认为1
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 页码，从1开始，默认为1
     * @param Page 页码，从1开始，默认为1
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 每页返回数量，默认为10 
     * @return PageSize 每页返回数量，默认为10
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页返回数量，默认为10
     * @param PageSize 每页返回数量，默认为10
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 排序字段列表，按数组顺序依次应用，可选 
     * @return SortFields 排序字段列表，按数组顺序依次应用，可选
     */
    public SortField [] getSortFields() {
        return this.SortFields;
    }

    /**
     * Set 排序字段列表，按数组顺序依次应用，可选
     * @param SortFields 排序字段列表，按数组顺序依次应用，可选
     */
    public void setSortFields(SortField [] SortFields) {
        this.SortFields = SortFields;
    }

    /**
     * Get 筛选条件列表，多个条件之间为AND关系，可选 
     * @return Filters 筛选条件列表，多个条件之间为AND关系，可选
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 筛选条件列表，多个条件之间为AND关系，可选
     * @param Filters 筛选条件列表，多个条件之间为AND关系，可选
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribePartitionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePartitionsRequest(DescribePartitionsRequest source) {
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.SortFields != null) {
            this.SortFields = new SortField[source.SortFields.length];
            for (int i = 0; i < source.SortFields.length; i++) {
                this.SortFields[i] = new SortField(source.SortFields[i]);
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
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "SortFields.", this.SortFields);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

