/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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

public class DescribeNetworkAclQuintupleEntriesRequest extends AbstractModel {

    /**
    * <p>网络ACL实例ID。形如：acl-12345678。</p>
    */
    @SerializedName("NetworkAclId")
    @Expose
    private String NetworkAclId;

    /**
    * <p>偏移量，默认为0。</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数量，默认为20，最小值为1，最大值为100。</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>过滤条件，参数不支持同时指定<code>NetworkAclId</code>和<code>Filters</code>。</p><li>protocol - String - 协议，形如：<code>TCP</code>。</li><li>description - String - 描述。</li><li>destination-cidr - String - 目的CIDR， 形如：'192.168.0.0/24'。</li><li>source-cidr- String - 源CIDR， 形如：'192.168.0.0/24'。</li><li>action - String - 动作，形如ACCEPT或DROP。</li><li>network-acl-quintuple-entry-id - String - 五元组唯一ID，形如：'acli45-ahnu4rv5'。</li><li>network-acl-direction - String - 方向，形如：'INGRESS'或'EGRESS'。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get <p>网络ACL实例ID。形如：acl-12345678。</p> 
     * @return NetworkAclId <p>网络ACL实例ID。形如：acl-12345678。</p>
     */
    public String getNetworkAclId() {
        return this.NetworkAclId;
    }

    /**
     * Set <p>网络ACL实例ID。形如：acl-12345678。</p>
     * @param NetworkAclId <p>网络ACL实例ID。形如：acl-12345678。</p>
     */
    public void setNetworkAclId(String NetworkAclId) {
        this.NetworkAclId = NetworkAclId;
    }

    /**
     * Get <p>偏移量，默认为0。</p> 
     * @return Offset <p>偏移量，默认为0。</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量，默认为0。</p>
     * @param Offset <p>偏移量，默认为0。</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数量，默认为20，最小值为1，最大值为100。</p> 
     * @return Limit <p>返回数量，默认为20，最小值为1，最大值为100。</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数量，默认为20，最小值为1，最大值为100。</p>
     * @param Limit <p>返回数量，默认为20，最小值为1，最大值为100。</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>过滤条件，参数不支持同时指定<code>NetworkAclId</code>和<code>Filters</code>。</p><li>protocol - String - 协议，形如：<code>TCP</code>。</li><li>description - String - 描述。</li><li>destination-cidr - String - 目的CIDR， 形如：'192.168.0.0/24'。</li><li>source-cidr- String - 源CIDR， 形如：'192.168.0.0/24'。</li><li>action - String - 动作，形如ACCEPT或DROP。</li><li>network-acl-quintuple-entry-id - String - 五元组唯一ID，形如：'acli45-ahnu4rv5'。</li><li>network-acl-direction - String - 方向，形如：'INGRESS'或'EGRESS'。</li> 
     * @return Filters <p>过滤条件，参数不支持同时指定<code>NetworkAclId</code>和<code>Filters</code>。</p><li>protocol - String - 协议，形如：<code>TCP</code>。</li><li>description - String - 描述。</li><li>destination-cidr - String - 目的CIDR， 形如：'192.168.0.0/24'。</li><li>source-cidr- String - 源CIDR， 形如：'192.168.0.0/24'。</li><li>action - String - 动作，形如ACCEPT或DROP。</li><li>network-acl-quintuple-entry-id - String - 五元组唯一ID，形如：'acli45-ahnu4rv5'。</li><li>network-acl-direction - String - 方向，形如：'INGRESS'或'EGRESS'。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件，参数不支持同时指定<code>NetworkAclId</code>和<code>Filters</code>。</p><li>protocol - String - 协议，形如：<code>TCP</code>。</li><li>description - String - 描述。</li><li>destination-cidr - String - 目的CIDR， 形如：'192.168.0.0/24'。</li><li>source-cidr- String - 源CIDR， 形如：'192.168.0.0/24'。</li><li>action - String - 动作，形如ACCEPT或DROP。</li><li>network-acl-quintuple-entry-id - String - 五元组唯一ID，形如：'acli45-ahnu4rv5'。</li><li>network-acl-direction - String - 方向，形如：'INGRESS'或'EGRESS'。</li>
     * @param Filters <p>过滤条件，参数不支持同时指定<code>NetworkAclId</code>和<code>Filters</code>。</p><li>protocol - String - 协议，形如：<code>TCP</code>。</li><li>description - String - 描述。</li><li>destination-cidr - String - 目的CIDR， 形如：'192.168.0.0/24'。</li><li>source-cidr- String - 源CIDR， 形如：'192.168.0.0/24'。</li><li>action - String - 动作，形如ACCEPT或DROP。</li><li>network-acl-quintuple-entry-id - String - 五元组唯一ID，形如：'acli45-ahnu4rv5'。</li><li>network-acl-direction - String - 方向，形如：'INGRESS'或'EGRESS'。</li>
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

