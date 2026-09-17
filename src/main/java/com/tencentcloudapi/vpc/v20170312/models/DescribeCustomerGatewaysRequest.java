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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCustomerGatewaysRequest extends AbstractModel {

    /**
    * <p>对端网关ID，例如：cgw-2wqq41m9。每次请求的实例的上限为100。参数不支持同时指定CustomerGatewayIds和Filters。</p>
    */
    @SerializedName("CustomerGatewayIds")
    @Expose
    private String [] CustomerGatewayIds;

    /**
    * <p>过滤条件，详见下表：实例过滤条件表。每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定CustomerGatewayIds和Filters。<li>customer-gateway-id - String - （过滤条件）用户网关唯一ID形如：<code>cgw-mgp33pll</code>。</li><li>customer-gateway-name - String - （过滤条件）用户网关名称形如：<code>test-cgw</code>。</li><li>ip-address - String - （过滤条件）公网地址形如：<code>58.211.1.12</code>。</li><li>ip-version - String - （过滤条件）公网地址类型,可选值[&#39;IPv4&#39;,&#39;IPv6&#39;]。</li></p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>偏移量，默认为0。关于Offset的更进一步介绍请参考 API <a href="https://cloud.tencent.com/document/api/213/11646">简介</a>中的相关小节。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数量，默认为20，最大值为100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>对端网关ID，例如：cgw-2wqq41m9。每次请求的实例的上限为100。参数不支持同时指定CustomerGatewayIds和Filters。</p> 
     * @return CustomerGatewayIds <p>对端网关ID，例如：cgw-2wqq41m9。每次请求的实例的上限为100。参数不支持同时指定CustomerGatewayIds和Filters。</p>
     */
    public String [] getCustomerGatewayIds() {
        return this.CustomerGatewayIds;
    }

    /**
     * Set <p>对端网关ID，例如：cgw-2wqq41m9。每次请求的实例的上限为100。参数不支持同时指定CustomerGatewayIds和Filters。</p>
     * @param CustomerGatewayIds <p>对端网关ID，例如：cgw-2wqq41m9。每次请求的实例的上限为100。参数不支持同时指定CustomerGatewayIds和Filters。</p>
     */
    public void setCustomerGatewayIds(String [] CustomerGatewayIds) {
        this.CustomerGatewayIds = CustomerGatewayIds;
    }

    /**
     * Get <p>过滤条件，详见下表：实例过滤条件表。每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定CustomerGatewayIds和Filters。<li>customer-gateway-id - String - （过滤条件）用户网关唯一ID形如：<code>cgw-mgp33pll</code>。</li><li>customer-gateway-name - String - （过滤条件）用户网关名称形如：<code>test-cgw</code>。</li><li>ip-address - String - （过滤条件）公网地址形如：<code>58.211.1.12</code>。</li><li>ip-version - String - （过滤条件）公网地址类型,可选值[&#39;IPv4&#39;,&#39;IPv6&#39;]。</li></p> 
     * @return Filters <p>过滤条件，详见下表：实例过滤条件表。每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定CustomerGatewayIds和Filters。<li>customer-gateway-id - String - （过滤条件）用户网关唯一ID形如：<code>cgw-mgp33pll</code>。</li><li>customer-gateway-name - String - （过滤条件）用户网关名称形如：<code>test-cgw</code>。</li><li>ip-address - String - （过滤条件）公网地址形如：<code>58.211.1.12</code>。</li><li>ip-version - String - （过滤条件）公网地址类型,可选值[&#39;IPv4&#39;,&#39;IPv6&#39;]。</li></p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件，详见下表：实例过滤条件表。每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定CustomerGatewayIds和Filters。<li>customer-gateway-id - String - （过滤条件）用户网关唯一ID形如：<code>cgw-mgp33pll</code>。</li><li>customer-gateway-name - String - （过滤条件）用户网关名称形如：<code>test-cgw</code>。</li><li>ip-address - String - （过滤条件）公网地址形如：<code>58.211.1.12</code>。</li><li>ip-version - String - （过滤条件）公网地址类型,可选值[&#39;IPv4&#39;,&#39;IPv6&#39;]。</li></p>
     * @param Filters <p>过滤条件，详见下表：实例过滤条件表。每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定CustomerGatewayIds和Filters。<li>customer-gateway-id - String - （过滤条件）用户网关唯一ID形如：<code>cgw-mgp33pll</code>。</li><li>customer-gateway-name - String - （过滤条件）用户网关名称形如：<code>test-cgw</code>。</li><li>ip-address - String - （过滤条件）公网地址形如：<code>58.211.1.12</code>。</li><li>ip-version - String - （过滤条件）公网地址类型,可选值[&#39;IPv4&#39;,&#39;IPv6&#39;]。</li></p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>偏移量，默认为0。关于Offset的更进一步介绍请参考 API <a href="https://cloud.tencent.com/document/api/213/11646">简介</a>中的相关小节。</p> 
     * @return Offset <p>偏移量，默认为0。关于Offset的更进一步介绍请参考 API <a href="https://cloud.tencent.com/document/api/213/11646">简介</a>中的相关小节。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为0。关于Offset的更进一步介绍请参考 API <a href="https://cloud.tencent.com/document/api/213/11646">简介</a>中的相关小节。</p>
     * @param Offset <p>偏移量，默认为0。关于Offset的更进一步介绍请参考 API <a href="https://cloud.tencent.com/document/api/213/11646">简介</a>中的相关小节。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数量，默认为20，最大值为100。</p> 
     * @return Limit <p>返回数量，默认为20，最大值为100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认为20，最大值为100。</p>
     * @param Limit <p>返回数量，默认为20，最大值为100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeCustomerGatewaysRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCustomerGatewaysRequest(DescribeCustomerGatewaysRequest source) {
        if (source.CustomerGatewayIds != null) {
            this.CustomerGatewayIds = new String[source.CustomerGatewayIds.length];
            for (int i = 0; i < source.CustomerGatewayIds.length; i++) {
                this.CustomerGatewayIds[i] = new String(source.CustomerGatewayIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "CustomerGatewayIds.", this.CustomerGatewayIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

