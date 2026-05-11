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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProgramsRequest extends AbstractModel {

    /**
    * <p>模糊查询数据集ID，数据集名称，不传入时查询全量</p>
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * <p>每页数量，默认值20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>起始偏移量，默认值0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>模糊查询，传递模糊查询字段和对应的值</p>
    */
    @SerializedName("SearchFilters")
    @Expose
    private SearchFiltersProgram SearchFilters;

    /**
     * Get <p>模糊查询数据集ID，数据集名称，不传入时查询全量</p> 
     * @return SearchWord <p>模糊查询数据集ID，数据集名称，不传入时查询全量</p>
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set <p>模糊查询数据集ID，数据集名称，不传入时查询全量</p>
     * @param SearchWord <p>模糊查询数据集ID，数据集名称，不传入时查询全量</p>
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get <p>每页数量，默认值20</p> 
     * @return Limit <p>每页数量，默认值20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页数量，默认值20</p>
     * @param Limit <p>每页数量，默认值20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>起始偏移量，默认值0</p> 
     * @return Offset <p>起始偏移量，默认值0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>起始偏移量，默认值0</p>
     * @param Offset <p>起始偏移量，默认值0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>模糊查询，传递模糊查询字段和对应的值</p> 
     * @return SearchFilters <p>模糊查询，传递模糊查询字段和对应的值</p>
     */
    public SearchFiltersProgram getSearchFilters() {
        return this.SearchFilters;
    }

    /**
     * Set <p>模糊查询，传递模糊查询字段和对应的值</p>
     * @param SearchFilters <p>模糊查询，传递模糊查询字段和对应的值</p>
     */
    public void setSearchFilters(SearchFiltersProgram SearchFilters) {
        this.SearchFilters = SearchFilters;
    }

    public DescribeProgramsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeProgramsRequest(DescribeProgramsRequest source) {
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.SearchFilters != null) {
            this.SearchFilters = new SearchFiltersProgram(source.SearchFilters);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamObj(map, prefix + "SearchFilters.", this.SearchFilters);

    }
}

