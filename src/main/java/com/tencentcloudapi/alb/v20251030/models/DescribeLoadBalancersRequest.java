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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLoadBalancersRequest extends AbstractModel {

    /**
    * <p>查询过滤条件，支持以下几个字段</p><ul><li><strong>LoadBalancerId</strong>: 负载均衡实例 ID</li><li><strong>LoadBalancerName</strong>: 负载均衡名称</li><li><strong>LoadBalancerStatus</strong>: 负载均衡状态</li><li><strong>VpcId</strong>: 私有网络 ID</li><li><strong>tag:tag-key</strong>：按标签键值对筛选，tag-key 请替换为实际的标签键。例如 <code>tag:env</code> 表示按标签键 <code>env</code> 筛选。</li><li><strong>AddressType</strong>: 网络类型<ul><li><strong>Intranet</strong>: 内网</li><li><strong>Internet</strong>: 公网 </li></ul></li><li><strong>AddressIpVersion</strong>:<ul><li><strong>IPv4</strong>: IPv4 地址</li><li><strong>IPv6</strong> IPv6 地址</li></ul></li><li><strong>SecurityGroupId</strong>: 安全组ID</li></ul>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>分批次查询时每次显示的条目数。取值范围：<strong>1</strong>~<strong>100</strong>，默认值：<strong>20</strong>。</p>
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * <p>是否拥有下一次查询的令牌（Token）。取值：</p><ul><li>第一次查询和没有下一次查询时，均无需填写。</li><li>如果有下一次查询，取值为上一次API调用返回的<strong>NextToken</strong>值。</li></ul>
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
     * Get <p>查询过滤条件，支持以下几个字段</p><ul><li><strong>LoadBalancerId</strong>: 负载均衡实例 ID</li><li><strong>LoadBalancerName</strong>: 负载均衡名称</li><li><strong>LoadBalancerStatus</strong>: 负载均衡状态</li><li><strong>VpcId</strong>: 私有网络 ID</li><li><strong>tag:tag-key</strong>：按标签键值对筛选，tag-key 请替换为实际的标签键。例如 <code>tag:env</code> 表示按标签键 <code>env</code> 筛选。</li><li><strong>AddressType</strong>: 网络类型<ul><li><strong>Intranet</strong>: 内网</li><li><strong>Internet</strong>: 公网 </li></ul></li><li><strong>AddressIpVersion</strong>:<ul><li><strong>IPv4</strong>: IPv4 地址</li><li><strong>IPv6</strong> IPv6 地址</li></ul></li><li><strong>SecurityGroupId</strong>: 安全组ID</li></ul> 
     * @return Filters <p>查询过滤条件，支持以下几个字段</p><ul><li><strong>LoadBalancerId</strong>: 负载均衡实例 ID</li><li><strong>LoadBalancerName</strong>: 负载均衡名称</li><li><strong>LoadBalancerStatus</strong>: 负载均衡状态</li><li><strong>VpcId</strong>: 私有网络 ID</li><li><strong>tag:tag-key</strong>：按标签键值对筛选，tag-key 请替换为实际的标签键。例如 <code>tag:env</code> 表示按标签键 <code>env</code> 筛选。</li><li><strong>AddressType</strong>: 网络类型<ul><li><strong>Intranet</strong>: 内网</li><li><strong>Internet</strong>: 公网 </li></ul></li><li><strong>AddressIpVersion</strong>:<ul><li><strong>IPv4</strong>: IPv4 地址</li><li><strong>IPv6</strong> IPv6 地址</li></ul></li><li><strong>SecurityGroupId</strong>: 安全组ID</li></ul>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>查询过滤条件，支持以下几个字段</p><ul><li><strong>LoadBalancerId</strong>: 负载均衡实例 ID</li><li><strong>LoadBalancerName</strong>: 负载均衡名称</li><li><strong>LoadBalancerStatus</strong>: 负载均衡状态</li><li><strong>VpcId</strong>: 私有网络 ID</li><li><strong>tag:tag-key</strong>：按标签键值对筛选，tag-key 请替换为实际的标签键。例如 <code>tag:env</code> 表示按标签键 <code>env</code> 筛选。</li><li><strong>AddressType</strong>: 网络类型<ul><li><strong>Intranet</strong>: 内网</li><li><strong>Internet</strong>: 公网 </li></ul></li><li><strong>AddressIpVersion</strong>:<ul><li><strong>IPv4</strong>: IPv4 地址</li><li><strong>IPv6</strong> IPv6 地址</li></ul></li><li><strong>SecurityGroupId</strong>: 安全组ID</li></ul>
     * @param Filters <p>查询过滤条件，支持以下几个字段</p><ul><li><strong>LoadBalancerId</strong>: 负载均衡实例 ID</li><li><strong>LoadBalancerName</strong>: 负载均衡名称</li><li><strong>LoadBalancerStatus</strong>: 负载均衡状态</li><li><strong>VpcId</strong>: 私有网络 ID</li><li><strong>tag:tag-key</strong>：按标签键值对筛选，tag-key 请替换为实际的标签键。例如 <code>tag:env</code> 表示按标签键 <code>env</code> 筛选。</li><li><strong>AddressType</strong>: 网络类型<ul><li><strong>Intranet</strong>: 内网</li><li><strong>Internet</strong>: 公网 </li></ul></li><li><strong>AddressIpVersion</strong>:<ul><li><strong>IPv4</strong>: IPv4 地址</li><li><strong>IPv6</strong> IPv6 地址</li></ul></li><li><strong>SecurityGroupId</strong>: 安全组ID</li></ul>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>分批次查询时每次显示的条目数。取值范围：<strong>1</strong>~<strong>100</strong>，默认值：<strong>20</strong>。</p> 
     * @return MaxResults <p>分批次查询时每次显示的条目数。取值范围：<strong>1</strong>~<strong>100</strong>，默认值：<strong>20</strong>。</p>
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set <p>分批次查询时每次显示的条目数。取值范围：<strong>1</strong>~<strong>100</strong>，默认值：<strong>20</strong>。</p>
     * @param MaxResults <p>分批次查询时每次显示的条目数。取值范围：<strong>1</strong>~<strong>100</strong>，默认值：<strong>20</strong>。</p>
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get <p>是否拥有下一次查询的令牌（Token）。取值：</p><ul><li>第一次查询和没有下一次查询时，均无需填写。</li><li>如果有下一次查询，取值为上一次API调用返回的<strong>NextToken</strong>值。</li></ul> 
     * @return NextToken <p>是否拥有下一次查询的令牌（Token）。取值：</p><ul><li>第一次查询和没有下一次查询时，均无需填写。</li><li>如果有下一次查询，取值为上一次API调用返回的<strong>NextToken</strong>值。</li></ul>
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set <p>是否拥有下一次查询的令牌（Token）。取值：</p><ul><li>第一次查询和没有下一次查询时，均无需填写。</li><li>如果有下一次查询，取值为上一次API调用返回的<strong>NextToken</strong>值。</li></ul>
     * @param NextToken <p>是否拥有下一次查询的令牌（Token）。取值：</p><ul><li>第一次查询和没有下一次查询时，均无需填写。</li><li>如果有下一次查询，取值为上一次API调用返回的<strong>NextToken</strong>值。</li></ul>
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    public DescribeLoadBalancersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLoadBalancersRequest(DescribeLoadBalancersRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);

    }
}

