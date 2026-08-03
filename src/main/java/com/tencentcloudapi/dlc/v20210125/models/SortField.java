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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SortField extends AbstractModel {

    /**
    * 排序字段名，对应实体属性名（驼峰命名）
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * 排序方向：ASC（升序）或DESC（降序），默认ASC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 排序字段名，对应实体属性名（驼峰命名） 
     * @return Field 排序字段名，对应实体属性名（驼峰命名）
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set 排序字段名，对应实体属性名（驼峰命名）
     * @param Field 排序字段名，对应实体属性名（驼峰命名）
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get 排序方向：ASC（升序）或DESC（降序），默认ASC 
     * @return Order 排序方向：ASC（升序）或DESC（降序），默认ASC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方向：ASC（升序）或DESC（降序），默认ASC
     * @param Order 排序方向：ASC（升序）或DESC（降序），默认ASC
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public SortField() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SortField(SortField source) {
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

