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

public class ListTriggersRequest extends AbstractModel{

    /**
    * 函数名称
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 命名空间，默认是default
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

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
    * 根据哪个字段进行返回结果排序,支持以下字段：AddTime, ModTime，默认ModTime
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 以升序还是降序的方式返回结果，可选值 ASC 和 DESC，默认DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * * Qualifier:
函数版本，别名
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 函数名称 
     * @return FunctionName 函数名称
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set 函数名称
     * @param FunctionName 函数名称
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get 命名空间，默认是default 
     * @return Namespace 命名空间，默认是default
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间，默认是default
     * @param Namespace 命名空间，默认是default
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
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
     * Get 根据哪个字段进行返回结果排序,支持以下字段：AddTime, ModTime，默认ModTime 
     * @return OrderBy 根据哪个字段进行返回结果排序,支持以下字段：AddTime, ModTime，默认ModTime
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 根据哪个字段进行返回结果排序,支持以下字段：AddTime, ModTime，默认ModTime
     * @param OrderBy 根据哪个字段进行返回结果排序,支持以下字段：AddTime, ModTime，默认ModTime
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get 以升序还是降序的方式返回结果，可选值 ASC 和 DESC，默认DESC 
     * @return Order 以升序还是降序的方式返回结果，可选值 ASC 和 DESC，默认DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 以升序还是降序的方式返回结果，可选值 ASC 和 DESC，默认DESC
     * @param Order 以升序还是降序的方式返回结果，可选值 ASC 和 DESC，默认DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get * Qualifier:
函数版本，别名 
     * @return Filters * Qualifier:
函数版本，别名
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set * Qualifier:
函数版本，别名
     * @param Filters * Qualifier:
函数版本，别名
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

