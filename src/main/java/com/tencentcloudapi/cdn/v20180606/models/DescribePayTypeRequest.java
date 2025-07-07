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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePayTypeRequest extends AbstractModel {

    /**
    * 指定服务地域查询
mainland：境内计费方式查询
overseas：境外计费方式查询
global：全球计费方式查询
未填充时，默认为 mainland
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 指定查询的产品数据，可选为cdn或者ecdn，默认为cdn
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 指定资源包查询
flux：流量包
https：HTTPS请求包
未填充时，默认为 flux
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 指定服务地域查询
mainland：境内计费方式查询
overseas：境外计费方式查询
global：全球计费方式查询
未填充时，默认为 mainland 
     * @return Area 指定服务地域查询
mainland：境内计费方式查询
overseas：境外计费方式查询
global：全球计费方式查询
未填充时，默认为 mainland
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 指定服务地域查询
mainland：境内计费方式查询
overseas：境外计费方式查询
global：全球计费方式查询
未填充时，默认为 mainland
     * @param Area 指定服务地域查询
mainland：境内计费方式查询
overseas：境外计费方式查询
global：全球计费方式查询
未填充时，默认为 mainland
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 指定查询的产品数据，可选为cdn或者ecdn，默认为cdn 
     * @return Product 指定查询的产品数据，可选为cdn或者ecdn，默认为cdn
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 指定查询的产品数据，可选为cdn或者ecdn，默认为cdn
     * @param Product 指定查询的产品数据，可选为cdn或者ecdn，默认为cdn
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 指定资源包查询
flux：流量包
https：HTTPS请求包
未填充时，默认为 flux 
     * @return Type 指定资源包查询
flux：流量包
https：HTTPS请求包
未填充时，默认为 flux
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 指定资源包查询
flux：流量包
https：HTTPS请求包
未填充时，默认为 flux
     * @param Type 指定资源包查询
flux：流量包
https：HTTPS请求包
未填充时，默认为 flux
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DescribePayTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePayTypeRequest(DescribePayTypeRequest source) {
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

