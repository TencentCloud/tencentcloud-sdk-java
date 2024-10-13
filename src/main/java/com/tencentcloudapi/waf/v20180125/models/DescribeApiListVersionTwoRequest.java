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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApiListVersionTwoRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 页面索引，第几页
    */
    @SerializedName("PageIndex")
    @Expose
    private Long PageIndex;

    /**
    * 页面大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 过滤条件
    */
    @SerializedName("Filters")
    @Expose
    private ApiDataFilter [] Filters;

    /**
    * 排序方法，1 升序，-1 降序
    */
    @SerializedName("Sort")
    @Expose
    private String [] Sort;

    /**
    * 是否进行总数查询
    */
    @SerializedName("NeedTotalCount")
    @Expose
    private Boolean NeedTotalCount;

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
     * Get 页面索引，第几页 
     * @return PageIndex 页面索引，第几页
     */
    public Long getPageIndex() {
        return this.PageIndex;
    }

    /**
     * Set 页面索引，第几页
     * @param PageIndex 页面索引，第几页
     */
    public void setPageIndex(Long PageIndex) {
        this.PageIndex = PageIndex;
    }

    /**
     * Get 页面大小 
     * @return PageSize 页面大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页面大小
     * @param PageSize 页面大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
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
     * Get 排序方法，1 升序，-1 降序 
     * @return Sort 排序方法，1 升序，-1 降序
     */
    public String [] getSort() {
        return this.Sort;
    }

    /**
     * Set 排序方法，1 升序，-1 降序
     * @param Sort 排序方法，1 升序，-1 降序
     */
    public void setSort(String [] Sort) {
        this.Sort = Sort;
    }

    /**
     * Get 是否进行总数查询 
     * @return NeedTotalCount 是否进行总数查询
     */
    public Boolean getNeedTotalCount() {
        return this.NeedTotalCount;
    }

    /**
     * Set 是否进行总数查询
     * @param NeedTotalCount 是否进行总数查询
     */
    public void setNeedTotalCount(Boolean NeedTotalCount) {
        this.NeedTotalCount = NeedTotalCount;
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

    public DescribeApiListVersionTwoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApiListVersionTwoRequest(DescribeApiListVersionTwoRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.PageIndex != null) {
            this.PageIndex = new Long(source.PageIndex);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Filters != null) {
            this.Filters = new ApiDataFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ApiDataFilter(source.Filters[i]);
            }
        }
        if (source.Sort != null) {
            this.Sort = new String[source.Sort.length];
            for (int i = 0; i < source.Sort.length; i++) {
                this.Sort[i] = new String(source.Sort[i]);
            }
        }
        if (source.NeedTotalCount != null) {
            this.NeedTotalCount = new Boolean(source.NeedTotalCount);
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
        this.setParamSimple(map, prefix + "PageIndex", this.PageIndex);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "Sort.", this.Sort);
        this.setParamSimple(map, prefix + "NeedTotalCount", this.NeedTotalCount);
        this.setParamSimple(map, prefix + "StartTs", this.StartTs);
        this.setParamSimple(map, prefix + "EndTs", this.EndTs);

    }
}

