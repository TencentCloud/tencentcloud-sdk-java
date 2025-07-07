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
package com.tencentcloudapi.gwlb.v20240906.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquirePriceCreateGatewayLoadBalancerRequest extends AbstractModel {

    /**
    * 询价的网关负载均衡实例个数，默认为1
    */
    @SerializedName("GoodsNum")
    @Expose
    private Long GoodsNum;

    /**
     * Get 询价的网关负载均衡实例个数，默认为1 
     * @return GoodsNum 询价的网关负载均衡实例个数，默认为1
     */
    public Long getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * Set 询价的网关负载均衡实例个数，默认为1
     * @param GoodsNum 询价的网关负载均衡实例个数，默认为1
     */
    public void setGoodsNum(Long GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    public InquirePriceCreateGatewayLoadBalancerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquirePriceCreateGatewayLoadBalancerRequest(InquirePriceCreateGatewayLoadBalancerRequest source) {
        if (source.GoodsNum != null) {
            this.GoodsNum = new Long(source.GoodsNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);

    }
}

