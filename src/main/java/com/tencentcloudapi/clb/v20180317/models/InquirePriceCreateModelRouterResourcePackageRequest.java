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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePriceCreateModelRouterResourcePackageRequest extends AbstractModel {

    /**
    * <p>模型路由资源包容量</p><p>取值范围：[1000, 10000000]</p><p>单次购买的模型路由资源包容量下限为1000，上限为10000000</p>
    */
    @SerializedName("ModelRouterResourcePackageAmount")
    @Expose
    private Long ModelRouterResourcePackageAmount;

    /**
     * Get <p>模型路由资源包容量</p><p>取值范围：[1000, 10000000]</p><p>单次购买的模型路由资源包容量下限为1000，上限为10000000</p> 
     * @return ModelRouterResourcePackageAmount <p>模型路由资源包容量</p><p>取值范围：[1000, 10000000]</p><p>单次购买的模型路由资源包容量下限为1000，上限为10000000</p>
     */
    public Long getModelRouterResourcePackageAmount() {
        return this.ModelRouterResourcePackageAmount;
    }

    /**
     * Set <p>模型路由资源包容量</p><p>取值范围：[1000, 10000000]</p><p>单次购买的模型路由资源包容量下限为1000，上限为10000000</p>
     * @param ModelRouterResourcePackageAmount <p>模型路由资源包容量</p><p>取值范围：[1000, 10000000]</p><p>单次购买的模型路由资源包容量下限为1000，上限为10000000</p>
     */
    public void setModelRouterResourcePackageAmount(Long ModelRouterResourcePackageAmount) {
        this.ModelRouterResourcePackageAmount = ModelRouterResourcePackageAmount;
    }

    public InquirePriceCreateModelRouterResourcePackageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceCreateModelRouterResourcePackageRequest(InquirePriceCreateModelRouterResourcePackageRequest source) {
        if (source.ModelRouterResourcePackageAmount != null) {
            this.ModelRouterResourcePackageAmount = new Long(source.ModelRouterResourcePackageAmount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelRouterResourcePackageAmount", this.ModelRouterResourcePackageAmount);

    }
}

