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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeQuotaOverviewRequest extends AbstractModel {

    /**
    * <p>分页偏移量，从 0 开始，默认值为 0，必须大于等于 0。</p><p>单位：偏移量</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>每页返回的配额组数量</p><p>单位：个</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>配额组过滤条件</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get <p>分页偏移量，从 0 开始，默认值为 0，必须大于等于 0。</p><p>单位：偏移量</p> 
     * @return Offset <p>分页偏移量，从 0 开始，默认值为 0，必须大于等于 0。</p><p>单位：偏移量</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量，从 0 开始，默认值为 0，必须大于等于 0。</p><p>单位：偏移量</p>
     * @param Offset <p>分页偏移量，从 0 开始，默认值为 0，必须大于等于 0。</p><p>单位：偏移量</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>每页返回的配额组数量</p><p>单位：个</p> 
     * @return Limit <p>每页返回的配额组数量</p><p>单位：个</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页返回的配额组数量</p><p>单位：个</p>
     * @param Limit <p>每页返回的配额组数量</p><p>单位：个</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>配额组过滤条件</p> 
     * @return Filters <p>配额组过滤条件</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>配额组过滤条件</p>
     * @param Filters <p>配额组过滤条件</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeQuotaOverviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeQuotaOverviewRequest(DescribeQuotaOverviewRequest source) {
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

