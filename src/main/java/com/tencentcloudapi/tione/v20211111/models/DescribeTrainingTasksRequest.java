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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrainingTasksRequest extends AbstractModel{

    /**
    * 过滤器，eg：[{ "Name": "Id", "Values": ["train-23091792777383936"] }]

取值范围：
Name（名称）：task1
Id（task ID）：train-23091792777383936
Status（状态）：STARTING / RUNNING / STOPPING / STOPPED / FAILED / SUCCEED / SUBMIT_FAILED
ChargeType（计费类型）：PREPAID（预付费）/ POSTPAID_BY_HOUR（后付费）
CHARGE_STATUS（计费状态）：NOT_BILLING（未开始计费）/ BILLING（计费中）/ ARREARS_STOP（欠费停止）
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 标签过滤器，eg：[{ "TagKey": "TagKeyA", "TagValue": ["TagValueA"] }]
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为10，最大为50
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 输出列表的排列顺序。取值范围：ASC（升序排列）/ DESC（降序排列），默认为DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序的依据字段， 取值范围 "CreateTime" "UpdateTime"
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
     * Get 过滤器，eg：[{ "Name": "Id", "Values": ["train-23091792777383936"] }]

取值范围：
Name（名称）：task1
Id（task ID）：train-23091792777383936
Status（状态）：STARTING / RUNNING / STOPPING / STOPPED / FAILED / SUCCEED / SUBMIT_FAILED
ChargeType（计费类型）：PREPAID（预付费）/ POSTPAID_BY_HOUR（后付费）
CHARGE_STATUS（计费状态）：NOT_BILLING（未开始计费）/ BILLING（计费中）/ ARREARS_STOP（欠费停止） 
     * @return Filters 过滤器，eg：[{ "Name": "Id", "Values": ["train-23091792777383936"] }]

取值范围：
Name（名称）：task1
Id（task ID）：train-23091792777383936
Status（状态）：STARTING / RUNNING / STOPPING / STOPPED / FAILED / SUCCEED / SUBMIT_FAILED
ChargeType（计费类型）：PREPAID（预付费）/ POSTPAID_BY_HOUR（后付费）
CHARGE_STATUS（计费状态）：NOT_BILLING（未开始计费）/ BILLING（计费中）/ ARREARS_STOP（欠费停止）
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤器，eg：[{ "Name": "Id", "Values": ["train-23091792777383936"] }]

取值范围：
Name（名称）：task1
Id（task ID）：train-23091792777383936
Status（状态）：STARTING / RUNNING / STOPPING / STOPPED / FAILED / SUCCEED / SUBMIT_FAILED
ChargeType（计费类型）：PREPAID（预付费）/ POSTPAID_BY_HOUR（后付费）
CHARGE_STATUS（计费状态）：NOT_BILLING（未开始计费）/ BILLING（计费中）/ ARREARS_STOP（欠费停止）
     * @param Filters 过滤器，eg：[{ "Name": "Id", "Values": ["train-23091792777383936"] }]

取值范围：
Name（名称）：task1
Id（task ID）：train-23091792777383936
Status（状态）：STARTING / RUNNING / STOPPING / STOPPED / FAILED / SUCCEED / SUBMIT_FAILED
ChargeType（计费类型）：PREPAID（预付费）/ POSTPAID_BY_HOUR（后付费）
CHARGE_STATUS（计费状态）：NOT_BILLING（未开始计费）/ BILLING（计费中）/ ARREARS_STOP（欠费停止）
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 标签过滤器，eg：[{ "TagKey": "TagKeyA", "TagValue": ["TagValueA"] }] 
     * @return TagFilters 标签过滤器，eg：[{ "TagKey": "TagKeyA", "TagValue": ["TagValueA"] }]
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * Set 标签过滤器，eg：[{ "TagKey": "TagKeyA", "TagValue": ["TagValueA"] }]
     * @param TagFilters 标签过滤器，eg：[{ "TagKey": "TagKeyA", "TagValue": ["TagValueA"] }]
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为10，最大为50 
     * @return Limit 返回数量，默认为10，最大为50
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为10，最大为50
     * @param Limit 返回数量，默认为10，最大为50
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 输出列表的排列顺序。取值范围：ASC（升序排列）/ DESC（降序排列），默认为DESC 
     * @return Order 输出列表的排列顺序。取值范围：ASC（升序排列）/ DESC（降序排列），默认为DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 输出列表的排列顺序。取值范围：ASC（升序排列）/ DESC（降序排列），默认为DESC
     * @param Order 输出列表的排列顺序。取值范围：ASC（升序排列）/ DESC（降序排列），默认为DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序的依据字段， 取值范围 "CreateTime" "UpdateTime" 
     * @return OrderField 排序的依据字段， 取值范围 "CreateTime" "UpdateTime"
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序的依据字段， 取值范围 "CreateTime" "UpdateTime"
     * @param OrderField 排序的依据字段， 取值范围 "CreateTime" "UpdateTime"
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    public DescribeTrainingTasksRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTrainingTasksRequest(DescribeTrainingTasksRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.TagFilters != null) {
            this.TagFilters = new TagFilter[source.TagFilters.length];
            for (int i = 0; i < source.TagFilters.length; i++) {
                this.TagFilters[i] = new TagFilter(source.TagFilters[i]);
            }
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
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);

    }
}

