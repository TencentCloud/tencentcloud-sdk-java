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

public class DescribeGatewayFlowQosRequest extends AbstractModel{

    /**
    * 网关实例ID，目前我们支持的网关实例类型有，
专线网关实例ID，形如，`dcg-ltjahce6`；
Nat网关实例ID，形如，`nat-ltjahce6`；
VPN网关实例ID，形如，`vpn-ltjahce6`。
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 限流的云服务器内网IP。
    */
    @SerializedName("IpAddresses")
    @Expose
    private String [] IpAddresses;

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
     * Get 网关实例ID，目前我们支持的网关实例类型有，
专线网关实例ID，形如，`dcg-ltjahce6`；
Nat网关实例ID，形如，`nat-ltjahce6`；
VPN网关实例ID，形如，`vpn-ltjahce6`。 
     * @return GatewayId 网关实例ID，目前我们支持的网关实例类型有，
专线网关实例ID，形如，`dcg-ltjahce6`；
Nat网关实例ID，形如，`nat-ltjahce6`；
VPN网关实例ID，形如，`vpn-ltjahce6`。
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关实例ID，目前我们支持的网关实例类型有，
专线网关实例ID，形如，`dcg-ltjahce6`；
Nat网关实例ID，形如，`nat-ltjahce6`；
VPN网关实例ID，形如，`vpn-ltjahce6`。
     * @param GatewayId 网关实例ID，目前我们支持的网关实例类型有，
专线网关实例ID，形如，`dcg-ltjahce6`；
Nat网关实例ID，形如，`nat-ltjahce6`；
VPN网关实例ID，形如，`vpn-ltjahce6`。
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 限流的云服务器内网IP。 
     * @return IpAddresses 限流的云服务器内网IP。
     */
    public String [] getIpAddresses() {
        return this.IpAddresses;
    }

    /**
     * Set 限流的云服务器内网IP。
     * @param IpAddresses 限流的云服务器内网IP。
     */
    public void setIpAddresses(String [] IpAddresses) {
        this.IpAddresses = IpAddresses;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamArraySimple(map, prefix + "IpAddresses.", this.IpAddresses);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

