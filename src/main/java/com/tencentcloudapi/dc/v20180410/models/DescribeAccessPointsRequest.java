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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAccessPointsRequest extends AbstractModel {

    /**
    * 接入点所在的地域。你可以通过调用[DescribeRegions](https://cloud.tencent.com/document/product/1596/77930)接口获取地域ID。
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤参数，支持：access-point-id、isp
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 接入点所在的地域。你可以通过调用[DescribeRegions](https://cloud.tencent.com/document/product/1596/77930)接口获取地域ID。 
     * @return RegionId 接入点所在的地域。你可以通过调用[DescribeRegions](https://cloud.tencent.com/document/product/1596/77930)接口获取地域ID。
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 接入点所在的地域。你可以通过调用[DescribeRegions](https://cloud.tencent.com/document/product/1596/77930)接口获取地域ID。
     * @param RegionId 接入点所在的地域。你可以通过调用[DescribeRegions](https://cloud.tencent.com/document/product/1596/77930)接口获取地域ID。
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。 
     * @return Limit 返回数量，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。
     * @param Limit 返回数量，默认为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤参数，支持：access-point-id、isp 
     * @return Filters 过滤参数，支持：access-point-id、isp
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤参数，支持：access-point-id、isp
     * @param Filters 过滤参数，支持：access-point-id、isp
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeAccessPointsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAccessPointsRequest(DescribeAccessPointsRequest source) {
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
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
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

