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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSwitchListsRequest extends AbstractModel{

    /**
    * 防火墙状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 资产类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 地域
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 搜索值
    */
    @SerializedName("SearchValue")
    @Expose
    private String SearchValue;

    /**
    * 条数
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
    * 排序，desc：降序，asc：升序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序字段
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get 防火墙状态 
     * @return Status 防火墙状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 防火墙状态
     * @param Status 防火墙状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 资产类型 
     * @return Type 资产类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 资产类型
     * @param Type 资产类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 地域 
     * @return Area 地域
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 地域
     * @param Area 地域
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 搜索值 
     * @return SearchValue 搜索值
     */
    public String getSearchValue() {
        return this.SearchValue;
    }

    /**
     * Set 搜索值
     * @param SearchValue 搜索值
     */
    public void setSearchValue(String SearchValue) {
        this.SearchValue = SearchValue;
    }

    /**
     * Get 条数 
     * @return Limit 条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 条数
     * @param Limit 条数
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
     * Get 排序，desc：降序，asc：升序 
     * @return Order 排序，desc：降序，asc：升序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序，desc：降序，asc：升序
     * @param Order 排序，desc：降序，asc：升序
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序字段 
     * @return By 排序字段
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段
     * @param By 排序字段
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "SearchValue", this.SearchValue);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

