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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DealData extends AbstractModel {

    /**
    * 订单号列表，元素个数与请求包的goods数组的元素个数一致，商品详情与订单按顺序对应
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
    * 大订单号，一个大订单号下可以有多个子订单，说明是同一次下单[{},{}]
    */
    @SerializedName("BigDealId")
    @Expose
    private String BigDealId;

    /**
     * Get 订单号列表，元素个数与请求包的goods数组的元素个数一致，商品详情与订单按顺序对应 
     * @return DealNames 订单号列表，元素个数与请求包的goods数组的元素个数一致，商品详情与订单按顺序对应
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * Set 订单号列表，元素个数与请求包的goods数组的元素个数一致，商品详情与订单按顺序对应
     * @param DealNames 订单号列表，元素个数与请求包的goods数组的元素个数一致，商品详情与订单按顺序对应
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
    }

    /**
     * Get 大订单号，一个大订单号下可以有多个子订单，说明是同一次下单[{},{}] 
     * @return BigDealId 大订单号，一个大订单号下可以有多个子订单，说明是同一次下单[{},{}]
     */
    public String getBigDealId() {
        return this.BigDealId;
    }

    /**
     * Set 大订单号，一个大订单号下可以有多个子订单，说明是同一次下单[{},{}]
     * @param BigDealId 大订单号，一个大订单号下可以有多个子订单，说明是同一次下单[{},{}]
     */
    public void setBigDealId(String BigDealId) {
        this.BigDealId = BigDealId;
    }

    public DealData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DealData(DealData source) {
        if (source.DealNames != null) {
            this.DealNames = new String[source.DealNames.length];
            for (int i = 0; i < source.DealNames.length; i++) {
                this.DealNames[i] = new String(source.DealNames[i]);
            }
        }
        if (source.BigDealId != null) {
            this.BigDealId = new String(source.BigDealId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);
        this.setParamSimple(map, prefix + "BigDealId", this.BigDealId);

    }
}

