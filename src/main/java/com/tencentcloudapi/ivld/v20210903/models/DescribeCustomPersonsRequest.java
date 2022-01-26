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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCustomPersonsRequest extends AbstractModel{

    /**
    * 分页序号，从1开始
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 分页数据行数，最多50
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 排序信息，默认倒序
    */
    @SerializedName("SortBy")
    @Expose
    private SortBy SortBy;

    /**
    * 自定义人物过滤条件
    */
    @SerializedName("Filter")
    @Expose
    private CustomPersonFilter Filter;

    /**
     * Get 分页序号，从1开始 
     * @return PageNumber 分页序号，从1开始
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 分页序号，从1开始
     * @param PageNumber 分页序号，从1开始
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 分页数据行数，最多50 
     * @return PageSize 分页数据行数，最多50
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页数据行数，最多50
     * @param PageSize 分页数据行数，最多50
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 排序信息，默认倒序 
     * @return SortBy 排序信息，默认倒序
     */
    public SortBy getSortBy() {
        return this.SortBy;
    }

    /**
     * Set 排序信息，默认倒序
     * @param SortBy 排序信息，默认倒序
     */
    public void setSortBy(SortBy SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get 自定义人物过滤条件 
     * @return Filter 自定义人物过滤条件
     */
    public CustomPersonFilter getFilter() {
        return this.Filter;
    }

    /**
     * Set 自定义人物过滤条件
     * @param Filter 自定义人物过滤条件
     */
    public void setFilter(CustomPersonFilter Filter) {
        this.Filter = Filter;
    }

    public DescribeCustomPersonsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomPersonsRequest(DescribeCustomPersonsRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.SortBy != null) {
            this.SortBy = new SortBy(source.SortBy);
        }
        if (source.Filter != null) {
            this.Filter = new CustomPersonFilter(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamObj(map, prefix + "SortBy.", this.SortBy);
        this.setParamObj(map, prefix + "Filter.", this.Filter);

    }
}

