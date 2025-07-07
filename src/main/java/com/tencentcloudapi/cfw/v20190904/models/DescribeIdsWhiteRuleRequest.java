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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIdsWhiteRuleRequest extends AbstractModel {

    /**
    * 每页条数
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
    * 过滤条件组合
    */
    @SerializedName("Filters")
    @Expose
    private CommonFilter [] Filters;

    /**
    * desc：降序；asc：升序。根据By字段的值进行排序，这里传参的话则By也必须有值
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序所用到的字段
    */
    @SerializedName("By")
    @Expose
    private String By;

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
     * Get 过滤条件组合 
     * @return Filters 过滤条件组合
     */
    public CommonFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件组合
     * @param Filters 过滤条件组合
     */
    public void setFilters(CommonFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get desc：降序；asc：升序。根据By字段的值进行排序，这里传参的话则By也必须有值 
     * @return Order desc：降序；asc：升序。根据By字段的值进行排序，这里传参的话则By也必须有值
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set desc：降序；asc：升序。根据By字段的值进行排序，这里传参的话则By也必须有值
     * @param Order desc：降序；asc：升序。根据By字段的值进行排序，这里传参的话则By也必须有值
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序所用到的字段 
     * @return By 排序所用到的字段
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序所用到的字段
     * @param By 排序所用到的字段
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeIdsWhiteRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIdsWhiteRuleRequest(DescribeIdsWhiteRuleRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new CommonFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new CommonFilter(source.Filters[i]);
            }
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
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

