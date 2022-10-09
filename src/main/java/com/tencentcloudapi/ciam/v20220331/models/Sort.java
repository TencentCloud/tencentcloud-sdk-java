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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Sort extends AbstractModel{

    /**
    * 排序字段的key，参考自定义属性
    */
    @SerializedName("PropertyKey")
    @Expose
    private String PropertyKey;

    /**
    * 升序或者降序，ASC/DESC
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get 排序字段的key，参考自定义属性 
     * @return PropertyKey 排序字段的key，参考自定义属性
     */
    public String getPropertyKey() {
        return this.PropertyKey;
    }

    /**
     * Set 排序字段的key，参考自定义属性
     * @param PropertyKey 排序字段的key，参考自定义属性
     */
    public void setPropertyKey(String PropertyKey) {
        this.PropertyKey = PropertyKey;
    }

    /**
     * Get 升序或者降序，ASC/DESC 
     * @return Order 升序或者降序，ASC/DESC
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 升序或者降序，ASC/DESC
     * @param Order 升序或者降序，ASC/DESC
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
        if (source.PropertyKey != null) {
            this.PropertyKey = new String(source.PropertyKey);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PropertyKey", this.PropertyKey);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

