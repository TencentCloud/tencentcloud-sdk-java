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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRegionIpv6AddressesRequest extends AbstractModel{

    /**
    * ECM 地域，为空时返回所有地域的IPv6地址。
    */
    @SerializedName("EcmRegion")
    @Expose
    private String EcmRegion;

    /**
    * 详细的过滤条件如下：
address-id - String - 是否必填：否 - （过滤条件）按照 EIP 的 ID 过滤。
address-ip - String - 是否必填：否 - （过滤条件）按照 EIP 的 IP 地址过滤。
network-interface-id - String - 是否必填：否 - （过滤条件）按照弹性网卡的唯一ID过滤。
instance-id - String - 是否必填：否 - （过滤条件）按照 EIP 所绑定的实例 ID 过滤。
vpc-id - String - 是否必填：否 - （过滤条件）按照 EIP 所在 VPC 的 ID 进行过滤。
address-isp - String - 是否必填：否 - （过滤条件）按照 EIP 的运营商进行过滤。
address-status  - String - 是否必填：否 - （过滤条件）按照 EIP  的状态信息进行过滤。
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
    * 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get ECM 地域，为空时返回所有地域的IPv6地址。 
     * @return EcmRegion ECM 地域，为空时返回所有地域的IPv6地址。
     */
    public String getEcmRegion() {
        return this.EcmRegion;
    }

    /**
     * Set ECM 地域，为空时返回所有地域的IPv6地址。
     * @param EcmRegion ECM 地域，为空时返回所有地域的IPv6地址。
     */
    public void setEcmRegion(String EcmRegion) {
        this.EcmRegion = EcmRegion;
    }

    /**
     * Get 详细的过滤条件如下：
address-id - String - 是否必填：否 - （过滤条件）按照 EIP 的 ID 过滤。
address-ip - String - 是否必填：否 - （过滤条件）按照 EIP 的 IP 地址过滤。
network-interface-id - String - 是否必填：否 - （过滤条件）按照弹性网卡的唯一ID过滤。
instance-id - String - 是否必填：否 - （过滤条件）按照 EIP 所绑定的实例 ID 过滤。
vpc-id - String - 是否必填：否 - （过滤条件）按照 EIP 所在 VPC 的 ID 进行过滤。
address-isp - String - 是否必填：否 - （过滤条件）按照 EIP 的运营商进行过滤。
address-status  - String - 是否必填：否 - （过滤条件）按照 EIP  的状态信息进行过滤。 
     * @return Filters 详细的过滤条件如下：
address-id - String - 是否必填：否 - （过滤条件）按照 EIP 的 ID 过滤。
address-ip - String - 是否必填：否 - （过滤条件）按照 EIP 的 IP 地址过滤。
network-interface-id - String - 是否必填：否 - （过滤条件）按照弹性网卡的唯一ID过滤。
instance-id - String - 是否必填：否 - （过滤条件）按照 EIP 所绑定的实例 ID 过滤。
vpc-id - String - 是否必填：否 - （过滤条件）按照 EIP 所在 VPC 的 ID 进行过滤。
address-isp - String - 是否必填：否 - （过滤条件）按照 EIP 的运营商进行过滤。
address-status  - String - 是否必填：否 - （过滤条件）按照 EIP  的状态信息进行过滤。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 详细的过滤条件如下：
address-id - String - 是否必填：否 - （过滤条件）按照 EIP 的 ID 过滤。
address-ip - String - 是否必填：否 - （过滤条件）按照 EIP 的 IP 地址过滤。
network-interface-id - String - 是否必填：否 - （过滤条件）按照弹性网卡的唯一ID过滤。
instance-id - String - 是否必填：否 - （过滤条件）按照 EIP 所绑定的实例 ID 过滤。
vpc-id - String - 是否必填：否 - （过滤条件）按照 EIP 所在 VPC 的 ID 进行过滤。
address-isp - String - 是否必填：否 - （过滤条件）按照 EIP 的运营商进行过滤。
address-status  - String - 是否必填：否 - （过滤条件）按照 EIP  的状态信息进行过滤。
     * @param Filters 详细的过滤条件如下：
address-id - String - 是否必填：否 - （过滤条件）按照 EIP 的 ID 过滤。
address-ip - String - 是否必填：否 - （过滤条件）按照 EIP 的 IP 地址过滤。
network-interface-id - String - 是否必填：否 - （过滤条件）按照弹性网卡的唯一ID过滤。
instance-id - String - 是否必填：否 - （过滤条件）按照 EIP 所绑定的实例 ID 过滤。
vpc-id - String - 是否必填：否 - （过滤条件）按照 EIP 所在 VPC 的 ID 进行过滤。
address-isp - String - 是否必填：否 - （过滤条件）按照 EIP 的运营商进行过滤。
address-status  - String - 是否必填：否 - （过滤条件）按照 EIP  的状态信息进行过滤。
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
     * Get 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。 
     * @return Limit 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。
     * @param Limit 返回数量，默认为20，最大值为100。关于Limit的更进一步介绍请参考 API 简介中的相关小节。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeRegionIpv6AddressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRegionIpv6AddressesRequest(DescribeRegionIpv6AddressesRequest source) {
        if (source.EcmRegion != null) {
            this.EcmRegion = new String(source.EcmRegion);
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
        this.setParamSimple(map, prefix + "EcmRegion", this.EcmRegion);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

