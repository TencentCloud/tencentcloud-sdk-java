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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeExpertServiceListRequest extends AbstractModel{

    /**
    * 过滤条件。
<li>Keyword- String - 是否必填：否 - 关键词过滤，</li>
<li>Uuids - String - 是否必填：否 - 主机id过滤</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * 需要返回的数量，最大值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序步长
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 排序方法
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序字段 StartTime，EndTime
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get 过滤条件。
<li>Keyword- String - 是否必填：否 - 关键词过滤，</li>
<li>Uuids - String - 是否必填：否 - 主机id过滤</li> 
     * @return Filters 过滤条件。
<li>Keyword- String - 是否必填：否 - 关键词过滤，</li>
<li>Uuids - String - 是否必填：否 - 主机id过滤</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>Keyword- String - 是否必填：否 - 关键词过滤，</li>
<li>Uuids - String - 是否必填：否 - 主机id过滤</li>
     * @param Filters 过滤条件。
<li>Keyword- String - 是否必填：否 - 关键词过滤，</li>
<li>Uuids - String - 是否必填：否 - 主机id过滤</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 需要返回的数量，最大值为100 
     * @return Limit 需要返回的数量，最大值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 需要返回的数量，最大值为100
     * @param Limit 需要返回的数量，最大值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序步长 
     * @return Offset 排序步长
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 排序步长
     * @param Offset 排序步长
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 排序方法 
     * @return Order 排序方法
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方法
     * @param Order 排序方法
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序字段 StartTime，EndTime 
     * @return By 排序字段 StartTime，EndTime
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段 StartTime，EndTime
     * @param By 排序字段 StartTime，EndTime
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeExpertServiceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExpertServiceListRequest(DescribeExpertServiceListRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

