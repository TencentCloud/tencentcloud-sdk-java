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

public class InquirePriceRefundModelRouterResourcePackageRequest extends AbstractModel {

    /**
    * <p>待退款的模型路由资源包Id</p><p>非有效状态或者设置了自动续订且自动续订已生效的资源包不允许退款。</p>
    */
    @SerializedName("ModelRouterResourcePackageIds")
    @Expose
    private String [] ModelRouterResourcePackageIds;

    /**
     * Get <p>待退款的模型路由资源包Id</p><p>非有效状态或者设置了自动续订且自动续订已生效的资源包不允许退款。</p> 
     * @return ModelRouterResourcePackageIds <p>待退款的模型路由资源包Id</p><p>非有效状态或者设置了自动续订且自动续订已生效的资源包不允许退款。</p>
     */
    public String [] getModelRouterResourcePackageIds() {
        return this.ModelRouterResourcePackageIds;
    }

    /**
     * Set <p>待退款的模型路由资源包Id</p><p>非有效状态或者设置了自动续订且自动续订已生效的资源包不允许退款。</p>
     * @param ModelRouterResourcePackageIds <p>待退款的模型路由资源包Id</p><p>非有效状态或者设置了自动续订且自动续订已生效的资源包不允许退款。</p>
     */
    public void setModelRouterResourcePackageIds(String [] ModelRouterResourcePackageIds) {
        this.ModelRouterResourcePackageIds = ModelRouterResourcePackageIds;
    }

    public InquirePriceRefundModelRouterResourcePackageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceRefundModelRouterResourcePackageRequest(InquirePriceRefundModelRouterResourcePackageRequest source) {
        if (source.ModelRouterResourcePackageIds != null) {
            this.ModelRouterResourcePackageIds = new String[source.ModelRouterResourcePackageIds.length];
            for (int i = 0; i < source.ModelRouterResourcePackageIds.length; i++) {
                this.ModelRouterResourcePackageIds[i] = new String(source.ModelRouterResourcePackageIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ModelRouterResourcePackageIds.", this.ModelRouterResourcePackageIds);

    }
}

