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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetImageRegistryListRequest extends AbstractModel {

    /**
    * <p>需要返回的数量，默认为10，最大值为100</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量，默认为0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>过滤字段<br>IsAuthorized是否授权，取值全部all，未授权0，已授权1</p>
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * <p>排序字段</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * <p>排序方式，asc，desc</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>是否仅展示各repository最新的镜像, 默认为false</p>
    */
    @SerializedName("OnlyShowLatest")
    @Expose
    private Boolean OnlyShowLatest;

    /**
    * <p>是否仅展示运行中容器镜像</p>
    */
    @SerializedName("IsRunning")
    @Expose
    private Boolean IsRunning;

    /**
     * Get <p>需要返回的数量，默认为10，最大值为100</p> 
     * @return Limit <p>需要返回的数量，默认为10，最大值为100</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>需要返回的数量，默认为10，最大值为100</p>
     * @param Limit <p>需要返回的数量，默认为10，最大值为100</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量，默认为0</p> 
     * @return Offset <p>偏移量，默认为0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为0</p>
     * @param Offset <p>偏移量，默认为0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>过滤字段<br>IsAuthorized是否授权，取值全部all，未授权0，已授权1</p> 
     * @return Filters <p>过滤字段<br>IsAuthorized是否授权，取值全部all，未授权0，已授权1</p>
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤字段<br>IsAuthorized是否授权，取值全部all，未授权0，已授权1</p>
     * @param Filters <p>过滤字段<br>IsAuthorized是否授权，取值全部all，未授权0，已授权1</p>
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>排序字段</p> 
     * @return By <p>排序字段</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>排序字段</p>
     * @param By <p>排序字段</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get <p>排序方式，asc，desc</p> 
     * @return Order <p>排序方式，asc，desc</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序方式，asc，desc</p>
     * @param Order <p>排序方式，asc，desc</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>是否仅展示各repository最新的镜像, 默认为false</p> 
     * @return OnlyShowLatest <p>是否仅展示各repository最新的镜像, 默认为false</p>
     */
    public Boolean getOnlyShowLatest() {
        return this.OnlyShowLatest;
    }

    /**
     * Set <p>是否仅展示各repository最新的镜像, 默认为false</p>
     * @param OnlyShowLatest <p>是否仅展示各repository最新的镜像, 默认为false</p>
     */
    public void setOnlyShowLatest(Boolean OnlyShowLatest) {
        this.OnlyShowLatest = OnlyShowLatest;
    }

    /**
     * Get <p>是否仅展示运行中容器镜像</p> 
     * @return IsRunning <p>是否仅展示运行中容器镜像</p>
     */
    public Boolean getIsRunning() {
        return this.IsRunning;
    }

    /**
     * Set <p>是否仅展示运行中容器镜像</p>
     * @param IsRunning <p>是否仅展示运行中容器镜像</p>
     */
    public void setIsRunning(Boolean IsRunning) {
        this.IsRunning = IsRunning;
    }

    public DescribeAssetImageRegistryListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetImageRegistryListRequest(DescribeAssetImageRegistryListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OnlyShowLatest != null) {
            this.OnlyShowLatest = new Boolean(source.OnlyShowLatest);
        }
        if (source.IsRunning != null) {
            this.IsRunning = new Boolean(source.IsRunning);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OnlyShowLatest", this.OnlyShowLatest);
        this.setParamSimple(map, prefix + "IsRunning", this.IsRunning);

    }
}

