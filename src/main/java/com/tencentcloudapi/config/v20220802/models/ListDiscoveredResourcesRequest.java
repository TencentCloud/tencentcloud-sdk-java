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

public class ListDiscoveredResourcesRequest extends AbstractModel {

    /**
    * <p>每页显示数量</p>
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * <p>resourceName：资源名  resourceId ：资源ID</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * <p>标签</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>下一页token</p>
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * <p>排序方式 asc、desc</p>
    */
    @SerializedName("OrderType")
    @Expose
    private String OrderType;

    /**
     * Get <p>每页显示数量</p> 
     * @return MaxResults <p>每页显示数量</p>
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set <p>每页显示数量</p>
     * @param MaxResults <p>每页显示数量</p>
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get <p>resourceName：资源名  resourceId ：资源ID</p> 
     * @return Filters <p>resourceName：资源名  resourceId ：资源ID</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>resourceName：资源名  resourceId ：资源ID</p>
     * @param Filters <p>resourceName：资源名  resourceId ：资源ID</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>标签</p> 
     * @return Tags <p>标签</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签</p>
     * @param Tags <p>标签</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>下一页token</p> 
     * @return NextToken <p>下一页token</p>
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set <p>下一页token</p>
     * @param NextToken <p>下一页token</p>
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get <p>排序方式 asc、desc</p> 
     * @return OrderType <p>排序方式 asc、desc</p>
     */
    public String getOrderType() {
        return this.OrderType;
    }

    /**
     * Set <p>排序方式 asc、desc</p>
     * @param OrderType <p>排序方式 asc、desc</p>
     */
    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    public ListDiscoveredResourcesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListDiscoveredResourcesRequest(ListDiscoveredResourcesRequest source) {
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
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
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);

    }
}

