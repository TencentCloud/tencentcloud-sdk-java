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
package com.tencentcloudapi.region.v20220627.models;

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
    * 不传或者0表示不查询【可选业务白名单】，1表示查询【可选业务白名单】，该参数设置了1，只有在业务白名单查不到情况下，才会查该白名单
    */
    @SerializedName("Scene")
    @Expose
    private Long Scene;

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

    /**
     * Get 不传或者0表示不查询【可选业务白名单】，1表示查询【可选业务白名单】，该参数设置了1，只有在业务白名单查不到情况下，才会查该白名单 
     * @return Scene 不传或者0表示不查询【可选业务白名单】，1表示查询【可选业务白名单】，该参数设置了1，只有在业务白名单查不到情况下，才会查该白名单
     */
    public Long getScene() {
        return this.Scene;
    }

    /**
     * Set 不传或者0表示不查询【可选业务白名单】，1表示查询【可选业务白名单】，该参数设置了1，只有在业务白名单查不到情况下，才会查该白名单
     * @param Scene 不传或者0表示不查询【可选业务白名单】，1表示查询【可选业务白名单】，该参数设置了1，只有在业务白名单查不到情况下，才会查该白名单
     */
    public void setScene(Long Scene) {
        this.Scene = Scene;
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
        if (source.Scene != null) {
            this.Scene = new Long(source.Scene);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "Scene", this.Scene);

    }
}

