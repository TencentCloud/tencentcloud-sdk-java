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

public class DescribeRateLimitsV2Request extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 限流规则ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 规则名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 限流接口名
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 限流对象，可选API、Domain
    */
    @SerializedName("LimitObject")
    @Expose
    private String LimitObject;

    /**
    * 规则开关，0表示关闭，1表示开启
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 排序方式，可选desc、asc
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序字段，可选Priority、Timestamp、ID
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 分页的起始位置
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页行数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤器
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
     * Get 限流规则ID 
     * @return Id 限流规则ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 限流规则ID
     * @param Id 限流规则ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 规则名 
     * @return Name 规则名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则名
     * @param Name 规则名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 限流接口名 
     * @return Method 限流接口名
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 限流接口名
     * @param Method 限流接口名
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 限流对象，可选API、Domain 
     * @return LimitObject 限流对象，可选API、Domain
     */
    public String getLimitObject() {
        return this.LimitObject;
    }

    /**
     * Set 限流对象，可选API、Domain
     * @param LimitObject 限流对象，可选API、Domain
     */
    public void setLimitObject(String LimitObject) {
        this.LimitObject = LimitObject;
    }

    /**
     * Get 规则开关，0表示关闭，1表示开启 
     * @return Status 规则开关，0表示关闭，1表示开启
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 规则开关，0表示关闭，1表示开启
     * @param Status 规则开关，0表示关闭，1表示开启
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 排序方式，可选desc、asc 
     * @return Order 排序方式，可选desc、asc
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式，可选desc、asc
     * @param Order 排序方式，可选desc、asc
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序字段，可选Priority、Timestamp、ID 
     * @return By 排序字段，可选Priority、Timestamp、ID
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段，可选Priority、Timestamp、ID
     * @param By 排序字段，可选Priority、Timestamp、ID
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 分页的起始位置 
     * @return Offset 分页的起始位置
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页的起始位置
     * @param Offset 分页的起始位置
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 每页行数 
     * @return Limit 每页行数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 每页行数
     * @param Limit 每页行数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤器 
     * @return Filters 过滤器
     */
    public FiltersItemNew [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤器
     * @param Filters 过滤器
     */
    public void setFilters(FiltersItemNew [] Filters) {
        this.Filters = Filters;
    }

    public DescribeRateLimitsV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRateLimitsV2Request(DescribeRateLimitsV2Request source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.LimitObject != null) {
            this.LimitObject = new String(source.LimitObject);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "LimitObject", this.LimitObject);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

