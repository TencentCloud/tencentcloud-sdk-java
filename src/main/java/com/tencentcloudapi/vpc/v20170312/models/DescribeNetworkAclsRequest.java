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

public class DescribeNetworkAclsRequest extends AbstractModel {

    /**
    * 过滤条件，参数不支持同时指定NetworkAclIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-12345678。</li>
<li>network-acl-id - String - （过滤条件）网络ACL实例ID，形如：acl-12345678。</li>
<li>network-acl-name - String - （过滤条件）网络ACL实例名称。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 网络ACL实例ID数组。形如：[acl-12345678]。每次请求的实例的上限为100。参数不支持同时指定NetworkAclIds和Filters。
    */
    @SerializedName("NetworkAclIds")
    @Expose
    private String [] NetworkAclIds;

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
    * 排序字段。支持：NetworkAclId,NetworkAclName,CreatedTime
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序方法。顺序：ASC，倒序：DESC。
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
     * Get 过滤条件，参数不支持同时指定NetworkAclIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-12345678。</li>
<li>network-acl-id - String - （过滤条件）网络ACL实例ID，形如：acl-12345678。</li>
<li>network-acl-name - String - （过滤条件）网络ACL实例名称。</li> 
     * @return Filters 过滤条件，参数不支持同时指定NetworkAclIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-12345678。</li>
<li>network-acl-id - String - （过滤条件）网络ACL实例ID，形如：acl-12345678。</li>
<li>network-acl-name - String - （过滤条件）网络ACL实例名称。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，参数不支持同时指定NetworkAclIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-12345678。</li>
<li>network-acl-id - String - （过滤条件）网络ACL实例ID，形如：acl-12345678。</li>
<li>network-acl-name - String - （过滤条件）网络ACL实例名称。</li>
     * @param Filters 过滤条件，参数不支持同时指定NetworkAclIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-12345678。</li>
<li>network-acl-id - String - （过滤条件）网络ACL实例ID，形如：acl-12345678。</li>
<li>network-acl-name - String - （过滤条件）网络ACL实例名称。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 网络ACL实例ID数组。形如：[acl-12345678]。每次请求的实例的上限为100。参数不支持同时指定NetworkAclIds和Filters。 
     * @return NetworkAclIds 网络ACL实例ID数组。形如：[acl-12345678]。每次请求的实例的上限为100。参数不支持同时指定NetworkAclIds和Filters。
     */
    public String [] getNetworkAclIds() {
        return this.NetworkAclIds;
    }

    /**
     * Set 网络ACL实例ID数组。形如：[acl-12345678]。每次请求的实例的上限为100。参数不支持同时指定NetworkAclIds和Filters。
     * @param NetworkAclIds 网络ACL实例ID数组。形如：[acl-12345678]。每次请求的实例的上限为100。参数不支持同时指定NetworkAclIds和Filters。
     */
    public void setNetworkAclIds(String [] NetworkAclIds) {
        this.NetworkAclIds = NetworkAclIds;
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
     * Get 排序字段。支持：NetworkAclId,NetworkAclName,CreatedTime 
     * @return OrderField 排序字段。支持：NetworkAclId,NetworkAclName,CreatedTime
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set 排序字段。支持：NetworkAclId,NetworkAclName,CreatedTime
     * @param OrderField 排序字段。支持：NetworkAclId,NetworkAclName,CreatedTime
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get 排序方法。顺序：ASC，倒序：DESC。 
     * @return OrderDirection 排序方法。顺序：ASC，倒序：DESC。
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set 排序方法。顺序：ASC，倒序：DESC。
     * @param OrderDirection 排序方法。顺序：ASC，倒序：DESC。
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    public DescribeNetworkAclsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNetworkAclsRequest(DescribeNetworkAclsRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.NetworkAclIds != null) {
            this.NetworkAclIds = new String[source.NetworkAclIds.length];
            for (int i = 0; i < source.NetworkAclIds.length; i++) {
                this.NetworkAclIds[i] = new String(source.NetworkAclIds[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.OrderDirection != null) {
            this.OrderDirection = new String(source.OrderDirection);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "NetworkAclIds.", this.NetworkAclIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);

    }
}

