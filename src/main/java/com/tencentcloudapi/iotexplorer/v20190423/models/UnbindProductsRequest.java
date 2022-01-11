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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnbindProductsRequest extends AbstractModel{

    /**
    * 网关产品ID
    */
    @SerializedName("GatewayProductId")
    @Expose
    private String GatewayProductId;

    /**
    * 待解绑的子产品ID数组
    */
    @SerializedName("ProductIds")
    @Expose
    private String [] ProductIds;

    /**
     * Get 网关产品ID 
     * @return GatewayProductId 网关产品ID
     */
    public String getGatewayProductId() {
        return this.GatewayProductId;
    }

    /**
     * Set 网关产品ID
     * @param GatewayProductId 网关产品ID
     */
    public void setGatewayProductId(String GatewayProductId) {
        this.GatewayProductId = GatewayProductId;
    }

    /**
     * Get 待解绑的子产品ID数组 
     * @return ProductIds 待解绑的子产品ID数组
     */
    public String [] getProductIds() {
        return this.ProductIds;
    }

    /**
     * Set 待解绑的子产品ID数组
     * @param ProductIds 待解绑的子产品ID数组
     */
    public void setProductIds(String [] ProductIds) {
        this.ProductIds = ProductIds;
    }

    public UnbindProductsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnbindProductsRequest(UnbindProductsRequest source) {
        if (source.GatewayProductId != null) {
            this.GatewayProductId = new String(source.GatewayProductId);
        }
        if (source.ProductIds != null) {
            this.ProductIds = new String[source.ProductIds.length];
            for (int i = 0; i < source.ProductIds.length; i++) {
                this.ProductIds[i] = new String(source.ProductIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayProductId", this.GatewayProductId);
        this.setParamArraySimple(map, prefix + "ProductIds.", this.ProductIds);

    }
}

