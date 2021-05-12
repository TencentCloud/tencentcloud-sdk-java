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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInternetAddressRequest extends AbstractModel{

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最大值100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件：
<li>AddrType, 地址类型。0：BGP 1; 1: 电信， 2：移动， 3：联通</li>
<li>AddrProto地址类型。0：IPv4 1:IPv6</li>
<li>Status 地址状态。 0：使用中， 1：已停用， 2：已退还</li>
<li>Subnet 互联网公网地址，数组</li>
<InstanceIds>互联网公网地址ID，数组</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回数量，默认为20，最大值100 
     * @return Limit 返回数量，默认为20，最大值100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最大值100
     * @param Limit 返回数量，默认为20，最大值100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件：
<li>AddrType, 地址类型。0：BGP 1; 1: 电信， 2：移动， 3：联通</li>
<li>AddrProto地址类型。0：IPv4 1:IPv6</li>
<li>Status 地址状态。 0：使用中， 1：已停用， 2：已退还</li>
<li>Subnet 互联网公网地址，数组</li>
<InstanceIds>互联网公网地址ID，数组</li> 
     * @return Filters 过滤条件：
<li>AddrType, 地址类型。0：BGP 1; 1: 电信， 2：移动， 3：联通</li>
<li>AddrProto地址类型。0：IPv4 1:IPv6</li>
<li>Status 地址状态。 0：使用中， 1：已停用， 2：已退还</li>
<li>Subnet 互联网公网地址，数组</li>
<InstanceIds>互联网公网地址ID，数组</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件：
<li>AddrType, 地址类型。0：BGP 1; 1: 电信， 2：移动， 3：联通</li>
<li>AddrProto地址类型。0：IPv4 1:IPv6</li>
<li>Status 地址状态。 0：使用中， 1：已停用， 2：已退还</li>
<li>Subnet 互联网公网地址，数组</li>
<InstanceIds>互联网公网地址ID，数组</li>
     * @param Filters 过滤条件：
<li>AddrType, 地址类型。0：BGP 1; 1: 电信， 2：移动， 3：联通</li>
<li>AddrProto地址类型。0：IPv4 1:IPv6</li>
<li>Status 地址状态。 0：使用中， 1：已停用， 2：已退还</li>
<li>Subnet 互联网公网地址，数组</li>
<InstanceIds>互联网公网地址ID，数组</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeInternetAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInternetAddressRequest(DescribeInternetAddressRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
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
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

