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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeZonesRequest extends AbstractModel{

    /**
    * 分页参数，页偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页参数，每页返回的站点个数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询条件过滤器，复杂类型
    */
    @SerializedName("Filters")
    @Expose
    private ZoneFilter [] Filters;

    /**
     * Get 分页参数，页偏移 
     * @return Offset 分页参数，页偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数，页偏移
     * @param Offset 分页参数，页偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页参数，每页返回的站点个数 
     * @return Limit 分页参数，每页返回的站点个数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数，每页返回的站点个数
     * @param Limit 分页参数，每页返回的站点个数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询条件过滤器，复杂类型 
     * @return Filters 查询条件过滤器，复杂类型
     */
    public ZoneFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询条件过滤器，复杂类型
     * @param Filters 查询条件过滤器，复杂类型
     */
    public void setFilters(ZoneFilter [] Filters) {
        this.Filters = Filters;
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
            this.Filters = new ZoneFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new ZoneFilter(source.Filters[i]);
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

