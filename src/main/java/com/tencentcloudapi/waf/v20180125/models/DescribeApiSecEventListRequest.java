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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApiSecEventListRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 是否查询数量，默认不查询，为true则进行查询
    */
    @SerializedName("NeedTotalCount")
    @Expose
    private Boolean NeedTotalCount;

    /**
    * 过滤条件
    */
    @SerializedName("Filters")
    @Expose
    private ApiDataFilter [] Filters;

    /**
    * 查询当前的页
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * 每一页显示多少条数据
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 排序，第一个元素为排序的key，第二个元素为排序规则，其中1 为升序排列，而-1 是用于降序排列
    */
    @SerializedName("Sort")
    @Expose
    private String [] Sort;

    /**
    * 查询开始时间
    */
    @SerializedName("StartTs")
    @Expose
    private Long StartTs;

    /**
    * 查询结束时间
    */
    @SerializedName("EndTs")
    @Expose
    private Long EndTs;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 是否查询数量，默认不查询，为true则进行查询 
     * @return NeedTotalCount 是否查询数量，默认不查询，为true则进行查询
     */
    public Boolean getNeedTotalCount() {
        return this.NeedTotalCount;
    }

    /**
     * Set 是否查询数量，默认不查询，为true则进行查询
     * @param NeedTotalCount 是否查询数量，默认不查询，为true则进行查询
     */
    public void setNeedTotalCount(Boolean NeedTotalCount) {
        this.NeedTotalCount = NeedTotalCount;
    }

    /**
     * Get 过滤条件 
     * @return Filters 过滤条件
     */
    public ApiDataFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件
     * @param Filters 过滤条件
     */
    public void setFilters(ApiDataFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 查询当前的页 
     * @return PageIndex 查询当前的页
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set 查询当前的页
     * @param PageIndex 查询当前的页
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get 每一页显示多少条数据 
     * @return PageSize 每一页显示多少条数据
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每一页显示多少条数据
     * @param PageSize 每一页显示多少条数据
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 排序，第一个元素为排序的key，第二个元素为排序规则，其中1 为升序排列，而-1 是用于降序排列 
     * @return Sort 排序，第一个元素为排序的key，第二个元素为排序规则，其中1 为升序排列，而-1 是用于降序排列
     */
    public String [] getSort() {
        return this.Sort;
    }

    /**
     * Set 排序，第一个元素为排序的key，第二个元素为排序规则，其中1 为升序排列，而-1 是用于降序排列
     * @param Sort 排序，第一个元素为排序的key，第二个元素为排序规则，其中1 为升序排列，而-1 是用于降序排列
     */
    public void setSort(String [] Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 查询开始时间 
     * @return StartTs 查询开始时间
     */
    public Long getStartTs() {
        return this.StartTs;
    }

    /**
     * Set 查询开始时间
     * @param StartTs 查询开始时间
     */
    public void setStartTs(Long StartTs) {
        this.StartTs = StartTs;
    }

    /**
     * Get 查询结束时间 
     * @return EndTs 查询结束时间
     */
    public Long getEndTs() {
        return this.EndTs;
    }

    /**
     * Set 查询结束时间
     * @param EndTs 查询结束时间
     */
    public void setEndTs(Long EndTs) {
        this.EndTs = EndTs;
    }

    public DescribeApiSecEventListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApiSecEventListRequest(DescribeApiSecEventListRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.NeedTotalCount != null) {
            this.NeedTotalCount = new Boolean(source.NeedTotalCount);
        }
        if (source.Filters != null) {
            this.Filters = new ApiDataFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ApiDataFilter(source.Filters[i]);
            }
        }
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Sort != null) {
            this.Sort = new String[source.Sort.length];
            for (int i = 0; i < source.Sort.length; i++) {
                this.Sort[i] = new String(source.Sort[i]);
            }
        }
        if (source.StartTs != null) {
            this.StartTs = new Long(source.StartTs);
        }
        if (source.EndTs != null) {
            this.EndTs = new Long(source.EndTs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "NeedTotalCount", this.NeedTotalCount);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArraySimple(map, prefix + "Sort.", this.Sort);
        this.setParamSimple(map, prefix + "StartTs", this.StartTs);
        this.setParamSimple(map, prefix + "EndTs", this.EndTs);

    }
}

