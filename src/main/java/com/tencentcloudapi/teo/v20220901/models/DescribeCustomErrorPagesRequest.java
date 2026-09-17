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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCustomErrorPagesRequest extends AbstractModel {

    /**
    * <p>站点 ID。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>过滤条件，Filters.Values 的上限为 20，详细的过滤条件Name值如下：<li>page-id： 按照页面 ID 进行过滤；</li><li>name： 按照页面名称进行过滤；</li><li>description：按照页面描述过滤；</li><li>content-type：按照页面类型过滤。</li></p>
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
    * <p>分页查询偏移量。默认值：0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页查询限制数目。默认值：20，最大值：1000。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>站点 ID。</p> 
     * @return ZoneId <p>站点 ID。</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>站点 ID。</p>
     * @param ZoneId <p>站点 ID。</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>过滤条件，Filters.Values 的上限为 20，详细的过滤条件Name值如下：<li>page-id： 按照页面 ID 进行过滤；</li><li>name： 按照页面名称进行过滤；</li><li>description：按照页面描述过滤；</li><li>content-type：按照页面类型过滤。</li></p> 
     * @return Filters <p>过滤条件，Filters.Values 的上限为 20，详细的过滤条件Name值如下：<li>page-id： 按照页面 ID 进行过滤；</li><li>name： 按照页面名称进行过滤；</li><li>description：按照页面描述过滤；</li><li>content-type：按照页面类型过滤。</li></p>
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件，Filters.Values 的上限为 20，详细的过滤条件Name值如下：<li>page-id： 按照页面 ID 进行过滤；</li><li>name： 按照页面名称进行过滤；</li><li>description：按照页面描述过滤；</li><li>content-type：按照页面类型过滤。</li></p>
     * @param Filters <p>过滤条件，Filters.Values 的上限为 20，详细的过滤条件Name值如下：<li>page-id： 按照页面 ID 进行过滤；</li><li>name： 按照页面名称进行过滤；</li><li>description：按照页面描述过滤；</li><li>content-type：按照页面类型过滤。</li></p>
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>分页查询偏移量。默认值：0。</p> 
     * @return Offset <p>分页查询偏移量。默认值：0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页查询偏移量。默认值：0。</p>
     * @param Offset <p>分页查询偏移量。默认值：0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页查询限制数目。默认值：20，最大值：1000。</p> 
     * @return Limit <p>分页查询限制数目。默认值：20，最大值：1000。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页查询限制数目。默认值：20，最大值：1000。</p>
     * @param Limit <p>分页查询限制数目。默认值：20，最大值：1000。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeCustomErrorPagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomErrorPagesRequest(DescribeCustomErrorPagesRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Filters != null) {
            this.Filters = new AdvancedFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AdvancedFilter(source.Filters[i]);
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
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

