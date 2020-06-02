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

public class DescribeDhcpIpsRequest extends AbstractModel{

    /**
    * DhcpIp实例ID。形如：dhcpip-pxir56ns。每次请求的实例的上限为100。参数不支持同时指定DhcpIpIds和Filters。
    */
    @SerializedName("DhcpIpIds")
    @Expose
    private String [] DhcpIpIds;

    /**
    * 过滤条件，参数不支持同时指定DhcpIpIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>subnet-id - String - （过滤条件）所属子网实例ID，形如：subnet-f49l6u0z。</li>
<li>dhcpip-id - String - （过滤条件）DhcpIp实例ID，形如：dhcpip-pxir56ns。</li>
<li>dhcpip-name - String - （过滤条件）DhcpIp实例名称。</li>
<li>address-ip - String - （过滤条件）DhcpIp实例的IP，根据IP精确查找。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

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
     * Get DhcpIp实例ID。形如：dhcpip-pxir56ns。每次请求的实例的上限为100。参数不支持同时指定DhcpIpIds和Filters。 
     * @return DhcpIpIds DhcpIp实例ID。形如：dhcpip-pxir56ns。每次请求的实例的上限为100。参数不支持同时指定DhcpIpIds和Filters。
     */
    public String [] getDhcpIpIds() {
        return this.DhcpIpIds;
    }

    /**
     * Set DhcpIp实例ID。形如：dhcpip-pxir56ns。每次请求的实例的上限为100。参数不支持同时指定DhcpIpIds和Filters。
     * @param DhcpIpIds DhcpIp实例ID。形如：dhcpip-pxir56ns。每次请求的实例的上限为100。参数不支持同时指定DhcpIpIds和Filters。
     */
    public void setDhcpIpIds(String [] DhcpIpIds) {
        this.DhcpIpIds = DhcpIpIds;
    }

    /**
     * Get 过滤条件，参数不支持同时指定DhcpIpIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>subnet-id - String - （过滤条件）所属子网实例ID，形如：subnet-f49l6u0z。</li>
<li>dhcpip-id - String - （过滤条件）DhcpIp实例ID，形如：dhcpip-pxir56ns。</li>
<li>dhcpip-name - String - （过滤条件）DhcpIp实例名称。</li>
<li>address-ip - String - （过滤条件）DhcpIp实例的IP，根据IP精确查找。</li> 
     * @return Filters 过滤条件，参数不支持同时指定DhcpIpIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>subnet-id - String - （过滤条件）所属子网实例ID，形如：subnet-f49l6u0z。</li>
<li>dhcpip-id - String - （过滤条件）DhcpIp实例ID，形如：dhcpip-pxir56ns。</li>
<li>dhcpip-name - String - （过滤条件）DhcpIp实例名称。</li>
<li>address-ip - String - （过滤条件）DhcpIp实例的IP，根据IP精确查找。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，参数不支持同时指定DhcpIpIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>subnet-id - String - （过滤条件）所属子网实例ID，形如：subnet-f49l6u0z。</li>
<li>dhcpip-id - String - （过滤条件）DhcpIp实例ID，形如：dhcpip-pxir56ns。</li>
<li>dhcpip-name - String - （过滤条件）DhcpIp实例名称。</li>
<li>address-ip - String - （过滤条件）DhcpIp实例的IP，根据IP精确查找。</li>
     * @param Filters 过滤条件，参数不支持同时指定DhcpIpIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-f49l6u0z。</li>
<li>subnet-id - String - （过滤条件）所属子网实例ID，形如：subnet-f49l6u0z。</li>
<li>dhcpip-id - String - （过滤条件）DhcpIp实例ID，形如：dhcpip-pxir56ns。</li>
<li>dhcpip-name - String - （过滤条件）DhcpIp实例名称。</li>
<li>address-ip - String - （过滤条件）DhcpIp实例的IP，根据IP精确查找。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
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
        this.setParamArraySimple(map, prefix + "DhcpIpIds.", this.DhcpIpIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

