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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccelerationDomainsRequest extends AbstractModel{

    /**
    * 加速域名所属站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 分页查询偏移量，默认为 0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页查询限制数目，默认值：20，上限：200。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件，Filters.Values 的上限为 20。该参数不填写时，返回当前 zone-id 下所有域名信息。详细的过滤条件如下：
<li>domain-name：按照加速域名进行过滤；</li>
<li>origin-type：按照源站类型进行过滤；</li>
<li>origin：按照主源站地址进行过滤；</li>
<li>backup-origin： 按照备用源站地址进行过滤；</li>
<li>domain-cname：按照 CNAME 进行过滤；</li>
<li>share-cname：按照共享 CNAME 进行过滤；</li>
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
    * 可根据该字段对返回结果进行排序，取值有：
<li>created_on：加速域名创建时间；</li>
<li>domain-name：加速域名。</li>不填写时，默认对返回结果按照 domain-name 排序。
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序方向，如果是字段值为数字，则根据数字大小排序；如果字段值为文本，则根据 ascill 码的大小排序。取值有：
<li>asc：升序排列；</li>
<li>desc：降序排列。</li>不填写使用默认值 asc。
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * 匹配方式，取值有：
<li>all：返回匹配所有查询条件的加速域名；</li>
<li>any：返回匹配任意一个查询条件的加速域名。</li>不填写时默认值为 all。
    */
    @SerializedName("Match")
    @Expose
    private String Match;

    /**
     * Get 加速域名所属站点 ID。 
     * @return ZoneId 加速域名所属站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 加速域名所属站点 ID。
     * @param ZoneId 加速域名所属站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 分页查询偏移量，默认为 0。 
     * @return Offset 分页查询偏移量，默认为 0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页查询偏移量，默认为 0。
     * @param Offset 分页查询偏移量，默认为 0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页查询限制数目，默认值：20，上限：200。 
     * @return Limit 分页查询限制数目，默认值：20，上限：200。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查询限制数目，默认值：20，上限：200。
     * @param Limit 分页查询限制数目，默认值：20，上限：200。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件，Filters.Values 的上限为 20。该参数不填写时，返回当前 zone-id 下所有域名信息。详细的过滤条件如下：
<li>domain-name：按照加速域名进行过滤；</li>
<li>origin-type：按照源站类型进行过滤；</li>
<li>origin：按照主源站地址进行过滤；</li>
<li>backup-origin： 按照备用源站地址进行过滤；</li>
<li>domain-cname：按照 CNAME 进行过滤；</li>
<li>share-cname：按照共享 CNAME 进行过滤；</li> 
     * @return Filters 过滤条件，Filters.Values 的上限为 20。该参数不填写时，返回当前 zone-id 下所有域名信息。详细的过滤条件如下：
<li>domain-name：按照加速域名进行过滤；</li>
<li>origin-type：按照源站类型进行过滤；</li>
<li>origin：按照主源站地址进行过滤；</li>
<li>backup-origin： 按照备用源站地址进行过滤；</li>
<li>domain-cname：按照 CNAME 进行过滤；</li>
<li>share-cname：按照共享 CNAME 进行过滤；</li>
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，Filters.Values 的上限为 20。该参数不填写时，返回当前 zone-id 下所有域名信息。详细的过滤条件如下：
<li>domain-name：按照加速域名进行过滤；</li>
<li>origin-type：按照源站类型进行过滤；</li>
<li>origin：按照主源站地址进行过滤；</li>
<li>backup-origin： 按照备用源站地址进行过滤；</li>
<li>domain-cname：按照 CNAME 进行过滤；</li>
<li>share-cname：按照共享 CNAME 进行过滤；</li>
     * @param Filters 过滤条件，Filters.Values 的上限为 20。该参数不填写时，返回当前 zone-id 下所有域名信息。详细的过滤条件如下：
<li>domain-name：按照加速域名进行过滤；</li>
<li>origin-type：按照源站类型进行过滤；</li>
<li>origin：按照主源站地址进行过滤；</li>
<li>backup-origin： 按照备用源站地址进行过滤；</li>
<li>domain-cname：按照 CNAME 进行过滤；</li>
<li>share-cname：按照共享 CNAME 进行过滤；</li>
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 可根据该字段对返回结果进行排序，取值有：
<li>created_on：加速域名创建时间；</li>
<li>domain-name：加速域名。</li>不填写时，默认对返回结果按照 domain-name 排序。 
     * @return Order 可根据该字段对返回结果进行排序，取值有：
<li>created_on：加速域名创建时间；</li>
<li>domain-name：加速域名。</li>不填写时，默认对返回结果按照 domain-name 排序。
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 可根据该字段对返回结果进行排序，取值有：
<li>created_on：加速域名创建时间；</li>
<li>domain-name：加速域名。</li>不填写时，默认对返回结果按照 domain-name 排序。
     * @param Order 可根据该字段对返回结果进行排序，取值有：
<li>created_on：加速域名创建时间；</li>
<li>domain-name：加速域名。</li>不填写时，默认对返回结果按照 domain-name 排序。
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序方向，如果是字段值为数字，则根据数字大小排序；如果字段值为文本，则根据 ascill 码的大小排序。取值有：
<li>asc：升序排列；</li>
<li>desc：降序排列。</li>不填写使用默认值 asc。 
     * @return Direction 排序方向，如果是字段值为数字，则根据数字大小排序；如果字段值为文本，则根据 ascill 码的大小排序。取值有：
<li>asc：升序排列；</li>
<li>desc：降序排列。</li>不填写使用默认值 asc。
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set 排序方向，如果是字段值为数字，则根据数字大小排序；如果字段值为文本，则根据 ascill 码的大小排序。取值有：
<li>asc：升序排列；</li>
<li>desc：降序排列。</li>不填写使用默认值 asc。
     * @param Direction 排序方向，如果是字段值为数字，则根据数字大小排序；如果字段值为文本，则根据 ascill 码的大小排序。取值有：
<li>asc：升序排列；</li>
<li>desc：降序排列。</li>不填写使用默认值 asc。
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 匹配方式，取值有：
<li>all：返回匹配所有查询条件的加速域名；</li>
<li>any：返回匹配任意一个查询条件的加速域名。</li>不填写时默认值为 all。 
     * @return Match 匹配方式，取值有：
<li>all：返回匹配所有查询条件的加速域名；</li>
<li>any：返回匹配任意一个查询条件的加速域名。</li>不填写时默认值为 all。
     */
    public String getMatch() {
        return this.Match;
    }

    /**
     * Set 匹配方式，取值有：
<li>all：返回匹配所有查询条件的加速域名；</li>
<li>any：返回匹配任意一个查询条件的加速域名。</li>不填写时默认值为 all。
     * @param Match 匹配方式，取值有：
<li>all：返回匹配所有查询条件的加速域名；</li>
<li>any：返回匹配任意一个查询条件的加速域名。</li>不填写时默认值为 all。
     */
    public void setMatch(String Match) {
        this.Match = Match;
    }

    public DescribeAccelerationDomainsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccelerationDomainsRequest(DescribeAccelerationDomainsRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
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
        if (source.Match != null) {
            this.Match = new String(source.Match);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Match", this.Match);

    }
}

