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

public class RefundOrderResult extends AbstractModel{

    /**
    * 付款订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderNo")
    @Expose
    private String OrderNo;

    /**
    * 开发者流水号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeveloperNo")
    @Expose
    private String DeveloperNo;

    /**
    * 交易优惠金额（免充值券）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TradeDiscountAmount")
    @Expose
    private String TradeDiscountAmount;

    /**
    * 付款方式名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayName")
    @Expose
    private String PayName;

    /**
    * 商户流水号（从1开始自增长不重复）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderMerchantId")
    @Expose
    private String OrderMerchantId;

    /**
    * 实际交易金额（以分为单位，没有小数点）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TradeAmount")
    @Expose
    private String TradeAmount;

    /**
    * 币种签名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CurrencySign")
    @Expose
    private String CurrencySign;

    /**
    * 付款完成时间（以收单机构为准）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TradePayTime")
    @Expose
    private String TradePayTime;

    /**
    * 门店流水号（从1开始自增长不重复）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShopOrderId")
    @Expose
    private String ShopOrderId;

    /**
    * 支付标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayTag")
    @Expose
    private String PayTag;

    /**
    * 订单状态（1交易成功，2待支付，4已取消，9等待用户输入密码确认
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 币种代码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderCurrency")
    @Expose
    private String OrderCurrency;

    /**
    * 开始交易时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TradeTime")
    @Expose
    private String TradeTime;

    /**
    * 折扣金额（以分为单位，没有小数点）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DiscountAmount")
    @Expose
    private String DiscountAmount;

    /**
    * 原始订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OriginalOrderNo")
    @Expose
    private String OriginalOrderNo;

    /**
     * Get 付款订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderNo 付款订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrderNo() {
        return this.OrderNo;
    }

    /**
     * Set 付款订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderNo 付款订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderNo(String OrderNo) {
        this.OrderNo = OrderNo;
    }

    /**
     * Get 开发者流水号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeveloperNo 开发者流水号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeveloperNo() {
        return this.DeveloperNo;
    }

    /**
     * Set 开发者流水号
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeveloperNo 开发者流水号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeveloperNo(String DeveloperNo) {
        this.DeveloperNo = DeveloperNo;
    }

    /**
     * Get 交易优惠金额（免充值券）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TradeDiscountAmount 交易优惠金额（免充值券）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTradeDiscountAmount() {
        return this.TradeDiscountAmount;
    }

    /**
     * Set 交易优惠金额（免充值券）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TradeDiscountAmount 交易优惠金额（免充值券）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTradeDiscountAmount(String TradeDiscountAmount) {
        this.TradeDiscountAmount = TradeDiscountAmount;
    }

    /**
     * Get 付款方式名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayName 付款方式名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayName() {
        return this.PayName;
    }

    /**
     * Set 付款方式名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayName 付款方式名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayName(String PayName) {
        this.PayName = PayName;
    }

    /**
     * Get 商户流水号（从1开始自增长不重复）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderMerchantId 商户流水号（从1开始自增长不重复）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrderMerchantId() {
        return this.OrderMerchantId;
    }

    /**
     * Set 商户流水号（从1开始自增长不重复）
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderMerchantId 商户流水号（从1开始自增长不重复）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderMerchantId(String OrderMerchantId) {
        this.OrderMerchantId = OrderMerchantId;
    }

    /**
     * Get 实际交易金额（以分为单位，没有小数点）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TradeAmount 实际交易金额（以分为单位，没有小数点）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTradeAmount() {
        return this.TradeAmount;
    }

    /**
     * Set 实际交易金额（以分为单位，没有小数点）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TradeAmount 实际交易金额（以分为单位，没有小数点）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTradeAmount(String TradeAmount) {
        this.TradeAmount = TradeAmount;
    }

    /**
     * Get 币种签名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CurrencySign 币种签名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCurrencySign() {
        return this.CurrencySign;
    }

    /**
     * Set 币种签名
注意：此字段可能返回 null，表示取不到有效值。
     * @param CurrencySign 币种签名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCurrencySign(String CurrencySign) {
        this.CurrencySign = CurrencySign;
    }

    /**
     * Get 付款完成时间（以收单机构为准）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TradePayTime 付款完成时间（以收单机构为准）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTradePayTime() {
        return this.TradePayTime;
    }

    /**
     * Set 付款完成时间（以收单机构为准）
注意：此字段可能返回 null，表示取不到有效值。
     * @param TradePayTime 付款完成时间（以收单机构为准）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTradePayTime(String TradePayTime) {
        this.TradePayTime = TradePayTime;
    }

    /**
     * Get 门店流水号（从1开始自增长不重复）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShopOrderId 门店流水号（从1开始自增长不重复）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShopOrderId() {
        return this.ShopOrderId;
    }

    /**
     * Set 门店流水号（从1开始自增长不重复）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShopOrderId 门店流水号（从1开始自增长不重复）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShopOrderId(String ShopOrderId) {
        this.ShopOrderId = ShopOrderId;
    }

    /**
     * Get 支付标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayTag 支付标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayTag() {
        return this.PayTag;
    }

    /**
     * Set 支付标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayTag 支付标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayTag(String PayTag) {
        this.PayTag = PayTag;
    }

    /**
     * Get 订单状态（1交易成功，2待支付，4已取消，9等待用户输入密码确认
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 订单状态（1交易成功，2待支付，4已取消，9等待用户输入密码确认
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 订单状态（1交易成功，2待支付，4已取消，9等待用户输入密码确认
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 订单状态（1交易成功，2待支付，4已取消，9等待用户输入密码确认
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 币种代码
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderCurrency 币种代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrderCurrency() {
        return this.OrderCurrency;
    }

    /**
     * Set 币种代码
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderCurrency 币种代码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderCurrency(String OrderCurrency) {
        this.OrderCurrency = OrderCurrency;
    }

    /**
     * Get 开始交易时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TradeTime 开始交易时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTradeTime() {
        return this.TradeTime;
    }

    /**
     * Set 开始交易时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TradeTime 开始交易时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTradeTime(String TradeTime) {
        this.TradeTime = TradeTime;
    }

    /**
     * Get 折扣金额（以分为单位，没有小数点）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DiscountAmount 折扣金额（以分为单位，没有小数点）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDiscountAmount() {
        return this.DiscountAmount;
    }

    /**
     * Set 折扣金额（以分为单位，没有小数点）
注意：此字段可能返回 null，表示取不到有效值。
     * @param DiscountAmount 折扣金额（以分为单位，没有小数点）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDiscountAmount(String DiscountAmount) {
        this.DiscountAmount = DiscountAmount;
    }

    /**
     * Get 原始订单号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OriginalOrderNo 原始订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOriginalOrderNo() {
        return this.OriginalOrderNo;
    }

    /**
     * Set 原始订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param OriginalOrderNo 原始订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOriginalOrderNo(String OriginalOrderNo) {
        this.OriginalOrderNo = OriginalOrderNo;
    }

    public RefundOrderResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RefundOrderResult(RefundOrderResult source) {
        if (source.OrderNo != null) {
            this.OrderNo = new String(source.OrderNo);
        }
        if (source.DeveloperNo != null) {
            this.DeveloperNo = new String(source.DeveloperNo);
        }
        if (source.TradeDiscountAmount != null) {
            this.TradeDiscountAmount = new String(source.TradeDiscountAmount);
        }
        if (source.PayName != null) {
            this.PayName = new String(source.PayName);
        }
        if (source.OrderMerchantId != null) {
            this.OrderMerchantId = new String(source.OrderMerchantId);
        }
        if (source.TradeAmount != null) {
            this.TradeAmount = new String(source.TradeAmount);
        }
        if (source.CurrencySign != null) {
            this.CurrencySign = new String(source.CurrencySign);
        }
        if (source.TradePayTime != null) {
            this.TradePayTime = new String(source.TradePayTime);
        }
        if (source.ShopOrderId != null) {
            this.ShopOrderId = new String(source.ShopOrderId);
        }
        if (source.PayTag != null) {
            this.PayTag = new String(source.PayTag);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.OrderCurrency != null) {
            this.OrderCurrency = new String(source.OrderCurrency);
        }
        if (source.TradeTime != null) {
            this.TradeTime = new String(source.TradeTime);
        }
        if (source.DiscountAmount != null) {
            this.DiscountAmount = new String(source.DiscountAmount);
        }
        if (source.OriginalOrderNo != null) {
            this.OriginalOrderNo = new String(source.OriginalOrderNo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderNo", this.OrderNo);
        this.setParamSimple(map, prefix + "DeveloperNo", this.DeveloperNo);
        this.setParamSimple(map, prefix + "TradeDiscountAmount", this.TradeDiscountAmount);
        this.setParamSimple(map, prefix + "PayName", this.PayName);
        this.setParamSimple(map, prefix + "OrderMerchantId", this.OrderMerchantId);
        this.setParamSimple(map, prefix + "TradeAmount", this.TradeAmount);
        this.setParamSimple(map, prefix + "CurrencySign", this.CurrencySign);
        this.setParamSimple(map, prefix + "TradePayTime", this.TradePayTime);
        this.setParamSimple(map, prefix + "ShopOrderId", this.ShopOrderId);
        this.setParamSimple(map, prefix + "PayTag", this.PayTag);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OrderCurrency", this.OrderCurrency);
        this.setParamSimple(map, prefix + "TradeTime", this.TradeTime);
        this.setParamSimple(map, prefix + "DiscountAmount", this.DiscountAmount);
        this.setParamSimple(map, prefix + "OriginalOrderNo", this.OriginalOrderNo);

    }
}

