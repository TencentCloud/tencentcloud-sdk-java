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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeShieldInstancesRequest extends AbstractModel {

    /**
    * 支持通过app名称，app包名，加固的服务版本，提交的渠道进行筛选。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 数量限制，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 可以提供ItemId数组来查询一个或者多个结果。注意不可以同时指定ItemIds和Filters。
    */
    @SerializedName("ItemIds")
    @Expose
    private String [] ItemIds;

    /**
    * 按某个字段排序，目前仅支持TaskTime排序。
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 升序（asc）还是降序（desc），默认：desc。
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
     * Get 支持通过app名称，app包名，加固的服务版本，提交的渠道进行筛选。 
     * @return Filters 支持通过app名称，app包名，加固的服务版本，提交的渠道进行筛选。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 支持通过app名称，app包名，加固的服务版本，提交的渠道进行筛选。
     * @param Filters 支持通过app名称，app包名，加固的服务版本，提交的渠道进行筛选。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
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
     * Get 数量限制，默认为20，最大值为100。 
     * @return Limit 数量限制，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 数量限制，默认为20，最大值为100。
     * @param Limit 数量限制，默认为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 可以提供ItemId数组来查询一个或者多个结果。注意不可以同时指定ItemIds和Filters。 
     * @return ItemIds 可以提供ItemId数组来查询一个或者多个结果。注意不可以同时指定ItemIds和Filters。
     */
    public String [] getItemIds() {
        return this.ItemIds;
    }

    /**
     * Set 可以提供ItemId数组来查询一个或者多个结果。注意不可以同时指定ItemIds和Filters。
     * @param ItemIds 可以提供ItemId数组来查询一个或者多个结果。注意不可以同时指定ItemIds和Filters。
     */
    public void setItemIds(String [] ItemIds) {
        this.ItemIds = ItemIds;
    }

    /**
     * Get 按某个字段排序，目前仅支持TaskTime排序。 
     * @return OrderField 按某个字段排序，目前仅支持TaskTime排序。
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 按某个字段排序，目前仅支持TaskTime排序。
     * @param OrderField 按某个字段排序，目前仅支持TaskTime排序。
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 升序（asc）还是降序（desc），默认：desc。 
     * @return OrderDirection 升序（asc）还是降序（desc），默认：desc。
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set 升序（asc）还是降序（desc），默认：desc。
     * @param OrderDirection 升序（asc）还是降序（desc），默认：desc。
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    public DescribeShieldInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeShieldInstancesRequest(DescribeShieldInstancesRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ItemIds != null) {
            this.ItemIds = new String[source.ItemIds.length];
            for (int i = 0; i < source.ItemIds.length; i++) {
                this.ItemIds[i] = new String(source.ItemIds[i]);
            }
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.OrderDirection != null) {
            this.OrderDirection = new String(source.OrderDirection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "ItemIds.", this.ItemIds);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);

    }
}

