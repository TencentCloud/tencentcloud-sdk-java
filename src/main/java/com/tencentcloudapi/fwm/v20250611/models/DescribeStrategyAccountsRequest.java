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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStrategyAccountsRequest extends AbstractModel {

    /**
    * 下发产品 secgroup // 企业安全组
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
    * 筛选器
    */
    @SerializedName("Filters")
    @Expose
    private CommonFilter [] Filters;

    /**
     * Get 下发产品 secgroup // 企业安全组 
     * @return Product 下发产品 secgroup // 企业安全组
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 下发产品 secgroup // 企业安全组
     * @param Product 下发产品 secgroup // 企业安全组
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * Get 筛选器 
     * @return Filters 筛选器
     */
    public CommonFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 筛选器
     * @param Filters 筛选器
     */
    public void setFilters(CommonFilter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeStrategyAccountsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStrategyAccountsRequest(DescribeStrategyAccountsRequest source) {
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
        if (source.Filters != null) {
            this.Filters = new CommonFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new CommonFilter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Product", this.Product);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

