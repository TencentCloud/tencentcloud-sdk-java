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

public class DescribeBaselineItemIgnoreListRequest extends AbstractModel {

    /**
    * 忽略规则ID
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
    * 限制条数,默认10,最大100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 请求偏移默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <li>CatgoryId - int64 - 是否必填：否 - 规则Id</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序方式 [ASC:升序|DESC:降序]
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 可选排序列 [ID]
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get 忽略规则ID 
     * @return RuleID 忽略规则ID
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set 忽略规则ID
     * @param RuleID 忽略规则ID
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get 限制条数,默认10,最大100 
     * @return Limit 限制条数,默认10,最大100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制条数,默认10,最大100
     * @param Limit 限制条数,默认10,最大100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 请求偏移默认0 
     * @return Offset 请求偏移默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 请求偏移默认0
     * @param Offset 请求偏移默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <li>CatgoryId - int64 - 是否必填：否 - 规则Id</li> 
     * @return Filters <li>CatgoryId - int64 - 是否必填：否 - 规则Id</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>CatgoryId - int64 - 是否必填：否 - 规则Id</li>
     * @param Filters <li>CatgoryId - int64 - 是否必填：否 - 规则Id</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序方式 [ASC:升序|DESC:降序] 
     * @return Order 排序方式 [ASC:升序|DESC:降序]
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式 [ASC:升序|DESC:降序]
     * @param Order 排序方式 [ASC:升序|DESC:降序]
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 可选排序列 [ID] 
     * @return By 可选排序列 [ID]
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 可选排序列 [ID]
     * @param By 可选排序列 [ID]
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeBaselineItemIgnoreListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBaselineItemIgnoreListRequest(DescribeBaselineItemIgnoreListRequest source) {
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
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
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

