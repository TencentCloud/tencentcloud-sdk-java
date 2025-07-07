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
package com.tencentcloudapi.config.v20220802.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAggregateDiscoveredResourcesRequest extends AbstractModel {

    /**
    * 每页显示数量
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * 账号组ID
    */
    @SerializedName("AccountGroupId")
    @Expose
    private String AccountGroupId;

    /**
    * resourceName：资源名  resourceId ：资源ID resourceType：资源类型
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 标签
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 下一页token
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * 排序方式 asc、desc
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
     * Get 每页显示数量 
     * @return MaxResults 每页显示数量
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set 每页显示数量
     * @param MaxResults 每页显示数量
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get 账号组ID 
     * @return AccountGroupId 账号组ID
     */
    public String getAccountGroupId() {
        return this.AccountGroupId;
    }

    /**
     * Set 账号组ID
     * @param AccountGroupId 账号组ID
     */
    public void setAccountGroupId(String AccountGroupId) {
        this.AccountGroupId = AccountGroupId;
    }

    /**
     * Get resourceName：资源名  resourceId ：资源ID resourceType：资源类型 
     * @return Filters resourceName：资源名  resourceId ：资源ID resourceType：资源类型
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set resourceName：资源名  resourceId ：资源ID resourceType：资源类型
     * @param Filters resourceName：资源名  resourceId ：资源ID resourceType：资源类型
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 标签 
     * @return Tags 标签
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签
     * @param Tags 标签
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 下一页token 
     * @return NextToken 下一页token
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set 下一页token
     * @param NextToken 下一页token
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get 排序方式 asc、desc 
     * @return OrderType 排序方式 asc、desc
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set 排序方式 asc、desc
     * @param OrderType 排序方式 asc、desc
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    public ListAggregateDiscoveredResourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAggregateDiscoveredResourcesRequest(ListAggregateDiscoveredResourcesRequest source) {
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.AccountGroupId != null) {
            this.AccountGroupId = new String(source.AccountGroupId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.OrderType != null) {
            this.OrderType = new String(source.OrderType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "AccountGroupId", this.AccountGroupId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);

    }
}

