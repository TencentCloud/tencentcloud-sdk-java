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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAllUserContactRequest extends AbstractModel{

    /**
    * 服务产品类型，固定值：mysql。
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 联系人名数组，支持模糊搜索。
    */
    @SerializedName("Names")
    @Expose
    private String [] Names;

    /**
     * Get 服务产品类型，固定值：mysql。 
     * @return Product 服务产品类型，固定值：mysql。
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 服务产品类型，固定值：mysql。
     * @param Product 服务产品类型，固定值：mysql。
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 联系人名数组，支持模糊搜索。 
     * @return Names 联系人名数组，支持模糊搜索。
     */
    public String [] getNames() {
        return this.Names;
    }

    /**
     * Set 联系人名数组，支持模糊搜索。
     * @param Names 联系人名数组，支持模糊搜索。
     */
    public void setNames(String [] Names) {
        this.Names = Names;
    }

    public DescribeAllUserContactRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAllUserContactRequest(DescribeAllUserContactRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Names != null) {
            this.Names = new String[source.Names.length];
            for (int i = 0; i < source.Names.length; i++) {
                this.Names[i] = new String(source.Names[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArraySimple(map, prefix + "Names.", this.Names);

    }
}

