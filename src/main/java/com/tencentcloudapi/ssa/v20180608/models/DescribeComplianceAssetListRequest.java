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

public class DescribeComplianceAssetListRequest extends AbstractModel{

    /**
    * 页码
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 检查项uuid
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 过滤条件
    */
    @SerializedName("Filter")
    @Expose
    private Filter [] Filter;

    /**
    * 查询条件
    */
    @SerializedName("Search")
    @Expose
    private Filter [] Search;

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
     * Get 每页数量 
     * @return Limit 每页数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页数量
     * @param Limit 每页数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 检查项uuid 
     * @return Id 检查项uuid
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 检查项uuid
     * @param Id 检查项uuid
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 过滤条件 
     * @return Filter 过滤条件
     */
    public Filter [] getFilter() {
        return this.Filter;
    }

    /**
     * Set 过滤条件
     * @param Filter 过滤条件
     */
    public void setFilter(Filter [] Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 查询条件 
     * @return Search 查询条件
     */
    public Filter [] getSearch() {
        return this.Search;
    }

    /**
     * Set 查询条件
     * @param Search 查询条件
     */
    public void setSearch(Filter [] Search) {
        this.Search = Search;
    }

    public DescribeComplianceAssetListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeComplianceAssetListRequest(DescribeComplianceAssetListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Filter != null) {
            this.Filter = new Filter[source.Filter.length];
            for (int i = 0; i < source.Filter.length; i++) {
                this.Filter[i] = new Filter(source.Filter[i]);
            }
        }
        if (source.Search != null) {
            this.Search = new Filter[source.Search.length];
            for (int i = 0; i < source.Search.length; i++) {
                this.Search[i] = new Filter(source.Search[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "Filter.", this.Filter);
        this.setParamArrayObj(map, prefix + "Search.", this.Search);

    }
}

