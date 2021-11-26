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

public class DescribeAddrTemplateListRequest extends AbstractModel{

    /**
    * 偏移量，分页用
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 条数，分页用
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序字段，取值 'UpdateTime' | 'RulesNum'
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 排序，取值 'asc'|'desc'
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 搜索值
    */
    @SerializedName("SearchValue")
    @Expose
    private String SearchValue;

    /**
     * Get 偏移量，分页用 
     * @return Offset 偏移量，分页用
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，分页用
     * @param Offset 偏移量，分页用
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 条数，分页用 
     * @return Limit 条数，分页用
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 条数，分页用
     * @param Limit 条数，分页用
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序字段，取值 'UpdateTime' | 'RulesNum' 
     * @return By 排序字段，取值 'UpdateTime' | 'RulesNum'
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段，取值 'UpdateTime' | 'RulesNum'
     * @param By 排序字段，取值 'UpdateTime' | 'RulesNum'
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 排序，取值 'asc'|'desc' 
     * @return Order 排序，取值 'asc'|'desc'
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序，取值 'asc'|'desc'
     * @param Order 排序，取值 'asc'|'desc'
     */
    public void setOrder(String Order) {
        this.Order = Order;
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

    public DescribeAddrTemplateListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAddrTemplateListRequest(DescribeAddrTemplateListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.SearchValue != null) {
            this.SearchValue = new String(source.SearchValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "SearchValue", this.SearchValue);

    }
}

