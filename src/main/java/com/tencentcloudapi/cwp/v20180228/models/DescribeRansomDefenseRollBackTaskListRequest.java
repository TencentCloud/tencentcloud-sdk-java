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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRansomDefenseRollBackTaskListRequest extends AbstractModel {

    /**
    * 分页参数 最大100条
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页参数
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤条件。
<li>Ips- string- 主机名称</li>
<li>Status - Uint64 - 0进行中，1成功，2失败</li>
<li>Names- String - 主机名称</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * 排序方法 ASC DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序字段支持CreateTime、ModifyTime
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get 分页参数 最大100条 
     * @return Limit 分页参数 最大100条
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页参数 最大100条
     * @param Limit 分页参数 最大100条
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页参数 
     * @return Offset 分页参数
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页参数
     * @param Offset 分页参数
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤条件。
<li>Ips- string- 主机名称</li>
<li>Status - Uint64 - 0进行中，1成功，2失败</li>
<li>Names- String - 主机名称</li> 
     * @return Filters 过滤条件。
<li>Ips- string- 主机名称</li>
<li>Status - Uint64 - 0进行中，1成功，2失败</li>
<li>Names- String - 主机名称</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>Ips- string- 主机名称</li>
<li>Status - Uint64 - 0进行中，1成功，2失败</li>
<li>Names- String - 主机名称</li>
     * @param Filters 过滤条件。
<li>Ips- string- 主机名称</li>
<li>Status - Uint64 - 0进行中，1成功，2失败</li>
<li>Names- String - 主机名称</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序方法 ASC DESC 
     * @return Order 排序方法 ASC DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方法 ASC DESC
     * @param Order 排序方法 ASC DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序字段支持CreateTime、ModifyTime 
     * @return By 排序字段支持CreateTime、ModifyTime
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段支持CreateTime、ModifyTime
     * @param By 排序字段支持CreateTime、ModifyTime
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeRansomDefenseRollBackTaskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRansomDefenseRollBackTaskListRequest(DescribeRansomDefenseRollBackTaskListRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
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
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

