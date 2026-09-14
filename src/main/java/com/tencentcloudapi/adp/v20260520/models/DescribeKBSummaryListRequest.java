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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKBSummaryListRequest extends AbstractModel {

    /**
    * <p>工作空间 ID</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
    * <p>通用过滤</p>
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

    /**
    * <p>分页页码，从 0 开始</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>每页数量，默认 10，最大 100</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>关键词</p>
    */
    @SerializedName("Query")
    @Expose
    private String Query;

    /**
     * Get <p>工作空间 ID</p> 
     * @return SpaceId <p>工作空间 ID</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>工作空间 ID</p>
     * @param SpaceId <p>工作空间 ID</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    /**
     * Get <p>通用过滤</p> 
     * @return FilterList <p>通用过滤</p>
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set <p>通用过滤</p>
     * @param FilterList <p>通用过滤</p>
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
    }

    /**
     * Get <p>分页页码，从 0 开始</p> 
     * @return PageNumber <p>分页页码，从 0 开始</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>分页页码，从 0 开始</p>
     * @param PageNumber <p>分页页码，从 0 开始</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>每页数量，默认 10，最大 100</p> 
     * @return PageSize <p>每页数量，默认 10，最大 100</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>每页数量，默认 10，最大 100</p>
     * @param PageSize <p>每页数量，默认 10，最大 100</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>关键词</p> 
     * @return Query <p>关键词</p>
     */
    public String getQuery() {
        return this.Query;
    }

    /**
     * Set <p>关键词</p>
     * @param Query <p>关键词</p>
     */
    public void setQuery(String Query) {
        this.Query = Query;
    }

    public DescribeKBSummaryListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKBSummaryListRequest(DescribeKBSummaryListRequest source) {
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
        if (source.FilterList != null) {
            this.FilterList = new Filter[source.FilterList.length];
            for (int i = 0; i < source.FilterList.length; i++) {
                this.FilterList[i] = new Filter(source.FilterList[i]);
            }
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Query != null) {
            this.Query = new String(source.Query);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);
        this.setParamArrayObj(map, prefix + "FilterList.", this.FilterList);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Query", this.Query);

    }
}

