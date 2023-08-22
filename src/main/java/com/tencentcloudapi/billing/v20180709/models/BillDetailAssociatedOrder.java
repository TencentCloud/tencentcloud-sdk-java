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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BillDetailAssociatedOrder extends AbstractModel{

    /**
    * 新购订单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrepayPurchase")
    @Expose
    private String PrepayPurchase;

    /**
    * 续费订单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrepayRenew")
    @Expose
    private String PrepayRenew;

    /**
    * 升配订单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrepayModifyUp")
    @Expose
    private String PrepayModifyUp;

    /**
    * 冲销订单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReverseOrder")
    @Expose
    private String ReverseOrder;

    /**
    * 优惠调整后订单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NewOrder")
    @Expose
    private String NewOrder;

    /**
    * 优惠调整前订单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Original")
    @Expose
    private String Original;

    /**
     * Get 新购订单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrepayPurchase 新购订单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrepayPurchase() {
        return this.PrepayPurchase;
    }

    /**
     * Set 新购订单
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrepayPurchase 新购订单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrepayPurchase(String PrepayPurchase) {
        this.PrepayPurchase = PrepayPurchase;
    }

    /**
     * Get 续费订单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrepayRenew 续费订单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrepayRenew() {
        return this.PrepayRenew;
    }

    /**
     * Set 续费订单
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrepayRenew 续费订单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrepayRenew(String PrepayRenew) {
        this.PrepayRenew = PrepayRenew;
    }

    /**
     * Get 升配订单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrepayModifyUp 升配订单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrepayModifyUp() {
        return this.PrepayModifyUp;
    }

    /**
     * Set 升配订单
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrepayModifyUp 升配订单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrepayModifyUp(String PrepayModifyUp) {
        this.PrepayModifyUp = PrepayModifyUp;
    }

    /**
     * Get 冲销订单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReverseOrder 冲销订单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReverseOrder() {
        return this.ReverseOrder;
    }

    /**
     * Set 冲销订单
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReverseOrder 冲销订单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReverseOrder(String ReverseOrder) {
        this.ReverseOrder = ReverseOrder;
    }

    /**
     * Get 优惠调整后订单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NewOrder 优惠调整后订单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNewOrder() {
        return this.NewOrder;
    }

    /**
     * Set 优惠调整后订单
注意：此字段可能返回 null，表示取不到有效值。
     * @param NewOrder 优惠调整后订单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNewOrder(String NewOrder) {
        this.NewOrder = NewOrder;
    }

    /**
     * Get 优惠调整前订单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Original 优惠调整前订单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginal() {
        return this.Original;
    }

    /**
     * Set 优惠调整前订单
注意：此字段可能返回 null，表示取不到有效值。
     * @param Original 优惠调整前订单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginal(String Original) {
        this.Original = Original;
    }

    public BillDetailAssociatedOrder() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BillDetailAssociatedOrder(BillDetailAssociatedOrder source) {
        if (source.PrepayPurchase != null) {
            this.PrepayPurchase = new String(source.PrepayPurchase);
        }
        if (source.PrepayRenew != null) {
            this.PrepayRenew = new String(source.PrepayRenew);
        }
        if (source.PrepayModifyUp != null) {
            this.PrepayModifyUp = new String(source.PrepayModifyUp);
        }
        if (source.ReverseOrder != null) {
            this.ReverseOrder = new String(source.ReverseOrder);
        }
        if (source.NewOrder != null) {
            this.NewOrder = new String(source.NewOrder);
        }
        if (source.Original != null) {
            this.Original = new String(source.Original);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrepayPurchase", this.PrepayPurchase);
        this.setParamSimple(map, prefix + "PrepayRenew", this.PrepayRenew);
        this.setParamSimple(map, prefix + "PrepayModifyUp", this.PrepayModifyUp);
        this.setParamSimple(map, prefix + "ReverseOrder", this.ReverseOrder);
        this.setParamSimple(map, prefix + "NewOrder", this.NewOrder);
        this.setParamSimple(map, prefix + "Original", this.Original);

    }
}

