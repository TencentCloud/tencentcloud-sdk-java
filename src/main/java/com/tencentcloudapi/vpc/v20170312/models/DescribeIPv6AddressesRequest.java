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

public class DescribeIPv6AddressesRequest extends AbstractModel {

    /**
    * 标识 IPv6 的唯一 ID 列。可以使用[DescribeIPv6Addresses](https://cloud.tencent.com/document/api/215/113677)接口获取IPv6AddressId。

- 传统弹性公网 IPv6 唯一 ID 形如：`eip-11112222`
- 弹性公网 IPv6 唯一 ID 形如：`eipv6-11112222`

注意：参数不支持同时指定`IPv6AddressIds`和`Filters`。
    */
    @SerializedName("IPv6AddressIds")
    @Expose
    private String [] IPv6AddressIds;

    /**
    * 每次请求的`Filters`的上限为10，`Filter.Values`的上限为100。参数不支持同时指定`IPv6AddressIds`和`Filters`。详细的过滤条件如下：

- address-id - String - 是否必填：否 - （过滤条件）按照弹性公网IPv6的唯一ID过滤。
- public-ipv6-address - String - 是否必填：否 - （过滤条件）按照公网 IPv6 的 IP 地址过滤。
- network-interface-id - String - 是否必填：否 - （过滤条件）按照弹性网卡的唯一ID过滤。
- instance-id - String - 是否必填：否 - （过滤条件）按照绑定实例的唯一ID过滤。
- charge-type - String - 是否必填：否 - （过滤条件）按照计费类型过滤。
- private-ipv6-address - String - 是否必填：否 - （过滤条件）按照绑定的内网 IPv6 地址过滤。
- egress - String - 是否必填：否 - （过滤条件）按照出口过滤。
- address-type - String - 是否必填：否 - （过滤条件）按照IPv6类型 进行过滤。可选值：'EIP6'：传统弹性公网 IPv6，'EIPv6'：弹性公网 IPv6，'WanIPv6'：普通公网 IPv6，'HighQualityEIPv6'：精品弹性公网 IPv6。默认值是'EIPv6'。
- address-isp - String - 是否必填：否 - （过滤条件）按照 运营商类型 进行过滤。可选值：'BGP'：常规BGP，'CMCC'：移动，'CUCC'：联通, 'CTCC'：电信。
- address-status - String - 是否必填：否 - （过滤条件）按照 EIP 的状态过滤。状态包含：'CREATING'：创建中，'BINDING'：绑定中，'BIND'：已绑，'UNBINDING'：解绑中，'UNBIND'：未绑定，'OFFLINING'：下线中，'BIND_ENI'：绑定了ENI，'PRIVATE'：仅开通内网的IPv6。
- address-name - String - 是否必填：否 - （过滤条件）按照 EIP 名称过滤。不支持模糊过滤。
- tag-key - String - 是否必填：否 - （过滤条件）按照标签键进行过滤。
- tag-value - String - 是否必填：否 - （过滤条件）按照标签值进行过滤。
- tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。tag-key使用具体的标签键进行替换。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 是否查询传统型IPv6地址信息。可选值：
<li>True：查询传统型IPv6地址信息</li>
<li>False：不查询传统型IPv6地址信息</li>
默认值：False
    */
    @SerializedName("Traditional")
    @Expose
    private Boolean Traditional;

    /**
    * 偏移量，默认为0。关于Offset的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/11646)中的相关小节。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/11646)中的相关小节。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 标识 IPv6 的唯一 ID 列。可以使用[DescribeIPv6Addresses](https://cloud.tencent.com/document/api/215/113677)接口获取IPv6AddressId。

- 传统弹性公网 IPv6 唯一 ID 形如：`eip-11112222`
- 弹性公网 IPv6 唯一 ID 形如：`eipv6-11112222`

注意：参数不支持同时指定`IPv6AddressIds`和`Filters`。 
     * @return IPv6AddressIds 标识 IPv6 的唯一 ID 列。可以使用[DescribeIPv6Addresses](https://cloud.tencent.com/document/api/215/113677)接口获取IPv6AddressId。

- 传统弹性公网 IPv6 唯一 ID 形如：`eip-11112222`
- 弹性公网 IPv6 唯一 ID 形如：`eipv6-11112222`

注意：参数不支持同时指定`IPv6AddressIds`和`Filters`。
     */
    public String [] getIPv6AddressIds() {
        return this.IPv6AddressIds;
    }

