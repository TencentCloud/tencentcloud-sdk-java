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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DownloadLibraDBClusterListRequest extends AbstractModel {

    /**
    * 限制数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移值
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序字段
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 排序方式，desc,asc,DESC,ASC
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
    * 过滤条件
    */
    @SerializedName("Filters")
    @Expose
    private QueryFilter [] Filters;

    /**
     * Get 限制数 
     * @return Limit 限制数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制数
     * @param Limit 限制数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移值 
     * @return Offset 偏移值
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移值
     * @param Offset 偏移值
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序字段 
     * @return OrderBy 排序字段
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段
     * @param OrderBy 排序字段
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 排序方式，desc,asc,DESC,ASC 
     * @return OrderByType 排序方式，desc,asc,DESC,ASC
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * Set 排序方式，desc,asc,DESC,ASC
     * @param OrderByType 排序方式，desc,asc,DESC,ASC
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * Get 过滤条件 
     * @return Filters 过滤条件
     */
    public QueryFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件
     * @param Filters 过滤条件
     */
    public void setFilters(QueryFilter [] Filters) {
        this.Filters = Filters;
    }

    public DownloadLibraDBClusterListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DownloadLibraDBClusterListRequest(DownloadLibraDBClusterListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String(source.OrderBy);
        }
        if (source.OrderByType != null) {
            this.OrderByType = new String(source.OrderByType);
        }
        if (source.Filters != null) {
            this.Filters = new QueryFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new QueryFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

