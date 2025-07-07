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

public class DescribeCCRuleListRequest extends AbstractModel {

    /**
    * 需要查询的API所属的域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 偏移
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 容量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 目前支持根据ts_version排序
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 过滤数组,name可以是如下的值： RuleID,ParamName,Url,Action,Method,Source,Status
    */
    @SerializedName("Filters")
    @Expose
    private FiltersItemNew [] Filters;

    /**
    * asc或者desc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 需要查询的API所属的域名 
     * @return Domain 需要查询的API所属的域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 需要查询的API所属的域名
     * @param Domain 需要查询的API所属的域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 偏移 
     * @return Offset 偏移
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移
     * @param Offset 偏移
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 容量 
     * @return Limit 容量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 容量
     * @param Limit 容量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 目前支持根据ts_version排序 
     * @return By 目前支持根据ts_version排序
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 目前支持根据ts_version排序
     * @param By 目前支持根据ts_version排序
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 过滤数组,name可以是如下的值： RuleID,ParamName,Url,Action,Method,Source,Status 
     * @return Filters 过滤数组,name可以是如下的值： RuleID,ParamName,Url,Action,Method,Source,Status
     */
    public FiltersItemNew [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤数组,name可以是如下的值： RuleID,ParamName,Url,Action,Method,Source,Status
     * @param Filters 过滤数组,name可以是如下的值： RuleID,ParamName,Url,Action,Method,Source,Status
     */
    public void setFilters(FiltersItemNew [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get asc或者desc 
     * @return Order asc或者desc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set asc或者desc
     * @param Order asc或者desc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public DescribeCCRuleListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCCRuleListRequest(DescribeCCRuleListRequest source) {
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
        if (source.Filters != null) {
            this.Filters = new FiltersItemNew[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new FiltersItemNew(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

