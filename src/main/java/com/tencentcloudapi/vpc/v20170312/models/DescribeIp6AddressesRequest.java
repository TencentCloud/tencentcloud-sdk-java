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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIp6AddressesRequest extends AbstractModel {

    /**
    * 标识 IPv6 的唯一 ID 列表。IPv6 唯一 ID 形如：`eip-11112222`。参数不支持同时指定`Ip6AddressIds`和`Filters`。可以使用[DescribeIp6Addresses](https://cloud.tencent.com/document/product/215/40089)接口查询Ip6AddressIds。
    */
    @SerializedName("Ip6AddressIds")
    @Expose
    private String [] Ip6AddressIds;

    /**
    * 每次请求的`Filters`的上限为10，`Filter.Values`的上限为100。参数不支持同时指定`AddressIds`和`Filters`。详细的过滤条件如下：
<li> address-ip - String - 是否必填：否 - （过滤条件）按照 IPv6 的 IP 地址过滤。可以使用[DescribeIp6Addresses](https://cloud.tencent.com/document/product/215/40089)接口查询address-ip。</li>
<li> network-interface-id - String - 是否必填：否 - （过滤条件）按照弹性网卡的唯一ID过滤。可以使用[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口查询network-interface-id。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/11646)中的相关小节。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/11646)中的相关小节。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 标识 IPv6 的唯一 ID 列表。IPv6 唯一 ID 形如：`eip-11112222`。参数不支持同时指定`Ip6AddressIds`和`Filters`。可以使用[DescribeIp6Addresses](https://cloud.tencent.com/document/product/215/40089)接口查询Ip6AddressIds。 
     * @return Ip6AddressIds 标识 IPv6 的唯一 ID 列表。IPv6 唯一 ID 形如：`eip-11112222`。参数不支持同时指定`Ip6AddressIds`和`Filters`。可以使用[DescribeIp6Addresses](https://cloud.tencent.com/document/product/215/40089)接口查询Ip6AddressIds。
     */
    public String [] getIp6AddressIds() {
        return this.Ip6AddressIds;
    }

    /**
     * Set 标识 IPv6 的唯一 ID 列表。IPv6 唯一 ID 形如：`eip-11112222`。参数不支持同时指定`Ip6AddressIds`和`Filters`。可以使用[DescribeIp6Addresses](https://cloud.tencent.com/document/product/215/40089)接口查询Ip6AddressIds。
     * @param Ip6AddressIds 标识 IPv6 的唯一 ID 列表。IPv6 唯一 ID 形如：`eip-11112222`。参数不支持同时指定`Ip6AddressIds`和`Filters`。可以使用[DescribeIp6Addresses](https://cloud.tencent.com/document/product/215/40089)接口查询Ip6AddressIds。
     */
    public void setIp6AddressIds(String [] Ip6AddressIds) {
        this.Ip6AddressIds = Ip6AddressIds;
    }

    /**
     * Get 每次请求的`Filters`的上限为10，`Filter.Values`的上限为100。参数不支持同时指定`AddressIds`和`Filters`。详细的过滤条件如下：
<li> address-ip - String - 是否必填：否 - （过滤条件）按照 IPv6 的 IP 地址过滤。可以使用[DescribeIp6Addresses](https://cloud.tencent.com/document/product/215/40089)接口查询address-ip。</li>
<li> network-interface-id - String - 是否必填：否 - （过滤条件）按照弹性网卡的唯一ID过滤。可以使用[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口查询network-interface-id。</li> 
     * @return Filters 每次请求的`Filters`的上限为10，`Filter.Values`的上限为100。参数不支持同时指定`AddressIds`和`Filters`。详细的过滤条件如下：
<li> address-ip - String - 是否必填：否 - （过滤条件）按照 IPv6 的 IP 地址过滤。可以使用[DescribeIp6Addresses](https://cloud.tencent.com/document/product/215/40089)接口查询address-ip。</li>
<li> network-interface-id - String - 是否必填：否 - （过滤条件）按照弹性网卡的唯一ID过滤。可以使用[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口查询network-interface-id。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 每次请求的`Filters`的上限为10，`Filter.Values`的上限为100。参数不支持同时指定`AddressIds`和`Filters`。详细的过滤条件如下：
<li> address-ip - String - 是否必填：否 - （过滤条件）按照 IPv6 的 IP 地址过滤。可以使用[DescribeIp6Addresses](https://cloud.tencent.com/document/product/215/40089)接口查询address-ip。</li>
<li> network-interface-id - String - 是否必填：否 - （过滤条件）按照弹性网卡的唯一ID过滤。可以使用[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口查询network-interface-id。</li>
     * @param Filters 每次请求的`Filters`的上限为10，`Filter.Values`的上限为100。参数不支持同时指定`AddressIds`和`Filters`。详细的过滤条件如下：
<li> address-ip - String - 是否必填：否 - （过滤条件）按照 IPv6 的 IP 地址过滤。可以使用[DescribeIp6Addresses](https://cloud.tencent.com/document/product/215/40089)接口查询address-ip。</li>
<li> network-interface-id - String - 是否必填：否 - （过滤条件）按照弹性网卡的唯一ID过滤。可以使用[DescribeNetworkInterfaces](https://cloud.tencent.com/document/product/215/15817)接口查询network-interface-id。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/11646)中的相关小节。 
     * @return Offset 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/11646)中的相关小节。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/11646)中的相关小节。
     * @param Offset 偏移量，默认为0。关于`Offset`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/11646)中的相关小节。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/11646)中的相关小节。 
     * @return Limit 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/11646)中的相关小节。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/11646)中的相关小节。
     * @param Limit 返回数量，默认为20，最大值为100。关于`Limit`的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/11646)中的相关小节。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeIp6AddressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIp6AddressesRequest(DescribeIp6AddressesRequest source) {
        if (source.Ip6AddressIds != null) {
            this.Ip6AddressIds = new String[source.Ip6AddressIds.length];
            for (int i = 0; i < source.Ip6AddressIds.length; i++) {
                this.Ip6AddressIds[i] = new String(source.Ip6AddressIds[i]);
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
        this.setParamArraySimple(map, prefix + "Ip6AddressIds.", this.Ip6AddressIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

