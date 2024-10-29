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
package com.tencentcloudapi.bsca.v20210811.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKBComponentVersionListRequest extends AbstractModel {

    /**
    * 要查询的组件 PURL
    */
    @SerializedName("PURL")
    @Expose
    private PURL PURL;

    /**
    * 页号
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 页大小
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 排序方式，可以是"ASC"或"DESC"，默认"DESC"
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序字段，可能的字段包括“Version”、"PublishTime"
    */
    @SerializedName("OrderBy")
    @Expose
    private String [] OrderBy;

    /**
    * Tag筛选
    */
    @SerializedName("Filter")
    @Expose
    private ComponentTagFilter Filter;

    /**
     * Get 要查询的组件 PURL 
     * @return PURL 要查询的组件 PURL
     */
    public PURL getPURL() {
        return this.PURL;
    }

    /**
     * Set 要查询的组件 PURL
     * @param PURL 要查询的组件 PURL
     */
    public void setPURL(PURL PURL) {
        this.PURL = PURL;
    }

    /**
     * Get 页号 
     * @return PageNumber 页号
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页号
     * @param PageNumber 页号
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 页大小 
     * @return PageSize 页大小
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 页大小
     * @param PageSize 页大小
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 排序方式，可以是"ASC"或"DESC"，默认"DESC" 
     * @return Order 排序方式，可以是"ASC"或"DESC"，默认"DESC"
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式，可以是"ASC"或"DESC"，默认"DESC"
     * @param Order 排序方式，可以是"ASC"或"DESC"，默认"DESC"
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序字段，可能的字段包括“Version”、"PublishTime" 
     * @return OrderBy 排序字段，可能的字段包括“Version”、"PublishTime"
     */
    public String [] getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 排序字段，可能的字段包括“Version”、"PublishTime"
     * @param OrderBy 排序字段，可能的字段包括“Version”、"PublishTime"
     */
    public void setOrderBy(String [] OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Tag筛选 
     * @return Filter Tag筛选
     */
    public ComponentTagFilter getFilter() {
        return this.Filter;
    }

    /**
     * Set Tag筛选
     * @param Filter Tag筛选
     */
    public void setFilter(ComponentTagFilter Filter) {
        this.Filter = Filter;
    }

    public DescribeKBComponentVersionListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKBComponentVersionListRequest(DescribeKBComponentVersionListRequest source) {
        if (source.PURL != null) {
            this.PURL = new PURL(source.PURL);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new String[source.OrderBy.length];
            for (int i = 0; i < source.OrderBy.length; i++) {
                this.OrderBy[i] = new String(source.OrderBy[i]);
            }
        }
        if (source.Filter != null) {
            this.Filter = new ComponentTagFilter(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "PURL.", this.PURL);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamArraySimple(map, prefix + "OrderBy.", this.OrderBy);
        this.setParamObj(map, prefix + "Filter.", this.Filter);

    }
}

