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

public class DescribeInferenceServicesRequest extends AbstractModel {

    /**
    * <p>站点ID。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>过滤条件，上限 20 个，多个条件为且关系，Filters.Values 的上限为 20。详细的过滤条件如下：<li>service-name：按照服务名称进行过滤；</li><li>service-id：按照服务 ID 过滤；</li><li>status：按照服务状态过滤。</li>模糊查询时仅支持过滤字段名为 service-name。</p>
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
    * <p>分页查询限制数目。默认值：20，最大值：200。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>可根据该字段对返回结果进行排序，取值有：<li>create-time：创建时间。</li>不填写时默认按照 create-time 排序。</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>排序方向，如果是字段值为数字，则根据数字大小排序；如果字段值为文本，则根据 ASCII 码的大小排序。取值有：<li>asc：从小到大排序；</li><li>desc：从大到小排序。</li>不填写使用默认值 desc。</p>
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
     * Get <p>站点ID。</p> 
     * @return ZoneId <p>站点ID。</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>站点ID。</p>
     * @param ZoneId <p>站点ID。</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>过滤条件，上限 20 个，多个条件为且关系，Filters.Values 的上限为 20。详细的过滤条件如下：<li>service-name：按照服务名称进行过滤；</li><li>service-id：按照服务 ID 过滤；</li><li>status：按照服务状态过滤。</li>模糊查询时仅支持过滤字段名为 service-name。</p> 
     * @return Filters <p>过滤条件，上限 20 个，多个条件为且关系，Filters.Values 的上限为 20。详细的过滤条件如下：<li>service-name：按照服务名称进行过滤；</li><li>service-id：按照服务 ID 过滤；</li><li>status：按照服务状态过滤。</li>模糊查询时仅支持过滤字段名为 service-name。</p>
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件，上限 20 个，多个条件为且关系，Filters.Values 的上限为 20。详细的过滤条件如下：<li>service-name：按照服务名称进行过滤；</li><li>service-id：按照服务 ID 过滤；</li><li>status：按照服务状态过滤。</li>模糊查询时仅支持过滤字段名为 service-name。</p>
     * @param Filters <p>过滤条件，上限 20 个，多个条件为且关系，Filters.Values 的上限为 20。详细的过滤条件如下：<li>service-name：按照服务名称进行过滤；</li><li>service-id：按照服务 ID 过滤；</li><li>status：按照服务状态过滤。</li>模糊查询时仅支持过滤字段名为 service-name。</p>
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
     * Get <p>分页查询限制数目。默认值：20，最大值：200。</p> 
     * @return Limit <p>分页查询限制数目。默认值：20，最大值：200。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页查询限制数目。默认值：20，最大值：200。</p>
     * @param Limit <p>分页查询限制数目。默认值：20，最大值：200。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>可根据该字段对返回结果进行排序，取值有：<li>create-time：创建时间。</li>不填写时默认按照 create-time 排序。</p> 
     * @return Order <p>可根据该字段对返回结果进行排序，取值有：<li>create-time：创建时间。</li>不填写时默认按照 create-time 排序。</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>可根据该字段对返回结果进行排序，取值有：<li>create-time：创建时间。</li>不填写时默认按照 create-time 排序。</p>
     * @param Order <p>可根据该字段对返回结果进行排序，取值有：<li>create-time：创建时间。</li>不填写时默认按照 create-time 排序。</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>排序方向，如果是字段值为数字，则根据数字大小排序；如果字段值为文本，则根据 ASCII 码的大小排序。取值有：<li>asc：从小到大排序；</li><li>desc：从大到小排序。</li>不填写使用默认值 desc。</p> 
     * @return Direction <p>排序方向，如果是字段值为数字，则根据数字大小排序；如果字段值为文本，则根据 ASCII 码的大小排序。取值有：<li>asc：从小到大排序；</li><li>desc：从大到小排序。</li>不填写使用默认值 desc。</p>
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set <p>排序方向，如果是字段值为数字，则根据数字大小排序；如果字段值为文本，则根据 ASCII 码的大小排序。取值有：<li>asc：从小到大排序；</li><li>desc：从大到小排序。</li>不填写使用默认值 desc。</p>
     * @param Direction <p>排序方向，如果是字段值为数字，则根据数字大小排序；如果字段值为文本，则根据 ASCII 码的大小排序。取值有：<li>asc：从小到大排序；</li><li>desc：从大到小排序。</li>不填写使用默认值 desc。</p>
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    public DescribeInferenceServicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInferenceServicesRequest(DescribeInferenceServicesRequest source) {
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
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
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
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Direction", this.Direction);

    }
}

