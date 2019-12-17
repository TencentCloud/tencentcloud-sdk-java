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
package com.tencentcloudapi.iottid.v20190411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DownloadTidsRequest extends AbstractModel{

    /**
    * 订单编号
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 下载数量：1~10
    */
    @SerializedName("Quantity")
    @Expose
    private Long Quantity;

    /**
     * Get 订单编号 
     * @return OrderId 订单编号
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单编号
     * @param OrderId 订单编号
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 下载数量：1~10 
     * @return Quantity 下载数量：1~10
     */
    public Long getQuantity() {
        return this.Quantity;
    }

    /**
     * Set 下载数量：1~10
     * @param Quantity 下载数量：1~10
     */
    public void setQuantity(Long Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "Quantity", this.Quantity);

    }
}

