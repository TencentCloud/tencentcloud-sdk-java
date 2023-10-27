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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAntiInfoLeakageRulesRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 翻页支持，读取偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 翻页支持，读取长度限制
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序方式，asc或者desc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 过滤器,可以允许如下的值：
RuleId,Match_field,Name,Action,Status
    */
    @SerializedName("Filters")
    @Expose
    private FiltersItemNew [] Filters;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 翻页支持，读取偏移 
     * @return Offset 翻页支持，读取偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 翻页支持，读取偏移
     * @param Offset 翻页支持，读取偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 翻页支持，读取长度限制 
     * @return Limit 翻页支持，读取长度限制
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 翻页支持，读取长度限制
     * @param Limit 翻页支持，读取长度限制
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序方式，asc或者desc 
     * @return Order 排序方式，asc或者desc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式，asc或者desc
     * @param Order 排序方式，asc或者desc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 过滤器,可以允许如下的值：
RuleId,Match_field,Name,Action,Status 
     * @return Filters 过滤器,可以允许如下的值：
RuleId,Match_field,Name,Action,Status
     */
    public FiltersItemNew [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤器,可以允许如下的值：
RuleId,Match_field,Name,Action,Status
     * @param Filters 过滤器,可以允许如下的值：
RuleId,Match_field,Name,Action,Status
     */
    public void setFilters(FiltersItemNew [] Filters) {
        this.Filters = Filters;
    }

    public DescribeAntiInfoLeakageRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAntiInfoLeakageRulesRequest(DescribeAntiInfoLeakageRulesRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Filters != null) {
            this.Filters = new FiltersItemNew[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new FiltersItemNew(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

