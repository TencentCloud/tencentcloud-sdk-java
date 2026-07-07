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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Sort extends AbstractModel {

    /**
    * <p>排序的字段</p>
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * <p>排序方式，支持ASC、DESC</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get <p>排序的字段</p> 
     * @return Field <p>排序的字段</p>
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set <p>排序的字段</p>
     * @param Field <p>排序的字段</p>
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get <p>排序方式，支持ASC、DESC</p> 
     * @return Order <p>排序方式，支持ASC、DESC</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序方式，支持ASC、DESC</p>
     * @param Order <p>排序方式，支持ASC、DESC</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public Sort() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Sort(Sort source) {
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

