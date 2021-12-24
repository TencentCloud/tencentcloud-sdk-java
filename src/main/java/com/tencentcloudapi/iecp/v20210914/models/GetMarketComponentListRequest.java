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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetMarketComponentListRequest extends AbstractModel{

    /**
    * 页偏移，从0开始
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 名称模糊筛选
    */
    @SerializedName("Filter")
    @Expose
    private String Filter;

    /**
    * 以名称排序，ASC、DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 页偏移，从0开始 
     * @return Offset 页偏移，从0开始
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 页偏移，从0开始
     * @param Offset 页偏移，从0开始
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页条数 
     * @return Limit 每页条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页条数
     * @param Limit 每页条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 名称模糊筛选 
     * @return Filter 名称模糊筛选
     */
    public String getFilter() {
        return this.Filter;
    }

    /**
     * Set 名称模糊筛选
     * @param Filter 名称模糊筛选
     */
    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 以名称排序，ASC、DESC 
     * @return Order 以名称排序，ASC、DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 以名称排序，ASC、DESC
     * @param Order 以名称排序，ASC、DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public GetMarketComponentListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetMarketComponentListRequest(GetMarketComponentListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filter != null) {
            this.Filter = new String(source.Filter);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Filter", this.Filter);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

