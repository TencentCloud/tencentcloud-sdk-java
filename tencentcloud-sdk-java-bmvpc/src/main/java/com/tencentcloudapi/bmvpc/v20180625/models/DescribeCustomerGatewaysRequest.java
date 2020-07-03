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
package com.tencentcloudapi.bmvpc.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCustomerGatewaysRequest extends AbstractModel{

    /**
    * 对端网关ID，例如：bmcgw-2wqq41m9。每次请求的实例的上限为100。参数不支持同时指定CustomerGatewayIds和Filters。
    */
    @SerializedName("CustomerGatewayIds")
    @Expose
    private String [] CustomerGatewayIds;

    /**
    * 过滤条件，详见下表：实例过滤条件表。每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定CustomerGatewayIds和Filters。
<li>customergateway-name - String - （过滤条件）对端网关名称。</li>
<li>ip-address - String - （过滤条件)对端网关地址。</li>
<li>customergateway-id - String - （过滤条件）对端网关唯一ID。</li>
<li>zone - String - （过滤条件）对端所在可用区，形如：ap-guangzhou-2。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 排序字段, 支持"CreateTime"排序
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序方向, “asc”、“desc”
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
     * Get 对端网关ID，例如：bmcgw-2wqq41m9。每次请求的实例的上限为100。参数不支持同时指定CustomerGatewayIds和Filters。 
     * @return CustomerGatewayIds 对端网关ID，例如：bmcgw-2wqq41m9。每次请求的实例的上限为100。参数不支持同时指定CustomerGatewayIds和Filters。
     */
    public String [] getCustomerGatewayIds() {
        return this.CustomerGatewayIds;
    }

    /**
     * Set 对端网关ID，例如：bmcgw-2wqq41m9。每次请求的实例的上限为100。参数不支持同时指定CustomerGatewayIds和Filters。
     * @param CustomerGatewayIds 对端网关ID，例如：bmcgw-2wqq41m9。每次请求的实例的上限为100。参数不支持同时指定CustomerGatewayIds和Filters。
     */
    public void setCustomerGatewayIds(String [] CustomerGatewayIds) {
        this.CustomerGatewayIds = CustomerGatewayIds;
    }

    /**
     * Get 过滤条件，详见下表：实例过滤条件表。每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定CustomerGatewayIds和Filters。
<li>customergateway-name - String - （过滤条件）对端网关名称。</li>
<li>ip-address - String - （过滤条件)对端网关地址。</li>
<li>customergateway-id - String - （过滤条件）对端网关唯一ID。</li>
<li>zone - String - （过滤条件）对端所在可用区，形如：ap-guangzhou-2。</li> 
     * @return Filters 过滤条件，详见下表：实例过滤条件表。每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定CustomerGatewayIds和Filters。
<li>customergateway-name - String - （过滤条件）对端网关名称。</li>
<li>ip-address - String - （过滤条件)对端网关地址。</li>
<li>customergateway-id - String - （过滤条件）对端网关唯一ID。</li>
<li>zone - String - （过滤条件）对端所在可用区，形如：ap-guangzhou-2。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，详见下表：实例过滤条件表。每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定CustomerGatewayIds和Filters。
<li>customergateway-name - String - （过滤条件）对端网关名称。</li>
<li>ip-address - String - （过滤条件)对端网关地址。</li>
<li>customergateway-id - String - （过滤条件）对端网关唯一ID。</li>
<li>zone - String - （过滤条件）对端所在可用区，形如：ap-guangzhou-2。</li>
     * @param Filters 过滤条件，详见下表：实例过滤条件表。每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定CustomerGatewayIds和Filters。
<li>customergateway-name - String - （过滤条件）对端网关名称。</li>
<li>ip-address - String - （过滤条件)对端网关地址。</li>
<li>customergateway-id - String - （过滤条件）对端网关唯一ID。</li>
<li>zone - String - （过滤条件）对端所在可用区，形如：ap-guangzhou-2。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。 
     * @return Offset 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。
     * @param Offset 偏移量，默认为0。关于Offset的更进一步介绍请参考 API 简介中的相关小节。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。 
     * @return Limit 返回数量，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。
     * @param Limit 返回数量，默认为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 排序字段, 支持"CreateTime"排序 
     * @return OrderField 排序字段, 支持"CreateTime"排序
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序字段, 支持"CreateTime"排序
     * @param OrderField 排序字段, 支持"CreateTime"排序
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 排序方向, “asc”、“desc” 
     * @return OrderDirection 排序方向, “asc”、“desc”
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set 排序方向, “asc”、“desc”
     * @param OrderDirection 排序方向, “asc”、“desc”
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CustomerGatewayIds.", this.CustomerGatewayIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);

    }
}

