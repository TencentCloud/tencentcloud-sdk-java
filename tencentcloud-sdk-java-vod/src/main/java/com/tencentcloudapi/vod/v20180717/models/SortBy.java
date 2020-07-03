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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SortBy extends AbstractModel{

    /**
    * 排序字段
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * 排序方式，可选值：Asc（升序）、Desc（降序）
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 排序字段 
     * @return Field 排序字段
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set 排序字段
     * @param Field 排序字段
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get 排序方式，可选值：Asc（升序）、Desc（降序） 
     * @return Order 排序方式，可选值：Asc（升序）、Desc（降序）
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式，可选值：Asc（升序）、Desc（降序）
     * @param Order 排序方式，可选值：Asc（升序）、Desc（降序）
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

