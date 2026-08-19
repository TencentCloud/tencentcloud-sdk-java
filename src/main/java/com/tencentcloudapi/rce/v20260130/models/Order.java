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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Order extends AbstractModel {

    /**
    * <p>订单ID</p>
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * <p>订单金额</p>
    */
    @SerializedName("Amount")
    @Expose
    private Amount Amount;

    /**
    * <p>商品信息</p>
    */
    @SerializedName("Items")
    @Expose
    private Item [] Items;

    /**
    * <p>物流信息</p>
    */
    @SerializedName("Delivery")
    @Expose
    private Delivery Delivery;

    /**
     * Get <p>订单ID</p> 
     * @return OrderId <p>订单ID</p>
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set <p>订单ID</p>
     * @param OrderId <p>订单ID</p>
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get <p>订单金额</p> 
     * @return Amount <p>订单金额</p>
     */
    public Amount getAmount() {
        return this.Amount;
    }

    /**
     * Set <p>订单金额</p>
     * @param Amount <p>订单金额</p>
     */
    public void setAmount(Amount Amount) {
        this.Amount = Amount;
    }

    /**
     * Get <p>商品信息</p> 
     * @return Items <p>商品信息</p>
     */
    public Item [] getItems() {
        return this.Items;
    }

    /**
     * Set <p>商品信息</p>
     * @param Items <p>商品信息</p>
     */
    public void setItems(Item [] Items) {
        this.Items = Items;
    }

    /**
     * Get <p>物流信息</p> 
     * @return Delivery <p>物流信息</p>
     */
    public Delivery getDelivery() {
        return this.Delivery;
    }

    /**
     * Set <p>物流信息</p>
     * @param Delivery <p>物流信息</p>
     */
    public void setDelivery(Delivery Delivery) {
        this.Delivery = Delivery;
    }

    public Order() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Order(Order source) {
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.Amount != null) {
            this.Amount = new Amount(source.Amount);
        }
        if (source.Items != null) {
            this.Items = new Item[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new Item(source.Items[i]);
            }
        }
        if (source.Delivery != null) {
            this.Delivery = new Delivery(source.Delivery);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamObj(map, prefix + "Amount.", this.Amount);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamObj(map, prefix + "Delivery.", this.Delivery);

    }
}