    /**
     * Set 标识 IPv6 的唯一 ID 列。可以使用[DescribeIPv6Addresses](https://cloud.tencent.com/document/api/215/113677)接口获取IPv6AddressId。

- 传统弹性公网 IPv6 唯一 ID 形如：`eip-11112222`
- 弹性公网 IPv6 唯一 ID 形如：`eipv6-11112222`

注意：参数不支持同时指定`IPv6AddressIds`和`Filters`。
     * @param IPv6AddressIds 标识 IPv6 的唯一 ID 列。可以使用[DescribeIPv6Addresses](https://cloud.tencent.com/document/api/215/113677)接口获取IPv6AddressId。

- 传统弹性公网 IPv6 唯一 ID 形如：`eip-11112222`
- 弹性公网 IPv6 唯一 ID 形如：`eipv6-11112222`

注意：参数不支持同时指定`IPv6AddressIds`和`Filters`。
     */
    public void setIPv6AddressIds(String [] IPv6AddressIds) {
        this.IPv6AddressIds = IPv6AddressIds;
    }

    /**
     * Get 每次请求的`Filters`的上限为10，`Filter.Values`的上限为100。参数不支持同时指定`IPv6AddressIds`和`Filters`。详细的过滤条件如下：

- address-id - String - 是否必填：否 - （过滤条件）按照弹性公网IPv6的唯一ID过滤。
- public-ipv6-address - String - 是否必填：否 - （过滤条件）按照公网 IPv6 的 IP 地址过滤。
- network-interface-id - String - 是否必填：否 - （过滤条件）按照弹性网卡的唯一ID过滤。
- instance-id - String - 是否必填：否 - （过滤条件）按照绑定实例的唯一ID过滤。
- charge-type - String - 是否必填：否 - （过滤条件）按照计费类型过滤。
- private-ipv6-address - String - 是否必填：否 - （过滤条件）按照绑定的内网 IPv6 地址过滤。
- egress - String - 是否必填：否 - （过滤条件）按照出口过滤。
- address-type - String - 是否必填：否 - （过滤条件）按照IPv6类型 进行过滤。可选值：'EIP6'：传统弹性公网 IPv6，'EIPv6'：弹性公网 IPv6，'WanIPv6'：普通公网 IPv6，'HighQualityEIPv6'：精品弹性公网 IPv6。默认值是'EIPv6'。
- address-isp - String - 是否必填：否 - （过滤条件）按照 运营商类型 进行过滤。可选值：'BGP'：常规BGP，'CMCC'：移动，'CUCC'：联通, 'CTCC'：电信。
- address-status - String - 是否必填：否 - （过滤条件）按照 EIP 的状态过滤。状态包含：'CREATING'：创建中，'BINDING'：绑定中，'BIND'：已绑，'UNBINDING'：解绑中，'UNBIND'：未绑定，'OFFLINING'：下线中，'BIND_ENI'：绑定了ENI，'PRIVATE'：仅开通内网的IPv6。
- address-name - String - 是否必填：否 - （过滤条件）按照 EIP 名称过滤。不支持模糊过滤。
- tag-key - String - 是否必填：否 - （过滤条件）按照标签键进行过滤。
- tag-value - String - 是否必填：否 - （过滤条件）按照标签值进行过滤。
- tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。tag-key使用具体的标签键进行替换。 
     * @return Filters 每次请求的`Filters`的上限为10，`Filter.Values`的上限为100。参数不支持同时指定`IPv6AddressIds`和`Filters`。详细的过滤条件如下：

- address-id - String - 是否必填：否 - （过滤条件）按照弹性公网IPv6的唯一ID过滤。
- public-ipv6-address - String - 是否必填：否 - （过滤条件）按照公网 IPv6 的 IP 地址过滤。
- network-interface-id - String - 是否必填：否 - （过滤条件）按照弹性网卡的唯一ID过滤。
- instance-id - String - 是否必填：否 - （过滤条件）按照绑定实例的唯一ID过滤。
- charge-type - String - 是否必填：否 - （过滤条件）按照计费类型过滤。
- private-ipv6-address - String - 是否必填：否 - （过滤条件）按照绑定的内网 IPv6 地址过滤。
- egress - String - 是否必填：否 - （过滤条件）按照出口过滤。
- address-type - String - 是否必填：否 - （过滤条件）按照IPv6类型 进行过滤。可选值：'EIP6'：传统弹性公网 IPv6，'EIPv6'：弹性公网 IPv6，'WanIPv6'：普通公网 IPv6，'HighQualityEIPv6'：精品弹性公网 IPv6。默认值是'EIPv6'。
- address-isp - String - 是否必填：否 - （过滤条件）按照 运营商类型 进行过滤。可选值：'BGP'：常规BGP，'CMCC'：移动，'CUCC'：联通, 'CTCC'：电信。
- address-status - String - 是否必填：否 - （过滤条件）按照 EIP 的状态过滤。状态包含：'CREATING'：创建中，'BINDING'：绑定中，'BIND'：已绑，'UNBINDING'：解绑中，'UNBIND'：未绑定，'OFFLINING'：下线中，'BIND_ENI'：绑定了ENI，'PRIVATE'：仅开通内网的IPv6。
- address-name - String - 是否必填：否 - （过滤条件）按照 EIP 名称过滤。不支持模糊过滤。
- tag-key - String - 是否必填：否 - （过滤条件）按照标签键进行过滤。
- tag-value - String - 是否必填：否 - （过滤条件）按照标签值进行过滤。
- tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。tag-key使用具体的标签键进行替换。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 每次请求的`Filters`的上限为10，`Filter.Values`的上限为100。参数不支持同时指定`IPv6AddressIds`和`Filters`。详细的过滤条件如下：

- address-id - String - 是否必填：否 - （过滤条件）按照弹性公网IPv6的唯一ID过滤。
- public-ipv6-address - String - 是否必填：否 - （过滤条件）按照公网 IPv6 的 IP 地址过滤。
- network-interface-id - String - 是否必填：否 - （过滤条件）按照弹性网卡的唯一ID过滤。
- instance-id - String - 是否必填：否 - （过滤条件）按照绑定实例的唯一ID过滤。
- charge-type - String - 是否必填：否 - （过滤条件）按照计费类型过滤。
- private-ipv6-address - String - 是否必填：否 - （过滤条件）按照绑定的内网 IPv6 地址过滤。
- egress - String - 是否必填：否 - （过滤条件）按照出口过滤。
- address-type - String - 是否必填：否 - （过滤条件）按照IPv6类型 进行过滤。可选值：'EIP6'：传统弹性公网 IPv6，'EIPv6'：弹性公网 IPv6，'WanIPv6'：普通公网 IPv6，'HighQualityEIPv6'：精品弹性公网 IPv6。默认值是'EIPv6'。
- address-isp - String - 是否必填：否 - （过滤条件）按照 运营商类型 进行过滤。可选值：'BGP'：常规BGP，'CMCC'：移动，'CUCC'：联通, 'CTCC'：电信。
- address-status - String - 是否必填：否 - （过滤条件）按照 EIP 的状态过滤。状态包含：'CREATING'：创建中，'BINDING'：绑定中，'BIND'：已绑，'UNBINDING'：解绑中，'UNBIND'：未绑定，'OFFLINING'：下线中，'BIND_ENI'：绑定了ENI，'PRIVATE'：仅开通内网的IPv6。
- address-name - String - 是否必填：否 - （过滤条件）按照 EIP 名称过滤。不支持模糊过滤。
- tag-key - String - 是否必填：否 - （过滤条件）按照标签键进行过滤。
- tag-value - String - 是否必填：否 - （过滤条件）按照标签值进行过滤。
- tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。tag-key使用具体的标签键进行替换。
     * @param Filters 每次请求的`Filters`的上限为10，`Filter.Values`的上限为100。参数不支持同时指定`IPv6AddressIds`和`Filters`。详细的过滤条件如下：

- address-id - String - 是否必填：否 - （过滤条件）按照弹性公网IPv6的唯一ID过滤。
- public-ipv6-address - String - 是否必填：否 - （过滤条件）按照公网 IPv6 的 IP 地址过滤。
- network-interface-id - String - 是否必填：否 - （过滤条件）按照弹性网卡的唯一ID过滤。
- instance-id - String - 是否必填：否 - （过滤条件）按照绑定实例的唯一ID过滤。
- charge-type - String - 是否必填：否 - （过滤条件）按照计费类型过滤。
- private-ipv6-address - String - 是否必填：否 - （过滤条件）按照绑定的内网 IPv6 地址过滤。
- egress - String - 是否必填：否 - （过滤条件）按照出口过滤。
- address-type - String - 是否必填：否 - （过滤条件）按照IPv6类型 进行过滤。可选值：'EIP6'：传统弹性公网 IPv6，'EIPv6'：弹性公网 IPv6，'WanIPv6'：普通公网 IPv6，'HighQualityEIPv6'：精品弹性公网 IPv6。默认值是'EIPv6'。
- address-isp - String - 是否必填：否 - （过滤条件）按照 运营商类型 进行过滤。可选值：'BGP'：常规BGP，'CMCC'：移动，'CUCC'：联通, 'CTCC'：电信。
- address-status - String - 是否必填：否 - （过滤条件）按照 EIP 的状态过滤。状态包含：'CREATING'：创建中，'BINDING'：绑定中，'BIND'：已绑，'UNBINDING'：解绑中，'UNBIND'：未绑定，'OFFLINING'：下线中，'BIND_ENI'：绑定了ENI，'PRIVATE'：仅开通内网的IPv6。
- address-name - String - 是否必填：否 - （过滤条件）按照 EIP 名称过滤。不支持模糊过滤。
- tag-key - String - 是否必填：否 - （过滤条件）按照标签键进行过滤。
- tag-value - String - 是否必填：否 - （过滤条件）按照标签值进行过滤。
- tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。tag-key使用具体的标签键进行替换。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 是否查询传统型IPv6地址信息。可选值：
<li>True：查询传统型IPv6地址信息</li>
<li>False：不查询传统型IPv6地址信息</li>
默认值：False 
     * @return Traditional 是否查询传统型IPv6地址信息。可选值：
<li>True：查询传统型IPv6地址信息</li>
<li>False：不查询传统型IPv6地址信息</li>
默认值：False
     */
    public Boolean getTraditional() {
        return this.Traditional;
    }

