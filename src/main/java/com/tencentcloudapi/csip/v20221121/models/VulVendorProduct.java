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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulVendorProduct extends AbstractModel {

    /**
    * <p>供应商</p>
    */
    @SerializedName("Vendor")
    @Expose
    private String Vendor;

    /**
    * <p>产品名称</p>
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * <p>影响版本</p>
    */
    @SerializedName("VersionRange")
    @Expose
    private String [] VersionRange;

    /**
     * Get <p>供应商</p> 
     * @return Vendor <p>供应商</p>
     */
    public String getVendor() {
        return this.Vendor;
    }

    /**
     * Set <p>供应商</p>
     * @param Vendor <p>供应商</p>
     */
    public void setVendor(String Vendor) {
        this.Vendor = Vendor;
    }

    /**
     * Get <p>产品名称</p> 
     * @return Product <p>产品名称</p>
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set <p>产品名称</p>
     * @param Product <p>产品名称</p>
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get <p>影响版本</p> 
     * @return VersionRange <p>影响版本</p>
     */
    public String [] getVersionRange() {
        return this.VersionRange;
    }

    /**
     * Set <p>影响版本</p>
     * @param VersionRange <p>影响版本</p>
     */
    public void setVersionRange(String [] VersionRange) {
        this.VersionRange = VersionRange;
    }

    public VulVendorProduct() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulVendorProduct(VulVendorProduct source) {
        if (source.Vendor != null) {
            this.Vendor = new String(source.Vendor);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.VersionRange != null) {
            this.VersionRange = new String[source.VersionRange.length];
            for (int i = 0; i < source.VersionRange.length; i++) {
                this.VersionRange[i] = new String(source.VersionRange[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vendor", this.Vendor);
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArraySimple(map, prefix + "VersionRange.", this.VersionRange);

    }
}

