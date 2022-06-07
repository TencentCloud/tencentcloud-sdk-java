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
package com.tencentcloudapi.api.v20201106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeZonesRequest extends AbstractModel{

    /**
    * 待查询产品的名称，例如cvm，具体取值请查询DescribeProducts接口
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get 待查询产品的名称，例如cvm，具体取值请查询DescribeProducts接口 
     * @return Product 待查询产品的名称，例如cvm，具体取值请查询DescribeProducts接口
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 待查询产品的名称，例如cvm，具体取值请查询DescribeProducts接口
     * @param Product 待查询产品的名称，例如cvm，具体取值请查询DescribeProducts接口
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public DescribeZonesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeZonesRequest(DescribeZonesRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

