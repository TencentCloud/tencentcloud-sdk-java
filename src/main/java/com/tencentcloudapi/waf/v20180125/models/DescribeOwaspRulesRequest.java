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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOwaspRulesRequest extends AbstractModel {

    /**
    * 需要查询的域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 分页页数，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页容量，默认为10
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序字段，支持 RuleId, ModifyTime
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 排序方式，支持asc、desc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 筛选条件，支持 RuleId：规则ID、TypeId：规则类型、Desc：规则描述 、CveID：CVE编号、Status：规则状态、VulLevel：威胁等级
    */
    @SerializedName("Filters")
    @Expose
    private FiltersItemNew [] Filters;

    /**
     * Get 需要查询的域名 
     * @return Domain 需要查询的域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 需要查询的域名
     * @param Domain 需要查询的域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 分页页数，默认为0 
     * @return Offset 分页页数，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页页数，默认为0
     * @param Offset 分页页数，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页容量，默认为10 
     * @return Limit 每页容量，默认为10
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页容量，默认为10
     * @param Limit 每页容量，默认为10
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序字段，支持 RuleId, ModifyTime 
     * @return By 排序字段，支持 RuleId, ModifyTime
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段，支持 RuleId, ModifyTime
     * @param By 排序字段，支持 RuleId, ModifyTime
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 排序方式，支持asc、desc 
     * @return Order 排序方式，支持asc、desc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式，支持asc、desc
     * @param Order 排序方式，支持asc、desc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 筛选条件，支持 RuleId：规则ID、TypeId：规则类型、Desc：规则描述 、CveID：CVE编号、Status：规则状态、VulLevel：威胁等级 
     * @return Filters 筛选条件，支持 RuleId：规则ID、TypeId：规则类型、Desc：规则描述 、CveID：CVE编号、Status：规则状态、VulLevel：威胁等级
     */
    public FiltersItemNew [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 筛选条件，支持 RuleId：规则ID、TypeId：规则类型、Desc：规则描述 、CveID：CVE编号、Status：规则状态、VulLevel：威胁等级
     * @param Filters 筛选条件，支持 RuleId：规则ID、TypeId：规则类型、Desc：规则描述 、CveID：CVE编号、Status：规则状态、VulLevel：威胁等级
     */
    public void setFilters(FiltersItemNew [] Filters) {
        this.Filters = Filters;
    }

    public DescribeOwaspRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOwaspRulesRequest(DescribeOwaspRulesRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
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
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

