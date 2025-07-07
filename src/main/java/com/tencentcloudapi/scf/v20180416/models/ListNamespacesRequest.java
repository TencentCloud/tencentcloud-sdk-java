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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListNamespacesRequest extends AbstractModel {

    /**
    * 返回数据长度，默认值为 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 数据的偏移量，默认值为 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 根据哪个字段进行返回结果排序,支持以下字段：Name,Updatetime
    */
    @SerializedName("Orderby")
    @Expose
    private String Orderby;

    /**
    * 以升序还是降序的方式返回结果，可选值 ASC 和 DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 关键字匹配搜索，Key 可选值为 Namespace 和 Description，多个搜索条件之间是与的关系
    */
    @SerializedName("SearchKey")
    @Expose
    private SearchKey [] SearchKey;

    /**
     * Get 返回数据长度，默认值为 20 
     * @return Limit 返回数据长度，默认值为 20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回数据长度，默认值为 20
     * @param Limit 返回数据长度，默认值为 20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 数据的偏移量，默认值为 0 
     * @return Offset 数据的偏移量，默认值为 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 数据的偏移量，默认值为 0
     * @param Offset 数据的偏移量，默认值为 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 根据哪个字段进行返回结果排序,支持以下字段：Name,Updatetime 
     * @return Orderby 根据哪个字段进行返回结果排序,支持以下字段：Name,Updatetime
     */
    public String getOrderby() {
        return this.Orderby;
    }

    /**
     * Set 根据哪个字段进行返回结果排序,支持以下字段：Name,Updatetime
     * @param Orderby 根据哪个字段进行返回结果排序,支持以下字段：Name,Updatetime
     */
    public void setOrderby(String Orderby) {
        this.Orderby = Orderby;
    }

    /**
     * Get 以升序还是降序的方式返回结果，可选值 ASC 和 DESC 
     * @return Order 以升序还是降序的方式返回结果，可选值 ASC 和 DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 以升序还是降序的方式返回结果，可选值 ASC 和 DESC
     * @param Order 以升序还是降序的方式返回结果，可选值 ASC 和 DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 关键字匹配搜索，Key 可选值为 Namespace 和 Description，多个搜索条件之间是与的关系 
     * @return SearchKey 关键字匹配搜索，Key 可选值为 Namespace 和 Description，多个搜索条件之间是与的关系
     */
    public SearchKey [] getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 关键字匹配搜索，Key 可选值为 Namespace 和 Description，多个搜索条件之间是与的关系
     * @param SearchKey 关键字匹配搜索，Key 可选值为 Namespace 和 Description，多个搜索条件之间是与的关系
     */
    public void setSearchKey(SearchKey [] SearchKey) {
        this.SearchKey = SearchKey;
    }

    public ListNamespacesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListNamespacesRequest(ListNamespacesRequest source) {
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Orderby != null) {
            this.Orderby = new String(source.Orderby);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new SearchKey[source.SearchKey.length];
            for (int i = 0; i < source.SearchKey.length; i++) {
                this.SearchKey[i] = new SearchKey(source.SearchKey[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Orderby", this.Orderby);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamArrayObj(map, prefix + "SearchKey.", this.SearchKey);

    }
}

