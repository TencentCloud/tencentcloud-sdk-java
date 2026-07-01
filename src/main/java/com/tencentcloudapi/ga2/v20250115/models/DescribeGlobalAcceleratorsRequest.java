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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGlobalAcceleratorsRequest extends AbstractModel {

    /**
    * <p>偏移量，默认为0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数量。</p><p>取值范围：[1, 200]</p><p>默认值：20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>过滤条件。<li>global-accelerator-id - String -（过滤条件）全球加速实例ID。</li> <li>global-accelerator-state - String -（过滤条件）全球加速实例状态。</li></p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get <p>偏移量，默认为0。</p> 
     * @return Offset <p>偏移量，默认为0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为0。</p>
     * @param Offset <p>偏移量，默认为0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数量。</p><p>取值范围：[1, 200]</p><p>默认值：20</p> 
     * @return Limit <p>返回数量。</p><p>取值范围：[1, 200]</p><p>默认值：20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量。</p><p>取值范围：[1, 200]</p><p>默认值：20</p>
     * @param Limit <p>返回数量。</p><p>取值范围：[1, 200]</p><p>默认值：20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>过滤条件。<li>global-accelerator-id - String -（过滤条件）全球加速实例ID。</li> <li>global-accelerator-state - String -（过滤条件）全球加速实例状态。</li></p> 
     * @return Filters <p>过滤条件。<li>global-accelerator-id - String -（过滤条件）全球加速实例ID。</li> <li>global-accelerator-state - String -（过滤条件）全球加速实例状态。</li></p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件。<li>global-accelerator-id - String -（过滤条件）全球加速实例ID。</li> <li>global-accelerator-state - String -（过滤条件）全球加速实例状态。</li></p>
     * @param Filters <p>过滤条件。<li>global-accelerator-id - String -（过滤条件）全球加速实例ID。</li> <li>global-accelerator-state - String -（过滤条件）全球加速实例状态。</li></p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeGlobalAcceleratorsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGlobalAcceleratorsRequest(DescribeGlobalAcceleratorsRequest source) {
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

