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

public class CreateAnalyzePolicyTaskRequest extends AbstractModel {

    /**
    * 产品类型
    */
    @SerializedName("Products")
    @Expose
    private String [] Products;

    /**
    * 成员Id 列表
    */
    @SerializedName("MemberIdSet")
    @Expose
    private String [] MemberIdSet;

    /**
     * Get 产品类型 
     * @return Products 产品类型
     */
    public String [] getProducts() {
        return this.Products;
    }

    /**
     * Set 产品类型
     * @param Products 产品类型
     */
    public void setProducts(String [] Products) {
        this.Products = Products;
    }

    /**
     * Get 成员Id 列表 
     * @return MemberIdSet 成员Id 列表
     */
    public String [] getMemberIdSet() {
        return this.MemberIdSet;
    }

    /**
     * Set 成员Id 列表
     * @param MemberIdSet 成员Id 列表
     */
    public void setMemberIdSet(String [] MemberIdSet) {
        this.MemberIdSet = MemberIdSet;
    }

    public CreateAnalyzePolicyTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAnalyzePolicyTaskRequest(CreateAnalyzePolicyTaskRequest source) {
        if (source.Products != null) {
            this.Products = new String[source.Products.length];
            for (int i = 0; i < source.Products.length; i++) {
                this.Products[i] = new String(source.Products[i]);
            }
        }
        if (source.MemberIdSet != null) {
            this.MemberIdSet = new String[source.MemberIdSet.length];
            for (int i = 0; i < source.MemberIdSet.length; i++) {
                this.MemberIdSet[i] = new String(source.MemberIdSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Products.", this.Products);
        this.setParamArraySimple(map, prefix + "MemberIdSet.", this.MemberIdSet);

    }
}

