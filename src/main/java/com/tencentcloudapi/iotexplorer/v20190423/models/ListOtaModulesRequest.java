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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListOtaModulesRequest extends AbstractModel {

    /**
    * 获取的页数
    */
    @SerializedName("PageNum")
    @Expose
    private Long PageNum;

    /**
    * 分页的大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 搜索过滤条件
    */
    @SerializedName("Filters")
    @Expose
    private SearchKeyword [] Filters;

    /**
     * Get 获取的页数 
     * @return PageNum 获取的页数
     */
    public Long getPageNum() {
        return this.PageNum;
    }

    /**
     * Set 获取的页数
     * @param PageNum 获取的页数
     */
    public void setPageNum(Long PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * Get 分页的大小 
     * @return PageSize 分页的大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页的大小
     * @param PageSize 分页的大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 搜索过滤条件 
     * @return Filters 搜索过滤条件
     */
    public SearchKeyword [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 搜索过滤条件
     * @param Filters 搜索过滤条件
     */
    public void setFilters(SearchKeyword [] Filters) {
        this.Filters = Filters;
    }

    public ListOtaModulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListOtaModulesRequest(ListOtaModulesRequest source) {
        if (source.PageNum != null) {
            this.PageNum = new Long(source.PageNum);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Filters != null) {
            this.Filters = new SearchKeyword[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new SearchKeyword(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

