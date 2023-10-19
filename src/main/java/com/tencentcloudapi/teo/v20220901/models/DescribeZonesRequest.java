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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeZonesRequest extends AbstractModel {

    /**
    * 分页查询偏移量。默认值：0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页查询限制数目。默认值：20，最大值：100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件，Filters.Values 的上限为 20。该参数不填写时，返回当前 appid 下有权限的所有站点信息。详细的过滤条件如下：
<li>zone-name：按照站点名称进行过滤；</li><li>zone-id：按照站点 ID进行过滤。站点 ID 形如：zone-2noz78a8ev6k；</li><li>status：按照站点状态进行过滤；</li><li>tag-key：按照标签键进行过滤；</li><li>tag-value： 按照标签值进行过滤。</li>模糊查询时仅支持过滤字段名为 zone-name。
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
    * 可根据该字段对返回结果进行排序，取值有：
<li> type：接入类型；</li>
<li> area：加速区域；</li>
<li> create-time：创建时间；</li>
<li> zone-name：站点名称；</li>
<li> use-time：最近使用时间；</li>
<li> active-status：生效状态。</li>不填写时对返回结果默认按照 create-time 排序。
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序方向，如果是字段值为数字，则根据数字大小排序；如果字段值为文本，则根据 ascill 码的大小排序。取值有：
<li> asc：从小到大排序；</li>
<li> desc：从大到小排序。</li>不填写使用默认值 desc。
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
     * Get 分页查询偏移量。默认值：0。 
     * @return Offset 分页查询偏移量。默认值：0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页查询偏移量。默认值：0。
     * @param Offset 分页查询偏移量。默认值：0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页查询限制数目。默认值：20，最大值：100。 
     * @return Limit 分页查询限制数目。默认值：20，最大值：100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查询限制数目。默认值：20，最大值：100。
     * @param Limit 分页查询限制数目。默认值：20，最大值：100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件，Filters.Values 的上限为 20。该参数不填写时，返回当前 appid 下有权限的所有站点信息。详细的过滤条件如下：
<li>zone-name：按照站点名称进行过滤；</li><li>zone-id：按照站点 ID进行过滤。站点 ID 形如：zone-2noz78a8ev6k；</li><li>status：按照站点状态进行过滤；</li><li>tag-key：按照标签键进行过滤；</li><li>tag-value： 按照标签值进行过滤。</li>模糊查询时仅支持过滤字段名为 zone-name。 
     * @return Filters 过滤条件，Filters.Values 的上限为 20。该参数不填写时，返回当前 appid 下有权限的所有站点信息。详细的过滤条件如下：
<li>zone-name：按照站点名称进行过滤；</li><li>zone-id：按照站点 ID进行过滤。站点 ID 形如：zone-2noz78a8ev6k；</li><li>status：按照站点状态进行过滤；</li><li>tag-key：按照标签键进行过滤；</li><li>tag-value： 按照标签值进行过滤。</li>模糊查询时仅支持过滤字段名为 zone-name。
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，Filters.Values 的上限为 20。该参数不填写时，返回当前 appid 下有权限的所有站点信息。详细的过滤条件如下：
<li>zone-name：按照站点名称进行过滤；</li><li>zone-id：按照站点 ID进行过滤。站点 ID 形如：zone-2noz78a8ev6k；</li><li>status：按照站点状态进行过滤；</li><li>tag-key：按照标签键进行过滤；</li><li>tag-value： 按照标签值进行过滤。</li>模糊查询时仅支持过滤字段名为 zone-name。
     * @param Filters 过滤条件，Filters.Values 的上限为 20。该参数不填写时，返回当前 appid 下有权限的所有站点信息。详细的过滤条件如下：
<li>zone-name：按照站点名称进行过滤；</li><li>zone-id：按照站点 ID进行过滤。站点 ID 形如：zone-2noz78a8ev6k；</li><li>status：按照站点状态进行过滤；</li><li>tag-key：按照标签键进行过滤；</li><li>tag-value： 按照标签值进行过滤。</li>模糊查询时仅支持过滤字段名为 zone-name。
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 可根据该字段对返回结果进行排序，取值有：
<li> type：接入类型；</li>
<li> area：加速区域；</li>
<li> create-time：创建时间；</li>
<li> zone-name：站点名称；</li>
<li> use-time：最近使用时间；</li>
<li> active-status：生效状态。</li>不填写时对返回结果默认按照 create-time 排序。 
     * @return Order 可根据该字段对返回结果进行排序，取值有：
<li> type：接入类型；</li>
<li> area：加速区域；</li>
<li> create-time：创建时间；</li>
<li> zone-name：站点名称；</li>
<li> use-time：最近使用时间；</li>
<li> active-status：生效状态。</li>不填写时对返回结果默认按照 create-time 排序。
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 可根据该字段对返回结果进行排序，取值有：
<li> type：接入类型；</li>
<li> area：加速区域；</li>
<li> create-time：创建时间；</li>
<li> zone-name：站点名称；</li>
<li> use-time：最近使用时间；</li>
<li> active-status：生效状态。</li>不填写时对返回结果默认按照 create-time 排序。
     * @param Order 可根据该字段对返回结果进行排序，取值有：
<li> type：接入类型；</li>
<li> area：加速区域；</li>
<li> create-time：创建时间；</li>
<li> zone-name：站点名称；</li>
<li> use-time：最近使用时间；</li>
<li> active-status：生效状态。</li>不填写时对返回结果默认按照 create-time 排序。
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序方向，如果是字段值为数字，则根据数字大小排序；如果字段值为文本，则根据 ascill 码的大小排序。取值有：
<li> asc：从小到大排序；</li>
<li> desc：从大到小排序。</li>不填写使用默认值 desc。 
     * @return Direction 排序方向，如果是字段值为数字，则根据数字大小排序；如果字段值为文本，则根据 ascill 码的大小排序。取值有：
<li> asc：从小到大排序；</li>
<li> desc：从大到小排序。</li>不填写使用默认值 desc。
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set 排序方向，如果是字段值为数字，则根据数字大小排序；如果字段值为文本，则根据 ascill 码的大小排序。取值有：
<li> asc：从小到大排序；</li>
<li> desc：从大到小排序。</li>不填写使用默认值 desc。
     * @param Direction 排序方向，如果是字段值为数字，则根据数字大小排序；如果字段值为文本，则根据 ascill 码的大小排序。取值有：
<li> asc：从小到大排序；</li>
<li> desc：从大到小排序。</li>不填写使用默认值 desc。
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    public DescribeZonesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeZonesRequest(DescribeZonesRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new AdvancedFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AdvancedFilter(source.Filters[i]);
            }
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
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Direction", this.Direction);

    }
}

