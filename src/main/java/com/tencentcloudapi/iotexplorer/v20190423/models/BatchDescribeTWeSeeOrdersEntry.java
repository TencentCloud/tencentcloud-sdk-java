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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchDescribeTWeSeeOrdersEntry extends AbstractModel {

    /**
    * <p>订单 ID，与 CustomOrderId 二选一</p>
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * <p>自定义订单 ID，与 OrderId 二选一</p>
    */
    @SerializedName("CustomOrderId")
    @Expose
    private String CustomOrderId;

    /**
     * Get <p>订单 ID，与 CustomOrderId 二选一</p> 
     * @return OrderId <p>订单 ID，与 CustomOrderId 二选一</p>
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set <p>订单 ID，与 CustomOrderId 二选一</p>
     * @param OrderId <p>订单 ID，与 CustomOrderId 二选一</p>
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get <p>自定义订单 ID，与 OrderId 二选一</p> 
     * @return CustomOrderId <p>自定义订单 ID，与 OrderId 二选一</p>
     */
    public String getCustomOrderId() {
        return this.CustomOrderId;
    }

    /**
     * Set <p>自定义订单 ID，与 OrderId 二选一</p>
     * @param CustomOrderId <p>自定义订单 ID，与 OrderId 二选一</p>
     */
    public void setCustomOrderId(String CustomOrderId) {
        this.CustomOrderId = CustomOrderId;
    }

    public BatchDescribeTWeSeeOrdersEntry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchDescribeTWeSeeOrdersEntry(BatchDescribeTWeSeeOrdersEntry source) {
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.CustomOrderId != null) {
            this.CustomOrderId = new String(source.CustomOrderId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "CustomOrderId", this.CustomOrderId);

    }
}

