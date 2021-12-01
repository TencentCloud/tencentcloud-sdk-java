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

public class DescribeMediasRequest extends AbstractModel{

    /**
    * 分页序号，从1开始
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每个分页所包含的元素数量，最大为50
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 列举过滤条件，相关限制相见MediaFilter
    */
    @SerializedName("MediaFilter")
    @Expose
    private MediaFilter MediaFilter;

    /**
    * 返回结果排序信息，By字段只支持CreateTime
    */
    @SerializedName("SortBy")
    @Expose
    private SortBy SortBy;

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
     * Get 每个分页所包含的元素数量，最大为50 
     * @return PageSize 每个分页所包含的元素数量，最大为50
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每个分页所包含的元素数量，最大为50
     * @param PageSize 每个分页所包含的元素数量，最大为50
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 列举过滤条件，相关限制相见MediaFilter 
     * @return MediaFilter 列举过滤条件，相关限制相见MediaFilter
     */
    public MediaFilter getMediaFilter() {
        return this.MediaFilter;
    }

    /**
     * Set 列举过滤条件，相关限制相见MediaFilter
     * @param MediaFilter 列举过滤条件，相关限制相见MediaFilter
     */
    public void setMediaFilter(MediaFilter MediaFilter) {
        this.MediaFilter = MediaFilter;
    }

    /**
     * Get 返回结果排序信息，By字段只支持CreateTime 
     * @return SortBy 返回结果排序信息，By字段只支持CreateTime
     */
    public SortBy getSortBy() {
        return this.SortBy;
    }

    /**
     * Set 返回结果排序信息，By字段只支持CreateTime
     * @param SortBy 返回结果排序信息，By字段只支持CreateTime
     */
    public void setSortBy(SortBy SortBy) {
        this.SortBy = SortBy;
    }

    public DescribeMediasRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMediasRequest(DescribeMediasRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.MediaFilter != null) {
            this.MediaFilter = new MediaFilter(source.MediaFilter);
        }
        if (source.SortBy != null) {
            this.SortBy = new SortBy(source.SortBy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamObj(map, prefix + "MediaFilter.", this.MediaFilter);
        this.setParamObj(map, prefix + "SortBy.", this.SortBy);

    }
}

