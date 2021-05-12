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
    * 防火墙状态  0: 关闭，1：开启
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 资产类型 CVM/NAT/VPN/CLB/其它
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 地域 上海/重庆/广州，等等
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 搜索值  例子："{"common":"106.54.189.45"}"
    */
    @SerializedName("SearchValue")
    @Expose
    private String SearchValue;

    /**
    * 条数  默认值:10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移值 默认值: 0
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
    * 排序字段 PortTimes(风险端口数)
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get 防火墙状态  0: 关闭，1：开启 
     * @return Status 防火墙状态  0: 关闭，1：开启
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 防火墙状态  0: 关闭，1：开启
     * @param Status 防火墙状态  0: 关闭，1：开启
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 资产类型 CVM/NAT/VPN/CLB/其它 
     * @return Type 资产类型 CVM/NAT/VPN/CLB/其它
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 资产类型 CVM/NAT/VPN/CLB/其它
     * @param Type 资产类型 CVM/NAT/VPN/CLB/其它
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 地域 上海/重庆/广州，等等 
     * @return Area 地域 上海/重庆/广州，等等
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 地域 上海/重庆/广州，等等
     * @param Area 地域 上海/重庆/广州，等等
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 搜索值  例子："{"common":"106.54.189.45"}" 
     * @return SearchValue 搜索值  例子："{"common":"106.54.189.45"}"
     */
    public String getSearchValue() {
        return this.SearchValue;
    }

    /**
     * Set 搜索值  例子："{"common":"106.54.189.45"}"
     * @param SearchValue 搜索值  例子："{"common":"106.54.189.45"}"
     */
    public void setSearchValue(String SearchValue) {
        this.SearchValue = SearchValue;
    }

    /**
     * Get 条数  默认值:10 
     * @return Limit 条数  默认值:10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 条数  默认值:10
     * @param Limit 条数  默认值:10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移值 默认值: 0 
     * @return Offset 偏移值 默认值: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移值 默认值: 0
     * @param Offset 偏移值 默认值: 0
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
     * Get 排序字段 PortTimes(风险端口数) 
     * @return By 排序字段 PortTimes(风险端口数)
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段 PortTimes(风险端口数)
     * @param By 排序字段 PortTimes(风险端口数)
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeSwitchListsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSwitchListsRequest(DescribeSwitchListsRequest source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.SearchValue != null) {
            this.SearchValue = new String(source.SearchValue);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
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

