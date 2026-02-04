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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTargetGroupListRequest extends AbstractModel {

    /**
    * <p>目标组ID数组。</p>
    */
    @SerializedName("TargetGroupIds")
    @Expose
    private String [] TargetGroupIds;

    /**
    * <p>过滤条件数组，支持TargetGroupVpcId和TargetGroupName。与TargetGroupIds互斥，优先使用目标组ID。</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>显示的偏移起始量。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>每页显示条目数。</p><p>取值范围：[0, 100]</p><p>默认值：20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>目标组ID数组。</p> 
     * @return TargetGroupIds <p>目标组ID数组。</p>
     */
    public String [] getTargetGroupIds() {
        return this.TargetGroupIds;
    }

    /**
     * Set <p>目标组ID数组。</p>
     * @param TargetGroupIds <p>目标组ID数组。</p>
     */
    public void setTargetGroupIds(String [] TargetGroupIds) {
        this.TargetGroupIds = TargetGroupIds;
    }

    /**
     * Get <p>过滤条件数组，支持TargetGroupVpcId和TargetGroupName。与TargetGroupIds互斥，优先使用目标组ID。</p> 
     * @return Filters <p>过滤条件数组，支持TargetGroupVpcId和TargetGroupName。与TargetGroupIds互斥，优先使用目标组ID。</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件数组，支持TargetGroupVpcId和TargetGroupName。与TargetGroupIds互斥，优先使用目标组ID。</p>
     * @param Filters <p>过滤条件数组，支持TargetGroupVpcId和TargetGroupName。与TargetGroupIds互斥，优先使用目标组ID。</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>显示的偏移起始量。</p> 
     * @return Offset <p>显示的偏移起始量。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>显示的偏移起始量。</p>
     * @param Offset <p>显示的偏移起始量。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>每页显示条目数。</p><p>取值范围：[0, 100]</p><p>默认值：20</p> 
     * @return Limit <p>每页显示条目数。</p><p>取值范围：[0, 100]</p><p>默认值：20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>每页显示条目数。</p><p>取值范围：[0, 100]</p><p>默认值：20</p>
     * @param Limit <p>每页显示条目数。</p><p>取值范围：[0, 100]</p><p>默认值：20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeTargetGroupListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTargetGroupListRequest(DescribeTargetGroupListRequest source) {
        if (source.TargetGroupIds != null) {
            this.TargetGroupIds = new String[source.TargetGroupIds.length];
            for (int i = 0; i < source.TargetGroupIds.length; i++) {
                this.TargetGroupIds[i] = new String(source.TargetGroupIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "TargetGroupIds.", this.TargetGroupIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

