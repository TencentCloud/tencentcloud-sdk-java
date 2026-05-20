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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDataSourceListRequest extends AbstractModel {

    /**
    * <p>页码</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>返回数量</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>排序配置</p>
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderField [] OrderFields;

    /**
    * <p>可选过滤条件，Filter可选配置(参考): &quot;Name&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;数据源名称&quot; }, &quot;Type&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;类型&quot; }, &quot;ClusterId&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;集群id&quot; }, &quot;CategoryId&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;分类，项目或空间id&quot; }</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get <p>页码</p> 
     * @return PageNumber <p>页码</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>页码</p>
     * @param PageNumber <p>页码</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>返回数量</p> 
     * @return PageSize <p>返回数量</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>返回数量</p>
     * @param PageSize <p>返回数量</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>排序配置</p> 
     * @return OrderFields <p>排序配置</p>
     */
    public OrderField [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set <p>排序配置</p>
     * @param OrderFields <p>排序配置</p>
     */
    public void setOrderFields(OrderField [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    /**
     * Get <p>可选过滤条件，Filter可选配置(参考): &quot;Name&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;数据源名称&quot; }, &quot;Type&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;类型&quot; }, &quot;ClusterId&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;集群id&quot; }, &quot;CategoryId&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;分类，项目或空间id&quot; }</p> 
     * @return Filters <p>可选过滤条件，Filter可选配置(参考): &quot;Name&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;数据源名称&quot; }, &quot;Type&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;类型&quot; }, &quot;ClusterId&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;集群id&quot; }, &quot;CategoryId&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;分类，项目或空间id&quot; }</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>可选过滤条件，Filter可选配置(参考): &quot;Name&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;数据源名称&quot; }, &quot;Type&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;类型&quot; }, &quot;ClusterId&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;集群id&quot; }, &quot;CategoryId&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;分类，项目或空间id&quot; }</p>
     * @param Filters <p>可选过滤条件，Filter可选配置(参考): &quot;Name&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;数据源名称&quot; }, &quot;Type&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;类型&quot; }, &quot;ClusterId&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;集群id&quot; }, &quot;CategoryId&quot;: { &quot;type&quot;: &quot;string&quot;, &quot;description&quot;: &quot;分类，项目或空间id&quot; }</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeDataSourceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataSourceListRequest(DescribeDataSourceListRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.OrderFields != null) {
            this.OrderFields = new OrderField[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new OrderField(source.OrderFields[i]);
            }
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
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "OrderFields.", this.OrderFields);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

