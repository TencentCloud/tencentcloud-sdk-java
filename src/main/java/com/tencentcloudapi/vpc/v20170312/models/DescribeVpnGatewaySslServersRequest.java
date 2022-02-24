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

public class DescribeVpnGatewaySslServersRequest extends AbstractModel{

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 请求对象个数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * SSL-VPN-SERVER实例ID。形如：vpngwSslServer-12345678。每次请求的实例的上限为100。参数不支持同时指定SslVpnServerIds和Filters。
    */
    @SerializedName("SslVpnServerIds")
    @Expose
    private String [] SslVpnServerIds;

    /**
    * 过滤条件，参数不支持同时指定SslVpnServerIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID形如：vpc-f49l6u0z。</li>
<li>vpn-gateway-id - String - （过滤条件）VPN实例ID形如：vpngw-5aluhh9t。</li>
<li>vpn-gateway-name - String - （过滤条件）VPN实例名称。</li>
<li>ssl-vpn-server-name - String - （过滤条件）SSL-VPN-SERVER实例名称。</li>
<li>ssl-vpn-server-id - String - （过滤条件）SSL-VPN-SERVER实例ID形如：vpngwSslServer-123456。</li>
    */
    @SerializedName("Filters")
    @Expose
    private FilterObject [] Filters;

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 请求对象个数 
     * @return Limit 请求对象个数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 请求对象个数
     * @param Limit 请求对象个数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get SSL-VPN-SERVER实例ID。形如：vpngwSslServer-12345678。每次请求的实例的上限为100。参数不支持同时指定SslVpnServerIds和Filters。 
     * @return SslVpnServerIds SSL-VPN-SERVER实例ID。形如：vpngwSslServer-12345678。每次请求的实例的上限为100。参数不支持同时指定SslVpnServerIds和Filters。
     */
    public String [] getSslVpnServerIds() {
        return this.SslVpnServerIds;
    }

    /**
     * Set SSL-VPN-SERVER实例ID。形如：vpngwSslServer-12345678。每次请求的实例的上限为100。参数不支持同时指定SslVpnServerIds和Filters。
     * @param SslVpnServerIds SSL-VPN-SERVER实例ID。形如：vpngwSslServer-12345678。每次请求的实例的上限为100。参数不支持同时指定SslVpnServerIds和Filters。
     */
    public void setSslVpnServerIds(String [] SslVpnServerIds) {
        this.SslVpnServerIds = SslVpnServerIds;
    }

    /**
     * Get 过滤条件，参数不支持同时指定SslVpnServerIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID形如：vpc-f49l6u0z。</li>
<li>vpn-gateway-id - String - （过滤条件）VPN实例ID形如：vpngw-5aluhh9t。</li>
<li>vpn-gateway-name - String - （过滤条件）VPN实例名称。</li>
<li>ssl-vpn-server-name - String - （过滤条件）SSL-VPN-SERVER实例名称。</li>
<li>ssl-vpn-server-id - String - （过滤条件）SSL-VPN-SERVER实例ID形如：vpngwSslServer-123456。</li> 
     * @return Filters 过滤条件，参数不支持同时指定SslVpnServerIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID形如：vpc-f49l6u0z。</li>
<li>vpn-gateway-id - String - （过滤条件）VPN实例ID形如：vpngw-5aluhh9t。</li>
<li>vpn-gateway-name - String - （过滤条件）VPN实例名称。</li>
<li>ssl-vpn-server-name - String - （过滤条件）SSL-VPN-SERVER实例名称。</li>
<li>ssl-vpn-server-id - String - （过滤条件）SSL-VPN-SERVER实例ID形如：vpngwSslServer-123456。</li>
     */
    public FilterObject [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，参数不支持同时指定SslVpnServerIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID形如：vpc-f49l6u0z。</li>
<li>vpn-gateway-id - String - （过滤条件）VPN实例ID形如：vpngw-5aluhh9t。</li>
<li>vpn-gateway-name - String - （过滤条件）VPN实例名称。</li>
<li>ssl-vpn-server-name - String - （过滤条件）SSL-VPN-SERVER实例名称。</li>
<li>ssl-vpn-server-id - String - （过滤条件）SSL-VPN-SERVER实例ID形如：vpngwSslServer-123456。</li>
     * @param Filters 过滤条件，参数不支持同时指定SslVpnServerIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID形如：vpc-f49l6u0z。</li>
<li>vpn-gateway-id - String - （过滤条件）VPN实例ID形如：vpngw-5aluhh9t。</li>
<li>vpn-gateway-name - String - （过滤条件）VPN实例名称。</li>
<li>ssl-vpn-server-name - String - （过滤条件）SSL-VPN-SERVER实例名称。</li>
<li>ssl-vpn-server-id - String - （过滤条件）SSL-VPN-SERVER实例ID形如：vpngwSslServer-123456。</li>
     */
    public void setFilters(FilterObject [] Filters) {
        this.Filters = Filters;
    }

    public DescribeVpnGatewaySslServersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVpnGatewaySslServersRequest(DescribeVpnGatewaySslServersRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SslVpnServerIds != null) {
            this.SslVpnServerIds = new String[source.SslVpnServerIds.length];
            for (int i = 0; i < source.SslVpnServerIds.length; i++) {
                this.SslVpnServerIds[i] = new String(source.SslVpnServerIds[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new FilterObject[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new FilterObject(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "SslVpnServerIds.", this.SslVpnServerIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

