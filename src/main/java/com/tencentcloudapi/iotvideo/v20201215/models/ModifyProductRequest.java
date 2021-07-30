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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyProductRequest extends AbstractModel{

    /**
    * 产品id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 修改的产品名称 （支持中文、英文、数字、下划线组合，最多不超过20个字符）
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 修改的产品描述 （最多不超过128个字符）
    */
    @SerializedName("ProductDescription")
    @Expose
    private String ProductDescription;

    /**
     * Get 产品id 
     * @return ProductId 产品id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品id
     * @param ProductId 产品id
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 修改的产品名称 （支持中文、英文、数字、下划线组合，最多不超过20个字符） 
     * @return ProductName 修改的产品名称 （支持中文、英文、数字、下划线组合，最多不超过20个字符）
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 修改的产品名称 （支持中文、英文、数字、下划线组合，最多不超过20个字符）
     * @param ProductName 修改的产品名称 （支持中文、英文、数字、下划线组合，最多不超过20个字符）
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 修改的产品描述 （最多不超过128个字符） 
     * @return ProductDescription 修改的产品描述 （最多不超过128个字符）
     */
    public String getProductDescription() {
        return this.ProductDescription;
    }

    /**
     * Set 修改的产品描述 （最多不超过128个字符）
     * @param ProductDescription 修改的产品描述 （最多不超过128个字符）
     */
    public void setProductDescription(String ProductDescription) {
        this.ProductDescription = ProductDescription;
    }

    public ModifyProductRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyProductRequest(ModifyProductRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.ProductDescription != null) {
            this.ProductDescription = new String(source.ProductDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "ProductDescription", this.ProductDescription);

    }
}

