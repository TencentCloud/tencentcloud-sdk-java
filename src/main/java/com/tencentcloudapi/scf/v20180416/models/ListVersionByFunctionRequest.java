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

public class ListVersionByFunctionRequest extends AbstractModel{

    /**
    * 函数名
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 函数所在命名空间
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
    * 以升序还是降序的方式返回结果，可选值 ASC 和 DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 根据哪个字段进行返回结果排序,支持以下字段：AddTime, ModTime
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
     * Get 函数名 
     * @return FunctionName 函数名
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set 函数名
     * @param FunctionName 函数名
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get 函数所在命名空间 
     * @return Namespace 函数所在命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 函数所在命名空间
     * @param Namespace 函数所在命名空间
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
     * Get 根据哪个字段进行返回结果排序,支持以下字段：AddTime, ModTime 
     * @return OrderBy 根据哪个字段进行返回结果排序,支持以下字段：AddTime, ModTime
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set 根据哪个字段进行返回结果排序,支持以下字段：AddTime, ModTime
     * @param OrderBy 根据哪个字段进行返回结果排序,支持以下字段：AddTime, ModTime
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);

    }
}

