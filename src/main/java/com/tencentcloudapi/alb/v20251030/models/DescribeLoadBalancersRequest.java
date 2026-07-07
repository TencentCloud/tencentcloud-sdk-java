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
    * 查询过滤条件，支持以下几个字段
- **LoadBalancerId**: 负载均衡实例 ID
- **LoadBalancerName**: 负载均衡名称
- **LoadBalancerStatus**: 负载均衡状态
- **VpcId**: 私有网络 ID
- **tag:tag-key**：按标签键值对筛选，tag-key 请替换为实际的标签键。例如 `tag:env` 表示按标签键 `env` 筛选。
- **AddressType**: 网络类型
    - **Intranet**: 内网
    - **Internet**: 公网 
- **AddressIpVersion**:
    - **IPv4**: IPv4 地址
    - **IPv6** IPv6 地址
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 分批次查询时每次显示的条目数。取值范围：**1**~**100**，默认值：**20**。


    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * 是否拥有下一次查询的令牌（Token）。取值：
- 第一次查询和没有下一次查询时，均无需填写。
- 如果有下一次查询，取值为上一次API调用返回的**NextToken**值。
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
     * Get 查询过滤条件，支持以下几个字段
- **LoadBalancerId**: 负载均衡实例 ID
- **LoadBalancerName**: 负载均衡名称
- **LoadBalancerStatus**: 负载均衡状态
- **VpcId**: 私有网络 ID
- **tag:tag-key**：按标签键值对筛选，tag-key 请替换为实际的标签键。例如 `tag:env` 表示按标签键 `env` 筛选。
- **AddressType**: 网络类型
    - **Intranet**: 内网
    - **Internet**: 公网 
- **AddressIpVersion**:
    - **IPv4**: IPv4 地址
    - **IPv6** IPv6 地址 
     * @return Filters 查询过滤条件，支持以下几个字段
- **LoadBalancerId**: 负载均衡实例 ID
- **LoadBalancerName**: 负载均衡名称
- **LoadBalancerStatus**: 负载均衡状态
- **VpcId**: 私有网络 ID
- **tag:tag-key**：按标签键值对筛选，tag-key 请替换为实际的标签键。例如 `tag:env` 表示按标签键 `env` 筛选。
- **AddressType**: 网络类型
    - **Intranet**: 内网
    - **Internet**: 公网 
- **AddressIpVersion**:
    - **IPv4**: IPv4 地址
    - **IPv6** IPv6 地址
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询过滤条件，支持以下几个字段
- **LoadBalancerId**: 负载均衡实例 ID
- **LoadBalancerName**: 负载均衡名称
- **LoadBalancerStatus**: 负载均衡状态
- **VpcId**: 私有网络 ID
- **tag:tag-key**：按标签键值对筛选，tag-key 请替换为实际的标签键。例如 `tag:env` 表示按标签键 `env` 筛选。
- **AddressType**: 网络类型
    - **Intranet**: 内网
    - **Internet**: 公网 
- **AddressIpVersion**:
    - **IPv4**: IPv4 地址
    - **IPv6** IPv6 地址
     * @param Filters 查询过滤条件，支持以下几个字段
- **LoadBalancerId**: 负载均衡实例 ID
- **LoadBalancerName**: 负载均衡名称
- **LoadBalancerStatus**: 负载均衡状态
- **VpcId**: 私有网络 ID
- **tag:tag-key**：按标签键值对筛选，tag-key 请替换为实际的标签键。例如 `tag:env` 表示按标签键 `env` 筛选。
- **AddressType**: 网络类型
    - **Intranet**: 内网
    - **Internet**: 公网 
- **AddressIpVersion**:
    - **IPv4**: IPv4 地址
    - **IPv6** IPv6 地址
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 分批次查询时每次显示的条目数。取值范围：**1**~**100**，默认值：**20**。

 
     * @return MaxResults 分批次查询时每次显示的条目数。取值范围：**1**~**100**，默认值：**20**。


     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set 分批次查询时每次显示的条目数。取值范围：**1**~**100**，默认值：**20**。


     * @param MaxResults 分批次查询时每次显示的条目数。取值范围：**1**~**100**，默认值：**20**。


     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get 是否拥有下一次查询的令牌（Token）。取值：
- 第一次查询和没有下一次查询时，均无需填写。
- 如果有下一次查询，取值为上一次API调用返回的**NextToken**值。 
     * @return NextToken 是否拥有下一次查询的令牌（Token）。取值：
- 第一次查询和没有下一次查询时，均无需填写。
- 如果有下一次查询，取值为上一次API调用返回的**NextToken**值。
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set 是否拥有下一次查询的令牌（Token）。取值：
- 第一次查询和没有下一次查询时，均无需填写。
- 如果有下一次查询，取值为上一次API调用返回的**NextToken**值。
     * @param NextToken 是否拥有下一次查询的令牌（Token）。取值：
- 第一次查询和没有下一次查询时，均无需填写。
- 如果有下一次查询，取值为上一次API调用返回的**NextToken**值。
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

