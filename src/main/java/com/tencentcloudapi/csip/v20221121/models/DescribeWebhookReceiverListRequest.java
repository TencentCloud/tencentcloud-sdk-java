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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWebhookReceiverListRequest extends AbstractModel {

    /**
    * 分页偏移量
取值范围：[0, +∞)
默认值：0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页返回数量
取值范围：[1, 200]
默认值：20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件
支持的过滤项：
Name：按机器人名称模糊搜索
Type：机器人类型，可选值：WEBHOOK（webhook） / SCF（云函数）
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * 排序字段
枚举值：
InsertTime：创建时间
UpdateTime：更新时间
默认值：UpdateTime
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序方式
枚举值：
asc：升序
desc：降序
默认值：desc
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get 分页偏移量
取值范围：[0, +∞)
默认值：0 
     * @return Offset 分页偏移量
取值范围：[0, +∞)
默认值：0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量
取值范围：[0, +∞)
默认值：0
     * @param Offset 分页偏移量
取值范围：[0, +∞)
默认值：0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页返回数量
取值范围：[1, 200]
默认值：20 
     * @return Limit 每页返回数量
取值范围：[1, 200]
默认值：20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页返回数量
取值范围：[1, 200]
默认值：20
     * @param Limit 每页返回数量
取值范围：[1, 200]
默认值：20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件
支持的过滤项：
Name：按机器人名称模糊搜索
Type：机器人类型，可选值：WEBHOOK（webhook） / SCF（云函数） 
     * @return Filters 过滤条件
支持的过滤项：
Name：按机器人名称模糊搜索
Type：机器人类型，可选值：WEBHOOK（webhook） / SCF（云函数）
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件
支持的过滤项：
Name：按机器人名称模糊搜索
Type：机器人类型，可选值：WEBHOOK（webhook） / SCF（云函数）
     * @param Filters 过滤条件
支持的过滤项：
Name：按机器人名称模糊搜索
Type：机器人类型，可选值：WEBHOOK（webhook） / SCF（云函数）
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序字段
枚举值：
InsertTime：创建时间
UpdateTime：更新时间
默认值：UpdateTime 
     * @return Order 排序字段
枚举值：
InsertTime：创建时间
UpdateTime：更新时间
默认值：UpdateTime
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序字段
枚举值：
InsertTime：创建时间
UpdateTime：更新时间
默认值：UpdateTime
     * @param Order 排序字段
枚举值：
InsertTime：创建时间
UpdateTime：更新时间
默认值：UpdateTime
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序方式
枚举值：
asc：升序
desc：降序
默认值：desc 
     * @return By 排序方式
枚举值：
asc：升序
desc：降序
默认值：desc
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序方式
枚举值：
asc：升序
desc：降序
默认值：desc
     * @param By 排序方式
枚举值：
asc：升序
desc：降序
默认值：desc
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeWebhookReceiverListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWebhookReceiverListRequest(DescribeWebhookReceiverListRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
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

