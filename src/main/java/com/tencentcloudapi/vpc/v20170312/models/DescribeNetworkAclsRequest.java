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
    * <p>过滤条件，参数不支持同时指定NetworkAclIds和Filters。</p><li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-12345678。</li><li>network-acl-id - String - （过滤条件）网络ACL实例ID，形如：acl-12345678。</li><li>network-acl-name - String - （过滤条件）网络ACL实例名称。</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>网络ACL实例ID数组。形如：[acl-12345678]。每次请求的实例的上限为100。参数不支持同时指定NetworkAclIds和Filters。</p>
    */
    @SerializedName("NetworkAclIds")
    @Expose
    private String [] NetworkAclIds;

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
    * <p>排序字段。支持：NetworkAclId,NetworkAclName,CreatedTime,ModifyTime</p>
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * <p>排序方法。顺序：ASC，倒序：DESC。</p>
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
     * Get <p>过滤条件，参数不支持同时指定NetworkAclIds和Filters。</p><li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-12345678。</li><li>network-acl-id - String - （过滤条件）网络ACL实例ID，形如：acl-12345678。</li><li>network-acl-name - String - （过滤条件）网络ACL实例名称。</li> 
     * @return Filters <p>过滤条件，参数不支持同时指定NetworkAclIds和Filters。</p><li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-12345678。</li><li>network-acl-id - String - （过滤条件）网络ACL实例ID，形如：acl-12345678。</li><li>network-acl-name - String - （过滤条件）网络ACL实例名称。</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤条件，参数不支持同时指定NetworkAclIds和Filters。</p><li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-12345678。</li><li>network-acl-id - String - （过滤条件）网络ACL实例ID，形如：acl-12345678。</li><li>network-acl-name - String - （过滤条件）网络ACL实例名称。</li>
     * @param Filters <p>过滤条件，参数不支持同时指定NetworkAclIds和Filters。</p><li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-12345678。</li><li>network-acl-id - String - （过滤条件）网络ACL实例ID，形如：acl-12345678。</li><li>network-acl-name - String - （过滤条件）网络ACL实例名称。</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>网络ACL实例ID数组。形如：[acl-12345678]。每次请求的实例的上限为100。参数不支持同时指定NetworkAclIds和Filters。</p> 
     * @return NetworkAclIds <p>网络ACL实例ID数组。形如：[acl-12345678]。每次请求的实例的上限为100。参数不支持同时指定NetworkAclIds和Filters。</p>
     */
    public String [] getNetworkAclIds() {
        return this.NetworkAclIds;
    }

    /**
     * Set <p>网络ACL实例ID数组。形如：[acl-12345678]。每次请求的实例的上限为100。参数不支持同时指定NetworkAclIds和Filters。</p>
     * @param NetworkAclIds <p>网络ACL实例ID数组。形如：[acl-12345678]。每次请求的实例的上限为100。参数不支持同时指定NetworkAclIds和Filters。</p>
     */
    public void setNetworkAclIds(String [] NetworkAclIds) {
        this.NetworkAclIds = NetworkAclIds;
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
     * Get <p>排序字段。支持：NetworkAclId,NetworkAclName,CreatedTime,ModifyTime</p> 
     * @return OrderField <p>排序字段。支持：NetworkAclId,NetworkAclName,CreatedTime,ModifyTime</p>
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set <p>排序字段。支持：NetworkAclId,NetworkAclName,CreatedTime,ModifyTime</p>
     * @param OrderField <p>排序字段。支持：NetworkAclId,NetworkAclName,CreatedTime,ModifyTime</p>
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get <p>排序方法。顺序：ASC，倒序：DESC。</p> 
     * @return OrderDirection <p>排序方法。顺序：ASC，倒序：DESC。</p>
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * Set <p>排序方法。顺序：ASC，倒序：DESC。</p>
     * @param OrderDirection <p>排序方法。顺序：ASC，倒序：DESC。</p>
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

