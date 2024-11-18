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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGatewayLoadBalancersRequest extends AbstractModel {

    /**
    * 网关负载均衡实例ID。支持批量筛选的实例ID数量上限为20个。
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
    * 一次批量返回网关负载均衡实例的数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 返回网关负载均衡实例列表的起始偏移量，默认0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询负载均衡详细信息列表的过滤条件，每次请求的Filters的上限为10，Filter.Values的上限为100。
Filter.Name和Filter.Values皆为必填项。详细的过滤条件如下：
- name - String - 是否必填：否 - （过滤条件）按照网关负载均衡实例名称过滤，如“gwlb-xxxx”。
- VpcId - String - 是否必填：否 - （过滤条件）按照网关负载均衡实例所属的私有网络过滤，如“vpc-bhqk****”。

    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 搜索字段，模糊匹配名称、VIP。
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
     * Get 网关负载均衡实例ID。支持批量筛选的实例ID数量上限为20个。 
     * @return LoadBalancerIds 网关负载均衡实例ID。支持批量筛选的实例ID数量上限为20个。
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * Set 网关负载均衡实例ID。支持批量筛选的实例ID数量上限为20个。
     * @param LoadBalancerIds 网关负载均衡实例ID。支持批量筛选的实例ID数量上限为20个。
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * Get 一次批量返回网关负载均衡实例的数量，默认为20，最大值为100。 
     * @return Limit 一次批量返回网关负载均衡实例的数量，默认为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 一次批量返回网关负载均衡实例的数量，默认为20，最大值为100。
     * @param Limit 一次批量返回网关负载均衡实例的数量，默认为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 返回网关负载均衡实例列表的起始偏移量，默认0。 
     * @return Offset 返回网关负载均衡实例列表的起始偏移量，默认0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 返回网关负载均衡实例列表的起始偏移量，默认0。
     * @param Offset 返回网关负载均衡实例列表的起始偏移量，默认0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询负载均衡详细信息列表的过滤条件，每次请求的Filters的上限为10，Filter.Values的上限为100。
Filter.Name和Filter.Values皆为必填项。详细的过滤条件如下：
- name - String - 是否必填：否 - （过滤条件）按照网关负载均衡实例名称过滤，如“gwlb-xxxx”。
- VpcId - String - 是否必填：否 - （过滤条件）按照网关负载均衡实例所属的私有网络过滤，如“vpc-bhqk****”。
 
     * @return Filters 查询负载均衡详细信息列表的过滤条件，每次请求的Filters的上限为10，Filter.Values的上限为100。
Filter.Name和Filter.Values皆为必填项。详细的过滤条件如下：
- name - String - 是否必填：否 - （过滤条件）按照网关负载均衡实例名称过滤，如“gwlb-xxxx”。
- VpcId - String - 是否必填：否 - （过滤条件）按照网关负载均衡实例所属的私有网络过滤，如“vpc-bhqk****”。

     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询负载均衡详细信息列表的过滤条件，每次请求的Filters的上限为10，Filter.Values的上限为100。
Filter.Name和Filter.Values皆为必填项。详细的过滤条件如下：
- name - String - 是否必填：否 - （过滤条件）按照网关负载均衡实例名称过滤，如“gwlb-xxxx”。
- VpcId - String - 是否必填：否 - （过滤条件）按照网关负载均衡实例所属的私有网络过滤，如“vpc-bhqk****”。

     * @param Filters 查询负载均衡详细信息列表的过滤条件，每次请求的Filters的上限为10，Filter.Values的上限为100。
Filter.Name和Filter.Values皆为必填项。详细的过滤条件如下：
- name - String - 是否必填：否 - （过滤条件）按照网关负载均衡实例名称过滤，如“gwlb-xxxx”。
- VpcId - String - 是否必填：否 - （过滤条件）按照网关负载均衡实例所属的私有网络过滤，如“vpc-bhqk****”。

     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 搜索字段，模糊匹配名称、VIP。 
     * @return SearchKey 搜索字段，模糊匹配名称、VIP。
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 搜索字段，模糊匹配名称、VIP。
     * @param SearchKey 搜索字段，模糊匹配名称、VIP。
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

