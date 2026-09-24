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

public class DescribeRegistryListRequest extends AbstractModel {

    /**
    * <p>分页起始偏移，默认 0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页条数，默认 20，最大 100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>过滤条件。Name 支持：<code>name</code>/<code>search</code>（模糊）、<code>archived</code>/<code>status</code>（true/false/all）、<code>tag-key</code> 和 <code>tag:&lt;key&gt;</code>；最多 6 个标签过滤组，每个标签过滤组最多 10 个 Values，同 Key 多值为 OR，不同 Key 为 AND。</p>
    */
    @SerializedName("Filters")
    @Expose
    private CloudFilter [] Filters;

    /**
     * Get <p>分页起始偏移，默认 0。</p> 
     * @return Offset <p>分页起始偏移，默认 0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页起始偏移，默认 0。</p>
     * @param Offset <p>分页起始偏移，默认 0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页条数，默认 20，最大 100。</p> 
     * @return Limit <p>分页条数，默认 20，最大 100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页条数，默认 20，最大 100。</p>
     * @param Limit <p>分页条数，默认 20，最大 100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>过滤条件。Name 支持：<code>name</code>/<code>search</code>（模糊）、<code>archived</code>/<code>status</code>（true/false/all）、<code>tag-key</code> 和 <code>tag:&lt;key&gt;</code>；最多 6 个标签过滤组，每个标签过滤组最多 10 个 Values，同 Key 多值为 OR，不同 Key 为 AND。</p> 
     * @return Filters <p>过滤条件。Name 支持：<code>name</code>/<code>search</code>（模糊）、<code>archived</code>/<code>status</code>（true/false/all）、<code>tag-key</code> 和 <code>tag:&lt;key&gt;</code>；最多 6 个标签过滤组，每个标签过滤组最多 10 个 Values，同 Key 多值为 OR，不同 Key 为 AND。</p>
     */
    public CloudFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件。Name 支持：<code>name</code>/<code>search</code>（模糊）、<code>archived</code>/<code>status</code>（true/false/all）、<code>tag-key</code> 和 <code>tag:&lt;key&gt;</code>；最多 6 个标签过滤组，每个标签过滤组最多 10 个 Values，同 Key 多值为 OR，不同 Key 为 AND。</p>
     * @param Filters <p>过滤条件。Name 支持：<code>name</code>/<code>search</code>（模糊）、<code>archived</code>/<code>status</code>（true/false/all）、<code>tag-key</code> 和 <code>tag:&lt;key&gt;</code>；最多 6 个标签过滤组，每个标签过滤组最多 10 个 Values，同 Key 多值为 OR，不同 Key 为 AND。</p>
     */
    public void setFilters(CloudFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeRegistryListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRegistryListRequest(DescribeRegistryListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new CloudFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new CloudFilter(source.Filters[i]);
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

