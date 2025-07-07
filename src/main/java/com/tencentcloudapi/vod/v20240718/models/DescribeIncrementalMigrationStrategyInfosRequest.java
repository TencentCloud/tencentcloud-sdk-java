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
package com.tencentcloudapi.vod.v20240718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIncrementalMigrationStrategyInfosRequest extends AbstractModel {

    /**
    * <b>点播[专业版](/document/product/266/115396)[应用](/document/product/266/14574) ID。</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 过滤条件，Filters.Values 的上限为 `20`；若 Filters 长度为 `0` 则查询时无过滤条件限制。 详细的过滤条件如下： <li>BucketId<br>   按照【<strong>存储桶 ID</strong>】进行过滤<br>   类型：String<br>   必选：否<br></li><li>StrategyId<br>   按照【<strong>策略 ID</strong>】进行过滤。<br>   类型：String<br>   必选：否</li> 
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 返回结果的排序。 SortBy.Field 取值有：<li>UpdateTime：创建时间。</li>若不填，SortBy.Field 默认值为 `UpdateTime`，SortBy.Order 默认值为 `Desc`。
    */
    @SerializedName("SortBy")
    @Expose
    private SortBy SortBy;

    /**
    * 分页返回的起始偏移量，默认值为 `0`。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页返回的记录条数，默认值为 `20`，最大值为 `100`。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <b>点播[专业版](/document/product/266/115396)[应用](/document/product/266/14574) ID。</b> 
     * @return SubAppId <b>点播[专业版](/document/product/266/115396)[应用](/document/product/266/14574) ID。</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>点播[专业版](/document/product/266/115396)[应用](/document/product/266/14574) ID。</b>
     * @param SubAppId <b>点播[专业版](/document/product/266/115396)[应用](/document/product/266/14574) ID。</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get 过滤条件，Filters.Values 的上限为 `20`；若 Filters 长度为 `0` 则查询时无过滤条件限制。 详细的过滤条件如下： <li>BucketId<br>   按照【<strong>存储桶 ID</strong>】进行过滤<br>   类型：String<br>   必选：否<br></li><li>StrategyId<br>   按照【<strong>策略 ID</strong>】进行过滤。<br>   类型：String<br>   必选：否</li>  
     * @return Filters 过滤条件，Filters.Values 的上限为 `20`；若 Filters 长度为 `0` 则查询时无过滤条件限制。 详细的过滤条件如下： <li>BucketId<br>   按照【<strong>存储桶 ID</strong>】进行过滤<br>   类型：String<br>   必选：否<br></li><li>StrategyId<br>   按照【<strong>策略 ID</strong>】进行过滤。<br>   类型：String<br>   必选：否</li> 
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，Filters.Values 的上限为 `20`；若 Filters 长度为 `0` 则查询时无过滤条件限制。 详细的过滤条件如下： <li>BucketId<br>   按照【<strong>存储桶 ID</strong>】进行过滤<br>   类型：String<br>   必选：否<br></li><li>StrategyId<br>   按照【<strong>策略 ID</strong>】进行过滤。<br>   类型：String<br>   必选：否</li> 
     * @param Filters 过滤条件，Filters.Values 的上限为 `20`；若 Filters 长度为 `0` 则查询时无过滤条件限制。 详细的过滤条件如下： <li>BucketId<br>   按照【<strong>存储桶 ID</strong>】进行过滤<br>   类型：String<br>   必选：否<br></li><li>StrategyId<br>   按照【<strong>策略 ID</strong>】进行过滤。<br>   类型：String<br>   必选：否</li> 
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 返回结果的排序。 SortBy.Field 取值有：<li>UpdateTime：创建时间。</li>若不填，SortBy.Field 默认值为 `UpdateTime`，SortBy.Order 默认值为 `Desc`。 
     * @return SortBy 返回结果的排序。 SortBy.Field 取值有：<li>UpdateTime：创建时间。</li>若不填，SortBy.Field 默认值为 `UpdateTime`，SortBy.Order 默认值为 `Desc`。
     */
    public SortBy getSortBy() {
        return this.SortBy;
    }

    /**
     * Set 返回结果的排序。 SortBy.Field 取值有：<li>UpdateTime：创建时间。</li>若不填，SortBy.Field 默认值为 `UpdateTime`，SortBy.Order 默认值为 `Desc`。
     * @param SortBy 返回结果的排序。 SortBy.Field 取值有：<li>UpdateTime：创建时间。</li>若不填，SortBy.Field 默认值为 `UpdateTime`，SortBy.Order 默认值为 `Desc`。
     */
    public void setSortBy(SortBy SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get 分页返回的起始偏移量，默认值为 `0`。 
     * @return Offset 分页返回的起始偏移量，默认值为 `0`。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页返回的起始偏移量，默认值为 `0`。
     * @param Offset 分页返回的起始偏移量，默认值为 `0`。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页返回的记录条数，默认值为 `20`，最大值为 `100`。 
     * @return Limit 分页返回的记录条数，默认值为 `20`，最大值为 `100`。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页返回的记录条数，默认值为 `20`，最大值为 `100`。
     * @param Limit 分页返回的记录条数，默认值为 `20`，最大值为 `100`。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeIncrementalMigrationStrategyInfosRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIncrementalMigrationStrategyInfosRequest(DescribeIncrementalMigrationStrategyInfosRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.SortBy != null) {
            this.SortBy = new SortBy(source.SortBy);
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
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamObj(map, prefix + "SortBy.", this.SortBy);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

