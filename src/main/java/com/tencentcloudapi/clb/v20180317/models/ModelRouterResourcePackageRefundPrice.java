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

public class ModelRouterResourcePackageRefundPrice extends AbstractModel {

    /**
    * <p>模型路由资源包Id</p>
    */
    @SerializedName("ModelRouterPackageId")
    @Expose
    private String ModelRouterPackageId;

    /**
    * <p>可退还金额</p>
    */
    @SerializedName("Price")
    @Expose
    private Float Price;

    /**
     * Get <p>模型路由资源包Id</p> 
     * @return ModelRouterPackageId <p>模型路由资源包Id</p>
     */
    public String getModelRouterPackageId() {
        return this.ModelRouterPackageId;
    }

    /**
     * Set <p>模型路由资源包Id</p>
     * @param ModelRouterPackageId <p>模型路由资源包Id</p>
     */
    public void setModelRouterPackageId(String ModelRouterPackageId) {
        this.ModelRouterPackageId = ModelRouterPackageId;
    }

    /**
     * Get <p>可退还金额</p> 
     * @return Price <p>可退还金额</p>
     */
    public Float getPrice() {
        return this.Price;
    }

    /**
     * Set <p>可退还金额</p>
     * @param Price <p>可退还金额</p>
     */
    public void setPrice(Float Price) {
        this.Price = Price;
    }

    public ModelRouterResourcePackageRefundPrice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModelRouterResourcePackageRefundPrice(ModelRouterResourcePackageRefundPrice source) {
        if (source.ModelRouterPackageId != null) {
            this.ModelRouterPackageId = new String(source.ModelRouterPackageId);
        }
        if (source.Price != null) {
            this.Price = new Float(source.Price);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModelRouterPackageId", this.ModelRouterPackageId);
        this.setParamSimple(map, prefix + "Price", this.Price);

    }
}

