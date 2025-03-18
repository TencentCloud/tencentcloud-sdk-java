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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BillProductLink extends AbstractModel {

    /**
    * 子产品编码
    */
    @SerializedName("ProductCode")
    @Expose
    private String ProductCode;

    /**
    * 子产品名称
    */
    @SerializedName("ProductCodeName")
    @Expose
    private String ProductCodeName;

    /**
    * 组件名称
    */
    @SerializedName("Children")
    @Expose
    private BillItem [] Children;

    /**
     * Get 子产品编码 
     * @return ProductCode 子产品编码
     */
    public String getProductCode() {
        return this.ProductCode;
    }

    /**
     * Set 子产品编码
     * @param ProductCode 子产品编码
     */
    public void setProductCode(String ProductCode) {
        this.ProductCode = ProductCode;
    }

    /**
     * Get 子产品名称 
     * @return ProductCodeName 子产品名称
     */
    public String getProductCodeName() {
        return this.ProductCodeName;
    }

    /**
     * Set 子产品名称
     * @param ProductCodeName 子产品名称
     */
    public void setProductCodeName(String ProductCodeName) {
        this.ProductCodeName = ProductCodeName;
    }

    /**
     * Get 组件名称 
     * @return Children 组件名称
     */
    public BillItem [] getChildren() {
        return this.Children;
    }

    /**
     * Set 组件名称
     * @param Children 组件名称
     */
    public void setChildren(BillItem [] Children) {
        this.Children = Children;
    }

    public BillProductLink() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BillProductLink(BillProductLink source) {
        if (source.ProductCode != null) {
            this.ProductCode = new String(source.ProductCode);
        }
        if (source.ProductCodeName != null) {
            this.ProductCodeName = new String(source.ProductCodeName);
        }
        if (source.Children != null) {
            this.Children = new BillItem[source.Children.length];
            for (int i = 0; i < source.Children.length; i++) {
                this.Children[i] = new BillItem(source.Children[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductCode", this.ProductCode);
        this.setParamSimple(map, prefix + "ProductCodeName", this.ProductCodeName);
        this.setParamArrayObj(map, prefix + "Children.", this.Children);

    }
}

