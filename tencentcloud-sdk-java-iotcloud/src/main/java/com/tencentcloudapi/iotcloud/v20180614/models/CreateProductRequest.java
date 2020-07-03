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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateProductRequest extends AbstractModel{

    /**
    * 产品名称，名称不能和已经存在的产品名称重复。命名规则：[a-zA-Z0-9:_-]{1,32}
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 产品属性
    */
    @SerializedName("ProductProperties")
    @Expose
    private ProductProperties ProductProperties;

    /**
    * 创建CLAA产品时，需要Skey
    */
    @SerializedName("Skey")
    @Expose
    private String Skey;

    /**
     * Get 产品名称，名称不能和已经存在的产品名称重复。命名规则：[a-zA-Z0-9:_-]{1,32} 
     * @return ProductName 产品名称，名称不能和已经存在的产品名称重复。命名规则：[a-zA-Z0-9:_-]{1,32}
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名称，名称不能和已经存在的产品名称重复。命名规则：[a-zA-Z0-9:_-]{1,32}
     * @param ProductName 产品名称，名称不能和已经存在的产品名称重复。命名规则：[a-zA-Z0-9:_-]{1,32}
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 产品属性 
     * @return ProductProperties 产品属性
     */
    public ProductProperties getProductProperties() {
        return this.ProductProperties;
    }

    /**
     * Set 产品属性
     * @param ProductProperties 产品属性
     */
    public void setProductProperties(ProductProperties ProductProperties) {
        this.ProductProperties = ProductProperties;
    }

    /**
     * Get 创建CLAA产品时，需要Skey 
     * @return Skey 创建CLAA产品时，需要Skey
     */
    public String getSkey() {
        return this.Skey;
    }

    /**
     * Set 创建CLAA产品时，需要Skey
     * @param Skey 创建CLAA产品时，需要Skey
     */
    public void setSkey(String Skey) {
        this.Skey = Skey;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamObj(map, prefix + "ProductProperties.", this.ProductProperties);
        this.setParamSimple(map, prefix + "Skey", this.Skey);

    }
}

