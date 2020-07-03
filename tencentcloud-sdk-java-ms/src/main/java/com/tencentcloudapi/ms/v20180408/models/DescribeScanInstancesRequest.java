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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScanInstancesRequest extends AbstractModel{

    /**
    * 支持通过app名称，app包名进行筛选
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，默认为0
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
     * Get 支持通过app名称，app包名进行筛选 
     * @return Filters 支持通过app名称，app包名进行筛选
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 支持通过app名称，app包名进行筛选
     * @param Filters 支持通过app名称，app包名进行筛选
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
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

