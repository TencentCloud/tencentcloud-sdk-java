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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRiskCategoryStatsRequest extends AbstractModel {

    /**
    * 分页大小,默认20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量,默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 产品类型
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 筛选器
    */
    @SerializedName("Filters")
    @Expose
    private CommonFilter [] Filters;

    /**
    * 排序字段："RuleCount", "TreatedCount", "IgnoredCount", "UntreatedCount", "DisposalRate"
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 顺序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 成员Id
    */
    @SerializedName("MemberId")
    @Expose
    private String MemberId;

    /**
     * Get 分页大小,默认20 
     * @return Limit 分页大小,默认20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页大小,默认20
     * @param Limit 分页大小,默认20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量,默认0 
     * @return Offset 分页偏移量,默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量,默认0
     * @param Offset 分页偏移量,默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 产品类型 
     * @return Product 产品类型
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 产品类型
     * @param Product 产品类型
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 筛选器 
     * @return Filters 筛选器
     */
    public CommonFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 筛选器
     * @param Filters 筛选器
     */
    public void setFilters(CommonFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序字段："RuleCount", "TreatedCount", "IgnoredCount", "UntreatedCount", "DisposalRate" 
     * @return By 排序字段："RuleCount", "TreatedCount", "IgnoredCount", "UntreatedCount", "DisposalRate"
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段："RuleCount", "TreatedCount", "IgnoredCount", "UntreatedCount", "DisposalRate"
     * @param By 排序字段："RuleCount", "TreatedCount", "IgnoredCount", "UntreatedCount", "DisposalRate"
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 顺序 
     * @return Order 顺序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 顺序
     * @param Order 顺序
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 成员Id 
     * @return MemberId 成员Id
     */
    public String getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 成员Id
     * @param MemberId 成员Id
     */
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    public DescribeRiskCategoryStatsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRiskCategoryStatsRequest(DescribeRiskCategoryStatsRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Filters != null) {
            this.Filters = new CommonFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new CommonFilter(source.Filters[i]);
            }
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.MemberId != null) {
            this.MemberId = new String(source.MemberId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "MemberId", this.MemberId);

    }
}

