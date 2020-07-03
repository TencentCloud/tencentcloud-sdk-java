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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListFunctionsRequest extends AbstractModel{

    /**
    * 以升序还是降序的方式返回结果，可选值 ASC 和 DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 根据哪个字段进行返回结果排序,支持以下字段：AddTime, ModTime, FunctionName
    */
    @SerializedName("Orderby")
    @Expose
    private String Orderby;

    /**
    * 数据偏移量，默认值为 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回数据长度，默认值为 20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 支持FunctionName模糊匹配
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 函数描述，支持模糊搜索
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 过滤条件。
- tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。

每次请求的Filters的上限为10，Filter.Values的上限为5。
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

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
     * Get 根据哪个字段进行返回结果排序,支持以下字段：AddTime, ModTime, FunctionName 
     * @return Orderby 根据哪个字段进行返回结果排序,支持以下字段：AddTime, ModTime, FunctionName
     */
    public String getOrderby() {
        return this.Orderby;
    }

    /**
     * Set 根据哪个字段进行返回结果排序,支持以下字段：AddTime, ModTime, FunctionName
     * @param Orderby 根据哪个字段进行返回结果排序,支持以下字段：AddTime, ModTime, FunctionName
     */
    public void setOrderby(String Orderby) {
        this.Orderby = Orderby;
    }

    /**
     * Get 数据偏移量，默认值为 0 
     * @return Offset 数据偏移量，默认值为 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 数据偏移量，默认值为 0
     * @param Offset 数据偏移量，默认值为 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

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
     * Get 支持FunctionName模糊匹配 
     * @return SearchKey 支持FunctionName模糊匹配
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set 支持FunctionName模糊匹配
     * @param SearchKey 支持FunctionName模糊匹配
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 函数描述，支持模糊搜索 
     * @return Description 函数描述，支持模糊搜索
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 函数描述，支持模糊搜索
     * @param Description 函数描述，支持模糊搜索
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 过滤条件。
- tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。

每次请求的Filters的上限为10，Filter.Values的上限为5。 
     * @return Filters 过滤条件。
- tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。

每次请求的Filters的上限为10，Filter.Values的上限为5。
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
- tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。

每次请求的Filters的上限为10，Filter.Values的上限为5。
     * @param Filters 过滤条件。
- tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。

每次请求的Filters的上限为10，Filter.Values的上限为5。
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Orderby", this.Orderby);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

