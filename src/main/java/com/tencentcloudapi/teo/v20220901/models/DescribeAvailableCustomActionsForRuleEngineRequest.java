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

public class DescribeAvailableCustomActionsForRuleEngineRequest extends AbstractModel {

    /**
    * <p>站点 ID。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>过滤条件，多个条件为且关系，Filters.Values 的上限为 20。该参数不填写时，返回当前站点下所有可用的规则引擎定制配置。详细的过滤条件如下：</p><li>action-id：按照定制配置唯一标识 ID 进行过滤；</li><li>name：按照定制配置名称进行过滤。</li>模糊查询时仅支持过滤字段名为 <code>name</code>。<p></p>
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
    * <p>分页查询限制数目。</p><p>取值范围：[0, 1000]</p><p>默认值：20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>分页偏移量。</p><p>默认值：0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>排序字段，取值有：</p><li>action-id：按照定制配置唯一标识 ID 排序；</li><li>create-time：按照定制配置创建时间排序。</li>默认值：<code>action-id</code>。<p></p>
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * <p>排序方式，取值有：</p><li>asc：升序排序；</li><li>desc：降序排序。</li>默认值：desc。<p></p>
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

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
     * Get <p>过滤条件，多个条件为且关系，Filters.Values 的上限为 20。该参数不填写时，返回当前站点下所有可用的规则引擎定制配置。详细的过滤条件如下：</p><li>action-id：按照定制配置唯一标识 ID 进行过滤；</li><li>name：按照定制配置名称进行过滤。</li>模糊查询时仅支持过滤字段名为 <code>name</code>。<p></p> 
     * @return Filters <p>过滤条件，多个条件为且关系，Filters.Values 的上限为 20。该参数不填写时，返回当前站点下所有可用的规则引擎定制配置。详细的过滤条件如下：</p><li>action-id：按照定制配置唯一标识 ID 进行过滤；</li><li>name：按照定制配置名称进行过滤。</li>模糊查询时仅支持过滤字段名为 <code>name</code>。<p></p>
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件，多个条件为且关系，Filters.Values 的上限为 20。该参数不填写时，返回当前站点下所有可用的规则引擎定制配置。详细的过滤条件如下：</p><li>action-id：按照定制配置唯一标识 ID 进行过滤；</li><li>name：按照定制配置名称进行过滤。</li>模糊查询时仅支持过滤字段名为 <code>name</code>。<p></p>
     * @param Filters <p>过滤条件，多个条件为且关系，Filters.Values 的上限为 20。该参数不填写时，返回当前站点下所有可用的规则引擎定制配置。详细的过滤条件如下：</p><li>action-id：按照定制配置唯一标识 ID 进行过滤；</li><li>name：按照定制配置名称进行过滤。</li>模糊查询时仅支持过滤字段名为 <code>name</code>。<p></p>
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>分页查询限制数目。</p><p>取值范围：[0, 1000]</p><p>默认值：20</p> 
     * @return Limit <p>分页查询限制数目。</p><p>取值范围：[0, 1000]</p><p>默认值：20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页查询限制数目。</p><p>取值范围：[0, 1000]</p><p>默认值：20</p>
     * @param Limit <p>分页查询限制数目。</p><p>取值范围：[0, 1000]</p><p>默认值：20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>分页偏移量。</p><p>默认值：0</p> 
     * @return Offset <p>分页偏移量。</p><p>默认值：0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页偏移量。</p><p>默认值：0</p>
     * @param Offset <p>分页偏移量。</p><p>默认值：0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>排序字段，取值有：</p><li>action-id：按照定制配置唯一标识 ID 排序；</li><li>create-time：按照定制配置创建时间排序。</li>默认值：<code>action-id</code>。<p></p> 
     * @return SortBy <p>排序字段，取值有：</p><li>action-id：按照定制配置唯一标识 ID 排序；</li><li>create-time：按照定制配置创建时间排序。</li>默认值：<code>action-id</code>。<p></p>
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set <p>排序字段，取值有：</p><li>action-id：按照定制配置唯一标识 ID 排序；</li><li>create-time：按照定制配置创建时间排序。</li>默认值：<code>action-id</code>。<p></p>
     * @param SortBy <p>排序字段，取值有：</p><li>action-id：按照定制配置唯一标识 ID 排序；</li><li>create-time：按照定制配置创建时间排序。</li>默认值：<code>action-id</code>。<p></p>
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get <p>排序方式，取值有：</p><li>asc：升序排序；</li><li>desc：降序排序。</li>默认值：desc。<p></p> 
     * @return SortOrder <p>排序方式，取值有：</p><li>asc：升序排序；</li><li>desc：降序排序。</li>默认值：desc。<p></p>
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set <p>排序方式，取值有：</p><li>asc：升序排序；</li><li>desc：降序排序。</li>默认值：desc。<p></p>
     * @param SortOrder <p>排序方式，取值有：</p><li>asc：升序排序；</li><li>desc：降序排序。</li>默认值：desc。<p></p>
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    public DescribeAvailableCustomActionsForRuleEngineRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAvailableCustomActionsForRuleEngineRequest(DescribeAvailableCustomActionsForRuleEngineRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Filters != null) {
            this.Filters = new AdvancedFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AdvancedFilter(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);

    }
}

