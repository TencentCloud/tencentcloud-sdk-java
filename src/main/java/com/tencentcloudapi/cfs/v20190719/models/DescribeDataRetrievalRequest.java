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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDataRetrievalRequest extends AbstractModel {

    /**
    * <p>分页偏移量，默认值为 0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页单页限制数目，默认值为 20，最大值为 100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>过滤条件列表。支持的过滤字段：FileSystemId（文件系统 ID）、DataRetrievalId（数据检索 ID）、Name（数据检索名称，支持模糊搜索）。最多支持 10 个。</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get <p>分页偏移量，默认值为 0。</p> 
     * @return Offset <p>分页偏移量，默认值为 0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量，默认值为 0。</p>
     * @param Offset <p>分页偏移量，默认值为 0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页单页限制数目，默认值为 20，最大值为 100。</p> 
     * @return Limit <p>分页单页限制数目，默认值为 20，最大值为 100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页单页限制数目，默认值为 20，最大值为 100。</p>
     * @param Limit <p>分页单页限制数目，默认值为 20，最大值为 100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>过滤条件列表。支持的过滤字段：FileSystemId（文件系统 ID）、DataRetrievalId（数据检索 ID）、Name（数据检索名称，支持模糊搜索）。最多支持 10 个。</p> 
     * @return Filters <p>过滤条件列表。支持的过滤字段：FileSystemId（文件系统 ID）、DataRetrievalId（数据检索 ID）、Name（数据检索名称，支持模糊搜索）。最多支持 10 个。</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件列表。支持的过滤字段：FileSystemId（文件系统 ID）、DataRetrievalId（数据检索 ID）、Name（数据检索名称，支持模糊搜索）。最多支持 10 个。</p>
     * @param Filters <p>过滤条件列表。支持的过滤字段：FileSystemId（文件系统 ID）、DataRetrievalId（数据检索 ID）、Name（数据检索名称，支持模糊搜索）。最多支持 10 个。</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeDataRetrievalRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataRetrievalRequest(DescribeDataRetrievalRequest source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