    /**
     * Set 是否查询传统型IPv6地址信息。可选值：
<li>True：查询传统型IPv6地址信息</li>
<li>False：不查询传统型IPv6地址信息</li>
默认值：False
     * @param Traditional 是否查询传统型IPv6地址信息。可选值：
<li>True：查询传统型IPv6地址信息</li>
<li>False：不查询传统型IPv6地址信息</li>
默认值：False
     */
    public void setTraditional(Boolean Traditional) {
        this.Traditional = Traditional;
    }

    /**
     * Get 偏移量，默认为0。关于Offset的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/11646)中的相关小节。 
     * @return Offset 偏移量，默认为0。关于Offset的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/11646)中的相关小节。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0。关于Offset的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/11646)中的相关小节。
     * @param Offset 偏移量，默认为0。关于Offset的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/11646)中的相关小节。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/11646)中的相关小节。 
     * @return Limit 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/11646)中的相关小节。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/11646)中的相关小节。
     * @param Limit 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API [简介](https://cloud.tencent.com/document/api/213/11646)中的相关小节。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeIPv6AddressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeIPv6AddressesRequest(DescribeIPv6AddressesRequest source) {
        if (source.IPv6AddressIds != null) {
            this.IPv6AddressIds = new String[source.IPv6AddressIds.length];
            for (int i = 0; i < source.IPv6AddressIds.length; i++) {
                this.IPv6AddressIds[i] = new String(source.IPv6AddressIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Traditional != null) {
            this.Traditional = new Boolean(source.Traditional);
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
        this.setParamArraySimple(map, prefix + "IPv6AddressIds.", this.IPv6AddressIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Traditional", this.Traditional);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

