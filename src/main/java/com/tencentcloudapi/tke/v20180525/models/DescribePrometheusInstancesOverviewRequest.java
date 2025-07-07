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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePrometheusInstancesOverviewRequest extends AbstractModel {

    /**
    * 用于分页
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 用于分页
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤实例，目前支持：
ID: 通过实例ID来过滤 
Name: 通过实例名称来过滤
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 用于分页 
     * @return Offset 用于分页
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 用于分页
     * @param Offset 用于分页
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 用于分页 
     * @return Limit 用于分页
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 用于分页
     * @param Limit 用于分页
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤实例，目前支持：
ID: 通过实例ID来过滤 
Name: 通过实例名称来过滤 
     * @return Filters 过滤实例，目前支持：
ID: 通过实例ID来过滤 
Name: 通过实例名称来过滤
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤实例，目前支持：
ID: 通过实例ID来过滤 
Name: 通过实例名称来过滤
     * @param Filters 过滤实例，目前支持：
ID: 通过实例ID来过滤 
Name: 通过实例名称来过滤
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribePrometheusInstancesOverviewRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePrometheusInstancesOverviewRequest(DescribePrometheusInstancesOverviewRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

