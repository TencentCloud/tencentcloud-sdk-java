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
package com.tencentcloudapi.workbuddyenterprise.v20260709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentSessionListRequest extends AbstractModel {

    /**
    * 偏移量，从 0 开始
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，缺省为 20，最大 100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序字段
    */
    @SerializedName("SortBy")
    @Expose
    private String SortBy;

    /**
    * 排序方向：ASC / DESC
    */
    @SerializedName("SortDirection")
    @Expose
    private String SortDirection;

    /**
    * 过滤条件数组，多个 Filter 之间为 AND 关系，同一 Filter 内多个 Values 为 OR 关系
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 偏移量，从 0 开始 
     * @return Offset 偏移量，从 0 开始
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，从 0 开始
     * @param Offset 偏移量，从 0 开始
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，缺省为 20，最大 100 
     * @return Limit 返回数量，缺省为 20，最大 100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，缺省为 20，最大 100
     * @param Limit 返回数量，缺省为 20，最大 100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序字段 
     * @return SortBy 排序字段
     */
    public String getSortBy() {
        return this.SortBy;
    }

    /**
     * Set 排序字段
     * @param SortBy 排序字段
     */
    public void setSortBy(String SortBy) {
        this.SortBy = SortBy;
    }

    /**
     * Get 排序方向：ASC / DESC 
     * @return SortDirection 排序方向：ASC / DESC
     */
    public String getSortDirection() {
        return this.SortDirection;
    }

    /**
     * Set 排序方向：ASC / DESC
     * @param SortDirection 排序方向：ASC / DESC
     */
    public void setSortDirection(String SortDirection) {
        this.SortDirection = SortDirection;
    }

    /**
     * Get 过滤条件数组，多个 Filter 之间为 AND 关系，同一 Filter 内多个 Values 为 OR 关系 
     * @return Filters 过滤条件数组，多个 Filter 之间为 AND 关系，同一 Filter 内多个 Values 为 OR 关系
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件数组，多个 Filter 之间为 AND 关系，同一 Filter 内多个 Values 为 OR 关系
     * @param Filters 过滤条件数组，多个 Filter 之间为 AND 关系，同一 Filter 内多个 Values 为 OR 关系
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeAgentSessionListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentSessionListRequest(DescribeAgentSessionListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SortBy != null) {
            this.SortBy = new String(source.SortBy);
        }
        if (source.SortDirection != null) {
            this.SortDirection = new String(source.SortDirection);
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
        this.setParamSimple(map, prefix + "SortBy", this.SortBy);
        this.setParamSimple(map, prefix + "SortDirection", this.SortDirection);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

