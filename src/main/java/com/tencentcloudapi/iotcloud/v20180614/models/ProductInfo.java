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

public class ProductInfo  extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 产品名
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 产品元数据
    */
    @SerializedName("ProductMetadata")
    @Expose
    private ProductMetadata ProductMetadata;

    /**
    * 产品属性
    */
    @SerializedName("ProductProperties")
    @Expose
    private ProductProperties ProductProperties;

    /**
     * 获取产品ID
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * 设置产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * 获取产品名
     * @return ProductName 产品名
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * 设置产品名
     * @param ProductName 产品名
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * 获取产品元数据
     * @return ProductMetadata 产品元数据
     */
    public ProductMetadata getProductMetadata() {
        return this.ProductMetadata;
    }

    /**
     * 设置产品元数据
     * @param ProductMetadata 产品元数据
     */
    public void setProductMetadata(ProductMetadata ProductMetadata) {
        this.ProductMetadata = ProductMetadata;
    }

    /**
     * 获取产品属性
     * @return ProductProperties 产品属性
     */
    public ProductProperties getProductProperties() {
        return this.ProductProperties;
    }

    /**
     * 设置产品属性
     * @param ProductProperties 产品属性
     */
    public void setProductProperties(ProductProperties ProductProperties) {
        this.ProductProperties = ProductProperties;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamObj(map, prefix + "ProductMetadata.", this.ProductMetadata);
        this.setParamObj(map, prefix + "ProductProperties.", this.ProductProperties);

    }
}

