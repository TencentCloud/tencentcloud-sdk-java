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

public class DispatchStrategyRequest extends AbstractModel {

    /**
    * 1:下发，2:中止
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 产品
    */
    @SerializedName("Product")
    @Expose
    private String Product;

    /**
     * Get 1:下发，2:中止 
     * @return Status 1:下发，2:中止
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 1:下发，2:中止
     * @param Status 1:下发，2:中止
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 产品 
     * @return Product 产品
     */
    public String getProduct() {
        return this.Product;
    }

    /**
     * Set 产品
     * @param Product 产品
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    public DispatchStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DispatchStrategyRequest(DispatchStrategyRequest source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Product != null) {
            this.Product = new String(source.Product);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Product", this.Product);

    }
}

