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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RequestSort extends AbstractModel {

    /**
    * 排序字段名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 排序方向。取值：ASC（升序）、DESC（降序）。
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 排序字段名称。 
     * @return Name 排序字段名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 排序字段名称。
     * @param Name 排序字段名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 排序方向。取值：ASC（升序）、DESC（降序）。 
     * @return Order 排序方向。取值：ASC（升序）、DESC（降序）。
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方向。取值：ASC（升序）、DESC（降序）。
     * @param Order 排序方向。取值：ASC（升序）、DESC（降序）。
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public RequestSort() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RequestSort(RequestSort source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

