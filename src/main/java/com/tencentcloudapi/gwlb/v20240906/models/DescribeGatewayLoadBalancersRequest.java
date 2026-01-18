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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGatewayLoadBalancersRequest extends AbstractModel {

    /**
    * <p>网关负载均衡实例ID。支持批量筛选的实例ID数量上限为20个。</p>
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
    * <p>一次批量返回网关负载均衡实例的数量，默认为20，最大值为100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>返回网关负载均衡实例列表的起始偏移量，默认0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>查询负载均衡详细信息列表的过滤条件，每次请求的Filters的上限为10，Filter.Values的上限为100。Filter.Name和Filter.Values皆为必填项。详细的过滤条件如下：- VpcId - String - 是否必填：否 - （过滤条件）按照网关负载均衡实例所属的私有网络过滤，如“vpc-bhqk****”。- Vips - String  - 是否必填：否 - （过滤条件）按照网关负载均衡实例的VIP进行过滤，如“10.1.1.1”- tag:tag-key - String - 是否必填：否 - （过滤条件）按照GWLB标签键值对进行过滤，tag-key使用具体的标签键进行替换。</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>搜索字段，模糊匹配名称、VIP。</p>
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
     * Get <p>网关负载均衡实例ID。支持批量筛选的实例ID数量上限为20个。</p> 
     * @return LoadBalancerIds <p>网关负载均衡实例ID。支持批量筛选的实例ID数量上限为20个。</p>
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set <p>网关负载均衡实例ID。支持批量筛选的实例ID数量上限为20个。</p>
     * @param LoadBalancerIds <p>网关负载均衡实例ID。支持批量筛选的实例ID数量上限为20个。</p>
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * Get <p>一次批量返回网关负载均衡实例的数量，默认为20，最大值为100。</p> 
     * @return Limit <p>一次批量返回网关负载均衡实例的数量，默认为20，最大值为100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>一次批量返回网关负载均衡实例的数量，默认为20，最大值为100。</p>
     * @param Limit <p>一次批量返回网关负载均衡实例的数量，默认为20，最大值为100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>返回网关负载均衡实例列表的起始偏移量，默认0。</p> 
     * @return Offset <p>返回网关负载均衡实例列表的起始偏移量，默认0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>返回网关负载均衡实例列表的起始偏移量，默认0。</p>
     * @param Offset <p>返回网关负载均衡实例列表的起始偏移量，默认0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>查询负载均衡详细信息列表的过滤条件，每次请求的Filters的上限为10，Filter.Values的上限为100。Filter.Name和Filter.Values皆为必填项。详细的过滤条件如下：- VpcId - String - 是否必填：否 - （过滤条件）按照网关负载均衡实例所属的私有网络过滤，如“vpc-bhqk****”。- Vips - String  - 是否必填：否 - （过滤条件）按照网关负载均衡实例的VIP进行过滤，如“10.1.1.1”- tag:tag-key - String - 是否必填：否 - （过滤条件）按照GWLB标签键值对进行过滤，tag-key使用具体的标签键进行替换。</p> 
     * @return Filters <p>查询负载均衡详细信息列表的过滤条件，每次请求的Filters的上限为10，Filter.Values的上限为100。Filter.Name和Filter.Values皆为必填项。详细的过滤条件如下：- VpcId - String - 是否必填：否 - （过滤条件）按照网关负载均衡实例所属的私有网络过滤，如“vpc-bhqk****”。- Vips - String  - 是否必填：否 - （过滤条件）按照网关负载均衡实例的VIP进行过滤，如“10.1.1.1”- tag:tag-key - String - 是否必填：否 - （过滤条件）按照GWLB标签键值对进行过滤，tag-key使用具体的标签键进行替换。</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>查询负载均衡详细信息列表的过滤条件，每次请求的Filters的上限为10，Filter.Values的上限为100。Filter.Name和Filter.Values皆为必填项。详细的过滤条件如下：- VpcId - String - 是否必填：否 - （过滤条件）按照网关负载均衡实例所属的私有网络过滤，如“vpc-bhqk****”。- Vips - String  - 是否必填：否 - （过滤条件）按照网关负载均衡实例的VIP进行过滤，如“10.1.1.1”- tag:tag-key - String - 是否必填：否 - （过滤条件）按照GWLB标签键值对进行过滤，tag-key使用具体的标签键进行替换。</p>
     * @param Filters <p>查询负载均衡详细信息列表的过滤条件，每次请求的Filters的上限为10，Filter.Values的上限为100。Filter.Name和Filter.Values皆为必填项。详细的过滤条件如下：- VpcId - String - 是否必填：否 - （过滤条件）按照网关负载均衡实例所属的私有网络过滤，如“vpc-bhqk****”。- Vips - String  - 是否必填：否 - （过滤条件）按照网关负载均衡实例的VIP进行过滤，如“10.1.1.1”- tag:tag-key - String - 是否必填：否 - （过滤条件）按照GWLB标签键值对进行过滤，tag-key使用具体的标签键进行替换。</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>搜索字段，模糊匹配名称、VIP。</p> 
     * @return SearchKey <p>搜索字段，模糊匹配名称、VIP。</p>
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set <p>搜索字段，模糊匹配名称、VIP。</p>
     * @param SearchKey <p>搜索字段，模糊匹配名称、VIP。</p>
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    public DescribeGatewayLoadBalancersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGatewayLoadBalancersRequest(DescribeGatewayLoadBalancersRequest source) {
        if (source.LoadBalancerIds != null) {
            this.LoadBalancerIds = new String[source.LoadBalancerIds.length];
            for (int i = 0; i < source.LoadBalancerIds.length; i++) {
                this.LoadBalancerIds[i] = new String(source.LoadBalancerIds[i]);
            }
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
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);

    }
}

