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
package com.tencentcloudapi.eb.v20210416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlatformProduct extends AbstractModel {

    /**
    * <p>平台产品名称</p>
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * <p>平台产品类型</p>
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
     * Get <p>平台产品名称</p> 
     * @return ProductName <p>平台产品名称</p>
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set <p>平台产品名称</p>
     * @param ProductName <p>平台产品名称</p>
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get <p>平台产品类型</p> 
     * @return ProductType <p>平台产品类型</p>
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set <p>平台产品类型</p>
     * @param ProductType <p>平台产品类型</p>
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    public PlatformProduct() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PlatformProduct(PlatformProduct source) {
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.ProductType != null) {
            this.ProductType = new String(source.ProductType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);

    }
}

