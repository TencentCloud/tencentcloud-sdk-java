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
package com.tencentcloudapi.tione.v20191022.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCodeRepositoriesRequest extends AbstractModel{

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件。
instance-name - String - 是否必填：否 -（过滤条件）按照名称过滤。
search-by-name - String - 是否必填：否 -（过滤条件）按照名称检索，模糊匹配。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序规则。默认取Descending
Descending 按更新时间降序
Ascending 按更新时间升序
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20 
     * @return Limit 返回数量，默认为20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20
     * @param Limit 返回数量，默认为20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件。
instance-name - String - 是否必填：否 -（过滤条件）按照名称过滤。
search-by-name - String - 是否必填：否 -（过滤条件）按照名称检索，模糊匹配。 
     * @return Filters 过滤条件。
instance-name - String - 是否必填：否 -（过滤条件）按照名称过滤。
search-by-name - String - 是否必填：否 -（过滤条件）按照名称检索，模糊匹配。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
instance-name - String - 是否必填：否 -（过滤条件）按照名称过滤。
search-by-name - String - 是否必填：否 -（过滤条件）按照名称检索，模糊匹配。
     * @param Filters 过滤条件。
instance-name - String - 是否必填：否 -（过滤条件）按照名称过滤。
search-by-name - String - 是否必填：否 -（过滤条件）按照名称检索，模糊匹配。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序规则。默认取Descending
Descending 按更新时间降序
Ascending 按更新时间升序 
     * @return SortOrder 排序规则。默认取Descending
Descending 按更新时间降序
Ascending 按更新时间升序
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set 排序规则。默认取Descending
Descending 按更新时间降序
Ascending 按更新时间升序
     * @param SortOrder 排序规则。默认取Descending
Descending 按更新时间降序
Ascending 按更新时间升序
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    public DescribeCodeRepositoriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCodeRepositoriesRequest(DescribeCodeRepositoriesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);

    }
}

