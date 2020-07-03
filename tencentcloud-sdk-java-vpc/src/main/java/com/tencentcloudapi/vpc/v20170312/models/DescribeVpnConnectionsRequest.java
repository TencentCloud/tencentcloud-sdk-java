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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVpnConnectionsRequest extends AbstractModel{

    /**
    * VPN通道实例ID。形如：vpnx-f49l6u0z。每次请求的实例的上限为100。参数不支持同时指定VpnConnectionIds和Filters。
    */
    @SerializedName("VpnConnectionIds")
    @Expose
    private String [] VpnConnectionIds;

    /**
    * 过滤条件。每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定VpnConnectionIds和Filters。
<li>vpc-id - String - VPC实例ID，形如：`vpc-0a36uwkr`。</li>
<li>vpn-gateway-id - String - VPN网关实例ID，形如：`vpngw-p4lmqawn`。</li>
<li>customer-gateway-id - String - 对端网关实例ID，形如：`cgw-l4rblw63`。</li>
<li>vpn-connection-name - String - 通道名称，形如：`test-vpn`。</li>
<li>vpn-connection-id - String - 通道实例ID，形如：`vpnx-5p7vkch8"`。</li>
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
    * 返回数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get VPN通道实例ID。形如：vpnx-f49l6u0z。每次请求的实例的上限为100。参数不支持同时指定VpnConnectionIds和Filters。 
     * @return VpnConnectionIds VPN通道实例ID。形如：vpnx-f49l6u0z。每次请求的实例的上限为100。参数不支持同时指定VpnConnectionIds和Filters。
     */
    public String [] getVpnConnectionIds() {
        return this.VpnConnectionIds;
    }

    /**
     * Set VPN通道实例ID。形如：vpnx-f49l6u0z。每次请求的实例的上限为100。参数不支持同时指定VpnConnectionIds和Filters。
     * @param VpnConnectionIds VPN通道实例ID。形如：vpnx-f49l6u0z。每次请求的实例的上限为100。参数不支持同时指定VpnConnectionIds和Filters。
     */
    public void setVpnConnectionIds(String [] VpnConnectionIds) {
        this.VpnConnectionIds = VpnConnectionIds;
    }

    /**
     * Get 过滤条件。每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定VpnConnectionIds和Filters。
<li>vpc-id - String - VPC实例ID，形如：`vpc-0a36uwkr`。</li>
<li>vpn-gateway-id - String - VPN网关实例ID，形如：`vpngw-p4lmqawn`。</li>
<li>customer-gateway-id - String - 对端网关实例ID，形如：`cgw-l4rblw63`。</li>
<li>vpn-connection-name - String - 通道名称，形如：`test-vpn`。</li>
<li>vpn-connection-id - String - 通道实例ID，形如：`vpnx-5p7vkch8"`。</li> 
     * @return Filters 过滤条件。每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定VpnConnectionIds和Filters。
<li>vpc-id - String - VPC实例ID，形如：`vpc-0a36uwkr`。</li>
<li>vpn-gateway-id - String - VPN网关实例ID，形如：`vpngw-p4lmqawn`。</li>
<li>customer-gateway-id - String - 对端网关实例ID，形如：`cgw-l4rblw63`。</li>
<li>vpn-connection-name - String - 通道名称，形如：`test-vpn`。</li>
<li>vpn-connection-id - String - 通道实例ID，形如：`vpnx-5p7vkch8"`。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定VpnConnectionIds和Filters。
<li>vpc-id - String - VPC实例ID，形如：`vpc-0a36uwkr`。</li>
<li>vpn-gateway-id - String - VPN网关实例ID，形如：`vpngw-p4lmqawn`。</li>
<li>customer-gateway-id - String - 对端网关实例ID，形如：`cgw-l4rblw63`。</li>
<li>vpn-connection-name - String - 通道名称，形如：`test-vpn`。</li>
<li>vpn-connection-id - String - 通道实例ID，形如：`vpnx-5p7vkch8"`。</li>
     * @param Filters 过滤条件。每次请求的Filters的上限为10，Filter.Values的上限为5。参数不支持同时指定VpnConnectionIds和Filters。
<li>vpc-id - String - VPC实例ID，形如：`vpc-0a36uwkr`。</li>
<li>vpn-gateway-id - String - VPN网关实例ID，形如：`vpngw-p4lmqawn`。</li>
<li>customer-gateway-id - String - 对端网关实例ID，形如：`cgw-l4rblw63`。</li>
<li>vpn-connection-name - String - 通道名称，形如：`test-vpn`。</li>
<li>vpn-connection-id - String - 通道实例ID，形如：`vpnx-5p7vkch8"`。</li>
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "VpnConnectionIds.", this.VpnConnectionIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

