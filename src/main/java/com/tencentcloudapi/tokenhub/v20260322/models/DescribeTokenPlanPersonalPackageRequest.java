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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTokenPlanPersonalPackageRequest extends AbstractModel {

    /**
    * <p>产品类型。取值：personal（个人版）、personal-hunyuan（个人版混元）。</p>
    */
    @SerializedName("ProductType")
    @Expose
    private String ProductType;

    /**
     * Get <p>产品类型。取值：personal（个人版）、personal-hunyuan（个人版混元）。</p> 
     * @return ProductType <p>产品类型。取值：personal（个人版）、personal-hunyuan（个人版混元）。</p>
     */
    public String getProductType() {
        return this.ProductType;
    }

    /**
     * Set <p>产品类型。取值：personal（个人版）、personal-hunyuan（个人版混元）。</p>
     * @param ProductType <p>产品类型。取值：personal（个人版）、personal-hunyuan（个人版混元）。</p>
     */
    public void setProductType(String ProductType) {
        this.ProductType = ProductType;
    }

    public DescribeTokenPlanPersonalPackageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTokenPlanPersonalPackageRequest(DescribeTokenPlanPersonalPackageRequest source) {
        if (source.ProductType != null) {
            this.ProductType = new String(source.ProductType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductType", this.ProductType);

    }
}

