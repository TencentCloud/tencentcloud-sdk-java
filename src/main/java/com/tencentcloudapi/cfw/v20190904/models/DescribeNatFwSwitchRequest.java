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

public class DescribeNatFwSwitchRequest extends AbstractModel {

    /**
    * <p>偏移量，分页用</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>条数，分页用</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>过滤条件组合</p>
    */
    @SerializedName("Filters")
    @Expose
    private CommonFilter [] Filters;

    /**
    * <p>desc：降序；asc：升序。根据By字段的值进行排序，这里传参的话则By也必须有值</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>排序所用到的字段</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <p>偏移量，分页用</p> 
     * @return Offset <p>偏移量，分页用</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，分页用</p>
     * @param Offset <p>偏移量，分页用</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>条数，分页用</p> 
     * @return Limit <p>条数，分页用</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>条数，分页用</p>
     * @param Limit <p>条数，分页用</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>过滤条件组合</p> 
     * @return Filters <p>过滤条件组合</p>
     */
    public CommonFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件组合</p>
     * @param Filters <p>过滤条件组合</p>
     */
    public void setFilters(CommonFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>desc：降序；asc：升序。根据By字段的值进行排序，这里传参的话则By也必须有值</p> 
     * @return Order <p>desc：降序；asc：升序。根据By字段的值进行排序，这里传参的话则By也必须有值</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>desc：降序；asc：升序。根据By字段的值进行排序，这里传参的话则By也必须有值</p>
     * @param Order <p>desc：降序；asc：升序。根据By字段的值进行排序，这里传参的话则By也必须有值</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>排序所用到的字段</p> 
     * @return By <p>排序所用到的字段</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>排序所用到的字段</p>
     * @param By <p>排序所用到的字段</p>
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeNatFwSwitchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatFwSwitchRequest(DescribeNatFwSwitchRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

