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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeExclusiveClustersRequest extends AbstractModel{

    /**
    * 返回集群列表数目，默认值为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 返回集群列表起始偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询集群列表条件，详细的过滤条件如下：
<li> cluster-type - String - 是否必填：否 - （过滤条件）按照 集群 的类型过滤，包括"TGW","STGW","VPCGW"。</li>
<li> cluster-id - String - 是否必填：否 - （过滤条件）按照 集群 的唯一ID过滤，如 ："tgw-12345678","stgw-12345678","vpcgw-12345678"。</li>
<li> cluster-name - String - 是否必填：否 - （过滤条件）按照 集群 的名称过滤。</li>
<li> cluster-tag - String - 是否必填：否 - （过滤条件）按照 集群 的标签过滤。（只有TGW/STGW集群有集群标签） </li>
<li> vip - String - 是否必填：否 - （过滤条件）按照 集群 内的vip过滤。</li>
<li> loadblancer-id - String - 是否必填：否 - （过滤条件）按照 集群 内的负载均衡唯一ID过滤。</li>
<li> network - String - 是否必填：否 - （过滤条件）按照 集群 的网络类型过滤，如："Public","Private"。</li>
<li> zone - String - 是否必填：否 - （过滤条件）按照 集群 所在可用区过滤，如："ap-guangzhou-1"（广州一区）。</li>
<li> isp -- String - 是否必填：否 - （过滤条件）按照TGW集群的 Isp 类型过滤，如："BGP","CMCC","CUCC","CTCC","INTERNAL"。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 返回集群列表数目，默认值为20，最大值为100。 
     * @return Limit 返回集群列表数目，默认值为20，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回集群列表数目，默认值为20，最大值为100。
     * @param Limit 返回集群列表数目，默认值为20，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 返回集群列表起始偏移量，默认为0。 
     * @return Offset 返回集群列表起始偏移量，默认为0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 返回集群列表起始偏移量，默认为0。
     * @param Offset 返回集群列表起始偏移量，默认为0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询集群列表条件，详细的过滤条件如下：
<li> cluster-type - String - 是否必填：否 - （过滤条件）按照 集群 的类型过滤，包括"TGW","STGW","VPCGW"。</li>
<li> cluster-id - String - 是否必填：否 - （过滤条件）按照 集群 的唯一ID过滤，如 ："tgw-12345678","stgw-12345678","vpcgw-12345678"。</li>
<li> cluster-name - String - 是否必填：否 - （过滤条件）按照 集群 的名称过滤。</li>
<li> cluster-tag - String - 是否必填：否 - （过滤条件）按照 集群 的标签过滤。（只有TGW/STGW集群有集群标签） </li>
<li> vip - String - 是否必填：否 - （过滤条件）按照 集群 内的vip过滤。</li>
<li> loadblancer-id - String - 是否必填：否 - （过滤条件）按照 集群 内的负载均衡唯一ID过滤。</li>
<li> network - String - 是否必填：否 - （过滤条件）按照 集群 的网络类型过滤，如："Public","Private"。</li>
<li> zone - String - 是否必填：否 - （过滤条件）按照 集群 所在可用区过滤，如："ap-guangzhou-1"（广州一区）。</li>
<li> isp -- String - 是否必填：否 - （过滤条件）按照TGW集群的 Isp 类型过滤，如："BGP","CMCC","CUCC","CTCC","INTERNAL"。</li> 
     * @return Filters 查询集群列表条件，详细的过滤条件如下：
<li> cluster-type - String - 是否必填：否 - （过滤条件）按照 集群 的类型过滤，包括"TGW","STGW","VPCGW"。</li>
<li> cluster-id - String - 是否必填：否 - （过滤条件）按照 集群 的唯一ID过滤，如 ："tgw-12345678","stgw-12345678","vpcgw-12345678"。</li>
<li> cluster-name - String - 是否必填：否 - （过滤条件）按照 集群 的名称过滤。</li>
<li> cluster-tag - String - 是否必填：否 - （过滤条件）按照 集群 的标签过滤。（只有TGW/STGW集群有集群标签） </li>
<li> vip - String - 是否必填：否 - （过滤条件）按照 集群 内的vip过滤。</li>
<li> loadblancer-id - String - 是否必填：否 - （过滤条件）按照 集群 内的负载均衡唯一ID过滤。</li>
<li> network - String - 是否必填：否 - （过滤条件）按照 集群 的网络类型过滤，如："Public","Private"。</li>
<li> zone - String - 是否必填：否 - （过滤条件）按照 集群 所在可用区过滤，如："ap-guangzhou-1"（广州一区）。</li>
<li> isp -- String - 是否必填：否 - （过滤条件）按照TGW集群的 Isp 类型过滤，如："BGP","CMCC","CUCC","CTCC","INTERNAL"。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询集群列表条件，详细的过滤条件如下：
<li> cluster-type - String - 是否必填：否 - （过滤条件）按照 集群 的类型过滤，包括"TGW","STGW","VPCGW"。</li>
<li> cluster-id - String - 是否必填：否 - （过滤条件）按照 集群 的唯一ID过滤，如 ："tgw-12345678","stgw-12345678","vpcgw-12345678"。</li>
<li> cluster-name - String - 是否必填：否 - （过滤条件）按照 集群 的名称过滤。</li>
<li> cluster-tag - String - 是否必填：否 - （过滤条件）按照 集群 的标签过滤。（只有TGW/STGW集群有集群标签） </li>
<li> vip - String - 是否必填：否 - （过滤条件）按照 集群 内的vip过滤。</li>
<li> loadblancer-id - String - 是否必填：否 - （过滤条件）按照 集群 内的负载均衡唯一ID过滤。</li>
<li> network - String - 是否必填：否 - （过滤条件）按照 集群 的网络类型过滤，如："Public","Private"。</li>
<li> zone - String - 是否必填：否 - （过滤条件）按照 集群 所在可用区过滤，如："ap-guangzhou-1"（广州一区）。</li>
<li> isp -- String - 是否必填：否 - （过滤条件）按照TGW集群的 Isp 类型过滤，如："BGP","CMCC","CUCC","CTCC","INTERNAL"。</li>
     * @param Filters 查询集群列表条件，详细的过滤条件如下：
<li> cluster-type - String - 是否必填：否 - （过滤条件）按照 集群 的类型过滤，包括"TGW","STGW","VPCGW"。</li>
<li> cluster-id - String - 是否必填：否 - （过滤条件）按照 集群 的唯一ID过滤，如 ："tgw-12345678","stgw-12345678","vpcgw-12345678"。</li>
<li> cluster-name - String - 是否必填：否 - （过滤条件）按照 集群 的名称过滤。</li>
<li> cluster-tag - String - 是否必填：否 - （过滤条件）按照 集群 的标签过滤。（只有TGW/STGW集群有集群标签） </li>
<li> vip - String - 是否必填：否 - （过滤条件）按照 集群 内的vip过滤。</li>
<li> loadblancer-id - String - 是否必填：否 - （过滤条件）按照 集群 内的负载均衡唯一ID过滤。</li>
<li> network - String - 是否必填：否 - （过滤条件）按照 集群 的网络类型过滤，如："Public","Private"。</li>
<li> zone - String - 是否必填：否 - （过滤条件）按照 集群 所在可用区过滤，如："ap-guangzhou-1"（广州一区）。</li>
<li> isp -- String - 是否必填：否 - （过滤条件）按照TGW集群的 Isp 类型过滤，如："BGP","CMCC","CUCC","CTCC","INTERNAL"。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeExclusiveClustersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExclusiveClustersRequest(DescribeExclusiveClustersRequest source) {
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

