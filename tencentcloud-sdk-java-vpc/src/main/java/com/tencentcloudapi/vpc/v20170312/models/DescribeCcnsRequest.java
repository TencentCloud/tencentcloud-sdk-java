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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCcnsRequest extends AbstractModel{

    /**
    * CCN实例ID。形如：ccn-f49l6u0z。每次请求的实例的上限为100。参数不支持同时指定CcnIds和Filters。
    */
    @SerializedName("CcnIds")
    @Expose
    private String [] CcnIds;

    /**
    * 过滤条件，参数不支持同时指定CcnIds和Filters。
<li>ccn-id - String - （过滤条件）CCN唯一ID，形如：vpc-f49l6u0z。</li>
<li>ccn-name - String - （过滤条件）CCN名称。</li>
<li>ccn-description - String - （过滤条件）CCN描述。</li>
<li>state - String - （过滤条件）实例状态， 'ISOLATED': 隔离中（欠费停服），'AVAILABLE'：运行中。</li>
<li>tag-key - String -是否必填：否- （过滤条件）按照标签键进行过滤。</li>
<li>tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。使用请参考示例：查询绑定了标签的CCN列表。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序字段。支持：`CcnId` `CcnName` `CreateTime` `State` `QosLevel`
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序方法。顺序：`ASC`，倒序：`DESC`。
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
     * Get CCN实例ID。形如：ccn-f49l6u0z。每次请求的实例的上限为100。参数不支持同时指定CcnIds和Filters。 
     * @return CcnIds CCN实例ID。形如：ccn-f49l6u0z。每次请求的实例的上限为100。参数不支持同时指定CcnIds和Filters。
     */
    public String [] getCcnIds() {
        return this.CcnIds;
    }

    /**
     * Set CCN实例ID。形如：ccn-f49l6u0z。每次请求的实例的上限为100。参数不支持同时指定CcnIds和Filters。
     * @param CcnIds CCN实例ID。形如：ccn-f49l6u0z。每次请求的实例的上限为100。参数不支持同时指定CcnIds和Filters。
     */
    public void setCcnIds(String [] CcnIds) {
        this.CcnIds = CcnIds;
    }

    /**
     * Get 过滤条件，参数不支持同时指定CcnIds和Filters。
<li>ccn-id - String - （过滤条件）CCN唯一ID，形如：vpc-f49l6u0z。</li>
<li>ccn-name - String - （过滤条件）CCN名称。</li>
<li>ccn-description - String - （过滤条件）CCN描述。</li>
<li>state - String - （过滤条件）实例状态， 'ISOLATED': 隔离中（欠费停服），'AVAILABLE'：运行中。</li>
<li>tag-key - String -是否必填：否- （过滤条件）按照标签键进行过滤。</li>
<li>tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。使用请参考示例：查询绑定了标签的CCN列表。</li> 
     * @return Filters 过滤条件，参数不支持同时指定CcnIds和Filters。
<li>ccn-id - String - （过滤条件）CCN唯一ID，形如：vpc-f49l6u0z。</li>
<li>ccn-name - String - （过滤条件）CCN名称。</li>
<li>ccn-description - String - （过滤条件）CCN描述。</li>
<li>state - String - （过滤条件）实例状态， 'ISOLATED': 隔离中（欠费停服），'AVAILABLE'：运行中。</li>
<li>tag-key - String -是否必填：否- （过滤条件）按照标签键进行过滤。</li>
<li>tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。使用请参考示例：查询绑定了标签的CCN列表。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，参数不支持同时指定CcnIds和Filters。
<li>ccn-id - String - （过滤条件）CCN唯一ID，形如：vpc-f49l6u0z。</li>
<li>ccn-name - String - （过滤条件）CCN名称。</li>
<li>ccn-description - String - （过滤条件）CCN描述。</li>
<li>state - String - （过滤条件）实例状态， 'ISOLATED': 隔离中（欠费停服），'AVAILABLE'：运行中。</li>
<li>tag-key - String -是否必填：否- （过滤条件）按照标签键进行过滤。</li>
<li>tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。使用请参考示例：查询绑定了标签的CCN列表。</li>
     * @param Filters 过滤条件，参数不支持同时指定CcnIds和Filters。
<li>ccn-id - String - （过滤条件）CCN唯一ID，形如：vpc-f49l6u0z。</li>
<li>ccn-name - String - （过滤条件）CCN名称。</li>
<li>ccn-description - String - （过滤条件）CCN描述。</li>
<li>state - String - （过滤条件）实例状态， 'ISOLATED': 隔离中（欠费停服），'AVAILABLE'：运行中。</li>
<li>tag-key - String -是否必填：否- （过滤条件）按照标签键进行过滤。</li>
<li>tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。使用请参考示例：查询绑定了标签的CCN列表。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量 
     * @return Limit 返回数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量
     * @param Limit 返回数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序字段。支持：`CcnId` `CcnName` `CreateTime` `State` `QosLevel` 
     * @return OrderField 排序字段。支持：`CcnId` `CcnName` `CreateTime` `State` `QosLevel`
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序字段。支持：`CcnId` `CcnName` `CreateTime` `State` `QosLevel`
     * @param OrderField 排序字段。支持：`CcnId` `CcnName` `CreateTime` `State` `QosLevel`
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 排序方法。顺序：`ASC`，倒序：`DESC`。 
     * @return OrderDirection 排序方法。顺序：`ASC`，倒序：`DESC`。
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set 排序方法。顺序：`ASC`，倒序：`DESC`。
     * @param OrderDirection 排序方法。顺序：`ASC`，倒序：`DESC`。
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CcnIds.", this.CcnIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);

    }
}

