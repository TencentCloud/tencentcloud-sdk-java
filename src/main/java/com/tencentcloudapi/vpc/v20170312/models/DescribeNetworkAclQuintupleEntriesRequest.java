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

public class DescribeNetworkAclQuintupleEntriesRequest extends AbstractModel{

    /**
    * 网络ACL实例ID。形如：acl-12345678。
    */
    @SerializedName("NetworkAclId")
    @Expose
    private String NetworkAclId;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数量，默认为20，最小值为1，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件，参数不支持同时指定`HaVipIds`和`Filters`。
<li>protocol - String - 协议，形如：`TCP`。</li>
<li>description - String - 描述。</li>
<li>destination-cidr - String - 目的CIDR， 形如：'192.168.0.0/24'。</li>
<li>source-cidr- String - 源CIDR， 形如：'192.168.0.0/24'。</li>
<li>action - String - 动作，形如ACCEPT或DROP。</li>
<li>network-acl-quintuple-entry-id - String - 五元组唯一ID，形如：'acli45-ahnu4rv5'。</li>
<li>network-acl-direction - String - 方向，形如：'INGRESS'或'EGRESS'。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 网络ACL实例ID。形如：acl-12345678。 
     * @return NetworkAclId 网络ACL实例ID。形如：acl-12345678。
     */
    public String getNetworkAclId() {
        return this.NetworkAclId;
    }

    /**
     * Set 网络ACL实例ID。形如：acl-12345678。
     * @param NetworkAclId 网络ACL实例ID。形如：acl-12345678。
     */
    public void setNetworkAclId(String NetworkAclId) {
        this.NetworkAclId = NetworkAclId;
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
     * Get 返回数量，默认为20，最小值为1，最大值为100。 
     * @return Limit 返回数量，默认为20，最小值为1，最大值为100。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数量，默认为20，最小值为1，最大值为100。
     * @param Limit 返回数量，默认为20，最小值为1，最大值为100。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 过滤条件，参数不支持同时指定`HaVipIds`和`Filters`。
<li>protocol - String - 协议，形如：`TCP`。</li>
<li>description - String - 描述。</li>
<li>destination-cidr - String - 目的CIDR， 形如：'192.168.0.0/24'。</li>
<li>source-cidr- String - 源CIDR， 形如：'192.168.0.0/24'。</li>
<li>action - String - 动作，形如ACCEPT或DROP。</li>
<li>network-acl-quintuple-entry-id - String - 五元组唯一ID，形如：'acli45-ahnu4rv5'。</li>
<li>network-acl-direction - String - 方向，形如：'INGRESS'或'EGRESS'。</li> 
     * @return Filters 过滤条件，参数不支持同时指定`HaVipIds`和`Filters`。
<li>protocol - String - 协议，形如：`TCP`。</li>
<li>description - String - 描述。</li>
<li>destination-cidr - String - 目的CIDR， 形如：'192.168.0.0/24'。</li>
<li>source-cidr- String - 源CIDR， 形如：'192.168.0.0/24'。</li>
<li>action - String - 动作，形如ACCEPT或DROP。</li>
<li>network-acl-quintuple-entry-id - String - 五元组唯一ID，形如：'acli45-ahnu4rv5'。</li>
<li>network-acl-direction - String - 方向，形如：'INGRESS'或'EGRESS'。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，参数不支持同时指定`HaVipIds`和`Filters`。
<li>protocol - String - 协议，形如：`TCP`。</li>
<li>description - String - 描述。</li>
<li>destination-cidr - String - 目的CIDR， 形如：'192.168.0.0/24'。</li>
<li>source-cidr- String - 源CIDR， 形如：'192.168.0.0/24'。</li>
<li>action - String - 动作，形如ACCEPT或DROP。</li>
<li>network-acl-quintuple-entry-id - String - 五元组唯一ID，形如：'acli45-ahnu4rv5'。</li>
<li>network-acl-direction - String - 方向，形如：'INGRESS'或'EGRESS'。</li>
     * @param Filters 过滤条件，参数不支持同时指定`HaVipIds`和`Filters`。
<li>protocol - String - 协议，形如：`TCP`。</li>
<li>description - String - 描述。</li>
<li>destination-cidr - String - 目的CIDR， 形如：'192.168.0.0/24'。</li>
<li>source-cidr- String - 源CIDR， 形如：'192.168.0.0/24'。</li>
<li>action - String - 动作，形如ACCEPT或DROP。</li>
<li>network-acl-quintuple-entry-id - String - 五元组唯一ID，形如：'acli45-ahnu4rv5'。</li>
<li>network-acl-direction - String - 方向，形如：'INGRESS'或'EGRESS'。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeNetworkAclQuintupleEntriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNetworkAclQuintupleEntriesRequest(DescribeNetworkAclQuintupleEntriesRequest source) {
        if (source.NetworkAclId != null) {
            this.NetworkAclId = new String(source.NetworkAclId);
        }
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
        this.setParamSimple(map, prefix + "NetworkAclId", this.NetworkAclId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

