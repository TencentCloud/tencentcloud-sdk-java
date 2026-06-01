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

public class DescribeFunctionReplicasRequest extends AbstractModel {

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 函数 ID。
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * 分页查询偏移量。默认值：0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页查询限制数目。默认值：20，最大值：200。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序依据，取值有：  <li>created-on：创建时间。</li>  默认根据 created-on 属性排序。
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * 列表排序方式，取值有：  <li>asc：升序排列；</li>  <li>desc：降序排列。</li>  默认值为 asc。
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
    * 过滤条件，Filters.Values 的上限为 20。该参数不填写时，返回函数 ID 下全部函数副本。详细的过滤条件如下：  <li> replica-name：按照函数副本名称进行过滤，支持模糊查询。</li> 
    */
    @SerializedName("Filters")
    @Expose
    private AdvancedFilter [] Filters;

    /**
     * Get 站点 ID。 
     * @return ZoneId 站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
     * @param ZoneId 站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 函数 ID。 
     * @return FunctionId 函数 ID。
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set 函数 ID。
     * @param FunctionId 函数 ID。
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

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
     * Get 分页查询限制数目。默认值：20，最大值：200。 
     * @return Limit 分页查询限制数目。默认值：20，最大值：200。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查询限制数目。默认值：20，最大值：200。
     * @param Limit 分页查询限制数目。默认值：20，最大值：200。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序依据，取值有：  <li>created-on：创建时间。</li>  默认根据 created-on 属性排序。 
     * @return SortBy 排序依据，取值有：  <li>created-on：创建时间。</li>  默认根据 created-on 属性排序。
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set 排序依据，取值有：  <li>created-on：创建时间。</li>  默认根据 created-on 属性排序。
     * @param SortBy 排序依据，取值有：  <li>created-on：创建时间。</li>  默认根据 created-on 属性排序。
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get 列表排序方式，取值有：  <li>asc：升序排列；</li>  <li>desc：降序排列。</li>  默认值为 asc。 
     * @return SortOrder 列表排序方式，取值有：  <li>asc：升序排列；</li>  <li>desc：降序排列。</li>  默认值为 asc。
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set 列表排序方式，取值有：  <li>asc：升序排列；</li>  <li>desc：降序排列。</li>  默认值为 asc。
     * @param SortOrder 列表排序方式，取值有：  <li>asc：升序排列；</li>  <li>desc：降序排列。</li>  默认值为 asc。
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    /**
     * Get 过滤条件，Filters.Values 的上限为 20。该参数不填写时，返回函数 ID 下全部函数副本。详细的过滤条件如下：  <li> replica-name：按照函数副本名称进行过滤，支持模糊查询。</li>  
     * @return Filters 过滤条件，Filters.Values 的上限为 20。该参数不填写时，返回函数 ID 下全部函数副本。详细的过滤条件如下：  <li> replica-name：按照函数副本名称进行过滤，支持模糊查询。</li> 
     */
    public AdvancedFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，Filters.Values 的上限为 20。该参数不填写时，返回函数 ID 下全部函数副本。详细的过滤条件如下：  <li> replica-name：按照函数副本名称进行过滤，支持模糊查询。</li> 
     * @param Filters 过滤条件，Filters.Values 的上限为 20。该参数不填写时，返回函数 ID 下全部函数副本。详细的过滤条件如下：  <li> replica-name：按照函数副本名称进行过滤，支持模糊查询。</li> 
     */
    public void setFilters(AdvancedFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeFunctionReplicasRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFunctionReplicasRequest(DescribeFunctionReplicasRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
        }
        if (source.Filters != null) {
            this.Filters = new AdvancedFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AdvancedFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

