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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Order extends AbstractModel{

    /**
    * 含税金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AmountHasTax")
    @Expose
    private Float AmountHasTax;

    /**
    * 优惠金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Discount")
    @Expose
    private Float Discount;

    /**
    * 销方名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SellerName")
    @Expose
    private String SellerName;

    /**
    * 发票类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InvoiceType")
    @Expose
    private Long InvoiceType;

    /**
    * 默认“”
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 支付金额
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Amount")
    @Expose
    private Float Amount;

    /**
    * 下单日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderDate")
    @Expose
    private String OrderDate;

    /**
    * 订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderId")
    @Expose
    private String OrderId;

    /**
    * 门店号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StoreNo")
    @Expose
    private String StoreNo;

    /**
    * 明细
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Items")
    @Expose
    private OrderItem [] Items;

    /**
     * Get 含税金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AmountHasTax 含税金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getAmountHasTax() {
        return this.AmountHasTax;
    }

    /**
     * Set 含税金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param AmountHasTax 含税金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAmountHasTax(Float AmountHasTax) {
        this.AmountHasTax = AmountHasTax;
    }

    /**
     * Get 优惠金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Discount 优惠金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getDiscount() {
        return this.Discount;
    }

    /**
     * Set 优惠金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param Discount 优惠金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscount(Float Discount) {
        this.Discount = Discount;
    }

    /**
     * Get 销方名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SellerName 销方名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSellerName() {
        return this.SellerName;
    }

    /**
     * Set 销方名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param SellerName 销方名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSellerName(String SellerName) {
        this.SellerName = SellerName;
    }

    /**
     * Get 发票类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InvoiceType 发票类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInvoiceType() {
        return this.InvoiceType;
    }

    /**
     * Set 发票类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param InvoiceType 发票类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInvoiceType(Long InvoiceType) {
        this.InvoiceType = InvoiceType;
    }

    /**
     * Get 默认“”
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 默认“”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 默认“”
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 默认“”
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 支付金额
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Amount 支付金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getAmount() {
        return this.Amount;
    }

    /**
     * Set 支付金额
注意：此字段可能返回 null，表示取不到有效值。
     * @param Amount 支付金额
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAmount(Float Amount) {
        this.Amount = Amount;
    }

    /**
     * Get 下单日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderDate 下单日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrderDate() {
        return this.OrderDate;
    }

    /**
     * Set 下单日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderDate 下单日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderDate(String OrderDate) {
        this.OrderDate = OrderDate;
    }

    /**
     * Get 订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderId 订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrderId() {
        return this.OrderId;
    }

    /**
     * Set 订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderId 订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderId(String OrderId) {
        this.OrderId = OrderId;
    }

    /**
     * Get 门店号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StoreNo 门店号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStoreNo() {
        return this.StoreNo;
    }

    /**
     * Set 门店号
注意：此字段可能返回 null，表示取不到有效值。
     * @param StoreNo 门店号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStoreNo(String StoreNo) {
        this.StoreNo = StoreNo;
    }

    /**
     * Get 明细
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Items 明细
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OrderItem [] getItems() {
        return this.Items;
    }

    /**
     * Set 明细
注意：此字段可能返回 null，表示取不到有效值。
     * @param Items 明细
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setItems(OrderItem [] Items) {
        this.Items = Items;
    }

    public Order() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Order(Order source) {
        if (source.AmountHasTax != null) {
            this.AmountHasTax = new Float(source.AmountHasTax);
        }
        if (source.Discount != null) {
            this.Discount = new Float(source.Discount);
        }
        if (source.SellerName != null) {
            this.SellerName = new String(source.SellerName);
        }
        if (source.InvoiceType != null) {
            this.InvoiceType = new Long(source.InvoiceType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Amount != null) {
            this.Amount = new Float(source.Amount);
        }
        if (source.OrderDate != null) {
            this.OrderDate = new String(source.OrderDate);
        }
        if (source.OrderId != null) {
            this.OrderId = new String(source.OrderId);
        }
        if (source.StoreNo != null) {
            this.StoreNo = new String(source.StoreNo);
        }
        if (source.Items != null) {
            this.Items = new OrderItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new OrderItem(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AmountHasTax", this.AmountHasTax);
        this.setParamSimple(map, prefix + "Discount", this.Discount);
        this.setParamSimple(map, prefix + "SellerName", this.SellerName);
        this.setParamSimple(map, prefix + "InvoiceType", this.InvoiceType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Amount", this.Amount);
        this.setParamSimple(map, prefix + "OrderDate", this.OrderDate);
        this.setParamSimple(map, prefix + "OrderId", this.OrderId);
        this.setParamSimple(map, prefix + "StoreNo", this.StoreNo);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);

    }
}

