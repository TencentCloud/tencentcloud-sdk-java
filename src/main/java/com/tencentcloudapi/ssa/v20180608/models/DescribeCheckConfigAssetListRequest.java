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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCheckConfigAssetListRequest extends AbstractModel{

    /**
    * 检查项UUID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 页码
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页列表数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * db搜索条件
    */
    @SerializedName("Search")
    @Expose
    private Filter [] Search;

    /**
    * ES过滤条件
    */
    @SerializedName("Filter")
    @Expose
    private Filter [] Filter;

    /**
     * Get 检查项UUID 
     * @return Id 检查项UUID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 检查项UUID
     * @param Id 检查项UUID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 页码 
     * @return Offset 页码
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页码
     * @param Offset 页码
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页列表数 
     * @return Limit 每页列表数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页列表数
     * @param Limit 每页列表数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get db搜索条件 
     * @return Search db搜索条件
     */
    public Filter [] getSearch() {
        return this.Search;
    }

    /**
     * Set db搜索条件
     * @param Search db搜索条件
     */
    public void setSearch(Filter [] Search) {
        this.Search = Search;
    }

    /**
     * Get ES过滤条件 
     * @return Filter ES过滤条件
     */
    public Filter [] getFilter() {
        return this.Filter;
    }

    /**
     * Set ES过滤条件
     * @param Filter ES过滤条件
     */
    public void setFilter(Filter [] Filter) {
        this.Filter = Filter;
    }

    public DescribeCheckConfigAssetListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCheckConfigAssetListRequest(DescribeCheckConfigAssetListRequest source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Search != null) {
            this.Search = new Filter[source.Search.length];
            for (int i = 0; i < source.Search.length; i++) {
                this.Search[i] = new Filter(source.Search[i]);
            }
        }
        if (source.Filter != null) {
            this.Filter = new Filter[source.Filter.length];
            for (int i = 0; i < source.Filter.length; i++) {
                this.Filter[i] = new Filter(source.Filter[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Search.", this.Search);
        this.setParamArrayObj(map, prefix + "Filter.", this.Filter);

    }
}

