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

public class ListNamespacesRequest  extends AbstractModel{

    /**
    * 返回数据长度，默认值为 20
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 数据的偏移量，默认值为 0
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

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
     * 获取返回数据长度，默认值为 20
     * @return Limit 返回数据长度，默认值为 20
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置返回数据长度，默认值为 20
     * @param Limit 返回数据长度，默认值为 20
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取数据的偏移量，默认值为 0
     * @return Offset 数据的偏移量，默认值为 0
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置数据的偏移量，默认值为 0
     * @param Offset 数据的偏移量，默认值为 0
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取根据哪个字段进行返回结果排序,支持以下字段：Name,Updatetime
     * @return Orderby 根据哪个字段进行返回结果排序,支持以下字段：Name,Updatetime
     */
    public String getOrderby() {
        return this.Orderby;
    }

    /**
     * 设置根据哪个字段进行返回结果排序,支持以下字段：Name,Updatetime
     * @param Orderby 根据哪个字段进行返回结果排序,支持以下字段：Name,Updatetime
     */
    public void setOrderby(String Orderby) {
        this.Orderby = Orderby;
    }

    /**
     * 获取以升序还是降序的方式返回结果，可选值 ASC 和 DESC
     * @return Order 以升序还是降序的方式返回结果，可选值 ASC 和 DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * 设置以升序还是降序的方式返回结果，可选值 ASC 和 DESC
     * @param Order 以升序还是降序的方式返回结果，可选值 ASC 和 DESC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Orderby", this.Orderby);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

