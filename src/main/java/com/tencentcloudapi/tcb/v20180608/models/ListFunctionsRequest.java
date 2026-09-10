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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListFunctionsRequest extends AbstractModel {

    /**
    * <p>命名空间</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>以升序还是降序的方式返回结果，可选值 ASC 和 DESC</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>根据哪个字段进行返回结果排序,支持以下字段：AddTime, ModTime, FunctionName</p>
    */
    @SerializedName("Orderby")
    @Expose
    private String Orderby;

    /**
    * <p>数据偏移量，默认值为 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>返回数据长度，默认值为 20</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>支持FunctionName模糊匹配</p>
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * <p>函数描述，支持模糊搜索</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>过滤特定属性或者有特定标签的函数。- 传值方式key-value 进行传值 例如：&quot;Filters&quot;: [{ &quot;Name&quot;: &quot;Status&quot;, &quot;Values&quot;: [&quot;CreateFailed&quot;,&quot;Creating&quot;]}, {&quot;Name&quot;: &quot;Type&quot;,&quot;Values&quot;: [&quot;HTTP&quot;]}]上述条件的函数是，函数状态为创建失败或者创建中，且函数类型为 HTTP 函数如果通过标签进行过滤：- tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。示例值：&quot;Filters&quot;: [{&quot;Name&quot;:&quot;tag-dmtest&quot;,&quot;Values&quot;:[&quot;dmtest&quot;]}]入参限制：1.每次请求的Filters的上限为10，Filter.Values的上限为5。2.[VpcId&#39;, &#39;SubnetId&#39;, &#39;ClsTopicId&#39;, &#39;ClsLogsetId&#39;, &#39;Role&#39;, &#39;CfsId&#39;, &#39;CfsMountInsId&#39;, &#39;Eip&#39;] 过滤的Name 为这些属性时， values 只能传一个值3.[&#39;Status&#39;, &#39;Runtime&#39;, &#39;Type&#39;, &#39;PublicNetStatus&#39;, &#39;AsyncRunEnable&#39;, &#39;TraceEnable&#39;, &#39;Stamp&#39;] 过滤的Name 为这些属性时 ，values 可以传多个值</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get <p>命名空间</p> 
     * @return EnvId <p>命名空间</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>命名空间</p>
     * @param EnvId <p>命名空间</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>以升序还是降序的方式返回结果，可选值 ASC 和 DESC</p> 
     * @return Order <p>以升序还是降序的方式返回结果，可选值 ASC 和 DESC</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>以升序还是降序的方式返回结果，可选值 ASC 和 DESC</p>
     * @param Order <p>以升序还是降序的方式返回结果，可选值 ASC 和 DESC</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>根据哪个字段进行返回结果排序,支持以下字段：AddTime, ModTime, FunctionName</p> 
     * @return Orderby <p>根据哪个字段进行返回结果排序,支持以下字段：AddTime, ModTime, FunctionName</p>
     */
    public String getOrderby() {
        return this.Orderby;
    }

    /**
     * Set <p>根据哪个字段进行返回结果排序,支持以下字段：AddTime, ModTime, FunctionName</p>
     * @param Orderby <p>根据哪个字段进行返回结果排序,支持以下字段：AddTime, ModTime, FunctionName</p>
     */
    public void setOrderby(String Orderby) {
        this.Orderby = Orderby;
    }

    /**
     * Get <p>数据偏移量，默认值为 0</p> 
     * @return Offset <p>数据偏移量，默认值为 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>数据偏移量，默认值为 0</p>
     * @param Offset <p>数据偏移量，默认值为 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>返回数据长度，默认值为 20</p> 
     * @return Limit <p>返回数据长度，默认值为 20</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>返回数据长度，默认值为 20</p>
     * @param Limit <p>返回数据长度，默认值为 20</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>支持FunctionName模糊匹配</p> 
     * @return SearchKey <p>支持FunctionName模糊匹配</p>
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * Set <p>支持FunctionName模糊匹配</p>
     * @param SearchKey <p>支持FunctionName模糊匹配</p>
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * Get <p>函数描述，支持模糊搜索</p> 
     * @return Description <p>函数描述，支持模糊搜索</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>函数描述，支持模糊搜索</p>
     * @param Description <p>函数描述，支持模糊搜索</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>过滤特定属性或者有特定标签的函数。- 传值方式key-value 进行传值 例如：&quot;Filters&quot;: [{ &quot;Name&quot;: &quot;Status&quot;, &quot;Values&quot;: [&quot;CreateFailed&quot;,&quot;Creating&quot;]}, {&quot;Name&quot;: &quot;Type&quot;,&quot;Values&quot;: [&quot;HTTP&quot;]}]上述条件的函数是，函数状态为创建失败或者创建中，且函数类型为 HTTP 函数如果通过标签进行过滤：- tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。示例值：&quot;Filters&quot;: [{&quot;Name&quot;:&quot;tag-dmtest&quot;,&quot;Values&quot;:[&quot;dmtest&quot;]}]入参限制：1.每次请求的Filters的上限为10，Filter.Values的上限为5。2.[VpcId&#39;, &#39;SubnetId&#39;, &#39;ClsTopicId&#39;, &#39;ClsLogsetId&#39;, &#39;Role&#39;, &#39;CfsId&#39;, &#39;CfsMountInsId&#39;, &#39;Eip&#39;] 过滤的Name 为这些属性时， values 只能传一个值3.[&#39;Status&#39;, &#39;Runtime&#39;, &#39;Type&#39;, &#39;PublicNetStatus&#39;, &#39;AsyncRunEnable&#39;, &#39;TraceEnable&#39;, &#39;Stamp&#39;] 过滤的Name 为这些属性时 ，values 可以传多个值</p> 
     * @return Filters <p>过滤特定属性或者有特定标签的函数。- 传值方式key-value 进行传值 例如：&quot;Filters&quot;: [{ &quot;Name&quot;: &quot;Status&quot;, &quot;Values&quot;: [&quot;CreateFailed&quot;,&quot;Creating&quot;]}, {&quot;Name&quot;: &quot;Type&quot;,&quot;Values&quot;: [&quot;HTTP&quot;]}]上述条件的函数是，函数状态为创建失败或者创建中，且函数类型为 HTTP 函数如果通过标签进行过滤：- tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。示例值：&quot;Filters&quot;: [{&quot;Name&quot;:&quot;tag-dmtest&quot;,&quot;Values&quot;:[&quot;dmtest&quot;]}]入参限制：1.每次请求的Filters的上限为10，Filter.Values的上限为5。2.[VpcId&#39;, &#39;SubnetId&#39;, &#39;ClsTopicId&#39;, &#39;ClsLogsetId&#39;, &#39;Role&#39;, &#39;CfsId&#39;, &#39;CfsMountInsId&#39;, &#39;Eip&#39;] 过滤的Name 为这些属性时， values 只能传一个值3.[&#39;Status&#39;, &#39;Runtime&#39;, &#39;Type&#39;, &#39;PublicNetStatus&#39;, &#39;AsyncRunEnable&#39;, &#39;TraceEnable&#39;, &#39;Stamp&#39;] 过滤的Name 为这些属性时 ，values 可以传多个值</p>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>过滤特定属性或者有特定标签的函数。- 传值方式key-value 进行传值 例如：&quot;Filters&quot;: [{ &quot;Name&quot;: &quot;Status&quot;, &quot;Values&quot;: [&quot;CreateFailed&quot;,&quot;Creating&quot;]}, {&quot;Name&quot;: &quot;Type&quot;,&quot;Values&quot;: [&quot;HTTP&quot;]}]上述条件的函数是，函数状态为创建失败或者创建中，且函数类型为 HTTP 函数如果通过标签进行过滤：- tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。示例值：&quot;Filters&quot;: [{&quot;Name&quot;:&quot;tag-dmtest&quot;,&quot;Values&quot;:[&quot;dmtest&quot;]}]入参限制：1.每次请求的Filters的上限为10，Filter.Values的上限为5。2.[VpcId&#39;, &#39;SubnetId&#39;, &#39;ClsTopicId&#39;, &#39;ClsLogsetId&#39;, &#39;Role&#39;, &#39;CfsId&#39;, &#39;CfsMountInsId&#39;, &#39;Eip&#39;] 过滤的Name 为这些属性时， values 只能传一个值3.[&#39;Status&#39;, &#39;Runtime&#39;, &#39;Type&#39;, &#39;PublicNetStatus&#39;, &#39;AsyncRunEnable&#39;, &#39;TraceEnable&#39;, &#39;Stamp&#39;] 过滤的Name 为这些属性时 ，values 可以传多个值</p>
     * @param Filters <p>过滤特定属性或者有特定标签的函数。- 传值方式key-value 进行传值 例如：&quot;Filters&quot;: [{ &quot;Name&quot;: &quot;Status&quot;, &quot;Values&quot;: [&quot;CreateFailed&quot;,&quot;Creating&quot;]}, {&quot;Name&quot;: &quot;Type&quot;,&quot;Values&quot;: [&quot;HTTP&quot;]}]上述条件的函数是，函数状态为创建失败或者创建中，且函数类型为 HTTP 函数如果通过标签进行过滤：- tag:tag-key - String - 是否必填：否 - （过滤条件）按照标签键值对进行过滤。 tag-key使用具体的标签键进行替换。示例值：&quot;Filters&quot;: [{&quot;Name&quot;:&quot;tag-dmtest&quot;,&quot;Values&quot;:[&quot;dmtest&quot;]}]入参限制：1.每次请求的Filters的上限为10，Filter.Values的上限为5。2.[VpcId&#39;, &#39;SubnetId&#39;, &#39;ClsTopicId&#39;, &#39;ClsLogsetId&#39;, &#39;Role&#39;, &#39;CfsId&#39;, &#39;CfsMountInsId&#39;, &#39;Eip&#39;] 过滤的Name 为这些属性时， values 只能传一个值3.[&#39;Status&#39;, &#39;Runtime&#39;, &#39;Type&#39;, &#39;PublicNetStatus&#39;, &#39;AsyncRunEnable&#39;, &#39;TraceEnable&#39;, &#39;Stamp&#39;] 过滤的Name 为这些属性时 ，values 可以传多个值</p>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public ListFunctionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListFunctionsRequest(ListFunctionsRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.Orderby != null) {
            this.Orderby = new String(source.Orderby);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.SearchKey != null) {
            this.SearchKey = new String(source.SearchKey);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
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
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Orderby", this.Orderby);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

