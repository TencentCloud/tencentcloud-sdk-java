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

public class DescribeNatGatewaysRequest extends AbstractModel {

    /**
    * NAT网关统一 ID，形如：`nat-123xx454`。每次请求的实例上限为100。参数不支持同时指定NatGatewayIds和Filters。
    */
    @SerializedName("NatGatewayIds")
    @Expose
    private String [] NatGatewayIds;

    /**
    * 过滤条件，参数不支持同时指定NatGatewayIds和Filters。每次请求的Filters的上限为10，Filter.Values的上限为5。
<li>nat-gateway-id - String - （过滤条件）协议端口模板实例ID，形如：`nat-123xx454`。</li>
<li>vpc-id - String - （过滤条件）私有网络 唯一ID，形如：`vpc-123xx454`。</li>
<li>nat-gateway-name - String - （过滤条件）协议端口模板实例ID，形如：`test_nat`。</li>
<li>tag-key - String - （过滤条件）标签键，形如：`test-key`。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，默认为0。
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
     * Get NAT网关统一 ID，形如：`nat-123xx454`。每次请求的实例上限为100。参数不支持同时指定NatGatewayIds和Filters。 
     * @return NatGatewayIds NAT网关统一 ID，形如：`nat-123xx454`。每次请求的实例上限为100。参数不支持同时指定NatGatewayIds和Filters。
     */
    public String [] getNatGatewayIds() {
        return this.NatGatewayIds;
    }

    /**
     * Set NAT网关统一 ID，形如：`nat-123xx454`。每次请求的实例上限为100。参数不支持同时指定NatGatewayIds和Filters。
     * @param NatGatewayIds NAT网关统一 ID，形如：`nat-123xx454`。每次请求的实例上限为100。参数不支持同时指定NatGatewayIds和Filters。
     */
    public void setNatGatewayIds(String [] NatGatewayIds) {
        this.NatGatewayIds = NatGatewayIds;
    }

    /**
     * Get 过滤条件，参数不支持同时指定NatGatewayIds和Filters。每次请求的Filters的上限为10，Filter.Values的上限为5。
<li>nat-gateway-id - String - （过滤条件）协议端口模板实例ID，形如：`nat-123xx454`。</li>
<li>vpc-id - String - （过滤条件）私有网络 唯一ID，形如：`vpc-123xx454`。</li>
<li>nat-gateway-name - String - （过滤条件）协议端口模板实例ID，形如：`test_nat`。</li>
<li>tag-key - String - （过滤条件）标签键，形如：`test-key`。</li> 
     * @return Filters 过滤条件，参数不支持同时指定NatGatewayIds和Filters。每次请求的Filters的上限为10，Filter.Values的上限为5。
<li>nat-gateway-id - String - （过滤条件）协议端口模板实例ID，形如：`nat-123xx454`。</li>
<li>vpc-id - String - （过滤条件）私有网络 唯一ID，形如：`vpc-123xx454`。</li>
<li>nat-gateway-name - String - （过滤条件）协议端口模板实例ID，形如：`test_nat`。</li>
<li>tag-key - String - （过滤条件）标签键，形如：`test-key`。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，参数不支持同时指定NatGatewayIds和Filters。每次请求的Filters的上限为10，Filter.Values的上限为5。
<li>nat-gateway-id - String - （过滤条件）协议端口模板实例ID，形如：`nat-123xx454`。</li>
<li>vpc-id - String - （过滤条件）私有网络 唯一ID，形如：`vpc-123xx454`。</li>
<li>nat-gateway-name - String - （过滤条件）协议端口模板实例ID，形如：`test_nat`。</li>
<li>tag-key - String - （过滤条件）标签键，形如：`test-key`。</li>
     * @param Filters 过滤条件，参数不支持同时指定NatGatewayIds和Filters。每次请求的Filters的上限为10，Filter.Values的上限为5。
<li>nat-gateway-id - String - （过滤条件）协议端口模板实例ID，形如：`nat-123xx454`。</li>
<li>vpc-id - String - （过滤条件）私有网络 唯一ID，形如：`vpc-123xx454`。</li>
<li>nat-gateway-name - String - （过滤条件）协议端口模板实例ID，形如：`test_nat`。</li>
<li>tag-key - String - （过滤条件）标签键，形如：`test-key`。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，默认为0。 
     * @return Offset 偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
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

    public DescribeNatGatewaysRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNatGatewaysRequest(DescribeNatGatewaysRequest source) {
        if (source.NatGatewayIds != null) {
            this.NatGatewayIds = new String[source.NatGatewayIds.length];
            for (int i = 0; i < source.NatGatewayIds.length; i++) {
                this.NatGatewayIds[i] = new String(source.NatGatewayIds[i]);
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
        this.setParamArraySimple(map, prefix + "NatGatewayIds.", this.NatGatewayIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

